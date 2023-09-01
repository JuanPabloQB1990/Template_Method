package Aplicado;

public class AccesoEstudiante extends AccesoPlataforma {

    public AccesoEstudiante(String contraseña, String no_documento) {
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
        return true;
    }

    @Override
    public void mostrarPaginaPrincipal() {
        System.out.println("mostrado pagina del estudiante");

    }
}
