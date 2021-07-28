package cpu.dev.academy.exercises.task2.model;

public class Email {
    private String address;

    public Email(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void sendNotification(String message) {
        System.out.println(message);
    }
}
