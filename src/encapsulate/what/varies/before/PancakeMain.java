package encapsulate.what.varies.before;

public class PancakeMain {
    public static Pancake orderPancake(String type) {
        Pancake pancake;

        /* following code varies with menu change */
        if (type.equals("classic")) {
            pancake = new ClassicPancake();
        } else if (type.equals("blueBerry")) {
            pancake = new BlueBerryPancake();
        } else if (type.equals("choco")) {
            pancake = new ChocolateChipPancake();
        } else if (type.equals("banana")) {
            pancake = new BananaPancake();
        } else {
            pancake = new Pancake();
        }
        /* Variation end */

        pancake.cook();
        pancake.plate();
        pancake.addButter();

        return pancake;
    }
}
