import java.awt.event.ActionListener;
import javax.swing.JPanel;


import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.event.*;

public class Display extends JPanel implements ActionListener{
    
    private JTextPane textArea; // big text block
    private JButton saveButton; 
    private JComboBox colorCombo;
    private JComboBox fontCombo;
    private JLabel processorLabel;
    private JSlider fontSize;

    // Cretae method Objects
    SaveContent savefile = new SaveContent();
    ColorManagement colorClass = new ColorManagement();
    FontManagement fontClass = new FontManagement();

    Main main = new Main();

    // create some array

    String[] colorItems = {"Red","Green","Black","Orange","Pink","Blue"};
    String[] fontItems = {"Monospaced","Serif","Sans Serif"};

    public Display(){
        init();
    }

    public void init(){
        Font font;
        Color color;

        color = colorClass.getColor();
        font = fontClass.getFont();
        // putting all of the buttons and everything
        //construct components
        textArea = new JTextPane();
        saveButton = new JButton("Save");
        colorCombo = new JComboBox(colorItems);
        fontCombo = new JComboBox(fontItems);
        processorLabel = new JLabel("Word Processor");
        fontSize = new JSlider(10,30);
       
        // Work with Slider
        fontSize.setOrientation(JSlider.HORIZONTAL);
        fontSize.setMinorTickSpacing(1);
        fontSize.setMajorTickSpacing(5);
        fontSize.setPaintTicks(true);
        fontSize.setPaintLabels(true);

        // Make the text area look presentable
        textArea.setBackground(Color.LIGHT_GRAY);
        // textArea.setForeground(color);

        // Adjust size and layout

        setPreferredSize(new Dimension(817,473));
        setLayout(null);

        // Add Components
        add (textArea);
        add (saveButton);
        add (colorCombo);
        add (fontCombo);
        add (processorLabel);
        add (fontSize);

        // Set Boundries
        textArea.setBounds(10,10,650,450);
        processorLabel.setBounds(670,20,140,35);
        fontSize.setBounds(670,95,140,49);
        fontCombo.setBounds(670,150,140,35);
        colorCombo.setBounds(670,205,140,53);
        saveButton.setBounds(670,315,140,35);
               
        
        // Add section listners
        saveButton.addActionListener(this);
        colorCombo.addActionListener(this);
        fontCombo.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e){

        if(e.getSource() == saveButton){
            // Call save class
            savefile.save(textArea);

        }if(e.getSource() == colorCombo){
            // Call Color Class
            colorClass.selectColor(colorCombo.getSelectedItem().toString());
            textArea.setForeground(colorClass.getColor());
        }if(e.getSource() == fontCombo){
            // Call font class
            fontClass.selectfont(fontCombo.getSelectedItem().toString(), fontSize.getValue());
            textArea.setFont(fontClass.getFont());
        }
    }


    public JTextPane getText(){
        return textArea; 
    }
}
