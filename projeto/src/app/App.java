package app;

//import java.awt.GriphicsConfiguration;
import javax.swing.JFrame;

public class App {
    
    //static GraphicsConfiguration gc;
    
    public static void main(String[] args) throws Exception {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("nice");
        //JFrame frame = new JFrame(gc);
        frame.setTitle("janela");
        frame.setSize(1080,720);
        frame.setVisible(true);
    }
}
