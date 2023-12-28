/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paintingproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.List;
import javax.sound.sampled.Line;

import javax.swing.JPanel;


public class Paintpanel extends JPanel {
    private List<Line> lines; // List to store drawn lines
    private Line currentLine; // The current line being drawn

    public Paintpanel() {
        this.setBackground(Color.WHITE);
        this.setFocusable(true);
        this.lines = new ArrayList<>();

        this.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Handle mouseClicked event if needed
            }

            @Override
            public void mousePressed(MouseEvent e) {
                currentLine = new Line(e.getX(), e.getY(), e.getX(), e.getY());
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                lines.add(currentLine);
                currentLine = null;
                repaint();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                // Handle mouseEntered event if needed
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Handle mouseExited event if needed
            }
        });

        this.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                if (currentLine != null) {
                    currentLine.setEndX(e.getX());
                    currentLine.setEndY(e.getY());
                    repaint();
                }
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                // Handle mouseMoved event if needed
            }
        });
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw the stored lines
        for (Line line : lines) {
            g.drawLine(line.getStartX(), line.getStartY(), line.getEndX(), line.getEndY());
        }

        // Draw the current line being drawn
        if (currentLine != null) {
            g.drawLine(currentLine.getStartX(), currentLine.getStartY(), currentLine.getEndX(), currentLine.getEndY());
        }
    }

    private static class Line {
        private int startX, startY, endX, endY;

        public Line(int startX, int startY, int endX, int endY) {
            this.startX = startX;
            this.startY = startY;
            this.endX = endX;
            this.endY = endY;
        }

        public int getStartX() {
            return startX;
        }

        public int getStartY() {
            return startY;
        }

        public int getEndX() {
            return endX;
        }

        public int getEndY() {
            return endY;
        }

        public void setEndX(int endX) {
            this.endX = endX;
        }

        public void setEndY(int endY) {
            this.endY = endY;
        }
    }
}


