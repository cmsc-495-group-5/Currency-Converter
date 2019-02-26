package currency.exchange;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Converter {

    //initialize variables
    protected static int i, j, k, color, loading = 0;
    protected static String countryfrom[] = {"Select Country", "USD", "EUR", "IDR", "AUD", "CAD", "SGD", "JPY", "CNY", "ZAR", "BRL"};
    protected static String[][] USD, EUR, IDR, AUD, CAD, SGD, JPY, CNY, ZAR, BRL;
    protected static java.util.Timer timer;
    protected static String timeUpadte = "";
    protected static int testconnection, previousStatus = 0;
    //initialize GUI component
    protected static JFrame mainFrame;
    protected JPanel controlPanel;
    protected static JLabel headerLabel, statusLabel;

    protected JLabel from, to, amount;
    protected static JComboBox fromCountry, toCountry;

    protected static JTextField amountTxt;
    protected static JButton submit;

    public static void main(String[] args) {

        //colors to change when database is upadated
        String activecolor[] = {"#008000", "#DAA520", "#666666", "#009900", "#0000ff", "#660066", "#9400D3", "#800080"};
        //get gui
        GUI swingLayoutDemo = new GUI();
        swingLayoutDemo.showGridBagLayoutDemo();
        fromCountry.setEnabled(false);
        toCountry.setEnabled(false);

        //timer to loop after every one minute
        DatabaseFetch fetch = new DatabaseFetch();
        int updateTime = 60 * 1000;
        timer = new java.util.Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {              // do your work
                int t = fetch.remoteFatch();
                if (color > 7) {
                    color = 0;
                } else {
                    headerLabel.setForeground(Color.decode(activecolor[color]));
                    color = color + 1;
                    if (loading == 0) {
                        if (t == 0) {
                            statusLabel.setText("<html><center><span style=\"color:green\">Database Updated: <br>Enter Correct Inputs to Start</span></center></html>");
                            testconnection = 1;
                            fromCountry.setEnabled(true);
                            toCountry.setEnabled(true);
                        }
                        loading = loading + 1;
                    }

                }
                if (t == 0 && previousStatus == 1) {
                    statusLabel.setText("<html><center><span style=\"color:green\">Database Updated: <br>Enter Correct Inputs to Start</span></center></html>");
                    fromCountry.setEnabled(true);
                    toCountry.setEnabled(true);
                }

            }

        }, 0, updateTime);

        //initalize conversion
        Conversion conversion = new Conversion();

        //attach event listener to submit button
        submit.addActionListener((ActionEvent e) -> {
            if (testconnection == 1) {
                conversion.convertCurrency();
                if (!statusLabel.getText().contains("Error")) {
                	mainFrame.setSize(550, 550);
                    mainFrame.repaint();
                }
            }
        });
    }
}
