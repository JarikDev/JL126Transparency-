package com;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Main {
    public static void main(String[] args) {
        JFrame jFrame = getFrame();
        jFrame.add(new MyComponent());
    }
    static class MyComponent extends JComponent {
        @Override
        public void paint(Graphics g) {
            Graphics2D g2 = (Graphics2D) g;
            Rectangle2D r2=new Rectangle2D.Double(50,50,100,100);
            Color color= new Color(0.f,0f,0f);
            g2.setColor(color);
            g2.fill(r2);

            Rectangle2D r22=new Rectangle2D.Double(150,50,100,100);
            Color color2= new Color(0.f,0f,0f,0.5f);
            g2.setColor(color2);
            g2.setComposite(AlphaComposite.SrcOver);
            g2.fill(r22);

            Rectangle2D r222=new Rectangle2D.Double(200,50,100,100);
            Color color3= new Color(0.f,0f,0f,0.1f);
            g2.setColor(color3);
            g2.fill(r222);
        }
    }
    static JFrame getFrame() {
        JFrame jFrame = new JFrame() {};
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width / 2 - 250, dimension.height / 2 - 150, 500, 500);
        return jFrame;
    }
}
