package app;

//import java.awt.GriphicsConfiguration;
import javax.swing.JFrame;

public class Agenda {
    
    //static GraphicsConfiguration gc;
    
    public static void main(String[] args) throws Exception {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("main");
        //JFrame frame = new JFrame(gc);
        frame.setTitle("Agenda");
        frame.setSize(960,600);
        frame.setVisible(true);
    }
}
