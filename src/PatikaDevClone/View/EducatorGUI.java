package PatikaDevClone.View;

import PatikaDevClone.Helper.Config;
import PatikaDevClone.Helper.Helper;

import javax.swing.*;

public class EducatorGUI extends JFrame {
    private JPanel wrapper;

    public EducatorGUI() {
        add(wrapper);
        setSize(400,400);
        setLocation(Helper.screenCenterPoint("x", getSize()), Helper.screenCenterPoint("y", getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setResizable(false);
        setVisible(true);
    }
}
