package FinanFilmsAdmin.Entidades;

import javax.persistence.*;

@Entity
@Table (name="Empresa")
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long Id;
    @Column(name = "nombre_empresa")
    private String nombreEmpresa;
    @Column(name = "direccion_empresa")
    private String direccionEmpresa;
    @Column(name = "telefono_empresa")
    private String telefonoEmpresa;
    @Column(name = "nit_empresa")
    private String nitEmpresa;
//nuevo

//Constructor
public Empresa(){

}

//Constructor


    public Empresa(String nombreEmpresa, String direccionEmpresa, String telefonoEmpresa, String nitEmpresa) {

        this.nombreEmpresa = nombreEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
        this.nitEmpresa = nitEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    public String getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(String telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public String getNitEmpresa() {
        return nitEmpresa;
    }

    public void setNitEmpresa(String nitEmpresa) {
        this.nitEmpresa = nitEmpresa;
    }
    @Override
    public String toString (){
        return "Empresa{"+
                "nombreEmpresa='" + nombreEmpresa + '\'' +
                "direccionEmpresa='" + direccionEmpresa + '\'' +
                "telefonoEmpresa='" + telefonoEmpresa + '\'' +
                "nitEmpresa='" + nitEmpresa + '\'' +
                '}';

    }
}
