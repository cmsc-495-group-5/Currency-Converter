package currency.exchange;



import com.jaunt.JauntException;
import com.jaunt.UserAgent;
import com.jaunt.component.Table;


public class DatabaseFetch extends Converter {

    private String country = "";
    //load data from remote source

    public int remoteFatch() {
        int t = 0;
        for (String from1 : countryfrom) {
            if (!"Select Country".equalsIgnoreCase(from1)) {
                i = 0;
                j = 0;
                k = 0;
                country = from1;
                try {
                    UserAgent userAgent = new UserAgent();
                    userAgent.visit("https://www.x-rates.com/table/?from=" + country + "&amount=1");
                    com.jaunt.Element elements = userAgent.doc.findFirst("<span class=\"ratesTimestamp\">");//find every element who's tagname is div or span.
                    timeUpadte = elements.getChildText(); //set time when database updated results
                    com.jaunt.Element tableElement = userAgent.doc.findFirst("<table class=\"tablesorter ratesTable\">");   //find table Element
                    Table table = new Table((com.jaunt.Element) tableElement);                   //create Table component

                    java.util.List<String> names = table.getTextFromColumn(0);
                    java.util.List<String> numbers = table.getTextFromColumn(1);
                    java.util.List<String> sales = table.getTextFromColumn(2);//get text from first column
                    if (names.size() == numbers.size() && names.size() == sales.size()) {
                        if (null != country) {
                            switch (country) {
                                case "USD":
                                    USD = new String[names.size() - 1][3];

                                    names.subList(1, names.size()).forEach((String text) -> {
                                        USD[i][0] = text;
                                        i++;
                                    });
                                    numbers.subList(1, numbers.size()).forEach((text1) -> {
                                        USD[j][1] = text1;
                                        j++;
                                    });
                                    sales.subList(1, sales.size()).forEach((text2) -> {
                                        USD[k][2] = text2;
                                        k++;
                                    });
                                    break;
                                case "EUR":
                                    EUR = new String[names.size() - 1][3];

                                    names.subList(1, names.size()).forEach((String text) -> {
                                        EUR[i][0] = text;
                                        i++;
                                    });
                                    numbers.subList(1, numbers.size()).forEach((text1) -> {
                                        EUR[j][1] = text1;
                                        j++;
                                    });
                                    sales.subList(1, sales.size()).forEach((text2) -> {
                                        EUR[k][2] = text2;
                                        k++;
                                    });
                                    break;
                                case "GBP":
                                    GBP = new String[names.size() - 1][3];

                                    names.subList(1, names.size()).forEach((String text) -> {
                                        GBP[i][0] = text;
                                        i++;
                                    });
                                    numbers.subList(1, numbers.size()).forEach((text1) -> {
                                        GBP[j][1] = text1;
                                        j++;
                                    });
                                    sales.subList(1, sales.size()).forEach((text2) -> {
                                        GBP[k][2] = text2;
                                        k++;
                                    });
                                    break;
                                case "INR":
                                    INR = new String[names.size() - 1][3];

                                    names.subList(1, names.size()).forEach((String text) -> {
                                        INR[i][0] = text;
                                        i++;
                                    });
                                    numbers.subList(1, numbers.size()).forEach((text1) -> {
                                        INR[j][1] = text1;
                                        j++;
                                    });
                                    sales.subList(1, sales.size()).forEach((text2) -> {
                                        INR[k][2] = text2;
                                        k++;
                                    });
                                    break;
                                case "AUD":
                                    AUD = new String[names.size() - 1][3];

                                    names.subList(1, names.size()).forEach((String text) -> {
                                        AUD[i][0] = text;
                                        i++;
                                    });
                                    numbers.subList(1, numbers.size()).forEach((text1) -> {
                                        AUD[j][1] = text1;
                                        j++;
                                    });
                                    sales.subList(1, sales.size()).forEach((text2) -> {
                                        AUD[k][2] = text2;
                                        k++;
                                    });
                                    break;
                                case "CAD":
                                    CAD = new String[names.size() - 1][3];

                                    names.subList(1, names.size()).forEach((String text) -> {
                                        CAD[i][0] = text;
                                        i++;
                                    });
                                    numbers.subList(1, numbers.size()).forEach((text1) -> {
                                        CAD[j][1] = text1;
                                        j++;
                                    });
                                    sales.subList(1, sales.size()).forEach((text2) -> {
                                        CAD[k][2] = text2;
                                        k++;
                                    });
                                    break;
                                case "SGD":
                                    SGD = new String[names.size() - 1][3];

                                    names.subList(1, names.size()).forEach((String text) -> {
                                        SGD[i][0] = text;
                                        i++;
                                    });
                                    numbers.subList(1, numbers.size()).forEach((text1) -> {
                                        SGD[j][1] = text1;
                                        j++;
                                    });
                                    sales.subList(1, sales.size()).forEach((text2) -> {
                                        SGD[k][2] = text2;
                                        k++;
                                    });
                                    break;
                                default:
                                    break;

                            }
                        }
                    }
                    t = 0;

                } catch (JauntException e) {

                    if (testconnection == 0) {
                        statusLabel.setText("<html><center><span style=\"color:Red;\">Connection Error: No Internet Connection<br>Unable To Connect To Database</span></center><html>");                        
                    } else {
                        statusLabel.setText("<html><center><span style=\"color:Red;\">Connection Error: Unable to Update Rates<br> Previous Rates Used</span></center><html>");
                    }
                    t = 1;
                    previousStatus = 1;
                }
            }
        }
        return t;

    }
}
