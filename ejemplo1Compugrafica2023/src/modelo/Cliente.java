
package modelo;


public class Cliente extends Persona {

    private String codigoCliente;
    private int edadCliente;

    public Cliente() {
    }

    public Cliente(String codigoCliente, int edadCliente, String nombreP, String telefonoP, String correoP) {
        super(nombreP, telefonoP, correoP);
        this.codigoCliente = codigoCliente;
        this.edadCliente = edadCliente;
    }

    
  
    public int getEdadCliente() {
        return edadCliente;
    }

    
    public void setEdadCliente(int edadCliente) {
        this.edadCliente = edadCliente;
    }

    
    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    @Override
    public String toString() {
        return super.toString()+ "Cliente{" + "codigoCliente=" + codigoCliente + ", edadCliente=" + edadCliente + '}';
    }

    
    
}
