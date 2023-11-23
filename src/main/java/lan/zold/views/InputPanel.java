package lan.zold.views;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InputPanel extends JPanel{
    JLabel label;
    JTextField field;
    public InputPanel() {
        this.initComponent();
        this.setComponent();
        this.addComponent();
    }

    public void initComponent() {
        this.label = new JLabel();
        this.field = new JTextField(10);
    }

    private void setComponent() {
        this.label.setText("Alap");
    }

    private void addComponent() {
        this.add(this.label);
        this.add(this.field);
    }

    public void setText(String text) {
        this.label.setText(text);
    }

    public void setValue(String value) {
        this.field.setText(value);
    }

    public String getValue() {
        return this.field.getText();
    }
}
