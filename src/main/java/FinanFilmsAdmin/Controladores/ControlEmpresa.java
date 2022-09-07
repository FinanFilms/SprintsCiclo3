
package FinanFilmsAdmin.Controladores;

import FinanFilmsAdmin.Entidades.Empresa;
import FinanFilmsAdmin.Servicios.ServiciosEmpresa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ControlEmpresa {

    //prueba visualizacion
/*
 @GetMapping("/empresa")
public String visualizar (){
return "Primera vista empresa";
 }
@GetMapping("vistaempresa")
    public Empresa ControlEmpresa(){
Empresa empresa1 = new Empresa("Cinecolombia","Carrera 30 #22",
        "314857","880710-1");
return empresa1;
}
*/
    //Implementando las herramientas JPA

    ServiciosEmpresa servicioEmp;

    //Constructor

    public ControlEmpresa (ServiciosEmpresa servicioEmp){
        this.servicioEmp = servicioEmp;
    }
    @GetMapping("/empresas")
    public List<Empresa> listaEmpresas(){
        return this.servicioEmp.getListaEmpresas();
    }
    @PostMapping ("/empresas")
    public Empresa crearEmpresa(@RequestBody Empresa emp){
        return this.servicioEmp.crearEmpresa(emp);
    }

}
