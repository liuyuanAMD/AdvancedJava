package it.heima.stonepuzzle;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLOutput;
import java.util.Random;

public class MainFrame extends JFrame implements KeyListener {
    int[][] data = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };
    int[][] victory = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };
    int row;
    int column;
    int count;

    public MainFrame() {
        this.addKeyListener(this);
        initFrame();
        ShuffleArray();
        paintView();
        setVisible(true);

    }


    public void initFrame() {
        setSize(514, 595);
        setTitle("石头迷阵单机版v1.0");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setLocationRelativeTo(null);
        setLayout(null);


    }

    public void paintView() {
        getContentPane().removeAll();
        if(victory()){
            JLabel WinJLabel = new JLabel(new ImageIcon("D://image/win.png"));
            WinJLabel.setBounds(124,230,266,88);
            getContentPane().add(WinJLabel);
        }
        JLabel scoreJlabel=new JLabel("步数为"+count);
        scoreJlabel.setBounds(50,20,100,20);
        getContentPane().add(scoreJlabel);
        JButton button=new JButton("重新游戏");
        button.setBounds(350,20,100,20);
        getContentPane().add(button);
        button.setFocusable(false);
        button.addActionListener(e -> {
            count=0;
          ShuffleArray();
          paintView();
        }

        );
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                JLabel imagelabel = new JLabel(new ImageIcon("D://image/" + data[j][i] + ".png"));
                imagelabel.setBounds(50 + 100 * i, 90 + 100 * j, 100, 100);
                getContentPane().add(imagelabel);

            }
        }
        JLabel label16 = new JLabel(new ImageIcon("D://image/background.png"));
        label16.setBounds(26, 30, 450, 484);
        getContentPane().add(label16);
        getContentPane().repaint();

    }
    public boolean victory() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if(data[i][j]!=victory[i][j]){
                    return false;
                }
            }
        }
        return true;
    }


    public void ShuffleArray() {
        Random random = new Random();
        for (int i = 0; i < data.length; i++) {

            for (int j = 0; j < data[i].length; j++) {
                int X = random.nextInt(4);
                int Y = random.nextInt(4);
                int temp = data[i][j];
                data[i][j] = data[X][Y];
                data[X][Y]=temp;
            }


        }
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if(data[i][j]==0){
                    row=i;
                    column=j;
                }
            }
        }

    }



    @Override
    public void keyPressed(KeyEvent e) {
        int KeyCode=e.getKeyCode();
        move(KeyCode);
        paintView();


    }

    private void move(int KeyCode) {
        if (victory()){
            return;
        }
        if(KeyCode ==37){
            if(column==3){
                return;
            }

            int temp=data[row][column];
            data[row][column]=data[row][column+1];
            data[row][column+1]=temp;
            column++;
            count++;

        }
        else if(KeyCode ==38){
            if (row==3){
                return;
            }

            int temp=data[row][column];
            data[row][column]=data[row+1][column];
            data[row+1][column]=temp;
            row++;
            count++;


        }
        else if(KeyCode ==39){
            if (column==0){
                return;
            }

              int temp=data[row][column];
              data[row][column]=data[row][column-1];
              data[row][column-1]=temp;
              column--;
            count++;

        }
        else if(KeyCode ==40){
            if(row==0){
                return;
            }
           int temp=data[row][column];
           data[row][column]=data[row-1][column];
           data[row-1][column]=temp;
           row--;
            count++;

        }

        else if(KeyCode ==90){
            data=new int[][]{
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 0}

            };
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
    @Override
    public void keyTyped(KeyEvent e) {

    }
}
