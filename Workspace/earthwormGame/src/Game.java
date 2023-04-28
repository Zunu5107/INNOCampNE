import javax.swing.*;
import java.awt.*;

public class Game extends JFrame implements Runnable{

    private Thread thread;
    enum Img {
            BlackImg = 0,

    }

    public Game(){
        super("지렁이 게임");

        setSize(800,600);

        setLocationRelativeTo(null);

        // 프레임을 닫았을 때 메모리에서 제거되도록 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 레이아웃 설정
        getContentPane().setLayout(null);
    }

    @Override
    public void run() {

    }
}
