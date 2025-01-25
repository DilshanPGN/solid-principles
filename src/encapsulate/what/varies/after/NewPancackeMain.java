package encapsulate.what.varies.after;

import encapsulate.what.varies.before.*;

public class NewPancackeMain {

    public static Pancake orderPancake(String type) {
        Pancake pancake = new SimplePancackeFactory().createPancake(type);
        pancake.cook();
        pancake.plate();
        pancake.addButter();

        return pancake;
    }

    public static void main(String[] args) {
        orderPancake("choco");
    }
}
