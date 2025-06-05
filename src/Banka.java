public class Banka {
    private int roky;
    private float pociatocnyVklad;
    private float urok;
    private float poplatky;
    private float konecnaCiastka;


    public Banka(int roky, float pociatocnyVklad, float urok, float poplatky) {
        this.roky = roky;
        this.pociatocnyVklad = pociatocnyVklad;
        this.urok = urok;
        this.poplatky = poplatky;

    }

    public float vypocetSporiacehoUctu(){
        konecnaCiastka = pociatocnyVklad;


        for (int i = 0; i < roky; i++){
            konecnaCiastka += konecnaCiastka * (urok/100) - poplatky;
        }
        return konecnaCiastka;
    }





}
