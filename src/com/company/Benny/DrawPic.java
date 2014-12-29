package com.company.Benny;

/**
 * Created by blin on 2014/12/25.
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class CDraw extends JFrame {
    CGPanel2 pane = new CGPanel2();
    Point p1, p2;                 // 宣告點坐標物件
    boolean isDraw = false;       // 決定是否繪製

    CDraw() {
        pane.setBounds(0, 0, 300, 200);
        add(pane);
        pane.addMouseListener(new CDrawPic1());
        pane.addMouseMotionListener(new CDrawPic2());

        setTitle("用滑鼠繪製矩形");
        setLayout(null);
        setBounds(50, 50, 300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    class CDrawPic1 extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            p1 = e.getPoint();       // 取得起點坐標
        }

        public void mouseReleased(MouseEvent e) {
            isDraw = false;         // 不能繪製
        }
    }

    class CDrawPic2 extends MouseMotionAdapter {
        public void mouseDragged(MouseEvent e) {
            p2 = e.getPoint();       // 取得終點坐標
            isDraw = true;           // 可以繪製
            repaint();               // 重繪圖形
        }
    }

    class CGPanel2 extends JPanel {
        public void paintComponent(Graphics g) {
            if (!isDraw) return;    // 若不能繪製,返回
            g.drawRect(p1.x, p1.y, p2.x-p1.x, p2.y-p1.y); // 繪製矩形
        }
    }
}

public class DrawPic {
    CDraw frame1 = new CDraw();

}
