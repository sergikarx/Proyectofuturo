public class Proyectof {
    public static void main(String[] args) {
        System.out.println("Estudiante " + args[0] + " : ");
        System.out.println(veredicto("6","0"));

        //Sergio Aroca Martínez
    }

    static private String veredicto (String valor1, String valor2) {
        if (valor1.equals(valor2)) {
            return "Bien. Pero una hora de estudio para cada módulo puede ser insuficiente.";
        }
        if (Integer.valueOf(valor1) < Integer.valueOf(valor2)){
            return "Poco tiempo de estudio. Debes dedicar más tiempo.";
        }
        return "Ideal. Trabajas los contenidos en casa.";
    }

}