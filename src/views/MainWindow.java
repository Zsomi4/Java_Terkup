package views;

import javax.swing.JFrame;

public class MainWindow extends JFrame implements Window {
    
    public MainWindow() {
        initComponents();
        addComponentToWindow();
        initWindow();
    }

    public void initComponents() {

    }

    public void addComponentToWindow() {

    }

    public void initWindow() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);
        setVisible(true);
    }
}
