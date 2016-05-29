package pe.egcc.util;

import java.util.List;
import javax.swing.JComboBox;
import pe.egcc.dto.ComboDto;

/**
 *
 * @author Gustavo Coronel
 */
public final class EGCCUtil {

  private EGCCUtil() {
  }

  
  public static void llenaCombo(JComboBox combo, List<ComboDto> valores){
    combo.removeAllItems();
    for (ComboDto valor : valores) {
      combo.addItem(valor);
    }
  }


  
}
