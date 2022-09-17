package FinanFilmsAdmin.Servicios;


import FinanFilmsAdmin.Entidades.Empleado;
import FinanFilmsAdmin.Entidades.Empresa;
import FinanFilmsAdmin.Entidades.MovimientoDinero;
import FinanFilmsAdmin.Repositorios.repositorioMovimientoDinero;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiciosMovimientoDinero {

    private repositorioMovimientoDinero repositorio;

    public  ServiciosMovimientoDinero(repositorioMovimientoDinero repositorio){
        this.repositorio = repositorio;
    }

    public List<MovimientoDinero> getServicioMD(){
        return repositorio.findAll();
    }

    public String crearMovimientoDinero(MovimientoDinero movimientoDinero){
        repositorio.save(movimientoDinero);
        return "registro creado";
    }
    public String actMovimientoDinero(long id,float montoMovimiento, boolean ingreso, String conceptoMovimiento){
        MovimientoDinero movd = repositorio.findById(id).get();
        movd.setMontoMovimiento(montoMovimiento);
        movd.setIngreso(ingreso);
        movd.setConceptoMovimiento(conceptoMovimiento);
        repositorio.save(movd);
        return "registro actualizadco";
    }
    public List<MovimientoDinero> getListaMovD(){
        return this.repositorio.findAll();

    }
    public String delMovimientoDinero(long id){
        MovimientoDinero movd = repositorio.findById(id).get();
        repositorio.delete(movd);
        return "registro eliminado";
    }

}
