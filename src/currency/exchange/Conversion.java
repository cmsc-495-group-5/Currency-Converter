package currency.exchange;

import java.awt.Color;
import java.text.DecimalFormat;


public class Conversion extends Converter {

    protected void convertCurrency() {

        double amount = 0;
        double num1 = 0;
        double num2 = 0;

        String s = (String) fromCountry.getSelectedItem();//get the selected item
        int toIndex = (int) toCountry.getSelectedIndex();//get the selected index
        try {
            amount = Double.parseDouble(amountTxt.getText());
            if (!amountTxt.getText().contains(".**")) {
            	DecimalFormat decimalformat = new DecimalFormat("##.00");
            	amountTxt.setText(decimalformat.format(amount));
            }

            if ("Select Country".equals(s)) {
                // this gets caught in the catch block
                throw new Error("<html><center>Error: <br>Select Country to Convert From!</center><html>");
            } else if ("Select Country".equals(toCountry.getSelectedItem())) {
                throw new Error("<html><center>Error: <br>Select Country to Convert To!</center><html>");
            } else if (amount < 0) {
                // this gets caught in the catch block
                throw new Error("<html><center>Error: <br>Only Positive Numbers & No Letters Please!</center><html>");
            }

            switch (s) {//check for a match
            case "USD":
                num1 = amount * (Double.parseDouble(USD[toIndex][1]));
                num2 = (Double.parseDouble(USD[toIndex][1]));
                break;
            case "EUR":
                num1 = amount * (Double.parseDouble(EUR[toIndex][1]));
                num2 = (Double.parseDouble(EUR[toIndex][1]));
                break;
            case "IDR":
                num1 = amount * (Double.parseDouble(IDR[toIndex][1]));
                num2 = (Double.parseDouble(IDR[toIndex][1]));
                break;
            case "AUD":
                num1 = amount * (Double.parseDouble(AUD[toIndex][1]));
                num2 = (Double.parseDouble(AUD[toIndex][1]));
                break;
            case "CAD":
                num1 = amount * (Double.parseDouble(CAD[toIndex][1]));
                num2 = (Double.parseDouble(CAD[toIndex][1]));
                break;
            case "SGD":
                num1 = amount * (Double.parseDouble(SGD[toIndex][1]));
                num2 = (Double.parseDouble(SGD[toIndex][1]));
                break;
            case "JPY":
                num1 = amount * (Double.parseDouble(JPY[toIndex][1]));
                num2 = (Double.parseDouble(JPY[toIndex][1]));
                break;
            case "CNY":
                num1 = amount * (Double.parseDouble(CNY[toIndex][1]));
                num2 = (Double.parseDouble(CNY[toIndex][1]));
                break;
            case "ZAR":
                num1 = amount * (Double.parseDouble(ZAR[toIndex][1]));
                num2 = (Double.parseDouble(ZAR[toIndex][1]));
                break;
            case "BRL":
                num1 = amount * (Double.parseDouble(BRL[toIndex][1]));
                num2 = (Double.parseDouble(BRL[toIndex][1]));
                break;
            default:
                break;
            }

            String space = "&nbsp;&nbsp;&nbsp;&nbsp;";
            //output formatted results

            statusLabel.setText("<html><center><span style=\"color:Red;\">Conversion Rate Last Database Update </span><br>"
                    + "<span style=\"color:black;\"><i>" + timeUpadte + "</i></span><br> "
                    + "<span style=\"color:blue;\">Conversion Rate:</span><span style=\"color:black;\"> " + String.format("%,.2f", num2)
                    + "</span><br><span style=\"color:Red\"><br>Results</span></center>"
                    + "<table align=\"center\" border=\"2\">\n"
                    + "  <tr>\n"
                    + "    <th align=\"center\">Converted From</th>\n"
                    + "    <th align=\"center\" >Converted To</th> \n"
                    + "  </tr>\n"
                    + "  <tr>\n"
                    + "    <td align=\"center\"  padding =\" 20px\">" + String.format("%,.2f", amount) + "  " + fromCountry.getSelectedItem() + "</td>\n"
                    + "    <td align=\"center\">" + String.format("%,.2f", num1) + "  " + toCountry.getSelectedItem() + "</td>\n"
                    + "  </tr>  \n"
                    + "</table>"
                    + ""
                    + "<html>"
            );

        } catch (NumberFormatException ex) {
            statusLabel.setText("<html><center>Input Error:<br>Amount Not Number</center><html>");
            statusLabel.setForeground(Color.red);
        } catch (Error ext) {
            statusLabel.setText(ext.toString());
            statusLabel.setForeground(Color.red);
        }catch(ArrayIndexOutOfBoundsException e){
            statusLabel.setText("<html><center>Error:<br>Select Country to Convert To!</center><html>");
            statusLabel.setForeground(Color.red);
        }       

    }

    protected void countrySelect() {

        try {
            String s = (String) fromCountry.getSelectedItem();//get the selected item
            toCountry.removeAllItems();
            switch (s) {//check for a match
            case "USD":
                for (int l = 0; l < 53; l++) {
                    toCountry.addItem(USD[l][0]);
                }
                toCountry.setSelectedIndex(0);

                break;
            case "EUR":
                for (int l = 0; l < 53; l++) {
                    toCountry.addItem(EUR[l][0]);
                }
                toCountry.setSelectedIndex(0);
                break;
            case "IDR":
                for (int l = 0; l < 53; l++) {
                    toCountry.addItem(IDR[l][0]);
                }
                toCountry.setSelectedIndex(0);
                break;
            case "AUD":
                for (int l = 0; l < 53; l++) {
                    toCountry.addItem(AUD[l][0]);
                }
                toCountry.setSelectedIndex(0);
                break;
            case "CAD":
                for (int l = 0; l < 53; l++) {
                    toCountry.addItem(CAD[l][0]);
                }
                toCountry.setSelectedIndex(0);
                break;
            case "SGD":
                for (int l = 0; l < 53; l++) {
                    toCountry.addItem(SGD[l][0]);
                }
                toCountry.setSelectedIndex(0);
                break;
            case "JPY":
                for (int l = 0; l < 53; l++) {
                    toCountry.addItem(JPY[l][0]);
                }
                toCountry.setSelectedIndex(0);
                break;
            case "CNY":
                for (int l = 0; l < 53; l++) {
                    toCountry.addItem(CNY[l][0]);
                }
                toCountry.setSelectedIndex(0);
                break;
            case "ZAR":
                for (int l = 0; l < 53; l++) {
                    toCountry.addItem(ZAR[l][0]);
                }
                toCountry.setSelectedIndex(0);
                break;
            case "BRL":
                for (int l = 0; l < 53; l++) {
                    toCountry.addItem(BRL[l][0]);
                }
                toCountry.setSelectedIndex(0);
                break;
            default:
                break;
            }
        } catch (NullPointerException ext) {
            statusLabel.setText("<html><center>Oops!  <br>Wait For Datbase to Load</center></html>");
            statusLabel.setForeground(Color.red);
        }

    }
}
