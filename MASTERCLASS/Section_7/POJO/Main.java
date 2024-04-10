package MASTERCLASS.Section_7.POJO;

public class Main {
    public static void main(String[] args) {
        for(int i = 1; i<=5; i++) {
            StuRec stu = new StuRec("20CE111" + i, 
                switch(i) {
                   case 1-> "Mary"; 
                   case 2-> "Carol"; 
                   case 3-> "Nay"; 
                   case 4-> "Harry"; 
                   case 5-> "Lisa"; 
                   default-> "Anonymous"; 
                }, 
                "22/09/2001", 
                "Java Masterclass");
            System.out.println(stu);
        }
        System.out.println();
        Student pojoStu = new Student("20CE1111", "Nay", "22/09/2001", "Java Masterclass");
        StuRec recStu = new StuRec("20CE1112", "Jay", "22/09/2001", "Java Masterclass");
        System.out.println(pojoStu);
        System.out.println(recStu);
    }
}
