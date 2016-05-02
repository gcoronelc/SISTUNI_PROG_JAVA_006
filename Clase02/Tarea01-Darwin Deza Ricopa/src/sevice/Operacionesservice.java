package sevice;

import model.Valores;

/**
 *
 * @author Darwin
 */
public class Operacionesservice 
{
    public static String Resultados( Valores Contacto) 
    {
        double Ingresos = Contacto.getDias()*Contacto.getHoraxDia()*Contacto.getPagoxHora();
        if(Ingresos >1500)
            {
                 double Renta = Ingresos*8/100;
                 String valores= "Ingresos: "+Ingresos+ "\n"
                 +"Renta: "+Renta + "\n" + "Neto: "+(Ingresos-Renta);
                 return valores;
            }
        else 
            {   
                 double Renta=0;
                 String valores= "Ingresos: "+Ingresos+ "\n"
                 +"Renta: "+Renta + "\n" + "Neto: "+(Ingresos-Renta);
                 return valores;
            }
    }
}
