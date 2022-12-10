package Programs.com.example.Lambda;

import java.awt.event.ActionListener;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class LambdaCapture {
    
    private final static int FIELD_WIDTH = 20;
    private static JTextField staticTextField;

    public static void main(String[] args) {
        
        JFrame frame = new JFrame();

        staticTextField = new JTextField(FIELD_WIDTH);
        staticTextField.setText("Static Field");

        JTextField localTextField = new JTextField(FIELD_WIDTH);
        localTextField.setText("Local Variable");

        JButton helloButton = new JButton("Say Hello");

        // regular anonymous class
        helloButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                staticTextField.setText("Hello, World!");
                localTextField.setText("Hello, World!");
            }
        });

        JButton goodbyeButton = new JButton("Say Goodbye");

        goodbyeButton.addActionListener(event -> {
            staticTextField.setText("Goodbye, World!");
            localTextField.setText("Goodbye, World!");
        });

        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new FlowLayout());
        contentPane.add(staticTextField);
        contentPane.add(localTextField);
        contentPane.add(helloButton);
        contentPane.add(goodbyeButton);

        //staticTextField = null; // Gives run time error - Null Pointer Exception
        //localTextField = null; // Gives compile time error - "Local variable localTextField defined in an enclosing scope must be final or effectively final"; Cannot ressign it as about actionPerformed method are accessing these fields

        frame.setAlwaysOnTop(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
