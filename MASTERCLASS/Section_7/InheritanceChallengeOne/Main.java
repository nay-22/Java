package MASTERCLASS.Section_7.InheritanceChallengeOne;

public class Main {
    public static void main(String[] args) {
        Employee tim = new Employee("Tim", "11/11/1985", "12/12/2005");
        Employee joe = new Employee("Joe", "17/10/1975", "12/12/1995");
        SalariedEmployee nay = new SalariedEmployee("Nay", "17/10/1975", "12/12/1995", 200d, false);

        System.out.println(tim);
        System.out.println("Age = "+tim.getAge());
        System.out.println("Pay = "+tim.collectPay());

        System.out.println(joe);
        System.out.println("Age = "+joe.getAge());
        System.out.println("Pay = "+joe.collectPay());

        System.out.println(nay);
        System.out.println("Age = "+nay.getAge());
        System.out.println("Pay = "+nay.collectPay());
//        System.out.println("isRetired = "+nay.retire());
        System.out.println(nay.getWorkerName()+ " is "+ (nay.retire()?"retired":"not retired"));
    }
}
