package pe.egcc.app.service;

import javax.swing.JOptionPane;
import pe.egcc.app.model.PagoDto;


public class PagoService {

        
    public void procesar(PagoDto PagoDto) {
        
        double ingresos;
        double renta;
        double neto;
        
        PagoDto dto = new PagoDto();
        
        ingresos = PagoDto.getHorasxdia() * PagoDto.getDias() * PagoDto.getPagoxhora();
        dto.setIngresos(ingresos);
        
        renta = ingresos * 0.08;
        dto.setRenta(renta);
        
        neto = ingresos - renta;
        dto.setNeto(neto);
        
        JOptionPane.showMessageDialog(null,"REPORTE\n\n"+ 
                                           "Ingresos:   "+dto.getIngresos()+
                                           "\nRenta:        "+dto.getRenta()+
                                           "\nNeto:          "+dto.getNeto());
        
        
    }
       
}
