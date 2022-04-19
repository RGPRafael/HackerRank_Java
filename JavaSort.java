//Java Sort
import java.util.*;

class Student{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}
class OrderStudent implements Comparator<Student>{

    public int compare(Student a, Student b){
        double a_cgpa =  a.getCgpa();
        double b_cgpa =  b.getCgpa();
        String a_name = a.getFname();
        String b_name = b.getFname();
        if( Double.compare(a_cgpa, b_cgpa) == 0){
            if( a_name.compareTo(b_name) == 0){
                return a.getId() - b.getId();
            }
            //else return a_name.compareTo(b_name);
            return a_name.compareTo(b_name);
        }
        else if(Double.compare(a_cgpa, b_cgpa) < 0)return 1;
        return -1;
    }
}
//Complete the code
public class JavaSort {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }
        System.out.println("Unsorted");
        for(Student st: studentList){
            System.out.println(st.getFname());
        }
        System.out.println("sorted");
        Collections.sort(studentList, new OrderStudent());
        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}




