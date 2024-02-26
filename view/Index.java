package view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Index extends JFrame{ // Index가 JFrame의 기능을 상속 받음

    Index(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("홈페이지");
        this.setLayout(new GridLayout(3, 3, 10, 10));
        JButton joinBtn1 = new JButton("회원가입");

        joinBtn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            } // 이 부분에 들어간 기능(람다로 처리하는 부분)은 메모리 점유하지 않음
        });
        this.add(joinBtn1);

        JButton accountBtn1 = new JButton("통장생성");
        joinBtn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        this.add(accountBtn1);

        JButton listBtn1 = new JButton("목록보기");
        listBtn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        this.add(listBtn1);

        setSize(600, 600);
        setLocation(100, 100);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Index();
    }
}
