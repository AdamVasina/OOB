import java.lang.classfile.constantpool.FloatEntry;
import java.util.Random;
import java.util.RandomAccess;

public class Main {
    public static void main(String[] args) {

        //Random nahCislo = new Random()


        RodinnyDom domNovakov = new RodinnyDom();
        domNovakov.pocetPoschodi = 4;
        domNovakov.rozloha = 457f;
        domNovakov.material = "mramor";
        float cenaPrvehoDomu= domNovakov.vypocetCenyDomu(300, "Novakovi");



        RodinnyDom domZajacov = new RodinnyDom();
        domZajacov.rozloha = 646f;
        domZajacov.material ="beton";
        domZajacov.pocetPoschodi = 3;
        float cenaDruhehoDomu= domNovakov.vypocetCenyDomu(250, "Zajacovi");

        System.out.println(cenaPrvehoDomu + cenaDruhehoDomu);











    }
}