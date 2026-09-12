import javax.swing.*;

public class Login {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Login - Event Management System");

        frame.setSize(500, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Title
        JLabel title = new JLabel("EVENT MANAGEMENT SYSTEM");
        title.setBounds(140, 30, 300, 30);

        // Username
        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(80, 90, 100, 30);

        JTextField username = new JTextField();
        username.setBounds(180, 90, 220, 30);

        // Password
        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(80, 140, 100, 30);

        JPasswordField password = new JPasswordField();
        password.setBounds(180, 140, 220, 30);

        // Login Button
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(190, 200, 120, 35);

        // Login button action
        loginButton.addActionListener(e -> {

            String user = username.getText();
            String pass = new String(password.getPassword());

            if (user.equals("admin") && pass.equals("1234")) {

                System.out.println();
                System.out.println("================================");
                System.out.println("       LOGIN SUCCESSFUL");
                System.out.println("================================");

                frame.dispose();

                Dashboard.showDashboard();

            } else {

                System.out.println();
                System.out.println("Invalid Username or Password");

            }
        });

        // Add components
        frame.add(title);
        frame.add(userLabel);
        frame.add(username);
        frame.add(passLabel);
        frame.add(password);
        frame.add(loginButton);

        frame.setVisible(true);
    }
}