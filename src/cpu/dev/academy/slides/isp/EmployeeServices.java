package cpu.dev.academy.slides.isp;

public class EmployeeServices implements HumanResources {
    @Override
    public void requestHoliday() {
        System.out.println("request HOL from X to Y");
    }

    @Override
    public void fireEmployee() {
        throw new UnsupportedOperationException("operation not allowed");
    }

    @Override
    public void hireEmployee() {
        throw new UnsupportedOperationException("operation not allowed");
    }
}
