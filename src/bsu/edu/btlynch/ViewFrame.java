package bsu.edu.btlynch;

import javax.swing.*;
import java.awt.*;


public class ViewFrame extends JFrame {

    private FractalTree fractalTree = new FractalTree();

    private ViewFrame() {
        super("Fractal Tree Window");
        setBounds(100, 100, 800, 600);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        fractalTree.generateLines();
    }

    private void drawLines(Graphics g) {
        for (int i=0; i<fractalTree.getNumOfLines(); i++) {
            Line line = fractalTree.getLineNumber(i);
            drawThisLine(g, line);
        }
    }

    private void drawThisLine(Graphics g, Line line){
        Point startPoint = line.getStartPoint();
        Point endPoint = line.getEndPoint();
        g.drawLine(startPoint.x(), startPoint.y(), endPoint.x(), endPoint.y());
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        drawLines(g);
    }

    public static void main(String[] args) {
        new ViewFrame().setVisible(true);
    }

}
