package FinanFilmsAdmin.Entidades;

import javax.persistence.*;

@Entity
@Table (name = "Empleado")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    @Column(name = "nombre_empleado")
    private String nombreEmpleado;
    @Column(name = "correo_empleado")
    private String CorreoEmpleado;
    @Column(name = "empresa_empleado")
    private String EmpresaEmpleado;
    @Column(name = "rol_usuario")
    private String RolUsuario;

//Nuevo Constructor
public Empleado(){

}

    public Empleado(String nombreEmpleado, String CorreoEmpleado, String EmpresaEmpleado, String RolUsuario) {
        this.nombreEmpleado = nombreEmpleado;
        this.CorreoEmpleado = CorreoEmpleado;
        this.EmpresaEmpleado= EmpresaEmpleado;
        this.RolUsuario= RolUsuario;
    }

    public String getCorreoEmpleado() {
        return CorreoEmpleado;
    }

    public void setCorreoEmpleado(String correoEmpleado) {
        CorreoEmpleado = correoEmpleado;
    }

    public String getEmpresaEmpleado() {
        return EmpresaEmpleado;
    }

    public void setEmpresaEmpleado(String empresaEmpleado) {
        EmpresaEmpleado = empresaEmpleado;
    }

    public String getRolUsuario() {
        return RolUsuario;
    }

    public void setRolUsuario(String rolUsuario) {
        RolUsuario = rolUsuario;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombreEmpleado='" + nombreEmpleado + '\'' +
                ", CorreoEmpleado='" + CorreoEmpleado + '\'' +
                ", EmpresaEmpleado='" + EmpresaEmpleado + '\'' +
                ", RolUsuario='" + RolUsuario + '\'' +
                '}';
    }
}
