public class Main {
    public static void main(String[] args) {

        RodinnyDom domNovakov = new RodinnyDom();
        domNovakov.pocetPoschodi = 4;
        domNovakov.rozloha = 457f;
        domNovakov.material = "mramor";
        domNovakov.vypocetCenyDomu(300, "Novakovi");



        RodinnyDom domZajacov = new RodinnyDom();
        domZajacov.rozloha = 646f;
        domZajacov.material ="beton";
        domZajacov.pocetPoschodi = 3;
        domZajacov.vypocetCenyDomu(250, "Zajacovi");










    }
}