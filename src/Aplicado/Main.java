package Aplicado;


public class Main {
    public static void main(String[] args){
        AccesoProfesor profesor = new AccesoProfesor("01", "abc123");
        profesor.validarInformacion();

        System.out.println("");
        AccesoEstudiante estudiante = new AccesoEstudiante("02", "es456");
        estudiante.validarInformacion();
    }
}
