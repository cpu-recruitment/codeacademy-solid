package cpu.dev.academy.slides.ocp;

import cpu.dev.academy.slides.srp.Employee;

import java.math.BigDecimal;

public class Bonus {
    private Employee employee;

    public BigDecimal calculateBonus() {
     return BigDecimal.ZERO;
    }

    protected Employee getEmployee() {
        return this.employee;
    }
}
