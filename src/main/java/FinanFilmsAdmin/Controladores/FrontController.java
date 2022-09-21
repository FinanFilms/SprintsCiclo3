package FinanFilmsAdmin.Controladores;

import FinanFilmsAdmin.Entidades.Empleado;
import FinanFilmsAdmin.Entidades.Empresa;
import FinanFilmsAdmin.Servicios.ServiciosEmpresa;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import FinanFilmsAdmin.Servicios.ServiciosEmpleado;
import java.util.List;


@Controller
public class FrontController {
    ServiciosEmpleado serviciosEmpld;
    ServiciosEmpresa servicioEmp;

    public FrontController (ServiciosEmpleado serviciosEmpld,ServiciosEmpresa serviciosEmp){
        this.serviciosEmpld = serviciosEmpld;
        this.servicioEmp = serviciosEmp;
    }
    @GetMapping("/")
    public String Home(){
        return "Index";
    }

    @GetMapping("/empleados")
    public String Empleados2(Model modeloEmpleados){
        List<Empleado> Empleados= this.serviciosEmpld.getListaEmpleados();
        modeloEmpleados.addAttribute("Empleados",Empleados);
        return "frontempleados";
    }


    @GetMapping("/empresas")
    public String Empresas(Model modeloEmpresas){
        List<Empresa> Empresas = this.servicioEmp.getListaEmpresas();
        modeloEmpresas.addAttribute("Empresas",Empresas);
        return "frontempresas";
    }



}
