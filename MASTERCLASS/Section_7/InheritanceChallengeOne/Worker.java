package MASTERCLASS.Section_7.InheritanceChallengeOne;

public class Worker {
    private String name;
    private String birthDate;
    private String endDate;

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
    public Worker() {

    }
    public String getWorkerName() {
        return this.name;
    }

    public int getAge() {
        int currYear = 2022;
        int birthYear = Integer.parseInt(birthDate.substring(6));
        return(currYear-birthYear);
    }

    public double collectPay() {
        return 0d;
    }

    public void terminate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
