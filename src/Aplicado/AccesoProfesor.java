package Aplicado;

public class AccesoProfesor extends AccesoPlataforma{
    public AccesoProfesor(String contraseña, String no_documento) {
        super(contraseña, no_documento);
    }

    @Override
    public void consultar() {
        System.out.println("consultando la base de datos");
    }

    @Override
    public void cerrarConexion() {
        System.out.println("sesion cerrada");

    }

    @Override
    public void recopilarInformacion() {
        consultar();
    }

    @Override
    public boolean verificarIdentidad() {
        return false;
    }

    @Override
    public void mostrarPaginaPrincipal() {
        System.out.println("mostrado pagina del profesor");
    }
}
