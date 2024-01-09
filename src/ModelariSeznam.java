import java.math.BigDecimal;

public class ModelariSeznam {
   private String jmeno;
   private int vyska;
   private BigDecimal stavUctu;
   private double teplota;
   private boolean jeNaNemocenske;

   public ModelariSeznam(String jmeno, int vyska, double teplota, BigDecimal stavUctu, boolean jeNaNemocenske) {
      this.jmeno = jmeno;
      this.vyska = vyska;
      this.teplota = teplota;
      this.jeNaNemocenske = jeNaNemocenske;
      this.stavUctu = stavUctu;
   }

}
