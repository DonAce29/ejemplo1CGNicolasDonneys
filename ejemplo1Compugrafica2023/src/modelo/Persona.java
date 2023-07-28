
package modelo;


public class Persona {
    
    private String nombreP;
    private String telefonoP;
    private String correoP;

    public Persona() {
    }

    public Persona(String nombreP, String telefonoP, String correoP) {
        this.nombreP = nombreP;
        this.telefonoP = telefonoP;
        this.correoP = correoP;
    }
    
    

   
    public String getCorreoP() {
        return correoP;
    }

  
    public void setCorreoP(String correoP) {
        this.correoP = correoP;
    }


    
    public String getTelefonoP() {
        return telefonoP;
    }

   
    public void setTelefonoP(String telefonoP) {
        this.telefonoP = telefonoP;
    }


    public String getNombreP() {
        return nombreP;
    }

    
    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    @Override
    public String toString() {
        return "Persona{" + "" + nombreP + ", " + telefonoP + ", " + correoP + '}';
    }

}
