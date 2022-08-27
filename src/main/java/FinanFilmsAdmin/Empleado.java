package FinanFilmsAdmin;

public class Empleado {
    String nombreEmpleado;
    String CorreoEmpleado;
    String EmpresaEmpleado;
    String RolUsuario;

    private Empleado(String nombreEmpleado, String CorreoEmpleado, String EmpresaEmpleado, String RolUsuario) {
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