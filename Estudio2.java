import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 

          public class Estudio2 implements ActionListener{

         protected final JLabel label1;
         protected JScrollPane scrollpane1;
         protected JTextArea textarea1;
         private JFrame frame;
         private final String edadEsperada = "Infancia = 0-9 a�os";
         private String edadRecibida;
         
         
        public Estudio2(String nombrePaciente, String Sexo, String EdadMasculino,
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
        
        frame.setBounds(0,0,850,600);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        this.edadRecibida = EdadMasculino;  
           
             

        if(Sexo.equals("Masculino")){
                    
                    if(EdadMasculino.equals("Infancia = 0-9 a�os")){
                        
                        if(EstaturaMasculino.equals("0.90-1.35 m")){
                         
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                 "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                 "\n Tiene gran posibilidad de contraer Influenza(Gripe). " + 
                                                  "\n Es recomendable que el ni�o realice cerca de 60 minutos de actividad fisica moderada" +
                                                  "\n a intensa diaria, sin embargo considerese esa edad aproximada solo para los mas grandes," +
                                                  "\n (los de 9 a�os), tambien es recomendable el consumo diario de 1.7 Litros de agua al " +
                                                  "\n dia (siete vasos de agua de tamao regular).POSIBLE TRATAMIENTO: para la gripe en ni�os" +
                                                  "\n el tratamiento suele incluir; medicamentos para reducir la fiebre y aliviar los s�ntomas" +
                                                  "\n , como el paracetamol(Tempra) o el ibuprofeno. Antivirales especificos contra la gripe" +
                                                  "\n como el oseltamivir(Advil). Tambien es recomendable que el ni�o consuma mucha fruta para" +
                                                  "\n fortalecer su sitema inmune tales como: Naranjas: ricas en vitamina C,Fresas:ricas en " +
                                                  "\n vitamina C y antioxidantes, Pl�tanos:ricos en potasio, que puede ayudar a reemplazar los" +
                                                  "\n electrolitos perdidos deido a la fiebre y sudoraci�n y el Kiwi:rico en vitamina C y   " +
                                                  "\n potasio. Este es solo un Diagnostico predeterminado logico, haberlo consultado no   " +
                                                  "\n garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enferfedad y sus" +
                                                  "\n respuestas esten correctas, para ello se recomienda hacer mas de un Diagnostico de Mi Vida" +
                                                  "\n para establecer mejor seguridad en el tratamiento adecuado de su paciente, ademas por su" +
                                                  "\n salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho " +
                                                  "\n consultar a su medico, Angel L Montes agradece tu visita a la app (Mi Vida)y espera que te mejores.");
                            }                     
                           if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                               textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                 "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                 "\n Tiene gran posibilidad de contraer Neumon�a." +
                                                 "\n Es recomendable que el ni�o realice actividad f�sica moderada seg�n su capacidad " +
                                                 "\n y estado de recuperaci�n, siempre supervisada y evitando esfuerzos excesivos o " +
                                                 "\n juegos que agiten demasiado, especialmente si a�n presenta s�ntomas respiratorios." +
                                                 "\n Cuando se encuentre mejor, puede retomar gradualmente la actividad f�sica adaptada a" +
                                                 "\n su edad, buscando cerca de 60 minutos diarios para los m�s grandes. Tambi�n es " +
                                                 "\n crucial el consumo diario de 2 a 2.5 Litros de agua al d�a (ocho a diez vasos de tama�o " +
                                                 "\n regular), especialmente si tiene fiebre, para ayudar a fluidificar las secreciones   " +
                                                 "\n pulmonares y prevenir la deshidrataci�n. POSIBLE TRATAMIENTO: para la neumon�a en ni�os" +
                                                 "\n el tratamiento suele incluir; antibi�ticos (si la causa es bacteriana, como amoxicilina o" +
                                                 "\n azitromicina, bajo prescripci�n m�dica estricta), medicamentos para reducir la fiebre y " +
                                                 "\n aliviar el dolor (como paracetamol o ibuprofeno), y en algunos casos, oxigenoterapia si la" +
                                                 "\n saturaci�n de ox�geno es baja. Es fundamental seguir las indicaciones del m�dico al pie de" + 
                                                 "\n la letra y completar el ciclo de antibi�ticos aunque el ni�o parezca mejor. Tambi�n es " +
                                                 "\n recomendable que el ni�o consuma alimentos que fortalezcan su sistema inmune y le aporten" + 
                                                 "\n energ�a, tales como:Sopas y caldos: Nutritivos y f�ciles de digerir, adem�s de ayudar a " +
                                                 "\n la hidrataci�n. Frutas ricas en vitamina C: Naranjas, fresas, kiwi, guayaba, que apoyan el" + 
                                                 "\n sistema inmunol�gico. Verduras cocidas: Zanahorias, espinacas, br�coli, que aportan vitaminas" +
                                                 "\n y minerales esenciales.Prote�nas magras: Pollo, pavo, pescado (seg�n la edad y tolerancia)," +
                                                 "\n que son importantes para la recuperaci�n. Este es solo un Diagn�stico predeterminado l�gico," +
                                                 "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la" + 
                                                 "\n enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico" +
                                                 "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s" + 
                                                 "\n por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho" +
                                                 "\n consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores." ); 
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visi�n borrosa, P�rdida de peso.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes. Es recomendable que el ni�o realice cerca de 60 " + 
                                                  "\n minutos de actividad f�sica moderada a intensa diaria, como juegos activos, deportes o paseos" + 
                                                  "\n en bicicleta, adapt�ndose siempre a su estado de salud y bajo supervisi�n. Esto es crucial para" +
                                                  "\n el control del az�car en sangre, la sensibilidad a la insulina y el mantenimiento de un peso " +
                                                  "\n saludable. Tambi�n es fundamental el consumo diario de 1.7 a 2 Litros de agua al d�a (siete a" + 
                                                  "\n ocho vasos de tama�o regular), priorizando el agua natural sobre bebidas azucaradas, para    " +
                                                  "\n mantener una hidrataci�n  adecuada y ayudar a los ri�ones a procesar el exceso de glucosa.   " +
                                                  "\n POSIBLE TRATAMIENTO: Para la diabetes en ni�os, el tratamiento suele incluir; manejo de la   " +
                                                  "\n insulina (en caso de diabetes tipo1, se requiere insulina inyectada para controlar los niveles" +
                                                  "\n de glucosa), medicamentos orales(para diabetes tipo 2, como la metformina, siempre bajo      " +
                                                  "\n prescripci�n m�dica), y un monitoreoconstante de los niveles de glucosa en sangre. Es vital  " +
                                                  "\n seguir un plan de alimentaci�n saludable y equilibrado, as� como un control m�dico regular.  " +
                                                  "\n Tambi�n es recomendable que el ni�o consuma alimentos que ayuden a la regulaci�n del az�car  " +
                                                  "\n y fortalezcan su sistema   inmune, tales como: Verduras no almidonadas como br�coli, espinacas" +
                                                  "\n y zanahorias que  aportan fibra y nutrientes con bajo impacto en la glucosa; Frutas con      " +
                                                  "\n moderaci�n como manzanas, peras y bayas (fresas, ar�ndanos) ricas en fibra y antioxidantes   " +
                                                  "\n que contribuyen a  una liberaci�n m�s lenta de az�cares; Prote�nas magras como pollo, pescado" + 
                                                  "\n y legumbres que ayudan a mantener la saciedad y el control gluc�mico; y Granos integrales    " +
                                                  "\n como avena y pan integral que proporcionan fibra y energ�a sostenida. Este es solo un        " +
                                                  "\n Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente   " +
                                                  "\n tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para     " +
                                                  "\n ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad    " +
                                                  "\n en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico" +
                                                  "\n no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes   " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresi�n en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n Es recomendable que el ni�o realice actividad f�sica de forma controlada y supervisada, con" +
                                                  "\n calentamiento previo y enfriamiento posterior, evitando desencadenantes conocidos del asma " +
                                                  "\n (como al�rgenos, aire fr�o o contaminado) y pausas si presenta s�ntomas. La cantidad de " +
                                                  "\n ejercicio debe ser adaptada a su capacidad y a la presencia de s�ntomas, pudiendo ser cerca " +
                                                  "\n de 60 minutos de actividad moderada a intensa diaria en los d�as que se encuentre bien, pero " +
                                                  "\n siempre consultando al m�dico para un plan seguro. Tambi�n es crucial el consumo diario de " +
                                                  "\n 1.5 a 1.7 Litros de agua al d�a (seis a siete vasos de agua de tama�o regular) para ayudar " +
                                                  "\n a mantener las v�as respiratorias hidratadas y las secreciones m�s fluidas, lo que facilita " +
                                                  "\n la respiraci�n.POSIBLE TRATAMIENTO: Para el asma en ni�os, el tratamiento suele incluir; " +
                                                  "\n broncodilatadores de alivio r�pido (para abrir las v�as respiratorias durante un ataque, " +
                                                  "\n como el salbutamol, marca com�n en M�xico: Ventolin o Aerolin), corticosteroides inhalados " +
                                                  "\n (para el control a largo plazo y reducir la inflamaci�n, como la fluticasona o budesonida, " +
                                                  "\n marcas comunes: Flixotide o Pulmicort), y en algunos casos, modificadores de leucotrienos (como" +
                                                  "\n el montelukast, marca com�n: Singulair). Es fundamental seguir estrictamente el plan de acci�n" +
                                                  "\n para el asma indicado por el m�dico y usar los medicamentos preventivos regularmente. Tambi�n" +
                                                  "\n es recomendable que el ni�o consuma alimentos que puedan ayudar a reducir la inflamaci�n y " +
                                                  "\n fortalecer el sistema inmune, tales como: Pescados grasos (salm�n, at�n): ricos en �cidos " +
                                                  "\n grasos Omega-3, que poseen propiedades antiinflamatorias que pueden ayudar a reducir la " +
                                                  "\n inflamaci�n de las v�as respiratorias. Frutas y verduras de colores vivos (ar�ndanos, fresas," +
                                                  "\n espinacas, br�coli): ricas en antioxidantes como la vitamina C y carotenoides, que pueden" +
                                                  "\n proteger las c�lulas del da�o y fortalecer el sistema inmunol�gico. Jengibre: contiene " +
                                                  "\n compuestos con efectos antiinflamatorios que podr�an ser beneficiosos para las v�as " +
                                                  "\n respiratorias. C�rcuma: con su componente activo, la curcumina, tambi�n tiene potentes" +
                                                  "\n propiedades antiinflamatorias y antioxidantes. Este es solo un Diagn�stico predeterminado" +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y " +
                                                  "\n que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda " +
                                                  "\n hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento" +
                                                  "\n adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface" +
                                                  "\n del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a" +
                                                  "\n la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, P�rdida de peso, Ganglios linf�ticos inflamados, Erupci�n cut�nea (Diarrea).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n Es recomendable que el ni�o realice actividad f�sica moderada y adaptada a su estado de salud, bajo supervisi�n          " +
                                                  "\n m�dica para evitar el agotamiento y proteger su sistema inmune. La actividad debe ser gradual, buscando idealmente       " +
                                                  "\n cerca de 60 minutos de actividad f�sica moderada a intensa diaria para los m�s grandes, pero siempre con precauci�n      " +
                                                  "\n y evitando deportes de contacto o actividades con riesgo de lesiones si su sistema inmune est� comprometido.             " +
                                                  "\n Tambi�n es crucial el consumo diario de 1.7 a 2 Litros de agua al d�a (siete a ocho vasos de tama�o regular) para        " +
                                                  "\n mantener una buena hidrataci�n, fundamental para el bienestar general, el funcionamiento del cuerpo y el metabolismo     " +
                                                  "\n de los medicamentos. POSIBLE TRATAMIENTO: Para el VIH/SIDA en ni�os, el tratamiento principal es la terapia              " +
                                                  "\n antirretroviral (TARV), que incluye una combinaci�n de medicamentos que trabajan para controlar la replicaci�n del       " +
                                                  "\n virus, mejorar la funci�n inmunol�gica y prevenir el desarrollo de infecciones oportunistas. Estos medicamentos se       " +
                                                  "\n eligen y ajustan espec�ficamente por un m�dico especialista en VIH pedi�trico, y es vital la adherencia estricta al      " +
                                                  "\n r�gimen. Algunos ejemplos de medicamentos usados en TARV incluyen inhibidores de la transcriptasa inversa an�logos       " +
                                                  "\n de nucle�sidos (como Zidovudina, marca com�n en M�xico: Retrovir), inhibidores de la transcriptasa inversa no an�logos   " +
                                                  "\n de nucle�sidos (como Efavirenz, marca com�n: Sustiva), e inhibidores de la proteasa (como Lopinavir/Ritonavir, marca     " +
                                                  "\n com�n: Kaletra). El tratamiento tambi�n incluye el manejo y prevenci�n de infecciones oportunistas con antibi�ticos      " +
                                                  "\n profil�cticos (como el trimetoprim/sulfametoxazol, marca com�n: Bactrim) para proteger contra ciertas infecciones.       " +
                                                  "\n Es fundamental el seguimiento m�dico constante. Tambi�n es recomendable que el ni�o consuma alimentos que refuercen      " +
                                                  "\n el sistema inmune, proporcionen energ�a y ayuden a mantener un peso saludable, tales como carnes magras como pollo y     " +
                                                  "\n pescado, que aportan prote�nas esenciales para la reparaci�n de tejidos y la funci�n inmune; l�cteos y alternativas      " +
                                                  "\n enriquecidas con calcio y vitamina D para la salud �sea; granos integrales como avena y arroz integral, ricos en fibra   " +
                                                  "\n y energ�a sostenida; as� como una amplia variedad de frutas y verduras de colores vivos como espinacas, br�coli,         " +
                                                  "\n naranjas y fresas, que proveen vitaminas, minerales y antioxidantes, como la Vitamina C (importante para el sistema      " +
                                                  "\n inmune) y el �cido F�lico (esencial para la producci�n de c�lulas).Este es solo un Diagn�stico predeterminado l�gico,    " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus          " +
                                                  "\n respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad  " +
                                                  "\n en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se  " +
                                                  "\n le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");  
                            }
                            if(Enfermedad.equals("Fiebre, Secreci�n anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea. " +
                                                  "\n Es recomendable que el ni�o realice actividad f�sica moderada y adaptada a su estado de salud, sin forzar su cuerpo," + 
                                                  "\n buscando idealmente cerca de 60 minutos de actividad f�sica moderada a intensa diaria para los m�s grandes, pero siempre" +
                                                  "\n con el cuidado necesario. Tambi�n es crucial el consumo diario de 1.7 Litros de agua al d�a (siete vasos de agua de " +
                                                  "\n tama�o regular) para mantener una buena hidrataci�n, fundamental para apoyar el proceso de recuperaci�n del cuerpo. " +
                                                  "\n POSIBLE TRATAMIENTO: Para la gonorrea en ni�os, el tratamiento es estrictamente con antibi�ticos, siempre bajo la   " +
                                                  "\n supervisi�n y prescripci�n de un m�dico. La elecci�n y dosis del antibi�tico depender�n de la edad, peso y la cepa  " +
                                                  "\n espec�fica de la bacteria. Es vital que se complete el ciclo de antibi�ticos tal como lo indique el profesional de la" +
                                                  "\n salud para asegurar la erradicaci�n total de la infecci�n y prevenir complicaciones. Ejemplos de antibi�ticos utilizados" +
                                                  "\n incluyen ceftriaxona (una marca com�n es Rocephin) administrada por inyecci�n, o azitromicina (una marca com�n es   " +
                                                  "\n Zithromax) administrada oralmente. Es importante recordar que la gonorrea en ni�os requiere una evaluaci�n m�dica   " +
                                                  "\n inmediata, ya que puede tener implicaciones serias y, en algunos casos, puede ser indicativa de abuso. Tambi�n es   " +
                                                  "\n recomendable que el ni�o consuma alimentos que fortalezcan su sistema inmune y contribuyan a su recuperaci�n general," +
                                                  "\n como una amplia variedad de frutas y verduras frescas ricas en Vitamina C y antioxidantes (como naranjas, fresas,   " +
                                                  "\n kiwis y br�coli) que apoyan la funci�n inmunol�gica; prote�nas magras (como pollo, pescado y legumbres) que son    " +
                                                  "\n esenciales para la reparaci�n de tejidos y el mantenimiento de la energ�a; y granos integrales (como avena y arroz  " +
                                                  "\n integral) que proveen energ�a sostenida y fibra para una buena digesti�n. Este es solo un Diagn�stico predeterminado" +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad  " +
                                                  "\n y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer   " +
                                                  "\n mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no  " +
                                                  "\n le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app  " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linf�ticos inflamados, �lceras o llagas dolorosas, Picaz�n o ardor, Dolor al orinar.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n Es recomendable que el ni�o realice actividad f�sica moderada y" +
                                                  "\n adaptada a su estado de salud, especialmente evitando actividades que puedan irritar las lesiones si estas est�n" +
                                                  "\n presentes, como el roce excesivo o la sudoraci�n intensa en el �rea afectada. Una vez que las lesiones remitan, " +
                                                  "\n puede retomar gradualmente la actividad f�sica normal para su edad, buscando idealmente cerca de 60 minutos de  " +
                                                  "\n actividad moderada a intensa diaria para los m�s grandes. Tambi�n es crucial el consumo diario de 1.7 Litros de " +
                                                  "\n agua al d�a (siete vasos de agua de tama�o regular) para mantener una buena hidrataci�n, lo cual es fundamental " +
                                                  "\n para el bienestar general y el funcionamiento �ptimo del sistema inmune. POSIBLE TRATAMIENTO: Para el herpes genital" +
                                                  "\n en ni�os, el tratamiento principal consiste en medicamentos antivirales que ayudan a controlar el brote, reducir" +
                                                  "\n la intensidad y duraci�n de los s�ntomas, y prevenir futuras recurrencias, aunque no eliminan el virus del cuerpo." +
                                                  "\n Es fundamental que estos medicamentos sean prescritos y supervisados por un m�dico, quien determinar� la dosis  " +
                                                  "\n adecuada seg�n la edad y el peso del ni�o. Algunos ejemplos de medicamentos antivirales utilizados incluyen Aciclovir" +
                                                  "\n (una marca com�n es Zovirax), Valaciclovir (una marca com�n es Valtrex), y Famciclovir (una marca com�n es Famvir)." +
                                                  "\n Adem�s del tratamiento antiviral, es importante mantener una higiene adecuada de las lesiones y evitar tocarlas para" +
                                                  "\n prevenir la propagaci�n. Tambi�n es recomendable que el ni�o consuma alimentos que fortalezcan su sistema inmune y " +
                                                  "\n ayuden a la cicatrizaci�n, tales como alimentos ricos en lisina y bajos en arginina, ya que la lisina puede inhibir" +
                                                  "\n la replicaci�n del virus del herpes, presentes en l�cteos, pescado y pollo, que aportan prote�nas esenciales y  " +
                                                  "\n Vitamina D (importante para la funci�n inmune). Una variedad de frutas y verduras de colores vivos, como espinacas," +
                                                  "\n pimientos rojos y kiwis, que son ricas en Vitamina C y antioxidantes, tambi�n contribuyen a la reparaci�n celular " +
                                                  "\n y el fortalecimiento de las defensas del cuerpo. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado" +
                                                  "\n no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n" +
                                                  "\n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el" +
                                                  "\n tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo" +
                                                  "\n se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida)" +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, �lceras indoloras, Erupci�n cut�nea, Dolor de cabeza, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer S�filis." +
                                                  "\n Es recomendable que el ni�o realice actividad f�sica moderada y adaptada a su estado de salud, especialmente si la" +
                                                  "\n s�filis ha afectado alguna articulaci�n o hueso, o si presenta fatiga. Durante el tratamiento y la recuperaci�n, la" +
                                                  "\n actividad debe ser supervisada, buscando idealmente cerca de 60 minutos de actividad moderada a intensa diaria para" +
                                                  "\n los m�s grandes, pero siempre con precauci�n y escuchando las se�ales del cuerpo. Tambi�n es crucial el consumo  " +
                                                  "\n diario de 1.7 Litros de agua al d�a (siete vasos de agua de tama�o regular) para mantener una buena hidrataci�n, " +
                                                  "\n fundamental para el funcionamiento �ptimo del cuerpo y el proceso de eliminaci�n de toxinas durante el tratamiento." +
                                                  "\n POSIBLE TRATAMIENTO: Para la s�filis en ni�os, el tratamiento principal y m�s efectivo es con antibi�ticos, siendo" +
                                                  "\n la penicilina el medicamento de elecci�n. La dosis y la duraci�n del tratamiento ser�n determinadas estrictamente " +
                                                  "\n por un m�dico, y es fundamental completar el ciclo completo para asegurar la erradicaci�n de la infecci�n y prevenir" +
                                                  "\n complicaciones a largo plazo. En casos de alergia a la penicilina, el m�dico puede considerar otras opciones como  " +
                                                  "\n la ceftriaxona (una marca com�n es Rocephin). Es vital un seguimiento m�dico cercano despu�s del tratamiento para  " +
                                                  "\n confirmar la curaci�n. Tambi�n es recomendable que el ni�o consuma alimentos que fortalezcan su sistema inmune y   " +
                                                  "\n apoyen la recuperaci�n general, como una amplia variedad de frutas y verduras frescas (por ejemplo, espinacas, br�coli," +
                                                  "\n naranjas y fresas), ricas en Vitamina C y antioxidantes que ayudan a proteger las c�lulas del cuerpo y a potenciar las " +
                                                  "\n defensas; prote�nas magras (como pollo, pescado y legumbres) que son esenciales para la reparaci�n de tejidos y la   " +
                                                  "\n energ�a; y granos integrales (como avena y arroz integral), que proveen fibra y energ�a sostenida. Este es solo un   " +
                                                  "\n Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que" +
                                                  "\n por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida" +
                                                  "\n para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del   " +
                                                  "\n Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a" + 
                                                  "\n la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, P�rdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n Es recomendable que el ni�o realice actividad f�sica moderada y adaptada a su estado de salud y nivel de energ�a," +
                                                  "\n especialmente durante la fase activa de la enfermedad y el tratamiento, cuando puede experimentar fatiga. Se deben" +
                                                  "\n evitar actividades extenuantes y priorizar el reposo. A medida que su condici�n mejore, puede retomar gradualmente" + 
                                                  "\n juegos ligeros y paseos cortos, siempre bajo supervisi�n m�dica, buscando alcanzar los cerca de 60 minutos de   " +
                                                  "\n actividad moderada diaria para los m�s grandes. Tambi�n es crucial el consumo diario de 2 a 2.5 Litros de agua al" + 
                                                  "\n d�a (ocho a diez vasos de tama�o regular) para mantener una excelente hidrataci�n, lo cual es vital para el  " +
                                                  "\n funcionamiento general del cuerpo, la eliminaci�n de desechos y el apoyo a los �rganos que metabolizan los medicamentos" +
                                                  "\n antituberculosos. POSIBLE TRATAMIENTO: Para la tuberculosis en ni�os, el tratamiento es un r�gimen prolongado de  " +
                                                  "\n antibi�ticos antituberculosos, que se administra bajo estricta supervisi�n m�dica. Es absolutamente esencial que  " +
                                                  "\n el ni�o complete el curso completo del tratamiento, que puede durar varios meses, para erradicar la bacteria y prevenir" +
                                                  "\n la aparici�n de cepas resistentes. Los medicamentos comunes incluyen Isoniazida (una marca com�n es Laniazid),    " +
                                                  "\n Rifampicina (una marca com�n es Rifadin), Pirazinamida y Etambutol. La combinaci�n y dosis exactas ser�n determinadas" +
                                                  "\n por el m�dico. Es fundamental un seguimiento m�dico constante. Tambi�n es recomendable que el ni�o consuma alimentos " +
                                                  "\n que fortalezcan su sistema inmune y le proporcionen la energ�a y nutrientes necesarios para combatir la infecci�n y  " +
                                                  "\n apoyar el tratamiento, como prote�nas de alto valor biol�gico (huevo, pollo, pescado, legumbres) que son cruciales   " +
                                                  "\n para la reparaci�n de tejidos y la producci�n de c�lulas inmunes; alimentos ricos en Vitamina A (zanahorias, batatas," +
                                                  "\n espinacas) que juegan un papel fundamental en la integridad de las mucosas respiratorias y la funci�n inmune; alimentos" +
                                                  "\n ricos en Vitamina C (naranjas, kiwis, fresas, br�coli) que son potentes antioxidantes y esenciales para el sistema   " +
                                                  "\n inmunitario; y alimentos ricos en Vitamina D (pescado graso, yemas de huevo, leche fortificada) que se ha demostrado que" +
                                                  "\n tienen un papel en la respuesta inmune contra la TB. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado" +
                                                  "\n no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas," +
                                                  "\n para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado" +
                                                  "\n de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho" + 
                                                  "\n consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchaz�n en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n Es recomendable que el ni�o realice actividad f�sica suave y de bajo impacto, adaptada a su nivel de dolor y la condici�n" +
                                                  "\n de sus articulaciones, buscando mantener la flexibilidad y fortalecer los m�sculos sin sobrecargar las zonas afectadas.  " +
                                                  "\n Actividades como la nataci�n, el ciclismo (con sill�n adecuado) o ejercicios de estiramiento suaves pueden ser muy     " +
                                                  "\n beneficiosas, siempre bajo supervisi�n y previa consulta con el m�dico o fisioterapeuta. La cantidad de ejercicio debe " +
                                                  "\n ser progresiva y ajustada a sus d�as buenos y malos, pero se debe fomentar el movimiento regular para evitar la rigidez," +
                                                  "\n idealmente buscando periodos cortos pero frecuentes de actividad a lo largo del d�a. Tambi�n es crucial el consumo diario" +
                                                  "\n de 1.7 Litros de agua al d�a (siete vasos de agua de tama�o regular) para mantener una buena hidrataci�n, lo cual es   " +
                                                  "\n fundamental para la salud general, el funcionamiento �ptimo de las articulaciones y el metabolismo de los medicamentos." +
                                                  "\n POSIBLE TRATAMIENTO: Para la artritis en ni�os, el tratamiento suele incluir; medicamentos antiinflamatorios no esteroideos" +
                                                  "\n (AINEs) para reducir el dolor y la inflamaci�n (como el ibuprofeno, una marca com�n es Advil o Motrin, o el naproxeno, " +
                                                  "\n una marca com�n es Aproben), f�rmacos antirreum�ticos modificadores de la enfermedad (FARME) que act�an sobre el sistema" +
                                                  "\n inmune para controlar la progresi�n de la enfermedad (como el metotrexato, una marca com�n es Trexall), y en algunos casos," +
                                                  "\n medicamentos biol�gicos para la artritis juvenil idiop�tica grave. Es fundamental que estos tratamientos sean prescritos y" +
                                                  "\n supervisados por un reumat�logo pedi�tatra, quien ajustar� las dosis y monitorear� los efectos. Tambi�n es recomendable que" +
                                                  "\n el ni�o consuma alimentos que ayuden a reducir la inflamaci�n y fortalezcan su sistema inmune, tales como pescados grasos  " +
                                                  "\n (salm�n, sardinas) que son ricos en �cidos grasos Omega-3, potentes antiinflamatorios; una amplia variedad de frutas y     " +
                                                  "\n verduras de colores vivos (como ar�ndanos, espinacas, br�coli y naranjas) que aportan antioxidantes y Vitamina C, esenciales" +
                                                  "\n para proteger las c�lulas del da�o y apoyar el sistema inmune; alimentos ricos en Vitamina D y calcio (l�cteos, huevos,    " +
                                                  "\n cereales fortificados) importantes para la salud �sea, la cual puede verse afectada por la enfermedad o el tratamiento;    " +
                                                  "\n y especias como la c�rcuma y el jengibre, que contienen compuestos con propiedades antiinflamatorias naturales. Este es solo" +
                                                  "\n un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por" +
                                                  "\n ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para   " +
                                                  "\n establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no" +
                                                  "\n le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida)  " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n Es recomendable que el ni�o, especialmente durante la fase parox�stica de tos severa, limite la actividad f�sica a movimientos" +
                                                  "\n suaves y evite cualquier esfuerzo que pueda desencadenar ataques de tos. El reposo es crucial para su recuperaci�n y para conservar" +
                                                  "\n energ�a. A medida que mejore, puede retomar gradualmente actividades de bajo impacto, siempre bajo supervisi�n, buscando alcanzar " +
                                                  "\n los cerca de 60 minutos de actividad moderada diaria para los m�s grandes. Tambi�n es crucial el consumo diario de 2 Litros de agua" +
                                                  "\n al d�a (ocho vasos de tama�o regular), o incluso m�s si presenta fiebre o dificultad para alimentarse, para mantener una excelente " +
                                                  "\n hidrataci�n y ayudar a fluidificar las secreciones respiratorias, lo cual es vital para su comodidad y recuperaci�n.               " +
                                                  "\n POSIBLE TRATAMIENTO: Para la tosferina en ni�os, el tratamiento principal es con antibi�ticos, que son m�s efectivos cuando se    " +
                                                  "\n administran en las primeras etapas de la enfermedad para acortar la duraci�n de los s�ntomas y reducir la propagaci�n. Los m�s    " +
                                                  "\n comunes son los macr�lidos, como la azitromicina (una marca com�n es Zithromax), la eritromicina (una marca com�n es Pneumo-E o   " +
                                                  "\n Eritrobase) o la claritromicina (una marca com�n es Klacid). Es fundamental que el ni�o complete el ciclo completo de antibi�ticos" + 
                                                  "\n tal como lo indique el m�dico, incluso si los s�ntomas mejoran, para erradicar la bacteria. En casos severos o en lactantes, podr�a" +
                                                  "\n requerirse hospitalizaci�n para el monitoreo y manejo de complicaciones. Tambi�n es recomendable que el ni�o consuma alimentos que" +
                                                  "\n fortalezcan su sistema inmune y le proporcionen nutrientes que ayuden a su recuperaci�n, especialmente aquellos que son f�ciles de" +
                                                  "\n tragar y digestibles debido a los ataques de tos, tales como: Pur�s de frutas y verduras: como el pur� de calabaza, que aporta una" +
                                                  "\n buena cantidad de Vitamina A (alrededor de 369 �g por cada 100 gramos, lo que representa cerca del 74% de la ingesta diaria       " +
                                                  "\n recomendada para un ni�o de 4-8 a�os), esencial para la salud de las mucosas respiratorias y la funci�n inmune; o pur� de zanahoria," +
                                                  "\n tambi�n rica en Vitamina A y antioxidantes. Pl�tanos: f�ciles de comer y ricos en potasio (aproximadamente 358 mg por cada 100 gramos)," +
                                                  "\n un electrolito importante que puede ayudar a reponer las p�rdidas debido a la tos y al sudor, adem�s de aportar energ�a. Sopas y    " +
                                                  "\n caldos suaves: que contribuyen a la hidrataci�n y aportan nutrientes de forma l�quida. Frutas suaves ricas en Vitamina C: como las fresas," +
                                                  "\n que contienen cerca de 58.8 mg de Vitamina C por cada 100 gramos (aproximadamente el 65% de la ingesta diaria recomendada para un ni�o " +
                                                  "\n de 4-8 a�os), o la guayaba, con niveles a�n m�s altos de esta vitamina, crucial para fortalecer el sistema inmunol�gico. Este es solo  " +
                                                  "\n un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la  " +
                                                  "\n enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad" +
                                                  "\n en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda  " +
                                                  "\n mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchaz�n de las gl�ndulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n Es recomendable que el ni�o, especialmente durante la fase aguda de la enfermedad cuando puede presentar fiebre y malestar, limite la actividad" +
                                                  "\n f�sica a un reposo adecuado, evitando esfuerzos que puedan aumentar el malestar o la hinchaz�n de las gl�ndulas. A medida que su condici�n    " +
                                                  "\n mejore y la fiebre ceda, puede retomar gradualmente actividades ligeras y juegos tranquilos, siempre bajo supervisi�n, buscando alcanzar los  " +
                                                  "\n cerca de 60 minutos de actividad moderada diaria para los m�s grandes. Tambi�n es crucial el consumo diario de 2 Litros de agua al d�a        " +
                                                  "\n (ocho vasos de tama�o regular), o m�s si tiene fiebre o dificultad para tragar alimentos s�lidos, para mantener una excelente hidrataci�n, lo " +
                                                  "\n cual es vital para su bienestar general, para ayudar a reducir la fiebre y para mantener las mucosas hidratadas, aliviando la garganta.       " +
                                                  "\n POSIBLE TRATAMIENTO: Para las paperas en ni�os, el tratamiento es principalmente de soporte y para aliviar los s�ntomas, ya que es una infecci�n" +
                                                  "\n viral y no existen medicamentos espec�ficos para erradicar el virus. Se recomienda el reposo en cama, la aplicaci�n de compresas fr�as o      " +
                                                  "\n calientes en las gl�ndulas inflamadas para aliviar el dolor, y el uso de medicamentos para controlar la fiebre y el dolor, como el paracetamol" +
                                                  "\n (una marca com�n es Tempra o Tylenol) o el ibuprofeno (una marca com�n es Advil o Motrin). Es fundamental evitar el uso de aspirina en ni�os  " +
                                                  "\n debido al riesgo de s�ndrome de Reye. Tambi�n es recomendable que el ni�o consuma alimentos que fortalezcan su sistema inmune y sean f�ciles  " +
                                                  "\n de masticar y tragar debido a la hinchaz�n de las gl�ndulas salivales, tales como pur�s y alimentos blandos; puede incluir caldos nutritivos  " +
                                                  "\n y sopas suaves que aportan hidrataci�n y energ�a. En cuanto a las frutas y verduras, las naranjas, por ejemplo, son una fuente excelente de   " +
                                                  "\n Vitamina C (aportando aproximadamente 53.2 mg por cada 100 gramos, lo que representa cerca del 59% de la ingesta diaria recomendada para un   " +
                                                  "\n ni�o de 4-8 a�os), esencial para el sistema inmunol�gico; tambi�n las fresas, que contienen alrededor de 58.8 mg de Vitamina C por cada 100   " +
                                                  "\n gramos (aproximadamente el 65% de la ingesta diaria recomendada para la misma edad), y son ricas en antioxidantes que apoyan la recuperaci�n; " +
                                                  "\n el pl�tano, f�cil de digerir y rico en potasio (aproximadamente 358 mg por cada 100 gramos), un electrolito importante que ayuda a reponer    " +
                                                  "\n las p�rdidas y aporta energ�a; y el aguacate, que proporciona grasas saludables y diversas vitaminas (como la E y K) que apoyan la funci�n    " +
                                                  "\n inmunol�gica y la salud general. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente   " +
                                                  "\n tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de    " +
                                                  "\n Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagnostico no le  " +
                                                  "\n satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupci�n cut�nea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n Es recomendable que el ni�o, durante la fase aguda de la enfermedad cuando puede presentar fiebre," +
                                                  "\n dolor muscular y articular, mantenga un reposo adecuado y evite la actividad f�sica extenuante. A medida que sus s�ntomas mejoren y bajo   " +
                                                  "\n supervisi�n, puede retomar gradualmente actividades ligeras y juegos tranquilos, buscando alcanzar los cerca de 60 minutos de actividad    " +
                                                  "\n moderada diaria para los m�s grandes, priorizando entornos donde se pueda minimizar la exposici�n a mosquitos. Tambi�n es crucial el consumo" +
                                                  "\n diario de 2 Litros de agua al d�a (ocho vasos de tama�o regular), o m�s si tiene fiebre o v�mitos, para mantener una excelente hidrataci�n  " +
                                                  "\n y prevenir la deshidrataci�n, lo cual es vital para el bienestar general y el funcionamiento �ptimo de todos sus sistemas corporales durante" +
                                                  "\n la recuperaci�n. POSIBLE TRATAMIENTO: Para el Zika en ni�os, el tratamiento es principalmente de soporte, ya que no existe un medicamento   " +
                                                  "\n antiviral espec�fico para curar la infecci�n. El manejo se enfoca en aliviar los s�ntomas, lo que incluye el reposo, una buena hidrataci�n  " +
                                                  "\n y el uso de medicamentos para controlar la fiebre y el dolor, como el paracetamol (una marca com�n es Tempra o Tylenol). Es fundamental evitar" +
                                                  "\n el uso de aspirina y otros AINEs (antiinflamatorios no esteroideos como el ibuprofeno) hasta que se descarte la posibilidad de dengue, debido " +
                                                  "\n al riesgo de complicaciones hemorr�gicas. Tambi�n es crucial proteger al ni�o de nuevas picaduras de mosquitos durante la enfermedad para  " +
                                                  "\n evitar la transmisi�n del virus a otras personas. Adem�s, es recomendable que el ni�o consuma alimentos que fortalezcan su sistema inmune  " +
                                                  "\n y le proporcionen energ�a, tales como caldos nutritivos y sopas suaves que facilitan la hidrataci�n y son f�ciles de digerir; frutas ricas " +
                                                  "\n en Vitamina C como las naranjas, que aportan aproximadamente 53.2 mg por cada 100 gramos (cerca del 59% de la ingesta diaria recomendada para" +
                                                  "\n un ni�o de 4-8 a�os), o el kiwi, que contiene alrededor de 92.7 mg de Vitamina C por cada 100 gramos (aproximadamente el 103% de la ingesta " +
                                                  "\n diaria recomendada para la misma edad), ambos esenciales para reforzar las defensas del cuerpo; el pl�tano, que es f�cil de digerir y rico " +
                                                  "\n en potasio (aproximadamente 358 mg por cada 100 gramos), un electrolito importante que ayuda a reponer las p�rdidas por fiebre o sudor; y  " +
                                                  "\n vegetales de hoja verde oscuro como la espinaca, que aportan Vitamina K, Vitamina A y hierro, contribuyendo a la vitalidad y al buen       " +
                                                  "\n funcionamiento general. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga   " +
                                                  "\n esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida" +
                                                  "\n para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagnostico no le satisface" +
                                                  "\n del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, V�mitos, Deshidrataci�n, Dolor abdominal.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n Es recomendable que el ni�o, mientras presente diarrea y v�mitos, limite la actividad f�sica a un reposo absoluto o muy suave, " +
                                                  "\n evitando cualquier esfuerzo que pueda empeorar la deshidrataci�n o el malestar gastrointestinal. El objetivo principal es conservar" +
                                                  "\n energ�a para la recuperaci�n. A medida que los s�ntomas disminuyan y la hidrataci�n mejore, puede retomar gradualmente juegos tranquilos," +
                                                  "\n siempre bajo supervisi�n, buscando alcanzar los cerca de 60 minutos de actividad moderada diaria para los m�s grandes. Tambi�n es    " + 
                                                  "\n crucial el consumo diario de 2 a 2.5 Litros de agua al d�a (ocho a diez vasos de tama�o regular) en peque�as tomas frecuentes,       " +
                                                  "\n preferiblemente mediante soluciones de rehidrataci�n oral (como Electrolit pedi�trico o Pedialyte), para reponer los l�quidos y      " +
                                                  "\n electrolitos perdidos por la diarrea y el v�mito, lo cual es vital para prevenir la deshidrataci�n severa.                           " +
                                                  "\n POSIBLE TRATAMIENTO: Para el rotavirus en ni�os, el tratamiento es principalmente de soporte y se enfoca en la rehidrataci�n, ya que " +
                                                  "\n no existe un medicamento antiviral espec�fico para el virus. La clave es prevenir y tratar la deshidrataci�n mediante la administraci�n" +
                                                  "\n de l�quidos y electrolitos. En casa, se pueden usar soluciones de rehidrataci�n oral (SRO), y en casos de deshidrataci�n severa, puede " +
                                                  "\n ser necesaria la hospitalizaci�n para la administraci�n de l�quidos por v�a intravenosa. Los medicamentos para detener la diarrea no   " +
                                                  "\n suelen ser recomendados en ni�os con rotavirus. En cuanto a medicamentos para el malestar, el paracetamol (una marca com�n es Tempra   " +
                                                  "\n o Tylenol) puede usarse para controlar la fiebre y aliviar las molestias, siempre bajo indicaci�n m�dica. Es fundamental la supervisi�n" +
                                                  "\n m�dica. Adem�s, es recomendable que el ni�o consuma alimentos que sean f�ciles de digerir y ayuden a la recuperaci�n de la flora       " +
                                                  "\n intestinal, as� como nutrientes que apoyen la funci�n inmune, tales como arroz blanco o avena cocida que aportan energ�a y son suaves  " +
                                                  "\n para el est�mago; caldos de pollo o vegetales desgrasados que contribuyen a la hidrataci�n y reponen algunos electrolitos; el pl�tano, " +
                                                  "\n f�cil de digerir y rico en potasio (aproximadamente 358 mg por cada 100 gramos), un electrolito vital que se pierde con la diarrea y   " +
                                                  "\n el v�mito, lo que representa una recuperaci�n importante de lo perdido; y la manzana (sin c�scara y cocida en pur�), que contiene pectina," +
                                                  "\n una fibra soluble que puede ayudar a solidificar las heces y es suave para el sistema digestivo del ni�o. Tambi�n las verduras cocidas y" +
                                                  "\n en pur�, como la zanahoria, que aporta Vitamina A (alrededor de 835 �g por cada 100 gramos, que representa cerca del 167% de la ingesta " +
                                                  "\n diaria recomendada para un ni�o de 4-8 a�os), importante para la recuperaci�n de las mucosas intestinales y el fortalecimiento del sistema" +
                                                  "\n inmunol�gico. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa     " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida" +
                                                  "\n para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagnostico no le   " +
                                                  "\n satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, N�useas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n Es recomendable que el ni�o, durante la fase aguda de la enfermedad cuando puede presentar fiebre, diarrea o s�ntomas                          " +
                                                  "\n neurol�gicos, mantenga un reposo adecuado y evite cualquier actividad f�sica extenuante. El objetivo es preservar la energ�a                   " +
                                                  "\n y permitir que su cuerpo se recupere. A medida que los s�ntomas disminuyan y bajo supervisi�n m�dica, puede retomar gradualmente               " +
                                                  "\n actividades tranquilas y de bajo impacto, buscando alcanzar los cerca de 60 minutos de actividad moderada diaria para los m�s                  " +
                                                  "\n grandes. Tambi�n es crucial el consumo diario de 2 a 2.5 Litros de agua al d�a (ocho a diez vasos de tama�o regular), especialmente            " +
                                                  "\n si presenta fiebre o diarrea, para mantener una excelente hidrataci�n y reponer los l�quidos perdidos, lo cual es vital para el                " +
                                                  "\n bienestar general y el funcionamiento �ptimo de sus sistemas corporales mientras combate la infecci�n. POSIBLE TRATAMIENTO: Para la            " +
                                                  "\n listeriosis en ni�os, el tratamiento principal consiste en la administraci�n de antibi�ticos, siendo la ampicilina (una marca com�n            " +
                                                  "\n es Omnipen o Polycillin) o la penicilina (una marca com�n es Penprocilina o Bencilpenicilina S�dica) los m�s com�nmente utilizados,            " +
                                                  "\n a menudo en combinaci�n con otros antibi�ticos como la gentamicina. La elecci�n, dosis y duraci�n del tratamiento deben ser                    " +
                                                  "\n estrictamente determinadas por un m�dico, y es fundamental completar el ciclo completo de antibi�ticos para erradicar la bacteria              " +
                                                  "\n y prevenir complicaciones serias, como la meningitis. En casos graves, puede requerirse hospitalizaci�n para la administraci�n                 " +
                                                  "\n intravenosa de medicamentos y monitoreo. Adem�s, es recomendable que el ni�o consuma alimentos que refuercen su sistema inmune                 " +
                                                  "\n y apoyen su recuperaci�n general, priorizando aquellos que son f�ciles de digerir si presenta s�ntomas gastrointestinales. Estos               " +
                                                  "\n incluyen prote�nas magras como el pollo cocido o el pescado (si su digesti�n lo permite), que aportan amino�cidos esenciales para la           " +
                                                  "\n reparaci�n de tejidos y la producci�n de c�lulas inmunes; caldos y sopas nutritivas que contribuyen a la hidrataci�n y al aporte de            " +
                                                  "\n electrolitos. Tambi�n son beneficiosas frutas ricas en Vitamina C como las fresas, que contienen aproximadamente 58.8 mg por cada 100          " +
                                                  "\n gramos (cerca del 65% de la ingesta diaria recomendada para un ni�o de 4-8 a�os), o los kiwis, que ofrecen alrededor de 92.7 mg de             " +
                                                  "\n Vitamina C por cada 100 gramos (aproximadamente el 103% de la ingesta diaria recomendada para la misma edad), ambos potentes                   " +
                                                  "\n antioxidantes que fortalecen las defensas del cuerpo. Las verduras cocidas en pur�, como la zanahoria, que aporta una buena cantidad           " +
                                                  "\n de Vitamina A (alrededor de 835 �g por cada 100 gramos, lo que representa cerca del 167% de la ingesta diaria recomendada para un ni�o         " +
                                                  "\n de 4-8 a�os), tambi�n son cruciales para la integridad de las mucosas y la funci�n inmunitaria. Este es solo un Diagn�stico predeterminado     " +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n       " +
                                                  "\n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de        " +
                                                  "\n su paciente, adem�s por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su m�dico,        " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, V�mitos.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n Es recomendable que el ni�o, durante la fase aguda de la enfermedad cuando presenta diarrea severa, dolor abdominal y fiebre, mantenga un reposo estricto, " +
                                                  "\n evitando cualquier actividad f�sica que pueda agravar la deshidrataci�n o el malestar gastrointestinal. La prioridad es la conservaci�n de energ�a. A medida" +
                                                  "\n que los s�ntomas disminuyan y la rehidrataci�n sea efectiva, puede retomar gradualmente juegos tranquilos y actividades de bajo impacto, siempre bajo     " +
                                                  "\n supervisi�n, buscando alcanzar los cerca de 60 minutos de actividad moderada diaria para los m�s grandes. Tambi�n es crucial el consumo diario de 2 a     " +
                                                  "\n 2.5 Litros de agua al d�a (ocho a diez vasos de tama�o regular) en peque�as y frecuentes tomas, preferiblemente soluciones de rehidrataci�n oral         " +
                                                  "\n (como Electrolit pedi�trico o Pedialyte), para reponer los l�quidos y electrolitos perdidos por la diarrea y el v�mito, lo cual es vital para prevenir    " +
                                                  "\n la deshidrataci�n severa y apoyar la funci�n renal durante la infecci�n. POSIBLE TRATAMIENTO: Para la shigelosis en ni�os, el tratamiento principal es    " +
                                                  "\n con antibi�ticos, ya que la shigelosis es una infecci�n bacteriana que puede ser grave. Los antibi�ticos m�s comunes para esta condici�n incluyen la      " +
                                                  "\n azitromicina (una marca com�n es Zithromax), o las cefalosporinas de tercera generaci�n como la ceftriaxona (una marca com�n es Rocephin), dependiendo de " + 
                                                  "\n la resistencia bacteriana local. Es fundamental que el ni�o complete el ciclo completo de antibi�ticos tal como lo indique el m�dico, incluso si los s�ntomas" + 
                                                  "\n mejoran, para erradicar la bacteria y evitar la propagaci�n. Adem�s del tratamiento antibi�tico, el manejo de la deshidrataci�n mediante soluciones de     " +
                                                  "\n rehidrataci�n oral es esencial. Los medicamentos para frenar la diarrea generalmente no se recomiendan. Es importante tambi�n que el ni�o consuma alimentos" +
                                                  "\n que sean f�ciles de digerir, suaves para el sistema gastrointestinal y que aporten nutrientes para fortalecer su sistema inmune, como arroz blanco o avena" +
                                                  "\n cocida, que son fuente de energ�a y suaves para el est�mago; caldos de pollo o vegetales desgrasados que contribuyen a la hidrataci�n y a la reposici�n de " +
                                                  "\n electrolitos; el pl�tano, muy beneficioso por su contenido de potasio (aproximadamente 358 mg por cada 100 gramos), un electrolito clave que se pierde en " +
                                                  "\n grandes cantidades con la diarrea, ayudando a normalizar los niveles y aportar energ�a de f�cil absorci�n. Tambi�n se recomienda el pur� de manzana      " +
                                                  "\n (sin c�scara), que contiene pectina, una fibra soluble que puede ayudar a reducir la diarrea. Otro alimento valioso es la zanahoria cocida y en pur�, la " +
                                                  "\n cual es una excelente fuente de Vitamina A (alrededor de 835 �g por cada 100 gramos, lo que representa cerca del 167% de la ingesta diaria recomendada para" +
                                                  "\n un ni�o de 4-8 a�os), crucial para la recuperaci�n de las mucosas intestinales da�adas por la infecci�n y para fortalecer la respuesta inmunitaria. Este es" +
                                                  "\n solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus " +
                                                  "\n respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su" +
                                                  "\n paciente, adem�s por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece" +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos cr�nica, Producci�n excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad Pulmonar Obstructiva Cr�nica (EPOC)." +
                                                  "\n Es recomendable que el ni�o realice ejercicios de respiraci�n y actividades f�sicas de bajo impacto adaptadas a su capacidad pulmonar y estado general," +
                                                  "\n bajo supervisi�n m�dica. Se deben evitar ambientes con humo o contaminantes, y priorizar actividades que no causen dificultad respiratoria excesiva.   " +
                                                  "\n Caminatas cortas, juegos tranquilos o ejercicios de brazos pueden ser beneficiosos, buscando mantener la movilidad y la fuerza muscular sin agotar al ni�o," +
                                                  "\n con el objetivo de alcanzar los cerca de 60 minutos de actividad moderada diaria para los m�s grandes, pero siempre con periodos de descanso.          " +
                                                  "\n Tambi�n es crucial el consumo diario de 2 Litros de agua al d�a (ocho vasos de tama�o regular) para mantener las secreciones pulmonares m�s fluidas y  " +
                                                  "\n facilitar su expectoraci�n, lo cual es vital para una mejor respiraci�n y para prevenir infecciones. POSIBLE TRATAMIENTO: Para la EPOC en ni�os        " +
                                                  "\n (que es rara y a menudo asociada a condiciones cong�nitas, exposiciones ambientales severas tempranas o infecciones recurrentes), el tratamiento se enfoca" +
                                                  "\n en manejar los s�ntomas, prevenir exacerbaciones y mejorar la funci�n pulmonar. Esto incluye el uso de broncodilatadores (como el salbutamol, una marca" +
                                                  "\n com�n es Ventolin o Aerolin, para abrir las v�as respiratorias), corticosteroides inhalados (como la fluticasona, una marca com�n es Flixotide, para reducir" +
                                                  "\n la inflamaci�n), y en algunos casos, oxigenoterapia si hay bajos niveles de ox�geno. La terapia respiratoria y la fisioterapia pulmonar son fundamentales." +
                                                  "\n Es esencial la eliminaci�n de la exposici�n a irritantes pulmonares, como el humo de tabaco. Adem�s, es recomendable que el ni�o consuma alimentos que    " +
                                                  "\n fortalezcan su sistema inmune y le proporcionen energ�a de manera sostenible, priorizando aquellos que no causen distensi�n abdominal que pueda dificultar" +
                                                  "\n la respiraci�n. Estos incluyen prote�nas magras como el pollo o el pescado, que aportan amino�cidos esenciales para la reparaci�n de tejidos y el      " +
                                                  "\n mantenimiento de la masa muscular, crucial en pacientes con EPOC; carbohidratos complejos de liberaci�n lenta como la avena o el arroz integral, que   " +
                                                  "\n proporcionan energ�a sin picos gluc�micos; y una variedad de verduras de hoja verde oscuro como la espinaca, que es rica en Vitamina K, Vitamina A y   " +
                                                  "\n antioxidantes que pueden ayudar a reducir la inflamaci�n pulmonar, y el br�coli, que aporta Vitamina C (alrededor de 89.2 mg por cada 100 gramos, lo que" +
                                                  "\n representa cerca del 99% de la ingesta diaria recomendada para un ni�o de 4-8 a�os), esencial para la funci�n inmunol�gica y como antioxidante. Tambi�n" + 
                                                  "\n se beneficia de frutas como las manzanas, que contienen quercetina, un flavonoide con propiedades antiinflamatorias que pueden ser �tiles para la salud" +
                                                  "\n pulmonar. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello" +
                                                  "\n la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el   " +
                                                  "\n tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su" + 
                                                  "\n m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreci�n anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n Es recomendable que el ni�o, mientras recibe tratamiento, mantenga una actividad f�sica normal adaptada a su estado de                 " +
                                                  "\n salud, evitando cualquier molestia o irritaci�n en el �rea afectada si presenta s�ntomas. La Clamidia no suele afectar                 " +
                                                  "\n directamente la capacidad f�sica a largo plazo. Una vez que el tratamiento sea efectivo y los s�ntomas hayan desaparecido,             " +
                                                  "\n puede seguir con la actividad f�sica recomendada para su edad, buscando idealmente cerca de 60 minutos de actividad moderada           " +
                                                  "\n a intensa diaria para los m�s grandes. Tambi�n es crucial el consumo diario de 1.7 Litros de agua al d�a (siete vasos de tama�o        " +
                                                  "\n regular) para mantener una buena hidrataci�n, lo cual es fundamental para el bienestar general, el funcionamiento �ptimo de            " +
                                                  "\n sus sistemas corporales y para apoyar la eliminaci�n de los medicamentos del organismo. POSIBLE TRATAMIENTO: Para la clamidia en       " +
                                                  "\n ni�os, el tratamiento principal es con antibi�ticos, los cuales son muy efectivos para erradicar la infecci�n. La elecci�n y la        " +
                                                  "\n dosis del antibi�tico ser�n determinadas estrictamente por un m�dico, quien considerar� la edad y el peso del ni�o. Es fundamental     " +
                                                  "\n completar el ciclo completo de antibi�ticos tal como se indique, incluso si los s�ntomas mejoran, para asegurar la eliminaci�n         " +
                                                  "\n total de la bacteria y prevenir reinfecciones o complicaciones. Los antibi�ticos com�nmente usados incluyen la azitromicina (una       " +
                                                  "\n marca com�n es Zithromax) o la eritromicina (una marca com�n es Pneumo-E o Eritrobase). Es importante recordar que la clamidia en      " +
                                                  "\n ni�os puede requerir una evaluaci�n m�dica inmediata, ya que en algunos casos puede ser indicativa de abuso. Adem�s, es recomendable   " +
                                                  "\n que el ni�o consuma alimentos que fortalezcan su sistema inmune y apoyen la recuperaci�n general, como fuentes de probi�ticos (si      " +
                                                  "\n son tolerados, como yogur natural si no hay contraindicaciones), que pueden ayudar a mantener un equilibrio saludable de la flora      " +
                                                  "\n intestinal, especialmente despu�s de la administraci�n de antibi�ticos. Tambi�n son muy beneficiosas las frutas c�tricas como las      " +
                                                  "\n naranjas, que aportan una cantidad significativa de Vitamina C (alrededor de 53.2 mg por cada 100 gramos, lo que representa cerca      " +
                                                  "\n del 59% de la ingesta diaria recomendada para un ni�o de 4-8 a�os), crucial para reforzar las defensas del cuerpo. Las verduras de     " +
                                                  "\n hoja verde oscuro como el br�coli o la espinaca, ricas en Vitamina K, Vitamina A y antioxidantes, tambi�n contribuyen a la vitalidad   " +
                                                  "\n y al buen funcionamiento general del sistema inmune, favoreciendo la recuperaci�n. Este es solo un Diagn�stico predeterminado l�gico,  " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n       " +
                                                  "\n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado   " +
                                                  "\n de su paciente, adem�s por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su     " +
                                                  "\n m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, N�useas, Dolor de cabeza severo, Rigidez en el cuello, Confusi�n.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n Es recomendable que el ni�o, durante la fase aguda de la enfermedad, mantenga un reposo estricto en cama, ya que la                       " +
                                                  "\n meningitis es una condici�n grave que requiere m�nima estimulaci�n y m�xima conservaci�n de energ�a para la recuperaci�n                  " +
                                                  "\n cerebral y general del cuerpo. Cualquier actividad f�sica debe ser evitada por completo en este periodo. Una vez que la                   " +
                                                  "\n fase aguda haya pasado y bajo estricta supervisi�n m�dica, la rehabilitaci�n o la reintroducci�n gradual de movimientos                   " +
                                                  "\n muy suaves solo se realizar� si no hay secuelas. Tambi�n es crucial el consumo diario de 2 a 2.5 Litros de agua al d�a                    " +
                                                  "\n (ocho a diez vasos de tama�o regular) en tomas peque�as y frecuentes, preferiblemente por v�a intravenosa si el ni�o no                   " +
                                                  "\n puede beber, para mantener una hidrataci�n �ptima y asegurar el correcto funcionamiento de los �rganos, especialmente los                 " +
                                                  "\n ri�ones, que procesar�n los medicamentos, y para ayudar a controlar la fiebre. POSIBLE TRATAMIENTO: Para la meningitis                    " +
                                                  "\n bacteriana en ni�os, el tratamiento es una emergencia m�dica y consiste en la administraci�n inmediata de antibi�ticos                    " +
                                                  "\n intravenosos de amplio espectro para combatir la infecci�n. La elecci�n del antibi�tico depender� de la edad del ni�o, el                 " + 
                                                  "\n tipo de bacteria sospechada y los patrones de resistencia locales, y ser� determinada por un m�dico especialista. Es vital                " +
                                                  "\n que el tratamiento antibi�tico se inicie lo antes posible y se complete en su totalidad para prevenir complicaciones graves               " +
                                                  "\n como da�o cerebral, p�rdida de audici�n o incluso la muerte. Algunos antibi�ticos comunes incluyen la ceftriaxona (una marca              " +
                                                  "\n com�n es Rocephin) o la ampicilina (una marca com�n es Omnipen o Polycillin), a veces combinados con vancomicina (una marca               " +
                                                  "\n com�n es Vancocin). Adem�s de los antibi�ticos, se pueden usar corticosteroides (como la dexametasona, una marca com�n es                 " +
                                                  "\n Decadron) para reducir la inflamaci�n cerebral y prevenir secuelas neurol�gicas, siempre bajo indicaci�n m�dica. Es fundamental           " +
                                                  "\n el monitoreo constante en un entorno hospitalario. En cuanto a la alimentaci�n, una vez que el ni�o pueda tolerar la v�a oral,            " +
                                                  "\n es recomendable que consuma alimentos que sean f�ciles de digerir y nutritivos para apoyar la recuperaci�n del sistema nervioso           " +
                                                  "\n y el fortalecimiento del sistema inmune. Esto incluye caldos y sopas suaves que aportan l�quidos y electrolitos; pur�s de                 " +
                                                  "\n verduras como la zanahoria, rica en Vitamina A (aproximadamente 835 �g por cada 100 gramos, lo que representa cerca del 167% de           " +
                                                  "\n la ingesta diaria recomendada para un ni�o de 4-8 a�os), esencial para la recuperaci�n de las mucosas y la visi�n; y frutas               " +
                                                  "\n blandas como el pl�tano, que aporta potasio (aproximadamente 358 mg por cada 100 gramos), un electrolito vital para la funci�n            " +
                                                  "\n nerviosa y muscular. Tambi�n son beneficiosos los alimentos ricos en antioxidantes como el aguacate, que provee grasas saludables         " +
                                                  "\n y Vitamina E, que pueden proteger las c�lulas neuronales del da�o oxidativo. Este es solo un Diagn�stico predeterminado l�gico,           " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n          " +
                                                  "\n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento               " +
                                                  "\n adecuado de su paciente, adem�s por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho              " +
                                                  "\n consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, P�rdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, P�rdida de apetito.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer C�ncer." +
                                                  "\n Es recomendable que el ni�o, cuya actividad f�sica debe ser siempre supervisada y adaptada a su estado de salud, energ�a y fase del tratamiento oncol�gico, mantenga" +
                                                  "\n periodos de descanso adecuados y evite cualquier actividad extenuante o que pueda comprometer su sistema inmune. Se deben priorizar actividades de bajo impacto que " +
                                                  "\n fomenten la movilidad y el bienestar, como caminatas cortas y suaves, juegos tranquilos o ejercicios de estiramiento muy ligeros, siempre que el m�dico lo autorice y" +
                                                  "\n seg�n su tolerancia. El objetivo es mantener la fuerza muscular y mejorar la calidad de vida sin sobrecargar su cuerpo, buscando alcanzar los cerca de 60 minutos de " +
                                                  "\n actividad moderada diaria para los m�s grandes, pero con flexibilidad y respetando sus l�mites. Tambi�n es crucial el consumo diario de 1.7 a 2 Litros de agua al d�a" +
                                                  "\n (siete a ocho vasos de tama�o regular), o m�s si tiene fiebre, v�mitos o diarrea como efectos secundarios del tratamiento, para mantener una excelente hidrataci�n,  " +
                                                  "\n lo cual es vital para el funcionamiento �ptimo de sus �rganos, la eliminaci�n de toxinas y el apoyo al metabolismo de los medicamentos. POSIBLE TRATAMIENTO: Para el " +
                                                  "\n c�ncer en ni�os, el tratamiento es altamente individualizado y complejo, dependiendo del tipo espec�fico de c�ncer, su etapa y la salud general del ni�o. Generalmente," +
                                                  "\n implica una combinaci�n de quimioterapia (medicamentos que matan las c�lulas cancerosas, como la vincristina, una marca com�n es Oncovin, o el ciclofosfamida, una   " +
                                                  "\n marca com�n es Cytoxan), radioterapia (uso de radiaci�n para destruir c�lulas cancerosas), cirug�a (para extirpar tumores), e incluso inmunoterapia o terapia dirigida." +
                                                  "\n Es fundamental que el tratamiento sea manejado por un equipo multidisciplinario de onc�logos pedi�tricos. Adem�s del tratamiento oncol�gico, se utilizan medicamentos  " +
                                                  "\n de soporte para manejar los efectos secundarios, como antiem�ticos para las n�useas (como el ondansetr�n, una marca com�n es Zofran), analg�sicos para el dolor      " +
                                                  "\n (como el paracetamol, una marca com�n es Tempra o Tylenol), y factores estimulantes de colonias para apoyar la m�dula �sea. En cuanto a la alimentaci�n, es         " +
                                                  "\n recomendable que el ni�o consuma alimentos que fortalezcan su sistema inmune, le proporcionen energ�a y le ayuden a tolerar mejor el tratamiento, priorizando aquellos" +
                                                  "\n que sean nutritivos y de f�cil digesti�n. Esto incluye prote�nas de alto valor biol�gico como el pollo, el pescado y los huevos, que son esenciales para la reparaci�n" +
                                                  "\n celular y el mantenimiento de la masa muscular, crucial durante y despu�s de la quimioterapia. Las verduras de hoja verde oscuro como la espinaca y el br�coli aportan" +
                                                  "\n Vitamina K, Vitamina C (el br�coli contiene cerca de 89.2 mg por cada 100 gramos, que representa aproximadamente el 99% de la ingesta diaria recomendada para un ni�o " +
                                                  "\n de 4-8 a�os) y antioxidantes, que apoyan la funci�n inmune y reducen el estr�s oxidativo. Las frutas de colores vivos como los ar�ndanos y las uvas son ricas en      " +
                                                  "\n antioxidantes (como antocianinas y resveratrol en el caso de las uvas) que pueden proteger las c�lulas y reducir la inflamaci�n. El aguacate proporciona grasas       " +
                                                  "\n saludables y Vitamina E, importantes para la energ�a y la salud general. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que" +
                                                  "\n el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para  " +
                                                  "\n establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda  " +
                                                  "\n mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            } 
                        }
                        if(EstaturaMasculino.equals("1.45-1.70 m")){
                          if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n Es recomendable que el ni�o, con una estatura de 1.45-1.70 m, realice cerca de 60 minutos de actividad f�sica moderada a intensa diaria, incluyendo juegos activos" +
                                                  "\n o deportes, siempre adaptando la intensidad a su estado de salud general durante el periodo de enfermedad. Esto es crucial para mantener un sistema inmune fuerte." +
                                                  "\n Tambi�n es recomendable el consumo diario de 2.5 a 3 Litros de agua al d�a (diez a doce vasos de tama�o regular) para mantener una excelente hidrataci�n, lo cual " +
                                                  "\n ayuda a fluidificar las secreciones respiratorias y a controlar la fiebre. POSIBLE TRATAMIENTO: Para la gripe en ni�os de esta edad, el tratamiento suele incluir;" +
                                                  "\n medicamentos para reducir la fiebre y aliviar los s�ntomas, como el paracetamol (una marca com�n es Tempra o Tylenol) o el ibuprofeno (una marca com�n es Advil   " +
                                                  "\n o Motrin). En algunos casos, si se diagnostica a tiempo (dentro de las primeras 48 horas de los s�ntomas), el m�dico puede prescribir antivirales espec�ficos contra" +
                                                  "\n la gripe como el oseltamivir (una marca com�n es Tamiflu). Es fundamental seguir las indicaciones del m�dico al pie de la letra. Tambi�n es recomendable que el ni�o" +
                                                  "\n consuma alimentos que fortalezcan su sistema inmune y aporten nutrientes para la recuperaci�n, tales como frutas ricas en Vitamina C como las guayabas, que contienen" +
                                                  "\n una cantidad muy alta de esta vitamina (alrededor de 228.3 mg por cada 100 gramos, lo que representa cerca del 254% de la ingesta diaria recomendada para un ni�o  " +
                                                  "\n de 4-8 a�os), o las naranjas, que aportan aproximadamente 53.2 mg por cada 100 gramos (cerca del 59% de la ingesta diaria recomendada para la misma edad), ambos   " +
                                                  "\n potentes antioxidantes que apoyan las defensas del cuerpo. Tambi�n son beneficiosos los vegetales de hoja verde oscuro como la espinaca, que provee Vitamina A y   " +
                                                  "\n Vitamina K, importantes para la salud de las mucosas y la funci�n inmune; y el jengibre, que puede consumirse en infusiones y posee propiedades antiinflamatorias  " +
                                                  "\n que pueden ayudar a aliviar el malestar. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa    " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor   " +
                                                  "\n seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar" +
                                                  "\n a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                               textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumon�a." +
                                                  "\n Es recomendable que el ni�o, con una estatura de 1.45-1.70 m, realice actividad f�sica moderada seg�n su capacidad y estado de recuperaci�n, siempre supervisada" +
                                                  "\n y evitando esfuerzos excesivos o juegos que agiten demasiado sus v�as respiratorias, especialmente si a�n presenta s�ntomas. Una vez que su condici�n mejore,   " +
                                                  "\n puede retomar gradualmente actividades como caminatas al aire libre o juegos tranquilos, buscando cerca de 60 minutos de actividad f�sica moderada a intensa diaria." +
                                                  "\n Tambi�n es crucial el consumo diario de 2.5 a 3 Litros de agua al d�a (diez a doce vasos de tama�o regular), especialmente si tiene fiebre, para ayudar a fluidificar" +
                                                  "\n las secreciones pulmonares y prevenir la deshidrataci�n, facilitando su expectoraci�n. POSIBLE TRATAMIENTO: Para la neumon�a en ni�os de esta edad, el tratamiento  " +
                                                  "\n suele incluir; antibi�ticos (si la causa es bacteriana, como la amoxicilina, una marca com�n es Amoxil o Clamoxil, o la azitromicina, una marca com�n es Zithromax, " +
                                                  "\n siempre bajo prescripci�n m�dica estricta), medicamentos para reducir la fiebre y aliviar el dolor (como el paracetamol, una marca com�n es Tempra o Tylenol, o el  " +
                                                  "\n ibuprofeno, una marca com�n es Advil o Motrin), y en algunos casos, oxigenoterapia si la saturaci�n de ox�geno es baja. Es fundamental seguir las indicaciones del  " +
                                                  "\n m�dico al pie de la letra y completar el ciclo de antibi�ticos aunque el ni�o parezca mejor. Tambi�n es recomendable que el ni�o consuma alimentos que fortalezcan su" +
                                                  "\n sistema inmune y le aporten energ�a, tales como caldos nutritivos y sopas suaves que, adem�s de ser f�ciles de digerir, contribuyen a la hidrataci�n y al aporte de " +
                                                  "\n electrolitos. Las verduras de hoja verde oscuro como la espinaca, rica en Vitamina A y Vitamina K, o el br�coli, que aporta Vitamina C (alrededor de 89.2 mg por cada" +
                                                  "\n 100 gramos, lo que representa cerca del 99% de la ingesta diaria recomendada para un ni�o de 4-8 a�os), son excelentes fuentes de antioxidantes que apoyan la salud " +
                                                  "\n pulmonar. Las frutas como las naranjas, que contienen alrededor de 53.2 mg de Vitamina C por cada 100 gramos (cerca del 59% de la ingesta diaria recomendada para la" +
                                                  "\n misma edad), y los kiwis, que ofrecen aproximadamente 92.7 mg de Vitamina C por cada 100 gramos (alrededor del 103% de la ingesta diaria recomendada para la misma edad)," +
                                                  "\n son cruciales para reforzar el sistema inmunol�gico. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente     " +
                                                  "\n tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer  " +
                                                  "\n mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar" +
                                                  "\n a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores."); 
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visi�n borrosa, P�rdida de peso.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n Es recomendable que el ni�o, con una estatura de 1.45-1.70 m, realice cerca de 60 minutos de actividad f�sica moderada a intensa diaria, como juegos activos," +
                                                  "\n deportes o paseos en bicicleta, adapt�ndose siempre a su estado de salud y bajo supervisi�n. Esta actividad es crucial para el control del az�car en sangre, " +
                                                  "\n mejorar la sensibilidad a la insulina y mantener un peso saludable, fundamentales en el manejo de la diabetes. Tambi�n es fundamental el consumo diario de 2.5" +
                                                  "\n a 3 Litros de agua al d�a (diez a doce vasos de tama�o regular), priorizando el agua natural sobre bebidas azucaradas, para mantener una hidrataci�n adecuada" +
                                                  "\n y ayudar a los ri�ones a procesar el exceso de glucosa. POSIBLE TRATAMIENTO: Para la diabetes en ni�os de esta edad, el tratamiento suele incluir; manejo de " +
                                                  "\n la insulina (en caso de diabetes tipo 1, se requiere insulina inyectada para controlar los niveles de glucosa, por ejemplo, insulina glargina, una marca com�n" +
                                                  "\n es Lantus, o insulina aspart, una marca com�n es Novolog), medicamentos orales (para diabetes tipo 2, como la metformina, una marca com�n es Glucophage o   " +
                                                  "\n Dianben, siempre bajo prescripci�n m�dica), y un monitoreo constante de los niveles de glucosa en sangre con un gluc�metro. Es vital seguir un plan de      " +
                                                  "\n alimentaci�n saludable y equilibrado, as� como un control m�dico regular con un endocrin�logo pedi�trico. Tambi�n es recomendable que el ni�o consuma alimentos" +
                                                  "\n que ayuden a la regulaci�n del az�car y fortalezcan su sistema inmune, tales como verduras no almidonadas como el br�coli, rico en fibra y Vitamina C       " +
                                                  "\n (aproximadamente 89.2 mg por cada 100 gramos, lo que representa cerca del 99% de la ingesta diaria recomendada para un ni�o de 4-8 a�os), o la espinaca, que" +
                                                  "\n aporta Magnesio y Vitamina K, nutrientes importantes para el metabolismo de la glucosa. Frutas con moderaci�n como las manzanas y las peras, que son ricas en" +
                                                  "\n fibra (aproximadamente 2.4 gramos de fibra por cada 100 gramos en una manzana con c�scara) y antioxidantes, contribuyen a una liberaci�n m�s lenta de az�cares" +
                                                  "\n en la sangre. Las bayas (fresas, ar�ndanos) son tambi�n excelentes por su bajo �ndice gluc�mico y alto contenido de antioxidantes. Las prote�nas magras como el" +
                                                  "\n pollo, el pescado y las legumbres (lentejas, frijoles) son importantes para mantener la saciedad y el control gluc�mico. Los granos integrales como la avena y el" +
                                                  "\n pan integral proporcionan fibra y energ�a sostenida, ayudando a evitar picos de az�car en sangre. Este es solo un Diagn�stico predeterminado l�gico, haberlo    " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer" +
                                                  "\n m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagnostico " +
                                                  "\n no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresi�n en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n Es recomendable que el ni�o, con una estatura de 1.45-1.70 m, realice actividad f�sica de forma controlada y supervisada, con calentamiento previo y enfriamiento" +
                                                  "\n posterior, evitando desencadenantes conocidos del asma (como al�rgenos, aire fr�o o contaminado, o actividad f�sica muy intensa sin preparaci�n) y haciendo pausas" +
                                                  "\n si presenta s�ntomas. La cantidad de ejercicio debe ser adaptada a su capacidad y a la presencia de s�ntomas, pudiendo ser periodos de 30 a 60 minutos de actividad" +
                                                  "\n moderada en los d�as que se encuentre bien, pero siempre consultando al m�dico para un plan seguro y ajustado. Tambi�n es crucial el consumo diario de 2 a 2.5 Litros" +
                                                  "\n de agua al d�a (ocho a diez vasos de tama�o regular) para ayudar a mantener las v�as respiratorias hidratadas y las secreciones m�s fluidas, lo que facilita la     " +
                                                  "\n respiraci�n y puede prevenir el estrechamiento de los bronquios. POSIBLE TRATAMIENTO: Para el asma en ni�os de esta edad, el tratamiento suele incluir; broncodilatadores" +
                                                  "\n de alivio r�pido (para abrir las v�as respiratorias durante un ataque, como el salbutamol, una marca com�n es Ventolin o Aerolin), corticosteroides inhalados       " +
                                                  "\n (para el control a largo plazo y reducir la inflamaci�n cr�nica de las v�as respiratorias, como la fluticasona, una marca com�n es Flixotide, o la budesonida, una marca" +
                                                  "\n com�n es Pulmicort), y en algunos casos, modificadores de leucotrienos (como el montelukast, una marca com�n es Singulair), que ayudan a controlar la inflamaci�n y   " +
                                                  "\n los s�ntomas. Es fundamental seguir estrictamente el plan de acci�n para el asma indicado por el m�dico, usar los medicamentos preventivos regularmente y acudir a    " +
                                                  "\n revisiones peri�dicas. Tambi�n es recomendable que el ni�o consuma alimentos que puedan ayudar a reducir la inflamaci�n y fortalecer el sistema inmune, tales como    " +
                                                  "\n pescados grasos (salm�n, at�n), ricos en �cidos grasos Omega-3, que poseen propiedades antiinflamatorias que pueden ser beneficiosas para las v�as respiratorias.     " +
                                                  "\n Una amplia variedad de frutas y verduras de colores vivos, como los ar�ndanos, con su alto contenido de antioxidantes que protegen las c�lulas; las espinacas, que    " +
                                                  "\n aportan Magnesio, un mineral que puede ayudar a relajar los m�sculos bronquiales, y Vitamina K; y el br�coli, que ofrece una gran cantidad de Vitamina C (alrededor   " +
                                                  "\n de 89.2 mg por cada 100 gramos, lo que representa cerca del 99% de la ingesta diaria recomendada para un ni�o de 4-8 a�os), esencial para la funci�n inmunol�gica.    " +
                                                  "\n Tambi�n se beneficia de manzanas, que contienen quercetina, un flavonoide con propiedades antiinflamatorias que puede ser �til para la salud pulmonar. Este es solo   " +
                                                  "\n un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n" +
                                                  "\n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud" +
                                                  "\n si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida)   " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, P�rdida de peso, Ganglios linf�ticos inflamados, Erupci�n cut�nea (Diarrea).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n Es recomendable que el ni�o, con una estatura de 1.45-1.70 m, realice actividad f�sica moderada y adaptada a su estado de salud, bajo supervisi�n m�dica para evitar el" +
                                                  "\n agotamiento y proteger su sistema inmune, y siempre evitando deportes de contacto o actividades con alto riesgo de lesiones si su sistema inmune est� comprometido.    " +
                                                  "\n La actividad debe ser gradual, buscando idealmente periodos de 30 a 60 minutos de actividad moderada en los d�as que se encuentre bien, adapt�ndose a su energ�a y     " +
                                                  "\n tolerando periodos de descanso. Tambi�n es crucial el consumo diario de 2.5 a 3 Litros de agua al d�a (diez a doce vasos de tama�o regular) para mantener una buena    " +
                                                  "\n hidrataci�n, fundamental para el bienestar general, el funcionamiento del cuerpo y el metabolismo de los medicamentos antirretrovirales. POSIBLE TRATAMIENTO: Para el  " +
                                                  "\n VIH/SIDA en ni�os de esta edad, el tratamiento principal es la terapia antirretroviral (TARV), que incluye una combinaci�n de medicamentos que trabajan para controlar " +
                                                  "\n la replicaci�n del virus, mejorar la funci�n inmunol�gica y prevenir el desarrollo de infecciones oportunistas. Estos medicamentos se eligen y ajustan espec�ficamente " +
                                                  "\n por un m�dico especialista en VIH pedi�trico, y es vital la adherencia estricta al r�gimen. Algunos ejemplos de medicamentos usados en TARV incluyen inhibidores de la " +
                                                  "\n transcriptasa inversa an�logos de nucle�sidos (como Zidovudina, o Retrovir), inhibidores de la transcriptasa inversa no an�logos de nucle�sidos (como Efavirenz,       " +
                                                  "\n o Sustiva), e inhibidores de la proteasa (como Lopinavir/Ritonavir, o Kaletra). El tratamiento tambi�n incluye el manejo y prevenci�n de infecciones oportunistas con  " +
                                                  "\n antibi�ticos profil�cticos (como el trimetoprim/sulfametoxazol, o Bactrim) para proteger contra ciertas infecciones. Es fundamental el seguimiento m�dico constante.   " +
                                                  "\n Tambi�n es recomendable que el ni�o consuma alimentos que refuercen el sistema inmune, proporcionen energ�a y ayuden a mantener un peso saludable, tales como prote�nas" +
                                                  "\n de alto valor biol�gico (pollo, pescado, huevos, legumbres) que son cruciales para la reparaci�n de tejidos y la funci�n inmune; l�cteos y alternativas enriquecidas con" +
                                                  "\n calcio y vitamina D para la salud �sea, la cual puede verse afectada por el virus o algunos tratamientos. Una amplia variedad de frutas y verduras de colores vivos, como" +
                                                  "\n los ar�ndanos, ricos en antioxidantes que protegen las c�lulas; las naranjas, que aportan una cantidad significativa de Vitamina C (alrededor de 53.2 mg por cada      " +
                                                  "\n 100 gramos, lo que representa cerca del 59% de la ingesta diaria recomendada para un ni�o de 4-8 a�os), esencial para el sistema inmunitario; y las espinacas, que     " +
                                                  "\n contienen hierro y Vitamina A, importantes para la producci�n de c�lulas sangu�neas y la funci�n inmune, son igualmente beneficiosas. Adem�s, los granos integrales como" +
                                                  "\n la avena y el arroz integral, que proveen fibra y energ�a sostenida, son importantes para una nutrici�n adecuada. Este es solo un Diagn�stico predeterminado l�gico,   " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer" +
                                                  "\n m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagnostico no le   " +
                                                  "\n satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreci�n anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n Es recomendable que el ni�o, con una estatura de 1.45-1.70 m, realice actividad f�sica moderada y adaptada a su estado de salud, sin forzar su cuerpo. Dado que la gonorrea" +
                                                  "\n no suele afectar directamente la capacidad f�sica a largo plazo (una vez tratada), en cuanto se sienta mejor y el m�dico lo autorice, puede buscar idealmente periodos de  " +
                                                  "\n 30 a 60 minutos de actividad moderada a intensa diaria. Durante la infecci�n y el tratamiento, la actividad puede ser m�s ligera, como paseos cortos. Tambi�n es crucial   " +
                                                  "\n el consumo diario de 2.5 a 3 Litros de agua al d�a (diez a doce vasos de tama�o regular) para mantener una buena hidrataci�n, fundamental para apoyar el proceso de        " +
                                                  "\n recuperaci�n del cuerpo y el funcionamiento adecuado de los ri�ones, que procesar�n los medicamentos. POSIBLE TRATAMIENTO: Para la gonorrea en ni�os de esta edad, el      " +
                                                  "\n tratamiento es estrictamente con antibi�ticos, siempre bajo la supervisi�n y prescripci�n de un m�dico. La elecci�n y dosis del antibi�tico depender�n de la edad, peso y  " +
                                                  "\n la cepa espec�fica de la bacteria. Es vital que se complete el ciclo de antibi�ticos tal como lo indique el profesional de la salud para asegurar la erradicaci�n total de " +
                                                  "\n la infecci�n y prevenir complicaciones. Ejemplos de antibi�ticos utilizados incluyen ceftriaxona (una marca com�n es Rocephin) administrada por inyecci�n, o azitromicina  " +
                                                  "\n (una marca com�n es Zithromax) administrada oralmente. Es importante recordar que la gonorrea en ni�os requiere una evaluaci�n m�dica inmediata, ya que puede tener        " +
                                                  "\n implicaciones serias y, en algunos casos, puede ser indicativa de abuso. Tambi�n es recomendable que el ni�o consuma alimentos que fortalezcan su sistema inmune y         " +
                                                  "\n contribuyan a su recuperaci�n general, como una amplia variedad de frutas y verduras frescas; por ejemplo, el mango, que aporta Vitamina C (aproximadamente 36.4 mg por cada" +
                                                  "\n 100 gramos, lo que representa cerca del 40% de la ingesta diaria recomendada para un ni�o de 4-8 a�os) y Vitamina A, esenciales para la funci�n inmunol�gica; o las espinacas," +
                                                  "\n que proveen Vitamina K, Vitamina A y antioxidantes, que apoyan la salud general. Las prote�nas magras como el pollo, el pescado y las legumbres son esenciales para la     " +
                                                  "\n reparaci�n de tejidos y el mantenimiento de la energ�a, y los granos integrales como la avena y el arroz integral, proveen fibra y energ�a sostenida para una buena digesti�n" +
                                                  "\n y vitalidad. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y" +
                                                  "\n sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, " +
                                                  "\n adem�s por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app     " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linf�ticos inflamados, �lceras o llagas dolorosas, Picaz�n o ardor, Dolor al orinar.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n Es recomendable que el ni�o, con una estatura de 1.45-1.70 m, realice actividad f�sica moderada y adaptada a su estado de salud, especialmente evitando actividades que puedan" +
                                                  "\n irritar las lesiones si estas est�n presentes, como el roce excesivo o la sudoraci�n intensa en el �rea afectada. Una vez que las lesiones remitan, puede retomar gradualmente" +
                                                  "\n la actividad f�sica normal para su edad, buscando idealmente periodos de 30 a 60 minutos de actividad moderada a intensa diaria, siempre bajo supervisi�n. Tambi�n es crucial el" +
                                                  "\n consumo diario de 2.5 a 3 Litros de agua al d�a (diez a doce vasos de tama�o regular) para mantener una buena hidrataci�n, lo cual es fundamental para el bienestar general, el" +
                                                  "\n funcionamiento �ptimo del sistema inmune y la eliminaci�n de toxinas. POSIBLE TRATAMIENTO: Para el herpes genital en ni�os de esta edad, el tratamiento principal consiste en  " +
                                                  "\n medicamentos antivirales que ayudan a controlar el brote, reducir la intensidad y duraci�n de los s�ntomas, y prevenir futuras recurrencias, aunque no eliminan el virus del cuerpo." +
                                                  "\n Es fundamental que estos medicamentos sean prescritos y supervisados por un m�dico, quien determinar� la dosis adecuada seg�n la edad y el peso del ni�o. Algunos ejemplos de   " +
                                                  "\n medicamentos antivirales utilizados incluyen Aciclovir (una marca com�n es Zovirax), Valaciclovir (una marca com�n es Valtrex), y Famciclovir (una marca com�n es Famvir). Adem�s" +
                                                  "\n del tratamiento antiviral, es importante mantener una higiene adecuada de las lesiones y evitar tocarlas para prevenir la propagaci�n. Tambi�n es recomendable que el ni�o consuma" +
                                                  "\n alimentos que fortalezcan su sistema inmune y ayuden a la cicatrizaci�n, tales como alimentos ricos en lisina y bajos en arginina, ya que la lisina puede inhibir la replicaci�n  " +
                                                  "\n del virus del herpes, presentes en l�cteos, pescado y pollo, que aportan prote�nas esenciales y Vitamina D (importante para la funci�n inmune). Una variedad de frutas y verduras," +
                                                  "\n como la papaya, que contiene una cantidad significativa de Vitamina C (aproximadamente 60.9 mg por cada 100 gramos, lo que representa cerca del 68% de la ingesta diaria recomendada" +
                                                  "\n para un ni�o de 4-8 a�os) y Vitamina A, y el mango, que tambi�n es rico en Vitamina C (aproximadamente 36.4 mg por cada 100 gramos, que representa cerca del 40% de la ingesta diaria" +
                                                  "\n recomendada para la misma edad), son excelentes fuentes de antioxidantes que apoyan la reparaci�n celular y el fortalecimiento de las defensas del cuerpo. Este es solo un Diagn�stico" +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se  " +
                                                  "\n recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagnostico " +
                                                  "\n no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, �lceras indoloras, Erupci�n cut�nea, Dolor de cabeza, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer S�filis." +
                                                  "\n Es recomendable que el ni�o, con una estatura de 1.45-1.70 m, realice actividad f�sica moderada y adaptada a su estado de salud, especialmente si la s�filis ha afectado alguna " +
                                                  "\n articulaci�n o hueso, o si presenta fatiga. Durante el tratamiento y la recuperaci�n, la actividad debe ser supervisada, buscando idealmente periodos de 30 a 60 minutos de actividad" +
                                                  "\n moderada en los d�as que se encuentre bien, pero siempre con precauci�n y escuchando las se�ales del cuerpo. Tambi�n es crucial el consumo diario de 2.5 a 3 Litros de agua al d�a  " +
                                                  "\n (diez a doce vasos de tama�o regular) para mantener una buena hidrataci�n, fundamental para el funcionamiento �ptimo del cuerpo y el proceso de eliminaci�n de toxinas durante el   " +
                                                  "\n tratamiento. POSIBLE TRATAMIENTO: Para la s�filis en ni�os de esta edad, el tratamiento principal y m�s efectivo es con antibi�ticos, siendo la penicilina el medicamento de elecci�n." +
                                                  "\n La dosis y la duraci�n del tratamiento ser�n determinadas estrictamente por un m�dico, y es fundamental completar el ciclo completo para asegurar la erradicaci�n de la infecci�n y  " +
                                                  "\n prevenir complicaciones a largo plazo. En casos de alergia a la penicilina, el m�dico puede considerar otras opciones como la ceftriaxona (una marca com�n es Rocephin). Es vital un " +
                                                  "\n seguimiento m�dico cercano despu�s del tratamiento para confirmar la curaci�n. Tambi�n es recomendable que el ni�o consuma alimentos que fortalezcan su sistema inmune y apoyen la   " +
                                                  "\n recuperaci�n general, como prote�nas magras (pollo, pescado, legumbres) que son cruciales para la reparaci�n de tejidos y la producci�n de c�lulas inmunes; as� como una amplia variedad" +
                                                  "\n de frutas y verduras frescas. Por ejemplo, el br�coli, que aporta una gran cantidad de Vitamina C (alrededor de 89.2 mg por cada 100 gramos, lo que representa cerca del 99% de la   " +
                                                  "\n ingesta diaria recomendada para un ni�o de 4-8 a�os) y Vitamina K, importantes para la inmunidad y la coagulaci�n. La espinaca, rica en folato (una vitamina B esencial para la divisi�n" +
                                                  "\n celular y la formaci�n de gl�bulos rojos, lo cual es importante si hay anemia asociada a la s�filis), y Vitamina A, tambi�n contribuye a la salud general. Las naranjas, con su alto  " +
                                                  "\n contenido de Vitamina C (aproximadamente 53.2 mg por cada 100 gramos, que representa cerca del 59% de la ingesta diaria recomendada para la misma edad), son excelentes para reforzar " +
                                                  "\n las defensas, y los ar�ndanos son ricos en antioxidantes que protegen las c�lulas del da�o. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100%" +
                                                  "\n que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor" +
                                                  "\n seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su m�dico," +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, P�rdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n Es recomendable que el ni�o, con una estatura de 1.45-1.70 m, realice actividad f�sica moderada y adaptada a su estado de salud y nivel de energ�a, especialmente durante la fase activa" +
                                                  "\n de la enfermedad y el tratamiento, cuando puede experimentar fatiga y dificultad respiratoria. Se deben evitar actividades extenuantes y priorizar el reposo adecuado. A medida que su  " +
                                                  "\n condici�n mejore, puede retomar gradualmente juegos ligeros, caminatas cortas o ejercicios de estiramiento, siempre bajo supervisi�n m�dica, buscando alcanzar periodos de 30 a 60 minutos" +
                                                  "\n de actividad moderada en los d�as que se encuentre bien, adapt�ndose a su tolerancia. Tambi�n es crucial el consumo diario de 2.5 a 3 Litros de agua al d�a (diez a doce vasos de tama�o" +
                                                  "\n regular) para mantener una excelente hidrataci�n, lo cual es vital para el funcionamiento general del cuerpo, la eliminaci�n de desechos y el apoyo a los �rganos que metabolizan los   " +
                                                  "\n medicamentos antituberculosos. POSIBLE TRATAMIENTO: Para la tuberculosis en ni�os de esta edad, el tratamiento es un r�gimen prolongado de antibi�ticos antituberculosos, que se administra" +
                                                  "\n bajo estricta supervisi�n m�dica. Es absolutamente esencial que el ni�o complete el curso completo del tratamiento, que puede durar varios meses, para erradicar la bacteria y prevenir la " +
                                                  "\n aparici�n de cepas resistentes. Los medicamentos comunes incluyen Isoniazida (una marca com�n es Laniazid), Rifampicina (una marca com�n es Rifadin), Pirazinamida y Etambutol.          " +
                                                  "\n La combinaci�n y dosis exactas ser�n determinadas por el m�dico. Es fundamental un seguimiento m�dico constante para monitorear la respuesta al tratamiento y los posibles efectos secundarios." +
                                                  "\n Tambi�n es recomendable que el ni�o consuma alimentos que fortalezcan su sistema inmune y le proporcionen la energ�a y nutrientes necesarios para combatir la infecci�n y apoyar el tratamiento," +
                                                  "\n como prote�nas de alto valor biol�gico (huevo, pollo, pescado, legumbres) que son cruciales para la reparaci�n de tejidos y la producci�n de c�lulas inmunes. Las verduras de hoja verde oscuro" +
                                                  "\n como la espinaca, que aporta Magnesio, hierro y folato (importante para la formaci�n de gl�bulos rojos, que pueden verse afectados por la TB o sus tratamientos); y las zanahorias, una     " +
                                                  "\n excelente fuente de Vitamina A (alrededor de 835 �g por cada 100 gramos, lo que representa cerca del 167% de la ingesta diaria recomendada para un ni�o de 4-8 a�os), esencial para la      " +
                                                  "\n salud de las mucosas respiratorias y la funci�n inmune, son altamente beneficiosas. Las frutas como el mango, que aporta Vitamina C (aproximadamente 36.4 mg por cada 100 gramos, lo que    " +
                                                  "\n representa cerca del 40% de la ingesta diaria recomendada para un ni�o de 4-8 a�os) y Vitamina A, as� como las naranjas, ricas en Vitamina C (aproximadamente 53.2 mg por cada 100 gramos,  " +
                                                  "\n que representa cerca del 59% de la ingesta diaria recomendada para la misma edad), son cruciales para reforzar el sistema inmunol�gico y actuar como antioxidantes. Este es solo un Diagn�stico" +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer" +
                                                  "\n m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagnostico no le satisface del todo      " +
                                                  "\n se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchaz�n en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n Es recomendable que el ni�o, con una estatura de 1.45-1.70 m, realice actividad f�sica suave y de bajo impacto adaptada a su nivel de dolor y la condici�n de sus articulaciones, buscando " +
                                                  "\n mantener la flexibilidad y fortalecer los m�sculos sin sobrecargar las zonas inflamadas. Actividades como la nataci�n, el ciclismo (con un sill�n adecuado y baja resistencia) o ejercicios" +
                                                  "\n de estiramiento suaves pueden ser muy beneficiosas, siempre bajo supervisi�n y previa consulta con el m�dico o fisioterapeuta. La cantidad de ejercicio debe ser progresiva y ajustada a sus" +
                                                  "\n d�as buenos y malos, pero se debe fomentar el movimiento regular para evitar la rigidez, idealmente buscando periodos de 30 a 60 minutos de actividad moderada en los d�as que se encuentre bien," +
                                                  "\n permitiendo periodos de descanso seg�n su tolerancia. Tambi�n es crucial el consumo diario de 2.5 a 3 Litros de agua al d�a (diez a doce vasos de tama�o regular) para mantener una buena   " +
                                                  "\n hidrataci�n, lo cual es fundamental para la salud general, el funcionamiento �ptimo de las articulaciones y el metabolismo de los medicamentos. POSIBLE TRATAMIENTO: Para la artritis en ni�os" +
                                                  "\n de esta edad, el tratamiento suele incluir; medicamentos antiinflamatorios no esteroideos (AINEs) para reducir el dolor y la inflamaci�n (como el ibuprofeno, una marca com�n es Advil o Motrin," +
                                                  "\n o el naproxeno, una marca com�n es Aproben), f�rmacos antirreum�ticos modificadores de la enfermedad (FARME) que act�an sobre el sistema inmune para controlar la progresi�n de la enfermedad " +
                                                  "\n (como el metotrexato, una marca com�n es Trexall), y en algunos casos, medicamentos biol�gicos para la artritis juvenil idiop�tica grave. Es fundamental que estos tratamientos sean prescritos" +
                                                  "\n y supervisados por un reumat�logo pedi�tra, quien ajustar� las dosis y monitorear� los efectos. Tambi�n es recomendable que el ni�o consuma alimentos que ayuden a reducir la inflamaci�n y  " +
                                                  "\n fortalezcan su sistema inmune, tales como pescados grasos (salm�n, sardinas), que son ricos en �cidos grasos Omega-3, potentes antiinflamatorios que pueden ser beneficiosos para la salud articular." +
                                                  "\n Una amplia variedad de frutas y verduras de colores vivos, como los ar�ndanos, que aportan antioxidantes que protegen las c�lulas; las espinacas, ricas en Magnesio, un mineral que puede contribuir " +
                                                  "\n a la relajaci�n muscular, y Vitamina K; y el br�coli, que ofrece una gran cantidad de Vitamina C (alrededor de 89.2 mg por cada 100 gramos, lo que representa cerca del 99% de la ingesta diaria   " +
                                                  "\n recomendada para un ni�o de 4-8 a�os), esencial para la funci�n inmunol�gica. Tambi�n se beneficia de las cerezas, que contienen antocianinas, compuestos con potentes propiedades antiinflamatorias" +
                                                  "\n que podr�an ayudar a reducir el dolor y la inflamaci�n en las articulaciones. Adem�s, el aguacate proporciona grasas saludables y Vitamina E, importantes para la energ�a y la salud general. Este es" +
                                                  "\n solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se  " +
                                                  "\n recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagnostico no le satisface del " +
                                                  "\n todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n Es recomendable que el ni�o, con una estatura de 1.45-1.70 m, especialmente durante la fase parox�stica de tos severa, limite la actividad f�sica a movimientos suaves y evite cualquier esfuerzo " +
                                                  "\n que pueda desencadenar ataques de tos. El reposo es crucial para su recuperaci�n y para conservar energ�a. A medida que mejore, puede retomar gradualmente actividades de bajo impacto como caminatas" +
                                                  "\n cortas o juegos tranquilos, siempre bajo supervisi�n, buscando alcanzar periodos de 30 a 60 minutos de actividad moderada en los d�as que se encuentre bien, adapt�ndose a su nivel de tolerancia." +
                                                  "\n Tambi�n es crucial el consumo diario de 2.5 a 3 Litros de agua al d�a (diez a doce vasos de tama�o regular), o incluso m�s si presenta fiebre o dificultad para alimentarse, para mantener una excelente" +
                                                  "\n hidrataci�n y ayudar a fluidificar las secreciones respiratorias, lo cual es vital para su comodidad y recuperaci�n. POSIBLE TRATAMIENTO: Para la tosferina en ni�os de esta edad, el tratamiento  " +
                                                  "\n principal es con antibi�ticos, que son m�s efectivos cuando se administran en las primeras etapas de la enfermedad para acortar la duraci�n de los s�ntomas y reducir la propagaci�n. Los m�s comunes" +
                                                  "\n son los macr�lidos, como la azitromicina (una marca com�n es Zithromax), la eritromicina (una marca com�n es Pneumo-E o Eritrobase) o la claritromicina (una marca com�n es Klacid). Es fundamental que" +
                                                  "\n el ni�o complete el ciclo completo de antibi�ticos tal como lo indique el m�dico, incluso si los s�ntomas mejoran, para erradicar la bacteria. En casos severos o en lactantes, podr�a requerirse   " +
                                                  "\n hospitalizaci�n para el monitoreo y manejo de complicaciones. Tambi�n es recomendable que el ni�o consuma alimentos que fortalezcan su sistema inmune y le proporcionen nutrientes que ayuden a su  " +
                                                  "\n recuperaci�n, especialmente aquellos que son f�ciles de tragar y digestibles debido a los ataques de tos, tales como pur�s de frutas y verduras. Por ejemplo, el pur� de calabaza, que aporta una buena" +
                                                  "\n cantidad de Vitamina A (alrededor de 369 �g por cada 100 gramos, lo que representa cerca del 74% de la ingesta diaria recomendada para un ni�o de 4-8 a�os), esencial para la salud de las mucosas  " +
                                                  "\n respiratorias y la funci�n inmune; o el pur� de zanahoria, tambi�n rica en Vitamina A y antioxidantes. Los pl�tanos son f�ciles de comer y ricos en potasio (aproximadamente 358 mg por cada 100 gramos)," +
                                                  "\n un electrolito importante que puede ayudar a reponer las p�rdidas debido a la tos y al sudor, adem�s de aportar energ�a. Las sopas y caldos suaves contribuyen a la hidrataci�n y aportan nutrientes de " +
                                                  "\n forma l�quida. Tambi�n son valiosas las frutas suaves ricas en Vitamina C como la papaya, que contiene alrededor de 60.9 mg de Vitamina C por cada 100 gramos (aproximadamente el 68% de la ingesta diaria" +
                                                  "\n recomendada para un ni�o de 4-8 a�os), y la guayaba, con niveles a�n m�s altos de esta vitamina, crucial para fortalecer el sistema inmunol�gico. Este es solo un Diagn�stico predeterminado l�gico,    " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de      " +
                                                  "\n Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su m�dico," +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchaz�n de las gl�ndulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n Es recomendable que el ni�o, con una estatura de 1.45-1.70 m, especialmente durante la fase aguda de la enfermedad cuando puede presentar fiebre y malestar, limite la actividad f�sica a un reposo" +
                                                  "\n adecuado, evitando esfuerzos que puedan aumentar el malestar o la hinchaz�n de las gl�ndulas. A medida que su condici�n mejore y la fiebre ceda, puede retomar gradualmente actividades ligeras y  " +
                                                  "\n juegos tranquilos, siempre bajo supervisi�n, buscando alcanzar periodos de 30 a 60 minutos de actividad moderada en los d�as que se encuentre bien. Tambi�n es crucial el consumo diario de 2.5 a  " +
                                                  "\n 3 Litros de agua al d�a (diez a doce vasos de tama�o regular), o m�s si tiene fiebre o dificultad para tragar alimentos s�lidos, para mantener una excelente hidrataci�n, lo cual es vital para su " +
                                                  "\n bienestar general, para ayudar a reducir la fiebre y para mantener las mucosas hidratadas, aliviando la garganta. POSIBLE TRATAMIENTO: Para las paperas en ni�os de esta edad, el tratamiento es   " +
                                                  "\n principalmente de soporte y para aliviar los s�ntomas, ya que es una infecci�n viral y no existen medicamentos espec�ficos para erradicar el virus. Se recomienda el reposo en cama, la aplicaci�n " +
                                                  "\n de compresas fr�as o calientes en las gl�ndulas inflamadas para aliviar el dolor, y el uso de medicamentos para controlar la fiebre y el dolor, como el paracetamol (una marca com�n es Tempra o   " +
                                                  "\n Tylenol) o el ibuprofeno (una marca com�n es Advil o Motrin). Es fundamental evitar el uso de aspirina en ni�os debido al riesgo de s�ndrome de Reye. Tambi�n es recomendable que el ni�o consuma  " +
                                                  "\n alimentos que fortalezcan su sistema inmune y sean f�ciles de masticar y tragar debido a la hinchaz�n de las gl�ndulas salivales, tales como pur�s y alimentos blandos. Puede incluir caldos      " +
                                                  "\n nutritivos y sopas suaves que aportan hidrataci�n y energ�a. En cuanto a las frutas y verduras, la pi�a es una excelente opci�n, ya que contiene bromelina, una enzima con propiedades antiinflamatorias" +
                                                  "\n que puede ayudar a reducir la hinchaz�n y el dolor, adem�s de Vitamina C (aproximadamente 47.8 mg por cada 100 gramos, lo que representa cerca del 53% de la ingesta diaria recomendada para un ni�o" +
                                                  "\n de 4-8 a�os), esencial para el sistema inmunol�gico. El mel�n, f�cil de digerir, es rico en Vitamina C (aproximadamente 36.7 mg por cada 100 gramos, que representa cerca del 41% de la ingesta diaria" +
                                                  "\n recomendada para la misma edad) y Vitamina A, y tambi�n aporta una alta cantidad de agua, contribuyendo a la hidrataci�n. El pl�tano, f�cil de digerir y rico en potasio (aproximadamente 358 mg por " +
                                                  "\n cada 100 gramos), un electrolito importante que ayuda a reponer las p�rdidas y aporta energ�a. Finalmente, el aguacate proporciona grasas saludables y diversas vitaminas (como la E y K) que apoyan " +
                                                  "\n la funci�n inmunol�gica y la salud general. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad" +
                                                  "\n y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la " +
                                                  "\n respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupci�n cut�nea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n Es recomendable que el ni�o, con una estatura de 1.45-1.70 m, durante la fase aguda de la enfermedad cuando puede presentar fiebre, dolor muscular y articular, mantenga un reposo adecuado y evite" +
                                                  "\n la actividad f�sica extenuante. A medida que sus s�ntomas mejoren y bajo supervisi�n, puede retomar gradualmente actividades ligeras y juegos tranquilos, buscando alcanzar periodos de 30 a 60    " +
                                                  "\n minutos de actividad moderada en los d�as que se encuentre bien, priorizando entornos donde se pueda minimizar la exposici�n a mosquitos. Tambi�n es crucial el consumo diario de 2.5 a 3 Litros   " +
                                                  "\n de agua al d�a (diez a doce vasos de tama�o regular), o m�s si tiene fiebre o v�mitos, para mantener una excelente hidrataci�n y prevenir la deshidrataci�n, lo cual es vital para el bienestar    " +
                                                  "\n general y el funcionamiento �ptimo de todos sus sistemas corporales durante la recuperaci�n. POSIBLE TRATAMIENTO: Para el Zika en ni�os de esta edad, el tratamiento es principalmente de soporte, " +
                                                  "\n ya que no existe un medicamento antiviral espec�fico para curar la infecci�n. El manejo se enfoca en aliviar los s�ntomas, lo que incluye el reposo, una buena hidrataci�n y el uso de medicamentos" +
                                                  "\n para controlar la fiebre y el dolor, como el paracetamol (una marca com�n es Tempra o Tylenol). Es fundamental evitar el uso de aspirina y otros AINEs (antiinflamatorios no esteroideos como el   " +
                                                  "\n ibuprofeno) hasta que se descarte la posibilidad de dengue, debido al riesgo de complicaciones hemorr�gicas. Tambi�n es crucial proteger al ni�o de nuevas picaduras de mosquitos durante la       " +
                                                  "\n enfermedad para evitar la transmisi�n del virus a otras personas. Adem�s, es recomendable que el ni�o consuma alimentos que fortalezcan su sistema inmune y le proporcionen energ�a, tales como    " +
                                                  "\n caldos nutritivos y sopas suaves que facilitan la hidrataci�n y son f�ciles de digerir. Las frutas tropicales como la papaya, que aporta una cantidad significativa de Vitamina C (aproximadamente " +
                                                  "\n 60.9 mg por cada 100 gramos, lo que representa cerca del 68% de la ingesta diaria recomendada para un ni�o de 4-8 a�os) y Vitamina A, y el mango, que tambi�n es rico en Vitamina C (aproximadamente" +
                                                  "\n 36.4 mg por cada 100 gramos, que representa cerca del 40% de la ingesta diaria recomendada para la misma edad) y antioxidantes, son excelentes para reforzar las defensas. El pl�tano, f�cil de    " +
                                                  "\n digerir, es rico en potasio (aproximadamente 358 mg por cada 100 gramos), un electrolito importante que ayuda a reponer las p�rdidas por fiebre o sudor. Las verduras de hoja verde oscuro como la " +
                                                  "\n espinaca, que provee Vitamina K, Vitamina A y hierro, contribuyen a la vitalidad y al buen funcionamiento general. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza" +
                                                  "\n al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor   " +
                                                  "\n seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes     " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, V�mitos, Deshidrataci�n, Dolor abdominal.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n Es recomendable que el ni�o, con una estatura de 1.45-1.70 m, mientras presente diarrea y v�mitos, limite la actividad f�sica a un reposo absoluto o muy suave, evitando cualquier esfuerzo que" +
                                                  "\n pueda empeorar la deshidrataci�n o el malestar gastrointestinal. La prioridad es conservar energ�a para la recuperaci�n. A medida que los s�ntomas disminuyan y la hidrataci�n mejore, puede retomar" +
                                                  "\n gradualmente juegos tranquilos y actividades de bajo impacto, siempre bajo supervisi�n, buscando alcanzar periodos de 30 a 60 minutos de actividad moderada en los d�as que se encuentre bien.  " +
                                                  "\n Tambi�n es crucial el consumo diario de 2.5 a 3 Litros de agua al d�a (diez a doce vasos de tama�o regular) en peque�as tomas frecuentes, preferiblemente mediante soluciones de rehidrataci�n oral" +
                                                  "\n (como Electrolit pedi�trico o Pedialyte), para reponer los l�quidos y electrolitos perdidos por la diarrea y el v�mito, lo cual es vital para prevenir la deshidrataci�n severa.                " +
                                                  "\n POSIBLE TRATAMIENTO: Para el rotavirus en ni�os de esta edad, el tratamiento es principalmente de soporte y se enfoca en la rehidrataci�n, ya que no existe un medicamento antiviral espec�fico para" +
                                                  "\n el virus. La clave es prevenir y tratar la deshidrataci�n mediante la administraci�n de l�quidos y electrolitos. En casa, se pueden usar soluciones de rehidrataci�n oral (SRO), y en casos de  " +
                                                  "\n deshidrataci�n severa, puede ser necesaria la hospitalizaci�n para la administraci�n de l�quidos por v�a intravenosa. Los medicamentos para detener la diarrea no suelen ser recomendados en ni�os con" +
                                                  "\n rotavirus. En cuanto a medicamentos para el malestar, el paracetamol (una marca com�n es Tempra o Tylenol) puede usarse para controlar la fiebre y aliviar las molestias, siempre bajo indicaci�n m�dica." +
                                                  "\n Es fundamental la supervisi�n m�dica. Adem�s, es importante que el ni�o consuma alimentos que sean f�ciles de digerir y ayuden a la recuperaci�n de la flora intestinal, as� como nutrientes que apoyen" +
                                                  "\n la funci�n inmune, tales como arroz blanco o avena cocida, que aportan energ�a y son suaves para el est�mago; caldos de pollo o vegetales desgrasados que contribuyen a la hidrataci�n y a la reposici�n" +
                                                  "\n de electrolitos. El pl�tano, muy beneficioso por su contenido de potasio (aproximadamente 358 mg por cada 100 gramos), un electrolito clave que se pierde con la diarrea y el v�mito, ayudando a    " +
                                                  "\n normalizar los niveles y aportar energ�a de f�cil absorci�n. Tambi�n se recomienda el pur� de manzana (sin c�scara), que contiene pectina, una fibra soluble que puede ayudar a solidificar las heces" +
                                                  "\n y es suave para el sistema digestivo del ni�o. Otra verdura valiosa es la papa cocida y en pur�, la cual es una buena fuente de potasio y carbohidratos complejos, que son de f�cil digesti�n y aportan" +
                                                  "\n energ�a sin irritar el intestino, favoreciendo la recuperaci�n. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por" +
                                                  "\n ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por" +
                                                  "\n su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, N�useas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n Es recomendable que el ni�o, con una estatura de 1.45-1.70 m, durante la fase aguda de la enfermedad cuando puede presentar fiebre, diarrea o s�ntomas neurol�gicos, mantenga un reposo adecuado" +
                                                  "\n y evite cualquier actividad f�sica extenuante. El objetivo es preservar la energ�a y permitir que su cuerpo se recupere. A medida que los s�ntomas disminuyan y bajo supervisi�n m�dica, puede " +
                                                  "\n retomar gradualmente actividades tranquilas y de bajo impacto, buscando alcanzar periodos de 30 a 60 minutos de actividad moderada en los d�as que se encuentre bien. Tambi�n es crucial el    " +
                                                  "\n consumo diario de 2.5 a 3 Litros de agua al d�a (diez a doce vasos de tama�o regular), especialmente si presenta fiebre o diarrea, para mantener una excelente hidrataci�n y reponer los l�quidos" +
                                                  "\n perdidos, lo cual es vital para el bienestar general y el funcionamiento �ptimo de sus sistemas corporales mientras combate la infecci�n. POSIBLE TRATAMIENTO: Para la listeriosis en ni�os de   " +
                                                  "\n esta edad, el tratamiento principal consiste en la administraci�n de antibi�ticos, siendo la ampicilina (una marca com�n es Omnipen o Polycillin) o la penicilina (una marca com�n es Penprocilina" +
                                                  "\n o Bencilpenicilina S�dica) los m�s com�nmente utilizados, a menudo en combinaci�n con otros antibi�ticos como la gentamicina. La elecci�n, dosis y duraci�n del tratamiento deben ser estrictamente" +
                                                  "\n determinadas por un m�dico, y es fundamental completar el ciclo completo de antibi�ticos para erradicar la bacteria y prevenir complicaciones serias, como la meningitis. En casos graves, puede  " +
                                                  "\n requerirse hospitalizaci�n para la administraci�n intravenosa de medicamentos y monitoreo. Adem�s, es recomendable que el ni�o consuma alimentos que refuercen su sistema inmune y apoyen su      " +
                                                  "\n recuperaci�n general, priorizando aquellos que son f�ciles de digerir si presenta s�ntomas gastrointestinales. Estos incluyen prote�nas magras como el pollo cocido o el pescado (si su digesti�n " +
                                                  "\n lo permite), que aportan amino�cidos esenciales para la reparaci�n de tejidos y la producci�n de c�lulas inmunes; caldos y sopas nutritivas que contribuyen a la hidrataci�n y al aporte de       " +
                                                  "\n electrolitos. Tambi�n son beneficiosas frutas ricas en Vitamina C como la papaya, que contiene aproximadamente 60.9 mg por cada 100 gramos (cerca del 68% de la ingesta diaria recomendada para un" +
                                                  "\n ni�o de 4-8 a�os), y las naranjas, que aportan alrededor de 53.2 mg de Vitamina C por cada 100 gramos (cerca del 59% de la ingesta diaria recomendada para la misma edad), ambas potentes         " +
                                                  "\n antioxidantes que fortalecen las defensas del cuerpo. Las verduras cocidas en pur�, como la calabaza, que aporta una buena cantidad de Vitamina A (alrededor de 369 �g por cada 100 gramos,       " +
                                                  "\n lo que representa cerca del 74% de la ingesta diaria recomendada para un ni�o de 4-8 a�os), es crucial para la integridad de las mucosas y la funci�n inmunitaria, y la espinaca, que provee      " +
                                                  "\n hierro y folato, importantes para la formaci�n de gl�bulos rojos. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad " +
                                                  "\n y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su    " +
                                                  "\n paciente, adem�s por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida)         " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, V�mitos.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n Es recomendable que el ni�o, con una estatura de 1.45-1.70 m, durante la fase aguda de la enfermedad cuando presenta diarrea severa, dolor abdominal y fiebre, mantenga un reposo estricto," +
                                                  "\n evitando cualquier actividad f�sica que pueda agravar la deshidrataci�n o el malestar gastrointestinal. La prioridad es conservar energ�a. A medida que los s�ntomas disminuyan y la       " +
                                                  "\n rehidrataci�n sea efectiva, puede retomar gradualmente juegos tranquilos y actividades de bajo impacto, siempre bajo supervisi�n, buscando alcanzar periodos de 30 a 60 minutos de actividad" +
                                                  "\n moderada en los d�as que se encuentre bien. Tambi�n es crucial el consumo diario de 2.5 a 3 Litros de agua al d�a (diez a doce vasos de tama�o regular) en peque�as y frecuentes tomas,    " +
                                                  "\n preferiblemente soluciones de rehidrataci�n oral (como Electrolit pedi�trico o Pedialyte), para reponer los l�quidos y electrolitos perdidos por la diarrea y el v�mito, lo cual es vital  " +
                                                  "\n para prevenir la deshidrataci�n severa y apoyar la funci�n renal durante la infecci�n. POSIBLE TRATAMIENTO: Para la shigelosis en ni�os de esta edad, el tratamiento principal es con      " +
                                                  "\n antibi�ticos, ya que la shigelosis es una infecci�n bacteriana que puede ser grave. Los antibi�ticos m�s comunes para esta condici�n incluyen la azitromicina (una marca com�n es Zithromax)," +
                                                  "\n o las cefalosporinas de tercera generaci�n como la ceftriaxona (una marca com�n es Rocephin), dependiendo de la resistencia bacteriana local. Es fundamental que el ni�o complete el ciclo " +
                                                  "\n completo de antibi�ticos tal como lo indique el m�dico, incluso si los s�ntomas mejoran, para erradicar la bacteria y evitar la propagaci�n. Adem�s del tratamiento antibi�tico, el manejo " +
                                                  "\n de la deshidrataci�n mediante soluciones de rehidrataci�n oral es esencial. Los medicamentos para frenar la diarrea generalmente no se recomiendan. Es importante tambi�n que el ni�o consuma" +
                                                  "\n alimentos que sean f�ciles de digerir, suaves para el sistema gastrointestinal y que aporten nutrientes para fortalecer su sistema inmune, como arroz blanco o avena cocida, que son fuente" +
                                                  "\n de energ�a y suaves para el est�mago; caldos de pollo o vegetales desgrasados que contribuyen a la hidrataci�n y a la reposici�n de electrolitos. El pl�tano, muy beneficioso por su       " +
                                                  "\n contenido de potasio (aproximadamente 358 mg por cada 100 gramos), un electrolito clave que se pierde con la diarrea y el v�mito, ayudando a normalizar los niveles y aportar energ�a de f�cil" +
                                                  "\n absorci�n. Tambi�n se recomienda el pur� de manzana (sin c�scara), que contiene pectina, una fibra soluble que puede ayudar a solidificar las heces y es suave para el sistema digestivo   " +
                                                  "\n del ni�o. Otra verdura valiosa es la papa cocida y en pur�, la cual es una buena fuente de potasio y carbohidratos complejos, que son de f�cil digesti�n y aportan energ�a sin irritar el  " +
                                                  "\n intestino, favoreciendo la recuperaci�n de la mucosa intestinal da�ada. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa" +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento " +
                                                  "\n adecuado de su paciente, adem�s por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos cr�nica, Producci�n excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad Pulmonar Obstructiva Cr�nica (EPOC)." +
                                                  "\n Es recomendable que el ni�o, con una estatura de 1.45-1.70 m, realice ejercicios de respiraci�n y actividades f�sicas de bajo impacto adaptadas a su capacidad pulmonar y estado general," +
                                                  "\n bajo supervisi�n m�dica. Se deben evitar ambientes con humo o contaminantes, y priorizar actividades que no causen dificultad respiratoria excesiva. Caminatas cortas y suaves, juegos   " +
                                                  "\n tranquilos o ejercicios de brazos que no agiten demasiado, pueden ser beneficiosos, buscando mantener la movilidad y la fuerza muscular sin agotar al ni�o, con el objetivo de alcanzar  " +
                                                  "\n periodos de 30 a 60 minutos de actividad moderada en los d�as que se encuentre bien, pero siempre con periodos de descanso. Tambi�n es crucial el consumo diario de 2.5 a 3 Litros de agua" +
                                                  "\n al d�a (diez a doce vasos de tama�o regular) para mantener las secreciones pulmonares m�s fluidas y facilitar su expectoraci�n, lo cual es vital para una mejor respiraci�n y para prevenir" +
                                                  "\n infecciones. POSIBLE TRATAMIENTO: Para la EPOC en ni�os (que es rara y a menudo asociada a condiciones cong�nitas, exposiciones ambientales severas tempranas o infecciones recurrentes), " +
                                                  "\n el tratamiento se enfoca en manejar los s�ntomas, prevenir exacerbaciones y mejorar la funci�n pulmonar. Esto incluye el uso de broncodilatadores (como el salbutamol, una marca com�n es " +
                                                  "\n Ventolin o Aerolin, para abrir las v�as respiratorias), corticosteroides inhalados (como la fluticasona, una marca com�n es Flixotide, para reducir la inflamaci�n), y en algunos casos,  " +
                                                  "\n oxigenoterapia si hay bajos niveles de ox�geno. La terapia respiratoria y la fisioterapia pulmonar son fundamentales. Es esencial la eliminaci�n de la exposici�n a irritantes pulmonares," +
                                                  "\n como el humo de tabaco. Adem�s, es recomendable que el ni�o consuma alimentos que fortalezcan su sistema inmune y le proporcionen energ�a de manera sostenible, priorizando aquellos que no" +
                                                  "\n causen distensi�n abdominal que pueda dificultar la respiraci�n. Estos incluyen prote�nas magras como el pollo o el pescado, que aportan amino�cidos esenciales para la reparaci�n de     " +
                                                  "\n tejidos y el mantenimiento de la masa muscular, crucial en pacientes con EPOC; carbohidratos complejos de liberaci�n lenta como la avena o el arroz integral, que proporcionan energ�a sin" +
                                                  "\n picos gluc�micos; y una variedad de verduras de hoja verde oscuro como la acelga, que aporta Vitamina K, Vitamina A y antioxidantes, que pueden ayudar a reducir la inflamaci�n pulmonar, " +
                                                  "\n y el br�coli, que ofrece una gran cantidad de Vitamina C (alrededor de 89.2 mg por cada 100 gramos, lo que representa cerca del 99% de la ingesta diaria recomendada para un ni�o         " +
                                                  "\n de 4-8 a�os), esencial para la funci�n inmunol�gica y como antioxidante. Las frutas como las fresas, que contienen cerca de 58.8 mg de Vitamina C por cada 100 gramos (aproximadamente el " +
                                                  "\n 65% de la ingesta diaria recomendada para la misma edad), y las manzanas, que contienen quercetina, un flavonoide con propiedades antiinflamatorias que pueden ser �tiles para la salud   " +
                                                  "\n pulmonar, tambi�n son beneficiosas. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la     " +
                                                  "\n enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente,    " +
                                                  "\n adem�s por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreci�n anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n Es recomendable que el ni�o, con una estatura de 1.45-1.70 m, mientras recibe tratamiento, mantenga una actividad f�sica normal adaptada a su estado de salud, evitando cualquier " +
                                                  "\n molestia o irritaci�n en el �rea afectada si presenta s�ntomas. La Clamidia no suele afectar directamente la capacidad f�sica a largo plazo. Una vez que el tratamiento sea efectivo" +
                                                  "\n y los s�ntomas hayan desaparecido, puede seguir con la actividad f�sica recomendada para su edad, buscando idealmente periodos de 30 a 60 minutos de actividad moderada a intensa " +
                                                  "\n diaria. Tambi�n es crucial el consumo diario de 2.5 a 3 Litros de agua al d�a (diez a doce vasos de tama�o regular) para mantener una buena hidrataci�n, lo cual es fundamental para" +
                                                  "\n el bienestar general, el funcionamiento �ptimo de sus sistemas corporales y para apoyar la eliminaci�n de los medicamentos del organismo. POSIBLE TRATAMIENTO: Para la clamidia en" +
                                                  "\n ni�os de esta edad, el tratamiento principal es con antibi�ticos, los cuales son muy efectivos para erradicar la infecci�n. La elecci�n y la dosis del antibi�tico ser�n determinadas" +
                                                  "\n estrictamente por un m�dico, quien considerar� la edad y el peso del ni�o. Es fundamental completar el ciclo completo de antibi�ticos tal como se indique, incluso si los s�ntomas" +
                                                  "\n mejoran, para asegurar la eliminaci�n total de la bacteria y prevenir reinfecciones o complicaciones. Los antibi�ticos com�nmente usados incluyen la azitromicina (una marca com�n" +
                                                  "\n es Zithromax) o la eritromicina (una marca com�n es Pneumo-E o Eritrobase). Es importante recordar que la clamidia en ni�os puede requerir una evaluaci�n m�dica inmediata, ya que" + 
                                                  "\n en algunos casos puede ser indicativa de abuso. Adem�s, es recomendable que el ni�o consuma alimentos que fortalezcan su sistema inmune y apoyen la recuperaci�n general, como fuentes" +
                                                  "\n de probi�ticos (si son tolerados, como yogur natural si no hay contraindicaciones), que pueden ayudar a mantener un equilibrio saludable de la flora intestinal, especialmente despu�s" +
                                                  "\n de la administraci�n de antibi�ticos. Las frutas como las fresas, que contienen cerca de 58.8 mg de Vitamina C por cada 100 gramos (aproximadamente el 65% de la ingesta diaria   " +
                                                  "\n recomendada para un ni�o de 4-8 a�os), o las naranjas, que aportan alrededor de 53.2 mg de Vitamina C por cada 100 gramos (cerca del 59% de la ingesta diaria recomendada para la " +
                                                  "\n misma edad), son excelentes fuentes de esta vitamina, crucial para reforzar las defensas del cuerpo. Las verduras de hoja verde oscuro como la espinaca, rica en folato y Vitamina K," +
                                                  "\n y el br�coli, que provee Vitamina A y antioxidantes, tambi�n contribuyen a la vitalidad y al buen funcionamiento general del sistema inmune, favoreciendo la recuperaci�n. Este es  " +
                                                  "\n solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas," +
                                                  "\n para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del   " +
                                                  "\n Diagnostico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, N�useas, Dolor de cabeza severo, Rigidez en el cuello, Confusi�n.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n Es recomendable que el ni�o, con una estatura de 1.45-1.70 m, durante la fase aguda de la enfermedad, mantenga un reposo estricto en cama, ya que la meningitis es una condici�n" +
                                                  "\n grave que requiere m�nima estimulaci�n y m�xima conservaci�n de energ�a para la recuperaci�n cerebral y general del cuerpo. Cualquier actividad f�sica debe ser evitada por     " +
                                                  "\n completo en este periodo. Una vez que la fase aguda haya pasado y bajo estricta supervisi�n m�dica, la rehabilitaci�n o la reintroducci�n gradual de movimientos muy suaves     " +
                                                  "\n solo se realizar� si no hay secuelas. Tambi�n es crucial el consumo diario de 2.5 a 3 Litros de agua al d�a (diez a doce vasos de tama�o regular) en tomas peque�as y frecuentes," +
                                                  "\n preferiblemente por v�a intravenosa si el ni�o no puede beber, para mantener una hidrataci�n �ptima y asegurar el correcto funcionamiento de los �rganos, especialmente los     " +
                                                  "\n ri�ones, que procesar�n los medicamentos, y para ayudar a controlar la fiebre. POSIBLE TRATAMIENTO: Para la meningitis bacteriana en ni�os de esta edad, el tratamiento es una  " +
                                                  "\n emergencia m�dica y consiste en la administraci�n inmediata de antibi�ticos intravenosos de amplio espectro para combatir la infecci�n. La elecci�n del antibi�tico depender�   " +
                                                  "\n de la edad del ni�o, el tipo de bacteria sospechada y los patrones de resistencia locales, y ser� determinada por un m�dico especialista. Es vital que el tratamiento antibi�tico" +
                                                  "\n se inicie lo antes posible y se complete en su totalidad para prevenir complicaciones graves como da�o cerebral, p�rdida de audici�n o incluso la muerte. Algunos antibi�ticos  " +
                                                  "\n comunes incluyen la ceftriaxona (una marca com�n es Rocephin) o la ampicilina (una marca com�n es Omnipen o Polycillin), a veces combinados con vancomicina (una marca com�n es " +
                                                  "\n Vancocin). Adem�s de los antibi�ticos, se pueden usar corticosteroides (como la dexametasona, una marca com�n es Decadron) para reducir la inflamaci�n cerebral y prevenir      " +
                                                  "\n secuelas neurol�gicas, siempre bajo indicaci�n m�dica. Es fundamental el monitoreo constante en un entorno hospitalario. En cuanto a la alimentaci�n, una vez que el ni�o pueda " +
                                                  "\n tolerar la v�a oral, es recomendable que consuma alimentos que sean f�ciles de digerir y nutritivos para apoyar la recuperaci�n del sistema nervioso y el fortalecimiento del   " +
                                                  "\n sistema inmune. Esto incluye caldos y sopas suaves que aportan l�quidos y electrolitos; pur�s de verduras como la calabaza, que aporta una buena cantidad de Vitamina A (alrededor" +
                                                  "\n de 369 �g por cada 100 gramos, lo que representa cerca del 74% de la ingesta diaria recomendada para un ni�o de 4-8 a�os), esencial para la recuperaci�n de las mucosas y       " +
                                                  "\n la visi�n; y frutas blandas como el pl�tano, que aporta potasio (aproximadamente 358 mg por cada 100 gramos), un electrolito vital para la funci�n nerviosa y muscular. Tambi�n " +
                                                  "\n son beneficiosos los alimentos ricos en antioxidantes como el aguacate, que provee grasas saludables y Vitamina E, que pueden proteger las c�lulas neuronales del da�o oxidativo." +
                                                  "\n Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas   " +
                                                  "\n est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud  " +
                                                  "\n si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, P�rdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, P�rdida de apetito.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer C�ncer." +
                                                  "\n Es recomendable que el ni�o, con una estatura de 1.45-1.70 m, cuya actividad f�sica debe ser siempre supervisada y adaptada a su estado de salud, energ�a y fase del tratamiento" +
                                                  "\n oncol�gico, mantenga periodos de descanso adecuados y evite cualquier actividad extenuante o que pueda comprometer su sistema inmune. Se deben priorizar actividades de bajo    " +
                                                  "\n impacto que fomenten la movilidad y el bienestar, como caminatas cortas y suaves, juegos tranquilos o ejercicios de estiramiento muy ligeros, siempre que el m�dico lo autorice " +
                                                  "\n y seg�n su tolerancia. El objetivo es mantener la fuerza muscular y mejorar la calidad de vida sin sobrecargar su cuerpo, buscando alcanzar periodos de 30 a 60 minutos de    " +
                                                  "\n actividad moderada en los d�as que se encuentre bien, pero con flexibilidad y respetando sus l�mites. Tambi�n es crucial el consumo diario de 2.5 a 3 Litros de agua al d�a   " +
                                                  "\n (diez a doce vasos de tama�o regular), o m�s si tiene fiebre, v�mitos o diarrea como efectos secundarios del tratamiento, para mantener una excelente hidrataci�n, lo cual es " +
                                                  "\n vital para el funcionamiento �ptimo de sus �rganos, la eliminaci�n de toxinas y el apoyo al metabolismo de los medicamentos. POSIBLE TRATAMIENTO: Para el c�ncer en ni�os de  " +
                                                  "\n esta edad, el tratamiento es altamente individualizado y complejo, dependiendo del tipo espec�fico de c�ncer, su etapa y la salud general del ni�o. Generalmente, implica una " +
                                                  "\n combinaci�n de quimioterapia (medicamentos que matan las c�lulas cancerosas, como la vincristina, una marca com�n es Oncovin, o el ciclofosfamida, una marca com�n es Cytoxan)," +
                                                  "\n radioterapia (uso de radiaci�n para destruir c�lulas cancerosas), cirug�a (para extirpar tumores), e incluso inmunoterapia o terapia dirigida. Es fundamental que el tratamiento" +
                                                  "\n sea manejado por un equipo multidisciplinario de onc�logos pedi�tricos. Adem�s del tratamiento oncol�gico, se utilizan medicamentos de soporte para manejar los efectos       " +
                                                  "\n secundarios, como antiem�ticos para las n�useas (como el ondansetr�n, una marca com�n es Zofran), analg�sicos para el dolor (como el paracetamol, una marca com�n es Tempra   " +
                                                  "\n o Tylenol), y factores estimulantes de colonias para apoyar la m�dula �sea. En cuanto a la alimentaci�n, es recomendable que el ni�o consuma alimentos que fortalezcan su     " +
                                                  "\n sistema inmune, le proporcionen energ�a y le ayuden a tolerar mejor el tratamiento, priorizando aquellos que sean nutritivos y de f�cil digesti�n. Esto incluye prote�nas     " +
                                                  "\n de alto valor biol�gico (pollo, pescado, huevos, legumbres) que son esenciales para la reparaci�n celular y el mantenimiento de la masa muscular, crucial durante y despu�s   " +
                                                  "\n de la quimioterapia. Las verduras de hoja verde oscuro como la col rizada (kale), que aporta Vitamina K, Vitamina A y antioxidantes, que pueden ayudar a reducir la inflamaci�n" +
                                                  "\n y proteger las c�lulas, y el br�coli, que ofrece una gran cantidad de Vitamina C (alrededor de 89.2 mg por cada 100 gramos, lo que representa cerca del 99% de la ingesta diaria" +
                                                  "\n recomendada para un ni�o de 4-8 a�os), esencial para la funci�n inmunol�gica. Las frutas de colores vivos como la granada, rica en antioxidantes (como punicalaginas) que pueden" +
                                                  "\n ofrecer propiedades protectoras, y las uvas, que contienen resveratrol, un compuesto con potencial antiinflamatorio. El aguacate proporciona grasas saludables y Vitamina E,   " +
                                                  "\n importantes para la energ�a y la salud general. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad" +
                                                  "\n y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento" +
                                                  "\n adecuado de su paciente, adem�s por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece    " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }  
                        }
                        if(EstaturaMasculino.equals("1.65-1.80 m")){
                           if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n Es recomendable que el ni�o, con una estatura de 1.65-1.80 m, realice cerca de 60 minutos de actividad f�sica moderada a intensa diaria, incluyendo juegos activos" +
                                                  "\n o deportes, siempre adaptando la intensidad a su estado de salud general durante el periodo de enfermedad. Esto es crucial para mantener un sistema inmune fuerte." +
                                                  "\n Tambi�n es recomendable el consumo diario de 3 a 3.5 Litros de agua al d�a (doce a catorce vasos de tama�o regular) para mantener una excelente hidrataci�n, lo cual" +
                                                  "\n ayuda a fluidificar las secreciones respiratorias y a controlar la fiebre. POSIBLE TRATAMIENTO: Para la gripe en ni�os de esta edad, el tratamiento suele incluir;" +
                                                  "\n medicamentos para reducir la fiebre y aliviar los s�ntomas, como el paracetamol (una marca com�n es Tempra o Tylenol) o el ibuprofeno (una marca com�n es Advil o " +
                                                  "\n Motrin). En algunos casos, si se diagnostica a tiempo (dentro de las primeras 48 horas de los s�ntomas), el m�dico puede prescribir antivirales espec�ficos contra" +
                                                  "\n la gripe como el oseltamivir (una marca com�n es Tamiflu). Es fundamental seguir las indicaciones del m�dico al pie de la letra. Tambi�n es recomendable que el ni�o" +
                                                  "\n consuma alimentos que fortalezcan su sistema inmune y aporten nutrientes para la recuperaci�n, tales como frutas ricas en Vitamina C como las guayabas, que contienen" +
                                                  "\n una cantidad muy alta de esta vitamina (alrededor de 228.3 mg por cada 100 gramos, lo que representa cerca del 254% de la ingesta diaria recomendada para un ni�o de " +
                                                  "\n 4-8 a�os), o las naranjas, que aportan aproximadamente 53.2 mg por cada 100 gramos (cerca del 59% de la ingesta diaria recomendada para la misma edad), ambos potentes" +
                                                  "\n antioxidantes que apoyan las defensas del cuerpo. Tambi�n son beneficiosos los vegetales de hoja verde oscuro como el kale (col rizada), que provee Vitamina A y     " +
                                                  "\n Vitamina K, importantes para la salud de las mucosas y la funci�n inmune; y el jengibre, que puede consumirse en infusiones y posee propiedades antiinflamatorias que" +
                                                  "\n pueden ayudar a aliviar el malestar. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y" + 
                                                  "\n que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el    " +
                                                  "\n tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel" +
                                                  "\n L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                               textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumon�a." +
                                                  "\n Es recomendable que el ni�o, con una estatura de 1.65-1.80 m, realice actividad f�sica moderada seg�n su capacidad y estado de recuperaci�n, siempre supervisada" +
                                                  "\n y evitando esfuerzos excesivos o juegos que agiten demasiado sus v�as respiratorias, especialmente si a�n presenta s�ntomas. Una vez que su condici�n mejore, puede" +
                                                  "\n retomar gradualmente actividades como caminatas al aire libre, bicicleta o juegos tranquilos, buscando cerca de 60 minutos de actividad f�sica moderada a intensa  " +
                                                  "\n diaria. Tambi�n es crucial el consumo diario de 3 a 3.5 Litros de agua al d�a (doce a catorce vasos de tama�o regular), especialmente si tiene fiebre, para ayudar " +
                                                  "\n a fluidificar las secreciones pulmonares y prevenir la deshidrataci�n, facilitando su expectoraci�n. POSIBLE TRATAMIENTO: Para la neumon�a en ni�os de esta edad,  " +
                                                  "\n el tratamiento suele incluir; antibi�ticos (si la causa es bacteriana, como la amoxicilina, una marca com�n es Amoxil o Clamoxil, o la azitromicina, una marca com�n" +
                                                  "\n es Zithromax, siempre bajo prescripci�n m�dica estricta), medicamentos para reducir la fiebre y aliviar el dolor (como el paracetamol, una marca com�n es Tempra o " +
                                                  "\n Tylenol, o el ibuprofeno, una marca com�n es Advil o Motrin), y en algunos casos, oxigenoterapia si la saturaci�n de ox�geno es baja. Es fundamental seguir las   " +
                                                  "\n indicaciones del m�dico al pie de la letra y completar el ciclo de antibi�ticos aunque el ni�o parezca mejor. Tambi�n es recomendable que el ni�o consuma alimentos" +
                                                  "\n que fortalezcan su sistema inmune y le aporten energ�a, tales como caldos nutritivos y sopas suaves que, adem�s de ser f�ciles de digerir, contribuyen a la       " +
                                                  "\n hidrataci�n y al aporte de electrolitos. Las verduras de hoja verde oscuro como el kale (col rizada), que aporta Vitamina A y Vitamina K, o el pimiento rojo, que " +
                                                  "\n ofrece una gran cantidad de Vitamina C (alrededor de 127.7 mg por cada 100 gramos, lo que representa cerca del 142% de la ingesta diaria recomendada para un ni�o " +
                                                  "\n de 4-8 a�os), son excelentes fuentes de antioxidantes que apoyan la salud pulmonar. Las frutas como las fresas, que contienen cerca de 58.8 mg de Vitamina C por  " +
                                                  "\n cada 100 gramos (aproximadamente el 65% de la ingesta diaria recomendada para la misma edad), y las papayas, que ofrecen aproximadamente 60.9 mg de Vitamina C por" +
                                                  "\n cada 100 gramos (alrededor del 68% de la ingesta diaria recomendada para la misma edad), son cruciales para reforzar el sistema inmunol�gico. Este es solo un     " +
                                                  "\n Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n" +
                                                  "\n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su " +
                                                  "\n salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la " +
                                                  "\n app (Mi Vida) y espera que te mejores."); 
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visi�n borrosa, P�rdida de peso.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n Es recomendable que el ni�o, con una estatura de 1.65-1.80 m, realice cerca de 60 minutos de actividad f�sica moderada a intensa diaria, como juegos activos, deportes" +
                                                  "\n o paseos en bicicleta, adapt�ndose siempre a su estado de salud y bajo supervisi�n. Esta actividad es crucial para el control del az�car en sangre, mejorar la sensibilidad" +
                                                  "\n a la insulina y mantener un peso saludable, fundamentales en el manejo de la diabetes. Tambi�n es fundamental el consumo diario de 3 a 3.5 Litros de agua al d�a      " +
                                                  "\n (doce a catorce vasos de tama�o regular), priorizando el agua natural sobre bebidas azucaradas, para mantener una hidrataci�n adecuada y ayudar a los ri�ones a procesar el" +
                                                  "\n exceso de glucosa. POSIBLE TRATAMIENTO: Para la diabetes en ni�os de esta edad, el tratamiento suele incluir; manejo de la insulina (en caso de diabetes tipo 1, se requiere" +
                                                  "\n insulina inyectada para controlar los niveles de glucosa, por ejemplo, insulina glargina, una marca com�n es Lantus, o insulina aspart, una marca com�n es Novolog),     " +
                                                  "\n medicamentos orales (para diabetes tipo 2, como la metformina, una marca com�n es Glucophage o Dianben, siempre bajo prescripci�n m�dica), y un monitoreo constante de los" +
                                                  "\n niveles de glucosa en sangre con un gluc�metro. Es vital seguir un plan de alimentaci�n saludable y equilibrado, as� como un control m�dico regular con un endocrin�logo  " +
                                                  "\n pedi�trico. Tambi�n es recomendable que el ni�o consuma alimentos que ayuden a la regulaci�n del az�car y fortalezcan su sistema inmune, tales como verduras no almidonadas" +
                                                  "\n como la col rizada (kale), rica en fibra y Vitamina C, o la espinaca, que aporta Magnesio y Vitamina K, nutrientes importantes para el metabolismo de la glucosa. Frutas con" +
                                                  "\n moderaci�n como las manzanas y las peras, que son ricas en fibra (aproximadamente 2.4 gramos de fibra por cada 100 gramos en una manzana con c�scara) y antioxidantes,   " +
                                                  "\n contribuyen a una liberaci�n m�s lenta de az�cares en la sangre. Las bayas (ar�ndanos, moras) son tambi�n excelentes por su bajo �ndice gluc�mico y alto contenido de    " +
                                                  "\n antioxidantes, con los ar�ndanos conteniendo alrededor de 14 mg de Vitamina C por cada 100 gramos (aproximadamente el 16% de la ingesta diaria recomendada para un ni�o  " +
                                                  "\n de 4-8 a�os). Las prote�nas magras como el pollo, el pescado y las legumbres (lentejas, garbanzos) son importantes para mantener la saciedad y el control gluc�mico.     " +
                                                  "\n Los granos integrales como la avena y el pan integral proporcionan fibra y energ�a sostenida, ayudando a evitar picos de az�car en sangre. Este es solo un Diagn�stico   " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para  " +
                                                  "\n ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta " +
                                                  "\n del Diagnostico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresi�n en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n Es recomendable que el ni�o, con una estatura de 1.65-1.80 m, realice actividad f�sica de forma controlada y supervisada, con calentamiento previo y enfriamiento " +
                                                  "\n posterior, evitando desencadenantes conocidos del asma (como al�rgenos, aire fr�o o contaminado, o actividad f�sica muy intensa sin preparaci�n) y haciendo pausas" +
                                                  "\n si presenta s�ntomas. La cantidad de ejercicio debe ser adaptada a su capacidad y a la presencia de s�ntomas, pudiendo ser periodos de 30 a 60 minutos de actividad" +
                                                  "\n moderada en los d�as que se encuentre bien, pero siempre consultando al m�dico para un plan seguro y ajustado. Tambi�n es crucial el consumo diario de 3 a 3.5 Litros" +
                                                  "\n de agua al d�a (doce a catorce vasos de tama�o regular) para ayudar a mantener las v�as respiratorias hidratadas y las secreciones m�s fluidas, lo que facilita la " +
                                                  "\n respiraci�n y puede prevenir el estrechamiento de los bronquios. POSIBLE TRATAMIENTO: Para el asma en ni�os de esta edad, el tratamiento suele incluir;            " +
                                                  "\n broncodilatadores de alivio r�pido (para abrir las v�as respiratorias durante un ataque, como el salbutamol, una marca com�n es Ventolin o Aerolin), corticosteroides" +
                                                  "\n inhalados (para el control a largo plazo y reducir la inflamaci�n cr�nica de las v�as respiratorias, como la fluticasona, una marca com�n es Flixotide, o la budesonida," +
                                                  "\n una marca com�n es Pulmicort), y en algunos casos, modificadores de leucotrienos (como el montelukast, una marca com�n es Singulair), que ayudan a controlar la     " +
                                                  "\n inflamaci�n y los s�ntomas. Es fundamental seguir estrictamente el plan de acci�n para el asma indicado por el m�dico, usar los medicamentos preventivos regularmente" +
                                                  "\n y acudir a revisiones peri�dicas. Tambi�n es recomendable que el ni�o consuma alimentos que puedan ayudar a reducir la inflamaci�n y fortalecer el sistema inmune,  " +
                                                  "\n tales como pescados grasos (salm�n, at�n), ricos en �cidos grasos Omega-3, que poseen propiedades antiinflamatorias que pueden ser beneficiosas para las v�as       " +
                                                  "\n respiratorias. Una amplia variedad de frutas y verduras de colores vivos, como los ar�ndanos, con su alto contenido de antioxidantes que protegen las c�lulas;      " +
                                                  "\n la espinaca, que aporta Magnesio, un mineral que puede ayudar a relajar los m�sculos bronquiales, y Vitamina K; y el pimiento rojo, que ofrece una gran cantidad    " +
                                                  "\n de Vitamina C (alrededor de 127.7 mg por cada 100 gramos, lo que representa cerca del 142% de la ingesta diaria recomendada para un ni�o de 4-8 a�os), esencial     " +
                                                  "\n para la funci�n inmunol�gica. Tambi�n se beneficia de manzanas, que contienen quercetina, un flavonoide con propiedades antiinflamatorias que puede ser �til para   " +
                                                  "\n la salud pulmonar. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello   " +
                                                  "\n la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento    " +
                                                  "\n adecuado de su paciente, adem�s por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes  " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, P�rdida de peso, Ganglios linf�ticos inflamados, Erupci�n cut�nea (Diarrea).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n Es recomendable que el ni�o, con una estatura de 1.65-1.80 m, realice actividad f�sica moderada y adaptada a su estado de salud, bajo supervisi�n m�dica para" +
                                                  "\n evitar el agotamiento y proteger su sistema inmune, y siempre evitando deportes de contacto o actividades con alto riesgo de lesiones si su sistema inmune est�" +
                                                  "\n comprometido. La actividad debe ser gradual, buscando idealmente periodos de 30 a 60 minutos de actividad moderada en los d�as que se encuentre bien, adapt�ndose" +
                                                  "\n a su energ�a y tolerando periodos de descanso. Tambi�n es crucial el consumo diario de 3 a 3.5 Litros de agua al d�a (doce a catorce vasos de tama�o regular) para" +
                                                  "\n mantener una buena hidrataci�n, fundamental para el bienestar general, el funcionamiento del cuerpo y el metabolismo de los medicamentos antirretrovirales.    " +
                                                  "\n POSIBLE TRATAMIENTO: Para el VIH/SIDA en ni�os de esta edad, el tratamiento principal es la terapia antirretroviral (TARV), que incluye una combinaci�n de     " +
                                                  "\n medicamentos que trabajan para controlar la replicaci�n del virus, mejorar la funci�n inmunol�gica y prevenir el desarrollo de infecciones oportunistas. Estos " +
                                                  "\n medicamentos se eligen y ajustan espec�ficamente por un m�dico especialista en VIH pedi�trico, y es vital la adherencia estricta al r�gimen. Algunos ejemplos de" +
                                                  "\n medicamentos usados en TARV incluyen inhibidores de la transcriptasa inversa an�logos de nucle�sidos (como Zidovudina, o Retrovir), inhibidores de la transcriptasa" +
                                                  "\n inversa no an�logos de nucle�sidos (como Efavirenz, o Sustiva), e inhibidores de la proteasa (como Lopinavir/Ritonavir, o Kaletra). El tratamiento tambi�n incluye" +
                                                  "\n el manejo y prevenci�n de infecciones oportunistas con antibi�ticos profil�cticos (como el trimetoprim/sulfametoxazol, o Bactrim) para proteger contra ciertas    " +
                                                  "\n infecciones. Es fundamental el seguimiento m�dico constante. Tambi�n es recomendable que el ni�o consuma alimentos que refuercen el sistema inmune, proporcionen  " +
                                                  "\n energ�a y ayuden a mantener un peso saludable, tales como prote�nas de alto valor biol�gico (pollo, pescado, huevos, legumbres) que son cruciales para la reparaci�n" +
                                                  "\n de tejidos y la funci�n inmune; l�cteos y alternativas enriquecidas con calcio y vitamina D para la salud �sea, la cual puede verse afectada por el virus o algunos " +
                                                  "\n tratamientos. Una amplia variedad de frutas y verduras de colores vivos, como los ar�ndanos, ricos en antioxidantes que protegen las c�lulas; las naranjas, que     " +
                                                  "\n aportan una cantidad significativa de Vitamina C (alrededor de 53.2 mg por cada 100 gramos, lo que representa cerca del 59% de la ingesta diaria recomendada para un" +
                                                  "\n ni�o de 4-8 a�os), esencial para el sistema inmunitario; y el pimiento rojo, que contiene incluso m�s Vitamina C (aproximadamente 127.7 mg por cada 100 gramos, lo  " +
                                                  "\n que representa cerca del 142% de la ingesta diaria recomendada para la misma edad), y las espinacas, que contienen hierro y Vitamina A, importantes para la producci�n" +
                                                  "\n de c�lulas sangu�neas y la funci�n inmune, son igualmente beneficiosas. Adem�s, los granos integrales como la avena y el arroz integral, que proveen fibra y energ�a  " +
                                                  "\n sostenida, son importantes para una nutrici�n adecuada. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga" +
                                                  "\n esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor    " +
                                                  "\n seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a  " +
                                                  "\n su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreci�n anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n Es recomendable que el ni�o, con una estatura de 1.65-1.80 m, realice actividad f�sica moderada y adaptada a su estado de salud, sin forzar su cuerpo. Dado que la " +
                                                  "\n gonorrea no suele afectar directamente la capacidad f�sica a largo plazo (una vez tratada), en cuanto se sienta mejor y el m�dico lo autorice, puede buscar idealmente" +
                                                  "\n periodos de 30 a 60 minutos de actividad moderada a intensa diaria. Durante la infecci�n y el tratamiento, la actividad puede ser m�s ligera, como paseos cortos.  " +
                                                  "\n Tambi�n es crucial el consumo diario de 3 a 3.5 Litros de agua al d�a (doce a catorce vasos de tama�o regular) para mantener una buena hidrataci�n, fundamental para" +
                                                  "\n apoyar el proceso de recuperaci�n del cuerpo y el funcionamiento adecuado de los ri�ones, que procesar�n los medicamentos. POSIBLE TRATAMIENTO: Para la gonorrea en " +
                                                  "\n ni�os de esta edad, el tratamiento es estrictamente con antibi�ticos, siempre bajo la supervisi�n y prescripci�n de un m�dico. La elecci�n y dosis del antibi�tico  " +
                                                  "\n depender�n de la edad, peso y la cepa espec�fica de la bacteria. Es vital que se complete el ciclo de antibi�ticos tal como lo indique el profesional de la salud para" +
                                                  "\n asegurar la erradicaci�n total de la infecci�n y prevenir complicaciones. Ejemplos de antibi�ticos utilizados incluyen ceftriaxona (una marca com�n es Rocephin)    " +
                                                  "\n administrada por inyecci�n, o azitromicina (una marca com�n es Zithromax) administrada oralmente. Es importante recordar que la gonorrea en ni�os requiere una evaluaci�n" +
                                                  "\n m�dica inmediata, ya que puede tener implicaciones serias y, en algunos casos, puede ser indicativa de abuso. Adem�s, es recomendable que el ni�o consuma alimentos que" +
                                                  "\n fortalezcan su sistema inmune y contribuyan a su recuperaci�n general, como una amplia variedad de frutas y verduras frescas. Por ejemplo, el mango, que aporta      " +
                                                  "\n Vitamina C (aproximadamente 36.4 mg por cada 100 gramos, lo que representa cerca del 40% de la ingesta diaria recomendada para un ni�o de 4-8 a�os) y Vitamina A,    " +
                                                  "\n esenciales para la funci�n inmunol�gica; o el pimiento rojo, que contiene una cantidad muy elevada de Vitamina C (alrededor de 127.7 mg por cada 100 gramos, lo que  " +
                                                  "\n representa cerca del 142% de la ingesta diaria recomendada para la misma edad). Las verduras de hoja verde oscuro como la espinaca, que proveen Vitamina K, Vitamina A" +
                                                  "\n y antioxidantes, que apoyan la salud general, tambi�n son beneficiosas. Las prote�nas magras como el pollo, el pescado y las legumbres son esenciales para la        " +
                                                  "\n reparaci�n de tejidos y el mantenimiento de la energ�a, y los granos integrales como la avena y el arroz integral, proveen fibra y energ�a sostenida para una        " +
                                                  "\n buena digesti�n y vitalidad. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y       " +
                                                  "\n que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en       " +
                                                  "\n el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su m�dico,   " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linf�ticos inflamados, �lceras o llagas dolorosas, Picaz�n o ardor, Dolor al orinar.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n Es recomendable que el ni�o, con una estatura de 1.65-1.80 m, realice actividad f�sica moderada y adaptada a su estado de salud, especialmente evitando actividades" +
                                                  "\n que puedan irritar las lesiones si estas est�n presentes, como el roce excesivo o la sudoraci�n intensa en el �rea afectada. Una vez que las lesiones remitan, puede" +
                                                  "\n retomar gradualmente la actividad f�sica normal para su edad, buscando idealmente periodos de 30 a 60 minutos de actividad moderada a intensa diaria, siempre bajo  " +
                                                  "\n supervisi�n. Tambi�n es crucial el consumo diario de 3 a 3.5 Litros de agua al d�a (doce a catorce vasos de tama�o regular) para mantener una buena hidrataci�n,    " +
                                                  "\n lo cual es fundamental para el bienestar general, el funcionamiento �ptimo del sistema inmune y la eliminaci�n de toxinas. POSIBLE TRATAMIENTO: Para el herpes      " +
                                                  "\n genital en ni�os de esta edad, el tratamiento principal consiste en medicamentos antivirales que ayudan a controlar el brote, reducir la intensidad y duraci�n de   " +
                                                  "\n los s�ntomas, y prevenir futuras recurrencias, aunque no eliminan el virus del cuerpo. Es fundamental que estos medicamentos sean prescritos y supervisados por un  " +
                                                  "\n m�dico, quien determinar� la dosis adecuada seg�n la edad y el peso del ni�o. Algunos ejemplos de medicamentos antivirales utilizados incluyen Aciclovir (una marca " +
                                                  "\n com�n es Zovirax), Valaciclovir (una marca com�n es Valtrex), y Famciclovir (una marca com�n es Famvir). Adem�s del tratamiento antiviral, es importante mantener   " +
                                                  "\n una higiene adecuada de las lesiones y evitar tocarlas para prevenir la propagaci�n. Tambi�n es recomendable que el ni�o consuma alimentos que fortalezcan su sistema" +
                                                  "\n inmune y ayuden a la cicatrizaci�n, tales como alimentos ricos en lisina y bajos en arginina, ya que la lisina puede inhibir la replicaci�n del virus del herpes,   " +
                                                  "\n presentes en l�cteos, pescado y pollo, que aportan prote�nas esenciales y Vitamina D (importante para la funci�n inmune). Una variedad de frutas y verduras, como   " +
                                                  "\n el pimiento rojo, que contiene una cantidad muy elevada de Vitamina C (alrededor de 127.7 mg por cada 100 gramos, lo que representa cerca del 142% de la ingesta    " +
                                                  "\n diaria recomendada para un ni�o de 4-8 a�os), o las fresas, con cerca de 58.8 mg de Vitamina C por cada 100 gramos (aproximadamente el 65% de la ingesta diaria     " +
                                                  "\n recomendada para la misma edad), son excelentes fuentes de antioxidantes que apoyan la reparaci�n celular y el fortalecimiento de las defensas del cuerpo. Tambi�n  " +
                                                  "\n se beneficia de las verduras de hoja verde oscuro como la espinaca, que provee hierro y folato. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado" +
                                                  "\n no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un    " +
                                                  "\n Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagnostico no le satisface" +
                                                  "\n del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, �lceras indoloras, Erupci�n cut�nea, Dolor de cabeza, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer S�filis." +
                                                  "\n Es recomendable que el ni�o, con una estatura de 1.65-1.80 m, realice actividad f�sica moderada y adaptada a su estado de salud, especialmente si la s�filis ha" +
                                                  "\n afectado alguna articulaci�n o hueso, o si presenta fatiga. Durante el tratamiento y la recuperaci�n, la actividad debe ser supervisada, buscando idealmente   " +
                                                  "\n periodos de 30 a 60 minutos de actividad moderada en los d�as que se encuentre bien, pero siempre con precauci�n y escuchando las se�ales del cuerpo. Tambi�n  " +
                                                  "\n es crucial el consumo diario de 3 a 3.5 Litros de agua al d�a (doce a catorce vasos de tama�o regular) para mantener una buena hidrataci�n, fundamental para el" +
                                                  "\n funcionamiento �ptimo del cuerpo y el proceso de eliminaci�n de toxinas durante el tratamiento. POSIBLE TRATAMIENTO: Para la s�filis en ni�os de esta edad, el " +
                                                  "\n tratamiento principal y m�s efectivo es con antibi�ticos, siendo la penicilina el medicamento de elecci�n. La dosis y la duraci�n del tratamiento ser�n determinadas" +
                                                  "\n estrictamente por un m�dico, y es fundamental completar el ciclo completo para asegurar la erradicaci�n de la infecci�n y prevenir complicaciones a largo plazo." +
                                                  "\n En casos de alergia a la penicilina, el m�dico puede considerar otras opciones como la ceftriaxona (una marca com�n es Rocephin). Es vital un seguimiento m�dico" +
                                                  "\n cercano despu�s del tratamiento para confirmar la curaci�n. Tambi�n es recomendable que el ni�o consuma alimentos que fortalezcan su sistema inmune y apoyen la " +
                                                  "\n recuperaci�n general, como prote�nas magras (pollo, pescado, legumbres) que son cruciales para la reparaci�n de tejidos y la producci�n de c�lulas inmunes; as� " +
                                                  "\n como una amplia variedad de frutas y verduras frescas. Por ejemplo, el pimiento rojo, que aporta una gran cantidad de Vitamina C (alrededor de 127.7 mg por cada" +
                                                  "\n 100 gramos, lo que representa cerca del 142% de la ingesta diaria recomendada para un ni�o de 4-8 a�os), importante para la inmunidad. La espinaca, rica en folato" +
                                                  "\n (una vitamina B esencial para la divisi�n celular y la formaci�n de gl�bulos rojos, lo cual es importante si hay anemia asociada a la s�filis), y Vitamina A,   " +
                                                  "\n tambi�n contribuye a la salud general. Las naranjas, con su alto contenido de Vitamina C (aproximadamente 53.2 mg por cada 100 gramos, que representa cerca del " +
                                                  "\n 59% de la ingesta diaria recomendada para la misma edad), son excelentes para reforzar las defensas, y los ar�ndanos son ricos en antioxidantes que protegen las" +
                                                  "\n c�lulas del da�o. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello" +
                                                  "\n la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento" +
                                                  "\n adecuado de su paciente, adem�s por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes" +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, P�rdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n Es recomendable que el ni�o, con una estatura de 1.65-1.80 m, realice actividad f�sica moderada y adaptada a su estado de salud y nivel de energ�a, especialmente" +
                                                  "\n durante la fase activa de la enfermedad y el tratamiento, cuando puede experimentar fatiga y dificultad respiratoria. Se deben evitar actividades extenuantes y  " +
                                                  "\n priorizar el reposo adecuado. A medida que su condici�n mejore, puede retomar gradualmente juegos ligeros, caminatas cortas o ejercicios de estiramiento, siempre" +
                                                  "\n bajo supervisi�n m�dica, buscando alcanzar periodos de 30 a 60 minutos de actividad moderada en los d�as que se encuentre bien, adapt�ndose a su tolerancia.     " +
                                                  "\n Tambi�n es crucial el consumo diario de 3 a 3.5 Litros de agua al d�a (doce a catorce vasos de tama�o regular) para mantener una excelente hidrataci�n, lo cual  " +
                                                  "\n es vital para el funcionamiento general del cuerpo, la eliminaci�n de desechos y el apoyo a los �rganos que metabolizan los medicamentos antituberculosos.       " +
                                                  "\n POSIBLE TRATAMIENTO: Para la tuberculosis en ni�os de esta edad, el tratamiento es un r�gimen prolongado de antibi�ticos antituberculosos, que se administra bajo" +
                                                  "\n estricta supervisi�n m�dica. Es absolutamente esencial que el ni�o complete el curso completo del tratamiento, que puede durar varios meses, para erradicar      " +
                                                  "\n la bacteria y prevenir la aparici�n de cepas resistentes. Los medicamentos comunes incluyen Isoniazida (una marca com�n es Laniazid), Rifampicina (una marca     " +
                                                  "\n com�n es Rifadin), Pirazinamida y Etambutol. La combinaci�n y dosis exactas ser�n determinadas por el m�dico. Es fundamental un seguimiento m�dico constante     " +
                                                  "\n para monitorear la respuesta al tratamiento y los posibles efectos secundarios. Tambi�n es recomendable que el ni�o consuma alimentos que fortalezcan su sistema " +
                                                  "\n inmune y le proporcionen la energ�a y nutrientes necesarios para combatir la infecci�n y apoyar el tratamiento, como prote�nas de alto valor biol�gico (huevo,   " +
                                                  "\n pollo, pescado, legumbres) que son cruciales para la reparaci�n de tejidos y la producci�n de c�lulas inmunes. Las verduras de hoja verde oscuro como la espinaca," +
                                                  "\n que aporta Magnesio, hierro y folato (importante para la formaci�n de gl�bulos rojos, que pueden verse afectados por la TB o sus tratamientos); y las zanahorias, " +
                                                  "\n una excelente fuente de Vitamina A (alrededor de 835 �g por cada 100 gramos, lo que representa cerca del 167% de la ingesta diaria recomendada para un ni�o de 4-8" +
                                                  "\n a�os), esencial para la salud de las mucosas respiratorias y la funci�n inmune, son altamente beneficiosas. Las frutas como el mango, que aporta Vitamina C      " +
                                                  "\n (aproximadamente 36.4 mg por cada 100 gramos, lo que representa cerca del 40% de la ingesta diaria recomendada para un ni�o de 4-8 a�os) y Vitamina A, as� como el" +
                                                  "\n kiwi, rico en Vitamina C (aproximadamente 92.7 mg por cada 100 gramos, que representa cerca del 103% de la ingesta diaria recomendada para la misma edad), son   " +
                                                  "\n cruciales para reforzar el sistema inmunol�gico y actuar como antioxidantes. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al" +
                                                  "\n 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de  " +
                                                  "\n Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagnostico no le satisface del todo " +
                                                  "\n se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchaz�n en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n Es recomendable que el ni�o, con una estatura de 1.65-1.80 m, realice actividad f�sica suave y de bajo impacto adaptada a su nivel de dolor y la condici�n" +
                                                  "\n de sus articulaciones, buscando mantener la flexibilidad y fortalecer los m�sculos sin sobrecargar las zonas inflamadas. Actividades como la nataci�n,    " +
                                                  "\n el ciclismo (con un sill�n adecuado y baja resistencia) o ejercicios de estiramiento suaves pueden ser muy beneficiosas, siempre bajo supervisi�n y previa" +
                                                  "\n consulta con el m�dico o fisioterapeuta. La cantidad de ejercicio debe ser progresiva y ajustada a sus d�as buenos y malos, pero se debe fomentar el      " +
                                                  "\n movimiento regular para evitar la rigidez, idealmente buscando periodos de 30 a 60 minutos de actividad moderada en los d�as que se encuentre bien,       " +
                                                  "\n permitiendo periodos de descanso seg�n su tolerancia. Tambi�n es crucial el consumo diario de 3 a 3.5 Litros de agua al d�a (doce a catorce vasos de tama�o" +
                                                  "\n regular) para mantener una buena hidrataci�n, lo cual es fundamental para la salud general, el funcionamiento �ptimo de las articulaciones y el metabolismo" +
                                                  "\n de los medicamentos. POSIBLE TRATAMIENTO: Para la artritis en ni�os de esta edad, el tratamiento suele incluir; medicamentos antiinflamatorios no esteroideos" +
                                                  "\n (AINEs) para reducir el dolor y la inflamaci�n (como el ibuprofeno, una marca com�n es Advil o Motrin, o el naproxeno, una marca com�n es Aproben),       " +
                                                  "\n f�rmacos antirreum�ticos modificadores de la enfermedad (FARME) que act�an sobre el sistema inmune para controlar la progresi�n de la enfermedad          " +
                                                  "\n (como el metotrexato, una marca com�n es Trexall), y en algunos casos, medicamentos biol�gicos para la artritis juvenil idiop�tica grave. Es fundamental que" +
                                                  "\n estos tratamientos sean prescritos y supervisados por un reumat�logo pediatra, quien ajustar� las dosis y monitorear� los efectos. Tambi�n es recomendable" +
                                                  "\n que el ni�o consuma alimentos que ayuden a reducir la inflamaci�n y fortalezcan su sistema inmune, tales como pescados grasos (salm�n, sardinas), que son " +
                                                  "\n ricos en �cidos grasos Omega-3, potentes antiinflamatorios que pueden ser beneficiosos para la salud articular. Una amplia variedad de frutas y verduras  " +
                                                  "\n de colores vivos, como los ar�ndanos, que aportan antioxidantes que protegen las c�lulas; la espinaca, rica en Magnesio, un mineral que puede contribuir  " +
                                                  "\n a la relajaci�n muscular, y Vitamina K; y el pimiento rojo, que ofrece una gran cantidad de Vitamina C (alrededor de 127.7 mg por cada 100 gramos, lo que " +
                                                  "\n representa cerca del 142% de la ingesta diaria recomendada para un ni�o de 4-8 a�os), esencial para la funci�n inmunol�gica. Tambi�n se beneficia de las  " +
                                                  "\n cerezas, que contienen antocianinas, compuestos con potentes propiedades antiinflamatorias que podr�an ayudar a reducir el dolor y la inflamaci�n en las  " +
                                                  "\n articulaciones. Adem�s, el aguacate proporciona grasas saludables y Vitamina E, importantes para la energ�a y la salud general. Este es solo un Diagn�stico" +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n   " +
                                                  "\n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente,      " +
                                                  "\n adem�s por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu     " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n Es recomendable que el ni�o, con una estatura de 1.65-1.80 m, especialmente durante la fase parox�stica de tos severa, limite la actividad f�sica a " +
                                                  "\n movimientos suaves y evite cualquier esfuerzo que pueda desencadenar ataques de tos. El reposo es crucial para su recuperaci�n y para conservar energ�a." +
                                                  "\n A medida que mejore, puede retomar gradualmente actividades de bajo impacto como caminatas cortas o juegos tranquilos, siempre bajo supervisi�n, buscando" +
                                                  "\n alcanzar periodos de 30 a 60 minutos de actividad moderada en los d�as que se encuentre bien, adapt�ndose a su nivel de tolerancia. Tambi�n es crucial el" +
                                                  "\n consumo diario de 3 a 3.5 Litros de agua al d�a (doce a catorce vasos de tama�o regular), o incluso m�s si presenta fiebre o dificultad para alimentarse," +
                                                  "\n para mantener una excelente hidrataci�n y ayudar a fluidificar las secreciones respiratorias, lo cual es vital para su comodidad y recuperaci�n.         " +
                                                  "\n POSIBLE TRATAMIENTO: Para la tosferina en ni�os de esta edad, el tratamiento principal es con antibi�ticos, que son m�s efectivos cuando se administran  " +
                                                  "\n en las primeras etapas de la enfermedad para acortar la duraci�n de los s�ntomas y reducir la propagaci�n. Los m�s comunes son los macr�lidos, como la   " +
                                                  "\n azitromicina (una marca com�n es Zithromax), la eritromicina (una marca com�n es Pneumo-E o Eritrobase) o la claritromicina (una marca com�n es Klacid). " +
                                                  "\n Es fundamental que el ni�o complete el ciclo completo de antibi�ticos tal como lo indique el m�dico, incluso si los s�ntomas mejoran, para erradicar la  " +
                                                  "\n bacteria. En casos severos o en lactantes, podr�a requerirse hospitalizaci�n para el monitoreo y manejo de complicaciones. Tambi�n es recomendable que   " +
                                                  "\n el ni�o consuma alimentos que fortalezcan su sistema inmune y le proporcionen nutrientes que ayuden a su recuperaci�n, especialmente aquellos que son    " +
                                                  "\n f�ciles de tragar y digestibles debido a los ataques de tos, tales como pur�s de frutas y verduras. Por ejemplo, el pur� de calabaza, que aporta una     " +
                                                  "\n buena cantidad de Vitamina A (alrededor de 369 �g por cada 100 gramos, lo que representa cerca del 74% de la ingesta diaria recomendada para un ni�o     " +
                                                  "\n de 4-8 a�os), esencial para la salud de las mucosas respiratorias y la funci�n inmune; o el pur� de zanahoria, tambi�n rica en Vitamina A y antioxidantes." +
                                                  "\n Los pl�tanos son f�ciles de comer y ricos en potasio (aproximadamente 358 mg por cada 100 gramos), un electrolito importante que puede ayudar a reponer  " +
                                                  "\n las p�rdidas debido a la tos y al sudor, adem�s de aportar energ�a. Las sopas y caldos suaves contribuyen a la hidrataci�n y aportan nutrientes de forma " +
                                                  "\n l�quida. Tambi�n son valiosas las frutas suaves ricas en Vitamina C como la papaya, que contiene alrededor de 60.9 mg de Vitamina C por cada 100 gramos  " +
                                                  "\n (aproximadamente el 68% de la ingesta diaria recomendada para un ni�o de 4-8 a�os), y la guayaba, con niveles a�n m�s altos de esta vitamina, crucial    " +
                                                  "\n para fortalecer el sistema inmunol�gico. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga" +
                                                  "\n esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para       " +
                                                  "\n establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagnostico no le satisface del todo      " +
                                                  "\n se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchaz�n de las gl�ndulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n Es recomendable que el ni�o, con una estatura de 1.65-1.80 m, especialmente durante la fase aguda de la enfermedad cuando puede presentar " +
                                                  "\n fiebre y malestar, limite la actividad f�sica a un reposo adecuado, evitando esfuerzos que puedan aumentar el malestar o la hinchaz�n de las" +
                                                  "\n gl�ndulas. A medida que su condici�n mejore y la fiebre ceda, puede retomar gradualmente actividades ligeras y juegos tranquilos, siempre bajo" +
                                                  "\n supervisi�n, buscando alcanzar periodos de 30 a 60 minutos de actividad moderada en los d�as que se encuentre bien. Tambi�n es crucial el consumo" +
                                                  "\n diario de 3 a 3.5 Litros de agua al d�a (doce a catorce vasos de tama�o regular), o m�s si tiene fiebre o dificultad para tragar alimentos s�lidos," +
                                                  "\n para mantener una excelente hidrataci�n, lo cual es vital para su bienestar general, para ayudar a reducir la fiebre y para mantener las mucosas  " +
                                                  "\n hidratadas, aliviando la garganta. POSIBLE TRATAMIENTO: Para las paperas en ni�os de esta edad, el tratamiento es principalmente de soporte y para" +
                                                  "\n aliviar los s�ntomas, ya que es una infecci�n viral y no existen medicamentos espec�ficos para erradicar el virus. Se recomienda el reposo en cama," +
                                                  "\n la aplicaci�n de compresas fr�as o calientes en las gl�ndulas inflamadas para aliviar el dolor, y el uso de medicamentos para controlar la fiebre y" +
                                                  "\n el dolor, como el paracetamol (una marca com�n es Tempra o Tylenol) o el ibuprofeno (una marca com�n es Advil o Motrin). Es fundamental evitar el uso" +
                                                  "\n de aspirina en ni�os debido al riesgo de s�ndrome de Reye. Tambi�n es recomendable que el ni�o consuma alimentos que fortalezcan su sistema inmune y" +
                                                  "\n sean f�ciles de masticar y tragar debido a la hinchaz�n de las gl�ndulas salivales, tales como pur�s y alimentos blandos. Puede incluir caldos     " +
                                                  "\n nutritivos y sopas suaves que aportan hidrataci�n y energ�a. En cuanto a las frutas y verduras, la pi�a es una excelente opci�n, ya que contiene   " +
                                                  "\n bromelina, una enzima con propiedades antiinflamatorias que puede ayudar a reducir la hinchaz�n y el dolor, adem�s de Vitamina C (aproximadamente  " +
                                                  "\n 47.8 mg por cada 100 gramos, lo que representa cerca del 53% de la ingesta diaria recomendada para un ni�o de 4-8 a�os), esencial para el sistema  " +
                                                  "\n inmunol�gico. El mel�n, f�cil de digerir, es rico en Vitamina C (aproximadamente 36.7 mg por cada 100 gramos, que representa cerca del 41% de la   " +
                                                  "\n ingesta diaria recomendada para la misma edad) y Vitamina A, y tambi�n aporta una alta cantidad de agua, contribuyendo a la hidrataci�n. El pl�tano," +
                                                  "\n f�cil de digerir y rico en potasio (aproximadamente 358 mg por cada 100 gramos), un electrolito importante que ayuda a reponer las p�rdidas y aporta" +
                                                  "\n energ�a. Finalmente, el aguacate proporciona grasas saludables y diversas vitaminas (como la E y K) que apoyan la funci�n inmunol�gica y la salud  " +
                                                  "\n general. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por " +
                                                  "\n ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad" +
                                                  "\n en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar" +
                                                  "\n a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupci�n cut�nea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n Es recomendable que el ni�o, con una estatura de 1.65-1.80 m, durante la fase aguda de la enfermedad cuando puede presentar fiebre, dolor muscular" +
                                                  "\n y articular, mantenga un reposo adecuado y evite la actividad f�sica extenuante. A medida que sus s�ntomas mejoren y bajo supervisi�n, puede retomar" +
                                                  "\n gradualmente actividades ligeras y juegos tranquilos, buscando alcanzar periodos de 30 a 60 minutos de actividad moderada en los d�as que se encuentre" +
                                                  "\n bien, priorizando entornos donde se pueda minimizar la exposici�n a mosquitos. Tambi�n es crucial el consumo diario de 3 a 3.5 Litros de agua al d�a" +
                                                  "\n (doce a catorce vasos de tama�o regular), o m�s si tiene fiebre o v�mitos, para mantener una excelente hidrataci�n y prevenir la deshidrataci�n,    " +
                                                  "\n lo cual es vital para el bienestar general y el funcionamiento �ptimo de todos sus sistemas corporales durante la recuperaci�n.                     " +
                                                  "\n POSIBLE TRATAMIENTO: Para el Zika en ni�os de esta edad, el tratamiento es principalmente de soporte, ya que no existe un medicamento antiviral espec�fico" +
                                                  "\n para curar la infecci�n. El manejo se enfoca en aliviar los s�ntomas, lo que incluye el reposo, una buena hidrataci�n y el uso de medicamentos para  " +
                                                  "\n controlar la fiebre y el dolor, como el paracetamol (una marca com�n es Tempra o Tylenol). Es fundamental evitar el uso de aspirina y otros AINEs    " +
                                                  "\n (antiinflamatorios no esteroideos como el ibuprofeno) hasta que se descarte la posibilidad de dengue, debido al riesgo de complicaciones hemorr�gicas." +
                                                  "\n Tambi�n es crucial proteger al ni�o de nuevas picaduras de mosquitos durante la enfermedad para evitar la transmisi�n del virus a otras personas.    " +
                                                  "\n Adem�s, es recomendable que el ni�o consuma alimentos que fortalezcan su sistema inmune y le proporcionen energ�a, tales como caldos nutritivos y    " +
                                                  "\n sopas suaves que facilitan la hidrataci�n y son f�ciles de digerir. Las frutas tropicales como la papaya, que aporta una cantidad significativa de   " +
                                                  "\n Vitamina C (aproximadamente 60.9 mg por cada 100 gramos, lo que representa cerca del 68% de la ingesta diaria recomendada para un ni�o de 4-8 a�os)  " +
                                                  "\n y Vitamina A, y el mango, que tambi�n es rico en Vitamina C (aproximadamente 36.4 mg por cada 100 gramos, que representa cerca del 40% de la ingesta " +
                                                  "\n diaria recomendada para la misma edad) y antioxidantes, son excelentes para reforzar las defensas. El pl�tano, f�cil de digerir, es rico en potasio  " +
                                                  "\n (aproximadamente 358 mg por cada 100 gramos), un electrolito importante que ayuda a reponer las p�rdidas por fiebre o sudor. Las verduras de hoja verde" +
                                                  "\n oscuro como la espinaca, que provee Vitamina K, Vitamina A y hierro, contribuyen a la vitalidad y al buen funcionamiento general. Este es solo un    " +
                                                  "\n Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus   " +
                                                  "\n respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado" +
                                                  "\n de su paciente, adem�s por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su medico," +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, V�mitos, Deshidrataci�n, Dolor abdominal.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n Es recomendable que el ni�o, con una estatura de 1.65-1.80 m, mientras presente diarrea y v�mitos, limite la actividad f�sica a un reposo absoluto" +
                                                  "\n o muy suave, evitando cualquier esfuerzo que pueda empeorar la deshidrataci�n o el malestar gastrointestinal. La prioridad es conservar energ�a   " +
                                                  "\n para la recuperaci�n. A medida que los s�ntomas disminuyan y la hidrataci�n mejore, puede retomar gradualmente juegos tranquilos y actividades    " +
                                                  "\n de bajo impacto, siempre bajo supervisi�n, buscando alcanzar periodos de 30 a 60 minutos de actividad moderada en los d�as que se encuentre bien. " +
                                                  "\n Tambi�n es crucial el consumo diario de 3 a 3.5 Litros de agua al d�a (doce a catorce vasos de tama�o regular) en peque�as tomas frecuentes,      " +
                                                  "\n preferiblemente mediante soluciones de rehidrataci�n oral (como Electrolit pedi�trico o Pedialyte), para reponer los l�quidos y electrolitos      " +
                                                  "\n perdidos por la diarrea y el v�mito, lo cual es vital para prevenir la deshidrataci�n severa. POSIBLE TRATAMIENTO: Para el rotavirus en ni�os     " +
                                                  "\n de esta edad, el tratamiento es principalmente de soporte y se enfoca en la rehidrataci�n, ya que no existe un medicamento antiviral espec�fico   " +
                                                  "\n para el virus. La clave es prevenir y tratar la deshidrataci�n mediante la administraci�n de l�quidos y electrolitos. En casa, se pueden usar     " +
                                                  "\n soluciones de rehidrataci�n oral (SRO), y en casos de deshidrataci�n severa, puede ser necesaria la hospitalizaci�n para la administraci�n de     " +
                                                  "\n l�quidos por v�a intravenosa. Los medicamentos para detener la diarrea no suelen ser recomendados en ni�os con rotavirus. En cuanto a medicamentos" +
                                                  "\n para el malestar, el paracetamol (una marca com�n es Tempra o Tylenol) puede usarse para controlar la fiebre y aliviar las molestias, siempre bajo" +
                                                  "\n indicaci�n m�dica. Es fundamental la supervisi�n m�dica. Adem�s, es importante que el ni�o consuma alimentos que sean f�ciles de digerir y ayuden " +
                                                  "\n a la recuperaci�n de la flora intestinal, as� como nutrientes que apoyen la funci�n inmune, tales como arroz blanco o avena cocida, que aportan   " +
                                                  "\n energ�a y son suaves para el est�mago; caldos de pollo o vegetales desgrasados que contribuyen a la hidrataci�n y a la reposici�n de electrolitos." +
                                                  "\n El pl�tano, muy beneficioso por su contenido de potasio (aproximadamente 358 mg por cada 100 gramos), un electrolito clave que se pierde con la   " +
                                                  "\n diarrea y el v�mito, ayudando a normalizar los niveles y aportar energ�a de f�cil absorci�n. Tambi�n se recomienda el pur� de manzana (sin c�scara)," +
                                                  "\n que contiene pectina, una fibra soluble que puede ayudar a solidificar las heces y es suave para el sistema digestivo del ni�o. Otra verdura valiosa" +
                                                  "\n es la papa cocida y en pur�, la cual es una buena fuente de potasio y carbohidratos complejos, que son de f�cil digesti�n y aportan energ�a sin   " +
                                                  "\n irritar el intestino, favoreciendo la recuperaci�n. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que" +
                                                  "\n el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico" +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagnostico no le   " +
                                                  "\n satisface del todo se le recomienda mucho consultar a su medico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, N�useas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n Es recomendable que el ni�o, con una estatura de 1.65-1.80 m, durante la fase aguda de la enfermedad cuando puede presentar fiebre, diarrea o " +
                                                  "\n s�ntomas neurol�gicos, mantenga un reposo adecuado y evite cualquier actividad f�sica extenuante. El objetivo es preservar la energ�a y permitir" +
                                                  "\n que su cuerpo se recupere. A medida que los s�ntomas disminuyan y bajo supervisi�n m�dica, puede retomar gradualmente actividades tranquilas y de" +
                                                  "\n bajo impacto, buscando alcanzar periodos de 30 a 60 minutos de actividad moderada en los d�as que se encuentre bien. Tambi�n es crucial el consumo" +
                                                  "\n diario de 3 a 3.5 Litros de agua al d�a (doce a catorce vasos de tama�o regular), especialmente si presenta fiebre o diarrea, para mantener una  " +
                                                  "\n excelente hidrataci�n y reponer los l�quidos perdidos, lo cual es vital para el bienestar general y el funcionamiento �ptimo de sus sistemas     " +
                                                  "\n corporales mientras combate la infecci�n. POSIBLE TRATAMIENTO: Para la listeriosis en ni�os de esta edad, el tratamiento principal consiste en   " +
                                                  "\n la administraci�n de antibi�ticos, siendo la ampicilina (una marca com�n es Omnipen o Polycillin) o la penicilina (una marca com�n es Penprocilina" +
                                                  "\n o Bencilpenicilina S�dica) los m�s com�nmente utilizados, a menudo en combinaci�n con otros antibi�ticos como la gentamicina. La elecci�n, dosis y" +
                                                  "\n duraci�n del tratamiento deben ser estrictamente determinadas por un m�dico, y es fundamental completar el ciclo completo de antibi�ticos para    " +
                                                  "\n erradicar la bacteria y prevenir complicaciones serias, como la meningitis. En casos graves, puede requerirse hospitalizaci�n para la administraci�n" +
                                                  "\n intravenosa de medicamentos y monitoreo. Adem�s, es recomendable que el ni�o consuma alimentos que refuercen su sistema inmune y apoyen su        " +
                                                  "\n recuperaci�n general, priorizando aquellos que son f�ciles de digerir si presenta s�ntomas gastrointestinales. Estos incluyen prote�nas magras como" +
                                                  "\n el pollo cocido o el pescado (si su digesti�n lo permite), que aportan amino�cidos esenciales para la reparaci�n de tejidos y la producci�n de    " +
                                                  "\n c�lulas inmunes; caldos y sopas nutritivas que contribuyen a la hidrataci�n y al aporte de electrolitos. Tambi�n son beneficiosas frutas ricas en " +
                                                  "\n Vitamina C como la papaya, que contiene aproximadamente 60.9 mg por cada 100 gramos (cerca del 68% de la ingesta diaria recomendada para un ni�o " +
                                                  "\n de 4-8 a�os), y las naranjas, que aportan alrededor de 53.2 mg de Vitamina C por cada 100 gramos (cerca del 59% de la ingesta diaria recomendada  " +
                                                  "\n para la misma edad), ambas potentes antioxidantes que fortalecen las defensas del cuerpo. Las verduras cocidas en pur�, como la calabaza, que     " +
                                                  "\n aporta una buena cantidad de Vitamina A (alrededor de 369 �g por cada 100 gramos, lo que representa cerca del 74% de la ingesta diaria recomendada" +
                                                  "\n para un ni�o de 4-8 a�os), es crucial para la integridad de las mucosas y la funci�n inmunitaria, y la espinaca, que provee hierro y folato,      " +
                                                  "\n importantes para la formaci�n de gl�bulos rojos. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el" +
                                                  "\n paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico  " +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagnostico no le   " +
                                                  "\n satisface del todo se le recomienda mucho consultar a su medico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, V�mitos.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n Es recomendable que el ni�o, con una estatura de 1.65-1.80 m, durante la fase aguda de la enfermedad cuando presenta diarrea severa, dolor " +
                                                  "\n abdominal y fiebre, mantenga un reposo estricto, evitando cualquier actividad f�sica que pueda agravar la deshidrataci�n o el malestar gastrointestinal." +
                                                  "\n La prioridad es conservar energ�a. A medida que los s�ntomas disminuyan y la rehidrataci�n sea efectiva, puede retomar gradualmente juegos tranquilos y " +
                                                  "\n actividades de bajo impacto, siempre bajo supervisi�n, buscando alcanzar periodos de 30 a 60 minutos de actividad moderada en los d�as que se encuentre bien." +
                                                  "\n Tambi�n es crucial el consumo diario de 3 a 3.5 Litros de agua al d�a (doce a catorce vasos de tama�o regular) en peque�as y frecuentes tomas, preferiblemente" +
                                                  "\n soluciones de rehidrataci�n oral (como Electrolit pedi�trico o Pedialyte), para reponer los l�quidos y electrolitos perdidos por la diarrea y el v�mito, lo cual" +
                                                  "\n es vital para prevenir la deshidrataci�n severa y apoyar la funci�n renal durante la infecci�n. POSIBLE TRATAMIENTO: Para la shigelosis en ni�os de esta edad, " +
                                                  "\n el tratamiento principal es con antibi�ticos, ya que la shigelosis es una infecci�n bacteriana que puede ser grave. Los antibi�ticos m�s comunes para esta   " +
                                                  "\n condici�n incluyen la azitromicina (una marca com�n es Zithromax), o las cefalosporinas de tercera generaci�n como la ceftriaxona (una marca com�n es Rocephin)," +
                                                  "\n dependiendo de la resistencia bacteriana local. Es fundamental que el ni�o complete el ciclo completo de antibi�ticos tal como lo indique el m�dico, incluso si" +
                                                  "\n los s�ntomas mejoran, para erradicar la bacteria y evitar la propagaci�n. Adem�s del tratamiento antibi�tico, el manejo de la deshidrataci�n mediante soluciones" +
                                                  "\n de rehidrataci�n oral es esencial. Los medicamentos para frenar la diarrea generalmente no se recomiendan. Es importante tambi�n que el ni�o consuma alimentos " +
                                                  "\n que sean f�ciles de digerir, suaves para el sistema gastrointestinal y que aporten nutrientes para fortalecer su sistema inmune, como arroz blanco o avena cocida," +
                                                  "\n que son fuente de energ�a y suaves para el est�mago; caldos de pollo o vegetales desgrasados que contribuyen a la hidrataci�n y a la reposici�n de electrolitos.  " +
                                                  "\n El pl�tano, muy beneficioso por su contenido de potasio (aproximadamente 358 mg por cada 100 gramos), un electrolito clave que se pierde con la diarrea y el v�mito," +
                                                  "\n ayudando a normalizar los niveles y aportar energ�a de f�cil absorci�n. Tambi�n se recomienda el pur� de manzana (sin c�scara), que contiene pectina, una fibra   " +
                                                  "\n soluble que puede ayudar a solidificar las heces y es suave para el sistema digestivo del ni�o. Otra verdura valiosa es la papa cocida y en pur�, la cual es una  " +
                                                  "\n buena fuente de potasio y carbohidratos complejos, que son de f�cil digesti�n y aportan energ�a sin irritar el intestino, favoreciendo la recuperaci�n de la mucosa" +
                                                  "\n intestinal da�ada. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la" +
                                                  "\n enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado" +
                                                  "\n de su paciente, adem�s por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su medico, Angel L Montes agradece tu" +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos cr�nica, Producci�n excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad Pulmonar Obstructiva Cr�nica (EPOC)." +
                                                  "\n Es recomendable que el ni�o, con una estatura de 1.65-1.80 m, realice ejercicios de respiraci�n y actividades f�sicas de bajo impacto adaptadas a su capacidad pulmonar" +
                                                  "\n y estado general, bajo supervisi�n m�dica. Se deben evitar ambientes con humo o contaminantes, y priorizar actividades que no causen dificultad respiratoria excesiva. " +
                                                  "\n Caminatas cortas y suaves, juegos tranquilos o ejercicios de brazos que no agiten demasiado, pueden ser beneficiosos, buscando mantener la movilidad y la fuerza muscular" +
                                                  "\n sin agotar al ni�o, con el objetivo de alcanzar periodos de 30 a 60 minutos de actividad moderada en los d�as que se encuentre bien, pero siempre con periodos de descanso." +
                                                  "\n Tambi�n es crucial el consumo diario de 3 a 3.5 Litros de agua al d�a (doce a catorce vasos de tama�o regular) para mantener las secreciones pulmonares m�s fluidas y    " +
                                                  "\n facilitar su expectoraci�n, lo cual es vital para una mejor respiraci�n y para prevenir infecciones. POSIBLE TRATAMIENTO: Para la EPOC en ni�os (que es rara y a menudo  " +
                                                  "\n asociada a condiciones cong�nitas, exposiciones ambientales severas tempranas o infecciones recurrentes), el tratamiento se enfoca en manejar los s�ntomas, prevenir     " +
                                                  "\n exacerbaciones y mejorar la funci�n pulmonar. Esto incluye el uso de broncodilatadores (como el salbutamol, una marca com�n es Ventolin o Aerolin, para abrir las v�as   " +
                                                  "\n respiratorias), corticosteroides inhalados (como la fluticasona, una marca com�n es Flixotide, para reducir la inflamaci�n), y en algunos casos, oxigenoterapia si hay bajos" +
                                                  "\n niveles de ox�geno. La terapia respiratoria y la fisioterapia pulmonar son fundamentales. Es esencial la eliminaci�n de la exposici�n a irritantes pulmonares, como el humo " +
                                                  "\n de tabaco. Adem�s, es recomendable que el ni�o consuma alimentos que fortalezcan su sistema inmune y le proporcionen energ�a de manera sostenible, priorizando aquellos que " +
                                                  "\n no causen distensi�n abdominal que pueda dificultar la respiraci�n. Estos incluyen prote�nas magras como el pollo o el pescado, que aportan amino�cidos esenciales para la  " +
                                                  "\n reparaci�n de tejidos y el mantenimiento de la masa muscular, crucial en pacientes con EPOC; carbohidratos complejos de liberaci�n lenta como la avena o el arroz integral, " +
                                                  "\n que proporcionan energ�a sin picos gluc�micos; y una variedad de verduras de hoja verde oscuro como la acelga, que aporta Vitamina K, Vitamina A y antioxidantes, que pueden" +
                                                  "\n ayudar a reducir la inflamaci�n pulmonar, y el pimiento rojo, que ofrece una gran cantidad de Vitamina C (alrededor de 127.7 mg por cada 100 gramos, lo que representa cerca" +
                                                  "\n del 142% de la ingesta diaria recomendada para un ni�o de 4-8 a�os), esencial para la funci�n inmunol�gica y como antioxidante. Las frutas como las fresas, que contienen   " +
                                                  "\n cerca de 58.8 mg de Vitamina C por cada 100 gramos (aproximadamente el 65% de la ingesta diaria recomendada para la misma edad), y las manzanas, que contienen quercetina,  " +
                                                  "\n un flavonoide con propiedades antiinflamatorias que pueden ser �tiles para la salud pulmonar, tambi�n son beneficiosas. Este es solo un Diagn�stico predeterminado l�gico,  " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer   " +
                                                  "\n m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagnostico no le satisface" +
                                                  "\n del todo se le recomienda mucho consultar a su medico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreci�n anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n Es recomendable que el ni�o, con una estatura de 1.65-1.80 m, mientras recibe tratamiento, mantenga una actividad f�sica normal adaptada a su estado de salud, evitando cualquier" +
                                                  "\n molestia o irritaci�n en el �rea afectada si presenta s�ntomas. La Clamidia no suele afectar directamente la capacidad f�sica a largo plazo. Una vez que el tratamiento sea efectivo" +
                                                  "\n y los s�ntomas hayan desaparecido, puede seguir con la actividad f�sica recomendada para su edad, buscando idealmente periodos de 30 a 60 minutos de actividad moderada a intensa diaria." +
                                                  "\n Tambi�n es crucial el consumo diario de 3 a 3.5 Litros de agua al d�a (doce a catorce vasos de tama�o regular) para mantener una buena hidrataci�n, lo cual es fundamental para el    " +
                                                  "\n bienestar general, el funcionamiento �ptimo de sus sistemas corporales y para apoyar la eliminaci�n de los medicamentos del organismo. POSIBLE TRATAMIENTO: Para la clamidia en ni�os " +
                                                  "\n de esta edad, el tratamiento principal es con antibi�ticos, los cuales son muy efectivos para erradicar la infecci�n. La elecci�n y la dosis del antibi�tico ser�n determinadas       " +
                                                  "\n estrictamente por un m�dico, quien considerar� la edad y el peso del ni�o. Es fundamental completar el ciclo completo de antibi�ticos tal como se indique, incluso si los s�ntomas    " +
                                                  "\n mejoran, para asegurar la eliminaci�n total de la bacteria y prevenir reinfecciones o complicaciones. Los antibi�ticos com�nmente usados incluyen la azitromicina (una marca com�n es " +
                                                  "\n Zithromax) o la eritromicina (una marca com�n es Pneumo-E o Eritrobase). Es importante recordar que la clamidia en ni�os puede requerir una evaluaci�n m�dica inmediata, ya que en algunos" +
                                                  "\n casos puede ser indicativa de abuso. Adem�s, es recomendable que el ni�o consuma alimentos que fortalezcan su sistema inmune y apoyen la recuperaci�n general, como fuentes de probi�ticos" +
                                                  "\n (si son tolerados, como yogur natural si no hay contraindicaciones), que pueden ayudar a mantener un equilibrio saludable de la flora intestinal, especialmente despu�s de la administraci�n" +
                                                  "\n de antibi�ticos. Las frutas como las fresas, que contienen cerca de 58.8 mg de Vitamina C por cada 100 gramos (aproximadamente el 65% de la ingesta diaria recomendada para un ni�o       " +
                                                  "\n de 4-8 a�os), o las naranjas, que aportan alrededor de 53.2 mg de Vitamina C por cada 100 gramos (cerca del 59% de la ingesta diaria recomendada para la misma edad), son excelentes fuentes" +
                                                  "\n de esta vitamina, crucial para reforzar las defensas del cuerpo. Las verduras de hoja verde oscuro como la espinaca, rica en folato y Vitamina K, y el pimiento rojo, que provee Vitamina A" +
                                                  "\n y antioxidantes, tambi�n contribuyen a la vitalidad y al buen funcionamiento general del sistema inmune, favoreciendo la recuperaci�n. Este es solo un Diagn�stico predeterminado l�gico,  " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un        " +
                                                  "\n Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagnostico no le satisface del todo se le       " +
                                                  "\n recomienda mucho consultar a su medico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, N�useas, Dolor de cabeza severo, Rigidez en el cuello, Confusi�n.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n Es recomendable que el ni�o, con una estatura de 1.65-1.80 m, durante la fase aguda de la enfermedad, mantenga un reposo estricto en cama, ya que la meningitis es una condici�n grave" +
                                                  "\n que requiere m�nima estimulaci�n y m�xima conservaci�n de energ�a para la recuperaci�n cerebral y general del cuerpo. Cualquier actividad f�sica debe ser evitada por completo en este" +
                                                  "\n periodo. Una vez que la fase aguda haya pasado y bajo estricta supervisi�n m�dica, la rehabilitaci�n o la reintroducci�n gradual de movimientos muy suaves solo se realizar� si no hay " +
                                                  "\n secuelas. Tambi�n es crucial el consumo diario de 3 a 3.5 Litros de agua al d�a (doce a catorce vasos de tama�o regular) en tomas peque�as y frecuentes, preferiblemente por v�a intravenosa" +
                                                  "\n si el ni�o no puede beber, para mantener una hidrataci�n �ptima y asegurar el correcto funcionamiento de los �rganos, especialmente los ri�ones, que procesar�n los medicamentos, y para " +
                                                  "\n ayudar a controlar la fiebre. POSIBLE TRATAMIENTO: Para la meningitis bacteriana en ni�os de esta edad, el tratamiento es una emergencia m�dica y consiste en la administraci�n inmediata" +
                                                  "\n de antibi�ticos intravenosos de amplio espectro para combatir la infecci�n. La elecci�n del antibi�tico depender� de la edad del ni�o, el tipo de bacteria sospechada y los patrones de  " +
                                                  "\n resistencia locales, y ser� determinada por un m�dico especialista. Es vital que el tratamiento antibi�tico se inicie lo antes posible y se complete en su totalidad para prevenir       " +
                                                  "\n complicaciones graves como da�o cerebral, p�rdida de audici�n o incluso la muerte. Algunos antibi�ticos comunes incluyen la ceftriaxona (una marca com�n es Rocephin) o la ampicilina    " +
                                                  "\n (una marca com�n es Omnipen o Polycillin), a veces combinados con vancomicina (una marca com�n es Vancocin). Adem�s de los antibi�ticos, se pueden usar corticosteroides (como la dexametasona," +
                                                  "\n una marca com�n es Decadron) para reducir la inflamaci�n cerebral y prevenir secuelas neurol�gicas, siempre bajo indicaci�n m�dica. Es fundamental el monitoreo constante en un entorno  " +
                                                  "\n hospitalario. En cuanto a la alimentaci�n, una vez que el ni�o pueda tolerar la v�a oral, es recomendable que consuma alimentos que sean f�ciles de digerir y nutritivos para apoyar la  " +
                                                  "\n recuperaci�n del sistema nervioso y el fortalecimiento del sistema inmune. Esto incluye caldos y sopas suaves que aportan l�quidos y electrolitos; pur�s de verduras como la calabaza,   " +
                                                  "\n que aporta una buena cantidad de Vitamina A (alrededor de 369 �g por cada 100 gramos, lo que representa cerca del 74% de la ingesta diaria recomendada para un ni�o de 4-8 a�os), esencial" +
                                                  "\n para la recuperaci�n de las mucosas y la visi�n; y frutas blandas como el pl�tano, que aporta potasio (aproximadamente 358 mg por cada 100 gramos), un electrolito vital para la funci�n  " +
                                                  "\n nerviosa y muscular. Tambi�n son beneficiosos los alimentos ricos en antioxidantes como el aguacate, que provee grasas saludables y Vitamina E, que pueden proteger las c�lulas neuronales" +
                                                  "\n del da�o oxidativo. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus    " +
                                                  "\n respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud " +
                                                  "\n si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su medico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, P�rdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, P�rdida de apetito.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer C�ncer." +
                                                  "\n Es recomendable que el ni�o, con una estatura de 1.65-1.80 m, cuya actividad f�sica debe ser siempre supervisada y adaptada a su estado de salud, energ�a y fase del tratamiento oncol�gico," +
                                                  "\n mantenga periodos de descanso adecuados y evite cualquier actividad extenuante o que pueda comprometer su sistema inmune. Se deben priorizar actividades de bajo impacto que fomenten la    " +
                                                  "\n movilidad y el bienestar, como caminatas cortas y suaves, juegos tranquilos o ejercicios de estiramiento muy ligeros, siempre que el m�dico lo autorice y seg�n su tolerancia. El objetivo  " +
                                                  "\n es mantener la fuerza muscular y mejorar la calidad de vida sin sobrecargar su cuerpo, buscando alcanzar periodos de 30 a 60 minutos de actividad moderada en los d�as que se encuentre bien," +
                                                  "\n pero con flexibilidad y respetando sus l�mites. Tambi�n es crucial el consumo diario de 3 a 3.5 Litros de agua al d�a (doce a catorce vasos de tama�o regular), o m�s si tiene fiebre, v�mitos" +
                                                  "\n o diarrea como efectos secundarios del tratamiento, para mantener una excelente hidrataci�n, lo cual es vital para el funcionamiento �ptimo de sus �rganos, la eliminaci�n de toxinas y el    " +
                                                  "\n apoyo al metabolismo de los medicamentos. POSIBLE TRATAMIENTO: Para el c�ncer en ni�os de esta edad, el tratamiento es altamente individualizado y complejo, dependiendo del tipo espec�fico  " +
                                                  "\n de c�ncer, su etapa y la salud general del ni�o. Generalmente, implica una combinaci�n de quimioterapia (medicamentos que matan las c�lulas cancerosas, como la vincristina, una marca com�n  " +
                                                  "\n es Oncovin, o el ciclofosfamida, una marca com�n es Cytoxan), radioterapia (uso de radiaci�n para destruir c�lulas cancerosas), cirug�a (para extirpar tumores), e incluso inmunoterapia o    " +
                                                  "\n terapia dirigida. Es fundamental que el tratamiento sea manejado por un equipo multidisciplinario de onc�logos pedi�tricos. Adem�s del tratamiento oncol�gico, se utilizan medicamentos de    " +
                                                  "\n soporte para manejar los efectos secundarios, como antiem�ticos para las n�useas (como el ondansetr�n, una marca com�n es Zofran), analg�sicos para el dolor (como el paracetamol, una marca  " +
                                                  "\n com�n es Tempra o Tylenol), y factores estimulantes de colonias para apoyar la m�dula �sea. En cuanto a la alimentaci�n, es recomendable que el ni�o consuma alimentos que fortalezcan su     " +
                                                  "\n sistema inmune, le proporcionen energ�a y le ayuden a tolerar mejor el tratamiento, priorizando aquellos que sean nutritivos y de f�cil digesti�n. Esto incluye prote�nas de alto valor biol�gico" +
                                                  "\n (pollo, pescado, huevos, legumbres) que son esenciales para la reparaci�n celular y el mantenimiento de la masa muscular, crucial durante y despu�s de la quimioterapia. Las verduras de hoja " +
                                                  "\n verde oscuro como la col rizada (kale), que aporta Vitamina K, Vitamina A y antioxidantes, que pueden ayudar a reducir la inflamaci�n y proteger las c�lulas, y el pimiento rojo, que ofrece  " +
                                                  "\n una gran cantidad de Vitamina C (alrededor de 127.7 mg por cada 100 gramos, lo que representa cerca del 142% de la ingesta diaria recomendada para un ni�o de 4-8 a�os), esencial para la     " +
                                                  "\n funci�n inmunol�gica. Las frutas de colores vivos como la granada, rica en antioxidantes (como punicalaginas) que pueden ofrecer propiedades protectoras, y las uvas, que contienen resveratrol," +
                                                  "\n un compuesto con potencial antiinflamatorio. El aguacate proporciona grasas saludables y Vitamina E, importantes para la energ�a y la salud general. Este es solo un Diagn�stico predeterminado " +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un     " +
                                                  "\n Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda " +
                                                  "\n mucho consultar a su medico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                        }
                
                        if(EstaturaMasculino.equals("1.55-1.70 m")){
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n Es recomendable que el ni�o, con una estatura de 1.55-1.70 m, realice cerca de 60 minutos de actividad f�sica moderada a         " +
                                                  "\n intensa diaria, incluyendo juegos activos o deportes, siempre adaptando la intensidad a su estado de salud general durante       " +
                                                  "\n el periodo de enfermedad. Esto es crucial para mantener un sistema inmune fuerte. Tambi�n es recomendable el consumo diario      " +
                                                  "\n de 2.5 a 3 Litros de agua al d�a (diez a doce vasos de tama�o regular) para mantener una excelente hidrataci�n, lo cual          " +
                                                  "\n ayuda a fluidificar las secreciones respiratorias y a controlar la fiebre. POSIBLE TRATAMIENTO: Para la gripe en ni�os de        " +
                                                  "\n esta edad, el tratamiento suele incluir; medicamentos para reducir la fiebre y aliviar los s�ntomas, como el paracetamol         " +
                                                  "\n (una marca com�n es Tempra o Tylenol) o el ibuprofeno (una marca com�n es Advil o Motrin). En algunos casos, si se diagnostica   " +
                                                  "\n a tiempo (dentro de las primeras 48 horas de los s�ntomas), el m�dico puede prescribir antivirales espec�ficos contra la gripe   " +
                                                  "\n como el oseltamivir (una marca com�n es Tamiflu). Es fundamental seguir las indicaciones del m�dico al pie de la letra. Tambi�n  " +
                                                  "\n es recomendable que el ni�o consuma alimentos que fortalezcan su sistema inmune y aporten nutrientes para la recuperaci�n,         " +
                                                  "\n tales como frutas ricas en Vitamina C como las guayabas, que contienen una cantidad muy alta de esta vitamina (alrededor de        " +
                                                  "\n 228.3 mg por cada 100 gramos, lo que representa cerca del 254% de la ingesta diaria recomendada para un ni�o de 4-8 a�os),         " +
                                                  "\n o las naranjas, que aportan aproximadamente 53.2 mg por cada 100 gramos (cerca del 59% de la ingesta diaria recomendada para       " +
                                                  "\n la misma edad), ambos potentes antioxidantes que apoyan las defensas del cuerpo. Tambi�n son beneficiosos los vegetales de hoja    " +
                                                  "\n verde oscuro como el kale (col rizada), que provee Vitamina A y Vitamina K, importantes para la salud de las mucosas y la funci�n  " +
                                                  "\n inmune; y el jengibre, que puede consumirse en infusiones y posee propiedades antiinflamatorias que pueden ayudar a aliviar el     " +
                                                  "\n malestar. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa     " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de   " +
                                                  "\n Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del         " +
                                                  "\n Diagnostico no le satisface del todo se le recomienda mucho consultar a su medico, Angel L Montes agradece tu visita a la app      " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                               textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumon�a." +
                                                  "\n Es recomendable que el ni�o, con una estatura de 1.55-1.70 m, realice actividad f�sica moderada seg�n su capacidad y estado de recuperaci�n, siempre supervisada y evitando esfuerzos" +
                                                  "\n excesivos o juegos que agiten demasiado sus v�as respiratorias, especialmente si a�n presenta s�ntomas. Una vez que su condici�n mejore, puede retomar gradualmente actividades como " +
                                                  "\n caminatas al aire libre, bicicleta o juegos tranquilos, buscando cerca de 60 minutos de actividad f�sica moderada a intensa diaria. Tambi�n es crucial el consumo diario de 2.5 a 3  " +
                                                  "\n Litros de agua al d�a (diez a doce vasos de tama�o regular), especialmente si tiene fiebre, para ayudar a fluidificar las secreciones pulmonares y prevenir la deshidrataci�n, facilitando" +
                                                  "\n su expectoraci�n. POSIBLE TRATAMIENTO: Para la neumon�a en ni�os de esta edad, el tratamiento suele incluir; antibi�ticos (si la causa es bacteriana, como la amoxicilina, una marca com�n" +
                                                  "\n es Amoxil o Clamoxil, o la azitromicina, una marca com�n es Zithromax, siempre bajo prescripci�n m�dica estricta), medicamentos para reducir la fiebre y aliviar el dolor (como el   " +
                                                  "\n paracetamol, una marca com�n es Tempra o Tylenol, o el ibuprofeno, una marca com�n es Advil o Motrin), y en algunos casos, oxigenoterapia si la saturaci�n de ox�geno es baja. Es    " +
                                                  "\n fundamental seguir las indicaciones del m�dico al pie de la letra y completar el ciclo de antibi�ticos aunque el ni�o parezca mejor. Tambi�n es recomendable que el ni�o consuma     " +
                                                  "\n alimentos que fortalezcan su sistema inmune y le aporten energ�a, tales como caldos nutritivos y sopas suaves que, adem�s de ser f�ciles de digerir, contribuyen a la hidrataci�n    " +
                                                  "\n y al aporte de electrolitos. Las verduras de hoja verde oscuro como el kale (col rizada), que aporta Vitamina A y Vitamina K, o el pimiento rojo, que ofrece una gran cantidad de    " +
                                                  "\n Vitamina C (alrededor de 127.7 mg por cada 100 gramos, lo que representa cerca del 142% de la ingesta diaria recomendada para un ni�o de 4-8 a�os), son excelentes fuentes de antioxidantes" +
                                                  "\n que apoyan la salud pulmonar. Las frutas como las fresas, que contienen cerca de 58.8 mg de Vitamina C por cada 100 gramos (aproximadamente el 65% de la ingesta diaria recomendada  " +
                                                  "\n para la misma edad), y las papayas, que ofrecen aproximadamente 60.9 mg de Vitamina C por cada 100 gramos (alrededor del 68% de la ingesta diaria recomendada para la misma edad),   " +
                                                  "\n son cruciales para reforzar el sistema inmunol�gico. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad " +
                                                  "\n y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado" +
                                                  "\n de su paciente, adem�s por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su medico, Angel L Montes agradece tu visita a la app" +
                                                  "\n (Mi Vida) y espera que te mejores."); 
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visi�n borrosa, P�rdida de peso.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n Es recomendable que el ni�o, con una estatura de 1.55-1.70 m, realice cerca de 60 minutos de actividad f�sica moderada a intensa diaria, como juegos activos, deportes o paseos" +
                                                  "\n en bicicleta, adapt�ndose siempre a su estado de salud y bajo supervisi�n. Esta actividad es crucial para el control del az�car en sangre, mejorar la sensibilidad a la insulina" +
                                                  "\n y mantener un peso saludable, fundamentales en el manejo de la diabetes. Tambi�n es fundamental el consumo diario de 2.5 a 3 Litros de agua al d�a (diez a doce vasos de tama�o " +
                                                  "\n regular), priorizando el agua natural sobre bebidas azucaradas, para mantener una hidrataci�n adecuada y ayudar a los ri�ones a procesar el exceso de glucosa.                  " +
                                                  "\n POSIBLE TRATAMIENTO: Para la diabetes en ni�os de esta edad, el tratamiento suele incluir; manejo de la insulina (en caso de diabetes tipo 1, se requiere insulina inyectada para" +
                                                  "\n controlar los niveles de glucosa, por ejemplo, insulina glargina, una marca com�n es Lantus, o insulina aspart, una marca com�n es Novolog), medicamentos orales (para diabetes " +
                                                  "\n tipo 2, como la metformina, una marca com�n es Glucophage o Dianben, siempre bajo prescripci�n m�dica), y un monitoreo constante de los niveles de glucosa en sangre con un gluc�metro." +
                                                  "\n Es vital seguir un plan de alimentaci�n saludable y equilibrado, as� como un control m�dico regular con un endocrin�logo pedi�trico. Tambi�n es recomendable que el ni�o consuma" +
                                                  "\n alimentos que ayuden a la regulaci�n del az�car y fortalezcan su sistema inmune, tales como verduras no almidonadas como la col rizada (kale), rica en fibra y Vitamina C, o la " +
                                                  "\n espinaca, que aporta Magnesio y Vitamina K, nutrientes importantes para el metabolismo de la glucosa. Frutas con moderaci�n como las manzanas y las peras, que son ricas en fibra" +
                                                  "\n (aproximadamente 2.4 gramos de fibra por cada 100 gramos en una manzana con c�scara) y antioxidantes, contribuyen a una liberaci�n m�s lenta de az�cares en la sangre. Las bayas " +
                                                  "\n (ar�ndanos, moras) son tambi�n excelentes por su bajo �ndice gluc�mico y alto contenido de antioxidantes, con los ar�ndanos conteniendo alrededor de 14 mg de Vitamina C por cada" +
                                                  "\n 100 gramos (aproximadamente el 16% de la ingesta diaria recomendada para un ni�o de 4-8 a�os). Las prote�nas magras como el pollo, el pescado y las legumbres (lentejas, garbanzos)" +
                                                  "\n son importantes para mantener la saciedad y el control gluc�mico. Los granos integrales como la avena y el pan integral proporcionan fibra y energ�a sostenida, ayudando a evitar" +
                                                  "\n picos de az�car en sangre. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la     " +
                                                  "\n enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su     " +
                                                  "\n paciente, adem�s por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su medico, Angel L Montes agradece tu visita a la app  " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresi�n en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n Es recomendable que el ni�o, con una estatura de 1.55-1.70 m, realice actividad f�sica de forma controlada y supervisada, con calentamiento previo y enfriamiento posterior," +
                                                  "\n evitando desencadenantes conocidos del asma (como al�rgenos, aire fr�o o contaminado, o actividad f�sica muy intensa sin preparaci�n) y haciendo pausas si presenta s�ntomas." +
                                                  "\n La cantidad de ejercicio debe ser adaptada a su capacidad y a la presencia de s�ntomas, pudiendo ser periodos de 30 a 60 minutos de actividad moderada en los d�as que se   " +
                                                  "\n encuentre bien, pero siempre consultando al m�dico para un plan seguro y ajustado. Tambi�n es crucial el consumo diario de 2.5 a 3 Litros de agua al d�a (diez a doce vasos " +
                                                  "\n de tama�o regular) para ayudar a mantener las v�as respiratorias hidratadas y las secreciones m�s fluidas, lo que facilita la respiraci�n y puede prevenir el estrechamiento" +
                                                  "\n de los bronquios. POSIBLE TRATAMIENTO: Para el asma en ni�os de esta edad, el tratamiento suele incluir; broncodilatadores de alivio r�pido (para abrir las v�as respiratorias" +
                                                  "\n durante un ataque, como el salbutamol, una marca com�n es Ventolin o Aerolin), corticosteroides inhalados (para el control a largo plazo y reducir la inflamaci�n cr�nica de" +
                                                  "\n las v�as respiratorias, como la fluticasona, una marca com�n es Flixotide, o la budesonida, una marca com�n es Pulmicort), y en algunos casos, modificadores de leucotrienos" +
                                                  "\n (como el montelukast, una marca com�n es Singulair), que ayudan a controlar la inflamaci�n y los s�ntomas. Es fundamental seguir estrictamente el plan de acci�n para el asma" +
                                                  "\n indicado por el m�dico, usar los medicamentos preventivos regularmente y acudir a revisiones peri�dicas. Tambi�n es recomendable que el ni�o consuma alimentos que puedan ayudar" +
                                                  "\n a reducir la inflamaci�n y fortalecer el sistema inmune, tales como pescados grasos (salm�n, at�n), ricos en �cidos grasos Omega-3, que poseen propiedades antiinflamatorias que" +
                                                  "\n pueden ser beneficiosas para las v�as respiratorias. Una amplia variedad de frutas y verduras de colores vivos, como los ar�ndanos, con su alto contenido de antioxidantes que " +
                                                  "\n protegen las c�lulas; la espinaca, que aporta Magnesio, un mineral que puede ayudar a relajar los m�sculos bronquiales, y Vitamina K; y el pimiento rojo, que ofrece una gran  " +
                                                  "\n cantidad de Vitamina C (alrededor de 127.7 mg por cada 100 gramos, lo que representa cerca del 142% de la ingesta diaria recomendada para un ni�o de 4-8 a�os), esencial para la" +
                                                  "\n funci�n inmunol�gica. Tambi�n se beneficia de manzanas, que contienen quercetina, un flavonoide con propiedades antiinflamatorias que puede ser �til para la salud pulmonar.   " +
                                                  "\n Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas  " +
                                                  "\n est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud " +
                                                  "\n si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su medico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, P�rdida de peso, Ganglios linf�ticos inflamados, Erupci�n cut�nea (Diarrea).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n Es recomendable que el ni�o, con una estatura de 1.55-1.70 m, realice actividad f�sica moderada y adaptada a su estado de salud, bajo supervisi�n m�dica para evitar el" +
                                                  "\n agotamiento y proteger su sistema inmune, y siempre evitando deportes de contacto o actividades con alto riesgo de lesiones si su sistema inmune est� comprometido. La " +
                                                  "\n actividad debe ser gradual, buscando idealmente periodos de 30 a 60 minutos de actividad moderada en los d�as que se encuentre bien, adapt�ndose a su energ�a y tolerando" +
                                                  "\n periodos de descanso. Tambi�n es crucial el consumo diario de 2.5 a 3 Litros de agua al d�a (diez a doce vasos de tama�o regular) para mantener una buena hidrataci�n, " +
                                                  "\n fundamental para el bienestar general, el funcionamiento del cuerpo y el metabolismo de los medicamentos antirretrovirales. POSIBLE TRATAMIENTO: Para el VIH/SIDA en ni�os" +
                                                  "\n de esta edad, el tratamiento principal es la terapia antirretroviral (TARV), que incluye una combinaci�n de medicamentos que trabajan para controlar la replicaci�n del" +
                                                  "\n virus, mejorar la funci�n inmunol�gica y prevenir el desarrollo de infecciones oportunistas. Estos medicamentos se eligen y ajustan espec�ficamente por un m�dico      " +
                                                  "\n especialista en VIH pedi�trico, y es vital la adherencia estricta al r�gimen. Algunos ejemplos de medicamentos usados en TARV incluyen inhibidores de la transcriptasa " +
                                                  "\n inversa an�logos de nucle�sidos (como Zidovudina, o Retrovir), inhibidores de la transcriptasa inversa no an�logos de nucle�sidos (como Efavirenz, o Sustiva), e       " +
                                                  "\n inhibidores de la proteasa (como Lopinavir/Ritonavir, o Kaletra). El tratamiento tambi�n incluye el manejo y prevenci�n de infecciones oportunistas con antibi�ticos   " +
                                                  "\n profil�cticos (como el trimetoprim/sulfametoxazol, o Bactrim) para proteger contra ciertas infecciones. Es fundamental el seguimiento m�dico constante. Tambi�n es     " +
                                                  "\n recomendable que el ni�o consuma alimentos que refuercen el sistema inmune, proporcionen energ�a y ayuden a mantener un peso saludable, tales como prote�nas de alto   " +
                                                  "\n valor biol�gico (pollo, pescado, huevos, legumbres) que son cruciales para la reparaci�n de tejidos y la funci�n inmune; l�cteos y alternativas enriquecidas con calcio" +
                                                  "\n y vitamina D para la salud �sea, la cual puede verse afectada por el virus o algunos tratamientos. Una amplia variedad de frutas y verduras de colores vivos, como los " +
                                                  "\n ar�ndanos, ricos en antioxidantes que protegen las c�lulas; las naranjas, que aportan una cantidad significativa de Vitamina C (alrededor de 53.2 mg por cada 100 gramos," +
                                                  "\n lo que representa cerca del 59% de la ingesta diaria recomendada para un ni�o de 4-8 a�os), esencial para el sistema inmunitario; y el pimiento rojo, que contiene     " +
                                                  "\n incluso m�s Vitamina C (aproximadamente 127.7 mg por cada 100 gramos, lo que representa cerca del 142% de la ingesta diaria recomendada para la misma edad), y las     " +
                                                  "\n espinacas, que contienen hierro y Vitamina A, importantes para la producci�n de c�lulas sangu�neas y la funci�n inmune, son igualmente beneficiosas. Adem�s, los granos" +
                                                  "\n integrales como la avena y el arroz integral, que proveen fibra y energ�a sostenida, son importantes para una nutrici�n adecuada. Este es solo un Diagn�stico predeterminado" +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda" +
                                                  "\n hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagnostico no le" +
                                                  "\n satisface del todo se le recomienda mucho consultar a su medico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreci�n anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n Es recomendable que el ni�o, con una estatura de 1.55-1.70 m, realice actividad f�sica moderada y adaptada a su estado de salud, sin forzar su cuerpo. Dado que la gonorrea no" +
                                                  "\n suele afectar directamente la capacidad f�sica a largo plazo (una vez tratada), en cuanto se sienta mejor y el m�dico lo autorice, puede buscar idealmente periodos de 30 a 60" +
                                                  "\n minutos de actividad moderada a intensa diaria. Durante la infecci�n y el tratamiento, la actividad puede ser m�s ligera, como paseos cortos. Tambi�n es crucial el consumo diario" +
                                                  "\n de 2.5 a 3 Litros de agua al d�a (diez a doce vasos de tama�o regular) para mantener una buena hidrataci�n, fundamental para apoyar el proceso de recuperaci�n del cuerpo y el" +
                                                  "\n funcionamiento adecuado de los ri�ones, que procesar�n los medicamentos. POSIBLE TRATAMIENTO: Para la gonorrea en ni�os de esta edad, el tratamiento es estrictamente con antibi�ticos," +
                                                  "\n siempre bajo la supervisi�n y prescripci�n de un m�dico. La elecci�n y dosis del antibi�tico depender�n de la edad, peso y la cepa espec�fica de la bacteria. Es vital que se complete" +
                                                  "\n el ciclo de antibi�ticos tal como lo indique el profesional de la salud para asegurar la erradicaci�n total de la infecci�n y prevenir complicaciones. Ejemplos de antibi�ticos" +
                                                  "\n utilizados incluyen ceftriaxona (una marca com�n es Rocephin) administrada por inyecci�n, o azitromicina (una marca com�n es Zithromax) administrada oralmente. Es importante recordar" +
                                                  "\n que la gonorrea en ni�os requiere una evaluaci�n m�dica inmediata, ya que puede tener implicaciones serias y, en algunos casos, puede ser indicativa de abuso. Adem�s, es recomendable" +
                                                  "\n que el ni�o consuma alimentos que fortalezcan su sistema inmune y contribuyan a su recuperaci�n general, como una amplia variedad de frutas y verduras frescas. Por ejemplo, el mango," +
                                                  "\n que aporta Vitamina C (aproximadamente 36.4 mg por cada 100 gramos, lo que representa cerca del 40% de la ingesta diaria recomendada para un ni�o de 4-8 a�os) y Vitamina A, esenciales" +
                                                  "\n para la funci�n inmunol�gica; o el pimiento rojo, que contiene una cantidad muy elevada de Vitamina C (alrededor de 127.7 mg por cada 100 gramos, lo que representa cerca del 142% de la" +
                                                  "\n ingesta diaria recomendada para la misma edad). Las verduras de hoja verde oscuro como la espinaca, que proveen Vitamina K, Vitamina A y antioxidantes, que apoyan la salud general, " +
                                                  "\n tambi�n son beneficiosas. Las prote�nas magras como el pollo, el pescado y las legumbres son esenciales para la reparaci�n de tejidos y el mantenimiento de la energ�a, y los granos " +
                                                  "\n integrales como la avena y el arroz integral, proveen fibra y energ�a sostenida para una buena digesti�n y vitalidad. Este es solo un Diagn�stico predeterminado l�gico, haberlo     " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico" +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda " +
                                                  "\n mucho consultar a su medico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linf�ticos inflamados, �lceras o llagas dolorosas, Picaz�n o ardor, Dolor al orinar.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n Es recomendable que el ni�o, con una estatura de 1.55-1.70 m, realice actividad f�sica suave y de bajo impacto adaptada a su nivel de dolor y la condici�n de sus articulaciones," +
                                                  "\n siempre evitando actividades que puedan irritar las lesiones si estas est�n presentes, como el roce excesivo o la sudoraci�n intensa en el �rea afectada. Una vez que las lesiones" +
                                                  "\n remitan, puede retomar gradualmente la actividad f�sica normal para su edad, buscando idealmente periodos de 30 a 60 minutos de actividad moderada a intensa diaria, siempre bajo" +
                                                  "\n supervisi�n. Tambi�n es crucial el consumo diario de 2.5 a 3 Litros de agua al d�a (diez a doce vasos de tama�o regular) para mantener una buena hidrataci�n, lo cual es fundamental" +
                                                  "\n para el bienestar general, el funcionamiento �ptimo del sistema inmune y la eliminaci�n de toxinas. POSIBLE TRATAMIENTO: Para el herpes genital en ni�os de esta edad, el tratamiento" +
                                                  "\n principal consiste en medicamentos antivirales que ayudan a controlar el brote, reducir la intensidad y duraci�n de los s�ntomas, y prevenir futuras recurrencias, aunque no eliminan" +
                                                  "\n el virus del cuerpo. Es fundamental que estos medicamentos sean prescritos y supervisados por un m�dico, quien determinar� la dosis adecuada seg�n la edad y el peso del ni�o. Algunos" +
                                                  "\n ejemplos de medicamentos antivirales utilizados incluyen Aciclovir (una marca com�n es Zovirax), Valaciclovir (una marca com�n es Valtrex), y Famciclovir (una marca com�n es Famvir)." +
                                                  "\n Adem�s del tratamiento antiviral, es importante mantener una higiene adecuada de las lesiones y evitar tocarlas para prevenir la propagaci�n. Tambi�n es recomendable que el ni�o   " +
                                                  "\n consuma alimentos que fortalezcan su sistema inmune y ayuden a la cicatrizaci�n, tales como alimentos ricos en lisina y bajos en arginina, ya que la lisina puede inhibir la replicaci�n" +
                                                  "\n del virus del herpes, presentes en l�cteos, pescado y pollo, que aportan prote�nas esenciales y Vitamina D (importante para la funci�n inmune). Una variedad de frutas y verduras,  " +
                                                  "\n como el pimiento rojo, que contiene una cantidad muy elevada de Vitamina C (alrededor de 127.7 mg por cada 100 gramos, lo que representa cerca del 142% de la ingesta diaria recomendada" +
                                                  "\n para un ni�o de 4-8 a�os), o las fresas, con cerca de 58.8 mg de Vitamina C por cada 100 gramos (aproximadamente el 65% de la ingesta diaria recomendada para la misma edad), son   " +
                                                  "\n excelentes fuentes de antioxidantes que apoyan la reparaci�n celular y el fortalecimiento de las defensas del cuerpo. Tambi�n se beneficia de las verduras de hoja verde oscuro como" +
                                                  "\n la espinaca, que provee hierro y folato. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello" +
                                                  "\n la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente," +
                                                  "\n adem�s por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su medico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera " +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, �lceras indoloras, Erupci�n cut�nea, Dolor de cabeza, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer S�filis." +
                                                  "\n Es recomendable que el ni�o, con una estatura de 1.55-1.70 m, realice actividad f�sica moderada y adaptada a su estado de salud, especialmente si la s�filis ha afectado alguna" +
                                                  "\n articulaci�n o hueso, o si presenta fatiga. Durante el tratamiento y la recuperaci�n, la actividad debe ser supervisada, buscando idealmente periodos de 30 a 60 minutos de    " +
                                                  "\n actividad moderada en los d�as que se encuentre bien, pero siempre con precauci�n y escuchando las se�ales del cuerpo. Tambi�n es crucial el consumo diario de 2.5 a 3 Litros  " +
                                                  "\n de agua al d�a (diez a doce vasos de tama�o regular) para mantener una buena hidrataci�n, fundamental para el funcionamiento �ptimo del cuerpo y el proceso de eliminaci�n de  " +
                                                  "\n toxinas durante el tratamiento. POSIBLE TRATAMIENTO: Para la s�filis en ni�os de esta edad, el tratamiento principal y m�s efectivo es con antibi�ticos, siendo la penicilina  " +
                                                  "\n el medicamento de elecci�n. La dosis y la duraci�n del tratamiento ser�n determinadas estrictamente por un m�dico, y es fundamental completar el ciclo completo para asegurar  " +
                                                  "\n la erradicaci�n de la infecci�n y prevenir complicaciones a largo plazo. En casos de alergia a la penicilina, el m�dico puede considerar otras opciones como la ceftriaxona    " +
                                                  "\n (una marca com�n es Rocephin). Es vital un seguimiento m�dico cercano despu�s del tratamiento para confirmar la curaci�n. Tambi�n es recomendable que el ni�o consuma alimentos" +
                                                  "\n que fortalezcan su sistema inmune y apoyen la recuperaci�n general, como prote�nas magras (pollo, pescado, legumbres) que son cruciales para la reparaci�n de tejidos y la     " +
                                                  "\n producci�n de c�lulas inmunes; as� como una amplia variedad de frutas y verduras frescas. Por ejemplo, el pimiento rojo, que aporta una gran cantidad de Vitamina C (alrededor " +
                                                  "\n de 127.7 mg por cada 100 gramos, lo que representa cerca del 142% de la ingesta diaria recomendada para un ni�o de 4-8 a�os), importante para la inmunidad. La espinaca, rica  " +
                                                  "\n en folato (una vitamina B esencial para la divisi�n celular y la formaci�n de gl�bulos rojos, lo cual es importante si hay anemia asociada a la s�filis), y Vitamina A, tambi�n" +
                                                  "\n contribuye a la salud general. Las naranjas, con su alto contenido de Vitamina C (aproximadamente 53.2 mg por cada 100 gramos, que representa cerca del 59% de la ingesta      " +
                                                  "\n diaria recomendada para la misma edad), son excelentes para reforzar las defensas, y los ar�ndanos son ricos en antioxidantes que protegen las c�lulas del da�o. Este es       " +
                                                  "\n solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n    " +
                                                  "\n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si    " +
                                                  "\n la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su medico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, P�rdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n Es recomendable que el ni�o, con una estatura de 1.55-1.70 m, realice actividad f�sica moderada y adaptada a su estado de salud y nivel de energ�a, especialmente durante" +
                                                  "\n la fase activa de la enfermedad y el tratamiento, cuando puede experimentar fatiga y dificultad respiratoria. Se deben evitar actividades extenuantes y priorizar el reposo" +
                                                  "\n adecuado. A medida que su condici�n mejore, puede retomar gradualmente juegos ligeros, caminatas cortas o ejercicios de estiramiento, siempre bajo supervisi�n m�dica,    " +
                                                  "\n buscando alcanzar periodos de 30 a 60 minutos de actividad moderada en los d�as que se encuentre bien, adapt�ndose a su tolerancia. Tambi�n es crucial el consumo diario  " +
                                                  "\n de 2.5 a 3 Litros de agua al d�a (diez a doce vasos de tama�o regular) para mantener una excelente hidrataci�n, lo cual es vital para el funcionamiento general del cuerpo," +
                                                  "\n la eliminaci�n de desechos y el apoyo a los �rganos que metabolizan los medicamentos antituberculosos. POSIBLE TRATAMIENTO: Para la tuberculosis en ni�os de esta edad, el " +
                                                  "\n tratamiento es un r�gimen prolongado de antibi�ticos antituberculosos, que se administra bajo estricta supervisi�n m�dica. Es absolutamente esencial que el ni�o complete  " +
                                                  "\n el curso completo del tratamiento, que puede durar varios meses, para erradicar la bacteria y prevenir la aparici�n de cepas resistentes. Los medicamentos comunes incluyen" +
                                                  "\n Isoniazida (una marca com�n es Laniazid), Rifampicina (una marca com�n es Rifadin), Pirazinamida y Etambutol. La combinaci�n y dosis exactas ser�n determinadas por el m�dico." +
                                                  "\n Es fundamental un seguimiento m�dico constante para monitorear la respuesta al tratamiento y los posibles efectos secundarios. Tambi�n es recomendable que el ni�o consuma " +
                                                  "\n alimentos que fortalezcan su sistema inmune y le proporcionen la energ�a y nutrientes necesarios para combatir la infecci�n y apoyar el tratamiento, como prote�nas de alto" +
                                                  "\n valor biol�gico (huevo, pollo, pescado, legumbres) que son cruciales para la reparaci�n de tejidos y la producci�n de c�lulas inmunes. Las verduras de hoja verde oscuro   " +
                                                  "\n como la espinaca, que aporta Magnesio, hierro y folato (importante para la formaci�n de gl�bulos rojos, que pueden verse afectados por la TB o sus tratamientos); y las    " +
                                                  "\n zanahorias, una excelente fuente de Vitamina A (alrededor de 835 �g por cada 100 gramos, lo que representa cerca del 167% de la ingesta diaria recomendada para un ni�o    " +
                                                  "\n de 4-8 a�os), esencial para la salud de las mucosas respiratorias y la funci�n inmune, son altamente beneficiosas. Las frutas como el mango, que aporta Vitamina C         " +
                                                  "\n (aproximadamente 36.4 mg por cada 100 gramos, lo que representa cerca del 40% de la ingesta diaria recomendada para un ni�o de 4-8 a�os) y Vitamina A, as� como el kiwi,   " +
                                                  "\n rico en Vitamina C (aproximadamente 92.7 mg por cada 100 gramos, que representa cerca del 103% de la ingesta diaria recomendada para la misma edad), son cruciales para    " +
                                                  "\n reforzar el sistema inmunol�gico y actuar como antioxidantes. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente   " +
                                                  "\n tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor   " +
                                                  "\n seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su    " +
                                                  "\n medico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchaz�n en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n Es recomendable que el ni�o, con una estatura de 1.55-1.70 m, realice actividad f�sica suave y de bajo impacto adaptada a su nivel de dolor y la condici�n de sus " +
                                                  "\n articulaciones, buscando mantener la flexibilidad y fortalecer los m�sculos sin sobrecargar las zonas inflamadas. Actividades como la nataci�n, el ciclismo (con  " +
                                                  "\n un sill�n adecuado y baja resistencia) o ejercicios de estiramiento suaves pueden ser muy beneficiosas, siempre bajo supervisi�n y previa consulta con el m�dico  " +
                                                  "\n o fisioterapeuta. La cantidad de ejercicio debe ser progresiva y ajustada a sus d�as buenos y malos, pero se debe fomentar el movimiento regular para evitar la   " +
                                                  "\n rigidez, idealmente buscando periodos de 30 a 60 minutos de actividad moderada en los d�as que se encuentre bien, permitiendo periodos de descanso seg�n su tolerancia." +
                                                  "\n Tambi�n es crucial el consumo diario de 2.5 a 3 Litros de agua al d�a (diez a doce vasos de tama�o regular) para mantener una buena hidrataci�n, lo cual es fundamental" +
                                                  "\n para la salud general, el funcionamiento �ptimo de las articulaciones y el metabolismo de los medicamentos. POSIBLE TRATAMIENTO: Para la artritis en ni�os de esta edad," +
                                                  "\n el tratamiento suele incluir; medicamentos antiinflamatorios no esteroideos (AINEs) para reducir el dolor y la inflamaci�n (como el ibuprofeno, una marca com�n es Advil" +
                                                  "\n o Motrin, o el naproxeno, una marca com�n es Aproben), f�rmacos antirreum�ticos modificadores de la enfermedad (FARME) que act�an sobre el sistema inmune para controlar" +
                                                  "\n la progresi�n de la enfermedad (como el metotrexato, una marca com�n es Trexall), y en algunos casos, medicamentos biol�gicos para la artritis juvenil idiop�tica grave." +
                                                  "\n Es fundamental que estos tratamientos sean prescritos y supervisados por un reumat�logo pediatra, quien ajustar� las dosis y monitorear� los efectos. Tambi�n es    " +
                                                  "\n recomendable que el ni�o consuma alimentos que ayuden a reducir la inflamaci�n y fortalezcan su sistema inmune, tales como pescados grasos (salm�n, sardinas), ricos" +
                                                  "\n en �cidos grasos Omega-3, potentes antiinflamatorios que pueden ser beneficiosos para la salud articular. Una amplia variedad de frutas y verduras de colores vivos," +
                                                  "\n como los ar�ndanos, que aportan antioxidantes que protegen las c�lulas; la espinaca, rica en Magnesio, un mineral que puede contribuir a la relajaci�n muscular,    " +
                                                  "\n y Vitamina K; y el pimiento rojo, que ofrece una gran cantidad de Vitamina C (alrededor de 127.7 mg por cada 100 gramos, lo que representa cerca del 142% de la ingesta" +
                                                  "\n diaria recomendada para un ni�o de 4-8 a�os), esencial para la funci�n inmunol�gica. Tambi�n se beneficia de las cerezas, que contienen antocianinas, compuestos con " +
                                                  "\n potentes propiedades antiinflamatorias que podr�an ayudar a reducir el dolor y la inflamaci�n en las articulaciones. Adem�s, el aguacate proporciona grasas saludables" +
                                                  "\n y Vitamina E, importantes para la energ�a y la salud general. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente" +
                                                  "\n tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor" +
                                                  "\n seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su " +
                                                  "\n m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n Es recomendable que el ni�o, con una estatura de 1.55-1.70 m, especialmente durante la fase parox�stica de tos severa, limite la actividad f�sica a movimientos " +
                                                  "\n suaves y evite cualquier esfuerzo que pueda desencadenar ataques de tos. El reposo es crucial para su recuperaci�n y para conservar energ�a. A medida que mejore," +
                                                  "\n puede retomar gradualmente actividades de bajo impacto como caminatas cortas o juegos tranquilos, siempre bajo supervisi�n, buscando alcanzar periodos de 30 a 60" +
                                                  "\n minutos de actividad moderada en los d�as que se encuentre bien, adapt�ndose a su nivel de tolerancia. Tambi�n es crucial el consumo diario de 2.5 a 3 Litros de " +
                                                  "\n agua al d�a (diez a doce vasos de tama�o regular), o incluso m�s si presenta fiebre o dificultad para alimentarse, para mantener una excelente hidrataci�n y     " +
                                                  "\n ayudar a fluidificar las secreciones respiratorias, lo cual es vital para su comodidad y recuperaci�n. POSIBLE TRATAMIENTO: Para la tosferina en ni�os de esta   " +
                                                  "\n edad, el tratamiento principal es con antibi�ticos, que son m�s efectivos cuando se administran en las primeras etapas de la enfermedad para acortar la duraci�n " +
                                                  "\n de los s�ntomas y reducir la propagaci�n. Los m�s comunes son los macr�lidos, como la azitromicina (una marca com�n es Zithromax), la eritromicina (una marca    " +
                                                  "\n com�n es Pneumo-E o Eritrobase) o la claritromicina (una marca com�n es Klacid). Es fundamental que el ni�o complete el ciclo completo de antibi�ticos tal como  " +
                                                  "\n lo indique el m�dico, incluso si los s�ntomas mejoran, para erradicar la bacteria. En casos severos o en lactantes, podr�a requerirse hospitalizaci�n para el    " +
                                                  "\n monitoreo y manejo de complicaciones. Tambi�n es recomendable que el ni�o consuma alimentos que fortalezcan su sistema inmune y le proporcionen nutrientes que   " +
                                                  "\n ayuden a su recuperaci�n, especialmente aquellos que son f�ciles de tragar y digestibles debido a los ataques de tos, tales como pur�s de frutas y verduras.     " +
                                                  "\n Por ejemplo, el pur� de calabaza, que aporta una buena cantidad de Vitamina A (alrededor de 369 �g por cada 100 gramos, lo que representa cerca del 74% de la    " +
                                                  "\n ingesta diaria recomendada para un ni�o de 4-8 a�os), esencial para la salud de las mucosas respiratorias y la funci�n inmune; o el pur� de zanahoria, tambi�n   " +
                                                  "\n rica en Vitamina A y antioxidantes. Los pl�tanos son f�ciles de comer y ricos en potasio (aproximadamente 358 mg por cada 100 gramos), un electrolito importante " +
                                                  "\n que puede ayudar a reponer las p�rdidas debido a la tos y al sudor, adem�s de aportar energ�a. Las sopas y caldos suaves contribuyen a la hidrataci�n y aportan  " +
                                                  "\n nutrientes de forma l�quida. Tambi�n son valiosas las frutas suaves ricas en Vitamina C como la papaya, que contiene alrededor de 60.9 mg de Vitamina C por cada " +
                                                  "\n 100 gramos (aproximadamente el 68% de la ingesta diaria recomendada para un ni�o de 4-8 a�os), y la guayaba, con niveles a�n m�s altos de esta vitamina, crucial " +
                                                  "\n para fortalecer el sistema inmunol�gico. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa    " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor   " +
                                                  "\n seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar" +
                                                  "\n a su medico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchaz�n de las gl�ndulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n Es recomendable que el ni�o, con una estatura de 1.55-1.70 m, especialmente durante la fase aguda de la enfermedad cuando puede presentar fiebre y malestar, " +
                                                  "\n limite la actividad f�sica a un reposo adecuado, evitando esfuerzos que puedan aumentar el malestar o la hinchaz�n de las gl�ndulas. A medida que su condici�n" +
                                                  "\n mejore y la fiebre ceda, puede retomar gradualmente actividades ligeras y juegos tranquilos, siempre bajo supervisi�n, buscando alcanzar periodos de 30 a 60 " +
                                                  "\n minutos de actividad moderada en los d�as que se encuentre bien. Tambi�n es crucial el consumo diario de 2.5 a 3 Litros de agua al d�a (diez a doce vasos de " +
                                                  "\n tama�o regular), o m�s si tiene fiebre o dificultad para tragar alimentos s�lidos, para mantener una excelente hidrataci�n, lo cual es vital para su bienestar" +
                                                  "\n general, para ayudar a reducir la fiebre y para mantener las mucosas hidratadas, aliviando la garganta. POSIBLE TRATAMIENTO: Para las paperas en ni�os de esta" +
                                                  "\n edad, el tratamiento es principalmente de soporte y para aliviar los s�ntomas, ya que es una infecci�n viral y no existen medicamentos espec�ficos para erradicar" +
                                                  "\n el virus. Se recomienda el reposo en cama, la aplicaci�n de compresas fr�as o calientes en las gl�ndulas inflamadas para aliviar el dolor, y el uso de medicamentos" +
                                                  "\n para controlar la fiebre y el dolor, como el paracetamol (una marca com�n es Tempra o Tylenol) o el ibuprofeno (una marca com�n es Advil o Motrin). Es fundamental" +
                                                  "\n evitar el uso de aspirina en ni�os debido al riesgo de s�ndrome de Reye. Tambi�n es recomendable que el ni�o consuma alimentos que fortalezcan su sistema inmune " +
                                                  "\n y sean f�ciles de masticar y tragar debido a la hinchaz�n de las gl�ndulas salivales, tales como pur�s y alimentos blandos. Puede incluir caldos nutritivos y sopas" +
                                                  "\n suaves que aportan hidrataci�n y energ�a. En cuanto a las frutas y verduras, la pi�a es una excelente opci�n, ya que contiene bromelina, una enzima con propiedades" +
                                                  "\n antiinflamatorias que puede ayudar a reducir la hinchaz�n y el dolor, adem�s de Vitamina C (aproximadamente 47.8 mg por cada 100 gramos, lo que representa cerca" +
                                                  "\n del 53% de la ingesta diaria recomendada para un ni�o de 4-8 a�os), esencial para el sistema inmunol�gico. El mel�n, f�cil de digerir, es rico en Vitamina C     " +
                                                  "\n (aproximadamente 36.7 mg por cada 100 gramos, que representa cerca del 41% de la ingesta diaria recomendada para la misma edad) y Vitamina A, y tambi�n aporta una" +
                                                  "\n alta cantidad de agua, contribuyendo a la hidrataci�n. El pl�tano, f�cil de digerir y rico en potasio (aproximadamente 358 mg por cada 100 gramos), un electrolito" +
                                                  "\n importante que ayuda a reponer las p�rdidas y aporta energ�a. Finalmente, el aguacate proporciona grasas saludables y diversas vitaminas (como la E y K) que apoyan" +
                                                  "\n la funci�n inmunol�gica y la salud general. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa  " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor    " +
                                                  "\n seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar" +
                                                  "\n a su medico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupci�n cut�nea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n Es recomendable que el ni�o, con una estatura de 1.55-1.70 m, durante la fase aguda de la enfermedad cuando puede presentar fiebre, dolor muscular y articular, mantenga" +
                                                  "\n un reposo adecuado y evite la actividad f�sica extenuante. A medida que sus s�ntomas mejoren y bajo supervisi�n, puede retomar gradualmente actividades ligeras y juegos" +
                                                  "\n tranquilos, buscando alcanzar periodos de 30 a 60 minutos de actividad moderada en los d�as que se encuentre bien, priorizando entornos donde se pueda minimizar la     " +
                                                  "\n exposici�n a mosquitos. Tambi�n es crucial el consumo diario de 2.5 a 3 Litros de agua al d�a (diez a doce vasos de tama�o regular), o m�s si tiene fiebre o v�mitos, para" +
                                                  "\n mantener una excelente hidrataci�n y prevenir la deshidrataci�n, lo cual es vital para el bienestar general y el funcionamiento �ptimo de todos sus sistemas corporales " +
                                                  "\n durante la recuperaci�n. POSIBLE TRATAMIENTO: Para el Zika en ni�os de esta edad, el tratamiento es principalmente de soporte, ya que no existe un medicamento antiviral" +
                                                  "\n espec�fico para curar la infecci�n. El manejo se enfoca en aliviar los s�ntomas, lo que incluye el reposo, una buena hidrataci�n y el uso de medicamentos para controlar" +
                                                  "\n la fiebre y el dolor, como el paracetamol (una marca com�n es Tempra o Tylenol). Es fundamental evitar el uso de aspirina y otros AINEs (antiinflamatorios no esteroideos" +
                                                  "\n como el ibuprofeno) hasta que se descarte la posibilidad de dengue, debido al riesgo de complicaciones hemorr�gicas. Tambi�n es crucial proteger al ni�o de nuevas picaduras" +
                                                  "\n de mosquitos durante la enfermedad para evitar la transmisi�n del virus a otras personas. Adem�s, es recomendable que el ni�o consuma alimentos que fortalezcan su sistema" +
                                                  "\n inmune y le proporcionen energ�a, tales como caldos nutritivos y sopas suaves que facilitan la hidrataci�n y son f�ciles de digerir. Las frutas tropicales como la papaya," +
                                                  "\n que aporta una cantidad significativa de Vitamina C (aproximadamente 60.9 mg por cada 100 gramos, lo que representa cerca del 68% de la ingesta diaria recomendada para un" +
                                                  "\n ni�o de 4-8 a�os) y el mango, que tambi�n es rico en Vitamina C (aproximadamente 36.4 mg por cada 100 gramos, que representa cerca del 40% de la ingesta diaria recomendada" +
                                                  "\n para la misma edad) y antioxidantes, son excelentes para reforzar las defensas. El pl�tano, f�cil de digerir, es rico en potasio (aproximadamente 358 mg por cada 100 gramos)," +
                                                  "\n un electrolito importante que ayuda a reponer las p�rdidas por fiebre o sudor. Las verduras de hoja verde oscuro como la espinaca, que provee Vitamina K, Vitamina A y hierro," +
                                                  "\n contribuyen a la vitalidad y al buen funcionamiento general. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga" +
                                                  "\n esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad" +
                                                  "\n en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su medico," +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, V�mitos, Deshidrataci�n, Dolor abdominal.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n Es recomendable que el ni�o, con una estatura de 1.55-1.70 m, mientras presente diarrea y v�mitos, limite la actividad f�sica a un reposo absoluto o muy suave, evitando " +
                                                  "\n cualquier esfuerzo que pueda empeorar la deshidrataci�n o el malestar gastrointestinal. La prioridad es conservar energ�a para la recuperaci�n. A medida que los s�ntomas" +
                                                  "\n disminuyan y la hidrataci�n mejore, puede retomar gradualmente juegos tranquilos y actividades de bajo impacto, siempre bajo supervisi�n, buscando alcanzar periodos de 30" +
                                                  "\n a 60 minutos de actividad moderada en los d�as que se encuentre bien. Tambi�n es crucial el consumo diario de 2.5 a 3 Litros de agua al d�a (diez a doce vasos de tama�o " +
                                                  "\n regular) en peque�as tomas frecuentes, preferiblemente mediante soluciones de rehidrataci�n oral (como Electrolit pedi�trico o Pedialyte), para reponer los l�quidos y   " +
                                                  "\n electrolitos perdidos por la diarrea y el v�mito, lo cual es vital para prevenir la deshidrataci�n severa. POSIBLE TRATAMIENTO: Para el rotavirus en ni�os de esta edad, " +
                                                  "\n el tratamiento es principalmente de soporte y se enfoca en la rehidrataci�n, ya que no existe un medicamento antiviral espec�fico para el virus. La clave es prevenir y  " +
                                                  "\n tratar la deshidrataci�n mediante la administraci�n de l�quidos y electrolitos. En casa, se pueden usar soluciones de rehidrataci�n oral (SRO), y en casos de deshidrataci�n" +
                                                  "\n severa, puede ser necesaria la hospitalizaci�n para la administraci�n de l�quidos por v�a intravenosa. Los medicamentos para detener la diarrea no suelen ser recomendados" +
                                                  "\n en ni�os con rotavirus. En cuanto a medicamentos para el malestar, el paracetamol (una marca com�n es Tempra o Tylenol) puede usarse para controlar la fiebre y aliviar las" +
                                                  "\n molestias, siempre bajo indicaci�n m�dica. Es fundamental la supervisi�n m�dica. Adem�s, es importante que el ni�o consuma alimentos que sean f�ciles de digerir y ayuden " +
                                                  "\n a la recuperaci�n de la flora intestinal, as� como nutrientes que apoyen la funci�n inmune, tales como arroz blanco o avena cocida, que aportan energ�a y son suaves para " +
                                                  "\n el est�mago; caldos de pollo o vegetales desgrasados que contribuyen a la hidrataci�n y a la reposici�n de electrolitos. El pl�tano, muy beneficioso por su contenido de  " +
                                                  "\n potasio (aproximadamente 358 mg por cada 100 gramos), un electrolito clave que se pierde con la diarrea y el v�mito, ayudando a normalizar los niveles y aportar energ�a  " +
                                                  "\n de f�cil absorci�n. Tambi�n se recomienda el pur� de manzana (sin c�scara), que contiene pectina, una fibra soluble que puede ayudar a solidificar las heces y es suave   " +
                                                  "\n para el sistema digestivo del ni�o. Otra verdura valiosa es la papa cocida y en pur�, la cual es una buena fuente de potasio y carbohidratos complejos, que son de f�cil  " +
                                                  "\n digesti�n y aportan energ�a sin irritar el intestino, favoreciendo la recuperaci�n. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al " +
                                                  "\n 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida   " +
                                                  "\n para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda  " +
                                                  "\n mucho consultar a su medico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, N�useas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n Es recomendable que el ni�o, con una estatura de 1.55-1.70 m, durante la fase aguda de la enfermedad cuando puede presentar fiebre, diarrea o s�ntomas neurol�gicos," +
                                                  "\n mantenga un reposo adecuado y evite cualquier actividad f�sica extenuante. El objetivo es preservar la energ�a y permitir que su cuerpo se recupere. A medida que los" +
                                                  "\n s�ntomas disminuyan y bajo supervisi�n m�dica, puede retomar gradualmente actividades tranquilas y de bajo impacto, buscando alcanzar periodos de 30 a 60 minutos de" +
                                                  "\n actividad moderada en los d�as que se encuentre bien. Tambi�n es crucial el consumo diario de 2.5 a 3 Litros de agua al d�a (diez a doce vasos de tama�o regular),  " +
                                                  "\n especialmente si presenta fiebre o diarrea, para mantener una excelente hidrataci�n y reponer los l�quidos perdidos, lo cual es vital para el bienestar general y el" +
                                                  "\n funcionamiento �ptimo de sus sistemas corporales mientras combate la infecci�n. POSIBLE TRATAMIENTO: Para la listeriosis en ni�os de esta edad, el tratamiento      " +
                                                  "\n principal consiste en la administraci�n de antibi�ticos, siendo la ampicilina (una marca com�n es Omnipen o Polycillin) o la penicilina (una marca com�n es         " +
                                                  "\n Penprocilina o Bencilpenicilina S�dica) los m�s com�nmente utilizados, a menudo en combinaci�n con otros antibi�ticos como la gentamicina. La elecci�n, dosis y     " +
                                                  "\n duraci�n del tratamiento deben ser estrictamente determinadas por un m�dico, y es fundamental completar el ciclo completo de antibi�ticos para erradicar la bacteria" +
                                                  "\n y prevenir complicaciones serias, como la meningitis. En casos graves, puede requerirse hospitalizaci�n para la administraci�n intravenosa de medicamentos y monitoreo." +
                                                  "\n Adem�s, es recomendable que el ni�o consuma alimentos que refuercen su sistema inmune y apoyen su recuperaci�n general, priorizando aquellos que son f�ciles de digerir" +
                                                  "\n si presenta s�ntomas gastrointestinales. Estos incluyen prote�nas magras como el pollo cocido o el pescado (si su digesti�n lo permite), que aportan amino�cidos    " +
                                                  "\n esenciales para la reparaci�n de tejidos y la producci�n de c�lulas inmunes; caldos y sopas nutritivas que contribuyen a la hidrataci�n y al aporte de electrolitos." +
                                                  "\n Tambi�n son beneficiosas frutas ricas en Vitamina C como la papaya, que contiene aproximadamente 60.9 mg por cada 100 gramos (cerca del 68% de la ingesta diaria    " +
                                                  "\n recomendada para un ni�o de 4-8 a�os), y las naranjas, que aportan alrededor de 53.2 mg de Vitamina C por cada 100 gramos (cerca del 59% de la ingesta diaria       " +
                                                  "\n recomendada para la misma edad), ambas potentes antioxidantes que fortalecen las defensas del cuerpo. Las verduras cocidas en pur�, como la calabaza, que aporta    " +
                                                  "\n una buena cantidad de Vitamina A (alrededor de 369 �g por cada 100 gramos, lo que representa cerca del 74% de la ingesta diaria recomendada para un ni�o de 4-8 a�os)," +
                                                  "\n es crucial para la integridad de las mucosas y la funci�n inmunitaria, y la espinaca, que provee hierro y folato, importantes para la formaci�n de gl�bulos rojos.  " +
                                                  "\n Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus  " +
                                                  "\n respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente," +
                                                  "\n adem�s por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su medico, Angel L Montes agradece tu visita a la app" +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, V�mitos.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n Es recomendable que el ni�o, con una estatura de 1.55-1.70 m, durante la fase aguda de la enfermedad cuando presenta diarrea severa, dolor abdominal y fiebre," +
                                                  "\n mantenga un reposo estricto, evitando cualquier actividad f�sica que pueda agravar la deshidrataci�n o el malestar gastrointestinal. La prioridad es conservar" +
                                                  "\n energ�a. A medida que los s�ntomas disminuyan y la rehidrataci�n sea efectiva, puede retomar gradualmente juegos tranquilos y actividades de bajo impacto, siempre" +
                                                  "\n bajo supervisi�n, buscando alcanzar periodos de 30 a 60 minutos de actividad moderada en los d�as que se encuentre bien. Tambi�n es crucial el consumo diario de  " +
                                                  "\n 2.5 a 3 Litros de agua al d�a (diez a doce vasos de tama�o regular) en peque�as y frecuentes tomas, preferiblemente soluciones de rehidrataci�n oral (como Electrolit" +
                                                  "\n pedi�trico o Pedialyte), para reponer los l�quidos y electrolitos perdidos por la diarrea y el v�mito, lo cual es vital para prevenir la deshidrataci�n severa y   " +
                                                  "\n apoyar la funci�n renal durante la infecci�n. POSIBLE TRATAMIENTO: Para la shigelosis en ni�os de esta edad, el tratamiento principal es con antibi�ticos, ya que  " +
                                                  "\n la shigelosis es una infecci�n bacteriana que puede ser grave. Los antibi�ticos m�s comunes para esta condici�n incluyen la azitromicina (una marca com�n es Zithromax)," +
                                                  "\n o las cefalosporinas de tercera generaci�n como la ceftriaxona (una marca com�n es Rocephin), dependiendo de la resistencia bacteriana local. Es fundamental que el  " +
                                                  "\n ni�o complete el ciclo completo de antibi�ticos tal como lo indique el m�dico, incluso si los s�ntomas mejoran, para erradicar la bacteria y evitar la propagaci�n.  " +
                                                  "\n Adem�s del tratamiento antibi�tico, el manejo de la deshidrataci�n mediante soluciones de rehidrataci�n oral es esencial. Los medicamentos para frenar la diarrea    " +
                                                  "\n generalmente no se recomiendan. Es importante tambi�n que el ni�o consuma alimentos que sean f�ciles de digerir, suaves para el sistema gastrointestinal y que       " +
                                                  "\n aporten nutrientes para fortalecer su sistema inmune, como arroz blanco o avena cocida, que son fuente de energ�a y suaves para el est�mago; caldos de pollo o       " +
                                                  "\n vegetales desgrasados que contribuyen a la hidrataci�n y a la reposici�n de electrolitos. El pl�tano, muy beneficioso por su contenido de potasio (aproximadamente   " +
                                                  "\n 358 mg por cada 100 gramos), un electrolito clave que se pierde con la diarrea y el v�mito, ayudando a normalizar los niveles y aportar energ�a de f�cil absorci�n.  " +
                                                  "\n Tambi�n se recomienda el pur� de manzana (sin c�scara), que contiene pectina, una fibra soluble que puede ayudar a solidificar las heces y es suave para el sistema  " +
                                                  "\n digestivo del ni�o. Otra verdura valiosa es la papa cocida y en pur�, la cual es una buena fuente de potasio y carbohidratos complejos, que son de f�cil digesti�n   " +
                                                  "\n y aportan energ�a sin irritar el intestino, favoreciendo la recuperaci�n de la mucosa intestinal da�ada. Este es solo un Diagn�stico predeterminado l�gico, haberlo  " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer    " +
                                                  "\n m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagnostico no   " +
                                                  "\n le satisface del todo se le recomienda mucho consultar a su medico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos cr�nica, Producci�n excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad Pulmonar Obstructiva Cr�nica (EPOC)." +
                                                  "\n Es recomendable que el ni�o, con una estatura de 1.55-1.70 m, cuya actividad f�sica debe ser siempre supervisada y adaptada a su capacidad pulmonar y estado general," +
                                                  "\n realice ejercicios de respiraci�n y actividades de bajo impacto. Se deben evitar ambientes con humo o contaminantes, y priorizar actividades que no causen dificultad" +
                                                  "\n respiratoria excesiva. Caminatas cortas y suaves, juegos tranquilos o ejercicios de brazos que no agiten demasiado, pueden ser beneficiosos, buscando mantener la    " +
                                                  "\n movilidad y la fuerza muscular sin agotar al ni�o, con el objetivo de alcanzar periodos de 30 a 60 minutos de actividad moderada en los d�as que se encuentre bien,  " +
                                                  "\n pero siempre con periodos de descanso. Tambi�n es crucial el consumo diario de 2.5 a 3 Litros de agua al d�a (diez a doce vasos de tama�o regular) para mantener las " +
                                                  "\n secreciones pulmonares m�s fluidas y facilitar su expectoraci�n, lo cual es vital para una mejor respiraci�n y para prevenir infecciones.                            " +
                                                  "\n POSIBLE TRATAMIENTO: Para la EPOC en ni�os (que es rara y a menudo asociada a condiciones cong�nitas, exposiciones ambientales severas tempranas o infecciones       " +
                                                  "\n recurrentes), el tratamiento se enfoca en manejar los s�ntomas, prevenir exacerbaciones y mejorar la funci�n pulmonar. Esto incluye el uso de broncodilatadores      " +
                                                  "\n (como el salbutamol, una marca com�n es Ventolin o Aerolin, para abrir las v�as respiratorias), corticosteroides inhalados (como la fluticasona, una marca com�n es  " +
                                                  "\n Flixotide, para reducir la inflamaci�n), y en algunos casos, oxigenoterapia si hay bajos niveles de ox�geno. La terapia respiratoria y la fisioterapia pulmonar son  " +
                                                  "\n fundamentales. Es esencial la eliminaci�n de la exposici�n a irritantes pulmonares, como el humo de tabaco. Adem�s, es recomendable que el ni�o consuma alimentos    " +
                                                  "\n que fortalezcan su sistema inmune y le proporcionen energ�a de manera sostenible, priorizando aquellos que no causen distensi�n abdominal que pueda dificultar la    " +
                                                  "\n respiraci�n. Estos incluyen prote�nas magras como el pollo o el pescado, que aportan amino�cidos esenciales para la reparaci�n de tejidos y el mantenimiento de la   " +
                                                  "\n masa muscular, crucial en pacientes con EPOC; carbohidratos complejos de liberaci�n lenta como la avena o el arroz integral, que proporcionan energ�a sin picos      " +
                                                  "\n gluc�micos; y una variedad de verduras de hoja verde oscuro como la acelga, que aporta Vitamina K, Vitamina A y antioxidantes, que pueden ayudar a reducir la        " +
                                                  "\n inflamaci�n pulmonar, y el pimiento rojo, que ofrece una gran cantidad de Vitamina C (alrededor de 127.7 mg por cada 100 gramos, lo que representa cerca del 142%    " +
                                                  "\n de la ingesta diaria recomendada para un ni�o de 4-8 a�os), esencial para la funci�n inmunol�gica. Las frutas como las fresas, que contienen cerca de 58.8 mg de     " +
                                                  "\n Vitamina C por cada 100 gramos (aproximadamente el 65% de la ingesta diaria recomendada para la misma edad), y las manzanas, que contienen quercetina, un flavonoide " +
                                                  "\n con propiedades antiinflamatorias que pueden ser �tiles para la salud pulmonar, tambi�n son beneficiosas. Este es solo un Diagn�stico predeterminado l�gico, haberlo " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s" +
                                                  "\n de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagnostico no le    " +
                                                  "\n satisface del todo se le recomienda mucho consultar a su medico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreci�n anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n Es recomendable que el ni�o, con una estatura de 1.55-1.70 m, mientras recibe tratamiento, mantenga una actividad f�sica normal adaptada a su estado de salud," +
                                                  "\n evitando cualquier molestia o irritaci�n en el �rea afectada si presenta s�ntomas. La Clamidia no suele afectar directamente la capacidad f�sica a largo plazo." +
                                                  "\n Una vez que el tratamiento sea efectivo y los s�ntomas hayan desaparecido, puede seguir con la actividad f�sica recomendada para su edad, buscando idealmente " +
                                                  "\n periodos de 30 a 60 minutos de actividad moderada a intensa diaria. Tambi�n es crucial el consumo diario de 2.5 a 3 Litros de agua al d�a (diez a doce vasos  " +
                                                  "\n de tama�o regular) para mantener una buena hidrataci�n, lo cual es fundamental para el bienestar general, el funcionamiento �ptimo de sus sistemas corporales " +
                                                  "\n y para apoyar la eliminaci�n de los medicamentos del organismo. POSIBLE TRATAMIENTO: Para la clamidia en ni�os de esta edad, el tratamiento principal es con  " +
                                                  "\n antibi�ticos, los cuales son muy efectivos para erradicar la infecci�n. La elecci�n y la dosis del antibi�tico ser�n determinadas estrictamente por un m�dico," +
                                                  "\n quien considerar� la edad y el peso del ni�o. Es fundamental completar el ciclo completo de antibi�ticos tal como se indique, incluso si los s�ntomas mejoran," +
                                                  "\n para asegurar la eliminaci�n total de la bacteria y prevenir reinfecciones o complicaciones. Los antibi�ticos com�nmente usados incluyen la azitromicina (una " +
                                                  "\n marca com�n es Zithromax) o la eritromicina (una marca com�n es Pneumo-E o Eritrobase). Es importante recordar que la clamidia en ni�os puede requerir una    " +
                                                  "\n evaluaci�n m�dica inmediata, ya que en algunos casos puede ser indicativa de abuso. Adem�s, es recomendable que el ni�o consuma alimentos que fortalezcan su  " +
                                                  "\n sistema inmune y apoyen la recuperaci�n general, como fuentes de probi�ticos (si son tolerados, como yogur natural si no hay contraindicaciones), que pueden  " +
                                                  "\n ayudar a mantener un equilibrio saludable de la flora intestinal, especialmente despu�s de la administraci�n de antibi�ticos. Las frutas como las fresas, que " +
                                                  "\n contienen cerca de 58.8 mg de Vitamina C por cada 100 gramos (aproximadamente el 65% de la ingesta diaria recomendada para un ni�o de 4-8 a�os), o las naranjas," +
                                                  "\n que aportan alrededor de 53.2 mg de Vitamina C por cada 100 gramos (cerca del 59% de la ingesta diaria recomendada para la misma edad), son excelentes fuentes " +
                                                  "\n de esta vitamina, crucial para reforzar las defensas del cuerpo. Las verduras de hoja verde oscuro como la espinaca, rica en folato y Vitamina K, y el pimiento" +
                                                  "\n rojo, que provee Vitamina A y antioxidantes, tambi�n contribuyen a la vitalidad y al buen funcionamiento general del sistema inmune, favoreciendo la recuperaci�n." +
                                                  "\n Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus" +
                                                  "\n respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su   " +
                                                  "\n paciente, adem�s por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su medico, Angel L Montes agradece  " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, N�useas, Dolor de cabeza severo, Rigidez en el cuello, Confusi�n.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n Es recomendable que el ni�o, con una estatura de 1.55-1.70 m, durante la fase aguda de la enfermedad, mantenga un reposo estricto en cama, ya que la meningitis" +
                                                  "\n es una condici�n grave que requiere m�nima estimulaci�n y m�xima conservaci�n de energ�a para la recuperaci�n cerebral y general del cuerpo. Cualquier actividad" +
                                                  "\n f�sica debe ser evitada por completo en este periodo. Una vez que la fase aguda haya pasado y bajo estricta supervisi�n m�dica, la rehabilitaci�n o la reintroducci�n" +
                                                  "\n gradual de movimientos muy suaves solo se realizar� si no hay secuelas. Tambi�n es crucial el consumo diario de 2.5 a 3 Litros de agua al d�a (diez a doce vasos" +
                                                  "\n de tama�o regular) en tomas peque�as y frecuentes, preferiblemente por v�a intravenosa si el ni�o no puede beber, para mantener una hidrataci�n �ptima y asegurar" +
                                                  "\n el correcto funcionamiento de los �rganos, especialmente los ri�ones, que procesar�n los medicamentos, y para ayudar a controlar la fiebre.                       " +
                                                  "\n POSIBLE TRATAMIENTO: Para la meningitis bacteriana en ni�os de esta edad, el tratamiento es una emergencia m�dica y consiste en la administraci�n inmediata de    " +
                                                  "\n antibi�ticos intravenosos de amplio espectro para combatir la infecci�n. La elecci�n del antibi�tico depender� de la edad del ni�o, el tipo de bacteria sospechada" +
                                                  "\n y los patrones de resistencia locales, y ser� determinada por un m�dico especialista. Es vital que el tratamiento antibi�tico se inicie lo antes posible y se     " +
                                                  "\n complete en su totalidad para prevenir complicaciones graves como da�o cerebral, p�rdida de audici�n o incluso la muerte. Algunos antibi�ticos comunes incluyen   " +
                                                  "\n la ceftriaxona (una marca com�n es Rocephin) o la ampicilina (una marca com�n es Omnipen o Polycillin), a veces combinados con vancomicina (una marca com�n es    " +
                                                  "\n Vancocin). Adem�s de los antibi�ticos, se pueden usar corticosteroides (como la dexametasona, una marca com�n es Decadron) para reducir la inflamaci�n cerebral   " +
                                                  "\n y prevenir secuelas neurol�gicas, siempre bajo indicaci�n m�dica. Es fundamental el monitoreo constante en un entorno hospitalario. En cuanto a la alimentaci�n,  " +
                                                  "\n una vez que el ni�o pueda tolerar la v�a oral, es recomendable que consuma alimentos que sean f�ciles de digerir y nutritivos para apoyar la recuperaci�n del     " +
                                                  "\n sistema nervioso y el fortalecimiento del sistema inmune. Esto incluye caldos y sopas suaves que aportan l�quidos y electrolitos; pur�s de verduras como la       " +
                                                  "\n calabaza, que aporta una buena cantidad de Vitamina A (alrededor de 369 �g por cada 100 gramos, lo que representa cerca del 74% de la ingesta diaria recomendada  " +
                                                  "\n para un ni�o de 4-8 a�os), esencial para la recuperaci�n de las mucosas y la visi�n; y frutas blandas como el pl�tano, que aporta potasio (aproximadamente 358 mg " +
                                                  "\n por cada 100 gramos), un electrolito vital para la funci�n nerviosa y muscular. Tambi�n son beneficiosos los alimentos ricos en antioxidantes como el aguacate,   " +
                                                  "\n que provee grasas saludables y Vitamina E, que pueden proteger las c�lulas neuronales del da�o oxidativo. Este es solo un Diagn�stico predeterminado l�gico,      " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se          " +
                                                  "\n recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta  " +
                                                  "\n del Diagnostico no le satisface del todo se le recomienda mucho consultar a su medico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, P�rdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, P�rdida de apetito.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer C�ncer." +
                                                  "\n Es recomendable que el ni�o, con una estatura de 1.55-1.70 m, cuya actividad f�sica debe ser siempre supervisada y adaptada a su estado de salud, energ�a y" +
                                                  "\n fase del tratamiento oncol�gico, mantenga periodos de descanso adecuados y evite cualquier actividad extenuante o que pueda comprometer su sistema inmune. " +
                                                  "\n Se deben priorizar actividades de bajo impacto que fomenten la movilidad y el bienestar, como caminatas cortas y suaves, juegos tranquilos o ejercicios de " +
                                                  "\n estiramiento muy ligeros, siempre que el m�dico lo autorice y seg�n su tolerancia. El objetivo es mantener la fuerza muscular y mejorar la calidad de vida " +
                                                  "\n sin sobrecargar su cuerpo, buscando alcanzar periodos de 30 a 60 minutos de actividad moderada en los d�as que se encuentre bien, pero con flexibilidad y  " +
                                                  "\n respetando sus l�mites. Tambi�n es crucial el consumo diario de 2.5 a 3 Litros de agua al d�a (dietez a doce vasos de tama�o regular), o m�s si tiene fiebre," +
                                                  "\n v�mitos o diarrea como efectos secundarios del tratamiento, para mantener una excelente hidrataci�n, lo cual es vital para el funcionamiento �ptimo de sus  " +
                                                  "\n �rganos, la eliminaci�n de toxinas y el apoyo al metabolismo de los medicamentos. POSIBLE TRATAMIENTO: Para el c�ncer en ni�os de esta edad, el tratamiento " +
                                                  "\n es altamente individualizado y complejo, dependiendo del tipo espec�fico de c�ncer, su etapa y la salud general del ni�o. Generalmente, implica una combinaci�n" +
                                                  "\n de quimioterapia (medicamentos que matan las c�lulas cancerosas, como la vincristina, una marca com�n es Oncovin, o el ciclofosfamida, una marca com�n es  " +
                                                  "\n Cytoxan), radioterapia (uso de radiaci�n para destruir c�lulas cancerosas), cirug�a (para extirpar tumores), e incluso inmunoterapia o terapia dirigida.   " +
                                                  "\n Es fundamental que el tratamiento sea manejado por un equipo multidisciplinario de onc�logos pedi�tricos. Adem�s del tratamiento oncol�gico, se utilizan   " +
                                                  "\n medicamentos de soporte para manejar los efectos secundarios, como antiem�ticos para las n�useas (como el ondansetr�n, una marca com�n es Zofran), analg�sicos" +
                                                  "\n para el dolor (como el paracetamol, una marca com�n es Tempra o Tylenol), y factores estimulantes de colonias para apoyar la m�dula �sea. En cuanto a la   " +
                                                  "\n alimentaci�n, es recomendable que el ni�o consuma alimentos que fortalezcan su sistema inmune, le proporcionen energ�a y le ayuden a tolerar mejor el      " +
                                                  "\n tratamiento, priorizando aquellos que sean nutritivos y de f�cil digesti�n. Esto incluye prote�nas de alto valor biol�gico (pollo, pescado, huevos, legumbres)" +
                                                  "\n que son esenciales para la reparaci�n celular y el mantenimiento de la masa muscular, crucial durante y despu�s de la quimioterapia. Las verduras de hoja   " +
                                                  "\n verde oscuro como la col rizada (kale), que aporta Vitamina K, Vitamina A y antioxidantes, que pueden ayudar a reducir la inflamaci�n y proteger las c�lulas," +
                                                  "\n y el pimiento rojo, que ofrece una gran cantidad de Vitamina C (alrededor de 127.7 mg por cada 100 gramos, lo que representa cerca del 142% de la ingesta   " +
                                                  "\n diaria recomendada para un ni�o de 4-8 a�os), esencial para la funci�n inmunol�gica. Las frutas de colores vivos como la granada, rica en antioxidantes     " +
                                                  "\n (como punicalaginas) que pueden ofrecer propiedades protectoras, y las uvas, que contienen resveratrol, un compuesto con potencial antiinflamatorio.       " +
                                                  "\n El aguacate proporciona grasas saludables y Vitamina E, importantes para la energ�a y la salud general. Este es solo un Diagn�stico predeterminado l�gico, " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se   " +
                                                  "\n recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la     " +
                                                  "\n respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su medico, Angel L Montes agradece tu visita a la app (Mi Vida) y    " +
                                                  "\n espera que te mejores.");
                            }
                        }
                        if(EstaturaMasculino.equals("1.45-1.60 m")){
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n Es recomendable que el ni�o, con una estatura de 1.55-1.70 m, durante la fase aguda de la influenza, mantenga reposo en cama o actividades muy tranquilas," +
                                                  "\n como leer o dibujar, para conservar energ�a y permitir que su cuerpo combata el virus. Debe evitar cualquier actividad f�sica extenuante hasta que la     " +
                                                  "\n fiebre haya desaparecido por al menos 24 horas y los s�ntomas principales hayan mejorado significativamente. Una vez en recuperaci�n, se puede reintroducir" +
                                                  "\n gradualmente la actividad ligera, como caminatas cortas, siempre bajo supervisi�n y asegur�ndose de que el ni�o no presente fatiga excesiva. Tambi�n es   " +
                                                  "\n crucial el consumo diario de 2 a 2.5 Litros de agua al d�a (aproximadamente ocho a diez vasos de tama�o regular) o m�s si presenta fiebre alta, para      " +
                                                  "\n mantener una excelente hidrataci�n, lo cual es vital para fluidificar las secreciones respiratorias, ayudar a regular la temperatura corporal y apoyar    " +
                                                  "\n el funcionamiento de sus �rganos, as� como la eliminaci�n de toxinas. POSIBLE TRATAMIENTO:  Para la influenza en ni�os de esta edad, el tratamiento se    " +
                                                  "\n enfoca principalmente en aliviar los s�ntomas y prevenir complicaciones. Se pueden usar medicamentos antivirales como el oseltamivir (una marca com�n     " +
                                                  "\n es Tamiflu) si se administra dentro de las primeras 48 horas del inicio de los s�ntomas, ya que puede acortar la duraci�n de la enfermedad y reducir la   " +
                                                  "\n gravedad. Sin embargo, su uso debe ser indicado por un m�dico. Para el manejo de los s�ntomas, se utilizan antipir�ticos/analg�sicos como el paracetamol  " +
                                                  "\n (marcas comunes incluyen Tempra o Tylenol) o el ibuprofeno (marcas comunes incluyen Advil o Motrin) para controlar la fiebre y el dolor. Es fundamental   " +
                                                  "\n evitar la aspirina en ni�os debido al riesgo de s�ndrome de Reye. Tambi�n pueden usarse descongestionantes nasales (como la oximetazolina, una marca      " +
                                                  "\n com�n es Afrin Pedi�trico, por periodos cortos) o soluciones salinas nasales para aliviar la congesti�n. En cuanto a la alimentaci�n, es recomendable     " +
                                                  "\n que el ni�o consuma alimentos que sean f�ciles de digerir, suaves para el est�mago y ricos en nutrientes para fortalecer su sistema inmune y proporcionar " +
                                                  "\n energ�a durante la recuperaci�n. Esto incluye: Caldo de pollo: Aporta l�quidos y electrolitos, lo que es esencial para la hidrataci�n. El caldo caliente  " +
                                                  "\n puede ayudar a aliviar la congesti�n nasal y de garganta. Frutas ricas en Vitamina C: Como la naranja (aproximadamente 53.2 mg de Vitamina C por cada     " +
                                                  "\n 100 gramos, que representa cerca del 59% de la ingesta diaria recomendada para un ni�o de 4-8 a�os), guayaba (con una concentraci�n muy alta de Vitamina C," +
                                                  "\n alrededor de 228 mg por cada 100 gramos) y kiwi, que son vitales para el soporte del sistema inmunol�gico y la reducci�n de la duraci�n de los resfriados." +
                                                  "\n Verduras cocidas: Como la zanahoria (rica en Vitamina A en forma de betacarotenos, que es importante para la salud de las mucosas y la funci�n inmune)    " +
                                                  "\n y la espinaca (que aporta Vitamina K, Vitamina A y Hierro, apoyando la producci�n de gl�bulos rojos y la energ�a). Alimentos ricos en zinc: Aunque no     " +
                                                  "\n son un alimento en s�, incluir alimentos como carne magra de res, lentejas y frijoles, que son fuentes de Zinc, puede ser beneficioso, ya que este mineral" +
                                                  "\n es crucial para la funci�n inmunol�gica. Yogur natural: Si es tolerado, los probi�ticos del yogur pueden ayudar a mantener una flora intestinal saludable," +
                                                  "\n lo que a su vez apoya el sistema inmunol�gico. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente " +
                                                  "\n tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para   " +
                                                  "\n establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagnostico no le satisface del todo se le  " +
                                                  "\n recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                               textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumon�a." +
                                                  "\n Es recomendable que el ni�o, con una estatura de 1.55-1.70 m, durante la fase aguda de la neumon�a, mantenga un reposo adecuado, limitando la actividad" +
                                                  "\n f�sica a movimientos suaves y esenciales para su comodidad; evite cualquier ejercicio extenuante o juegos activos que puedan dificultar la respiraci�n " +
                                                  "\n o agravar su condici�n pulmonar; el objetivo principal es conservar la energ�a para que el cuerpo combata la infecci�n. Una vez que el m�dico lo autorice" +
                                                  "\n y los s�ntomas mejoren significativamente, se puede iniciar una reintroducci�n gradual de actividades de bajo impacto, como caminatas muy cortas o juegos" +
                                                  "\n tranquilos, siempre monitoreando la tolerancia del ni�o. Es crucial el consumo diario de 2.5 a 3 Litros de agua al d�a (diez a doce vasos de tama�o regular)" +
                                                  "\n o m�s si presenta fiebre o dificultad respiratoria que aumente la p�rdida de l�quidos, para mantener una hidrataci�n �ptima; esto es vital para fluidificar" +
                                                  "\n las secreciones pulmonares, facilitar su expulsi�n, ayudar a regular la temperatura corporal y asegurar el correcto funcionamiento de los �rganos,     " +
                                                  "\n especialmente los ri�ones, que procesar�n los medicamentos. POSIBLE TRATAMIENTO: Para la neumon�a en ni�os, el tratamiento depende de si es de origen  " +
                                                  "\n bacteriano, viral o f�ngico, aunque la mayor�a de los casos bacterianos se tratan con antibi�ticos. La elecci�n del antibi�tico es determinada por el  " +
                                                  "\n m�dico, bas�ndose en la edad del ni�o, el tipo de bacteria sospechada y los patrones de resistencia locales. Algunos antibi�ticos comunes incluyen la  " +
                                                  "\n amoxicilina (marcas comunes como Amoxil o Binotal), o en casos m�s severos o resistentes, ceftriaxona (una marca com�n es Rocephin) o azitromicina     " +
                                                  "\n (una marca com�n es Zithromax o Azyth); es fundamental que el tratamiento antibi�tico se complete en su totalidad, incluso si el ni�o parece mejorar,  " +
                                                  "\n para prevenir reca�das y resistencia. Adem�s de los antibi�ticos, se pueden usar antipir�ticos/analg�sicos como el paracetamol (marcas comunes como    " +
                                                  "\n Tempra o Tylenol) o el ibuprofeno (marcas comunes como Advil o Motrin) para controlar la fiebre y el dolor. En algunos casos, si la respiraci�n es muy " +
                                                  "\n comprometida, podr�a ser necesario ox�geno suplementario. En cuanto a la alimentaci�n, es recomendable que el ni�o consuma alimentos que sean de f�cil " +
                                                  "\n digesti�n, suaves y nutritivos para apoyar la recuperaci�n del sistema respiratorio y fortalecer el sistema inmune; esto incluye caldo de pollo o de   " +
                                                  "\n verduras, que aportan l�quidos y electrolitos esenciales para la hidrataci�n y pueden ayudar a calmar la garganta irritada; pur�s de frutas y verduras " +
                                                  "\n como el pur� de papa (aporta Potasio y Vitamina C), pur� de calabaza (rica en Vitamina A, importante para la salud de las membranas mucosas) o pur� de " +
                                                  "\n manzana (suave para el est�mago y fuente de fibra); prote�nas de f�cil digesti�n como pollo deshebrado, pescado blanco o huevo, que son cruciales para " +
                                                  "\n la reparaci�n celular y el mantenimiento de la masa muscular durante la enfermedad; alimentos ricos en Vitamina C como la fresa (aproximadamente 58.8 mg" +
                                                  "\n de Vitamina C por cada 100 gramos, lo que representa cerca del 65% de la ingesta diaria recomendada para un ni�o de 4-8 a�os) y el pimiento rojo (una alta" +
                                                  "\n concentraci�n de Vitamina C, alrededor de 127.7 mg por cada 100 gramos), que son excelentes para el apoyo inmunol�gico; alimentos con antioxidantes como" +
                                                  "\n el aguacate, que provee grasas saludables y Vitamina E, ayudando a proteger las c�lulas del da�o oxidativo; y miel (en ni�os mayores de un a�o), que    " +
                                                  "\n puede ayudar a aliviar la tos y la irritaci�n de garganta. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100%   " +
                                                  "\n que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico " +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagnostico no le satisface" +
                                                  "\n del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores."); 
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visi�n borrosa, P�rdida de peso.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n Es recomendable que el ni�o, durante la fase de diagn�stico y manejo de la diabetes, mantenga una actividad f�sica regular y adaptada a su condici�n," +
                                                  "\n ya que la actividad f�sica es fundamental para mejorar la sensibilidad a la insulina, controlar los niveles de glucosa en sangre y mantener un peso  " +
                                                  "\n saludable, lo cual es vital en el manejo de la diabetes; se recomienda que realice 60 minutos o m�s de actividad f�sica moderada a vigorosa la mayor�a" +
                                                  "\n de los d�as de la semana, integrando ejercicios aer�bicos como correr, nadar o andar en bicicleta, y al menos tres d�as a la semana, actividades de   " +
                                                  "\n fortalecimiento muscular y �seo. Es crucial monitorear los niveles de glucosa antes, durante y despu�s del ejercicio para prevenir hipo o hiperglucemias," +
                                                  "\n y ajustar la ingesta de alimentos o la dosis de insulina seg�n las indicaciones m�dicas. Tambi�n es crucial el consumo diario de 2 a 2.5 Litros de agua " +
                                                  "\n al d�a (aproximadamente ocho a diez vasos de tama�o regular) para mantener una excelente hidrataci�n, lo que ayuda a la funci�n renal, a la eliminaci�n" +
                                                  "\n del exceso de glucosa a trav�s de la orina en casos de hiperglucemia y al correcto metabolismo de los alimentos y medicamentos.                        " +
                                                  "\n POSIBLE TRATAMIENTO: Para la diabetes en ni�os, el tratamiento depende del tipo de diabetes; para la Diabetes Tipo 1, que es la m�s com�n en esta edad " +
                                                  "\n y se caracteriza por la falta de producci�n de insulina, el tratamiento es la insulina de por vida, administrada mediante inyecciones o bomba de insulina;" +
                                                  "\n las marcas de insulina var�an y el tipo y dosis son determinados por el endocrin�logo pedi�trico (por ejemplo, Humalog o Novolog de acci�n r�pida,      " +
                                                  "\n y Lantus o Levemir de acci�n prolongada). Para la Diabetes Tipo 2, que en ni�os est� asociada a menudo con la resistencia a la insulina y el sobrepeso, " +
                                                  "\n el tratamiento inicial puede incluir cambios en el estilo de vida, pero si no son suficientes, se pueden prescribir medicamentos orales como la metformina" +
                                                  "\n (una marca com�n es Glucophage o Dianben), que ayuda a mejorar la sensibilidad a la insulina y reducir la producci�n de glucosa por el h�gado; en ambos   " +
                                                  "\n casos, el monitoreo constante de la glucosa en sangre es fundamental. En cuanto a la alimentaci�n, es esencial una dieta balanceada que controle la ingesta" +
                                                  "\n de carbohidratos, priorice alimentos con bajo �ndice gluc�mico y sea rica en fibra para mantener estables los niveles de glucosa en sangre y promover un   " +
                                                  "\n peso saludable; esto incluye verduras sin almid�n como el br�coli (aporta Vitamina C, Vitamina K y fibra, ayudando a la digesti�n y el control gluc�mico)  " +
                                                  "\n y la espinaca (rica en Magnesio, Vitamina K y Vitamina A, que pueden mejorar la sensibilidad a la insulina); frutas enteras con moderaci�n como la manzana " +
                                                  "\n (con fibra soluble que ayuda a ralentizar la absorci�n de az�car) y las bayas (ar�ndanos, fresas, moras) que son ricas en antioxidantes (como antocianinas)" +
                                                  "\n y fibra, con bajo impacto en la glucosa; fuentes de prote�na magra como pollo, pescado, frijoles y lentejas, que son fundamentales para la saciedad y el   " +
                                                  "\n mantenimiento de la masa muscular sin elevar dr�sticamente la glucosa; granos integrales como la avena (aporta fibra soluble como el beta-glucano, que ayuda" +
                                                  "\n a regular la glucosa y el colesterol) y el arroz integral, que proveen carbohidratos complejos que se digieren m�s lentamente; y grasas saludables presentes" +
                                                  "\n en el aguacate (fuente de grasas monoinsaturadas y Vitamina E, que pueden mejorar la sensibilidad a la insulina y la salud cardiovascular) y nueces, que    " +
                                                  "\n contribuyen a la saciedad y aportan nutrientes esenciales. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que   " +
                                                  "\n el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de      " +
                                                  "\n Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagnostico no le satisface      " +
                                                  "\n del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresi�n en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n Es recomendable que el ni�o, durante el manejo del asma, mantenga una actividad f�sica regular y controlada, ya que el ejercicio bien manejado puede " +
                                                  "\n mejorar la funci�n pulmonar y la resistencia, pero debe ser supervisado para evitar desencadenar ataques; se recomienda que realice actividades f�sicas" +
                                                  "\n de baja a moderada intensidad, como caminar, nadar o andar en bicicleta, y que evite deportes de alta intensidad o de clima fr�o que puedan agravar sus" +
                                                  "\n s�ntomas, a menos que un m�dico lo autorice y se tomen las precauciones necesarias, como el uso de un broncodilatador antes del ejercicio; es crucial  " +
                                                  "\n que el ni�o tenga su medicaci�n de rescate a mano y que los adultos est�n capacitados para identificar y manejar una crisis asm�tica durante la actividad" +
                                                  "\n f�sica. Tambi�n es crucial el consumo diario de 2 a 2.5 Litros de agua al d�a (aproximadamente ocho a diez vasos de tama�o regular) para mantener una   " +
                                                  "\n excelente hidrataci�n, lo que ayuda a fluidificar las secreciones respiratorias, prevenir la deshidrataci�n y apoyar la funci�n pulmonar, lo cual es vital" +
                                                  "\n para el manejo del asma. POSIBLE TRATAMIENTO: Para el asma en ni�os, el tratamiento se centra en el control de los s�ntomas y la prevenci�n de las       " +
                                                  "\n exacerbaciones; se utiliza una combinaci�n de medicamentos de control a largo plazo para reducir la inflamaci�n de las v�as respiratorias y medicamentos " +
                                                  "\n de rescate de acci�n r�pida para aliviar los s�ntomas durante una crisis. Los medicamentos de control incluyen corticosteroides inhalados como la fluticasona" +
                                                  "\n (una marca com�n es Flixotide o Seretide, este �ltimo combinado con salmeterol) o la budesonida (una marca com�n es Pulmicort), que reducen la inflamaci�n;" +
                                                  "\n tambi�n se pueden usar broncodilatadores de acci�n prolongada (LABA) en combinaci�n con corticosteroides inhalados si los s�ntomas no se controlan adecuadamente." +
                                                  "\n Los medicamentos de rescate son broncodilatadores de acci�n corta (SABA) como el salbutamol o albuterol (marcas comunes como Ventol�n o ProAir), que relajan " +
                                                  "\n r�pidamente los m�sculos de las v�as respiratorias para abrir los bronquios; es fundamental que el ni�o y sus cuidadores sepan c�mo usar correctamente los   " +
                                                  "\n inhaladores y c�mo reconocer y actuar ante una crisis asm�tica, y que el tratamiento sea supervisado por un neum�logo pediatra. En cuanto a la alimentaci�n, " +
                                                  "\n aunque no cura el asma, una dieta saludable puede apoyar la salud pulmonar y el sistema inmune; esto incluye alimentos ricos en Vitamina C como la naranja   " +
                                                  "\n (aproximadamente 53.2 mg de Vitamina C por cada 100 gramos) y el pimiento rojo (con alrededor de 127.7 mg de Vitamina C por cada 100 gramos), que tienen     " +
                                                  "\n propiedades antioxidantes y antiinflamatorias, y pueden ayudar a reducir el estr�s oxidativo en los pulmones; alimentos con Vitamina D como la leche fortificada" +
                                                  "\n y el salm�n, ya que se ha demostrado que niveles adecuados de Vitamina D est�n asociados con una mejor funci�n pulmonar y una menor frecuencia de ataques de asma;" +
                                                  "\n alimentos ricos en Vitamina E presente en el aguacate (con grasas saludables y Vitamina E, un antioxidante que puede proteger las c�lulas pulmonares) y las   " +
                                                  "\n semillas de girasol, que tambi�n tienen propiedades antioxidantes; alimentos con Magnesio como la espinaca y los frijoles negros, que pueden ayudar a relajar " +
                                                  "\n los m�sculos bronquiales y mejorar la funci�n pulmonar; y �cidos grasos Omega-3 encontrados en pescados grasos como el salm�n y las sardinas, que poseen propiedades" +
                                                  "\n antiinflamatorias que pueden ser beneficiosas para las v�as respiratorias. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al " +
                                                  "\n 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de  " +
                                                  "\n Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagnostico no le satisface del todo  " +
                                                  "\n se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, P�rdida de peso, Ganglios linf�ticos inflamados, Erupci�n cut�nea (Diarrea).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n Es recomendable que el ni�o, durante el manejo del VIH/SIDA, mantenga una actividad f�sica regular y adaptada a su estado de salud, energ�a y fase del tratamiento;" +
                                                  "\n la actividad f�sica moderada es beneficiosa para fortalecer el sistema inmune, mejorar la fuerza muscular, reducir la fatiga y mejorar el bienestar general, pero  " +
                                                  "\n debe ser supervisada para evitar el sobreesfuerzo o el riesgo de infecciones oportunistas si el sistema inmune est� comprometido; se recomienda que realice 30 a 60" +
                                                  "\n minutos de actividad moderada la mayor�a de los d�as de la semana, como caminatas, juegos tranquilos o nataci�n, siempre bajo la supervisi�n de un m�dico o fisioterapeuta" +
                                                  "\n para asegurar que las actividades sean seguras y apropiadas. Tambi�n es crucial el consumo diario de 2 a 2.5 Litros de agua al d�a (aproximadamente ocho a diez vasos" +
                                                  "\n de tama�o regular) para mantener una excelente hidrataci�n, lo cual es vital para el funcionamiento �ptimo de sus �rganos, la eliminaci�n de toxinas, el apoyo al    " +
                                                  "\n metabolismo de los medicamentos antirretrovirales y para compensar cualquier p�rdida de l�quidos debido a diarrea o fiebre, que pueden ser s�ntomas asociados a la   " +
                                                  "\n enfermedad o efectos secundarios del tratamiento. POSIBLE TRATAMIENTO: Para el VIH/SIDA en ni�os, el tratamiento principal es la terapia antirretroviral (TAR), que  " +
                                                  "\n consiste en una combinaci�n de medicamentos para suprimir la replicaci�n del virus, reducir la carga viral y mejorar el sistema inmune; la elecci�n de los medicamentos" +
                                                  "\n y las dosis son altamente individualizadas y son determinadas por un infect�logo pediatra, bas�ndose en la edad del ni�o, el peso, la carga viral, el recuento de    " +
                                                  "\n c�lulas CD4 y la presencia de resistencias; algunos ejemplos de medicamentos antirretrovirales incluyen inhibidores de la transcriptasa inversa an�logos de nucle�sidos" +
                                                  "\n (ITIAN) como el abacavir (una marca com�n es Ziagen) y la lamivudina (una marca com�n es Epivir); inhibidores de la transcriptasa inversa no an�logos de nucle�sidos " +
                                                  "\n (ITINN) como el efavirenz (una marca com�n es Sustiva); e inhibidores de la proteasa (IP) como el lopinavir/ritonavir (una marca com�n es Kaletra). El cumplimiento  " +
                                                  "\n estricto del tratamiento es fundamental para su efectividad y para prevenir el desarrollo de resistencia. Adem�s de la TAR, se pueden utilizar medicamentos para prevenir" +
                                                  "\n o tratar infecciones oportunistas, como antibi�ticos (por ejemplo, cotrimoxazol o Bactrim) o antif�ngicos (por ejemplo, fluconazol o Diflucan). En cuanto a la alimentaci�n," +
                                                  "\n es fundamental una dieta nutritiva y de alta densidad cal�rica para apoyar el crecimiento, fortalecer el sistema inmune y contrarrestar la malnutrici�n o los efectos " +
                                                  "\n secundarios de los medicamentos, priorizando alimentos seguros y de f�cil digesti�n; esto incluye prote�nas de alto valor biol�gico como el pollo, pescado, huevos y  " +
                                                  "\n legumbres, que son esenciales para la reparaci�n celular y el mantenimiento de la masa muscular, crucial para un sistema inmune fuerte; cereales integrales como la   " +
                                                  "\n avena y el arroz integral, que proveen energ�a sostenida y fibra; frutas y verduras de colores vivos como el mango (aporta Vitamina A y Vitamina C, esenciales para   " +
                                                  "\n la funci�n inmune y la salud de las mucosas) y el br�coli (rico en Vitamina C y antioxidantes, que apoyan el sistema de defensa del cuerpo); alimentos ricos en grasas" +
                                                  "\n saludables como el aguacate (fuente de Vitamina E y grasas monoinsaturadas, importantes para la energ�a y la absorci�n de vitaminas liposolubles) y los frutos secos; " +
                                                  "\n y alimentos fortificados con vitaminas y minerales para compensar posibles deficiencias, como los que contienen Zinc (presente en carne de res magra y lentejas, crucial" +
                                                  "\n para la funci�n inmune) y Hierro (en carnes rojas y espinacas, para prevenir la anemia). Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza" +
                                                  "\n al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida" +
                                                  "\n para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda" +
                                                  "\n mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreci�n anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n Es recomendable que el ni�o, durante el tratamiento de la gonorrea, mantenga reposo relativo y evite cualquier actividad f�sica extenuante que pueda agravar la " +
                                                  "\n inflamaci�n o incomodidad, especialmente si hay afectaci�n en articulaciones o diseminaci�n de la infecci�n; la actividad principal debe ser descansar para permitir" +
                                                  "\n que el cuerpo se recupere y los antibi�ticos act�en eficazmente. Una vez que el m�dico confirme la erradicaci�n de la infecci�n y los s�ntomas hayan desaparecido " +
                                                  "\n por completo, se puede reintroducir gradualmente la actividad f�sica normal y adaptada a su edad. Tambi�n es crucial el consumo diario de 2 a 2.5 Litros de agua al" +
                                                  "\n d�a (aproximadamente ocho a diez vasos de tama�o regular) para mantener una excelente hidrataci�n, lo cual es vital para apoyar la funci�n renal en el procesamiento" +
                                                  "\n de los medicamentos, ayudar a la eliminaci�n de toxinas y prevenir la deshidrataci�n, especialmente si el ni�o experimenta fiebre u otros s�ntomas.                 " +
                                                  "\n POSIBLE TRATAMIENTO: Para la gonorrea en ni�os, que es una infecci�n bacteriana, el tratamiento principal consiste en la administraci�n inmediata de antibi�ticos,  " +
                                                  "\n siendo la ceftriaxona (que suele ser inyectable, una marca com�n es Rocephin) el tratamiento de elecci�n, a menudo en una dosis �nica; en casos espec�ficos o si la " +
                                                  "\n ceftriaxona no es viable, se puede considerar la cefixima (oral) combinada con azitromicina (oral, una marca com�n es Zithromax o Azyth). La elecci�n y dosis del   " +
                                                  "\n antibi�tico ser�n determinadas por un m�dico especialista, quien tambi�n evaluar� si existe coinfecci�n con Chlamydia, que a menudo se trata simult�neamente con    " +
                                                  "\n doxiciclina o azitromicina. Es fundamental que el tratamiento se complete en su totalidad para asegurar la erradicaci�n de la bacteria y prevenir complicaciones    " +
                                                  "\n graves como da�o articular o infecciones diseminadas, incluyendo meningitis. En cuanto a la alimentaci�n, no existe una dieta espec�fica para la gonorrea, pero     " +
                                                  "\n una nutrici�n adecuada es esencial para apoyar el sistema inmune del ni�o y facilitar la recuperaci�n del cuerpo frente a la infecci�n y el tratamiento antibi�tico;" +
                                                  "\n esto incluye una dieta balanceada rica en prote�nas de alto valor biol�gico como pollo, pescado y huevos, que son esenciales para la reparaci�n de tejidos y el     " +
                                                  "\n fortalecimiento muscular; granos integrales como la avena y el arroz integral, que proveen energ�a sostenida y fibra; frutas y verduras variadas como la zanahoria  " +
                                                  "\n (aporta Vitamina A, importante para la salud de las mucosas) y las naranjas (ricas en Vitamina C, un potente antioxidante que apoya el sistema inmunol�gico), as�   " +
                                                  "\n como verduras de hoja verde como la espinaca (que aporta Vitamina K, Hierro y Magnesio, esenciales para la energ�a y la funci�n celular); y alimentos ricos en Zinc " +
                                                  "\n como las legumbres (frijoles, lentejas) o carne magra, ya que este mineral es crucial para la funci�n inmune y la cicatrizaci�n. Este es solo un Diagn�stico        " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas,  " +
                                                  "\n para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si    " +
                                                  "\n la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida)            " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linf�ticos inflamados, �lceras o llagas dolorosas, Picaz�n o ardor, Dolor al orinar.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n Es recomendable que el ni�o, durante los brotes de herpes genital, mantenga un reposo relativo y evite actividades que puedan causar fricci�n o irritaci�n en " +
                                                  "\n la zona afectada, como deportes de contacto o ropa ajustada; el objetivo principal es minimizar la incomodidad y facilitar la curaci�n de las lesiones. Una vez" +
                                                  "\n que las lesiones hayan sanado por completo y no haya s�ntomas activos, el ni�o puede retomar gradualmente sus actividades f�sicas normales, siempre priorizando" +
                                                  "\n la higiene para prevenir la propagaci�n. Tambi�n es crucial el consumo diario de 2 a 2.5 Litros de agua al d�a (aproximadamente ocho a diez vasos de tama�o regular)" +
                                                  "\n para mantener una excelente hidrataci�n, lo cual es vital para el bienestar general, apoyar la funci�n renal en el procesamiento de medicamentos y ayudar en la" +
                                                  "\n eliminaci�n de toxinas. POSIBLE TRATAMIENTO: Para el herpes genital en ni�os, que es causado por el virus del herpes simple (VHS), el tratamiento principal se " +
                                                  "\n basa en medicamentos antivirales para controlar los brotes, reducir la gravedad y la frecuencia de los mismos, y acelerar la curaci�n de las lesiones; los     " +
                                                  "\n medicamentos antivirales m�s comunes incluyen el aciclovir (marcas comunes como Zovirax o Virmen), el valaciclovir (una marca com�n es Valtrex) y el famciclovir" +
                                                  "\n (una marca com�n es Famvir). La dosis y la duraci�n del tratamiento ser�n determinadas por un m�dico especialista, generalmente un pediatra o infect�logo, y pueden" +
                                                  "\n variar si se trata de un primer brote, brotes recurrentes o si se busca una terapia supresora; es fundamental que el tratamiento se inicie lo antes posible una vez" +
                                                  "\n que aparecen los s�ntomas. Adem�s de los antivirales, se pueden usar analg�sicos como el paracetamol (marcas comunes como Tempra o Tylenol) o el ibuprofeno (marcas" +
                                                  "\n comunes como Advil o Motrin) para aliviar el dolor y la fiebre, as� como cremas t�picas con lidoca�na para el alivio local de la incomodidad. En cuanto a la       " +
                                                  "\n alimentaci�n, no existe una dieta que cure el herpes, pero una nutrici�n adecuada puede fortalecer el sistema inmune y ayudar al cuerpo a combatir el virus y      " +
                                                  "\n manejar los brotes; esto incluye alimentos ricos en Lisina y bajos en Arginina, ya que se cree que una dieta con m�s Lisina y menos Arginina puede ayudar a        " +
                                                  "\n reducir la replicaci�n del virus; alimentos ricos en Lisina incluyen el pollo, pescado (como el bacalao), legumbres (frijoles, lentejas) y productos l�cteos       " +
                                                  "\n como el yogur (que adem�s aporta probi�ticos beneficiosos para la salud intestinal); es recomendable limitar alimentos ricos en Arginina como el chocolate,        " +
                                                  "\n las nueces y las semillas, durante los brotes; tambi�n se incluyen alimentos ricos en Vitamina C como la guayaba (con una alta concentraci�n de Vitamina C,        " +
                                                  "\n alrededor de 228 mg por cada 100 gramos) y el pimiento rojo (aproximadamente 127.7 mg de Vitamina C por cada 100 gramos), que son potentes antioxidantes y         " +
                                                  "\n cruciales para el sistema inmunol�gico, ayudando a la reparaci�n de los tejidos; alimentos con Zinc presente en la carne de res magra, lentejas y garbanzos,       " +
                                                  "\n ya que este mineral es esencial para la funci�n inmunol�gica y la cicatrizaci�n de heridas; alimentos con Vitamina A como la zanahoria (rica en betacarotenos,     " +
                                                  "\n precursores de la Vitamina A) y la espinaca, importantes para la salud de la piel y las membranas mucosas, que pueden verse afectadas durante un brote; y alimentos" +
                                                  "\n con �cidos grasos Omega-3 encontrados en pescados grasos como el salm�n y las sardinas, que tienen propiedades antiinflamatorias que pueden ayudar a reducir       " +
                                                  "\n la inflamaci�n asociada a las lesiones. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa       " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor     " +
                                                  "\n seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar " +
                                                  "\n a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, �lceras indoloras, Erupci�n cut�nea, Dolor de cabeza, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer S�filis." +
                                                  "\n Es recomendable que el ni�o, durante el tratamiento de la s�filis, mantenga un reposo relativo, especialmente si presenta s�ntomas sist�micos como fiebre o " +
                                                  "\n malestar general, o si hay afectaci�n neurol�gica; la actividad f�sica debe ser m�nima para permitir que el cuerpo se recupere completamente de la infecci�n." +
                                                  "\n Es crucial evitar cualquier actividad extenuante hasta que el m�dico confirme que la infecci�n ha sido erradicada y los s�ntomas han desaparecido por completo." +
                                                  "\n Una vez que el tratamiento sea exitoso y el ni�o est� recuperado, puede retomar gradualmente sus actividades f�sicas normales de acuerdo a su edad. Tambi�n es" +
                                                  "\n crucial el consumo diario de 2 a 2.5 Litros de agua al d�a (aproximadamente ocho a diez vasos de tama�o regular) para mantener una excelente hidrataci�n, lo  " +
                                                  "\n cual es vital para apoyar la funci�n renal en el procesamiento de los medicamentos, ayudar a la eliminaci�n de toxinas y prevenir la deshidrataci�n, especialmente" +
                                                  "\n si el ni�o experimenta fiebre u otros s�ntomas. POSIBLE TRATAMIENTO: Para la s�filis en ni�os, que es una infecci�n bacteriana causada por Treponema pallidum, " +
                                                  "\n el tratamiento de elecci�n es la penicilina G benzat�nica, administrada mediante inyecciones intramusculares; la dosis y la duraci�n del tratamiento dependen  " +
                                                  "\n de la etapa de la s�filis y si es cong�nita o adquirida. En casos de s�filis cong�nita, que es transmitida de la madre al beb�, el tratamiento puede ser m�s   " +
                                                  "\n prolongado y a menudo requiere la administraci�n de penicilina intravenosa en el hospital. La penicilina G benzat�nica es un antibi�tico altamente efectivo    " +
                                                  "\n para erradicar la bacteria y prevenir complicaciones a largo plazo, como da�o neurol�gico o card�aco. Es crucial que el tratamiento se complete en su totalidad" +
                                                  "\n y que se realicen controles de seguimiento para asegurar la erradicaci�n de la infecci�n. Para ni�os al�rgicos a la penicilina, un m�dico especialista, generalmente" +
                                                  "\n un infect�logo pediatra, considerar� alternativas como la ceftriaxona, aunque la penicilina sigue siendo el est�ndar de oro. En cuanto a la alimentaci�n, no   " +
                                                  "\n existe una dieta espec�fica para la s�filis, pero una nutrici�n adecuada es fundamental para fortalecer el sistema inmune del ni�o y facilitar la recuperaci�n " +
                                                  "\n del cuerpo frente a la infecci�n y el tratamiento antibi�tico; esto incluye una dieta balanceada rica en prote�nas de alto valor biol�gico como pollo, pescado " +
                                                  "\n y huevos, que son esenciales para la reparaci�n de tejidos y el fortalecimiento muscular; granos integrales como la avena y el arroz integral, que proveen energ�a" +
                                                  "\n sostenida y fibra; frutas y verduras variadas como el br�coli (aporta Vitamina C y antioxidantes, que apoyan el sistema de defensa del cuerpo) y la espinaca    " +
                                                  "\n (rica en Hierro, Vitamina K y Magnesio, esenciales para la energ�a y la funci�n celular); as� como alimentos ricos en Zinc como las legumbres (frijoles, lentejas)" +
                                                  "\n o carne magra, ya que este mineral es crucial para la funci�n inmune y la cicatrizaci�n. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no " +
                                                  "\n garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un     " +
                                                  "\n Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagnostico no le       " +
                                                  "\n satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, P�rdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n Es recomendable que el ni�o, durante el tratamiento de la tuberculosis, mantenga un reposo adecuado en la fase intensiva de la enfermedad, limitando la actividad" +
                                                  "\n f�sica extenuante para permitir que su cuerpo se enfoque en combatir la infecci�n y se recupere. Una vez que el m�dico lo autorice y los s�ntomas mejoren        " +
                                                  "\n significativamente, generalmente despu�s de las primeras dos semanas de tratamiento efectivo y cuando ya no sea contagioso, se puede reintroducir gradualmente   " +
                                                  "\n la actividad f�sica, comenzando con caminatas cortas y suaves para fortalecer el coraz�n y los pulmones, aumentando progresivamente la intensidad seg�n su       " +
                                                  "\n tolerancia. Es crucial el consumo diario de 2 a 2.5 Litros de agua al d�a (aproximadamente ocho a diez vasos de tama�o regular) para mantener una excelente      " +
                                                  "\n hidrataci�n, lo cual es vital para apoyar la funci�n renal en el procesamiento de los m�ltiples medicamentos antituberculosos, facilitar la eliminaci�n de       " +
                                                  "\n toxinas y prevenir la deshidrataci�n, especialmente si el ni�o experimenta fiebre o sudoraci�n nocturna, s�ntomas comunes de la enfermedad.                      " +
                                                  "\n POSIBLE TRATAMIENTO: Para la tuberculosis en ni�os, el tratamiento es prolongado y se basa en una combinaci�n de medicamentos antituberculosos que deben tomarse " +
                                                  "\n de forma estricta y supervisada para asegurar la erradicaci�n de la bacteria y prevenir el desarrollo de resistencia a los f�rmacos; el esquema de tratamiento   " +
                                                  "\n inicial m�s com�n para la tuberculosis sensible a f�rmacos incluye una fase intensiva de dos meses seguida de una fase de continuaci�n, utilizando medicamentos  " +
                                                  "\n como la isoniazida (una marca com�n en M�xico es Cemid�n o combinada en Rifater o Rifinah), la rifampicina (marcas comunes como Rifaldin o tambi�n en combinaciones" +
                                                  "\n como Rifater o Rifinah), la pirazinamida (tambi�n presente en Rifater) y el etambutol (una marca com�n es Myambutol). La dosis y la duraci�n del tratamiento son " +
                                                  "\n estrictamente determinadas por un m�dico especialista, quien puede ser un infect�logo o neum�logo pediatra, y son ajustadas seg�n el peso y la respuesta del ni�o." +
                                                  "\n Es crucial la administraci�n conjunta de piridoxina (Vitamina B6) (por ejemplo, con Cemid�n B6) con la isoniazida para prevenir la neurotoxicidad. En cuanto a la" +
                                                  "\n alimentaci�n, es fundamental una dieta nutritiva y de alta densidad cal�rica para ayudar al ni�o a recuperar el peso perdido, fortalecer su sistema inmune y     " +
                                                  "\n contrarrestar la desnutrici�n, que a menudo acompa�a a la tuberculosis; esto incluye prote�nas de alto valor biol�gico como carne magra de res, pollo, pescado,  " +
                                                  "\n huevos y legumbres (frijoles, lentejas), que son esenciales para la reparaci�n de tejidos, el mantenimiento de la masa muscular y la producci�n de anticuerpos;  " +
                                                  "\n carbohidratos complejos como el arroz integral, la avena, la papa y el camote, que proveen energ�a sostenida y fibra, importante para la salud intestinal; grasas" +
                                                  "\n saludables presentes en el aguacate (aporta Vitamina E y grasas monoinsaturadas) y aceites vegetales como el de oliva o ma�z, que contribuyen a la densidad cal�rica" +
                                                  "\n y la absorci�n de vitaminas liposolubles; frutas y verduras variadas, ricas en Vitaminas y Minerales que fortalecen el sistema inmune, como la Vitamina C (en la " +
                                                  "\n naranja, guayaba y pimiento rojo, con propiedades antioxidantes y antiinflamatorias), Vitamina A (en la zanahoria y espinaca, importante para la salud de las    " +
                                                  "\n mucosas y la funci�n inmune), Vitamina D (en la leche fortificada y salm�n, asociada con una mejor respuesta inmune a la TB), y Zinc (en las lentejas y carne,   " +
                                                  "\n crucial para la funci�n inmunol�gica). Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa      " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor   " +
                                                  "\n seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar" +
                                                  "\n a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchaz�n en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n Es recomendable que el ni�o, con artritis, mantenga una actividad f�sica regular y adaptada para fortalecer los m�sculos alrededor de las articulaciones, " +
                                                  "\n mantener la flexibilidad y reducir la inflamaci�n, pero siempre bajo supervisi�n m�dica y de un fisioterapeuta para evitar sobrecargar las articulaciones " +
                                                  "\n afectadas; se sugiere realizar ejercicios de bajo impacto como la nataci�n, bicicleta est�tica o caminatas suaves, buscando per�odos de 30 a 60 minutos la" +
                                                  "\n mayor�a de los d�as de la semana, ajustando la intensidad seg�n el nivel de dolor y la fase de la enfermedad. Durante los brotes o per�odos de dolor agudo," +
                                                  "\n es importante limitar la actividad y priorizar el reposo para permitir la desinflamaci�n y la recuperaci�n. Tambi�n es crucial el consumo diario de 2 a 2.5" +
                                                  "\n Litros de agua al d�a (aproximadamente ocho a diez vasos de tama�o regular) para mantener una excelente hidrataci�n, lo cual es vital para la salud de los " +
                                                  "\n cart�lagos, la lubricaci�n de las articulaciones y para apoyar la funci�n renal en el procesamiento de los medicamentos. POSIBLE TRATAMIENTO: Para la artritis" +
                                                  "\n en ni�os, com�nmente conocida como artritis idiop�tica juvenil (AIJ), el tratamiento busca controlar la inflamaci�n, aliviar el dolor, prevenir el da�o articular" +
                                                  "\n y mantener la funci�n de las articulaciones; el tratamiento es altamente individualizado y supervisado por un reumat�logo pediatra. Inicialmente, se pueden " +
                                                  "\n usar antiinflamatorios no esteroideos (AINEs) como el ibuprofeno (marcas comunes como Advil o Motrin) o el naproxeno (una marca com�n es Flanax) para reducir" +
                                                  "\n el dolor y la inflamaci�n. Si los AINEs no son suficientes, se utilizan f�rmacos antirreum�ticos modificadores de la enfermedad (FARMEs) como el metotrexato " +
                                                  "\n (una marca com�n es Rheumatrex o Trexall), que act�a lentamente para reducir la inflamaci�n y prevenir el da�o articular a largo plazo. En casos m�s severos " +
                                                  "\n o cuando no hay respuesta a los FARMEs tradicionales, se pueden emplear agentes biol�gicos como el etanercept (una marca com�n es Enbrel) o el adalimumab    " +
                                                  "\n (una marca com�n es Humira), que son medicamentos inyectables que act�an sobre componentes espec�ficos del sistema inmune. Adem�s de los medicamentos, la    " +
                                                  "\n fisioterapia y la terapia ocupacional son fundamentales para mantener la movilidad y la fuerza. En cuanto a la alimentaci�n, una dieta antiinflamatoria puede" +
                                                  "\n complementar el tratamiento m�dico, ayudando a reducir la inflamaci�n y apoyar la salud articular; esto incluye: alimentos ricos en �cidos grasos Omega-3 como" +
                                                  "\n el salm�n (graso y fuente de Omega-3, que reduce la inflamaci�n y puede aliviar el dolor articular) y las semillas de ch�a, que tienen potentes propiedades   " +
                                                  "\n antiinflamatorias; frutas y verduras de colores vivos ricas en antioxidantes como las cerezas (con antocianinas, que pueden reducir la inflamaci�n) y el br�coli" +
                                                  "\n (aporta Vitamina C y Vitamina K, con efectos protectores y antiinflamatorios); alimentos con Vitamina D y Calcio como la leche fortificada y el yogur (que    " +
                                                  "\n contribuyen a la salud �sea, vital en ni�os con artritis); y especias como la c�rcuma (con curcumina, un potente antiinflamatorio) que pueden incorporarse en " +
                                                  "\n la dieta para sus propiedades antiinflamatorias. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente   " +
                                                  "\n tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer" +
                                                  "\n mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho" +
                                                  "\n consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n Es recomendable que el ni�o, durante la fase aguda de la tosferina, mantenga reposo estricto para conservar energ�a y minimizar los episodios de tos severa" +
                                                  "\n que pueden ser agotadores y peligrosos; la actividad f�sica debe ser evitada por completo para prevenir la irritaci�n de las v�as respiratorias y el riesgo" +
                                                  "\n de complicaciones como la neumon�a o la apnea. Una vez que la fase de tos parox�stica disminuya significativamente y bajo estricta supervisi�n m�dica, se  " +
                                                  "\n puede reintroducir gradualmente la actividad ligera, como juegos tranquilos o caminatas cortas, siempre monitoreando la tolerancia y evitando cualquier    " +
                                                  "\n esfuerzo que pueda desencadenar la tos. Tambi�n es crucial el consumo diario de 2 a 2.5 Litros de agua al d�a (aproximadamente ocho a diez vasos de tama�o " +
                                                  "\n regular), preferiblemente en peque�as tomas frecuentes, para mantener una excelente hidrataci�n, lo cual es vital para fluidificar las secreciones, prevenir" +
                                                  "\n la deshidrataci�n causada por los v�mitos asociados a los ataques de tos, y apoyar la funci�n general de los �rganos, incluyendo los ri�ones que procesar�n " +
                                                  "\n los medicamentos. POSIBLE TRATAMIENTO: Para la tosferina, una infecci�n bacteriana altamente contagiosa causada por Bordetella pertussis, el tratamiento   " +
                                                  "\n principal son los antibi�ticos, que son m�s efectivos si se administran en las primeras etapas de la enfermedad para acortar la duraci�n y la gravedad de  " +
                                                  "\n los s�ntomas, as� como para reducir la transmisi�n; los antibi�ticos de elecci�n son los macr�lidos, como la azitromicina (una marca com�n es Zithromax o  " +
                                                  "\n Azyth), la eritromicina (una marca com�n es Pantomicina o Erythromycin) o la claritromicina (una marca com�n es Klacid o Biaxin). La duraci�n del tratamiento" +
                                                  "\n suele ser de 5 a 14 d�as, dependiendo del antibi�tico elegido; es fundamental que el tratamiento sea completado en su totalidad para erradicar la bacteria." +
                                                  "\n En casos graves, especialmente en lactantes, puede requerirse hospitalizaci�n para monitorear la respiraci�n, administrar ox�geno y l�quidos por v�a intravenosa;" +
                                                  "\n tambi�n se pueden usar antitusivos y expectorantes, pero su eficacia en la tosferina es limitada y deben ser usados con precauci�n y bajo indicaci�n m�dica." +
                                                  "\n En cuanto a la alimentaci�n, debido a que los ataques de tos pueden provocar v�mitos, es recomendable que el ni�o consuma alimentos en peque�as porciones y " +
                                                  "\n de f�cil digesti�n para asegurar la ingesta cal�rica y nutricional; esto incluye caldo de pollo o verduras, que aporta l�quidos y electrolitos, esencial    " +
                                                  "\n para la hidrataci�n y suave para el est�mago; pur�s suaves de verduras como la calabaza (rica en Vitamina A, importante para la salud de las mucosas respiratorias)" +
                                                  "\n o de frutas como el pl�tano (aporta Potasio, un electrolito importante, y es f�cil de digerir); alimentos ricos en Vitamina C como la naranja (aproximadamente" +
                                                  "\n 53.2 mg de Vitamina C por cada 100 gramos) y la guayaba (con una alta concentraci�n de Vitamina C, alrededor de 228 mg por cada 100 gramos), que son antioxidantes" +
                                                  "\n y fortalecen el sistema inmunol�gico; fuentes de prote�na magra como pollo deshebrado o pescado blanco, en peque�as cantidades, para apoyar la reparaci�n de  " +
                                                  "\n tejidos y la energ�a; y cereales suaves como la avena cocida, que provee energ�a y es f�cil de tragar. Este es solo un Diagn�stico predeterminado l�gico,     " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se      " +
                                                  "\n recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta" +
                                                  "\n del Diagnostico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchaz�n de las gl�ndulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n Es recomendable que el ni�o, durante la enfermedad de las paperas, mantenga reposo estricto para facilitar la recuperaci�n y prevenir complicaciones, especialmente" +
                                                  "\n si presenta fiebre o inflamaci�n significativa de las gl�ndulas; la actividad f�sica debe ser m�nima y se debe evitar cualquier esfuerzo que pueda aumentar la     " +
                                                  "\n incomodidad o el riesgo de complicaciones como la orquitis (inflamaci�n testicular) en ni�os mayores. Una vez que la inflamaci�n disminuya y el m�dico lo autorice," +
                                                  "\n el ni�o puede retomar gradualmente las actividades normales. Tambi�n es crucial el consumo diario de 2 a 2.5 Litros de agua al d�a (aproximadamente ocho a diez    " +
                                                  "\n vasos de tama�o regular) para mantener una excelente hidrataci�n, lo cual es vital para ayudar a bajar la fiebre, prevenir la deshidrataci�n y asegurar el correcto" +
                                                  "\n funcionamiento de los �rganos, facilitando el proceso de recuperaci�n del cuerpo. POSIBLE TRATAMIENTO: Para las paperas, una infecci�n viral causada por el virus  " +
                                                  "\n de las paperas, no existe un tratamiento antiviral espec�fico, por lo que el manejo se enfoca en aliviar los s�ntomas y prevenir complicaciones; el tratamiento es " +
                                                  "\n principalmente de soporte. Se utilizan analg�sicos y antipir�ticos como el paracetamol (marcas comunes como Tempra o Tylenol) o el ibuprofeno (marcas comunes como " +
                                                  "\n Advil o Motrin) para controlar la fiebre y el dolor asociado a la inflamaci�n de las gl�ndulas salivales, la mand�bula o los test�culos. Tambi�n se recomienda     " +
                                                  "\n aplicar compresas fr�as o calientes en las �reas inflamadas para reducir la hinchaz�n y el dolor. Es fundamental que el ni�o reciba mucho descanso y se le ofrezcan" +
                                                  "\n l�quidos para mantenerse hidratado. En algunos casos, si la inflamaci�n es severa o hay complicaciones (como meningitis o encefalitis), puede ser necesaria la     " +
                                                  "\n hospitalizaci�n. En cuanto a la alimentaci�n, debido a la inflamaci�n de las gl�ndulas salivales que puede dificultar la masticaci�n y la degluci�n, es recomendable" +
                                                  "\n que el ni�o consuma alimentos suaves, l�quidos o semil�quidos, y de f�cil digesti�n para asegurar una adecuada nutrici�n y evitar molestias; esto incluye l�quidos  " +
                                                  "\n claros y caldos como caldo de pollo o verduras, sueros orales (como Pedialyte o Electrolit) y jugos naturales diluidos, que aportan l�quidos y electrolitos         " +
                                                  "\n esenciales para la hidrataci�n; pur�s y papillas como pur� de papa, pur� de manzana, compotas de frutas como el pl�tano (aporta Potasio y es f�cil de digerir),     " +
                                                  "\n y pur�s de verduras como la calabaza (rica en Vitamina A, que contribuye a la salud de las mucosas); yogur natural y gelatinas, que son suaves para el est�mago y la" +
                                                  "\n garganta, y el yogur puede aportar probi�ticos beneficiosos; y alimentos ricos en Vitamina C, aunque la masticaci�n puede ser un problema, el jugo diluido de naranja" +
                                                  "\n o guayaba (ambas ricas en Vitamina C, antioxidante crucial para el sistema inmunol�gico) puede ser beneficioso; tambi�n se incluyen prote�nas l�quidas o muy suaves," +
                                                  "\n como suplementos nutricionales l�quidos si la ingesta de alimentos s�lidos es muy dif�cil. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no" +
                                                  "\n garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un      " +
                                                  "\n Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagnostico no le satisface" +
                                                  "\n del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupci�n cut�nea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n Es recomendable que el ni�o, durante la infecci�n por el virus Zika, mantenga reposo estricto para facilitar la recuperaci�n y reducir el riesgo de complicaciones," +
                                                  "\n especialmente si presenta fiebre o s�ntomas neurol�gicos; la actividad f�sica debe ser m�nima y se deben evitar esfuerzos que puedan agravar el malestar. Una vez  " +
                                                  "\n que el m�dico lo autorice y los s�ntomas hayan desaparecido por completo, el ni�o puede retomar gradualmente sus actividades normales. Tambi�n es crucial el consumo" +
                                                  "\n diario de 2 a 2.5 Litros de agua al d�a (aproximadamente ocho a diez vasos de tama�o regular) para mantener una excelente hidrataci�n, lo cual es vital para ayudar " +
                                                  "\n a bajar la fiebre, prevenir la deshidrataci�n causada por la sudoraci�n o v�mitos, y asegurar el correcto funcionamiento de los �rganos mientras el cuerpo combate " +
                                                  "\n la infecci�n viral. POSIBLE TRATAMIENTO: Para la infecci�n por el virus Zika, al ser una enfermedad viral, no existe un tratamiento antiviral espec�fico, por lo que" +
                                                  "\n el manejo se enfoca en aliviar los s�ntomas; el tratamiento es principalmente de soporte. Se utilizan analg�sicos y antipir�ticos como el paracetamol (marcas comunes" +
                                                  "\n como Tempra o Tylenol) o el ibuprofeno (marcas comunes como Advil o Motrin) para controlar la fiebre, el dolor de cabeza, el dolor muscular y articular. Es         " +
                                                  "\n fundamental evitar la aspirina y otros AINEs en ni�os con sospecha de Zika hasta que se haya descartado el dengue, debido al riesgo de complicaciones hemorr�gicas. " +
                                                  "\n Tambi�n se recomienda mucho reposo y la ingesta abundante de l�quidos para prevenir la deshidrataci�n. En algunos casos, si se presentan complicaciones neurol�gicas" +
                                                  "\n como el s�ndrome de Guillain-Barr�, el tratamiento se centrar� en el manejo de estas condiciones espec�ficas, lo cual puede requerir hospitalizaci�n y terapias     " +
                                                  "\n especializadas. En cuanto a la alimentaci�n, una dieta nutritiva y de f�cil digesti�n es esencial para apoyar la recuperaci�n del ni�o y fortalecer su sistema      " +
                                                  "\n inmunol�gico; esto incluye l�quidos claros y caldos como caldo de pollo o verduras, sueros orales (como Pedialyte o Electrolit) y jugos naturales diluidos, que     " +
                                                  "\n aportan l�quidos y electrolitos esenciales para la hidrataci�n y el reemplazo de sales minerales; pur�s y papillas como pur� de papa, pur� de manzana, compotas     " +
                                                  "\n de frutas como el pl�tano (aporta Potasio, un electrolito importante, y es f�cil de digerir), y pur�s de verduras como la zanahoria (rica en Vitamina A, que contribuye" +
                                                  "\n a la salud de las mucosas y la visi�n); alimentos ricos en Vitamina C como la naranja (aproximadamente 53.2 mg de Vitamina C por cada 100 gramos) y la guayaba      " +
                                                  "\n (con una alta concentraci�n de Vitamina C, alrededor de 228 mg por cada 100 gramos), que son potentes antioxidantes y cruciales para el sistema inmunol�gico,       " +
                                                  "\n ayudando a combatir la infecci�n viral; fuentes de prote�na suave como pollo deshebrado o pescado blanco, en peque�as cantidades, para apoyar la reparaci�n de      " +
                                                  "\n tejidos y la energ�a, evitando el sobreesfuerzo digestivo; y cereales suaves como la avena cocida o el arroz blanco, que proveen energ�a y son f�ciles de digerir.  " +
                                                  "\n Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus  " +
                                                  "\n respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente," +
                                                  "\n adem�s por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app" +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, V�mitos, Deshidrataci�n, Dolor abdominal.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n Es recomendable que el ni�o, durante la infecci�n por rotavirus, mantenga un reposo estricto para conservar energ�a y permitir que el cuerpo se recupere de la diarrea" +
                                                  "\n y los v�mitos; la actividad f�sica debe ser m�nima para evitar la deshidrataci�n y la fatiga, y cualquier esfuerzo extenuante debe ser evitado hasta que los s�ntomas " +
                                                  "\n gastrointestinales hayan desaparecido por completo y el ni�o haya recuperado su energ�a habitual. Tambi�n es crucial el consumo diario de 2.5 a 3 Litros de agua al   " +
                                                  "\n d�a (aproximadamente diez a doce vasos de tama�o regular), o incluso m�s, para mantener una excelente hidrataci�n, lo cual es vital para reponer los l�quidos y       " +
                                                  "\n electrolitos perdidos por la diarrea y el v�mito, prevenir la deshidrataci�n severa y asegurar el correcto funcionamiento de todos los �rganos.                       " +
                                                  "\n POSIBLE TRATAMIENTO: Para la infecci�n por rotavirus, al ser una enfermedad viral, no existe un tratamiento antiviral espec�fico, por lo que el manejo se enfoca en   " +
                                                  "\n la prevenci�n y el alivio de los s�ntomas, principalmente la diarrea y el v�mito; la piedra angular del tratamiento es la rehidrataci�n oral con soluciones de        " +
                                                  "\n rehidrataci�n oral (SRO) como Pedialyte o Electrolit, que contienen la combinaci�n adecuada de agua, sales y az�car para reponer los l�quidos y electrolitos perdidos." +
                                                  "\n Es fundamental administrar estas soluciones en peque�as tomas frecuentes para evitar provocar m�s v�mitos. En algunos casos, se puede considerar el uso de probi�ticos" +
                                                  "\n (por ejemplo, aquellos con Lactobacillus rhamnosus GG o Saccharomyces boulardii, como Floratil) que pueden ayudar a acortar la duraci�n de la diarrea; sin embargo,   " +
                                                  "\n su uso debe ser bajo supervisi�n m�dica. Los medicamentos antidiarreicos no se recomiendan en ni�os con rotavirus. En casos de deshidrataci�n severa o v�mitos        " +
                                                  "\n persistentes, puede ser necesaria la hospitalizaci�n para administrar l�quidos por v�a intravenosa. La vacunaci�n contra el rotavirus (disponible con marcas como     " +
                                                  "\n Rotateq o Rotarix) es la forma m�s efectiva de prevenir la infecci�n y sus complicaciones. En cuanto a la alimentaci�n, es crucial reintroducir la dieta normal tan   " +
                                                  "\n pronto como sea posible, ofreciendo alimentos de f�cil digesti�n para evitar el riesgo de desnutrici�n; esto incluye el pecho materno o f�rmula si el ni�o es lactante;" +
                                                  "\n cereales como el arroz blanco o la avena cocida, que son suaves y aportan energ�a; prote�nas magras como pollo deshebrado o pescado blanco, en peque�as porciones, para" +
                                                  "\n ayudar a la recuperaci�n y el mantenimiento de la masa muscular; frutas como el pl�tano (aporta Potasio, un electrolito vital para la funci�n muscular y nerviosa, y es" +
                                                  "\n f�cil de digerir) y pur� de manzana, que son suaves para el est�mago; y verduras cocidas como la zanahoria (rica en Vitamina A, que apoya la salud de las mucosas     " +
                                                  "\n intestinales y el sistema inmune) y la papa. Se deben evitar los alimentos grasos, azucarados o muy condimentados que puedan agravar la diarrea. Este es solo un      " +
                                                  "\n Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n   " +
                                                  "\n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su    " +
                                                  "\n salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y   " +
                                                  "\n espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, N�useas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n Es recomendable que el ni�o, durante la infecci�n por Listeria (Listeriosis), mantenga reposo estricto para permitir que su cuerpo combata la infecci�n y se recupere," +
                                                  "\n especialmente si hay fiebre, diarrea o s�ntomas m�s graves como meningitis; la actividad f�sica debe ser m�nima o nula para conservar energ�a y evitar cualquier      " +
                                                  "\n esfuerzo que pueda agravar la condici�n o el riesgo de complicaciones. Una vez que el m�dico confirme la erradicaci�n de la infecci�n y los s�ntomas hayan desaparecido" +
                                                  "\n por completo, se puede reintroducir gradualmente la actividad ligera, siempre monitoreando la tolerancia del ni�o. Tambi�n es crucial el consumo diario de 2.5 a       " +
                                                  "\n 3 Litros de agua al d�a (diez a doce vasos de tama�o regular) para mantener una excelente hidrataci�n, lo cual es vital para apoyar la funci�n renal en el procesamiento" +
                                                  "\n de los antibi�ticos, ayudar a la eliminaci�n de toxinas y prevenir la deshidrataci�n, especialmente si el ni�o experimenta fiebre o diarrea.                            " +
                                                  "\n POSIBLE TRATAMIENTO: Para la Listeriosis, una infecci�n bacteriana grave causada por Listeria monocytogenes, el tratamiento principal y de elecci�n son los antibi�ticos," +
                                                  "\n que deben iniciarse de inmediato, especialmente en ni�os; la ampicilina (una marca com�n es Omnipen o Polycillin) es el antibi�tico de elecci�n y a menudo se combina con" +
                                                  "\n gentamicina (una marca com�n es Garamicina o Gentax), un aminogluc�sido, para una mayor efectividad, especialmente en casos graves como meningitis o infecciones         " +
                                                  "\n diseminadas. La duraci�n del tratamiento es prolongada, generalmente de 14 a 21 d�as o m�s, dependiendo de la gravedad de la infecci�n y la respuesta cl�nica del ni�o.  " +
                                                  "\n Es fundamental que el tratamiento antibi�tico se complete en su totalidad para asegurar la erradicaci�n de la bacteria y prevenir reca�das o complicaciones a largo plazo." +
                                                  "\n En algunos casos, si la respuesta no es adecuada o hay alergia a la penicilina, el m�dico podr�a considerar alternativas como el cotrimoxazol (una marca com�n es Bactrim" +
                                                  "\n o Septrin). El monitoreo hospitalario es com�n en casos severos para el soporte vital. En cuanto a la alimentaci�n, una dieta nutritiva y de f�cil digesti�n es esencial " +
                                                  "\n para apoyar la recuperaci�n del ni�o, fortalecer su sistema inmune y contrarrestar cualquier p�rdida de apetito o nutrientes debido a la enfermedad; esto incluye        " +
                                                  "\n prote�nas de alto valor biol�gico como pollo deshebrado, pescado blanco o huevo, que son esenciales para la reparaci�n celular y el fortalecimiento muscular; cereales   " +
                                                  "\n suaves y de f�cil digesti�n como el arroz blanco o la avena cocida, que proveen energ�a sin sobrecargar el sistema digestivo; frutas y verduras cocidas y en pur�, para  " +
                                                  "\n facilitar la ingesta y la digesti�n, como la calabaza (rica en Vitamina A, que apoya la salud de las mucosas y la funci�n inmune) y el pl�tano (aporta Potasio, un       " +
                                                  "\n electrolito vital, y es f�cil de digerir); tambi�n alimentos ricos en Vitamina C como el pur� de guayaba (con una alta concentraci�n de Vitamina C, alrededor de 228 mg  " +
                                                  "\n por cada 100 gramos) o jugo de naranja diluido (aproximadamente 53.2 mg de Vitamina C por cada 100 gramos), que son antioxidantes y cruciales para el sistema            " +
                                                  "\n inmunol�gico. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la          " +
                                                  "\n enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento            " +
                                                  "\n adecuado de su paciente, adem�s por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes       " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, V�mitos.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n Es recomendable que el ni�o, durante la infecci�n por Shigelosis, mantenga reposo estricto para conservar energ�a y permitir que el cuerpo se recupere de la" +
                                                  "\n diarrea severa, a menudo con sangre, y el malestar abdominal; la actividad f�sica debe ser m�nima para evitar la deshidrataci�n, la fatiga y el riesgo de   " +
                                                  "\n complicaciones, y cualquier esfuerzo extenuante debe ser evitado hasta que los s�ntomas gastrointestinales hayan desaparecido por completo y el ni�o haya   " +
                                                  "\n recuperado su energ�a habitual. Tambi�n es crucial el consumo diario de 2.5 a 3 Litros de agua al d�a (aproximadamente diez a doce vasos de tama�o regular)," +
                                                  "\n o incluso m�s, para mantener una excelente hidrataci�n, lo cual es vital para reponer los l�quidos y electrolitos perdidos por la diarrea profusa y los v�mitos," +
                                                  "\n prevenir la deshidrataci�n severa y el desequilibrio electrol�tico, y asegurar el correcto funcionamiento de todos los �rganos. POSIBLE TRATAMIENTO: Para la" +
                                                  "\n Shigelosis, una infecci�n bacteriana causada por Shigella spp., el tratamiento principal son los antibi�ticos, que son fundamentales para acortar la duraci�n" +
                                                  "\n de la enfermedad, reducir la gravedad de los s�ntomas y disminuir la transmisi�n, ya que la infecci�n es altamente contagiosa; la elecci�n del antibi�tico se" +
                                                  "\n basa en la resistencia local, pero com�nmente se utilizan la azitromicina (una marca com�n es Zithromax o Azyth), la ceftriaxona (una marca com�n es Rocephin)" +
                                                  "\n o la ciprofloxacina (esta �ltima generalmente no se recomienda en ni�os peque�os a menos que sea estrictamente necesario y bajo supervisi�n m�dica). La duraci�n" +
                                                  "\n del tratamiento antibi�tico suele ser de 3 a 5 d�as, y es fundamental que se complete en su totalidad para asegurar la erradicaci�n de la bacteria y prevenir " +
                                                  "\n reca�das o el desarrollo de resistencia. Adem�s de los antibi�ticos, la rehidrataci�n oral con soluciones de rehidrataci�n oral (SRO) como Pedialyte o Electrolit" +
                                                  "\n es esencial para reponer l�quidos y electrolitos. Los medicamentos antidiarreicos que disminuyen la motilidad intestinal (como la loperamida) est�n contraindicados" +
                                                  "\n en la shigelosis porque pueden prolongar la infecci�n y aumentar el riesgo de complicaciones. En casos de deshidrataci�n severa o complicaciones, puede requerirse" +
                                                  "\n hospitalizaci�n para administraci�n de l�quidos intravenosos. En cuanto a la alimentaci�n, una dieta nutritiva y de f�cil digesti�n es crucial para apoyar la    " +
                                                  "\n recuperaci�n del ni�o, fortalecer su sistema inmune y contrarrestar la malnutrici�n o la p�rdida de peso debido a la diarrea severa; esto incluye el pecho materno" +
                                                  "\n o f�rmula si el ni�o es lactante; cereales suaves y de f�cil digesti�n como el arroz blanco, la avena cocida o la papa, que proveen energ�a sin sobrecargar el   " +
                                                  "\n sistema digestivo; prote�nas magras y de f�cil digesti�n como pollo deshebrado o pescado blanco, en peque�as porciones, para ayudar a la reparaci�n de tejidos   " +
                                                  "\n y el mantenimiento de la masa muscular; frutas como el pl�tano (aporta Potasio, un electrolito vital para la funci�n muscular y nerviosa, y es f�cil de digerir) " +
                                                  "\n y pur� de manzana, que son suaves para el est�mago; y verduras cocidas como la zanahoria (rica en Vitamina A, que apoya la salud de las mucosas intestinales y el" +
                                                  "\n sistema inmune) y calabaza. Se deben evitar los alimentos ricos en fibra insoluble, grasas, az�cares simples y l�cteos (a menos que sean f�rmulas sin lactosa o  " +
                                                  "\n yogur con probi�ticos si se toleran bien) que puedan agravar la diarrea. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100%" +
                                                  "\n que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida" +
                                                  "\n para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagnostico no le satisface del todo se le     " +
                                                  "\n recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos cr�nica, Producci�n excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad Pulmonar Obstructiva Cr�nica (EPOC)." +
                                                  "\n Es recomendable que el ni�o, con EPOC, mantenga una actividad f�sica regular y adaptada a su capacidad respiratoria para fortalecer la musculatura respiratoria," +
                                                  "\n mejorar la resistencia y la funci�n pulmonar, pero siempre bajo supervisi�n m�dica y con un plan de rehabilitaci�n pulmonar para evitar el sobreesfuerzo y el   " +
                                                  "\n riesgo de exacerbaciones; se sugiere realizar ejercicios de bajo impacto como caminatas suaves en terreno llano, nataci�n o bicicleta est�tica, buscando periodos" +
                                                  "\n de 30 a 60 minutos la mayor�a de los d�as de la semana, aumentando la duraci�n y la intensidad progresivamente seg�n la tolerancia del ni�o, y evitando actividades" +
                                                  "\n que puedan agravar los s�ntomas como ambientes muy fr�os o con alta contaminaci�n; es crucial que el ni�o tenga su medicaci�n de rescate a mano y aprenda t�cnicas" +
                                                  "\n de respiraci�n como la respiraci�n con labios fruncidos para mejorar la ventilaci�n. Tambi�n es crucial el consumo diario de 2 a 2.5 Litros de agua al d�a       " +
                                                  "\n (aproximadamente ocho a diez vasos de tama�o regular) para mantener una excelente hidrataci�n, lo cual es vital para fluidificar las secreciones pulmonares,     " +
                                                  "\n facilitar su expectoraci�n y prevenir la deshidrataci�n, especialmente si el ni�o experimenta dificultad para respirar o ha estado tosiendo mucho.               " +
                                                  "\n POSIBLE TRATAMIENTO: Para la EPOC en ni�os, aunque es menos com�n que en adultos y a menudo asociada a factores como la prematuridad, infecciones recurrentes o  " +
                                                  "\n exposici�n a irritantes ambientales en las primeras etapas de la vida, el tratamiento se enfoca en el control de los s�ntomas, la prevenci�n de exacerbaciones y " +
                                                  "\n la mejora de la calidad de vida; el tratamiento es altamente individualizado y supervisado por un neum�logo pediatra. Se utilizan broncodilatadores inhalados    " +
                                                  "\n para relajar los m�sculos de las v�as respiratorias y facilitar la respiraci�n; estos pueden ser de acci�n corta para alivio r�pido (como el salbutamol o        " +
                                                  "\n albuterol, marcas como Ventol�n o Proair HFA) o de acci�n prolongada para el mantenimiento (como el tiotropio, marca Spiriva, o combinaciones como               " +
                                                  "\n salmeterol/fluticasona, marca Advair). En casos de inflamaci�n, se pueden prescribir corticosteroides inhalados (como la budesonida, marca Pulmicort, o la       " +
                                                  "\n fluticasona, marca Flovent) solos o en combinaci�n con broncodilatadores. Durante las exacerbaciones, pueden ser necesarios corticosteroides orales (como la     " +
                                                  "\n prednisolona) y antibi�ticos si hay una infecci�n bacteriana. La oxigenoterapia se indica si el ni�o presenta bajos niveles de ox�geno en sangre. Adem�s,        " +
                                                  "\n la rehabilitaci�n pulmonar es un componente fundamental para mejorar la funci�n respiratoria y la tolerancia al ejercicio. En cuanto a la alimentaci�n, una      " +
                                                  "\n dieta nutritiva y balanceada es esencial para mantener un peso saludable, proporcionar energ�a y fortalecer el sistema inmune, lo cual es crucial para la        " +
                                                  "\n salud pulmonar; esto incluye prote�nas magras de alto valor biol�gico como pollo, pescado, huevos y legumbres, que son importantes para el mantenimiento de      " +
                                                  "\n la masa muscular y la reparaci�n de tejidos; carbohidratos complejos como el arroz integral, la avena y las papas, que proveen energ�a sostenida; grasas         " +
                                                  "\n saludables presentes en el aguacate (aporta Vitamina E y grasas monoinsaturadas, que pueden ayudar a reducir la inflamaci�n) y los frutos secos, que contribuyen " +
                                                  "\n a la densidad cal�rica; y una gran variedad de frutas y verduras ricas en antioxidantes y Vitaminas que benefician la funci�n pulmonar, como la naranja y        " +
                                                  "\n las fresas (ricas en Vitamina C, un potente antioxidante que ayuda a prevenir el da�o por radicales libres y reducir la inflamaci�n pulmonar), el mel�n cantalupo" +
                                                  "\n (aporta Vitamina A y Vitamina C, esenciales para el sistema inmune y la salud pulmonar), y verduras de hoja verde como la espinaca y el br�coli (que aportan     " +
                                                  "\n Vitamina K, Magnesio y otros antioxidantes). Tambi�n se recomienda fraccionar las comidas en porciones m�s peque�as y frecuentes para evitar la sensaci�n de     " +
                                                  "\n plenitud que puede dificultar la respiraci�n, y limitar los alimentos que producen gases. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado  " +
                                                  "\n no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de    " +
                                                  "\n un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagnostico no le   " +
                                                  "\n satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreci�n anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n Es recomendable que el ni�o, durante el tratamiento de la clamidia, mantenga reposo relativo para permitir que el cuerpo se recupere de la infecci�n y los " +
                                                  "\n medicamentos act�en eficazmente, especialmente si presenta s�ntomas como dolor o secreci�n; la actividad f�sica debe ser limitada para evitar la irritaci�n" +
                                                  "\n o el malestar en la zona afectada. Una vez que el m�dico confirme la erradicaci�n de la infecci�n y los s�ntomas hayan desaparecido por completo, el ni�o  " +
                                                  "\n puede retomar gradualmente sus actividades f�sicas normales, siempre priorizando la higiene para prevenir futuras infecciones. Tambi�n es crucial el consumo" +
                                                  "\n diario de 2 a 2.5 Litros de agua al d�a (aproximadamente ocho a diez vasos de tama�o regular) para mantener una excelente hidrataci�n, lo cual es vital para" +
                                                  "\n apoyar la funci�n renal en el procesamiento de los antibi�ticos, ayudar a la eliminaci�n de toxinas y prevenir la deshidrataci�n, especialmente si el ni�o  " +
                                                  "\n experimenta fiebre u otros s�ntomas. POSIBLE TRATAMIENTO: Para la clamidia en ni�os, que es una infecci�n bacteriana causada por Chlamydia trachomatis, el  " +
                                                  "\n tratamiento principal consiste en la administraci�n de antibi�ticos; los antibi�ticos de elecci�n son la azitromicina (una marca com�n es Zithromax o Azyth)," +
                                                  "\n administrada en una dosis �nica, o la doxiciclina (una marca com�n es Vibramicina o Doxiclat), aunque la doxiciclina generalmente no se recomienda en ni�os  " +
                                                  "\n menores de 8 a�os debido al riesgo de tinci�n dental, por lo que la azitromicina es preferida en este grupo de edad. La elecci�n y dosis del antibi�tico ser�n" +
                                                  "\n determinadas por un m�dico especialista, quien tambi�n evaluar� si existe coinfecci�n con gonorrea, que a menudo se trata simult�neamente. Es fundamental que" +
                                                  "\n el tratamiento se complete en su totalidad para asegurar la erradicaci�n de la bacteria y prevenir complicaciones graves como enfermedad inflamatoria p�lvica" +
                                                  "\n en ni�as o infecciones en los ojos (conjuntivitis) y pulmones (neumon�a) en reci�n nacidos expuestos durante el parto. Se debe realizar un seguimiento para  " +
                                                  "\n confirmar la curaci�n, especialmente en casos de infecci�n persistente o recurrente. En cuanto a la alimentaci�n, una nutrici�n adecuada es esencial para    " +
                                                  "\n apoyar el sistema inmune del ni�o y facilitar la recuperaci�n del cuerpo frente a la infecci�n y el tratamiento antibi�tico; esto incluye una dieta balanceada" +
                                                  "\n rica en prote�nas de alto valor biol�gico como pollo, pescado y huevos, que son esenciales para la reparaci�n de tejidos y el fortalecimiento muscular; granos" +
                                                  "\n integrales como la avena y el arroz integral, que proveen energ�a sostenida y fibra; frutas y verduras variadas como la zanahoria (aporta Vitamina A, importante" +
                                                  "\n para la salud de las mucosas y la funci�n inmune) y las naranjas (ricas en Vitamina C, un potente antioxidante que apoya el sistema inmunol�gico), as� como    " +
                                                  "\n verduras de hoja verde como la espinaca (que aporta Vitamina K, Hierro y Magnesio, esenciales para la energ�a y la funci�n celular); y alimentos ricos en Zinc " +
                                                  "\n como las legumbres (frijoles, lentejas) o carne magra, ya que este mineral es crucial para la funci�n inmune y la cicatrizaci�n. Este es solo un Diagn�stico   " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas," +
                                                  "\n para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud  " +
                                                  "\n si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la                  " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, N�useas, Dolor de cabeza severo, Rigidez en el cuello, Confusi�n.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n Es recomendable que el ni�o, durante la fase aguda de la enfermedad, mantenga un reposo estricto en cama, ya que la meningitis es una condici�n grave que requiere" +
                                                  "\n m�nima estimulaci�n y m�xima conservaci�n de energ�a para la recuperaci�n cerebral y general del cuerpo; cualquier actividad f�sica debe ser evitada por completo " +
                                                  "\n en este periodo. Una vez que la fase aguda haya pasado y bajo estricta supervisi�n m�dica, la rehabilitaci�n o la reintroducci�n gradual de movimientos muy suaves" +
                                                  "\n solo se realizar� si no hay secuelas. Tambi�n es crucial el consumo diario de 2.5 a 3 Litros de agua al d�a (diez a doce vasos de tama�o regular) en tomas peque�as" +
                                                  "\n y frecuentes, preferiblemente por v�a intravenosa si el ni�o no puede beber, para mantener una hidrataci�n �ptima y asegurar el correcto funcionamiento de los    " +
                                                  "\n �rganos, especialmente los ri�ones, que procesar�n los medicamentos, y para ayudar a controlar la fiebre. POSIBLE TRATAMIENTO: Para la meningitis bacteriana en   " +
                                                  "\n ni�os, el tratamiento es una emergencia m�dica y consiste en la administraci�n inmediata de antibi�ticos intravenosos de amplio espectro para combatir la infecci�n." +
                                                  "\n La elecci�n del antibi�tico depender� de la edad del ni�o, el tipo de bacteria sospechada y los patrones de resistencia locales, y ser� determinada por un m�dico " +
                                                  "\n especialista. Es vital que el tratamiento antibi�tico se inicie lo antes posible y se complete en su totalidad para prevenir complicaciones graves como da�o      " +
                                                  "\n cerebral, p�rdida de audici�n o incluso la muerte. Algunos antibi�ticos comunes incluyen la ceftriaxona (una marca com�n es Rocephin) o la ampicilina (una marca  " +
                                                  "\n com�n es Omnipen o Polycillin), a veces combinados con vancomicina (una marca com�n es Vancocin). Adem�s de los antibi�ticos, se pueden usar corticosteroides (como" +
                                                  "\n la dexametasona, una marca com�n es Decadron) para reducir la inflamaci�n cerebral y prevenir secuelas neurol�gicas, siempre bajo indicaci�n m�dica. Es fundamental" +
                                                  "\n el monitoreo constante en un entorno hospitalario. En cuanto a la alimentaci�n, una vez que el ni�o pueda tolerar la v�a oral, es recomendable que consuma alimentos" +
                                                  "\n que sean f�ciles de digerir y nutritivos para apoyar la recuperaci�n del sistema nervioso y el fortalecimiento del sistema inmune; esto incluye caldos y sopas suaves" +
                                                  "\n que aportan l�quidos y electrolitos; pur�s de verduras como la calabaza, que aporta una buena cantidad de Vitamina A (alrededor de 369 �g por cada 100 gramos, lo que" +
                                                  "\n representa cerca del 74% de la ingesta diaria recomendada para un ni�o de 4-8 a�os), esencial para la recuperaci�n de las mucosas y la visi�n; y frutas blandas como " +
                                                  "\n el pl�tano, que aporta Potasio (aproximadamente 358 mg por cada 100 gramos), un electrolito vital para la funci�n nerviosa y muscular. Tambi�n son beneficiosos los  " +
                                                  "\n alimentos ricos en antioxidantes como el aguacate, que provee grasas saludables y Vitamina E, que pueden proteger las c�lulas neuronales del da�o oxidativo. Este es " +
                                                  "\n solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas" +
                                                  "\n est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por" +
                                                  "\n su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, P�rdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, P�rdida de apetito.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer C�ncer." +
                                                  "\n Es recomendable que el ni�o, cuya actividad f�sica debe ser siempre supervisada y adaptada a su estado de salud, energ�a y fase del tratamiento oncol�gico, mantenga" +
                                                  "\n periodos de descanso adecuados y evite cualquier actividad extenuante o que pueda comprometer su sistema inmune; se deben priorizar actividades de bajo impacto que " +
                                                  "\n fomenten la movilidad y el bienestar, como caminatas cortas y suaves, juegos tranquilos o ejercicios de estiramiento muy ligeros, siempre que el m�dico lo autorice " +
                                                  "\n y seg�n su tolerancia. El objetivo es mantener la fuerza muscular y mejorar la calidad de vida sin sobrecargar su cuerpo, buscando alcanzar periodos de 30 a 60 minutos" +
                                                  "\n de actividad moderada en los d�as que se encuentre bien, pero con flexibilidad y respetando sus l�mites. Tambi�n es crucial el consumo diario de 2.5 a 3 Litros de  " +
                                                  "\n agua al d�a (diez a doce vasos de tama�o regular), o m�s si tiene fiebre, v�mitos o diarrea como efectos secundarios del tratamiento, para mantener una excelente   " +
                                                  "\n hidrataci�n, lo cual es vital para el funcionamiento �ptimo de sus �rganos, la eliminaci�n de toxinas y el apoyo al metabolismo de los medicamentos.                " +
                                                  "\n POSIBLE TRATAMIENTO: Para el c�ncer en ni�os de esta edad, el tratamiento es altamente individualizado y complejo, dependiendo del tipo espec�fico de c�ncer, su    " +
                                                  "\n etapa y la salud general del ni�o. Generalmente, implica una combinaci�n de quimioterapia (medicamentos que matan las c�lulas cancerosas, como la vincristina, una  " +
                                                  "\n marca com�n es Oncovin, o el ciclofosfamida, una marca com�n es Cytoxan), radioterapia (uso de radiaci�n para destruir c�lulas cancerosas), cirug�a (para extirpar  " +
                                                  "\n tumores), e incluso inmunoterapia o terapia dirigida. Es fundamental que el tratamiento sea manejado por un equipo multidisciplinario de onc�logos pedi�tricos.     " +
                                                  "\n Adem�s del tratamiento oncol�gico, se utilizan medicamentos de soporte para manejar los efectos secundarios, como antiem�ticos para las n�useas (como el ondansetr�n," +
                                                  "\n una marca com�n es Zofran), analg�sicos para el dolor (como el paracetamol, una marca com�n es Tempra o Tylenol), y factores estimulantes de colonias para apoyar la" +
                                                  "\n m�dula �sea. En cuanto a la alimentaci�n, es recomendable que el ni�o consuma alimentos que fortalezcan su sistema inmune, le proporcionen energ�a y le ayuden a    " +
                                                  "\n tolerar mejor el tratamiento, priorizando aquellos que sean nutritivos y de f�cil digesti�n; esto incluye prote�nas de alto valor biol�gico (pollo, pescado, huevos," +
                                                  "\n legumbres) que son esenciales para la reparaci�n celular y el mantenimiento de la masa muscular, crucial durante y despu�s de la quimioterapia; las verduras de hoja" +
                                                  "\n verde oscuro como la col rizada (kale), que aporta Vitamina K, Vitamina A y antioxidantes, que pueden ayudar a reducir la inflamaci�n y proteger las c�lulas, y el  " +
                                                  "\n pimiento rojo, que ofrece una gran cantidad de Vitamina C (alrededor de 127.7 mg por cada 100 gramos, lo que representa cerca del 142% de la ingesta diaria recomendada" +
                                                  "\n para un ni�o de 4-8 a�os), esencial para la funci�n inmunol�gica; las frutas de colores vivos como la granada, rica en antioxidantes (como punicalaginas) que pueden" +
                                                  "\n ofrecer propiedades protectoras, y las uvas, que contienen resveratrol, un compuesto con potencial antiinflamatorio. El aguacate proporciona grasas saludables y    " +
                                                  "\n Vitamina E, importantes para la energ�a y la salud general. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente" +
                                                  "\n tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer   " +
                                                  "\n mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho       " +
                                                  "\n consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
             
                         }
 
                      }
                    
                }
          if (EdadMasculino.equals("Infancia = 0-9 a�os")) {
            frame.setVisible(true);
        } else {
            frame.setVisible(false);
        }
               
              
            }    
             
        public Estudio2() {
        this("", "", "", "", "");   
        }

     public void crearInterfaz(){
         if (edadRecibida.equals(edadEsperada)){
        
        return;
         }
       
        scrollpane1.setSize(700,550);
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setLocationRelativeTo(null);
       
      }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }


        public static void main(String args[]) {
        Estudio2 ventanaEstudio2 = new Estudio2("Masculino", "Infancia = 0-9 a�os", "0.90-1.35 m", "Sed excesiva", "Aumento en la frecuencia de orinar, Fatiga ,Visi�n borrosa, P�rdida de peso");
        ventanaEstudio2.crearInterfaz();
    } 
}  
        