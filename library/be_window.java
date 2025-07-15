package library;
import javax.swing.JFrame;

public class be_window extends JFrame{
    public be_window(String title, int width, int height){
        super(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(width, height);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
}
