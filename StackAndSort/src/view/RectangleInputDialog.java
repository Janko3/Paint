package view;

import models.Rectangle;

import javax.swing.*;
import java.awt.*;

class RectangleInputDialog extends JDialog {

    private JTextField xField;
    private JTextField yField;
    private JTextField widthField;
    private JTextField heightField;
    private Rectangle rectangle;
    private boolean confirmed = false;

    public RectangleInputDialog(JFrame parent) {
        super(parent, "Add Rectangle", true);
        initDialog();
        rectangle = new Rectangle();
        setSize(300, 300);

    }

    public RectangleInputDialog(JFrame parent, Rectangle rectangle) {
        super(parent, "Edit Rectangle", true);
        this.rectangle = rectangle;
        initDialog();
        setRectangle();
    }

    private void initDialog() {
        xField = new JTextField(10);
        yField = new JTextField(10);
        widthField = new JTextField(10);
        heightField = new JTextField(10);

        JButton okButton = new JButton("OK");
        okButton.addActionListener(e -> {
            confirmed = true;
            setRectangle();
            dispose();
        });

        JButton cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(e -> dispose());

        JPanel inputPanel = new JPanel(new GridLayout(4, 2));
        inputPanel.add(new JLabel("X Coordinate:"));
        inputPanel.add(xField);
        inputPanel.add(new JLabel("Y Coordinate:"));
        inputPanel.add(yField);
        inputPanel.add(new JLabel("Width:"));
        inputPanel.add(widthField);
        inputPanel.add(new JLabel("Height:"));
        inputPanel.add(heightField);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(okButton);
        buttonPanel.add(cancelButton);

        add(inputPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
    }

    public boolean showDialog() {
        setVisible(true);
        return confirmed;
    }

    public void setRectangle() {
        rectangle.setA(Integer.parseInt(xField.getText()));
        rectangle.setB(Integer.parseInt(yField.getText()));
        rectangle.setWidth(Integer.parseInt(widthField.getText()));
        rectangle.setHeight(Integer.parseInt(heightField.getText()));
        int area = Integer.parseInt(widthField.getText()) * Integer.parseInt(heightField.getText());
        System.out.println("Area" + area);
        rectangle.setArea(area);


    }

    public Rectangle getRectangle() {
        int x = Integer.parseInt(xField.getText());
        int y = Integer.parseInt(yField.getText());
        int width = Integer.parseInt(widthField.getText());
        int height = Integer.parseInt(heightField.getText());
        return new Rectangle(x, y, width, height);
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
    }
}
