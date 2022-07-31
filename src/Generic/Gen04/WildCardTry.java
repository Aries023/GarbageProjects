package Generic.Gen04;

import java.util.List;

public class WildCardTry {

    /**
     * (Wild Cards (?) maju svoje obmedzenia)
     * tu si ich precvicim
     */

    // tato metoda scita vsetky cisla v liste ktory dostane a vrati ich s citane
    // !!!! mozem vyberat data.. ale nemozem ich vkladat !!!!
    public static double upperBounded (List<? extends Number> arg){   // Number je rodic vsetkych cisiel
        double d = 0.0;

        for (Number element : arg){
            d += element.doubleValue();
        }
        return d;
    }
}
