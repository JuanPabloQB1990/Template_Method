package Aplicado;

public abstract class AccesoPlataforma implements BaseDeDatos {

    protected String contraseña;
    protected String no_documento;


    // Constructor
    public AccesoPlataforma(String contraseña, String no_documento) {
        this.contraseña = contraseña;
        this.no_documento = no_documento;
    }
    @Override
    public void conectar() {
        System.out.println("conectado a la base de datos");
    }
    @Override
    public abstract void consultar();
    @Override
    public abstract void cerrarConexion();
    public final void validarInformacion() {
        conectar();
        recopilarInformacion();

        if (verificarIdentidad()){
            mostrarPaginaPrincipal();
        }else{
            System.out.println("no se puede mostrar pagina");
        }
    };

    public abstract void recopilarInformacion();


    public abstract boolean verificarIdentidad();


    public abstract void mostrarPaginaPrincipal();
}