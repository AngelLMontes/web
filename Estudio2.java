import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 

          public class Estudio2 implements ActionListener{

         protected final JLabel label1;
         protected JScrollPane scrollpane1;
         protected JTextArea textarea1;
         private JFrame frame;
         private final String edadEsperada = "Infancia = 0-9 años";
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
                    
                    if(EdadMasculino.equals("Infancia = 0-9 años")){
                        
                        if(EstaturaMasculino.equals("0.90-1.35 m")){
                         
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                 "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                 "\n Tiene gran posibilidad de contraer Influenza(Gripe). " + 
                                                  "\n Es recomendable que el niño realice cerca de 60 minutos de actividad fisica moderada" +
                                                  "\n a intensa diaria, sin embargo considerese esa edad aproximada solo para los mas grandes," +
                                                  "\n (los de 9 años), tambien es recomendable el consumo diario de 1.7 Litros de agua al " +
                                                  "\n dia (siete vasos de agua de tamao regular).POSIBLE TRATAMIENTO: para la gripe en niños" +
                                                  "\n el tratamiento suele incluir; medicamentos para reducir la fiebre y aliviar los síntomas" +
                                                  "\n , como el paracetamol(Tempra) o el ibuprofeno. Antivirales especificos contra la gripe" +
                                                  "\n como el oseltamivir(Advil). Tambien es recomendable que el niño consuma mucha fruta para" +
                                                  "\n fortalecer su sitema inmune tales como: Naranjas: ricas en vitamina C,Fresas:ricas en " +
                                                  "\n vitamina C y antioxidantes, Plátanos:ricos en potasio, que puede ayudar a reemplazar los" +
                                                  "\n electrolitos perdidos deido a la fiebre y sudoración y el Kiwi:rico en vitamina C y   " +
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
                                                 "\n Tiene gran posibilidad de contraer Neumonía." +
                                                 "\n Es recomendable que el niño realice actividad física moderada según su capacidad " +
                                                 "\n y estado de recuperación, siempre supervisada y evitando esfuerzos excesivos o " +
                                                 "\n juegos que agiten demasiado, especialmente si aún presenta síntomas respiratorios." +
                                                 "\n Cuando se encuentre mejor, puede retomar gradualmente la actividad física adaptada a" +
                                                 "\n su edad, buscando cerca de 60 minutos diarios para los más grandes. También es " +
                                                 "\n crucial el consumo diario de 2 a 2.5 Litros de agua al día (ocho a diez vasos de tamaño " +
                                                 "\n regular), especialmente si tiene fiebre, para ayudar a fluidificar las secreciones   " +
                                                 "\n pulmonares y prevenir la deshidratación. POSIBLE TRATAMIENTO: para la neumonía en niños" +
                                                 "\n el tratamiento suele incluir; antibióticos (si la causa es bacteriana, como amoxicilina o" +
                                                 "\n azitromicina, bajo prescripción médica estricta), medicamentos para reducir la fiebre y " +
                                                 "\n aliviar el dolor (como paracetamol o ibuprofeno), y en algunos casos, oxigenoterapia si la" +
                                                 "\n saturación de oxígeno es baja. Es fundamental seguir las indicaciones del médico al pie de" + 
                                                 "\n la letra y completar el ciclo de antibióticos aunque el niño parezca mejor. También es " +
                                                 "\n recomendable que el niño consuma alimentos que fortalezcan su sistema inmune y le aporten" + 
                                                 "\n energía, tales como:Sopas y caldos: Nutritivos y fáciles de digerir, además de ayudar a " +
                                                 "\n la hidratación. Frutas ricas en vitamina C: Naranjas, fresas, kiwi, guayaba, que apoyan el" + 
                                                 "\n sistema inmunológico. Verduras cocidas: Zanahorias, espinacas, brócoli, que aportan vitaminas" +
                                                 "\n y minerales esenciales.Proteínas magras: Pollo, pavo, pescado (según la edad y tolerancia)," +
                                                 "\n que son importantes para la recuperación. Este es solo un Diagnóstico predeterminado lógico," +
                                                 "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la" + 
                                                 "\n enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico" +
                                                 "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además" + 
                                                 "\n por su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho" +
                                                 "\n consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores." ); 
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visión borrosa, Pérdida de peso.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes. Es recomendable que el niño realice cerca de 60 " + 
                                                  "\n minutos de actividad física moderada a intensa diaria, como juegos activos, deportes o paseos" + 
                                                  "\n en bicicleta, adaptándose siempre a su estado de salud y bajo supervisión. Esto es crucial para" +
                                                  "\n el control del azúcar en sangre, la sensibilidad a la insulina y el mantenimiento de un peso " +
                                                  "\n saludable. También es fundamental el consumo diario de 1.7 a 2 Litros de agua al día (siete a" + 
                                                  "\n ocho vasos de tamaño regular), priorizando el agua natural sobre bebidas azucaradas, para    " +
                                                  "\n mantener una hidratación  adecuada y ayudar a los riñones a procesar el exceso de glucosa.   " +
                                                  "\n POSIBLE TRATAMIENTO: Para la diabetes en niños, el tratamiento suele incluir; manejo de la   " +
                                                  "\n insulina (en caso de diabetes tipo1, se requiere insulina inyectada para controlar los niveles" +
                                                  "\n de glucosa), medicamentos orales(para diabetes tipo 2, como la metformina, siempre bajo      " +
                                                  "\n prescripción médica), y un monitoreoconstante de los niveles de glucosa en sangre. Es vital  " +
                                                  "\n seguir un plan de alimentación saludable y equilibrado, así como un control médico regular.  " +
                                                  "\n También es recomendable que el niño consuma alimentos que ayuden a la regulación del azúcar  " +
                                                  "\n y fortalezcan su sistema   inmune, tales como: Verduras no almidonadas como brócoli, espinacas" +
                                                  "\n y zanahorias que  aportan fibra y nutrientes con bajo impacto en la glucosa; Frutas con      " +
                                                  "\n moderación como manzanas, peras y bayas (fresas, arándanos) ricas en fibra y antioxidantes   " +
                                                  "\n que contribuyen a  una liberación más lenta de azúcares; Proteínas magras como pollo, pescado" + 
                                                  "\n y legumbres que ayudan a mantener la saciedad y el control glucémico; y Granos integrales    " +
                                                  "\n como avena y pan integral que proporcionan fibra y energía sostenida. Este es solo un        " +
                                                  "\n Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente   " +
                                                  "\n tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para     " +
                                                  "\n ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad    " +
                                                  "\n en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnóstico" +
                                                  "\n no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes   " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresión en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n Es recomendable que el niño realice actividad física de forma controlada y supervisada, con" +
                                                  "\n calentamiento previo y enfriamiento posterior, evitando desencadenantes conocidos del asma " +
                                                  "\n (como alérgenos, aire frío o contaminado) y pausas si presenta síntomas. La cantidad de " +
                                                  "\n ejercicio debe ser adaptada a su capacidad y a la presencia de síntomas, pudiendo ser cerca " +
                                                  "\n de 60 minutos de actividad moderada a intensa diaria en los días que se encuentre bien, pero " +
                                                  "\n siempre consultando al médico para un plan seguro. También es crucial el consumo diario de " +
                                                  "\n 1.5 a 1.7 Litros de agua al día (seis a siete vasos de agua de tamaño regular) para ayudar " +
                                                  "\n a mantener las vías respiratorias hidratadas y las secreciones más fluidas, lo que facilita " +
                                                  "\n la respiración.POSIBLE TRATAMIENTO: Para el asma en niños, el tratamiento suele incluir; " +
                                                  "\n broncodilatadores de alivio rápido (para abrir las vías respiratorias durante un ataque, " +
                                                  "\n como el salbutamol, marca común en México: Ventolin o Aerolin), corticosteroides inhalados " +
                                                  "\n (para el control a largo plazo y reducir la inflamación, como la fluticasona o budesonida, " +
                                                  "\n marcas comunes: Flixotide o Pulmicort), y en algunos casos, modificadores de leucotrienos (como" +
                                                  "\n el montelukast, marca común: Singulair). Es fundamental seguir estrictamente el plan de acción" +
                                                  "\n para el asma indicado por el médico y usar los medicamentos preventivos regularmente. También" +
                                                  "\n es recomendable que el niño consuma alimentos que puedan ayudar a reducir la inflamación y " +
                                                  "\n fortalecer el sistema inmune, tales como: Pescados grasos (salmón, atún): ricos en ácidos " +
                                                  "\n grasos Omega-3, que poseen propiedades antiinflamatorias que pueden ayudar a reducir la " +
                                                  "\n inflamación de las vías respiratorias. Frutas y verduras de colores vivos (arándanos, fresas," +
                                                  "\n espinacas, brócoli): ricas en antioxidantes como la vitamina C y carotenoides, que pueden" +
                                                  "\n proteger las células del daño y fortalecer el sistema inmunológico. Jengibre: contiene " +
                                                  "\n compuestos con efectos antiinflamatorios que podrían ser beneficiosos para las vías " +
                                                  "\n respiratorias. Cúrcuma: con su componente activo, la curcumina, también tiene potentes" +
                                                  "\n propiedades antiinflamatorias y antioxidantes. Este es solo un Diagnóstico predeterminado" +
                                                  "\n lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y " +
                                                  "\n que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda " +
                                                  "\n hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento" +
                                                  "\n adecuado de su paciente, además por su salud si la respuesta del Diagnóstico no le satisface" +
                                                  "\n del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a" +
                                                  "\n la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, Pérdida de peso, Ganglios linfáticos inflamados, Erupción cutánea (Diarrea).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n Es recomendable que el niño realice actividad física moderada y adaptada a su estado de salud, bajo supervisión          " +
                                                  "\n médica para evitar el agotamiento y proteger su sistema inmune. La actividad debe ser gradual, buscando idealmente       " +
                                                  "\n cerca de 60 minutos de actividad física moderada a intensa diaria para los más grandes, pero siempre con precaución      " +
                                                  "\n y evitando deportes de contacto o actividades con riesgo de lesiones si su sistema inmune está comprometido.             " +
                                                  "\n También es crucial el consumo diario de 1.7 a 2 Litros de agua al día (siete a ocho vasos de tamaño regular) para        " +
                                                  "\n mantener una buena hidratación, fundamental para el bienestar general, el funcionamiento del cuerpo y el metabolismo     " +
                                                  "\n de los medicamentos. POSIBLE TRATAMIENTO: Para el VIH/SIDA en niños, el tratamiento principal es la terapia              " +
                                                  "\n antirretroviral (TARV), que incluye una combinación de medicamentos que trabajan para controlar la replicación del       " +
                                                  "\n virus, mejorar la función inmunológica y prevenir el desarrollo de infecciones oportunistas. Estos medicamentos se       " +
                                                  "\n eligen y ajustan específicamente por un médico especialista en VIH pediátrico, y es vital la adherencia estricta al      " +
                                                  "\n régimen. Algunos ejemplos de medicamentos usados en TARV incluyen inhibidores de la transcriptasa inversa análogos       " +
                                                  "\n de nucleósidos (como Zidovudina, marca común en México: Retrovir), inhibidores de la transcriptasa inversa no análogos   " +
                                                  "\n de nucleósidos (como Efavirenz, marca común: Sustiva), e inhibidores de la proteasa (como Lopinavir/Ritonavir, marca     " +
                                                  "\n común: Kaletra). El tratamiento también incluye el manejo y prevención de infecciones oportunistas con antibióticos      " +
                                                  "\n profilácticos (como el trimetoprim/sulfametoxazol, marca común: Bactrim) para proteger contra ciertas infecciones.       " +
                                                  "\n Es fundamental el seguimiento médico constante. También es recomendable que el niño consuma alimentos que refuercen      " +
                                                  "\n el sistema inmune, proporcionen energía y ayuden a mantener un peso saludable, tales como carnes magras como pollo y     " +
                                                  "\n pescado, que aportan proteínas esenciales para la reparación de tejidos y la función inmune; lácteos y alternativas      " +
                                                  "\n enriquecidas con calcio y vitamina D para la salud ósea; granos integrales como avena y arroz integral, ricos en fibra   " +
                                                  "\n y energía sostenida; así como una amplia variedad de frutas y verduras de colores vivos como espinacas, brócoli,         " +
                                                  "\n naranjas y fresas, que proveen vitaminas, minerales y antioxidantes, como la Vitamina C (importante para el sistema      " +
                                                  "\n inmune) y el Ácido Fólico (esencial para la producción de células).Este es solo un Diagnóstico predeterminado lógico,    " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus          " +
                                                  "\n respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad  " +
                                                  "\n en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnóstico no le satisface del todo se  " +
                                                  "\n le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");  
                            }
                            if(Enfermedad.equals("Fiebre, Secreción anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea. " +
                                                  "\n Es recomendable que el niño realice actividad física moderada y adaptada a su estado de salud, sin forzar su cuerpo," + 
                                                  "\n buscando idealmente cerca de 60 minutos de actividad física moderada a intensa diaria para los más grandes, pero siempre" +
                                                  "\n con el cuidado necesario. También es crucial el consumo diario de 1.7 Litros de agua al día (siete vasos de agua de " +
                                                  "\n tamaño regular) para mantener una buena hidratación, fundamental para apoyar el proceso de recuperación del cuerpo. " +
                                                  "\n POSIBLE TRATAMIENTO: Para la gonorrea en niños, el tratamiento es estrictamente con antibióticos, siempre bajo la   " +
                                                  "\n supervisión y prescripción de un médico. La elección y dosis del antibiótico dependerán de la edad, peso y la cepa  " +
                                                  "\n específica de la bacteria. Es vital que se complete el ciclo de antibióticos tal como lo indique el profesional de la" +
                                                  "\n salud para asegurar la erradicación total de la infección y prevenir complicaciones. Ejemplos de antibióticos utilizados" +
                                                  "\n incluyen ceftriaxona (una marca común es Rocephin) administrada por inyección, o azitromicina (una marca común es   " +
                                                  "\n Zithromax) administrada oralmente. Es importante recordar que la gonorrea en niños requiere una evaluación médica   " +
                                                  "\n inmediata, ya que puede tener implicaciones serias y, en algunos casos, puede ser indicativa de abuso. También es   " +
                                                  "\n recomendable que el niño consuma alimentos que fortalezcan su sistema inmune y contribuyan a su recuperación general," +
                                                  "\n como una amplia variedad de frutas y verduras frescas ricas en Vitamina C y antioxidantes (como naranjas, fresas,   " +
                                                  "\n kiwis y brócoli) que apoyan la función inmunológica; proteínas magras (como pollo, pescado y legumbres) que son    " +
                                                  "\n esenciales para la reparación de tejidos y el mantenimiento de la energía; y granos integrales (como avena y arroz  " +
                                                  "\n integral) que proveen energía sostenida y fibra para una buena digestión. Este es solo un Diagnóstico predeterminado" +
                                                  "\n lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad  " +
                                                  "\n y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer   " +
                                                  "\n mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnóstico no  " +
                                                  "\n le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app  " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linfáticos inflamados, Úlceras o llagas dolorosas, Picazón o ardor, Dolor al orinar.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n Es recomendable que el niño realice actividad física moderada y" +
                                                  "\n adaptada a su estado de salud, especialmente evitando actividades que puedan irritar las lesiones si estas están" +
                                                  "\n presentes, como el roce excesivo o la sudoración intensa en el área afectada. Una vez que las lesiones remitan, " +
                                                  "\n puede retomar gradualmente la actividad física normal para su edad, buscando idealmente cerca de 60 minutos de  " +
                                                  "\n actividad moderada a intensa diaria para los más grandes. También es crucial el consumo diario de 1.7 Litros de " +
                                                  "\n agua al día (siete vasos de agua de tamaño regular) para mantener una buena hidratación, lo cual es fundamental " +
                                                  "\n para el bienestar general y el funcionamiento óptimo del sistema inmune. POSIBLE TRATAMIENTO: Para el herpes genital" +
                                                  "\n en niños, el tratamiento principal consiste en medicamentos antivirales que ayudan a controlar el brote, reducir" +
                                                  "\n la intensidad y duración de los síntomas, y prevenir futuras recurrencias, aunque no eliminan el virus del cuerpo." +
                                                  "\n Es fundamental que estos medicamentos sean prescritos y supervisados por un médico, quien determinará la dosis  " +
                                                  "\n adecuada según la edad y el peso del niño. Algunos ejemplos de medicamentos antivirales utilizados incluyen Aciclovir" +
                                                  "\n (una marca común es Zovirax), Valaciclovir (una marca común es Valtrex), y Famciclovir (una marca común es Famvir)." +
                                                  "\n Además del tratamiento antiviral, es importante mantener una higiene adecuada de las lesiones y evitar tocarlas para" +
                                                  "\n prevenir la propagación. También es recomendable que el niño consuma alimentos que fortalezcan su sistema inmune y " +
                                                  "\n ayuden a la cicatrización, tales como alimentos ricos en lisina y bajos en arginina, ya que la lisina puede inhibir" +
                                                  "\n la replicación del virus del herpes, presentes en lácteos, pescado y pollo, que aportan proteínas esenciales y  " +
                                                  "\n Vitamina D (importante para la función inmune). Una variedad de frutas y verduras de colores vivos, como espinacas," +
                                                  "\n pimientos rojos y kiwis, que son ricas en Vitamina C y antioxidantes, también contribuyen a la reparación celular " +
                                                  "\n y el fortalecimiento de las defensas del cuerpo. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado" +
                                                  "\n no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén" +
                                                  "\n correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el" +
                                                  "\n tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnóstico no le satisface del todo" +
                                                  "\n se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida)" +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Úlceras indoloras, Erupción cutánea, Dolor de cabeza, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Sífilis." +
                                                  "\n Es recomendable que el niño realice actividad física moderada y adaptada a su estado de salud, especialmente si la" +
                                                  "\n sífilis ha afectado alguna articulación o hueso, o si presenta fatiga. Durante el tratamiento y la recuperación, la" +
                                                  "\n actividad debe ser supervisada, buscando idealmente cerca de 60 minutos de actividad moderada a intensa diaria para" +
                                                  "\n los más grandes, pero siempre con precaución y escuchando las señales del cuerpo. También es crucial el consumo  " +
                                                  "\n diario de 1.7 Litros de agua al día (siete vasos de agua de tamaño regular) para mantener una buena hidratación, " +
                                                  "\n fundamental para el funcionamiento óptimo del cuerpo y el proceso de eliminación de toxinas durante el tratamiento." +
                                                  "\n POSIBLE TRATAMIENTO: Para la sífilis en niños, el tratamiento principal y más efectivo es con antibióticos, siendo" +
                                                  "\n la penicilina el medicamento de elección. La dosis y la duración del tratamiento serán determinadas estrictamente " +
                                                  "\n por un médico, y es fundamental completar el ciclo completo para asegurar la erradicación de la infección y prevenir" +
                                                  "\n complicaciones a largo plazo. En casos de alergia a la penicilina, el médico puede considerar otras opciones como  " +
                                                  "\n la ceftriaxona (una marca común es Rocephin). Es vital un seguimiento médico cercano después del tratamiento para  " +
                                                  "\n confirmar la curación. También es recomendable que el niño consuma alimentos que fortalezcan su sistema inmune y   " +
                                                  "\n apoyen la recuperación general, como una amplia variedad de frutas y verduras frescas (por ejemplo, espinacas, brócoli," +
                                                  "\n naranjas y fresas), ricas en Vitamina C y antioxidantes que ayudan a proteger las células del cuerpo y a potenciar las " +
                                                  "\n defensas; proteínas magras (como pollo, pescado y legumbres) que son esenciales para la reparación de tejidos y la   " +
                                                  "\n energía; y granos integrales (como avena y arroz integral), que proveen fibra y energía sostenida. Este es solo un   " +
                                                  "\n Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que" +
                                                  "\n por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida" +
                                                  "\n para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del   " +
                                                  "\n Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a" + 
                                                  "\n la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Pérdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n Es recomendable que el niño realice actividad física moderada y adaptada a su estado de salud y nivel de energía," +
                                                  "\n especialmente durante la fase activa de la enfermedad y el tratamiento, cuando puede experimentar fatiga. Se deben" +
                                                  "\n evitar actividades extenuantes y priorizar el reposo. A medida que su condición mejore, puede retomar gradualmente" + 
                                                  "\n juegos ligeros y paseos cortos, siempre bajo supervisión médica, buscando alcanzar los cerca de 60 minutos de   " +
                                                  "\n actividad moderada diaria para los más grandes. También es crucial el consumo diario de 2 a 2.5 Litros de agua al" + 
                                                  "\n día (ocho a diez vasos de tamaño regular) para mantener una excelente hidratación, lo cual es vital para el  " +
                                                  "\n funcionamiento general del cuerpo, la eliminación de desechos y el apoyo a los órganos que metabolizan los medicamentos" +
                                                  "\n antituberculosos. POSIBLE TRATAMIENTO: Para la tuberculosis en niños, el tratamiento es un régimen prolongado de  " +
                                                  "\n antibióticos antituberculosos, que se administra bajo estricta supervisión médica. Es absolutamente esencial que  " +
                                                  "\n el niño complete el curso completo del tratamiento, que puede durar varios meses, para erradicar la bacteria y prevenir" +
                                                  "\n la aparición de cepas resistentes. Los medicamentos comunes incluyen Isoniazida (una marca común es Laniazid),    " +
                                                  "\n Rifampicina (una marca común es Rifadin), Pirazinamida y Etambutol. La combinación y dosis exactas serán determinadas" +
                                                  "\n por el médico. Es fundamental un seguimiento médico constante. También es recomendable que el niño consuma alimentos " +
                                                  "\n que fortalezcan su sistema inmune y le proporcionen la energía y nutrientes necesarios para combatir la infección y  " +
                                                  "\n apoyar el tratamiento, como proteínas de alto valor biológico (huevo, pollo, pescado, legumbres) que son cruciales   " +
                                                  "\n para la reparación de tejidos y la producción de células inmunes; alimentos ricos en Vitamina A (zanahorias, batatas," +
                                                  "\n espinacas) que juegan un papel fundamental en la integridad de las mucosas respiratorias y la función inmune; alimentos" +
                                                  "\n ricos en Vitamina C (naranjas, kiwis, fresas, brócoli) que son potentes antioxidantes y esenciales para el sistema   " +
                                                  "\n inmunitario; y alimentos ricos en Vitamina D (pescado graso, yemas de huevo, leche fortificada) que se ha demostrado que" +
                                                  "\n tienen un papel en la respuesta inmune contra la TB. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado" +
                                                  "\n no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas," +
                                                  "\n para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado" +
                                                  "\n de su paciente, además por su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho" + 
                                                  "\n consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchazón en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n Es recomendable que el niño realice actividad física suave y de bajo impacto, adaptada a su nivel de dolor y la condición" +
                                                  "\n de sus articulaciones, buscando mantener la flexibilidad y fortalecer los músculos sin sobrecargar las zonas afectadas.  " +
                                                  "\n Actividades como la natación, el ciclismo (con sillín adecuado) o ejercicios de estiramiento suaves pueden ser muy     " +
                                                  "\n beneficiosas, siempre bajo supervisión y previa consulta con el médico o fisioterapeuta. La cantidad de ejercicio debe " +
                                                  "\n ser progresiva y ajustada a sus días buenos y malos, pero se debe fomentar el movimiento regular para evitar la rigidez," +
                                                  "\n idealmente buscando periodos cortos pero frecuentes de actividad a lo largo del día. También es crucial el consumo diario" +
                                                  "\n de 1.7 Litros de agua al día (siete vasos de agua de tamaño regular) para mantener una buena hidratación, lo cual es   " +
                                                  "\n fundamental para la salud general, el funcionamiento óptimo de las articulaciones y el metabolismo de los medicamentos." +
                                                  "\n POSIBLE TRATAMIENTO: Para la artritis en niños, el tratamiento suele incluir; medicamentos antiinflamatorios no esteroideos" +
                                                  "\n (AINEs) para reducir el dolor y la inflamación (como el ibuprofeno, una marca común es Advil o Motrin, o el naproxeno, " +
                                                  "\n una marca común es Aproben), fármacos antirreumáticos modificadores de la enfermedad (FARME) que actúan sobre el sistema" +
                                                  "\n inmune para controlar la progresión de la enfermedad (como el metotrexato, una marca común es Trexall), y en algunos casos," +
                                                  "\n medicamentos biológicos para la artritis juvenil idiopática grave. Es fundamental que estos tratamientos sean prescritos y" +
                                                  "\n supervisados por un reumatólogo pediátatra, quien ajustará las dosis y monitoreará los efectos. También es recomendable que" +
                                                  "\n el niño consuma alimentos que ayuden a reducir la inflamación y fortalezcan su sistema inmune, tales como pescados grasos  " +
                                                  "\n (salmón, sardinas) que son ricos en ácidos grasos Omega-3, potentes antiinflamatorios; una amplia variedad de frutas y     " +
                                                  "\n verduras de colores vivos (como arándanos, espinacas, brócoli y naranjas) que aportan antioxidantes y Vitamina C, esenciales" +
                                                  "\n para proteger las células del daño y apoyar el sistema inmune; alimentos ricos en Vitamina D y calcio (lácteos, huevos,    " +
                                                  "\n cereales fortificados) importantes para la salud ósea, la cual puede verse afectada por la enfermedad o el tratamiento;    " +
                                                  "\n y especias como la cúrcuma y el jengibre, que contienen compuestos con propiedades antiinflamatorias naturales. Este es solo" +
                                                  "\n un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por" +
                                                  "\n ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para   " +
                                                  "\n establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnóstico no" +
                                                  "\n le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida)  " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n Es recomendable que el niño, especialmente durante la fase paroxística de tos severa, limite la actividad física a movimientos" +
                                                  "\n suaves y evite cualquier esfuerzo que pueda desencadenar ataques de tos. El reposo es crucial para su recuperación y para conservar" +
                                                  "\n energía. A medida que mejore, puede retomar gradualmente actividades de bajo impacto, siempre bajo supervisión, buscando alcanzar " +
                                                  "\n los cerca de 60 minutos de actividad moderada diaria para los más grandes. También es crucial el consumo diario de 2 Litros de agua" +
                                                  "\n al día (ocho vasos de tamaño regular), o incluso más si presenta fiebre o dificultad para alimentarse, para mantener una excelente " +
                                                  "\n hidratación y ayudar a fluidificar las secreciones respiratorias, lo cual es vital para su comodidad y recuperación.               " +
                                                  "\n POSIBLE TRATAMIENTO: Para la tosferina en niños, el tratamiento principal es con antibióticos, que son más efectivos cuando se    " +
                                                  "\n administran en las primeras etapas de la enfermedad para acortar la duración de los síntomas y reducir la propagación. Los más    " +
                                                  "\n comunes son los macrólidos, como la azitromicina (una marca común es Zithromax), la eritromicina (una marca común es Pneumo-E o   " +
                                                  "\n Eritrobase) o la claritromicina (una marca común es Klacid). Es fundamental que el niño complete el ciclo completo de antibióticos" + 
                                                  "\n tal como lo indique el médico, incluso si los síntomas mejoran, para erradicar la bacteria. En casos severos o en lactantes, podría" +
                                                  "\n requerirse hospitalización para el monitoreo y manejo de complicaciones. También es recomendable que el niño consuma alimentos que" +
                                                  "\n fortalezcan su sistema inmune y le proporcionen nutrientes que ayuden a su recuperación, especialmente aquellos que son fáciles de" +
                                                  "\n tragar y digestibles debido a los ataques de tos, tales como: Purés de frutas y verduras: como el puré de calabaza, que aporta una" +
                                                  "\n buena cantidad de Vitamina A (alrededor de 369 µg por cada 100 gramos, lo que representa cerca del 74% de la ingesta diaria       " +
                                                  "\n recomendada para un niño de 4-8 años), esencial para la salud de las mucosas respiratorias y la función inmune; o puré de zanahoria," +
                                                  "\n también rica en Vitamina A y antioxidantes. Plátanos: fáciles de comer y ricos en potasio (aproximadamente 358 mg por cada 100 gramos)," +
                                                  "\n un electrolito importante que puede ayudar a reponer las pérdidas debido a la tos y al sudor, además de aportar energía. Sopas y    " +
                                                  "\n caldos suaves: que contribuyen a la hidratación y aportan nutrientes de forma líquida. Frutas suaves ricas en Vitamina C: como las fresas," +
                                                  "\n que contienen cerca de 58.8 mg de Vitamina C por cada 100 gramos (aproximadamente el 65% de la ingesta diaria recomendada para un niño " +
                                                  "\n de 4-8 años), o la guayaba, con niveles aún más altos de esta vitamina, crucial para fortalecer el sistema inmunológico. Este es solo  " +
                                                  "\n un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la  " +
                                                  "\n enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad" +
                                                  "\n en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda  " +
                                                  "\n mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchazón de las glándulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n Es recomendable que el niño, especialmente durante la fase aguda de la enfermedad cuando puede presentar fiebre y malestar, limite la actividad" +
                                                  "\n física a un reposo adecuado, evitando esfuerzos que puedan aumentar el malestar o la hinchazón de las glándulas. A medida que su condición    " +
                                                  "\n mejore y la fiebre ceda, puede retomar gradualmente actividades ligeras y juegos tranquilos, siempre bajo supervisión, buscando alcanzar los  " +
                                                  "\n cerca de 60 minutos de actividad moderada diaria para los más grandes. También es crucial el consumo diario de 2 Litros de agua al día        " +
                                                  "\n (ocho vasos de tamaño regular), o más si tiene fiebre o dificultad para tragar alimentos sólidos, para mantener una excelente hidratación, lo " +
                                                  "\n cual es vital para su bienestar general, para ayudar a reducir la fiebre y para mantener las mucosas hidratadas, aliviando la garganta.       " +
                                                  "\n POSIBLE TRATAMIENTO: Para las paperas en niños, el tratamiento es principalmente de soporte y para aliviar los síntomas, ya que es una infección" +
                                                  "\n viral y no existen medicamentos específicos para erradicar el virus. Se recomienda el reposo en cama, la aplicación de compresas frías o      " +
                                                  "\n calientes en las glándulas inflamadas para aliviar el dolor, y el uso de medicamentos para controlar la fiebre y el dolor, como el paracetamol" +
                                                  "\n (una marca común es Tempra o Tylenol) o el ibuprofeno (una marca común es Advil o Motrin). Es fundamental evitar el uso de aspirina en niños  " +
                                                  "\n debido al riesgo de síndrome de Reye. También es recomendable que el niño consuma alimentos que fortalezcan su sistema inmune y sean fáciles  " +
                                                  "\n de masticar y tragar debido a la hinchazón de las glándulas salivales, tales como purés y alimentos blandos; puede incluir caldos nutritivos  " +
                                                  "\n y sopas suaves que aportan hidratación y energía. En cuanto a las frutas y verduras, las naranjas, por ejemplo, son una fuente excelente de   " +
                                                  "\n Vitamina C (aportando aproximadamente 53.2 mg por cada 100 gramos, lo que representa cerca del 59% de la ingesta diaria recomendada para un   " +
                                                  "\n niño de 4-8 años), esencial para el sistema inmunológico; también las fresas, que contienen alrededor de 58.8 mg de Vitamina C por cada 100   " +
                                                  "\n gramos (aproximadamente el 65% de la ingesta diaria recomendada para la misma edad), y son ricas en antioxidantes que apoyan la recuperación; " +
                                                  "\n el plátano, fácil de digerir y rico en potasio (aproximadamente 358 mg por cada 100 gramos), un electrolito importante que ayuda a reponer    " +
                                                  "\n las pérdidas y aporta energía; y el aguacate, que proporciona grasas saludables y diversas vitaminas (como la E y K) que apoyan la función    " +
                                                  "\n inmunológica y la salud general. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente   " +
                                                  "\n tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de    " +
                                                  "\n Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnostico no le  " +
                                                  "\n satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupción cutánea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n Es recomendable que el niño, durante la fase aguda de la enfermedad cuando puede presentar fiebre," +
                                                  "\n dolor muscular y articular, mantenga un reposo adecuado y evite la actividad física extenuante. A medida que sus síntomas mejoren y bajo   " +
                                                  "\n supervisión, puede retomar gradualmente actividades ligeras y juegos tranquilos, buscando alcanzar los cerca de 60 minutos de actividad    " +
                                                  "\n moderada diaria para los más grandes, priorizando entornos donde se pueda minimizar la exposición a mosquitos. También es crucial el consumo" +
                                                  "\n diario de 2 Litros de agua al día (ocho vasos de tamaño regular), o más si tiene fiebre o vómitos, para mantener una excelente hidratación  " +
                                                  "\n y prevenir la deshidratación, lo cual es vital para el bienestar general y el funcionamiento óptimo de todos sus sistemas corporales durante" +
                                                  "\n la recuperación. POSIBLE TRATAMIENTO: Para el Zika en niños, el tratamiento es principalmente de soporte, ya que no existe un medicamento   " +
                                                  "\n antiviral específico para curar la infección. El manejo se enfoca en aliviar los síntomas, lo que incluye el reposo, una buena hidratación  " +
                                                  "\n y el uso de medicamentos para controlar la fiebre y el dolor, como el paracetamol (una marca común es Tempra o Tylenol). Es fundamental evitar" +
                                                  "\n el uso de aspirina y otros AINEs (antiinflamatorios no esteroideos como el ibuprofeno) hasta que se descarte la posibilidad de dengue, debido " +
                                                  "\n al riesgo de complicaciones hemorrágicas. También es crucial proteger al niño de nuevas picaduras de mosquitos durante la enfermedad para  " +
                                                  "\n evitar la transmisión del virus a otras personas. Además, es recomendable que el niño consuma alimentos que fortalezcan su sistema inmune  " +
                                                  "\n y le proporcionen energía, tales como caldos nutritivos y sopas suaves que facilitan la hidratación y son fáciles de digerir; frutas ricas " +
                                                  "\n en Vitamina C como las naranjas, que aportan aproximadamente 53.2 mg por cada 100 gramos (cerca del 59% de la ingesta diaria recomendada para" +
                                                  "\n un niño de 4-8 años), o el kiwi, que contiene alrededor de 92.7 mg de Vitamina C por cada 100 gramos (aproximadamente el 103% de la ingesta " +
                                                  "\n diaria recomendada para la misma edad), ambos esenciales para reforzar las defensas del cuerpo; el plátano, que es fácil de digerir y rico " +
                                                  "\n en potasio (aproximadamente 358 mg por cada 100 gramos), un electrolito importante que ayuda a reponer las pérdidas por fiebre o sudor; y  " +
                                                  "\n vegetales de hoja verde oscuro como la espinaca, que aportan Vitamina K, Vitamina A y hierro, contribuyendo a la vitalidad y al buen       " +
                                                  "\n funcionamiento general. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga   " +
                                                  "\n esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida" +
                                                  "\n para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnostico no le satisface" +
                                                  "\n del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, Vómitos, Deshidratación, Dolor abdominal.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n Es recomendable que el niño, mientras presente diarrea y vómitos, limite la actividad física a un reposo absoluto o muy suave, " +
                                                  "\n evitando cualquier esfuerzo que pueda empeorar la deshidratación o el malestar gastrointestinal. El objetivo principal es conservar" +
                                                  "\n energía para la recuperación. A medida que los síntomas disminuyan y la hidratación mejore, puede retomar gradualmente juegos tranquilos," +
                                                  "\n siempre bajo supervisión, buscando alcanzar los cerca de 60 minutos de actividad moderada diaria para los más grandes. También es    " + 
                                                  "\n crucial el consumo diario de 2 a 2.5 Litros de agua al día (ocho a diez vasos de tamaño regular) en pequeñas tomas frecuentes,       " +
                                                  "\n preferiblemente mediante soluciones de rehidratación oral (como Electrolit pediátrico o Pedialyte), para reponer los líquidos y      " +
                                                  "\n electrolitos perdidos por la diarrea y el vómito, lo cual es vital para prevenir la deshidratación severa.                           " +
                                                  "\n POSIBLE TRATAMIENTO: Para el rotavirus en niños, el tratamiento es principalmente de soporte y se enfoca en la rehidratación, ya que " +
                                                  "\n no existe un medicamento antiviral específico para el virus. La clave es prevenir y tratar la deshidratación mediante la administración" +
                                                  "\n de líquidos y electrolitos. En casa, se pueden usar soluciones de rehidratación oral (SRO), y en casos de deshidratación severa, puede " +
                                                  "\n ser necesaria la hospitalización para la administración de líquidos por vía intravenosa. Los medicamentos para detener la diarrea no   " +
                                                  "\n suelen ser recomendados en niños con rotavirus. En cuanto a medicamentos para el malestar, el paracetamol (una marca común es Tempra   " +
                                                  "\n o Tylenol) puede usarse para controlar la fiebre y aliviar las molestias, siempre bajo indicación médica. Es fundamental la supervisión" +
                                                  "\n médica. Además, es recomendable que el niño consuma alimentos que sean fáciles de digerir y ayuden a la recuperación de la flora       " +
                                                  "\n intestinal, así como nutrientes que apoyen la función inmune, tales como arroz blanco o avena cocida que aportan energía y son suaves  " +
                                                  "\n para el estómago; caldos de pollo o vegetales desgrasados que contribuyen a la hidratación y reponen algunos electrolitos; el plátano, " +
                                                  "\n fácil de digerir y rico en potasio (aproximadamente 358 mg por cada 100 gramos), un electrolito vital que se pierde con la diarrea y   " +
                                                  "\n el vómito, lo que representa una recuperación importante de lo perdido; y la manzana (sin cáscara y cocida en puré), que contiene pectina," +
                                                  "\n una fibra soluble que puede ayudar a solidificar las heces y es suave para el sistema digestivo del niño. También las verduras cocidas y" +
                                                  "\n en puré, como la zanahoria, que aporta Vitamina A (alrededor de 835 µg por cada 100 gramos, que representa cerca del 167% de la ingesta " +
                                                  "\n diaria recomendada para un niño de 4-8 años), importante para la recuperación de las mucosas intestinales y el fortalecimiento del sistema" +
                                                  "\n inmunológico. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa     " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida" +
                                                  "\n para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnostico no le   " +
                                                  "\n satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, Náuseas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n Es recomendable que el niño, durante la fase aguda de la enfermedad cuando puede presentar fiebre, diarrea o síntomas                          " +
                                                  "\n neurológicos, mantenga un reposo adecuado y evite cualquier actividad física extenuante. El objetivo es preservar la energía                   " +
                                                  "\n y permitir que su cuerpo se recupere. A medida que los síntomas disminuyan y bajo supervisión médica, puede retomar gradualmente               " +
                                                  "\n actividades tranquilas y de bajo impacto, buscando alcanzar los cerca de 60 minutos de actividad moderada diaria para los más                  " +
                                                  "\n grandes. También es crucial el consumo diario de 2 a 2.5 Litros de agua al día (ocho a diez vasos de tamaño regular), especialmente            " +
                                                  "\n si presenta fiebre o diarrea, para mantener una excelente hidratación y reponer los líquidos perdidos, lo cual es vital para el                " +
                                                  "\n bienestar general y el funcionamiento óptimo de sus sistemas corporales mientras combate la infección. POSIBLE TRATAMIENTO: Para la            " +
                                                  "\n listeriosis en niños, el tratamiento principal consiste en la administración de antibióticos, siendo la ampicilina (una marca común            " +
                                                  "\n es Omnipen o Polycillin) o la penicilina (una marca común es Penprocilina o Bencilpenicilina Sódica) los más comúnmente utilizados,            " +
                                                  "\n a menudo en combinación con otros antibióticos como la gentamicina. La elección, dosis y duración del tratamiento deben ser                    " +
                                                  "\n estrictamente determinadas por un médico, y es fundamental completar el ciclo completo de antibióticos para erradicar la bacteria              " +
                                                  "\n y prevenir complicaciones serias, como la meningitis. En casos graves, puede requerirse hospitalización para la administración                 " +
                                                  "\n intravenosa de medicamentos y monitoreo. Además, es recomendable que el niño consuma alimentos que refuercen su sistema inmune                 " +
                                                  "\n y apoyen su recuperación general, priorizando aquellos que son fáciles de digerir si presenta síntomas gastrointestinales. Estos               " +
                                                  "\n incluyen proteínas magras como el pollo cocido o el pescado (si su digestión lo permite), que aportan aminoácidos esenciales para la           " +
                                                  "\n reparación de tejidos y la producción de células inmunes; caldos y sopas nutritivas que contribuyen a la hidratación y al aporte de            " +
                                                  "\n electrolitos. También son beneficiosas frutas ricas en Vitamina C como las fresas, que contienen aproximadamente 58.8 mg por cada 100          " +
                                                  "\n gramos (cerca del 65% de la ingesta diaria recomendada para un niño de 4-8 años), o los kiwis, que ofrecen alrededor de 92.7 mg de             " +
                                                  "\n Vitamina C por cada 100 gramos (aproximadamente el 103% de la ingesta diaria recomendada para la misma edad), ambos potentes                   " +
                                                  "\n antioxidantes que fortalecen las defensas del cuerpo. Las verduras cocidas en puré, como la zanahoria, que aporta una buena cantidad           " +
                                                  "\n de Vitamina A (alrededor de 835 µg por cada 100 gramos, lo que representa cerca del 167% de la ingesta diaria recomendada para un niño         " +
                                                  "\n de 4-8 años), también son cruciales para la integridad de las mucosas y la función inmunitaria. Este es solo un Diagnóstico predeterminado     " +
                                                  "\n lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén       " +
                                                  "\n correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de        " +
                                                  "\n su paciente, además por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su médico,        " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, Vómitos.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n Es recomendable que el niño, durante la fase aguda de la enfermedad cuando presenta diarrea severa, dolor abdominal y fiebre, mantenga un reposo estricto, " +
                                                  "\n evitando cualquier actividad física que pueda agravar la deshidratación o el malestar gastrointestinal. La prioridad es la conservación de energía. A medida" +
                                                  "\n que los síntomas disminuyan y la rehidratación sea efectiva, puede retomar gradualmente juegos tranquilos y actividades de bajo impacto, siempre bajo     " +
                                                  "\n supervisión, buscando alcanzar los cerca de 60 minutos de actividad moderada diaria para los más grandes. También es crucial el consumo diario de 2 a     " +
                                                  "\n 2.5 Litros de agua al día (ocho a diez vasos de tamaño regular) en pequeñas y frecuentes tomas, preferiblemente soluciones de rehidratación oral         " +
                                                  "\n (como Electrolit pediátrico o Pedialyte), para reponer los líquidos y electrolitos perdidos por la diarrea y el vómito, lo cual es vital para prevenir    " +
                                                  "\n la deshidratación severa y apoyar la función renal durante la infección. POSIBLE TRATAMIENTO: Para la shigelosis en niños, el tratamiento principal es    " +
                                                  "\n con antibióticos, ya que la shigelosis es una infección bacteriana que puede ser grave. Los antibióticos más comunes para esta condición incluyen la      " +
                                                  "\n azitromicina (una marca común es Zithromax), o las cefalosporinas de tercera generación como la ceftriaxona (una marca común es Rocephin), dependiendo de " + 
                                                  "\n la resistencia bacteriana local. Es fundamental que el niño complete el ciclo completo de antibióticos tal como lo indique el médico, incluso si los síntomas" + 
                                                  "\n mejoran, para erradicar la bacteria y evitar la propagación. Además del tratamiento antibiótico, el manejo de la deshidratación mediante soluciones de     " +
                                                  "\n rehidratación oral es esencial. Los medicamentos para frenar la diarrea generalmente no se recomiendan. Es importante también que el niño consuma alimentos" +
                                                  "\n que sean fáciles de digerir, suaves para el sistema gastrointestinal y que aporten nutrientes para fortalecer su sistema inmune, como arroz blanco o avena" +
                                                  "\n cocida, que son fuente de energía y suaves para el estómago; caldos de pollo o vegetales desgrasados que contribuyen a la hidratación y a la reposición de " +
                                                  "\n electrolitos; el plátano, muy beneficioso por su contenido de potasio (aproximadamente 358 mg por cada 100 gramos), un electrolito clave que se pierde en " +
                                                  "\n grandes cantidades con la diarrea, ayudando a normalizar los niveles y aportar energía de fácil absorción. También se recomienda el puré de manzana      " +
                                                  "\n (sin cáscara), que contiene pectina, una fibra soluble que puede ayudar a reducir la diarrea. Otro alimento valioso es la zanahoria cocida y en puré, la " +
                                                  "\n cual es una excelente fuente de Vitamina A (alrededor de 835 µg por cada 100 gramos, lo que representa cerca del 167% de la ingesta diaria recomendada para" +
                                                  "\n un niño de 4-8 años), crucial para la recuperación de las mucosas intestinales dañadas por la infección y para fortalecer la respuesta inmunitaria. Este es" +
                                                  "\n solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus " +
                                                  "\n respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su" +
                                                  "\n paciente, además por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece" +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos crónica, Producción excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad Pulmonar Obstructiva Crónica (EPOC)." +
                                                  "\n Es recomendable que el niño realice ejercicios de respiración y actividades físicas de bajo impacto adaptadas a su capacidad pulmonar y estado general," +
                                                  "\n bajo supervisión médica. Se deben evitar ambientes con humo o contaminantes, y priorizar actividades que no causen dificultad respiratoria excesiva.   " +
                                                  "\n Caminatas cortas, juegos tranquilos o ejercicios de brazos pueden ser beneficiosos, buscando mantener la movilidad y la fuerza muscular sin agotar al niño," +
                                                  "\n con el objetivo de alcanzar los cerca de 60 minutos de actividad moderada diaria para los más grandes, pero siempre con periodos de descanso.          " +
                                                  "\n También es crucial el consumo diario de 2 Litros de agua al día (ocho vasos de tamaño regular) para mantener las secreciones pulmonares más fluidas y  " +
                                                  "\n facilitar su expectoración, lo cual es vital para una mejor respiración y para prevenir infecciones. POSIBLE TRATAMIENTO: Para la EPOC en niños        " +
                                                  "\n (que es rara y a menudo asociada a condiciones congénitas, exposiciones ambientales severas tempranas o infecciones recurrentes), el tratamiento se enfoca" +
                                                  "\n en manejar los síntomas, prevenir exacerbaciones y mejorar la función pulmonar. Esto incluye el uso de broncodilatadores (como el salbutamol, una marca" +
                                                  "\n común es Ventolin o Aerolin, para abrir las vías respiratorias), corticosteroides inhalados (como la fluticasona, una marca común es Flixotide, para reducir" +
                                                  "\n la inflamación), y en algunos casos, oxigenoterapia si hay bajos niveles de oxígeno. La terapia respiratoria y la fisioterapia pulmonar son fundamentales." +
                                                  "\n Es esencial la eliminación de la exposición a irritantes pulmonares, como el humo de tabaco. Además, es recomendable que el niño consuma alimentos que    " +
                                                  "\n fortalezcan su sistema inmune y le proporcionen energía de manera sostenible, priorizando aquellos que no causen distensión abdominal que pueda dificultar" +
                                                  "\n la respiración. Estos incluyen proteínas magras como el pollo o el pescado, que aportan aminoácidos esenciales para la reparación de tejidos y el      " +
                                                  "\n mantenimiento de la masa muscular, crucial en pacientes con EPOC; carbohidratos complejos de liberación lenta como la avena o el arroz integral, que   " +
                                                  "\n proporcionan energía sin picos glucémicos; y una variedad de verduras de hoja verde oscuro como la espinaca, que es rica en Vitamina K, Vitamina A y   " +
                                                  "\n antioxidantes que pueden ayudar a reducir la inflamación pulmonar, y el brócoli, que aporta Vitamina C (alrededor de 89.2 mg por cada 100 gramos, lo que" +
                                                  "\n representa cerca del 99% de la ingesta diaria recomendada para un niño de 4-8 años), esencial para la función inmunológica y como antioxidante. También" + 
                                                  "\n se beneficia de frutas como las manzanas, que contienen quercetina, un flavonoide con propiedades antiinflamatorias que pueden ser útiles para la salud" +
                                                  "\n pulmonar. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello" +
                                                  "\n la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el   " +
                                                  "\n tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su" + 
                                                  "\n médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreción anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n Es recomendable que el niño, mientras recibe tratamiento, mantenga una actividad física normal adaptada a su estado de                 " +
                                                  "\n salud, evitando cualquier molestia o irritación en el área afectada si presenta síntomas. La Clamidia no suele afectar                 " +
                                                  "\n directamente la capacidad física a largo plazo. Una vez que el tratamiento sea efectivo y los síntomas hayan desaparecido,             " +
                                                  "\n puede seguir con la actividad física recomendada para su edad, buscando idealmente cerca de 60 minutos de actividad moderada           " +
                                                  "\n a intensa diaria para los más grandes. También es crucial el consumo diario de 1.7 Litros de agua al día (siete vasos de tamaño        " +
                                                  "\n regular) para mantener una buena hidratación, lo cual es fundamental para el bienestar general, el funcionamiento óptimo de            " +
                                                  "\n sus sistemas corporales y para apoyar la eliminación de los medicamentos del organismo. POSIBLE TRATAMIENTO: Para la clamidia en       " +
                                                  "\n niños, el tratamiento principal es con antibióticos, los cuales son muy efectivos para erradicar la infección. La elección y la        " +
                                                  "\n dosis del antibiótico serán determinadas estrictamente por un médico, quien considerará la edad y el peso del niño. Es fundamental     " +
                                                  "\n completar el ciclo completo de antibióticos tal como se indique, incluso si los síntomas mejoran, para asegurar la eliminación         " +
                                                  "\n total de la bacteria y prevenir reinfecciones o complicaciones. Los antibióticos comúnmente usados incluyen la azitromicina (una       " +
                                                  "\n marca común es Zithromax) o la eritromicina (una marca común es Pneumo-E o Eritrobase). Es importante recordar que la clamidia en      " +
                                                  "\n niños puede requerir una evaluación médica inmediata, ya que en algunos casos puede ser indicativa de abuso. Además, es recomendable   " +
                                                  "\n que el niño consuma alimentos que fortalezcan su sistema inmune y apoyen la recuperación general, como fuentes de probióticos (si      " +
                                                  "\n son tolerados, como yogur natural si no hay contraindicaciones), que pueden ayudar a mantener un equilibrio saludable de la flora      " +
                                                  "\n intestinal, especialmente después de la administración de antibióticos. También son muy beneficiosas las frutas cítricas como las      " +
                                                  "\n naranjas, que aportan una cantidad significativa de Vitamina C (alrededor de 53.2 mg por cada 100 gramos, lo que representa cerca      " +
                                                  "\n del 59% de la ingesta diaria recomendada para un niño de 4-8 años), crucial para reforzar las defensas del cuerpo. Las verduras de     " +
                                                  "\n hoja verde oscuro como el brócoli o la espinaca, ricas en Vitamina K, Vitamina A y antioxidantes, también contribuyen a la vitalidad   " +
                                                  "\n y al buen funcionamiento general del sistema inmune, favoreciendo la recuperación. Este es solo un Diagnóstico predeterminado lógico,  " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén       " +
                                                  "\n correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado   " +
                                                  "\n de su paciente, además por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su     " +
                                                  "\n médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Náuseas, Dolor de cabeza severo, Rigidez en el cuello, Confusión.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n Es recomendable que el niño, durante la fase aguda de la enfermedad, mantenga un reposo estricto en cama, ya que la                       " +
                                                  "\n meningitis es una condición grave que requiere mínima estimulación y máxima conservación de energía para la recuperación                  " +
                                                  "\n cerebral y general del cuerpo. Cualquier actividad física debe ser evitada por completo en este periodo. Una vez que la                   " +
                                                  "\n fase aguda haya pasado y bajo estricta supervisión médica, la rehabilitación o la reintroducción gradual de movimientos                   " +
                                                  "\n muy suaves solo se realizará si no hay secuelas. También es crucial el consumo diario de 2 a 2.5 Litros de agua al día                    " +
                                                  "\n (ocho a diez vasos de tamaño regular) en tomas pequeñas y frecuentes, preferiblemente por vía intravenosa si el niño no                   " +
                                                  "\n puede beber, para mantener una hidratación óptima y asegurar el correcto funcionamiento de los órganos, especialmente los                 " +
                                                  "\n riñones, que procesarán los medicamentos, y para ayudar a controlar la fiebre. POSIBLE TRATAMIENTO: Para la meningitis                    " +
                                                  "\n bacteriana en niños, el tratamiento es una emergencia médica y consiste en la administración inmediata de antibióticos                    " +
                                                  "\n intravenosos de amplio espectro para combatir la infección. La elección del antibiótico dependerá de la edad del niño, el                 " + 
                                                  "\n tipo de bacteria sospechada y los patrones de resistencia locales, y será determinada por un médico especialista. Es vital                " +
                                                  "\n que el tratamiento antibiótico se inicie lo antes posible y se complete en su totalidad para prevenir complicaciones graves               " +
                                                  "\n como daño cerebral, pérdida de audición o incluso la muerte. Algunos antibióticos comunes incluyen la ceftriaxona (una marca              " +
                                                  "\n común es Rocephin) o la ampicilina (una marca común es Omnipen o Polycillin), a veces combinados con vancomicina (una marca               " +
                                                  "\n común es Vancocin). Además de los antibióticos, se pueden usar corticosteroides (como la dexametasona, una marca común es                 " +
                                                  "\n Decadron) para reducir la inflamación cerebral y prevenir secuelas neurológicas, siempre bajo indicación médica. Es fundamental           " +
                                                  "\n el monitoreo constante en un entorno hospitalario. En cuanto a la alimentación, una vez que el niño pueda tolerar la vía oral,            " +
                                                  "\n es recomendable que consuma alimentos que sean fáciles de digerir y nutritivos para apoyar la recuperación del sistema nervioso           " +
                                                  "\n y el fortalecimiento del sistema inmune. Esto incluye caldos y sopas suaves que aportan líquidos y electrolitos; purés de                 " +
                                                  "\n verduras como la zanahoria, rica en Vitamina A (aproximadamente 835 µg por cada 100 gramos, lo que representa cerca del 167% de           " +
                                                  "\n la ingesta diaria recomendada para un niño de 4-8 años), esencial para la recuperación de las mucosas y la visión; y frutas               " +
                                                  "\n blandas como el plátano, que aporta potasio (aproximadamente 358 mg por cada 100 gramos), un electrolito vital para la función            " +
                                                  "\n nerviosa y muscular. También son beneficiosos los alimentos ricos en antioxidantes como el aguacate, que provee grasas saludables         " +
                                                  "\n y Vitamina E, que pueden proteger las células neuronales del daño oxidativo. Este es solo un Diagnóstico predeterminado lógico,           " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén          " +
                                                  "\n correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento               " +
                                                  "\n adecuado de su paciente, además por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho              " +
                                                  "\n consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, Pérdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, Pérdida de apetito.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Cáncer." +
                                                  "\n Es recomendable que el niño, cuya actividad física debe ser siempre supervisada y adaptada a su estado de salud, energía y fase del tratamiento oncológico, mantenga" +
                                                  "\n periodos de descanso adecuados y evite cualquier actividad extenuante o que pueda comprometer su sistema inmune. Se deben priorizar actividades de bajo impacto que " +
                                                  "\n fomenten la movilidad y el bienestar, como caminatas cortas y suaves, juegos tranquilos o ejercicios de estiramiento muy ligeros, siempre que el médico lo autorice y" +
                                                  "\n según su tolerancia. El objetivo es mantener la fuerza muscular y mejorar la calidad de vida sin sobrecargar su cuerpo, buscando alcanzar los cerca de 60 minutos de " +
                                                  "\n actividad moderada diaria para los más grandes, pero con flexibilidad y respetando sus límites. También es crucial el consumo diario de 1.7 a 2 Litros de agua al día" +
                                                  "\n (siete a ocho vasos de tamaño regular), o más si tiene fiebre, vómitos o diarrea como efectos secundarios del tratamiento, para mantener una excelente hidratación,  " +
                                                  "\n lo cual es vital para el funcionamiento óptimo de sus órganos, la eliminación de toxinas y el apoyo al metabolismo de los medicamentos. POSIBLE TRATAMIENTO: Para el " +
                                                  "\n cáncer en niños, el tratamiento es altamente individualizado y complejo, dependiendo del tipo específico de cáncer, su etapa y la salud general del niño. Generalmente," +
                                                  "\n implica una combinación de quimioterapia (medicamentos que matan las células cancerosas, como la vincristina, una marca común es Oncovin, o el ciclofosfamida, una   " +
                                                  "\n marca común es Cytoxan), radioterapia (uso de radiación para destruir células cancerosas), cirugía (para extirpar tumores), e incluso inmunoterapia o terapia dirigida." +
                                                  "\n Es fundamental que el tratamiento sea manejado por un equipo multidisciplinario de oncólogos pediátricos. Además del tratamiento oncológico, se utilizan medicamentos  " +
                                                  "\n de soporte para manejar los efectos secundarios, como antieméticos para las náuseas (como el ondansetrón, una marca común es Zofran), analgésicos para el dolor      " +
                                                  "\n (como el paracetamol, una marca común es Tempra o Tylenol), y factores estimulantes de colonias para apoyar la médula ósea. En cuanto a la alimentación, es         " +
                                                  "\n recomendable que el niño consuma alimentos que fortalezcan su sistema inmune, le proporcionen energía y le ayuden a tolerar mejor el tratamiento, priorizando aquellos" +
                                                  "\n que sean nutritivos y de fácil digestión. Esto incluye proteínas de alto valor biológico como el pollo, el pescado y los huevos, que son esenciales para la reparación" +
                                                  "\n celular y el mantenimiento de la masa muscular, crucial durante y después de la quimioterapia. Las verduras de hoja verde oscuro como la espinaca y el brócoli aportan" +
                                                  "\n Vitamina K, Vitamina C (el brócoli contiene cerca de 89.2 mg por cada 100 gramos, que representa aproximadamente el 99% de la ingesta diaria recomendada para un niño " +
                                                  "\n de 4-8 años) y antioxidantes, que apoyan la función inmune y reducen el estrés oxidativo. Las frutas de colores vivos como los arándanos y las uvas son ricas en      " +
                                                  "\n antioxidantes (como antocianinas y resveratrol en el caso de las uvas) que pueden proteger las células y reducir la inflamación. El aguacate proporciona grasas       " +
                                                  "\n saludables y Vitamina E, importantes para la energía y la salud general. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que" +
                                                  "\n el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para  " +
                                                  "\n establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda  " +
                                                  "\n mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            } 
                        }
                        if(EstaturaMasculino.equals("1.45-1.70 m")){
                          if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n Es recomendable que el niño, con una estatura de 1.45-1.70 m, realice cerca de 60 minutos de actividad física moderada a intensa diaria, incluyendo juegos activos" +
                                                  "\n o deportes, siempre adaptando la intensidad a su estado de salud general durante el periodo de enfermedad. Esto es crucial para mantener un sistema inmune fuerte." +
                                                  "\n También es recomendable el consumo diario de 2.5 a 3 Litros de agua al día (diez a doce vasos de tamaño regular) para mantener una excelente hidratación, lo cual " +
                                                  "\n ayuda a fluidificar las secreciones respiratorias y a controlar la fiebre. POSIBLE TRATAMIENTO: Para la gripe en niños de esta edad, el tratamiento suele incluir;" +
                                                  "\n medicamentos para reducir la fiebre y aliviar los síntomas, como el paracetamol (una marca común es Tempra o Tylenol) o el ibuprofeno (una marca común es Advil   " +
                                                  "\n o Motrin). En algunos casos, si se diagnostica a tiempo (dentro de las primeras 48 horas de los síntomas), el médico puede prescribir antivirales específicos contra" +
                                                  "\n la gripe como el oseltamivir (una marca común es Tamiflu). Es fundamental seguir las indicaciones del médico al pie de la letra. También es recomendable que el niño" +
                                                  "\n consuma alimentos que fortalezcan su sistema inmune y aporten nutrientes para la recuperación, tales como frutas ricas en Vitamina C como las guayabas, que contienen" +
                                                  "\n una cantidad muy alta de esta vitamina (alrededor de 228.3 mg por cada 100 gramos, lo que representa cerca del 254% de la ingesta diaria recomendada para un niño  " +
                                                  "\n de 4-8 años), o las naranjas, que aportan aproximadamente 53.2 mg por cada 100 gramos (cerca del 59% de la ingesta diaria recomendada para la misma edad), ambos   " +
                                                  "\n potentes antioxidantes que apoyan las defensas del cuerpo. También son beneficiosos los vegetales de hoja verde oscuro como la espinaca, que provee Vitamina A y   " +
                                                  "\n Vitamina K, importantes para la salud de las mucosas y la función inmune; y el jengibre, que puede consumirse en infusiones y posee propiedades antiinflamatorias  " +
                                                  "\n que pueden ayudar a aliviar el malestar. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa    " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor   " +
                                                  "\n seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar" +
                                                  "\n a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                               textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumonía." +
                                                  "\n Es recomendable que el niño, con una estatura de 1.45-1.70 m, realice actividad física moderada según su capacidad y estado de recuperación, siempre supervisada" +
                                                  "\n y evitando esfuerzos excesivos o juegos que agiten demasiado sus vías respiratorias, especialmente si aún presenta síntomas. Una vez que su condición mejore,   " +
                                                  "\n puede retomar gradualmente actividades como caminatas al aire libre o juegos tranquilos, buscando cerca de 60 minutos de actividad física moderada a intensa diaria." +
                                                  "\n También es crucial el consumo diario de 2.5 a 3 Litros de agua al día (diez a doce vasos de tamaño regular), especialmente si tiene fiebre, para ayudar a fluidificar" +
                                                  "\n las secreciones pulmonares y prevenir la deshidratación, facilitando su expectoración. POSIBLE TRATAMIENTO: Para la neumonía en niños de esta edad, el tratamiento  " +
                                                  "\n suele incluir; antibióticos (si la causa es bacteriana, como la amoxicilina, una marca común es Amoxil o Clamoxil, o la azitromicina, una marca común es Zithromax, " +
                                                  "\n siempre bajo prescripción médica estricta), medicamentos para reducir la fiebre y aliviar el dolor (como el paracetamol, una marca común es Tempra o Tylenol, o el  " +
                                                  "\n ibuprofeno, una marca común es Advil o Motrin), y en algunos casos, oxigenoterapia si la saturación de oxígeno es baja. Es fundamental seguir las indicaciones del  " +
                                                  "\n médico al pie de la letra y completar el ciclo de antibióticos aunque el niño parezca mejor. También es recomendable que el niño consuma alimentos que fortalezcan su" +
                                                  "\n sistema inmune y le aporten energía, tales como caldos nutritivos y sopas suaves que, además de ser fáciles de digerir, contribuyen a la hidratación y al aporte de " +
                                                  "\n electrolitos. Las verduras de hoja verde oscuro como la espinaca, rica en Vitamina A y Vitamina K, o el brócoli, que aporta Vitamina C (alrededor de 89.2 mg por cada" +
                                                  "\n 100 gramos, lo que representa cerca del 99% de la ingesta diaria recomendada para un niño de 4-8 años), son excelentes fuentes de antioxidantes que apoyan la salud " +
                                                  "\n pulmonar. Las frutas como las naranjas, que contienen alrededor de 53.2 mg de Vitamina C por cada 100 gramos (cerca del 59% de la ingesta diaria recomendada para la" +
                                                  "\n misma edad), y los kiwis, que ofrecen aproximadamente 92.7 mg de Vitamina C por cada 100 gramos (alrededor del 103% de la ingesta diaria recomendada para la misma edad)," +
                                                  "\n son cruciales para reforzar el sistema inmunológico. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente     " +
                                                  "\n tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer  " +
                                                  "\n mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar" +
                                                  "\n a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores."); 
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visión borrosa, Pérdida de peso.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n Es recomendable que el niño, con una estatura de 1.45-1.70 m, realice cerca de 60 minutos de actividad física moderada a intensa diaria, como juegos activos," +
                                                  "\n deportes o paseos en bicicleta, adaptándose siempre a su estado de salud y bajo supervisión. Esta actividad es crucial para el control del azúcar en sangre, " +
                                                  "\n mejorar la sensibilidad a la insulina y mantener un peso saludable, fundamentales en el manejo de la diabetes. También es fundamental el consumo diario de 2.5" +
                                                  "\n a 3 Litros de agua al día (diez a doce vasos de tamaño regular), priorizando el agua natural sobre bebidas azucaradas, para mantener una hidratación adecuada" +
                                                  "\n y ayudar a los riñones a procesar el exceso de glucosa. POSIBLE TRATAMIENTO: Para la diabetes en niños de esta edad, el tratamiento suele incluir; manejo de " +
                                                  "\n la insulina (en caso de diabetes tipo 1, se requiere insulina inyectada para controlar los niveles de glucosa, por ejemplo, insulina glargina, una marca común" +
                                                  "\n es Lantus, o insulina aspart, una marca común es Novolog), medicamentos orales (para diabetes tipo 2, como la metformina, una marca común es Glucophage o   " +
                                                  "\n Dianben, siempre bajo prescripción médica), y un monitoreo constante de los niveles de glucosa en sangre con un glucómetro. Es vital seguir un plan de      " +
                                                  "\n alimentación saludable y equilibrado, así como un control médico regular con un endocrinólogo pediátrico. También es recomendable que el niño consuma alimentos" +
                                                  "\n que ayuden a la regulación del azúcar y fortalezcan su sistema inmune, tales como verduras no almidonadas como el brócoli, rico en fibra y Vitamina C       " +
                                                  "\n (aproximadamente 89.2 mg por cada 100 gramos, lo que representa cerca del 99% de la ingesta diaria recomendada para un niño de 4-8 años), o la espinaca, que" +
                                                  "\n aporta Magnesio y Vitamina K, nutrientes importantes para el metabolismo de la glucosa. Frutas con moderación como las manzanas y las peras, que son ricas en" +
                                                  "\n fibra (aproximadamente 2.4 gramos de fibra por cada 100 gramos en una manzana con cáscara) y antioxidantes, contribuyen a una liberación más lenta de azúcares" +
                                                  "\n en la sangre. Las bayas (fresas, arándanos) son también excelentes por su bajo índice glucémico y alto contenido de antioxidantes. Las proteínas magras como el" +
                                                  "\n pollo, el pescado y las legumbres (lentejas, frijoles) son importantes para mantener la saciedad y el control glucémico. Los granos integrales como la avena y el" +
                                                  "\n pan integral proporcionan fibra y energía sostenida, ayudando a evitar picos de azúcar en sangre. Este es solo un Diagnóstico predeterminado lógico, haberlo    " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer" +
                                                  "\n más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnostico " +
                                                  "\n no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresión en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n Es recomendable que el niño, con una estatura de 1.45-1.70 m, realice actividad física de forma controlada y supervisada, con calentamiento previo y enfriamiento" +
                                                  "\n posterior, evitando desencadenantes conocidos del asma (como alérgenos, aire frío o contaminado, o actividad física muy intensa sin preparación) y haciendo pausas" +
                                                  "\n si presenta síntomas. La cantidad de ejercicio debe ser adaptada a su capacidad y a la presencia de síntomas, pudiendo ser periodos de 30 a 60 minutos de actividad" +
                                                  "\n moderada en los días que se encuentre bien, pero siempre consultando al médico para un plan seguro y ajustado. También es crucial el consumo diario de 2 a 2.5 Litros" +
                                                  "\n de agua al día (ocho a diez vasos de tamaño regular) para ayudar a mantener las vías respiratorias hidratadas y las secreciones más fluidas, lo que facilita la     " +
                                                  "\n respiración y puede prevenir el estrechamiento de los bronquios. POSIBLE TRATAMIENTO: Para el asma en niños de esta edad, el tratamiento suele incluir; broncodilatadores" +
                                                  "\n de alivio rápido (para abrir las vías respiratorias durante un ataque, como el salbutamol, una marca común es Ventolin o Aerolin), corticosteroides inhalados       " +
                                                  "\n (para el control a largo plazo y reducir la inflamación crónica de las vías respiratorias, como la fluticasona, una marca común es Flixotide, o la budesonida, una marca" +
                                                  "\n común es Pulmicort), y en algunos casos, modificadores de leucotrienos (como el montelukast, una marca común es Singulair), que ayudan a controlar la inflamación y   " +
                                                  "\n los síntomas. Es fundamental seguir estrictamente el plan de acción para el asma indicado por el médico, usar los medicamentos preventivos regularmente y acudir a    " +
                                                  "\n revisiones periódicas. También es recomendable que el niño consuma alimentos que puedan ayudar a reducir la inflamación y fortalecer el sistema inmune, tales como    " +
                                                  "\n pescados grasos (salmón, atún), ricos en ácidos grasos Omega-3, que poseen propiedades antiinflamatorias que pueden ser beneficiosas para las vías respiratorias.     " +
                                                  "\n Una amplia variedad de frutas y verduras de colores vivos, como los arándanos, con su alto contenido de antioxidantes que protegen las células; las espinacas, que    " +
                                                  "\n aportan Magnesio, un mineral que puede ayudar a relajar los músculos bronquiales, y Vitamina K; y el brócoli, que ofrece una gran cantidad de Vitamina C (alrededor   " +
                                                  "\n de 89.2 mg por cada 100 gramos, lo que representa cerca del 99% de la ingesta diaria recomendada para un niño de 4-8 años), esencial para la función inmunológica.    " +
                                                  "\n También se beneficia de manzanas, que contienen quercetina, un flavonoide con propiedades antiinflamatorias que puede ser útil para la salud pulmonar. Este es solo   " +
                                                  "\n un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén" +
                                                  "\n correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud" +
                                                  "\n si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida)   " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, Pérdida de peso, Ganglios linfáticos inflamados, Erupción cutánea (Diarrea).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n Es recomendable que el niño, con una estatura de 1.45-1.70 m, realice actividad física moderada y adaptada a su estado de salud, bajo supervisión médica para evitar el" +
                                                  "\n agotamiento y proteger su sistema inmune, y siempre evitando deportes de contacto o actividades con alto riesgo de lesiones si su sistema inmune está comprometido.    " +
                                                  "\n La actividad debe ser gradual, buscando idealmente periodos de 30 a 60 minutos de actividad moderada en los días que se encuentre bien, adaptándose a su energía y     " +
                                                  "\n tolerando periodos de descanso. También es crucial el consumo diario de 2.5 a 3 Litros de agua al día (diez a doce vasos de tamaño regular) para mantener una buena    " +
                                                  "\n hidratación, fundamental para el bienestar general, el funcionamiento del cuerpo y el metabolismo de los medicamentos antirretrovirales. POSIBLE TRATAMIENTO: Para el  " +
                                                  "\n VIH/SIDA en niños de esta edad, el tratamiento principal es la terapia antirretroviral (TARV), que incluye una combinación de medicamentos que trabajan para controlar " +
                                                  "\n la replicación del virus, mejorar la función inmunológica y prevenir el desarrollo de infecciones oportunistas. Estos medicamentos se eligen y ajustan específicamente " +
                                                  "\n por un médico especialista en VIH pediátrico, y es vital la adherencia estricta al régimen. Algunos ejemplos de medicamentos usados en TARV incluyen inhibidores de la " +
                                                  "\n transcriptasa inversa análogos de nucleósidos (como Zidovudina, o Retrovir), inhibidores de la transcriptasa inversa no análogos de nucleósidos (como Efavirenz,       " +
                                                  "\n o Sustiva), e inhibidores de la proteasa (como Lopinavir/Ritonavir, o Kaletra). El tratamiento también incluye el manejo y prevención de infecciones oportunistas con  " +
                                                  "\n antibióticos profilácticos (como el trimetoprim/sulfametoxazol, o Bactrim) para proteger contra ciertas infecciones. Es fundamental el seguimiento médico constante.   " +
                                                  "\n También es recomendable que el niño consuma alimentos que refuercen el sistema inmune, proporcionen energía y ayuden a mantener un peso saludable, tales como proteínas" +
                                                  "\n de alto valor biológico (pollo, pescado, huevos, legumbres) que son cruciales para la reparación de tejidos y la función inmune; lácteos y alternativas enriquecidas con" +
                                                  "\n calcio y vitamina D para la salud ósea, la cual puede verse afectada por el virus o algunos tratamientos. Una amplia variedad de frutas y verduras de colores vivos, como" +
                                                  "\n los arándanos, ricos en antioxidantes que protegen las células; las naranjas, que aportan una cantidad significativa de Vitamina C (alrededor de 53.2 mg por cada      " +
                                                  "\n 100 gramos, lo que representa cerca del 59% de la ingesta diaria recomendada para un niño de 4-8 años), esencial para el sistema inmunitario; y las espinacas, que     " +
                                                  "\n contienen hierro y Vitamina A, importantes para la producción de células sanguíneas y la función inmune, son igualmente beneficiosas. Además, los granos integrales como" +
                                                  "\n la avena y el arroz integral, que proveen fibra y energía sostenida, son importantes para una nutrición adecuada. Este es solo un Diagnóstico predeterminado lógico,   " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer" +
                                                  "\n más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnostico no le   " +
                                                  "\n satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreción anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n Es recomendable que el niño, con una estatura de 1.45-1.70 m, realice actividad física moderada y adaptada a su estado de salud, sin forzar su cuerpo. Dado que la gonorrea" +
                                                  "\n no suele afectar directamente la capacidad física a largo plazo (una vez tratada), en cuanto se sienta mejor y el médico lo autorice, puede buscar idealmente periodos de  " +
                                                  "\n 30 a 60 minutos de actividad moderada a intensa diaria. Durante la infección y el tratamiento, la actividad puede ser más ligera, como paseos cortos. También es crucial   " +
                                                  "\n el consumo diario de 2.5 a 3 Litros de agua al día (diez a doce vasos de tamaño regular) para mantener una buena hidratación, fundamental para apoyar el proceso de        " +
                                                  "\n recuperación del cuerpo y el funcionamiento adecuado de los riñones, que procesarán los medicamentos. POSIBLE TRATAMIENTO: Para la gonorrea en niños de esta edad, el      " +
                                                  "\n tratamiento es estrictamente con antibióticos, siempre bajo la supervisión y prescripción de un médico. La elección y dosis del antibiótico dependerán de la edad, peso y  " +
                                                  "\n la cepa específica de la bacteria. Es vital que se complete el ciclo de antibióticos tal como lo indique el profesional de la salud para asegurar la erradicación total de " +
                                                  "\n la infección y prevenir complicaciones. Ejemplos de antibióticos utilizados incluyen ceftriaxona (una marca común es Rocephin) administrada por inyección, o azitromicina  " +
                                                  "\n (una marca común es Zithromax) administrada oralmente. Es importante recordar que la gonorrea en niños requiere una evaluación médica inmediata, ya que puede tener        " +
                                                  "\n implicaciones serias y, en algunos casos, puede ser indicativa de abuso. También es recomendable que el niño consuma alimentos que fortalezcan su sistema inmune y         " +
                                                  "\n contribuyan a su recuperación general, como una amplia variedad de frutas y verduras frescas; por ejemplo, el mango, que aporta Vitamina C (aproximadamente 36.4 mg por cada" +
                                                  "\n 100 gramos, lo que representa cerca del 40% de la ingesta diaria recomendada para un niño de 4-8 años) y Vitamina A, esenciales para la función inmunológica; o las espinacas," +
                                                  "\n que proveen Vitamina K, Vitamina A y antioxidantes, que apoyan la salud general. Las proteínas magras como el pollo, el pescado y las legumbres son esenciales para la     " +
                                                  "\n reparación de tejidos y el mantenimiento de la energía, y los granos integrales como la avena y el arroz integral, proveen fibra y energía sostenida para una buena digestión" +
                                                  "\n y vitalidad. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y" +
                                                  "\n sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, " +
                                                  "\n además por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app     " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linfáticos inflamados, Úlceras o llagas dolorosas, Picazón o ardor, Dolor al orinar.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n Es recomendable que el niño, con una estatura de 1.45-1.70 m, realice actividad física moderada y adaptada a su estado de salud, especialmente evitando actividades que puedan" +
                                                  "\n irritar las lesiones si estas están presentes, como el roce excesivo o la sudoración intensa en el área afectada. Una vez que las lesiones remitan, puede retomar gradualmente" +
                                                  "\n la actividad física normal para su edad, buscando idealmente periodos de 30 a 60 minutos de actividad moderada a intensa diaria, siempre bajo supervisión. También es crucial el" +
                                                  "\n consumo diario de 2.5 a 3 Litros de agua al día (diez a doce vasos de tamaño regular) para mantener una buena hidratación, lo cual es fundamental para el bienestar general, el" +
                                                  "\n funcionamiento óptimo del sistema inmune y la eliminación de toxinas. POSIBLE TRATAMIENTO: Para el herpes genital en niños de esta edad, el tratamiento principal consiste en  " +
                                                  "\n medicamentos antivirales que ayudan a controlar el brote, reducir la intensidad y duración de los síntomas, y prevenir futuras recurrencias, aunque no eliminan el virus del cuerpo." +
                                                  "\n Es fundamental que estos medicamentos sean prescritos y supervisados por un médico, quien determinará la dosis adecuada según la edad y el peso del niño. Algunos ejemplos de   " +
                                                  "\n medicamentos antivirales utilizados incluyen Aciclovir (una marca común es Zovirax), Valaciclovir (una marca común es Valtrex), y Famciclovir (una marca común es Famvir). Además" +
                                                  "\n del tratamiento antiviral, es importante mantener una higiene adecuada de las lesiones y evitar tocarlas para prevenir la propagación. También es recomendable que el niño consuma" +
                                                  "\n alimentos que fortalezcan su sistema inmune y ayuden a la cicatrización, tales como alimentos ricos en lisina y bajos en arginina, ya que la lisina puede inhibir la replicación  " +
                                                  "\n del virus del herpes, presentes en lácteos, pescado y pollo, que aportan proteínas esenciales y Vitamina D (importante para la función inmune). Una variedad de frutas y verduras," +
                                                  "\n como la papaya, que contiene una cantidad significativa de Vitamina C (aproximadamente 60.9 mg por cada 100 gramos, lo que representa cerca del 68% de la ingesta diaria recomendada" +
                                                  "\n para un niño de 4-8 años) y Vitamina A, y el mango, que también es rico en Vitamina C (aproximadamente 36.4 mg por cada 100 gramos, que representa cerca del 40% de la ingesta diaria" +
                                                  "\n recomendada para la misma edad), son excelentes fuentes de antioxidantes que apoyan la reparación celular y el fortalecimiento de las defensas del cuerpo. Este es solo un Diagnóstico" +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se  " +
                                                  "\n recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnostico " +
                                                  "\n no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Úlceras indoloras, Erupción cutánea, Dolor de cabeza, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Sífilis." +
                                                  "\n Es recomendable que el niño, con una estatura de 1.45-1.70 m, realice actividad física moderada y adaptada a su estado de salud, especialmente si la sífilis ha afectado alguna " +
                                                  "\n articulación o hueso, o si presenta fatiga. Durante el tratamiento y la recuperación, la actividad debe ser supervisada, buscando idealmente periodos de 30 a 60 minutos de actividad" +
                                                  "\n moderada en los días que se encuentre bien, pero siempre con precaución y escuchando las señales del cuerpo. También es crucial el consumo diario de 2.5 a 3 Litros de agua al día  " +
                                                  "\n (diez a doce vasos de tamaño regular) para mantener una buena hidratación, fundamental para el funcionamiento óptimo del cuerpo y el proceso de eliminación de toxinas durante el   " +
                                                  "\n tratamiento. POSIBLE TRATAMIENTO: Para la sífilis en niños de esta edad, el tratamiento principal y más efectivo es con antibióticos, siendo la penicilina el medicamento de elección." +
                                                  "\n La dosis y la duración del tratamiento serán determinadas estrictamente por un médico, y es fundamental completar el ciclo completo para asegurar la erradicación de la infección y  " +
                                                  "\n prevenir complicaciones a largo plazo. En casos de alergia a la penicilina, el médico puede considerar otras opciones como la ceftriaxona (una marca común es Rocephin). Es vital un " +
                                                  "\n seguimiento médico cercano después del tratamiento para confirmar la curación. También es recomendable que el niño consuma alimentos que fortalezcan su sistema inmune y apoyen la   " +
                                                  "\n recuperación general, como proteínas magras (pollo, pescado, legumbres) que son cruciales para la reparación de tejidos y la producción de células inmunes; así como una amplia variedad" +
                                                  "\n de frutas y verduras frescas. Por ejemplo, el brócoli, que aporta una gran cantidad de Vitamina C (alrededor de 89.2 mg por cada 100 gramos, lo que representa cerca del 99% de la   " +
                                                  "\n ingesta diaria recomendada para un niño de 4-8 años) y Vitamina K, importantes para la inmunidad y la coagulación. La espinaca, rica en folato (una vitamina B esencial para la división" +
                                                  "\n celular y la formación de glóbulos rojos, lo cual es importante si hay anemia asociada a la sífilis), y Vitamina A, también contribuye a la salud general. Las naranjas, con su alto  " +
                                                  "\n contenido de Vitamina C (aproximadamente 53.2 mg por cada 100 gramos, que representa cerca del 59% de la ingesta diaria recomendada para la misma edad), son excelentes para reforzar " +
                                                  "\n las defensas, y los arándanos son ricos en antioxidantes que protegen las células del daño. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100%" +
                                                  "\n que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor" +
                                                  "\n seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su médico," +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Pérdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n Es recomendable que el niño, con una estatura de 1.45-1.70 m, realice actividad física moderada y adaptada a su estado de salud y nivel de energía, especialmente durante la fase activa" +
                                                  "\n de la enfermedad y el tratamiento, cuando puede experimentar fatiga y dificultad respiratoria. Se deben evitar actividades extenuantes y priorizar el reposo adecuado. A medida que su  " +
                                                  "\n condición mejore, puede retomar gradualmente juegos ligeros, caminatas cortas o ejercicios de estiramiento, siempre bajo supervisión médica, buscando alcanzar periodos de 30 a 60 minutos" +
                                                  "\n de actividad moderada en los días que se encuentre bien, adaptándose a su tolerancia. También es crucial el consumo diario de 2.5 a 3 Litros de agua al día (diez a doce vasos de tamaño" +
                                                  "\n regular) para mantener una excelente hidratación, lo cual es vital para el funcionamiento general del cuerpo, la eliminación de desechos y el apoyo a los órganos que metabolizan los   " +
                                                  "\n medicamentos antituberculosos. POSIBLE TRATAMIENTO: Para la tuberculosis en niños de esta edad, el tratamiento es un régimen prolongado de antibióticos antituberculosos, que se administra" +
                                                  "\n bajo estricta supervisión médica. Es absolutamente esencial que el niño complete el curso completo del tratamiento, que puede durar varios meses, para erradicar la bacteria y prevenir la " +
                                                  "\n aparición de cepas resistentes. Los medicamentos comunes incluyen Isoniazida (una marca común es Laniazid), Rifampicina (una marca común es Rifadin), Pirazinamida y Etambutol.          " +
                                                  "\n La combinación y dosis exactas serán determinadas por el médico. Es fundamental un seguimiento médico constante para monitorear la respuesta al tratamiento y los posibles efectos secundarios." +
                                                  "\n También es recomendable que el niño consuma alimentos que fortalezcan su sistema inmune y le proporcionen la energía y nutrientes necesarios para combatir la infección y apoyar el tratamiento," +
                                                  "\n como proteínas de alto valor biológico (huevo, pollo, pescado, legumbres) que son cruciales para la reparación de tejidos y la producción de células inmunes. Las verduras de hoja verde oscuro" +
                                                  "\n como la espinaca, que aporta Magnesio, hierro y folato (importante para la formación de glóbulos rojos, que pueden verse afectados por la TB o sus tratamientos); y las zanahorias, una     " +
                                                  "\n excelente fuente de Vitamina A (alrededor de 835 µg por cada 100 gramos, lo que representa cerca del 167% de la ingesta diaria recomendada para un niño de 4-8 años), esencial para la      " +
                                                  "\n salud de las mucosas respiratorias y la función inmune, son altamente beneficiosas. Las frutas como el mango, que aporta Vitamina C (aproximadamente 36.4 mg por cada 100 gramos, lo que    " +
                                                  "\n representa cerca del 40% de la ingesta diaria recomendada para un niño de 4-8 años) y Vitamina A, así como las naranjas, ricas en Vitamina C (aproximadamente 53.2 mg por cada 100 gramos,  " +
                                                  "\n que representa cerca del 59% de la ingesta diaria recomendada para la misma edad), son cruciales para reforzar el sistema inmunológico y actuar como antioxidantes. Este es solo un Diagnóstico" +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer" +
                                                  "\n más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnostico no le satisface del todo      " +
                                                  "\n se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchazón en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n Es recomendable que el niño, con una estatura de 1.45-1.70 m, realice actividad física suave y de bajo impacto adaptada a su nivel de dolor y la condición de sus articulaciones, buscando " +
                                                  "\n mantener la flexibilidad y fortalecer los músculos sin sobrecargar las zonas inflamadas. Actividades como la natación, el ciclismo (con un sillín adecuado y baja resistencia) o ejercicios" +
                                                  "\n de estiramiento suaves pueden ser muy beneficiosas, siempre bajo supervisión y previa consulta con el médico o fisioterapeuta. La cantidad de ejercicio debe ser progresiva y ajustada a sus" +
                                                  "\n días buenos y malos, pero se debe fomentar el movimiento regular para evitar la rigidez, idealmente buscando periodos de 30 a 60 minutos de actividad moderada en los días que se encuentre bien," +
                                                  "\n permitiendo periodos de descanso según su tolerancia. También es crucial el consumo diario de 2.5 a 3 Litros de agua al día (diez a doce vasos de tamaño regular) para mantener una buena   " +
                                                  "\n hidratación, lo cual es fundamental para la salud general, el funcionamiento óptimo de las articulaciones y el metabolismo de los medicamentos. POSIBLE TRATAMIENTO: Para la artritis en niños" +
                                                  "\n de esta edad, el tratamiento suele incluir; medicamentos antiinflamatorios no esteroideos (AINEs) para reducir el dolor y la inflamación (como el ibuprofeno, una marca común es Advil o Motrin," +
                                                  "\n o el naproxeno, una marca común es Aproben), fármacos antirreumáticos modificadores de la enfermedad (FARME) que actúan sobre el sistema inmune para controlar la progresión de la enfermedad " +
                                                  "\n (como el metotrexato, una marca común es Trexall), y en algunos casos, medicamentos biológicos para la artritis juvenil idiopática grave. Es fundamental que estos tratamientos sean prescritos" +
                                                  "\n y supervisados por un reumatólogo pediátra, quien ajustará las dosis y monitoreará los efectos. También es recomendable que el niño consuma alimentos que ayuden a reducir la inflamación y  " +
                                                  "\n fortalezcan su sistema inmune, tales como pescados grasos (salmón, sardinas), que son ricos en ácidos grasos Omega-3, potentes antiinflamatorios que pueden ser beneficiosos para la salud articular." +
                                                  "\n Una amplia variedad de frutas y verduras de colores vivos, como los arándanos, que aportan antioxidantes que protegen las células; las espinacas, ricas en Magnesio, un mineral que puede contribuir " +
                                                  "\n a la relajación muscular, y Vitamina K; y el brócoli, que ofrece una gran cantidad de Vitamina C (alrededor de 89.2 mg por cada 100 gramos, lo que representa cerca del 99% de la ingesta diaria   " +
                                                  "\n recomendada para un niño de 4-8 años), esencial para la función inmunológica. También se beneficia de las cerezas, que contienen antocianinas, compuestos con potentes propiedades antiinflamatorias" +
                                                  "\n que podrían ayudar a reducir el dolor y la inflamación en las articulaciones. Además, el aguacate proporciona grasas saludables y Vitamina E, importantes para la energía y la salud general. Este es" +
                                                  "\n solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se  " +
                                                  "\n recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnostico no le satisface del " +
                                                  "\n todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n Es recomendable que el niño, con una estatura de 1.45-1.70 m, especialmente durante la fase paroxística de tos severa, limite la actividad física a movimientos suaves y evite cualquier esfuerzo " +
                                                  "\n que pueda desencadenar ataques de tos. El reposo es crucial para su recuperación y para conservar energía. A medida que mejore, puede retomar gradualmente actividades de bajo impacto como caminatas" +
                                                  "\n cortas o juegos tranquilos, siempre bajo supervisión, buscando alcanzar periodos de 30 a 60 minutos de actividad moderada en los días que se encuentre bien, adaptándose a su nivel de tolerancia." +
                                                  "\n También es crucial el consumo diario de 2.5 a 3 Litros de agua al día (diez a doce vasos de tamaño regular), o incluso más si presenta fiebre o dificultad para alimentarse, para mantener una excelente" +
                                                  "\n hidratación y ayudar a fluidificar las secreciones respiratorias, lo cual es vital para su comodidad y recuperación. POSIBLE TRATAMIENTO: Para la tosferina en niños de esta edad, el tratamiento  " +
                                                  "\n principal es con antibióticos, que son más efectivos cuando se administran en las primeras etapas de la enfermedad para acortar la duración de los síntomas y reducir la propagación. Los más comunes" +
                                                  "\n son los macrólidos, como la azitromicina (una marca común es Zithromax), la eritromicina (una marca común es Pneumo-E o Eritrobase) o la claritromicina (una marca común es Klacid). Es fundamental que" +
                                                  "\n el niño complete el ciclo completo de antibióticos tal como lo indique el médico, incluso si los síntomas mejoran, para erradicar la bacteria. En casos severos o en lactantes, podría requerirse   " +
                                                  "\n hospitalización para el monitoreo y manejo de complicaciones. También es recomendable que el niño consuma alimentos que fortalezcan su sistema inmune y le proporcionen nutrientes que ayuden a su  " +
                                                  "\n recuperación, especialmente aquellos que son fáciles de tragar y digestibles debido a los ataques de tos, tales como purés de frutas y verduras. Por ejemplo, el puré de calabaza, que aporta una buena" +
                                                  "\n cantidad de Vitamina A (alrededor de 369 µg por cada 100 gramos, lo que representa cerca del 74% de la ingesta diaria recomendada para un niño de 4-8 años), esencial para la salud de las mucosas  " +
                                                  "\n respiratorias y la función inmune; o el puré de zanahoria, también rica en Vitamina A y antioxidantes. Los plátanos son fáciles de comer y ricos en potasio (aproximadamente 358 mg por cada 100 gramos)," +
                                                  "\n un electrolito importante que puede ayudar a reponer las pérdidas debido a la tos y al sudor, además de aportar energía. Las sopas y caldos suaves contribuyen a la hidratación y aportan nutrientes de " +
                                                  "\n forma líquida. También son valiosas las frutas suaves ricas en Vitamina C como la papaya, que contiene alrededor de 60.9 mg de Vitamina C por cada 100 gramos (aproximadamente el 68% de la ingesta diaria" +
                                                  "\n recomendada para un niño de 4-8 años), y la guayaba, con niveles aún más altos de esta vitamina, crucial para fortalecer el sistema inmunológico. Este es solo un Diagnóstico predeterminado lógico,    " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de      " +
                                                  "\n Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su médico," +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchazón de las glándulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n Es recomendable que el niño, con una estatura de 1.45-1.70 m, especialmente durante la fase aguda de la enfermedad cuando puede presentar fiebre y malestar, limite la actividad física a un reposo" +
                                                  "\n adecuado, evitando esfuerzos que puedan aumentar el malestar o la hinchazón de las glándulas. A medida que su condición mejore y la fiebre ceda, puede retomar gradualmente actividades ligeras y  " +
                                                  "\n juegos tranquilos, siempre bajo supervisión, buscando alcanzar periodos de 30 a 60 minutos de actividad moderada en los días que se encuentre bien. También es crucial el consumo diario de 2.5 a  " +
                                                  "\n 3 Litros de agua al día (diez a doce vasos de tamaño regular), o más si tiene fiebre o dificultad para tragar alimentos sólidos, para mantener una excelente hidratación, lo cual es vital para su " +
                                                  "\n bienestar general, para ayudar a reducir la fiebre y para mantener las mucosas hidratadas, aliviando la garganta. POSIBLE TRATAMIENTO: Para las paperas en niños de esta edad, el tratamiento es   " +
                                                  "\n principalmente de soporte y para aliviar los síntomas, ya que es una infección viral y no existen medicamentos específicos para erradicar el virus. Se recomienda el reposo en cama, la aplicación " +
                                                  "\n de compresas frías o calientes en las glándulas inflamadas para aliviar el dolor, y el uso de medicamentos para controlar la fiebre y el dolor, como el paracetamol (una marca común es Tempra o   " +
                                                  "\n Tylenol) o el ibuprofeno (una marca común es Advil o Motrin). Es fundamental evitar el uso de aspirina en niños debido al riesgo de síndrome de Reye. También es recomendable que el niño consuma  " +
                                                  "\n alimentos que fortalezcan su sistema inmune y sean fáciles de masticar y tragar debido a la hinchazón de las glándulas salivales, tales como purés y alimentos blandos. Puede incluir caldos      " +
                                                  "\n nutritivos y sopas suaves que aportan hidratación y energía. En cuanto a las frutas y verduras, la piña es una excelente opción, ya que contiene bromelina, una enzima con propiedades antiinflamatorias" +
                                                  "\n que puede ayudar a reducir la hinchazón y el dolor, además de Vitamina C (aproximadamente 47.8 mg por cada 100 gramos, lo que representa cerca del 53% de la ingesta diaria recomendada para un niño" +
                                                  "\n de 4-8 años), esencial para el sistema inmunológico. El melón, fácil de digerir, es rico en Vitamina C (aproximadamente 36.7 mg por cada 100 gramos, que representa cerca del 41% de la ingesta diaria" +
                                                  "\n recomendada para la misma edad) y Vitamina A, y también aporta una alta cantidad de agua, contribuyendo a la hidratación. El plátano, fácil de digerir y rico en potasio (aproximadamente 358 mg por " +
                                                  "\n cada 100 gramos), un electrolito importante que ayuda a reponer las pérdidas y aporta energía. Finalmente, el aguacate proporciona grasas saludables y diversas vitaminas (como la E y K) que apoyan " +
                                                  "\n la función inmunológica y la salud general. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad" +
                                                  "\n y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la " +
                                                  "\n respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupción cutánea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n Es recomendable que el niño, con una estatura de 1.45-1.70 m, durante la fase aguda de la enfermedad cuando puede presentar fiebre, dolor muscular y articular, mantenga un reposo adecuado y evite" +
                                                  "\n la actividad física extenuante. A medida que sus síntomas mejoren y bajo supervisión, puede retomar gradualmente actividades ligeras y juegos tranquilos, buscando alcanzar periodos de 30 a 60    " +
                                                  "\n minutos de actividad moderada en los días que se encuentre bien, priorizando entornos donde se pueda minimizar la exposición a mosquitos. También es crucial el consumo diario de 2.5 a 3 Litros   " +
                                                  "\n de agua al día (diez a doce vasos de tamaño regular), o más si tiene fiebre o vómitos, para mantener una excelente hidratación y prevenir la deshidratación, lo cual es vital para el bienestar    " +
                                                  "\n general y el funcionamiento óptimo de todos sus sistemas corporales durante la recuperación. POSIBLE TRATAMIENTO: Para el Zika en niños de esta edad, el tratamiento es principalmente de soporte, " +
                                                  "\n ya que no existe un medicamento antiviral específico para curar la infección. El manejo se enfoca en aliviar los síntomas, lo que incluye el reposo, una buena hidratación y el uso de medicamentos" +
                                                  "\n para controlar la fiebre y el dolor, como el paracetamol (una marca común es Tempra o Tylenol). Es fundamental evitar el uso de aspirina y otros AINEs (antiinflamatorios no esteroideos como el   " +
                                                  "\n ibuprofeno) hasta que se descarte la posibilidad de dengue, debido al riesgo de complicaciones hemorrágicas. También es crucial proteger al niño de nuevas picaduras de mosquitos durante la       " +
                                                  "\n enfermedad para evitar la transmisión del virus a otras personas. Además, es recomendable que el niño consuma alimentos que fortalezcan su sistema inmune y le proporcionen energía, tales como    " +
                                                  "\n caldos nutritivos y sopas suaves que facilitan la hidratación y son fáciles de digerir. Las frutas tropicales como la papaya, que aporta una cantidad significativa de Vitamina C (aproximadamente " +
                                                  "\n 60.9 mg por cada 100 gramos, lo que representa cerca del 68% de la ingesta diaria recomendada para un niño de 4-8 años) y Vitamina A, y el mango, que también es rico en Vitamina C (aproximadamente" +
                                                  "\n 36.4 mg por cada 100 gramos, que representa cerca del 40% de la ingesta diaria recomendada para la misma edad) y antioxidantes, son excelentes para reforzar las defensas. El plátano, fácil de    " +
                                                  "\n digerir, es rico en potasio (aproximadamente 358 mg por cada 100 gramos), un electrolito importante que ayuda a reponer las pérdidas por fiebre o sudor. Las verduras de hoja verde oscuro como la " +
                                                  "\n espinaca, que provee Vitamina K, Vitamina A y hierro, contribuyen a la vitalidad y al buen funcionamiento general. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza" +
                                                  "\n al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor   " +
                                                  "\n seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes     " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, Vómitos, Deshidratación, Dolor abdominal.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n Es recomendable que el niño, con una estatura de 1.45-1.70 m, mientras presente diarrea y vómitos, limite la actividad física a un reposo absoluto o muy suave, evitando cualquier esfuerzo que" +
                                                  "\n pueda empeorar la deshidratación o el malestar gastrointestinal. La prioridad es conservar energía para la recuperación. A medida que los síntomas disminuyan y la hidratación mejore, puede retomar" +
                                                  "\n gradualmente juegos tranquilos y actividades de bajo impacto, siempre bajo supervisión, buscando alcanzar periodos de 30 a 60 minutos de actividad moderada en los días que se encuentre bien.  " +
                                                  "\n También es crucial el consumo diario de 2.5 a 3 Litros de agua al día (diez a doce vasos de tamaño regular) en pequeñas tomas frecuentes, preferiblemente mediante soluciones de rehidratación oral" +
                                                  "\n (como Electrolit pediátrico o Pedialyte), para reponer los líquidos y electrolitos perdidos por la diarrea y el vómito, lo cual es vital para prevenir la deshidratación severa.                " +
                                                  "\n POSIBLE TRATAMIENTO: Para el rotavirus en niños de esta edad, el tratamiento es principalmente de soporte y se enfoca en la rehidratación, ya que no existe un medicamento antiviral específico para" +
                                                  "\n el virus. La clave es prevenir y tratar la deshidratación mediante la administración de líquidos y electrolitos. En casa, se pueden usar soluciones de rehidratación oral (SRO), y en casos de  " +
                                                  "\n deshidratación severa, puede ser necesaria la hospitalización para la administración de líquidos por vía intravenosa. Los medicamentos para detener la diarrea no suelen ser recomendados en niños con" +
                                                  "\n rotavirus. En cuanto a medicamentos para el malestar, el paracetamol (una marca común es Tempra o Tylenol) puede usarse para controlar la fiebre y aliviar las molestias, siempre bajo indicación médica." +
                                                  "\n Es fundamental la supervisión médica. Además, es importante que el niño consuma alimentos que sean fáciles de digerir y ayuden a la recuperación de la flora intestinal, así como nutrientes que apoyen" +
                                                  "\n la función inmune, tales como arroz blanco o avena cocida, que aportan energía y son suaves para el estómago; caldos de pollo o vegetales desgrasados que contribuyen a la hidratación y a la reposición" +
                                                  "\n de electrolitos. El plátano, muy beneficioso por su contenido de potasio (aproximadamente 358 mg por cada 100 gramos), un electrolito clave que se pierde con la diarrea y el vómito, ayudando a    " +
                                                  "\n normalizar los niveles y aportar energía de fácil absorción. También se recomienda el puré de manzana (sin cáscara), que contiene pectina, una fibra soluble que puede ayudar a solidificar las heces" +
                                                  "\n y es suave para el sistema digestivo del niño. Otra verdura valiosa es la papa cocida y en puré, la cual es una buena fuente de potasio y carbohidratos complejos, que son de fácil digestión y aportan" +
                                                  "\n energía sin irritar el intestino, favoreciendo la recuperación. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por" +
                                                  "\n ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por" +
                                                  "\n su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, Náuseas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n Es recomendable que el niño, con una estatura de 1.45-1.70 m, durante la fase aguda de la enfermedad cuando puede presentar fiebre, diarrea o síntomas neurológicos, mantenga un reposo adecuado" +
                                                  "\n y evite cualquier actividad física extenuante. El objetivo es preservar la energía y permitir que su cuerpo se recupere. A medida que los síntomas disminuyan y bajo supervisión médica, puede " +
                                                  "\n retomar gradualmente actividades tranquilas y de bajo impacto, buscando alcanzar periodos de 30 a 60 minutos de actividad moderada en los días que se encuentre bien. También es crucial el    " +
                                                  "\n consumo diario de 2.5 a 3 Litros de agua al día (diez a doce vasos de tamaño regular), especialmente si presenta fiebre o diarrea, para mantener una excelente hidratación y reponer los líquidos" +
                                                  "\n perdidos, lo cual es vital para el bienestar general y el funcionamiento óptimo de sus sistemas corporales mientras combate la infección. POSIBLE TRATAMIENTO: Para la listeriosis en niños de   " +
                                                  "\n esta edad, el tratamiento principal consiste en la administración de antibióticos, siendo la ampicilina (una marca común es Omnipen o Polycillin) o la penicilina (una marca común es Penprocilina" +
                                                  "\n o Bencilpenicilina Sódica) los más comúnmente utilizados, a menudo en combinación con otros antibióticos como la gentamicina. La elección, dosis y duración del tratamiento deben ser estrictamente" +
                                                  "\n determinadas por un médico, y es fundamental completar el ciclo completo de antibióticos para erradicar la bacteria y prevenir complicaciones serias, como la meningitis. En casos graves, puede  " +
                                                  "\n requerirse hospitalización para la administración intravenosa de medicamentos y monitoreo. Además, es recomendable que el niño consuma alimentos que refuercen su sistema inmune y apoyen su      " +
                                                  "\n recuperación general, priorizando aquellos que son fáciles de digerir si presenta síntomas gastrointestinales. Estos incluyen proteínas magras como el pollo cocido o el pescado (si su digestión " +
                                                  "\n lo permite), que aportan aminoácidos esenciales para la reparación de tejidos y la producción de células inmunes; caldos y sopas nutritivas que contribuyen a la hidratación y al aporte de       " +
                                                  "\n electrolitos. También son beneficiosas frutas ricas en Vitamina C como la papaya, que contiene aproximadamente 60.9 mg por cada 100 gramos (cerca del 68% de la ingesta diaria recomendada para un" +
                                                  "\n niño de 4-8 años), y las naranjas, que aportan alrededor de 53.2 mg de Vitamina C por cada 100 gramos (cerca del 59% de la ingesta diaria recomendada para la misma edad), ambas potentes         " +
                                                  "\n antioxidantes que fortalecen las defensas del cuerpo. Las verduras cocidas en puré, como la calabaza, que aporta una buena cantidad de Vitamina A (alrededor de 369 µg por cada 100 gramos,       " +
                                                  "\n lo que representa cerca del 74% de la ingesta diaria recomendada para un niño de 4-8 años), es crucial para la integridad de las mucosas y la función inmunitaria, y la espinaca, que provee      " +
                                                  "\n hierro y folato, importantes para la formación de glóbulos rojos. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad " +
                                                  "\n y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su    " +
                                                  "\n paciente, además por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida)         " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, Vómitos.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n Es recomendable que el niño, con una estatura de 1.45-1.70 m, durante la fase aguda de la enfermedad cuando presenta diarrea severa, dolor abdominal y fiebre, mantenga un reposo estricto," +
                                                  "\n evitando cualquier actividad física que pueda agravar la deshidratación o el malestar gastrointestinal. La prioridad es conservar energía. A medida que los síntomas disminuyan y la       " +
                                                  "\n rehidratación sea efectiva, puede retomar gradualmente juegos tranquilos y actividades de bajo impacto, siempre bajo supervisión, buscando alcanzar periodos de 30 a 60 minutos de actividad" +
                                                  "\n moderada en los días que se encuentre bien. También es crucial el consumo diario de 2.5 a 3 Litros de agua al día (diez a doce vasos de tamaño regular) en pequeñas y frecuentes tomas,    " +
                                                  "\n preferiblemente soluciones de rehidratación oral (como Electrolit pediátrico o Pedialyte), para reponer los líquidos y electrolitos perdidos por la diarrea y el vómito, lo cual es vital  " +
                                                  "\n para prevenir la deshidratación severa y apoyar la función renal durante la infección. POSIBLE TRATAMIENTO: Para la shigelosis en niños de esta edad, el tratamiento principal es con      " +
                                                  "\n antibióticos, ya que la shigelosis es una infección bacteriana que puede ser grave. Los antibióticos más comunes para esta condición incluyen la azitromicina (una marca común es Zithromax)," +
                                                  "\n o las cefalosporinas de tercera generación como la ceftriaxona (una marca común es Rocephin), dependiendo de la resistencia bacteriana local. Es fundamental que el niño complete el ciclo " +
                                                  "\n completo de antibióticos tal como lo indique el médico, incluso si los síntomas mejoran, para erradicar la bacteria y evitar la propagación. Además del tratamiento antibiótico, el manejo " +
                                                  "\n de la deshidratación mediante soluciones de rehidratación oral es esencial. Los medicamentos para frenar la diarrea generalmente no se recomiendan. Es importante también que el niño consuma" +
                                                  "\n alimentos que sean fáciles de digerir, suaves para el sistema gastrointestinal y que aporten nutrientes para fortalecer su sistema inmune, como arroz blanco o avena cocida, que son fuente" +
                                                  "\n de energía y suaves para el estómago; caldos de pollo o vegetales desgrasados que contribuyen a la hidratación y a la reposición de electrolitos. El plátano, muy beneficioso por su       " +
                                                  "\n contenido de potasio (aproximadamente 358 mg por cada 100 gramos), un electrolito clave que se pierde con la diarrea y el vómito, ayudando a normalizar los niveles y aportar energía de fácil" +
                                                  "\n absorción. También se recomienda el puré de manzana (sin cáscara), que contiene pectina, una fibra soluble que puede ayudar a solidificar las heces y es suave para el sistema digestivo   " +
                                                  "\n del niño. Otra verdura valiosa es la papa cocida y en puré, la cual es una buena fuente de potasio y carbohidratos complejos, que son de fácil digestión y aportan energía sin irritar el  " +
                                                  "\n intestino, favoreciendo la recuperación de la mucosa intestinal dañada. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa" +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento " +
                                                  "\n adecuado de su paciente, además por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos crónica, Producción excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad Pulmonar Obstructiva Crónica (EPOC)." +
                                                  "\n Es recomendable que el niño, con una estatura de 1.45-1.70 m, realice ejercicios de respiración y actividades físicas de bajo impacto adaptadas a su capacidad pulmonar y estado general," +
                                                  "\n bajo supervisión médica. Se deben evitar ambientes con humo o contaminantes, y priorizar actividades que no causen dificultad respiratoria excesiva. Caminatas cortas y suaves, juegos   " +
                                                  "\n tranquilos o ejercicios de brazos que no agiten demasiado, pueden ser beneficiosos, buscando mantener la movilidad y la fuerza muscular sin agotar al niño, con el objetivo de alcanzar  " +
                                                  "\n periodos de 30 a 60 minutos de actividad moderada en los días que se encuentre bien, pero siempre con periodos de descanso. También es crucial el consumo diario de 2.5 a 3 Litros de agua" +
                                                  "\n al día (diez a doce vasos de tamaño regular) para mantener las secreciones pulmonares más fluidas y facilitar su expectoración, lo cual es vital para una mejor respiración y para prevenir" +
                                                  "\n infecciones. POSIBLE TRATAMIENTO: Para la EPOC en niños (que es rara y a menudo asociada a condiciones congénitas, exposiciones ambientales severas tempranas o infecciones recurrentes), " +
                                                  "\n el tratamiento se enfoca en manejar los síntomas, prevenir exacerbaciones y mejorar la función pulmonar. Esto incluye el uso de broncodilatadores (como el salbutamol, una marca común es " +
                                                  "\n Ventolin o Aerolin, para abrir las vías respiratorias), corticosteroides inhalados (como la fluticasona, una marca común es Flixotide, para reducir la inflamación), y en algunos casos,  " +
                                                  "\n oxigenoterapia si hay bajos niveles de oxígeno. La terapia respiratoria y la fisioterapia pulmonar son fundamentales. Es esencial la eliminación de la exposición a irritantes pulmonares," +
                                                  "\n como el humo de tabaco. Además, es recomendable que el niño consuma alimentos que fortalezcan su sistema inmune y le proporcionen energía de manera sostenible, priorizando aquellos que no" +
                                                  "\n causen distensión abdominal que pueda dificultar la respiración. Estos incluyen proteínas magras como el pollo o el pescado, que aportan aminoácidos esenciales para la reparación de     " +
                                                  "\n tejidos y el mantenimiento de la masa muscular, crucial en pacientes con EPOC; carbohidratos complejos de liberación lenta como la avena o el arroz integral, que proporcionan energía sin" +
                                                  "\n picos glucémicos; y una variedad de verduras de hoja verde oscuro como la acelga, que aporta Vitamina K, Vitamina A y antioxidantes, que pueden ayudar a reducir la inflamación pulmonar, " +
                                                  "\n y el brócoli, que ofrece una gran cantidad de Vitamina C (alrededor de 89.2 mg por cada 100 gramos, lo que representa cerca del 99% de la ingesta diaria recomendada para un niño         " +
                                                  "\n de 4-8 años), esencial para la función inmunológica y como antioxidante. Las frutas como las fresas, que contienen cerca de 58.8 mg de Vitamina C por cada 100 gramos (aproximadamente el " +
                                                  "\n 65% de la ingesta diaria recomendada para la misma edad), y las manzanas, que contienen quercetina, un flavonoide con propiedades antiinflamatorias que pueden ser útiles para la salud   " +
                                                  "\n pulmonar, también son beneficiosas. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la     " +
                                                  "\n enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente,    " +
                                                  "\n además por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreción anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n Es recomendable que el niño, con una estatura de 1.45-1.70 m, mientras recibe tratamiento, mantenga una actividad física normal adaptada a su estado de salud, evitando cualquier " +
                                                  "\n molestia o irritación en el área afectada si presenta síntomas. La Clamidia no suele afectar directamente la capacidad física a largo plazo. Una vez que el tratamiento sea efectivo" +
                                                  "\n y los síntomas hayan desaparecido, puede seguir con la actividad física recomendada para su edad, buscando idealmente periodos de 30 a 60 minutos de actividad moderada a intensa " +
                                                  "\n diaria. También es crucial el consumo diario de 2.5 a 3 Litros de agua al día (diez a doce vasos de tamaño regular) para mantener una buena hidratación, lo cual es fundamental para" +
                                                  "\n el bienestar general, el funcionamiento óptimo de sus sistemas corporales y para apoyar la eliminación de los medicamentos del organismo. POSIBLE TRATAMIENTO: Para la clamidia en" +
                                                  "\n niños de esta edad, el tratamiento principal es con antibióticos, los cuales son muy efectivos para erradicar la infección. La elección y la dosis del antibiótico serán determinadas" +
                                                  "\n estrictamente por un médico, quien considerará la edad y el peso del niño. Es fundamental completar el ciclo completo de antibióticos tal como se indique, incluso si los síntomas" +
                                                  "\n mejoran, para asegurar la eliminación total de la bacteria y prevenir reinfecciones o complicaciones. Los antibióticos comúnmente usados incluyen la azitromicina (una marca común" +
                                                  "\n es Zithromax) o la eritromicina (una marca común es Pneumo-E o Eritrobase). Es importante recordar que la clamidia en niños puede requerir una evaluación médica inmediata, ya que" + 
                                                  "\n en algunos casos puede ser indicativa de abuso. Además, es recomendable que el niño consuma alimentos que fortalezcan su sistema inmune y apoyen la recuperación general, como fuentes" +
                                                  "\n de probióticos (si son tolerados, como yogur natural si no hay contraindicaciones), que pueden ayudar a mantener un equilibrio saludable de la flora intestinal, especialmente después" +
                                                  "\n de la administración de antibióticos. Las frutas como las fresas, que contienen cerca de 58.8 mg de Vitamina C por cada 100 gramos (aproximadamente el 65% de la ingesta diaria   " +
                                                  "\n recomendada para un niño de 4-8 años), o las naranjas, que aportan alrededor de 53.2 mg de Vitamina C por cada 100 gramos (cerca del 59% de la ingesta diaria recomendada para la " +
                                                  "\n misma edad), son excelentes fuentes de esta vitamina, crucial para reforzar las defensas del cuerpo. Las verduras de hoja verde oscuro como la espinaca, rica en folato y Vitamina K," +
                                                  "\n y el brócoli, que provee Vitamina A y antioxidantes, también contribuyen a la vitalidad y al buen funcionamiento general del sistema inmune, favoreciendo la recuperación. Este es  " +
                                                  "\n solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas," +
                                                  "\n para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del   " +
                                                  "\n Diagnostico no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Náuseas, Dolor de cabeza severo, Rigidez en el cuello, Confusión.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n Es recomendable que el niño, con una estatura de 1.45-1.70 m, durante la fase aguda de la enfermedad, mantenga un reposo estricto en cama, ya que la meningitis es una condición" +
                                                  "\n grave que requiere mínima estimulación y máxima conservación de energía para la recuperación cerebral y general del cuerpo. Cualquier actividad física debe ser evitada por     " +
                                                  "\n completo en este periodo. Una vez que la fase aguda haya pasado y bajo estricta supervisión médica, la rehabilitación o la reintroducción gradual de movimientos muy suaves     " +
                                                  "\n solo se realizará si no hay secuelas. También es crucial el consumo diario de 2.5 a 3 Litros de agua al día (diez a doce vasos de tamaño regular) en tomas pequeñas y frecuentes," +
                                                  "\n preferiblemente por vía intravenosa si el niño no puede beber, para mantener una hidratación óptima y asegurar el correcto funcionamiento de los órganos, especialmente los     " +
                                                  "\n riñones, que procesarán los medicamentos, y para ayudar a controlar la fiebre. POSIBLE TRATAMIENTO: Para la meningitis bacteriana en niños de esta edad, el tratamiento es una  " +
                                                  "\n emergencia médica y consiste en la administración inmediata de antibióticos intravenosos de amplio espectro para combatir la infección. La elección del antibiótico dependerá   " +
                                                  "\n de la edad del niño, el tipo de bacteria sospechada y los patrones de resistencia locales, y será determinada por un médico especialista. Es vital que el tratamiento antibiótico" +
                                                  "\n se inicie lo antes posible y se complete en su totalidad para prevenir complicaciones graves como daño cerebral, pérdida de audición o incluso la muerte. Algunos antibióticos  " +
                                                  "\n comunes incluyen la ceftriaxona (una marca común es Rocephin) o la ampicilina (una marca común es Omnipen o Polycillin), a veces combinados con vancomicina (una marca común es " +
                                                  "\n Vancocin). Además de los antibióticos, se pueden usar corticosteroides (como la dexametasona, una marca común es Decadron) para reducir la inflamación cerebral y prevenir      " +
                                                  "\n secuelas neurológicas, siempre bajo indicación médica. Es fundamental el monitoreo constante en un entorno hospitalario. En cuanto a la alimentación, una vez que el niño pueda " +
                                                  "\n tolerar la vía oral, es recomendable que consuma alimentos que sean fáciles de digerir y nutritivos para apoyar la recuperación del sistema nervioso y el fortalecimiento del   " +
                                                  "\n sistema inmune. Esto incluye caldos y sopas suaves que aportan líquidos y electrolitos; purés de verduras como la calabaza, que aporta una buena cantidad de Vitamina A (alrededor" +
                                                  "\n de 369 µg por cada 100 gramos, lo que representa cerca del 74% de la ingesta diaria recomendada para un niño de 4-8 años), esencial para la recuperación de las mucosas y       " +
                                                  "\n la visión; y frutas blandas como el plátano, que aporta potasio (aproximadamente 358 mg por cada 100 gramos), un electrolito vital para la función nerviosa y muscular. También " +
                                                  "\n son beneficiosos los alimentos ricos en antioxidantes como el aguacate, que provee grasas saludables y Vitamina E, que pueden proteger las células neuronales del daño oxidativo." +
                                                  "\n Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas   " +
                                                  "\n estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud  " +
                                                  "\n si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, Pérdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, Pérdida de apetito.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Cáncer." +
                                                  "\n Es recomendable que el niño, con una estatura de 1.45-1.70 m, cuya actividad física debe ser siempre supervisada y adaptada a su estado de salud, energía y fase del tratamiento" +
                                                  "\n oncológico, mantenga periodos de descanso adecuados y evite cualquier actividad extenuante o que pueda comprometer su sistema inmune. Se deben priorizar actividades de bajo    " +
                                                  "\n impacto que fomenten la movilidad y el bienestar, como caminatas cortas y suaves, juegos tranquilos o ejercicios de estiramiento muy ligeros, siempre que el médico lo autorice " +
                                                  "\n y según su tolerancia. El objetivo es mantener la fuerza muscular y mejorar la calidad de vida sin sobrecargar su cuerpo, buscando alcanzar periodos de 30 a 60 minutos de    " +
                                                  "\n actividad moderada en los días que se encuentre bien, pero con flexibilidad y respetando sus límites. También es crucial el consumo diario de 2.5 a 3 Litros de agua al día   " +
                                                  "\n (diez a doce vasos de tamaño regular), o más si tiene fiebre, vómitos o diarrea como efectos secundarios del tratamiento, para mantener una excelente hidratación, lo cual es " +
                                                  "\n vital para el funcionamiento óptimo de sus órganos, la eliminación de toxinas y el apoyo al metabolismo de los medicamentos. POSIBLE TRATAMIENTO: Para el cáncer en niños de  " +
                                                  "\n esta edad, el tratamiento es altamente individualizado y complejo, dependiendo del tipo específico de cáncer, su etapa y la salud general del niño. Generalmente, implica una " +
                                                  "\n combinación de quimioterapia (medicamentos que matan las células cancerosas, como la vincristina, una marca común es Oncovin, o el ciclofosfamida, una marca común es Cytoxan)," +
                                                  "\n radioterapia (uso de radiación para destruir células cancerosas), cirugía (para extirpar tumores), e incluso inmunoterapia o terapia dirigida. Es fundamental que el tratamiento" +
                                                  "\n sea manejado por un equipo multidisciplinario de oncólogos pediátricos. Además del tratamiento oncológico, se utilizan medicamentos de soporte para manejar los efectos       " +
                                                  "\n secundarios, como antieméticos para las náuseas (como el ondansetrón, una marca común es Zofran), analgésicos para el dolor (como el paracetamol, una marca común es Tempra   " +
                                                  "\n o Tylenol), y factores estimulantes de colonias para apoyar la médula ósea. En cuanto a la alimentación, es recomendable que el niño consuma alimentos que fortalezcan su     " +
                                                  "\n sistema inmune, le proporcionen energía y le ayuden a tolerar mejor el tratamiento, priorizando aquellos que sean nutritivos y de fácil digestión. Esto incluye proteínas     " +
                                                  "\n de alto valor biológico (pollo, pescado, huevos, legumbres) que son esenciales para la reparación celular y el mantenimiento de la masa muscular, crucial durante y después   " +
                                                  "\n de la quimioterapia. Las verduras de hoja verde oscuro como la col rizada (kale), que aporta Vitamina K, Vitamina A y antioxidantes, que pueden ayudar a reducir la inflamación" +
                                                  "\n y proteger las células, y el brócoli, que ofrece una gran cantidad de Vitamina C (alrededor de 89.2 mg por cada 100 gramos, lo que representa cerca del 99% de la ingesta diaria" +
                                                  "\n recomendada para un niño de 4-8 años), esencial para la función inmunológica. Las frutas de colores vivos como la granada, rica en antioxidantes (como punicalaginas) que pueden" +
                                                  "\n ofrecer propiedades protectoras, y las uvas, que contienen resveratrol, un compuesto con potencial antiinflamatorio. El aguacate proporciona grasas saludables y Vitamina E,   " +
                                                  "\n importantes para la energía y la salud general. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad" +
                                                  "\n y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento" +
                                                  "\n adecuado de su paciente, además por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece    " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }  
                        }
                        if(EstaturaMasculino.equals("1.65-1.80 m")){
                           if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n Es recomendable que el niño, con una estatura de 1.65-1.80 m, realice cerca de 60 minutos de actividad física moderada a intensa diaria, incluyendo juegos activos" +
                                                  "\n o deportes, siempre adaptando la intensidad a su estado de salud general durante el periodo de enfermedad. Esto es crucial para mantener un sistema inmune fuerte." +
                                                  "\n También es recomendable el consumo diario de 3 a 3.5 Litros de agua al día (doce a catorce vasos de tamaño regular) para mantener una excelente hidratación, lo cual" +
                                                  "\n ayuda a fluidificar las secreciones respiratorias y a controlar la fiebre. POSIBLE TRATAMIENTO: Para la gripe en niños de esta edad, el tratamiento suele incluir;" +
                                                  "\n medicamentos para reducir la fiebre y aliviar los síntomas, como el paracetamol (una marca común es Tempra o Tylenol) o el ibuprofeno (una marca común es Advil o " +
                                                  "\n Motrin). En algunos casos, si se diagnostica a tiempo (dentro de las primeras 48 horas de los síntomas), el médico puede prescribir antivirales específicos contra" +
                                                  "\n la gripe como el oseltamivir (una marca común es Tamiflu). Es fundamental seguir las indicaciones del médico al pie de la letra. También es recomendable que el niño" +
                                                  "\n consuma alimentos que fortalezcan su sistema inmune y aporten nutrientes para la recuperación, tales como frutas ricas en Vitamina C como las guayabas, que contienen" +
                                                  "\n una cantidad muy alta de esta vitamina (alrededor de 228.3 mg por cada 100 gramos, lo que representa cerca del 254% de la ingesta diaria recomendada para un niño de " +
                                                  "\n 4-8 años), o las naranjas, que aportan aproximadamente 53.2 mg por cada 100 gramos (cerca del 59% de la ingesta diaria recomendada para la misma edad), ambos potentes" +
                                                  "\n antioxidantes que apoyan las defensas del cuerpo. También son beneficiosos los vegetales de hoja verde oscuro como el kale (col rizada), que provee Vitamina A y     " +
                                                  "\n Vitamina K, importantes para la salud de las mucosas y la función inmune; y el jengibre, que puede consumirse en infusiones y posee propiedades antiinflamatorias que" +
                                                  "\n pueden ayudar a aliviar el malestar. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y" + 
                                                  "\n que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el    " +
                                                  "\n tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su médico, Angel" +
                                                  "\n L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                               textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumonía." +
                                                  "\n Es recomendable que el niño, con una estatura de 1.65-1.80 m, realice actividad física moderada según su capacidad y estado de recuperación, siempre supervisada" +
                                                  "\n y evitando esfuerzos excesivos o juegos que agiten demasiado sus vías respiratorias, especialmente si aún presenta síntomas. Una vez que su condición mejore, puede" +
                                                  "\n retomar gradualmente actividades como caminatas al aire libre, bicicleta o juegos tranquilos, buscando cerca de 60 minutos de actividad física moderada a intensa  " +
                                                  "\n diaria. También es crucial el consumo diario de 3 a 3.5 Litros de agua al día (doce a catorce vasos de tamaño regular), especialmente si tiene fiebre, para ayudar " +
                                                  "\n a fluidificar las secreciones pulmonares y prevenir la deshidratación, facilitando su expectoración. POSIBLE TRATAMIENTO: Para la neumonía en niños de esta edad,  " +
                                                  "\n el tratamiento suele incluir; antibióticos (si la causa es bacteriana, como la amoxicilina, una marca común es Amoxil o Clamoxil, o la azitromicina, una marca común" +
                                                  "\n es Zithromax, siempre bajo prescripción médica estricta), medicamentos para reducir la fiebre y aliviar el dolor (como el paracetamol, una marca común es Tempra o " +
                                                  "\n Tylenol, o el ibuprofeno, una marca común es Advil o Motrin), y en algunos casos, oxigenoterapia si la saturación de oxígeno es baja. Es fundamental seguir las   " +
                                                  "\n indicaciones del médico al pie de la letra y completar el ciclo de antibióticos aunque el niño parezca mejor. También es recomendable que el niño consuma alimentos" +
                                                  "\n que fortalezcan su sistema inmune y le aporten energía, tales como caldos nutritivos y sopas suaves que, además de ser fáciles de digerir, contribuyen a la       " +
                                                  "\n hidratación y al aporte de electrolitos. Las verduras de hoja verde oscuro como el kale (col rizada), que aporta Vitamina A y Vitamina K, o el pimiento rojo, que " +
                                                  "\n ofrece una gran cantidad de Vitamina C (alrededor de 127.7 mg por cada 100 gramos, lo que representa cerca del 142% de la ingesta diaria recomendada para un niño " +
                                                  "\n de 4-8 años), son excelentes fuentes de antioxidantes que apoyan la salud pulmonar. Las frutas como las fresas, que contienen cerca de 58.8 mg de Vitamina C por  " +
                                                  "\n cada 100 gramos (aproximadamente el 65% de la ingesta diaria recomendada para la misma edad), y las papayas, que ofrecen aproximadamente 60.9 mg de Vitamina C por" +
                                                  "\n cada 100 gramos (alrededor del 68% de la ingesta diaria recomendada para la misma edad), son cruciales para reforzar el sistema inmunológico. Este es solo un     " +
                                                  "\n Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén" +
                                                  "\n correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su " +
                                                  "\n salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la " +
                                                  "\n app (Mi Vida) y espera que te mejores."); 
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visión borrosa, Pérdida de peso.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n Es recomendable que el niño, con una estatura de 1.65-1.80 m, realice cerca de 60 minutos de actividad física moderada a intensa diaria, como juegos activos, deportes" +
                                                  "\n o paseos en bicicleta, adaptándose siempre a su estado de salud y bajo supervisión. Esta actividad es crucial para el control del azúcar en sangre, mejorar la sensibilidad" +
                                                  "\n a la insulina y mantener un peso saludable, fundamentales en el manejo de la diabetes. También es fundamental el consumo diario de 3 a 3.5 Litros de agua al día      " +
                                                  "\n (doce a catorce vasos de tamaño regular), priorizando el agua natural sobre bebidas azucaradas, para mantener una hidratación adecuada y ayudar a los riñones a procesar el" +
                                                  "\n exceso de glucosa. POSIBLE TRATAMIENTO: Para la diabetes en niños de esta edad, el tratamiento suele incluir; manejo de la insulina (en caso de diabetes tipo 1, se requiere" +
                                                  "\n insulina inyectada para controlar los niveles de glucosa, por ejemplo, insulina glargina, una marca común es Lantus, o insulina aspart, una marca común es Novolog),     " +
                                                  "\n medicamentos orales (para diabetes tipo 2, como la metformina, una marca común es Glucophage o Dianben, siempre bajo prescripción médica), y un monitoreo constante de los" +
                                                  "\n niveles de glucosa en sangre con un glucómetro. Es vital seguir un plan de alimentación saludable y equilibrado, así como un control médico regular con un endocrinólogo  " +
                                                  "\n pediátrico. También es recomendable que el niño consuma alimentos que ayuden a la regulación del azúcar y fortalezcan su sistema inmune, tales como verduras no almidonadas" +
                                                  "\n como la col rizada (kale), rica en fibra y Vitamina C, o la espinaca, que aporta Magnesio y Vitamina K, nutrientes importantes para el metabolismo de la glucosa. Frutas con" +
                                                  "\n moderación como las manzanas y las peras, que son ricas en fibra (aproximadamente 2.4 gramos de fibra por cada 100 gramos en una manzana con cáscara) y antioxidantes,   " +
                                                  "\n contribuyen a una liberación más lenta de azúcares en la sangre. Las bayas (arándanos, moras) son también excelentes por su bajo índice glucémico y alto contenido de    " +
                                                  "\n antioxidantes, con los arándanos conteniendo alrededor de 14 mg de Vitamina C por cada 100 gramos (aproximadamente el 16% de la ingesta diaria recomendada para un niño  " +
                                                  "\n de 4-8 años). Las proteínas magras como el pollo, el pescado y las legumbres (lentejas, garbanzos) son importantes para mantener la saciedad y el control glucémico.     " +
                                                  "\n Los granos integrales como la avena y el pan integral proporcionan fibra y energía sostenida, ayudando a evitar picos de azúcar en sangre. Este es solo un Diagnóstico   " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para  " +
                                                  "\n ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta " +
                                                  "\n del Diagnostico no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresión en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n Es recomendable que el niño, con una estatura de 1.65-1.80 m, realice actividad física de forma controlada y supervisada, con calentamiento previo y enfriamiento " +
                                                  "\n posterior, evitando desencadenantes conocidos del asma (como alérgenos, aire frío o contaminado, o actividad física muy intensa sin preparación) y haciendo pausas" +
                                                  "\n si presenta síntomas. La cantidad de ejercicio debe ser adaptada a su capacidad y a la presencia de síntomas, pudiendo ser periodos de 30 a 60 minutos de actividad" +
                                                  "\n moderada en los días que se encuentre bien, pero siempre consultando al médico para un plan seguro y ajustado. También es crucial el consumo diario de 3 a 3.5 Litros" +
                                                  "\n de agua al día (doce a catorce vasos de tamaño regular) para ayudar a mantener las vías respiratorias hidratadas y las secreciones más fluidas, lo que facilita la " +
                                                  "\n respiración y puede prevenir el estrechamiento de los bronquios. POSIBLE TRATAMIENTO: Para el asma en niños de esta edad, el tratamiento suele incluir;            " +
                                                  "\n broncodilatadores de alivio rápido (para abrir las vías respiratorias durante un ataque, como el salbutamol, una marca común es Ventolin o Aerolin), corticosteroides" +
                                                  "\n inhalados (para el control a largo plazo y reducir la inflamación crónica de las vías respiratorias, como la fluticasona, una marca común es Flixotide, o la budesonida," +
                                                  "\n una marca común es Pulmicort), y en algunos casos, modificadores de leucotrienos (como el montelukast, una marca común es Singulair), que ayudan a controlar la     " +
                                                  "\n inflamación y los síntomas. Es fundamental seguir estrictamente el plan de acción para el asma indicado por el médico, usar los medicamentos preventivos regularmente" +
                                                  "\n y acudir a revisiones periódicas. También es recomendable que el niño consuma alimentos que puedan ayudar a reducir la inflamación y fortalecer el sistema inmune,  " +
                                                  "\n tales como pescados grasos (salmón, atún), ricos en ácidos grasos Omega-3, que poseen propiedades antiinflamatorias que pueden ser beneficiosas para las vías       " +
                                                  "\n respiratorias. Una amplia variedad de frutas y verduras de colores vivos, como los arándanos, con su alto contenido de antioxidantes que protegen las células;      " +
                                                  "\n la espinaca, que aporta Magnesio, un mineral que puede ayudar a relajar los músculos bronquiales, y Vitamina K; y el pimiento rojo, que ofrece una gran cantidad    " +
                                                  "\n de Vitamina C (alrededor de 127.7 mg por cada 100 gramos, lo que representa cerca del 142% de la ingesta diaria recomendada para un niño de 4-8 años), esencial     " +
                                                  "\n para la función inmunológica. También se beneficia de manzanas, que contienen quercetina, un flavonoide con propiedades antiinflamatorias que puede ser útil para   " +
                                                  "\n la salud pulmonar. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello   " +
                                                  "\n la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento    " +
                                                  "\n adecuado de su paciente, además por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes  " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, Pérdida de peso, Ganglios linfáticos inflamados, Erupción cutánea (Diarrea).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n Es recomendable que el niño, con una estatura de 1.65-1.80 m, realice actividad física moderada y adaptada a su estado de salud, bajo supervisión médica para" +
                                                  "\n evitar el agotamiento y proteger su sistema inmune, y siempre evitando deportes de contacto o actividades con alto riesgo de lesiones si su sistema inmune está" +
                                                  "\n comprometido. La actividad debe ser gradual, buscando idealmente periodos de 30 a 60 minutos de actividad moderada en los días que se encuentre bien, adaptándose" +
                                                  "\n a su energía y tolerando periodos de descanso. También es crucial el consumo diario de 3 a 3.5 Litros de agua al día (doce a catorce vasos de tamaño regular) para" +
                                                  "\n mantener una buena hidratación, fundamental para el bienestar general, el funcionamiento del cuerpo y el metabolismo de los medicamentos antirretrovirales.    " +
                                                  "\n POSIBLE TRATAMIENTO: Para el VIH/SIDA en niños de esta edad, el tratamiento principal es la terapia antirretroviral (TARV), que incluye una combinación de     " +
                                                  "\n medicamentos que trabajan para controlar la replicación del virus, mejorar la función inmunológica y prevenir el desarrollo de infecciones oportunistas. Estos " +
                                                  "\n medicamentos se eligen y ajustan específicamente por un médico especialista en VIH pediátrico, y es vital la adherencia estricta al régimen. Algunos ejemplos de" +
                                                  "\n medicamentos usados en TARV incluyen inhibidores de la transcriptasa inversa análogos de nucleósidos (como Zidovudina, o Retrovir), inhibidores de la transcriptasa" +
                                                  "\n inversa no análogos de nucleósidos (como Efavirenz, o Sustiva), e inhibidores de la proteasa (como Lopinavir/Ritonavir, o Kaletra). El tratamiento también incluye" +
                                                  "\n el manejo y prevención de infecciones oportunistas con antibióticos profilácticos (como el trimetoprim/sulfametoxazol, o Bactrim) para proteger contra ciertas    " +
                                                  "\n infecciones. Es fundamental el seguimiento médico constante. También es recomendable que el niño consuma alimentos que refuercen el sistema inmune, proporcionen  " +
                                                  "\n energía y ayuden a mantener un peso saludable, tales como proteínas de alto valor biológico (pollo, pescado, huevos, legumbres) que son cruciales para la reparación" +
                                                  "\n de tejidos y la función inmune; lácteos y alternativas enriquecidas con calcio y vitamina D para la salud ósea, la cual puede verse afectada por el virus o algunos " +
                                                  "\n tratamientos. Una amplia variedad de frutas y verduras de colores vivos, como los arándanos, ricos en antioxidantes que protegen las células; las naranjas, que     " +
                                                  "\n aportan una cantidad significativa de Vitamina C (alrededor de 53.2 mg por cada 100 gramos, lo que representa cerca del 59% de la ingesta diaria recomendada para un" +
                                                  "\n niño de 4-8 años), esencial para el sistema inmunitario; y el pimiento rojo, que contiene incluso más Vitamina C (aproximadamente 127.7 mg por cada 100 gramos, lo  " +
                                                  "\n que representa cerca del 142% de la ingesta diaria recomendada para la misma edad), y las espinacas, que contienen hierro y Vitamina A, importantes para la producción" +
                                                  "\n de células sanguíneas y la función inmune, son igualmente beneficiosas. Además, los granos integrales como la avena y el arroz integral, que proveen fibra y energía  " +
                                                  "\n sostenida, son importantes para una nutrición adecuada. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga" +
                                                  "\n esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor    " +
                                                  "\n seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a  " +
                                                  "\n su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreción anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n Es recomendable que el niño, con una estatura de 1.65-1.80 m, realice actividad física moderada y adaptada a su estado de salud, sin forzar su cuerpo. Dado que la " +
                                                  "\n gonorrea no suele afectar directamente la capacidad física a largo plazo (una vez tratada), en cuanto se sienta mejor y el médico lo autorice, puede buscar idealmente" +
                                                  "\n periodos de 30 a 60 minutos de actividad moderada a intensa diaria. Durante la infección y el tratamiento, la actividad puede ser más ligera, como paseos cortos.  " +
                                                  "\n También es crucial el consumo diario de 3 a 3.5 Litros de agua al día (doce a catorce vasos de tamaño regular) para mantener una buena hidratación, fundamental para" +
                                                  "\n apoyar el proceso de recuperación del cuerpo y el funcionamiento adecuado de los riñones, que procesarán los medicamentos. POSIBLE TRATAMIENTO: Para la gonorrea en " +
                                                  "\n niños de esta edad, el tratamiento es estrictamente con antibióticos, siempre bajo la supervisión y prescripción de un médico. La elección y dosis del antibiótico  " +
                                                  "\n dependerán de la edad, peso y la cepa específica de la bacteria. Es vital que se complete el ciclo de antibióticos tal como lo indique el profesional de la salud para" +
                                                  "\n asegurar la erradicación total de la infección y prevenir complicaciones. Ejemplos de antibióticos utilizados incluyen ceftriaxona (una marca común es Rocephin)    " +
                                                  "\n administrada por inyección, o azitromicina (una marca común es Zithromax) administrada oralmente. Es importante recordar que la gonorrea en niños requiere una evaluación" +
                                                  "\n médica inmediata, ya que puede tener implicaciones serias y, en algunos casos, puede ser indicativa de abuso. Además, es recomendable que el niño consuma alimentos que" +
                                                  "\n fortalezcan su sistema inmune y contribuyan a su recuperación general, como una amplia variedad de frutas y verduras frescas. Por ejemplo, el mango, que aporta      " +
                                                  "\n Vitamina C (aproximadamente 36.4 mg por cada 100 gramos, lo que representa cerca del 40% de la ingesta diaria recomendada para un niño de 4-8 años) y Vitamina A,    " +
                                                  "\n esenciales para la función inmunológica; o el pimiento rojo, que contiene una cantidad muy elevada de Vitamina C (alrededor de 127.7 mg por cada 100 gramos, lo que  " +
                                                  "\n representa cerca del 142% de la ingesta diaria recomendada para la misma edad). Las verduras de hoja verde oscuro como la espinaca, que proveen Vitamina K, Vitamina A" +
                                                  "\n y antioxidantes, que apoyan la salud general, también son beneficiosas. Las proteínas magras como el pollo, el pescado y las legumbres son esenciales para la        " +
                                                  "\n reparación de tejidos y el mantenimiento de la energía, y los granos integrales como la avena y el arroz integral, proveen fibra y energía sostenida para una        " +
                                                  "\n buena digestión y vitalidad. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y       " +
                                                  "\n que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en       " +
                                                  "\n el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su médico,   " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linfáticos inflamados, Úlceras o llagas dolorosas, Picazón o ardor, Dolor al orinar.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n Es recomendable que el niño, con una estatura de 1.65-1.80 m, realice actividad física moderada y adaptada a su estado de salud, especialmente evitando actividades" +
                                                  "\n que puedan irritar las lesiones si estas están presentes, como el roce excesivo o la sudoración intensa en el área afectada. Una vez que las lesiones remitan, puede" +
                                                  "\n retomar gradualmente la actividad física normal para su edad, buscando idealmente periodos de 30 a 60 minutos de actividad moderada a intensa diaria, siempre bajo  " +
                                                  "\n supervisión. También es crucial el consumo diario de 3 a 3.5 Litros de agua al día (doce a catorce vasos de tamaño regular) para mantener una buena hidratación,    " +
                                                  "\n lo cual es fundamental para el bienestar general, el funcionamiento óptimo del sistema inmune y la eliminación de toxinas. POSIBLE TRATAMIENTO: Para el herpes      " +
                                                  "\n genital en niños de esta edad, el tratamiento principal consiste en medicamentos antivirales que ayudan a controlar el brote, reducir la intensidad y duración de   " +
                                                  "\n los síntomas, y prevenir futuras recurrencias, aunque no eliminan el virus del cuerpo. Es fundamental que estos medicamentos sean prescritos y supervisados por un  " +
                                                  "\n médico, quien determinará la dosis adecuada según la edad y el peso del niño. Algunos ejemplos de medicamentos antivirales utilizados incluyen Aciclovir (una marca " +
                                                  "\n común es Zovirax), Valaciclovir (una marca común es Valtrex), y Famciclovir (una marca común es Famvir). Además del tratamiento antiviral, es importante mantener   " +
                                                  "\n una higiene adecuada de las lesiones y evitar tocarlas para prevenir la propagación. También es recomendable que el niño consuma alimentos que fortalezcan su sistema" +
                                                  "\n inmune y ayuden a la cicatrización, tales como alimentos ricos en lisina y bajos en arginina, ya que la lisina puede inhibir la replicación del virus del herpes,   " +
                                                  "\n presentes en lácteos, pescado y pollo, que aportan proteínas esenciales y Vitamina D (importante para la función inmune). Una variedad de frutas y verduras, como   " +
                                                  "\n el pimiento rojo, que contiene una cantidad muy elevada de Vitamina C (alrededor de 127.7 mg por cada 100 gramos, lo que representa cerca del 142% de la ingesta    " +
                                                  "\n diaria recomendada para un niño de 4-8 años), o las fresas, con cerca de 58.8 mg de Vitamina C por cada 100 gramos (aproximadamente el 65% de la ingesta diaria     " +
                                                  "\n recomendada para la misma edad), son excelentes fuentes de antioxidantes que apoyan la reparación celular y el fortalecimiento de las defensas del cuerpo. También  " +
                                                  "\n se beneficia de las verduras de hoja verde oscuro como la espinaca, que provee hierro y folato. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado" +
                                                  "\n no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un    " +
                                                  "\n Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnostico no le satisface" +
                                                  "\n del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Úlceras indoloras, Erupción cutánea, Dolor de cabeza, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Sífilis." +
                                                  "\n Es recomendable que el niño, con una estatura de 1.65-1.80 m, realice actividad física moderada y adaptada a su estado de salud, especialmente si la sífilis ha" +
                                                  "\n afectado alguna articulación o hueso, o si presenta fatiga. Durante el tratamiento y la recuperación, la actividad debe ser supervisada, buscando idealmente   " +
                                                  "\n periodos de 30 a 60 minutos de actividad moderada en los días que se encuentre bien, pero siempre con precaución y escuchando las señales del cuerpo. También  " +
                                                  "\n es crucial el consumo diario de 3 a 3.5 Litros de agua al día (doce a catorce vasos de tamaño regular) para mantener una buena hidratación, fundamental para el" +
                                                  "\n funcionamiento óptimo del cuerpo y el proceso de eliminación de toxinas durante el tratamiento. POSIBLE TRATAMIENTO: Para la sífilis en niños de esta edad, el " +
                                                  "\n tratamiento principal y más efectivo es con antibióticos, siendo la penicilina el medicamento de elección. La dosis y la duración del tratamiento serán determinadas" +
                                                  "\n estrictamente por un médico, y es fundamental completar el ciclo completo para asegurar la erradicación de la infección y prevenir complicaciones a largo plazo." +
                                                  "\n En casos de alergia a la penicilina, el médico puede considerar otras opciones como la ceftriaxona (una marca común es Rocephin). Es vital un seguimiento médico" +
                                                  "\n cercano después del tratamiento para confirmar la curación. También es recomendable que el niño consuma alimentos que fortalezcan su sistema inmune y apoyen la " +
                                                  "\n recuperación general, como proteínas magras (pollo, pescado, legumbres) que son cruciales para la reparación de tejidos y la producción de células inmunes; así " +
                                                  "\n como una amplia variedad de frutas y verduras frescas. Por ejemplo, el pimiento rojo, que aporta una gran cantidad de Vitamina C (alrededor de 127.7 mg por cada" +
                                                  "\n 100 gramos, lo que representa cerca del 142% de la ingesta diaria recomendada para un niño de 4-8 años), importante para la inmunidad. La espinaca, rica en folato" +
                                                  "\n (una vitamina B esencial para la división celular y la formación de glóbulos rojos, lo cual es importante si hay anemia asociada a la sífilis), y Vitamina A,   " +
                                                  "\n también contribuye a la salud general. Las naranjas, con su alto contenido de Vitamina C (aproximadamente 53.2 mg por cada 100 gramos, que representa cerca del " +
                                                  "\n 59% de la ingesta diaria recomendada para la misma edad), son excelentes para reforzar las defensas, y los arándanos son ricos en antioxidantes que protegen las" +
                                                  "\n células del daño. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello" +
                                                  "\n la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento" +
                                                  "\n adecuado de su paciente, además por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes" +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Pérdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n Es recomendable que el niño, con una estatura de 1.65-1.80 m, realice actividad física moderada y adaptada a su estado de salud y nivel de energía, especialmente" +
                                                  "\n durante la fase activa de la enfermedad y el tratamiento, cuando puede experimentar fatiga y dificultad respiratoria. Se deben evitar actividades extenuantes y  " +
                                                  "\n priorizar el reposo adecuado. A medida que su condición mejore, puede retomar gradualmente juegos ligeros, caminatas cortas o ejercicios de estiramiento, siempre" +
                                                  "\n bajo supervisión médica, buscando alcanzar periodos de 30 a 60 minutos de actividad moderada en los días que se encuentre bien, adaptándose a su tolerancia.     " +
                                                  "\n También es crucial el consumo diario de 3 a 3.5 Litros de agua al día (doce a catorce vasos de tamaño regular) para mantener una excelente hidratación, lo cual  " +
                                                  "\n es vital para el funcionamiento general del cuerpo, la eliminación de desechos y el apoyo a los órganos que metabolizan los medicamentos antituberculosos.       " +
                                                  "\n POSIBLE TRATAMIENTO: Para la tuberculosis en niños de esta edad, el tratamiento es un régimen prolongado de antibióticos antituberculosos, que se administra bajo" +
                                                  "\n estricta supervisión médica. Es absolutamente esencial que el niño complete el curso completo del tratamiento, que puede durar varios meses, para erradicar      " +
                                                  "\n la bacteria y prevenir la aparición de cepas resistentes. Los medicamentos comunes incluyen Isoniazida (una marca común es Laniazid), Rifampicina (una marca     " +
                                                  "\n común es Rifadin), Pirazinamida y Etambutol. La combinación y dosis exactas serán determinadas por el médico. Es fundamental un seguimiento médico constante     " +
                                                  "\n para monitorear la respuesta al tratamiento y los posibles efectos secundarios. También es recomendable que el niño consuma alimentos que fortalezcan su sistema " +
                                                  "\n inmune y le proporcionen la energía y nutrientes necesarios para combatir la infección y apoyar el tratamiento, como proteínas de alto valor biológico (huevo,   " +
                                                  "\n pollo, pescado, legumbres) que son cruciales para la reparación de tejidos y la producción de células inmunes. Las verduras de hoja verde oscuro como la espinaca," +
                                                  "\n que aporta Magnesio, hierro y folato (importante para la formación de glóbulos rojos, que pueden verse afectados por la TB o sus tratamientos); y las zanahorias, " +
                                                  "\n una excelente fuente de Vitamina A (alrededor de 835 µg por cada 100 gramos, lo que representa cerca del 167% de la ingesta diaria recomendada para un niño de 4-8" +
                                                  "\n años), esencial para la salud de las mucosas respiratorias y la función inmune, son altamente beneficiosas. Las frutas como el mango, que aporta Vitamina C      " +
                                                  "\n (aproximadamente 36.4 mg por cada 100 gramos, lo que representa cerca del 40% de la ingesta diaria recomendada para un niño de 4-8 años) y Vitamina A, así como el" +
                                                  "\n kiwi, rico en Vitamina C (aproximadamente 92.7 mg por cada 100 gramos, que representa cerca del 103% de la ingesta diaria recomendada para la misma edad), son   " +
                                                  "\n cruciales para reforzar el sistema inmunológico y actuar como antioxidantes. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al" +
                                                  "\n 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de  " +
                                                  "\n Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnostico no le satisface del todo " +
                                                  "\n se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchazón en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n Es recomendable que el niño, con una estatura de 1.65-1.80 m, realice actividad física suave y de bajo impacto adaptada a su nivel de dolor y la condición" +
                                                  "\n de sus articulaciones, buscando mantener la flexibilidad y fortalecer los músculos sin sobrecargar las zonas inflamadas. Actividades como la natación,    " +
                                                  "\n el ciclismo (con un sillín adecuado y baja resistencia) o ejercicios de estiramiento suaves pueden ser muy beneficiosas, siempre bajo supervisión y previa" +
                                                  "\n consulta con el médico o fisioterapeuta. La cantidad de ejercicio debe ser progresiva y ajustada a sus días buenos y malos, pero se debe fomentar el      " +
                                                  "\n movimiento regular para evitar la rigidez, idealmente buscando periodos de 30 a 60 minutos de actividad moderada en los días que se encuentre bien,       " +
                                                  "\n permitiendo periodos de descanso según su tolerancia. También es crucial el consumo diario de 3 a 3.5 Litros de agua al día (doce a catorce vasos de tamaño" +
                                                  "\n regular) para mantener una buena hidratación, lo cual es fundamental para la salud general, el funcionamiento óptimo de las articulaciones y el metabolismo" +
                                                  "\n de los medicamentos. POSIBLE TRATAMIENTO: Para la artritis en niños de esta edad, el tratamiento suele incluir; medicamentos antiinflamatorios no esteroideos" +
                                                  "\n (AINEs) para reducir el dolor y la inflamación (como el ibuprofeno, una marca común es Advil o Motrin, o el naproxeno, una marca común es Aproben),       " +
                                                  "\n fármacos antirreumáticos modificadores de la enfermedad (FARME) que actúan sobre el sistema inmune para controlar la progresión de la enfermedad          " +
                                                  "\n (como el metotrexato, una marca común es Trexall), y en algunos casos, medicamentos biológicos para la artritis juvenil idiopática grave. Es fundamental que" +
                                                  "\n estos tratamientos sean prescritos y supervisados por un reumatólogo pediatra, quien ajustará las dosis y monitoreará los efectos. También es recomendable" +
                                                  "\n que el niño consuma alimentos que ayuden a reducir la inflamación y fortalezcan su sistema inmune, tales como pescados grasos (salmón, sardinas), que son " +
                                                  "\n ricos en ácidos grasos Omega-3, potentes antiinflamatorios que pueden ser beneficiosos para la salud articular. Una amplia variedad de frutas y verduras  " +
                                                  "\n de colores vivos, como los arándanos, que aportan antioxidantes que protegen las células; la espinaca, rica en Magnesio, un mineral que puede contribuir  " +
                                                  "\n a la relajación muscular, y Vitamina K; y el pimiento rojo, que ofrece una gran cantidad de Vitamina C (alrededor de 127.7 mg por cada 100 gramos, lo que " +
                                                  "\n representa cerca del 142% de la ingesta diaria recomendada para un niño de 4-8 años), esencial para la función inmunológica. También se beneficia de las  " +
                                                  "\n cerezas, que contienen antocianinas, compuestos con potentes propiedades antiinflamatorias que podrían ayudar a reducir el dolor y la inflamación en las  " +
                                                  "\n articulaciones. Además, el aguacate proporciona grasas saludables y Vitamina E, importantes para la energía y la salud general. Este es solo un Diagnóstico" +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén   " +
                                                  "\n correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente,      " +
                                                  "\n además por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu     " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n Es recomendable que el niño, con una estatura de 1.65-1.80 m, especialmente durante la fase paroxística de tos severa, limite la actividad física a " +
                                                  "\n movimientos suaves y evite cualquier esfuerzo que pueda desencadenar ataques de tos. El reposo es crucial para su recuperación y para conservar energía." +
                                                  "\n A medida que mejore, puede retomar gradualmente actividades de bajo impacto como caminatas cortas o juegos tranquilos, siempre bajo supervisión, buscando" +
                                                  "\n alcanzar periodos de 30 a 60 minutos de actividad moderada en los días que se encuentre bien, adaptándose a su nivel de tolerancia. También es crucial el" +
                                                  "\n consumo diario de 3 a 3.5 Litros de agua al día (doce a catorce vasos de tamaño regular), o incluso más si presenta fiebre o dificultad para alimentarse," +
                                                  "\n para mantener una excelente hidratación y ayudar a fluidificar las secreciones respiratorias, lo cual es vital para su comodidad y recuperación.         " +
                                                  "\n POSIBLE TRATAMIENTO: Para la tosferina en niños de esta edad, el tratamiento principal es con antibióticos, que son más efectivos cuando se administran  " +
                                                  "\n en las primeras etapas de la enfermedad para acortar la duración de los síntomas y reducir la propagación. Los más comunes son los macrólidos, como la   " +
                                                  "\n azitromicina (una marca común es Zithromax), la eritromicina (una marca común es Pneumo-E o Eritrobase) o la claritromicina (una marca común es Klacid). " +
                                                  "\n Es fundamental que el niño complete el ciclo completo de antibióticos tal como lo indique el médico, incluso si los síntomas mejoran, para erradicar la  " +
                                                  "\n bacteria. En casos severos o en lactantes, podría requerirse hospitalización para el monitoreo y manejo de complicaciones. También es recomendable que   " +
                                                  "\n el niño consuma alimentos que fortalezcan su sistema inmune y le proporcionen nutrientes que ayuden a su recuperación, especialmente aquellos que son    " +
                                                  "\n fáciles de tragar y digestibles debido a los ataques de tos, tales como purés de frutas y verduras. Por ejemplo, el puré de calabaza, que aporta una     " +
                                                  "\n buena cantidad de Vitamina A (alrededor de 369 µg por cada 100 gramos, lo que representa cerca del 74% de la ingesta diaria recomendada para un niño     " +
                                                  "\n de 4-8 años), esencial para la salud de las mucosas respiratorias y la función inmune; o el puré de zanahoria, también rica en Vitamina A y antioxidantes." +
                                                  "\n Los plátanos son fáciles de comer y ricos en potasio (aproximadamente 358 mg por cada 100 gramos), un electrolito importante que puede ayudar a reponer  " +
                                                  "\n las pérdidas debido a la tos y al sudor, además de aportar energía. Las sopas y caldos suaves contribuyen a la hidratación y aportan nutrientes de forma " +
                                                  "\n líquida. También son valiosas las frutas suaves ricas en Vitamina C como la papaya, que contiene alrededor de 60.9 mg de Vitamina C por cada 100 gramos  " +
                                                  "\n (aproximadamente el 68% de la ingesta diaria recomendada para un niño de 4-8 años), y la guayaba, con niveles aún más altos de esta vitamina, crucial    " +
                                                  "\n para fortalecer el sistema inmunológico. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga" +
                                                  "\n esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para       " +
                                                  "\n establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnostico no le satisface del todo      " +
                                                  "\n se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchazón de las glándulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n Es recomendable que el niño, con una estatura de 1.65-1.80 m, especialmente durante la fase aguda de la enfermedad cuando puede presentar " +
                                                  "\n fiebre y malestar, limite la actividad física a un reposo adecuado, evitando esfuerzos que puedan aumentar el malestar o la hinchazón de las" +
                                                  "\n glándulas. A medida que su condición mejore y la fiebre ceda, puede retomar gradualmente actividades ligeras y juegos tranquilos, siempre bajo" +
                                                  "\n supervisión, buscando alcanzar periodos de 30 a 60 minutos de actividad moderada en los días que se encuentre bien. También es crucial el consumo" +
                                                  "\n diario de 3 a 3.5 Litros de agua al día (doce a catorce vasos de tamaño regular), o más si tiene fiebre o dificultad para tragar alimentos sólidos," +
                                                  "\n para mantener una excelente hidratación, lo cual es vital para su bienestar general, para ayudar a reducir la fiebre y para mantener las mucosas  " +
                                                  "\n hidratadas, aliviando la garganta. POSIBLE TRATAMIENTO: Para las paperas en niños de esta edad, el tratamiento es principalmente de soporte y para" +
                                                  "\n aliviar los síntomas, ya que es una infección viral y no existen medicamentos específicos para erradicar el virus. Se recomienda el reposo en cama," +
                                                  "\n la aplicación de compresas frías o calientes en las glándulas inflamadas para aliviar el dolor, y el uso de medicamentos para controlar la fiebre y" +
                                                  "\n el dolor, como el paracetamol (una marca común es Tempra o Tylenol) o el ibuprofeno (una marca común es Advil o Motrin). Es fundamental evitar el uso" +
                                                  "\n de aspirina en niños debido al riesgo de síndrome de Reye. También es recomendable que el niño consuma alimentos que fortalezcan su sistema inmune y" +
                                                  "\n sean fáciles de masticar y tragar debido a la hinchazón de las glándulas salivales, tales como purés y alimentos blandos. Puede incluir caldos     " +
                                                  "\n nutritivos y sopas suaves que aportan hidratación y energía. En cuanto a las frutas y verduras, la piña es una excelente opción, ya que contiene   " +
                                                  "\n bromelina, una enzima con propiedades antiinflamatorias que puede ayudar a reducir la hinchazón y el dolor, además de Vitamina C (aproximadamente  " +
                                                  "\n 47.8 mg por cada 100 gramos, lo que representa cerca del 53% de la ingesta diaria recomendada para un niño de 4-8 años), esencial para el sistema  " +
                                                  "\n inmunológico. El melón, fácil de digerir, es rico en Vitamina C (aproximadamente 36.7 mg por cada 100 gramos, que representa cerca del 41% de la   " +
                                                  "\n ingesta diaria recomendada para la misma edad) y Vitamina A, y también aporta una alta cantidad de agua, contribuyendo a la hidratación. El plátano," +
                                                  "\n fácil de digerir y rico en potasio (aproximadamente 358 mg por cada 100 gramos), un electrolito importante que ayuda a reponer las pérdidas y aporta" +
                                                  "\n energía. Finalmente, el aguacate proporciona grasas saludables y diversas vitaminas (como la E y K) que apoyan la función inmunológica y la salud  " +
                                                  "\n general. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por " +
                                                  "\n ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad" +
                                                  "\n en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar" +
                                                  "\n a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupción cutánea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n Es recomendable que el niño, con una estatura de 1.65-1.80 m, durante la fase aguda de la enfermedad cuando puede presentar fiebre, dolor muscular" +
                                                  "\n y articular, mantenga un reposo adecuado y evite la actividad física extenuante. A medida que sus síntomas mejoren y bajo supervisión, puede retomar" +
                                                  "\n gradualmente actividades ligeras y juegos tranquilos, buscando alcanzar periodos de 30 a 60 minutos de actividad moderada en los días que se encuentre" +
                                                  "\n bien, priorizando entornos donde se pueda minimizar la exposición a mosquitos. También es crucial el consumo diario de 3 a 3.5 Litros de agua al día" +
                                                  "\n (doce a catorce vasos de tamaño regular), o más si tiene fiebre o vómitos, para mantener una excelente hidratación y prevenir la deshidratación,    " +
                                                  "\n lo cual es vital para el bienestar general y el funcionamiento óptimo de todos sus sistemas corporales durante la recuperación.                     " +
                                                  "\n POSIBLE TRATAMIENTO: Para el Zika en niños de esta edad, el tratamiento es principalmente de soporte, ya que no existe un medicamento antiviral específico" +
                                                  "\n para curar la infección. El manejo se enfoca en aliviar los síntomas, lo que incluye el reposo, una buena hidratación y el uso de medicamentos para  " +
                                                  "\n controlar la fiebre y el dolor, como el paracetamol (una marca común es Tempra o Tylenol). Es fundamental evitar el uso de aspirina y otros AINEs    " +
                                                  "\n (antiinflamatorios no esteroideos como el ibuprofeno) hasta que se descarte la posibilidad de dengue, debido al riesgo de complicaciones hemorrágicas." +
                                                  "\n También es crucial proteger al niño de nuevas picaduras de mosquitos durante la enfermedad para evitar la transmisión del virus a otras personas.    " +
                                                  "\n Además, es recomendable que el niño consuma alimentos que fortalezcan su sistema inmune y le proporcionen energía, tales como caldos nutritivos y    " +
                                                  "\n sopas suaves que facilitan la hidratación y son fáciles de digerir. Las frutas tropicales como la papaya, que aporta una cantidad significativa de   " +
                                                  "\n Vitamina C (aproximadamente 60.9 mg por cada 100 gramos, lo que representa cerca del 68% de la ingesta diaria recomendada para un niño de 4-8 años)  " +
                                                  "\n y Vitamina A, y el mango, que también es rico en Vitamina C (aproximadamente 36.4 mg por cada 100 gramos, que representa cerca del 40% de la ingesta " +
                                                  "\n diaria recomendada para la misma edad) y antioxidantes, son excelentes para reforzar las defensas. El plátano, fácil de digerir, es rico en potasio  " +
                                                  "\n (aproximadamente 358 mg por cada 100 gramos), un electrolito importante que ayuda a reponer las pérdidas por fiebre o sudor. Las verduras de hoja verde" +
                                                  "\n oscuro como la espinaca, que provee Vitamina K, Vitamina A y hierro, contribuyen a la vitalidad y al buen funcionamiento general. Este es solo un    " +
                                                  "\n Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus   " +
                                                  "\n respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado" +
                                                  "\n de su paciente, además por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su medico," +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, Vómitos, Deshidratación, Dolor abdominal.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n Es recomendable que el niño, con una estatura de 1.65-1.80 m, mientras presente diarrea y vómitos, limite la actividad física a un reposo absoluto" +
                                                  "\n o muy suave, evitando cualquier esfuerzo que pueda empeorar la deshidratación o el malestar gastrointestinal. La prioridad es conservar energía   " +
                                                  "\n para la recuperación. A medida que los síntomas disminuyan y la hidratación mejore, puede retomar gradualmente juegos tranquilos y actividades    " +
                                                  "\n de bajo impacto, siempre bajo supervisión, buscando alcanzar periodos de 30 a 60 minutos de actividad moderada en los días que se encuentre bien. " +
                                                  "\n También es crucial el consumo diario de 3 a 3.5 Litros de agua al día (doce a catorce vasos de tamaño regular) en pequeñas tomas frecuentes,      " +
                                                  "\n preferiblemente mediante soluciones de rehidratación oral (como Electrolit pediátrico o Pedialyte), para reponer los líquidos y electrolitos      " +
                                                  "\n perdidos por la diarrea y el vómito, lo cual es vital para prevenir la deshidratación severa. POSIBLE TRATAMIENTO: Para el rotavirus en niños     " +
                                                  "\n de esta edad, el tratamiento es principalmente de soporte y se enfoca en la rehidratación, ya que no existe un medicamento antiviral específico   " +
                                                  "\n para el virus. La clave es prevenir y tratar la deshidratación mediante la administración de líquidos y electrolitos. En casa, se pueden usar     " +
                                                  "\n soluciones de rehidratación oral (SRO), y en casos de deshidratación severa, puede ser necesaria la hospitalización para la administración de     " +
                                                  "\n líquidos por vía intravenosa. Los medicamentos para detener la diarrea no suelen ser recomendados en niños con rotavirus. En cuanto a medicamentos" +
                                                  "\n para el malestar, el paracetamol (una marca común es Tempra o Tylenol) puede usarse para controlar la fiebre y aliviar las molestias, siempre bajo" +
                                                  "\n indicación médica. Es fundamental la supervisión médica. Además, es importante que el niño consuma alimentos que sean fáciles de digerir y ayuden " +
                                                  "\n a la recuperación de la flora intestinal, así como nutrientes que apoyen la función inmune, tales como arroz blanco o avena cocida, que aportan   " +
                                                  "\n energía y son suaves para el estómago; caldos de pollo o vegetales desgrasados que contribuyen a la hidratación y a la reposición de electrolitos." +
                                                  "\n El plátano, muy beneficioso por su contenido de potasio (aproximadamente 358 mg por cada 100 gramos), un electrolito clave que se pierde con la   " +
                                                  "\n diarrea y el vómito, ayudando a normalizar los niveles y aportar energía de fácil absorción. También se recomienda el puré de manzana (sin cáscara)," +
                                                  "\n que contiene pectina, una fibra soluble que puede ayudar a solidificar las heces y es suave para el sistema digestivo del niño. Otra verdura valiosa" +
                                                  "\n es la papa cocida y en puré, la cual es una buena fuente de potasio y carbohidratos complejos, que son de fácil digestión y aportan energía sin   " +
                                                  "\n irritar el intestino, favoreciendo la recuperación. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que" +
                                                  "\n el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico" +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnostico no le   " +
                                                  "\n satisface del todo se le recomienda mucho consultar a su medico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, Náuseas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n Es recomendable que el niño, con una estatura de 1.65-1.80 m, durante la fase aguda de la enfermedad cuando puede presentar fiebre, diarrea o " +
                                                  "\n síntomas neurológicos, mantenga un reposo adecuado y evite cualquier actividad física extenuante. El objetivo es preservar la energía y permitir" +
                                                  "\n que su cuerpo se recupere. A medida que los síntomas disminuyan y bajo supervisión médica, puede retomar gradualmente actividades tranquilas y de" +
                                                  "\n bajo impacto, buscando alcanzar periodos de 30 a 60 minutos de actividad moderada en los días que se encuentre bien. También es crucial el consumo" +
                                                  "\n diario de 3 a 3.5 Litros de agua al día (doce a catorce vasos de tamaño regular), especialmente si presenta fiebre o diarrea, para mantener una  " +
                                                  "\n excelente hidratación y reponer los líquidos perdidos, lo cual es vital para el bienestar general y el funcionamiento óptimo de sus sistemas     " +
                                                  "\n corporales mientras combate la infección. POSIBLE TRATAMIENTO: Para la listeriosis en niños de esta edad, el tratamiento principal consiste en   " +
                                                  "\n la administración de antibióticos, siendo la ampicilina (una marca común es Omnipen o Polycillin) o la penicilina (una marca común es Penprocilina" +
                                                  "\n o Bencilpenicilina Sódica) los más comúnmente utilizados, a menudo en combinación con otros antibióticos como la gentamicina. La elección, dosis y" +
                                                  "\n duración del tratamiento deben ser estrictamente determinadas por un médico, y es fundamental completar el ciclo completo de antibióticos para    " +
                                                  "\n erradicar la bacteria y prevenir complicaciones serias, como la meningitis. En casos graves, puede requerirse hospitalización para la administración" +
                                                  "\n intravenosa de medicamentos y monitoreo. Además, es recomendable que el niño consuma alimentos que refuercen su sistema inmune y apoyen su        " +
                                                  "\n recuperación general, priorizando aquellos que son fáciles de digerir si presenta síntomas gastrointestinales. Estos incluyen proteínas magras como" +
                                                  "\n el pollo cocido o el pescado (si su digestión lo permite), que aportan aminoácidos esenciales para la reparación de tejidos y la producción de    " +
                                                  "\n células inmunes; caldos y sopas nutritivas que contribuyen a la hidratación y al aporte de electrolitos. También son beneficiosas frutas ricas en " +
                                                  "\n Vitamina C como la papaya, que contiene aproximadamente 60.9 mg por cada 100 gramos (cerca del 68% de la ingesta diaria recomendada para un niño " +
                                                  "\n de 4-8 años), y las naranjas, que aportan alrededor de 53.2 mg de Vitamina C por cada 100 gramos (cerca del 59% de la ingesta diaria recomendada  " +
                                                  "\n para la misma edad), ambas potentes antioxidantes que fortalecen las defensas del cuerpo. Las verduras cocidas en puré, como la calabaza, que     " +
                                                  "\n aporta una buena cantidad de Vitamina A (alrededor de 369 µg por cada 100 gramos, lo que representa cerca del 74% de la ingesta diaria recomendada" +
                                                  "\n para un niño de 4-8 años), es crucial para la integridad de las mucosas y la función inmunitaria, y la espinaca, que provee hierro y folato,      " +
                                                  "\n importantes para la formación de glóbulos rojos. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el" +
                                                  "\n paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico  " +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnostico no le   " +
                                                  "\n satisface del todo se le recomienda mucho consultar a su medico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, Vómitos.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n Es recomendable que el niño, con una estatura de 1.65-1.80 m, durante la fase aguda de la enfermedad cuando presenta diarrea severa, dolor " +
                                                  "\n abdominal y fiebre, mantenga un reposo estricto, evitando cualquier actividad física que pueda agravar la deshidratación o el malestar gastrointestinal." +
                                                  "\n La prioridad es conservar energía. A medida que los síntomas disminuyan y la rehidratación sea efectiva, puede retomar gradualmente juegos tranquilos y " +
                                                  "\n actividades de bajo impacto, siempre bajo supervisión, buscando alcanzar periodos de 30 a 60 minutos de actividad moderada en los días que se encuentre bien." +
                                                  "\n También es crucial el consumo diario de 3 a 3.5 Litros de agua al día (doce a catorce vasos de tamaño regular) en pequeñas y frecuentes tomas, preferiblemente" +
                                                  "\n soluciones de rehidratación oral (como Electrolit pediátrico o Pedialyte), para reponer los líquidos y electrolitos perdidos por la diarrea y el vómito, lo cual" +
                                                  "\n es vital para prevenir la deshidratación severa y apoyar la función renal durante la infección. POSIBLE TRATAMIENTO: Para la shigelosis en niños de esta edad, " +
                                                  "\n el tratamiento principal es con antibióticos, ya que la shigelosis es una infección bacteriana que puede ser grave. Los antibióticos más comunes para esta   " +
                                                  "\n condición incluyen la azitromicina (una marca común es Zithromax), o las cefalosporinas de tercera generación como la ceftriaxona (una marca común es Rocephin)," +
                                                  "\n dependiendo de la resistencia bacteriana local. Es fundamental que el niño complete el ciclo completo de antibióticos tal como lo indique el médico, incluso si" +
                                                  "\n los síntomas mejoran, para erradicar la bacteria y evitar la propagación. Además del tratamiento antibiótico, el manejo de la deshidratación mediante soluciones" +
                                                  "\n de rehidratación oral es esencial. Los medicamentos para frenar la diarrea generalmente no se recomiendan. Es importante también que el niño consuma alimentos " +
                                                  "\n que sean fáciles de digerir, suaves para el sistema gastrointestinal y que aporten nutrientes para fortalecer su sistema inmune, como arroz blanco o avena cocida," +
                                                  "\n que son fuente de energía y suaves para el estómago; caldos de pollo o vegetales desgrasados que contribuyen a la hidratación y a la reposición de electrolitos.  " +
                                                  "\n El plátano, muy beneficioso por su contenido de potasio (aproximadamente 358 mg por cada 100 gramos), un electrolito clave que se pierde con la diarrea y el vómito," +
                                                  "\n ayudando a normalizar los niveles y aportar energía de fácil absorción. También se recomienda el puré de manzana (sin cáscara), que contiene pectina, una fibra   " +
                                                  "\n soluble que puede ayudar a solidificar las heces y es suave para el sistema digestivo del niño. Otra verdura valiosa es la papa cocida y en puré, la cual es una  " +
                                                  "\n buena fuente de potasio y carbohidratos complejos, que son de fácil digestión y aportan energía sin irritar el intestino, favoreciendo la recuperación de la mucosa" +
                                                  "\n intestinal dañada. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la" +
                                                  "\n enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado" +
                                                  "\n de su paciente, además por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su medico, Angel L Montes agradece tu" +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos crónica, Producción excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad Pulmonar Obstructiva Crónica (EPOC)." +
                                                  "\n Es recomendable que el niño, con una estatura de 1.65-1.80 m, realice ejercicios de respiración y actividades físicas de bajo impacto adaptadas a su capacidad pulmonar" +
                                                  "\n y estado general, bajo supervisión médica. Se deben evitar ambientes con humo o contaminantes, y priorizar actividades que no causen dificultad respiratoria excesiva. " +
                                                  "\n Caminatas cortas y suaves, juegos tranquilos o ejercicios de brazos que no agiten demasiado, pueden ser beneficiosos, buscando mantener la movilidad y la fuerza muscular" +
                                                  "\n sin agotar al niño, con el objetivo de alcanzar periodos de 30 a 60 minutos de actividad moderada en los días que se encuentre bien, pero siempre con periodos de descanso." +
                                                  "\n También es crucial el consumo diario de 3 a 3.5 Litros de agua al día (doce a catorce vasos de tamaño regular) para mantener las secreciones pulmonares más fluidas y    " +
                                                  "\n facilitar su expectoración, lo cual es vital para una mejor respiración y para prevenir infecciones. POSIBLE TRATAMIENTO: Para la EPOC en niños (que es rara y a menudo  " +
                                                  "\n asociada a condiciones congénitas, exposiciones ambientales severas tempranas o infecciones recurrentes), el tratamiento se enfoca en manejar los síntomas, prevenir     " +
                                                  "\n exacerbaciones y mejorar la función pulmonar. Esto incluye el uso de broncodilatadores (como el salbutamol, una marca común es Ventolin o Aerolin, para abrir las vías   " +
                                                  "\n respiratorias), corticosteroides inhalados (como la fluticasona, una marca común es Flixotide, para reducir la inflamación), y en algunos casos, oxigenoterapia si hay bajos" +
                                                  "\n niveles de oxígeno. La terapia respiratoria y la fisioterapia pulmonar son fundamentales. Es esencial la eliminación de la exposición a irritantes pulmonares, como el humo " +
                                                  "\n de tabaco. Además, es recomendable que el niño consuma alimentos que fortalezcan su sistema inmune y le proporcionen energía de manera sostenible, priorizando aquellos que " +
                                                  "\n no causen distensión abdominal que pueda dificultar la respiración. Estos incluyen proteínas magras como el pollo o el pescado, que aportan aminoácidos esenciales para la  " +
                                                  "\n reparación de tejidos y el mantenimiento de la masa muscular, crucial en pacientes con EPOC; carbohidratos complejos de liberación lenta como la avena o el arroz integral, " +
                                                  "\n que proporcionan energía sin picos glucémicos; y una variedad de verduras de hoja verde oscuro como la acelga, que aporta Vitamina K, Vitamina A y antioxidantes, que pueden" +
                                                  "\n ayudar a reducir la inflamación pulmonar, y el pimiento rojo, que ofrece una gran cantidad de Vitamina C (alrededor de 127.7 mg por cada 100 gramos, lo que representa cerca" +
                                                  "\n del 142% de la ingesta diaria recomendada para un niño de 4-8 años), esencial para la función inmunológica y como antioxidante. Las frutas como las fresas, que contienen   " +
                                                  "\n cerca de 58.8 mg de Vitamina C por cada 100 gramos (aproximadamente el 65% de la ingesta diaria recomendada para la misma edad), y las manzanas, que contienen quercetina,  " +
                                                  "\n un flavonoide con propiedades antiinflamatorias que pueden ser útiles para la salud pulmonar, también son beneficiosas. Este es solo un Diagnóstico predeterminado lógico,  " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer   " +
                                                  "\n más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnostico no le satisface" +
                                                  "\n del todo se le recomienda mucho consultar a su medico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreción anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n Es recomendable que el niño, con una estatura de 1.65-1.80 m, mientras recibe tratamiento, mantenga una actividad física normal adaptada a su estado de salud, evitando cualquier" +
                                                  "\n molestia o irritación en el área afectada si presenta síntomas. La Clamidia no suele afectar directamente la capacidad física a largo plazo. Una vez que el tratamiento sea efectivo" +
                                                  "\n y los síntomas hayan desaparecido, puede seguir con la actividad física recomendada para su edad, buscando idealmente periodos de 30 a 60 minutos de actividad moderada a intensa diaria." +
                                                  "\n También es crucial el consumo diario de 3 a 3.5 Litros de agua al día (doce a catorce vasos de tamaño regular) para mantener una buena hidratación, lo cual es fundamental para el    " +
                                                  "\n bienestar general, el funcionamiento óptimo de sus sistemas corporales y para apoyar la eliminación de los medicamentos del organismo. POSIBLE TRATAMIENTO: Para la clamidia en niños " +
                                                  "\n de esta edad, el tratamiento principal es con antibióticos, los cuales son muy efectivos para erradicar la infección. La elección y la dosis del antibiótico serán determinadas       " +
                                                  "\n estrictamente por un médico, quien considerará la edad y el peso del niño. Es fundamental completar el ciclo completo de antibióticos tal como se indique, incluso si los síntomas    " +
                                                  "\n mejoran, para asegurar la eliminación total de la bacteria y prevenir reinfecciones o complicaciones. Los antibióticos comúnmente usados incluyen la azitromicina (una marca común es " +
                                                  "\n Zithromax) o la eritromicina (una marca común es Pneumo-E o Eritrobase). Es importante recordar que la clamidia en niños puede requerir una evaluación médica inmediata, ya que en algunos" +
                                                  "\n casos puede ser indicativa de abuso. Además, es recomendable que el niño consuma alimentos que fortalezcan su sistema inmune y apoyen la recuperación general, como fuentes de probióticos" +
                                                  "\n (si son tolerados, como yogur natural si no hay contraindicaciones), que pueden ayudar a mantener un equilibrio saludable de la flora intestinal, especialmente después de la administración" +
                                                  "\n de antibióticos. Las frutas como las fresas, que contienen cerca de 58.8 mg de Vitamina C por cada 100 gramos (aproximadamente el 65% de la ingesta diaria recomendada para un niño       " +
                                                  "\n de 4-8 años), o las naranjas, que aportan alrededor de 53.2 mg de Vitamina C por cada 100 gramos (cerca del 59% de la ingesta diaria recomendada para la misma edad), son excelentes fuentes" +
                                                  "\n de esta vitamina, crucial para reforzar las defensas del cuerpo. Las verduras de hoja verde oscuro como la espinaca, rica en folato y Vitamina K, y el pimiento rojo, que provee Vitamina A" +
                                                  "\n y antioxidantes, también contribuyen a la vitalidad y al buen funcionamiento general del sistema inmune, favoreciendo la recuperación. Este es solo un Diagnóstico predeterminado lógico,  " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un        " +
                                                  "\n Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnostico no le satisface del todo se le       " +
                                                  "\n recomienda mucho consultar a su medico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Náuseas, Dolor de cabeza severo, Rigidez en el cuello, Confusión.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n Es recomendable que el niño, con una estatura de 1.65-1.80 m, durante la fase aguda de la enfermedad, mantenga un reposo estricto en cama, ya que la meningitis es una condición grave" +
                                                  "\n que requiere mínima estimulación y máxima conservación de energía para la recuperación cerebral y general del cuerpo. Cualquier actividad física debe ser evitada por completo en este" +
                                                  "\n periodo. Una vez que la fase aguda haya pasado y bajo estricta supervisión médica, la rehabilitación o la reintroducción gradual de movimientos muy suaves solo se realizará si no hay " +
                                                  "\n secuelas. También es crucial el consumo diario de 3 a 3.5 Litros de agua al día (doce a catorce vasos de tamaño regular) en tomas pequeñas y frecuentes, preferiblemente por vía intravenosa" +
                                                  "\n si el niño no puede beber, para mantener una hidratación óptima y asegurar el correcto funcionamiento de los órganos, especialmente los riñones, que procesarán los medicamentos, y para " +
                                                  "\n ayudar a controlar la fiebre. POSIBLE TRATAMIENTO: Para la meningitis bacteriana en niños de esta edad, el tratamiento es una emergencia médica y consiste en la administración inmediata" +
                                                  "\n de antibióticos intravenosos de amplio espectro para combatir la infección. La elección del antibiótico dependerá de la edad del niño, el tipo de bacteria sospechada y los patrones de  " +
                                                  "\n resistencia locales, y será determinada por un médico especialista. Es vital que el tratamiento antibiótico se inicie lo antes posible y se complete en su totalidad para prevenir       " +
                                                  "\n complicaciones graves como daño cerebral, pérdida de audición o incluso la muerte. Algunos antibióticos comunes incluyen la ceftriaxona (una marca común es Rocephin) o la ampicilina    " +
                                                  "\n (una marca común es Omnipen o Polycillin), a veces combinados con vancomicina (una marca común es Vancocin). Además de los antibióticos, se pueden usar corticosteroides (como la dexametasona," +
                                                  "\n una marca común es Decadron) para reducir la inflamación cerebral y prevenir secuelas neurológicas, siempre bajo indicación médica. Es fundamental el monitoreo constante en un entorno  " +
                                                  "\n hospitalario. En cuanto a la alimentación, una vez que el niño pueda tolerar la vía oral, es recomendable que consuma alimentos que sean fáciles de digerir y nutritivos para apoyar la  " +
                                                  "\n recuperación del sistema nervioso y el fortalecimiento del sistema inmune. Esto incluye caldos y sopas suaves que aportan líquidos y electrolitos; purés de verduras como la calabaza,   " +
                                                  "\n que aporta una buena cantidad de Vitamina A (alrededor de 369 µg por cada 100 gramos, lo que representa cerca del 74% de la ingesta diaria recomendada para un niño de 4-8 años), esencial" +
                                                  "\n para la recuperación de las mucosas y la visión; y frutas blandas como el plátano, que aporta potasio (aproximadamente 358 mg por cada 100 gramos), un electrolito vital para la función  " +
                                                  "\n nerviosa y muscular. También son beneficiosos los alimentos ricos en antioxidantes como el aguacate, que provee grasas saludables y Vitamina E, que pueden proteger las células neuronales" +
                                                  "\n del daño oxidativo. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus    " +
                                                  "\n respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud " +
                                                  "\n si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su medico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, Pérdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, Pérdida de apetito.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Cáncer." +
                                                  "\n Es recomendable que el niño, con una estatura de 1.65-1.80 m, cuya actividad física debe ser siempre supervisada y adaptada a su estado de salud, energía y fase del tratamiento oncológico," +
                                                  "\n mantenga periodos de descanso adecuados y evite cualquier actividad extenuante o que pueda comprometer su sistema inmune. Se deben priorizar actividades de bajo impacto que fomenten la    " +
                                                  "\n movilidad y el bienestar, como caminatas cortas y suaves, juegos tranquilos o ejercicios de estiramiento muy ligeros, siempre que el médico lo autorice y según su tolerancia. El objetivo  " +
                                                  "\n es mantener la fuerza muscular y mejorar la calidad de vida sin sobrecargar su cuerpo, buscando alcanzar periodos de 30 a 60 minutos de actividad moderada en los días que se encuentre bien," +
                                                  "\n pero con flexibilidad y respetando sus límites. También es crucial el consumo diario de 3 a 3.5 Litros de agua al día (doce a catorce vasos de tamaño regular), o más si tiene fiebre, vómitos" +
                                                  "\n o diarrea como efectos secundarios del tratamiento, para mantener una excelente hidratación, lo cual es vital para el funcionamiento óptimo de sus órganos, la eliminación de toxinas y el    " +
                                                  "\n apoyo al metabolismo de los medicamentos. POSIBLE TRATAMIENTO: Para el cáncer en niños de esta edad, el tratamiento es altamente individualizado y complejo, dependiendo del tipo específico  " +
                                                  "\n de cáncer, su etapa y la salud general del niño. Generalmente, implica una combinación de quimioterapia (medicamentos que matan las células cancerosas, como la vincristina, una marca común  " +
                                                  "\n es Oncovin, o el ciclofosfamida, una marca común es Cytoxan), radioterapia (uso de radiación para destruir células cancerosas), cirugía (para extirpar tumores), e incluso inmunoterapia o    " +
                                                  "\n terapia dirigida. Es fundamental que el tratamiento sea manejado por un equipo multidisciplinario de oncólogos pediátricos. Además del tratamiento oncológico, se utilizan medicamentos de    " +
                                                  "\n soporte para manejar los efectos secundarios, como antieméticos para las náuseas (como el ondansetrón, una marca común es Zofran), analgésicos para el dolor (como el paracetamol, una marca  " +
                                                  "\n común es Tempra o Tylenol), y factores estimulantes de colonias para apoyar la médula ósea. En cuanto a la alimentación, es recomendable que el niño consuma alimentos que fortalezcan su     " +
                                                  "\n sistema inmune, le proporcionen energía y le ayuden a tolerar mejor el tratamiento, priorizando aquellos que sean nutritivos y de fácil digestión. Esto incluye proteínas de alto valor biológico" +
                                                  "\n (pollo, pescado, huevos, legumbres) que son esenciales para la reparación celular y el mantenimiento de la masa muscular, crucial durante y después de la quimioterapia. Las verduras de hoja " +
                                                  "\n verde oscuro como la col rizada (kale), que aporta Vitamina K, Vitamina A y antioxidantes, que pueden ayudar a reducir la inflamación y proteger las células, y el pimiento rojo, que ofrece  " +
                                                  "\n una gran cantidad de Vitamina C (alrededor de 127.7 mg por cada 100 gramos, lo que representa cerca del 142% de la ingesta diaria recomendada para un niño de 4-8 años), esencial para la     " +
                                                  "\n función inmunológica. Las frutas de colores vivos como la granada, rica en antioxidantes (como punicalaginas) que pueden ofrecer propiedades protectoras, y las uvas, que contienen resveratrol," +
                                                  "\n un compuesto con potencial antiinflamatorio. El aguacate proporciona grasas saludables y Vitamina E, importantes para la energía y la salud general. Este es solo un Diagnóstico predeterminado " +
                                                  "\n lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un     " +
                                                  "\n Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda " +
                                                  "\n mucho consultar a su medico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                        }
                
                        if(EstaturaMasculino.equals("1.55-1.70 m")){
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n Es recomendable que el niño, con una estatura de 1.55-1.70 m, realice cerca de 60 minutos de actividad física moderada a         " +
                                                  "\n intensa diaria, incluyendo juegos activos o deportes, siempre adaptando la intensidad a su estado de salud general durante       " +
                                                  "\n el periodo de enfermedad. Esto es crucial para mantener un sistema inmune fuerte. También es recomendable el consumo diario      " +
                                                  "\n de 2.5 a 3 Litros de agua al día (diez a doce vasos de tamaño regular) para mantener una excelente hidratación, lo cual          " +
                                                  "\n ayuda a fluidificar las secreciones respiratorias y a controlar la fiebre. POSIBLE TRATAMIENTO: Para la gripe en niños de        " +
                                                  "\n esta edad, el tratamiento suele incluir; medicamentos para reducir la fiebre y aliviar los síntomas, como el paracetamol         " +
                                                  "\n (una marca común es Tempra o Tylenol) o el ibuprofeno (una marca común es Advil o Motrin). En algunos casos, si se diagnostica   " +
                                                  "\n a tiempo (dentro de las primeras 48 horas de los síntomas), el médico puede prescribir antivirales específicos contra la gripe   " +
                                                  "\n como el oseltamivir (una marca común es Tamiflu). Es fundamental seguir las indicaciones del médico al pie de la letra. También  " +
                                                  "\n es recomendable que el niño consuma alimentos que fortalezcan su sistema inmune y aporten nutrientes para la recuperación,         " +
                                                  "\n tales como frutas ricas en Vitamina C como las guayabas, que contienen una cantidad muy alta de esta vitamina (alrededor de        " +
                                                  "\n 228.3 mg por cada 100 gramos, lo que representa cerca del 254% de la ingesta diaria recomendada para un niño de 4-8 años),         " +
                                                  "\n o las naranjas, que aportan aproximadamente 53.2 mg por cada 100 gramos (cerca del 59% de la ingesta diaria recomendada para       " +
                                                  "\n la misma edad), ambos potentes antioxidantes que apoyan las defensas del cuerpo. También son beneficiosos los vegetales de hoja    " +
                                                  "\n verde oscuro como el kale (col rizada), que provee Vitamina A y Vitamina K, importantes para la salud de las mucosas y la función  " +
                                                  "\n inmune; y el jengibre, que puede consumirse en infusiones y posee propiedades antiinflamatorias que pueden ayudar a aliviar el     " +
                                                  "\n malestar. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa     " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de   " +
                                                  "\n Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del         " +
                                                  "\n Diagnostico no le satisface del todo se le recomienda mucho consultar a su medico, Angel L Montes agradece tu visita a la app      " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                               textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumonía." +
                                                  "\n Es recomendable que el niño, con una estatura de 1.55-1.70 m, realice actividad física moderada según su capacidad y estado de recuperación, siempre supervisada y evitando esfuerzos" +
                                                  "\n excesivos o juegos que agiten demasiado sus vías respiratorias, especialmente si aún presenta síntomas. Una vez que su condición mejore, puede retomar gradualmente actividades como " +
                                                  "\n caminatas al aire libre, bicicleta o juegos tranquilos, buscando cerca de 60 minutos de actividad física moderada a intensa diaria. También es crucial el consumo diario de 2.5 a 3  " +
                                                  "\n Litros de agua al día (diez a doce vasos de tamaño regular), especialmente si tiene fiebre, para ayudar a fluidificar las secreciones pulmonares y prevenir la deshidratación, facilitando" +
                                                  "\n su expectoración. POSIBLE TRATAMIENTO: Para la neumonía en niños de esta edad, el tratamiento suele incluir; antibióticos (si la causa es bacteriana, como la amoxicilina, una marca común" +
                                                  "\n es Amoxil o Clamoxil, o la azitromicina, una marca común es Zithromax, siempre bajo prescripción médica estricta), medicamentos para reducir la fiebre y aliviar el dolor (como el   " +
                                                  "\n paracetamol, una marca común es Tempra o Tylenol, o el ibuprofeno, una marca común es Advil o Motrin), y en algunos casos, oxigenoterapia si la saturación de oxígeno es baja. Es    " +
                                                  "\n fundamental seguir las indicaciones del médico al pie de la letra y completar el ciclo de antibióticos aunque el niño parezca mejor. También es recomendable que el niño consuma     " +
                                                  "\n alimentos que fortalezcan su sistema inmune y le aporten energía, tales como caldos nutritivos y sopas suaves que, además de ser fáciles de digerir, contribuyen a la hidratación    " +
                                                  "\n y al aporte de electrolitos. Las verduras de hoja verde oscuro como el kale (col rizada), que aporta Vitamina A y Vitamina K, o el pimiento rojo, que ofrece una gran cantidad de    " +
                                                  "\n Vitamina C (alrededor de 127.7 mg por cada 100 gramos, lo que representa cerca del 142% de la ingesta diaria recomendada para un niño de 4-8 años), son excelentes fuentes de antioxidantes" +
                                                  "\n que apoyan la salud pulmonar. Las frutas como las fresas, que contienen cerca de 58.8 mg de Vitamina C por cada 100 gramos (aproximadamente el 65% de la ingesta diaria recomendada  " +
                                                  "\n para la misma edad), y las papayas, que ofrecen aproximadamente 60.9 mg de Vitamina C por cada 100 gramos (alrededor del 68% de la ingesta diaria recomendada para la misma edad),   " +
                                                  "\n son cruciales para reforzar el sistema inmunológico. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad " +
                                                  "\n y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado" +
                                                  "\n de su paciente, además por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su medico, Angel L Montes agradece tu visita a la app" +
                                                  "\n (Mi Vida) y espera que te mejores."); 
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visión borrosa, Pérdida de peso.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n Es recomendable que el niño, con una estatura de 1.55-1.70 m, realice cerca de 60 minutos de actividad física moderada a intensa diaria, como juegos activos, deportes o paseos" +
                                                  "\n en bicicleta, adaptándose siempre a su estado de salud y bajo supervisión. Esta actividad es crucial para el control del azúcar en sangre, mejorar la sensibilidad a la insulina" +
                                                  "\n y mantener un peso saludable, fundamentales en el manejo de la diabetes. También es fundamental el consumo diario de 2.5 a 3 Litros de agua al día (diez a doce vasos de tamaño " +
                                                  "\n regular), priorizando el agua natural sobre bebidas azucaradas, para mantener una hidratación adecuada y ayudar a los riñones a procesar el exceso de glucosa.                  " +
                                                  "\n POSIBLE TRATAMIENTO: Para la diabetes en niños de esta edad, el tratamiento suele incluir; manejo de la insulina (en caso de diabetes tipo 1, se requiere insulina inyectada para" +
                                                  "\n controlar los niveles de glucosa, por ejemplo, insulina glargina, una marca común es Lantus, o insulina aspart, una marca común es Novolog), medicamentos orales (para diabetes " +
                                                  "\n tipo 2, como la metformina, una marca común es Glucophage o Dianben, siempre bajo prescripción médica), y un monitoreo constante de los niveles de glucosa en sangre con un glucómetro." +
                                                  "\n Es vital seguir un plan de alimentación saludable y equilibrado, así como un control médico regular con un endocrinólogo pediátrico. También es recomendable que el niño consuma" +
                                                  "\n alimentos que ayuden a la regulación del azúcar y fortalezcan su sistema inmune, tales como verduras no almidonadas como la col rizada (kale), rica en fibra y Vitamina C, o la " +
                                                  "\n espinaca, que aporta Magnesio y Vitamina K, nutrientes importantes para el metabolismo de la glucosa. Frutas con moderación como las manzanas y las peras, que son ricas en fibra" +
                                                  "\n (aproximadamente 2.4 gramos de fibra por cada 100 gramos en una manzana con cáscara) y antioxidantes, contribuyen a una liberación más lenta de azúcares en la sangre. Las bayas " +
                                                  "\n (arándanos, moras) son también excelentes por su bajo índice glucémico y alto contenido de antioxidantes, con los arándanos conteniendo alrededor de 14 mg de Vitamina C por cada" +
                                                  "\n 100 gramos (aproximadamente el 16% de la ingesta diaria recomendada para un niño de 4-8 años). Las proteínas magras como el pollo, el pescado y las legumbres (lentejas, garbanzos)" +
                                                  "\n son importantes para mantener la saciedad y el control glucémico. Los granos integrales como la avena y el pan integral proporcionan fibra y energía sostenida, ayudando a evitar" +
                                                  "\n picos de azúcar en sangre. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la     " +
                                                  "\n enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su     " +
                                                  "\n paciente, además por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su medico, Angel L Montes agradece tu visita a la app  " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresión en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n Es recomendable que el niño, con una estatura de 1.55-1.70 m, realice actividad física de forma controlada y supervisada, con calentamiento previo y enfriamiento posterior," +
                                                  "\n evitando desencadenantes conocidos del asma (como alérgenos, aire frío o contaminado, o actividad física muy intensa sin preparación) y haciendo pausas si presenta síntomas." +
                                                  "\n La cantidad de ejercicio debe ser adaptada a su capacidad y a la presencia de síntomas, pudiendo ser periodos de 30 a 60 minutos de actividad moderada en los días que se   " +
                                                  "\n encuentre bien, pero siempre consultando al médico para un plan seguro y ajustado. También es crucial el consumo diario de 2.5 a 3 Litros de agua al día (diez a doce vasos " +
                                                  "\n de tamaño regular) para ayudar a mantener las vías respiratorias hidratadas y las secreciones más fluidas, lo que facilita la respiración y puede prevenir el estrechamiento" +
                                                  "\n de los bronquios. POSIBLE TRATAMIENTO: Para el asma en niños de esta edad, el tratamiento suele incluir; broncodilatadores de alivio rápido (para abrir las vías respiratorias" +
                                                  "\n durante un ataque, como el salbutamol, una marca común es Ventolin o Aerolin), corticosteroides inhalados (para el control a largo plazo y reducir la inflamación crónica de" +
                                                  "\n las vías respiratorias, como la fluticasona, una marca común es Flixotide, o la budesonida, una marca común es Pulmicort), y en algunos casos, modificadores de leucotrienos" +
                                                  "\n (como el montelukast, una marca común es Singulair), que ayudan a controlar la inflamación y los síntomas. Es fundamental seguir estrictamente el plan de acción para el asma" +
                                                  "\n indicado por el médico, usar los medicamentos preventivos regularmente y acudir a revisiones periódicas. También es recomendable que el niño consuma alimentos que puedan ayudar" +
                                                  "\n a reducir la inflamación y fortalecer el sistema inmune, tales como pescados grasos (salmón, atún), ricos en ácidos grasos Omega-3, que poseen propiedades antiinflamatorias que" +
                                                  "\n pueden ser beneficiosas para las vías respiratorias. Una amplia variedad de frutas y verduras de colores vivos, como los arándanos, con su alto contenido de antioxidantes que " +
                                                  "\n protegen las células; la espinaca, que aporta Magnesio, un mineral que puede ayudar a relajar los músculos bronquiales, y Vitamina K; y el pimiento rojo, que ofrece una gran  " +
                                                  "\n cantidad de Vitamina C (alrededor de 127.7 mg por cada 100 gramos, lo que representa cerca del 142% de la ingesta diaria recomendada para un niño de 4-8 años), esencial para la" +
                                                  "\n función inmunológica. También se beneficia de manzanas, que contienen quercetina, un flavonoide con propiedades antiinflamatorias que puede ser útil para la salud pulmonar.   " +
                                                  "\n Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas  " +
                                                  "\n estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud " +
                                                  "\n si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su medico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, Pérdida de peso, Ganglios linfáticos inflamados, Erupción cutánea (Diarrea).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n Es recomendable que el niño, con una estatura de 1.55-1.70 m, realice actividad física moderada y adaptada a su estado de salud, bajo supervisión médica para evitar el" +
                                                  "\n agotamiento y proteger su sistema inmune, y siempre evitando deportes de contacto o actividades con alto riesgo de lesiones si su sistema inmune está comprometido. La " +
                                                  "\n actividad debe ser gradual, buscando idealmente periodos de 30 a 60 minutos de actividad moderada en los días que se encuentre bien, adaptándose a su energía y tolerando" +
                                                  "\n periodos de descanso. También es crucial el consumo diario de 2.5 a 3 Litros de agua al día (diez a doce vasos de tamaño regular) para mantener una buena hidratación, " +
                                                  "\n fundamental para el bienestar general, el funcionamiento del cuerpo y el metabolismo de los medicamentos antirretrovirales. POSIBLE TRATAMIENTO: Para el VIH/SIDA en niños" +
                                                  "\n de esta edad, el tratamiento principal es la terapia antirretroviral (TARV), que incluye una combinación de medicamentos que trabajan para controlar la replicación del" +
                                                  "\n virus, mejorar la función inmunológica y prevenir el desarrollo de infecciones oportunistas. Estos medicamentos se eligen y ajustan específicamente por un médico      " +
                                                  "\n especialista en VIH pediátrico, y es vital la adherencia estricta al régimen. Algunos ejemplos de medicamentos usados en TARV incluyen inhibidores de la transcriptasa " +
                                                  "\n inversa análogos de nucleósidos (como Zidovudina, o Retrovir), inhibidores de la transcriptasa inversa no análogos de nucleósidos (como Efavirenz, o Sustiva), e       " +
                                                  "\n inhibidores de la proteasa (como Lopinavir/Ritonavir, o Kaletra). El tratamiento también incluye el manejo y prevención de infecciones oportunistas con antibióticos   " +
                                                  "\n profilácticos (como el trimetoprim/sulfametoxazol, o Bactrim) para proteger contra ciertas infecciones. Es fundamental el seguimiento médico constante. También es     " +
                                                  "\n recomendable que el niño consuma alimentos que refuercen el sistema inmune, proporcionen energía y ayuden a mantener un peso saludable, tales como proteínas de alto   " +
                                                  "\n valor biológico (pollo, pescado, huevos, legumbres) que son cruciales para la reparación de tejidos y la función inmune; lácteos y alternativas enriquecidas con calcio" +
                                                  "\n y vitamina D para la salud ósea, la cual puede verse afectada por el virus o algunos tratamientos. Una amplia variedad de frutas y verduras de colores vivos, como los " +
                                                  "\n arándanos, ricos en antioxidantes que protegen las células; las naranjas, que aportan una cantidad significativa de Vitamina C (alrededor de 53.2 mg por cada 100 gramos," +
                                                  "\n lo que representa cerca del 59% de la ingesta diaria recomendada para un niño de 4-8 años), esencial para el sistema inmunitario; y el pimiento rojo, que contiene     " +
                                                  "\n incluso más Vitamina C (aproximadamente 127.7 mg por cada 100 gramos, lo que representa cerca del 142% de la ingesta diaria recomendada para la misma edad), y las     " +
                                                  "\n espinacas, que contienen hierro y Vitamina A, importantes para la producción de células sanguíneas y la función inmune, son igualmente beneficiosas. Además, los granos" +
                                                  "\n integrales como la avena y el arroz integral, que proveen fibra y energía sostenida, son importantes para una nutrición adecuada. Este es solo un Diagnóstico predeterminado" +
                                                  "\n lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda" +
                                                  "\n hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnostico no le" +
                                                  "\n satisface del todo se le recomienda mucho consultar a su medico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreción anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n Es recomendable que el niño, con una estatura de 1.55-1.70 m, realice actividad física moderada y adaptada a su estado de salud, sin forzar su cuerpo. Dado que la gonorrea no" +
                                                  "\n suele afectar directamente la capacidad física a largo plazo (una vez tratada), en cuanto se sienta mejor y el médico lo autorice, puede buscar idealmente periodos de 30 a 60" +
                                                  "\n minutos de actividad moderada a intensa diaria. Durante la infección y el tratamiento, la actividad puede ser más ligera, como paseos cortos. También es crucial el consumo diario" +
                                                  "\n de 2.5 a 3 Litros de agua al día (diez a doce vasos de tamaño regular) para mantener una buena hidratación, fundamental para apoyar el proceso de recuperación del cuerpo y el" +
                                                  "\n funcionamiento adecuado de los riñones, que procesarán los medicamentos. POSIBLE TRATAMIENTO: Para la gonorrea en niños de esta edad, el tratamiento es estrictamente con antibióticos," +
                                                  "\n siempre bajo la supervisión y prescripción de un médico. La elección y dosis del antibiótico dependerán de la edad, peso y la cepa específica de la bacteria. Es vital que se complete" +
                                                  "\n el ciclo de antibióticos tal como lo indique el profesional de la salud para asegurar la erradicación total de la infección y prevenir complicaciones. Ejemplos de antibióticos" +
                                                  "\n utilizados incluyen ceftriaxona (una marca común es Rocephin) administrada por inyección, o azitromicina (una marca común es Zithromax) administrada oralmente. Es importante recordar" +
                                                  "\n que la gonorrea en niños requiere una evaluación médica inmediata, ya que puede tener implicaciones serias y, en algunos casos, puede ser indicativa de abuso. Además, es recomendable" +
                                                  "\n que el niño consuma alimentos que fortalezcan su sistema inmune y contribuyan a su recuperación general, como una amplia variedad de frutas y verduras frescas. Por ejemplo, el mango," +
                                                  "\n que aporta Vitamina C (aproximadamente 36.4 mg por cada 100 gramos, lo que representa cerca del 40% de la ingesta diaria recomendada para un niño de 4-8 años) y Vitamina A, esenciales" +
                                                  "\n para la función inmunológica; o el pimiento rojo, que contiene una cantidad muy elevada de Vitamina C (alrededor de 127.7 mg por cada 100 gramos, lo que representa cerca del 142% de la" +
                                                  "\n ingesta diaria recomendada para la misma edad). Las verduras de hoja verde oscuro como la espinaca, que proveen Vitamina K, Vitamina A y antioxidantes, que apoyan la salud general, " +
                                                  "\n también son beneficiosas. Las proteínas magras como el pollo, el pescado y las legumbres son esenciales para la reparación de tejidos y el mantenimiento de la energía, y los granos " +
                                                  "\n integrales como la avena y el arroz integral, proveen fibra y energía sostenida para una buena digestión y vitalidad. Este es solo un Diagnóstico predeterminado lógico, haberlo     " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico" +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda " +
                                                  "\n mucho consultar a su medico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linfáticos inflamados, Úlceras o llagas dolorosas, Picazón o ardor, Dolor al orinar.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n Es recomendable que el niño, con una estatura de 1.55-1.70 m, realice actividad física suave y de bajo impacto adaptada a su nivel de dolor y la condición de sus articulaciones," +
                                                  "\n siempre evitando actividades que puedan irritar las lesiones si estas están presentes, como el roce excesivo o la sudoración intensa en el área afectada. Una vez que las lesiones" +
                                                  "\n remitan, puede retomar gradualmente la actividad física normal para su edad, buscando idealmente periodos de 30 a 60 minutos de actividad moderada a intensa diaria, siempre bajo" +
                                                  "\n supervisión. También es crucial el consumo diario de 2.5 a 3 Litros de agua al día (diez a doce vasos de tamaño regular) para mantener una buena hidratación, lo cual es fundamental" +
                                                  "\n para el bienestar general, el funcionamiento óptimo del sistema inmune y la eliminación de toxinas. POSIBLE TRATAMIENTO: Para el herpes genital en niños de esta edad, el tratamiento" +
                                                  "\n principal consiste en medicamentos antivirales que ayudan a controlar el brote, reducir la intensidad y duración de los síntomas, y prevenir futuras recurrencias, aunque no eliminan" +
                                                  "\n el virus del cuerpo. Es fundamental que estos medicamentos sean prescritos y supervisados por un médico, quien determinará la dosis adecuada según la edad y el peso del niño. Algunos" +
                                                  "\n ejemplos de medicamentos antivirales utilizados incluyen Aciclovir (una marca común es Zovirax), Valaciclovir (una marca común es Valtrex), y Famciclovir (una marca común es Famvir)." +
                                                  "\n Además del tratamiento antiviral, es importante mantener una higiene adecuada de las lesiones y evitar tocarlas para prevenir la propagación. También es recomendable que el niño   " +
                                                  "\n consuma alimentos que fortalezcan su sistema inmune y ayuden a la cicatrización, tales como alimentos ricos en lisina y bajos en arginina, ya que la lisina puede inhibir la replicación" +
                                                  "\n del virus del herpes, presentes en lácteos, pescado y pollo, que aportan proteínas esenciales y Vitamina D (importante para la función inmune). Una variedad de frutas y verduras,  " +
                                                  "\n como el pimiento rojo, que contiene una cantidad muy elevada de Vitamina C (alrededor de 127.7 mg por cada 100 gramos, lo que representa cerca del 142% de la ingesta diaria recomendada" +
                                                  "\n para un niño de 4-8 años), o las fresas, con cerca de 58.8 mg de Vitamina C por cada 100 gramos (aproximadamente el 65% de la ingesta diaria recomendada para la misma edad), son   " +
                                                  "\n excelentes fuentes de antioxidantes que apoyan la reparación celular y el fortalecimiento de las defensas del cuerpo. También se beneficia de las verduras de hoja verde oscuro como" +
                                                  "\n la espinaca, que provee hierro y folato. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello" +
                                                  "\n la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente," +
                                                  "\n además por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su medico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera " +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Úlceras indoloras, Erupción cutánea, Dolor de cabeza, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Sífilis." +
                                                  "\n Es recomendable que el niño, con una estatura de 1.55-1.70 m, realice actividad física moderada y adaptada a su estado de salud, especialmente si la sífilis ha afectado alguna" +
                                                  "\n articulación o hueso, o si presenta fatiga. Durante el tratamiento y la recuperación, la actividad debe ser supervisada, buscando idealmente periodos de 30 a 60 minutos de    " +
                                                  "\n actividad moderada en los días que se encuentre bien, pero siempre con precaución y escuchando las señales del cuerpo. También es crucial el consumo diario de 2.5 a 3 Litros  " +
                                                  "\n de agua al día (diez a doce vasos de tamaño regular) para mantener una buena hidratación, fundamental para el funcionamiento óptimo del cuerpo y el proceso de eliminación de  " +
                                                  "\n toxinas durante el tratamiento. POSIBLE TRATAMIENTO: Para la sífilis en niños de esta edad, el tratamiento principal y más efectivo es con antibióticos, siendo la penicilina  " +
                                                  "\n el medicamento de elección. La dosis y la duración del tratamiento serán determinadas estrictamente por un médico, y es fundamental completar el ciclo completo para asegurar  " +
                                                  "\n la erradicación de la infección y prevenir complicaciones a largo plazo. En casos de alergia a la penicilina, el médico puede considerar otras opciones como la ceftriaxona    " +
                                                  "\n (una marca común es Rocephin). Es vital un seguimiento médico cercano después del tratamiento para confirmar la curación. También es recomendable que el niño consuma alimentos" +
                                                  "\n que fortalezcan su sistema inmune y apoyen la recuperación general, como proteínas magras (pollo, pescado, legumbres) que son cruciales para la reparación de tejidos y la     " +
                                                  "\n producción de células inmunes; así como una amplia variedad de frutas y verduras frescas. Por ejemplo, el pimiento rojo, que aporta una gran cantidad de Vitamina C (alrededor " +
                                                  "\n de 127.7 mg por cada 100 gramos, lo que representa cerca del 142% de la ingesta diaria recomendada para un niño de 4-8 años), importante para la inmunidad. La espinaca, rica  " +
                                                  "\n en folato (una vitamina B esencial para la división celular y la formación de glóbulos rojos, lo cual es importante si hay anemia asociada a la sífilis), y Vitamina A, también" +
                                                  "\n contribuye a la salud general. Las naranjas, con su alto contenido de Vitamina C (aproximadamente 53.2 mg por cada 100 gramos, que representa cerca del 59% de la ingesta      " +
                                                  "\n diaria recomendada para la misma edad), son excelentes para reforzar las defensas, y los arándanos son ricos en antioxidantes que protegen las células del daño. Este es       " +
                                                  "\n solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén    " +
                                                  "\n correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si    " +
                                                  "\n la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su medico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Pérdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n Es recomendable que el niño, con una estatura de 1.55-1.70 m, realice actividad física moderada y adaptada a su estado de salud y nivel de energía, especialmente durante" +
                                                  "\n la fase activa de la enfermedad y el tratamiento, cuando puede experimentar fatiga y dificultad respiratoria. Se deben evitar actividades extenuantes y priorizar el reposo" +
                                                  "\n adecuado. A medida que su condición mejore, puede retomar gradualmente juegos ligeros, caminatas cortas o ejercicios de estiramiento, siempre bajo supervisión médica,    " +
                                                  "\n buscando alcanzar periodos de 30 a 60 minutos de actividad moderada en los días que se encuentre bien, adaptándose a su tolerancia. También es crucial el consumo diario  " +
                                                  "\n de 2.5 a 3 Litros de agua al día (diez a doce vasos de tamaño regular) para mantener una excelente hidratación, lo cual es vital para el funcionamiento general del cuerpo," +
                                                  "\n la eliminación de desechos y el apoyo a los órganos que metabolizan los medicamentos antituberculosos. POSIBLE TRATAMIENTO: Para la tuberculosis en niños de esta edad, el " +
                                                  "\n tratamiento es un régimen prolongado de antibióticos antituberculosos, que se administra bajo estricta supervisión médica. Es absolutamente esencial que el niño complete  " +
                                                  "\n el curso completo del tratamiento, que puede durar varios meses, para erradicar la bacteria y prevenir la aparición de cepas resistentes. Los medicamentos comunes incluyen" +
                                                  "\n Isoniazida (una marca común es Laniazid), Rifampicina (una marca común es Rifadin), Pirazinamida y Etambutol. La combinación y dosis exactas serán determinadas por el médico." +
                                                  "\n Es fundamental un seguimiento médico constante para monitorear la respuesta al tratamiento y los posibles efectos secundarios. También es recomendable que el niño consuma " +
                                                  "\n alimentos que fortalezcan su sistema inmune y le proporcionen la energía y nutrientes necesarios para combatir la infección y apoyar el tratamiento, como proteínas de alto" +
                                                  "\n valor biológico (huevo, pollo, pescado, legumbres) que son cruciales para la reparación de tejidos y la producción de células inmunes. Las verduras de hoja verde oscuro   " +
                                                  "\n como la espinaca, que aporta Magnesio, hierro y folato (importante para la formación de glóbulos rojos, que pueden verse afectados por la TB o sus tratamientos); y las    " +
                                                  "\n zanahorias, una excelente fuente de Vitamina A (alrededor de 835 µg por cada 100 gramos, lo que representa cerca del 167% de la ingesta diaria recomendada para un niño    " +
                                                  "\n de 4-8 años), esencial para la salud de las mucosas respiratorias y la función inmune, son altamente beneficiosas. Las frutas como el mango, que aporta Vitamina C         " +
                                                  "\n (aproximadamente 36.4 mg por cada 100 gramos, lo que representa cerca del 40% de la ingesta diaria recomendada para un niño de 4-8 años) y Vitamina A, así como el kiwi,   " +
                                                  "\n rico en Vitamina C (aproximadamente 92.7 mg por cada 100 gramos, que representa cerca del 103% de la ingesta diaria recomendada para la misma edad), son cruciales para    " +
                                                  "\n reforzar el sistema inmunológico y actuar como antioxidantes. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente   " +
                                                  "\n tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor   " +
                                                  "\n seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su    " +
                                                  "\n medico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchazón en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n Es recomendable que el niño, con una estatura de 1.55-1.70 m, realice actividad física suave y de bajo impacto adaptada a su nivel de dolor y la condición de sus " +
                                                  "\n articulaciones, buscando mantener la flexibilidad y fortalecer los músculos sin sobrecargar las zonas inflamadas. Actividades como la natación, el ciclismo (con  " +
                                                  "\n un sillín adecuado y baja resistencia) o ejercicios de estiramiento suaves pueden ser muy beneficiosas, siempre bajo supervisión y previa consulta con el médico  " +
                                                  "\n o fisioterapeuta. La cantidad de ejercicio debe ser progresiva y ajustada a sus días buenos y malos, pero se debe fomentar el movimiento regular para evitar la   " +
                                                  "\n rigidez, idealmente buscando periodos de 30 a 60 minutos de actividad moderada en los días que se encuentre bien, permitiendo periodos de descanso según su tolerancia." +
                                                  "\n También es crucial el consumo diario de 2.5 a 3 Litros de agua al día (diez a doce vasos de tamaño regular) para mantener una buena hidratación, lo cual es fundamental" +
                                                  "\n para la salud general, el funcionamiento óptimo de las articulaciones y el metabolismo de los medicamentos. POSIBLE TRATAMIENTO: Para la artritis en niños de esta edad," +
                                                  "\n el tratamiento suele incluir; medicamentos antiinflamatorios no esteroideos (AINEs) para reducir el dolor y la inflamación (como el ibuprofeno, una marca común es Advil" +
                                                  "\n o Motrin, o el naproxeno, una marca común es Aproben), fármacos antirreumáticos modificadores de la enfermedad (FARME) que actúan sobre el sistema inmune para controlar" +
                                                  "\n la progresión de la enfermedad (como el metotrexato, una marca común es Trexall), y en algunos casos, medicamentos biológicos para la artritis juvenil idiopática grave." +
                                                  "\n Es fundamental que estos tratamientos sean prescritos y supervisados por un reumatólogo pediatra, quien ajustará las dosis y monitoreará los efectos. También es    " +
                                                  "\n recomendable que el niño consuma alimentos que ayuden a reducir la inflamación y fortalezcan su sistema inmune, tales como pescados grasos (salmón, sardinas), ricos" +
                                                  "\n en ácidos grasos Omega-3, potentes antiinflamatorios que pueden ser beneficiosos para la salud articular. Una amplia variedad de frutas y verduras de colores vivos," +
                                                  "\n como los arándanos, que aportan antioxidantes que protegen las células; la espinaca, rica en Magnesio, un mineral que puede contribuir a la relajación muscular,    " +
                                                  "\n y Vitamina K; y el pimiento rojo, que ofrece una gran cantidad de Vitamina C (alrededor de 127.7 mg por cada 100 gramos, lo que representa cerca del 142% de la ingesta" +
                                                  "\n diaria recomendada para un niño de 4-8 años), esencial para la función inmunológica. También se beneficia de las cerezas, que contienen antocianinas, compuestos con " +
                                                  "\n potentes propiedades antiinflamatorias que podrían ayudar a reducir el dolor y la inflamación en las articulaciones. Además, el aguacate proporciona grasas saludables" +
                                                  "\n y Vitamina E, importantes para la energía y la salud general. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente" +
                                                  "\n tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor" +
                                                  "\n seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su " +
                                                  "\n médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n Es recomendable que el niño, con una estatura de 1.55-1.70 m, especialmente durante la fase paroxística de tos severa, limite la actividad física a movimientos " +
                                                  "\n suaves y evite cualquier esfuerzo que pueda desencadenar ataques de tos. El reposo es crucial para su recuperación y para conservar energía. A medida que mejore," +
                                                  "\n puede retomar gradualmente actividades de bajo impacto como caminatas cortas o juegos tranquilos, siempre bajo supervisión, buscando alcanzar periodos de 30 a 60" +
                                                  "\n minutos de actividad moderada en los días que se encuentre bien, adaptándose a su nivel de tolerancia. También es crucial el consumo diario de 2.5 a 3 Litros de " +
                                                  "\n agua al día (diez a doce vasos de tamaño regular), o incluso más si presenta fiebre o dificultad para alimentarse, para mantener una excelente hidratación y     " +
                                                  "\n ayudar a fluidificar las secreciones respiratorias, lo cual es vital para su comodidad y recuperación. POSIBLE TRATAMIENTO: Para la tosferina en niños de esta   " +
                                                  "\n edad, el tratamiento principal es con antibióticos, que son más efectivos cuando se administran en las primeras etapas de la enfermedad para acortar la duración " +
                                                  "\n de los síntomas y reducir la propagación. Los más comunes son los macrólidos, como la azitromicina (una marca común es Zithromax), la eritromicina (una marca    " +
                                                  "\n común es Pneumo-E o Eritrobase) o la claritromicina (una marca común es Klacid). Es fundamental que el niño complete el ciclo completo de antibióticos tal como  " +
                                                  "\n lo indique el médico, incluso si los síntomas mejoran, para erradicar la bacteria. En casos severos o en lactantes, podría requerirse hospitalización para el    " +
                                                  "\n monitoreo y manejo de complicaciones. También es recomendable que el niño consuma alimentos que fortalezcan su sistema inmune y le proporcionen nutrientes que   " +
                                                  "\n ayuden a su recuperación, especialmente aquellos que son fáciles de tragar y digestibles debido a los ataques de tos, tales como purés de frutas y verduras.     " +
                                                  "\n Por ejemplo, el puré de calabaza, que aporta una buena cantidad de Vitamina A (alrededor de 369 µg por cada 100 gramos, lo que representa cerca del 74% de la    " +
                                                  "\n ingesta diaria recomendada para un niño de 4-8 años), esencial para la salud de las mucosas respiratorias y la función inmune; o el puré de zanahoria, también   " +
                                                  "\n rica en Vitamina A y antioxidantes. Los plátanos son fáciles de comer y ricos en potasio (aproximadamente 358 mg por cada 100 gramos), un electrolito importante " +
                                                  "\n que puede ayudar a reponer las pérdidas debido a la tos y al sudor, además de aportar energía. Las sopas y caldos suaves contribuyen a la hidratación y aportan  " +
                                                  "\n nutrientes de forma líquida. También son valiosas las frutas suaves ricas en Vitamina C como la papaya, que contiene alrededor de 60.9 mg de Vitamina C por cada " +
                                                  "\n 100 gramos (aproximadamente el 68% de la ingesta diaria recomendada para un niño de 4-8 años), y la guayaba, con niveles aún más altos de esta vitamina, crucial " +
                                                  "\n para fortalecer el sistema inmunológico. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa    " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor   " +
                                                  "\n seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar" +
                                                  "\n a su medico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchazón de las glándulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n Es recomendable que el niño, con una estatura de 1.55-1.70 m, especialmente durante la fase aguda de la enfermedad cuando puede presentar fiebre y malestar, " +
                                                  "\n limite la actividad física a un reposo adecuado, evitando esfuerzos que puedan aumentar el malestar o la hinchazón de las glándulas. A medida que su condición" +
                                                  "\n mejore y la fiebre ceda, puede retomar gradualmente actividades ligeras y juegos tranquilos, siempre bajo supervisión, buscando alcanzar periodos de 30 a 60 " +
                                                  "\n minutos de actividad moderada en los días que se encuentre bien. También es crucial el consumo diario de 2.5 a 3 Litros de agua al día (diez a doce vasos de " +
                                                  "\n tamaño regular), o más si tiene fiebre o dificultad para tragar alimentos sólidos, para mantener una excelente hidratación, lo cual es vital para su bienestar" +
                                                  "\n general, para ayudar a reducir la fiebre y para mantener las mucosas hidratadas, aliviando la garganta. POSIBLE TRATAMIENTO: Para las paperas en niños de esta" +
                                                  "\n edad, el tratamiento es principalmente de soporte y para aliviar los síntomas, ya que es una infección viral y no existen medicamentos específicos para erradicar" +
                                                  "\n el virus. Se recomienda el reposo en cama, la aplicación de compresas frías o calientes en las glándulas inflamadas para aliviar el dolor, y el uso de medicamentos" +
                                                  "\n para controlar la fiebre y el dolor, como el paracetamol (una marca común es Tempra o Tylenol) o el ibuprofeno (una marca común es Advil o Motrin). Es fundamental" +
                                                  "\n evitar el uso de aspirina en niños debido al riesgo de síndrome de Reye. También es recomendable que el niño consuma alimentos que fortalezcan su sistema inmune " +
                                                  "\n y sean fáciles de masticar y tragar debido a la hinchazón de las glándulas salivales, tales como purés y alimentos blandos. Puede incluir caldos nutritivos y sopas" +
                                                  "\n suaves que aportan hidratación y energía. En cuanto a las frutas y verduras, la piña es una excelente opción, ya que contiene bromelina, una enzima con propiedades" +
                                                  "\n antiinflamatorias que puede ayudar a reducir la hinchazón y el dolor, además de Vitamina C (aproximadamente 47.8 mg por cada 100 gramos, lo que representa cerca" +
                                                  "\n del 53% de la ingesta diaria recomendada para un niño de 4-8 años), esencial para el sistema inmunológico. El melón, fácil de digerir, es rico en Vitamina C     " +
                                                  "\n (aproximadamente 36.7 mg por cada 100 gramos, que representa cerca del 41% de la ingesta diaria recomendada para la misma edad) y Vitamina A, y también aporta una" +
                                                  "\n alta cantidad de agua, contribuyendo a la hidratación. El plátano, fácil de digerir y rico en potasio (aproximadamente 358 mg por cada 100 gramos), un electrolito" +
                                                  "\n importante que ayuda a reponer las pérdidas y aporta energía. Finalmente, el aguacate proporciona grasas saludables y diversas vitaminas (como la E y K) que apoyan" +
                                                  "\n la función inmunológica y la salud general. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa  " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor    " +
                                                  "\n seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar" +
                                                  "\n a su medico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupción cutánea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n Es recomendable que el niño, con una estatura de 1.55-1.70 m, durante la fase aguda de la enfermedad cuando puede presentar fiebre, dolor muscular y articular, mantenga" +
                                                  "\n un reposo adecuado y evite la actividad física extenuante. A medida que sus síntomas mejoren y bajo supervisión, puede retomar gradualmente actividades ligeras y juegos" +
                                                  "\n tranquilos, buscando alcanzar periodos de 30 a 60 minutos de actividad moderada en los días que se encuentre bien, priorizando entornos donde se pueda minimizar la     " +
                                                  "\n exposición a mosquitos. También es crucial el consumo diario de 2.5 a 3 Litros de agua al día (diez a doce vasos de tamaño regular), o más si tiene fiebre o vómitos, para" +
                                                  "\n mantener una excelente hidratación y prevenir la deshidratación, lo cual es vital para el bienestar general y el funcionamiento óptimo de todos sus sistemas corporales " +
                                                  "\n durante la recuperación. POSIBLE TRATAMIENTO: Para el Zika en niños de esta edad, el tratamiento es principalmente de soporte, ya que no existe un medicamento antiviral" +
                                                  "\n específico para curar la infección. El manejo se enfoca en aliviar los síntomas, lo que incluye el reposo, una buena hidratación y el uso de medicamentos para controlar" +
                                                  "\n la fiebre y el dolor, como el paracetamol (una marca común es Tempra o Tylenol). Es fundamental evitar el uso de aspirina y otros AINEs (antiinflamatorios no esteroideos" +
                                                  "\n como el ibuprofeno) hasta que se descarte la posibilidad de dengue, debido al riesgo de complicaciones hemorrágicas. También es crucial proteger al niño de nuevas picaduras" +
                                                  "\n de mosquitos durante la enfermedad para evitar la transmisión del virus a otras personas. Además, es recomendable que el niño consuma alimentos que fortalezcan su sistema" +
                                                  "\n inmune y le proporcionen energía, tales como caldos nutritivos y sopas suaves que facilitan la hidratación y son fáciles de digerir. Las frutas tropicales como la papaya," +
                                                  "\n que aporta una cantidad significativa de Vitamina C (aproximadamente 60.9 mg por cada 100 gramos, lo que representa cerca del 68% de la ingesta diaria recomendada para un" +
                                                  "\n niño de 4-8 años) y el mango, que también es rico en Vitamina C (aproximadamente 36.4 mg por cada 100 gramos, que representa cerca del 40% de la ingesta diaria recomendada" +
                                                  "\n para la misma edad) y antioxidantes, son excelentes para reforzar las defensas. El plátano, fácil de digerir, es rico en potasio (aproximadamente 358 mg por cada 100 gramos)," +
                                                  "\n un electrolito importante que ayuda a reponer las pérdidas por fiebre o sudor. Las verduras de hoja verde oscuro como la espinaca, que provee Vitamina K, Vitamina A y hierro," +
                                                  "\n contribuyen a la vitalidad y al buen funcionamiento general. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga" +
                                                  "\n esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad" +
                                                  "\n en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su medico," +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, Vómitos, Deshidratación, Dolor abdominal.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n Es recomendable que el niño, con una estatura de 1.55-1.70 m, mientras presente diarrea y vómitos, limite la actividad física a un reposo absoluto o muy suave, evitando " +
                                                  "\n cualquier esfuerzo que pueda empeorar la deshidratación o el malestar gastrointestinal. La prioridad es conservar energía para la recuperación. A medida que los síntomas" +
                                                  "\n disminuyan y la hidratación mejore, puede retomar gradualmente juegos tranquilos y actividades de bajo impacto, siempre bajo supervisión, buscando alcanzar periodos de 30" +
                                                  "\n a 60 minutos de actividad moderada en los días que se encuentre bien. También es crucial el consumo diario de 2.5 a 3 Litros de agua al día (diez a doce vasos de tamaño " +
                                                  "\n regular) en pequeñas tomas frecuentes, preferiblemente mediante soluciones de rehidratación oral (como Electrolit pediátrico o Pedialyte), para reponer los líquidos y   " +
                                                  "\n electrolitos perdidos por la diarrea y el vómito, lo cual es vital para prevenir la deshidratación severa. POSIBLE TRATAMIENTO: Para el rotavirus en niños de esta edad, " +
                                                  "\n el tratamiento es principalmente de soporte y se enfoca en la rehidratación, ya que no existe un medicamento antiviral específico para el virus. La clave es prevenir y  " +
                                                  "\n tratar la deshidratación mediante la administración de líquidos y electrolitos. En casa, se pueden usar soluciones de rehidratación oral (SRO), y en casos de deshidratación" +
                                                  "\n severa, puede ser necesaria la hospitalización para la administración de líquidos por vía intravenosa. Los medicamentos para detener la diarrea no suelen ser recomendados" +
                                                  "\n en niños con rotavirus. En cuanto a medicamentos para el malestar, el paracetamol (una marca común es Tempra o Tylenol) puede usarse para controlar la fiebre y aliviar las" +
                                                  "\n molestias, siempre bajo indicación médica. Es fundamental la supervisión médica. Además, es importante que el niño consuma alimentos que sean fáciles de digerir y ayuden " +
                                                  "\n a la recuperación de la flora intestinal, así como nutrientes que apoyen la función inmune, tales como arroz blanco o avena cocida, que aportan energía y son suaves para " +
                                                  "\n el estómago; caldos de pollo o vegetales desgrasados que contribuyen a la hidratación y a la reposición de electrolitos. El plátano, muy beneficioso por su contenido de  " +
                                                  "\n potasio (aproximadamente 358 mg por cada 100 gramos), un electrolito clave que se pierde con la diarrea y el vómito, ayudando a normalizar los niveles y aportar energía  " +
                                                  "\n de fácil absorción. También se recomienda el puré de manzana (sin cáscara), que contiene pectina, una fibra soluble que puede ayudar a solidificar las heces y es suave   " +
                                                  "\n para el sistema digestivo del niño. Otra verdura valiosa es la papa cocida y en puré, la cual es una buena fuente de potasio y carbohidratos complejos, que son de fácil  " +
                                                  "\n digestión y aportan energía sin irritar el intestino, favoreciendo la recuperación. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al " +
                                                  "\n 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida   " +
                                                  "\n para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda  " +
                                                  "\n mucho consultar a su medico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, Náuseas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n Es recomendable que el niño, con una estatura de 1.55-1.70 m, durante la fase aguda de la enfermedad cuando puede presentar fiebre, diarrea o síntomas neurológicos," +
                                                  "\n mantenga un reposo adecuado y evite cualquier actividad física extenuante. El objetivo es preservar la energía y permitir que su cuerpo se recupere. A medida que los" +
                                                  "\n síntomas disminuyan y bajo supervisión médica, puede retomar gradualmente actividades tranquilas y de bajo impacto, buscando alcanzar periodos de 30 a 60 minutos de" +
                                                  "\n actividad moderada en los días que se encuentre bien. También es crucial el consumo diario de 2.5 a 3 Litros de agua al día (diez a doce vasos de tamaño regular),  " +
                                                  "\n especialmente si presenta fiebre o diarrea, para mantener una excelente hidratación y reponer los líquidos perdidos, lo cual es vital para el bienestar general y el" +
                                                  "\n funcionamiento óptimo de sus sistemas corporales mientras combate la infección. POSIBLE TRATAMIENTO: Para la listeriosis en niños de esta edad, el tratamiento      " +
                                                  "\n principal consiste en la administración de antibióticos, siendo la ampicilina (una marca común es Omnipen o Polycillin) o la penicilina (una marca común es         " +
                                                  "\n Penprocilina o Bencilpenicilina Sódica) los más comúnmente utilizados, a menudo en combinación con otros antibióticos como la gentamicina. La elección, dosis y     " +
                                                  "\n duración del tratamiento deben ser estrictamente determinadas por un médico, y es fundamental completar el ciclo completo de antibióticos para erradicar la bacteria" +
                                                  "\n y prevenir complicaciones serias, como la meningitis. En casos graves, puede requerirse hospitalización para la administración intravenosa de medicamentos y monitoreo." +
                                                  "\n Además, es recomendable que el niño consuma alimentos que refuercen su sistema inmune y apoyen su recuperación general, priorizando aquellos que son fáciles de digerir" +
                                                  "\n si presenta síntomas gastrointestinales. Estos incluyen proteínas magras como el pollo cocido o el pescado (si su digestión lo permite), que aportan aminoácidos    " +
                                                  "\n esenciales para la reparación de tejidos y la producción de células inmunes; caldos y sopas nutritivas que contribuyen a la hidratación y al aporte de electrolitos." +
                                                  "\n También son beneficiosas frutas ricas en Vitamina C como la papaya, que contiene aproximadamente 60.9 mg por cada 100 gramos (cerca del 68% de la ingesta diaria    " +
                                                  "\n recomendada para un niño de 4-8 años), y las naranjas, que aportan alrededor de 53.2 mg de Vitamina C por cada 100 gramos (cerca del 59% de la ingesta diaria       " +
                                                  "\n recomendada para la misma edad), ambas potentes antioxidantes que fortalecen las defensas del cuerpo. Las verduras cocidas en puré, como la calabaza, que aporta    " +
                                                  "\n una buena cantidad de Vitamina A (alrededor de 369 µg por cada 100 gramos, lo que representa cerca del 74% de la ingesta diaria recomendada para un niño de 4-8 años)," +
                                                  "\n es crucial para la integridad de las mucosas y la función inmunitaria, y la espinaca, que provee hierro y folato, importantes para la formación de glóbulos rojos.  " +
                                                  "\n Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus  " +
                                                  "\n respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente," +
                                                  "\n además por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su medico, Angel L Montes agradece tu visita a la app" +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, Vómitos.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n Es recomendable que el niño, con una estatura de 1.55-1.70 m, durante la fase aguda de la enfermedad cuando presenta diarrea severa, dolor abdominal y fiebre," +
                                                  "\n mantenga un reposo estricto, evitando cualquier actividad física que pueda agravar la deshidratación o el malestar gastrointestinal. La prioridad es conservar" +
                                                  "\n energía. A medida que los síntomas disminuyan y la rehidratación sea efectiva, puede retomar gradualmente juegos tranquilos y actividades de bajo impacto, siempre" +
                                                  "\n bajo supervisión, buscando alcanzar periodos de 30 a 60 minutos de actividad moderada en los días que se encuentre bien. También es crucial el consumo diario de  " +
                                                  "\n 2.5 a 3 Litros de agua al día (diez a doce vasos de tamaño regular) en pequeñas y frecuentes tomas, preferiblemente soluciones de rehidratación oral (como Electrolit" +
                                                  "\n pediátrico o Pedialyte), para reponer los líquidos y electrolitos perdidos por la diarrea y el vómito, lo cual es vital para prevenir la deshidratación severa y   " +
                                                  "\n apoyar la función renal durante la infección. POSIBLE TRATAMIENTO: Para la shigelosis en niños de esta edad, el tratamiento principal es con antibióticos, ya que  " +
                                                  "\n la shigelosis es una infección bacteriana que puede ser grave. Los antibióticos más comunes para esta condición incluyen la azitromicina (una marca común es Zithromax)," +
                                                  "\n o las cefalosporinas de tercera generación como la ceftriaxona (una marca común es Rocephin), dependiendo de la resistencia bacteriana local. Es fundamental que el  " +
                                                  "\n niño complete el ciclo completo de antibióticos tal como lo indique el médico, incluso si los síntomas mejoran, para erradicar la bacteria y evitar la propagación.  " +
                                                  "\n Además del tratamiento antibiótico, el manejo de la deshidratación mediante soluciones de rehidratación oral es esencial. Los medicamentos para frenar la diarrea    " +
                                                  "\n generalmente no se recomiendan. Es importante también que el niño consuma alimentos que sean fáciles de digerir, suaves para el sistema gastrointestinal y que       " +
                                                  "\n aporten nutrientes para fortalecer su sistema inmune, como arroz blanco o avena cocida, que son fuente de energía y suaves para el estómago; caldos de pollo o       " +
                                                  "\n vegetales desgrasados que contribuyen a la hidratación y a la reposición de electrolitos. El plátano, muy beneficioso por su contenido de potasio (aproximadamente   " +
                                                  "\n 358 mg por cada 100 gramos), un electrolito clave que se pierde con la diarrea y el vómito, ayudando a normalizar los niveles y aportar energía de fácil absorción.  " +
                                                  "\n También se recomienda el puré de manzana (sin cáscara), que contiene pectina, una fibra soluble que puede ayudar a solidificar las heces y es suave para el sistema  " +
                                                  "\n digestivo del niño. Otra verdura valiosa es la papa cocida y en puré, la cual es una buena fuente de potasio y carbohidratos complejos, que son de fácil digestión   " +
                                                  "\n y aportan energía sin irritar el intestino, favoreciendo la recuperación de la mucosa intestinal dañada. Este es solo un Diagnóstico predeterminado lógico, haberlo  " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer    " +
                                                  "\n más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnostico no   " +
                                                  "\n le satisface del todo se le recomienda mucho consultar a su medico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos crónica, Producción excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad Pulmonar Obstructiva Crónica (EPOC)." +
                                                  "\n Es recomendable que el niño, con una estatura de 1.55-1.70 m, cuya actividad física debe ser siempre supervisada y adaptada a su capacidad pulmonar y estado general," +
                                                  "\n realice ejercicios de respiración y actividades de bajo impacto. Se deben evitar ambientes con humo o contaminantes, y priorizar actividades que no causen dificultad" +
                                                  "\n respiratoria excesiva. Caminatas cortas y suaves, juegos tranquilos o ejercicios de brazos que no agiten demasiado, pueden ser beneficiosos, buscando mantener la    " +
                                                  "\n movilidad y la fuerza muscular sin agotar al niño, con el objetivo de alcanzar periodos de 30 a 60 minutos de actividad moderada en los días que se encuentre bien,  " +
                                                  "\n pero siempre con periodos de descanso. También es crucial el consumo diario de 2.5 a 3 Litros de agua al día (diez a doce vasos de tamaño regular) para mantener las " +
                                                  "\n secreciones pulmonares más fluidas y facilitar su expectoración, lo cual es vital para una mejor respiración y para prevenir infecciones.                            " +
                                                  "\n POSIBLE TRATAMIENTO: Para la EPOC en niños (que es rara y a menudo asociada a condiciones congénitas, exposiciones ambientales severas tempranas o infecciones       " +
                                                  "\n recurrentes), el tratamiento se enfoca en manejar los síntomas, prevenir exacerbaciones y mejorar la función pulmonar. Esto incluye el uso de broncodilatadores      " +
                                                  "\n (como el salbutamol, una marca común es Ventolin o Aerolin, para abrir las vías respiratorias), corticosteroides inhalados (como la fluticasona, una marca común es  " +
                                                  "\n Flixotide, para reducir la inflamación), y en algunos casos, oxigenoterapia si hay bajos niveles de oxígeno. La terapia respiratoria y la fisioterapia pulmonar son  " +
                                                  "\n fundamentales. Es esencial la eliminación de la exposición a irritantes pulmonares, como el humo de tabaco. Además, es recomendable que el niño consuma alimentos    " +
                                                  "\n que fortalezcan su sistema inmune y le proporcionen energía de manera sostenible, priorizando aquellos que no causen distensión abdominal que pueda dificultar la    " +
                                                  "\n respiración. Estos incluyen proteínas magras como el pollo o el pescado, que aportan aminoácidos esenciales para la reparación de tejidos y el mantenimiento de la   " +
                                                  "\n masa muscular, crucial en pacientes con EPOC; carbohidratos complejos de liberación lenta como la avena o el arroz integral, que proporcionan energía sin picos      " +
                                                  "\n glucémicos; y una variedad de verduras de hoja verde oscuro como la acelga, que aporta Vitamina K, Vitamina A y antioxidantes, que pueden ayudar a reducir la        " +
                                                  "\n inflamación pulmonar, y el pimiento rojo, que ofrece una gran cantidad de Vitamina C (alrededor de 127.7 mg por cada 100 gramos, lo que representa cerca del 142%    " +
                                                  "\n de la ingesta diaria recomendada para un niño de 4-8 años), esencial para la función inmunológica. Las frutas como las fresas, que contienen cerca de 58.8 mg de     " +
                                                  "\n Vitamina C por cada 100 gramos (aproximadamente el 65% de la ingesta diaria recomendada para la misma edad), y las manzanas, que contienen quercetina, un flavonoide " +
                                                  "\n con propiedades antiinflamatorias que pueden ser útiles para la salud pulmonar, también son beneficiosas. Este es solo un Diagnóstico predeterminado lógico, haberlo " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más" +
                                                  "\n de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnostico no le    " +
                                                  "\n satisface del todo se le recomienda mucho consultar a su medico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreción anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n Es recomendable que el niño, con una estatura de 1.55-1.70 m, mientras recibe tratamiento, mantenga una actividad física normal adaptada a su estado de salud," +
                                                  "\n evitando cualquier molestia o irritación en el área afectada si presenta síntomas. La Clamidia no suele afectar directamente la capacidad física a largo plazo." +
                                                  "\n Una vez que el tratamiento sea efectivo y los síntomas hayan desaparecido, puede seguir con la actividad física recomendada para su edad, buscando idealmente " +
                                                  "\n periodos de 30 a 60 minutos de actividad moderada a intensa diaria. También es crucial el consumo diario de 2.5 a 3 Litros de agua al día (diez a doce vasos  " +
                                                  "\n de tamaño regular) para mantener una buena hidratación, lo cual es fundamental para el bienestar general, el funcionamiento óptimo de sus sistemas corporales " +
                                                  "\n y para apoyar la eliminación de los medicamentos del organismo. POSIBLE TRATAMIENTO: Para la clamidia en niños de esta edad, el tratamiento principal es con  " +
                                                  "\n antibióticos, los cuales son muy efectivos para erradicar la infección. La elección y la dosis del antibiótico serán determinadas estrictamente por un médico," +
                                                  "\n quien considerará la edad y el peso del niño. Es fundamental completar el ciclo completo de antibióticos tal como se indique, incluso si los síntomas mejoran," +
                                                  "\n para asegurar la eliminación total de la bacteria y prevenir reinfecciones o complicaciones. Los antibióticos comúnmente usados incluyen la azitromicina (una " +
                                                  "\n marca común es Zithromax) o la eritromicina (una marca común es Pneumo-E o Eritrobase). Es importante recordar que la clamidia en niños puede requerir una    " +
                                                  "\n evaluación médica inmediata, ya que en algunos casos puede ser indicativa de abuso. Además, es recomendable que el niño consuma alimentos que fortalezcan su  " +
                                                  "\n sistema inmune y apoyen la recuperación general, como fuentes de probióticos (si son tolerados, como yogur natural si no hay contraindicaciones), que pueden  " +
                                                  "\n ayudar a mantener un equilibrio saludable de la flora intestinal, especialmente después de la administración de antibióticos. Las frutas como las fresas, que " +
                                                  "\n contienen cerca de 58.8 mg de Vitamina C por cada 100 gramos (aproximadamente el 65% de la ingesta diaria recomendada para un niño de 4-8 años), o las naranjas," +
                                                  "\n que aportan alrededor de 53.2 mg de Vitamina C por cada 100 gramos (cerca del 59% de la ingesta diaria recomendada para la misma edad), son excelentes fuentes " +
                                                  "\n de esta vitamina, crucial para reforzar las defensas del cuerpo. Las verduras de hoja verde oscuro como la espinaca, rica en folato y Vitamina K, y el pimiento" +
                                                  "\n rojo, que provee Vitamina A y antioxidantes, también contribuyen a la vitalidad y al buen funcionamiento general del sistema inmune, favoreciendo la recuperación." +
                                                  "\n Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus" +
                                                  "\n respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su   " +
                                                  "\n paciente, además por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su medico, Angel L Montes agradece  " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Náuseas, Dolor de cabeza severo, Rigidez en el cuello, Confusión.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n Es recomendable que el niño, con una estatura de 1.55-1.70 m, durante la fase aguda de la enfermedad, mantenga un reposo estricto en cama, ya que la meningitis" +
                                                  "\n es una condición grave que requiere mínima estimulación y máxima conservación de energía para la recuperación cerebral y general del cuerpo. Cualquier actividad" +
                                                  "\n física debe ser evitada por completo en este periodo. Una vez que la fase aguda haya pasado y bajo estricta supervisión médica, la rehabilitación o la reintroducción" +
                                                  "\n gradual de movimientos muy suaves solo se realizará si no hay secuelas. También es crucial el consumo diario de 2.5 a 3 Litros de agua al día (diez a doce vasos" +
                                                  "\n de tamaño regular) en tomas pequeñas y frecuentes, preferiblemente por vía intravenosa si el niño no puede beber, para mantener una hidratación óptima y asegurar" +
                                                  "\n el correcto funcionamiento de los órganos, especialmente los riñones, que procesarán los medicamentos, y para ayudar a controlar la fiebre.                       " +
                                                  "\n POSIBLE TRATAMIENTO: Para la meningitis bacteriana en niños de esta edad, el tratamiento es una emergencia médica y consiste en la administración inmediata de    " +
                                                  "\n antibióticos intravenosos de amplio espectro para combatir la infección. La elección del antibiótico dependerá de la edad del niño, el tipo de bacteria sospechada" +
                                                  "\n y los patrones de resistencia locales, y será determinada por un médico especialista. Es vital que el tratamiento antibiótico se inicie lo antes posible y se     " +
                                                  "\n complete en su totalidad para prevenir complicaciones graves como daño cerebral, pérdida de audición o incluso la muerte. Algunos antibióticos comunes incluyen   " +
                                                  "\n la ceftriaxona (una marca común es Rocephin) o la ampicilina (una marca común es Omnipen o Polycillin), a veces combinados con vancomicina (una marca común es    " +
                                                  "\n Vancocin). Además de los antibióticos, se pueden usar corticosteroides (como la dexametasona, una marca común es Decadron) para reducir la inflamación cerebral   " +
                                                  "\n y prevenir secuelas neurológicas, siempre bajo indicación médica. Es fundamental el monitoreo constante en un entorno hospitalario. En cuanto a la alimentación,  " +
                                                  "\n una vez que el niño pueda tolerar la vía oral, es recomendable que consuma alimentos que sean fáciles de digerir y nutritivos para apoyar la recuperación del     " +
                                                  "\n sistema nervioso y el fortalecimiento del sistema inmune. Esto incluye caldos y sopas suaves que aportan líquidos y electrolitos; purés de verduras como la       " +
                                                  "\n calabaza, que aporta una buena cantidad de Vitamina A (alrededor de 369 µg por cada 100 gramos, lo que representa cerca del 74% de la ingesta diaria recomendada  " +
                                                  "\n para un niño de 4-8 años), esencial para la recuperación de las mucosas y la visión; y frutas blandas como el plátano, que aporta potasio (aproximadamente 358 mg " +
                                                  "\n por cada 100 gramos), un electrolito vital para la función nerviosa y muscular. También son beneficiosos los alimentos ricos en antioxidantes como el aguacate,   " +
                                                  "\n que provee grasas saludables y Vitamina E, que pueden proteger las células neuronales del daño oxidativo. Este es solo un Diagnóstico predeterminado lógico,      " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se          " +
                                                  "\n recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta  " +
                                                  "\n del Diagnostico no le satisface del todo se le recomienda mucho consultar a su medico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, Pérdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, Pérdida de apetito.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Cáncer." +
                                                  "\n Es recomendable que el niño, con una estatura de 1.55-1.70 m, cuya actividad física debe ser siempre supervisada y adaptada a su estado de salud, energía y" +
                                                  "\n fase del tratamiento oncológico, mantenga periodos de descanso adecuados y evite cualquier actividad extenuante o que pueda comprometer su sistema inmune. " +
                                                  "\n Se deben priorizar actividades de bajo impacto que fomenten la movilidad y el bienestar, como caminatas cortas y suaves, juegos tranquilos o ejercicios de " +
                                                  "\n estiramiento muy ligeros, siempre que el médico lo autorice y según su tolerancia. El objetivo es mantener la fuerza muscular y mejorar la calidad de vida " +
                                                  "\n sin sobrecargar su cuerpo, buscando alcanzar periodos de 30 a 60 minutos de actividad moderada en los días que se encuentre bien, pero con flexibilidad y  " +
                                                  "\n respetando sus límites. También es crucial el consumo diario de 2.5 a 3 Litros de agua al día (dietez a doce vasos de tamaño regular), o más si tiene fiebre," +
                                                  "\n vómitos o diarrea como efectos secundarios del tratamiento, para mantener una excelente hidratación, lo cual es vital para el funcionamiento óptimo de sus  " +
                                                  "\n órganos, la eliminación de toxinas y el apoyo al metabolismo de los medicamentos. POSIBLE TRATAMIENTO: Para el cáncer en niños de esta edad, el tratamiento " +
                                                  "\n es altamente individualizado y complejo, dependiendo del tipo específico de cáncer, su etapa y la salud general del niño. Generalmente, implica una combinación" +
                                                  "\n de quimioterapia (medicamentos que matan las células cancerosas, como la vincristina, una marca común es Oncovin, o el ciclofosfamida, una marca común es  " +
                                                  "\n Cytoxan), radioterapia (uso de radiación para destruir células cancerosas), cirugía (para extirpar tumores), e incluso inmunoterapia o terapia dirigida.   " +
                                                  "\n Es fundamental que el tratamiento sea manejado por un equipo multidisciplinario de oncólogos pediátricos. Además del tratamiento oncológico, se utilizan   " +
                                                  "\n medicamentos de soporte para manejar los efectos secundarios, como antieméticos para las náuseas (como el ondansetrón, una marca común es Zofran), analgésicos" +
                                                  "\n para el dolor (como el paracetamol, una marca común es Tempra o Tylenol), y factores estimulantes de colonias para apoyar la médula ósea. En cuanto a la   " +
                                                  "\n alimentación, es recomendable que el niño consuma alimentos que fortalezcan su sistema inmune, le proporcionen energía y le ayuden a tolerar mejor el      " +
                                                  "\n tratamiento, priorizando aquellos que sean nutritivos y de fácil digestión. Esto incluye proteínas de alto valor biológico (pollo, pescado, huevos, legumbres)" +
                                                  "\n que son esenciales para la reparación celular y el mantenimiento de la masa muscular, crucial durante y después de la quimioterapia. Las verduras de hoja   " +
                                                  "\n verde oscuro como la col rizada (kale), que aporta Vitamina K, Vitamina A y antioxidantes, que pueden ayudar a reducir la inflamación y proteger las células," +
                                                  "\n y el pimiento rojo, que ofrece una gran cantidad de Vitamina C (alrededor de 127.7 mg por cada 100 gramos, lo que representa cerca del 142% de la ingesta   " +
                                                  "\n diaria recomendada para un niño de 4-8 años), esencial para la función inmunológica. Las frutas de colores vivos como la granada, rica en antioxidantes     " +
                                                  "\n (como punicalaginas) que pueden ofrecer propiedades protectoras, y las uvas, que contienen resveratrol, un compuesto con potencial antiinflamatorio.       " +
                                                  "\n El aguacate proporciona grasas saludables y Vitamina E, importantes para la energía y la salud general. Este es solo un Diagnóstico predeterminado lógico, " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se   " +
                                                  "\n recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la     " +
                                                  "\n respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su medico, Angel L Montes agradece tu visita a la app (Mi Vida) y    " +
                                                  "\n espera que te mejores.");
                            }
                        }
                        if(EstaturaMasculino.equals("1.45-1.60 m")){
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n Es recomendable que el niño, con una estatura de 1.55-1.70 m, durante la fase aguda de la influenza, mantenga reposo en cama o actividades muy tranquilas," +
                                                  "\n como leer o dibujar, para conservar energía y permitir que su cuerpo combata el virus. Debe evitar cualquier actividad física extenuante hasta que la     " +
                                                  "\n fiebre haya desaparecido por al menos 24 horas y los síntomas principales hayan mejorado significativamente. Una vez en recuperación, se puede reintroducir" +
                                                  "\n gradualmente la actividad ligera, como caminatas cortas, siempre bajo supervisión y asegurándose de que el niño no presente fatiga excesiva. También es   " +
                                                  "\n crucial el consumo diario de 2 a 2.5 Litros de agua al día (aproximadamente ocho a diez vasos de tamaño regular) o más si presenta fiebre alta, para      " +
                                                  "\n mantener una excelente hidratación, lo cual es vital para fluidificar las secreciones respiratorias, ayudar a regular la temperatura corporal y apoyar    " +
                                                  "\n el funcionamiento de sus órganos, así como la eliminación de toxinas. POSIBLE TRATAMIENTO:  Para la influenza en niños de esta edad, el tratamiento se    " +
                                                  "\n enfoca principalmente en aliviar los síntomas y prevenir complicaciones. Se pueden usar medicamentos antivirales como el oseltamivir (una marca común     " +
                                                  "\n es Tamiflu) si se administra dentro de las primeras 48 horas del inicio de los síntomas, ya que puede acortar la duración de la enfermedad y reducir la   " +
                                                  "\n gravedad. Sin embargo, su uso debe ser indicado por un médico. Para el manejo de los síntomas, se utilizan antipiréticos/analgésicos como el paracetamol  " +
                                                  "\n (marcas comunes incluyen Tempra o Tylenol) o el ibuprofeno (marcas comunes incluyen Advil o Motrin) para controlar la fiebre y el dolor. Es fundamental   " +
                                                  "\n evitar la aspirina en niños debido al riesgo de síndrome de Reye. También pueden usarse descongestionantes nasales (como la oximetazolina, una marca      " +
                                                  "\n común es Afrin Pediátrico, por periodos cortos) o soluciones salinas nasales para aliviar la congestión. En cuanto a la alimentación, es recomendable     " +
                                                  "\n que el niño consuma alimentos que sean fáciles de digerir, suaves para el estómago y ricos en nutrientes para fortalecer su sistema inmune y proporcionar " +
                                                  "\n energía durante la recuperación. Esto incluye: Caldo de pollo: Aporta líquidos y electrolitos, lo que es esencial para la hidratación. El caldo caliente  " +
                                                  "\n puede ayudar a aliviar la congestión nasal y de garganta. Frutas ricas en Vitamina C: Como la naranja (aproximadamente 53.2 mg de Vitamina C por cada     " +
                                                  "\n 100 gramos, que representa cerca del 59% de la ingesta diaria recomendada para un niño de 4-8 años), guayaba (con una concentración muy alta de Vitamina C," +
                                                  "\n alrededor de 228 mg por cada 100 gramos) y kiwi, que son vitales para el soporte del sistema inmunológico y la reducción de la duración de los resfriados." +
                                                  "\n Verduras cocidas: Como la zanahoria (rica en Vitamina A en forma de betacarotenos, que es importante para la salud de las mucosas y la función inmune)    " +
                                                  "\n y la espinaca (que aporta Vitamina K, Vitamina A y Hierro, apoyando la producción de glóbulos rojos y la energía). Alimentos ricos en zinc: Aunque no     " +
                                                  "\n son un alimento en sí, incluir alimentos como carne magra de res, lentejas y frijoles, que son fuentes de Zinc, puede ser beneficioso, ya que este mineral" +
                                                  "\n es crucial para la función inmunológica. Yogur natural: Si es tolerado, los probióticos del yogur pueden ayudar a mantener una flora intestinal saludable," +
                                                  "\n lo que a su vez apoya el sistema inmunológico. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente " +
                                                  "\n tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para   " +
                                                  "\n establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnostico no le satisface del todo se le  " +
                                                  "\n recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                               textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumonía." +
                                                  "\n Es recomendable que el niño, con una estatura de 1.55-1.70 m, durante la fase aguda de la neumonía, mantenga un reposo adecuado, limitando la actividad" +
                                                  "\n física a movimientos suaves y esenciales para su comodidad; evite cualquier ejercicio extenuante o juegos activos que puedan dificultar la respiración " +
                                                  "\n o agravar su condición pulmonar; el objetivo principal es conservar la energía para que el cuerpo combata la infección. Una vez que el médico lo autorice" +
                                                  "\n y los síntomas mejoren significativamente, se puede iniciar una reintroducción gradual de actividades de bajo impacto, como caminatas muy cortas o juegos" +
                                                  "\n tranquilos, siempre monitoreando la tolerancia del niño. Es crucial el consumo diario de 2.5 a 3 Litros de agua al día (diez a doce vasos de tamaño regular)" +
                                                  "\n o más si presenta fiebre o dificultad respiratoria que aumente la pérdida de líquidos, para mantener una hidratación óptima; esto es vital para fluidificar" +
                                                  "\n las secreciones pulmonares, facilitar su expulsión, ayudar a regular la temperatura corporal y asegurar el correcto funcionamiento de los órganos,     " +
                                                  "\n especialmente los riñones, que procesarán los medicamentos. POSIBLE TRATAMIENTO: Para la neumonía en niños, el tratamiento depende de si es de origen  " +
                                                  "\n bacteriano, viral o fúngico, aunque la mayoría de los casos bacterianos se tratan con antibióticos. La elección del antibiótico es determinada por el  " +
                                                  "\n médico, basándose en la edad del niño, el tipo de bacteria sospechada y los patrones de resistencia locales. Algunos antibióticos comunes incluyen la  " +
                                                  "\n amoxicilina (marcas comunes como Amoxil o Binotal), o en casos más severos o resistentes, ceftriaxona (una marca común es Rocephin) o azitromicina     " +
                                                  "\n (una marca común es Zithromax o Azyth); es fundamental que el tratamiento antibiótico se complete en su totalidad, incluso si el niño parece mejorar,  " +
                                                  "\n para prevenir recaídas y resistencia. Además de los antibióticos, se pueden usar antipiréticos/analgésicos como el paracetamol (marcas comunes como    " +
                                                  "\n Tempra o Tylenol) o el ibuprofeno (marcas comunes como Advil o Motrin) para controlar la fiebre y el dolor. En algunos casos, si la respiración es muy " +
                                                  "\n comprometida, podría ser necesario oxígeno suplementario. En cuanto a la alimentación, es recomendable que el niño consuma alimentos que sean de fácil " +
                                                  "\n digestión, suaves y nutritivos para apoyar la recuperación del sistema respiratorio y fortalecer el sistema inmune; esto incluye caldo de pollo o de   " +
                                                  "\n verduras, que aportan líquidos y electrolitos esenciales para la hidratación y pueden ayudar a calmar la garganta irritada; purés de frutas y verduras " +
                                                  "\n como el puré de papa (aporta Potasio y Vitamina C), puré de calabaza (rica en Vitamina A, importante para la salud de las membranas mucosas) o puré de " +
                                                  "\n manzana (suave para el estómago y fuente de fibra); proteínas de fácil digestión como pollo deshebrado, pescado blanco o huevo, que son cruciales para " +
                                                  "\n la reparación celular y el mantenimiento de la masa muscular durante la enfermedad; alimentos ricos en Vitamina C como la fresa (aproximadamente 58.8 mg" +
                                                  "\n de Vitamina C por cada 100 gramos, lo que representa cerca del 65% de la ingesta diaria recomendada para un niño de 4-8 años) y el pimiento rojo (una alta" +
                                                  "\n concentración de Vitamina C, alrededor de 127.7 mg por cada 100 gramos), que son excelentes para el apoyo inmunológico; alimentos con antioxidantes como" +
                                                  "\n el aguacate, que provee grasas saludables y Vitamina E, ayudando a proteger las células del daño oxidativo; y miel (en niños mayores de un año), que    " +
                                                  "\n puede ayudar a aliviar la tos y la irritación de garganta. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100%   " +
                                                  "\n que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico " +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnostico no le satisface" +
                                                  "\n del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores."); 
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visión borrosa, Pérdida de peso.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n Es recomendable que el niño, durante la fase de diagnóstico y manejo de la diabetes, mantenga una actividad física regular y adaptada a su condición," +
                                                  "\n ya que la actividad física es fundamental para mejorar la sensibilidad a la insulina, controlar los niveles de glucosa en sangre y mantener un peso  " +
                                                  "\n saludable, lo cual es vital en el manejo de la diabetes; se recomienda que realice 60 minutos o más de actividad física moderada a vigorosa la mayoría" +
                                                  "\n de los días de la semana, integrando ejercicios aeróbicos como correr, nadar o andar en bicicleta, y al menos tres días a la semana, actividades de   " +
                                                  "\n fortalecimiento muscular y óseo. Es crucial monitorear los niveles de glucosa antes, durante y después del ejercicio para prevenir hipo o hiperglucemias," +
                                                  "\n y ajustar la ingesta de alimentos o la dosis de insulina según las indicaciones médicas. También es crucial el consumo diario de 2 a 2.5 Litros de agua " +
                                                  "\n al día (aproximadamente ocho a diez vasos de tamaño regular) para mantener una excelente hidratación, lo que ayuda a la función renal, a la eliminación" +
                                                  "\n del exceso de glucosa a través de la orina en casos de hiperglucemia y al correcto metabolismo de los alimentos y medicamentos.                        " +
                                                  "\n POSIBLE TRATAMIENTO: Para la diabetes en niños, el tratamiento depende del tipo de diabetes; para la Diabetes Tipo 1, que es la más común en esta edad " +
                                                  "\n y se caracteriza por la falta de producción de insulina, el tratamiento es la insulina de por vida, administrada mediante inyecciones o bomba de insulina;" +
                                                  "\n las marcas de insulina varían y el tipo y dosis son determinados por el endocrinólogo pediátrico (por ejemplo, Humalog o Novolog de acción rápida,      " +
                                                  "\n y Lantus o Levemir de acción prolongada). Para la Diabetes Tipo 2, que en niños está asociada a menudo con la resistencia a la insulina y el sobrepeso, " +
                                                  "\n el tratamiento inicial puede incluir cambios en el estilo de vida, pero si no son suficientes, se pueden prescribir medicamentos orales como la metformina" +
                                                  "\n (una marca común es Glucophage o Dianben), que ayuda a mejorar la sensibilidad a la insulina y reducir la producción de glucosa por el hígado; en ambos   " +
                                                  "\n casos, el monitoreo constante de la glucosa en sangre es fundamental. En cuanto a la alimentación, es esencial una dieta balanceada que controle la ingesta" +
                                                  "\n de carbohidratos, priorice alimentos con bajo índice glucémico y sea rica en fibra para mantener estables los niveles de glucosa en sangre y promover un   " +
                                                  "\n peso saludable; esto incluye verduras sin almidón como el brócoli (aporta Vitamina C, Vitamina K y fibra, ayudando a la digestión y el control glucémico)  " +
                                                  "\n y la espinaca (rica en Magnesio, Vitamina K y Vitamina A, que pueden mejorar la sensibilidad a la insulina); frutas enteras con moderación como la manzana " +
                                                  "\n (con fibra soluble que ayuda a ralentizar la absorción de azúcar) y las bayas (arándanos, fresas, moras) que son ricas en antioxidantes (como antocianinas)" +
                                                  "\n y fibra, con bajo impacto en la glucosa; fuentes de proteína magra como pollo, pescado, frijoles y lentejas, que son fundamentales para la saciedad y el   " +
                                                  "\n mantenimiento de la masa muscular sin elevar drásticamente la glucosa; granos integrales como la avena (aporta fibra soluble como el beta-glucano, que ayuda" +
                                                  "\n a regular la glucosa y el colesterol) y el arroz integral, que proveen carbohidratos complejos que se digieren más lentamente; y grasas saludables presentes" +
                                                  "\n en el aguacate (fuente de grasas monoinsaturadas y Vitamina E, que pueden mejorar la sensibilidad a la insulina y la salud cardiovascular) y nueces, que    " +
                                                  "\n contribuyen a la saciedad y aportan nutrientes esenciales. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que   " +
                                                  "\n el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de      " +
                                                  "\n Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnostico no le satisface      " +
                                                  "\n del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresión en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n Es recomendable que el niño, durante el manejo del asma, mantenga una actividad física regular y controlada, ya que el ejercicio bien manejado puede " +
                                                  "\n mejorar la función pulmonar y la resistencia, pero debe ser supervisado para evitar desencadenar ataques; se recomienda que realice actividades físicas" +
                                                  "\n de baja a moderada intensidad, como caminar, nadar o andar en bicicleta, y que evite deportes de alta intensidad o de clima frío que puedan agravar sus" +
                                                  "\n síntomas, a menos que un médico lo autorice y se tomen las precauciones necesarias, como el uso de un broncodilatador antes del ejercicio; es crucial  " +
                                                  "\n que el niño tenga su medicación de rescate a mano y que los adultos estén capacitados para identificar y manejar una crisis asmática durante la actividad" +
                                                  "\n física. También es crucial el consumo diario de 2 a 2.5 Litros de agua al día (aproximadamente ocho a diez vasos de tamaño regular) para mantener una   " +
                                                  "\n excelente hidratación, lo que ayuda a fluidificar las secreciones respiratorias, prevenir la deshidratación y apoyar la función pulmonar, lo cual es vital" +
                                                  "\n para el manejo del asma. POSIBLE TRATAMIENTO: Para el asma en niños, el tratamiento se centra en el control de los síntomas y la prevención de las       " +
                                                  "\n exacerbaciones; se utiliza una combinación de medicamentos de control a largo plazo para reducir la inflamación de las vías respiratorias y medicamentos " +
                                                  "\n de rescate de acción rápida para aliviar los síntomas durante una crisis. Los medicamentos de control incluyen corticosteroides inhalados como la fluticasona" +
                                                  "\n (una marca común es Flixotide o Seretide, este último combinado con salmeterol) o la budesonida (una marca común es Pulmicort), que reducen la inflamación;" +
                                                  "\n también se pueden usar broncodilatadores de acción prolongada (LABA) en combinación con corticosteroides inhalados si los síntomas no se controlan adecuadamente." +
                                                  "\n Los medicamentos de rescate son broncodilatadores de acción corta (SABA) como el salbutamol o albuterol (marcas comunes como Ventolín o ProAir), que relajan " +
                                                  "\n rápidamente los músculos de las vías respiratorias para abrir los bronquios; es fundamental que el niño y sus cuidadores sepan cómo usar correctamente los   " +
                                                  "\n inhaladores y cómo reconocer y actuar ante una crisis asmática, y que el tratamiento sea supervisado por un neumólogo pediatra. En cuanto a la alimentación, " +
                                                  "\n aunque no cura el asma, una dieta saludable puede apoyar la salud pulmonar y el sistema inmune; esto incluye alimentos ricos en Vitamina C como la naranja   " +
                                                  "\n (aproximadamente 53.2 mg de Vitamina C por cada 100 gramos) y el pimiento rojo (con alrededor de 127.7 mg de Vitamina C por cada 100 gramos), que tienen     " +
                                                  "\n propiedades antioxidantes y antiinflamatorias, y pueden ayudar a reducir el estrés oxidativo en los pulmones; alimentos con Vitamina D como la leche fortificada" +
                                                  "\n y el salmón, ya que se ha demostrado que niveles adecuados de Vitamina D están asociados con una mejor función pulmonar y una menor frecuencia de ataques de asma;" +
                                                  "\n alimentos ricos en Vitamina E presente en el aguacate (con grasas saludables y Vitamina E, un antioxidante que puede proteger las células pulmonares) y las   " +
                                                  "\n semillas de girasol, que también tienen propiedades antioxidantes; alimentos con Magnesio como la espinaca y los frijoles negros, que pueden ayudar a relajar " +
                                                  "\n los músculos bronquiales y mejorar la función pulmonar; y ácidos grasos Omega-3 encontrados en pescados grasos como el salmón y las sardinas, que poseen propiedades" +
                                                  "\n antiinflamatorias que pueden ser beneficiosas para las vías respiratorias. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al " +
                                                  "\n 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de  " +
                                                  "\n Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnostico no le satisface del todo  " +
                                                  "\n se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, Pérdida de peso, Ganglios linfáticos inflamados, Erupción cutánea (Diarrea).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n Es recomendable que el niño, durante el manejo del VIH/SIDA, mantenga una actividad física regular y adaptada a su estado de salud, energía y fase del tratamiento;" +
                                                  "\n la actividad física moderada es beneficiosa para fortalecer el sistema inmune, mejorar la fuerza muscular, reducir la fatiga y mejorar el bienestar general, pero  " +
                                                  "\n debe ser supervisada para evitar el sobreesfuerzo o el riesgo de infecciones oportunistas si el sistema inmune está comprometido; se recomienda que realice 30 a 60" +
                                                  "\n minutos de actividad moderada la mayoría de los días de la semana, como caminatas, juegos tranquilos o natación, siempre bajo la supervisión de un médico o fisioterapeuta" +
                                                  "\n para asegurar que las actividades sean seguras y apropiadas. También es crucial el consumo diario de 2 a 2.5 Litros de agua al día (aproximadamente ocho a diez vasos" +
                                                  "\n de tamaño regular) para mantener una excelente hidratación, lo cual es vital para el funcionamiento óptimo de sus órganos, la eliminación de toxinas, el apoyo al    " +
                                                  "\n metabolismo de los medicamentos antirretrovirales y para compensar cualquier pérdida de líquidos debido a diarrea o fiebre, que pueden ser síntomas asociados a la   " +
                                                  "\n enfermedad o efectos secundarios del tratamiento. POSIBLE TRATAMIENTO: Para el VIH/SIDA en niños, el tratamiento principal es la terapia antirretroviral (TAR), que  " +
                                                  "\n consiste en una combinación de medicamentos para suprimir la replicación del virus, reducir la carga viral y mejorar el sistema inmune; la elección de los medicamentos" +
                                                  "\n y las dosis son altamente individualizadas y son determinadas por un infectólogo pediatra, basándose en la edad del niño, el peso, la carga viral, el recuento de    " +
                                                  "\n células CD4 y la presencia de resistencias; algunos ejemplos de medicamentos antirretrovirales incluyen inhibidores de la transcriptasa inversa análogos de nucleósidos" +
                                                  "\n (ITIAN) como el abacavir (una marca común es Ziagen) y la lamivudina (una marca común es Epivir); inhibidores de la transcriptasa inversa no análogos de nucleósidos " +
                                                  "\n (ITINN) como el efavirenz (una marca común es Sustiva); e inhibidores de la proteasa (IP) como el lopinavir/ritonavir (una marca común es Kaletra). El cumplimiento  " +
                                                  "\n estricto del tratamiento es fundamental para su efectividad y para prevenir el desarrollo de resistencia. Además de la TAR, se pueden utilizar medicamentos para prevenir" +
                                                  "\n o tratar infecciones oportunistas, como antibióticos (por ejemplo, cotrimoxazol o Bactrim) o antifúngicos (por ejemplo, fluconazol o Diflucan). En cuanto a la alimentación," +
                                                  "\n es fundamental una dieta nutritiva y de alta densidad calórica para apoyar el crecimiento, fortalecer el sistema inmune y contrarrestar la malnutrición o los efectos " +
                                                  "\n secundarios de los medicamentos, priorizando alimentos seguros y de fácil digestión; esto incluye proteínas de alto valor biológico como el pollo, pescado, huevos y  " +
                                                  "\n legumbres, que son esenciales para la reparación celular y el mantenimiento de la masa muscular, crucial para un sistema inmune fuerte; cereales integrales como la   " +
                                                  "\n avena y el arroz integral, que proveen energía sostenida y fibra; frutas y verduras de colores vivos como el mango (aporta Vitamina A y Vitamina C, esenciales para   " +
                                                  "\n la función inmune y la salud de las mucosas) y el brócoli (rico en Vitamina C y antioxidantes, que apoyan el sistema de defensa del cuerpo); alimentos ricos en grasas" +
                                                  "\n saludables como el aguacate (fuente de Vitamina E y grasas monoinsaturadas, importantes para la energía y la absorción de vitaminas liposolubles) y los frutos secos; " +
                                                  "\n y alimentos fortificados con vitaminas y minerales para compensar posibles deficiencias, como los que contienen Zinc (presente en carne de res magra y lentejas, crucial" +
                                                  "\n para la función inmune) y Hierro (en carnes rojas y espinacas, para prevenir la anemia). Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza" +
                                                  "\n al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida" +
                                                  "\n para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda" +
                                                  "\n mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreción anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n Es recomendable que el niño, durante el tratamiento de la gonorrea, mantenga reposo relativo y evite cualquier actividad física extenuante que pueda agravar la " +
                                                  "\n inflamación o incomodidad, especialmente si hay afectación en articulaciones o diseminación de la infección; la actividad principal debe ser descansar para permitir" +
                                                  "\n que el cuerpo se recupere y los antibióticos actúen eficazmente. Una vez que el médico confirme la erradicación de la infección y los síntomas hayan desaparecido " +
                                                  "\n por completo, se puede reintroducir gradualmente la actividad física normal y adaptada a su edad. También es crucial el consumo diario de 2 a 2.5 Litros de agua al" +
                                                  "\n día (aproximadamente ocho a diez vasos de tamaño regular) para mantener una excelente hidratación, lo cual es vital para apoyar la función renal en el procesamiento" +
                                                  "\n de los medicamentos, ayudar a la eliminación de toxinas y prevenir la deshidratación, especialmente si el niño experimenta fiebre u otros síntomas.                 " +
                                                  "\n POSIBLE TRATAMIENTO: Para la gonorrea en niños, que es una infección bacteriana, el tratamiento principal consiste en la administración inmediata de antibióticos,  " +
                                                  "\n siendo la ceftriaxona (que suele ser inyectable, una marca común es Rocephin) el tratamiento de elección, a menudo en una dosis única; en casos específicos o si la " +
                                                  "\n ceftriaxona no es viable, se puede considerar la cefixima (oral) combinada con azitromicina (oral, una marca común es Zithromax o Azyth). La elección y dosis del   " +
                                                  "\n antibiótico serán determinadas por un médico especialista, quien también evaluará si existe coinfección con Chlamydia, que a menudo se trata simultáneamente con    " +
                                                  "\n doxiciclina o azitromicina. Es fundamental que el tratamiento se complete en su totalidad para asegurar la erradicación de la bacteria y prevenir complicaciones    " +
                                                  "\n graves como daño articular o infecciones diseminadas, incluyendo meningitis. En cuanto a la alimentación, no existe una dieta específica para la gonorrea, pero     " +
                                                  "\n una nutrición adecuada es esencial para apoyar el sistema inmune del niño y facilitar la recuperación del cuerpo frente a la infección y el tratamiento antibiótico;" +
                                                  "\n esto incluye una dieta balanceada rica en proteínas de alto valor biológico como pollo, pescado y huevos, que son esenciales para la reparación de tejidos y el     " +
                                                  "\n fortalecimiento muscular; granos integrales como la avena y el arroz integral, que proveen energía sostenida y fibra; frutas y verduras variadas como la zanahoria  " +
                                                  "\n (aporta Vitamina A, importante para la salud de las mucosas) y las naranjas (ricas en Vitamina C, un potente antioxidante que apoya el sistema inmunológico), así   " +
                                                  "\n como verduras de hoja verde como la espinaca (que aporta Vitamina K, Hierro y Magnesio, esenciales para la energía y la función celular); y alimentos ricos en Zinc " +
                                                  "\n como las legumbres (frijoles, lentejas) o carne magra, ya que este mineral es crucial para la función inmune y la cicatrización. Este es solo un Diagnóstico        " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas,  " +
                                                  "\n para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si    " +
                                                  "\n la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida)            " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linfáticos inflamados, Úlceras o llagas dolorosas, Picazón o ardor, Dolor al orinar.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n Es recomendable que el niño, durante los brotes de herpes genital, mantenga un reposo relativo y evite actividades que puedan causar fricción o irritación en " +
                                                  "\n la zona afectada, como deportes de contacto o ropa ajustada; el objetivo principal es minimizar la incomodidad y facilitar la curación de las lesiones. Una vez" +
                                                  "\n que las lesiones hayan sanado por completo y no haya síntomas activos, el niño puede retomar gradualmente sus actividades físicas normales, siempre priorizando" +
                                                  "\n la higiene para prevenir la propagación. También es crucial el consumo diario de 2 a 2.5 Litros de agua al día (aproximadamente ocho a diez vasos de tamaño regular)" +
                                                  "\n para mantener una excelente hidratación, lo cual es vital para el bienestar general, apoyar la función renal en el procesamiento de medicamentos y ayudar en la" +
                                                  "\n eliminación de toxinas. POSIBLE TRATAMIENTO: Para el herpes genital en niños, que es causado por el virus del herpes simple (VHS), el tratamiento principal se " +
                                                  "\n basa en medicamentos antivirales para controlar los brotes, reducir la gravedad y la frecuencia de los mismos, y acelerar la curación de las lesiones; los     " +
                                                  "\n medicamentos antivirales más comunes incluyen el aciclovir (marcas comunes como Zovirax o Virmen), el valaciclovir (una marca común es Valtrex) y el famciclovir" +
                                                  "\n (una marca común es Famvir). La dosis y la duración del tratamiento serán determinadas por un médico especialista, generalmente un pediatra o infectólogo, y pueden" +
                                                  "\n variar si se trata de un primer brote, brotes recurrentes o si se busca una terapia supresora; es fundamental que el tratamiento se inicie lo antes posible una vez" +
                                                  "\n que aparecen los síntomas. Además de los antivirales, se pueden usar analgésicos como el paracetamol (marcas comunes como Tempra o Tylenol) o el ibuprofeno (marcas" +
                                                  "\n comunes como Advil o Motrin) para aliviar el dolor y la fiebre, así como cremas tópicas con lidocaína para el alivio local de la incomodidad. En cuanto a la       " +
                                                  "\n alimentación, no existe una dieta que cure el herpes, pero una nutrición adecuada puede fortalecer el sistema inmune y ayudar al cuerpo a combatir el virus y      " +
                                                  "\n manejar los brotes; esto incluye alimentos ricos en Lisina y bajos en Arginina, ya que se cree que una dieta con más Lisina y menos Arginina puede ayudar a        " +
                                                  "\n reducir la replicación del virus; alimentos ricos en Lisina incluyen el pollo, pescado (como el bacalao), legumbres (frijoles, lentejas) y productos lácteos       " +
                                                  "\n como el yogur (que además aporta probióticos beneficiosos para la salud intestinal); es recomendable limitar alimentos ricos en Arginina como el chocolate,        " +
                                                  "\n las nueces y las semillas, durante los brotes; también se incluyen alimentos ricos en Vitamina C como la guayaba (con una alta concentración de Vitamina C,        " +
                                                  "\n alrededor de 228 mg por cada 100 gramos) y el pimiento rojo (aproximadamente 127.7 mg de Vitamina C por cada 100 gramos), que son potentes antioxidantes y         " +
                                                  "\n cruciales para el sistema inmunológico, ayudando a la reparación de los tejidos; alimentos con Zinc presente en la carne de res magra, lentejas y garbanzos,       " +
                                                  "\n ya que este mineral es esencial para la función inmunológica y la cicatrización de heridas; alimentos con Vitamina A como la zanahoria (rica en betacarotenos,     " +
                                                  "\n precursores de la Vitamina A) y la espinaca, importantes para la salud de la piel y las membranas mucosas, que pueden verse afectadas durante un brote; y alimentos" +
                                                  "\n con Ácidos grasos Omega-3 encontrados en pescados grasos como el salmón y las sardinas, que tienen propiedades antiinflamatorias que pueden ayudar a reducir       " +
                                                  "\n la inflamación asociada a las lesiones. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa       " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor     " +
                                                  "\n seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar " +
                                                  "\n a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Úlceras indoloras, Erupción cutánea, Dolor de cabeza, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Sífilis." +
                                                  "\n Es recomendable que el niño, durante el tratamiento de la sífilis, mantenga un reposo relativo, especialmente si presenta síntomas sistémicos como fiebre o " +
                                                  "\n malestar general, o si hay afectación neurológica; la actividad física debe ser mínima para permitir que el cuerpo se recupere completamente de la infección." +
                                                  "\n Es crucial evitar cualquier actividad extenuante hasta que el médico confirme que la infección ha sido erradicada y los síntomas han desaparecido por completo." +
                                                  "\n Una vez que el tratamiento sea exitoso y el niño esté recuperado, puede retomar gradualmente sus actividades físicas normales de acuerdo a su edad. También es" +
                                                  "\n crucial el consumo diario de 2 a 2.5 Litros de agua al día (aproximadamente ocho a diez vasos de tamaño regular) para mantener una excelente hidratación, lo  " +
                                                  "\n cual es vital para apoyar la función renal en el procesamiento de los medicamentos, ayudar a la eliminación de toxinas y prevenir la deshidratación, especialmente" +
                                                  "\n si el niño experimenta fiebre u otros síntomas. POSIBLE TRATAMIENTO: Para la sífilis en niños, que es una infección bacteriana causada por Treponema pallidum, " +
                                                  "\n el tratamiento de elección es la penicilina G benzatínica, administrada mediante inyecciones intramusculares; la dosis y la duración del tratamiento dependen  " +
                                                  "\n de la etapa de la sífilis y si es congénita o adquirida. En casos de sífilis congénita, que es transmitida de la madre al bebé, el tratamiento puede ser más   " +
                                                  "\n prolongado y a menudo requiere la administración de penicilina intravenosa en el hospital. La penicilina G benzatínica es un antibiótico altamente efectivo    " +
                                                  "\n para erradicar la bacteria y prevenir complicaciones a largo plazo, como daño neurológico o cardíaco. Es crucial que el tratamiento se complete en su totalidad" +
                                                  "\n y que se realicen controles de seguimiento para asegurar la erradicación de la infección. Para niños alérgicos a la penicilina, un médico especialista, generalmente" +
                                                  "\n un infectólogo pediatra, considerará alternativas como la ceftriaxona, aunque la penicilina sigue siendo el estándar de oro. En cuanto a la alimentación, no   " +
                                                  "\n existe una dieta específica para la sífilis, pero una nutrición adecuada es fundamental para fortalecer el sistema inmune del niño y facilitar la recuperación " +
                                                  "\n del cuerpo frente a la infección y el tratamiento antibiótico; esto incluye una dieta balanceada rica en proteínas de alto valor biológico como pollo, pescado " +
                                                  "\n y huevos, que son esenciales para la reparación de tejidos y el fortalecimiento muscular; granos integrales como la avena y el arroz integral, que proveen energía" +
                                                  "\n sostenida y fibra; frutas y verduras variadas como el brócoli (aporta Vitamina C y antioxidantes, que apoyan el sistema de defensa del cuerpo) y la espinaca    " +
                                                  "\n (rica en Hierro, Vitamina K y Magnesio, esenciales para la energía y la función celular); así como alimentos ricos en Zinc como las legumbres (frijoles, lentejas)" +
                                                  "\n o carne magra, ya que este mineral es crucial para la función inmune y la cicatrización. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no " +
                                                  "\n garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un     " +
                                                  "\n Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnostico no le       " +
                                                  "\n satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Pérdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n Es recomendable que el niño, durante el tratamiento de la tuberculosis, mantenga un reposo adecuado en la fase intensiva de la enfermedad, limitando la actividad" +
                                                  "\n física extenuante para permitir que su cuerpo se enfoque en combatir la infección y se recupere. Una vez que el médico lo autorice y los síntomas mejoren        " +
                                                  "\n significativamente, generalmente después de las primeras dos semanas de tratamiento efectivo y cuando ya no sea contagioso, se puede reintroducir gradualmente   " +
                                                  "\n la actividad física, comenzando con caminatas cortas y suaves para fortalecer el corazón y los pulmones, aumentando progresivamente la intensidad según su       " +
                                                  "\n tolerancia. Es crucial el consumo diario de 2 a 2.5 Litros de agua al día (aproximadamente ocho a diez vasos de tamaño regular) para mantener una excelente      " +
                                                  "\n hidratación, lo cual es vital para apoyar la función renal en el procesamiento de los múltiples medicamentos antituberculosos, facilitar la eliminación de       " +
                                                  "\n toxinas y prevenir la deshidratación, especialmente si el niño experimenta fiebre o sudoración nocturna, síntomas comunes de la enfermedad.                      " +
                                                  "\n POSIBLE TRATAMIENTO: Para la tuberculosis en niños, el tratamiento es prolongado y se basa en una combinación de medicamentos antituberculosos que deben tomarse " +
                                                  "\n de forma estricta y supervisada para asegurar la erradicación de la bacteria y prevenir el desarrollo de resistencia a los fármacos; el esquema de tratamiento   " +
                                                  "\n inicial más común para la tuberculosis sensible a fármacos incluye una fase intensiva de dos meses seguida de una fase de continuación, utilizando medicamentos  " +
                                                  "\n como la isoniazida (una marca común en México es Cemidón o combinada en Rifater o Rifinah), la rifampicina (marcas comunes como Rifaldin o también en combinaciones" +
                                                  "\n como Rifater o Rifinah), la pirazinamida (también presente en Rifater) y el etambutol (una marca común es Myambutol). La dosis y la duración del tratamiento son " +
                                                  "\n estrictamente determinadas por un médico especialista, quien puede ser un infectólogo o neumólogo pediatra, y son ajustadas según el peso y la respuesta del niño." +
                                                  "\n Es crucial la administración conjunta de piridoxina (Vitamina B6) (por ejemplo, con Cemidón B6) con la isoniazida para prevenir la neurotoxicidad. En cuanto a la" +
                                                  "\n alimentación, es fundamental una dieta nutritiva y de alta densidad calórica para ayudar al niño a recuperar el peso perdido, fortalecer su sistema inmune y     " +
                                                  "\n contrarrestar la desnutrición, que a menudo acompaña a la tuberculosis; esto incluye proteínas de alto valor biológico como carne magra de res, pollo, pescado,  " +
                                                  "\n huevos y legumbres (frijoles, lentejas), que son esenciales para la reparación de tejidos, el mantenimiento de la masa muscular y la producción de anticuerpos;  " +
                                                  "\n carbohidratos complejos como el arroz integral, la avena, la papa y el camote, que proveen energía sostenida y fibra, importante para la salud intestinal; grasas" +
                                                  "\n saludables presentes en el aguacate (aporta Vitamina E y grasas monoinsaturadas) y aceites vegetales como el de oliva o maíz, que contribuyen a la densidad calórica" +
                                                  "\n y la absorción de vitaminas liposolubles; frutas y verduras variadas, ricas en Vitaminas y Minerales que fortalecen el sistema inmune, como la Vitamina C (en la " +
                                                  "\n naranja, guayaba y pimiento rojo, con propiedades antioxidantes y antiinflamatorias), Vitamina A (en la zanahoria y espinaca, importante para la salud de las    " +
                                                  "\n mucosas y la función inmune), Vitamina D (en la leche fortificada y salmón, asociada con una mejor respuesta inmune a la TB), y Zinc (en las lentejas y carne,   " +
                                                  "\n crucial para la función inmunológica). Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa      " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor   " +
                                                  "\n seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar" +
                                                  "\n a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchazón en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n Es recomendable que el niño, con artritis, mantenga una actividad física regular y adaptada para fortalecer los músculos alrededor de las articulaciones, " +
                                                  "\n mantener la flexibilidad y reducir la inflamación, pero siempre bajo supervisión médica y de un fisioterapeuta para evitar sobrecargar las articulaciones " +
                                                  "\n afectadas; se sugiere realizar ejercicios de bajo impacto como la natación, bicicleta estática o caminatas suaves, buscando períodos de 30 a 60 minutos la" +
                                                  "\n mayoría de los días de la semana, ajustando la intensidad según el nivel de dolor y la fase de la enfermedad. Durante los brotes o períodos de dolor agudo," +
                                                  "\n es importante limitar la actividad y priorizar el reposo para permitir la desinflamación y la recuperación. También es crucial el consumo diario de 2 a 2.5" +
                                                  "\n Litros de agua al día (aproximadamente ocho a diez vasos de tamaño regular) para mantener una excelente hidratación, lo cual es vital para la salud de los " +
                                                  "\n cartílagos, la lubricación de las articulaciones y para apoyar la función renal en el procesamiento de los medicamentos. POSIBLE TRATAMIENTO: Para la artritis" +
                                                  "\n en niños, comúnmente conocida como artritis idiopática juvenil (AIJ), el tratamiento busca controlar la inflamación, aliviar el dolor, prevenir el daño articular" +
                                                  "\n y mantener la función de las articulaciones; el tratamiento es altamente individualizado y supervisado por un reumatólogo pediatra. Inicialmente, se pueden " +
                                                  "\n usar antiinflamatorios no esteroideos (AINEs) como el ibuprofeno (marcas comunes como Advil o Motrin) o el naproxeno (una marca común es Flanax) para reducir" +
                                                  "\n el dolor y la inflamación. Si los AINEs no son suficientes, se utilizan fármacos antirreumáticos modificadores de la enfermedad (FARMEs) como el metotrexato " +
                                                  "\n (una marca común es Rheumatrex o Trexall), que actúa lentamente para reducir la inflamación y prevenir el daño articular a largo plazo. En casos más severos " +
                                                  "\n o cuando no hay respuesta a los FARMEs tradicionales, se pueden emplear agentes biológicos como el etanercept (una marca común es Enbrel) o el adalimumab    " +
                                                  "\n (una marca común es Humira), que son medicamentos inyectables que actúan sobre componentes específicos del sistema inmune. Además de los medicamentos, la    " +
                                                  "\n fisioterapia y la terapia ocupacional son fundamentales para mantener la movilidad y la fuerza. En cuanto a la alimentación, una dieta antiinflamatoria puede" +
                                                  "\n complementar el tratamiento médico, ayudando a reducir la inflamación y apoyar la salud articular; esto incluye: alimentos ricos en ácidos grasos Omega-3 como" +
                                                  "\n el salmón (graso y fuente de Omega-3, que reduce la inflamación y puede aliviar el dolor articular) y las semillas de chía, que tienen potentes propiedades   " +
                                                  "\n antiinflamatorias; frutas y verduras de colores vivos ricas en antioxidantes como las cerezas (con antocianinas, que pueden reducir la inflamación) y el brócoli" +
                                                  "\n (aporta Vitamina C y Vitamina K, con efectos protectores y antiinflamatorios); alimentos con Vitamina D y Calcio como la leche fortificada y el yogur (que    " +
                                                  "\n contribuyen a la salud ósea, vital en niños con artritis); y especias como la cúrcuma (con curcumina, un potente antiinflamatorio) que pueden incorporarse en " +
                                                  "\n la dieta para sus propiedades antiinflamatorias. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente   " +
                                                  "\n tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer" +
                                                  "\n mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho" +
                                                  "\n consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n Es recomendable que el niño, durante la fase aguda de la tosferina, mantenga reposo estricto para conservar energía y minimizar los episodios de tos severa" +
                                                  "\n que pueden ser agotadores y peligrosos; la actividad física debe ser evitada por completo para prevenir la irritación de las vías respiratorias y el riesgo" +
                                                  "\n de complicaciones como la neumonía o la apnea. Una vez que la fase de tos paroxística disminuya significativamente y bajo estricta supervisión médica, se  " +
                                                  "\n puede reintroducir gradualmente la actividad ligera, como juegos tranquilos o caminatas cortas, siempre monitoreando la tolerancia y evitando cualquier    " +
                                                  "\n esfuerzo que pueda desencadenar la tos. También es crucial el consumo diario de 2 a 2.5 Litros de agua al día (aproximadamente ocho a diez vasos de tamaño " +
                                                  "\n regular), preferiblemente en pequeñas tomas frecuentes, para mantener una excelente hidratación, lo cual es vital para fluidificar las secreciones, prevenir" +
                                                  "\n la deshidratación causada por los vómitos asociados a los ataques de tos, y apoyar la función general de los órganos, incluyendo los riñones que procesarán " +
                                                  "\n los medicamentos. POSIBLE TRATAMIENTO: Para la tosferina, una infección bacteriana altamente contagiosa causada por Bordetella pertussis, el tratamiento   " +
                                                  "\n principal son los antibióticos, que son más efectivos si se administran en las primeras etapas de la enfermedad para acortar la duración y la gravedad de  " +
                                                  "\n los síntomas, así como para reducir la transmisión; los antibióticos de elección son los macrólidos, como la azitromicina (una marca común es Zithromax o  " +
                                                  "\n Azyth), la eritromicina (una marca común es Pantomicina o Erythromycin) o la claritromicina (una marca común es Klacid o Biaxin). La duración del tratamiento" +
                                                  "\n suele ser de 5 a 14 días, dependiendo del antibiótico elegido; es fundamental que el tratamiento sea completado en su totalidad para erradicar la bacteria." +
                                                  "\n En casos graves, especialmente en lactantes, puede requerirse hospitalización para monitorear la respiración, administrar oxígeno y líquidos por vía intravenosa;" +
                                                  "\n también se pueden usar antitusivos y expectorantes, pero su eficacia en la tosferina es limitada y deben ser usados con precaución y bajo indicación médica." +
                                                  "\n En cuanto a la alimentación, debido a que los ataques de tos pueden provocar vómitos, es recomendable que el niño consuma alimentos en pequeñas porciones y " +
                                                  "\n de fácil digestión para asegurar la ingesta calórica y nutricional; esto incluye caldo de pollo o verduras, que aporta líquidos y electrolitos, esencial    " +
                                                  "\n para la hidratación y suave para el estómago; purés suaves de verduras como la calabaza (rica en Vitamina A, importante para la salud de las mucosas respiratorias)" +
                                                  "\n o de frutas como el plátano (aporta Potasio, un electrolito importante, y es fácil de digerir); alimentos ricos en Vitamina C como la naranja (aproximadamente" +
                                                  "\n 53.2 mg de Vitamina C por cada 100 gramos) y la guayaba (con una alta concentración de Vitamina C, alrededor de 228 mg por cada 100 gramos), que son antioxidantes" +
                                                  "\n y fortalecen el sistema inmunológico; fuentes de proteína magra como pollo deshebrado o pescado blanco, en pequeñas cantidades, para apoyar la reparación de  " +
                                                  "\n tejidos y la energía; y cereales suaves como la avena cocida, que provee energía y es fácil de tragar. Este es solo un Diagnóstico predeterminado lógico,     " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se      " +
                                                  "\n recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta" +
                                                  "\n del Diagnostico no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchazón de las glándulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n Es recomendable que el niño, durante la enfermedad de las paperas, mantenga reposo estricto para facilitar la recuperación y prevenir complicaciones, especialmente" +
                                                  "\n si presenta fiebre o inflamación significativa de las glándulas; la actividad física debe ser mínima y se debe evitar cualquier esfuerzo que pueda aumentar la     " +
                                                  "\n incomodidad o el riesgo de complicaciones como la orquitis (inflamación testicular) en niños mayores. Una vez que la inflamación disminuya y el médico lo autorice," +
                                                  "\n el niño puede retomar gradualmente las actividades normales. También es crucial el consumo diario de 2 a 2.5 Litros de agua al día (aproximadamente ocho a diez    " +
                                                  "\n vasos de tamaño regular) para mantener una excelente hidratación, lo cual es vital para ayudar a bajar la fiebre, prevenir la deshidratación y asegurar el correcto" +
                                                  "\n funcionamiento de los órganos, facilitando el proceso de recuperación del cuerpo. POSIBLE TRATAMIENTO: Para las paperas, una infección viral causada por el virus  " +
                                                  "\n de las paperas, no existe un tratamiento antiviral específico, por lo que el manejo se enfoca en aliviar los síntomas y prevenir complicaciones; el tratamiento es " +
                                                  "\n principalmente de soporte. Se utilizan analgésicos y antipiréticos como el paracetamol (marcas comunes como Tempra o Tylenol) o el ibuprofeno (marcas comunes como " +
                                                  "\n Advil o Motrin) para controlar la fiebre y el dolor asociado a la inflamación de las glándulas salivales, la mandíbula o los testículos. También se recomienda     " +
                                                  "\n aplicar compresas frías o calientes en las áreas inflamadas para reducir la hinchazón y el dolor. Es fundamental que el niño reciba mucho descanso y se le ofrezcan" +
                                                  "\n líquidos para mantenerse hidratado. En algunos casos, si la inflamación es severa o hay complicaciones (como meningitis o encefalitis), puede ser necesaria la     " +
                                                  "\n hospitalización. En cuanto a la alimentación, debido a la inflamación de las glándulas salivales que puede dificultar la masticación y la deglución, es recomendable" +
                                                  "\n que el niño consuma alimentos suaves, líquidos o semilíquidos, y de fácil digestión para asegurar una adecuada nutrición y evitar molestias; esto incluye líquidos  " +
                                                  "\n claros y caldos como caldo de pollo o verduras, sueros orales (como Pedialyte o Electrolit) y jugos naturales diluidos, que aportan líquidos y electrolitos         " +
                                                  "\n esenciales para la hidratación; purés y papillas como puré de papa, puré de manzana, compotas de frutas como el plátano (aporta Potasio y es fácil de digerir),     " +
                                                  "\n y purés de verduras como la calabaza (rica en Vitamina A, que contribuye a la salud de las mucosas); yogur natural y gelatinas, que son suaves para el estómago y la" +
                                                  "\n garganta, y el yogur puede aportar probióticos beneficiosos; y alimentos ricos en Vitamina C, aunque la masticación puede ser un problema, el jugo diluido de naranja" +
                                                  "\n o guayaba (ambas ricas en Vitamina C, antioxidante crucial para el sistema inmunológico) puede ser beneficioso; también se incluyen proteínas líquidas o muy suaves," +
                                                  "\n como suplementos nutricionales líquidos si la ingesta de alimentos sólidos es muy difícil. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no" +
                                                  "\n garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un      " +
                                                  "\n Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnostico no le satisface" +
                                                  "\n del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupción cutánea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n Es recomendable que el niño, durante la infección por el virus Zika, mantenga reposo estricto para facilitar la recuperación y reducir el riesgo de complicaciones," +
                                                  "\n especialmente si presenta fiebre o síntomas neurológicos; la actividad física debe ser mínima y se deben evitar esfuerzos que puedan agravar el malestar. Una vez  " +
                                                  "\n que el médico lo autorice y los síntomas hayan desaparecido por completo, el niño puede retomar gradualmente sus actividades normales. También es crucial el consumo" +
                                                  "\n diario de 2 a 2.5 Litros de agua al día (aproximadamente ocho a diez vasos de tamaño regular) para mantener una excelente hidratación, lo cual es vital para ayudar " +
                                                  "\n a bajar la fiebre, prevenir la deshidratación causada por la sudoración o vómitos, y asegurar el correcto funcionamiento de los órganos mientras el cuerpo combate " +
                                                  "\n la infección viral. POSIBLE TRATAMIENTO: Para la infección por el virus Zika, al ser una enfermedad viral, no existe un tratamiento antiviral específico, por lo que" +
                                                  "\n el manejo se enfoca en aliviar los síntomas; el tratamiento es principalmente de soporte. Se utilizan analgésicos y antipiréticos como el paracetamol (marcas comunes" +
                                                  "\n como Tempra o Tylenol) o el ibuprofeno (marcas comunes como Advil o Motrin) para controlar la fiebre, el dolor de cabeza, el dolor muscular y articular. Es         " +
                                                  "\n fundamental evitar la aspirina y otros AINEs en niños con sospecha de Zika hasta que se haya descartado el dengue, debido al riesgo de complicaciones hemorrágicas. " +
                                                  "\n También se recomienda mucho reposo y la ingesta abundante de líquidos para prevenir la deshidratación. En algunos casos, si se presentan complicaciones neurológicas" +
                                                  "\n como el síndrome de Guillain-Barré, el tratamiento se centrará en el manejo de estas condiciones específicas, lo cual puede requerir hospitalización y terapias     " +
                                                  "\n especializadas. En cuanto a la alimentación, una dieta nutritiva y de fácil digestión es esencial para apoyar la recuperación del niño y fortalecer su sistema      " +
                                                  "\n inmunológico; esto incluye líquidos claros y caldos como caldo de pollo o verduras, sueros orales (como Pedialyte o Electrolit) y jugos naturales diluidos, que     " +
                                                  "\n aportan líquidos y electrolitos esenciales para la hidratación y el reemplazo de sales minerales; purés y papillas como puré de papa, puré de manzana, compotas     " +
                                                  "\n de frutas como el plátano (aporta Potasio, un electrolito importante, y es fácil de digerir), y purés de verduras como la zanahoria (rica en Vitamina A, que contribuye" +
                                                  "\n a la salud de las mucosas y la visión); alimentos ricos en Vitamina C como la naranja (aproximadamente 53.2 mg de Vitamina C por cada 100 gramos) y la guayaba      " +
                                                  "\n (con una alta concentración de Vitamina C, alrededor de 228 mg por cada 100 gramos), que son potentes antioxidantes y cruciales para el sistema inmunológico,       " +
                                                  "\n ayudando a combatir la infección viral; fuentes de proteína suave como pollo deshebrado o pescado blanco, en pequeñas cantidades, para apoyar la reparación de      " +
                                                  "\n tejidos y la energía, evitando el sobreesfuerzo digestivo; y cereales suaves como la avena cocida o el arroz blanco, que proveen energía y son fáciles de digerir.  " +
                                                  "\n Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus  " +
                                                  "\n respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente," +
                                                  "\n además por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app" +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, Vómitos, Deshidratación, Dolor abdominal.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n Es recomendable que el niño, durante la infección por rotavirus, mantenga un reposo estricto para conservar energía y permitir que el cuerpo se recupere de la diarrea" +
                                                  "\n y los vómitos; la actividad física debe ser mínima para evitar la deshidratación y la fatiga, y cualquier esfuerzo extenuante debe ser evitado hasta que los síntomas " +
                                                  "\n gastrointestinales hayan desaparecido por completo y el niño haya recuperado su energía habitual. También es crucial el consumo diario de 2.5 a 3 Litros de agua al   " +
                                                  "\n día (aproximadamente diez a doce vasos de tamaño regular), o incluso más, para mantener una excelente hidratación, lo cual es vital para reponer los líquidos y       " +
                                                  "\n electrolitos perdidos por la diarrea y el vómito, prevenir la deshidratación severa y asegurar el correcto funcionamiento de todos los órganos.                       " +
                                                  "\n POSIBLE TRATAMIENTO: Para la infección por rotavirus, al ser una enfermedad viral, no existe un tratamiento antiviral específico, por lo que el manejo se enfoca en   " +
                                                  "\n la prevención y el alivio de los síntomas, principalmente la diarrea y el vómito; la piedra angular del tratamiento es la rehidratación oral con soluciones de        " +
                                                  "\n rehidratación oral (SRO) como Pedialyte o Electrolit, que contienen la combinación adecuada de agua, sales y azúcar para reponer los líquidos y electrolitos perdidos." +
                                                  "\n Es fundamental administrar estas soluciones en pequeñas tomas frecuentes para evitar provocar más vómitos. En algunos casos, se puede considerar el uso de probióticos" +
                                                  "\n (por ejemplo, aquellos con Lactobacillus rhamnosus GG o Saccharomyces boulardii, como Floratil) que pueden ayudar a acortar la duración de la diarrea; sin embargo,   " +
                                                  "\n su uso debe ser bajo supervisión médica. Los medicamentos antidiarreicos no se recomiendan en niños con rotavirus. En casos de deshidratación severa o vómitos        " +
                                                  "\n persistentes, puede ser necesaria la hospitalización para administrar líquidos por vía intravenosa. La vacunación contra el rotavirus (disponible con marcas como     " +
                                                  "\n Rotateq o Rotarix) es la forma más efectiva de prevenir la infección y sus complicaciones. En cuanto a la alimentación, es crucial reintroducir la dieta normal tan   " +
                                                  "\n pronto como sea posible, ofreciendo alimentos de fácil digestión para evitar el riesgo de desnutrición; esto incluye el pecho materno o fórmula si el niño es lactante;" +
                                                  "\n cereales como el arroz blanco o la avena cocida, que son suaves y aportan energía; proteínas magras como pollo deshebrado o pescado blanco, en pequeñas porciones, para" +
                                                  "\n ayudar a la recuperación y el mantenimiento de la masa muscular; frutas como el plátano (aporta Potasio, un electrolito vital para la función muscular y nerviosa, y es" +
                                                  "\n fácil de digerir) y puré de manzana, que son suaves para el estómago; y verduras cocidas como la zanahoria (rica en Vitamina A, que apoya la salud de las mucosas     " +
                                                  "\n intestinales y el sistema inmune) y la papa. Se deben evitar los alimentos grasos, azucarados o muy condimentados que puedan agravar la diarrea. Este es solo un      " +
                                                  "\n Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén   " +
                                                  "\n correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su    " +
                                                  "\n salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y   " +
                                                  "\n espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, Náuseas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n Es recomendable que el niño, durante la infección por Listeria (Listeriosis), mantenga reposo estricto para permitir que su cuerpo combata la infección y se recupere," +
                                                  "\n especialmente si hay fiebre, diarrea o síntomas más graves como meningitis; la actividad física debe ser mínima o nula para conservar energía y evitar cualquier      " +
                                                  "\n esfuerzo que pueda agravar la condición o el riesgo de complicaciones. Una vez que el médico confirme la erradicación de la infección y los síntomas hayan desaparecido" +
                                                  "\n por completo, se puede reintroducir gradualmente la actividad ligera, siempre monitoreando la tolerancia del niño. También es crucial el consumo diario de 2.5 a       " +
                                                  "\n 3 Litros de agua al día (diez a doce vasos de tamaño regular) para mantener una excelente hidratación, lo cual es vital para apoyar la función renal en el procesamiento" +
                                                  "\n de los antibióticos, ayudar a la eliminación de toxinas y prevenir la deshidratación, especialmente si el niño experimenta fiebre o diarrea.                            " +
                                                  "\n POSIBLE TRATAMIENTO: Para la Listeriosis, una infección bacteriana grave causada por Listeria monocytogenes, el tratamiento principal y de elección son los antibióticos," +
                                                  "\n que deben iniciarse de inmediato, especialmente en niños; la ampicilina (una marca común es Omnipen o Polycillin) es el antibiótico de elección y a menudo se combina con" +
                                                  "\n gentamicina (una marca común es Garamicina o Gentax), un aminoglucósido, para una mayor efectividad, especialmente en casos graves como meningitis o infecciones         " +
                                                  "\n diseminadas. La duración del tratamiento es prolongada, generalmente de 14 a 21 días o más, dependiendo de la gravedad de la infección y la respuesta clínica del niño.  " +
                                                  "\n Es fundamental que el tratamiento antibiótico se complete en su totalidad para asegurar la erradicación de la bacteria y prevenir recaídas o complicaciones a largo plazo." +
                                                  "\n En algunos casos, si la respuesta no es adecuada o hay alergia a la penicilina, el médico podría considerar alternativas como el cotrimoxazol (una marca común es Bactrim" +
                                                  "\n o Septrin). El monitoreo hospitalario es común en casos severos para el soporte vital. En cuanto a la alimentación, una dieta nutritiva y de fácil digestión es esencial " +
                                                  "\n para apoyar la recuperación del niño, fortalecer su sistema inmune y contrarrestar cualquier pérdida de apetito o nutrientes debido a la enfermedad; esto incluye        " +
                                                  "\n proteínas de alto valor biológico como pollo deshebrado, pescado blanco o huevo, que son esenciales para la reparación celular y el fortalecimiento muscular; cereales   " +
                                                  "\n suaves y de fácil digestión como el arroz blanco o la avena cocida, que proveen energía sin sobrecargar el sistema digestivo; frutas y verduras cocidas y en puré, para  " +
                                                  "\n facilitar la ingesta y la digestión, como la calabaza (rica en Vitamina A, que apoya la salud de las mucosas y la función inmune) y el plátano (aporta Potasio, un       " +
                                                  "\n electrolito vital, y es fácil de digerir); también alimentos ricos en Vitamina C como el puré de guayaba (con una alta concentración de Vitamina C, alrededor de 228 mg  " +
                                                  "\n por cada 100 gramos) o jugo de naranja diluido (aproximadamente 53.2 mg de Vitamina C por cada 100 gramos), que son antioxidantes y cruciales para el sistema            " +
                                                  "\n inmunológico. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la          " +
                                                  "\n enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento            " +
                                                  "\n adecuado de su paciente, además por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes       " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, Vómitos.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n Es recomendable que el niño, durante la infección por Shigelosis, mantenga reposo estricto para conservar energía y permitir que el cuerpo se recupere de la" +
                                                  "\n diarrea severa, a menudo con sangre, y el malestar abdominal; la actividad física debe ser mínima para evitar la deshidratación, la fatiga y el riesgo de   " +
                                                  "\n complicaciones, y cualquier esfuerzo extenuante debe ser evitado hasta que los síntomas gastrointestinales hayan desaparecido por completo y el niño haya   " +
                                                  "\n recuperado su energía habitual. También es crucial el consumo diario de 2.5 a 3 Litros de agua al día (aproximadamente diez a doce vasos de tamaño regular)," +
                                                  "\n o incluso más, para mantener una excelente hidratación, lo cual es vital para reponer los líquidos y electrolitos perdidos por la diarrea profusa y los vómitos," +
                                                  "\n prevenir la deshidratación severa y el desequilibrio electrolítico, y asegurar el correcto funcionamiento de todos los órganos. POSIBLE TRATAMIENTO: Para la" +
                                                  "\n Shigelosis, una infección bacteriana causada por Shigella spp., el tratamiento principal son los antibióticos, que son fundamentales para acortar la duración" +
                                                  "\n de la enfermedad, reducir la gravedad de los síntomas y disminuir la transmisión, ya que la infección es altamente contagiosa; la elección del antibiótico se" +
                                                  "\n basa en la resistencia local, pero comúnmente se utilizan la azitromicina (una marca común es Zithromax o Azyth), la ceftriaxona (una marca común es Rocephin)" +
                                                  "\n o la ciprofloxacina (esta última generalmente no se recomienda en niños pequeños a menos que sea estrictamente necesario y bajo supervisión médica). La duración" +
                                                  "\n del tratamiento antibiótico suele ser de 3 a 5 días, y es fundamental que se complete en su totalidad para asegurar la erradicación de la bacteria y prevenir " +
                                                  "\n recaídas o el desarrollo de resistencia. Además de los antibióticos, la rehidratación oral con soluciones de rehidratación oral (SRO) como Pedialyte o Electrolit" +
                                                  "\n es esencial para reponer líquidos y electrolitos. Los medicamentos antidiarreicos que disminuyen la motilidad intestinal (como la loperamida) están contraindicados" +
                                                  "\n en la shigelosis porque pueden prolongar la infección y aumentar el riesgo de complicaciones. En casos de deshidratación severa o complicaciones, puede requerirse" +
                                                  "\n hospitalización para administración de líquidos intravenosos. En cuanto a la alimentación, una dieta nutritiva y de fácil digestión es crucial para apoyar la    " +
                                                  "\n recuperación del niño, fortalecer su sistema inmune y contrarrestar la malnutrición o la pérdida de peso debido a la diarrea severa; esto incluye el pecho materno" +
                                                  "\n o fórmula si el niño es lactante; cereales suaves y de fácil digestión como el arroz blanco, la avena cocida o la papa, que proveen energía sin sobrecargar el   " +
                                                  "\n sistema digestivo; proteínas magras y de fácil digestión como pollo deshebrado o pescado blanco, en pequeñas porciones, para ayudar a la reparación de tejidos   " +
                                                  "\n y el mantenimiento de la masa muscular; frutas como el plátano (aporta Potasio, un electrolito vital para la función muscular y nerviosa, y es fácil de digerir) " +
                                                  "\n y puré de manzana, que son suaves para el estómago; y verduras cocidas como la zanahoria (rica en Vitamina A, que apoya la salud de las mucosas intestinales y el" +
                                                  "\n sistema inmune) y calabaza. Se deben evitar los alimentos ricos en fibra insoluble, grasas, azúcares simples y lácteos (a menos que sean fórmulas sin lactosa o  " +
                                                  "\n yogur con probióticos si se toleran bien) que puedan agravar la diarrea. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100%" +
                                                  "\n que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida" +
                                                  "\n para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnostico no le satisface del todo se le     " +
                                                  "\n recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos crónica, Producción excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad Pulmonar Obstructiva Crónica (EPOC)." +
                                                  "\n Es recomendable que el niño, con EPOC, mantenga una actividad física regular y adaptada a su capacidad respiratoria para fortalecer la musculatura respiratoria," +
                                                  "\n mejorar la resistencia y la función pulmonar, pero siempre bajo supervisión médica y con un plan de rehabilitación pulmonar para evitar el sobreesfuerzo y el   " +
                                                  "\n riesgo de exacerbaciones; se sugiere realizar ejercicios de bajo impacto como caminatas suaves en terreno llano, natación o bicicleta estática, buscando periodos" +
                                                  "\n de 30 a 60 minutos la mayoría de los días de la semana, aumentando la duración y la intensidad progresivamente según la tolerancia del niño, y evitando actividades" +
                                                  "\n que puedan agravar los síntomas como ambientes muy fríos o con alta contaminación; es crucial que el niño tenga su medicación de rescate a mano y aprenda técnicas" +
                                                  "\n de respiración como la respiración con labios fruncidos para mejorar la ventilación. También es crucial el consumo diario de 2 a 2.5 Litros de agua al día       " +
                                                  "\n (aproximadamente ocho a diez vasos de tamaño regular) para mantener una excelente hidratación, lo cual es vital para fluidificar las secreciones pulmonares,     " +
                                                  "\n facilitar su expectoración y prevenir la deshidratación, especialmente si el niño experimenta dificultad para respirar o ha estado tosiendo mucho.               " +
                                                  "\n POSIBLE TRATAMIENTO: Para la EPOC en niños, aunque es menos común que en adultos y a menudo asociada a factores como la prematuridad, infecciones recurrentes o  " +
                                                  "\n exposición a irritantes ambientales en las primeras etapas de la vida, el tratamiento se enfoca en el control de los síntomas, la prevención de exacerbaciones y " +
                                                  "\n la mejora de la calidad de vida; el tratamiento es altamente individualizado y supervisado por un neumólogo pediatra. Se utilizan broncodilatadores inhalados    " +
                                                  "\n para relajar los músculos de las vías respiratorias y facilitar la respiración; estos pueden ser de acción corta para alivio rápido (como el salbutamol o        " +
                                                  "\n albuterol, marcas como Ventolín o Proair HFA) o de acción prolongada para el mantenimiento (como el tiotropio, marca Spiriva, o combinaciones como               " +
                                                  "\n salmeterol/fluticasona, marca Advair). En casos de inflamación, se pueden prescribir corticosteroides inhalados (como la budesonida, marca Pulmicort, o la       " +
                                                  "\n fluticasona, marca Flovent) solos o en combinación con broncodilatadores. Durante las exacerbaciones, pueden ser necesarios corticosteroides orales (como la     " +
                                                  "\n prednisolona) y antibióticos si hay una infección bacteriana. La oxigenoterapia se indica si el niño presenta bajos niveles de oxígeno en sangre. Además,        " +
                                                  "\n la rehabilitación pulmonar es un componente fundamental para mejorar la función respiratoria y la tolerancia al ejercicio. En cuanto a la alimentación, una      " +
                                                  "\n dieta nutritiva y balanceada es esencial para mantener un peso saludable, proporcionar energía y fortalecer el sistema inmune, lo cual es crucial para la        " +
                                                  "\n salud pulmonar; esto incluye proteínas magras de alto valor biológico como pollo, pescado, huevos y legumbres, que son importantes para el mantenimiento de      " +
                                                  "\n la masa muscular y la reparación de tejidos; carbohidratos complejos como el arroz integral, la avena y las papas, que proveen energía sostenida; grasas         " +
                                                  "\n saludables presentes en el aguacate (aporta Vitamina E y grasas monoinsaturadas, que pueden ayudar a reducir la inflamación) y los frutos secos, que contribuyen " +
                                                  "\n a la densidad calórica; y una gran variedad de frutas y verduras ricas en antioxidantes y Vitaminas que benefician la función pulmonar, como la naranja y        " +
                                                  "\n las fresas (ricas en Vitamina C, un potente antioxidante que ayuda a prevenir el daño por radicales libres y reducir la inflamación pulmonar), el melón cantalupo" +
                                                  "\n (aporta Vitamina A y Vitamina C, esenciales para el sistema inmune y la salud pulmonar), y verduras de hoja verde como la espinaca y el brócoli (que aportan     " +
                                                  "\n Vitamina K, Magnesio y otros antioxidantes). También se recomienda fraccionar las comidas en porciones más pequeñas y frecuentes para evitar la sensación de     " +
                                                  "\n plenitud que puede dificultar la respiración, y limitar los alimentos que producen gases. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado  " +
                                                  "\n no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de    " +
                                                  "\n un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnostico no le   " +
                                                  "\n satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreción anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n Es recomendable que el niño, durante el tratamiento de la clamidia, mantenga reposo relativo para permitir que el cuerpo se recupere de la infección y los " +
                                                  "\n medicamentos actúen eficazmente, especialmente si presenta síntomas como dolor o secreción; la actividad física debe ser limitada para evitar la irritación" +
                                                  "\n o el malestar en la zona afectada. Una vez que el médico confirme la erradicación de la infección y los síntomas hayan desaparecido por completo, el niño  " +
                                                  "\n puede retomar gradualmente sus actividades físicas normales, siempre priorizando la higiene para prevenir futuras infecciones. También es crucial el consumo" +
                                                  "\n diario de 2 a 2.5 Litros de agua al día (aproximadamente ocho a diez vasos de tamaño regular) para mantener una excelente hidratación, lo cual es vital para" +
                                                  "\n apoyar la función renal en el procesamiento de los antibióticos, ayudar a la eliminación de toxinas y prevenir la deshidratación, especialmente si el niño  " +
                                                  "\n experimenta fiebre u otros síntomas. POSIBLE TRATAMIENTO: Para la clamidia en niños, que es una infección bacteriana causada por Chlamydia trachomatis, el  " +
                                                  "\n tratamiento principal consiste en la administración de antibióticos; los antibióticos de elección son la azitromicina (una marca común es Zithromax o Azyth)," +
                                                  "\n administrada en una dosis única, o la doxiciclina (una marca común es Vibramicina o Doxiclat), aunque la doxiciclina generalmente no se recomienda en niños  " +
                                                  "\n menores de 8 años debido al riesgo de tinción dental, por lo que la azitromicina es preferida en este grupo de edad. La elección y dosis del antibiótico serán" +
                                                  "\n determinadas por un médico especialista, quien también evaluará si existe coinfección con gonorrea, que a menudo se trata simultáneamente. Es fundamental que" +
                                                  "\n el tratamiento se complete en su totalidad para asegurar la erradicación de la bacteria y prevenir complicaciones graves como enfermedad inflamatoria pélvica" +
                                                  "\n en niñas o infecciones en los ojos (conjuntivitis) y pulmones (neumonía) en recién nacidos expuestos durante el parto. Se debe realizar un seguimiento para  " +
                                                  "\n confirmar la curación, especialmente en casos de infección persistente o recurrente. En cuanto a la alimentación, una nutrición adecuada es esencial para    " +
                                                  "\n apoyar el sistema inmune del niño y facilitar la recuperación del cuerpo frente a la infección y el tratamiento antibiótico; esto incluye una dieta balanceada" +
                                                  "\n rica en proteínas de alto valor biológico como pollo, pescado y huevos, que son esenciales para la reparación de tejidos y el fortalecimiento muscular; granos" +
                                                  "\n integrales como la avena y el arroz integral, que proveen energía sostenida y fibra; frutas y verduras variadas como la zanahoria (aporta Vitamina A, importante" +
                                                  "\n para la salud de las mucosas y la función inmune) y las naranjas (ricas en Vitamina C, un potente antioxidante que apoya el sistema inmunológico), así como    " +
                                                  "\n verduras de hoja verde como la espinaca (que aporta Vitamina K, Hierro y Magnesio, esenciales para la energía y la función celular); y alimentos ricos en Zinc " +
                                                  "\n como las legumbres (frijoles, lentejas) o carne magra, ya que este mineral es crucial para la función inmune y la cicatrización. Este es solo un Diagnóstico   " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas," +
                                                  "\n para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud  " +
                                                  "\n si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la                  " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Náuseas, Dolor de cabeza severo, Rigidez en el cuello, Confusión.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n Es recomendable que el niño, durante la fase aguda de la enfermedad, mantenga un reposo estricto en cama, ya que la meningitis es una condición grave que requiere" +
                                                  "\n mínima estimulación y máxima conservación de energía para la recuperación cerebral y general del cuerpo; cualquier actividad física debe ser evitada por completo " +
                                                  "\n en este periodo. Una vez que la fase aguda haya pasado y bajo estricta supervisión médica, la rehabilitación o la reintroducción gradual de movimientos muy suaves" +
                                                  "\n solo se realizará si no hay secuelas. También es crucial el consumo diario de 2.5 a 3 Litros de agua al día (diez a doce vasos de tamaño regular) en tomas pequeñas" +
                                                  "\n y frecuentes, preferiblemente por vía intravenosa si el niño no puede beber, para mantener una hidratación óptima y asegurar el correcto funcionamiento de los    " +
                                                  "\n órganos, especialmente los riñones, que procesarán los medicamentos, y para ayudar a controlar la fiebre. POSIBLE TRATAMIENTO: Para la meningitis bacteriana en   " +
                                                  "\n niños, el tratamiento es una emergencia médica y consiste en la administración inmediata de antibióticos intravenosos de amplio espectro para combatir la infección." +
                                                  "\n La elección del antibiótico dependerá de la edad del niño, el tipo de bacteria sospechada y los patrones de resistencia locales, y será determinada por un médico " +
                                                  "\n especialista. Es vital que el tratamiento antibiótico se inicie lo antes posible y se complete en su totalidad para prevenir complicaciones graves como daño      " +
                                                  "\n cerebral, pérdida de audición o incluso la muerte. Algunos antibióticos comunes incluyen la ceftriaxona (una marca común es Rocephin) o la ampicilina (una marca  " +
                                                  "\n común es Omnipen o Polycillin), a veces combinados con vancomicina (una marca común es Vancocin). Además de los antibióticos, se pueden usar corticosteroides (como" +
                                                  "\n la dexametasona, una marca común es Decadron) para reducir la inflamación cerebral y prevenir secuelas neurológicas, siempre bajo indicación médica. Es fundamental" +
                                                  "\n el monitoreo constante en un entorno hospitalario. En cuanto a la alimentación, una vez que el niño pueda tolerar la vía oral, es recomendable que consuma alimentos" +
                                                  "\n que sean fáciles de digerir y nutritivos para apoyar la recuperación del sistema nervioso y el fortalecimiento del sistema inmune; esto incluye caldos y sopas suaves" +
                                                  "\n que aportan líquidos y electrolitos; purés de verduras como la calabaza, que aporta una buena cantidad de Vitamina A (alrededor de 369 µg por cada 100 gramos, lo que" +
                                                  "\n representa cerca del 74% de la ingesta diaria recomendada para un niño de 4-8 años), esencial para la recuperación de las mucosas y la visión; y frutas blandas como " +
                                                  "\n el plátano, que aporta Potasio (aproximadamente 358 mg por cada 100 gramos), un electrolito vital para la función nerviosa y muscular. También son beneficiosos los  " +
                                                  "\n alimentos ricos en antioxidantes como el aguacate, que provee grasas saludables y Vitamina E, que pueden proteger las células neuronales del daño oxidativo. Este es " +
                                                  "\n solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas" +
                                                  "\n estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por" +
                                                  "\n su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, Pérdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, Pérdida de apetito.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Cáncer." +
                                                  "\n Es recomendable que el niño, cuya actividad física debe ser siempre supervisada y adaptada a su estado de salud, energía y fase del tratamiento oncológico, mantenga" +
                                                  "\n periodos de descanso adecuados y evite cualquier actividad extenuante o que pueda comprometer su sistema inmune; se deben priorizar actividades de bajo impacto que " +
                                                  "\n fomenten la movilidad y el bienestar, como caminatas cortas y suaves, juegos tranquilos o ejercicios de estiramiento muy ligeros, siempre que el médico lo autorice " +
                                                  "\n y según su tolerancia. El objetivo es mantener la fuerza muscular y mejorar la calidad de vida sin sobrecargar su cuerpo, buscando alcanzar periodos de 30 a 60 minutos" +
                                                  "\n de actividad moderada en los días que se encuentre bien, pero con flexibilidad y respetando sus límites. También es crucial el consumo diario de 2.5 a 3 Litros de  " +
                                                  "\n agua al día (diez a doce vasos de tamaño regular), o más si tiene fiebre, vómitos o diarrea como efectos secundarios del tratamiento, para mantener una excelente   " +
                                                  "\n hidratación, lo cual es vital para el funcionamiento óptimo de sus órganos, la eliminación de toxinas y el apoyo al metabolismo de los medicamentos.                " +
                                                  "\n POSIBLE TRATAMIENTO: Para el cáncer en niños de esta edad, el tratamiento es altamente individualizado y complejo, dependiendo del tipo específico de cáncer, su    " +
                                                  "\n etapa y la salud general del niño. Generalmente, implica una combinación de quimioterapia (medicamentos que matan las células cancerosas, como la vincristina, una  " +
                                                  "\n marca común es Oncovin, o el ciclofosfamida, una marca común es Cytoxan), radioterapia (uso de radiación para destruir células cancerosas), cirugía (para extirpar  " +
                                                  "\n tumores), e incluso inmunoterapia o terapia dirigida. Es fundamental que el tratamiento sea manejado por un equipo multidisciplinario de oncólogos pediátricos.     " +
                                                  "\n Además del tratamiento oncológico, se utilizan medicamentos de soporte para manejar los efectos secundarios, como antieméticos para las náuseas (como el ondansetrón," +
                                                  "\n una marca común es Zofran), analgésicos para el dolor (como el paracetamol, una marca común es Tempra o Tylenol), y factores estimulantes de colonias para apoyar la" +
                                                  "\n médula ósea. En cuanto a la alimentación, es recomendable que el niño consuma alimentos que fortalezcan su sistema inmune, le proporcionen energía y le ayuden a    " +
                                                  "\n tolerar mejor el tratamiento, priorizando aquellos que sean nutritivos y de fácil digestión; esto incluye proteínas de alto valor biológico (pollo, pescado, huevos," +
                                                  "\n legumbres) que son esenciales para la reparación celular y el mantenimiento de la masa muscular, crucial durante y después de la quimioterapia; las verduras de hoja" +
                                                  "\n verde oscuro como la col rizada (kale), que aporta Vitamina K, Vitamina A y antioxidantes, que pueden ayudar a reducir la inflamación y proteger las células, y el  " +
                                                  "\n pimiento rojo, que ofrece una gran cantidad de Vitamina C (alrededor de 127.7 mg por cada 100 gramos, lo que representa cerca del 142% de la ingesta diaria recomendada" +
                                                  "\n para un niño de 4-8 años), esencial para la función inmunológica; las frutas de colores vivos como la granada, rica en antioxidantes (como punicalaginas) que pueden" +
                                                  "\n ofrecer propiedades protectoras, y las uvas, que contienen resveratrol, un compuesto con potencial antiinflamatorio. El aguacate proporciona grasas saludables y    " +
                                                  "\n Vitamina E, importantes para la energía y la salud general. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente" +
                                                  "\n tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer   " +
                                                  "\n mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnostico no le satisface del todo se le recomienda mucho       " +
                                                  "\n consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
             
                         }
 
                      }
                    
                }
          if (EdadMasculino.equals("Infancia = 0-9 años")) {
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
        Estudio2 ventanaEstudio2 = new Estudio2("Masculino", "Infancia = 0-9 años", "0.90-1.35 m", "Sed excesiva", "Aumento en la frecuencia de orinar, Fatiga ,Visión borrosa, Pérdida de peso");
        ventanaEstudio2.crearInterfaz();
    } 
}  
        