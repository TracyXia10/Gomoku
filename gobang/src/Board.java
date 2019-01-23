import java.awt.event.*;
import javax.swing.*;
import java.awt.GridLayout;


public class Board extends JFrame {
    public JPanel p = new JPanel();
    public ChessPiece buttons[][] = new ChessPiece[15][15];

    //Constructor. Initialize a 15*15 board.
    public Board() {//Constructor.
        super("GobangBoard");
        setSize(800, 800);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        p.setLayout(new GridLayout(15, 15));

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                buttons[i][j] = new ChessPiece();
                p.add(buttons[i][j]);
            }
        }
        add(p);
        setVisible(true);
    }

}
