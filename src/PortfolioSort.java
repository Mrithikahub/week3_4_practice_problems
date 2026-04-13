import java.util.*;

class Asset {

    String name;
    double returnRate;

    Asset(String name, double returnRate) {
        this.name = name;
        this.returnRate = returnRate;
    }
}

public class PortfolioSort {

    public static void main(String args[]) {

        ArrayList<Asset> list = new ArrayList<>();

        list.add(new Asset("AAPL", 12));
        list.add(new Asset("TSLA", 8));
        list.add(new Asset("GOOG", 15));

        list.sort((a, b) -> Double.compare(a.returnRate, b.returnRate));

        for (Asset a : list)
            System.out.println(a.name + " " + a.returnRate);
    }
}