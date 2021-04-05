package HW_09042021.CallBack;

import javax.swing.*;
import java.awt.*;

public class Swing extends JComponent {
    @Override
    protected void paintComponent(Graphics g) {
        Font font = new Font("Times New Roman", Font.BOLD, 20);
        Graphics2D d2 = (Graphics2D) g;
        d2.setFont(font);
        d2.drawString(new Print().printMessage(new StartTimer().second), 100, 150);
    }

    public void font() {
        JFrame jFrame = getFrame();
        jFrame.add(new Swing());
    }

    static JFrame getFrame() {
        JFrame jFrame = new JFrame() {
        };
        jFrame.setVisible(true);
        //jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width / 2 - 250, dimension.height / 2 - 250, 400, 400);
        return jFrame;
    }
}
