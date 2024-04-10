package COLLECTION_FRAMEWORK.Top30InterviewPrograms.Comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {

        return Integer.compare(s1.getAge(), s2.getAge());  //Ascending Order
//        return (s1.getAge()==s2.getAge())?0:((s1.getAge()>s2.getAge())?1:-1);


//        return Integer.compare(s2.getAge(), s1.getAge()); //Descending Order
//        return (s1.getAge()==s2.getAge())?0:((s1.getAge()<s2.getAge())?1:-1);

//        if(s1.getAge()==s2.getAge()) {
//            return 0;
//        } else if(s1.getAge()<s2.getAge()) {
//            return 1;
//        }
//        return -1;
    }
}
