package cpu.dev.academy.slides.isp;

public class NewEmployeeServices implements EmployeeOps {
    @Override
    public void requestHoliday() {
        System.out.println("request HOL from X to Y");
    }
}
