public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public int compareTo(Student o) {
//        return 0;这里假如是0的话则表示两次的元素是重复的,则最后会输出一个元素
//        return 1;这里是按元素的存储顺序进行排序的,返回的是1的话,怎会判断后面的元素比前面的元素大,则会直接存储

//        return -1; 这里的话是直接按照降序来进行排序

        int num =this.age-o.age;
        int num2= num==0?this.name.compareTo(o.name):num;
        return num2;
    }
}
