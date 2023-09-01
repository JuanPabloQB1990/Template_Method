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
    public void validarInformacion(){
        recopilarInformacion();
        if (verificarIdentidad() == true){
            mostrarPaginaPrincipal();
        } else{
            System.out.println("Verifique la información");
        }
    };
    public abstract void recopilarInformacion();
    public abstract boolean verificarIdentidad();
    public abstract void mostrarPaginaPrincipal();
}