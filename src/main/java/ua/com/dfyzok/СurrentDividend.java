package ua.com.dfyzok;

public class ŅurrentDividend {

    public StringBuilder currentDividend;

    public ŅurrentDividend(StringBuilder currentDividend) {
        this.currentDividend = currentDividend;
    }

    public StringBuilder getCurrentDividend() {
        return currentDividend;
    }

    public void setCurrentDividend(StringBuilder currentDividend) {
        this.currentDividend = currentDividend;
    }

    @Override
    public String toString() {
        return "ŅurrentDividend [currentDividend=" + currentDividend + "]";
    }

}
