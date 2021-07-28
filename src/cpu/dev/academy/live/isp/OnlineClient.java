package cpu.dev.academy.live.isp;

public class OnlineClient implements RestaurantInterface {

    @Override
    public void acceptOnlineOrder() {
        System.out.println("Order accepted!");
    }

    @Override
    public void takeTelephoneOrder() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void payOnline() {
        System.out.println("Please pay for your order");
    }

    @Override
    public void walkInCustomerOrder() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void payInPerson() {
        throw new UnsupportedOperationException();
    }
}
