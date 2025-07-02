import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Estudio3 implements ActionListener{
    
  
         private final JLabel label1;
         private JScrollPane scrollpane1;
         private JTextArea textarea1;
         private JFrame frame;
         private final String edadEsperada = "Adolescencia = 10-21 a�os";
         private String edadRecibida;
         
        public Estudio3(String nombrePaciente, String Sexo, String EdadMasculino,
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
            
                 if(EdadMasculino.equals("Adolescencia = 10-21 a�os")){
                    
                          if(EstaturaMasculino.equals("0.90-1.35 m")){
                              if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza (gripe)." +
                                                  "\n Durante la fase aguda de la influenza, el descanso es fundamental, por lo que se debe evitar cualquier actividad" +
                                                  "\n f�sica intensa para permitir que el cuerpo utilice su energ�a en combatir la infecci�n. Una vez que la fiebre " +
                                                  "\n haya desaparecido por al menos 24 horas y los s�ntomas mejoren significativamente, se puede reanudar la actividad" + 
                                                  "\n f�sica de forma gradual y ligera. Es crucial aumentar la ingesta de l�quidos para compensar la p�rdida por fiebre" + 
                                                  "\n y sudoraci�n, recomend�ndose un consumo de 2 a 2.5 litros de agua al d�a (ocho a diez vasos), que pueden         " +
                                                  "\n complementarse con t�s tibios y caldos para ayudar a aliviar la congesti�n y el dolor de garganta.               " +
                                                  "\n POSIBLE TRATAMIENTO: El manejo se centra en el alivio de los s�ntomas con descanso y una hidrataci�n adecuada.   " +
                                                  "\n Para la fiebre y el malestar general se utilizan analg�sicos y antipir�ticos de venta libre como el paracetamol  " +
                                                  "\n (marcas comunes en M�xico: Tempra, Tylenol) o el ibuprofeno (marcas: Advil, Motrin). En casos espec�ficos y bajo " +
                                                  "\n prescripci�n m�dica, especialmente si se inicia en las primeras 48 horas de los s�ntomas, se podr�a recetar un   " +
                                                  "\n antiviral como el oseltamivir (marca com�n: Tamiflu) para acortar la duraci�n y severidad de la enfermedad.      " +
                                                  "\n Tambi�n es recomendable consumir alimentos que fortalezcan el sistema inmune y faciliten la recuperaci�n, tales como:" +
                                                  "\n Naranjas, guayabas y pimientos: muy ricas en vitamina C, un potente antioxidante que ayuda a fortalecer las defensas" + 
                                                  "\n del cuerpo para combatir la infecci�n. Caldo de pollo o de verduras: proporciona hidrataci�n, electrolitos       " +
                                                  "\n (como sodio y potasio) y nutrientes de f�cil digesti�n, adem�s de que el vapor puede ayudar a descongestionar.   " +
                                                  "\n Pl�tanos: aportan potasio, un electrolito importante que se puede perder con la sudoraci�n por la fiebre, y son  " +
                                                  "\n f�ciles de digerir. Ajo y jengibre: contienen compuestos con propiedades antimicrobianas y antiinflamatorias que " +
                                                  "\n pueden dar un soporte adicional al sistema inmune y aliviar s�ntomas como el dolor de garganta. Este es solo un  " +
                                                  "\n Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad  " +
                                                  "\n y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico" +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la  " +
                                                  "\n respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes  " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                               textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumon�a." +
                                                  "\n La neumon�a es una infecci�n pulmonar seria que exige reposo absoluto; se debe evitar por completo la actividad f�sica" +
                                                  "\n durante la fase aguda de la enfermedad y la recuperaci�n inicial para no sobrecargar al cuerpo y permitir que los     " +
                                                  "\n pulmones sanen. El regreso a la actividad debe ser muy gradual y siempre bajo la aprobaci�n de un m�dico.             " +
                                                  "\n La hidrataci�n es clave para fluidificar las secreciones bronquiales y facilitar su expulsi�n, por lo que se recomienda" +
                                                  "\n un consumo elevado de l�quidos, de 2.5 a 3 litros diarios (diez a doce vasos), principalmente agua, t�s de hierbas y  " +
                                                  "\n caldos claros. POSIBLE TRATAMIENTO: El tratamiento de la neumon�a debe ser siempre diagnosticado y supervisado por un " +
                                                  "\n m�dico, ya que es fundamental determinar su origen. Si es de origen bacteriano, el pilar del tratamiento son los      " +
                                                  "\n antibi�ticos, como la amoxicilina (marcas comunes en M�xico: Amoxil, Augmentin) o la azitromicina (marcas: Azitrocin, " +
                                                  "\n Zitromax). Es vital completar todo el ciclo de antibi�ticos recetado. Para el manejo de la fiebre y el dolor se puede " +
                                                  "\n usar paracetamol (Tempra). Adicionalmente, una dieta rica en nutrientes es fundamental para fortalecer el sistema inmune" +
                                                  "\n y reparar el tejido pulmonar, incluyendo alimentos como: Kiwis y pimientos rojos, fuentes excepcionales de vitamina C;" +
                                                  "\n tan solo 100 g de kiwi aportan cerca de 90 mg de esta vitamina (m�s del 100% de la ingesta diaria recomendada), crucial" +
                                                  "\n para la funci�n inmunol�gica. Lentejas y pollo, ricos en prote�na para la reparaci�n de tejidos y en zinc, un mineral " +
                                                  "\n esencial para el sistema inmune; una taza de lentejas cocidas puede aportar cerca del 25% del zinc diario necesario.  " +
                                                  "\n Yogur con probi�ticos, especialmente importante si se est� en tratamiento con antibi�ticos, ya que ayuda a restaurar  " +
                                                  "\n la microbiota intestinal ben�fica, clave para una respuesta inmune saludable. Ajo y c�rcuma, el ajo tiene propiedades " +
                                                  "\n antimicrobianas naturales y la c�rcuma contiene curcumina, un potente antiinflamatorio que puede ayudar a reducir la  " +
                                                  "\n inflamaci�n pulmonar. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que  " +
                                                  "\n el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda" +
                                                  "\n hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s" +
                                                  "\n por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico,   " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores."); 
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visi�n borrosa, P�rdida de peso.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n El manejo de la diabetes en la adolescencia se basa en un control cuidadoso del estilo de vida, donde el ejercicio es un pilar." +
                                                  "\n Se recomienda realizar al menos 60 minutos de actividad f�sica moderada a vigorosa la mayor�a de los d�as, combinando          " +
                                                  "\n ejercicios aer�bicos (correr, nadar, bicicleta) con entrenamiento de fuerza, siempre monitoreando los niveles de glucosa antes," +
                                                  "\n durante y despu�s del ejercicio para prevenir episodios de hipoglucemia o hiperglucemia. La hidrataci�n es igualmente vital,   " +
                                                  "\n debiendo consumir de 2 a 3 litros de agua natural al d�a para mantener un buen funcionamiento metab�lico y ayudar a los ri�ones" +
                                                  "\n a procesar el exceso de glucosa; es crucial evitar por completo las bebidas azucaradas y jugos. POSIBLE TRATAMIENTO:           " +
                                                  "\n El tratamiento para la diabetes es estrictamente individualizado y debe ser dirigido por un equipo m�dico, incluyendo un       " +
                                                  "\n endocrin�logo. Para la Diabetes Tipo 1, el tratamiento fundamental es la administraci�n de insulina, usando combinaciones de   " +
                                                  "\n acci�n r�pida para las comidas (marcas comunes en M�xico: Humalog, Novolog) y de acci�n prolongada como basal (marcas: Lantus, " +
                                                  "\n Tresiba). Para la Diabetes Tipo 2, el manejo inicial suele ser con cambios en el estilo de vida y medicamentos orales, siendo  " +
                                                  "\n la metformina (marcas: Dabex, Glucophage) el m�s com�n para mejorar la sensibilidad a la insulina. En algunos casos, se pueden " +
                                                  "\n usar otros medicamentos o incluso requerir insulina seg�n la evoluci�n. La alimentaci�n es la piedra angular del control       " +
                                                  "\n gluc�mico, priorizando alimentos de bajo �ndice gluc�mico, ricos en fibra y nutrientes, como: Avena integral y nopales, ambos  " +
                                                  "\n excepcionalmente ricos en fibra soluble que ralentiza la absorci�n de az�car; una taza de nopal cocido aporta cerca de 5 gramos" +
                                                  "\n de fibra, ayudando a estabilizar la glucosa post-comida. Frijoles negros y lentejas, una fuente ideal de carbohidratos complejos," +
                                                  "\n prote�na vegetal y fibra; una taza de frijoles negros contiene unos 15 gramos de fibra, m�s del 50% de la ingesta diaria       " +
                                                  "\n recomendada, lo que promueve una liberaci�n de energ�a lenta y sostenida. Aguacate y nueces, ricos en grasas monoinsaturadas    " +
                                                  "\n saludables y fibra, que mejoran la saciedad y no elevan el az�car en sangre; medio aguacate puede contener m�s de 5 gramos de fibra." +
                                                  "\n Pescados grasos como el salm�n, excelente fuente de �cidos grasos Omega-3 (DHA y EPA) que ayudan a reducir la inflamaci�n cr�nica " +
                                                  "\n asociada con la resistencia a la insulina. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100%" +
                                                  "\n que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s" +
                                                  "\n de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la   " +
                                                  "\n respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita  " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresi�n en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n El adolescente con asma debe mantenerse bien hidratado para ayudar a fluidificar las secreciones y facilitar la respiraci�n. " +
                                                  "\n Se recomienda consumir entre 2 y 2.5 litros de agua al d�a (ocho a diez vasos de tama�o regular), especialmente antes, durante " +
                                                  "\n y despu�s de la actividad f�sica. El ejercicio es fundamental para fortalecer los m�sculos respiratorios y mejorar la capacidad" + 
                                                  "\n pulmonar, pero debe ser realizado con precauci�n y bajo supervisi�n m�dica. Se sugiere realizar actividades aer�bicas de bajo  " +
                                                  "\n impacto (como caminar, nadar o andar en bicicleta) durante al menos 30-60 minutos al d�a, evitando los desencadenantes conocidos" + 
                                                  "\n del asma (como al�rgenos, aire fr�o o contaminado). Es importante llevar siempre consigo un inhalador de rescate y detener la  " +
                                                  "\n actividad si se presentan s�ntomas. POSIBLE TRATAMIENTO: El tratamiento para el asma en adolescentes generalmente incluye:     " +
                                                  "\n Broncodilatadores de acci�n r�pida (para aliviar los s�ntomas agudos, como el salbutamol, marca com�n: Ventolin), Corticosteroides" + 
                                                  "\n inhalados (para controlar la inflamaci�n a largo plazo, como la fluticasona, marca com�n: Flixotide) y Modificadores de leucotrienos" + 
                                                  "\n (para reducir la inflamaci�n y la producci�n de moco, como el montelukast, marca com�n: Singulair). Es esencial seguir el plan de " +
                                                  "\n tratamiento prescrito por el m�dico y utilizar los medicamentos seg�n las indicaciones. Adem�s, una dieta saludable puede ayudar  " +
                                                  "\n a fortalecer el sistema inmunol�gico y reducir la inflamaci�n. Se recomienda consumir alimentos ricos en antioxidantes y          " +
                                                  "\n antiinflamatorios, como frutas y verduras de colores vivos (manzanas, pl�tanos, bayas, espinacas, zanahorias), pescado azul (salm�n," +
                                                  "\n at�n, sardinas) y grasas saludables (aceite de oliva, aguacate, nueces). Estos alimentos proporcionan vitaminas, minerales y �cidos " +
                                                  "\n grasos omega-3, que pueden ayudar a proteger las v�as respiratorias y a reducir la inflamaci�n. Particularmente beneficiosos son:   " +
                                                  "\n Vitamina C (c�tricos, kiwi, fresas): fortalece el sistema inmunol�gico y reduce la inflamaci�n. Vitamina E (nueces, semillas, aceites" +
                                                  "\n vegetales): protege las c�lulas del da�o y reduce la inflamaci�n. �cidos grasos omega-3 (pescado azul, semillas de lino, nueces):   " +
                                                  "\n reducen la inflamaci�n de las v�as respiratorias. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza" +
                                                  "\n al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda " +
                                                  "\n hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su     " +
                                                  "\n salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece" +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, P�rdida de peso, Ganglios linf�ticos inflamados, Erupci�n cut�nea (Diarrea).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n Es crucial que el adolescente con VIH/SIDA mantenga una hidrataci�n adecuada para apoyar la funci�n inmunol�gica y facilitar la absorci�n" +
                                                  "\n de medicamentos. Se recomienda consumir entre 2 y 2.5 litros de agua al d�a (ocho a diez vasos de tama�o regular). La actividad f�sica es" +
                                                  "\n fundamental para mantener la masa muscular, mejorar el estado de �nimo y fortalecer el sistema inmunol�gico. Se sugiere realizar al menos" +
                                                  "\n 60 minutos de ejercicio moderado a vigoroso al d�a, incluyendo actividades aer�bicas (correr, nadar, bailar) y ejercicios de fuerza      " +
                                                  "\n (levantamiento de pesas ligero, bandas de resistencia). POSIBLE TRATAMIENTO: El tratamiento para el VIH/SIDA consiste en la terapia      " +
                                                  "\n antirretroviral (TAR), que ayuda a controlar la replicaci�n del virus y a prevenir la progresi�n de la enfermedad. Algunos medicamentos  " +
                                                  "\n antirretrovirales comunes disponibles en M�xico incluyen: Tenofovir (marca com�n: Viread), Emtricitabina (marca com�n: Emtriva), Efavirenz" +
                                                  "\n (marca com�n: Sustiva) y Dolutegravir (marca com�n: Tivicay). Es esencial seguir estrictamente las indicaciones del m�dico y tomar los   " +
                                                  "\n medicamentos seg�n lo prescrito. Adem�s, una alimentaci�n saludable es fundamental para fortalecer el sistema inmunol�gico y mantener un " +
                                                  "\n peso saludable. Se recomienda consumir alimentos ricos en nutrientes, como frutas y verduras de colores vivos (bayas, c�tricos, espinacas," +
                                                  "\n br�coli), prote�nas magras (pollo, pescado, legumbres) y granos integrales (arroz integral, quinoa, avena). Estos alimentos proporcionan " +
                                                  "\n vitaminas, minerales y antioxidantes que ayudan a proteger las c�lulas del da�o y a fortalecer el sistema inmunol�gico. Especialmente    " +
                                                  "\n importantes son: Vitamina C (c�tricos, fresas, pimientos): fortalece el sistema inmunol�gico y ayuda a combatir las infecciones. Zinc    " +
                                                  "\n (carne, mariscos, nueces): esencial para la funci�n inmunol�gica y la cicatrizaci�n de heridas. Prote�nas (carne magra, pescado, legumbres):" +
                                                  "\n necesarias para la reparaci�n de tejidos y la producci�n de anticuerpos. Este es solo un Diagn�stico predeterminado l�gico, haberlo      " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas,      " +
                                                  "\n para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente," +
                                                  "\n adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes" +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreci�n anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea. " +
                                                  "\n El adolescente con gonorrea debe mantenerse bien hidratado para apoyar la funci�n " +
                                                  "\n renal y facilitar la eliminaci�n de toxinas. Se recomienda consumir entre 2 y 2.5 litros de agua al d�a (ocho a diez vasos de tama�o regular)." +
                                                  "\n No se requiere un r�gimen de ejercicio espec�fico para el tratamiento de la gonorrea, pero mantener un estilo de vida activo y saludable      " +
                                                  "\n puede ayudar a fortalecer el sistema inmunol�gico. Se sugiere realizar al menos 30 minutos de actividad f�sica moderada la mayor�a de los     " +
                                                  "\n d�as de la semana. POSIBLE TRATAMIENTO: El tratamiento para la gonorrea generalmente consiste en antibi�ticos. Los antibi�ticos recomendados  " +
                                                  "\n para el tratamiento de la gonorrea incluyen: Ceftriaxona (administrada por inyecci�n) y Azitromicina (administrada por v�a oral). Es          " +
                                                  "\n fundamental completar el ciclo completo de antibi�ticos seg�n las indicaciones del m�dico, incluso si los s�ntomas desaparecen antes.         " +
                                                  "\n Adem�s, es importante evitar las relaciones sexuales hasta que tanto el adolescente como su pareja hayan completado el tratamiento y se       " +
                                                  "\n hayan realizado pruebas de seguimiento para confirmar que la infecci�n ha sido eliminada. Una dieta saludable puede ayudar a fortalecer       " +
                                                  "\n el sistema inmunol�gico y a promover la curaci�n. Se recomienda consumir alimentos ricos en vitaminas, minerales y antioxidantes, como        " +
                                                  "\n frutas y verduras de colores vivos (c�tricos, bayas, espinacas, zanahorias), prote�nas magras (pollo, pescado, legumbres) y granos integrales " +
                                                  "\n (arroz integral, quinoa, avena). En particular, se recomienda consumir alimentos ricos en: Vitamina C (c�tricos, kiwi, fresas): fortalece     " +
                                                  "\n el sistema inmunol�gico y ayuda a combatir las infecciones. Zinc (carne, mariscos, nueces): esencial para la funci�n inmunol�gica y la        " +
                                                  "\n cicatrizaci�n de heridas. Probi�ticos (yogur, k�fir, chucrut): ayudan a mantener un equilibrio saludable de bacterias en el intestino,        " +
                                                  "\n lo que puede fortalecer el sistema inmunol�gico. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al        " +
                                                  "\n 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer        " +
                                                  "\n m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la         " +
                                                  "\n respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a          " +
                                                  "\n la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linf�ticos inflamados, �lceras o llagas dolorosas, Picaz�n o ardor, Dolor al orinar.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n El adolescente con herpes genital debe mantener una hidrataci�n adecuada para apoyar la funci�n renal y facilitar la eliminaci�n" +
                                                  "\n de toxinas. Se recomienda consumir entre 2 y 2.5 litros de agua al d�a (ocho a diez vasos de tama�o regular). No se requiere un " +
                                                  "\n r�gimen de ejercicio espec�fico para el tratamiento del herpes genital, pero mantener un estilo de vida activo y saludable puede" + 
                                                  "\n ayudar a fortalecer el sistema inmunol�gico y reducir la frecuencia de los brotes. Se sugiere realizar al menos 30 minutos de   " +
                                                  "\n actividad f�sica moderada la mayor�a de los d�as de la semana. POSIBLE TRATAMIENTO: El tratamiento para el herpes genital generalmente" +
                                                  "\n consiste en medicamentos antivirales que ayudan a reducir la duraci�n y la severidad de los brotes. Los medicamentos antivirales" +
                                                  "\n comunes para el herpes genital incluyen: Aciclovir (marca com�n: Zovirax), Valaciclovir (marca com�n: Valtrex) y Famciclovir    " +
                                                  "\n (marca com�n: Famvir). Es fundamental seguir las indicaciones del m�dico y tomar los medicamentos seg�n lo prescrito. Adem�s,   " +
                                                  "\n es importante evitar el contacto sexual durante los brotes para prevenir la transmisi�n del virus. Una dieta saludable puede    " +
                                                  "\n ayudar a fortalecer el sistema inmunol�gico y reducir la frecuencia de los brotes. Se recomienda consumir alimentos ricos en    " +
                                                  "\n vitaminas, minerales y antioxidantes, como frutas y verduras de colores vivos (c�tricos, bayas, espinacas, zanahorias), prote�nas" +
                                                  "\n magras (pollo, pescado, legumbres) y granos integrales (arroz integral, quinoa, avena). En particular, se recomienda consumir   " +
                                                  "\n alimentos ricos en: Lisina (presente en legumbres, pescado y pollo): un amino�cido que puede ayudar a prevenir la replicaci�n   " +
                                                  "\n del virus del herpes. Vitamina C (c�tricos, kiwi, fresas): con la papaya como una excelente opci�n, aportando aproximadamente   " +
                                                  "\n 60mg por cada 100g, cubriendo el 100% de la ingesta diaria recomendada, fortalece el sistema inmunol�gico y ayuda a combatir    " +
                                                  "\n las infecciones. Zinc (carne, mariscos, nueces): esencial para la funci�n inmunol�gica y la cicatrizaci�n de heridas. Este es   " +
                                                  "\n solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que   " +
                                                  "\n por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para    " +
                                                  "\n establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no    " +
                                                  "\n le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y      " +
                                                  "\n espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, �lceras indoloras, Erupci�n cut�nea, Dolor de cabeza, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer S�filis." +
                                                  "\n El adolescente con s�filis debe mantener una hidrataci�n adecuada para apoyar la funci�n renal y facilitar la eliminaci�n" +
                                                  "\n de toxinas. Se recomienda consumir entre 2 y 2.5 litros de agua al d�a (ocho a diez vasos de tama�o regular). No se requiere" +
                                                  "\n un r�gimen de ejercicio espec�fico para el tratamiento de la s�filis, pero mantener un estilo de vida activo y saludable " +
                                                  "\n puede ayudar a fortalecer el sistema inmunol�gico. Se sugiere realizar al menos 30 minutos de actividad f�sica moderada  " +
                                                  "\n la mayor�a de los d�as de la semana. POSIBLE TRATAMIENTO: El tratamiento para la s�filis generalmente consiste en        " +
                                                  "\n antibi�ticos, siendo la penicilina la opci�n m�s com�n y efectiva. La penicilina se administra por inyecci�n intramuscular." +
                                                  "\n Es fundamental completar el ciclo completo de antibi�ticos seg�n las indicaciones del m�dico, incluso si los s�ntomas    " +
                                                  "\n desaparecen antes. Adem�s, es importante evitar las relaciones sexuales hasta que tanto el adolescente como su pareja    " +
                                                  "\n hayan completado el tratamiento y se hayan realizado pruebas de seguimiento para confirmar que la infecci�n ha sido      " +
                                                  "\n eliminada. Una dieta saludable puede ayudar a fortalecer el sistema inmunol�gico y a promover la curaci�n. Se recomienda " +
                                                  "\n consumir alimentos ricos en vitaminas, minerales y antioxidantes, como frutas y verduras de colores vivos (c�tricos,     " +
                                                  "\n bayas, espinacas, zanahorias), prote�nas magras (pollo, pescado, legumbres) y granos integrales. Estos �ltimos, como     " +
                                                  "\n la avena, proporcionan fibra y energ�a sostenida, adem�s de contener alrededor de 10-11 gramos de prote�na por cada      " +
                                                  "\n 100 gramos, contribuyendo a la reparaci�n de tejidos y la funci�n inmunol�gica. En particular, se recomienda consumir    " +
                                                  "\n alimentos ricos en: Vitamina C (c�tricos, kiwi, fresas): fortalece el sistema inmunol�gico y ayuda a combatir las        " +
                                                  "\n infecciones. Zinc (carne, mariscos, nueces): esencial para la funci�n inmunol�gica y la cicatrizaci�n de heridas.        " +
                                                  "\n Probi�ticos (yogur, k�fir, chucrut): ayudan a mantener un equilibrio saludable de bacterias en el intestino, lo que      " +
                                                  "\n puede fortalecer el sistema inmunol�gico. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no       " +
                                                  "\n garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas,    " +
                                                  "\n para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento         " +
                                                  "\n adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda   " +
                                                  "\n mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, P�rdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n El adolescente con tuberculosis debe mantener una hidrataci�n adecuada para apoyar la funci�n renal y facilitar " +
                                                  "\n la eliminaci�n de toxinas, especialmente debido a la medicaci�n. Se recomienda consumir entre 2.5 y 3 litros de " +
                                                  "\n agua al d�a (diez a doce vasos de tama�o regular). La actividad f�sica moderada es importante para mantener la  " +
                                                  "\n fuerza y la resistencia durante el tratamiento de la TB. Se sugiere realizar al menos 30-60 minutos de ejercicio" +
                                                  "\n aer�bico de bajo impacto (como caminar, nadar o andar en bicicleta) la mayor�a de los d�as de la semana, siempre" +
                                                  "\n y cuando no haya contraindicaciones m�dicas. POSIBLE TRATAMIENTO: El tratamiento para la tuberculosis generalmente" +
                                                  "\n consiste en una combinaci�n de antibi�ticos que se deben tomar durante un per�odo prolongado, generalmente de 6 a" +
                                                  "\n 9 meses. Los medicamentos comunes utilizados en el tratamiento de la TB incluyen: Isoniazida, Rifampicina,       " +
                                                  "\n Pirazinamida y Etambutol. Es fundamental completar el ciclo completo de antibi�ticos seg�n las indicaciones del  " +
                                                  "\n m�dico, incluso si los s�ntomas desaparecen antes. Adem�s, es importante seguir una dieta saludable para apoyar  " +
                                                  "\n el sistema inmunol�gico y promover la curaci�n. Se recomienda consumir alimentos ricos en vitaminas, minerales y " +
                                                  "\n antioxidantes, como frutas y verduras de colores vivos (c�tricos, bayas, espinacas, zanahorias), prote�nas magras" +
                                                  "\n (pollo, pescado, legumbres) y granos integrales. Estos �ltimos, como las zanahorias, son ricas en betacaroteno,  " +
                                                  "\n que el cuerpo convierte en vitamina A. Una zanahoria mediana (aproximadamente 61 gramos) proporciona alrededor   " +
                                                  "\n del 50% de la ingesta diaria recomendada de vitamina A, lo que es crucial para la funci�n inmunol�gica y la salud" +
                                                  "\n de las membranas mucosas en los pulmones. En particular, se recomienda consumir alimentos ricos en: Vitamina D   " +
                                                  "\n (pescado graso, huevos, champi�ones): ayuda a fortalecer el sistema inmunol�gico y a combatir las infecciones.   " +
                                                  "\n Zinc (carne, mariscos, nueces): esencial para la funci�n inmunol�gica y la cicatrizaci�n de heridas. Prote�nas   " +
                                                  "\n (carne magra, pescado, legumbres): necesarias para la reparaci�n de tejidos y la producci�n de anticuerpos.      " +
                                                  "\n Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga " +
                                                  "\n esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s  " +
                                                  "\n de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s   " +
                                                  "\n por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su      " +
                                                  "\n m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchaz�n en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis. " +
                                                  "\n El adolescente con artritis debe mantener una hidrataci�n adecuada para ayudar a reducir la inflamaci�n y mantener " +
                                                  "\n la flexibilidad de las articulaciones. Se recomienda consumir entre 2 y 2.5 litros de agua al d�a (ocho a diez     " +
                                                  "\n vasos de tama�o regular). La actividad f�sica moderada es importante para mantener la fuerza muscular, la          " +
                                                  "\n flexibilidad y la movilidad articular. Se sugiere realizar ejercicios de bajo impacto (como caminar, nadar,        " +
                                                  "\n andar en bicicleta o yoga) durante al menos 30 minutos al d�a, adaptando la intensidad y duraci�n a la tolerancia  " +
                                                  "\n individual y evitando movimientos que causen dolor excesivo. POSIBLE TRATAMIENTO: El tratamiento para la artritis  " +
                                                  "\n generalmente incluye una combinaci�n de medicamentos para aliviar el dolor y la inflamaci�n, as� como terapias     " +
                                                  "\n para mejorar la funci�n articular. Algunos medicamentos comunes utilizados en el tratamiento de la artritis incluyen:" +
                                                  "\n Analg�sicos (como el paracetamol o el tramadol), Antiinflamatorios no esteroideos (AINEs, como el ibuprofeno o     " +
                                                  "\n el naproxeno) y Corticosteroides (como la prednisona). Adem�s, en algunos casos, se pueden utilizar medicamentos   " +
                                                  "\n modificadores de la enfermedad (DMARDs, como el metotrexato o la sulfasalazina) para retrasar la progresi�n de     " +
                                                  "\n la artritis. Una dieta saludable puede ayudar a reducir la inflamaci�n y a fortalecer los huesos y las articulaciones." +
                                                  "\n Se recomienda consumir alimentos ricos en antioxidantes, antiinflamatorios y calcio, como frutas y verduras de colores" +
                                                  "\n vivos (bayas, c�tricos, espinacas, br�coli), pescado azul (salm�n, at�n, sardinas), l�cteos (leche, yogur, queso)     " +
                                                  "\n y frutos secos. Por ejemplo, el salm�n es una excelente fuente de �cidos grasos omega-3, que tienen propiedades      " +
                                                  "\n antiinflamatorias. Una porci�n de 100 gramos de salm�n cocido proporciona aproximadamente 2.3 gramos de omega-3,     " +
                                                  "\n contribuyendo significativamente a la reducci�n de la inflamaci�n en las articulaciones. En particular, se recomienda" +
                                                  "\n consumir alimentos ricos en: Calcio (l�cteos, verduras de hoja verde, frutos secos): esencial para la salud �sea y   " +
                                                  "\n la prevenci�n de la osteoporosis. Vitamina D (pescado graso, huevos, champi�ones): ayuda a mejorar la absorci�n del  " +
                                                  "\n calcio y a fortalecer los huesos. Antioxidantes (frutas y verduras de colores vivos): protegen las c�lulas del da�o  " +
                                                  "\n y reducen la inflamaci�n. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% " +
                                                  "\n que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se     " +
                                                  "\n recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de      " +
                                                  "\n su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho     " +
                                                  "\n consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n El adolescente con tosferina debe mantenerse bien hidratado para ayudar a fluidificar las secreciones y facilitar la " +
                                                  "\n expectoraci�n. Se recomienda consumir entre 2 y 2.5 litros de agua al d�a (ocho a diez vasos de tama�o regular), as� " +
                                                  "\n como bebidas calientes y sopas. El reposo es importante durante las fases agudas de la tosferina para permitir que el" +
                                                  "\n cuerpo se recupere. La actividad f�sica debe ser limitada hasta que los s�ntomas mejoren. POSIBLE TRATAMIENTO: El    " +
                                                  "\n tratamiento para la tosferina generalmente incluye antibi�ticos, especialmente en las primeras etapas de la enfermedad," +
                                                  "\n para reducir la duraci�n y la gravedad de los s�ntomas y prevenir la propagaci�n de la infecci�n. Los antibi�ticos     " +
                                                  "\n comunes utilizados en el tratamiento de la tosferina incluyen: Azitromicina, Claritromicina y Eritromicina. Es         " +
                                                  "\n fundamental completar el ciclo completo de antibi�ticos seg�n las indicaciones del m�dico, incluso si los s�ntomas     " +
                                                  "\n desaparecen antes. Adem�s, se pueden utilizar medicamentos para aliviar la tos, como jarabes para la tos de venta      " +
                                                  "\n libre o medicamentos recetados por el m�dico. Una dieta nutritiva puede ayudar a fortalecer el sistema inmunol�gico    " +
                                                  "\n y a promover la curaci�n. Se recomienda consumir alimentos suaves y f�ciles de tragar, como sopas, pur�s, yogur y      " +
                                                  "\n frutas blandas. En particular, se recomienda consumir alimentos ricos en: Vitamina C (c�tricos, kiwi, fresas):         " +
                                                  "\n fortalece el sistema inmunol�gico y ayuda a combatir las infecciones. Miel (en mayores de 1 a�o): puede ayudar         " +
                                                  "\n a calmar la tos y aliviar el dolor de garganta. Caldo de pollo: proporciona hidrataci�n, nutrientes y calor reconfortante." +
                                                  "\n El caldo de pollo, por ejemplo, es una fuente de sodio y potasio, electrolitos que se pierden a trav�s de la sudoraci�n,  " +
                                                  "\n y tambi�n contiene peque�as cantidades de amino�cidos que pueden ayudar a fortalecer el sistema inmunol�gico. Una taza de " +
                                                  "\n caldo de pollo (aproximadamente 240 ml) puede proporcionar alrededor del 10% de la ingesta diaria recomendada de sodio.   " +
                                                  "\n Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa      " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un         " +
                                                  "\n Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su           " +
                                                  "\n salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico,              " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchaz�n de las gl�ndulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n El adolescente con paperas debe mantenerse bien hidratado para ayudar a reducir la fiebre y facilitar la eliminaci�n de " +
                                                  "\n toxinas. Se recomienda consumir entre 2 y 2.5 litros de agua al d�a (ocho a diez vasos de tama�o regular), as� como     " +
                                                  "\n bebidas suaves y no �cidas. El reposo es importante durante las fases agudas de las paperas para permitir que el cuerpo " +
                                                  "\n se recupere. La actividad f�sica debe ser limitada hasta que los s�ntomas mejoren, especialmente la inflamaci�n de las  " +
                                                  "\n gl�ndulas salivales. POSIBLE TRATAMIENTO: No existe un tratamiento espec�fico para las paperas, ya que es una enfermedad" +
                                                  "\n viral que generalmente se resuelve por s� sola en un plazo de 1 a 2 semanas. El tratamiento se centra en aliviar los    " +
                                                  "\n s�ntomas y prevenir complicaciones. Algunas medidas para aliviar los s�ntomas incluyen: Analg�sicos de venta libre      " +
                                                  "\n (como el paracetamol o el ibuprofeno) para reducir la fiebre y el dolor, Compresas fr�as en las gl�ndulas salivales     " +
                                                  "\n inflamadas para reducir el dolor y la hinchaz�n y Enjuagues bucales con agua salada tibia para aliviar la irritaci�n    " +
                                                  "\n de la boca y la garganta. Una dieta suave y nutritiva puede ayudar a fortalecer el sistema inmunol�gico y a promover    " +
                                                  "\n la curaci�n. Se recomienda consumir alimentos blandos y f�ciles de masticar, como sopas, pur�s, yogur y frutas blandas. " +
                                                  "\n En particular, se recomienda consumir alimentos ricos en: Vitamina C (c�tricos, kiwi, fresas): fortalece el sistema     " +
                                                  "\n inmunol�gico y ayuda a combatir las infecciones. Probi�ticos (yogur, k�fir, chucrut): ayudan a mantener un equilibrio   " +
                                                  "\n saludable de bacterias en el intestino, lo que puede fortalecer el sistema inmunol�gico. Alimentos ricos en antioxidantes" +
                                                  "\n (frutas y verduras de colores vivos): protegen las c�lulas del da�o y reducen la inflamaci�n. Los c�tricos, como las    " +
                                                  "\n naranjas, son una excelente fuente de vitamina C, con una naranja mediana proporcionando alrededor del 70% de la ingesta" +
                                                  "\n diaria recomendada, lo que ayuda a fortalecer el sistema inmunol�gico y a combatir las infecciones. Este es solo un     " +
                                                  "\n Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que   " +
                                                  "\n por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida " +
                                                  "\n para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del      " +
                                                  "\n Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita    " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupci�n cut�nea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n El adolescente con Zika debe mantenerse bien hidratado para ayudar a reducir la fiebre y facilitar la eliminaci�n del" +
                                                  "\n virus. Se recomienda consumir entre 2.5 y 3 litros de agua al d�a (diez a doce vasos de tama�o regular), as� como    " +
                                                  "\n bebidas con electrolitos para reponer los l�quidos perdidos debido a la fiebre y la sudoraci�n. El reposo es importante" +
                                                  "\n durante la fase aguda de la infecci�n por Zika para permitir que el cuerpo se recupere. La actividad f�sica debe ser   " +
                                                  "\n limitada hasta que los s�ntomas mejoren. POSIBLE TRATAMIENTO: No existe un tratamiento espec�fico para la infecci�n    " +
                                                  "\n por el virus del Zika. El tratamiento se centra en aliviar los s�ntomas y prevenir complicaciones. Algunas medidas     " +
                                                  "\n para aliviar los s�ntomas incluyen: Analg�sicos de venta libre (como el paracetamol) para reducir la fiebre y el dolor," +
                                                  "\n Reposo y evitar la picadura de mosquitos para prevenir la propagaci�n del virus y Monitoreo para detectar posibles     " +
                                                  "\n complicaciones, como el s�ndrome de Guillain-Barr�. Una dieta nutritiva puede ayudar a fortalecer el sistema inmunol�gico" +
                                                  "\n y a promover la recuperaci�n. Se recomienda consumir alimentos ricos en vitaminas, minerales y antioxidantes, como frutas" +
                                                  "\n y verduras de colores vivos (c�tricos, bayas, espinacas, br�coli), prote�nas magras (pollo, pescado, legumbres) y granos " +
                                                  "\n integrales. En particular, se recomienda consumir alimentos ricos en: Vitamina C (c�tricos, kiwi, fresas): fortalece el  " +
                                                  "\n sistema inmunol�gico y ayuda a combatir las infecciones. Prote�nas (carne magra, pescado, legumbres): necesarias para la " +
                                                  "\n reparaci�n de tejidos y la producci�n de anticuerpos. Alimentos ricos en antioxidantes (frutas y verduras de colores vivos):" +
                                                  "\n protegen las c�lulas del da�o y reducen la inflamaci�n. Las espinacas, por ejemplo, son una excelente fuente de antioxidantes," +
                                                  "\n como la vitamina A y la vitamina C. Una porci�n de 100 gramos de espinacas crudas proporciona aproximadamente el 47% de la  " +
                                                  "\n ingesta diaria recomendada de vitamina A, que es importante para la funci�n inmunol�gica y la salud de las c�lulas. Este es " +
                                                  "\n solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y   " +
                                                  "\n que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida " +
                                                  "\n para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del          " +
                                                  "\n Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita        " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, V�mitos, Deshidrataci�n, Dolor abdominal.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n El adolescente con rotavirus debe mantenerse bien hidratado para prevenir la deshidrataci�n debido a la diarrea y los" +
                                                  "\n v�mitos. Se recomienda consumir entre 3 y 3.5 litros de l�quidos al d�a (doce a catorce vasos de tama�o regular),    " +
                                                  "\n incluyendo soluciones de rehidrataci�n oral (SRO) para reponer los electrolitos perdidos. El reposo es importante    " +
                                                  "\n durante la fase aguda de la infecci�n por rotavirus para permitir que el cuerpo se recupere. La actividad f�sica     " +
                                                  "\n debe ser limitada hasta que los s�ntomas mejoren. POSIBLE TRATAMIENTO: No existe un tratamiento espec�fico para la   " +
                                                  "\n infecci�n por rotavirus. El tratamiento se centra en prevenir la deshidrataci�n y aliviar los s�ntomas. Algunas medidas" +
                                                  "\n para aliviar los s�ntomas incluyen: Soluciones de rehidrataci�n oral (SRO) para reponer los l�quidos y electrolitos   " +
                                                  "\n perdidos, Probi�ticos para ayudar a restaurar el equilibrio de la flora intestinal y Analg�sicos de venta libre (como " +
                                                  "\n el paracetamol) para reducir la fiebre y el malestar. Una dieta suave y f�cil de digerir puede ayudar a reducir los   " +
                                                  "\n s�ntomas gastrointestinales. Se recomienda consumir alimentos como: Arroz blanco: f�cil de digerir y ayuda a absorber " +
                                                  "\n el exceso de l�quidos en el intestino. Pl�tanos: ricos en potasio, un electrolito importante que se pierde debido a la" +
                                                  "\n diarrea y los v�mitos. Tostadas: tambi�n f�ciles de digerir y pueden ayudar a reducir las n�useas. El pl�tano, por    " +
                                                  "\n ejemplo, es una excelente fuente de potasio. Un pl�tano mediano proporciona aproximadamente el 12% de la ingesta      " +
                                                  "\n diaria recomendada de potasio, lo que ayuda a reponer los electrolitos perdidos debido a la diarrea y los v�mitos     " +
                                                  "\n y a mantener el equilibrio de l�quidos en el cuerpo. Este es solo un Diagn�stico predeterminado l�gico, haberlo       " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas    " +
                                                  "\n est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en    " +
                                                  "\n el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo  " +
                                                  "\n se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, N�useas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n El adolescente con listeriosis debe mantenerse bien hidratado para ayudar a combatir la infecci�n y prevenir   " +
                                                  "\n complicaciones. Se recomienda consumir entre 2.5 y 3 litros de agua al d�a (diez a doce vasos de tama�o regular)." +
                                                  "\n El reposo es importante durante la fase aguda de la infecci�n por Listeria para permitir que el cuerpo se recupere." +
                                                  "\n La actividad f�sica debe ser limitada hasta que los s�ntomas mejoren. POSIBLE TRATAMIENTO: El tratamiento para la " +
                                                  "\n listeriosis generalmente consiste en antibi�ticos, especialmente en casos graves o en personas con sistemas       " +
                                                  "\n inmunol�gicos debilitados. Los antibi�ticos comunes utilizados en el tratamiento de la listeriosis incluyen:      " +
                                                  "\n Ampicilina y Gentamicina (a menudo administradas en combinaci�n). Es fundamental completar el ciclo completo      " +
                                                  "\n de antibi�ticos seg�n las indicaciones del m�dico, incluso si los s�ntomas desaparecen antes. Una dieta nutritiva " +
                                                  "\n puede ayudar a fortalecer el sistema inmunol�gico y a promover la curaci�n. Se recomienda consumir alimentos      " +
                                                  "\n ricos en vitaminas, minerales y antioxidantes, as� como probi�ticos para ayudar a restaurar el equilibrio de      " +
                                                  "\n la flora intestinal. En particular, se recomienda consumir alimentos como: Yogur: rico en probi�ticos, que        " +
                                                  "\n pueden ayudar a fortalecer el sistema inmunol�gico y a combatir la infecci�n. Ajo: contiene compuestos con        " + 
                                                  "\n propiedades antibacterianas y antivirales que pueden ayudar a combatir la Listeria. Vitamina C (c�tricos, kiwi,   " +
                                                  "\n fresas): fortalece el sistema inmunol�gico y ayuda a combatir las infecciones. El ajo, por ejemplo, contiene      " +
                                                  "\n alicina, un compuesto con propiedades antibacterianas y antivirales. Un diente de ajo (aproximadamente 3 gramos)  " +
                                                  "\n contiene aproximadamente 0.1 gramos de alicina, lo que puede ayudar a fortalecer el sistema inmunol�gico y a      " +
                                                  "\n combatir la Listeria. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al       " +
                                                  "\n 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para     " +
                                                  "\n ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento       " +
                                                  "\n adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le       " +
                                                  "\n recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, V�mitos.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n El adolescente con shigelosis debe mantenerse bien hidratado para prevenir la deshidrataci�n debido a la diarrea " +
                                                  "\n y los v�mitos. Se recomienda consumir entre 3 y 3.5 litros de l�quidos al d�a (doce a catorce vasos de tama�o    " +
                                                  "\n regular), incluyendo soluciones de rehidrataci�n oral (SRO) para reponer los electrolitos perdidos. El reposo    " +
                                                  "\n es importante durante la fase aguda de la shigelosis para permitir que el cuerpo se recupere. La actividad       " +
                                                  "\n f�sica debe ser limitada hasta que los s�ntomas mejoren. POSIBLE TRATAMIENTO: En casos leves, la shigelosis      " +
                                                  "\n puede resolverse por s� sola con reposo y l�quidos. Sin embargo, en casos m�s graves o en personas con sistemas  " +
                                                  "\n inmunol�gicos debilitados, se pueden utilizar antibi�ticos para reducir la duraci�n de la enfermedad y prevenir  " +
                                                  "\n complicaciones. Los antibi�ticos comunes utilizados en el tratamiento de la shigelosis incluyen: Azitromicina y  " +
                                                  "\n Ciprofloxacino. Es fundamental completar el ciclo completo de antibi�ticos seg�n las indicaciones del m�dico,    " +
                                                  "\n incluso si los s�ntomas desaparecen antes. Una dieta suave y f�cil de digerir puede ayudar a reducir los s�ntomas" +
                                                  "\n gastrointestinales. Se recomienda consumir alimentos como: Arroz blanco: f�cil de digerir y ayuda a absorber el  " +
                                                  "\n exceso de l�quidos en el intestino. Tostadas: tambi�n f�ciles de digerir y pueden ayudar a reducir las n�useas.  " +
                                                  "\n Pl�tanos: ricos en potasio, un electrolito importante que se pierde debido a la diarrea y los v�mitos. El arroz  " +
                                                  "\n blanco, por ejemplo, es un carbohidrato de f�cil digesti�n que proporciona energ�a al cuerpo sin sobrecargar el  " +
                                                  "\n sistema digestivo. Una taza de arroz blanco cocido proporciona aproximadamente 45 gramos de carbohidratos, lo que" +
                                                  "\n ayuda a mantener los niveles de energ�a durante la enfermedad. Este es solo un Diagn�stico predeterminado l�gico," +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus  " +
                                                  "\n respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor " +
                                                  "\n seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le   " +
                                                  "\n satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app      " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos cr�nica, Producci�n excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad Pulmonar Obstructiva Cr�nica (EPOC)." +
                                                  "\n El adolescente con EPOC debe mantenerse bien hidratado para ayudar a fluidificar las secreciones y facilitar la " +
                                                  "\n expectoraci�n. Se recomienda consumir entre 2 y 2.5 litros de agua al d�a (ocho a diez vasos de tama�o regular)," +
                                                  "\n evitando las bebidas azucaradas y con gas. La actividad f�sica es importante para mantener la fuerza muscular,  " +
                                                  "\n la resistencia y la capacidad pulmonar. Se sugiere realizar ejercicios de bajo impacto (como caminar, nadar o   " +
                                                  "\n andar en bicicleta) durante al menos 30 minutos al d�a, adaptando la intensidad y duraci�n a la tolerancia      " +
                                                  "\n individual y evitando los desencadenantes conocidos de la EPOC (como el humo del tabaco, la contaminaci�n o     " +
                                                  "\n el aire fr�o). POSIBLE TRATAMIENTO: El tratamiento para la EPOC generalmente incluye una combinaci�n de         " +
                                                  "\n medicamentos para aliviar los s�ntomas y prevenir las exacerbaciones, as� como terapias para mejorar la         " +
                                                  "\n funci�n pulmonar. Algunos medicamentos comunes utilizados en el tratamiento de la EPOC incluyen: Broncodilatadores" +
                                                  "\n (como el salbutamol o el tiotropio), Corticosteroides inhalados (como la fluticasona o la budesonida) y Inhibidores" +
                                                  "\n de la fosfodiesterasa-4 (como el roflumilast). Adem�s, en algunos casos, se puede utilizar la oxigenoterapia para  " +
                                                  "\n aumentar los niveles de ox�geno en la sangre. Una dieta saludable puede ayudar a fortalecer el sistema inmunol�gico" +
                                                  "\n y a mantener un peso saludable. Se recomienda consumir alimentos ricos en antioxidantes, prote�nas y grasas       " +
                                                  "\n saludables, como frutas y verduras de colores vivos (bayas, c�tricos, espinacas, br�coli), prote�nas magras       " +
                                                  "\n (pollo, pescado, legumbres) y frutos secos. En particular, se recomienda consumir alimentos ricos en:             " +
                                                  "\n Vitamina C (c�tricos, kiwi, fresas): fortalece el sistema inmunol�gico y ayuda a combatir las infecciones.        " +
                                                  "\n Vitamina E (aceites vegetales, frutos secos, semillas): protege las c�lulas del da�o y reduce la inflamaci�n.     " +
                                                  "\n �cidos grasos omega-3 (pescado azul, semillas de lino, nueces): reducen la inflamaci�n de las v�as respiratorias. " +
                                                  "\n Las semillas de lino, por ejemplo, son una excelente fuente de �cidos grasos omega-3. Una cucharada de semillas   " +
                                                  "\n de lino molidas proporciona aproximadamente 1.6 gramos de omega-3, lo que puede ayudar a reducir la inflamaci�n   " +
                                                  "\n de las v�as respiratorias y a mejorar la funci�n pulmonar. Este es solo un Diagn�stico predeterminado l�gico,     " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus   " +
                                                  "\n respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor  " +
                                                  "\n seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le    " +
                                                  "\n satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app       " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreci�n anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n El adolescente con clamidia debe mantenerse bien hidratado para apoyar la funci�n renal y facilitar la eliminaci�n" +
                                                  "\n de toxinas. Se recomienda consumir entre 2 y 2.5 litros de agua al d�a (ocho a diez vasos de tama�o regular).     " +
                                                  "\n No se requiere un r�gimen de ejercicio espec�fico para el tratamiento de la clamidia, pero mantener un estilo     " +
                                                  "\n de vida activo y saludable puede ayudar a fortalecer el sistema inmunol�gico. Se sugiere realizar al menos 30     " +
                                                  "\n minutos de actividad f�sica moderada la mayor�a de los d�as de la semana. POSIBLE TRATAMIENTO: El tratamiento     " +
                                                  "\n para la clamidia generalmente consiste en antibi�ticos. Los antibi�ticos comunes utilizados en el tratamiento     " +
                                                  "\n de la clamidia incluyen: Azitromicina (administrada en una sola dosis) y Doxiciclina (administrada dos veces      " + 
                                                  "\n al d�a durante 7 d�as). Es fundamental completar el ciclo completo de antibi�ticos seg�n las indicaciones del     " +
                                                  "\n m�dico, incluso si los s�ntomas desaparecen antes. Adem�s, es importante evitar las relaciones sexuales hasta     " +
                                                  "\n que tanto el adolescente como su pareja hayan completado el tratamiento y se hayan realizado pruebas de seguimiento" +
                                                  "\n para confirmar que la infecci�n ha sido eliminada. Una dieta saludable puede ayudar a fortalecer el sistema       " +
                                                  "\n inmunol�gico y a promover la curaci�n. Se recomienda consumir alimentos ricos en vitaminas, minerales y antioxidantes," +
                                                  "\n como frutas y verduras de colores vivos (c�tricos, bayas, espinacas, zanahorias), prote�nas magras (pollo, pescado, " +
                                                  "\n legumbres) y granos integrales. En particular, se recomienda consumir alimentos ricos en: Vitamina C (c�tricos,     " +
                                                  "\n kiwi, fresas): fortalece el sistema inmunol�gico y ayuda a combatir las infecciones. Zinc (carne, mariscos, nueces):" +
                                                  "\n esencial para la funci�n inmunol�gica y la cicatrizaci�n de heridas. Probi�ticos (yogur, k�fir, chucrut): ayudan    " +
                                                  "\n a mantener un equilibrio saludable de bacterias en el intestino, lo que puede fortalecer el sistema inmunol�gico.   " +
                                                  "\n El yogur, por ejemplo, es una excelente fuente de probi�ticos, bacterias beneficiosas que ayudan a mantener un      " +
                                                  "\n equilibrio saludable en el intestino. Una porci�n de 150 gramos de yogur proporciona aproximadamente 10^7 a 10^9    " +
                                                  "\n unidades formadoras de colonias (UFC) de probi�ticos, lo que puede fortalecer el sistema inmunol�gico y ayudar      " +
                                                  "\n a combatir la infecci�n por clamidia. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no      " +
                                                  "\n garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas," +
                                                  "\n para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento    " +
                                                  "\n adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le         " +
                                                  "\n recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, N�useas, Dolor de cabeza severo, Rigidez en el cuello, Confusi�n.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis Bacteriana." +
                                                  "\n El adolescente con meningitis bacteriana requiere hospitalizaci�n y atenci�n m�dica inmediata. La hidrataci�n  " +
                                                  "\n intravenosa es fundamental para mantener la presi�n arterial y prevenir la deshidrataci�n. La cantidad de      " +
                                                  "\n l�quidos administrados depender� de la condici�n del paciente y de las indicaciones del m�dico. El reposo      " +
                                                  "\n absoluto es esencial durante la fase aguda de la meningitis bacteriana para permitir que el cuerpo se recupere " +
                                                  "\n y minimizar el riesgo de complicaciones. POSIBLE TRATAMIENTO: El tratamiento para la meningitis bacteriana     " +
                                                  "\n consiste en antibi�ticos intravenosos de amplio espectro para combatir la infecci�n. Los antibi�ticos comunes  " +
                                                  "\n utilizados en el tratamiento de la meningitis bacteriana incluyen: Ceftriaxona, Vancomicina y Meropenem. Adem�s," +
                                                  "\n se pueden administrar corticosteroides para reducir la inflamaci�n del cerebro y prevenir complicaciones       " +
                                                  "\n neurol�gicas. Una vez superada la fase aguda de la enfermedad, una dieta nutritiva puede ayudar a fortalecer    " +
                                                  "\n el sistema inmunol�gico y a promover la recuperaci�n. Se recomienda consumir alimentos ricos en vitaminas,      " +
                                                  "\n minerales y antioxidantes, como frutas y verduras de colores vivos (c�tricos, bayas, espinacas, br�coli),       " +
                                                  "\n prote�nas magras (pollo, pescado, legumbres) y granos integrales. En particular, se recomienda consumir alimentos " +
                                                  "\n ricos en: Vitamina D (pescado graso, huevos, champi�ones): ayuda a fortalecer el sistema inmunol�gico y a       " +
                                                  "\n combatir las infecciones. Zinc (carne, mariscos, nueces): esencial para la funci�n inmunol�gica y la cicatrizaci�n" +
                                                  "\n de heridas. Probi�ticos (yogur, k�fir, chucrut): ayudan a mantener un equilibrio saludable de bacterias en el    " +
                                                  "\n intestino, lo que puede fortalecer el sistema inmunol�gico. Los champi�ones, por ejemplo, son una buena fuente   " +
                                                  "\n de vitamina D. Una porci�n de 100 gramos de champi�ones proporciona aproximadamente el 50% de la ingesta diaria  " +
                                                  "\n recomendada de vitamina D, lo que ayuda a fortalecer el sistema inmunol�gico y a combatir las infecciones.       " +
                                                  "\n Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente       " +
                                                  "\n tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda      " +
                                                  "\n hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente," +
                                                  "\n adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar    " +
                                                  "\n a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, P�rdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, P�rdida de apetito.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer C�ncer." +
                                                  "\n El adolescente con c�ncer requiere un enfoque individualizado que depende del tipo de c�ncer, el estadio de la " +
                                                  "\n enfermedad y el tratamiento espec�fico. La hidrataci�n adecuada es fundamental para apoyar la funci�n renal y  " +
                                                  "\n facilitar la eliminaci�n de toxinas, especialmente durante la quimioterapia y la radioterapia. La cantidad de  " +
                                                  "\n l�quidos recomendada depender� de las necesidades individuales del paciente y de las indicaciones del m�dico.  " +
                                                  "\n La actividad f�sica puede ayudar a mejorar la calidad de vida, reducir la fatiga y fortalecer el sistema       " +
                                                  "\n inmunol�gico. Se sugiere realizar ejercicios de bajo impacto (como caminar, nadar o yoga) durante al menos      " +
                                                  "\n 30 minutos al d�a, adaptando la intensidad y duraci�n a la tolerancia individual y evitando los desencadenantes  " +
                                                  "\n conocidos de la fatiga (como el estr�s, la falta de sue�o o la deshidrataci�n). POSIBLE TRATAMIENTO: El tratamiento" +
                                                  "\n para el c�ncer puede incluir una combinaci�n de cirug�a, quimioterapia, radioterapia, inmunoterapia y terapia      " +
                                                  "\n dirigida. La elecci�n del tratamiento depender� del tipo de c�ncer, el estadio de la enfermedad y las caracter�sticas" +
                                                  "\n individuales del paciente. Una dieta nutritiva es fundamental para apoyar el sistema inmunol�gico, mantener un       " +
                                                  "\n peso saludable y prevenir la desnutrici�n. Se recomienda consumir alimentos ricos en prote�nas, vitaminas, minerales " +
                                                  "\n y antioxidantes, como frutas y verduras de colores vivos (bayas, c�tricos, espinacas, br�coli), prote�nas magras      " +
                                                  "\n (pollo, pescado, legumbres) y grasas saludables (aceite de oliva, aguacate, nueces). En particular, se recomienda     " +
                                                  "\n consumir alimentos ricos en: Prote�nas (carne magra, pescado, legumbres): necesarias para la reparaci�n de tejidos    " +
                                                  "\n y la producci�n de anticuerpos. Antioxidantes (frutas y verduras de colores vivos): protegen las c�lulas del da�o     " +
                                                  "\n y reducen la inflamaci�n. Grasas saludables (aceite de oliva, aguacate, nueces): proporcionan energ�a y ayudan a      " +
                                                  "\n mantener un peso saludable. El br�coli, por ejemplo, es una excelente fuente de antioxidantes, como la vitamina C     " +
                                                  "\n y el sulforafano. Una porci�n de 100 gramos de br�coli cocido proporciona aproximadamente el 89% de la ingesta        " +
                                                  "\n diaria recomendada de vitamina C, que ayuda a fortalecer el sistema inmunol�gico y a proteger las c�lulas del da�o.   " +
                                                  "\n Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga      " +
                                                  "\n esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de    " +
                                                  "\n un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su    " +
                                                  "\n salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico,          " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            
                        }
                        if(EstaturaMasculino.equals("1.45-1.70 m")){
                           if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza (gripe)." +
                                                  "\n El adolescente con influenza debe mantenerse bien hidratado para ayudar a reducir la fiebre, fluidificar las secreciones " +
                                                  "\n y facilitar la expectoraci�n. Se recomienda consumir entre 2.5 y 3 litros de l�quidos al d�a (diez a doce vasos de tama�o" +
                                                  "\n regular), incluyendo agua, jugos de frutas, caldos y sopas. El reposo es importante durante la fase aguda de la influenza" +
                                                  "\n para permitir que el cuerpo se recupere. La actividad f�sica debe ser limitada hasta que los s�ntomas mejoren.           " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento para la influenza generalmente se centra en aliviar los s�ntomas y prevenir          " +
                                                  "\n complicaciones. Algunas medidas para aliviar los s�ntomas incluyen: Analg�sicos de venta libre (como el paracetamol      " +
                                                  "\n o el ibuprofeno) para reducir la fiebre y el dolor, Descongestionantes nasales para aliviar la congesti�n nasal y        " +
                                                  "\n Antitus�genos para aliviar la tos. En algunos casos, el m�dico puede recetar medicamentos antivirales (como el oseltamivir" +
                                                  "\n o el zanamivir) para reducir la duraci�n de la enfermedad y prevenir complicaciones, especialmente en personas con alto   " +
                                                  "\n riesgo de complicaciones. Una dieta nutritiva puede ayudar a fortalecer el sistema inmunol�gico y a promover la curaci�n. " +
                                                  "\n Se recomienda consumir alimentos ricos en vitaminas, minerales y antioxidantes, como frutas y verduras de colores vivos   " +
                                                  "\n (c�tricos, bayas, espinacas, br�coli), prote�nas magras (pollo, pescado, legumbres) y caldos y sopas. En particular, se   " +
                                                  "\n recomienda consumir alimentos ricos en: Vitamina C (c�tricos, kiwi, fresas): fortalece el sistema inmunol�gico y ayuda    " +
                                                  "\n a combatir las infecciones. Zinc (carne, mariscos, nueces): esencial para la funci�n inmunol�gica y la cicatrizaci�n de   " +
                                                  "\n heridas. Caldo de pollo: proporciona hidrataci�n, nutrientes y calor reconfortante. El caldo de pollo, por ejemplo,       " +
                                                  "\n contiene ciste�na, un amino�cido que puede ayudar a fluidificar las secreciones y facilitar la expectoraci�n. Una taza    " +
                                                  "\n de caldo de pollo proporciona aproximadamente 200 mg de ciste�na, lo que puede ayudar a aliviar los s�ntomas de la influenza." +
                                                  "\n Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa      " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un         " +
                                                  "\n Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud     " +
                                                  "\n si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes     " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                               textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumon�a." +
                                                  "\n El adolescente con neumon�a debe mantenerse bien hidratado para ayudar a fluidificar las secreciones y facilitar la " +
                                                  "\n expectoraci�n. Se recomienda consumir entre 2.5 y 3 litros de l�quidos al d�a (diez a doce vasos de tama�o regular)," +
                                                  "\n incluyendo agua, jugos de frutas, caldos y sopas. El reposo es importante durante la fase aguda de la neumon�a para " +
                                                  "\n permitir que el cuerpo se recupere. La actividad f�sica debe ser limitada hasta que los s�ntomas mejoren.           " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento para la neumon�a generalmente consiste en antibi�ticos para combatir la infecci�n" +
                                                  "\n bacteriana. Los antibi�ticos comunes utilizados en el tratamiento de la neumon�a incluyen: Amoxicilina, Azitromicina " +
                                                  "\n y Ceftriaxona. Es fundamental completar el ciclo completo de antibi�ticos seg�n las indicaciones del m�dico, incluso " +
                                                  "\n si los s�ntomas desaparecen antes. Adem�s, se pueden utilizar medicamentos para aliviar los s�ntomas, como analg�sicos" +
                                                  "\n para reducir la fiebre y el dolor, y expectorantes para facilitar la expectoraci�n. Una dieta nutritiva puede ayudar a" +
                                                  "\n fortalecer el sistema inmunol�gico y a promover la curaci�n. Se recomienda consumir alimentos ricos en vitaminas,     " +
                                                  "\n minerales y antioxidantes, como frutas y verduras de colores vivos (c�tricos, bayas, espinacas, br�coli), prote�nas   " +
                                                  "\n magras (pollo, pescado, legumbres) y caldos y sopas. En particular, se recomienda consumir alimentos ricos en: Vitamina C" + 
                                                  "\n (c�tricos, kiwi, fresas): fortalece el sistema inmunol�gico y ayuda a combatir las infecciones. Zinc (carne, mariscos,  " +
                                                  "\n nueces): esencial para la funci�n inmunol�gica y la cicatrizaci�n de heridas. Caldo de pollo: proporciona hidrataci�n,  " +
                                                  "\n nutrientes y calor reconfortante. La espinaca, por ejemplo, es una excelente fuente de vitamina A, vitamina C y antioxidantes." +
                                                  "\n Una porci�n de 100 gramos de espinaca cocida proporciona aproximadamente el 50% de la ingesta diaria recomendada de      " +
                                                  "\n vitamina A, que es importante para la funci�n inmunol�gica y la salud de las membranas mucosas en los pulmones. Este     " +
                                                  "\n es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad" +
                                                  "\n y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico        " +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta " +
                                                  "\n del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu         " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores."); 
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visi�n borrosa, P�rdida de peso.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n El adolescente con diabetes debe mantener una hidrataci�n adecuada para ayudar a regular los niveles de az�car en la " +
                                                  "\n sangre y prevenir la deshidrataci�n. Se recomienda consumir entre 2 y 2.5 litros de agua al d�a (ocho a diez vasos de" +
                                                  "\n tama�o regular), evitando las bebidas azucaradas y con gas. La actividad f�sica es fundamental para controlar los    " +
                                                  "\n niveles de az�car en la sangre, mejorar la sensibilidad a la insulina y mantener un peso saludable. Se sugiere realizar" +
                                                  "\n al menos 60 minutos de ejercicio moderado a vigoroso al d�a, incluyendo actividades aer�bicas (como caminar, correr, " +
                                                  "\n nadar o andar en bicicleta) y ejercicios de fuerza (como levantamiento de pesas ligero o ejercicios con bandas de    " +
                                                  "\n resistencia). POSIBLE TRATAMIENTO: El tratamiento para la diabetes generalmente incluye una combinaci�n de dieta,    " +
                                                  "\n ejercicio y medicamentos para controlar los niveles de az�car en la sangre. Algunos medicamentos comunes utilizados  " +
                                                  "\n en el tratamiento de la diabetes incluyen: Metformina, Insulina y Sulfonilureas. Es fundamental seguir las indicaciones" +
                                                  "\n del m�dico y controlar regularmente los niveles de az�car en la sangre. Una dieta saludable es fundamental para controlar" +
                                                  "\n los niveles de az�car en la sangre, mantener un peso saludable y prevenir complicaciones. Se recomienda consumir alimentos" +
                                                  "\n ricos en fibra, vitaminas y minerales, como verduras de hoja verde (espinacas, lechuga, acelgas), frutas bajas en az�car " +
                                                  "\n (bayas, manzanas, peras), prote�nas magras (pollo, pescado, legumbres) y granos integrales (arroz integral, quinoa, avena)." +
                                                  "\n En particular, se recomienda consumir alimentos ricos en: Fibra (verduras, frutas, granos integrales): ayuda a regular los" +
                                                  "\n niveles de az�car en la sangre y a mejorar la digesti�n. Cromo (br�coli, levadura de cerveza, champi�ones): ayuda a mejorar" +
                                                  "\n la sensibilidad a la insulina. Magnesio (verduras de hoja verde, frutos secos, semillas): ayuda a regular los niveles de   " +
                                                  "\n az�car en la sangre y a prevenir complicaciones. Las espinacas, por ejemplo, son una excelente fuente de magnesio. Una     " +
                                                  "\n porci�n de 100 gramos de espinacas cocidas proporciona aproximadamente el 20% de la ingesta diaria recomendada de magnesio," +
                                                  "\n lo que ayuda a regular los niveles de az�car en la sangre y a prevenir complicaciones de la diabetes. Este es solo un      " +
                                                  "\n Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que      " +
                                                  "\n por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida    " +
                                                  "\n para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del         " +
                                                  "\n Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita       " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresi�n en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n El adolescente con asma debe mantenerse bien hidratado para ayudar a fluidificar las secreciones y facilitar la respiraci�n. " +
                                                  "\n Se recomienda consumir entre 2 y 2.5 litros de agua al d�a (ocho a diez vasos de tama�o regular), evitando las bebidas fr�as " +
                                                  "\n y con gas. La actividad f�sica es fundamental para fortalecer los m�sculos respiratorios y mejorar la capacidad pulmonar,    " +
                                                  "\n pero debe ser realizada con precauci�n y bajo supervisi�n m�dica. Se sugiere realizar ejercicios de bajo impacto (como caminar," +
                                                  "\n nadar o andar en bicicleta) durante al menos 30-60 minutos al d�a, evitando los desencadenantes conocidos del asma (como       " +
                                                  "\n al�rgenos, aire fr�o o contaminaci�n) y llevando siempre consigo un inhalador de rescate. POSIBLE TRATAMIENTO: El tratamiento  " +
                                                  "\n para el asma generalmente incluye una combinaci�n de medicamentos para controlar la inflamaci�n y abrir las v�as respiratorias." +
                                                  "\n Algunos medicamentos comunes utilizados en el tratamiento del asma incluyen: Corticosteroides inhalados (como la fluticasona   " +
                                                  "\n o la budesonida) para reducir la inflamaci�n de las v�as respiratorias, Broncodilatadores de acci�n r�pida (como el salbutamol)" +
                                                  "\n para abrir las v�as respiratorias durante un ataque de asma y Modificadores de leucotrienos (como el montelukast) para reducir " +
                                                  "\n la inflamaci�n y la producci�n de moco. Es fundamental seguir las indicaciones del m�dico y utilizar los medicamentos seg�n lo " +
                                                  "\n prescrito. Una dieta saludable puede ayudar a fortalecer el sistema inmunol�gico y a reducir la inflamaci�n. Se recomienda     " +
                                                  "\n consumir alimentos ricos en antioxidantes, antiinflamatorios y �cidos grasos omega-3, como frutas y verduras de colores vivos  " +
                                                  "\n (bayas, c�tricos, espinacas, br�coli), pescado azul (salm�n, at�n, sardinas) y frutos secos. En particular, se recomienda     " +
                                                  "\n consumir alimentos ricos en: Vitamina C (c�tricos, kiwi, fresas): fortalece el sistema inmunol�gico y ayuda a combatir las    " +
                                                  "\n infecciones. Vitamina E (aceites vegetales, frutos secos, semillas): protege las c�lulas del da�o y reduce la inflamaci�n.    " +
                                                  "\n �cidos grasos omega-3 (pescado azul, semillas de lino, nueces): reducen la inflamaci�n de las v�as respiratorias. El salm�n,  " +
                                                  "\n por ejemplo, es una excelente fuente de �cidos grasos omega-3. Una porci�n de 100 gramos de salm�n cocido proporciona         " +
                                                  "\n aproximadamente 2.3 gramos de omega-3, lo que puede ayudar a reducir la inflamaci�n de las v�as respiratorias y a mejorar     " +
                                                  "\n la funci�n pulmonar. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el        " +
                                                  "\n paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda          " +
                                                  "\n hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s      " +
                                                  "\n por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico,           " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, P�rdida de peso, Ganglios linf�ticos inflamados, Erupci�n cut�nea (Diarrea).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA. " +
                                                  "\n El adolescente con VIH/SIDA debe mantenerse bien hidratado para apoyar la funci�n inmunol�gica y facilitar la absorci�n " +
                                                  "\n de los medicamentos antirretrovirales. Se recomienda consumir entre 2.5 y 3 litros de agua al d�a (diez a doce vasos de " +
                                                  "\n tama�o regular). La actividad f�sica regular es fundamental para mantener la masa muscular, mejorar el estado de �nimo  " +
                                                  "\n y fortalecer el sistema inmunol�gico. Se sugiere realizar al menos 30-60 minutos de ejercicio moderado a vigoroso al d�a," +
                                                  "\n incluyendo actividades aer�bicas (como caminar, correr, nadar o bailar) y ejercicios de fuerza (como levantamiento de pesas" +
                                                  "\n ligero o ejercicios con bandas de resistencia). POSIBLE TRATAMIENTO: El tratamiento para el VIH/SIDA consiste en la terapia" +
                                                  "\n antirretroviral (TAR), que ayuda a controlar la replicaci�n del virus y a prevenir la progresi�n de la enfermedad. Es      " +
                                                  "\n fundamental seguir las indicaciones del m�dico y tomar los medicamentos seg�n lo prescrito. Adem�s, una dieta nutritiva    " +
                                                  "\n puede ayudar a fortalecer el sistema inmunol�gico, mantener un peso saludable y prevenir infecciones oportunistas. Se      " +
                                                  "\n recomienda consumir alimentos ricos en prote�nas, vitaminas, minerales y antioxidantes, como frutas y verduras de colores  " +
                                                  "\n vivos (bayas, c�tricos, espinacas, br�coli), prote�nas magras (pollo, pescado, legumbres) y grasas saludables (aceite de   " + 
                                                  "\n oliva, aguacate, nueces). En particular, se recomienda consumir alimentos ricos en: Prote�nas (carne magra, pescado,       " +
                                                  "\n legumbres): necesarias para la reparaci�n de tejidos, la producci�n de anticuerpos y el mantenimiento de la masa muscular. " +
                                                  "\n Vitaminas y minerales (frutas y verduras de colores vivos): fortalecen el sistema inmunol�gico y protegen las c�lulas del  " +
                                                  "\n da�o. Probi�ticos (yogur, k�fir, chucrut): ayudan a mantener un equilibrio saludable de bacterias en el intestino, lo que  " +
                                                  "\n puede fortalecer el sistema inmunol�gico. El yogur, por ejemplo, es una excelente fuente de probi�ticos y prote�nas. Una   " +
                                                  "\n porci�n de 200 gramos de yogur proporciona aproximadamente 20 gramos de prote�na, lo que ayuda a mantener la masa muscular " +
                                                  "\n y a fortalecer el sistema inmunol�gico. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza " +
                                                  "\n al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se   " +
                                                  "\n recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente," +
                                                  "\n adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreci�n anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n El adolescente con gonorrea debe mantenerse bien hidratado para apoyar la funci�n renal y facilitar la eliminaci�n de toxinas. " +
                                                  "\n Se recomienda consumir entre 2 y 2.5 litros de agua al d�a (ocho a diez vasos de tama�o regular). No se requiere un r�gimen    " +
                                                  "\n de ejercicio espec�fico para el tratamiento de la gonorrea, pero mantener un estilo de vida activo y saludable puede ayudar    " +
                                                  "\n a fortalecer el sistema inmunol�gico. Se sugiere realizar al menos 30 minutos de actividad f�sica moderada la mayor�a de los   " +
                                                  "\n d�as de la semana. POSIBLE TRATAMIENTO: El tratamiento para la gonorrea generalmente consiste en una combinaci�n de antibi�ticos" +
                                                  "\n para combatir la infecci�n bacteriana. Los antibi�ticos comunes utilizados en el tratamiento de la gonorrea incluyen: Ceftriaxona" +
                                                  "\n (administrada por inyecci�n) y Azitromicina (administrada por v�a oral). Es fundamental completar el ciclo completo de antibi�ticos" +
                                                  "\n seg�n las indicaciones del m�dico, incluso si los s�ntomas desaparecen antes. Adem�s, es importante evitar las relaciones sexuales " +
                                                  "\n hasta que tanto el adolescente como su pareja hayan completado el tratamiento y se hayan realizado pruebas de seguimiento para     " +
                                                  "\n confirmar que la infecci�n ha sido eliminada. Una dieta saludable puede ayudar a fortalecer el sistema inmunol�gico y a promover   " +
                                                  "\n la curaci�n. Se recomienda consumir alimentos ricos en vitaminas, minerales y antioxidantes, como frutas y verduras de colores     " +
                                                  "\n vivos (c�tricos, bayas, espinacas, zanahorias), prote�nas magras (pollo, pescado, legumbres) y granos integrales. En particular,   " +
                                                  "\n se recomienda consumir alimentos ricos en: Vitamina C (c�tricos, kiwi, fresas): fortalece el sistema inmunol�gico y ayuda a        " +
                                                  "\n combatir las infecciones. Zinc (carne, mariscos, nueces): esencial para la funci�n inmunol�gica y la cicatrizaci�n de heridas.     " +
                                                  "\n Probi�ticos (yogur, k�fir, chucrut): ayudan a mantener un equilibrio saludable de bacterias en el intestino, lo que puede          " +
                                                  "\n fortalecer el sistema inmunol�gico. Los mariscos, por ejemplo, son una buena fuente de zinc. Una porci�n de 100 gramos de          " +
                                                  "\n ostras proporciona aproximadamente el 400% de la ingesta diaria recomendada de zinc, lo que es esencial para la funci�n            " +
                                                  "\n inmunol�gica y la cicatrizaci�n de heridas. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza     " +
                                                  "\n al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se           " +
                                                  "\n recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente,       " +
                                                  "\n adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico,         " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linf�ticos inflamados, �lceras o llagas dolorosas, Picaz�n o ardor, Dolor al orinar.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n Es recomendable mantener una buena higiene en el �rea genital, lavando suavemente con agua y jab�n neutro y secando " +
                                                  "\n bien despu�s del lavado. Se aconseja evitar ropa ajustada y de materiales sint�ticos que puedan irritar la zona     " + 
                                                  "\n afectada. No hay una restricci�n espec�fica de actividad f�sica, pero se recomienda evitar actividades que puedan   " +
                                                  "\n causar fricci�n o irritaci�n en la zona genital durante los brotes. La hidrataci�n es importante para el bienestar  " +
                                                  "\n general, se recomienda beber al menos 2 litros de agua al d�a (ocho vasos de agua de tama�o regular) para mantener  " +
                                                  "\n el cuerpo hidratado y ayudar a fortalecer el sistema inmunol�gico. POSIBLE TRATAMIENTO: El tratamiento para el herpes" +
                                                  "\n genital se centra en aliviar los s�ntomas y prevenir brotes. Los medicamentos antivirales como el aciclovir (Zovirax," +
                                                  "\n marcas gen�ricas disponibles en M�xico), valaciclovir (Valtrex) y famciclovir (Famvir) son com�nmente prescritos. Estos" +
                                                  "\n medicamentos pueden tomarse oralmente durante los brotes para reducir la duraci�n y severidad de los s�ntomas, o      " +
                                                  "\n diariamente como terapia supresiva para reducir la frecuencia de los brotes. Para aliviar el dolor y la picaz�n, se   " +
                                                  "\n pueden usar cremas o ung�entos anest�sicos t�picos de venta libre. Es recomendable consumir alimentos que fortalezcan " +
                                                  "\n el sistema inmunol�gico, tales como: Alimentos ricos en lisina (pescado, pollo, legumbres): La lisina es un amino�cido" +
                                                  "\n que puede ayudar a prevenir la replicaci�n del virus del herpes. Frutas y verduras ricas en vitamina C (c�tricos,     " +
                                                  "\n fresas, pimientos, br�coli): La vitamina C es un antioxidante que puede ayudar a fortalecer el sistema inmunol�gico   " +
                                                  "\n y proteger contra infecciones. Alimentos ricos en zinc (carne, mariscos, nueces): El zinc es un mineral importante    " +
                                                  "\n para la funci�n inmunol�gica y la cicatrizaci�n de heridas. Evitar alimentos ricos en arginina (chocolate, nueces,    " +
                                                  "\n semillas): La arginina es un amino�cido que puede promover la replicaci�n del virus del herpes. Este es solo un       " +
                                                  "\n Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y     " +
                                                  "\n que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico      " +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la       " +
                                                  "\n respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes       " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, �lceras indoloras, Erupci�n cut�nea, Dolor de cabeza, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer S�filis. " +
                                                  "\n Se recomienda evitar la actividad f�sica intensa durante el tratamiento para permitir que el cuerpo se concentre en la   " +
                                                  "\n curaci�n. Caminatas suaves y ejercicios de bajo impacto pueden ser apropiados, pero es importante consultar con el m�dico." +
                                                  "\n La hidrataci�n adecuada es crucial para el bienestar general y para ayudar a eliminar toxinas del cuerpo. Se recomienda   " +
                                                  "\n beber al menos 2 litros de agua al d�a (ocho vasos de tama�o regular). Mantener una buena higiene personal es importante  " +
                                                  "\n para prevenir la propagaci�n de la infecci�n a otras �reas del cuerpo. POSIBLE TRATAMIENTO: El tratamiento para la s�filis" +
                                                  "\n es con antibi�ticos, generalmente penicilina. La dosis y duraci�n del tratamiento dependen de la etapa de la s�filis. La  " +
                                                  "\n penicilina benzat�nica (Bicillin L-A) es una marca com�n utilizada para tratar la s�filis. Es crucial completar todo el   " +
                                                  "\n ciclo de antibi�ticos seg�n las indicaciones del m�dico, incluso si los s�ntomas desaparecen. Los alimentos que pueden    " +
                                                  "\n ayudar a fortalecer el sistema inmunol�gico incluyen: Alimentos ricos en vitamina C (c�tricos, fresas, kiwi, pimientos):  " +
                                                  "\n La vitamina C es un antioxidante que ayuda a fortalecer el sistema inmunol�gico. Alimentos ricos en zinc (carne, mariscos," +
                                                  "\n nueces, semillas): El zinc es esencial para la funci�n inmunol�gica y la reparaci�n de tejidos. Alimentos ricos en probi�ticos" +
                                                  "\n (yogur, k�fir, chucrut): Los probi�ticos pueden ayudar a mantener un equilibrio saludable de bacterias en el intestino, lo  " +
                                                  "\n que puede fortalecer el sistema inmunol�gico. Alimentos ricos en antioxidantes (frutas y verduras de colores brillantes):   " +
                                                  "\n Los antioxidantes protegen las c�lulas del da�o y ayudan a fortalecer el sistema inmunol�gico. Se recomienda evitar el      " +
                                                  "\n consumo de alcohol durante el tratamiento con antibi�ticos, ya que puede interferir con la eficacia del medicamento y       " +
                                                  "\n aumentar el riesgo de efectos secundarios. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no         " +
                                                  "\n garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para  " +
                                                  "\n ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de     " +
                                                  "\n su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar  " +
                                                  "\n a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, P�rdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n Durante el tratamiento de la tuberculosis, es crucial mantener una actividad f�sica moderada, adaptada a la tolerancia  " +
                                                  "\n del paciente y bajo supervisi�n m�dica. Caminar diariamente y realizar ejercicios de respiraci�n pueden ser beneficiosos." +
                                                  "\n Es fundamental evitar el ejercicio extenuante que pueda debilitar el sistema inmunol�gico. Se recomienda una ingesta de  " +
                                                  "\n l�quidos de al menos 2.5 litros de agua al d�a (diez vasos de tama�o regular) para ayudar a mantener las v�as respiratorias" +
                                                  "\n hidratadas y facilitar la eliminaci�n de toxinas. Una nutrici�n adecuada es esencial para fortalecer el sistema inmunol�gico" +
                                                  "\n y mejorar la respuesta al tratamiento. POSIBLE TRATAMIENTO: El tratamiento para la tuberculosis se basa en una combinaci�n " +
                                                  "\n de antibi�ticos que deben tomarse durante un per�odo prolongado, generalmente de 6 a 9 meses. Algunos de los medicamentos  " +
                                                  "\n comunes incluyen: Isoniazida (INH), Rifampicina (Rifadin), Pirazinamida, Etambutol (Myambutol). Es fundamental seguir      " +
                                                  "\n estrictamente las indicaciones m�dicas y completar todo el ciclo de tratamiento para prevenir la resistencia a los         " +
                                                  "\n medicamentos. Para fortalecer el sistema inmunol�gico y mejorar la respuesta al tratamiento, se recomienda consumir        " +
                                                  "\n los siguientes alimentos: H�gado de res: Rico en vitamina A (aproximadamente 860% de la ingesta diaria recomendada por     " +
                                                  "\n cada 100 gramos), esencial para la funci�n inmunol�gica y la salud de las mucosas. C�tricos (naranja, lim�n, pomelo):      " +
                                                  "\n Altos en vitamina C (aproximadamente 50-90% de la ingesta diaria recomendada por cada 100 gramos), un antioxidante que     " +
                                                  "\n fortalece el sistema inmunol�gico. Zanahorias: Fuente de betacaroteno, que el cuerpo convierte en vitamina A (aproximadamente" +
                                                  "\n 200% de la ingesta diaria recomendada por cada 100 gramos), importante para la visi�n y la funci�n inmunol�gica. Almendras:  " +
                                                  "\n Ricas en vitamina E (aproximadamente 37% de la ingesta diaria recomendada por cada 100 gramos), un antioxidante que protege  " +
                                                  "\n las c�lulas del da�o. Yogur con probi�ticos: Ayuda a mantener un equilibrio saludable de bacterias en el intestino,          " +
                                                  "\n fortaleciendo el sistema inmunol�gico. Se recomienda evitar el consumo de alcohol y tabaco, ya que pueden interferir         " +
                                                  "\n con el tratamiento y debilitar el sistema inmunol�gico. Este es solo un Diagn�stico predeterminado l�gico, haberlo           " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas           " +
                                                  "\n est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en           " +
                                                  "\n el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo         " +
                                                  "\n se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchaz�n en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n Es fundamental que los adolescentes con artritis se mantengan activos para preservar la funci�n articular, reducir " +
                                                  "\n el dolor y mejorar la calidad de vida, recomend�ndose ejercicios de bajo impacto como nataci�n, ciclismo, caminar, " +
                                                  "\n yoga o tai chi, adaptados a la tolerancia individual y evitando el dolor excesivo; el objetivo puede ser alrededor " +
                                                  "\n de 60 minutos de actividad f�sica moderada la mayor�a de los d�as de la semana, siempre bajo supervisi�n o         " +
                                                  "\n recomendaci�n m�dica para un plan seguro y personalizado, especialmente durante brotes de inflamaci�n. En cuanto a " +
                                                  "\n la hidrataci�n, generalmente los adolescentes necesitan entre 2 y 3 litros de agua al d�a, variando seg�n la actividad" +
                                                  "\n f�sica y condiciones individuales; para quienes padecen artritis, una buena hidrataci�n es clave para ayudar a lubricar" +
                                                  "\n las articulaciones y puede contribuir al manejo de la inflamaci�n y los efectos secundarios de medicamentos.        " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento para la artritis en adolescentes, a menudo referida como artritis idiop�tica    " +
                                                  "\n juvenil en este grupo etario, es complejo y debe ser dirigido por un reumat�logo; puede incluir antiinflamatorios   " +
                                                  "\n no esteroideos (AINEs) para el alivio del dolor e inflamaci�n, como el ibuprofeno (marcas comunes en M�xico: Advil, " +
                                                  "\n Motrin, Tabalon) o naproxeno (marcas comunes: Flanax, Febrax, Naxen). Tambi�n se utilizan F�rmacos Antirreum�ticos  " +
                                                  "\n Modificadores de la Enfermedad (FARME), como el metotrexato (marcas: Ledertrexate, Texotrexate, Metotrexato IMA),   " +
                                                  "\n para controlar la enfermedad a largo plazo. En casos m�s severos o resistentes, pueden emplearse medicamentos       " +
                                                  "\n biol�gicos como etanercept (Enbrel) o adalimumab (Humira). Los corticosteroides, como la prednisona (Meticorten)    " +
                                                  "\n o deflazacort (Calcort), pueden ser indicados para controlar brotes agudos, usualmente por cortos periodos.         " +
                                                  "\n Es crucial adherirse estrictamente al plan de tratamiento indicado por el especialista. Tambi�n es recomendable     " +
                                                  "\n que el adolescente consuma alimentos que puedan ayudar a reducir la inflamaci�n y fortalecer la salud articular,    " +
                                                  "\n tales como: Pescados grasos (salm�n, at�n, sardinas): ricos en �cidos grasos Omega-3 con potentes propiedades       " +
                                                  "\n antiinflamatorias. Frutas y verduras de colores intensos (fresas, ar�ndanos, frambuesas, naranjas, kiwis, espinacas," +
                                                  "\n br�coli, zanahorias): fuentes de antioxidantes como la vitamina C y carotenoides, que combaten el estr�s oxidativo y" +
                                                  "\n apoyan la producci�n de col�geno. Nueces y semillas (almendras, nueces de la India, ch�a, linaza): aportan Omega-3 " +
                                                  "\n de origen vegetal, grasas saludables y antioxidantes. Aceite de oliva extra virgen: contiene oleocantal, un compuesto" +
                                                  "\n con efectos antiinflamatorios, adem�s de grasas monoinsaturadas saludables. Granos integrales (avena, arroz integral," +
                                                  "\n quinoa): proporcionan fibra, que ayuda a mantener un peso saludable y puede tener efectos antiinflamatorios. Especias" +
                                                  "\n como la c�rcuma (con su componente activo, la curcumina) y el jengibre: conocidas por sus potentes efectos antiinflamatorios." +
                                                  "\n Adicionalmente, es importante asegurar una ingesta adecuada de calcio y vitamina D, cruciales para la salud �sea, la" +
                                                  "\n cual puede verse afectada por la artritis o algunos de sus tratamientos. Este es solo un Diagn�stico predeterminado " +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y " +
                                                  "\n sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor" +
                                                  "\n seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface" +
                                                  "\n del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n Durante la fase aguda de la tosferina, el reposo es crucial para la recuperaci�n del adolescente; se debe evitar " +
                                                  "\n el ejercicio extenuante ya que puede agravar los accesos de tos y solo considerar actividades muy ligeras, como  " +
                                                  "\n caminatas suaves y cortas, una vez que la fiebre haya cedido y la tos disminuya significativamente, siempre con  " +
                                                  "\n aprobaci�n m�dica y asegurando que no exacerben los s�ntomas, con un retorno muy gradual a la actividad normal.  " +
                                                  "\n Mantener una excelente hidrataci�n es vital, recomend�ndose entre 2 y 2.5 litros de l�quidos al d�a para el      " +
                                                  "\n adolescente, como agua, caldos tibios o t�s suaves, lo cual ayuda a fluidificar las secreciones respiratorias    " +
                                                  "\n y a prevenir la deshidrataci�n. POSIBLE TRATAMIENTO: El tratamiento principal para la tosferina en adolescentes  " +
                                                  "\n son los antibi�ticos, m�s efectivos si se inician tempranamente para acortar el periodo de contagio y reducir la " +
                                                  "\n severidad; entre los comunes se encuentran la azitromicina (Zitromax) o claritromicina (Klaricid), debiendo      " +
                                                  "\n completarse el ciclo seg�n indicaci�n m�dica. Generalmente no se recomiendan antitus�genos, y el manejo se centra" +
                                                  "\n en el soporte, descanso y un ambiente tranquilo. Para apoyar la recuperaci�n y el sistema inmune del adolescente," +
                                                  "\n se sugieren comidas peque�as, frecuentes y f�ciles de tragar; es recomendable el consumo de: Frutas ricas en     " +
                                                  "\n Vitamina C para fortalecer defensas, como la guayaba (100g aportan unos 228mg de Vitamina C, superando el 250%   " +
                                                  "\n de la ingesta diaria recomendada para un adulto) o naranjas (100g ofrecen alrededor de 53mg de Vitamina C, casi  " +
                                                  "\n el 60% IDR adulto). Alimentos con Zinc para la funci�n inmune, como carne magra de res bien cocida y en porciones" +
                                                  "\n peque�as (100g pueden proveer 5-7mg de Zinc, aprox. 50% IDR adulto) o lentejas en sopa. Para la salud de las     " +
                                                  "\n mucosas respiratorias, alimentos con Vitamina A como zanahorias cocidas (100g son una excelente fuente de beta-carotenos)" +
                                                  "\n o espinacas. Caldos y sopas tibias con pollo desmenuzado pueden aportar prote�nas y l�quidos de forma reconfortante," +
                                                  "\n y la miel (en mayores de un a�o) puede ayudar a calmar la tos. Este es solo un Diagn�stico predeterminado l�gico,   " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus     " +
                                                  "\n respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor    " +
                                                  "\n seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le      " +
                                                  "\n satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app         " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchaz�n de las gl�ndulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n Durante la infecci�n por paperas, el reposo es fundamental para el adolescente, especialmente si hay fiebre o " +
                                                  "\n inflamaci�n glandular significativa; se deben evitar las actividades f�sicas intensas para no exacerbar los   " +
                                                  "\n s�ntomas y reducir el riesgo de complicaciones como la orquitis (inflamaci�n testicular), a la que los varones" +
                                                  "\n adolescentes son susceptibles, y en caso de presentarse dolor o inflamaci�n testicular, el reposo absoluto es " +
                                                  "\n crucial, con una reincorporaci�n a la actividad f�sica gradual y solo tras la resoluci�n completa de los s�ntomas" +
                                                  "\n bajo consejo m�dico. Es importante asegurar una buena hidrataci�n, con un consumo de 2 a 2.5 litros de l�quidos al" +
                                                  "\n d�a para el adolescente, como agua, t�s suaves o caldos, para ayudar a manejar la fiebre y el malestar general;   " +
                                                  "\n si tragar es doloroso, se deben ofrecer l�quidos en peque�os sorbos y con frecuencia. POSIBLE TRATAMIENTO: No     " +
                                                  "\n existe un tratamiento antiviral espec�fico para las paperas; el manejo se enfoca en aliviar los s�ntomas. Para la " +
                                                  "\n fiebre y el dolor, se pueden utilizar analg�sicos y antipir�ticos como el paracetamol (Tempra) o ibuprofeno (Advil)." +
                                                  "\n Aplicar compresas fr�as o tibias en las gl�ndulas inflamadas puede proporcionar alivio. En caso de desarrollar orquitis," +
                                                  "\n es vital el reposo en cama, el soporte escrotal y la consulta m�dica inmediata para un manejo adecuado. Se recomienda   " +
                                                  "\n una dieta de alimentos blandos y f�ciles de tragar para el adolescente, evitando alimentos �cidos (c�tricos, tomate)    " +
                                                  "\n o muy condimentados que puedan irritar las gl�ndulas salivales; tambi�n es recomendable que el adolescente consuma:     " +
                                                  "\n Alimentos ricos en Vitamina C para apoyar el sistema inmune, como pur� de calabaza cocida (100g pueden aportar unos 9mg  " +
                                                  "\n de Vitamina C, aprox. 10% IDR adulto) o sopas de verduras suaves. Fuentes de Zinc para la funci�n inmune, como el       " +
                                                  "\n yogur natural (100g pueden aportar cerca de 1mg de Zinc, aprox. 9% IDR adulto) o avena cocida preparada como gachas.    " +
                                                  "\n Para la salud de las mucosas y defensas, alimentos con Vitamina A, como el camote cocido y hecho pur� (100g proveen     " +
                                                  "\n una alta cantidad de beta-carotenos, precursores de Vitamina A) o zanahorias tambi�n en pur�. Prote�nas de f�cil        " +
                                                  "\n digesti�n como huevos revueltos suaves o pollo desmenuzado en caldos. Los l�quidos nutritivos como batidos no �cidos    " +
                                                  "\n y caldos son importantes. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100%    " +
                                                  "\n que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se        " +
                                                  "\n recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su      " +
                                                  "\n paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar " +
                                                  "\n a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupci�n cut�nea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika. " +
                                                  "\n Es recomendable que el adolescente mantenga una hidrataci�n adecuada, consumiendo entre 2 y 3 litros de agua al d�a    " +
                                                  "\n para ayudar a su recuperaci�n y prevenir la deshidrataci�n causada por la fiebre. La actividad f�sica debe ser moderada" +
                                                  "\n y adaptada a su estado de salud, evitando esfuerzos excesivos mientras persistan los s�ntomas. POSIBLE TRATAMIENTO:    " +
                                                  "\n No existe un tratamiento espec�fico para el Zika, pero los s�ntomas pueden manejarse con medicamentos como el paracetamol" +
                                                  "\n (Tempra) para la fiebre y el dolor, evitando el uso de antiinflamatorios como el ibuprofeno y la aspirina. Tambi�n se   " +
                                                  "\n recomienda el descanso y el consumo de l�quidos. En M�xico, se aconseja el uso de repelentes de mosquitos y ropa que cubra" +
                                                  "\n la piel para prevenir nuevas picaduras. En cuanto a la alimentaci�n, es recomendable el consumo de frutas y verduras ricas" +
                                                  "\n en antioxidantes y vitamina C, como naranjas, fresas, kiwis y guayabas, que pueden fortalecer el sistema inmunol�gico.    " +
                                                  "\n Tambi�n se sugiere el consumo de alimentos con propiedades antiinflamatorias como el jengibre y la c�rcuma. Este es solo  " +
                                                  "\n un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que  " +
                                                  "\n por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un diagn�stico de Mi Vida   " +
                                                  "\n para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del diagn�stico" + 
                                                  "\n no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida)" +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, V�mitos, Deshidrataci�n, Dolor abdominal.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n Es fundamental que el adolescente mantenga una hidrataci�n adecuada, consumiendo entre 2.5 y 3 litros de agua al d�a " +
                                                  "\n para prevenir la deshidrataci�n causada por la diarrea y los v�mitos. La actividad f�sica debe ser m�nima mientras   " +
                                                  "\n persistan los s�ntomas, priorizando el descanso. POSIBLE TRATAMIENTO: No existe un tratamiento espec�fico para el    " +
                                                  "\n rotavirus, pero los s�ntomas pueden manejarse con soluciones de rehidrataci�n oral como Pedialyte para reponer       " +
                                                  "\n electrolitos y l�quidos perdidos. Se recomienda evitar medicamentos antidiarreicos y mantener una alimentaci�n       " +
                                                  "\n ligera. En cuanto a la nutrici�n, es recomendable el consumo de alimentos ricos en vitamina A y zinc, como zanahorias" +
                                                  "\n (por cada 100 gramos, aproximadamente 835 �g de vitamina A, cubriendo el 93% de la ingesta diaria recomendada para   " +
                                                  "\n adolescentes) y semillas de calabaza (por cada 100 gramos, alrededor de 7.8 mg de zinc, cubriendo el 71% de la ingesta" +
                                                  "\n diaria recomendada). Tambi�n se sugiere el consumo de pl�tanos, que ayudan a reponer electrolitos y aportan potasio  " +
                                                  "\n (por cada 100 gramos, aproximadamente 358 mg de potasio, cubriendo el 10% de la ingesta diaria recomendada).         " +
                                                  "\n Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga     " +
                                                  "\n esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s      " +
                                                  "\n de un diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por   " +
                                                  "\n su salud si la respuesta del diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico,      " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, N�useas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeriosis." +
                                                  "\n Es fundamental que el adolescente mantenga una hidrataci�n adecuada, consumiendo entre 2.5 y 3 litros de agua al  " +
                                                  "\n d�a para ayudar a su recuperaci�n y prevenir la deshidrataci�n causada por la fiebre y otros s�ntomas. La actividad" +
                                                  "\n f�sica debe ser m�nima mientras persistan los s�ntomas, priorizando el descanso. POSIBLE TRATAMIENTO: La infecci�n " +
                                                  "\n por Listeria monocytogenes se trata con antibi�ticos, siendo la ampicilina y la gentamicina opciones altamente     " +
                                                  "\n eficaces. La ampicilina impide la replicaci�n de la bacteria, mientras que la gentamicina bloquea la producci�n    " +
                                                  "\n de prote�nas esenciales para su supervivencia. En cuanto a la alimentaci�n, es recomendable el consumo de alimentos" +
                                                  "\n ricos en vitamina A y zinc, como zanahorias (por cada 100 gramos, aproximadamente 835 �g de vitamina A, cubriendo  " +
                                                  "\n el 93% de la ingesta diaria recomendada para adolescentes) y semillas de calabaza (por cada 100 gramos, alrededor  " +
                                                  "\n de 7.8 mg de zinc, cubriendo el 71% de la ingesta diaria recomendada). Tambi�n se sugiere el consumo de pl�tanos,  " +
                                                  "\n que ayudan a reponer electrolitos y aportan potasio (por cada 100 gramos, aproximadamente 358 mg de potasio, cubriendo" +
                                                  "\n el 10% de la ingesta diaria recomendada). Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no " +
                                                  "\n garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas," +
                                                  "\n para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento   " +
                                                  "\n adecuado de su paciente, adem�s por su salud si la respuesta del diagn�stico no le satisface del todo se le recomienda" + 
                                                  "\n mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, V�mitos.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis. " +
                                                  "\n Es fundamental que el adolescente mantenga una hidrataci�n adecuada, consumiendo entre 2.5 y 3 litros de agua al " +
                                                  "\n d�a para prevenir la deshidrataci�n causada por la diarrea y otros s�ntomas. La actividad f�sica debe ser m�nima " +
                                                  "\n mientras persistan los s�ntomas, priorizando el descanso. POSIBLE TRATAMIENTO: La infecci�n por Shigella suele   " +
                                                  "\n tratarse con antibi�ticos en casos graves, siendo la ciprofloxacina y la azitromicina opciones altamente eficaces." +
                                                  "\n La ciprofloxacina act�a inhibiendo la replicaci�n bacteriana, mientras que la azitromicina bloquea la producci�n  " +
                                                  "\n de prote�nas esenciales para la supervivencia de la bacteria. En cuanto a la alimentaci�n, es recomendable el consumo" +
                                                  "\n de alimentos ricos en vitamina A y zinc, como zanahorias (por cada 100 gramos, aproximadamente 835 �g de vitamina A, " +
                                                  "\n cubriendo el 93% de la ingesta diaria recomendada para adolescentes) y semillas de calabaza (por cada 100 gramos,    " +
                                                  "\n alrededor de 7.8 mg de zinc, cubriendo el 71% de la ingesta diaria recomendada). Tambi�n se sugiere el consumo de     " +
                                                  "\n pl�tanos, que ayudan a reponer electrolitos y aportan potasio (por cada 100 gramos, aproximadamente 358 mg de potasio," +
                                                  "\n cubriendo el 10% de la ingesta diaria recomendada). Este es solo un diagn�stico predeterminado l�gico, haberlo consultado" +
                                                  "\n no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas," +
                                                  "\n para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado" +
                                                  "\n de su paciente, adem�s por su salud si la respuesta del diagn�stico no le satisface del todo se le recomienda mucho    " +
                                                  "\n consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos cr�nica, Producci�n excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraerEnfermedad pulmonar obstructiva cr�nica (EPOC)." +
                                                  "\n Es fundamental que el adolescente mantenga una hidrataci�n adecuada, consumiendo entre 2.5 y 3 litros de agua al d�a para " +
                                                  "\n ayudar a mantener las v�as respiratorias h�medas y facilitar la expulsi�n de mucosidad. La actividad f�sica debe ser      " +
                                                  "\n moderada y adaptada a su capacidad pulmonar, priorizando ejercicios de bajo impacto como caminatas y respiraci�n controlada." +
                                                  "\n POSIBLE TRATAMIENTO: La EPOC se maneja con broncodilatadores de acci�n prolongada, como el tiotropio y el salmeterol,       " +
                                                  "\n que ayudan a relajar los m�sculos de las v�as respiratorias y mejorar la respiraci�n. Tambi�n pueden utilizarse corticosteroides" +
                                                  "\n inhalados como la fluticasona para reducir la inflamaci�n pulmonar. En cuanto a la alimentaci�n, es recomendable el consumo de  " +
                                                  "\n alimentos ricos en antioxidantes y �cidos grasos Omega-3, como el salm�n (por cada 100 gramos, aproximadamente 2.2 gramos de    " +
                                                  "\n Omega-3, lo que contribuye a la reducci�n de la inflamaci�n pulmonar) y las espinacas (por cada 100 gramos, alrededor de        " +
                                                  "\n 28 mg de vitamina C, cubriendo el 31% de la ingesta diaria recomendada). Tambi�n se sugiere el consumo de frutos secos como     " +
                                                  "\n almendras, que aportan vitamina E (por cada 100 gramos, aproximadamente 25 mg de vitamina E, cubriendo el 166% de la ingesta    " +
                                                  "\n diaria recomendada), lo que ayuda a proteger las c�lulas pulmonares del da�o oxidativo. Este es solo un diagn�stico predeterminado" +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus       " +
                                                  "\n respuestas est�n correctas, para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mejor seguridad    " +
                                                  "\n en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del diagn�stico no le satisface del todo se    " +
                                                  "\n le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");   
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreci�n anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n Es fundamental que el adolescente mantenga una hidrataci�n adecuada, consumiendo entre 2.5 y 3 litros de agua al d�a " +
                                                  "\n para ayudar a su recuperaci�n y prevenir molestias urinarias. La actividad f�sica debe ser moderada y adaptada a su  " +
                                                  "\n estado de salud, evitando esfuerzos excesivos mientras persistan los s�ntomas. POSIBLE TRATAMIENTO: La infecci�n por " +
                                                  "\n Chlamydia trachomatis se trata con antibi�ticos, siendo la azitromicina y la doxiciclina opciones altamente eficaces." +
                                                  "\n La azitromicina se administra en una dosis �nica, mientras que la doxiciclina se toma durante siete d�as para eliminar" +
                                                  "\n la bacteria por completo. En cuanto a la alimentaci�n, es recomendable el consumo de alimentos ricos en vitamina C y  " +
                                                  "\n antioxidantes, como fresas (por cada 100 gramos, aproximadamente 59 mg de vitamina C, cubriendo el 65% de la ingesta  " +
                                                  "\n diaria recomendada) y kiwis (por cada 100 gramos, alrededor de 92 mg de vitamina C, cubriendo el 102% de la ingesta   " +
                                                  "\n diaria recomendada). Tambi�n se sugiere el consumo de yogur natural, que aporta probi�ticos beneficiosos para la salud" +
                                                  "\n intestinal y el sistema inmunol�gico. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza" +
                                                  "\n al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se" +
                                                  "\n recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente," +
                                                  "\n adem�s por su salud si la respuesta del diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, N�useas, Dolor de cabeza severo, Rigidez en el cuello, Confusi�n.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n Es fundamental que el adolescente mantenga una hidrataci�n adecuada, consumiendo entre 2.5 y 3 litros de agua al " +
                                                  "\n d�a para ayudar a su recuperaci�n y prevenir complicaciones derivadas de la fiebre y la inflamaci�n. La actividad" +
                                                  "\n f�sica debe ser m�nima mientras persistan los s�ntomas, priorizando el descanso absoluto. POSIBLE TRATAMIENTO:   " +
                                                  "\n La meningitis bacteriana se trata con antibi�ticos de amplio espectro, siendo la ceftriaxona y la vancomicina    " +
                                                  "\n opciones altamente eficaces. La ceftriaxona act�a inhibiendo la s�ntesis de la pared celular bacteriana, mientras" +
                                                  "\n que la vancomicina bloquea la producci�n de prote�nas esenciales para la supervivencia de la bacteria. En cuanto " +
                                                  "\n a la alimentaci�n, es recomendable el consumo de alimentos ricos en antioxidantes y vitamina C, como fresas (por " +
                                                  "\n cada 100 gramos, aproximadamente 59 mg de vitamina C, cubriendo el 65% de la ingesta diaria recomendada) y kiwis " +
                                                  "\n (por cada 100 gramos, alrededor de 92 mg de vitamina C, cubriendo el 102% de la ingesta diaria recomendada).     " +
                                                  "\n Tambi�n se sugiere el consumo de almendras, que aportan vitamina E (por cada 100 gramos, aproximadamente 25 mg de" +
                                                  "\n vitamina E, cubriendo el 166% de la ingesta diaria recomendada), lo que ayuda a proteger las c�lulas del sistema " +
                                                  "\n nervioso del da�o oxidativo. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al" +
                                                  "\n 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello" +
                                                  "\n se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de" +
                                                  "\n su paciente, adem�s por su salud si la respuesta del diagn�stico no le satisface del todo se le recomienda mucho  " +
                                                  "\n consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, P�rdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, P�rdida de apetito.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer C�ncer. " +
                                                  "\n Es fundamental que el adolescente mantenga una hidrataci�n adecuada, consumiendo entre 2.5 y 3 litros de agua al d�a " +
                                                  "\n para ayudar a su recuperaci�n y reducir los efectos secundarios del tratamiento. La actividad f�sica debe ser moderada" +
                                                  "\n y adaptada a su capacidad, priorizando ejercicios de bajo impacto como caminatas y estiramientos para mejorar la      " +
                                                  "\n circulaci�n y reducir la fatiga. POSIBLE TRATAMIENTO: El tratamiento del c�ncer var�a seg�n el tipo y la etapa de     " +
                                                  "\n la enfermedad, pero suele incluir quimioterapia, radioterapia y cirug�a. Entre los medicamentos m�s utilizados est�n  " +
                                                  "\n el metotrexato y el cisplatino, que ayudan a inhibir el crecimiento de c�lulas cancerosas. En cuanto a la alimentaci�n," +
                                                  "\n es recomendable el consumo de alimentos ricos en antioxidantes y vitaminas esenciales para fortalecer el sistema       " +
                                                  "\n inmunol�gico, como ar�ndanos (por cada 100 gramos, aproximadamente 9.7 mg de vitamina C, cubriendo el 11% de la ingesta" +
                                                  "\n diaria recomendada) y espinacas (por cada 100 gramos, alrededor de 28 mg de vitamina C, cubriendo el 31% de la ingesta " +
                                                  "\n diaria recomendada). Tambi�n se sugiere el consumo de frutos secos como almendras, que aportan vitamina E (por cada 100" +
                                                  "\n gramos, aproximadamente 25 mg de vitamina E, cubriendo el 166% de la ingesta diaria recomendada), lo que ayuda a proteger" +
                                                  "\n las c�lulas del da�o oxidativo. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100%" +
                                                  "\n que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda" +
                                                  "\n hacer m�s de un diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por" +
                                                  "\n su salud si la respuesta del diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes" +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            } 
                        }
                        
                        if(EstaturaMasculino.equals("1.65-1.80 m")){
                           if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza (gripe)." +
                                                  "\n Es fundamental que el adolescente mantenga una hidrataci�n adecuada, consumiendo entre 2.5 y 3 litros de agua al d�a para  " +
                                                  "\n ayudar a su recuperaci�n y prevenir la deshidrataci�n causada por la fiebre. La actividad f�sica debe ser moderada y adaptada" +
                                                  "\n a su estado de salud, priorizando ejercicios de bajo impacto como caminatas y estiramientos para mejorar la circulaci�n y    " +
                                                  "\n reducir la fatiga. POSIBLE TRATAMIENTO: La influenza se trata con antivirales como el oseltamivir y el baloxavir, que ayudan " +
                                                  "\n a reducir la duraci�n y gravedad de los s�ntomas. El oseltamivir bloquea la replicaci�n del virus, mientras que el baloxavir " +
                                                  "\n inhibe su capacidad de propagaci�n en el organismo. En cuanto a la alimentaci�n, es recomendable el consumo de alimentos ricos" +
                                                  "\n en vitamina C y antioxidantes, como naranjas (por cada 100 gramos, aproximadamente 53 mg de vitamina C, cubriendo el 59% de la" +
                                                  "\n ingesta diaria recomendada) y fresas (por cada 100 gramos, alrededor de 59 mg de vitamina C, cubriendo el 65% de la ingesta   " +
                                                  "\n diaria recomendada). Tambi�n se sugiere el consumo de jengibre, que posee propiedades antiinflamatorias y ayuda a aliviar la  " +
                                                  "\n congesti�n respiratoria. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el    " +
                                                  "\n paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer    " +
                                                  "\n m�s de un diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud" +
                                                  "\n si la respuesta del diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece" +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                               textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumon�a." +
                                                  "\n Es fundamental que el adolescente mantenga una hidrataci�n adecuada, consumiendo entre 2.5 y 3 litros de agua al d�a para " +
                                                  "\n ayudar a su recuperaci�n y prevenir la deshidrataci�n causada por la fiebre y la dificultad respiratoria. La actividad    " +
                                                  "\n f�sica debe ser m�nima mientras persistan los s�ntomas, priorizando el descanso absoluto y ejercicios de respiraci�n para " +
                                                  "\n mejorar la oxigenaci�n. POSIBLE TRATAMIENTO: La neumon�a bacteriana se trata con antibi�ticos, siendo la amoxicilina y la " +
                                                  "\n azitromicina opciones altamente eficaces. La amoxicilina act�a inhibiendo la s�ntesis de la pared celular bacteriana,     " +
                                                  "\n mientras que la azitromicina bloquea la producci�n de prote�nas esenciales para la supervivencia de la bacteria. Marcas   " +
                                                  "\n reconocidas incluyen Amoxil y Zithromax. En cuanto a la alimentaci�n, es recomendable el consumo de alimentos ricos en    " +
                                                  "\n antioxidantes y vitamina C, como naranjas (por cada 100 gramos, aproximadamente 53 mg de vitamina C, cubriendo el 59% de  " +
                                                  "\n la ingesta diaria recomendada) y fresas (por cada 100 gramos, alrededor de 59 mg de vitamina C, cubriendo el 65% de la    " +
                                                  "\n ingesta diaria recomendada). Tambi�n se sugiere el consumo de jengibre, que posee propiedades antiinflamatorias y ayuda   " +
                                                  "\n a aliviar la congesti�n respiratoria. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza  " +
                                                  "\n al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se  " +
                                                  "\n recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente," +
                                                  "\n adem�s por su salud si la respuesta del diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores."); 
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visi�n borrosa, P�rdida de peso.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n Es fundamental que el adolescente mantenga una hidrataci�n adecuada, consumiendo entre 2.5 y 3 litros de agua al d�a para " +
                                                  "\n ayudar a la regulaci�n de la glucosa y prevenir la deshidrataci�n causada por la hiperglucemia. La actividad f�sica debe  " +
                                                  "\n ser moderada y adaptada a su condici�n, priorizando ejercicios aer�bicos como caminatas, nataci�n o ciclismo durante al   " +
                                                  "\n menos 30 a 60 minutos al d�a para mejorar la sensibilidad a la insulina. POSIBLE TRATAMIENTO: La diabetes se maneja con   " +
                                                  "\n medicamentos como la metformina y la insulina, que ayudan a controlar los niveles de glucosa en sangre. La metformina     " +
                                                  "\n mejora la respuesta del cuerpo a la insulina, mientras que la insulina es esencial para regular la glucosa en pacientes   " +
                                                  "\n con diabetes tipo 1 o casos avanzados de tipo 2. Marcas reconocidas incluyen Glucophage y Lantus. En cuanto a la alimentaci�n," +
                                                  "\n es recomendable el consumo de alimentos ricos en fibra y antioxidantes, como avena (por cada 100 gramos, aproximadamente   " +
                                                  "\n 10 gramos de fibra, lo que contribuye a la regulaci�n de la glucosa) y almendras (por cada 100 gramos, alrededor de 25 mg  " +
                                                  "\n de vitamina E, cubriendo el 166% de la ingesta diaria recomendada). Tambi�n se sugiere el consumo de fresas, que aportan   " +
                                                  "\n vitamina C (por cada 100 gramos, aproximadamente 59 mg de vitamina C, cubriendo el 65% de la ingesta diaria recomendada)   " +
                                                  "\n y ayudan a reducir la inflamaci�n. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al   " +
                                                  "\n 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se      " +
                                                  "\n recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente," +
                                                  "\n adem�s por su salud si la respuesta del diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico,  " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresi�n en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma. " +
                                                  "\n Es fundamental que el adolescente mantenga una hidrataci�n adecuada, consumiendo entre 2.5 y 3 litros de agua al d�a para " +
                                                  "\n ayudar a mantener las v�as respiratorias hidratadas y reducir la inflamaci�n. La actividad f�sica debe ser moderada y     " +
                                                  "\n adaptada a su capacidad pulmonar, priorizando ejercicios aer�bicos de bajo impacto como caminatas, nataci�n o ciclismo    " +
                                                  "\n durante al menos 30 a 60 minutos al d�a, evitando factores desencadenantes como el aire fr�o o la contaminaci�n.          " +
                                                  "\n POSIBLE TRATAMIENTO: El asma se maneja con broncodilatadores de alivio r�pido como el salbutamol y corticosteroides inhalados" +
                                                  "\n como la fluticasona, que ayudan a reducir la inflamaci�n y mejorar la respiraci�n. Marcas reconocidas incluyen Ventolin y    " +
                                                  "\n Flixotide. En cuanto a la alimentaci�n, es recomendable el consumo de alimentos ricos en antioxidantes y �cidos grasos Omega-3," +
                                                  "\n como el salm�n (por cada 100 gramos, aproximadamente 2.2 gramos de Omega-3, lo que contribuye a la reducci�n de la inflamaci�n" +
                                                  "\n pulmonar) y las espinacas (por cada 100 gramos, alrededor de 28 mg de vitamina C, cubriendo el 31% de la ingesta diaria recomendada)." +
                                                  "\n Tambi�n se sugiere el consumo de c�rcuma, que posee propiedades antiinflamatorias y ayuda a mejorar la funci�n pulmonar. Este  " +
                                                  "\n es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que" +
                                                  "\n por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para    " +
                                                  "\n establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del diagn�stico no    " +
                                                  "\n le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera" +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, P�rdida de peso, Ganglios linf�ticos inflamados, Erupci�n cut�nea (Diarrea).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n Es fundamental que el adolescente mantenga una hidrataci�n adecuada, consumiendo entre 2.5 y 3 litros de agua al d�a para   " +
                                                  "\n ayudar a su recuperaci�n y reducir los efectos secundarios del tratamiento. La actividad f�sica debe ser moderada y adaptada" +
                                                  "\n a su capacidad, priorizando ejercicios aer�bicos de bajo impacto como caminatas y estiramientos para mejorar la circulaci�n " +
                                                  "\n y fortalecer el sistema inmunol�gico. POSIBLE TRATAMIENTO: El VIH se maneja con terapia antirretroviral (TAR), siendo el    " +
                                                  "\n tenofovir y el dolutegravir opciones altamente eficaces para suprimir la replicaci�n del virus y mejorar la calidad de vida " +
                                                  "\n del paciente. Marcas reconocidas incluyen Truvada y Tivicay. En cuanto a la alimentaci�n, es recomendable el consumo de     " +
                                                  "\n alimentos ricos en antioxidantes y vitaminas esenciales para fortalecer el sistema inmunol�gico, como espinacas (por cada   " +
                                                  "\n 100 gramos, aproximadamente 28 mg de vitamina C, cubriendo el 31% de la ingesta diaria recomendada) y almendras (por cada   " +
                                                  "\n 100 gramos, aproximadamente 25 mg de vitamina E, cubriendo el 166% de la ingesta diaria recomendada), lo que ayuda a proteger" +
                                                  "\n las c�lulas del da�o oxidativo. Tambi�n se sugiere el consumo de yogur natural, que aporta probi�ticos beneficiosos para la  " +
                                                  "\n salud intestinal y el sistema inmunol�gico. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza" +
                                                  "\n al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se     " +
                                                  "\n recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, " +
                                                  "\n adem�s por su salud si la respuesta del diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico,   " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreci�n anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n Es fundamental que el adolescente mantenga una hidrataci�n adecuada, consumiendo entre 2.5 y 3 litros de agua al d�a, " +
                                                  "\n lo que equivale a aproximadamente 10 a 12 vasos de agua de tama�o regular, para ayudar a la eliminaci�n de toxinas y  " +
                                                  "\n prevenir molestias urinarias. La actividad f�sica debe ser moderada y adaptada a su estado de salud, priorizando      " +
                                                  "\n ejercicios aer�bicos de bajo impacto como caminatas o nataci�n durante al menos 30 a 60 minutos al d�a para mejorar   " +
                                                  "\n la circulaci�n y fortalecer el sistema inmunol�gico. POSIBLE TRATAMIENTO: La infecci�n por Neisseria gonorrhoeae se   " +
                                                  "\n trata con antibi�ticos, siendo la ceftriaxona y la azitromicina opciones altamente eficaces. La ceftriaxona se administra" +
                                                  "\n en una dosis �nica intramuscular, mientras que la azitromicina complementa el tratamiento para eliminar la bacteria por  " +
                                                  "\n completo. Marcas reconocidas incluyen Rocephin y Zithromax. En cuanto a la alimentaci�n, es recomendable el consumo de   " +
                                                  "\n alimentos ricos en antioxidantes y vitamina C, como fresas (por cada 100 gramos, aproximadamente 59 mg de vitamina C,    " +
                                                  "\n cubriendo el 65% de la ingesta diaria recomendada) y kiwis (por cada 100 gramos, alrededor de 92 mg de vitamina C,       " +
                                                  "\n cubriendo el 102% de la ingesta diaria recomendada). Tambi�n se sugiere el consumo de yogur natural, que aporta probi�ticos" +
                                                  "\n beneficiosos para la salud intestinal y el sistema inmunol�gico. Este es solo un diagn�stico predeterminado l�gico,       " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas" +
                                                  "\n est�n correctas, para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mejor seguridad en el     " +
                                                  "\n tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del diagn�stico no le satisface del todo se le   " +
                                                  "\n recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");  
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linf�ticos inflamados, �lceras o llagas dolorosas, Picaz�n o ardor, Dolor al orinar.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n Es fundamental que el adolescente mantenga una hidrataci�n adecuada, consumiendo entre 2.5 y 3 litros de agua al d�a, " +
                                                  "\n lo que equivale a aproximadamente 10 a 12 vasos de agua de tama�o regular, para ayudar a reducir la inflamaci�n y     " +
                                                  "\n prevenir molestias urinarias. La actividad f�sica debe ser moderada y adaptada a su estado de salud, priorizando      " +
                                                  "\n ejercicios aer�bicos de bajo impacto como caminatas o yoga durante al menos 30 a 60 minutos al d�a para fortalecer    " +
                                                  "\n el sistema inmunol�gico sin generar estr�s excesivo en el cuerpo. POSIBLE TRATAMIENTO: El herpes genital se maneja    " +
                                                  "\n con antivirales, siendo el aciclovir y el valaciclovir opciones altamente eficaces para reducir la duraci�n y gravedad" +
                                                  "\n de los brotes. El aciclovir bloquea la replicaci�n del virus, mientras que el valaciclovir prolonga su efecto en el   " +
                                                  "\n organismo. Marcas reconocidas incluyen Zovirax y Valtrex. En cuanto a la alimentaci�n, es recomendable el consumo de  " +
                                                  "\n alimentos ricos en antioxidantes y vitamina C, como fresas (por cada 100 gramos, aproximadamente 59 mg de vitamina C, " +
                                                  "\n cubriendo el 65% de la ingesta diaria recomendada) y kiwis (por cada 100 gramos, alrededor de 92 mg de vitamina C,    " +
                                                  "\n cubriendo el 102% de la ingesta diaria recomendada). Tambi�n se sugiere el consumo de yogur natural, que aporta       " +
                                                  "\n probi�ticos beneficiosos para la salud intestinal y el sistema inmunol�gico. Este es solo un diagn�stico predeterminado" +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y    " +
                                                  "\n sus respuestas est�n correctas, para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mejor   " +
                                                  "\n seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del diagn�stico no le satisface" +
                                                  "\n del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que" +
                                                  "\n te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, �lceras indoloras, Erupci�n cut�nea, Dolor de cabeza, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer S�filis." +
                                                  "\n Es fundamental que el adolescente mantenga una hidrataci�n adecuada, consumiendo entre 2.5 y 3 litros de agua al d�a, " +
                                                  "\n lo que equivale a aproximadamente 10 a 12 vasos de agua de tama�o regular, para ayudar a la eliminaci�n de toxinas y  " +
                                                  "\n prevenir complicaciones derivadas de la infecci�n. La actividad f�sica debe ser moderada y adaptada a su estado de salud," +
                                                  "\n priorizando ejercicios aer�bicos de bajo impacto como caminatas o yoga durante al menos 30 a 60 minutos al d�a para      " +
                                                  "\n fortalecer el sistema inmunol�gico sin generar estr�s excesivo en el cuerpo. POSIBLE TRATAMIENTO: La s�filis se trata    " +
                                                  "\n con antibi�ticos, siendo la penicilina benzatina la opci�n m�s eficaz para eliminar la bacteria. En casos de alergia a   " +
                                                  "\n la penicilina, se pueden utilizar alternativas como la doxiciclina o la azitromicina. Marcas reconocidas incluyen Bicillin" +
                                                  "\n L-A y Doryx. En cuanto a la alimentaci�n, es recomendable el consumo de alimentos ricos en antioxidantes y vitamina C,    " +
                                                  "\n como fresas (por cada 100 gramos, aproximadamente 59 mg de vitamina C, cubriendo el 65% de la ingesta diaria recomendada) " +
                                                  "\n y kiwis (por cada 100 gramos, alrededor de 92 mg de vitamina C, cubriendo el 102% de la ingesta diaria recomendada).      " +
                                                  "\n Tambi�n se sugiere el consumo de yogur natural, que aporta probi�ticos beneficiosos para la salud intestinal y el sistema " +
                                                  "\n inmunol�gico. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente  " +
                                                  "\n tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de  " +
                                                  "\n un diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud  " +
                                                  "\n si la respuesta del diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes     " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, P�rdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n Es fundamental que el adolescente mantenga una hidrataci�n adecuada, consumiendo entre 2.5 y 3 litros de agua al d�a, lo  " +
                                                  "\n que equivale a aproximadamente 10 a 12 vasos de agua de tama�o regular, para ayudar a la eliminaci�n de toxinas y mejorar " +
                                                  "\n la funci�n pulmonar. La actividad f�sica debe ser moderada y adaptada a su capacidad respiratoria, priorizando ejercicios " +
                                                  "\n de bajo impacto como caminatas y respiraci�n controlada durante al menos 30 a 60 minutos al d�a para fortalecer el sistema" +
                                                  "\n inmunol�gico sin generar estr�s excesivo en los pulmones. POSIBLE TRATAMIENTO: La tuberculosis se trata con una combinaci�n" +
                                                  "\n de antibi�ticos de primera l�nea, siendo la isoniazida y la rifampicina opciones altamente eficaces para eliminar la bacteria." +
                                                  "\n La isoniazida bloquea la s�ntesis de la pared celular bacteriana, mientras que la rifampicina inhibe su replicaci�n. Marcas " +
                                                  "\n reconocidas incluyen Rimactane y Laniazid. En cuanto a la alimentaci�n, es recomendable el consumo de alimentos ricos en    " +
                                                  "\n antioxidantes y vitamina A, como zanahorias (por cada 100 gramos, aproximadamente 835 �g de vitamina A, cubriendo el 93% de " +
                                                  "\n la ingesta diaria recomendada) y espinacas (por cada 100 gramos, alrededor de 28 mg de vitamina C, cubriendo el 31% de la   " +
                                                  "\n ingesta diaria recomendada). Tambi�n se sugiere el consumo de almendras, que aportan vitamina E (por cada 100 gramos,       " +
                                                  "\n aproximadamente 25 mg de vitamina E, cubriendo el 166% de la ingesta diaria recomendada), lo que ayuda a proteger las c�lulas" +
                                                  "\n pulmonares del da�o oxidativo. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que" +
                                                  "\n el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer" +
                                                  "\n m�s de un diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud" +
                                                  "\n si la respuesta del diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchaz�n en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n Es fundamental que el adolescente mantenga una hidrataci�n adecuada, consumiendo entre 2.5 y 3 litros de agua al d�a, " +
                                                  "\n lo que equivale a aproximadamente 10 a 12 vasos de agua de tama�o regular, para ayudar a reducir la inflamaci�n y     " +
                                                  "\n mantener la lubricaci�n de las articulaciones. Adem�s, se recomienda el consumo de l�quidos con propiedades           " +
                                                  "\n antiinflamatorias como t� verde y agua con lim�n. La actividad f�sica debe ser moderada y adaptada a su movilidad,    " +
                                                  "\n priorizando ejercicios de bajo impacto como nataci�n, yoga o caminatas durante al menos 30 a 60 minutos al d�a para   " +
                                                  "\n mejorar la flexibilidad y reducir la rigidez articular. POSIBLE TRATAMIENTO: La artritis se maneja con medicamentos   " +
                                                  "\n antiinflamatorios y analg�sicos, siendo el ibuprofeno y el naproxeno opciones altamente eficaces para reducir el dolor" +
                                                  "\n y la inflamaci�n. Marcas reconocidas incluyen Advil y Aleve. En cuanto a la alimentaci�n, es recomendable el consumo  " +
                                                  "\n de alimentos ricos en antioxidantes y �cidos grasos Omega-3, como el salm�n (por cada 100 gramos, aproximadamente     " +
                                                  "\n 2.2 gramos de Omega-3, lo que contribuye a la reducci�n de la inflamaci�n articular) y las espinacas (por cada 100    " +
                                                  "\n gramos, alrededor de 28 mg de vitamina C, cubriendo el 31% de la ingesta diaria recomendada). Tambi�n se sugiere el   " +
                                                  "\n consumo de c�rcuma, que posee propiedades antiinflamatorias y ayuda a mejorar la funci�n articular. Este es solo un   " +
                                                  "\n diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que " +
                                                  "\n por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un diagn�stico de Mi Vida" +
                                                  "\n para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del    " +
                                                  "\n diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita  " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n Es fundamental que el adolescente mantenga una hidrataci�n adecuada, consumiendo entre 2.5 y 3 litros de agua al d�a,  " +
                                                  "\n lo que equivale a aproximadamente 10 a 12 vasos de agua de tama�o regular, para ayudar a aliviar la irritaci�n de las  " +
                                                  "\n v�as respiratorias y prevenir la deshidrataci�n causada por la fiebre y la tos persistente. La actividad f�sica debe   " +
                                                  "\n ser m�nima mientras persistan los s�ntomas, priorizando el descanso absoluto y ejercicios de respiraci�n para mejorar  " +
                                                  "\n la oxigenaci�n. POSIBLE TRATAMIENTO: La tosferina se trata con antibi�ticos, siendo la azitromicina y la claritromicina" +
                                                  "\n opciones altamente eficaces para reducir la duraci�n y gravedad de los s�ntomas. La azitromicina bloquea la replicaci�n" +
                                                  "\n de la bacteria, mientras que la claritromicina ayuda a eliminar la infecci�n de manera progresiva. Marcas reconocidas  " +
                                                  "\n incluyen Zithromax y Biaxin. En cuanto a la alimentaci�n, es recomendable el consumo de alimentos ricos en antioxidantes" +
                                                  "\n y vitamina C, como naranjas (por cada 100 gramos, aproximadamente 53 mg de vitamina C, cubriendo el 59% de la ingesta  " +
                                                  "\n diaria recomendada) y fresas (por cada 100 gramos, alrededor de 59 mg de vitamina C, cubriendo el 65% de la ingesta    " +
                                                  "\n diaria recomendada). Tambi�n se sugiere el consumo de miel, que posee propiedades antimicrobianas y ayuda a calmar la  " +
                                                  "\n irritaci�n de la garganta. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100%  " +
                                                  "\n que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda" +
                                                  "\n hacer m�s de un diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por" +
                                                  "\n su salud si la respuesta del diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes" +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchaz�n de las gl�ndulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n Es fundamental que el adolescente mantenga una hidrataci�n adecuada, consumiendo entre 2.5 y 3 litros de agua al d�a,      " +
                                                  "\n lo que equivale a aproximadamente 10 a 12 vasos de agua de tama�o regular, para ayudar a reducir la inflamaci�n y prevenir " +
                                                  "\n la deshidrataci�n causada por la fiebre. La actividad f�sica debe ser m�nima mientras persistan los s�ntomas, priorizando  " +
                                                  "\n el descanso absoluto y evitando esfuerzos que puedan aumentar la inflamaci�n de las gl�ndulas salivales. POSIBLE TRATAMIENTO:" +
                                                  "\n No existe un tratamiento antiviral espec�fico para las paperas, pero los s�ntomas pueden manejarse con analg�sicos como el   " +
                                                  "\n paracetamol y el ibuprofeno para reducir la fiebre y el dolor. Marcas reconocidas incluyen Tempra y Advil. Tambi�n se recomienda" +
                                                  "\n la aplicaci�n de compresas fr�as o tibias en la zona inflamada para aliviar el malestar. En cuanto a la alimentaci�n, es    " +
                                                  "\n recomendable el consumo de alimentos suaves y ricos en antioxidantes, como pl�tanos (por cada 100 gramos, aproximadamente   " +
                                                  "\n 358 mg de potasio, cubriendo el 10% de la ingesta diaria recomendada) y yogur natural, que aporta probi�ticos beneficiosos  " +
                                                  "\n para la salud intestinal y el sistema inmunol�gico. Tambi�n se sugiere evitar alimentos �cidos como c�tricos y vinagre, ya  " +
                                                  "\n que pueden aumentar la irritaci�n de las gl�ndulas salivales. Este es solo un diagn�stico predeterminado l�gico, haberlo    " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n    " +
                                                  "\n correctas, para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento " +
                                                  "\n adecuado de su paciente, adem�s por su salud si la respuesta del diagn�stico no le satisface del todo se le recomienda mucho" +
                                                  "\n consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupci�n cut�nea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n El Zika requiere una hidrataci�n adecuada, con una ingesta diaria de 3 a 4 litros de agua, equivalentes a 12 a 16 vasos de    " +
                                                  "\n tama�o regular, para prevenir la deshidrataci�n causada por la fiebre y otros s�ntomas. Tambi�n se recomienda el consumo de   " +
                                                  "\n l�quidos con electrolitos naturales, como agua de coco, para mantener el equilibrio de minerales en el cuerpo. La actividad   " +
                                                  "\n f�sica debe ser m�nima mientras persistan los s�ntomas, priorizando el descanso absoluto y ejercicios de respiraci�n para     " +
                                                  "\n mejorar la oxigenaci�n. No existe un tratamiento antiviral espec�fico para el Zika, pero los s�ntomas pueden manejarse con    " +
                                                  "\n analg�sicos como el paracetamol, �til para reducir la fiebre y el dolor muscular. Marcas reconocidas incluyen Tempra y Tylenol." +
                                                  "\n Es importante evitar el uso de aspirina y otros antiinflamatorios no esteroides hasta descartar dengue, ya que pueden aumentar " +
                                                  "\n el riesgo de sangrado. En cuanto a la alimentaci�n, se recomienda el consumo de alimentos ricos en antioxidantes y vitamina C, " +
                                                  "\n esenciales para fortalecer el sistema inmunol�gico. Naranjas (por cada 100 gramos, aproximadamente 53 mg de vitamina C, cubriendo" +
                                                  "\n el 59% de la ingesta diaria recomendada) y fresas (por cada 100 gramos, alrededor de 59 mg de vitamina C, cubriendo el 65% de la " +
                                                  "\n ingesta diaria recomendada) son opciones �ptimas. Tambi�n se sugiere el consumo de jengibre, que posee propiedades antiinflamatorias" +
                                                  "\n y ayuda a aliviar el malestar general. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% " +
                                                  "\n que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente correctas. Para ello, se   " +
                                                  "\n recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente.   " +
                                                  "\n Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico.           " +
                                                  "\n Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, V�mitos, Deshidrataci�n, Dolor abdominal.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n El Rotavirus requiere una hidrataci�n adecuada, con una ingesta diaria de 3.5 a 4.5 litros de agua, equivalentes a 12 a 18 vasos  " +
                                                  "\n de tama�o regular, para prevenir la deshidrataci�n causada por la diarrea y los v�mitos Tambi�n se recomienda el consumo de       " +
                                                  "\n soluciones de rehidrataci�n oral como Pedialyte o Enfalyte, que ayudan a reponer los electrolitos perdidos y mejorar la recuperaci�n" +
                                                  "\n La actividad f�sica debe ser m�nima mientras persistan los s�ntomas, priorizando el descanso absoluto y evitando esfuerzos que    " +
                                                  "\n puedan agravar la p�rdida de l�quidos. No existe un tratamiento antiviral espec�fico para el Rotavirus, pero los s�ntomas pueden  " +
                                                  "\n manejarse con rehidrataci�n constante y monitoreo de la p�rdida de l�quidos En casos graves, puede requerirse administraci�n de   " +
                                                  "\n l�quidos intravenosos en un hospital para evitar complicaciones Marcas reconocidas incluyen Pedialyte y Enfalyte, recomendadas    " +
                                                  "\n para la rehidrataci�n efectiva. En cuanto a la alimentaci�n, se recomienda el consumo de alimentos suaves y ricos en electrolitos," +
                                                  "\n esenciales para fortalecer el sistema digestivo y prevenir la deshidrataci�n Pl�tanos (por cada 100 gramos, aproximadamente 358 mg" +
                                                  "\n de potasio, cubriendo el 10% de la ingesta diaria recomendada) y arroz blanco, que es f�cil de digerir y ayuda a estabilizar el   " +
                                                  "\n sistema digestivo Tambi�n se sugiere el consumo de yogur natural, que aporta probi�ticos beneficiosos para la salud intestinal y la" +
                                                  "\n recuperaci�n. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas sean completamente correctas Para ello, se recomienda hacer m�s de un     " +
                                                  "\n diagn�stico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente Adem�s, por su salud, si la respuesta" +
                                                  "\n del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico Angel L Montes agradece tu visita a la app Mi Vida    " +
                                                  "\n y espera que te mejores");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, N�useas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listerosis. " +
                                                  "\n La Listeriosis requiere una hidrataci�n adecuada con una ingesta diaria de 2.5 a 3 litros de agua, equivalentes a  " +
                                                  "\n 10 a 12 vasos de tama�o regular, para ayudar a la eliminaci�n de toxinas y prevenir complicaciones derivadas de la " +
                                                  "\n infecci�n Tambi�n se recomienda el consumo de l�quidos con propiedades antimicrobianas como agua con lim�n y infusiones " + 
                                                  "\n de jengibre para fortalecer el sistema inmunol�gico La actividad f�sica debe ser m�nima mientras persistan los s�ntomas " +
                                                  "\n priorizando el descanso absoluto y evitando esfuerzos que puedan debilitar el organismo El tratamiento de la Listeriosis" +
                                                  "\n se basa en el uso de antibi�ticos, siendo la ampicilina y la gentamicina opciones altamente eficaces para eliminar la   " +
                                                  "\n bacteria La ampicilina impide la replicaci�n de la bacteria mientras que la gentamicina bloquea la producci�n de prote�nas" +
                                                  "\n esenciales para su supervivencia Marcas reconocidas incluyen Ampex y Garamycin En casos graves se pueden administrar      " +
                                                  "\n corticoides para reducir la inflamaci�n y mejorar la respuesta del organismo En cuanto a la alimentaci�n se recomienda    " +
                                                  "\n el consumo de alimentos ricos en antioxidantes y vitamina C, esenciales para fortalecer el sistema inmunol�gico Espinacas " +
                                                  "\n (por cada 100 gramos aproximadamente 28 mg de vitamina C cubriendo el 31% de la ingesta diaria recomendada) y zanahorias  " +
                                                  "\n (por cada 100 gramos aproximadamente 835 �g de vitamina A cubriendo el 93% de la ingesta diaria recomendada) Tambi�n se   " +
                                                  "\n sugiere el consumo de yogur natural que aporta probi�ticos beneficiosos para la salud intestinal y la recuperaci�n Este   " +
                                                  "\n es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad" +
                                                  "\n y que por ello la enfermedad y sus respuestas sean completamente correctas Para ello se recomienda hacer m�s de un diagn�stico" +
                                                  "\n de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente Adem�s por su salud si la respuesta del " +
                                                  "\n diagn�stico no le satisface del todo se recomienda consultar a su m�dico Angel L Montes agradece tu visita a la app Mi Vida  " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, V�mitos.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis. " +
                                                  "\n La Shigelosis requiere una hidrataci�n adecuada con una ingesta diaria de 3.5 a 4.5 litros de agua, equivalentes a        " +
                                                  "\n 12 a 18 vasos de tama�o regular, para prevenir la deshidrataci�n causada por la diarrea y la fiebre Tambi�n se recomienda " +
                                                  "\n el consumo de soluciones de rehidrataci�n oral como Pedialyte o Enfalyte, que ayudan a reponer los electrolitos perdidos  " +
                                                  "\n y mejorar la recuperaci�n La actividad f�sica debe ser m�nima mientras persistan los s�ntomas priorizando el descanso     " +
                                                  "\n absoluto y evitando esfuerzos que puedan agravar la p�rdida de l�quidos El tratamiento de la Shigelosis se basa en la     " +
                                                  "\n rehidrataci�n constante y en casos graves puede requerirse administraci�n de l�quidos intravenosos en un hospital para    " +
                                                  "\n evitar complicaciones En infecciones severas se pueden utilizar antibi�ticos como ciprofloxacino y azitromicina, que      " +
                                                  "\n ayudan a reducir la duraci�n de la enfermedad Marcas reconocidas incluyen Cipro y Zithromax En cuanto a la alimentaci�n   " +
                                                  "\n se recomienda el consumo de alimentos suaves y ricos en electrolitos, esenciales para fortalecer el sistema digestivo y   " +
                                                  "\n prevenir la deshidrataci�n Pl�tanos (por cada 100 gramos aproximadamente 358 mg de potasio cubriendo el 10% de la ingesta " +
                                                  "\n diaria recomendada) y arroz blanco, que es f�cil de digerir y ayuda a estabilizar el sistema digestivo Tambi�n se sugiere " +
                                                  "\n el consumo de yogur natural, que aporta probi�ticos beneficiosos para la salud intestinal y la recuperaci�n Este es solo  " +
                                                  "\n un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que  " +
                                                  "\n por ello la enfermedad y sus respuestas sean completamente correctas Para ello se recomienda hacer m�s de un diagn�stico  " +
                                                  "\n de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente Adem�s por su salud si la respuesta  " +
                                                  "\n del diagn�stico no le satisface del todo se recomienda consultar a su m�dico Angel L Montes agradece tu visita a la app   " +
                                                  "\n Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos cr�nica, Producci�n excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad Pulmonar Obstructiva Cr�nica (EPOC)." +
                                                  "\n La Enfermedad Pulmonar Obstructiva Cr�nica (EPOC) requiere una hidrataci�n adecuada con una ingesta diaria   " +
                                                  "\n de 2.5 a 3 litros de agua, equivalentes a 10 a 12 vasos de tama�o regular, para ayudar a mantener la funci�n " +
                                                  "\n pulmonar y reducir la inflamaci�n Tambi�n se recomienda el consumo de l�quidos con propiedades antioxidantes " +
                                                  "\n como t� verde y agua con lim�n para mejorar la salud respiratoria La actividad f�sica debe ser moderada y    " +
                                                  "\n adaptada a la capacidad pulmonar priorizando ejercicios de bajo impacto como caminatas, nataci�n y ejercicios" +
                                                  "\n de respiraci�n para fortalecer los m�sculos respiratorios y mejorar la oxigenaci�n El tratamiento de la EPOC " +
                                                  "\n se basa en el uso de broncodilatadores y corticosteroides inhalados, siendo el salbutamol y la fluticasona   " +
                                                  "\n opciones altamente eficaces para mejorar la respiraci�n y reducir la inflamaci�n Marcas reconocidas incluyen " +
                                                  "\n Ventolin y Flixotide En casos avanzados se pueden administrar terapias de ox�geno para mejorar la calidad de " +
                                                  "\n vida del paciente En cuanto a la alimentaci�n se recomienda el consumo de alimentos ricos en antioxidantes y " +
                                                  "\n �cidos grasos Omega-3, esenciales para reducir la inflamaci�n pulmonar Salm�n (por cada 100 gramos aproximadamente" +
                                                  "\n 2.2 gramos de Omega-3) y espinacas (por cada 100 gramos aproximadamente 28 mg de vitamina C, cubriendo el 31%     " +
                                                  "\n de la ingesta diaria recomendada) Tambi�n se sugiere el consumo de c�rcuma, que posee propiedades antiinflamatorias" +
                                                  "\n y ayuda a mejorar la funci�n pulmonar Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no    " +
                                                  "\n garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean         " +
                                                  "\n completamente correctas Para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mayor      " +
                                                  "\n seguridad en el tratamiento adecuado de su paciente Adem�s por su salud si la respuesta del diagn�stico no le     " +
                                                  "\n satisface del todo se recomienda consultar a su m�dico Angel L Montes agradece tu visita a la app Mi Vida y       " +
                                                  "\n espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreci�n anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia. " +
                                                  "\n La Clamidia requiere una hidrataci�n adecuada con una ingesta diaria de 2.5 a 3 litros de agua, equivalentes a   " +
                                                  "\n 10 a 12 vasos de tama�o regular, para ayudar a la eliminaci�n de toxinas y prevenir molestias urinarias Tambi�n  " +
                                                  "\n se recomienda el consumo de l�quidos con propiedades antimicrobianas como agua con lim�n y infusiones de jengibre" +
                                                  "\n para fortalecer el sistema inmunol�gico La actividad f�sica debe ser moderada y adaptada a su estado de salud    " +
                                                  "\n priorizando ejercicios aer�bicos de bajo impacto como caminatas o yoga durante al menos 30 a 60 minutos al d�a   " +
                                                  "\n para fortalecer el sistema inmunol�gico sin generar estr�s excesivo en el cuerpo El tratamiento de la Clamidia   " +
                                                  "\n se basa en el uso de antibi�ticos, siendo la azitromicina y la doxiciclina opciones altamente eficaces para eliminar  " +
                                                  "\n la bacteria La azitromicina se administra en una dosis �nica mientras que la doxiciclina se toma durante varios d�as  " +
                                                  "\n Marcas reconocidas incluyen Zithromax y Doryx En cuanto a la alimentaci�n se recomienda el consumo de alimentos ricos " +
                                                  "\n en antioxidantes y vitamina C, esenciales para fortalecer el sistema inmunol�gico Fresas (por cada 100 gramos         " +
                                                  "\n aproximadamente 59 mg de vitamina C, cubriendo el 65% de la ingesta diaria recomendada) y kiwis (por cada 100 gramos  " +
                                                  "\n aproximadamente 92 mg de vitamina C, cubriendo el 102% de la ingesta diaria recomendada) Tambi�n se sugiere el consumo" +
                                                  "\n de yogur natural, que aporta probi�ticos beneficiosos para la salud intestinal y la recuperaci�n Este es solo un      " +
                                                  "\n diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y     " +
                                                  "\n que por ello la enfermedad y sus respuestas sean completamente correctas Para ello se recomienda hacer m�s de un      " +
                                                  "\n diagn�stico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente Adem�s por su salud  " +
                                                  "\n si la respuesta del diagn�stico no le satisface del todo se recomienda consultar a su m�dico Angel L Montes agradece  " +
                                                  "\n tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, N�useas, Dolor de cabeza severo, Rigidez en el cuello, Confusi�n.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n La Meningitis bacteriana requiere una hidrataci�n adecuada con una ingesta diaria de 3.5 a 4.5 litros de agua,  " +
                                                  "\n equivalentes a 12 a 18 vasos de tama�o regular, para prevenir la deshidrataci�n causada por la fiebre intensa   " +
                                                  "\n y la inflamaci�n de las meninges Tambi�n se recomienda el consumo de soluciones de rehidrataci�n oral como      " +
                                                  "\n Pedialyte o Enfalyte, que ayudan a reponer los electrolitos perdidos y mejorar la recuperaci�n La actividad     " +
                                                  "\n f�sica debe ser m�nima mientras persistan los s�ntomas priorizando el descanso absoluto y evitando esfuerzos    " +
                                                  "\n que puedan agravar la inflamaci�n cerebral El tratamiento de la Meningitis bacteriana se basa en el uso de      " +
                                                  "\n antibi�ticos intravenosos, siendo la ceftriaxona y la vancomicina opciones altamente eficaces para eliminar     " +
                                                  "\n la infecci�n y reducir la inflamaci�n Marcas reconocidas incluyen Rocephin y Vancocin En casos graves se pueden " +
                                                  "\n administrar corticoides para reducir la inflamaci�n y mejorar la respuesta del organismo En cuanto a la alimentaci�n " +
                                                  "\n se recomienda el consumo de alimentos ricos en antioxidantes y vitamina C, esenciales para fortalecer el sistema     " +
                                                  "\n inmunol�gico Espinacas (por cada 100 gramos aproximadamente 28 mg de vitamina C, cubriendo el 31% de la ingesta      " +
                                                  "\n diaria recomendada) y zanahorias (por cada 100 gramos aproximadamente 835 �g de vitamina A, cubriendo el 93% de      " +
                                                  "\n la ingesta diaria recomendada) Tambi�n se sugiere el consumo de yogur natural, que aporta probi�ticos beneficiosos   " +
                                                  "\n para la salud intestinal y la recuperaci�n Este es solo un diagn�stico predeterminado l�gico, haberlo consultado     " +
                                                  "\n no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente " +
                                                  "\n correctas Para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mayor seguridad en el tratamiento " +
                                                  "\n adecuado de su paciente Adem�s por su salud si la respuesta del diagn�stico no le satisface del todo se recomienda consultar" +
                                                  "\n a su m�dico Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, P�rdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, P�rdida de apetito.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer C�ncer." +
                                                  "\n El C�ncer requiere una hidrataci�n adecuada con una ingesta diaria de 3 a 4 litros de agua, equivalentes a 12 a 16 vasos    " +
                                                  "\n de tama�o regular, para ayudar a mantener la funci�n celular y reducir los efectos secundarios del tratamiento Tambi�n se   " +
                                                  "\n recomienda el consumo de l�quidos con propiedades antioxidantes como t� verde y agua con lim�n para fortalecer el sistema   " +
                                                  "\n inmunol�gico La actividad f�sica debe ser moderada y adaptada a la capacidad del paciente priorizando ejercicios de bajo    " +
                                                  "\n impacto como caminatas, yoga y ejercicios de respiraci�n para mejorar la circulaci�n y reducir la fatiga El tratamiento     " +
                                                  "\n del C�ncer var�a seg�n el tipo y la etapa de la enfermedad pero puede incluir quimioterapia, radioterapia, cirug�a y terapias" +
                                                  "\n dirigidas siendo la doxorrubicina y el paclitaxel opciones comunes en ciertos tipos de c�ncer Marcas reconocidas incluyen   " +
                                                  "\n Adriamycin y Taxol En algunos casos se pueden administrar inmunoterapias para mejorar la respuesta del organismo En cuanto  " +
                                                  "\n a la alimentaci�n se recomienda el consumo de alimentos ricos en antioxidantes y prote�nas, esenciales para fortalecer el   " +
                                                  "\n sistema inmunol�gico y mantener la energ�a Espinacas (por cada 100 gramos aproximadamente 28 mg de vitamina C, cubriendo el " +
                                                  "\n 31% de la ingesta diaria recomendada) y zanahorias (por cada 100 gramos aproximadamente 835 �g de vitamina A, cubriendo el  " +
                                                  "\n 93% de la ingesta diaria recomendada) Tambi�n se sugiere el consumo de yogur natural, que aporta probi�ticos beneficiosos   " +
                                                  "\n para la salud intestinal y la recuperaci�n Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza" +
                                                  "\n al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente correctas Para " +
                                                  "\n ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su   " +
                                                  "\n paciente Adem�s por su salud si la respuesta del diagn�stico no le satisface del todo se recomienda consultar a su m�dico    " +
                                                  "\n Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            } 
                        }
                        if(EstaturaMasculino.equals("1.55-1.70 m")){
                           if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza (gripe)." +
                                                  "\n La Influenza (gripe) requiere una hidrataci�n adecuada con una ingesta diaria de 3.5 a 4.5 litros de agua, equivalentes     " +
                                                  "\n a 12 a 18 vasos de tama�o regular, para prevenir la deshidrataci�n causada por la fiebre intensa y la sudoraci�n Tambi�n    " +
                                                  "\n se recomienda el consumo de soluciones de rehidrataci�n oral como Pedialyte o Enfalyte, que ayudan a reponer los electrolitos" +
                                                  "\n perdidos y mejorar la recuperaci�n La actividad f�sica debe ser m�nima mientras persistan los s�ntomas priorizando el descanso" +
                                                  "\n absoluto y evitando esfuerzos que puedan agravar la fatiga El tratamiento de la Influenza se basa en el uso de antivirales,  " +
                                                  "\n siendo el oseltamivir y el baloxavir opciones altamente eficaces para reducir la duraci�n y gravedad de la enfermedad Marcas " +
                                                  "\n reconocidas incluyen Tamiflu y Xofluza En casos graves se pueden administrar antipir�ticos como paracetamol para controlar la" +
                                                  "\n fiebre y mejorar el bienestar del paciente En cuanto a la alimentaci�n se recomienda el consumo de alimentos ricos en antioxidantes" +
                                                  "\n y vitamina C, esenciales para fortalecer el sistema inmunol�gico Naranjas (por cada 100 gramos aproximadamente 53 mg de vitamina C," +
                                                  "\n cubriendo el 59% de la ingesta diaria recomendada) y fresas (por cada 100 gramos aproximadamente 59 mg de vitamina C, cubriendo    " +
                                                  "\n el 65% de la ingesta diaria recomendada) Tambi�n se sugiere el consumo de jengibre, que posee propiedades antiinflamatorias y      " +
                                                  "\n ayuda a aliviar el malestar general Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100%     " +
                                                  "\n que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente correctas Para ello se       " +
                                                  "\n recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente        " +
                                                  "\n Adem�s por su salud si la respuesta del diagn�stico no le satisface del todo se recomienda consultar a su m�dico Angel L Montes    " +
                                                  "\n agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                               textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumon�a." +
                                                  "\n La Neumon�a requiere una hidrataci�n adecuada con una ingesta diaria de 3.5 a 4.5 litros de agua, equivalentes a 12 a 18 vasos   " +
                                                  "\n de tama�o regular, para prevenir la deshidrataci�n causada por la fiebre intensa y la dificultad respiratoria Tambi�n se         " +
                                                  "\n recomienda el consumo de soluciones de rehidrataci�n oral como Pedialyte o Enfalyte, que ayudan a reponer los electrolitos       " +
                                                  "\n perdidos y mejorar la recuperaci�n La actividad f�sica debe ser m�nima mientras persistan los s�ntomas priorizando el descanso   " +
                                                  "\n absoluto y evitando esfuerzos que puedan agravar la fatiga respiratoria El tratamiento de la Neumon�a se basa en el uso de       " +
                                                  "\n antibi�ticos, siendo la amoxicilina y la azitromicina opciones altamente eficaces para eliminar la infecci�n y reducir la        " +
                                                  "\n inflamaci�n pulmonar Marcas reconocidas incluyen Amoxil y Zithromax En casos graves se pueden administrar terapias de ox�geno    " +
                                                  "\n para mejorar la oxigenaci�n del paciente En cuanto a la alimentaci�n se recomienda el consumo de alimentos ricos en antioxidantes" +
                                                  "\n y vitamina C, esenciales para fortalecer el sistema inmunol�gico Naranjas (por cada 100 gramos aproximadamente 53 mg de vitamina C," +
                                                  "\n cubriendo el 59% de la ingesta diaria recomendada) y fresas (por cada 100 gramos aproximadamente 59 mg de vitamina C, cubriendo el " +
                                                  "\n 65% de la ingesta diaria recomendada) Tambi�n se sugiere el consumo de jengibre, que posee propiedades antiinflamatorias y ayuda " +
                                                  "\n a aliviar la congesti�n pulmonar Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el" +
                                                  "\n paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente correctas Para ello se recomienda  " +
                                                  "\n hacer m�s de un diagn�stico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente Adem�s por su    " +
                                                  "\n salud si la respuesta del diagn�stico no le satisface del todo se recomienda consultar a su m�dico Angel L Montes agradece tu     " +
                                                  "\n visita a la app Mi Vida y espera que te mejores."); 
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visi�n borrosa, P�rdida de peso.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n La Diabetes requiere una hidrataci�n adecuada con una ingesta diaria de 2.5 a 3.5 litros de agua, equivalentes a 10 a 14 vasos   " +
                                                  "\n de tama�o regular, para ayudar a mantener el equilibrio de glucosa en sangre y prevenir la deshidrataci�n causada por la micci�n " +
                                                  "\n frecuente Tambi�n se recomienda el consumo de infusiones sin az�car y agua con lim�n, que contribuyen a la regulaci�n metab�lica " +
                                                  "\n La actividad f�sica debe ser moderada y adaptada a la capacidad del paciente priorizando ejercicios aer�bicos como caminatas,    " +
                                                  "\n ciclismo y nataci�n durante al menos 30 a 60 minutos al d�a, lo que ayuda a mejorar la sensibilidad a la insulina y controlar    " +
                                                  "\n los niveles de glucosa El tratamiento de la Diabetes var�a seg�n el tipo pero puede incluir insulina en el caso de diabetes      " +
                                                  "\n tipo 1 y medicamentos orales como la metformina en el caso de diabetes tipo 2 Marcas reconocidas incluyen Humalog, Lantus y      " +
                                                  "\n Glucophage En algunos casos se pueden administrar inhibidores de SGLT2 para mejorar la eliminaci�n de glucosa a trav�s de la     " +
                                                  "\n orina En cuanto a la alimentaci�n se recomienda el consumo de alimentos ricos en fibra y prote�nas, esenciales para estabilizar  " +
                                                  "\n los niveles de glucosa en sangre Avena (por cada 100 gramos aproximadamente 10 gramos de fibra, cubriendo el 40% de la ingesta   " +
                                                  "\n diaria recomendada) y almendras (por cada 100 gramos aproximadamente 25 mg de vitamina E, cubriendo el 166% de la ingesta diaria " +
                                                  "\n recomendada) Tambi�n se sugiere el consumo de yogur natural, que aporta probi�ticos beneficiosos para la salud intestinal y la   " +
                                                  "\n regulaci�n metab�lica Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente " +
                                                  "\n tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente correctas Para ello se recomienda hacer m�s" +
                                                  "\n de un diagn�stico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente Adem�s por su salud si la " +
                                                  "\n respuesta del diagn�stico no le satisface del todo se recomienda consultar a su m�dico Angel L Montes agradece tu visita a la app" +
                                                  "\n Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresi�n en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n El Asma requiere una hidrataci�n adecuada con una ingesta diaria de 2.5 a 3.5 litros de agua, equivalentes a 10 a 14 vasos     " +
                                                  "\n de tama�o regular, para ayudar a mantener la funci�n pulmonar y reducir la inflamaci�n Tambi�n se recomienda el consumo de     " +
                                                  "\n l�quidos con propiedades antioxidantes como t� verde y agua con lim�n para mejorar la salud respiratoria La actividad f�sica   " +
                                                  "\n debe ser moderada y adaptada a la capacidad pulmonar priorizando ejercicios de bajo impacto como caminatas, nataci�n y ejercicios" +
                                                  "\n de respiraci�n para fortalecer los m�sculos respiratorios y mejorar la oxigenaci�n El tratamiento del Asma se basa en el uso de  " +
                                                  "\n broncodilatadores y corticosteroides inhalados, siendo el salbutamol y la fluticasona opciones altamente eficaces para mejorar   " +
                                                  "\n la respiraci�n y reducir la inflamaci�n Marcas reconocidas incluyen Ventolin y Flixotide En casos avanzados se pueden administrar" +
                                                  "\n terapias de ox�geno para mejorar la calidad de vida del paciente En cuanto a la alimentaci�n se recomienda el consumo de alimentos" +
                                                  "\n ricos en antioxidantes y �cidos grasos Omega-3, esenciales para reducir la inflamaci�n pulmonar Salm�n (por cada 100 gramos       " +
                                                  "\n aproximadamente 2.2 gramos de Omega-3) y espinacas (por cada 100 gramos aproximadamente 28 mg de vitamina C, cubriendo el 31%     " +
                                                  "\n de la ingesta diaria recomendada) Tambi�n se sugiere el consumo de c�rcuma, que posee propiedades antiinflamatorias y ayuda a     " +
                                                  "\n mejorar la funci�n pulmonar Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el     " +
                                                  "\n paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente correctas Para ello se recomienda  " +
                                                  "\n hacer m�s de un diagn�stico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente Adem�s por su    " +
                                                  "\n salud si la respuesta del diagn�stico no le satisface del todo se recomienda consultar a su m�dico Angel L Montes agradece tu     " +
                                                  "\n visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, P�rdida de peso, Ganglios linf�ticos inflamados, Erupci�n cut�nea (Diarrea).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n El VIH/SIDA requiere una hidrataci�n adecuada con una ingesta diaria de 3 a 4 litros de agua, equivalentes a 12 a 16 vasos  " +
                                                  "\n de tama�o regular, para ayudar a mantener la funci�n inmunol�gica y prevenir la deshidrataci�n causada por fiebre y efectos " +
                                                  "\n secundarios del tratamiento Tambi�n se recomienda el consumo de l�quidos con propiedades antioxidantes como t� verde y agua " +
                                                  "\n con lim�n para fortalecer el sistema inmunol�gico La actividad f�sica debe ser moderada y adaptada a la capacidad del paciente" +
                                                  "\n priorizando ejercicios de bajo impacto como caminatas, yoga y ejercicios de respiraci�n para mejorar la circulaci�n y reducir " +
                                                  "\n la fatiga El tratamiento del VIH/SIDA se basa en el uso de antirretrovirales, siendo el tenofovir, emtricitabina y dolutegravir" +
                                                  "\n opciones altamente eficaces para controlar la replicaci�n del virus y mejorar la calidad de vida Marcas reconocidas incluyen   " +
                                                  "\n Truvada, Tivicay y Biktarvy En algunos casos se pueden administrar terapias inmunomoduladoras para mejorar la respuesta del    " +
                                                  "\n organismo. En cuanto a la alimentaci�n se recomienda el consumo de alimentos ricos en antioxidantes y prote�nas, esenciales    " +
                                                  "\n para fortalecer el sistema inmunol�gico y mantener la energ�a Espinacas (por cada 100 gramos aproximadamente 28 mg de vitamina C," +
                                                  "\n cubriendo el 31% de la ingesta diaria recomendada) y zanahorias (por cada 100 gramos aproximadamente 835 �g de vitamina A,      " +
                                                  "\n cubriendo el 93% de la ingesta diaria recomendada) Tambi�n se sugiere el consumo de yogur natural, que aporta probi�ticos       " +
                                                  "\n beneficiosos para la salud intestinal y la recuperaci�n Este es solo un diagn�stico predeterminado l�gico, haberlo consultado   " +
                                                  "\n no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente      " +
                                                  "\n correctas Para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mayor seguridad en el tratamiento      " +
                                                  "\n adecuado de su paciente Adem�s por su salud si la respuesta del diagn�stico no le satisface del todo se recomienda consultar    " +
                                                  "\n a su m�dico Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreci�n anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n La Gonorrea requiere una hidrataci�n adecuada con una ingesta diaria de 2.5 a 3 litros de agua, equivalentes a 10 a 12 vasos  " +
                                                  "\n de tama�o regular, para ayudar a la eliminaci�n de toxinas y prevenir molestias urinarias Tambi�n se recomienda el consumo de " +
                                                  "\n l�quidos con propiedades antimicrobianas como agua con lim�n y infusiones de jengibre para fortalecer el sistema inmunol�gico " +
                                                  "\n La actividad f�sica debe ser moderada y adaptada a su estado de salud priorizando ejercicios aer�bicos de bajo impacto como   " +
                                                  "\n caminatas o yoga durante al menos 30 a 60 minutos al d�a para fortalecer el sistema inmunol�gico sin generar estr�s excesivo  " +
                                                  "\n en el cuerpo El tratamiento de la Gonorrea se basa en el uso de antibi�ticos, siendo la ceftriaxona y la azitromicina opciones" +
                                                  "\n altamente eficaces para eliminar la bacteria La ceftriaxona se administra en una dosis �nica mientras que la azitromicina     " +
                                                  "\n complementa el tratamiento para evitar resistencia bacteriana Marcas reconocidas incluyen Rocephin y Zithromax En cuanto a la " +
                                                  "\n alimentaci�n se recomienda el consumo de alimentos ricos en antioxidantes y vitamina C, esenciales para fortalecer el sistema " +
                                                  "\n inmunol�gico Fresas (por cada 100 gramos aproximadamente 59 mg de vitamina C, cubriendo el 65% de la ingesta diaria recomendada)" +
                                                  "\n y kiwis (por cada 100 gramos aproximadamente 92 mg de vitamina C, cubriendo el 102% de la ingesta diaria recomendada) Tambi�n se" +
                                                  "\n sugiere el consumo de yogur natural, que aporta probi�ticos beneficiosos para la salud intestinal y la recuperaci�n Este es solo" +
                                                  "\n un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello" +
                                                  "\n la enfermedad y sus respuestas sean completamente correctas Para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para  " +
                                                  "\n establecer mayor seguridad en el tratamiento adecuado de su paciente Adem�s por su salud si la respuesta del diagn�stico no le   " +
                                                  "\n satisface del todo se recomienda consultar a su m�dico Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linf�ticos inflamados, �lceras o llagas dolorosas, Picaz�n o ardor, Dolor al orinar.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes." +
                                                  "\n El Herpes genital requiere una hidrataci�n adecuada con una ingesta diaria de 2.5 a 3 litros de agua, equivalentes a 10 a 12 vasos " +
                                                  "\n de tama�o regular, para ayudar a mantener la funci�n inmunol�gica y reducir la inflamaci�n Tambi�n se recomienda el consumo de     " +
                                                  "\n l�quidos con propiedades antivirales como t� verde y agua con lim�n para fortalecer el sistema inmunol�gico La actividad f�sica    " +
                                                  "\n debe ser moderada y adaptada a la capacidad del paciente priorizando ejercicios de bajo impacto como caminatas, yoga y ejercicios  " +
                                                  "\n de respiraci�n para mejorar la circulaci�n y reducir el estr�s El tratamiento del Herpes genital se basa en el uso de antivirales, " +
                                                  "\n siendo el aciclovir, valaciclovir y famciclovir opciones altamente eficaces para reducir la duraci�n y gravedad de los brotes Marcas" +
                                                  "\n reconocidas incluyen Zovirax, Valtrex y Famvir En algunos casos se pueden administrar terapias inmunomoduladoras para mejorar la    " +
                                                  "\n respuesta del organismo En cuanto a la alimentaci�n se recomienda el consumo de alimentos ricos en antioxidantes y vitamina C,      " +
                                                  "\n esenciales para fortalecer el sistema inmunol�gico Fresas (por cada 100 gramos aproximadamente 59 mg de vitamina C, cubriendo el    " +
                                                  "\n 65% de la ingesta diaria recomendada) y kiwis (por cada 100 gramos aproximadamente 92 mg de vitamina C, cubriendo el 102% de la     " +
                                                  "\n ingesta diaria recomendada) Tambi�n se sugiere el consumo de yogur natural, que aporta probi�ticos beneficiosos para la salud       " +
                                                  "\n intestinal y la recuperaci�n Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el      " +
                                                  "\n paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente correctas Para ello se recomienda    " +
                                                  "\n hacer m�s de un diagn�stico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente Adem�s por su salud" +
                                                  "\n si la respuesta del diagn�stico no le satisface del todo se recomienda consultar a su m�dico Angel L Montes agradece tu visita      " +
                                                  "\n a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, �lceras indoloras, Erupci�n cut�nea, Dolor de cabeza, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer S�filis." +
                                                  "\n La S�filis requiere una hidrataci�n adecuada con una ingesta diaria de 2.5 a 3 litros de agua, equivalentes a 10 a 12 vasos    " +
                                                  "\n de tama�o regular, para ayudar a la eliminaci�n de toxinas y prevenir complicaciones derivadas de la infecci�n Tambi�n se      " +
                                                  "\n recomienda el consumo de l�quidos con propiedades antimicrobianas como agua con lim�n y infusiones de jengibre para fortalecer " +
                                                  "\n el sistema inmunol�gico La actividad f�sica debe ser moderada y adaptada a su estado de salud priorizando ejercicios aer�bicos " +
                                                  "\n de bajo impacto como caminatas o yoga durante al menos 30 a 60 minutos al d�a para fortalecer el sistema inmunol�gico sin generar " +
                                                  "\n estr�s excesivo en el cuerpo El tratamiento de la S�filis se basa en el uso de antibi�ticos, siendo la penicilina benzatina la    " +
                                                  "\n opci�n m�s eficaz para eliminar la bacteria En casos de alergia a la penicilina se pueden utilizar alternativas como doxiciclina  " +
                                                  "\n o azitromicina Marcas reconocidas incluyen Bicillin L-A y Doryx En cuanto a la alimentaci�n se recomienda el consumo de alimentos " +
                                                  "\n ricos en antioxidantes y vitamina C, esenciales para fortalecer el sistema inmunol�gico Fresas (por cada 100 gramos aproximadamente" +
                                                  "\n 59 mg de vitamina C, cubriendo el 65% de la ingesta diaria recomendada) y kiwis (por cada 100 gramos aproximadamente 92 mg de      " +
                                                  "\n vitamina C, cubriendo el 102% de la ingesta diaria recomendada) Tambi�n se sugiere el consumo de yogur natural, que aporta probi�ticos" +
                                                  "\n beneficiosos para la salud intestinal y la recuperaci�n Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no    " +
                                                  "\n garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente correctas   " +
                                                  "\n Para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su     " +
                                                  "\n paciente Adem�s por su salud si la respuesta del diagn�stico no le satisface del todo se recomienda consultar a su m�dico Angel     " +
                                                  "\n L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, P�rdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n La Tuberculosis (TB) requiere una hidrataci�n adecuada con una ingesta diaria de 3.5 a 4.5 litros de agua, equivalentes       " +
                                                  "\n a 12 a 18 vasos de tama�o regular, para prevenir la deshidrataci�n causada por la fiebre intensa y la sudoraci�n.             " +
                                                  "\n Tambi�n se recomienda el consumo de soluciones de rehidrataci�n oral como Pedialyte o Enfalyte, que ayudan a reponer          " +
                                                  "\n los electrolitos perdidos y mejorar la recuperaci�n La actividad f�sica debe ser m�nima mientras persistan los s�ntomas       " +
                                                  "\n priorizando el descanso absoluto y evitando esfuerzos que puedan agravar la fatiga respiratoria El tratamiento de la          " +
                                                  "\n Tuberculosis se basa en el uso de antibi�ticos de primera l�nea, siendo la isoniazida, rifampicina, pirazinamida y etambutol  " +
                                                  "\n opciones altamente eficaces para eliminar la infecci�n y reducir la inflamaci�n pulmonar Marcas reconocidas incluyen Rifadin  " +
                                                  "\n y Myambutol En casos graves se pueden administrar terapias de ox�geno para mejorar la oxigenaci�n del paciente En cuanto a la " +
                                                  "\n alimentaci�n se recomienda el consumo de alimentos ricos en antioxidantes y vitamina C, esenciales para fortalecer el sistema " +
                                                  "\n inmunol�gico Naranjas (por cada 100 gramos aproximadamente 53 mg de vitamina C, cubriendo el 59% de la ingesta diaria recomendada)" +
                                                  "\n y fresas (por cada 100 gramos aproximadamente 59 mg de vitamina C, cubriendo el 65% de la ingesta diaria recomendada) Tambi�n se" +
                                                  "\n sugiere el consumo de jengibre, que posee propiedades antiinflamatorias y ayuda a aliviar la congesti�n pulmonar Este es solo   " +
                                                  "\n un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por    " +
                                                  "\n ello la enfermedad y sus respuestas sean completamente correctas Para ello se recomienda hacer m�s de un diagn�stico de Mi Vida " +
                                                  "\n para establecer mayor seguridad en el tratamiento adecuado de su paciente Adem�s por su salud si la respuesta del diagn�stico no" +
                                                  "\n le satisface del todo se recomienda consultar a su m�dico Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchaz�n en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n La Artritis requiere una hidrataci�n adecuada con una ingesta diaria de 2.5 a 3.5 litros de agua, equivalentes a 10 a 14 vasos  " +
                                                  "\n de tama�o regular, para ayudar a reducir la inflamaci�n y mantener la movilidad articular Tambi�n se recomienda el consumo de   " +
                                                  "\n l�quidos con propiedades antiinflamatorias como t� verde y agua con c�rcuma para fortalecer el sistema inmunol�gico La actividad" +
                                                  "\n f�sica debe ser moderada y adaptada a la capacidad del paciente priorizando ejercicios de bajo impacto como nataci�n, yoga y    " +
                                                  "\n ejercicios de movilidad articular para mejorar la flexibilidad y reducir el dolor El tratamiento de la Artritis se basa en el   " +
                                                  "\n uso de antiinflamatorios no esteroides (AINEs) y f�rmacos modificadores de la enfermedad (FAMEs) siendo el ibuprofeno, naproxeno," +
                                                  "\n metotrexato y adalimumab opciones altamente eficaces para reducir la inflamaci�n y mejorar la calidad de vida Marcas reconocidas " +
                                                  "\n incluyen Advil, Naprosyn, Trexall y Humira En algunos casos se pueden administrar terapias biol�gicas para mejorar la respuesta  " +
                                                  "\n del organismo En cuanto a la alimentaci�n se recomienda el consumo de alimentos ricos en antioxidantes y �cidos grasos Omega-3,  " +
                                                  "\n esenciales para reducir la inflamaci�n articular Salm�n (por cada 100 gramos aproximadamente 2.2 gramos de Omega-3) y espinacas  " +
                                                  "\n (por cada 100 gramos aproximadamente 28 mg de vitamina C, cubriendo el 31% de la ingesta diaria recomendada) Tambi�n se sugiere  " +
                                                  "\n el consumo de c�rcuma, que posee propiedades antiinflamatorias y ayuda a mejorar la funci�n articular Este es solo un diagn�stico" +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad " +
                                                  "\n y sus respuestas sean completamente correctas Para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mayor" +
                                                  "\n seguridad en el tratamiento adecuado de su paciente Adem�s por su salud si la respuesta del diagn�stico no le satisface del todo " +
                                                  "\n se recomienda consultar a su m�dico Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n La Tosferina requiere una hidrataci�n adecuada con una ingesta diaria de 3 a 4 litros de agua, equivalentes a 12 a 16 vasos  " +
                                                  "\n de tama�o regular, para ayudar a mantener la funci�n pulmonar y reducir la inflamaci�n Tambi�n se recomienda el consumo de   " +
                                                  "\n l�quidos con propiedades antimicrobianas como t� verde y agua con miel, que pueden aliviar la irritaci�n de la garganta y    " +
                                                  "\n mejorar la salud respiratoria La actividad f�sica debe ser m�nima mientras persistan los s�ntomas priorizando el descanso    " +
                                                  "\n absoluto y evitando esfuerzos que puedan agravar la tos y la fatiga respiratoria El tratamiento de la Tosferina se basa en   " +
                                                  "\n el uso de antibi�ticos, siendo la azitromicina, claritromicina y eritromicina opciones altamente eficaces para reducir la    " +
                                                  "\n duraci�n y gravedad de la enfermedad Marcas reconocidas incluyen Zithromax, Biaxin y Erythrocin En casos graves se pueden    " +
                                                  "\n administrar terapias de ox�geno para mejorar la oxigenaci�n del paciente En cuanto a la alimentaci�n se recomienda el consumo" +
                                                  "\n de alimentos ricos en antioxidantes y vitamina C, esenciales para fortalecer el sistema inmunol�gico Naranjas (por cada 100  " +
                                                  "\n gramos aproximadamente 53 mg de vitamina C, cubriendo el 59% de la ingesta diaria recomendada) y fresas (por cada 100 gramos " +
                                                  "\n aproximadamente 59 mg de vitamina C, cubriendo el 65% de la ingesta diaria recomendada) Tambi�n se sugiere el consumo de     " +
                                                  "\n jengibre, que posee propiedades antiinflamatorias y ayuda a aliviar la congesti�n pulmonar Este es solo un diagn�stico       " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad" +
                                                  "\n y sus respuestas sean completamente correctas Para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer    " +
                                                  "\n mayor seguridad en el tratamiento adecuado de su paciente Adem�s por su salud si la respuesta del diagn�stico no le satisface   " +
                                                  "\n del todo se recomienda consultar a su m�dico Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchaz�n de las gl�ndulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n Las Paperas requieren una hidrataci�n adecuada con una ingesta diaria de 2.5 a 3.5 litros de agua, equivalentes a 10 a 14 vasos   " +
                                                  "\n de tama�o regular, para ayudar a mantener la funci�n inmunol�gica y reducir la inflamaci�n Tambi�n se recomienda el consumo de    " +
                                                  "\n l�quidos con propiedades antiinflamatorias como t� verde y agua con miel, que pueden aliviar la irritaci�n de la garganta y mejorar" +
                                                  "\n la salud general La actividad f�sica debe ser m�nima mientras persistan los s�ntomas priorizando el descanso absoluto y evitando   " +
                                                  "\n esfuerzos que puedan agravar la fatiga y el malestar El tratamiento de las Paperas es principalmente sintom�tico ya que no existe  " +
                                                  "\n un antiviral espec�fico para la enfermedad Se recomienda el uso de analg�sicos como paracetamol o ibuprofeno para reducir la fiebre" +
                                                  "\n y el dolor Marcas reconocidas incluyen Tylenol y Advil En casos de inflamaci�n severa se pueden aplicar compresas fr�as o calientes" +
                                                  "\n en la zona afectada para aliviar el dolor En cuanto a la alimentaci�n se recomienda el consumo de alimentos suaves y ricos en      " +
                                                  "\n antioxidantes, esenciales para fortalecer el sistema inmunol�gico Pl�tanos (por cada 100 gramos aproximadamente 358 mg de potasio, " +
                                                  "\n cubriendo el 10% de la ingesta diaria recomendada) y arroz blanco, que es f�cil de digerir y ayuda a estabilizar el sistema digestivo." + 
                                                  "\n Tambi�n se sugiere el consumo de yogur natural, que aporta probi�ticos beneficiosos para la salud intestinal y la recuperaci�n. Este  " +
                                                  "\n es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por  " +
                                                  "\n  ello la enfermedad y sus respuestas sean completamente correctas Para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para " +
                                                  "\n establecer mayor seguridad en el tratamiento adecuado de su paciente Adem�s por su salud si la respuesta del diagn�stico no le satisface" +
                                                  "\n del todo se recomienda consultar a su m�dico Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupci�n cut�nea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n El Zika requiere una hidrataci�n adecuada con una ingesta diaria de 3 a 4 litros de agua, equivalentes a 12 a 16 vasos de tama�o   " +
                                                  "\n regular, para prevenir la deshidrataci�n causada por la fiebre y otros s�ntomas Tambi�n se recomienda el consumo de l�quidos con   " +
                                                  "\n electrolitos naturales como agua de coco, que ayuda a mantener el equilibrio de minerales en el cuerpo La actividad f�sica debe    " +
                                                  "\n ser m�nima mientras persistan los s�ntomas priorizando el descanso absoluto y ejercicios de respiraci�n para mejorar la oxigenaci�n." +
                                                  "\n El tratamiento del Zika es sintom�tico ya que no existe un antiviral espec�fico Se recomienda el uso de analg�sicos como paracetamol" +
                                                  "\n para reducir la fiebre y el dolor muscular Marcas reconocidas incluyen Tempra y Tylenol Es importante evitar el uso de aspirina y  " +
                                                  "\n otros antiinflamatorios no esteroides hasta descartar dengue para reducir el riesgo de sangrado En cuanto a la alimentaci�n se     " +
                                                  "\n recomienda el consumo de alimentos ricos en antioxidantes y vitamina C, esenciales para fortalecer el sistema inmunol�gico Naranjas" +
                                                  "\n (por cada 100 gramos aproximadamente 53 mg de vitamina C, cubriendo el 59% de la ingesta diaria recomendada) y fresas (por cada 100" +
                                                  "\n gramos aproximadamente 59 mg de vitamina C, cubriendo el 65% de la ingesta diaria recomendada) Tambi�n se sugiere el consumo de    " +
                                                  "\n jengibre, que posee propiedades antiinflamatorias y ayuda a aliviar el malestar general Este es solo un diagn�stico predeterminado " +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas " +
                                                  "\n sean completamente correctas Para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mayor seguridad en el  " +
                                                  "\n tratamiento adecuado de su paciente Adem�s por su salud si la respuesta del diagn�stico no le satisface del todo se recomienda     " +
                                                  "\n consultar a su m�dico Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, V�mitos, Deshidrataci�n, Dolor abdominal.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n El Rotavirus requiere una hidrataci�n adecuada con una ingesta diaria de 3.5 a 4.5 litros de agua, equivalentes a 12 a 18 vasos    " +
                                                  "\n de tama�o regular, para prevenir la deshidrataci�n causada por la diarrea y los v�mitos Tambi�n se recomienda el consumo de        " +
                                                  "\n soluciones de rehidrataci�n oral como Pedialyte o Enfalyte, que ayudan a reponer los electrolitos perdidos y mejorar la recuperaci�n." +
                                                  "\n La actividad f�sica debe ser m�nima mientras persistan los s�ntomas priorizando el descanso absoluto y evitando esfuerzos que puedan" +
                                                  "\n agravar la p�rdida de l�quidos El tratamiento del Rotavirus es sintom�tico ya que no existe un antiviral espec�fico Se recomienda el" +
                                                  "\n uso de rehidrataci�n constante y en casos graves puede requerirse administraci�n de l�quidos intravenosos en un hospital para evitar" +
                                                  "\n complicaciones Marcas reconocidas incluyen Pedialyte y Enfalyte, recomendadas para la rehidrataci�n efectiva En cuanto a la         " +
                                                  "\n alimentaci�n se recomienda el consumo de alimentos suaves y ricos en electrolitos, esenciales para fortalecer el sistema digestivo  " +
                                                  "\n y prevenir la deshidrataci�n Pl�tanos (por cada 100 gramos aproximadamente 358 mg de potasio, cubriendo el 10% de la ingesta diaria " +
                                                  "\n recomendada) y arroz blanco, que es f�cil de digerir y ayuda a estabilizar el sistema digestivo Tambi�n se sugiere el consumo de yogur" +
                                                  "\n natural, que aporta probi�ticos beneficiosos para la salud intestinal y la recuperaci�n Este es solo un diagn�stico predeterminado   " +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas   " +
                                                  "\n sean completamente correctas Para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mayor seguridad en el    " +
                                                  "\n tratamiento adecuado de su paciente Adem�s por su salud si la respuesta del diagn�stico no le satisface del todo se recomienda       " +
                                                  "\n consultar a su m�dico Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, N�useas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeriosis." +
                                                  "\n La Listeriosis requiere una hidrataci�n adecuada con una ingesta diaria de 2.5 a 3 litros de agua, equivalentes a 10 a 12 vasos      " +
                                                  "\n de tama�o regular, para ayudar a la eliminaci�n de toxinas y prevenir complicaciones derivadas de la infecci�n Tambi�n se recomienda " +
                                                  "\n el consumo de l�quidos con propiedades antimicrobianas como agua con lim�n y infusiones de jengibre para fortalecer el sistema       " +
                                                  "\n inmunol�gico La actividad f�sica debe ser m�nima mientras persistan los s�ntomas priorizando el descanso absoluto y evitando         " +
                                                  "\n esfuerzos que puedan debilitar el organismo El tratamiento de la Listeriosis se basa en el uso de antibi�ticos, siendo la ampicilina " +
                                                  "\n y la gentamicina opciones altamente eficaces para eliminar la bacteria La ampicilina impide la replicaci�n de la bacteria mientras   " +
                                                  "\n que la gentamicina bloquea la producci�n de prote�nas esenciales para su supervivencia Marcas reconocidas incluyen Ampex y Garamycin." +
                                                  "\n En casos graves se pueden administrar corticoides para reducir la inflamaci�n y mejorar la respuesta del organismo. En cuanto a la   " +
                                                  "\n alimentaci�n se recomienda el consumo de alimentos ricos en antioxidantes y vitamina C, esenciales para fortalecer el sistema        " +
                                                  "\n inmunol�gico Espinacas (por cada 100 gramos aproximadamente 28 mg de vitamina C, cubriendo el 31% de la ingesta diaria recomendada)  " +
                                                  "\n y zanahorias (por cada 100 gramos aproximadamente 835 �g de vitamina A, cubriendo el 93% de la ingesta diaria recomendada).          " +
                                                  "\n Tambi�n se sugiere el consumo de yogur natural, que aporta probi�ticos beneficiosos para la salud intestinal y la recuperaci�n.      " +
                                                  "\n Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad      " +
                                                  "\n y que por ello la enfermedad y sus respuestas sean completamente correctas Para ello se recomienda hacer m�s de un diagn�stico       " +
                                                  "\n de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente Adem�s por su salud si la respuesta del         " +
                                                  "\n diagn�stico no le satisface del todo se recomienda consultar a su m�dico Angel L Montes agradece tu visita a la app Mi Vida          " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, V�mitos.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n La Shigelosis requiere una hidrataci�n adecuada con una ingesta diaria de 3.5 a 4.5 litros de agua, equivalentes a 12 a 18 vasos " +
                                                  "\n de tama�o regular, para prevenir la deshidrataci�n causada por la diarrea y la fiebre Tambi�n se recomienda el consumo de        " +
                                                  "\n soluciones de rehidrataci�n oral como Pedialyte o Enfalyte, que ayudan a reponer los electrolitos perdidos y mejorar la          " +
                                                  "\n recuperaci�n La actividad f�sica debe ser m�nima mientras persistan los s�ntomas priorizando el descanso absoluto y evitando     " +
                                                  "\n esfuerzos que puedan agravar la p�rdida de l�quidos El tratamiento de la Shigelosis se basa en la rehidrataci�n constante y      " +
                                                  "\n en casos graves puede requerirse administraci�n de l�quidos intravenosos en un hospital para evitar complicaciones En infecciones" +
                                                  "\n severas se pueden utilizar antibi�ticos como ciprofloxacino y azitromicina, que ayudan a reducir la duraci�n de la enfermedad    " +
                                                  "\n Marcas reconocidas incluyen Cipro y Zithromax En cuanto a la alimentaci�n se recomienda el consumo de alimentos suaves y ricos   " +
                                                  "\n en electrolitos, esenciales para fortalecer el sistema digestivo y prevenir la deshidrataci�n Pl�tanos (por cada 100 gramos      " +
                                                  "\n aproximadamente 358 mg de potasio, cubriendo el 10% de la ingesta diaria recomendada) y arroz blanco, que es f�cil de digerir    " +
                                                  "\n y ayuda a estabilizar el sistema digestivo Tambi�n se sugiere el consumo de yogur natural, que aporta probi�ticos beneficiosos   " +
                                                  "\n para la salud intestinal y la recuperaci�n Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza    " +
                                                  "\n al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente correctas Para     " +
                                                  "\n ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su       " +
                                                  "\n paciente Adem�s por su salud si la respuesta del diagn�stico no le satisface del todo se recomienda consultar a su m�dico        " +
                                                  "\n Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos cr�nica, Producci�n excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad Pulmonar Obstructiva Cr�nica (EPOC)." +
                                                  "\n La Enfermedad Pulmonar Obstructiva Cr�nica (EPOC) requiere una hidrataci�n adecuada con una ingesta diaria de 2.5 a 3 litros   " +
                                                  "\n de agua, equivalentes a 10 a 12 vasos de tama�o regular, para ayudar a mantener la funci�n pulmonar y reducir la inflamaci�n.  " +
                                                  "\n Tambi�n se recomienda el consumo de l�quidos con propiedades antioxidantes como t� verde y agua con lim�n para mejorar la salud" +
                                                  "\n respiratoria La actividad f�sica debe ser moderada y adaptada a la capacidad pulmonar priorizando ejercicios de bajo impacto   " +
                                                  "\n como caminatas, nataci�n y ejercicios de respiraci�n para fortalecer los m�sculos respiratorios y mejorar la oxigenaci�n.      " +
                                                  "\n El tratamiento de la EPOC se basa en el uso de broncodilatadores y corticosteroides inhalados, siendo el salbutamol y la       " +
                                                  "\n fluticasona opciones altamente eficaces para mejorar la respiraci�n y reducir la inflamaci�n Marcas reconocidas incluyen       " +
                                                  "\n Ventolin y Flixotide En casos avanzados se pueden administrar terapias de ox�geno para mejorar la calidad de vida del paciente." +
                                                  "\n En cuanto a la alimentaci�n se recomienda el consumo de alimentos ricos en antioxidantes y �cidos grasos Omega-3, esenciales   " +
                                                  "\n para reducir la inflamaci�n pulmonar Salm�n (por cada 100 gramos aproximadamente 2.2 gramos de Omega-3) y espinacas (por cada  " +
                                                  "\n 100 gramos aproximadamente 28 mg de vitamina C, cubriendo el 31% de la ingesta diaria recomendada) Tambi�n se sugiere el consumo" +
                                                  "\n de c�rcuma, que posee propiedades antiinflamatorias y ayuda a mejorar la funci�n pulmonar Este es solo un diagn�stico predeterminado" +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas  " +
                                                  "\n sean completamente correctas Para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mayor seguridad en el   " +
                                                  "\n tratamiento adecuado de su paciente Adem�s por su salud si la respuesta del diagn�stico no le satisface del todo se recomienda      " +
                                                  "\n consultar a su m�dico Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreci�n anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n La Clamidia requiere una hidrataci�n adecuada con una ingesta diaria de 2.5 a 3 litros de agua, equivalentes a 10 a 12 vasos   " +
                                                  "\n de tama�o regular, para ayudar a la eliminaci�n de toxinas y prevenir molestias urinarias Tambi�n se recomienda el consumo de  " +
                                                  "\n l�quidos con propiedades antimicrobianas como agua con lim�n y infusiones de jengibre para fortalecer el sistema inmunol�gico. " +
                                                  "\n La actividad f�sica debe ser moderada y adaptada a su estado de salud priorizando ejercicios aer�bicos de bajo impacto como    " +
                                                  "\n caminatas o yoga durante al menos 30 a 60 minutos al d�a para fortalecer el sistema inmunol�gico sin generar estr�s excesivo   " +
                                                  "\n en el cuerpo. El tratamiento de la Clamidia se basa en el uso de antibi�ticos, siendo la azitromicina y la doxiciclina opciones" +
                                                  "\n altamente eficaces para eliminar la bacteria La azitromicina se administra en una dosis �nica mientras que la doxiciclina se   " +
                                                  "\n toma durante varios d�as Marcas reconocidas incluyen Zithromax y Doryx En cuanto a la alimentaci�n se recomienda el consumo    " +
                                                  "\n de alimentos ricos en antioxidantes y vitamina C, esenciales para fortalecer el sistema inmunol�gico Fresas (por cada 100      " +
                                                  "\n gramos aproximadamente 59 mg de vitamina C, cubriendo el 65% de la ingesta diaria recomendada) y kiwis (por cada 100 gramos    " +
                                                  "\n aproximadamente 92 mg de vitamina C, cubriendo el 102% de la ingesta diaria recomendada) Tambi�n se sugiere el consumo de      " +
                                                  "\n yogur natural, que aporta probi�ticos beneficiosos para la salud intestinal y la recuperaci�n Este es solo un diagn�stico      " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad" +
                                                  "\n y sus respuestas sean completamente correctas Para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer   " +
                                                  "\n mayor seguridad en el tratamiento adecuado de su paciente Adem�s por su salud si la respuesta del diagn�stico no le satisface  " +
                                                  "\n del todo se recomienda consultar a su m�dico Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, N�useas, Dolor de cabeza severo, Rigidez en el cuello, Confusi�n.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n La Meningitis bacteriana requiere una hidrataci�n adecuada con una ingesta diaria de 3.5 a 4.5 litros de agua, equivalentes    " +
                                                  "\n a 12 a 18 vasos de tama�o regular, para prevenir la deshidrataci�n causada por la fiebre intensa y la inflamaci�n de las       " +
                                                  "\n meninges. Tambi�n se recomienda el consumo de soluciones de rehidrataci�n oral como Pedialyte o Enfalyte, que ayudan a reponer " +
                                                  "\n los electrolitos perdidos y mejorar la recuperaci�n La actividad f�sica debe ser m�nima mientras persistan los s�ntomas        " +
                                                  "\n priorizando el descanso absoluto y evitando esfuerzos que puedan agravar la inflamaci�n cerebral El tratamiento de la          " +
                                                  "\n Meningitis bacteriana se basa en el uso de antibi�ticos intravenosos, siendo la ceftriaxona y la vancomicina opciones          " +
                                                  "\n altamente eficaces para eliminar la infecci�n y reducir la inflamaci�n Marcas reconocidas incluyen Rocephin y Vancocin.        " +
                                                  "\n En casos graves se pueden administrar corticoides para reducir la inflamaci�n y mejorar la respuesta del organismo.            " +
                                                  "\n En cuanto a la alimentaci�n se recomienda el consumo de alimentos ricos en antioxidantes y vitamina C, esenciales para         " +
                                                  "\n fortalecer el sistema inmunol�gico Espinacas (por cada 100 gramos aproximadamente 28 mg de vitamina C, cubriendo el 31%        " +
                                                  "\n de la ingesta diaria recomendada) y zanahorias (por cada 100 gramos aproximadamente 835 �g de vitamina A, cubriendo el 93%     " +
                                                  "\n de la ingesta diaria recomendada) Tambi�n se sugiere el consumo de yogur natural, que aporta probi�ticos beneficiosos para     " +
                                                  "\n la salud intestinal y la recuperaci�n Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al    " +
                                                  "\n 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente correctas Para ello " +
                                                  "\n se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente " +
                                                  "\n Adem�s por su salud si la respuesta del diagn�stico no le satisface del todo se recomienda consultar a su m�dico Angel L Montes" +
                                                  "\n agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, P�rdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, P�rdida de apetito.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer C�ncer." +
                                                  "\n El C�ncer en adolescentes requiere una hidrataci�n adecuada con una ingesta diaria de 3 a 4 litros de agua, equivalentes       " +
                                                  "\n a 12 a 16 vasos de tama�o regular, para ayudar a mantener la funci�n celular y reducir los efectos secundarios del tratamiento " +
                                                  "\n Tambi�n se recomienda el consumo de l�quidos con propiedades antioxidantes como t� verde y agua con lim�n para fortalecer      " +
                                                  "\n el sistema inmunol�gico La actividad f�sica debe ser moderada y adaptada a la capacidad del paciente priorizando ejercicios    " +
                                                  "\n de bajo impacto como caminatas, yoga y ejercicios de respiraci�n para mejorar la circulaci�n y reducir la fatiga El tratamiento" +
                                                  "\n del C�ncer var�a seg�n el tipo y la etapa de la enfermedad pero puede incluir quimioterapia, radioterapia, cirug�a y terapias  " +
                                                  "\n dirigidas siendo la doxorrubicina y el paclitaxel opciones comunes en ciertos tipos de c�ncer Marcas reconocidas incluyen      " +
                                                  "\n Adriamycin y Taxol En algunos casos se pueden administrar inmunoterapias para mejorar la respuesta del organismo. En cuanto    " +
                                                  "\n a la alimentaci�n se recomienda el consumo de alimentos ricos en antioxidantes y prote�nas, esenciales para fortalecer el      " +
                                                  "\n sistema inmunol�gico y mantener la energ�a Espinacas (por cada 100 gramos aproximadamente 28 mg de vitamina C, cubriendo el    " +
                                                  "\n 31% de la ingesta diaria recomendada) y zanahorias (por cada 100 gramos aproximadamente 835 �g de vitamina A, cubriendo el     " +
                                                  "\n 93% de la ingesta diaria recomendada) Tambi�n se sugiere el consumo de yogur natural, que aporta probi�ticos beneficiosos      " +
                                                  "\n para la salud intestinal y la recuperaci�n Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza  " +
                                                  "\n al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente correctas.       " +
                                                  "\n Para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado      " +
                                                  "\n de su paciente Adem�s por su salud si la respuesta del diagn�stico no le satisface del todo se recomienda consultar a su       " +
                                                  "\n m�dico Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            } 
                        }
                        if(EstaturaMasculino.equals("1.45-1.60 m")){
                           if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza (gripe)." +
                                                  "\n La Influenza (gripe) requiere una hidrataci�n adecuada con una ingesta diaria de 3.5 a 4.5 litros de agua, equivalentes   " +
                                                  "\n a 12 a 18 vasos de tama�o regular, para prevenir la deshidrataci�n causada por la fiebre intensa y la sudoraci�n.         " +
                                                  "\n Tambi�n se recomienda el consumo de soluciones de rehidrataci�n oral como Pedialyte o Enfalyte, que ayudan a reponer      " +
                                                  "\n los electrolitos perdidos y mejorar la recuperaci�n La actividad f�sica debe ser m�nima mientras persistan los s�ntomas   " +
                                                  "\n priorizando el descanso absoluto y evitando esfuerzos que puedan agravar la fatiga El tratamiento de la Influenza se basa " +
                                                  "\n en el uso de antivirales, siendo el oseltamivir y el baloxavir opciones altamente eficaces para reducir la duraci�n y     " +
                                                  "\n gravedad de la enfermedad Marcas reconocidas incluyen Tamiflu y Xofluza. En casos graves se pueden administrar antipir�ticos" +
                                                  "\n como paracetamol para controlar la fiebre y mejorar el bienestar del paciente En cuanto a la alimentaci�n se recomienda el  " +
                                                  "\n consumo de alimentos ricos en antioxidantes y vitamina C, esenciales para fortalecer el sistema inmunol�gico Naranjas       " +
                                                  "\n (por cada 100 gramos aproximadamente 53 mg de vitamina C, cubriendo el 59% de la ingesta diaria recomendada) y fresas       " +
                                                  "\n (por cada 100 gramos aproximadamente 59 mg de vitamina C, cubriendo el 65% de la ingesta diaria recomendada).               " +
                                                  "\n Tambi�n se sugiere el consumo de jengibre, que posee propiedades antiinflamatorias y ayuda a aliviar el malestar general.   " +
                                                  "\n Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa        " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas sean completamente correctas Para ello se recomienda hacer         " +
                                                  "\n m�s de un diagn�stico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente. Adem�s por      " +
                                                  "\n su salud si la respuesta del diagn�stico no le satisface del todo se recomienda consultar a su m�dico Angel L Montes        " +
                                                  "\n agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                               textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumon�a." +
                                                  "\n La Neumon�a requiere una hidrataci�n adecuada con una ingesta diaria de 3.5 a 4.5 litros de agua, equivalentes a 12 a 18 vasos   " +
                                                  "\n de tama�o regular, para prevenir la deshidrataci�n causada por la fiebre intensa y la dificultad respiratoria Tambi�n se         " +
                                                  "\n recomienda el consumo de soluciones de rehidrataci�n oral como Pedialyte o Enfalyte, que ayudan a reponer los electrolitos       " +
                                                  "\n perdidos y mejorar la recuperaci�n La actividad f�sica debe ser m�nima mientras persistan los s�ntomas priorizando el descanso   " +
                                                  "\n absoluto y evitando esfuerzos que puedan agravar la fatiga respiratoria El tratamiento de la Neumon�a se basa en el uso de       " +
                                                  "\n antibi�ticos, siendo la amoxicilina y la azitromicina opciones altamente eficaces para eliminar la infecci�n y reducir la        " +
                                                  "\n inflamaci�n pulmonar Marcas reconocidas incluyen Amoxil y Zithromax En casos graves se pueden administrar terapias de ox�geno    " +
                                                  "\n para mejorar la oxigenaci�n del paciente En cuanto a la alimentaci�n se recomienda el consumo de alimentos ricos en antioxidantes" +
                                                  "\n y vitamina C, esenciales para fortalecer el sistema inmunol�gico Naranjas (por cada 100 gramos aproximadamente 53 mg de vitamina C," +
                                                  "\n cubriendo el 59% de la ingesta diaria recomendada) y fresas (por cada 100 gramos aproximadamente 59 mg de vitamina C, cubriendo  " +
                                                  "\n el 65% de la ingesta diaria recomendada) Tambi�n se sugiere el consumo de jengibre, que posee propiedades antiinflamatorias y    " +
                                                  "\n ayuda a aliviar la congesti�n pulmonar Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al     " +
                                                  "\n 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente correctas Para ello   " +
                                                  "\n se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente.  " +
                                                  "\n Adem�s por su salud si la respuesta del diagn�stico no le satisface del todo se recomienda consultar a su m�dico Angel L Montes  " +
                                                  "\n agradece tu visita a la app Mi Vida y espera que te mejores."); 
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visi�n borrosa, P�rdida de peso.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n La Diabetes en adolescentes requiere una hidrataci�n adecuada con una ingesta diaria de 2.5 a 3.5 litros de agua, equivalentes    " +
                                                  "\n a 10 a 14 vasos de tama�o regular, para ayudar a mantener el equilibrio de glucosa en sangre y prevenir la deshidrataci�n causada " +
                                                  "\n por la micci�n frecuente Tambi�n se recomienda el consumo de infusiones sin az�car y agua con lim�n, que contribuyen a la         " +
                                                  "\n regulaci�n metab�lica La actividad f�sica debe ser moderada y adaptada a la capacidad del paciente priorizando ejercicios         " +
                                                  "\n aer�bicos como caminatas, ciclismo y nataci�n durante al menos 30 a 60 minutos al d�a, lo que ayuda a mejorar la sensibilidad     " +
                                                  "\n a la insulina y controlar los niveles de glucosa El tratamiento de la Diabetes var�a seg�n el tipo pero puede incluir insulina    " +
                                                  "\n en el caso de diabetes tipo 1 y medicamentos orales como la metformina en el caso de diabetes tipo 2 Marcas reconocidas incluyen  " +
                                                  "\n Humalog, Lantus y Glucophage En algunos casos se pueden administrar inhibidores de SGLT2 para mejorar la eliminaci�n de glucosa   " +
                                                  "\n a trav�s de la orina En cuanto a la alimentaci�n se recomienda el consumo de alimentos ricos en fibra y prote�nas, esenciales     " +
                                                  "\n para estabilizar los niveles de glucosa en sangre Avena (por cada 100 gramos aproximadamente 10 gramos de fibra, cubriendo el     " +
                                                  "\n 40% de la ingesta diaria recomendada) y almendras (por cada 100 gramos aproximadamente 25 mg de vitamina E, cubriendo el 166%     " +
                                                  "\n de la ingesta diaria recomendada) Tambi�n se sugiere el consumo de yogur natural, que aporta probi�ticos beneficiosos para la     " +
                                                  "\n salud intestinal y la regulaci�n metab�lica Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza    " +
                                                  "\n al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente correctas.          " +
                                                  "\n Para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado         " +
                                                  "\n de su paciente. Adem�s por su salud si la respuesta del diagn�stico no le satisface del todo se recomienda consultar a su         " +
                                                  "\n m�dico Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresi�n en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n El Asma requiere una hidrataci�n adecuada con una ingesta diaria de 2.5 a 3.5 litros de agua, equivalentes a 10 a 14 vasos  " +
                                                  "\n de tama�o regular, para ayudar a mantener la funci�n pulmonar y reducir la inflamaci�n Tambi�n se recomienda el consumo de  " +
                                                  "\n l�quidos con propiedades antioxidantes como t� verde y agua con lim�n para mejorar la salud respiratoria La actividad f�sica" +
                                                  "\n debe ser moderada y adaptada a la capacidad pulmonar priorizando ejercicios de bajo impacto como caminatas, nataci�n y      " +
                                                  "\n ejercicios de respiraci�n para fortalecer los m�sculos respiratorios y mejorar la oxigenaci�n El tratamiento del Asma se    " +
                                                  "\n basa en el uso de broncodilatadores y corticosteroides inhalados, siendo el salbutamol y la fluticasona opciones altamente  " +
                                                  "\n eficaces para mejorar la respiraci�n y reducir la inflamaci�n Marcas reconocidas incluyen Ventolin y Flixotide En casos     " +
                                                  "\n avanzados se pueden administrar terapias de ox�geno para mejorar la calidad de vida del paciente En cuanto a la alimentaci�n" +
                                                  "\n se recomienda el consumo de alimentos ricos en antioxidantes y �cidos grasos Omega-3, esenciales para reducir la inflamaci�n" +
                                                  "\n pulmonar Salm�n (por cada 100 gramos aproximadamente 2.2 gramos de Omega-3) y espinacas (por cada 100 gramos aproximadamente" +
                                                  "\n 28 mg de vitamina C, cubriendo el 31% de la ingesta diaria recomendada) Tambi�n se sugiere el consumo de c�rcuma, que posee " +
                                                  "\n propiedades antiinflamatorias y ayuda a mejorar la funci�n pulmonar Este es solo un diagn�stico predeterminado l�gico, haberlo" +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean     " +
                                                  "\n completamente correctas Para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mayor seguridad en   " +
                                                  "\n el tratamiento adecuado de su paciente Adem�s por su salud si la respuesta del diagn�stico no le satisface del todo se      " +
                                                  "\n recomienda consultar a su m�dico Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, P�rdida de peso, Ganglios linf�ticos inflamados, Erupci�n cut�nea (Diarrea).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n El VIH/SIDA requiere una hidrataci�n adecuada con una ingesta diaria de 3 a 4 litros de agua, equivalentes a 12 a 16 vasos    " +
                                                  "\n de tama�o regular, para ayudar a mantener la funci�n inmunol�gica y prevenir la deshidrataci�n causada por fiebre y efectos   " +
                                                  "\n secundarios del tratamiento Tambi�n se recomienda el consumo de l�quidos con propiedades antioxidantes como t� verde y agua   " +
                                                  "\n con lim�n para fortalecer el sistema inmunol�gico La actividad f�sica debe ser moderada y adaptada a la capacidad del paciente" +
                                                  "\n priorizando ejercicios de bajo impacto como caminatas, yoga y ejercicios de respiraci�n para mejorar la circulaci�n y reducir " +
                                                  "\n la fatiga El tratamiento del VIH/SIDA se basa en el uso de antirretrovirales, siendo el tenofovir, emtricitabina y dolutegravir" +
                                                  "\n opciones altamente eficaces para controlar la replicaci�n del virus y mejorar la calidad de vida. Marcas reconocidas incluyen  " +
                                                  "\n Truvada, Tivicay y Biktarvy . En algunos casos se pueden administrar terapias inmunomoduladoras para mejorar la respuesta del  " +
                                                  "\n organismo En cuanto a la alimentaci�n se recomienda el consumo de alimentos ricos en antioxidantes y prote�nas, esenciales para" +
                                                  "\n fortalecer el sistema inmunol�gico y mantener la energ�a Espinacas (por cada 100 gramos aproximadamente 28 mg de vitamina C,   " +
                                                  "\n cubriendo el 31% de la ingesta diaria recomendada) y zanahorias (por cada 100 gramos aproximadamente 835 �g de vitamina A,     " +
                                                  "\n cubriendo el 93% de la ingesta diaria recomendada) Tambi�n se sugiere el consumo de yogur natural, que aporta probi�ticos      " +
                                                  "\n beneficiosos para la salud intestinal y la recuperaci�n Este es solo un diagn�stico predeterminado l�gico, haberlo consultado  " +
                                                  "\n no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente     " +
                                                  "\n correctas Para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mayor seguridad en el tratamiento     " +
                                                  "\n adecuado de su paciente Adem�s por su salud si la respuesta del diagn�stico no le satisface del todo se recomienda consultar   " +
                                                  "\n a su m�dico Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreci�n anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n La Gonorrea requiere una hidrataci�n adecuada con una ingesta diaria de 2.5 a 3 litros de agua, equivalentes a 10 a 12 vasos     " +
                                                  "\n de tama�o regular, para ayudar a la eliminaci�n de toxinas y prevenir molestias urinarias Tambi�n se recomienda el consumo       " +
                                                  "\n de l�quidos con propiedades antimicrobianas como agua con lim�n y infusiones de jengibre para fortalecer el sistema inmunol�gico " +
                                                  "\n La actividad f�sica debe ser moderada y adaptada a su estado de salud priorizando ejercicios aer�bicos de bajo impacto como      " +
                                                  "\n caminatas o yoga durante al menos 30 a 60 minutos al d�a para fortalecer el sistema inmunol�gico sin generar estr�s excesivo     " +
                                                  "\n en el cuerpo El tratamiento de la Gonorrea se basa en el uso de antibi�ticos, siendo la ceftriaxona y la azitromicina opciones   " +
                                                  "\n altamente eficaces para eliminar la bacteria La ceftriaxona se administra en una dosis �nica mientras que la azitromicina        " +
                                                  "\n complementa el tratamiento para evitar resistencia bacteriana Marcas reconocidas incluyen Rocephin y Zithromax En cuanto         " +
                                                  "\n a la alimentaci�n se recomienda el consumo de alimentos ricos en antioxidantes y vitamina C, esenciales para fortalecer el       " +
                                                  "\n sistema inmunol�gico Fresas (por cada 100 gramos aproximadamente 59 mg de vitamina C, cubriendo el 65% de la ingesta diaria      " +
                                                  "\n recomendada) y kiwis (por cada 100 gramos aproximadamente 92 mg de vitamina C, cubriendo el 102% de la ingesta diaria recomendada)." +
                                                  "\n Tambi�n se sugiere el consumo de yogur natural, que aporta probi�ticos beneficiosos para la salud intestinal y la recuperaci�n.  " +
                                                  "\n Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad  " +
                                                  "\n y que por ello la enfermedad y sus respuestas sean completamente correctas Para ello se recomienda hacer m�s de un diagn�stico   " +
                                                  "\n de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente Adem�s por su salud si la respuesta del     " +
                                                  "\n diagn�stico no le satisface del todo se recomienda consultar a su m�dico Angel L Montes agradece tu visita a la app Mi Vida      " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linf�ticos inflamados, �lceras o llagas dolorosas, Picaz�n o ardor, Dolor al orinar.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n El Herpes genital requiere una hidrataci�n adecuada con una ingesta diaria de 2.5 a 3 litros de agua, equivalentes a 10 a 12 vasos  " +
                                                  "\n de tama�o regular, para ayudar a mantener la funci�n inmunol�gica y reducir la inflamaci�n Tambi�n se recomienda el consumo de      " +
                                                  "\n l�quidos con propiedades antivirales como t� verde y agua con lim�n para fortalecer el sistema inmunol�gico La actividad f�sica     " +
                                                  "\n debe ser moderada y adaptada a la capacidad del paciente priorizando ejercicios de bajo impacto como caminatas, yoga y ejercicios   " +
                                                  "\n de respiraci�n para mejorar la circulaci�n y reducir el estr�s El tratamiento del Herpes genital se basa en el uso de antivirales,  " +
                                                  "\n siendo el aciclovir, valaciclovir y famciclovir opciones altamente eficaces para reducir la duraci�n y gravedad de los brotes       " +
                                                  "\n Marcas reconocidas incluyen Zovirax, Valtrex y Famvir En algunos casos se pueden administrar terapias inmunomoduladoras para        " +
                                                  "\n mejorar la respuesta del organismo En cuanto a la alimentaci�n se recomienda el consumo de alimentos ricos en antioxidantes y       " +
                                                  "\n vitamina C, esenciales para fortalecer el sistema inmunol�gico Fresas (por cada 100 gramos aproximadamente 59 mg de vitamina C,     " +
                                                  "\n cubriendo el 65% de la ingesta diaria recomendada) y kiwis (por cada 100 gramos aproximadamente 92 mg de vitamina C, cubriendo      " +
                                                  "\n el 102% de la ingesta diaria recomendada). Tambi�n se sugiere el consumo de yogur natural, que aporta probi�ticos beneficiosos      " +
                                                  "\n para la salud intestinal y la recuperaci�n Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza       " +
                                                  "\n al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente correctas.            " +
                                                  "\n Para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su     " +
                                                  "\n paciente Adem�s por su salud si la respuesta del diagn�stico no le satisface del todo se recomienda consultar a su m�dico           " +
                                                  "\n Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, �lceras indoloras, Erupci�n cut�nea, Dolor de cabeza, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer S�filis." +
                                                  "\n La S�filis requiere una hidrataci�n adecuada con una ingesta diaria de 2.5 a 3 litros de agua, equivalentes a 10 a 12 vasos     " +
                                                  "\n de tama�o regular, para ayudar a la eliminaci�n de toxinas y prevenir complicaciones derivadas de la infecci�n. Tambi�n se      " +
                                                  "\n recomienda el consumo de l�quidos con propiedades antimicrobianas como agua con lim�n y infusiones de jengibre para fortalecer  " +
                                                  "\n el sistema inmunol�gico. La actividad f�sica debe ser moderada y adaptada a su estado de salud, priorizando ejercicios aer�bicos" +
                                                  "\n de bajo impacto como caminatas o yoga durante al menos 30 a 60 minutos al d�a, lo que ayuda a fortalecer el sistema inmunol�gico" +
                                                  "\n sin generar estr�s excesivo en el cuerpo. El tratamiento de la S�filis se basa en el uso de antibi�ticos, siendo la penicilina  " +
                                                  "\n benzatina la opci�n m�s eficaz para eliminar la bacteria. En casos de alergia a la penicilina se pueden utilizar alternativas   " +
                                                  "\n como doxiciclina o azitromicina. Marcas reconocidas incluyen Bicillin L-A y Doryx. En cuanto a la alimentaci�n, se recomienda   " +
                                                  "\n el consumo de alimentos ricos en antioxidantes y vitamina C, esenciales para fortalecer el sistema inmunol�gico. Fresas (por    " +
                                                  "\n cada 100 gramos aproximadamente 59 mg de vitamina C, cubriendo el 65% de la ingesta diaria recomendada) y kiwis (por cada 100   " +
                                                  "\n gramos aproximadamente 92 mg de vitamina C, cubriendo el 102% de la ingesta diaria recomendada). Tambi�n se sugiere el consumo  " +
                                                  "\n de yogur natural, que aporta probi�ticos beneficiosos para la salud intestinal y la recuperaci�n. Este es solo un diagn�stico   " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad" +
                                                  "\n y sus respuestas sean completamente correctas. Para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer   " +
                                                  "\n mayor seguridad en el tratamiento adecuado de su paciente. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface" +
                                                  "\n del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");   
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, P�rdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n La Tuberculosis (TB) requiere una hidrataci�n adecuada con una ingesta diaria de 3.5 a 4.5 litros de agua, equivalentes   " +
                                                  "\n a 12 a 18 vasos de tama�o regular, para prevenir la deshidrataci�n causada por la fiebre intensa y la sudoraci�n.         " +
                                                  "\n Tambi�n se recomienda el consumo de soluciones de rehidrataci�n oral como Pedialyte o Enfalyte, que ayudan a reponer      " +
                                                  "\n los electrolitos perdidos y mejorar la recuperaci�n. La actividad f�sica debe ser m�nima mientras persistan los s�ntomas, " +
                                                  "\n priorizando el descanso absoluto y evitando esfuerzos que puedan agravar la fatiga respiratoria. El tratamiento de la     " +
                                                  "\n Tuberculosis se basa en el uso de antibi�ticos de primera l�nea, siendo la isoniazida, rifampicina, pirazinamida y etambutol" +
                                                  "\n opciones altamente eficaces para eliminar la infecci�n y reducir la inflamaci�n pulmonar. Marcas reconocidas incluyen Rifadin" +
                                                  "\n y Myambutol. En casos graves se pueden administrar terapias de ox�geno para mejorar la oxigenaci�n del paciente. En cuanto a " +
                                                  "\n la alimentaci�n, se recomienda el consumo de alimentos ricos en antioxidantes y vitamina C, esenciales para fortalecer el    " +
                                                  "\n sistema inmunol�gico. Naranjas (por cada 100 gramos aproximadamente 53 mg de vitamina C, cubriendo el 59% de la ingesta diaria" +
                                                  "\n recomendada) y fresas (por cada 100 gramos aproximadamente 59 mg de vitamina C, cubriendo el 65% de la ingesta diaria        " +
                                                  "\n recomendada). Tambi�n se sugiere el consumo de jengibre, que posee propiedades antiinflamatorias y ayuda a aliviar la        " +
                                                  "\n congesti�n pulmonar. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el       " +
                                                  "\n paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente correctas. Para ello se       " +
                                                  "\n recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente. " +
                                                  "\n Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico.         " +
                                                  "\n Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchaz�n en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n La Artritis requiere una hidrataci�n adecuada con una ingesta diaria de 2.5 a 3.5 litros de agua, equivalentes a 10 a 14 vasos    " +
                                                  "\n de tama�o regular, para ayudar a reducir la inflamaci�n y mantener la movilidad articular. Tambi�n se recomienda el consumo de    " +
                                                  "\n l�quidos con propiedades antiinflamatorias como t� verde y agua con c�rcuma para fortalecer el sistema inmunol�gico. La actividad " +
                                                  "\n f�sica debe ser moderada y adaptada a la capacidad del paciente, priorizando ejercicios de bajo impacto como nataci�n, yoga y     " +
                                                  "\n ejercicios de movilidad articular, lo que ayuda a mejorar la flexibilidad y reducir el dolor. El tratamiento de la Artritis se    " +
                                                  "\n basa en el uso de antiinflamatorios no esteroides (AINEs) y f�rmacos modificadores de la enfermedad (FAMEs), siendo el ibuprofeno," +
                                                  "\n naproxeno, metotrexato y adalimumab opciones altamente eficaces para reducir la inflamaci�n y mejorar la calidad de vida. Marcas  " +
                                                  "\n reconocidas incluyen Advil, Naprosyn, Trexall y Humira. En algunos casos se pueden administrar terapias biol�gicas para mejorar   " +
                                                  "\n la respuesta del organismo. En cuanto a la alimentaci�n, se recomienda el consumo de alimentos ricos en antioxidantes y �cidos    " +
                                                  "\n grasos Omega-3, esenciales para reducir la inflamaci�n articular. Salm�n (por cada 100 gramos aproximadamente 2.2 gramos de Omega-3)" +
                                                  "\n y espinacas (por cada 100 gramos aproximadamente 28 mg de vitamina C, cubriendo el 31% de la ingesta diaria recomendada). Tambi�n " +
                                                  "\n se sugiere el consumo de c�rcuma, que posee propiedades antiinflamatorias y ayuda a mejorar la funci�n articular. Este es solo    " +
                                                  "\n un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello " +
                                                  "\n la enfermedad y sus respuestas sean completamente correctas. Para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para  " +
                                                  "\n establecer mayor seguridad en el tratamiento adecuado de su paciente. Adem�s, por su salud, si la respuesta del diagn�stico no    " +
                                                  "\n le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n La Tosferina requiere una hidrataci�n adecuada con una ingesta diaria de 3 a 4 litros de agua, equivalentes a 12 a 16 vasos  " +
                                                  "\n de tama�o regular, para ayudar a mantener la funci�n pulmonar y reducir la inflamaci�n. Tambi�n se recomienda el consumo de  " +
                                                  "\n l�quidos con propiedades antimicrobianas como t� verde y agua con miel, que pueden aliviar la irritaci�n de la garganta y    " +
                                                  "\n mejorar la salud respiratoria. La actividad f�sica debe ser m�nima mientras persistan los s�ntomas, priorizando el descanso  " +
                                                  "\n absoluto y evitando esfuerzos que puedan agravar la tos y la fatiga respiratoria. El tratamiento de la Tosferina se basa en  " +
                                                  "\n el uso de antibi�ticos, siendo la azitromicina, claritromicina y eritromicina opciones altamente eficaces para reducir la    " +
                                                  "\n duraci�n y gravedad de la enfermedad. Marcas reconocidas incluyen Zithromax, Biaxin y Erythrocin. En casos graves se pueden  " +
                                                  "\n administrar terapias de ox�geno para mejorar la oxigenaci�n del paciente. En cuanto a la alimentaci�n, se recomienda el consumo" +
                                                  "\n de alimentos ricos en antioxidantes y vitamina C, esenciales para fortalecer el sistema inmunol�gico. Naranjas (por cada 100  " +
                                                  "\n gramos aproximadamente 53 mg de vitamina C, cubriendo el 59% de la ingesta diaria recomendada) y fresas (por cada 100 gramos  " +
                                                  "\n aproximadamente 59 mg de vitamina C, cubriendo el 65% de la ingesta diaria recomendada). Tambi�n se sugiere el consumo de     " +
                                                  "\n jengibre, que posee propiedades antiinflamatorias y ayuda a aliviar la congesti�n pulmonar. Este es solo un diagn�stico       " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad" +
                                                  "\n y sus respuestas sean completamente correctas. Para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer  " +
                                                  "\n mayor seguridad en el tratamiento adecuado de su paciente. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface" +
                                                  "\n del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchaz�n de las gl�ndulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas. " +
                                                  "\n Las Paperas requieren una hidrataci�n adecuada con una ingesta diaria de 2.5 a 3.5 litros de agua, equivalentes a 10 a 14 vasos    " +
                                                  "\n de tama�o regular, para ayudar a mantener la funci�n inmunol�gica y reducir la inflamaci�n. Tambi�n se recomienda el consumo de    " +
                                                  "\n l�quidos con propiedades antiinflamatorias como t� verde y agua con miel, que pueden aliviar la irritaci�n de la garganta y mejorar" +
                                                  "\n la salud general. La actividad f�sica debe ser m�nima mientras persistan los s�ntomas, priorizando el descanso absoluto y evitando " +
                                                  "\n esfuerzos que puedan agravar la fatiga y el malestar. El tratamiento de las Paperas es principalmente sintom�tico, ya que no existe" +
                                                  "\n un antiviral espec�fico para la enfermedad. Se recomienda el uso de analg�sicos como paracetamol o ibuprofeno para reducir la fiebre" +
                                                  "\n y el dolor. Marcas reconocidas incluyen Tylenol y Advil. En casos de inflamaci�n severa se pueden aplicar compresas fr�as o calientes" +
                                                  "\n en la zona afectada para aliviar el dolor. En cuanto a la alimentaci�n, se recomienda el consumo de alimentos suaves y ricos en     " +
                                                  "\n antioxidantes, esenciales para fortalecer el sistema inmunol�gico. Pl�tanos (por cada 100 gramos aproximadamente 358 mg de potasio, " +
                                                  "\n cubriendo el 10% de la ingesta diaria recomendada) y arroz blanco, que es f�cil de digerir y ayuda a estabilizar el sistema digestivo." +
                                                  "\n Tambi�n se sugiere el consumo de yogur natural, que aporta probi�ticos beneficiosos para la salud intestinal y la recuperaci�n.       " +
                                                  "\n Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad       " +
                                                  "\n y que por ello la enfermedad y sus respuestas sean completamente correctas. Para ello se recomienda hacer m�s de un diagn�stico       " +
                                                  "\n de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente. Adem�s, por su salud, si la respuesta del       " +
                                                  "\n diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la app Mi Vida y       " +
                                                  "\n espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupci�n cut�nea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n El Zika requiere una hidrataci�n adecuada con una ingesta diaria de 3 a 4 litros de agua, equivalentes a 12 a 16 vasos  " +
                                                  "\n de tama�o regular, para prevenir la deshidrataci�n causada por la fiebre y otros s�ntomas. Tambi�n se recomienda el     " +
                                                  "\n consumo de l�quidos con electrolitos naturales como agua de coco, que ayuda a mantener el equilibrio de minerales en    " +
                                                  "\n el cuerpo. La actividad f�sica debe ser m�nima mientras persistan los s�ntomas, priorizando el descanso absoluto y      " +
                                                  "\n ejercicios de respiraci�n para mejorar la oxigenaci�n. El tratamiento del Zika es sintom�tico, ya que no existe un      " +
                                                  "\n antiviral espec�fico. Se recomienda el uso de analg�sicos como paracetamol para reducir la fiebre y el dolor muscular.  " +
                                                  "\n Marcas reconocidas incluyen Tempra y Tylenol. Es importante evitar el uso de aspirina y otros antiinflamatorios no      " +
                                                  "\n esteroides hasta descartar dengue para reducir el riesgo de sangrado. En cuanto a la alimentaci�n, se recomienda el     " +
                                                  "\n consumo de alimentos ricos en antioxidantes y vitamina C, esenciales para fortalecer el sistema inmunol�gico. Naranjas  " +
                                                  "\n (por cada 100 gramos aproximadamente 53 mg de vitamina C, cubriendo el 59% de la ingesta diaria recomendada) y fresas   " +
                                                  "\n (por cada 100 gramos aproximadamente 59 mg de vitamina C, cubriendo el 65% de la ingesta diaria recomendada). Tambi�n   " +
                                                  "\n se sugiere el consumo de jengibre, que posee propiedades antiinflamatorias y ayuda a aliviar el malestar general.       " +
                                                  "\n Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa    " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas sean completamente correctas. Para ello se recomienda hacer    " +
                                                  "\n m�s de un diagn�stico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente. Adem�s,     " +
                                                  "\n por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico.            " +
                                                  "\n Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, V�mitos, Deshidrataci�n, Dolor abdominal.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 3.5 a 4.5 litros de agua, equivalentes a 12 a 18 vasos de tama�o regular,   " +
                                                  "\n para prevenir la deshidrataci�n causada por la diarrea y los v�mitos. Tambi�n se recomienda el consumo de soluciones de      " +
                                                  "\n rehidrataci�n oral como Pedialyte o Enfalyte, que ayudan a reponer los electrolitos perdidos y mejorar la recuperaci�n.      " +
                                                  "\n EJERCICIO: La actividad f�sica debe ser m�nima mientras persistan los s�ntomas, priorizando el descanso absoluto y evitando  " +
                                                  "\n esfuerzos que puedan agravar la p�rdida de l�quidos. POSIBLE TRATAMIENTO: No existe un antiviral espec�fico para el Rotavirus," +
                                                  "\n por lo que el tratamiento se basa en la rehidrataci�n constante. En casos graves puede requerirse administraci�n de l�quidos  " +
                                                  "\n intravenosos en un hospital para evitar complicaciones. Marcas reconocidas incluyen Pedialyte y Enfalyte, recomendadas para   " +
                                                  "\n la rehidrataci�n efectiva. ALIMENTACION: Se recomienda el consumo de alimentos suaves y ricos en electrolitos, esenciales para" +
                                                  "\n fortalecer el sistema digestivo y prevenir la deshidrataci�n. Pl�tanos (por cada 100 gramos aproximadamente 358 mg de potasio," +
                                                  "\n cubriendo el 10% de la ingesta diaria recomendada) y arroz blanco, que es f�cil de digerir y ayuda a estabilizar el sistema   " +
                                                  "\n digestivo. Tambi�n se sugiere el consumo de yogur natural, que aporta probi�ticos beneficiosos para la salud intestinal y la  " +
                                                  "\n recuperaci�n. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga" +
                                                  "\n esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente correctas. Para ello se recomienda hacer m�s  " +
                                                  "\n de un diagn�stico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente. Adem�s, por su salud, " +
                                                  "\n si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita" +
                                                  "\n a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, N�useas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 2.5 a 3 litros de agua, equivalentes a 10 a 12 vasos de tama�o regular,   " +
                                                  "\n para ayudar a la eliminaci�n de toxinas y prevenir complicaciones derivadas de la infecci�n. Tambi�n se recomienda el      " +
                                                  "\n consumo de l�quidos con propiedades antimicrobianas como agua con lim�n y infusiones de jengibre para fortalecer el sistema" +
                                                  "\n inmunol�gico. EJERCICIO: La actividad f�sica debe ser m�nima mientras persistan los s�ntomas, priorizando el descanso      " +
                                                  "\n absoluto y evitando esfuerzos que puedan debilitar el organismo. POSIBLE TRATAMIENTO: El tratamiento de la Listeriosis     " +
                                                  "\n se basa en el uso de antibi�ticos, siendo la ampicilina y la gentamicina opciones altamente eficaces para eliminar la      " +
                                                  "\n bacteria. La ampicilina impide la replicaci�n de la bacteria mientras que la gentamicina bloquea la producci�n de prote�nas" +
                                                  "\n esenciales para su supervivencia. Marcas reconocidas incluyen Ampex y Garamycin. En casos graves se pueden administrar     " +
                                                  "\n corticoides para reducir la inflamaci�n y mejorar la respuesta del organismo. ALIMENTACION: Se recomienda el consumo de    " +
                                                  "\n alimentos ricos en antioxidantes y vitamina C, esenciales para fortalecer el sistema inmunol�gico. Espinacas (por cada     " +
                                                  "\n 100 gramos aproximadamente 28 mg de vitamina C, cubriendo el 31% de la ingesta diaria recomendada) y zanahorias (por cada  " +
                                                  "\n 100 gramos aproximadamente 835 �g de vitamina A, cubriendo el 93% de la ingesta diaria recomendada). Tambi�n se sugiere el " +
                                                  "\n consumo de yogur natural, que aporta probi�ticos beneficiosos para la salud intestinal y la recuperaci�n. Este es solo un  " +
                                                  "\n diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por  " +
                                                  "\n ello la enfermedad y sus respuestas sean completamente correctas. Para ello se recomienda hacer m�s de un diagn�stico de   " +
                                                  "\n Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente. Adem�s, por su salud, si la respuesta   " +
                                                  "\n del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la app  " +
                                                  "\n Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, V�mitos.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 3.5 a 4.5 litros de agua, equivalentes a 12 a 18 vasos de tama�o regular,   " +
                                                  "\n para prevenir la deshidrataci�n causada por la diarrea y la fiebre. Tambi�n se recomienda el consumo de soluciones de        " +
                                                  "\n rehidrataci�n oral como Pedialyte o Enfalyte, que ayudan a reponer los electrolitos perdidos y mejorar la recuperaci�n.      " +
                                                  "\n EJERCICIO: La actividad f�sica debe ser m�nima mientras persistan los s�ntomas, priorizando el descanso absoluto y evitando  " +
                                                  "\n esfuerzos que puedan agravar la p�rdida de l�quidos. POSIBLE TRATAMIENTO: El tratamiento de la Shigelosis se basa en la      " +
                                                  "\n rehidrataci�n constante, y en casos graves puede requerirse administraci�n de l�quidos intravenosos en un hospital para      " +
                                                  "\n evitar complicaciones. En infecciones severas se pueden utilizar antibi�ticos como ciprofloxacino y azitromicina, que ayudan " +
                                                  "\n a reducir la duraci�n de la enfermedad. Marcas reconocidas incluyen Cipro y Zithromax. ALIMENTACION: Se recomienda el consumo" +
                                                  "\n de alimentos suaves y ricos en electrolitos, esenciales para fortalecer el sistema digestivo y prevenir la deshidrataci�n.   " +
                                                  "\n Pl�tanos (por cada 100 gramos aproximadamente 358 mg de potasio, cubriendo el 10% de la ingesta diaria recomendada) y arroz  " +
                                                  "\n blanco, que es f�cil de digerir y ayuda a estabilizar el sistema digestivo. Tambi�n se sugiere el consumo de yogur natural,  " +
                                                  "\n que aporta probi�ticos beneficiosos para la salud intestinal y la recuperaci�n. Este es solo un diagn�stico predeterminado   " +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus      " +
                                                  "\n respuestas sean completamente correctas. Para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer      " +
                                                  "\n mayor seguridad en el tratamiento adecuado de su paciente. Adem�s, por su salud, si la respuesta del diagn�stico no le       " +
                                                  "\n satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos cr�nica, Producci�n excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad Pulmonar Obstructiva Cr�nica (EPOC)." +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 2.5 a 3 litros de agua, equivalentes a 10 a 12 vasos de tama�o regular,    " +
                                                  "\n para ayudar a mantener la funci�n pulmonar y reducir la inflamaci�n. Tambi�n se recomienda el consumo de l�quidos con       " +
                                                  "\n propiedades antioxidantes como t� verde y agua con lim�n para mejorar la salud respiratoria. EJERCICIO: La actividad        " +
                                                  "\n f�sica debe ser moderada y adaptada a la capacidad pulmonar, priorizando ejercicios de bajo impacto como caminatas,         " +
                                                  "\n nataci�n y ejercicios de respiraci�n, que fortalecen los m�sculos respiratorios y mejoran la oxigenaci�n.                   " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento de la EPOC se basa en el uso de broncodilatadores y corticosteroides inhalados, siendo  " +
                                                  "\n el salbutamol y la fluticasona opciones altamente eficaces para mejorar la respiraci�n y reducir la inflamaci�n. Marcas     " +
                                                  "\n reconocidas incluyen Ventolin y Flixotide. En casos avanzados se pueden administrar terapias de ox�geno para mejorar la     " +
                                                  "\n calidad de vida del paciente. ALIMENTACION: Se recomienda el consumo de alimentos ricos en antioxidantes y �cidos grasos    " +
                                                  "\n Omega-3, esenciales para reducir la inflamaci�n pulmonar. Salm�n (por cada 100 gramos aproximadamente 2.2 gramos de Omega-3)" +
                                                  "\n y espinacas (por cada 100 gramos aproximadamente 28 mg de vitamina C, cubriendo el 31% de la ingesta diaria recomendada).   " +
                                                  "\n Tambi�n se sugiere el consumo de c�rcuma, que posee propiedades antiinflamatorias y ayuda a mejorar la funci�n pulmonar.    " +
                                                  "\n Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad" +
                                                  "\n y que por ello la enfermedad y sus respuestas sean completamente correctas. Para ello se recomienda hacer m�s de un diagn�stico" +
                                                  "\n de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente. Adem�s, por su salud, si la respuesta " +
                                                  "\n del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la app   " +
                                                  "\n Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreci�n anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 2.5 a 3 litros de agua, equivalentes a 10 a 12 vasos de tama�o regular,    " +
                                                  "\n para ayudar a la eliminaci�n de toxinas y prevenir molestias urinarias. Tambi�n se recomienda el consumo de l�quidos con    " +
                                                  "\n propiedades antimicrobianas como agua con lim�n y infusiones de jengibre para fortalecer el sistema inmunol�gico.           " +
                                                  "\n EJERCICIO: La actividad f�sica debe ser moderada y adaptada a su estado de salud, priorizando ejercicios aer�bicos de bajo  " +
                                                  "\n impacto como caminatas o yoga durante al menos 30 a 60 minutos al d�a, lo que ayuda a fortalecer el sistema inmunol�gico    " +
                                                  "\n sin generar estr�s excesivo en el cuerpo. POSIBLE TRATAMIENTO: El tratamiento de la Clamidia se basa en el uso de antibi�ticos," +
                                                  "\n siendo la azitromicina y la doxiciclina opciones altamente eficaces para eliminar la bacteria. La azitromicina se administra   " +
                                                  "\n en una dosis �nica mientras que la doxiciclina se toma durante varios d�as. Marcas reconocidas incluyen Zithromax y Doryx.     " +
                                                  "\n ALIMENTACION: Se recomienda el consumo de alimentos ricos en antioxidantes y vitamina C, esenciales para fortalecer el sistema " +
                                                  "\n inmunol�gico. Fresas (por cada 100 gramos aproximadamente 59 mg de vitamina C, cubriendo el 65% de la ingesta diaria recomendada)" +
                                                  "\n y kiwis (por cada 100 gramos aproximadamente 92 mg de vitamina C, cubriendo el 102% de la ingesta diaria recomendada). Tambi�n   " +
                                                  "\n se sugiere el consumo de yogur natural, que aporta probi�ticos beneficiosos para la salud intestinal y la recuperaci�n. Este es  " +
                                                  "\n solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que    " +
                                                  "\n por ello la enfermedad y sus respuestas sean completamente correctas. Para ello se recomienda hacer m�s de un diagn�stico de     " +
                                                  "\n Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente. Adem�s, por su salud, si la respuesta del     " +
                                                  "\n diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la app Mi Vida    " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, N�useas, Dolor de cabeza severo, Rigidez en el cuello, Confusi�n.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis Bacteriana." +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 3.5 a 4.5 litros de agua, equivalentes a 12 a 18 vasos de tama�o regular,  " +
                                                  "\n para prevenir la deshidrataci�n causada por la fiebre intensa y la inflamaci�n de las meninges. Tambi�n se recomienda el    " +
                                                  "\n consumo de soluciones de rehidrataci�n oral como Pedialyte o Enfalyte, que ayudan a reponer los electrolitos perdidos y     " +
                                                  "\n mejorar la recuperaci�n. EJERCICIO: La actividad f�sica debe ser m�nima mientras persistan los s�ntomas, priorizando el     " +
                                                  "\n descanso absoluto y evitando esfuerzos que puedan agravar la inflamaci�n cerebral. POSIBLE TRATAMIENTO: El tratamiento      " +
                                                  "\n de la Meningitis Bacteriana se basa en el uso de antibi�ticos intravenosos, siendo la ceftriaxona y la vancomicina opciones " +
                                                  "\n altamente eficaces para eliminar la infecci�n y reducir la inflamaci�n. Marcas reconocidas incluyen Rocephin y Vancocin.    " +
                                                  "\n En casos graves se pueden administrar corticoides para reducir la inflamaci�n y mejorar la respuesta del organismo.         " +
                                                  "\n ALIMENTACION: Se recomienda el consumo de alimentos ricos en antioxidantes y vitamina C, esenciales para fortalecer         " +
                                                  "\n el sistema inmunol�gico. Espinacas (por cada 100 gramos aproximadamente 28 mg de vitamina C, cubriendo el 31% de la         " +
                                                  "\n ingesta diaria recomendada) y zanahorias (por cada 100 gramos aproximadamente 835 �g de vitamina A, cubriendo el 93%        " +
                                                  "\n de la ingesta diaria recomendada). Tambi�n se sugiere el consumo de yogur natural, que aporta probi�ticos beneficiosos      " +
                                                  "\n para la salud intestinal y la recuperaci�n. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no        " +
                                                  "\n garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente     " +
                                                  "\n correctas. Para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mayor seguridad en el tratamiento " +
                                                  "\n adecuado de su paciente. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda      " +
                                                  "\n consultar a su m�dico. Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, P�rdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, P�rdida de apetito.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer C�ncer." +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 3 a 4 litros de agua, equivalentes a 12 a 16 vasos de tama�o regular,     " +
                                                  "\n para ayudar a mantener la funci�n celular y reducir los efectos secundarios del tratamiento. Tambi�n se recomienda el      " +
                                                  "\n consumo de l�quidos con propiedades antioxidantes como t� verde y agua con lim�n para fortalecer el sistema inmunol�gico.  " +
                                                  "\n EJERCICIO: La actividad f�sica debe ser moderada y adaptada a la capacidad del paciente, priorizando ejercicios de bajo    " +
                                                  "\n impacto como caminatas, yoga y ejercicios de respiraci�n, que mejoran la circulaci�n y reducen la fatiga. POSIBLE TRATAMIENTO:" + 
                                                  "\n El tratamiento del C�ncer var�a seg�n el tipo y la etapa de la enfermedad, pero puede incluir quimioterapia, radioterapia,  " +
                                                  "\n cirug�a y terapias dirigidas. Marcas reconocidas incluyen Adriamycin y Taxol. En algunos casos se pueden administrar        " +
                                                  "\n inmunoterapias para mejorar la respuesta del organismo. ALIMENTACION: Se recomienda el consumo de alimentos ricos en antioxidantes" + 
                                                  "\n y prote�nas, esenciales para fortalecer el sistema inmunol�gico y mantener la energ�a. Espinacas (por cada 100 gramos      " +
                                                  "\n aproximadamente 28 mg de vitamina C, cubriendo el 31% de la ingesta diaria recomendada) y zanahorias (por cada 100 gramos  " +
                                                  "\n aproximadamente 835 �g de vitamina A, cubriendo el 93% de la ingesta diaria recomendada). Tambi�n se sugiere el consumo de " +
                                                  "\n yogur natural, que aporta probi�ticos beneficiosos para la salud intestinal y la recuperaci�n. Este es solo un diagn�stico " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la      " +
                                                  "\n enfermedad y sus respuestas sean completamente correctas. Para ello se recomienda hacer m�s de un diagn�stico de Mi Vida   " +
                                                  "\n para establecer mayor seguridad en el tratamiento adecuado de su paciente. Adem�s, por su salud, si la respuesta del       " +
                                                  "\n diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la app      " +
                                                  "\n Mi Vida y espera que te mejores.");
                            } 
                        }
                    }
                            
            }
        if (EdadMasculino.equals("Adolescencia = 10-21 a�os")) {
            frame.setVisible(true);
        } else {
            frame.setVisible(false);
        }
        
        }
        
        public Estudio3() {
        this("", "", "", "", "");   
        }
        
        public void crearInterfaz(){
         
        if (!edadRecibida.equals(edadEsperada)){
        
        return;
         }    
            
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
        Estudio3 ventanaEstudio3 = new Estudio3();
        ventanaEstudio3.crearInterfaz();
    }
}
             
             
         