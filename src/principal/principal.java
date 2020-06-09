package principal;
import vista.registro;
import control.controlador;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
/**
 *
 * @author ANDRU
 */
public class principal {
    public static void main(String[] args) {
        
        registro r = new registro();
        
        new controlador(r);
        r.setLocationRelativeTo(r);
        r.setVisible(true);
        r.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
