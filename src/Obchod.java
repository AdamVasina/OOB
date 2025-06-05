public class Obchod extends Stavba {

    private int pocetPokladni;

    Obchod(float rozloha,int pocetPoschodi,int pocetPokladni){
        this.rozloha = rozloha;
        this.pocetPoschodi = pocetPoschodi;
        this.pocetPokladni = pocetPokladni;
    }

    public float vypocetCennyObchodu(){
        float cena = (rozloha * pocetPoschodi * 500) + 5000 * pocetPokladni;
        System.out.println("Cena Obchodu: " + cena);
        return cena;
    }

}
