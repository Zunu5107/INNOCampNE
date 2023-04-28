import javax.swing.*;
import java.awt.*;
import java.lang.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        JFrame frm = new JFrame();

        // 프레임 제목 설정
        frm.setTitle("지렁이 게임");

        // 프레임 크기 설정
        frm.setSize(800, 600);

        // 프레임을 화면 가운데에 배치
        frm.setLocationRelativeTo(null);

        // 프레임을 닫았을 때 메모리에서 제거되도록 설정
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 레이아웃 설정
        frm.getContentPane().setLayout(null);


        // ★ 라벨에 넣을 아이콘 생성
        ImageIcon bsImg1 = new ImageIcon(Main.class.getResource("img/whitepx.png"));
        ImageIcon bsImg2 = new ImageIcon(Main.class.getResource("img/bluepx.png"));
        ImageIcon bsImg3 = new ImageIcon(Main.class.getResource("img/greenpx.png"));
        ImageIcon bsImg4 = new ImageIcon(Main.class.getResource("img/blackpx.png"));
        /*Image img = bsImg1.getImage();

        // 추출된 Image의 크기 조절하여 새로운 Image 객체 생성
        Image updateImg = img.getScaledInstance(frm.getWidth() / 2, frm.getHeight() / 2, Image.SCALE_SMOOTH);

        // 새로운 Image 객체로 ImageIcon 객체 생성
        ImageIcon updateIcon = new ImageIcon(updateImg);
        */
        // [20][15] = [width - (width/10 * 2) / 20][height - (height/10 * 2) / 15]

        int forcessx = (frm.getWidth() - (frm.getWidth() / 10 * 2))  / 17;
        int forcessy = (frm.getHeight() - (frm.getHeight() / 10 * 2)) / 17;
        // 지렁이 게임 배열 초기화

        ArrayList<ArrayList<JLabel>> imgLbl = new ArrayList<>();
        int forcess = (forcessx < forcessy) ? forcessx : forcessy;
        int arrayx = (frm.getWidth() - (forcess * 17)) / 2;
        int arrayy = (frm.getHeight() - (forcess * 17)) / 2;
        System.out.print(arrayx + " ");
        System.out.println(arrayy);
        int i, j;
        for(i = 0; i < 17; i++)
        {
            imgLbl.add(new ArrayList<>());
            for(j = 0; j < 17; j++){
                if( i == 0 || j == 0 || i == 16 || j == 16)
                    imgLbl.get(i).add(new JLabel(bsImg4));
                else
                    imgLbl.get(i).add(new JLabel(bsImg2));

                imgLbl.get(i).get(j).setBounds(arrayx + i * forcess, arrayy + j * forcess, forcess, forcess);
                //imgLbl.get(i).get(j).setHorizontalAlignment(JLabel.CENTER);

                frm.getContentPane().add(imgLbl.get(i).get(j));
            }
        }
        System.out.println(imgLbl.size());
        System.out.println(imgLbl.get(0).size());
        System.out.println(imgLbl.get(16).get(16).getLocation());
        System.out.println(imgLbl.get(16).get(16).getSize());

        JButton btn1 = new JButton("슬라삐");
        JButton btn2 = new JButton("슬라디");

        // 버튼 위치와 크기 설정
        btn1.setBounds(30, 170, 122, 30);
        btn2.setBounds(182, 170, 122, 30);

        // 프레임에다가 버튼 추가
        frm.getContentPane().add(btn1);
        frm.getContentPane().add(btn2);

        // 라벨 설정
        JLabel lbl = new JLabel();
        lbl.setBounds(30, 200, 274, 50);
        lbl.setText("게임을 시작합니다");
        lbl.setHorizontalAlignment(JLabel.CENTER); // 수평 가운데 정렬
        frm.getContentPane().add(lbl);

        // ★ 버튼이 눌렸을때
        btn1.addActionListener(event -> {
            imgLbl.get(0).get(0).setIcon(bsImg3);
        });

        btn2.addActionListener(event -> {
            imgLbl.get(0).get(0).setIcon(bsImg4);
        });

        frm.setVisible(true);
    }
}
