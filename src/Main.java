import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        /*Crea una aplicación que nos calcule el área de un circulo, cuadrado o triangulo. Pediremos que figura queremos
        calcular su área y según lo introducido pedirá los valores necesarios para calcular el área. Crea un método por cada figura
        para calcular cada área, este devolverá un número real. Muestra el resultado por pantalla*/

        String texto = "";
        double resultado = 0;

        String eleccion = JOptionPane.showInputDialog("Ingresa una figura: circulo, triangulo o cuadrado");

        switch (eleccion){
            case "circulo" :

                texto = JOptionPane.showInputDialog("Ingresar el valor del radio");
                int radio = Integer.parseInt(texto);
                resultado = areacirculo(radio);
                JOptionPane.showMessageDialog(null, "El área del: "+eleccion+" es: "+resultado);
                break;

            case "triangulo" :

                texto = JOptionPane.showInputDialog("Ingresar el valor del base");
                int base = Integer.parseInt(texto);
                texto = JOptionPane.showInputDialog("Ingresar el valor del altura");
                int altura = Integer.parseInt(texto);
                resultado = areatriangulo(base,altura);
                JOptionPane.showMessageDialog(null, "El área del: "+eleccion+" es: "+resultado);
                break;

            case "cuadrado" :

                texto = JOptionPane.showInputDialog("Ingresar el valor del lado");
                int lado = Integer.parseInt(texto);
                resultado = areacuadrado(lado);
                JOptionPane.showMessageDialog(null, "El área del: "+eleccion+" es: "+resultado);
                break;

            default:
                JOptionPane.showMessageDialog(null,"Error de ingreso");
                break;
        }

    }
    /*cuando el tipo de variable no es primitivo, se debe instanciar en el método = public static double*/
    public static double areacirculo(int radio){
        return Math.pow(radio,2)*Math.PI; /*Math.pow = potencia / Math.PI = valor de PI*/
    }
    public static double areatriangulo(int base, int altura){
        return (base*altura)/2;
    }
    public static double areacuadrado(int lado){
        return Math.pow(lado,2);
    }
}