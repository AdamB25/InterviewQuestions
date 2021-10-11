package Calculator;



import javax.swing.*;

public class Calculator {
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JTextField text;
    private JButton a0Button;
    private JButton plus;
    private JButton minus;
    private JButton times;
    private JButton divide;
    private JTextField result;

    public JButton getA1Button() {
        return a1Button;
    }

    public void setA1Button(JButton a1Button) {
        this.a1Button = a1Button;
        a1Button.doClick();
        System.out.println("a1Button.getText() = " + a1Button.getText());
    }

    public JButton getA2Button() {
        return a2Button;
    }

    public void setA2Button(JButton a2Button) {
        this.a2Button = a2Button;
    }

    public JButton getA3Button() {
        return a3Button;
    }

    public void setA3Button(JButton a3Button) {
        this.a3Button = a3Button;
    }

    public JButton getA4Button() {
        return a4Button;
    }

    public void setA4Button(JButton a4Button) {
        this.a4Button = a4Button;
    }

    public JButton getA5Button() {
        return a5Button;
    }

    public void setA5Button(JButton a5Button) {
        this.a5Button = a5Button;
    }

    public JButton getA6Button() {
        return a6Button;
    }

    public void setA6Button(JButton a6Button) {
        this.a6Button = a6Button;
    }

    public JButton getA7Button() {
        return a7Button;
    }

    public void setA7Button(JButton a7Button) {
        this.a7Button = a7Button;
    }

    public JButton getA8Button() {
        return a8Button;
    }

    public void setA8Button(JButton a8Button) {
        this.a8Button = a8Button;
    }

    public JButton getA9Button() {
        return a9Button;
    }

    public void setA9Button(JButton a9Button) {
        this.a9Button = a9Button;
    }

    public JTextField getText() {
        return text;
    }

    public void setText(JTextField text) {
        this.text = text;
    }

    public JButton getA0Button() {
        return a0Button;
    }

    public void setA0Button(JButton a0Button) {
        this.a0Button = a0Button;
    }

    public JButton getPlus() {
        return plus;
    }

    public void setPlus(JButton plus) {
        this.plus = plus;
    }

    public JButton getMinus() {
        return minus;
    }

    public void setMinus(JButton minus) {
        this.minus = minus;
    }

    public JButton getTimes() {
        return times;
    }

    public void setTimes(JButton times) {
        this.times = times;
    }

    public JButton getDivide() {
        return divide;
    }

    public void setDivide(JButton divide) {
        this.divide = divide;
    }

    public JTextField getResult() {
        return result;
    }

    public void setResult(JTextField result) {
        this.result = result;
    }
}
