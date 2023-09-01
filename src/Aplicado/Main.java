package Aplicado;

public class Main {
    public static void main(String[] args) {
        AccesoProfesor profesor= new AccesoProfesor("1224", "Doc");
        profesor.recopilarInformacion();
        profesor.verificarIdentidad();
        profesor.mostrarPaginaPrincipal();
    }
}
