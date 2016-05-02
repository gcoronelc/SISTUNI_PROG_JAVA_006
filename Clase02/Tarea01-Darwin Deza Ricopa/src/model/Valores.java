
package model;

/**
 *
 * @author Darwin
 */
public class Valores
{
    double HoraxDia;
    double Dias;
    double PagoxHora;

    public Valores(double HoraxDia, double Dias, double PagoxHora) {
        this.HoraxDia = HoraxDia;
        this.Dias = Dias;
        this.PagoxHora = PagoxHora;
    }

    public double getHoraxDia() {
        return HoraxDia;
    }

    public void setHoraxDia(double HoraxDia) {
        this.HoraxDia = HoraxDia;
    }

    public double getDias() {
        return Dias;
    }

    public void setDias(double Dias) {
        this.Dias = Dias;
    }

    public double getPagoxHora() {
        return PagoxHora;
    }

    public void setPagoxHora(double PagoxHora) {
        this.PagoxHora = PagoxHora;
    }
}
