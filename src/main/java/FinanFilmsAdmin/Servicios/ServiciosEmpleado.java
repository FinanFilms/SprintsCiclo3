package FinanFilmsAdmin.Servicios;

import FinanFilmsAdmin.Entidades.Empleado;
import FinanFilmsAdmin.Entidades.Empresa;
import FinanFilmsAdmin.Repositorios.repositorioEmpleado;
import FinanFilmsAdmin.Repositorios.repositorioEmpresa;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiciosEmpleado {
    private repositorioEmpleado reposEmpleado;


    public ServiciosEmpleado (repositorioEmpleado reposEmpleado) {
        this.reposEmpleado = reposEmpleado;
    }
    public List<Empleado> getListaEmpleados(){
        return this.reposEmpleado.findAll();

    }

    public Empleado crearEmpleado (Empleado nuevoEmpleado){
        return this.reposEmpleado.save(nuevoEmpleado);
    }

}




