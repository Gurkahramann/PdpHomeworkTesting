/** (1)
 *  (2)Bu sınıf, bir dikdörtgenin alanını ve çevresini hesaplamak için kullanılır.
 (3)*/ 
public class Dikdortgen {
    private int uzunluk;
    private int genislik;
    
    /**(4)
     * Dikdörtgenin alanını hesaplar.(5)
     * @return Dikdörtgenin alanı(6)
     (7)*/
    public int alanHesapla() {
        return uzunluk * genislik;
    }
    
    /**(8)
     * Dikdörtgenin çevresini hesaplar.(9)
     * @return Dikdörtgenin çevresi(10)
     (11)*/
    public int cevreHesapla() {
        return 2 * (uzunluk + genislik);
    }

    //bosluk olursa ? 

    /**(12)
     *  (13)
         yorum satiri(14)
        assagisi 2 satir bosluk    (15)


     (18)*/

}
