package currency.exchange;


public class Error extends Throwable {

    String ExepError;

    public Error(String myExp) {
        this.ExepError = myExp;
    }

    @Override
    public String toString() {
        return  ExepError;
    }

}