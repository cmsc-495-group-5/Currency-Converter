
package currency.exchange;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class GUI  extends Converter{

    public GUI() {
        from = new JLabel("  Convert From:   ");
        to = new JLabel("  Convert To:   ");
        amount = new JLabel("  Amount:  ");
        fromCountry = new JComboBox(countryfrom);
        fromCountry.setBackground(Color.decode("#d2c5a1"));

        toCountry = new JComboBox();
        toCountry.addItem("Select Country");
        toCountry.setBackground(Color.decode("#d2c5a1"));

        amountTxt = new JTextField(25);
        amountTxt.setText("");

        submit = new JButton("Submit");

        
         prepareGUI();
    }
    
    //create GUI Jframe and add component
    protected void prepareGUI() {
        mainFrame = new JFrame("Country Currency Converter Application ");
        mainFrame.setSize(550, 450);
        mainFrame.setResizable(false);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setLayout(new FlowLayout());

        headerLabel = new JLabel("", JLabel.CENTER);
        
        headerLabel.setFont(new Font("Century Gothic", Font.PLAIN, 45));
        headerLabel.setForeground(Color.DARK_GRAY);
        statusLabel = new JLabel("<html><center><span style=\"color:red\">Please wait....</span>  <br><span style=\"color:green\">Database Loading Real Time Records</span></center></html>", JLabel.CENTER);
        statusLabel.setFont(statusLabel.getFont().deriveFont(18f));
        statusLabel.setForeground(Color.blue);

        mainFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());
       // controlPanel.setBackground(Color.LIGHT_GRAY);
        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }

    //layout swing components using GridBagLayout
    protected void showGridBagLayoutDemo() {
        headerLabel.setText("<html><center>CURRENCY <br> CONVERTER</center></html>");

        JPanel panel = new JPanel();
        GridBagLayout layout = new GridBagLayout();

        panel.setLayout(layout);
        GridBagConstraints gbc = new GridBagConstraints();
        //from
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridy = 0;
        gbc.gridx = 0;
        gbc.insets = new Insets(4, 3, 4, 3);
        panel.add(from, gbc);
        gbc.gridy = 0;
        gbc.gridx = 1;
        gbc.ipady = 12;
        panel.add(fromCountry, gbc);

        //to
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridy = 1;
        gbc.gridx = 0;
        panel.add(to, gbc);
        gbc.gridy = 1;
        gbc.gridx = 1;
        gbc.ipady = 12;
        panel.add(toCountry, gbc);

        //amount
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridy = 2;
        gbc.gridx = 0;
        gbc.ipady = 12;
        panel.add(amount, gbc);
        gbc.gridy = 2;
        gbc.gridx = 1;
        gbc.ipady = 12;
        panel.add(amountTxt, gbc);

        //action
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridy = 3;
        gbc.gridx = 0;
        gbc.ipady = 2;
        gbc.gridwidth = 2;
        panel.add(submit, gbc);
        
        controlPanel.add(panel);
        mainFrame.setVisible(true);
       
    }
    
    
}
