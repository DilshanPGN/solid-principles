package encapsulate.what.varies.after;

import encapsulate.what.varies.before.*;

public class SimplePancackeFactory {

    Pancake createPancake(String type) {
        Pancake pancake = new Pancake();

        if (type.equals("classic")) {
            pancake = new ClassicPancake();
        } else if (type.equals("blueBerry")) {
            pancake = new BlueBerryPancake();
        } else if (type.equals("choco")) {
            pancake = new ChocolateChipPancake();
        } else if (type.equals("banana")) {
            pancake = new BananaPancake();
        }

        return pancake;
    }
}
