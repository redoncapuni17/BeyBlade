package OOP2.BeyBlade;

public class Dragon extends Beyblade{
    private String kutsalCanavar;
    private String gizliYetenek;

    public Dragon(String beyblade, int donusHızı, int saldırıGucu, String kutsalCanavar,String gizliYetenek) {
        super(beyblade, donusHızı, saldırıGucu);
        this.kutsalCanavar = kutsalCanavar;
        this.gizliYetenek = gizliYetenek;
    }


    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal Canaavr Name : "+kutsalCanavar);
        System.out.println("Hidden Talent : "+gizliYetenek);
    }

    public void kutsalCanavarOrtayaCıkar() {
        super.kutsalCanavarOrtayaCıkar();
        System.out.println(getBeyblade() + " " +kutsalCanavar+ "'ı is emerging...");
        System.out.println(getBeyblade() + "'ın attack : Dream Hurricane ");
    }


}
