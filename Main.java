import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Event Management System");

        frame.setSize(500, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel title = new JLabel("EVENT MANAGEMENT SYSTEM");
        title.setBounds(130, 40, 300, 30);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(190, 150, 120, 40);

        frame.add(title);
        frame.add(loginButton);

        frame.setVisible(true);
    }
}