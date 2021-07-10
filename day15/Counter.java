
import java.awt.*;       
import java.awt.event.*; 
import javax.swing.*;   

public class Counter extends JFrame {
    private JTextField tfCount;
    private JButton btnCount;
    
    private int count = 0;

    public Counter() {
        
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());

        cp.add(new JLabel("counter"));
        tfCount = new JTextField(count + "", 10);
        tfCount.setEditable(false);
        tfCount.setHorizontalAlignment(JTextField.RIGHT);
        cp.add(tfCount);

        btnCount = new JButton("CLICK");
        cp.add(btnCount);
        btnCount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                ++count;
                tfCount.setText(count + "");
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
        setSize(600, 400);
        setTitle("Swing Counter");
        setVisible(true);  
    }

    public static void main(String[] args) {
       
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Counter(); 
            }
        });
    }
}
