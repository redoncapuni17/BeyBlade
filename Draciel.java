package OOP2.BeyBlade;

public class Draciel extends Beyblade{
    private String kutsalCanavar;

    public Draciel(String beyblade, int donusHızı, int saldırıGucu, String kutsalCanavar) {
        super(beyblade, donusHızı, saldırıGucu);
        this.kutsalCanavar = kutsalCanavar;
    }


    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal Canaavr Name : "+kutsalCanavar);
    }

    public void kutsalCanavarOrtayaCıkar() {
        super.kutsalCanavarOrtayaCıkar();
        System.out.println(getBeyblade() + " " +kutsalCanavar+ "'ı is emerging...");
        System.out.println(getBeyblade() + "'ın defense : Castle Defense ");
    }


}
