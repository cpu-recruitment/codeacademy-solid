package cpu.dev.academy.live.ocp;

public class IceCream {
    private String flavour;

    public String getFlavour() {
        return null;
    }

    public IceCream(String flavour) {
        this.flavour = flavour;
    }

    public void printLabel() {
        System.out.println("Ice cream flavour: " + this.getFlavour());
    }
}
