package principal;

import javax.swing.JOptionPane;
import model.Triangulo;

public class Principal {
    public static void main(String[] args) {
        Triangulo tri1 = new Triangulo();
        
        
        tri1.setBase(Double.parseDouble(JOptionPane.showInputDialog("Digite  a base do triangulo")));
        tri1.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite  a altura do triangulo")));
        
        
        JOptionPane.showMessageDialog(null, "A área do triangulo é " + tri1.getArea());
    }
    
}
