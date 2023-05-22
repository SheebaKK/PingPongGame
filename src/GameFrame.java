import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {
    GameFrame()
    {
        setTitle("Ping Pong");
        //setLayout(null);
        getContentPane().setBackground(Color.black);
        GamePanel panel=new GamePanel();
        add(panel);

        pack();
        setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
    public static void main(String[] args) {
        GameFrame g=new GameFrame();
    }
}
