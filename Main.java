package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher lizzy=new Teacher(1,"Lizzy",500);
        Teacher mellisa =new Teacher(2,"Mellisa",700);
        Teacher vanderhorn =new Teacher(3,"Vanderhorn",600);

        List<Teacher> teacherList=new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(mellisa);
        teacherList.add(vanderhorn);

        Student tamasha =new Student(1,"Tamasha",4);
        Student rakshit =new Student(2,"Rakshit",12);
        Student rabbi =new Student(3,"Rabbi",5);

        List<Student> studentList=new ArrayList<>();
        studentList.add(tamasha);
        studentList.add(rabbi);
        studentList.add(rakshit);

        School ghs=new School(teacherList,studentList);
        Teacher megan =new Teacher(2,"Megan",900);
        ghs.addTeachers(megan);

        tamasha.payFees(5000);
        rakshit.payFees(6000);
        System.out.println("GHS has earned $ " + ghs.getTotalMoneyEarned());


        System.out.println("making GHS pay salary");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("GHS has spent for salary to " + lizzy.getName()+ " and now has "+ ghs.getTotalMoneyEarned());

        vanderhorn.receiveSalary(vanderhorn.getSalary());

        System.out.println("GHS has spent for salary to " + vanderhorn.getName()+ " and now has "+ ghs.getTotalMoneyEarned());
        System.out.println(rakshit);

    }
}
