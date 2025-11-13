package genericprograms;

import java.util.*;

public class ComparableComparatorDemo {
    public static void main(String[] args) {

        Comparator<Students> comp1 = (i, j) -> i.age > j.age? 1 : -1;
        Comparator<Integer> comp2 = (i, j) -> i%10 > j%10? 1 : -1 ;

        List<Students> stds = new ArrayList<>();
        stds.add(new Students(22,"saki"));
        stds.add(new Students(23,"sanjay"));
        stds.add(new Students(21,"giri"));

        Collections.sort(stds, comp1);

        System.out.println(stds);

        List<Teachers> tchrs = new ArrayList<>();
        tchrs.add(new Teachers(40, "sheela"));
        tchrs.add(new Teachers(35, "vikram"));
        tchrs.add(new Teachers(30, "shrikanth"));
        Collections.sort(tchrs);
        System.out.println(tchrs);

        List<Integer> intg = Arrays.asList(15,51,42,33,24);
        Collections.sort(intg, comp2);
        System.out.println(intg);

    }
}

class Students {
     int age;
     String name;

    public Students(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Students{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

class Teachers implements Comparable<Teachers> {
    int age;
    String name;

    public Teachers(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teachers{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Teachers t) {
        if (this.age > t.age) {
            return 1;
        } else
            return -1;
    }
}
