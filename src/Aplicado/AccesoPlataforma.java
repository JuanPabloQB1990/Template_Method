package Aplicado;

public abstract class AccesoPlataforma {
    // Variables miembro
    protected String contraseña;
    protected String no_documento;


    // Constructor
    public AccesoPlataforma(String contraseña, String no_documento) {
        this.contraseña = contraseña;
        this.no_documento = no_documento;
    }

    // Método para validar la información
    public abstract void validarInformacion();

    // Método para recopilar información
    public void recopilarInformacion() {
        // Implementación para recopilar información
    }

    // Método para verificar si un estudiante tiene acceso
    public abstract boolean verificarEstudiante();

    // Método para mostrar la página del estudiante
    public abstract boolean mostrarPaginaEstudiante();
}