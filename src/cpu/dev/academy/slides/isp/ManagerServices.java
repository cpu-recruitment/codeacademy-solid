package cpu.dev.academy.slides.isp;

public class ManagerServices implements HumanResources {
    @Override
    public void requestHoliday() {
        System.out.println("I want my HOL");
    }

    @Override
    public void fireEmployee() {
        System.out.println("Here's your P45");
    }

    @Override
    public void hireEmployee() {
        System.out.println("Congrats for your new job");
    }
}
