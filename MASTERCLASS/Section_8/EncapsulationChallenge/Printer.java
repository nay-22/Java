package MASTERCLASS.Section_8.EncapsulationChallenge;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel>=0 && tonerLevel<=100)?tonerLevel:-1;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        tonerLevel += tonerAmount;
        if(tonerLevel>100 || tonerLevel<0) {
            return -1;
        }
        tonerLevel -= tonerAmount;
        return tonerLevel;
    }

    public void printPages(int pagesToBePrinted) {
        if(duplex) {
            System.out.println("(Duplex) No of Pages = "+(pagesToBePrinted/2 + pagesToBePrinted%2));
            pagesPrinted += pagesToBePrinted/2;
        }
        else {
            System.out.println("(Not Duplex) No of Pages = "+pagesToBePrinted);
            pagesPrinted += pagesToBePrinted;
        }
    }
}
