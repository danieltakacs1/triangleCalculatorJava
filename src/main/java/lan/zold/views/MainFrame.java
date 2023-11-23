package lan.zold.views;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainFrame extends JFrame {
    InputPanel basePanel;
    InputPanel heightPanel;
    JButton calcButton;
    InputPanel areaPanel;

    ImageIcon img;

    public MainFrame(){
        this.initComponent();
        this.setComponent();
        this.addComponent();
        this.initFrame();
    }

    private void initComponent() {
        this.basePanel = new InputPanel();
        this.heightPanel = new InputPanel();
        this.calcButton = new JButton("Számít");
        this.areaPanel = new InputPanel();

        this.img = new ImageIcon("C:/Users/diak/Desktop/minecraft.jfif");
    }

    private void setComponent() {
        this.basePanel.setText("Alap");
        this.heightPanel.setText("Magasság");
        this.areaPanel.setText("Terület");
    }

    private void addComponent() {
        this.add(this.basePanel);
        this.add(this.heightPanel);
        this.add(this.calcButton);
        this.add(this.areaPanel);
    }

    private void initFrame() {
        //this.setContentPane(new JLabel(new ImageIcon("C:/Users/diak/Desktop/minecraftbackground.jpg")));
        this.setTitle("Minecraft");
        this.setIconImage(img.getImage());



        this.setLayout(new BoxLayout(
            this.getContentPane(), BoxLayout.PAGE_AXIS)
            );
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    public InputPanel getBasePanel() {
        return basePanel;
    }

    public void setBasePanel(InputPanel basePanel) {
        this.basePanel = basePanel;
    }

    public InputPanel getHeightPanel() {
        return heightPanel;
    }

    public void setHeightPanel(InputPanel heightPanel) {
        this.heightPanel = heightPanel;
    }

    public JButton getCalcButton() {
        return calcButton;
    }

    public void setCalcButton(JButton calcButton) {
        this.calcButton = calcButton;
    }

    public InputPanel getAreaPanel() {
        return areaPanel;
    }

    public void setAreaPanel(InputPanel areaPanel) {
        this.areaPanel = areaPanel;
    }
}
