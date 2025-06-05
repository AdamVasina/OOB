import java.lang.classfile.constantpool.FloatEntry;
import java.util.Random;
import java.util.RandomAccess;

public class Main {
    public static void main(String[] args) {

        //Random nahCislo = new Random()


        RodinnyDom domNovakov = new RodinnyDom(4, "mramor", 457);
        float cenaPrvehoDomu= domNovakov.vypocetCenyDomu(300, "Novakovi");


        RodinnyDom domZajacov = new RodinnyDom(3, "beton", 646);
        float cenaDruhehoDomu= domNovakov.vypocetCenyDomu(250, "Zajacovi");

        System.out.println(cenaPrvehoDomu + cenaDruhehoDomu);


    }
}