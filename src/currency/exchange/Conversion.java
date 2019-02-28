package currency.exchange;

import java.awt.Color;
import java.text.DecimalFormat;


public class Conversion extends Converter {

    protected void convertCurrency() {

        double amount = 0;
        double num1 = 0;
        double num2 = 0;

        String s = (String) fromCountry.getSelectedItem();//get the selected item
        String to = (String) toCountry.getSelectedItem();//get the selected index
        int toIndex = 0;
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

            switch(to){ //translate toCountry selection
                case "USD":
                    to = "US Dollar";
                    break;
                case "EUR":
                    to = "Euro";
                    break;
                case "IDR":
                    to = "Indian Rupee";
                    break;
                case "AUD":
                    to = "Australian Dollar";
                    break;
                case "CAD":
                    to = "Canadian Dollar";
                    break;
                case "SGD":
                    to = "Singapore Dollar";
                    break;
                case "JPY":
                    to = "Japanese Yen";
                    break;
                case "CNY":
                    to = "Chinese Yuan Renminbi";
                    break;
                case "ZAR":
                    to = "South African Rand";
                    break;
                case "BRL":
                    to = "Brazilian Real";
                    break;
                default:
                    break;
            }

            switch (s) {//check for a match
            case "USD":
                if ("US Dollar".equals(to)){
                     num1 = amount;
                     num2 = 0;
                }
                 else{//find index for selected toCountry
                     for (int c = 0; c < 53; ++c){
                         if (USD[c][0].equals(to))
                             toIndex = c;
                }
                num1 = amount * (Double.parseDouble(USD[toIndex][1]));
                num2 = (Double.parseDouble(USD[toIndex][1]));
              }
                break;
            case "EUR":
                if ("Euro".equals(to)){
                    num1 = amount;
                    num2 = 0;
                }
                else{//find index for selected toCountry
                    for (int c = 0; c < 53; ++c){
                        if (EUR[c][0].equals(to))
                            toIndex = c;
                }
                num1 = amount * (Double.parseDouble(EUR[toIndex][1]));
                num2 = (Double.parseDouble(EUR[toIndex][1]));
                }
                break;
            case "IDR":
                if ("Indian Rupee".equals(to)){
                    num1 = amount;
                    num2 = 0;
                }
                else{//find index for selected toCountry
                    for (int c = 0; c < 53; ++c){
                        if (IDR[c][0].equals(to))
                            toIndex = c;
                }
                num1 = amount * (Double.parseDouble(IDR[toIndex][1]));
                num2 = (Double.parseDouble(IDR[toIndex][1]));
                }
                break;
            case "AUD":
                if ("Australian Dollar".equals(to)){
                    num1 = amount;
                    num2 = 0;
                }
                else{//find index for selected toCountry
                    for (int c = 0; c < 53; ++c){
                        if (AUD[c][0].equals(to))
                            toIndex = c;
                }
                num1 = amount * (Double.parseDouble(AUD[toIndex][1]));
                num2 = (Double.parseDouble(AUD[toIndex][1]));
                }
                break;
            case "CAD":
                if ("Canadian Dollar".equals(to)){
                    num1 = amount;
                    num2 = 0;
                }
                else{//find index for selected toCountry
                    for (int c = 0; c < 53; ++c){
                        if (CAD[c][0].equals(to))
                            toIndex = c;
                }
                num1 = amount * (Double.parseDouble(CAD[toIndex][1]));
                num2 = (Double.parseDouble(CAD[toIndex][1]));
                }
                break;
            case "SGD":
                if ("Singapore Dollar".equals(to)){
                    num1 = amount;
                    num2 = 0;
                }
                else{//find index for selected toCountry
                    for (int c = 0; c < 53; ++c){
                        if (SGD[c][0].equals(to))
                            toIndex = c;
                }
                num1 = amount * (Double.parseDouble(SGD[toIndex][1]));
                num2 = (Double.parseDouble(SGD[toIndex][1]));
                }
                break;
            case "JPY":
                if ("Japanese Yen".equals(to)){
                    num1 = amount;
                    num2 = 0;
                }
                else{//find index for selected toCountry
                    for (int c = 0; c < 53; ++c){
                        if (JPY[c][0].equals(to))
                            toIndex = c;
                }
                num1 = amount * (Double.parseDouble(JPY[toIndex][1]));
                num2 = (Double.parseDouble(JPY[toIndex][1]));
                }
                break;
            case "CNY":
                if ("Chinese Yuan Renminbi".equals(to)){
                    num1 = amount;
                    num2 = 0;
                }
                else{//find index for selected toCountry
                    for (int c = 0; c < 53; ++c){
                        if (CNY[c][0].equals(to))
                            toIndex = c;
                }
                num1 = amount * (Double.parseDouble(CNY[toIndex][1]));
                num2 = (Double.parseDouble(CNY[toIndex][1]));
                }
                break;
            case "ZAR":
                if ("South African Rand".equals(to)){
                    num1 = amount;
                    num2 = 0;
                }
                else{//find index for selected toCountry
                    for (int c = 0; c < 53; ++c){
                        if (ZAR[c][0].equals(to))
                            toIndex = c;
                }
                num1 = amount * (Double.parseDouble(ZAR[toIndex][1]));
                num2 = (Double.parseDouble(ZAR[toIndex][1]));
                }
                break;
            case "BRL":
                if ("Brazilian Real".equals(to)){
                    num1 = amount;
                    num2 = 0;
                }
                else{//find index for selected toCountry
                    for (int c = 0; c < 53; ++c){
                        if (BRL[c][0].equals(to))
                            toIndex = c;
                }
                num1 = amount * (Double.parseDouble(BRL[toIndex][1]));
                num2 = (Double.parseDouble(BRL[toIndex][1]));
                }
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
}
