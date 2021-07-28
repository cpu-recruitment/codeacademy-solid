package cpu.dev.academy.exercises.task2.model;

public class Phone {
    private String number;

    public Phone(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void sendNotification(String message) {
        System.out.println(message);
    }
}
