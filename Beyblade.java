package OOP2.BeyBlade;

public class Beyblade {
    private String beyblade;
    private int donusHızı;
    private int saldırıGucu;

    public Beyblade(String beyblade, int donusHızı, int saldırıGucu){
        this.beyblade = beyblade;
        this.donusHızı = donusHızı;
        this.saldırıGucu = saldırıGucu;
    }
    public void setBeyblade(String beyblade){
        this.beyblade = beyblade;
    }
    public String getBeyblade(){
        return beyblade;
    }
    public void setDonusHızı(int saldırıGucu){
        this.saldırıGucu = saldırıGucu;
    }
    public int getDonusHızı(){
        return saldırıGucu;
    }
    public void setSaldırıGucu(int saldırıGucu){
        this.saldırıGucu = saldırıGucu;
    }
    public int getSaldırıGucu(){
        return saldırıGucu;
    }
    public void saldır(){
        System.out.println(getBeyblade() +" " +saldırıGucu + " and "+donusHızı+ " attacking with...");
    }
    public void kutsalCanavarOrtayaCıkar(){
        System.out.println("Bu beyblade'in doesn't found in Kutsal Canavar...");
    }
    public void bilgileriGoster(){
        System.out.println("Beyblade Name : "+beyblade);
        System.out.println("Attack Power : "+saldırıGucu);
        System.out.println("Rotation Speed : "+donusHızı)   ;
    }
}
