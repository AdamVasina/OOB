public class RodinnyDom {
    int pocetPoschodi;
    String material;
    float rozloha;
    int pocetOkien;

    public void vypocetCenyDomu(int cenaZaMeter,String menoRodiny){
        float cena = rozloha * cenaZaMeter * pocetPoschodi;
        System.out.println(menoRodiny + " " + (rozloha * 300 * pocetPoschodi));

    }





}
