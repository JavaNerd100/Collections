package CollectionsFrameWork.Lists.ListsSortingDemo;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class  AscendingOrderComparator implements Comparator<Students> {

    @Override
    public int compare(Students o1, Students o2) {
        return Integer.compare(o1.getId(),o2.getId());
    }
}

class  DescendingOrderComparator implements Comparator<Students> {

    @Override
    public int compare(Students o1, Students o2) {
        return Integer.compare(o2.getId(),o1.getId());
    }
}

public class StudentsCollection {

    public static void main(String[] args) {
       List<Students> studentsList = List.of(new Students(10,"Alex"),
                                            new Students(2,"Shaun") ,
                                            new Students(33,"Erwin"),
                                             new Students(14,"Eren"),
                                                new Students(5,"Bob"));

      ArrayList<Students> studentsAl = new ArrayList<>(studentsList);

        System.out.println(studentsList);
        studentsAl.sort( new AscendingOrderComparator());
        System.out.println("ascending order  --> "   + studentsAl);
        studentsAl.sort(new DescendingOrderComparator());
        System.out.println("descending order --> " + studentsAl);

    }
}
