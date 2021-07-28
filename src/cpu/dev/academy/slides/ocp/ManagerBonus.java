package cpu.dev.academy.slides.ocp;

import java.math.BigDecimal;

public class ManagerBonus extends Bonus {

    @Override
    public BigDecimal calculateBonus() {
        return super.getEmployee()
                .getSalary().multiply(BigDecimal.TEN);
    }
}
