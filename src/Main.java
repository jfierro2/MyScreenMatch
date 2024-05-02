import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        //variables globales
        int contador = 0;
        double mediaEvaluacionUsuario = 0;
        int numeroDatos = 0;
        Object[] opciones = {"si", "no"};

        //Mensaje de bienvenida
        System.out.println("#####BIENVENIDO A MYSCREENMATCH#####");
        JOptionPane.showMessageDialog(null, "#####BIENVENIDO A SCREENMATCH#####");

        //Ingreso de datos de pelicula
        JOptionPane.showMessageDialog(null, "Prepare los datos a Ingresar sobre la pelicula");

        //nombre pelicula
        String pelicula = JOptionPane.showInputDialog("Ingrese nombre de la pelicula");
        JOptionPane.showMessageDialog(null, pelicula);
        System.out.println(pelicula);

        //año de estreno
        int ano = Integer.parseInt(JOptionPane.showInputDialog("ingrese año de lanzamiento"));
        JOptionPane.showMessageDialog(null, ano);
        System.out.println(ano);

        //Prueba del tipo de dato de "año"
        //System.out.println(((Object) ano).getClass().getSimpleName());

        //Puntaje actual pelicula
        mediaEvaluacionUsuario = Double.parseDouble(JOptionPane.showInputDialog("ingrese puntaje del 1 al 5"));
        JOptionPane.showMessageDialog(null, mediaEvaluacionUsuario);

        //Incluido o no en el paquete Básico
        Object incluidoPlanBasico = JOptionPane.showInputDialog(null, "¿esta incluido?", null, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
        incluidoPlanBasico = (String) incluidoPlanBasico;
        System.out.println(((Object) incluidoPlanBasico).getClass().getSimpleName());

        //Mensaje automático según el año de lanzamiento de la película
        if (ano >= 2023) {
            System.out.println("Pelicula popular del momento");
            JOptionPane.showMessageDialog(null, "Pelicula popular del momento");
        } else {
            System.out.println("Pelicula Retro que vale la pena ver");
            JOptionPane.showMessageDialog(null, "Pelicula Retro que vale la pena ver");
        }

        //Consulta sobre si se desean incluir más datos de evaluacion de la pelicula adicionales
        Object masDatos = JOptionPane.showInputDialog(null, "¿desea agregar más datos de evaluación?", null, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
        masDatos = (String) masDatos;
        System.out.println(((Object) masDatos).getClass().getSimpleName());

        //Si se deciden agregar más datos de evaluación pregunta por que cantidad de datos son los que se van a agregar
        if (masDatos == "si"){
            numeroDatos = Integer.parseInt(JOptionPane.showInputDialog("ingrese cantidad de datos de evaluación"));
        } else {
            JOptionPane.showMessageDialog(null, "Fin del proceso de carga de datos");
        }
        //Imprime por pantalla cantidad de datos ingresados
        System.out.println("Usted debe ingresar la siguiente cantidad de datos adicionales: " + numeroDatos);

        //blucle "While" para el ingreso de datos adicionales hasta ingresar el total de datos adicionales solicitado
        while (contador < numeroDatos) {
            double datoAdicional = Double.parseDouble(JOptionPane.showInputDialog("ingrese dato de evaluación"));
            System.out.println(datoAdicional);
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + datoAdicional;
            contador = contador + 1;

        }
        //imprime el dato de evaluación promedio actuals egun nuevos datos ingresados y sumando el existente
        System.out.println("El dato de evaluación actual de la pelicula "+ pelicula + "es: " + mediaEvaluacionUsuario/ (numeroDatos+1));


        Object deseaReporte = JOptionPane.showInputDialog(null, "¿Desea un reporte actualziado de los datos de la pelicula?", null, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
        deseaReporte = (String) deseaReporte;
        System.out.println(((Object) deseaReporte).getClass().getSimpleName());
        if (deseaReporte == "si"){
            JOptionPane.showMessageDialog(null, "####REPORTE ACTUALIZADO DATOS PELICULA####" + "\r\n"
                    + "Nombre de la pelicula: " + pelicula + "\r\n" + "Año de Estreno: " + ano + "\r\n" + "Puntaje actual: "
                    + mediaEvaluacionUsuario + "\r\n" + "Incluida en paquete Básico: " + incluidoPlanBasico);

        } else {
            JOptionPane.showMessageDialog(null, "Puede generar un informe cuando lo desee");
        }
        JOptionPane.showMessageDialog(null, "####FIN DEL PROGRAMA####");
        JOptionPane.showMessageDialog(null, "####GRACIAS POR UTILIZAR SCREENMATCH####");

    }
}