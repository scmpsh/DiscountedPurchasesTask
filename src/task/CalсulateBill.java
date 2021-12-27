package task;

import java.util.ArrayList;

public class CalсulateBill {

    public static int calculateBill(ArrayList<String> arrayBill, ArrayList<String> arrayPromo) {
        String tmpString;
        int billSum = 0;
        int bestPromo = 0;

        for (String bill : arrayBill) {
            for (String promo : arrayPromo) {
                tmpString = promo;
                if (bill.split(" ")[0].equals(promo.split(" ")[1])) {
                    for (String promo1 : arrayPromo) {
                        if (tmpString.split(" ")[1].equals(promo1.split(" ")[1])) {
                            bestPromo = Math.max(bestPromo, (Math.max(Integer.parseInt(tmpString.split(" ")[2]),
                                    Integer.parseInt(promo1.split(" ")[2]))));
                            break;
                        }
                    }
                } else {
                    try {
                        bestPromo = Math.max(bestPromo, Integer.parseInt(promo.split(" ")[1]));
                    } catch (NumberFormatException e) {

                    }
                }
            }
            billSum += Integer.parseInt(bill.split(" ")[1])
                    - (Integer.parseInt(bill.split(" ")[1]) * bestPromo / 100);
        }
        return billSum;
    }
}
