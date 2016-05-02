package pe.egcc.app.model;


public class PagoDto {
    
    private double horasxdia;
    private double dias;
    private double pagoxhora;
    private double ingresos;
    private double renta;
    private double neto;
    
    public PagoDto(){
        
          
    }
    
    public double getHorasxdia() {
        return horasxdia;
    }

    public void setHorasxdia(double horasxdia) {
        this.horasxdia = horasxdia;
    }

    public double getDias() {
        return dias;
    }

    public void setDias(double dias) {
        this.dias = dias;
    }

    public double getPagoxhora() {
        return pagoxhora;
    }

    public void setPagoxhora(double pagoxhora) {
        this.pagoxhora = pagoxhora;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }

    public double getRenta() {
        return renta;
    }

    public void setRenta(double renta) {
        this.renta = renta;
    }

    public double getNeto() {
        return neto;
    }

    public void setNeto(double neto) {
        this.neto = neto;
    }
        
}
