import javax.swing.*;
import java.awt.*;

public class GraphicTask extends JFrame
{
    public GraphicTask()
    {
        setSize(600, 250);
        add(new PaintPanel());
        setLocationRelativeTo(null);
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                GraphicTask graphicTask = new GraphicTask();
                graphicTask.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                graphicTask.setVisible(true);
            }
        });
    }

    public class PaintPanel extends JPanel
    {
        protected void paintComponent(Graphics g)
        {
            super.paintComponents(g);
            Graphics2D g2 = (Graphics2D) g;

            g2.drawOval(50, 50, 100, 100);
            g2.drawRect(250, 50, 100, 100);
            g2.drawPolyline(new int[]{500, 512, 550, 520, 531, 500, 470, 481, 450, 489, 500}, new int[]{50, 88, 90, 113, 150, 128, 150, 113, 90, 88, 50}, 11);
        }
    }
}
