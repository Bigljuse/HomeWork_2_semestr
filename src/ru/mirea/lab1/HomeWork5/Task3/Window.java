package ru.mirea.lab1.HomeWork5.Task3;

import ru.mirea.lab1.HomeWork5.Task2.Figure;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;
import java.util.Random;

public class Window
{
    public static void Show(String args[])
    {
        Image bgImage= Toolkit.getDefaultToolkit().getImage(args[0]);
        JLabel jLabel = new JLabel(new ImageIcon(bgImage));

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(Color.GRAY);
        mainPanel.add(jLabel);

        JFrame frame = new JFrame("JFrame");
        frame.setPreferredSize(new Dimension(800,500));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(mainPanel, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}
