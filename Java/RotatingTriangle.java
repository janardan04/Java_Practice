import java.awt.*;
import java.awt.geom.AffineTransform;
import javax.swing.*;

public class RotatingTriangle extends JPanel {

    private double angle = 0; // Rotation angle

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Set rendering hints for better quality
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;

        // Draw the small red circle at the center
        g2d.setColor(Color.RED);
        int centerCircleRadius = 10;
        g2d.fillOval(centerX - centerCircleRadius, centerY - centerCircleRadius, 2 * centerCircleRadius, 2 * centerCircleRadius);

        // Define the triangle's points
        int[] xPoints = {centerX, centerX - 50, centerX + 50};
        int[] yPoints = {centerY - 50, centerY + 50, centerY + 50};
        Polygon triangle = new Polygon(xPoints, yPoints, 3);

        // Rotate the triangle around the center
        AffineTransform oldTransform = g2d.getTransform();
        g2d.rotate(angle, centerX, centerY);

        // Draw the triangle
        g2d.setColor(Color.BLUE);
        g2d.fillPolygon(triangle);

        // Calculate the position of the rotating red dot (following the top vertex of the triangle)
        int vertexX = centerX;
        int vertexY = centerY - 50;

        double rotatedX = Math.cos(angle) * (vertexX - centerX) - Math.sin(angle) * (vertexY - centerY) + centerX;
        double rotatedY = Math.sin(angle) * (vertexX - centerX) + Math.cos(angle) * (vertexY - centerY) + centerY;

        // Draw the rotating red dot
        int dotRadius = 8;
        g2d.setColor(Color.RED);
        g2d.fillOval((int) rotatedX - dotRadius, (int) rotatedY - dotRadius, 2 * dotRadius, 2 * dotRadius);

        // Reset the transform
        g2d.setTransform(oldTransform);

        // Update the angle for the next frame
        angle += 0.01;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Rotating Triangle with Red Circle");
        RotatingTriangle panel = new RotatingTriangle();
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Animation loop
        while (true) {
            panel.repaint();
            try {
                Thread.sleep(10); // Control the speed of rotation
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
