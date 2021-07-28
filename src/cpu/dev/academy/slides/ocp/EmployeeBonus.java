package cpu.dev.academy.slides.ocp;

import java.math.BigDecimal;

public class EmployeeBonus extends Bonus {

    @Override
    public BigDecimal calculateBonus() {
        return super.getEmployee()
                .getSalary().multiply(new BigDecimal("0.5"));
    }
}
