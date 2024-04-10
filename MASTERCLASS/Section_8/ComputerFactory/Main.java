package MASTERCLASS.Section_8.ComputerFactory;

public class Main {
    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("2208","Dell","240");
        Monitor theMonitor = new Monitor("27inch Beast","Acer",27,
                "2540 x 1440");
        Motherboard theMotherBoard = new Motherboard("BJ-200","Asus",4,
                6,"v2.44");
        PersonalComputer pc = new PersonalComputer("2208", "Dell",
                theMonitor,theMotherBoard,theCase);

//        pc.getMonitor().drawPixelAt(10,10,"red");
//        pc.getMotherboard().loadProgram("Windows Os");
//        pc.getComputerCase().pressPowerButton();
        pc.powerUp();
    }
}
