package pe.egcc.PagoDto;

/**
 *
 * @author Alumno
 */
public class PagoDto {

  private int horasDia;
  private int dias;
  private int pagoHora;
  private double ingresos;
  private double renta;
  private double neto;

  public PagoDto() {
  }

  public PagoDto(int horasDia, int dias, int pagoHora) {
    this.horasDia = horasDia;
    this.dias = dias;
    this.pagoHora = pagoHora;
  }

  public int getHorasdia() {
    return horasDia;
  }

  public void setHorasdia(int horasdia) {
    this.horasDia = horasdia;
  }

  public int getDias() {
    return dias;
  }

  public void setDias(int dias) {
    this.dias = dias;
  }

  public int getPagohora() {
    return pagoHora;
  }

  public void setPagohora(int pagohora) {
    this.pagoHora = pagohora;
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

  public double getIngresos() {
    return ingresos;
  }

  public void setIngresos(double ingresos) {
    this.ingresos = ingresos;
  }

  @Override
  public String toString() {
    String st = "[" + "ingresos:" + ingresos + "\n renta:" + renta + "\n neto:" + neto + "]";
    return st;
  }

}
