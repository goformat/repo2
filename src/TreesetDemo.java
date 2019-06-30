import java.util.Comparator;
import java.util.TreeSet;

public class TreesetDemo {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();
        treeSet.add(new Student("王哈",108));
        treeSet.add(new Student("王帅",18));
        treeSet.add(new Student("刘能",29));
        treeSet.add(new Student("王帅",29));
        treeSet.add(new Student("lisi",20));
        treeSet.add(new Student("aisi",20));

        for (Student student : treeSet) {
            System.out.println(student);
        }
        System.out.println("艾斯".hashCode());
        System.out.println("刘斯".hashCode());
        System.out.println("刘能".hashCode());
        System.out.println("王帅".hashCode());
        System.out.println("w".hashCode());
        System.out.println("l".hashCode());

        //System.out.println(treeSet);

        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
               int num= o1.getAge()-o2.getAge();//这是按照年龄从小到大的顺序来进行
                int num1=num==0?o1.getName().compareTo(o2.getName()):num;
                return num1;
            }
        });
    }
}
