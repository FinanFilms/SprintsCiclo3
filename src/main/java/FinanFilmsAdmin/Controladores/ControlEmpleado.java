package FinanFilmsAdmin.Controladores;

import FinanFilmsAdmin.Entidades.Empleado;
import FinanFilmsAdmin.Servicios.ServiciosEmpleado;
import FinanFilmsAdmin.Servicios.ServiciosEmpresa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ControlEmpleado {

    ServiciosEmpleado serviciosEmpld;

    public ControlEmpleado (ServiciosEmpleado serviciosEmpld){
        this.serviciosEmpld = serviciosEmpld;
    }

    @GetMapping("/empleados")
    public List<Empleado> listaEmpleados(){
        return this.serviciosEmpld.getListaEmpleados();
    }

    @PostMapping("/empleados")
    public Empleado crearEmpleado (@RequestBody Empleado empleadoNuevo){
        return this.serviciosEmpld.crearEmpleado(empleadoNuevo);
    }
}
