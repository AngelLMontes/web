import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Estudio3 implements ActionListener{
    
  
         private final JLabel label1;
         private JScrollPane scrollpane1;
         private JTextArea textarea1;
         private JFrame frame;
         private final String edadEsperada = "Adolescencia = 10-21 años";
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
            
                 if(EdadMasculino.equals("Adolescencia = 10-21 años")){
                    
                          if(EstaturaMasculino.equals("0.90-1.35 m")){
                              if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza (gripe)." +
                                                  "\n Durante la fase aguda de la influenza, el descanso es fundamental, por lo que se debe evitar cualquier actividad" +
                                                  "\n física intensa para permitir que el cuerpo utilice su energía en combatir la infección. Una vez que la fiebre " +
                                                  "\n haya desaparecido por al menos 24 horas y los síntomas mejoren significativamente, se puede reanudar la actividad" + 
                                                  "\n física de forma gradual y ligera. Es crucial aumentar la ingesta de líquidos para compensar la pérdida por fiebre" + 
                                                  "\n y sudoración, recomendándose un consumo de 2 a 2.5 litros de agua al día (ocho a diez vasos), que pueden         " +
                                                  "\n complementarse con tés tibios y caldos para ayudar a aliviar la congestión y el dolor de garganta.               " +
                                                  "\n POSIBLE TRATAMIENTO: El manejo se centra en el alivio de los síntomas con descanso y una hidratación adecuada.   " +
                                                  "\n Para la fiebre y el malestar general se utilizan analgésicos y antipiréticos de venta libre como el paracetamol  " +
                                                  "\n (marcas comunes en México: Tempra, Tylenol) o el ibuprofeno (marcas: Advil, Motrin). En casos específicos y bajo " +
                                                  "\n prescripción médica, especialmente si se inicia en las primeras 48 horas de los síntomas, se podría recetar un   " +
                                                  "\n antiviral como el oseltamivir (marca común: Tamiflu) para acortar la duración y severidad de la enfermedad.      " +
                                                  "\n También es recomendable consumir alimentos que fortalezcan el sistema inmune y faciliten la recuperación, tales como:" +
                                                  "\n Naranjas, guayabas y pimientos: muy ricas en vitamina C, un potente antioxidante que ayuda a fortalecer las defensas" + 
                                                  "\n del cuerpo para combatir la infección. Caldo de pollo o de verduras: proporciona hidratación, electrolitos       " +
                                                  "\n (como sodio y potasio) y nutrientes de fácil digestión, además de que el vapor puede ayudar a descongestionar.   " +
                                                  "\n Plátanos: aportan potasio, un electrolito importante que se puede perder con la sudoración por la fiebre, y son  " +
                                                  "\n fáciles de digerir. Ajo y jengibre: contienen compuestos con propiedades antimicrobianas y antiinflamatorias que " +
                                                  "\n pueden dar un soporte adicional al sistema inmune y aliviar síntomas como el dolor de garganta. Este es solo un  " +
                                                  "\n Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad  " +
                                                  "\n y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico" +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la  " +
                                                  "\n respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes  " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                               textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumonía." +
                                                  "\n La neumonía es una infección pulmonar seria que exige reposo absoluto; se debe evitar por completo la actividad física" +
                                                  "\n durante la fase aguda de la enfermedad y la recuperación inicial para no sobrecargar al cuerpo y permitir que los     " +
                                                  "\n pulmones sanen. El regreso a la actividad debe ser muy gradual y siempre bajo la aprobación de un médico.             " +
                                                  "\n La hidratación es clave para fluidificar las secreciones bronquiales y facilitar su expulsión, por lo que se recomienda" +
                                                  "\n un consumo elevado de líquidos, de 2.5 a 3 litros diarios (diez a doce vasos), principalmente agua, tés de hierbas y  " +
                                                  "\n caldos claros. POSIBLE TRATAMIENTO: El tratamiento de la neumonía debe ser siempre diagnosticado y supervisado por un " +
                                                  "\n médico, ya que es fundamental determinar su origen. Si es de origen bacteriano, el pilar del tratamiento son los      " +
                                                  "\n antibióticos, como la amoxicilina (marcas comunes en México: Amoxil, Augmentin) o la azitromicina (marcas: Azitrocin, " +
                                                  "\n Zitromax). Es vital completar todo el ciclo de antibióticos recetado. Para el manejo de la fiebre y el dolor se puede " +
                                                  "\n usar paracetamol (Tempra). Adicionalmente, una dieta rica en nutrientes es fundamental para fortalecer el sistema inmune" +
                                                  "\n y reparar el tejido pulmonar, incluyendo alimentos como: Kiwis y pimientos rojos, fuentes excepcionales de vitamina C;" +
                                                  "\n tan solo 100 g de kiwi aportan cerca de 90 mg de esta vitamina (más del 100% de la ingesta diaria recomendada), crucial" +
                                                  "\n para la función inmunológica. Lentejas y pollo, ricos en proteína para la reparación de tejidos y en zinc, un mineral " +
                                                  "\n esencial para el sistema inmune; una taza de lentejas cocidas puede aportar cerca del 25% del zinc diario necesario.  " +
                                                  "\n Yogur con probióticos, especialmente importante si se está en tratamiento con antibióticos, ya que ayuda a restaurar  " +
                                                  "\n la microbiota intestinal benéfica, clave para una respuesta inmune saludable. Ajo y cúrcuma, el ajo tiene propiedades " +
                                                  "\n antimicrobianas naturales y la cúrcuma contiene curcumina, un potente antiinflamatorio que puede ayudar a reducir la  " +
                                                  "\n inflamación pulmonar. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que  " +
                                                  "\n el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda" +
                                                  "\n hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además" +
                                                  "\n por su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico,   " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores."); 
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visión borrosa, Pérdida de peso.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n El manejo de la diabetes en la adolescencia se basa en un control cuidadoso del estilo de vida, donde el ejercicio es un pilar." +
                                                  "\n Se recomienda realizar al menos 60 minutos de actividad física moderada a vigorosa la mayoría de los días, combinando          " +
                                                  "\n ejercicios aeróbicos (correr, nadar, bicicleta) con entrenamiento de fuerza, siempre monitoreando los niveles de glucosa antes," +
                                                  "\n durante y después del ejercicio para prevenir episodios de hipoglucemia o hiperglucemia. La hidratación es igualmente vital,   " +
                                                  "\n debiendo consumir de 2 a 3 litros de agua natural al día para mantener un buen funcionamiento metabólico y ayudar a los riñones" +
                                                  "\n a procesar el exceso de glucosa; es crucial evitar por completo las bebidas azucaradas y jugos. POSIBLE TRATAMIENTO:           " +
                                                  "\n El tratamiento para la diabetes es estrictamente individualizado y debe ser dirigido por un equipo médico, incluyendo un       " +
                                                  "\n endocrinólogo. Para la Diabetes Tipo 1, el tratamiento fundamental es la administración de insulina, usando combinaciones de   " +
                                                  "\n acción rápida para las comidas (marcas comunes en México: Humalog, Novolog) y de acción prolongada como basal (marcas: Lantus, " +
                                                  "\n Tresiba). Para la Diabetes Tipo 2, el manejo inicial suele ser con cambios en el estilo de vida y medicamentos orales, siendo  " +
                                                  "\n la metformina (marcas: Dabex, Glucophage) el más común para mejorar la sensibilidad a la insulina. En algunos casos, se pueden " +
                                                  "\n usar otros medicamentos o incluso requerir insulina según la evolución. La alimentación es la piedra angular del control       " +
                                                  "\n glucémico, priorizando alimentos de bajo índice glucémico, ricos en fibra y nutrientes, como: Avena integral y nopales, ambos  " +
                                                  "\n excepcionalmente ricos en fibra soluble que ralentiza la absorción de azúcar; una taza de nopal cocido aporta cerca de 5 gramos" +
                                                  "\n de fibra, ayudando a estabilizar la glucosa post-comida. Frijoles negros y lentejas, una fuente ideal de carbohidratos complejos," +
                                                  "\n proteína vegetal y fibra; una taza de frijoles negros contiene unos 15 gramos de fibra, más del 50% de la ingesta diaria       " +
                                                  "\n recomendada, lo que promueve una liberación de energía lenta y sostenida. Aguacate y nueces, ricos en grasas monoinsaturadas    " +
                                                  "\n saludables y fibra, que mejoran la saciedad y no elevan el azúcar en sangre; medio aguacate puede contener más de 5 gramos de fibra." +
                                                  "\n Pescados grasos como el salmón, excelente fuente de ácidos grasos Omega-3 (DHA y EPA) que ayudan a reducir la inflamación crónica " +
                                                  "\n asociada con la resistencia a la insulina. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100%" +
                                                  "\n que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más" +
                                                  "\n de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la   " +
                                                  "\n respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita  " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresión en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n El adolescente con asma debe mantenerse bien hidratado para ayudar a fluidificar las secreciones y facilitar la respiración. " +
                                                  "\n Se recomienda consumir entre 2 y 2.5 litros de agua al día (ocho a diez vasos de tamaño regular), especialmente antes, durante " +
                                                  "\n y después de la actividad física. El ejercicio es fundamental para fortalecer los músculos respiratorios y mejorar la capacidad" + 
                                                  "\n pulmonar, pero debe ser realizado con precaución y bajo supervisión médica. Se sugiere realizar actividades aeróbicas de bajo  " +
                                                  "\n impacto (como caminar, nadar o andar en bicicleta) durante al menos 30-60 minutos al día, evitando los desencadenantes conocidos" + 
                                                  "\n del asma (como alérgenos, aire frío o contaminado). Es importante llevar siempre consigo un inhalador de rescate y detener la  " +
                                                  "\n actividad si se presentan síntomas. POSIBLE TRATAMIENTO: El tratamiento para el asma en adolescentes generalmente incluye:     " +
                                                  "\n Broncodilatadores de acción rápida (para aliviar los síntomas agudos, como el salbutamol, marca común: Ventolin), Corticosteroides" + 
                                                  "\n inhalados (para controlar la inflamación a largo plazo, como la fluticasona, marca común: Flixotide) y Modificadores de leucotrienos" + 
                                                  "\n (para reducir la inflamación y la producción de moco, como el montelukast, marca común: Singulair). Es esencial seguir el plan de " +
                                                  "\n tratamiento prescrito por el médico y utilizar los medicamentos según las indicaciones. Además, una dieta saludable puede ayudar  " +
                                                  "\n a fortalecer el sistema inmunológico y reducir la inflamación. Se recomienda consumir alimentos ricos en antioxidantes y          " +
                                                  "\n antiinflamatorios, como frutas y verduras de colores vivos (manzanas, plátanos, bayas, espinacas, zanahorias), pescado azul (salmón," +
                                                  "\n atún, sardinas) y grasas saludables (aceite de oliva, aguacate, nueces). Estos alimentos proporcionan vitaminas, minerales y ácidos " +
                                                  "\n grasos omega-3, que pueden ayudar a proteger las vías respiratorias y a reducir la inflamación. Particularmente beneficiosos son:   " +
                                                  "\n Vitamina C (cítricos, kiwi, fresas): fortalece el sistema inmunológico y reduce la inflamación. Vitamina E (nueces, semillas, aceites" +
                                                  "\n vegetales): protege las células del daño y reduce la inflamación. Ácidos grasos omega-3 (pescado azul, semillas de lino, nueces):   " +
                                                  "\n reducen la inflamación de las vías respiratorias. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza" +
                                                  "\n al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda " +
                                                  "\n hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su     " +
                                                  "\n salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece" +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, Pérdida de peso, Ganglios linfáticos inflamados, Erupción cutánea (Diarrea).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n Es crucial que el adolescente con VIH/SIDA mantenga una hidratación adecuada para apoyar la función inmunológica y facilitar la absorción" +
                                                  "\n de medicamentos. Se recomienda consumir entre 2 y 2.5 litros de agua al día (ocho a diez vasos de tamaño regular). La actividad física es" +
                                                  "\n fundamental para mantener la masa muscular, mejorar el estado de ánimo y fortalecer el sistema inmunológico. Se sugiere realizar al menos" +
                                                  "\n 60 minutos de ejercicio moderado a vigoroso al día, incluyendo actividades aeróbicas (correr, nadar, bailar) y ejercicios de fuerza      " +
                                                  "\n (levantamiento de pesas ligero, bandas de resistencia). POSIBLE TRATAMIENTO: El tratamiento para el VIH/SIDA consiste en la terapia      " +
                                                  "\n antirretroviral (TAR), que ayuda a controlar la replicación del virus y a prevenir la progresión de la enfermedad. Algunos medicamentos  " +
                                                  "\n antirretrovirales comunes disponibles en México incluyen: Tenofovir (marca común: Viread), Emtricitabina (marca común: Emtriva), Efavirenz" +
                                                  "\n (marca común: Sustiva) y Dolutegravir (marca común: Tivicay). Es esencial seguir estrictamente las indicaciones del médico y tomar los   " +
                                                  "\n medicamentos según lo prescrito. Además, una alimentación saludable es fundamental para fortalecer el sistema inmunológico y mantener un " +
                                                  "\n peso saludable. Se recomienda consumir alimentos ricos en nutrientes, como frutas y verduras de colores vivos (bayas, cítricos, espinacas," +
                                                  "\n brócoli), proteínas magras (pollo, pescado, legumbres) y granos integrales (arroz integral, quinoa, avena). Estos alimentos proporcionan " +
                                                  "\n vitaminas, minerales y antioxidantes que ayudan a proteger las células del daño y a fortalecer el sistema inmunológico. Especialmente    " +
                                                  "\n importantes son: Vitamina C (cítricos, fresas, pimientos): fortalece el sistema inmunológico y ayuda a combatir las infecciones. Zinc    " +
                                                  "\n (carne, mariscos, nueces): esencial para la función inmunológica y la cicatrización de heridas. Proteínas (carne magra, pescado, legumbres):" +
                                                  "\n necesarias para la reparación de tejidos y la producción de anticuerpos. Este es solo un Diagnóstico predeterminado lógico, haberlo      " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas,      " +
                                                  "\n para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente," +
                                                  "\n además por su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes" +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreción anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea. " +
                                                  "\n El adolescente con gonorrea debe mantenerse bien hidratado para apoyar la función " +
                                                  "\n renal y facilitar la eliminación de toxinas. Se recomienda consumir entre 2 y 2.5 litros de agua al día (ocho a diez vasos de tamaño regular)." +
                                                  "\n No se requiere un régimen de ejercicio específico para el tratamiento de la gonorrea, pero mantener un estilo de vida activo y saludable      " +
                                                  "\n puede ayudar a fortalecer el sistema inmunológico. Se sugiere realizar al menos 30 minutos de actividad física moderada la mayoría de los     " +
                                                  "\n días de la semana. POSIBLE TRATAMIENTO: El tratamiento para la gonorrea generalmente consiste en antibióticos. Los antibióticos recomendados  " +
                                                  "\n para el tratamiento de la gonorrea incluyen: Ceftriaxona (administrada por inyección) y Azitromicina (administrada por vía oral). Es          " +
                                                  "\n fundamental completar el ciclo completo de antibióticos según las indicaciones del médico, incluso si los síntomas desaparecen antes.         " +
                                                  "\n Además, es importante evitar las relaciones sexuales hasta que tanto el adolescente como su pareja hayan completado el tratamiento y se       " +
                                                  "\n hayan realizado pruebas de seguimiento para confirmar que la infección ha sido eliminada. Una dieta saludable puede ayudar a fortalecer       " +
                                                  "\n el sistema inmunológico y a promover la curación. Se recomienda consumir alimentos ricos en vitaminas, minerales y antioxidantes, como        " +
                                                  "\n frutas y verduras de colores vivos (cítricos, bayas, espinacas, zanahorias), proteínas magras (pollo, pescado, legumbres) y granos integrales " +
                                                  "\n (arroz integral, quinoa, avena). En particular, se recomienda consumir alimentos ricos en: Vitamina C (cítricos, kiwi, fresas): fortalece     " +
                                                  "\n el sistema inmunológico y ayuda a combatir las infecciones. Zinc (carne, mariscos, nueces): esencial para la función inmunológica y la        " +
                                                  "\n cicatrización de heridas. Probióticos (yogur, kéfir, chucrut): ayudan a mantener un equilibrio saludable de bacterias en el intestino,        " +
                                                  "\n lo que puede fortalecer el sistema inmunológico. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al        " +
                                                  "\n 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer        " +
                                                  "\n más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la         " +
                                                  "\n respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a          " +
                                                  "\n la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linfáticos inflamados, Úlceras o llagas dolorosas, Picazón o ardor, Dolor al orinar.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n El adolescente con herpes genital debe mantener una hidratación adecuada para apoyar la función renal y facilitar la eliminación" +
                                                  "\n de toxinas. Se recomienda consumir entre 2 y 2.5 litros de agua al día (ocho a diez vasos de tamaño regular). No se requiere un " +
                                                  "\n régimen de ejercicio específico para el tratamiento del herpes genital, pero mantener un estilo de vida activo y saludable puede" + 
                                                  "\n ayudar a fortalecer el sistema inmunológico y reducir la frecuencia de los brotes. Se sugiere realizar al menos 30 minutos de   " +
                                                  "\n actividad física moderada la mayoría de los días de la semana. POSIBLE TRATAMIENTO: El tratamiento para el herpes genital generalmente" +
                                                  "\n consiste en medicamentos antivirales que ayudan a reducir la duración y la severidad de los brotes. Los medicamentos antivirales" +
                                                  "\n comunes para el herpes genital incluyen: Aciclovir (marca común: Zovirax), Valaciclovir (marca común: Valtrex) y Famciclovir    " +
                                                  "\n (marca común: Famvir). Es fundamental seguir las indicaciones del médico y tomar los medicamentos según lo prescrito. Además,   " +
                                                  "\n es importante evitar el contacto sexual durante los brotes para prevenir la transmisión del virus. Una dieta saludable puede    " +
                                                  "\n ayudar a fortalecer el sistema inmunológico y reducir la frecuencia de los brotes. Se recomienda consumir alimentos ricos en    " +
                                                  "\n vitaminas, minerales y antioxidantes, como frutas y verduras de colores vivos (cítricos, bayas, espinacas, zanahorias), proteínas" +
                                                  "\n magras (pollo, pescado, legumbres) y granos integrales (arroz integral, quinoa, avena). En particular, se recomienda consumir   " +
                                                  "\n alimentos ricos en: Lisina (presente en legumbres, pescado y pollo): un aminoácido que puede ayudar a prevenir la replicación   " +
                                                  "\n del virus del herpes. Vitamina C (cítricos, kiwi, fresas): con la papaya como una excelente opción, aportando aproximadamente   " +
                                                  "\n 60mg por cada 100g, cubriendo el 100% de la ingesta diaria recomendada, fortalece el sistema inmunológico y ayuda a combatir    " +
                                                  "\n las infecciones. Zinc (carne, mariscos, nueces): esencial para la función inmunológica y la cicatrización de heridas. Este es   " +
                                                  "\n solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que   " +
                                                  "\n por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para    " +
                                                  "\n establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnóstico no    " +
                                                  "\n le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y      " +
                                                  "\n espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Úlceras indoloras, Erupción cutánea, Dolor de cabeza, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Sífilis." +
                                                  "\n El adolescente con sífilis debe mantener una hidratación adecuada para apoyar la función renal y facilitar la eliminación" +
                                                  "\n de toxinas. Se recomienda consumir entre 2 y 2.5 litros de agua al día (ocho a diez vasos de tamaño regular). No se requiere" +
                                                  "\n un régimen de ejercicio específico para el tratamiento de la sífilis, pero mantener un estilo de vida activo y saludable " +
                                                  "\n puede ayudar a fortalecer el sistema inmunológico. Se sugiere realizar al menos 30 minutos de actividad física moderada  " +
                                                  "\n la mayoría de los días de la semana. POSIBLE TRATAMIENTO: El tratamiento para la sífilis generalmente consiste en        " +
                                                  "\n antibióticos, siendo la penicilina la opción más común y efectiva. La penicilina se administra por inyección intramuscular." +
                                                  "\n Es fundamental completar el ciclo completo de antibióticos según las indicaciones del médico, incluso si los síntomas    " +
                                                  "\n desaparecen antes. Además, es importante evitar las relaciones sexuales hasta que tanto el adolescente como su pareja    " +
                                                  "\n hayan completado el tratamiento y se hayan realizado pruebas de seguimiento para confirmar que la infección ha sido      " +
                                                  "\n eliminada. Una dieta saludable puede ayudar a fortalecer el sistema inmunológico y a promover la curación. Se recomienda " +
                                                  "\n consumir alimentos ricos en vitaminas, minerales y antioxidantes, como frutas y verduras de colores vivos (cítricos,     " +
                                                  "\n bayas, espinacas, zanahorias), proteínas magras (pollo, pescado, legumbres) y granos integrales. Estos últimos, como     " +
                                                  "\n la avena, proporcionan fibra y energía sostenida, además de contener alrededor de 10-11 gramos de proteína por cada      " +
                                                  "\n 100 gramos, contribuyendo a la reparación de tejidos y la función inmunológica. En particular, se recomienda consumir    " +
                                                  "\n alimentos ricos en: Vitamina C (cítricos, kiwi, fresas): fortalece el sistema inmunológico y ayuda a combatir las        " +
                                                  "\n infecciones. Zinc (carne, mariscos, nueces): esencial para la función inmunológica y la cicatrización de heridas.        " +
                                                  "\n Probióticos (yogur, kéfir, chucrut): ayudan a mantener un equilibrio saludable de bacterias en el intestino, lo que      " +
                                                  "\n puede fortalecer el sistema inmunológico. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no       " +
                                                  "\n garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas,    " +
                                                  "\n para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento         " +
                                                  "\n adecuado de su paciente, además por su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda   " +
                                                  "\n mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Pérdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n El adolescente con tuberculosis debe mantener una hidratación adecuada para apoyar la función renal y facilitar " +
                                                  "\n la eliminación de toxinas, especialmente debido a la medicación. Se recomienda consumir entre 2.5 y 3 litros de " +
                                                  "\n agua al día (diez a doce vasos de tamaño regular). La actividad física moderada es importante para mantener la  " +
                                                  "\n fuerza y la resistencia durante el tratamiento de la TB. Se sugiere realizar al menos 30-60 minutos de ejercicio" +
                                                  "\n aeróbico de bajo impacto (como caminar, nadar o andar en bicicleta) la mayoría de los días de la semana, siempre" +
                                                  "\n y cuando no haya contraindicaciones médicas. POSIBLE TRATAMIENTO: El tratamiento para la tuberculosis generalmente" +
                                                  "\n consiste en una combinación de antibióticos que se deben tomar durante un período prolongado, generalmente de 6 a" +
                                                  "\n 9 meses. Los medicamentos comunes utilizados en el tratamiento de la TB incluyen: Isoniazida, Rifampicina,       " +
                                                  "\n Pirazinamida y Etambutol. Es fundamental completar el ciclo completo de antibióticos según las indicaciones del  " +
                                                  "\n médico, incluso si los síntomas desaparecen antes. Además, es importante seguir una dieta saludable para apoyar  " +
                                                  "\n el sistema inmunológico y promover la curación. Se recomienda consumir alimentos ricos en vitaminas, minerales y " +
                                                  "\n antioxidantes, como frutas y verduras de colores vivos (cítricos, bayas, espinacas, zanahorias), proteínas magras" +
                                                  "\n (pollo, pescado, legumbres) y granos integrales. Estos últimos, como las zanahorias, son ricas en betacaroteno,  " +
                                                  "\n que el cuerpo convierte en vitamina A. Una zanahoria mediana (aproximadamente 61 gramos) proporciona alrededor   " +
                                                  "\n del 50% de la ingesta diaria recomendada de vitamina A, lo que es crucial para la función inmunológica y la salud" +
                                                  "\n de las membranas mucosas en los pulmones. En particular, se recomienda consumir alimentos ricos en: Vitamina D   " +
                                                  "\n (pescado graso, huevos, champiñones): ayuda a fortalecer el sistema inmunológico y a combatir las infecciones.   " +
                                                  "\n Zinc (carne, mariscos, nueces): esencial para la función inmunológica y la cicatrización de heridas. Proteínas   " +
                                                  "\n (carne magra, pescado, legumbres): necesarias para la reparación de tejidos y la producción de anticuerpos.      " +
                                                  "\n Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga " +
                                                  "\n esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más  " +
                                                  "\n de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además   " +
                                                  "\n por su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su      " +
                                                  "\n médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchazón en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis. " +
                                                  "\n El adolescente con artritis debe mantener una hidratación adecuada para ayudar a reducir la inflamación y mantener " +
                                                  "\n la flexibilidad de las articulaciones. Se recomienda consumir entre 2 y 2.5 litros de agua al día (ocho a diez     " +
                                                  "\n vasos de tamaño regular). La actividad física moderada es importante para mantener la fuerza muscular, la          " +
                                                  "\n flexibilidad y la movilidad articular. Se sugiere realizar ejercicios de bajo impacto (como caminar, nadar,        " +
                                                  "\n andar en bicicleta o yoga) durante al menos 30 minutos al día, adaptando la intensidad y duración a la tolerancia  " +
                                                  "\n individual y evitando movimientos que causen dolor excesivo. POSIBLE TRATAMIENTO: El tratamiento para la artritis  " +
                                                  "\n generalmente incluye una combinación de medicamentos para aliviar el dolor y la inflamación, así como terapias     " +
                                                  "\n para mejorar la función articular. Algunos medicamentos comunes utilizados en el tratamiento de la artritis incluyen:" +
                                                  "\n Analgésicos (como el paracetamol o el tramadol), Antiinflamatorios no esteroideos (AINEs, como el ibuprofeno o     " +
                                                  "\n el naproxeno) y Corticosteroides (como la prednisona). Además, en algunos casos, se pueden utilizar medicamentos   " +
                                                  "\n modificadores de la enfermedad (DMARDs, como el metotrexato o la sulfasalazina) para retrasar la progresión de     " +
                                                  "\n la artritis. Una dieta saludable puede ayudar a reducir la inflamación y a fortalecer los huesos y las articulaciones." +
                                                  "\n Se recomienda consumir alimentos ricos en antioxidantes, antiinflamatorios y calcio, como frutas y verduras de colores" +
                                                  "\n vivos (bayas, cítricos, espinacas, brócoli), pescado azul (salmón, atún, sardinas), lácteos (leche, yogur, queso)     " +
                                                  "\n y frutos secos. Por ejemplo, el salmón es una excelente fuente de ácidos grasos omega-3, que tienen propiedades      " +
                                                  "\n antiinflamatorias. Una porción de 100 gramos de salmón cocido proporciona aproximadamente 2.3 gramos de omega-3,     " +
                                                  "\n contribuyendo significativamente a la reducción de la inflamación en las articulaciones. En particular, se recomienda" +
                                                  "\n consumir alimentos ricos en: Calcio (lácteos, verduras de hoja verde, frutos secos): esencial para la salud ósea y   " +
                                                  "\n la prevención de la osteoporosis. Vitamina D (pescado graso, huevos, champiñones): ayuda a mejorar la absorción del  " +
                                                  "\n calcio y a fortalecer los huesos. Antioxidantes (frutas y verduras de colores vivos): protegen las células del daño  " +
                                                  "\n y reducen la inflamación. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% " +
                                                  "\n que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se     " +
                                                  "\n recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de      " +
                                                  "\n su paciente, además por su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho     " +
                                                  "\n consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n El adolescente con tosferina debe mantenerse bien hidratado para ayudar a fluidificar las secreciones y facilitar la " +
                                                  "\n expectoración. Se recomienda consumir entre 2 y 2.5 litros de agua al día (ocho a diez vasos de tamaño regular), así " +
                                                  "\n como bebidas calientes y sopas. El reposo es importante durante las fases agudas de la tosferina para permitir que el" +
                                                  "\n cuerpo se recupere. La actividad física debe ser limitada hasta que los síntomas mejoren. POSIBLE TRATAMIENTO: El    " +
                                                  "\n tratamiento para la tosferina generalmente incluye antibióticos, especialmente en las primeras etapas de la enfermedad," +
                                                  "\n para reducir la duración y la gravedad de los síntomas y prevenir la propagación de la infección. Los antibióticos     " +
                                                  "\n comunes utilizados en el tratamiento de la tosferina incluyen: Azitromicina, Claritromicina y Eritromicina. Es         " +
                                                  "\n fundamental completar el ciclo completo de antibióticos según las indicaciones del médico, incluso si los síntomas     " +
                                                  "\n desaparecen antes. Además, se pueden utilizar medicamentos para aliviar la tos, como jarabes para la tos de venta      " +
                                                  "\n libre o medicamentos recetados por el médico. Una dieta nutritiva puede ayudar a fortalecer el sistema inmunológico    " +
                                                  "\n y a promover la curación. Se recomienda consumir alimentos suaves y fáciles de tragar, como sopas, purés, yogur y      " +
                                                  "\n frutas blandas. En particular, se recomienda consumir alimentos ricos en: Vitamina C (cítricos, kiwi, fresas):         " +
                                                  "\n fortalece el sistema inmunológico y ayuda a combatir las infecciones. Miel (en mayores de 1 año): puede ayudar         " +
                                                  "\n a calmar la tos y aliviar el dolor de garganta. Caldo de pollo: proporciona hidratación, nutrientes y calor reconfortante." +
                                                  "\n El caldo de pollo, por ejemplo, es una fuente de sodio y potasio, electrolitos que se pierden a través de la sudoración,  " +
                                                  "\n y también contiene pequeñas cantidades de aminoácidos que pueden ayudar a fortalecer el sistema inmunológico. Una taza de " +
                                                  "\n caldo de pollo (aproximadamente 240 ml) puede proporcionar alrededor del 10% de la ingesta diaria recomendada de sodio.   " +
                                                  "\n Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa      " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un         " +
                                                  "\n Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su           " +
                                                  "\n salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico,              " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchazón de las glándulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n El adolescente con paperas debe mantenerse bien hidratado para ayudar a reducir la fiebre y facilitar la eliminación de " +
                                                  "\n toxinas. Se recomienda consumir entre 2 y 2.5 litros de agua al día (ocho a diez vasos de tamaño regular), así como     " +
                                                  "\n bebidas suaves y no ácidas. El reposo es importante durante las fases agudas de las paperas para permitir que el cuerpo " +
                                                  "\n se recupere. La actividad física debe ser limitada hasta que los síntomas mejoren, especialmente la inflamación de las  " +
                                                  "\n glándulas salivales. POSIBLE TRATAMIENTO: No existe un tratamiento específico para las paperas, ya que es una enfermedad" +
                                                  "\n viral que generalmente se resuelve por sí sola en un plazo de 1 a 2 semanas. El tratamiento se centra en aliviar los    " +
                                                  "\n síntomas y prevenir complicaciones. Algunas medidas para aliviar los síntomas incluyen: Analgésicos de venta libre      " +
                                                  "\n (como el paracetamol o el ibuprofeno) para reducir la fiebre y el dolor, Compresas frías en las glándulas salivales     " +
                                                  "\n inflamadas para reducir el dolor y la hinchazón y Enjuagues bucales con agua salada tibia para aliviar la irritación    " +
                                                  "\n de la boca y la garganta. Una dieta suave y nutritiva puede ayudar a fortalecer el sistema inmunológico y a promover    " +
                                                  "\n la curación. Se recomienda consumir alimentos blandos y fáciles de masticar, como sopas, purés, yogur y frutas blandas. " +
                                                  "\n En particular, se recomienda consumir alimentos ricos en: Vitamina C (cítricos, kiwi, fresas): fortalece el sistema     " +
                                                  "\n inmunológico y ayuda a combatir las infecciones. Probióticos (yogur, kéfir, chucrut): ayudan a mantener un equilibrio   " +
                                                  "\n saludable de bacterias en el intestino, lo que puede fortalecer el sistema inmunológico. Alimentos ricos en antioxidantes" +
                                                  "\n (frutas y verduras de colores vivos): protegen las células del daño y reducen la inflamación. Los cítricos, como las    " +
                                                  "\n naranjas, son una excelente fuente de vitamina C, con una naranja mediana proporcionando alrededor del 70% de la ingesta" +
                                                  "\n diaria recomendada, lo que ayuda a fortalecer el sistema inmunológico y a combatir las infecciones. Este es solo un     " +
                                                  "\n Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que   " +
                                                  "\n por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida " +
                                                  "\n para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del      " +
                                                  "\n Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita    " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupción cutánea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n El adolescente con Zika debe mantenerse bien hidratado para ayudar a reducir la fiebre y facilitar la eliminación del" +
                                                  "\n virus. Se recomienda consumir entre 2.5 y 3 litros de agua al día (diez a doce vasos de tamaño regular), así como    " +
                                                  "\n bebidas con electrolitos para reponer los líquidos perdidos debido a la fiebre y la sudoración. El reposo es importante" +
                                                  "\n durante la fase aguda de la infección por Zika para permitir que el cuerpo se recupere. La actividad física debe ser   " +
                                                  "\n limitada hasta que los síntomas mejoren. POSIBLE TRATAMIENTO: No existe un tratamiento específico para la infección    " +
                                                  "\n por el virus del Zika. El tratamiento se centra en aliviar los síntomas y prevenir complicaciones. Algunas medidas     " +
                                                  "\n para aliviar los síntomas incluyen: Analgésicos de venta libre (como el paracetamol) para reducir la fiebre y el dolor," +
                                                  "\n Reposo y evitar la picadura de mosquitos para prevenir la propagación del virus y Monitoreo para detectar posibles     " +
                                                  "\n complicaciones, como el síndrome de Guillain-Barré. Una dieta nutritiva puede ayudar a fortalecer el sistema inmunológico" +
                                                  "\n y a promover la recuperación. Se recomienda consumir alimentos ricos en vitaminas, minerales y antioxidantes, como frutas" +
                                                  "\n y verduras de colores vivos (cítricos, bayas, espinacas, brócoli), proteínas magras (pollo, pescado, legumbres) y granos " +
                                                  "\n integrales. En particular, se recomienda consumir alimentos ricos en: Vitamina C (cítricos, kiwi, fresas): fortalece el  " +
                                                  "\n sistema inmunológico y ayuda a combatir las infecciones. Proteínas (carne magra, pescado, legumbres): necesarias para la " +
                                                  "\n reparación de tejidos y la producción de anticuerpos. Alimentos ricos en antioxidantes (frutas y verduras de colores vivos):" +
                                                  "\n protegen las células del daño y reducen la inflamación. Las espinacas, por ejemplo, son una excelente fuente de antioxidantes," +
                                                  "\n como la vitamina A y la vitamina C. Una porción de 100 gramos de espinacas crudas proporciona aproximadamente el 47% de la  " +
                                                  "\n ingesta diaria recomendada de vitamina A, que es importante para la función inmunológica y la salud de las células. Este es " +
                                                  "\n solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y   " +
                                                  "\n que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida " +
                                                  "\n para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del          " +
                                                  "\n Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita        " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, Vómitos, Deshidratación, Dolor abdominal.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n El adolescente con rotavirus debe mantenerse bien hidratado para prevenir la deshidratación debido a la diarrea y los" +
                                                  "\n vómitos. Se recomienda consumir entre 3 y 3.5 litros de líquidos al día (doce a catorce vasos de tamaño regular),    " +
                                                  "\n incluyendo soluciones de rehidratación oral (SRO) para reponer los electrolitos perdidos. El reposo es importante    " +
                                                  "\n durante la fase aguda de la infección por rotavirus para permitir que el cuerpo se recupere. La actividad física     " +
                                                  "\n debe ser limitada hasta que los síntomas mejoren. POSIBLE TRATAMIENTO: No existe un tratamiento específico para la   " +
                                                  "\n infección por rotavirus. El tratamiento se centra en prevenir la deshidratación y aliviar los síntomas. Algunas medidas" +
                                                  "\n para aliviar los síntomas incluyen: Soluciones de rehidratación oral (SRO) para reponer los líquidos y electrolitos   " +
                                                  "\n perdidos, Probióticos para ayudar a restaurar el equilibrio de la flora intestinal y Analgésicos de venta libre (como " +
                                                  "\n el paracetamol) para reducir la fiebre y el malestar. Una dieta suave y fácil de digerir puede ayudar a reducir los   " +
                                                  "\n síntomas gastrointestinales. Se recomienda consumir alimentos como: Arroz blanco: fácil de digerir y ayuda a absorber " +
                                                  "\n el exceso de líquidos en el intestino. Plátanos: ricos en potasio, un electrolito importante que se pierde debido a la" +
                                                  "\n diarrea y los vómitos. Tostadas: también fáciles de digerir y pueden ayudar a reducir las náuseas. El plátano, por    " +
                                                  "\n ejemplo, es una excelente fuente de potasio. Un plátano mediano proporciona aproximadamente el 12% de la ingesta      " +
                                                  "\n diaria recomendada de potasio, lo que ayuda a reponer los electrolitos perdidos debido a la diarrea y los vómitos     " +
                                                  "\n y a mantener el equilibrio de líquidos en el cuerpo. Este es solo un Diagnóstico predeterminado lógico, haberlo       " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas    " +
                                                  "\n estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en    " +
                                                  "\n el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnóstico no le satisface del todo  " +
                                                  "\n se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, Náuseas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n El adolescente con listeriosis debe mantenerse bien hidratado para ayudar a combatir la infección y prevenir   " +
                                                  "\n complicaciones. Se recomienda consumir entre 2.5 y 3 litros de agua al día (diez a doce vasos de tamaño regular)." +
                                                  "\n El reposo es importante durante la fase aguda de la infección por Listeria para permitir que el cuerpo se recupere." +
                                                  "\n La actividad física debe ser limitada hasta que los síntomas mejoren. POSIBLE TRATAMIENTO: El tratamiento para la " +
                                                  "\n listeriosis generalmente consiste en antibióticos, especialmente en casos graves o en personas con sistemas       " +
                                                  "\n inmunológicos debilitados. Los antibióticos comunes utilizados en el tratamiento de la listeriosis incluyen:      " +
                                                  "\n Ampicilina y Gentamicina (a menudo administradas en combinación). Es fundamental completar el ciclo completo      " +
                                                  "\n de antibióticos según las indicaciones del médico, incluso si los síntomas desaparecen antes. Una dieta nutritiva " +
                                                  "\n puede ayudar a fortalecer el sistema inmunológico y a promover la curación. Se recomienda consumir alimentos      " +
                                                  "\n ricos en vitaminas, minerales y antioxidantes, así como probióticos para ayudar a restaurar el equilibrio de      " +
                                                  "\n la flora intestinal. En particular, se recomienda consumir alimentos como: Yogur: rico en probióticos, que        " +
                                                  "\n pueden ayudar a fortalecer el sistema inmunológico y a combatir la infección. Ajo: contiene compuestos con        " + 
                                                  "\n propiedades antibacterianas y antivirales que pueden ayudar a combatir la Listeria. Vitamina C (cítricos, kiwi,   " +
                                                  "\n fresas): fortalece el sistema inmunológico y ayuda a combatir las infecciones. El ajo, por ejemplo, contiene      " +
                                                  "\n alicina, un compuesto con propiedades antibacterianas y antivirales. Un diente de ajo (aproximadamente 3 gramos)  " +
                                                  "\n contiene aproximadamente 0.1 gramos de alicina, lo que puede ayudar a fortalecer el sistema inmunológico y a      " +
                                                  "\n combatir la Listeria. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al       " +
                                                  "\n 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para     " +
                                                  "\n ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento       " +
                                                  "\n adecuado de su paciente, además por su salud si la respuesta del Diagnóstico no le satisface del todo se le       " +
                                                  "\n recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, Vómitos.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n El adolescente con shigelosis debe mantenerse bien hidratado para prevenir la deshidratación debido a la diarrea " +
                                                  "\n y los vómitos. Se recomienda consumir entre 3 y 3.5 litros de líquidos al día (doce a catorce vasos de tamaño    " +
                                                  "\n regular), incluyendo soluciones de rehidratación oral (SRO) para reponer los electrolitos perdidos. El reposo    " +
                                                  "\n es importante durante la fase aguda de la shigelosis para permitir que el cuerpo se recupere. La actividad       " +
                                                  "\n física debe ser limitada hasta que los síntomas mejoren. POSIBLE TRATAMIENTO: En casos leves, la shigelosis      " +
                                                  "\n puede resolverse por sí sola con reposo y líquidos. Sin embargo, en casos más graves o en personas con sistemas  " +
                                                  "\n inmunológicos debilitados, se pueden utilizar antibióticos para reducir la duración de la enfermedad y prevenir  " +
                                                  "\n complicaciones. Los antibióticos comunes utilizados en el tratamiento de la shigelosis incluyen: Azitromicina y  " +
                                                  "\n Ciprofloxacino. Es fundamental completar el ciclo completo de antibióticos según las indicaciones del médico,    " +
                                                  "\n incluso si los síntomas desaparecen antes. Una dieta suave y fácil de digerir puede ayudar a reducir los síntomas" +
                                                  "\n gastrointestinales. Se recomienda consumir alimentos como: Arroz blanco: fácil de digerir y ayuda a absorber el  " +
                                                  "\n exceso de líquidos en el intestino. Tostadas: también fáciles de digerir y pueden ayudar a reducir las náuseas.  " +
                                                  "\n Plátanos: ricos en potasio, un electrolito importante que se pierde debido a la diarrea y los vómitos. El arroz  " +
                                                  "\n blanco, por ejemplo, es un carbohidrato de fácil digestión que proporciona energía al cuerpo sin sobrecargar el  " +
                                                  "\n sistema digestivo. Una taza de arroz blanco cocido proporciona aproximadamente 45 gramos de carbohidratos, lo que" +
                                                  "\n ayuda a mantener los niveles de energía durante la enfermedad. Este es solo un Diagnóstico predeterminado lógico," +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus  " +
                                                  "\n respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor " +
                                                  "\n seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnóstico no le   " +
                                                  "\n satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app      " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos crónica, Producción excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad Pulmonar Obstructiva Crónica (EPOC)." +
                                                  "\n El adolescente con EPOC debe mantenerse bien hidratado para ayudar a fluidificar las secreciones y facilitar la " +
                                                  "\n expectoración. Se recomienda consumir entre 2 y 2.5 litros de agua al día (ocho a diez vasos de tamaño regular)," +
                                                  "\n evitando las bebidas azucaradas y con gas. La actividad física es importante para mantener la fuerza muscular,  " +
                                                  "\n la resistencia y la capacidad pulmonar. Se sugiere realizar ejercicios de bajo impacto (como caminar, nadar o   " +
                                                  "\n andar en bicicleta) durante al menos 30 minutos al día, adaptando la intensidad y duración a la tolerancia      " +
                                                  "\n individual y evitando los desencadenantes conocidos de la EPOC (como el humo del tabaco, la contaminación o     " +
                                                  "\n el aire frío). POSIBLE TRATAMIENTO: El tratamiento para la EPOC generalmente incluye una combinación de         " +
                                                  "\n medicamentos para aliviar los síntomas y prevenir las exacerbaciones, así como terapias para mejorar la         " +
                                                  "\n función pulmonar. Algunos medicamentos comunes utilizados en el tratamiento de la EPOC incluyen: Broncodilatadores" +
                                                  "\n (como el salbutamol o el tiotropio), Corticosteroides inhalados (como la fluticasona o la budesonida) y Inhibidores" +
                                                  "\n de la fosfodiesterasa-4 (como el roflumilast). Además, en algunos casos, se puede utilizar la oxigenoterapia para  " +
                                                  "\n aumentar los niveles de oxígeno en la sangre. Una dieta saludable puede ayudar a fortalecer el sistema inmunológico" +
                                                  "\n y a mantener un peso saludable. Se recomienda consumir alimentos ricos en antioxidantes, proteínas y grasas       " +
                                                  "\n saludables, como frutas y verduras de colores vivos (bayas, cítricos, espinacas, brócoli), proteínas magras       " +
                                                  "\n (pollo, pescado, legumbres) y frutos secos. En particular, se recomienda consumir alimentos ricos en:             " +
                                                  "\n Vitamina C (cítricos, kiwi, fresas): fortalece el sistema inmunológico y ayuda a combatir las infecciones.        " +
                                                  "\n Vitamina E (aceites vegetales, frutos secos, semillas): protege las células del daño y reduce la inflamación.     " +
                                                  "\n Ácidos grasos omega-3 (pescado azul, semillas de lino, nueces): reducen la inflamación de las vías respiratorias. " +
                                                  "\n Las semillas de lino, por ejemplo, son una excelente fuente de ácidos grasos omega-3. Una cucharada de semillas   " +
                                                  "\n de lino molidas proporciona aproximadamente 1.6 gramos de omega-3, lo que puede ayudar a reducir la inflamación   " +
                                                  "\n de las vías respiratorias y a mejorar la función pulmonar. Este es solo un Diagnóstico predeterminado lógico,     " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus   " +
                                                  "\n respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor  " +
                                                  "\n seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnóstico no le    " +
                                                  "\n satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app       " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreción anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n El adolescente con clamidia debe mantenerse bien hidratado para apoyar la función renal y facilitar la eliminación" +
                                                  "\n de toxinas. Se recomienda consumir entre 2 y 2.5 litros de agua al día (ocho a diez vasos de tamaño regular).     " +
                                                  "\n No se requiere un régimen de ejercicio específico para el tratamiento de la clamidia, pero mantener un estilo     " +
                                                  "\n de vida activo y saludable puede ayudar a fortalecer el sistema inmunológico. Se sugiere realizar al menos 30     " +
                                                  "\n minutos de actividad física moderada la mayoría de los días de la semana. POSIBLE TRATAMIENTO: El tratamiento     " +
                                                  "\n para la clamidia generalmente consiste en antibióticos. Los antibióticos comunes utilizados en el tratamiento     " +
                                                  "\n de la clamidia incluyen: Azitromicina (administrada en una sola dosis) y Doxiciclina (administrada dos veces      " + 
                                                  "\n al día durante 7 días). Es fundamental completar el ciclo completo de antibióticos según las indicaciones del     " +
                                                  "\n médico, incluso si los síntomas desaparecen antes. Además, es importante evitar las relaciones sexuales hasta     " +
                                                  "\n que tanto el adolescente como su pareja hayan completado el tratamiento y se hayan realizado pruebas de seguimiento" +
                                                  "\n para confirmar que la infección ha sido eliminada. Una dieta saludable puede ayudar a fortalecer el sistema       " +
                                                  "\n inmunológico y a promover la curación. Se recomienda consumir alimentos ricos en vitaminas, minerales y antioxidantes," +
                                                  "\n como frutas y verduras de colores vivos (cítricos, bayas, espinacas, zanahorias), proteínas magras (pollo, pescado, " +
                                                  "\n legumbres) y granos integrales. En particular, se recomienda consumir alimentos ricos en: Vitamina C (cítricos,     " +
                                                  "\n kiwi, fresas): fortalece el sistema inmunológico y ayuda a combatir las infecciones. Zinc (carne, mariscos, nueces):" +
                                                  "\n esencial para la función inmunológica y la cicatrización de heridas. Probióticos (yogur, kéfir, chucrut): ayudan    " +
                                                  "\n a mantener un equilibrio saludable de bacterias en el intestino, lo que puede fortalecer el sistema inmunológico.   " +
                                                  "\n El yogur, por ejemplo, es una excelente fuente de probióticos, bacterias beneficiosas que ayudan a mantener un      " +
                                                  "\n equilibrio saludable en el intestino. Una porción de 150 gramos de yogur proporciona aproximadamente 10^7 a 10^9    " +
                                                  "\n unidades formadoras de colonias (UFC) de probióticos, lo que puede fortalecer el sistema inmunológico y ayudar      " +
                                                  "\n a combatir la infección por clamidia. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no      " +
                                                  "\n garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas," +
                                                  "\n para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento    " +
                                                  "\n adecuado de su paciente, además por su salud si la respuesta del Diagnóstico no le satisface del todo se le         " +
                                                  "\n recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Náuseas, Dolor de cabeza severo, Rigidez en el cuello, Confusión.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis Bacteriana." +
                                                  "\n El adolescente con meningitis bacteriana requiere hospitalización y atención médica inmediata. La hidratación  " +
                                                  "\n intravenosa es fundamental para mantener la presión arterial y prevenir la deshidratación. La cantidad de      " +
                                                  "\n líquidos administrados dependerá de la condición del paciente y de las indicaciones del médico. El reposo      " +
                                                  "\n absoluto es esencial durante la fase aguda de la meningitis bacteriana para permitir que el cuerpo se recupere " +
                                                  "\n y minimizar el riesgo de complicaciones. POSIBLE TRATAMIENTO: El tratamiento para la meningitis bacteriana     " +
                                                  "\n consiste en antibióticos intravenosos de amplio espectro para combatir la infección. Los antibióticos comunes  " +
                                                  "\n utilizados en el tratamiento de la meningitis bacteriana incluyen: Ceftriaxona, Vancomicina y Meropenem. Además," +
                                                  "\n se pueden administrar corticosteroides para reducir la inflamación del cerebro y prevenir complicaciones       " +
                                                  "\n neurológicas. Una vez superada la fase aguda de la enfermedad, una dieta nutritiva puede ayudar a fortalecer    " +
                                                  "\n el sistema inmunológico y a promover la recuperación. Se recomienda consumir alimentos ricos en vitaminas,      " +
                                                  "\n minerales y antioxidantes, como frutas y verduras de colores vivos (cítricos, bayas, espinacas, brócoli),       " +
                                                  "\n proteínas magras (pollo, pescado, legumbres) y granos integrales. En particular, se recomienda consumir alimentos " +
                                                  "\n ricos en: Vitamina D (pescado graso, huevos, champiñones): ayuda a fortalecer el sistema inmunológico y a       " +
                                                  "\n combatir las infecciones. Zinc (carne, mariscos, nueces): esencial para la función inmunológica y la cicatrización" +
                                                  "\n de heridas. Probióticos (yogur, kéfir, chucrut): ayudan a mantener un equilibrio saludable de bacterias en el    " +
                                                  "\n intestino, lo que puede fortalecer el sistema inmunológico. Los champiñones, por ejemplo, son una buena fuente   " +
                                                  "\n de vitamina D. Una porción de 100 gramos de champiñones proporciona aproximadamente el 50% de la ingesta diaria  " +
                                                  "\n recomendada de vitamina D, lo que ayuda a fortalecer el sistema inmunológico y a combatir las infecciones.       " +
                                                  "\n Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente       " +
                                                  "\n tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda      " +
                                                  "\n hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente," +
                                                  "\n además por su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar    " +
                                                  "\n a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, Pérdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, Pérdida de apetito.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Cáncer." +
                                                  "\n El adolescente con cáncer requiere un enfoque individualizado que depende del tipo de cáncer, el estadio de la " +
                                                  "\n enfermedad y el tratamiento específico. La hidratación adecuada es fundamental para apoyar la función renal y  " +
                                                  "\n facilitar la eliminación de toxinas, especialmente durante la quimioterapia y la radioterapia. La cantidad de  " +
                                                  "\n líquidos recomendada dependerá de las necesidades individuales del paciente y de las indicaciones del médico.  " +
                                                  "\n La actividad física puede ayudar a mejorar la calidad de vida, reducir la fatiga y fortalecer el sistema       " +
                                                  "\n inmunológico. Se sugiere realizar ejercicios de bajo impacto (como caminar, nadar o yoga) durante al menos      " +
                                                  "\n 30 minutos al día, adaptando la intensidad y duración a la tolerancia individual y evitando los desencadenantes  " +
                                                  "\n conocidos de la fatiga (como el estrés, la falta de sueño o la deshidratación). POSIBLE TRATAMIENTO: El tratamiento" +
                                                  "\n para el cáncer puede incluir una combinación de cirugía, quimioterapia, radioterapia, inmunoterapia y terapia      " +
                                                  "\n dirigida. La elección del tratamiento dependerá del tipo de cáncer, el estadio de la enfermedad y las características" +
                                                  "\n individuales del paciente. Una dieta nutritiva es fundamental para apoyar el sistema inmunológico, mantener un       " +
                                                  "\n peso saludable y prevenir la desnutrición. Se recomienda consumir alimentos ricos en proteínas, vitaminas, minerales " +
                                                  "\n y antioxidantes, como frutas y verduras de colores vivos (bayas, cítricos, espinacas, brócoli), proteínas magras      " +
                                                  "\n (pollo, pescado, legumbres) y grasas saludables (aceite de oliva, aguacate, nueces). En particular, se recomienda     " +
                                                  "\n consumir alimentos ricos en: Proteínas (carne magra, pescado, legumbres): necesarias para la reparación de tejidos    " +
                                                  "\n y la producción de anticuerpos. Antioxidantes (frutas y verduras de colores vivos): protegen las células del daño     " +
                                                  "\n y reducen la inflamación. Grasas saludables (aceite de oliva, aguacate, nueces): proporcionan energía y ayudan a      " +
                                                  "\n mantener un peso saludable. El brócoli, por ejemplo, es una excelente fuente de antioxidantes, como la vitamina C     " +
                                                  "\n y el sulforafano. Una porción de 100 gramos de brócoli cocido proporciona aproximadamente el 89% de la ingesta        " +
                                                  "\n diaria recomendada de vitamina C, que ayuda a fortalecer el sistema inmunológico y a proteger las células del daño.   " +
                                                  "\n Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga      " +
                                                  "\n esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de    " +
                                                  "\n un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su    " +
                                                  "\n salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico,          " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            
                        }
                        if(EstaturaMasculino.equals("1.45-1.70 m")){
                           if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza (gripe)." +
                                                  "\n El adolescente con influenza debe mantenerse bien hidratado para ayudar a reducir la fiebre, fluidificar las secreciones " +
                                                  "\n y facilitar la expectoración. Se recomienda consumir entre 2.5 y 3 litros de líquidos al día (diez a doce vasos de tamaño" +
                                                  "\n regular), incluyendo agua, jugos de frutas, caldos y sopas. El reposo es importante durante la fase aguda de la influenza" +
                                                  "\n para permitir que el cuerpo se recupere. La actividad física debe ser limitada hasta que los síntomas mejoren.           " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento para la influenza generalmente se centra en aliviar los síntomas y prevenir          " +
                                                  "\n complicaciones. Algunas medidas para aliviar los síntomas incluyen: Analgésicos de venta libre (como el paracetamol      " +
                                                  "\n o el ibuprofeno) para reducir la fiebre y el dolor, Descongestionantes nasales para aliviar la congestión nasal y        " +
                                                  "\n Antitusígenos para aliviar la tos. En algunos casos, el médico puede recetar medicamentos antivirales (como el oseltamivir" +
                                                  "\n o el zanamivir) para reducir la duración de la enfermedad y prevenir complicaciones, especialmente en personas con alto   " +
                                                  "\n riesgo de complicaciones. Una dieta nutritiva puede ayudar a fortalecer el sistema inmunológico y a promover la curación. " +
                                                  "\n Se recomienda consumir alimentos ricos en vitaminas, minerales y antioxidantes, como frutas y verduras de colores vivos   " +
                                                  "\n (cítricos, bayas, espinacas, brócoli), proteínas magras (pollo, pescado, legumbres) y caldos y sopas. En particular, se   " +
                                                  "\n recomienda consumir alimentos ricos en: Vitamina C (cítricos, kiwi, fresas): fortalece el sistema inmunológico y ayuda    " +
                                                  "\n a combatir las infecciones. Zinc (carne, mariscos, nueces): esencial para la función inmunológica y la cicatrización de   " +
                                                  "\n heridas. Caldo de pollo: proporciona hidratación, nutrientes y calor reconfortante. El caldo de pollo, por ejemplo,       " +
                                                  "\n contiene cisteína, un aminoácido que puede ayudar a fluidificar las secreciones y facilitar la expectoración. Una taza    " +
                                                  "\n de caldo de pollo proporciona aproximadamente 200 mg de cisteína, lo que puede ayudar a aliviar los síntomas de la influenza." +
                                                  "\n Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa      " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un         " +
                                                  "\n Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud     " +
                                                  "\n si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes     " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                               textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumonía." +
                                                  "\n El adolescente con neumonía debe mantenerse bien hidratado para ayudar a fluidificar las secreciones y facilitar la " +
                                                  "\n expectoración. Se recomienda consumir entre 2.5 y 3 litros de líquidos al día (diez a doce vasos de tamaño regular)," +
                                                  "\n incluyendo agua, jugos de frutas, caldos y sopas. El reposo es importante durante la fase aguda de la neumonía para " +
                                                  "\n permitir que el cuerpo se recupere. La actividad física debe ser limitada hasta que los síntomas mejoren.           " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento para la neumonía generalmente consiste en antibióticos para combatir la infección" +
                                                  "\n bacteriana. Los antibióticos comunes utilizados en el tratamiento de la neumonía incluyen: Amoxicilina, Azitromicina " +
                                                  "\n y Ceftriaxona. Es fundamental completar el ciclo completo de antibióticos según las indicaciones del médico, incluso " +
                                                  "\n si los síntomas desaparecen antes. Además, se pueden utilizar medicamentos para aliviar los síntomas, como analgésicos" +
                                                  "\n para reducir la fiebre y el dolor, y expectorantes para facilitar la expectoración. Una dieta nutritiva puede ayudar a" +
                                                  "\n fortalecer el sistema inmunológico y a promover la curación. Se recomienda consumir alimentos ricos en vitaminas,     " +
                                                  "\n minerales y antioxidantes, como frutas y verduras de colores vivos (cítricos, bayas, espinacas, brócoli), proteínas   " +
                                                  "\n magras (pollo, pescado, legumbres) y caldos y sopas. En particular, se recomienda consumir alimentos ricos en: Vitamina C" + 
                                                  "\n (cítricos, kiwi, fresas): fortalece el sistema inmunológico y ayuda a combatir las infecciones. Zinc (carne, mariscos,  " +
                                                  "\n nueces): esencial para la función inmunológica y la cicatrización de heridas. Caldo de pollo: proporciona hidratación,  " +
                                                  "\n nutrientes y calor reconfortante. La espinaca, por ejemplo, es una excelente fuente de vitamina A, vitamina C y antioxidantes." +
                                                  "\n Una porción de 100 gramos de espinaca cocida proporciona aproximadamente el 50% de la ingesta diaria recomendada de      " +
                                                  "\n vitamina A, que es importante para la función inmunológica y la salud de las membranas mucosas en los pulmones. Este     " +
                                                  "\n es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad" +
                                                  "\n y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico        " +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta " +
                                                  "\n del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu         " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores."); 
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visión borrosa, Pérdida de peso.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n El adolescente con diabetes debe mantener una hidratación adecuada para ayudar a regular los niveles de azúcar en la " +
                                                  "\n sangre y prevenir la deshidratación. Se recomienda consumir entre 2 y 2.5 litros de agua al día (ocho a diez vasos de" +
                                                  "\n tamaño regular), evitando las bebidas azucaradas y con gas. La actividad física es fundamental para controlar los    " +
                                                  "\n niveles de azúcar en la sangre, mejorar la sensibilidad a la insulina y mantener un peso saludable. Se sugiere realizar" +
                                                  "\n al menos 60 minutos de ejercicio moderado a vigoroso al día, incluyendo actividades aeróbicas (como caminar, correr, " +
                                                  "\n nadar o andar en bicicleta) y ejercicios de fuerza (como levantamiento de pesas ligero o ejercicios con bandas de    " +
                                                  "\n resistencia). POSIBLE TRATAMIENTO: El tratamiento para la diabetes generalmente incluye una combinación de dieta,    " +
                                                  "\n ejercicio y medicamentos para controlar los niveles de azúcar en la sangre. Algunos medicamentos comunes utilizados  " +
                                                  "\n en el tratamiento de la diabetes incluyen: Metformina, Insulina y Sulfonilureas. Es fundamental seguir las indicaciones" +
                                                  "\n del médico y controlar regularmente los niveles de azúcar en la sangre. Una dieta saludable es fundamental para controlar" +
                                                  "\n los niveles de azúcar en la sangre, mantener un peso saludable y prevenir complicaciones. Se recomienda consumir alimentos" +
                                                  "\n ricos en fibra, vitaminas y minerales, como verduras de hoja verde (espinacas, lechuga, acelgas), frutas bajas en azúcar " +
                                                  "\n (bayas, manzanas, peras), proteínas magras (pollo, pescado, legumbres) y granos integrales (arroz integral, quinoa, avena)." +
                                                  "\n En particular, se recomienda consumir alimentos ricos en: Fibra (verduras, frutas, granos integrales): ayuda a regular los" +
                                                  "\n niveles de azúcar en la sangre y a mejorar la digestión. Cromo (brócoli, levadura de cerveza, champiñones): ayuda a mejorar" +
                                                  "\n la sensibilidad a la insulina. Magnesio (verduras de hoja verde, frutos secos, semillas): ayuda a regular los niveles de   " +
                                                  "\n azúcar en la sangre y a prevenir complicaciones. Las espinacas, por ejemplo, son una excelente fuente de magnesio. Una     " +
                                                  "\n porción de 100 gramos de espinacas cocidas proporciona aproximadamente el 20% de la ingesta diaria recomendada de magnesio," +
                                                  "\n lo que ayuda a regular los niveles de azúcar en la sangre y a prevenir complicaciones de la diabetes. Este es solo un      " +
                                                  "\n Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que      " +
                                                  "\n por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida    " +
                                                  "\n para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del         " +
                                                  "\n Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita       " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresión en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n El adolescente con asma debe mantenerse bien hidratado para ayudar a fluidificar las secreciones y facilitar la respiración. " +
                                                  "\n Se recomienda consumir entre 2 y 2.5 litros de agua al día (ocho a diez vasos de tamaño regular), evitando las bebidas frías " +
                                                  "\n y con gas. La actividad física es fundamental para fortalecer los músculos respiratorios y mejorar la capacidad pulmonar,    " +
                                                  "\n pero debe ser realizada con precaución y bajo supervisión médica. Se sugiere realizar ejercicios de bajo impacto (como caminar," +
                                                  "\n nadar o andar en bicicleta) durante al menos 30-60 minutos al día, evitando los desencadenantes conocidos del asma (como       " +
                                                  "\n alérgenos, aire frío o contaminación) y llevando siempre consigo un inhalador de rescate. POSIBLE TRATAMIENTO: El tratamiento  " +
                                                  "\n para el asma generalmente incluye una combinación de medicamentos para controlar la inflamación y abrir las vías respiratorias." +
                                                  "\n Algunos medicamentos comunes utilizados en el tratamiento del asma incluyen: Corticosteroides inhalados (como la fluticasona   " +
                                                  "\n o la budesonida) para reducir la inflamación de las vías respiratorias, Broncodilatadores de acción rápida (como el salbutamol)" +
                                                  "\n para abrir las vías respiratorias durante un ataque de asma y Modificadores de leucotrienos (como el montelukast) para reducir " +
                                                  "\n la inflamación y la producción de moco. Es fundamental seguir las indicaciones del médico y utilizar los medicamentos según lo " +
                                                  "\n prescrito. Una dieta saludable puede ayudar a fortalecer el sistema inmunológico y a reducir la inflamación. Se recomienda     " +
                                                  "\n consumir alimentos ricos en antioxidantes, antiinflamatorios y ácidos grasos omega-3, como frutas y verduras de colores vivos  " +
                                                  "\n (bayas, cítricos, espinacas, brócoli), pescado azul (salmón, atún, sardinas) y frutos secos. En particular, se recomienda     " +
                                                  "\n consumir alimentos ricos en: Vitamina C (cítricos, kiwi, fresas): fortalece el sistema inmunológico y ayuda a combatir las    " +
                                                  "\n infecciones. Vitamina E (aceites vegetales, frutos secos, semillas): protege las células del daño y reduce la inflamación.    " +
                                                  "\n Ácidos grasos omega-3 (pescado azul, semillas de lino, nueces): reducen la inflamación de las vías respiratorias. El salmón,  " +
                                                  "\n por ejemplo, es una excelente fuente de ácidos grasos omega-3. Una porción de 100 gramos de salmón cocido proporciona         " +
                                                  "\n aproximadamente 2.3 gramos de omega-3, lo que puede ayudar a reducir la inflamación de las vías respiratorias y a mejorar     " +
                                                  "\n la función pulmonar. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el        " +
                                                  "\n paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda          " +
                                                  "\n hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además      " +
                                                  "\n por su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico,           " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, Pérdida de peso, Ganglios linfáticos inflamados, Erupción cutánea (Diarrea).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA. " +
                                                  "\n El adolescente con VIH/SIDA debe mantenerse bien hidratado para apoyar la función inmunológica y facilitar la absorción " +
                                                  "\n de los medicamentos antirretrovirales. Se recomienda consumir entre 2.5 y 3 litros de agua al día (diez a doce vasos de " +
                                                  "\n tamaño regular). La actividad física regular es fundamental para mantener la masa muscular, mejorar el estado de ánimo  " +
                                                  "\n y fortalecer el sistema inmunológico. Se sugiere realizar al menos 30-60 minutos de ejercicio moderado a vigoroso al día," +
                                                  "\n incluyendo actividades aeróbicas (como caminar, correr, nadar o bailar) y ejercicios de fuerza (como levantamiento de pesas" +
                                                  "\n ligero o ejercicios con bandas de resistencia). POSIBLE TRATAMIENTO: El tratamiento para el VIH/SIDA consiste en la terapia" +
                                                  "\n antirretroviral (TAR), que ayuda a controlar la replicación del virus y a prevenir la progresión de la enfermedad. Es      " +
                                                  "\n fundamental seguir las indicaciones del médico y tomar los medicamentos según lo prescrito. Además, una dieta nutritiva    " +
                                                  "\n puede ayudar a fortalecer el sistema inmunológico, mantener un peso saludable y prevenir infecciones oportunistas. Se      " +
                                                  "\n recomienda consumir alimentos ricos en proteínas, vitaminas, minerales y antioxidantes, como frutas y verduras de colores  " +
                                                  "\n vivos (bayas, cítricos, espinacas, brócoli), proteínas magras (pollo, pescado, legumbres) y grasas saludables (aceite de   " + 
                                                  "\n oliva, aguacate, nueces). En particular, se recomienda consumir alimentos ricos en: Proteínas (carne magra, pescado,       " +
                                                  "\n legumbres): necesarias para la reparación de tejidos, la producción de anticuerpos y el mantenimiento de la masa muscular. " +
                                                  "\n Vitaminas y minerales (frutas y verduras de colores vivos): fortalecen el sistema inmunológico y protegen las células del  " +
                                                  "\n daño. Probióticos (yogur, kéfir, chucrut): ayudan a mantener un equilibrio saludable de bacterias en el intestino, lo que  " +
                                                  "\n puede fortalecer el sistema inmunológico. El yogur, por ejemplo, es una excelente fuente de probióticos y proteínas. Una   " +
                                                  "\n porción de 200 gramos de yogur proporciona aproximadamente 20 gramos de proteína, lo que ayuda a mantener la masa muscular " +
                                                  "\n y a fortalecer el sistema inmunológico. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza " +
                                                  "\n al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se   " +
                                                  "\n recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente," +
                                                  "\n además por su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico, " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreción anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n El adolescente con gonorrea debe mantenerse bien hidratado para apoyar la función renal y facilitar la eliminación de toxinas. " +
                                                  "\n Se recomienda consumir entre 2 y 2.5 litros de agua al día (ocho a diez vasos de tamaño regular). No se requiere un régimen    " +
                                                  "\n de ejercicio específico para el tratamiento de la gonorrea, pero mantener un estilo de vida activo y saludable puede ayudar    " +
                                                  "\n a fortalecer el sistema inmunológico. Se sugiere realizar al menos 30 minutos de actividad física moderada la mayoría de los   " +
                                                  "\n días de la semana. POSIBLE TRATAMIENTO: El tratamiento para la gonorrea generalmente consiste en una combinación de antibióticos" +
                                                  "\n para combatir la infección bacteriana. Los antibióticos comunes utilizados en el tratamiento de la gonorrea incluyen: Ceftriaxona" +
                                                  "\n (administrada por inyección) y Azitromicina (administrada por vía oral). Es fundamental completar el ciclo completo de antibióticos" +
                                                  "\n según las indicaciones del médico, incluso si los síntomas desaparecen antes. Además, es importante evitar las relaciones sexuales " +
                                                  "\n hasta que tanto el adolescente como su pareja hayan completado el tratamiento y se hayan realizado pruebas de seguimiento para     " +
                                                  "\n confirmar que la infección ha sido eliminada. Una dieta saludable puede ayudar a fortalecer el sistema inmunológico y a promover   " +
                                                  "\n la curación. Se recomienda consumir alimentos ricos en vitaminas, minerales y antioxidantes, como frutas y verduras de colores     " +
                                                  "\n vivos (cítricos, bayas, espinacas, zanahorias), proteínas magras (pollo, pescado, legumbres) y granos integrales. En particular,   " +
                                                  "\n se recomienda consumir alimentos ricos en: Vitamina C (cítricos, kiwi, fresas): fortalece el sistema inmunológico y ayuda a        " +
                                                  "\n combatir las infecciones. Zinc (carne, mariscos, nueces): esencial para la función inmunológica y la cicatrización de heridas.     " +
                                                  "\n Probióticos (yogur, kéfir, chucrut): ayudan a mantener un equilibrio saludable de bacterias en el intestino, lo que puede          " +
                                                  "\n fortalecer el sistema inmunológico. Los mariscos, por ejemplo, son una buena fuente de zinc. Una porción de 100 gramos de          " +
                                                  "\n ostras proporciona aproximadamente el 400% de la ingesta diaria recomendada de zinc, lo que es esencial para la función            " +
                                                  "\n inmunológica y la cicatrización de heridas. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza     " +
                                                  "\n al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se           " +
                                                  "\n recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente,       " +
                                                  "\n además por su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico,         " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linfáticos inflamados, Úlceras o llagas dolorosas, Picazón o ardor, Dolor al orinar.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n Es recomendable mantener una buena higiene en el área genital, lavando suavemente con agua y jabón neutro y secando " +
                                                  "\n bien después del lavado. Se aconseja evitar ropa ajustada y de materiales sintéticos que puedan irritar la zona     " + 
                                                  "\n afectada. No hay una restricción específica de actividad física, pero se recomienda evitar actividades que puedan   " +
                                                  "\n causar fricción o irritación en la zona genital durante los brotes. La hidratación es importante para el bienestar  " +
                                                  "\n general, se recomienda beber al menos 2 litros de agua al día (ocho vasos de agua de tamaño regular) para mantener  " +
                                                  "\n el cuerpo hidratado y ayudar a fortalecer el sistema inmunológico. POSIBLE TRATAMIENTO: El tratamiento para el herpes" +
                                                  "\n genital se centra en aliviar los síntomas y prevenir brotes. Los medicamentos antivirales como el aciclovir (Zovirax," +
                                                  "\n marcas genéricas disponibles en México), valaciclovir (Valtrex) y famciclovir (Famvir) son comúnmente prescritos. Estos" +
                                                  "\n medicamentos pueden tomarse oralmente durante los brotes para reducir la duración y severidad de los síntomas, o      " +
                                                  "\n diariamente como terapia supresiva para reducir la frecuencia de los brotes. Para aliviar el dolor y la picazón, se   " +
                                                  "\n pueden usar cremas o ungüentos anestésicos tópicos de venta libre. Es recomendable consumir alimentos que fortalezcan " +
                                                  "\n el sistema inmunológico, tales como: Alimentos ricos en lisina (pescado, pollo, legumbres): La lisina es un aminoácido" +
                                                  "\n que puede ayudar a prevenir la replicación del virus del herpes. Frutas y verduras ricas en vitamina C (cítricos,     " +
                                                  "\n fresas, pimientos, brócoli): La vitamina C es un antioxidante que puede ayudar a fortalecer el sistema inmunológico   " +
                                                  "\n y proteger contra infecciones. Alimentos ricos en zinc (carne, mariscos, nueces): El zinc es un mineral importante    " +
                                                  "\n para la función inmunológica y la cicatrización de heridas. Evitar alimentos ricos en arginina (chocolate, nueces,    " +
                                                  "\n semillas): La arginina es un aminoácido que puede promover la replicación del virus del herpes. Este es solo un       " +
                                                  "\n Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y     " +
                                                  "\n que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico      " +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la       " +
                                                  "\n respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes       " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Úlceras indoloras, Erupción cutánea, Dolor de cabeza, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Sífilis. " +
                                                  "\n Se recomienda evitar la actividad física intensa durante el tratamiento para permitir que el cuerpo se concentre en la   " +
                                                  "\n curación. Caminatas suaves y ejercicios de bajo impacto pueden ser apropiados, pero es importante consultar con el médico." +
                                                  "\n La hidratación adecuada es crucial para el bienestar general y para ayudar a eliminar toxinas del cuerpo. Se recomienda   " +
                                                  "\n beber al menos 2 litros de agua al día (ocho vasos de tamaño regular). Mantener una buena higiene personal es importante  " +
                                                  "\n para prevenir la propagación de la infección a otras áreas del cuerpo. POSIBLE TRATAMIENTO: El tratamiento para la sífilis" +
                                                  "\n es con antibióticos, generalmente penicilina. La dosis y duración del tratamiento dependen de la etapa de la sífilis. La  " +
                                                  "\n penicilina benzatínica (Bicillin L-A) es una marca común utilizada para tratar la sífilis. Es crucial completar todo el   " +
                                                  "\n ciclo de antibióticos según las indicaciones del médico, incluso si los síntomas desaparecen. Los alimentos que pueden    " +
                                                  "\n ayudar a fortalecer el sistema inmunológico incluyen: Alimentos ricos en vitamina C (cítricos, fresas, kiwi, pimientos):  " +
                                                  "\n La vitamina C es un antioxidante que ayuda a fortalecer el sistema inmunológico. Alimentos ricos en zinc (carne, mariscos," +
                                                  "\n nueces, semillas): El zinc es esencial para la función inmunológica y la reparación de tejidos. Alimentos ricos en probióticos" +
                                                  "\n (yogur, kéfir, chucrut): Los probióticos pueden ayudar a mantener un equilibrio saludable de bacterias en el intestino, lo  " +
                                                  "\n que puede fortalecer el sistema inmunológico. Alimentos ricos en antioxidantes (frutas y verduras de colores brillantes):   " +
                                                  "\n Los antioxidantes protegen las células del daño y ayudan a fortalecer el sistema inmunológico. Se recomienda evitar el      " +
                                                  "\n consumo de alcohol durante el tratamiento con antibióticos, ya que puede interferir con la eficacia del medicamento y       " +
                                                  "\n aumentar el riesgo de efectos secundarios. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no         " +
                                                  "\n garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para  " +
                                                  "\n ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de     " +
                                                  "\n su paciente, además por su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar  " +
                                                  "\n a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Pérdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n Durante el tratamiento de la tuberculosis, es crucial mantener una actividad física moderada, adaptada a la tolerancia  " +
                                                  "\n del paciente y bajo supervisión médica. Caminar diariamente y realizar ejercicios de respiración pueden ser beneficiosos." +
                                                  "\n Es fundamental evitar el ejercicio extenuante que pueda debilitar el sistema inmunológico. Se recomienda una ingesta de  " +
                                                  "\n líquidos de al menos 2.5 litros de agua al día (diez vasos de tamaño regular) para ayudar a mantener las vías respiratorias" +
                                                  "\n hidratadas y facilitar la eliminación de toxinas. Una nutrición adecuada es esencial para fortalecer el sistema inmunológico" +
                                                  "\n y mejorar la respuesta al tratamiento. POSIBLE TRATAMIENTO: El tratamiento para la tuberculosis se basa en una combinación " +
                                                  "\n de antibióticos que deben tomarse durante un período prolongado, generalmente de 6 a 9 meses. Algunos de los medicamentos  " +
                                                  "\n comunes incluyen: Isoniazida (INH), Rifampicina (Rifadin), Pirazinamida, Etambutol (Myambutol). Es fundamental seguir      " +
                                                  "\n estrictamente las indicaciones médicas y completar todo el ciclo de tratamiento para prevenir la resistencia a los         " +
                                                  "\n medicamentos. Para fortalecer el sistema inmunológico y mejorar la respuesta al tratamiento, se recomienda consumir        " +
                                                  "\n los siguientes alimentos: Hígado de res: Rico en vitamina A (aproximadamente 860% de la ingesta diaria recomendada por     " +
                                                  "\n cada 100 gramos), esencial para la función inmunológica y la salud de las mucosas. Cítricos (naranja, limón, pomelo):      " +
                                                  "\n Altos en vitamina C (aproximadamente 50-90% de la ingesta diaria recomendada por cada 100 gramos), un antioxidante que     " +
                                                  "\n fortalece el sistema inmunológico. Zanahorias: Fuente de betacaroteno, que el cuerpo convierte en vitamina A (aproximadamente" +
                                                  "\n 200% de la ingesta diaria recomendada por cada 100 gramos), importante para la visión y la función inmunológica. Almendras:  " +
                                                  "\n Ricas en vitamina E (aproximadamente 37% de la ingesta diaria recomendada por cada 100 gramos), un antioxidante que protege  " +
                                                  "\n las células del daño. Yogur con probióticos: Ayuda a mantener un equilibrio saludable de bacterias en el intestino,          " +
                                                  "\n fortaleciendo el sistema inmunológico. Se recomienda evitar el consumo de alcohol y tabaco, ya que pueden interferir         " +
                                                  "\n con el tratamiento y debilitar el sistema inmunológico. Este es solo un Diagnóstico predeterminado lógico, haberlo           " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas           " +
                                                  "\n estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en           " +
                                                  "\n el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnóstico no le satisface del todo         " +
                                                  "\n se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchazón en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n Es fundamental que los adolescentes con artritis se mantengan activos para preservar la función articular, reducir " +
                                                  "\n el dolor y mejorar la calidad de vida, recomendándose ejercicios de bajo impacto como natación, ciclismo, caminar, " +
                                                  "\n yoga o tai chi, adaptados a la tolerancia individual y evitando el dolor excesivo; el objetivo puede ser alrededor " +
                                                  "\n de 60 minutos de actividad física moderada la mayoría de los días de la semana, siempre bajo supervisión o         " +
                                                  "\n recomendación médica para un plan seguro y personalizado, especialmente durante brotes de inflamación. En cuanto a " +
                                                  "\n la hidratación, generalmente los adolescentes necesitan entre 2 y 3 litros de agua al día, variando según la actividad" +
                                                  "\n física y condiciones individuales; para quienes padecen artritis, una buena hidratación es clave para ayudar a lubricar" +
                                                  "\n las articulaciones y puede contribuir al manejo de la inflamación y los efectos secundarios de medicamentos.        " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento para la artritis en adolescentes, a menudo referida como artritis idiopática    " +
                                                  "\n juvenil en este grupo etario, es complejo y debe ser dirigido por un reumatólogo; puede incluir antiinflamatorios   " +
                                                  "\n no esteroideos (AINEs) para el alivio del dolor e inflamación, como el ibuprofeno (marcas comunes en México: Advil, " +
                                                  "\n Motrin, Tabalon) o naproxeno (marcas comunes: Flanax, Febrax, Naxen). También se utilizan Fármacos Antirreumáticos  " +
                                                  "\n Modificadores de la Enfermedad (FARME), como el metotrexato (marcas: Ledertrexate, Texotrexate, Metotrexato IMA),   " +
                                                  "\n para controlar la enfermedad a largo plazo. En casos más severos o resistentes, pueden emplearse medicamentos       " +
                                                  "\n biológicos como etanercept (Enbrel) o adalimumab (Humira). Los corticosteroides, como la prednisona (Meticorten)    " +
                                                  "\n o deflazacort (Calcort), pueden ser indicados para controlar brotes agudos, usualmente por cortos periodos.         " +
                                                  "\n Es crucial adherirse estrictamente al plan de tratamiento indicado por el especialista. También es recomendable     " +
                                                  "\n que el adolescente consuma alimentos que puedan ayudar a reducir la inflamación y fortalecer la salud articular,    " +
                                                  "\n tales como: Pescados grasos (salmón, atún, sardinas): ricos en ácidos grasos Omega-3 con potentes propiedades       " +
                                                  "\n antiinflamatorias. Frutas y verduras de colores intensos (fresas, arándanos, frambuesas, naranjas, kiwis, espinacas," +
                                                  "\n brócoli, zanahorias): fuentes de antioxidantes como la vitamina C y carotenoides, que combaten el estrés oxidativo y" +
                                                  "\n apoyan la producción de colágeno. Nueces y semillas (almendras, nueces de la India, chía, linaza): aportan Omega-3 " +
                                                  "\n de origen vegetal, grasas saludables y antioxidantes. Aceite de oliva extra virgen: contiene oleocantal, un compuesto" +
                                                  "\n con efectos antiinflamatorios, además de grasas monoinsaturadas saludables. Granos integrales (avena, arroz integral," +
                                                  "\n quinoa): proporcionan fibra, que ayuda a mantener un peso saludable y puede tener efectos antiinflamatorios. Especias" +
                                                  "\n como la cúrcuma (con su componente activo, la curcumina) y el jengibre: conocidas por sus potentes efectos antiinflamatorios." +
                                                  "\n Adicionalmente, es importante asegurar una ingesta adecuada de calcio y vitamina D, cruciales para la salud ósea, la" +
                                                  "\n cual puede verse afectada por la artritis o algunos de sus tratamientos. Este es solo un Diagnóstico predeterminado " +
                                                  "\n lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y " +
                                                  "\n sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor" +
                                                  "\n seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnóstico no le satisface" +
                                                  "\n del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n Durante la fase aguda de la tosferina, el reposo es crucial para la recuperación del adolescente; se debe evitar " +
                                                  "\n el ejercicio extenuante ya que puede agravar los accesos de tos y solo considerar actividades muy ligeras, como  " +
                                                  "\n caminatas suaves y cortas, una vez que la fiebre haya cedido y la tos disminuya significativamente, siempre con  " +
                                                  "\n aprobación médica y asegurando que no exacerben los síntomas, con un retorno muy gradual a la actividad normal.  " +
                                                  "\n Mantener una excelente hidratación es vital, recomendándose entre 2 y 2.5 litros de líquidos al día para el      " +
                                                  "\n adolescente, como agua, caldos tibios o tés suaves, lo cual ayuda a fluidificar las secreciones respiratorias    " +
                                                  "\n y a prevenir la deshidratación. POSIBLE TRATAMIENTO: El tratamiento principal para la tosferina en adolescentes  " +
                                                  "\n son los antibióticos, más efectivos si se inician tempranamente para acortar el periodo de contagio y reducir la " +
                                                  "\n severidad; entre los comunes se encuentran la azitromicina (Zitromax) o claritromicina (Klaricid), debiendo      " +
                                                  "\n completarse el ciclo según indicación médica. Generalmente no se recomiendan antitusígenos, y el manejo se centra" +
                                                  "\n en el soporte, descanso y un ambiente tranquilo. Para apoyar la recuperación y el sistema inmune del adolescente," +
                                                  "\n se sugieren comidas pequeñas, frecuentes y fáciles de tragar; es recomendable el consumo de: Frutas ricas en     " +
                                                  "\n Vitamina C para fortalecer defensas, como la guayaba (100g aportan unos 228mg de Vitamina C, superando el 250%   " +
                                                  "\n de la ingesta diaria recomendada para un adulto) o naranjas (100g ofrecen alrededor de 53mg de Vitamina C, casi  " +
                                                  "\n el 60% IDR adulto). Alimentos con Zinc para la función inmune, como carne magra de res bien cocida y en porciones" +
                                                  "\n pequeñas (100g pueden proveer 5-7mg de Zinc, aprox. 50% IDR adulto) o lentejas en sopa. Para la salud de las     " +
                                                  "\n mucosas respiratorias, alimentos con Vitamina A como zanahorias cocidas (100g son una excelente fuente de beta-carotenos)" +
                                                  "\n o espinacas. Caldos y sopas tibias con pollo desmenuzado pueden aportar proteínas y líquidos de forma reconfortante," +
                                                  "\n y la miel (en mayores de un año) puede ayudar a calmar la tos. Este es solo un Diagnóstico predeterminado lógico,   " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus     " +
                                                  "\n respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor    " +
                                                  "\n seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnóstico no le      " +
                                                  "\n satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app         " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchazón de las glándulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n Durante la infección por paperas, el reposo es fundamental para el adolescente, especialmente si hay fiebre o " +
                                                  "\n inflamación glandular significativa; se deben evitar las actividades físicas intensas para no exacerbar los   " +
                                                  "\n síntomas y reducir el riesgo de complicaciones como la orquitis (inflamación testicular), a la que los varones" +
                                                  "\n adolescentes son susceptibles, y en caso de presentarse dolor o inflamación testicular, el reposo absoluto es " +
                                                  "\n crucial, con una reincorporación a la actividad física gradual y solo tras la resolución completa de los síntomas" +
                                                  "\n bajo consejo médico. Es importante asegurar una buena hidratación, con un consumo de 2 a 2.5 litros de líquidos al" +
                                                  "\n día para el adolescente, como agua, tés suaves o caldos, para ayudar a manejar la fiebre y el malestar general;   " +
                                                  "\n si tragar es doloroso, se deben ofrecer líquidos en pequeños sorbos y con frecuencia. POSIBLE TRATAMIENTO: No     " +
                                                  "\n existe un tratamiento antiviral específico para las paperas; el manejo se enfoca en aliviar los síntomas. Para la " +
                                                  "\n fiebre y el dolor, se pueden utilizar analgésicos y antipiréticos como el paracetamol (Tempra) o ibuprofeno (Advil)." +
                                                  "\n Aplicar compresas frías o tibias en las glándulas inflamadas puede proporcionar alivio. En caso de desarrollar orquitis," +
                                                  "\n es vital el reposo en cama, el soporte escrotal y la consulta médica inmediata para un manejo adecuado. Se recomienda   " +
                                                  "\n una dieta de alimentos blandos y fáciles de tragar para el adolescente, evitando alimentos ácidos (cítricos, tomate)    " +
                                                  "\n o muy condimentados que puedan irritar las glándulas salivales; también es recomendable que el adolescente consuma:     " +
                                                  "\n Alimentos ricos en Vitamina C para apoyar el sistema inmune, como puré de calabaza cocida (100g pueden aportar unos 9mg  " +
                                                  "\n de Vitamina C, aprox. 10% IDR adulto) o sopas de verduras suaves. Fuentes de Zinc para la función inmune, como el       " +
                                                  "\n yogur natural (100g pueden aportar cerca de 1mg de Zinc, aprox. 9% IDR adulto) o avena cocida preparada como gachas.    " +
                                                  "\n Para la salud de las mucosas y defensas, alimentos con Vitamina A, como el camote cocido y hecho puré (100g proveen     " +
                                                  "\n una alta cantidad de beta-carotenos, precursores de Vitamina A) o zanahorias también en puré. Proteínas de fácil        " +
                                                  "\n digestión como huevos revueltos suaves o pollo desmenuzado en caldos. Los líquidos nutritivos como batidos no ácidos    " +
                                                  "\n y caldos son importantes. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100%    " +
                                                  "\n que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se        " +
                                                  "\n recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su      " +
                                                  "\n paciente, además por su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar " +
                                                  "\n a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupción cutánea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika. " +
                                                  "\n Es recomendable que el adolescente mantenga una hidratación adecuada, consumiendo entre 2 y 3 litros de agua al día    " +
                                                  "\n para ayudar a su recuperación y prevenir la deshidratación causada por la fiebre. La actividad física debe ser moderada" +
                                                  "\n y adaptada a su estado de salud, evitando esfuerzos excesivos mientras persistan los síntomas. POSIBLE TRATAMIENTO:    " +
                                                  "\n No existe un tratamiento específico para el Zika, pero los síntomas pueden manejarse con medicamentos como el paracetamol" +
                                                  "\n (Tempra) para la fiebre y el dolor, evitando el uso de antiinflamatorios como el ibuprofeno y la aspirina. También se   " +
                                                  "\n recomienda el descanso y el consumo de líquidos. En México, se aconseja el uso de repelentes de mosquitos y ropa que cubra" +
                                                  "\n la piel para prevenir nuevas picaduras. En cuanto a la alimentación, es recomendable el consumo de frutas y verduras ricas" +
                                                  "\n en antioxidantes y vitamina C, como naranjas, fresas, kiwis y guayabas, que pueden fortalecer el sistema inmunológico.    " +
                                                  "\n También se sugiere el consumo de alimentos con propiedades antiinflamatorias como el jengibre y la cúrcuma. Este es solo  " +
                                                  "\n un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que  " +
                                                  "\n por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un diagnóstico de Mi Vida   " +
                                                  "\n para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del diagnóstico" + 
                                                  "\n no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida)" +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, Vómitos, Deshidratación, Dolor abdominal.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n Es fundamental que el adolescente mantenga una hidratación adecuada, consumiendo entre 2.5 y 3 litros de agua al día " +
                                                  "\n para prevenir la deshidratación causada por la diarrea y los vómitos. La actividad física debe ser mínima mientras   " +
                                                  "\n persistan los síntomas, priorizando el descanso. POSIBLE TRATAMIENTO: No existe un tratamiento específico para el    " +
                                                  "\n rotavirus, pero los síntomas pueden manejarse con soluciones de rehidratación oral como Pedialyte para reponer       " +
                                                  "\n electrolitos y líquidos perdidos. Se recomienda evitar medicamentos antidiarreicos y mantener una alimentación       " +
                                                  "\n ligera. En cuanto a la nutrición, es recomendable el consumo de alimentos ricos en vitamina A y zinc, como zanahorias" +
                                                  "\n (por cada 100 gramos, aproximadamente 835 µg de vitamina A, cubriendo el 93% de la ingesta diaria recomendada para   " +
                                                  "\n adolescentes) y semillas de calabaza (por cada 100 gramos, alrededor de 7.8 mg de zinc, cubriendo el 71% de la ingesta" +
                                                  "\n diaria recomendada). También se sugiere el consumo de plátanos, que ayudan a reponer electrolitos y aportan potasio  " +
                                                  "\n (por cada 100 gramos, aproximadamente 358 mg de potasio, cubriendo el 10% de la ingesta diaria recomendada).         " +
                                                  "\n Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga     " +
                                                  "\n esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más      " +
                                                  "\n de un diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por   " +
                                                  "\n su salud si la respuesta del diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico,      " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, Náuseas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeriosis." +
                                                  "\n Es fundamental que el adolescente mantenga una hidratación adecuada, consumiendo entre 2.5 y 3 litros de agua al  " +
                                                  "\n día para ayudar a su recuperación y prevenir la deshidratación causada por la fiebre y otros síntomas. La actividad" +
                                                  "\n física debe ser mínima mientras persistan los síntomas, priorizando el descanso. POSIBLE TRATAMIENTO: La infección " +
                                                  "\n por Listeria monocytogenes se trata con antibióticos, siendo la ampicilina y la gentamicina opciones altamente     " +
                                                  "\n eficaces. La ampicilina impide la replicación de la bacteria, mientras que la gentamicina bloquea la producción    " +
                                                  "\n de proteínas esenciales para su supervivencia. En cuanto a la alimentación, es recomendable el consumo de alimentos" +
                                                  "\n ricos en vitamina A y zinc, como zanahorias (por cada 100 gramos, aproximadamente 835 µg de vitamina A, cubriendo  " +
                                                  "\n el 93% de la ingesta diaria recomendada para adolescentes) y semillas de calabaza (por cada 100 gramos, alrededor  " +
                                                  "\n de 7.8 mg de zinc, cubriendo el 71% de la ingesta diaria recomendada). También se sugiere el consumo de plátanos,  " +
                                                  "\n que ayudan a reponer electrolitos y aportan potasio (por cada 100 gramos, aproximadamente 358 mg de potasio, cubriendo" +
                                                  "\n el 10% de la ingesta diaria recomendada). Este es solo un diagnóstico predeterminado lógico, haberlo consultado no " +
                                                  "\n garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas," +
                                                  "\n para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento   " +
                                                  "\n adecuado de su paciente, además por su salud si la respuesta del diagnóstico no le satisface del todo se le recomienda" + 
                                                  "\n mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, Vómitos.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis. " +
                                                  "\n Es fundamental que el adolescente mantenga una hidratación adecuada, consumiendo entre 2.5 y 3 litros de agua al " +
                                                  "\n día para prevenir la deshidratación causada por la diarrea y otros síntomas. La actividad física debe ser mínima " +
                                                  "\n mientras persistan los síntomas, priorizando el descanso. POSIBLE TRATAMIENTO: La infección por Shigella suele   " +
                                                  "\n tratarse con antibióticos en casos graves, siendo la ciprofloxacina y la azitromicina opciones altamente eficaces." +
                                                  "\n La ciprofloxacina actúa inhibiendo la replicación bacteriana, mientras que la azitromicina bloquea la producción  " +
                                                  "\n de proteínas esenciales para la supervivencia de la bacteria. En cuanto a la alimentación, es recomendable el consumo" +
                                                  "\n de alimentos ricos en vitamina A y zinc, como zanahorias (por cada 100 gramos, aproximadamente 835 µg de vitamina A, " +
                                                  "\n cubriendo el 93% de la ingesta diaria recomendada para adolescentes) y semillas de calabaza (por cada 100 gramos,    " +
                                                  "\n alrededor de 7.8 mg de zinc, cubriendo el 71% de la ingesta diaria recomendada). También se sugiere el consumo de     " +
                                                  "\n plátanos, que ayudan a reponer electrolitos y aportan potasio (por cada 100 gramos, aproximadamente 358 mg de potasio," +
                                                  "\n cubriendo el 10% de la ingesta diaria recomendada). Este es solo un diagnóstico predeterminado lógico, haberlo consultado" +
                                                  "\n no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas," +
                                                  "\n para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado" +
                                                  "\n de su paciente, además por su salud si la respuesta del diagnóstico no le satisface del todo se le recomienda mucho    " +
                                                  "\n consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos crónica, Producción excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraerEnfermedad pulmonar obstructiva crónica (EPOC)." +
                                                  "\n Es fundamental que el adolescente mantenga una hidratación adecuada, consumiendo entre 2.5 y 3 litros de agua al día para " +
                                                  "\n ayudar a mantener las vías respiratorias húmedas y facilitar la expulsión de mucosidad. La actividad física debe ser      " +
                                                  "\n moderada y adaptada a su capacidad pulmonar, priorizando ejercicios de bajo impacto como caminatas y respiración controlada." +
                                                  "\n POSIBLE TRATAMIENTO: La EPOC se maneja con broncodilatadores de acción prolongada, como el tiotropio y el salmeterol,       " +
                                                  "\n que ayudan a relajar los músculos de las vías respiratorias y mejorar la respiración. También pueden utilizarse corticosteroides" +
                                                  "\n inhalados como la fluticasona para reducir la inflamación pulmonar. En cuanto a la alimentación, es recomendable el consumo de  " +
                                                  "\n alimentos ricos en antioxidantes y ácidos grasos Omega-3, como el salmón (por cada 100 gramos, aproximadamente 2.2 gramos de    " +
                                                  "\n Omega-3, lo que contribuye a la reducción de la inflamación pulmonar) y las espinacas (por cada 100 gramos, alrededor de        " +
                                                  "\n 28 mg de vitamina C, cubriendo el 31% de la ingesta diaria recomendada). También se sugiere el consumo de frutos secos como     " +
                                                  "\n almendras, que aportan vitamina E (por cada 100 gramos, aproximadamente 25 mg de vitamina E, cubriendo el 166% de la ingesta    " +
                                                  "\n diaria recomendada), lo que ayuda a proteger las células pulmonares del daño oxidativo. Este es solo un diagnóstico predeterminado" +
                                                  "\n lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus       " +
                                                  "\n respuestas estén correctas, para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer mejor seguridad    " +
                                                  "\n en el tratamiento adecuado de su paciente, además por su salud si la respuesta del diagnóstico no le satisface del todo se    " +
                                                  "\n le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");   
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreción anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n Es fundamental que el adolescente mantenga una hidratación adecuada, consumiendo entre 2.5 y 3 litros de agua al día " +
                                                  "\n para ayudar a su recuperación y prevenir molestias urinarias. La actividad física debe ser moderada y adaptada a su  " +
                                                  "\n estado de salud, evitando esfuerzos excesivos mientras persistan los síntomas. POSIBLE TRATAMIENTO: La infección por " +
                                                  "\n Chlamydia trachomatis se trata con antibióticos, siendo la azitromicina y la doxiciclina opciones altamente eficaces." +
                                                  "\n La azitromicina se administra en una dosis única, mientras que la doxiciclina se toma durante siete días para eliminar" +
                                                  "\n la bacteria por completo. En cuanto a la alimentación, es recomendable el consumo de alimentos ricos en vitamina C y  " +
                                                  "\n antioxidantes, como fresas (por cada 100 gramos, aproximadamente 59 mg de vitamina C, cubriendo el 65% de la ingesta  " +
                                                  "\n diaria recomendada) y kiwis (por cada 100 gramos, alrededor de 92 mg de vitamina C, cubriendo el 102% de la ingesta   " +
                                                  "\n diaria recomendada). También se sugiere el consumo de yogur natural, que aporta probióticos beneficiosos para la salud" +
                                                  "\n intestinal y el sistema inmunológico. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza" +
                                                  "\n al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se" +
                                                  "\n recomienda hacer más de un diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente," +
                                                  "\n además por su salud si la respuesta del diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico, " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Náuseas, Dolor de cabeza severo, Rigidez en el cuello, Confusión.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n Es fundamental que el adolescente mantenga una hidratación adecuada, consumiendo entre 2.5 y 3 litros de agua al " +
                                                  "\n día para ayudar a su recuperación y prevenir complicaciones derivadas de la fiebre y la inflamación. La actividad" +
                                                  "\n física debe ser mínima mientras persistan los síntomas, priorizando el descanso absoluto. POSIBLE TRATAMIENTO:   " +
                                                  "\n La meningitis bacteriana se trata con antibióticos de amplio espectro, siendo la ceftriaxona y la vancomicina    " +
                                                  "\n opciones altamente eficaces. La ceftriaxona actúa inhibiendo la síntesis de la pared celular bacteriana, mientras" +
                                                  "\n que la vancomicina bloquea la producción de proteínas esenciales para la supervivencia de la bacteria. En cuanto " +
                                                  "\n a la alimentación, es recomendable el consumo de alimentos ricos en antioxidantes y vitamina C, como fresas (por " +
                                                  "\n cada 100 gramos, aproximadamente 59 mg de vitamina C, cubriendo el 65% de la ingesta diaria recomendada) y kiwis " +
                                                  "\n (por cada 100 gramos, alrededor de 92 mg de vitamina C, cubriendo el 102% de la ingesta diaria recomendada).     " +
                                                  "\n También se sugiere el consumo de almendras, que aportan vitamina E (por cada 100 gramos, aproximadamente 25 mg de" +
                                                  "\n vitamina E, cubriendo el 166% de la ingesta diaria recomendada), lo que ayuda a proteger las células del sistema " +
                                                  "\n nervioso del daño oxidativo. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al" +
                                                  "\n 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello" +
                                                  "\n se recomienda hacer más de un diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de" +
                                                  "\n su paciente, además por su salud si la respuesta del diagnóstico no le satisface del todo se le recomienda mucho  " +
                                                  "\n consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, Pérdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, Pérdida de apetito.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Cáncer. " +
                                                  "\n Es fundamental que el adolescente mantenga una hidratación adecuada, consumiendo entre 2.5 y 3 litros de agua al día " +
                                                  "\n para ayudar a su recuperación y reducir los efectos secundarios del tratamiento. La actividad física debe ser moderada" +
                                                  "\n y adaptada a su capacidad, priorizando ejercicios de bajo impacto como caminatas y estiramientos para mejorar la      " +
                                                  "\n circulación y reducir la fatiga. POSIBLE TRATAMIENTO: El tratamiento del cáncer varía según el tipo y la etapa de     " +
                                                  "\n la enfermedad, pero suele incluir quimioterapia, radioterapia y cirugía. Entre los medicamentos más utilizados están  " +
                                                  "\n el metotrexato y el cisplatino, que ayudan a inhibir el crecimiento de células cancerosas. En cuanto a la alimentación," +
                                                  "\n es recomendable el consumo de alimentos ricos en antioxidantes y vitaminas esenciales para fortalecer el sistema       " +
                                                  "\n inmunológico, como arándanos (por cada 100 gramos, aproximadamente 9.7 mg de vitamina C, cubriendo el 11% de la ingesta" +
                                                  "\n diaria recomendada) y espinacas (por cada 100 gramos, alrededor de 28 mg de vitamina C, cubriendo el 31% de la ingesta " +
                                                  "\n diaria recomendada). También se sugiere el consumo de frutos secos como almendras, que aportan vitamina E (por cada 100" +
                                                  "\n gramos, aproximadamente 25 mg de vitamina E, cubriendo el 166% de la ingesta diaria recomendada), lo que ayuda a proteger" +
                                                  "\n las células del daño oxidativo. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100%" +
                                                  "\n que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda" +
                                                  "\n hacer más de un diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por" +
                                                  "\n su salud si la respuesta del diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes" +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            } 
                        }
                        
                        if(EstaturaMasculino.equals("1.65-1.80 m")){
                           if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza (gripe)." +
                                                  "\n Es fundamental que el adolescente mantenga una hidratación adecuada, consumiendo entre 2.5 y 3 litros de agua al día para  " +
                                                  "\n ayudar a su recuperación y prevenir la deshidratación causada por la fiebre. La actividad física debe ser moderada y adaptada" +
                                                  "\n a su estado de salud, priorizando ejercicios de bajo impacto como caminatas y estiramientos para mejorar la circulación y    " +
                                                  "\n reducir la fatiga. POSIBLE TRATAMIENTO: La influenza se trata con antivirales como el oseltamivir y el baloxavir, que ayudan " +
                                                  "\n a reducir la duración y gravedad de los síntomas. El oseltamivir bloquea la replicación del virus, mientras que el baloxavir " +
                                                  "\n inhibe su capacidad de propagación en el organismo. En cuanto a la alimentación, es recomendable el consumo de alimentos ricos" +
                                                  "\n en vitamina C y antioxidantes, como naranjas (por cada 100 gramos, aproximadamente 53 mg de vitamina C, cubriendo el 59% de la" +
                                                  "\n ingesta diaria recomendada) y fresas (por cada 100 gramos, alrededor de 59 mg de vitamina C, cubriendo el 65% de la ingesta   " +
                                                  "\n diaria recomendada). También se sugiere el consumo de jengibre, que posee propiedades antiinflamatorias y ayuda a aliviar la  " +
                                                  "\n congestión respiratoria. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el    " +
                                                  "\n paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer    " +
                                                  "\n más de un diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud" +
                                                  "\n si la respuesta del diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece" +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                               textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumonía." +
                                                  "\n Es fundamental que el adolescente mantenga una hidratación adecuada, consumiendo entre 2.5 y 3 litros de agua al día para " +
                                                  "\n ayudar a su recuperación y prevenir la deshidratación causada por la fiebre y la dificultad respiratoria. La actividad    " +
                                                  "\n física debe ser mínima mientras persistan los síntomas, priorizando el descanso absoluto y ejercicios de respiración para " +
                                                  "\n mejorar la oxigenación. POSIBLE TRATAMIENTO: La neumonía bacteriana se trata con antibióticos, siendo la amoxicilina y la " +
                                                  "\n azitromicina opciones altamente eficaces. La amoxicilina actúa inhibiendo la síntesis de la pared celular bacteriana,     " +
                                                  "\n mientras que la azitromicina bloquea la producción de proteínas esenciales para la supervivencia de la bacteria. Marcas   " +
                                                  "\n reconocidas incluyen Amoxil y Zithromax. En cuanto a la alimentación, es recomendable el consumo de alimentos ricos en    " +
                                                  "\n antioxidantes y vitamina C, como naranjas (por cada 100 gramos, aproximadamente 53 mg de vitamina C, cubriendo el 59% de  " +
                                                  "\n la ingesta diaria recomendada) y fresas (por cada 100 gramos, alrededor de 59 mg de vitamina C, cubriendo el 65% de la    " +
                                                  "\n ingesta diaria recomendada). También se sugiere el consumo de jengibre, que posee propiedades antiinflamatorias y ayuda   " +
                                                  "\n a aliviar la congestión respiratoria. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza  " +
                                                  "\n al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se  " +
                                                  "\n recomienda hacer más de un diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente," +
                                                  "\n además por su salud si la respuesta del diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico, " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores."); 
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visión borrosa, Pérdida de peso.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n Es fundamental que el adolescente mantenga una hidratación adecuada, consumiendo entre 2.5 y 3 litros de agua al día para " +
                                                  "\n ayudar a la regulación de la glucosa y prevenir la deshidratación causada por la hiperglucemia. La actividad física debe  " +
                                                  "\n ser moderada y adaptada a su condición, priorizando ejercicios aeróbicos como caminatas, natación o ciclismo durante al   " +
                                                  "\n menos 30 a 60 minutos al día para mejorar la sensibilidad a la insulina. POSIBLE TRATAMIENTO: La diabetes se maneja con   " +
                                                  "\n medicamentos como la metformina y la insulina, que ayudan a controlar los niveles de glucosa en sangre. La metformina     " +
                                                  "\n mejora la respuesta del cuerpo a la insulina, mientras que la insulina es esencial para regular la glucosa en pacientes   " +
                                                  "\n con diabetes tipo 1 o casos avanzados de tipo 2. Marcas reconocidas incluyen Glucophage y Lantus. En cuanto a la alimentación," +
                                                  "\n es recomendable el consumo de alimentos ricos en fibra y antioxidantes, como avena (por cada 100 gramos, aproximadamente   " +
                                                  "\n 10 gramos de fibra, lo que contribuye a la regulación de la glucosa) y almendras (por cada 100 gramos, alrededor de 25 mg  " +
                                                  "\n de vitamina E, cubriendo el 166% de la ingesta diaria recomendada). También se sugiere el consumo de fresas, que aportan   " +
                                                  "\n vitamina C (por cada 100 gramos, aproximadamente 59 mg de vitamina C, cubriendo el 65% de la ingesta diaria recomendada)   " +
                                                  "\n y ayudan a reducir la inflamación. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al   " +
                                                  "\n 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se      " +
                                                  "\n recomienda hacer más de un diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente," +
                                                  "\n además por su salud si la respuesta del diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico,  " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresión en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma. " +
                                                  "\n Es fundamental que el adolescente mantenga una hidratación adecuada, consumiendo entre 2.5 y 3 litros de agua al día para " +
                                                  "\n ayudar a mantener las vías respiratorias hidratadas y reducir la inflamación. La actividad física debe ser moderada y     " +
                                                  "\n adaptada a su capacidad pulmonar, priorizando ejercicios aeróbicos de bajo impacto como caminatas, natación o ciclismo    " +
                                                  "\n durante al menos 30 a 60 minutos al día, evitando factores desencadenantes como el aire frío o la contaminación.          " +
                                                  "\n POSIBLE TRATAMIENTO: El asma se maneja con broncodilatadores de alivio rápido como el salbutamol y corticosteroides inhalados" +
                                                  "\n como la fluticasona, que ayudan a reducir la inflamación y mejorar la respiración. Marcas reconocidas incluyen Ventolin y    " +
                                                  "\n Flixotide. En cuanto a la alimentación, es recomendable el consumo de alimentos ricos en antioxidantes y ácidos grasos Omega-3," +
                                                  "\n como el salmón (por cada 100 gramos, aproximadamente 2.2 gramos de Omega-3, lo que contribuye a la reducción de la inflamación" +
                                                  "\n pulmonar) y las espinacas (por cada 100 gramos, alrededor de 28 mg de vitamina C, cubriendo el 31% de la ingesta diaria recomendada)." +
                                                  "\n También se sugiere el consumo de cúrcuma, que posee propiedades antiinflamatorias y ayuda a mejorar la función pulmonar. Este  " +
                                                  "\n es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que" +
                                                  "\n por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un diagnóstico de Mi Vida para    " +
                                                  "\n establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del diagnóstico no    " +
                                                  "\n le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera" +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, Pérdida de peso, Ganglios linfáticos inflamados, Erupción cutánea (Diarrea).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n Es fundamental que el adolescente mantenga una hidratación adecuada, consumiendo entre 2.5 y 3 litros de agua al día para   " +
                                                  "\n ayudar a su recuperación y reducir los efectos secundarios del tratamiento. La actividad física debe ser moderada y adaptada" +
                                                  "\n a su capacidad, priorizando ejercicios aeróbicos de bajo impacto como caminatas y estiramientos para mejorar la circulación " +
                                                  "\n y fortalecer el sistema inmunológico. POSIBLE TRATAMIENTO: El VIH se maneja con terapia antirretroviral (TAR), siendo el    " +
                                                  "\n tenofovir y el dolutegravir opciones altamente eficaces para suprimir la replicación del virus y mejorar la calidad de vida " +
                                                  "\n del paciente. Marcas reconocidas incluyen Truvada y Tivicay. En cuanto a la alimentación, es recomendable el consumo de     " +
                                                  "\n alimentos ricos en antioxidantes y vitaminas esenciales para fortalecer el sistema inmunológico, como espinacas (por cada   " +
                                                  "\n 100 gramos, aproximadamente 28 mg de vitamina C, cubriendo el 31% de la ingesta diaria recomendada) y almendras (por cada   " +
                                                  "\n 100 gramos, aproximadamente 25 mg de vitamina E, cubriendo el 166% de la ingesta diaria recomendada), lo que ayuda a proteger" +
                                                  "\n las células del daño oxidativo. También se sugiere el consumo de yogur natural, que aporta probióticos beneficiosos para la  " +
                                                  "\n salud intestinal y el sistema inmunológico. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza" +
                                                  "\n al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se     " +
                                                  "\n recomienda hacer más de un diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, " +
                                                  "\n además por su salud si la respuesta del diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico,   " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreción anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n Es fundamental que el adolescente mantenga una hidratación adecuada, consumiendo entre 2.5 y 3 litros de agua al día, " +
                                                  "\n lo que equivale a aproximadamente 10 a 12 vasos de agua de tamaño regular, para ayudar a la eliminación de toxinas y  " +
                                                  "\n prevenir molestias urinarias. La actividad física debe ser moderada y adaptada a su estado de salud, priorizando      " +
                                                  "\n ejercicios aeróbicos de bajo impacto como caminatas o natación durante al menos 30 a 60 minutos al día para mejorar   " +
                                                  "\n la circulación y fortalecer el sistema inmunológico. POSIBLE TRATAMIENTO: La infección por Neisseria gonorrhoeae se   " +
                                                  "\n trata con antibióticos, siendo la ceftriaxona y la azitromicina opciones altamente eficaces. La ceftriaxona se administra" +
                                                  "\n en una dosis única intramuscular, mientras que la azitromicina complementa el tratamiento para eliminar la bacteria por  " +
                                                  "\n completo. Marcas reconocidas incluyen Rocephin y Zithromax. En cuanto a la alimentación, es recomendable el consumo de   " +
                                                  "\n alimentos ricos en antioxidantes y vitamina C, como fresas (por cada 100 gramos, aproximadamente 59 mg de vitamina C,    " +
                                                  "\n cubriendo el 65% de la ingesta diaria recomendada) y kiwis (por cada 100 gramos, alrededor de 92 mg de vitamina C,       " +
                                                  "\n cubriendo el 102% de la ingesta diaria recomendada). También se sugiere el consumo de yogur natural, que aporta probióticos" +
                                                  "\n beneficiosos para la salud intestinal y el sistema inmunológico. Este es solo un diagnóstico predeterminado lógico,       " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas" +
                                                  "\n estén correctas, para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer mejor seguridad en el     " +
                                                  "\n tratamiento adecuado de su paciente, además por su salud si la respuesta del diagnóstico no le satisface del todo se le   " +
                                                  "\n recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");  
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linfáticos inflamados, Úlceras o llagas dolorosas, Picazón o ardor, Dolor al orinar.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n Es fundamental que el adolescente mantenga una hidratación adecuada, consumiendo entre 2.5 y 3 litros de agua al día, " +
                                                  "\n lo que equivale a aproximadamente 10 a 12 vasos de agua de tamaño regular, para ayudar a reducir la inflamación y     " +
                                                  "\n prevenir molestias urinarias. La actividad física debe ser moderada y adaptada a su estado de salud, priorizando      " +
                                                  "\n ejercicios aeróbicos de bajo impacto como caminatas o yoga durante al menos 30 a 60 minutos al día para fortalecer    " +
                                                  "\n el sistema inmunológico sin generar estrés excesivo en el cuerpo. POSIBLE TRATAMIENTO: El herpes genital se maneja    " +
                                                  "\n con antivirales, siendo el aciclovir y el valaciclovir opciones altamente eficaces para reducir la duración y gravedad" +
                                                  "\n de los brotes. El aciclovir bloquea la replicación del virus, mientras que el valaciclovir prolonga su efecto en el   " +
                                                  "\n organismo. Marcas reconocidas incluyen Zovirax y Valtrex. En cuanto a la alimentación, es recomendable el consumo de  " +
                                                  "\n alimentos ricos en antioxidantes y vitamina C, como fresas (por cada 100 gramos, aproximadamente 59 mg de vitamina C, " +
                                                  "\n cubriendo el 65% de la ingesta diaria recomendada) y kiwis (por cada 100 gramos, alrededor de 92 mg de vitamina C,    " +
                                                  "\n cubriendo el 102% de la ingesta diaria recomendada). También se sugiere el consumo de yogur natural, que aporta       " +
                                                  "\n probióticos beneficiosos para la salud intestinal y el sistema inmunológico. Este es solo un diagnóstico predeterminado" +
                                                  "\n lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y    " +
                                                  "\n sus respuestas estén correctas, para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer mejor   " +
                                                  "\n seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del diagnóstico no le satisface" +
                                                  "\n del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que" +
                                                  "\n te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Úlceras indoloras, Erupción cutánea, Dolor de cabeza, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Sífilis." +
                                                  "\n Es fundamental que el adolescente mantenga una hidratación adecuada, consumiendo entre 2.5 y 3 litros de agua al día, " +
                                                  "\n lo que equivale a aproximadamente 10 a 12 vasos de agua de tamaño regular, para ayudar a la eliminación de toxinas y  " +
                                                  "\n prevenir complicaciones derivadas de la infección. La actividad física debe ser moderada y adaptada a su estado de salud," +
                                                  "\n priorizando ejercicios aeróbicos de bajo impacto como caminatas o yoga durante al menos 30 a 60 minutos al día para      " +
                                                  "\n fortalecer el sistema inmunológico sin generar estrés excesivo en el cuerpo. POSIBLE TRATAMIENTO: La sífilis se trata    " +
                                                  "\n con antibióticos, siendo la penicilina benzatina la opción más eficaz para eliminar la bacteria. En casos de alergia a   " +
                                                  "\n la penicilina, se pueden utilizar alternativas como la doxiciclina o la azitromicina. Marcas reconocidas incluyen Bicillin" +
                                                  "\n L-A y Doryx. En cuanto a la alimentación, es recomendable el consumo de alimentos ricos en antioxidantes y vitamina C,    " +
                                                  "\n como fresas (por cada 100 gramos, aproximadamente 59 mg de vitamina C, cubriendo el 65% de la ingesta diaria recomendada) " +
                                                  "\n y kiwis (por cada 100 gramos, alrededor de 92 mg de vitamina C, cubriendo el 102% de la ingesta diaria recomendada).      " +
                                                  "\n También se sugiere el consumo de yogur natural, que aporta probióticos beneficiosos para la salud intestinal y el sistema " +
                                                  "\n inmunológico. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente  " +
                                                  "\n tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de  " +
                                                  "\n un diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud  " +
                                                  "\n si la respuesta del diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes     " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Pérdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n Es fundamental que el adolescente mantenga una hidratación adecuada, consumiendo entre 2.5 y 3 litros de agua al día, lo  " +
                                                  "\n que equivale a aproximadamente 10 a 12 vasos de agua de tamaño regular, para ayudar a la eliminación de toxinas y mejorar " +
                                                  "\n la función pulmonar. La actividad física debe ser moderada y adaptada a su capacidad respiratoria, priorizando ejercicios " +
                                                  "\n de bajo impacto como caminatas y respiración controlada durante al menos 30 a 60 minutos al día para fortalecer el sistema" +
                                                  "\n inmunológico sin generar estrés excesivo en los pulmones. POSIBLE TRATAMIENTO: La tuberculosis se trata con una combinación" +
                                                  "\n de antibióticos de primera línea, siendo la isoniazida y la rifampicina opciones altamente eficaces para eliminar la bacteria." +
                                                  "\n La isoniazida bloquea la síntesis de la pared celular bacteriana, mientras que la rifampicina inhibe su replicación. Marcas " +
                                                  "\n reconocidas incluyen Rimactane y Laniazid. En cuanto a la alimentación, es recomendable el consumo de alimentos ricos en    " +
                                                  "\n antioxidantes y vitamina A, como zanahorias (por cada 100 gramos, aproximadamente 835 µg de vitamina A, cubriendo el 93% de " +
                                                  "\n la ingesta diaria recomendada) y espinacas (por cada 100 gramos, alrededor de 28 mg de vitamina C, cubriendo el 31% de la   " +
                                                  "\n ingesta diaria recomendada). También se sugiere el consumo de almendras, que aportan vitamina E (por cada 100 gramos,       " +
                                                  "\n aproximadamente 25 mg de vitamina E, cubriendo el 166% de la ingesta diaria recomendada), lo que ayuda a proteger las células" +
                                                  "\n pulmonares del daño oxidativo. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que" +
                                                  "\n el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer" +
                                                  "\n más de un diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud" +
                                                  "\n si la respuesta del diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchazón en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n Es fundamental que el adolescente mantenga una hidratación adecuada, consumiendo entre 2.5 y 3 litros de agua al día, " +
                                                  "\n lo que equivale a aproximadamente 10 a 12 vasos de agua de tamaño regular, para ayudar a reducir la inflamación y     " +
                                                  "\n mantener la lubricación de las articulaciones. Además, se recomienda el consumo de líquidos con propiedades           " +
                                                  "\n antiinflamatorias como té verde y agua con limón. La actividad física debe ser moderada y adaptada a su movilidad,    " +
                                                  "\n priorizando ejercicios de bajo impacto como natación, yoga o caminatas durante al menos 30 a 60 minutos al día para   " +
                                                  "\n mejorar la flexibilidad y reducir la rigidez articular. POSIBLE TRATAMIENTO: La artritis se maneja con medicamentos   " +
                                                  "\n antiinflamatorios y analgésicos, siendo el ibuprofeno y el naproxeno opciones altamente eficaces para reducir el dolor" +
                                                  "\n y la inflamación. Marcas reconocidas incluyen Advil y Aleve. En cuanto a la alimentación, es recomendable el consumo  " +
                                                  "\n de alimentos ricos en antioxidantes y ácidos grasos Omega-3, como el salmón (por cada 100 gramos, aproximadamente     " +
                                                  "\n 2.2 gramos de Omega-3, lo que contribuye a la reducción de la inflamación articular) y las espinacas (por cada 100    " +
                                                  "\n gramos, alrededor de 28 mg de vitamina C, cubriendo el 31% de la ingesta diaria recomendada). También se sugiere el   " +
                                                  "\n consumo de cúrcuma, que posee propiedades antiinflamatorias y ayuda a mejorar la función articular. Este es solo un   " +
                                                  "\n diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que " +
                                                  "\n por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un diagnóstico de Mi Vida" +
                                                  "\n para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del    " +
                                                  "\n diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita  " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n Es fundamental que el adolescente mantenga una hidratación adecuada, consumiendo entre 2.5 y 3 litros de agua al día,  " +
                                                  "\n lo que equivale a aproximadamente 10 a 12 vasos de agua de tamaño regular, para ayudar a aliviar la irritación de las  " +
                                                  "\n vías respiratorias y prevenir la deshidratación causada por la fiebre y la tos persistente. La actividad física debe   " +
                                                  "\n ser mínima mientras persistan los síntomas, priorizando el descanso absoluto y ejercicios de respiración para mejorar  " +
                                                  "\n la oxigenación. POSIBLE TRATAMIENTO: La tosferina se trata con antibióticos, siendo la azitromicina y la claritromicina" +
                                                  "\n opciones altamente eficaces para reducir la duración y gravedad de los síntomas. La azitromicina bloquea la replicación" +
                                                  "\n de la bacteria, mientras que la claritromicina ayuda a eliminar la infección de manera progresiva. Marcas reconocidas  " +
                                                  "\n incluyen Zithromax y Biaxin. En cuanto a la alimentación, es recomendable el consumo de alimentos ricos en antioxidantes" +
                                                  "\n y vitamina C, como naranjas (por cada 100 gramos, aproximadamente 53 mg de vitamina C, cubriendo el 59% de la ingesta  " +
                                                  "\n diaria recomendada) y fresas (por cada 100 gramos, alrededor de 59 mg de vitamina C, cubriendo el 65% de la ingesta    " +
                                                  "\n diaria recomendada). También se sugiere el consumo de miel, que posee propiedades antimicrobianas y ayuda a calmar la  " +
                                                  "\n irritación de la garganta. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100%  " +
                                                  "\n que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda" +
                                                  "\n hacer más de un diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por" +
                                                  "\n su salud si la respuesta del diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes" +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchazón de las glándulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n Es fundamental que el adolescente mantenga una hidratación adecuada, consumiendo entre 2.5 y 3 litros de agua al día,      " +
                                                  "\n lo que equivale a aproximadamente 10 a 12 vasos de agua de tamaño regular, para ayudar a reducir la inflamación y prevenir " +
                                                  "\n la deshidratación causada por la fiebre. La actividad física debe ser mínima mientras persistan los síntomas, priorizando  " +
                                                  "\n el descanso absoluto y evitando esfuerzos que puedan aumentar la inflamación de las glándulas salivales. POSIBLE TRATAMIENTO:" +
                                                  "\n No existe un tratamiento antiviral específico para las paperas, pero los síntomas pueden manejarse con analgésicos como el   " +
                                                  "\n paracetamol y el ibuprofeno para reducir la fiebre y el dolor. Marcas reconocidas incluyen Tempra y Advil. También se recomienda" +
                                                  "\n la aplicación de compresas frías o tibias en la zona inflamada para aliviar el malestar. En cuanto a la alimentación, es    " +
                                                  "\n recomendable el consumo de alimentos suaves y ricos en antioxidantes, como plátanos (por cada 100 gramos, aproximadamente   " +
                                                  "\n 358 mg de potasio, cubriendo el 10% de la ingesta diaria recomendada) y yogur natural, que aporta probióticos beneficiosos  " +
                                                  "\n para la salud intestinal y el sistema inmunológico. También se sugiere evitar alimentos ácidos como cítricos y vinagre, ya  " +
                                                  "\n que pueden aumentar la irritación de las glándulas salivales. Este es solo un diagnóstico predeterminado lógico, haberlo    " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén    " +
                                                  "\n correctas, para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento " +
                                                  "\n adecuado de su paciente, además por su salud si la respuesta del diagnóstico no le satisface del todo se le recomienda mucho" +
                                                  "\n consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupción cutánea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n El Zika requiere una hidratación adecuada, con una ingesta diaria de 3 a 4 litros de agua, equivalentes a 12 a 16 vasos de    " +
                                                  "\n tamaño regular, para prevenir la deshidratación causada por la fiebre y otros síntomas. También se recomienda el consumo de   " +
                                                  "\n líquidos con electrolitos naturales, como agua de coco, para mantener el equilibrio de minerales en el cuerpo. La actividad   " +
                                                  "\n física debe ser mínima mientras persistan los síntomas, priorizando el descanso absoluto y ejercicios de respiración para     " +
                                                  "\n mejorar la oxigenación. No existe un tratamiento antiviral específico para el Zika, pero los síntomas pueden manejarse con    " +
                                                  "\n analgésicos como el paracetamol, útil para reducir la fiebre y el dolor muscular. Marcas reconocidas incluyen Tempra y Tylenol." +
                                                  "\n Es importante evitar el uso de aspirina y otros antiinflamatorios no esteroides hasta descartar dengue, ya que pueden aumentar " +
                                                  "\n el riesgo de sangrado. En cuanto a la alimentación, se recomienda el consumo de alimentos ricos en antioxidantes y vitamina C, " +
                                                  "\n esenciales para fortalecer el sistema inmunológico. Naranjas (por cada 100 gramos, aproximadamente 53 mg de vitamina C, cubriendo" +
                                                  "\n el 59% de la ingesta diaria recomendada) y fresas (por cada 100 gramos, alrededor de 59 mg de vitamina C, cubriendo el 65% de la " +
                                                  "\n ingesta diaria recomendada) son opciones óptimas. También se sugiere el consumo de jengibre, que posee propiedades antiinflamatorias" +
                                                  "\n y ayuda a aliviar el malestar general. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% " +
                                                  "\n que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente correctas. Para ello, se   " +
                                                  "\n recomienda hacer más de un diagnóstico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente.   " +
                                                  "\n Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico.           " +
                                                  "\n Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, Vómitos, Deshidratación, Dolor abdominal.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n El Rotavirus requiere una hidratación adecuada, con una ingesta diaria de 3.5 a 4.5 litros de agua, equivalentes a 12 a 18 vasos  " +
                                                  "\n de tamaño regular, para prevenir la deshidratación causada por la diarrea y los vómitos También se recomienda el consumo de       " +
                                                  "\n soluciones de rehidratación oral como Pedialyte o Enfalyte, que ayudan a reponer los electrolitos perdidos y mejorar la recuperación" +
                                                  "\n La actividad física debe ser mínima mientras persistan los síntomas, priorizando el descanso absoluto y evitando esfuerzos que    " +
                                                  "\n puedan agravar la pérdida de líquidos. No existe un tratamiento antiviral específico para el Rotavirus, pero los síntomas pueden  " +
                                                  "\n manejarse con rehidratación constante y monitoreo de la pérdida de líquidos En casos graves, puede requerirse administración de   " +
                                                  "\n líquidos intravenosos en un hospital para evitar complicaciones Marcas reconocidas incluyen Pedialyte y Enfalyte, recomendadas    " +
                                                  "\n para la rehidratación efectiva. En cuanto a la alimentación, se recomienda el consumo de alimentos suaves y ricos en electrolitos," +
                                                  "\n esenciales para fortalecer el sistema digestivo y prevenir la deshidratación Plátanos (por cada 100 gramos, aproximadamente 358 mg" +
                                                  "\n de potasio, cubriendo el 10% de la ingesta diaria recomendada) y arroz blanco, que es fácil de digerir y ayuda a estabilizar el   " +
                                                  "\n sistema digestivo También se sugiere el consumo de yogur natural, que aporta probióticos beneficiosos para la salud intestinal y la" +
                                                  "\n recuperación. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas sean completamente correctas Para ello, se recomienda hacer más de un     " +
                                                  "\n diagnóstico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente Además, por su salud, si la respuesta" +
                                                  "\n del diagnóstico no le satisface del todo, se recomienda consultar a su médico Angel L Montes agradece tu visita a la app Mi Vida    " +
                                                  "\n y espera que te mejores");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, Náuseas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listerosis. " +
                                                  "\n La Listeriosis requiere una hidratación adecuada con una ingesta diaria de 2.5 a 3 litros de agua, equivalentes a  " +
                                                  "\n 10 a 12 vasos de tamaño regular, para ayudar a la eliminación de toxinas y prevenir complicaciones derivadas de la " +
                                                  "\n infección También se recomienda el consumo de líquidos con propiedades antimicrobianas como agua con limón y infusiones " + 
                                                  "\n de jengibre para fortalecer el sistema inmunológico La actividad física debe ser mínima mientras persistan los síntomas " +
                                                  "\n priorizando el descanso absoluto y evitando esfuerzos que puedan debilitar el organismo El tratamiento de la Listeriosis" +
                                                  "\n se basa en el uso de antibióticos, siendo la ampicilina y la gentamicina opciones altamente eficaces para eliminar la   " +
                                                  "\n bacteria La ampicilina impide la replicación de la bacteria mientras que la gentamicina bloquea la producción de proteínas" +
                                                  "\n esenciales para su supervivencia Marcas reconocidas incluyen Ampex y Garamycin En casos graves se pueden administrar      " +
                                                  "\n corticoides para reducir la inflamación y mejorar la respuesta del organismo En cuanto a la alimentación se recomienda    " +
                                                  "\n el consumo de alimentos ricos en antioxidantes y vitamina C, esenciales para fortalecer el sistema inmunológico Espinacas " +
                                                  "\n (por cada 100 gramos aproximadamente 28 mg de vitamina C cubriendo el 31% de la ingesta diaria recomendada) y zanahorias  " +
                                                  "\n (por cada 100 gramos aproximadamente 835 µg de vitamina A cubriendo el 93% de la ingesta diaria recomendada) También se   " +
                                                  "\n sugiere el consumo de yogur natural que aporta probióticos beneficiosos para la salud intestinal y la recuperación Este   " +
                                                  "\n es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad" +
                                                  "\n y que por ello la enfermedad y sus respuestas sean completamente correctas Para ello se recomienda hacer más de un diagnóstico" +
                                                  "\n de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente Además por su salud si la respuesta del " +
                                                  "\n diagnóstico no le satisface del todo se recomienda consultar a su médico Angel L Montes agradece tu visita a la app Mi Vida  " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, Vómitos.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis. " +
                                                  "\n La Shigelosis requiere una hidratación adecuada con una ingesta diaria de 3.5 a 4.5 litros de agua, equivalentes a        " +
                                                  "\n 12 a 18 vasos de tamaño regular, para prevenir la deshidratación causada por la diarrea y la fiebre También se recomienda " +
                                                  "\n el consumo de soluciones de rehidratación oral como Pedialyte o Enfalyte, que ayudan a reponer los electrolitos perdidos  " +
                                                  "\n y mejorar la recuperación La actividad física debe ser mínima mientras persistan los síntomas priorizando el descanso     " +
                                                  "\n absoluto y evitando esfuerzos que puedan agravar la pérdida de líquidos El tratamiento de la Shigelosis se basa en la     " +
                                                  "\n rehidratación constante y en casos graves puede requerirse administración de líquidos intravenosos en un hospital para    " +
                                                  "\n evitar complicaciones En infecciones severas se pueden utilizar antibióticos como ciprofloxacino y azitromicina, que      " +
                                                  "\n ayudan a reducir la duración de la enfermedad Marcas reconocidas incluyen Cipro y Zithromax En cuanto a la alimentación   " +
                                                  "\n se recomienda el consumo de alimentos suaves y ricos en electrolitos, esenciales para fortalecer el sistema digestivo y   " +
                                                  "\n prevenir la deshidratación Plátanos (por cada 100 gramos aproximadamente 358 mg de potasio cubriendo el 10% de la ingesta " +
                                                  "\n diaria recomendada) y arroz blanco, que es fácil de digerir y ayuda a estabilizar el sistema digestivo También se sugiere " +
                                                  "\n el consumo de yogur natural, que aporta probióticos beneficiosos para la salud intestinal y la recuperación Este es solo  " +
                                                  "\n un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que  " +
                                                  "\n por ello la enfermedad y sus respuestas sean completamente correctas Para ello se recomienda hacer más de un diagnóstico  " +
                                                  "\n de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente Además por su salud si la respuesta  " +
                                                  "\n del diagnóstico no le satisface del todo se recomienda consultar a su médico Angel L Montes agradece tu visita a la app   " +
                                                  "\n Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos crónica, Producción excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad Pulmonar Obstructiva Crónica (EPOC)." +
                                                  "\n La Enfermedad Pulmonar Obstructiva Crónica (EPOC) requiere una hidratación adecuada con una ingesta diaria   " +
                                                  "\n de 2.5 a 3 litros de agua, equivalentes a 10 a 12 vasos de tamaño regular, para ayudar a mantener la función " +
                                                  "\n pulmonar y reducir la inflamación También se recomienda el consumo de líquidos con propiedades antioxidantes " +
                                                  "\n como té verde y agua con limón para mejorar la salud respiratoria La actividad física debe ser moderada y    " +
                                                  "\n adaptada a la capacidad pulmonar priorizando ejercicios de bajo impacto como caminatas, natación y ejercicios" +
                                                  "\n de respiración para fortalecer los músculos respiratorios y mejorar la oxigenación El tratamiento de la EPOC " +
                                                  "\n se basa en el uso de broncodilatadores y corticosteroides inhalados, siendo el salbutamol y la fluticasona   " +
                                                  "\n opciones altamente eficaces para mejorar la respiración y reducir la inflamación Marcas reconocidas incluyen " +
                                                  "\n Ventolin y Flixotide En casos avanzados se pueden administrar terapias de oxígeno para mejorar la calidad de " +
                                                  "\n vida del paciente En cuanto a la alimentación se recomienda el consumo de alimentos ricos en antioxidantes y " +
                                                  "\n ácidos grasos Omega-3, esenciales para reducir la inflamación pulmonar Salmón (por cada 100 gramos aproximadamente" +
                                                  "\n 2.2 gramos de Omega-3) y espinacas (por cada 100 gramos aproximadamente 28 mg de vitamina C, cubriendo el 31%     " +
                                                  "\n de la ingesta diaria recomendada) También se sugiere el consumo de cúrcuma, que posee propiedades antiinflamatorias" +
                                                  "\n y ayuda a mejorar la función pulmonar Este es solo un diagnóstico predeterminado lógico, haberlo consultado no    " +
                                                  "\n garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean         " +
                                                  "\n completamente correctas Para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer mayor      " +
                                                  "\n seguridad en el tratamiento adecuado de su paciente Además por su salud si la respuesta del diagnóstico no le     " +
                                                  "\n satisface del todo se recomienda consultar a su médico Angel L Montes agradece tu visita a la app Mi Vida y       " +
                                                  "\n espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreción anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia. " +
                                                  "\n La Clamidia requiere una hidratación adecuada con una ingesta diaria de 2.5 a 3 litros de agua, equivalentes a   " +
                                                  "\n 10 a 12 vasos de tamaño regular, para ayudar a la eliminación de toxinas y prevenir molestias urinarias También  " +
                                                  "\n se recomienda el consumo de líquidos con propiedades antimicrobianas como agua con limón y infusiones de jengibre" +
                                                  "\n para fortalecer el sistema inmunológico La actividad física debe ser moderada y adaptada a su estado de salud    " +
                                                  "\n priorizando ejercicios aeróbicos de bajo impacto como caminatas o yoga durante al menos 30 a 60 minutos al día   " +
                                                  "\n para fortalecer el sistema inmunológico sin generar estrés excesivo en el cuerpo El tratamiento de la Clamidia   " +
                                                  "\n se basa en el uso de antibióticos, siendo la azitromicina y la doxiciclina opciones altamente eficaces para eliminar  " +
                                                  "\n la bacteria La azitromicina se administra en una dosis única mientras que la doxiciclina se toma durante varios días  " +
                                                  "\n Marcas reconocidas incluyen Zithromax y Doryx En cuanto a la alimentación se recomienda el consumo de alimentos ricos " +
                                                  "\n en antioxidantes y vitamina C, esenciales para fortalecer el sistema inmunológico Fresas (por cada 100 gramos         " +
                                                  "\n aproximadamente 59 mg de vitamina C, cubriendo el 65% de la ingesta diaria recomendada) y kiwis (por cada 100 gramos  " +
                                                  "\n aproximadamente 92 mg de vitamina C, cubriendo el 102% de la ingesta diaria recomendada) También se sugiere el consumo" +
                                                  "\n de yogur natural, que aporta probióticos beneficiosos para la salud intestinal y la recuperación Este es solo un      " +
                                                  "\n diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y     " +
                                                  "\n que por ello la enfermedad y sus respuestas sean completamente correctas Para ello se recomienda hacer más de un      " +
                                                  "\n diagnóstico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente Además por su salud  " +
                                                  "\n si la respuesta del diagnóstico no le satisface del todo se recomienda consultar a su médico Angel L Montes agradece  " +
                                                  "\n tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Náuseas, Dolor de cabeza severo, Rigidez en el cuello, Confusión.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n La Meningitis bacteriana requiere una hidratación adecuada con una ingesta diaria de 3.5 a 4.5 litros de agua,  " +
                                                  "\n equivalentes a 12 a 18 vasos de tamaño regular, para prevenir la deshidratación causada por la fiebre intensa   " +
                                                  "\n y la inflamación de las meninges También se recomienda el consumo de soluciones de rehidratación oral como      " +
                                                  "\n Pedialyte o Enfalyte, que ayudan a reponer los electrolitos perdidos y mejorar la recuperación La actividad     " +
                                                  "\n física debe ser mínima mientras persistan los síntomas priorizando el descanso absoluto y evitando esfuerzos    " +
                                                  "\n que puedan agravar la inflamación cerebral El tratamiento de la Meningitis bacteriana se basa en el uso de      " +
                                                  "\n antibióticos intravenosos, siendo la ceftriaxona y la vancomicina opciones altamente eficaces para eliminar     " +
                                                  "\n la infección y reducir la inflamación Marcas reconocidas incluyen Rocephin y Vancocin En casos graves se pueden " +
                                                  "\n administrar corticoides para reducir la inflamación y mejorar la respuesta del organismo En cuanto a la alimentación " +
                                                  "\n se recomienda el consumo de alimentos ricos en antioxidantes y vitamina C, esenciales para fortalecer el sistema     " +
                                                  "\n inmunológico Espinacas (por cada 100 gramos aproximadamente 28 mg de vitamina C, cubriendo el 31% de la ingesta      " +
                                                  "\n diaria recomendada) y zanahorias (por cada 100 gramos aproximadamente 835 µg de vitamina A, cubriendo el 93% de      " +
                                                  "\n la ingesta diaria recomendada) También se sugiere el consumo de yogur natural, que aporta probióticos beneficiosos   " +
                                                  "\n para la salud intestinal y la recuperación Este es solo un diagnóstico predeterminado lógico, haberlo consultado     " +
                                                  "\n no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente " +
                                                  "\n correctas Para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer mayor seguridad en el tratamiento " +
                                                  "\n adecuado de su paciente Además por su salud si la respuesta del diagnóstico no le satisface del todo se recomienda consultar" +
                                                  "\n a su médico Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, Pérdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, Pérdida de apetito.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Cáncer." +
                                                  "\n El Cáncer requiere una hidratación adecuada con una ingesta diaria de 3 a 4 litros de agua, equivalentes a 12 a 16 vasos    " +
                                                  "\n de tamaño regular, para ayudar a mantener la función celular y reducir los efectos secundarios del tratamiento También se   " +
                                                  "\n recomienda el consumo de líquidos con propiedades antioxidantes como té verde y agua con limón para fortalecer el sistema   " +
                                                  "\n inmunológico La actividad física debe ser moderada y adaptada a la capacidad del paciente priorizando ejercicios de bajo    " +
                                                  "\n impacto como caminatas, yoga y ejercicios de respiración para mejorar la circulación y reducir la fatiga El tratamiento     " +
                                                  "\n del Cáncer varía según el tipo y la etapa de la enfermedad pero puede incluir quimioterapia, radioterapia, cirugía y terapias" +
                                                  "\n dirigidas siendo la doxorrubicina y el paclitaxel opciones comunes en ciertos tipos de cáncer Marcas reconocidas incluyen   " +
                                                  "\n Adriamycin y Taxol En algunos casos se pueden administrar inmunoterapias para mejorar la respuesta del organismo En cuanto  " +
                                                  "\n a la alimentación se recomienda el consumo de alimentos ricos en antioxidantes y proteínas, esenciales para fortalecer el   " +
                                                  "\n sistema inmunológico y mantener la energía Espinacas (por cada 100 gramos aproximadamente 28 mg de vitamina C, cubriendo el " +
                                                  "\n 31% de la ingesta diaria recomendada) y zanahorias (por cada 100 gramos aproximadamente 835 µg de vitamina A, cubriendo el  " +
                                                  "\n 93% de la ingesta diaria recomendada) También se sugiere el consumo de yogur natural, que aporta probióticos beneficiosos   " +
                                                  "\n para la salud intestinal y la recuperación Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza" +
                                                  "\n al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente correctas Para " +
                                                  "\n ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su   " +
                                                  "\n paciente Además por su salud si la respuesta del diagnóstico no le satisface del todo se recomienda consultar a su médico    " +
                                                  "\n Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            } 
                        }
                        if(EstaturaMasculino.equals("1.55-1.70 m")){
                           if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza (gripe)." +
                                                  "\n La Influenza (gripe) requiere una hidratación adecuada con una ingesta diaria de 3.5 a 4.5 litros de agua, equivalentes     " +
                                                  "\n a 12 a 18 vasos de tamaño regular, para prevenir la deshidratación causada por la fiebre intensa y la sudoración También    " +
                                                  "\n se recomienda el consumo de soluciones de rehidratación oral como Pedialyte o Enfalyte, que ayudan a reponer los electrolitos" +
                                                  "\n perdidos y mejorar la recuperación La actividad física debe ser mínima mientras persistan los síntomas priorizando el descanso" +
                                                  "\n absoluto y evitando esfuerzos que puedan agravar la fatiga El tratamiento de la Influenza se basa en el uso de antivirales,  " +
                                                  "\n siendo el oseltamivir y el baloxavir opciones altamente eficaces para reducir la duración y gravedad de la enfermedad Marcas " +
                                                  "\n reconocidas incluyen Tamiflu y Xofluza En casos graves se pueden administrar antipiréticos como paracetamol para controlar la" +
                                                  "\n fiebre y mejorar el bienestar del paciente En cuanto a la alimentación se recomienda el consumo de alimentos ricos en antioxidantes" +
                                                  "\n y vitamina C, esenciales para fortalecer el sistema inmunológico Naranjas (por cada 100 gramos aproximadamente 53 mg de vitamina C," +
                                                  "\n cubriendo el 59% de la ingesta diaria recomendada) y fresas (por cada 100 gramos aproximadamente 59 mg de vitamina C, cubriendo    " +
                                                  "\n el 65% de la ingesta diaria recomendada) También se sugiere el consumo de jengibre, que posee propiedades antiinflamatorias y      " +
                                                  "\n ayuda a aliviar el malestar general Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100%     " +
                                                  "\n que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente correctas Para ello se       " +
                                                  "\n recomienda hacer más de un diagnóstico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente        " +
                                                  "\n Además por su salud si la respuesta del diagnóstico no le satisface del todo se recomienda consultar a su médico Angel L Montes    " +
                                                  "\n agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                               textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumonía." +
                                                  "\n La Neumonía requiere una hidratación adecuada con una ingesta diaria de 3.5 a 4.5 litros de agua, equivalentes a 12 a 18 vasos   " +
                                                  "\n de tamaño regular, para prevenir la deshidratación causada por la fiebre intensa y la dificultad respiratoria También se         " +
                                                  "\n recomienda el consumo de soluciones de rehidratación oral como Pedialyte o Enfalyte, que ayudan a reponer los electrolitos       " +
                                                  "\n perdidos y mejorar la recuperación La actividad física debe ser mínima mientras persistan los síntomas priorizando el descanso   " +
                                                  "\n absoluto y evitando esfuerzos que puedan agravar la fatiga respiratoria El tratamiento de la Neumonía se basa en el uso de       " +
                                                  "\n antibióticos, siendo la amoxicilina y la azitromicina opciones altamente eficaces para eliminar la infección y reducir la        " +
                                                  "\n inflamación pulmonar Marcas reconocidas incluyen Amoxil y Zithromax En casos graves se pueden administrar terapias de oxígeno    " +
                                                  "\n para mejorar la oxigenación del paciente En cuanto a la alimentación se recomienda el consumo de alimentos ricos en antioxidantes" +
                                                  "\n y vitamina C, esenciales para fortalecer el sistema inmunológico Naranjas (por cada 100 gramos aproximadamente 53 mg de vitamina C," +
                                                  "\n cubriendo el 59% de la ingesta diaria recomendada) y fresas (por cada 100 gramos aproximadamente 59 mg de vitamina C, cubriendo el " +
                                                  "\n 65% de la ingesta diaria recomendada) También se sugiere el consumo de jengibre, que posee propiedades antiinflamatorias y ayuda " +
                                                  "\n a aliviar la congestión pulmonar Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el" +
                                                  "\n paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente correctas Para ello se recomienda  " +
                                                  "\n hacer más de un diagnóstico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente Además por su    " +
                                                  "\n salud si la respuesta del diagnóstico no le satisface del todo se recomienda consultar a su médico Angel L Montes agradece tu     " +
                                                  "\n visita a la app Mi Vida y espera que te mejores."); 
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visión borrosa, Pérdida de peso.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n La Diabetes requiere una hidratación adecuada con una ingesta diaria de 2.5 a 3.5 litros de agua, equivalentes a 10 a 14 vasos   " +
                                                  "\n de tamaño regular, para ayudar a mantener el equilibrio de glucosa en sangre y prevenir la deshidratación causada por la micción " +
                                                  "\n frecuente También se recomienda el consumo de infusiones sin azúcar y agua con limón, que contribuyen a la regulación metabólica " +
                                                  "\n La actividad física debe ser moderada y adaptada a la capacidad del paciente priorizando ejercicios aeróbicos como caminatas,    " +
                                                  "\n ciclismo y natación durante al menos 30 a 60 minutos al día, lo que ayuda a mejorar la sensibilidad a la insulina y controlar    " +
                                                  "\n los niveles de glucosa El tratamiento de la Diabetes varía según el tipo pero puede incluir insulina en el caso de diabetes      " +
                                                  "\n tipo 1 y medicamentos orales como la metformina en el caso de diabetes tipo 2 Marcas reconocidas incluyen Humalog, Lantus y      " +
                                                  "\n Glucophage En algunos casos se pueden administrar inhibidores de SGLT2 para mejorar la eliminación de glucosa a través de la     " +
                                                  "\n orina En cuanto a la alimentación se recomienda el consumo de alimentos ricos en fibra y proteínas, esenciales para estabilizar  " +
                                                  "\n los niveles de glucosa en sangre Avena (por cada 100 gramos aproximadamente 10 gramos de fibra, cubriendo el 40% de la ingesta   " +
                                                  "\n diaria recomendada) y almendras (por cada 100 gramos aproximadamente 25 mg de vitamina E, cubriendo el 166% de la ingesta diaria " +
                                                  "\n recomendada) También se sugiere el consumo de yogur natural, que aporta probióticos beneficiosos para la salud intestinal y la   " +
                                                  "\n regulación metabólica Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente " +
                                                  "\n tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente correctas Para ello se recomienda hacer más" +
                                                  "\n de un diagnóstico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente Además por su salud si la " +
                                                  "\n respuesta del diagnóstico no le satisface del todo se recomienda consultar a su médico Angel L Montes agradece tu visita a la app" +
                                                  "\n Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresión en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n El Asma requiere una hidratación adecuada con una ingesta diaria de 2.5 a 3.5 litros de agua, equivalentes a 10 a 14 vasos     " +
                                                  "\n de tamaño regular, para ayudar a mantener la función pulmonar y reducir la inflamación También se recomienda el consumo de     " +
                                                  "\n líquidos con propiedades antioxidantes como té verde y agua con limón para mejorar la salud respiratoria La actividad física   " +
                                                  "\n debe ser moderada y adaptada a la capacidad pulmonar priorizando ejercicios de bajo impacto como caminatas, natación y ejercicios" +
                                                  "\n de respiración para fortalecer los músculos respiratorios y mejorar la oxigenación El tratamiento del Asma se basa en el uso de  " +
                                                  "\n broncodilatadores y corticosteroides inhalados, siendo el salbutamol y la fluticasona opciones altamente eficaces para mejorar   " +
                                                  "\n la respiración y reducir la inflamación Marcas reconocidas incluyen Ventolin y Flixotide En casos avanzados se pueden administrar" +
                                                  "\n terapias de oxígeno para mejorar la calidad de vida del paciente En cuanto a la alimentación se recomienda el consumo de alimentos" +
                                                  "\n ricos en antioxidantes y ácidos grasos Omega-3, esenciales para reducir la inflamación pulmonar Salmón (por cada 100 gramos       " +
                                                  "\n aproximadamente 2.2 gramos de Omega-3) y espinacas (por cada 100 gramos aproximadamente 28 mg de vitamina C, cubriendo el 31%     " +
                                                  "\n de la ingesta diaria recomendada) También se sugiere el consumo de cúrcuma, que posee propiedades antiinflamatorias y ayuda a     " +
                                                  "\n mejorar la función pulmonar Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el     " +
                                                  "\n paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente correctas Para ello se recomienda  " +
                                                  "\n hacer más de un diagnóstico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente Además por su    " +
                                                  "\n salud si la respuesta del diagnóstico no le satisface del todo se recomienda consultar a su médico Angel L Montes agradece tu     " +
                                                  "\n visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, Pérdida de peso, Ganglios linfáticos inflamados, Erupción cutánea (Diarrea).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n El VIH/SIDA requiere una hidratación adecuada con una ingesta diaria de 3 a 4 litros de agua, equivalentes a 12 a 16 vasos  " +
                                                  "\n de tamaño regular, para ayudar a mantener la función inmunológica y prevenir la deshidratación causada por fiebre y efectos " +
                                                  "\n secundarios del tratamiento También se recomienda el consumo de líquidos con propiedades antioxidantes como té verde y agua " +
                                                  "\n con limón para fortalecer el sistema inmunológico La actividad física debe ser moderada y adaptada a la capacidad del paciente" +
                                                  "\n priorizando ejercicios de bajo impacto como caminatas, yoga y ejercicios de respiración para mejorar la circulación y reducir " +
                                                  "\n la fatiga El tratamiento del VIH/SIDA se basa en el uso de antirretrovirales, siendo el tenofovir, emtricitabina y dolutegravir" +
                                                  "\n opciones altamente eficaces para controlar la replicación del virus y mejorar la calidad de vida Marcas reconocidas incluyen   " +
                                                  "\n Truvada, Tivicay y Biktarvy En algunos casos se pueden administrar terapias inmunomoduladoras para mejorar la respuesta del    " +
                                                  "\n organismo. En cuanto a la alimentación se recomienda el consumo de alimentos ricos en antioxidantes y proteínas, esenciales    " +
                                                  "\n para fortalecer el sistema inmunológico y mantener la energía Espinacas (por cada 100 gramos aproximadamente 28 mg de vitamina C," +
                                                  "\n cubriendo el 31% de la ingesta diaria recomendada) y zanahorias (por cada 100 gramos aproximadamente 835 µg de vitamina A,      " +
                                                  "\n cubriendo el 93% de la ingesta diaria recomendada) También se sugiere el consumo de yogur natural, que aporta probióticos       " +
                                                  "\n beneficiosos para la salud intestinal y la recuperación Este es solo un diagnóstico predeterminado lógico, haberlo consultado   " +
                                                  "\n no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente      " +
                                                  "\n correctas Para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer mayor seguridad en el tratamiento      " +
                                                  "\n adecuado de su paciente Además por su salud si la respuesta del diagnóstico no le satisface del todo se recomienda consultar    " +
                                                  "\n a su médico Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreción anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n La Gonorrea requiere una hidratación adecuada con una ingesta diaria de 2.5 a 3 litros de agua, equivalentes a 10 a 12 vasos  " +
                                                  "\n de tamaño regular, para ayudar a la eliminación de toxinas y prevenir molestias urinarias También se recomienda el consumo de " +
                                                  "\n líquidos con propiedades antimicrobianas como agua con limón y infusiones de jengibre para fortalecer el sistema inmunológico " +
                                                  "\n La actividad física debe ser moderada y adaptada a su estado de salud priorizando ejercicios aeróbicos de bajo impacto como   " +
                                                  "\n caminatas o yoga durante al menos 30 a 60 minutos al día para fortalecer el sistema inmunológico sin generar estrés excesivo  " +
                                                  "\n en el cuerpo El tratamiento de la Gonorrea se basa en el uso de antibióticos, siendo la ceftriaxona y la azitromicina opciones" +
                                                  "\n altamente eficaces para eliminar la bacteria La ceftriaxona se administra en una dosis única mientras que la azitromicina     " +
                                                  "\n complementa el tratamiento para evitar resistencia bacteriana Marcas reconocidas incluyen Rocephin y Zithromax En cuanto a la " +
                                                  "\n alimentación se recomienda el consumo de alimentos ricos en antioxidantes y vitamina C, esenciales para fortalecer el sistema " +
                                                  "\n inmunológico Fresas (por cada 100 gramos aproximadamente 59 mg de vitamina C, cubriendo el 65% de la ingesta diaria recomendada)" +
                                                  "\n y kiwis (por cada 100 gramos aproximadamente 92 mg de vitamina C, cubriendo el 102% de la ingesta diaria recomendada) También se" +
                                                  "\n sugiere el consumo de yogur natural, que aporta probióticos beneficiosos para la salud intestinal y la recuperación Este es solo" +
                                                  "\n un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello" +
                                                  "\n la enfermedad y sus respuestas sean completamente correctas Para ello se recomienda hacer más de un diagnóstico de Mi Vida para  " +
                                                  "\n establecer mayor seguridad en el tratamiento adecuado de su paciente Además por su salud si la respuesta del diagnóstico no le   " +
                                                  "\n satisface del todo se recomienda consultar a su médico Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linfáticos inflamados, Úlceras o llagas dolorosas, Picazón o ardor, Dolor al orinar.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes." +
                                                  "\n El Herpes genital requiere una hidratación adecuada con una ingesta diaria de 2.5 a 3 litros de agua, equivalentes a 10 a 12 vasos " +
                                                  "\n de tamaño regular, para ayudar a mantener la función inmunológica y reducir la inflamación También se recomienda el consumo de     " +
                                                  "\n líquidos con propiedades antivirales como té verde y agua con limón para fortalecer el sistema inmunológico La actividad física    " +
                                                  "\n debe ser moderada y adaptada a la capacidad del paciente priorizando ejercicios de bajo impacto como caminatas, yoga y ejercicios  " +
                                                  "\n de respiración para mejorar la circulación y reducir el estrés El tratamiento del Herpes genital se basa en el uso de antivirales, " +
                                                  "\n siendo el aciclovir, valaciclovir y famciclovir opciones altamente eficaces para reducir la duración y gravedad de los brotes Marcas" +
                                                  "\n reconocidas incluyen Zovirax, Valtrex y Famvir En algunos casos se pueden administrar terapias inmunomoduladoras para mejorar la    " +
                                                  "\n respuesta del organismo En cuanto a la alimentación se recomienda el consumo de alimentos ricos en antioxidantes y vitamina C,      " +
                                                  "\n esenciales para fortalecer el sistema inmunológico Fresas (por cada 100 gramos aproximadamente 59 mg de vitamina C, cubriendo el    " +
                                                  "\n 65% de la ingesta diaria recomendada) y kiwis (por cada 100 gramos aproximadamente 92 mg de vitamina C, cubriendo el 102% de la     " +
                                                  "\n ingesta diaria recomendada) También se sugiere el consumo de yogur natural, que aporta probióticos beneficiosos para la salud       " +
                                                  "\n intestinal y la recuperación Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el      " +
                                                  "\n paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente correctas Para ello se recomienda    " +
                                                  "\n hacer más de un diagnóstico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente Además por su salud" +
                                                  "\n si la respuesta del diagnóstico no le satisface del todo se recomienda consultar a su médico Angel L Montes agradece tu visita      " +
                                                  "\n a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Úlceras indoloras, Erupción cutánea, Dolor de cabeza, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Sífilis." +
                                                  "\n La Sífilis requiere una hidratación adecuada con una ingesta diaria de 2.5 a 3 litros de agua, equivalentes a 10 a 12 vasos    " +
                                                  "\n de tamaño regular, para ayudar a la eliminación de toxinas y prevenir complicaciones derivadas de la infección También se      " +
                                                  "\n recomienda el consumo de líquidos con propiedades antimicrobianas como agua con limón y infusiones de jengibre para fortalecer " +
                                                  "\n el sistema inmunológico La actividad física debe ser moderada y adaptada a su estado de salud priorizando ejercicios aeróbicos " +
                                                  "\n de bajo impacto como caminatas o yoga durante al menos 30 a 60 minutos al día para fortalecer el sistema inmunológico sin generar " +
                                                  "\n estrés excesivo en el cuerpo El tratamiento de la Sífilis se basa en el uso de antibióticos, siendo la penicilina benzatina la    " +
                                                  "\n opción más eficaz para eliminar la bacteria En casos de alergia a la penicilina se pueden utilizar alternativas como doxiciclina  " +
                                                  "\n o azitromicina Marcas reconocidas incluyen Bicillin L-A y Doryx En cuanto a la alimentación se recomienda el consumo de alimentos " +
                                                  "\n ricos en antioxidantes y vitamina C, esenciales para fortalecer el sistema inmunológico Fresas (por cada 100 gramos aproximadamente" +
                                                  "\n 59 mg de vitamina C, cubriendo el 65% de la ingesta diaria recomendada) y kiwis (por cada 100 gramos aproximadamente 92 mg de      " +
                                                  "\n vitamina C, cubriendo el 102% de la ingesta diaria recomendada) También se sugiere el consumo de yogur natural, que aporta probióticos" +
                                                  "\n beneficiosos para la salud intestinal y la recuperación Este es solo un diagnóstico predeterminado lógico, haberlo consultado no    " +
                                                  "\n garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente correctas   " +
                                                  "\n Para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su     " +
                                                  "\n paciente Además por su salud si la respuesta del diagnóstico no le satisface del todo se recomienda consultar a su médico Angel     " +
                                                  "\n L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Pérdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n La Tuberculosis (TB) requiere una hidratación adecuada con una ingesta diaria de 3.5 a 4.5 litros de agua, equivalentes       " +
                                                  "\n a 12 a 18 vasos de tamaño regular, para prevenir la deshidratación causada por la fiebre intensa y la sudoración.             " +
                                                  "\n También se recomienda el consumo de soluciones de rehidratación oral como Pedialyte o Enfalyte, que ayudan a reponer          " +
                                                  "\n los electrolitos perdidos y mejorar la recuperación La actividad física debe ser mínima mientras persistan los síntomas       " +
                                                  "\n priorizando el descanso absoluto y evitando esfuerzos que puedan agravar la fatiga respiratoria El tratamiento de la          " +
                                                  "\n Tuberculosis se basa en el uso de antibióticos de primera línea, siendo la isoniazida, rifampicina, pirazinamida y etambutol  " +
                                                  "\n opciones altamente eficaces para eliminar la infección y reducir la inflamación pulmonar Marcas reconocidas incluyen Rifadin  " +
                                                  "\n y Myambutol En casos graves se pueden administrar terapias de oxígeno para mejorar la oxigenación del paciente En cuanto a la " +
                                                  "\n alimentación se recomienda el consumo de alimentos ricos en antioxidantes y vitamina C, esenciales para fortalecer el sistema " +
                                                  "\n inmunológico Naranjas (por cada 100 gramos aproximadamente 53 mg de vitamina C, cubriendo el 59% de la ingesta diaria recomendada)" +
                                                  "\n y fresas (por cada 100 gramos aproximadamente 59 mg de vitamina C, cubriendo el 65% de la ingesta diaria recomendada) También se" +
                                                  "\n sugiere el consumo de jengibre, que posee propiedades antiinflamatorias y ayuda a aliviar la congestión pulmonar Este es solo   " +
                                                  "\n un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por    " +
                                                  "\n ello la enfermedad y sus respuestas sean completamente correctas Para ello se recomienda hacer más de un diagnóstico de Mi Vida " +
                                                  "\n para establecer mayor seguridad en el tratamiento adecuado de su paciente Además por su salud si la respuesta del diagnóstico no" +
                                                  "\n le satisface del todo se recomienda consultar a su médico Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchazón en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n La Artritis requiere una hidratación adecuada con una ingesta diaria de 2.5 a 3.5 litros de agua, equivalentes a 10 a 14 vasos  " +
                                                  "\n de tamaño regular, para ayudar a reducir la inflamación y mantener la movilidad articular También se recomienda el consumo de   " +
                                                  "\n líquidos con propiedades antiinflamatorias como té verde y agua con cúrcuma para fortalecer el sistema inmunológico La actividad" +
                                                  "\n física debe ser moderada y adaptada a la capacidad del paciente priorizando ejercicios de bajo impacto como natación, yoga y    " +
                                                  "\n ejercicios de movilidad articular para mejorar la flexibilidad y reducir el dolor El tratamiento de la Artritis se basa en el   " +
                                                  "\n uso de antiinflamatorios no esteroides (AINEs) y fármacos modificadores de la enfermedad (FAMEs) siendo el ibuprofeno, naproxeno," +
                                                  "\n metotrexato y adalimumab opciones altamente eficaces para reducir la inflamación y mejorar la calidad de vida Marcas reconocidas " +
                                                  "\n incluyen Advil, Naprosyn, Trexall y Humira En algunos casos se pueden administrar terapias biológicas para mejorar la respuesta  " +
                                                  "\n del organismo En cuanto a la alimentación se recomienda el consumo de alimentos ricos en antioxidantes y ácidos grasos Omega-3,  " +
                                                  "\n esenciales para reducir la inflamación articular Salmón (por cada 100 gramos aproximadamente 2.2 gramos de Omega-3) y espinacas  " +
                                                  "\n (por cada 100 gramos aproximadamente 28 mg de vitamina C, cubriendo el 31% de la ingesta diaria recomendada) También se sugiere  " +
                                                  "\n el consumo de cúrcuma, que posee propiedades antiinflamatorias y ayuda a mejorar la función articular Este es solo un diagnóstico" +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad " +
                                                  "\n y sus respuestas sean completamente correctas Para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer mayor" +
                                                  "\n seguridad en el tratamiento adecuado de su paciente Además por su salud si la respuesta del diagnóstico no le satisface del todo " +
                                                  "\n se recomienda consultar a su médico Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n La Tosferina requiere una hidratación adecuada con una ingesta diaria de 3 a 4 litros de agua, equivalentes a 12 a 16 vasos  " +
                                                  "\n de tamaño regular, para ayudar a mantener la función pulmonar y reducir la inflamación También se recomienda el consumo de   " +
                                                  "\n líquidos con propiedades antimicrobianas como té verde y agua con miel, que pueden aliviar la irritación de la garganta y    " +
                                                  "\n mejorar la salud respiratoria La actividad física debe ser mínima mientras persistan los síntomas priorizando el descanso    " +
                                                  "\n absoluto y evitando esfuerzos que puedan agravar la tos y la fatiga respiratoria El tratamiento de la Tosferina se basa en   " +
                                                  "\n el uso de antibióticos, siendo la azitromicina, claritromicina y eritromicina opciones altamente eficaces para reducir la    " +
                                                  "\n duración y gravedad de la enfermedad Marcas reconocidas incluyen Zithromax, Biaxin y Erythrocin En casos graves se pueden    " +
                                                  "\n administrar terapias de oxígeno para mejorar la oxigenación del paciente En cuanto a la alimentación se recomienda el consumo" +
                                                  "\n de alimentos ricos en antioxidantes y vitamina C, esenciales para fortalecer el sistema inmunológico Naranjas (por cada 100  " +
                                                  "\n gramos aproximadamente 53 mg de vitamina C, cubriendo el 59% de la ingesta diaria recomendada) y fresas (por cada 100 gramos " +
                                                  "\n aproximadamente 59 mg de vitamina C, cubriendo el 65% de la ingesta diaria recomendada) También se sugiere el consumo de     " +
                                                  "\n jengibre, que posee propiedades antiinflamatorias y ayuda a aliviar la congestión pulmonar Este es solo un diagnóstico       " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad" +
                                                  "\n y sus respuestas sean completamente correctas Para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer    " +
                                                  "\n mayor seguridad en el tratamiento adecuado de su paciente Además por su salud si la respuesta del diagnóstico no le satisface   " +
                                                  "\n del todo se recomienda consultar a su médico Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchazón de las glándulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n Las Paperas requieren una hidratación adecuada con una ingesta diaria de 2.5 a 3.5 litros de agua, equivalentes a 10 a 14 vasos   " +
                                                  "\n de tamaño regular, para ayudar a mantener la función inmunológica y reducir la inflamación También se recomienda el consumo de    " +
                                                  "\n líquidos con propiedades antiinflamatorias como té verde y agua con miel, que pueden aliviar la irritación de la garganta y mejorar" +
                                                  "\n la salud general La actividad física debe ser mínima mientras persistan los síntomas priorizando el descanso absoluto y evitando   " +
                                                  "\n esfuerzos que puedan agravar la fatiga y el malestar El tratamiento de las Paperas es principalmente sintomático ya que no existe  " +
                                                  "\n un antiviral específico para la enfermedad Se recomienda el uso de analgésicos como paracetamol o ibuprofeno para reducir la fiebre" +
                                                  "\n y el dolor Marcas reconocidas incluyen Tylenol y Advil En casos de inflamación severa se pueden aplicar compresas frías o calientes" +
                                                  "\n en la zona afectada para aliviar el dolor En cuanto a la alimentación se recomienda el consumo de alimentos suaves y ricos en      " +
                                                  "\n antioxidantes, esenciales para fortalecer el sistema inmunológico Plátanos (por cada 100 gramos aproximadamente 358 mg de potasio, " +
                                                  "\n cubriendo el 10% de la ingesta diaria recomendada) y arroz blanco, que es fácil de digerir y ayuda a estabilizar el sistema digestivo." + 
                                                  "\n También se sugiere el consumo de yogur natural, que aporta probióticos beneficiosos para la salud intestinal y la recuperación. Este  " +
                                                  "\n es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por  " +
                                                  "\n  ello la enfermedad y sus respuestas sean completamente correctas Para ello se recomienda hacer más de un diagnóstico de Mi Vida para " +
                                                  "\n establecer mayor seguridad en el tratamiento adecuado de su paciente Además por su salud si la respuesta del diagnóstico no le satisface" +
                                                  "\n del todo se recomienda consultar a su médico Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupción cutánea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n El Zika requiere una hidratación adecuada con una ingesta diaria de 3 a 4 litros de agua, equivalentes a 12 a 16 vasos de tamaño   " +
                                                  "\n regular, para prevenir la deshidratación causada por la fiebre y otros síntomas También se recomienda el consumo de líquidos con   " +
                                                  "\n electrolitos naturales como agua de coco, que ayuda a mantener el equilibrio de minerales en el cuerpo La actividad física debe    " +
                                                  "\n ser mínima mientras persistan los síntomas priorizando el descanso absoluto y ejercicios de respiración para mejorar la oxigenación." +
                                                  "\n El tratamiento del Zika es sintomático ya que no existe un antiviral específico Se recomienda el uso de analgésicos como paracetamol" +
                                                  "\n para reducir la fiebre y el dolor muscular Marcas reconocidas incluyen Tempra y Tylenol Es importante evitar el uso de aspirina y  " +
                                                  "\n otros antiinflamatorios no esteroides hasta descartar dengue para reducir el riesgo de sangrado En cuanto a la alimentación se     " +
                                                  "\n recomienda el consumo de alimentos ricos en antioxidantes y vitamina C, esenciales para fortalecer el sistema inmunológico Naranjas" +
                                                  "\n (por cada 100 gramos aproximadamente 53 mg de vitamina C, cubriendo el 59% de la ingesta diaria recomendada) y fresas (por cada 100" +
                                                  "\n gramos aproximadamente 59 mg de vitamina C, cubriendo el 65% de la ingesta diaria recomendada) También se sugiere el consumo de    " +
                                                  "\n jengibre, que posee propiedades antiinflamatorias y ayuda a aliviar el malestar general Este es solo un diagnóstico predeterminado " +
                                                  "\n lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas " +
                                                  "\n sean completamente correctas Para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer mayor seguridad en el  " +
                                                  "\n tratamiento adecuado de su paciente Además por su salud si la respuesta del diagnóstico no le satisface del todo se recomienda     " +
                                                  "\n consultar a su médico Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, Vómitos, Deshidratación, Dolor abdominal.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n El Rotavirus requiere una hidratación adecuada con una ingesta diaria de 3.5 a 4.5 litros de agua, equivalentes a 12 a 18 vasos    " +
                                                  "\n de tamaño regular, para prevenir la deshidratación causada por la diarrea y los vómitos También se recomienda el consumo de        " +
                                                  "\n soluciones de rehidratación oral como Pedialyte o Enfalyte, que ayudan a reponer los electrolitos perdidos y mejorar la recuperación." +
                                                  "\n La actividad física debe ser mínima mientras persistan los síntomas priorizando el descanso absoluto y evitando esfuerzos que puedan" +
                                                  "\n agravar la pérdida de líquidos El tratamiento del Rotavirus es sintomático ya que no existe un antiviral específico Se recomienda el" +
                                                  "\n uso de rehidratación constante y en casos graves puede requerirse administración de líquidos intravenosos en un hospital para evitar" +
                                                  "\n complicaciones Marcas reconocidas incluyen Pedialyte y Enfalyte, recomendadas para la rehidratación efectiva En cuanto a la         " +
                                                  "\n alimentación se recomienda el consumo de alimentos suaves y ricos en electrolitos, esenciales para fortalecer el sistema digestivo  " +
                                                  "\n y prevenir la deshidratación Plátanos (por cada 100 gramos aproximadamente 358 mg de potasio, cubriendo el 10% de la ingesta diaria " +
                                                  "\n recomendada) y arroz blanco, que es fácil de digerir y ayuda a estabilizar el sistema digestivo También se sugiere el consumo de yogur" +
                                                  "\n natural, que aporta probióticos beneficiosos para la salud intestinal y la recuperación Este es solo un diagnóstico predeterminado   " +
                                                  "\n lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas   " +
                                                  "\n sean completamente correctas Para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer mayor seguridad en el    " +
                                                  "\n tratamiento adecuado de su paciente Además por su salud si la respuesta del diagnóstico no le satisface del todo se recomienda       " +
                                                  "\n consultar a su médico Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, Náuseas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeriosis." +
                                                  "\n La Listeriosis requiere una hidratación adecuada con una ingesta diaria de 2.5 a 3 litros de agua, equivalentes a 10 a 12 vasos      " +
                                                  "\n de tamaño regular, para ayudar a la eliminación de toxinas y prevenir complicaciones derivadas de la infección También se recomienda " +
                                                  "\n el consumo de líquidos con propiedades antimicrobianas como agua con limón y infusiones de jengibre para fortalecer el sistema       " +
                                                  "\n inmunológico La actividad física debe ser mínima mientras persistan los síntomas priorizando el descanso absoluto y evitando         " +
                                                  "\n esfuerzos que puedan debilitar el organismo El tratamiento de la Listeriosis se basa en el uso de antibióticos, siendo la ampicilina " +
                                                  "\n y la gentamicina opciones altamente eficaces para eliminar la bacteria La ampicilina impide la replicación de la bacteria mientras   " +
                                                  "\n que la gentamicina bloquea la producción de proteínas esenciales para su supervivencia Marcas reconocidas incluyen Ampex y Garamycin." +
                                                  "\n En casos graves se pueden administrar corticoides para reducir la inflamación y mejorar la respuesta del organismo. En cuanto a la   " +
                                                  "\n alimentación se recomienda el consumo de alimentos ricos en antioxidantes y vitamina C, esenciales para fortalecer el sistema        " +
                                                  "\n inmunológico Espinacas (por cada 100 gramos aproximadamente 28 mg de vitamina C, cubriendo el 31% de la ingesta diaria recomendada)  " +
                                                  "\n y zanahorias (por cada 100 gramos aproximadamente 835 µg de vitamina A, cubriendo el 93% de la ingesta diaria recomendada).          " +
                                                  "\n También se sugiere el consumo de yogur natural, que aporta probióticos beneficiosos para la salud intestinal y la recuperación.      " +
                                                  "\n Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad      " +
                                                  "\n y que por ello la enfermedad y sus respuestas sean completamente correctas Para ello se recomienda hacer más de un diagnóstico       " +
                                                  "\n de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente Además por su salud si la respuesta del         " +
                                                  "\n diagnóstico no le satisface del todo se recomienda consultar a su médico Angel L Montes agradece tu visita a la app Mi Vida          " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, Vómitos.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n La Shigelosis requiere una hidratación adecuada con una ingesta diaria de 3.5 a 4.5 litros de agua, equivalentes a 12 a 18 vasos " +
                                                  "\n de tamaño regular, para prevenir la deshidratación causada por la diarrea y la fiebre También se recomienda el consumo de        " +
                                                  "\n soluciones de rehidratación oral como Pedialyte o Enfalyte, que ayudan a reponer los electrolitos perdidos y mejorar la          " +
                                                  "\n recuperación La actividad física debe ser mínima mientras persistan los síntomas priorizando el descanso absoluto y evitando     " +
                                                  "\n esfuerzos que puedan agravar la pérdida de líquidos El tratamiento de la Shigelosis se basa en la rehidratación constante y      " +
                                                  "\n en casos graves puede requerirse administración de líquidos intravenosos en un hospital para evitar complicaciones En infecciones" +
                                                  "\n severas se pueden utilizar antibióticos como ciprofloxacino y azitromicina, que ayudan a reducir la duración de la enfermedad    " +
                                                  "\n Marcas reconocidas incluyen Cipro y Zithromax En cuanto a la alimentación se recomienda el consumo de alimentos suaves y ricos   " +
                                                  "\n en electrolitos, esenciales para fortalecer el sistema digestivo y prevenir la deshidratación Plátanos (por cada 100 gramos      " +
                                                  "\n aproximadamente 358 mg de potasio, cubriendo el 10% de la ingesta diaria recomendada) y arroz blanco, que es fácil de digerir    " +
                                                  "\n y ayuda a estabilizar el sistema digestivo También se sugiere el consumo de yogur natural, que aporta probióticos beneficiosos   " +
                                                  "\n para la salud intestinal y la recuperación Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza    " +
                                                  "\n al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente correctas Para     " +
                                                  "\n ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su       " +
                                                  "\n paciente Además por su salud si la respuesta del diagnóstico no le satisface del todo se recomienda consultar a su médico        " +
                                                  "\n Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos crónica, Producción excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad Pulmonar Obstructiva Crónica (EPOC)." +
                                                  "\n La Enfermedad Pulmonar Obstructiva Crónica (EPOC) requiere una hidratación adecuada con una ingesta diaria de 2.5 a 3 litros   " +
                                                  "\n de agua, equivalentes a 10 a 12 vasos de tamaño regular, para ayudar a mantener la función pulmonar y reducir la inflamación.  " +
                                                  "\n También se recomienda el consumo de líquidos con propiedades antioxidantes como té verde y agua con limón para mejorar la salud" +
                                                  "\n respiratoria La actividad física debe ser moderada y adaptada a la capacidad pulmonar priorizando ejercicios de bajo impacto   " +
                                                  "\n como caminatas, natación y ejercicios de respiración para fortalecer los músculos respiratorios y mejorar la oxigenación.      " +
                                                  "\n El tratamiento de la EPOC se basa en el uso de broncodilatadores y corticosteroides inhalados, siendo el salbutamol y la       " +
                                                  "\n fluticasona opciones altamente eficaces para mejorar la respiración y reducir la inflamación Marcas reconocidas incluyen       " +
                                                  "\n Ventolin y Flixotide En casos avanzados se pueden administrar terapias de oxígeno para mejorar la calidad de vida del paciente." +
                                                  "\n En cuanto a la alimentación se recomienda el consumo de alimentos ricos en antioxidantes y ácidos grasos Omega-3, esenciales   " +
                                                  "\n para reducir la inflamación pulmonar Salmón (por cada 100 gramos aproximadamente 2.2 gramos de Omega-3) y espinacas (por cada  " +
                                                  "\n 100 gramos aproximadamente 28 mg de vitamina C, cubriendo el 31% de la ingesta diaria recomendada) También se sugiere el consumo" +
                                                  "\n de cúrcuma, que posee propiedades antiinflamatorias y ayuda a mejorar la función pulmonar Este es solo un diagnóstico predeterminado" +
                                                  "\n lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas  " +
                                                  "\n sean completamente correctas Para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer mayor seguridad en el   " +
                                                  "\n tratamiento adecuado de su paciente Además por su salud si la respuesta del diagnóstico no le satisface del todo se recomienda      " +
                                                  "\n consultar a su médico Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreción anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n La Clamidia requiere una hidratación adecuada con una ingesta diaria de 2.5 a 3 litros de agua, equivalentes a 10 a 12 vasos   " +
                                                  "\n de tamaño regular, para ayudar a la eliminación de toxinas y prevenir molestias urinarias También se recomienda el consumo de  " +
                                                  "\n líquidos con propiedades antimicrobianas como agua con limón y infusiones de jengibre para fortalecer el sistema inmunológico. " +
                                                  "\n La actividad física debe ser moderada y adaptada a su estado de salud priorizando ejercicios aeróbicos de bajo impacto como    " +
                                                  "\n caminatas o yoga durante al menos 30 a 60 minutos al día para fortalecer el sistema inmunológico sin generar estrés excesivo   " +
                                                  "\n en el cuerpo. El tratamiento de la Clamidia se basa en el uso de antibióticos, siendo la azitromicina y la doxiciclina opciones" +
                                                  "\n altamente eficaces para eliminar la bacteria La azitromicina se administra en una dosis única mientras que la doxiciclina se   " +
                                                  "\n toma durante varios días Marcas reconocidas incluyen Zithromax y Doryx En cuanto a la alimentación se recomienda el consumo    " +
                                                  "\n de alimentos ricos en antioxidantes y vitamina C, esenciales para fortalecer el sistema inmunológico Fresas (por cada 100      " +
                                                  "\n gramos aproximadamente 59 mg de vitamina C, cubriendo el 65% de la ingesta diaria recomendada) y kiwis (por cada 100 gramos    " +
                                                  "\n aproximadamente 92 mg de vitamina C, cubriendo el 102% de la ingesta diaria recomendada) También se sugiere el consumo de      " +
                                                  "\n yogur natural, que aporta probióticos beneficiosos para la salud intestinal y la recuperación Este es solo un diagnóstico      " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad" +
                                                  "\n y sus respuestas sean completamente correctas Para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer   " +
                                                  "\n mayor seguridad en el tratamiento adecuado de su paciente Además por su salud si la respuesta del diagnóstico no le satisface  " +
                                                  "\n del todo se recomienda consultar a su médico Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Náuseas, Dolor de cabeza severo, Rigidez en el cuello, Confusión.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n La Meningitis bacteriana requiere una hidratación adecuada con una ingesta diaria de 3.5 a 4.5 litros de agua, equivalentes    " +
                                                  "\n a 12 a 18 vasos de tamaño regular, para prevenir la deshidratación causada por la fiebre intensa y la inflamación de las       " +
                                                  "\n meninges. También se recomienda el consumo de soluciones de rehidratación oral como Pedialyte o Enfalyte, que ayudan a reponer " +
                                                  "\n los electrolitos perdidos y mejorar la recuperación La actividad física debe ser mínima mientras persistan los síntomas        " +
                                                  "\n priorizando el descanso absoluto y evitando esfuerzos que puedan agravar la inflamación cerebral El tratamiento de la          " +
                                                  "\n Meningitis bacteriana se basa en el uso de antibióticos intravenosos, siendo la ceftriaxona y la vancomicina opciones          " +
                                                  "\n altamente eficaces para eliminar la infección y reducir la inflamación Marcas reconocidas incluyen Rocephin y Vancocin.        " +
                                                  "\n En casos graves se pueden administrar corticoides para reducir la inflamación y mejorar la respuesta del organismo.            " +
                                                  "\n En cuanto a la alimentación se recomienda el consumo de alimentos ricos en antioxidantes y vitamina C, esenciales para         " +
                                                  "\n fortalecer el sistema inmunológico Espinacas (por cada 100 gramos aproximadamente 28 mg de vitamina C, cubriendo el 31%        " +
                                                  "\n de la ingesta diaria recomendada) y zanahorias (por cada 100 gramos aproximadamente 835 µg de vitamina A, cubriendo el 93%     " +
                                                  "\n de la ingesta diaria recomendada) También se sugiere el consumo de yogur natural, que aporta probióticos beneficiosos para     " +
                                                  "\n la salud intestinal y la recuperación Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al    " +
                                                  "\n 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente correctas Para ello " +
                                                  "\n se recomienda hacer más de un diagnóstico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente " +
                                                  "\n Además por su salud si la respuesta del diagnóstico no le satisface del todo se recomienda consultar a su médico Angel L Montes" +
                                                  "\n agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, Pérdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, Pérdida de apetito.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Cáncer." +
                                                  "\n El Cáncer en adolescentes requiere una hidratación adecuada con una ingesta diaria de 3 a 4 litros de agua, equivalentes       " +
                                                  "\n a 12 a 16 vasos de tamaño regular, para ayudar a mantener la función celular y reducir los efectos secundarios del tratamiento " +
                                                  "\n También se recomienda el consumo de líquidos con propiedades antioxidantes como té verde y agua con limón para fortalecer      " +
                                                  "\n el sistema inmunológico La actividad física debe ser moderada y adaptada a la capacidad del paciente priorizando ejercicios    " +
                                                  "\n de bajo impacto como caminatas, yoga y ejercicios de respiración para mejorar la circulación y reducir la fatiga El tratamiento" +
                                                  "\n del Cáncer varía según el tipo y la etapa de la enfermedad pero puede incluir quimioterapia, radioterapia, cirugía y terapias  " +
                                                  "\n dirigidas siendo la doxorrubicina y el paclitaxel opciones comunes en ciertos tipos de cáncer Marcas reconocidas incluyen      " +
                                                  "\n Adriamycin y Taxol En algunos casos se pueden administrar inmunoterapias para mejorar la respuesta del organismo. En cuanto    " +
                                                  "\n a la alimentación se recomienda el consumo de alimentos ricos en antioxidantes y proteínas, esenciales para fortalecer el      " +
                                                  "\n sistema inmunológico y mantener la energía Espinacas (por cada 100 gramos aproximadamente 28 mg de vitamina C, cubriendo el    " +
                                                  "\n 31% de la ingesta diaria recomendada) y zanahorias (por cada 100 gramos aproximadamente 835 µg de vitamina A, cubriendo el     " +
                                                  "\n 93% de la ingesta diaria recomendada) También se sugiere el consumo de yogur natural, que aporta probióticos beneficiosos      " +
                                                  "\n para la salud intestinal y la recuperación Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza  " +
                                                  "\n al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente correctas.       " +
                                                  "\n Para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado      " +
                                                  "\n de su paciente Además por su salud si la respuesta del diagnóstico no le satisface del todo se recomienda consultar a su       " +
                                                  "\n médico Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            } 
                        }
                        if(EstaturaMasculino.equals("1.45-1.60 m")){
                           if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza (gripe)." +
                                                  "\n La Influenza (gripe) requiere una hidratación adecuada con una ingesta diaria de 3.5 a 4.5 litros de agua, equivalentes   " +
                                                  "\n a 12 a 18 vasos de tamaño regular, para prevenir la deshidratación causada por la fiebre intensa y la sudoración.         " +
                                                  "\n También se recomienda el consumo de soluciones de rehidratación oral como Pedialyte o Enfalyte, que ayudan a reponer      " +
                                                  "\n los electrolitos perdidos y mejorar la recuperación La actividad física debe ser mínima mientras persistan los síntomas   " +
                                                  "\n priorizando el descanso absoluto y evitando esfuerzos que puedan agravar la fatiga El tratamiento de la Influenza se basa " +
                                                  "\n en el uso de antivirales, siendo el oseltamivir y el baloxavir opciones altamente eficaces para reducir la duración y     " +
                                                  "\n gravedad de la enfermedad Marcas reconocidas incluyen Tamiflu y Xofluza. En casos graves se pueden administrar antipiréticos" +
                                                  "\n como paracetamol para controlar la fiebre y mejorar el bienestar del paciente En cuanto a la alimentación se recomienda el  " +
                                                  "\n consumo de alimentos ricos en antioxidantes y vitamina C, esenciales para fortalecer el sistema inmunológico Naranjas       " +
                                                  "\n (por cada 100 gramos aproximadamente 53 mg de vitamina C, cubriendo el 59% de la ingesta diaria recomendada) y fresas       " +
                                                  "\n (por cada 100 gramos aproximadamente 59 mg de vitamina C, cubriendo el 65% de la ingesta diaria recomendada).               " +
                                                  "\n También se sugiere el consumo de jengibre, que posee propiedades antiinflamatorias y ayuda a aliviar el malestar general.   " +
                                                  "\n Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa        " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas sean completamente correctas Para ello se recomienda hacer         " +
                                                  "\n más de un diagnóstico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente. Además por      " +
                                                  "\n su salud si la respuesta del diagnóstico no le satisface del todo se recomienda consultar a su médico Angel L Montes        " +
                                                  "\n agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                               textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumonía." +
                                                  "\n La Neumonía requiere una hidratación adecuada con una ingesta diaria de 3.5 a 4.5 litros de agua, equivalentes a 12 a 18 vasos   " +
                                                  "\n de tamaño regular, para prevenir la deshidratación causada por la fiebre intensa y la dificultad respiratoria También se         " +
                                                  "\n recomienda el consumo de soluciones de rehidratación oral como Pedialyte o Enfalyte, que ayudan a reponer los electrolitos       " +
                                                  "\n perdidos y mejorar la recuperación La actividad física debe ser mínima mientras persistan los síntomas priorizando el descanso   " +
                                                  "\n absoluto y evitando esfuerzos que puedan agravar la fatiga respiratoria El tratamiento de la Neumonía se basa en el uso de       " +
                                                  "\n antibióticos, siendo la amoxicilina y la azitromicina opciones altamente eficaces para eliminar la infección y reducir la        " +
                                                  "\n inflamación pulmonar Marcas reconocidas incluyen Amoxil y Zithromax En casos graves se pueden administrar terapias de oxígeno    " +
                                                  "\n para mejorar la oxigenación del paciente En cuanto a la alimentación se recomienda el consumo de alimentos ricos en antioxidantes" +
                                                  "\n y vitamina C, esenciales para fortalecer el sistema inmunológico Naranjas (por cada 100 gramos aproximadamente 53 mg de vitamina C," +
                                                  "\n cubriendo el 59% de la ingesta diaria recomendada) y fresas (por cada 100 gramos aproximadamente 59 mg de vitamina C, cubriendo  " +
                                                  "\n el 65% de la ingesta diaria recomendada) También se sugiere el consumo de jengibre, que posee propiedades antiinflamatorias y    " +
                                                  "\n ayuda a aliviar la congestión pulmonar Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al     " +
                                                  "\n 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente correctas Para ello   " +
                                                  "\n se recomienda hacer más de un diagnóstico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente.  " +
                                                  "\n Además por su salud si la respuesta del diagnóstico no le satisface del todo se recomienda consultar a su médico Angel L Montes  " +
                                                  "\n agradece tu visita a la app Mi Vida y espera que te mejores."); 
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visión borrosa, Pérdida de peso.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n La Diabetes en adolescentes requiere una hidratación adecuada con una ingesta diaria de 2.5 a 3.5 litros de agua, equivalentes    " +
                                                  "\n a 10 a 14 vasos de tamaño regular, para ayudar a mantener el equilibrio de glucosa en sangre y prevenir la deshidratación causada " +
                                                  "\n por la micción frecuente También se recomienda el consumo de infusiones sin azúcar y agua con limón, que contribuyen a la         " +
                                                  "\n regulación metabólica La actividad física debe ser moderada y adaptada a la capacidad del paciente priorizando ejercicios         " +
                                                  "\n aeróbicos como caminatas, ciclismo y natación durante al menos 30 a 60 minutos al día, lo que ayuda a mejorar la sensibilidad     " +
                                                  "\n a la insulina y controlar los niveles de glucosa El tratamiento de la Diabetes varía según el tipo pero puede incluir insulina    " +
                                                  "\n en el caso de diabetes tipo 1 y medicamentos orales como la metformina en el caso de diabetes tipo 2 Marcas reconocidas incluyen  " +
                                                  "\n Humalog, Lantus y Glucophage En algunos casos se pueden administrar inhibidores de SGLT2 para mejorar la eliminación de glucosa   " +
                                                  "\n a través de la orina En cuanto a la alimentación se recomienda el consumo de alimentos ricos en fibra y proteínas, esenciales     " +
                                                  "\n para estabilizar los niveles de glucosa en sangre Avena (por cada 100 gramos aproximadamente 10 gramos de fibra, cubriendo el     " +
                                                  "\n 40% de la ingesta diaria recomendada) y almendras (por cada 100 gramos aproximadamente 25 mg de vitamina E, cubriendo el 166%     " +
                                                  "\n de la ingesta diaria recomendada) También se sugiere el consumo de yogur natural, que aporta probióticos beneficiosos para la     " +
                                                  "\n salud intestinal y la regulación metabólica Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza    " +
                                                  "\n al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente correctas.          " +
                                                  "\n Para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado         " +
                                                  "\n de su paciente. Además por su salud si la respuesta del diagnóstico no le satisface del todo se recomienda consultar a su         " +
                                                  "\n médico Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresión en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n El Asma requiere una hidratación adecuada con una ingesta diaria de 2.5 a 3.5 litros de agua, equivalentes a 10 a 14 vasos  " +
                                                  "\n de tamaño regular, para ayudar a mantener la función pulmonar y reducir la inflamación También se recomienda el consumo de  " +
                                                  "\n líquidos con propiedades antioxidantes como té verde y agua con limón para mejorar la salud respiratoria La actividad física" +
                                                  "\n debe ser moderada y adaptada a la capacidad pulmonar priorizando ejercicios de bajo impacto como caminatas, natación y      " +
                                                  "\n ejercicios de respiración para fortalecer los músculos respiratorios y mejorar la oxigenación El tratamiento del Asma se    " +
                                                  "\n basa en el uso de broncodilatadores y corticosteroides inhalados, siendo el salbutamol y la fluticasona opciones altamente  " +
                                                  "\n eficaces para mejorar la respiración y reducir la inflamación Marcas reconocidas incluyen Ventolin y Flixotide En casos     " +
                                                  "\n avanzados se pueden administrar terapias de oxígeno para mejorar la calidad de vida del paciente En cuanto a la alimentación" +
                                                  "\n se recomienda el consumo de alimentos ricos en antioxidantes y ácidos grasos Omega-3, esenciales para reducir la inflamación" +
                                                  "\n pulmonar Salmón (por cada 100 gramos aproximadamente 2.2 gramos de Omega-3) y espinacas (por cada 100 gramos aproximadamente" +
                                                  "\n 28 mg de vitamina C, cubriendo el 31% de la ingesta diaria recomendada) También se sugiere el consumo de cúrcuma, que posee " +
                                                  "\n propiedades antiinflamatorias y ayuda a mejorar la función pulmonar Este es solo un diagnóstico predeterminado lógico, haberlo" +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean     " +
                                                  "\n completamente correctas Para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer mayor seguridad en   " +
                                                  "\n el tratamiento adecuado de su paciente Además por su salud si la respuesta del diagnóstico no le satisface del todo se      " +
                                                  "\n recomienda consultar a su médico Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, Pérdida de peso, Ganglios linfáticos inflamados, Erupción cutánea (Diarrea).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n El VIH/SIDA requiere una hidratación adecuada con una ingesta diaria de 3 a 4 litros de agua, equivalentes a 12 a 16 vasos    " +
                                                  "\n de tamaño regular, para ayudar a mantener la función inmunológica y prevenir la deshidratación causada por fiebre y efectos   " +
                                                  "\n secundarios del tratamiento También se recomienda el consumo de líquidos con propiedades antioxidantes como té verde y agua   " +
                                                  "\n con limón para fortalecer el sistema inmunológico La actividad física debe ser moderada y adaptada a la capacidad del paciente" +
                                                  "\n priorizando ejercicios de bajo impacto como caminatas, yoga y ejercicios de respiración para mejorar la circulación y reducir " +
                                                  "\n la fatiga El tratamiento del VIH/SIDA se basa en el uso de antirretrovirales, siendo el tenofovir, emtricitabina y dolutegravir" +
                                                  "\n opciones altamente eficaces para controlar la replicación del virus y mejorar la calidad de vida. Marcas reconocidas incluyen  " +
                                                  "\n Truvada, Tivicay y Biktarvy . En algunos casos se pueden administrar terapias inmunomoduladoras para mejorar la respuesta del  " +
                                                  "\n organismo En cuanto a la alimentación se recomienda el consumo de alimentos ricos en antioxidantes y proteínas, esenciales para" +
                                                  "\n fortalecer el sistema inmunológico y mantener la energía Espinacas (por cada 100 gramos aproximadamente 28 mg de vitamina C,   " +
                                                  "\n cubriendo el 31% de la ingesta diaria recomendada) y zanahorias (por cada 100 gramos aproximadamente 835 µg de vitamina A,     " +
                                                  "\n cubriendo el 93% de la ingesta diaria recomendada) También se sugiere el consumo de yogur natural, que aporta probióticos      " +
                                                  "\n beneficiosos para la salud intestinal y la recuperación Este es solo un diagnóstico predeterminado lógico, haberlo consultado  " +
                                                  "\n no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente     " +
                                                  "\n correctas Para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer mayor seguridad en el tratamiento     " +
                                                  "\n adecuado de su paciente Además por su salud si la respuesta del diagnóstico no le satisface del todo se recomienda consultar   " +
                                                  "\n a su médico Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreción anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n La Gonorrea requiere una hidratación adecuada con una ingesta diaria de 2.5 a 3 litros de agua, equivalentes a 10 a 12 vasos     " +
                                                  "\n de tamaño regular, para ayudar a la eliminación de toxinas y prevenir molestias urinarias También se recomienda el consumo       " +
                                                  "\n de líquidos con propiedades antimicrobianas como agua con limón y infusiones de jengibre para fortalecer el sistema inmunológico " +
                                                  "\n La actividad física debe ser moderada y adaptada a su estado de salud priorizando ejercicios aeróbicos de bajo impacto como      " +
                                                  "\n caminatas o yoga durante al menos 30 a 60 minutos al día para fortalecer el sistema inmunológico sin generar estrés excesivo     " +
                                                  "\n en el cuerpo El tratamiento de la Gonorrea se basa en el uso de antibióticos, siendo la ceftriaxona y la azitromicina opciones   " +
                                                  "\n altamente eficaces para eliminar la bacteria La ceftriaxona se administra en una dosis única mientras que la azitromicina        " +
                                                  "\n complementa el tratamiento para evitar resistencia bacteriana Marcas reconocidas incluyen Rocephin y Zithromax En cuanto         " +
                                                  "\n a la alimentación se recomienda el consumo de alimentos ricos en antioxidantes y vitamina C, esenciales para fortalecer el       " +
                                                  "\n sistema inmunológico Fresas (por cada 100 gramos aproximadamente 59 mg de vitamina C, cubriendo el 65% de la ingesta diaria      " +
                                                  "\n recomendada) y kiwis (por cada 100 gramos aproximadamente 92 mg de vitamina C, cubriendo el 102% de la ingesta diaria recomendada)." +
                                                  "\n También se sugiere el consumo de yogur natural, que aporta probióticos beneficiosos para la salud intestinal y la recuperación.  " +
                                                  "\n Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad  " +
                                                  "\n y que por ello la enfermedad y sus respuestas sean completamente correctas Para ello se recomienda hacer más de un diagnóstico   " +
                                                  "\n de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente Además por su salud si la respuesta del     " +
                                                  "\n diagnóstico no le satisface del todo se recomienda consultar a su médico Angel L Montes agradece tu visita a la app Mi Vida      " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linfáticos inflamados, Úlceras o llagas dolorosas, Picazón o ardor, Dolor al orinar.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n El Herpes genital requiere una hidratación adecuada con una ingesta diaria de 2.5 a 3 litros de agua, equivalentes a 10 a 12 vasos  " +
                                                  "\n de tamaño regular, para ayudar a mantener la función inmunológica y reducir la inflamación También se recomienda el consumo de      " +
                                                  "\n líquidos con propiedades antivirales como té verde y agua con limón para fortalecer el sistema inmunológico La actividad física     " +
                                                  "\n debe ser moderada y adaptada a la capacidad del paciente priorizando ejercicios de bajo impacto como caminatas, yoga y ejercicios   " +
                                                  "\n de respiración para mejorar la circulación y reducir el estrés El tratamiento del Herpes genital se basa en el uso de antivirales,  " +
                                                  "\n siendo el aciclovir, valaciclovir y famciclovir opciones altamente eficaces para reducir la duración y gravedad de los brotes       " +
                                                  "\n Marcas reconocidas incluyen Zovirax, Valtrex y Famvir En algunos casos se pueden administrar terapias inmunomoduladoras para        " +
                                                  "\n mejorar la respuesta del organismo En cuanto a la alimentación se recomienda el consumo de alimentos ricos en antioxidantes y       " +
                                                  "\n vitamina C, esenciales para fortalecer el sistema inmunológico Fresas (por cada 100 gramos aproximadamente 59 mg de vitamina C,     " +
                                                  "\n cubriendo el 65% de la ingesta diaria recomendada) y kiwis (por cada 100 gramos aproximadamente 92 mg de vitamina C, cubriendo      " +
                                                  "\n el 102% de la ingesta diaria recomendada). También se sugiere el consumo de yogur natural, que aporta probióticos beneficiosos      " +
                                                  "\n para la salud intestinal y la recuperación Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza       " +
                                                  "\n al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente correctas.            " +
                                                  "\n Para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su     " +
                                                  "\n paciente Además por su salud si la respuesta del diagnóstico no le satisface del todo se recomienda consultar a su médico           " +
                                                  "\n Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Úlceras indoloras, Erupción cutánea, Dolor de cabeza, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Sífilis." +
                                                  "\n La Sífilis requiere una hidratación adecuada con una ingesta diaria de 2.5 a 3 litros de agua, equivalentes a 10 a 12 vasos     " +
                                                  "\n de tamaño regular, para ayudar a la eliminación de toxinas y prevenir complicaciones derivadas de la infección. También se      " +
                                                  "\n recomienda el consumo de líquidos con propiedades antimicrobianas como agua con limón y infusiones de jengibre para fortalecer  " +
                                                  "\n el sistema inmunológico. La actividad física debe ser moderada y adaptada a su estado de salud, priorizando ejercicios aeróbicos" +
                                                  "\n de bajo impacto como caminatas o yoga durante al menos 30 a 60 minutos al día, lo que ayuda a fortalecer el sistema inmunológico" +
                                                  "\n sin generar estrés excesivo en el cuerpo. El tratamiento de la Sífilis se basa en el uso de antibióticos, siendo la penicilina  " +
                                                  "\n benzatina la opción más eficaz para eliminar la bacteria. En casos de alergia a la penicilina se pueden utilizar alternativas   " +
                                                  "\n como doxiciclina o azitromicina. Marcas reconocidas incluyen Bicillin L-A y Doryx. En cuanto a la alimentación, se recomienda   " +
                                                  "\n el consumo de alimentos ricos en antioxidantes y vitamina C, esenciales para fortalecer el sistema inmunológico. Fresas (por    " +
                                                  "\n cada 100 gramos aproximadamente 59 mg de vitamina C, cubriendo el 65% de la ingesta diaria recomendada) y kiwis (por cada 100   " +
                                                  "\n gramos aproximadamente 92 mg de vitamina C, cubriendo el 102% de la ingesta diaria recomendada). También se sugiere el consumo  " +
                                                  "\n de yogur natural, que aporta probióticos beneficiosos para la salud intestinal y la recuperación. Este es solo un diagnóstico   " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad" +
                                                  "\n y sus respuestas sean completamente correctas. Para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer   " +
                                                  "\n mayor seguridad en el tratamiento adecuado de su paciente. Además, por su salud, si la respuesta del diagnóstico no le satisface" +
                                                  "\n del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");   
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Pérdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n La Tuberculosis (TB) requiere una hidratación adecuada con una ingesta diaria de 3.5 a 4.5 litros de agua, equivalentes   " +
                                                  "\n a 12 a 18 vasos de tamaño regular, para prevenir la deshidratación causada por la fiebre intensa y la sudoración.         " +
                                                  "\n También se recomienda el consumo de soluciones de rehidratación oral como Pedialyte o Enfalyte, que ayudan a reponer      " +
                                                  "\n los electrolitos perdidos y mejorar la recuperación. La actividad física debe ser mínima mientras persistan los síntomas, " +
                                                  "\n priorizando el descanso absoluto y evitando esfuerzos que puedan agravar la fatiga respiratoria. El tratamiento de la     " +
                                                  "\n Tuberculosis se basa en el uso de antibióticos de primera línea, siendo la isoniazida, rifampicina, pirazinamida y etambutol" +
                                                  "\n opciones altamente eficaces para eliminar la infección y reducir la inflamación pulmonar. Marcas reconocidas incluyen Rifadin" +
                                                  "\n y Myambutol. En casos graves se pueden administrar terapias de oxígeno para mejorar la oxigenación del paciente. En cuanto a " +
                                                  "\n la alimentación, se recomienda el consumo de alimentos ricos en antioxidantes y vitamina C, esenciales para fortalecer el    " +
                                                  "\n sistema inmunológico. Naranjas (por cada 100 gramos aproximadamente 53 mg de vitamina C, cubriendo el 59% de la ingesta diaria" +
                                                  "\n recomendada) y fresas (por cada 100 gramos aproximadamente 59 mg de vitamina C, cubriendo el 65% de la ingesta diaria        " +
                                                  "\n recomendada). También se sugiere el consumo de jengibre, que posee propiedades antiinflamatorias y ayuda a aliviar la        " +
                                                  "\n congestión pulmonar. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el       " +
                                                  "\n paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente correctas. Para ello se       " +
                                                  "\n recomienda hacer más de un diagnóstico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente. " +
                                                  "\n Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico.         " +
                                                  "\n Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchazón en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n La Artritis requiere una hidratación adecuada con una ingesta diaria de 2.5 a 3.5 litros de agua, equivalentes a 10 a 14 vasos    " +
                                                  "\n de tamaño regular, para ayudar a reducir la inflamación y mantener la movilidad articular. También se recomienda el consumo de    " +
                                                  "\n líquidos con propiedades antiinflamatorias como té verde y agua con cúrcuma para fortalecer el sistema inmunológico. La actividad " +
                                                  "\n física debe ser moderada y adaptada a la capacidad del paciente, priorizando ejercicios de bajo impacto como natación, yoga y     " +
                                                  "\n ejercicios de movilidad articular, lo que ayuda a mejorar la flexibilidad y reducir el dolor. El tratamiento de la Artritis se    " +
                                                  "\n basa en el uso de antiinflamatorios no esteroides (AINEs) y fármacos modificadores de la enfermedad (FAMEs), siendo el ibuprofeno," +
                                                  "\n naproxeno, metotrexato y adalimumab opciones altamente eficaces para reducir la inflamación y mejorar la calidad de vida. Marcas  " +
                                                  "\n reconocidas incluyen Advil, Naprosyn, Trexall y Humira. En algunos casos se pueden administrar terapias biológicas para mejorar   " +
                                                  "\n la respuesta del organismo. En cuanto a la alimentación, se recomienda el consumo de alimentos ricos en antioxidantes y ácidos    " +
                                                  "\n grasos Omega-3, esenciales para reducir la inflamación articular. Salmón (por cada 100 gramos aproximadamente 2.2 gramos de Omega-3)" +
                                                  "\n y espinacas (por cada 100 gramos aproximadamente 28 mg de vitamina C, cubriendo el 31% de la ingesta diaria recomendada). También " +
                                                  "\n se sugiere el consumo de cúrcuma, que posee propiedades antiinflamatorias y ayuda a mejorar la función articular. Este es solo    " +
                                                  "\n un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello " +
                                                  "\n la enfermedad y sus respuestas sean completamente correctas. Para ello se recomienda hacer más de un diagnóstico de Mi Vida para  " +
                                                  "\n establecer mayor seguridad en el tratamiento adecuado de su paciente. Además, por su salud, si la respuesta del diagnóstico no    " +
                                                  "\n le satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n La Tosferina requiere una hidratación adecuada con una ingesta diaria de 3 a 4 litros de agua, equivalentes a 12 a 16 vasos  " +
                                                  "\n de tamaño regular, para ayudar a mantener la función pulmonar y reducir la inflamación. También se recomienda el consumo de  " +
                                                  "\n líquidos con propiedades antimicrobianas como té verde y agua con miel, que pueden aliviar la irritación de la garganta y    " +
                                                  "\n mejorar la salud respiratoria. La actividad física debe ser mínima mientras persistan los síntomas, priorizando el descanso  " +
                                                  "\n absoluto y evitando esfuerzos que puedan agravar la tos y la fatiga respiratoria. El tratamiento de la Tosferina se basa en  " +
                                                  "\n el uso de antibióticos, siendo la azitromicina, claritromicina y eritromicina opciones altamente eficaces para reducir la    " +
                                                  "\n duración y gravedad de la enfermedad. Marcas reconocidas incluyen Zithromax, Biaxin y Erythrocin. En casos graves se pueden  " +
                                                  "\n administrar terapias de oxígeno para mejorar la oxigenación del paciente. En cuanto a la alimentación, se recomienda el consumo" +
                                                  "\n de alimentos ricos en antioxidantes y vitamina C, esenciales para fortalecer el sistema inmunológico. Naranjas (por cada 100  " +
                                                  "\n gramos aproximadamente 53 mg de vitamina C, cubriendo el 59% de la ingesta diaria recomendada) y fresas (por cada 100 gramos  " +
                                                  "\n aproximadamente 59 mg de vitamina C, cubriendo el 65% de la ingesta diaria recomendada). También se sugiere el consumo de     " +
                                                  "\n jengibre, que posee propiedades antiinflamatorias y ayuda a aliviar la congestión pulmonar. Este es solo un diagnóstico       " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad" +
                                                  "\n y sus respuestas sean completamente correctas. Para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer  " +
                                                  "\n mayor seguridad en el tratamiento adecuado de su paciente. Además, por su salud, si la respuesta del diagnóstico no le satisface" +
                                                  "\n del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchazón de las glándulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas. " +
                                                  "\n Las Paperas requieren una hidratación adecuada con una ingesta diaria de 2.5 a 3.5 litros de agua, equivalentes a 10 a 14 vasos    " +
                                                  "\n de tamaño regular, para ayudar a mantener la función inmunológica y reducir la inflamación. También se recomienda el consumo de    " +
                                                  "\n líquidos con propiedades antiinflamatorias como té verde y agua con miel, que pueden aliviar la irritación de la garganta y mejorar" +
                                                  "\n la salud general. La actividad física debe ser mínima mientras persistan los síntomas, priorizando el descanso absoluto y evitando " +
                                                  "\n esfuerzos que puedan agravar la fatiga y el malestar. El tratamiento de las Paperas es principalmente sintomático, ya que no existe" +
                                                  "\n un antiviral específico para la enfermedad. Se recomienda el uso de analgésicos como paracetamol o ibuprofeno para reducir la fiebre" +
                                                  "\n y el dolor. Marcas reconocidas incluyen Tylenol y Advil. En casos de inflamación severa se pueden aplicar compresas frías o calientes" +
                                                  "\n en la zona afectada para aliviar el dolor. En cuanto a la alimentación, se recomienda el consumo de alimentos suaves y ricos en     " +
                                                  "\n antioxidantes, esenciales para fortalecer el sistema inmunológico. Plátanos (por cada 100 gramos aproximadamente 358 mg de potasio, " +
                                                  "\n cubriendo el 10% de la ingesta diaria recomendada) y arroz blanco, que es fácil de digerir y ayuda a estabilizar el sistema digestivo." +
                                                  "\n También se sugiere el consumo de yogur natural, que aporta probióticos beneficiosos para la salud intestinal y la recuperación.       " +
                                                  "\n Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad       " +
                                                  "\n y que por ello la enfermedad y sus respuestas sean completamente correctas. Para ello se recomienda hacer más de un diagnóstico       " +
                                                  "\n de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente. Además, por su salud, si la respuesta del       " +
                                                  "\n diagnóstico no le satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita a la app Mi Vida y       " +
                                                  "\n espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupción cutánea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n El Zika requiere una hidratación adecuada con una ingesta diaria de 3 a 4 litros de agua, equivalentes a 12 a 16 vasos  " +
                                                  "\n de tamaño regular, para prevenir la deshidratación causada por la fiebre y otros síntomas. También se recomienda el     " +
                                                  "\n consumo de líquidos con electrolitos naturales como agua de coco, que ayuda a mantener el equilibrio de minerales en    " +
                                                  "\n el cuerpo. La actividad física debe ser mínima mientras persistan los síntomas, priorizando el descanso absoluto y      " +
                                                  "\n ejercicios de respiración para mejorar la oxigenación. El tratamiento del Zika es sintomático, ya que no existe un      " +
                                                  "\n antiviral específico. Se recomienda el uso de analgésicos como paracetamol para reducir la fiebre y el dolor muscular.  " +
                                                  "\n Marcas reconocidas incluyen Tempra y Tylenol. Es importante evitar el uso de aspirina y otros antiinflamatorios no      " +
                                                  "\n esteroides hasta descartar dengue para reducir el riesgo de sangrado. En cuanto a la alimentación, se recomienda el     " +
                                                  "\n consumo de alimentos ricos en antioxidantes y vitamina C, esenciales para fortalecer el sistema inmunológico. Naranjas  " +
                                                  "\n (por cada 100 gramos aproximadamente 53 mg de vitamina C, cubriendo el 59% de la ingesta diaria recomendada) y fresas   " +
                                                  "\n (por cada 100 gramos aproximadamente 59 mg de vitamina C, cubriendo el 65% de la ingesta diaria recomendada). También   " +
                                                  "\n se sugiere el consumo de jengibre, que posee propiedades antiinflamatorias y ayuda a aliviar el malestar general.       " +
                                                  "\n Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa    " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas sean completamente correctas. Para ello se recomienda hacer    " +
                                                  "\n más de un diagnóstico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente. Además,     " +
                                                  "\n por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico.            " +
                                                  "\n Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, Vómitos, Deshidratación, Dolor abdominal.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 3.5 a 4.5 litros de agua, equivalentes a 12 a 18 vasos de tamaño regular,   " +
                                                  "\n para prevenir la deshidratación causada por la diarrea y los vómitos. También se recomienda el consumo de soluciones de      " +
                                                  "\n rehidratación oral como Pedialyte o Enfalyte, que ayudan a reponer los electrolitos perdidos y mejorar la recuperación.      " +
                                                  "\n EJERCICIO: La actividad física debe ser mínima mientras persistan los síntomas, priorizando el descanso absoluto y evitando  " +
                                                  "\n esfuerzos que puedan agravar la pérdida de líquidos. POSIBLE TRATAMIENTO: No existe un antiviral específico para el Rotavirus," +
                                                  "\n por lo que el tratamiento se basa en la rehidratación constante. En casos graves puede requerirse administración de líquidos  " +
                                                  "\n intravenosos en un hospital para evitar complicaciones. Marcas reconocidas incluyen Pedialyte y Enfalyte, recomendadas para   " +
                                                  "\n la rehidratación efectiva. ALIMENTACION: Se recomienda el consumo de alimentos suaves y ricos en electrolitos, esenciales para" +
                                                  "\n fortalecer el sistema digestivo y prevenir la deshidratación. Plátanos (por cada 100 gramos aproximadamente 358 mg de potasio," +
                                                  "\n cubriendo el 10% de la ingesta diaria recomendada) y arroz blanco, que es fácil de digerir y ayuda a estabilizar el sistema   " +
                                                  "\n digestivo. También se sugiere el consumo de yogur natural, que aporta probióticos beneficiosos para la salud intestinal y la  " +
                                                  "\n recuperación. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga" +
                                                  "\n esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente correctas. Para ello se recomienda hacer más  " +
                                                  "\n de un diagnóstico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente. Además, por su salud, " +
                                                  "\n si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita" +
                                                  "\n a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, Náuseas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 2.5 a 3 litros de agua, equivalentes a 10 a 12 vasos de tamaño regular,   " +
                                                  "\n para ayudar a la eliminación de toxinas y prevenir complicaciones derivadas de la infección. También se recomienda el      " +
                                                  "\n consumo de líquidos con propiedades antimicrobianas como agua con limón y infusiones de jengibre para fortalecer el sistema" +
                                                  "\n inmunológico. EJERCICIO: La actividad física debe ser mínima mientras persistan los síntomas, priorizando el descanso      " +
                                                  "\n absoluto y evitando esfuerzos que puedan debilitar el organismo. POSIBLE TRATAMIENTO: El tratamiento de la Listeriosis     " +
                                                  "\n se basa en el uso de antibióticos, siendo la ampicilina y la gentamicina opciones altamente eficaces para eliminar la      " +
                                                  "\n bacteria. La ampicilina impide la replicación de la bacteria mientras que la gentamicina bloquea la producción de proteínas" +
                                                  "\n esenciales para su supervivencia. Marcas reconocidas incluyen Ampex y Garamycin. En casos graves se pueden administrar     " +
                                                  "\n corticoides para reducir la inflamación y mejorar la respuesta del organismo. ALIMENTACION: Se recomienda el consumo de    " +
                                                  "\n alimentos ricos en antioxidantes y vitamina C, esenciales para fortalecer el sistema inmunológico. Espinacas (por cada     " +
                                                  "\n 100 gramos aproximadamente 28 mg de vitamina C, cubriendo el 31% de la ingesta diaria recomendada) y zanahorias (por cada  " +
                                                  "\n 100 gramos aproximadamente 835 µg de vitamina A, cubriendo el 93% de la ingesta diaria recomendada). También se sugiere el " +
                                                  "\n consumo de yogur natural, que aporta probióticos beneficiosos para la salud intestinal y la recuperación. Este es solo un  " +
                                                  "\n diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por  " +
                                                  "\n ello la enfermedad y sus respuestas sean completamente correctas. Para ello se recomienda hacer más de un diagnóstico de   " +
                                                  "\n Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente. Además, por su salud, si la respuesta   " +
                                                  "\n del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita a la app  " +
                                                  "\n Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, Vómitos.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 3.5 a 4.5 litros de agua, equivalentes a 12 a 18 vasos de tamaño regular,   " +
                                                  "\n para prevenir la deshidratación causada por la diarrea y la fiebre. También se recomienda el consumo de soluciones de        " +
                                                  "\n rehidratación oral como Pedialyte o Enfalyte, que ayudan a reponer los electrolitos perdidos y mejorar la recuperación.      " +
                                                  "\n EJERCICIO: La actividad física debe ser mínima mientras persistan los síntomas, priorizando el descanso absoluto y evitando  " +
                                                  "\n esfuerzos que puedan agravar la pérdida de líquidos. POSIBLE TRATAMIENTO: El tratamiento de la Shigelosis se basa en la      " +
                                                  "\n rehidratación constante, y en casos graves puede requerirse administración de líquidos intravenosos en un hospital para      " +
                                                  "\n evitar complicaciones. En infecciones severas se pueden utilizar antibióticos como ciprofloxacino y azitromicina, que ayudan " +
                                                  "\n a reducir la duración de la enfermedad. Marcas reconocidas incluyen Cipro y Zithromax. ALIMENTACION: Se recomienda el consumo" +
                                                  "\n de alimentos suaves y ricos en electrolitos, esenciales para fortalecer el sistema digestivo y prevenir la deshidratación.   " +
                                                  "\n Plátanos (por cada 100 gramos aproximadamente 358 mg de potasio, cubriendo el 10% de la ingesta diaria recomendada) y arroz  " +
                                                  "\n blanco, que es fácil de digerir y ayuda a estabilizar el sistema digestivo. También se sugiere el consumo de yogur natural,  " +
                                                  "\n que aporta probióticos beneficiosos para la salud intestinal y la recuperación. Este es solo un diagnóstico predeterminado   " +
                                                  "\n lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus      " +
                                                  "\n respuestas sean completamente correctas. Para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer      " +
                                                  "\n mayor seguridad en el tratamiento adecuado de su paciente. Además, por su salud, si la respuesta del diagnóstico no le       " +
                                                  "\n satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos crónica, Producción excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad Pulmonar Obstructiva Crónica (EPOC)." +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 2.5 a 3 litros de agua, equivalentes a 10 a 12 vasos de tamaño regular,    " +
                                                  "\n para ayudar a mantener la función pulmonar y reducir la inflamación. También se recomienda el consumo de líquidos con       " +
                                                  "\n propiedades antioxidantes como té verde y agua con limón para mejorar la salud respiratoria. EJERCICIO: La actividad        " +
                                                  "\n física debe ser moderada y adaptada a la capacidad pulmonar, priorizando ejercicios de bajo impacto como caminatas,         " +
                                                  "\n natación y ejercicios de respiración, que fortalecen los músculos respiratorios y mejoran la oxigenación.                   " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento de la EPOC se basa en el uso de broncodilatadores y corticosteroides inhalados, siendo  " +
                                                  "\n el salbutamol y la fluticasona opciones altamente eficaces para mejorar la respiración y reducir la inflamación. Marcas     " +
                                                  "\n reconocidas incluyen Ventolin y Flixotide. En casos avanzados se pueden administrar terapias de oxígeno para mejorar la     " +
                                                  "\n calidad de vida del paciente. ALIMENTACION: Se recomienda el consumo de alimentos ricos en antioxidantes y ácidos grasos    " +
                                                  "\n Omega-3, esenciales para reducir la inflamación pulmonar. Salmón (por cada 100 gramos aproximadamente 2.2 gramos de Omega-3)" +
                                                  "\n y espinacas (por cada 100 gramos aproximadamente 28 mg de vitamina C, cubriendo el 31% de la ingesta diaria recomendada).   " +
                                                  "\n También se sugiere el consumo de cúrcuma, que posee propiedades antiinflamatorias y ayuda a mejorar la función pulmonar.    " +
                                                  "\n Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad" +
                                                  "\n y que por ello la enfermedad y sus respuestas sean completamente correctas. Para ello se recomienda hacer más de un diagnóstico" +
                                                  "\n de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente. Además, por su salud, si la respuesta " +
                                                  "\n del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita a la app   " +
                                                  "\n Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreción anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 2.5 a 3 litros de agua, equivalentes a 10 a 12 vasos de tamaño regular,    " +
                                                  "\n para ayudar a la eliminación de toxinas y prevenir molestias urinarias. También se recomienda el consumo de líquidos con    " +
                                                  "\n propiedades antimicrobianas como agua con limón y infusiones de jengibre para fortalecer el sistema inmunológico.           " +
                                                  "\n EJERCICIO: La actividad física debe ser moderada y adaptada a su estado de salud, priorizando ejercicios aeróbicos de bajo  " +
                                                  "\n impacto como caminatas o yoga durante al menos 30 a 60 minutos al día, lo que ayuda a fortalecer el sistema inmunológico    " +
                                                  "\n sin generar estrés excesivo en el cuerpo. POSIBLE TRATAMIENTO: El tratamiento de la Clamidia se basa en el uso de antibióticos," +
                                                  "\n siendo la azitromicina y la doxiciclina opciones altamente eficaces para eliminar la bacteria. La azitromicina se administra   " +
                                                  "\n en una dosis única mientras que la doxiciclina se toma durante varios días. Marcas reconocidas incluyen Zithromax y Doryx.     " +
                                                  "\n ALIMENTACION: Se recomienda el consumo de alimentos ricos en antioxidantes y vitamina C, esenciales para fortalecer el sistema " +
                                                  "\n inmunológico. Fresas (por cada 100 gramos aproximadamente 59 mg de vitamina C, cubriendo el 65% de la ingesta diaria recomendada)" +
                                                  "\n y kiwis (por cada 100 gramos aproximadamente 92 mg de vitamina C, cubriendo el 102% de la ingesta diaria recomendada). También   " +
                                                  "\n se sugiere el consumo de yogur natural, que aporta probióticos beneficiosos para la salud intestinal y la recuperación. Este es  " +
                                                  "\n solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que    " +
                                                  "\n por ello la enfermedad y sus respuestas sean completamente correctas. Para ello se recomienda hacer más de un diagnóstico de     " +
                                                  "\n Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente. Además, por su salud, si la respuesta del     " +
                                                  "\n diagnóstico no le satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita a la app Mi Vida    " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Náuseas, Dolor de cabeza severo, Rigidez en el cuello, Confusión.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis Bacteriana." +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 3.5 a 4.5 litros de agua, equivalentes a 12 a 18 vasos de tamaño regular,  " +
                                                  "\n para prevenir la deshidratación causada por la fiebre intensa y la inflamación de las meninges. También se recomienda el    " +
                                                  "\n consumo de soluciones de rehidratación oral como Pedialyte o Enfalyte, que ayudan a reponer los electrolitos perdidos y     " +
                                                  "\n mejorar la recuperación. EJERCICIO: La actividad física debe ser mínima mientras persistan los síntomas, priorizando el     " +
                                                  "\n descanso absoluto y evitando esfuerzos que puedan agravar la inflamación cerebral. POSIBLE TRATAMIENTO: El tratamiento      " +
                                                  "\n de la Meningitis Bacteriana se basa en el uso de antibióticos intravenosos, siendo la ceftriaxona y la vancomicina opciones " +
                                                  "\n altamente eficaces para eliminar la infección y reducir la inflamación. Marcas reconocidas incluyen Rocephin y Vancocin.    " +
                                                  "\n En casos graves se pueden administrar corticoides para reducir la inflamación y mejorar la respuesta del organismo.         " +
                                                  "\n ALIMENTACION: Se recomienda el consumo de alimentos ricos en antioxidantes y vitamina C, esenciales para fortalecer         " +
                                                  "\n el sistema inmunológico. Espinacas (por cada 100 gramos aproximadamente 28 mg de vitamina C, cubriendo el 31% de la         " +
                                                  "\n ingesta diaria recomendada) y zanahorias (por cada 100 gramos aproximadamente 835 µg de vitamina A, cubriendo el 93%        " +
                                                  "\n de la ingesta diaria recomendada). También se sugiere el consumo de yogur natural, que aporta probióticos beneficiosos      " +
                                                  "\n para la salud intestinal y la recuperación. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no        " +
                                                  "\n garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente     " +
                                                  "\n correctas. Para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer mayor seguridad en el tratamiento " +
                                                  "\n adecuado de su paciente. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda      " +
                                                  "\n consultar a su médico. Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, Pérdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, Pérdida de apetito.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Cáncer." +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 3 a 4 litros de agua, equivalentes a 12 a 16 vasos de tamaño regular,     " +
                                                  "\n para ayudar a mantener la función celular y reducir los efectos secundarios del tratamiento. También se recomienda el      " +
                                                  "\n consumo de líquidos con propiedades antioxidantes como té verde y agua con limón para fortalecer el sistema inmunológico.  " +
                                                  "\n EJERCICIO: La actividad física debe ser moderada y adaptada a la capacidad del paciente, priorizando ejercicios de bajo    " +
                                                  "\n impacto como caminatas, yoga y ejercicios de respiración, que mejoran la circulación y reducen la fatiga. POSIBLE TRATAMIENTO:" + 
                                                  "\n El tratamiento del Cáncer varía según el tipo y la etapa de la enfermedad, pero puede incluir quimioterapia, radioterapia,  " +
                                                  "\n cirugía y terapias dirigidas. Marcas reconocidas incluyen Adriamycin y Taxol. En algunos casos se pueden administrar        " +
                                                  "\n inmunoterapias para mejorar la respuesta del organismo. ALIMENTACION: Se recomienda el consumo de alimentos ricos en antioxidantes" + 
                                                  "\n y proteínas, esenciales para fortalecer el sistema inmunológico y mantener la energía. Espinacas (por cada 100 gramos      " +
                                                  "\n aproximadamente 28 mg de vitamina C, cubriendo el 31% de la ingesta diaria recomendada) y zanahorias (por cada 100 gramos  " +
                                                  "\n aproximadamente 835 µg de vitamina A, cubriendo el 93% de la ingesta diaria recomendada). También se sugiere el consumo de " +
                                                  "\n yogur natural, que aporta probióticos beneficiosos para la salud intestinal y la recuperación. Este es solo un diagnóstico " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la      " +
                                                  "\n enfermedad y sus respuestas sean completamente correctas. Para ello se recomienda hacer más de un diagnóstico de Mi Vida   " +
                                                  "\n para establecer mayor seguridad en el tratamiento adecuado de su paciente. Además, por su salud, si la respuesta del       " +
                                                  "\n diagnóstico no le satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita a la app      " +
                                                  "\n Mi Vida y espera que te mejores.");
                            } 
                        }
                    }
                            
            }
        if (EdadMasculino.equals("Adolescencia = 10-21 años")) {
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
             
             
         