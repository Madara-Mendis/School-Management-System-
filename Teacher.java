package school.management.system;

/**
 * created by madara mendis on 18/08/2024
 * This class keeps the track of teachers datails
 */
public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * Creates a new teacher object
     * @param id id of the teacher
     * @param name name of the teacher
     * @param salary salary of the teacher
     */
    public Teacher(int id ,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.salaryEarned=0;
    }

    /**
     *
     * @return id of the teacher
     */
    public int getId(){
        return id;
    }

    /**
     *
     * @return name of the teacher
     */
    public String getName(){
        return name;
    }

    /**
     *
     * @return salary of the teacher
     */
    public int getSalary() {
        return salary;
    }

    /**
     *
     * @param salary Update the salary
     */
    public void setSalary(int salary){
        this.salary=salary;
    }

    /**
     * adds to the salaryEarned
     * deduct from total money earned by the school
     * @param salary
     */
    public void receiveSalary(int salary){
        salaryEarned+=salary;
        School.updateTotalMoneySpent(salary);
    }
}


