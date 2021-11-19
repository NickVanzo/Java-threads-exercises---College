package Exercise2.View;

import Exercise2.Controller.GeneraProverbi;

import javax.swing.*;
import java.util.Observable;
import java.util.Observer;

public class Window extends JFrame implements Observer {
    private JButton button;
    private JPanel panel;
    private JLabel label;

    public Window() {
        super("Proverbi:");
        panel = new JPanel();
        button = new JButton();
        label = new JLabel();
        add(panel);
        panel.add(button);
        label.setText("Base text");
        panel.add(label);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void update(Observable o, Object arg) {
        label.setText((String) arg);
    }
}
