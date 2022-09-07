package FinanFilmsAdmin.Entidades;

import javax.persistence.*;

@Entity
@Table (name = "MovimientoDinero")
public class MovimientoDinero {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    @Column(name = "monto_movimiento")
    private float MontoMovimiento;
    @Column(name = "ingreso")
    private boolean Ingreso;
    @Column(name = "concepto_movimiento")
    private String ConceptoMovimiento;
    @Transient
    private Empleado Empleado;

    //Nuevo constructor
    public MovimientoDinero(){

    }
    public MovimientoDinero(float montoMovimiento, boolean ingreso, String conceptoMovimiento, FinanFilmsAdmin.Entidades.Empleado empleado) {
        this.MontoMovimiento = montoMovimiento;
        this.Ingreso = ingreso;
        this.ConceptoMovimiento = conceptoMovimiento;
        this.Empleado = empleado;

    }

    public float getMontoMovimiento() {
        if (isIngreso()==false) {
            return MontoMovimiento*=-1;
        }
        return MontoMovimiento;
    }

    public void setMontoMovimiento(float montoMovimiento) {
        MontoMovimiento = montoMovimiento;
    }

    public boolean isIngreso() {
        return Ingreso;
    }

    public void setIngreso(boolean ingreso) {
        Ingreso = ingreso;
    }

    public String getConceptoMovimiento() {
        return ConceptoMovimiento;
    }

    public void setConceptoMovimiento(String conceptoMovimiento) {
        ConceptoMovimiento = conceptoMovimiento;
    }

    public FinanFilmsAdmin.Entidades.Empleado getEmpleado() {
        return Empleado;
    }

    public void setEmpleado(FinanFilmsAdmin.Entidades.Empleado empleado) {
        Empleado = empleado;
    }

    @Override
    public String toString() {
        return "MovimientoDinero{" +
                "MontoMovimiento=" + MontoMovimiento +
                ", Ingreso=" + Ingreso +
                ", ConceptoMovimiento='" + ConceptoMovimiento + '\'' +
                ", Empleado=" + Empleado +
                '}';
    }
}
