package task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        String tmpLine;
        ArrayList<String> arrayBill = new ArrayList<>();
        ArrayList<String> arrayPromo = new ArrayList<>();

        while (!(line = reader.readLine()).equals("СЧЕТ")) {
            Scanner scanner = new Scanner(line);
            tmpLine = scanner.nextLine();
            if (tmpLine.contains("ПРОМО")) {
                arrayPromo.add(tmpLine);
            } else {
                arrayBill.add(tmpLine);
            }
        }
        System.out.println(arrayBill);
        System.out.println(arrayPromo);
        System.out.println(CalсulateBill.calculateBill(arrayBill, arrayPromo));
    }
}
