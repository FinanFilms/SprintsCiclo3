package FinanFilmsAdmin;

public class MovimientoDinero {
    private float MontoMovimiento;
    private boolean Ingreso;
    private String ConceptoMovimiento;
    private Empleado Empleado;

    public MovimientoDinero(float montoMovimiento, boolean ingreso, String conceptoMovimiento, FinanFilmsAdmin.Empleado empleado) {
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

    public FinanFilmsAdmin.Empleado getEmpleado() {
        return Empleado;
    }

    public void setEmpleado(FinanFilmsAdmin.Empleado empleado) {
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
