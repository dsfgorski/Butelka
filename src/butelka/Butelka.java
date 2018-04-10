package butelka;

public class Butelka {
    private double ileLitrow;
    private double pojemnosc;

    Butelka(double ileLitrow, double pojemnosc)
    {
        if(ileLitrow <= pojemnosc){
                this.ileLitrow = ileLitrow;
                this.pojemnosc = pojemnosc;
        }
        else
            System.out.println("Za mała pojemność butelki");
    }
    
    double getIleLitrow()
    {
        return ileLitrow;
    }
    boolean wlej(double ilosc)
    {
        if(this.pojemnosc >= this.getIleLitrow() + ilosc){
            this.ileLitrow += ilosc;
            return true;
        }
        else{
            System.out.println("Za mały pojemnik");
            return false;
        }
                }
    boolean wylej(double ilosc)
    {
        if (ilosc < ileLitrow)
            this.ileLitrow -= ilosc;
        else
            return false;
        
        return true;
    }
    
    void przelej(double ilosc, Butelka gdziePrzelac)
    {
        if (this.getIleLitrow() >= ilosc && gdziePrzelac.wlej(ilosc))
        {
            this.wylej(ilosc);
        }
        else
            System.out.println("Za mało");
    }
    
  
    public static void main(String[] args) {
        Butelka[] butelka = new Butelka[3]; //NULL
        
        butelka[0] = new Butelka(5,5);
        butelka[1] = new Butelka(8,10);
        butelka[2] = new Butelka(10,100);
        
        butelka[0].wlej(4);
        
        butelka[0].przelej(25, butelka[1]);
        
        System.out.println(butelka[0].getIleLitrow());
        System.out.println(butelka[1].getIleLitrow());
        System.out.println(butelka[2].getIleLitrow());
        
    }
    
}
