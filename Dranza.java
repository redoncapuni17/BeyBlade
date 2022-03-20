package OOP2.BeyBlade;

public class Dranza extends Beyblade {
    private String kutsalCanavar;

    public Dranza(String beyblade,int donusHızı,int saldırıGucu,String kutsalCanavar){
        super(beyblade,saldırıGucu,donusHızı);
        this.kutsalCanavar = kutsalCanavar;
    }
    public void bilgilerigoster(){
        super.bilgileriGoster();

        System.out.println("Kutsal Canaavr Name : "+kutsalCanavar);
    }
    public void kutsalCanavarOrtayaCıkar(){
        System.out.println(getBeyblade() + " " +kutsalCanavar+ "'ı is emerging...");
        System.out.println(getBeyblade() + "'ın attack : Flame Sword ");
    }

}
