package Aplicado;

public class AccesoProfesor extends AccesoPlataforma {
    public AccesoProfesor(String contraseña, String no_documento) {
        super(contraseña, no_documento);
    }

    @Override
    public void recopilarInformacion() {
        System.out.println("conectando a base de datos...");
        System.out.println("conectado a la base de datos");
    }

    @Override
    public boolean verificarIdentidad() {
        return false;
    }

    @Override
    public void mostrarPaginaPrincipal() {
        System.out.println(verificarIdentidad() ? "mostrando pagina !!" : "no se puede mostrar pagina");
    }
}
