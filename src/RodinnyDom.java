public class RodinnyDom extends Stavba {

    private String material;

    private int pocetOkien;


    RodinnyDom(int pocetPoschodi, String material, float rozloha){
        //System.out.println("Teraz sa vola konstruktor");
        this.pocetPoschodi = pocetPoschodi;
        this.material = material;
        this.rozloha = rozloha;
    }

    public float vypocetCenyDomu(int cenaZaMeter,String menoRodiny) {
        float cena = rozloha * cenaZaMeter * pocetPoschodi;
        System.out.println(menoRodiny + " " + (rozloha * 300 * pocetPoschodi));
        return cena;


    }

}
