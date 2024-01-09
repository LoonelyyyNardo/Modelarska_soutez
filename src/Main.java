import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("data.txt")));)
        {
            String line;
            while (scanner.hasNextLine()) {
                String radek = scanner.nextLine();
                System.out.println(radek);
                line = scanner.nextLine();
                String[] bloky = line.split(";");
                String jmeno = bloky[0];
                int vyska = Integer.parseInt(bloky[1]);
                double teplota = Double.parseDouble(bloky[2]);
                BigDecimal stavUctu = new BigDecimal(bloky[3]);
                boolean jeNaNemocenske = bloky[4].equals("ano");
                ModelariSeznam.add(new ModelariSeznam(jmeno, vyska, teplota, stavUctu, jeNaNemocenske));
            }
        } catch (FileNotFoundException e) {
            System.err.println("soubor"+FILENAME+"se nepodařilo nalázt"+e.getLocalizedMessage();
        }
    }
}
