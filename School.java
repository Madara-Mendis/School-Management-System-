package school.management.system;

import java.util.List;

/**
 * many teachers,many students
 * Implements teachers and students using an ArrayList
 */
public class School {
    private List<Teacher> teachers;
    // teacher1,teacher2,.......school is going to contain multiple teachers
    //private Teacher[] teacher=new Teacher[5] //array of teachers? what if we don't know thw count?
    //array-multiple numbers=defined
    //ArrayList-allows a new location to be allocated for a new one automatically
    //eg: List<Integer> numbers=new ArrayList<>{};   numbers.add(1) only "Integer" s in array list
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     * new school object is created
     * @param teachers list of teachers in the school
     * @param students List of students in the school
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned=0;
        totalMoneySpent=0;
    }

    /**
     *
     * @return the list of teachers in the school
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    public List<Student> getStudents() {
        return students;
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * adds a teacher to the school
     * @param teacher the teacher to be added
     */
    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     * adds a student to the school
     * @param student the student to be added
     */
    public void addStudents(Student student) {
        students.add(student);
    }

    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned +=MoneyEarned;
    }

    /**
     * update the money that is spent by the school which is the salary given by the school to its  teachers
     * @param MoneySpent
     */
    public static void updateTotalMoneySpent(int MoneySpent) {
        totalMoneyEarned-=MoneySpent;
    }
}
