package cpu.dev.academy.exercises.task2.repository;

import cpu.dev.academy.exercises.task2.model.Customer;
import cpu.dev.academy.exercises.task2.model.Logger;

public class CustomerRepository {
    private final Logger logger;

    public CustomerRepository(Logger logger) {
        this.logger = logger;
    }

    public Customer getCustomer() {
        // mocking database connection
        return new Customer("Philip", "email");
    }

    public void saveCustomer(Customer customer) {
        System.out.println("Saved in database: " + customer.toString());
    }

    public void sendNotification(Customer customer) {
        switch (customer.getContact()) {
            case "email":
                logger.log("Send email");
                break;
            case "phone":
                logger.log("Calling mobile phone");
                break;
            default:
                logger.log("Impossible to reach out " + customer.getName());
        }
    }

}
