package celciusConverter;

import javax.swing.*;


public class CelciusConvertor extends JFrame {
    private JPanel mainPanel;
    private JTextField celcuisTextField;
    private JLabel celcuisLabel;
    private JButton convertButton;
    private JLabel fahrenaytLabel;

    public CelciusConvertor(String title){
        super(title);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setContentPane(mainPanel);
       this.pack();
    }

    public static void main(String[] args) {
        JFrame jFrame=new CelciusConvertor("MY first program");
        jFrame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
