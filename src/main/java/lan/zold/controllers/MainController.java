package lan.zold.controllers;

import javax.swing.JButton;

import lan.zold.models.Triangle;
import lan.zold.views.InputPanel;
import lan.zold.views.MainFrame;

public class MainController {
    MainFrame mainFrame;
    public MainController() {
        this.mainFrame = new MainFrame();
        this.handleEvents();
    }

    private void handleEvents() {
        JButton calcButton = mainFrame.getCalcButton();
        System.out.println("kesz");
        calcButton.addActionListener(e -> {
            System.out.println("mukodik");
            onClickCalcButton();
        });
    }

    private void onClickCalcButton() {
        InputPanel basePanel = this.mainFrame.getBasePanel();
        InputPanel heightPanel = this.mainFrame.getHeightPanel();
        InputPanel areaPanel = this.mainFrame.getAreaPanel();
        double base = Double.parseDouble(basePanel.getValue());
        double height = Double.parseDouble(heightPanel.getValue());
        Double area = Triangle.calcArea(base, height);
        areaPanel.setValue(area.toString());

        System.out.println("szep");
    }
}
