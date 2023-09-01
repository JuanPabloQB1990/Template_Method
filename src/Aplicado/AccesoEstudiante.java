package Aplicado;
public class AccesoEstudiante extends AccesoPlataforma {
    public AccesoEstudiante(String contraseña, String no_documento) {
        super(contraseña, no_documento);
    }

    @Override
    public void recopilarInformacion() {
        System.out.println("conectando a base de datos...");
        System.out.println("conectado a la base de datos");
    }

    @Override
    public boolean verificarIdentidad() {
        return true;
    }

    @Override
    public void mostrarPaginaPrincipal() {
        System.out.println("mostrando pagina !!");
    }
}
