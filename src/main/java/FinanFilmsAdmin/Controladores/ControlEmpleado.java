package FinanFilmsAdmin.Controladores;

import FinanFilmsAdmin.Entidades.Empleado;
import FinanFilmsAdmin.Entidades.Empresa;
import FinanFilmsAdmin.Servicios.ServiciosEmpleado;
import FinanFilmsAdmin.Servicios.ServiciosEmpresa;
import org.springframework.web.bind.annotation.*;

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
    @PutMapping("/empleados/{id}")
    public Empleado actualizarEmpleado(@PathVariable Long id, @RequestBody Empleado actEmpleado){
        return this.serviciosEmpld.actualizarEmpld(id,actEmpleado);
    }
    //Metodo borrar registro
    @DeleteMapping("/eliminar/{id}")
    public Empleado eliminarEmpleado(@PathVariable (value = "id")Long id){
        return this.serviciosEmpld.eliminarEmpld(id);

    }
}
