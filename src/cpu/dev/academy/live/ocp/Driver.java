package cpu.dev.academy.live.ocp;

public class Driver {

    public static void main(String[] args) {
        var iceCream = new IceCream("Vanilla");

        if (iceCream.getFlavour() == null) throw new IllegalArgumentException("pesky bug!");
        iceCream.printLabel();

        // create a new ice cream with a topping
    }
}
