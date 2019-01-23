import org.omg.PortableInterceptor.ACTIVE;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChessPiece extends JButton implements ActionListener {
    ImageIcon X,O;
    byte value=0;

    //Constructor.
    public ChessPiece() {
        X=new ImageIcon(this.getClass().getResource("X.png"));
        O=new ImageIcon(this.getClass().getResource("O.png"));
        this.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        value++;
        value%=3;
        switch(value){
            case 0:
                setIcon(null);
                break;
            case 1:
                setIcon(X);
                break;
            case 2:
                setIcon(O);
                break;
        }
    }
}

