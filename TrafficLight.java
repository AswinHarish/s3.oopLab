import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TrafficLight extends Frame implements ItemListener {
    String clr = "";

    TrafficLight() {
        Checkbox c1, c2, c3;
        CheckboxGroup tsign = new CheckboxGroup();
        c1 = new Checkbox("red", false, tsign);
        c2 = new Checkbox("yellow", false, tsign);
        c3 = new Checkbox("green", false, tsign);
        setSize(500, 700);
        setTitle("TrafficLight Signal");
        setVisible(true);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(c1);
        add(c2);
        add(c3);
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e) {
        clr = e.getItem().toString();
        repaint();
    }

    public void paint(Graphics g) {
        super.paint(g); 

        g.drawRoundRect(180, 200, 100, 350, 50, 50);
        g.setColor(Color.black);
        g.fillRoundRect(180, 200, 100, 350, 50, 50);
        g.setColor(Color.red);
        g.drawOval(200, 250, 50, 50);
        g.setColor(Color.yellow);
        g.drawOval(200, 350, 50, 50);
        g.setColor(Color.green);
        g.drawOval(200, 450, 50, 50);

        if (clr.equals("red")) {
            g.setColor(Color.red);
            g.fillOval(200, 250, 50, 50);
        }
        if (clr.equals("yellow")) {
            g.setColor(Color.yellow);
            g.fillOval(200, 350, 50, 50);
        }
        if (clr.equals("green")) {
            g.setColor(Color.green);
            g.fillOval(200, 450, 50, 50);
        }
    }

    public static void main(String[] args) {
        new TrafficLight();
    }
}

