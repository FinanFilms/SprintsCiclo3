package FinanFilmsAdmin.Controladores;

import FinanFilmsAdmin.Entidades.Empresa;
import FinanFilmsAdmin.Entidades.MovimientoDinero;
import FinanFilmsAdmin.Servicios.ServiciosEmpresa;
import FinanFilmsAdmin.Servicios.ServiciosMovimientoDinero;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ControlMovimientoDinero {

    private Empresa empresa;
    private ServiciosMovimientoDinero sempresa;

    public ControlMovimientoDinero(ServiciosMovimientoDinero servicio){this.sempresa = servicio;}

    @GetMapping("/enterprises/{id}/movements")
    public List<MovimientoDinero> getMovimientoEmpresa(){
        return sempresa.getServicioMD();
    }

    @PostMapping("/enterprises/{id}/movements")
    public String poMovimientoEmpresa(@RequestBody MovimientoDinero movimientoDinero,@PathVariable("id") long id){
        return sempresa.crearMovimientoDinero(movimientoDinero);
    }
    @PatchMapping("/enterprises/{id}/movements/{id2}/{monto}/{ingreso}/{movimiento}")
    public String paMovimientoEmpresa(@PathVariable("id2") long id2,
                                      @PathVariable("monto") float monto,
                                      @PathVariable("ingreso") boolean ingreso,
                                      @PathVariable("movimiento") String movimiento,
                                      @PathVariable("id") long id){
        return sempresa.actMovimientoDinero(id2,monto,ingreso,movimiento);
    }
    @DeleteMapping("/enterprises/{id}/movements/{id2}")
    public String deMovimientoEmpresa(@PathVariable("id") long id,@PathVariable long id2 ){
        return sempresa.delMovimientoDinero(id2);
    }

}
