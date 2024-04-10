package COLLECTION_FRAMEWORK.Top30InterviewPrograms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public record Ex19SortArrayListDescending(String carName) {
    public String getCarName() {
        return this.carName;
    }
    @Override
    public String toString() {
        return "Ex19SortArrayListDescending{" +
                "carName='" + carName + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<Ex19SortArrayListDescending> list = new ArrayList<>();

        list.add(new Ex19SortArrayListDescending("Bugatti"));
        list.add(new Ex19SortArrayListDescending("Zenvo"));
        list.add(new Ex19SortArrayListDescending("Cadillac"));
        list.add(new Ex19SortArrayListDescending("Ferrari"));
        list.add(new Ex19SortArrayListDescending("Lamborghini"));
        list.add(new Ex19SortArrayListDescending("BMW"));
        list.add(new Ex19SortArrayListDescending("Volvo"));

        System.out.println("Before Sorting");
        System.out.println(list);

        list.sort(new carNameComparator());

        System.out.println("After Sorting (Descending)");
        System.out.println(list);

    }
}

class carNameComparator implements Comparator<Ex19SortArrayListDescending> {
    @Override
    public int compare(Ex19SortArrayListDescending car1, Ex19SortArrayListDescending car2) {
        return car2.getCarName().compareTo(car1.getCarName());
    }
}
