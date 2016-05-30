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
    ComboDto actual = null;
    for (ComboDto valor : valores) {
      combo.addItem(valor);
      if(valor.isActual()){
        actual = valor;
      }
    }
    if(actual == null){
      combo.setSelectedIndex(-1);
    } else {
      combo.setSelectedItem(actual);
    }
  }


}
