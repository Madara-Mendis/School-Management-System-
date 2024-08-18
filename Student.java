package school.management.system;

/**
 * Created by Madara Mendis on 18/08/2024
 * this class is responsible for keep track of the students' id,name,grade and fees paid
 */
public class Student {
    //fields
    private int id; //protect from someone accessing student class from outside
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * To create a new student object by initializing.
     * Fees for every student is $30,000
     * Fees paid initially is 0.
     * @param grade grade of the student
     * @param id id for the student : unique
     * @param name name of the student
     */

    public Student(int id,String name,int grade){
        this.feesPaid=0;
        this.feesTotal=30000;
        this.id=id;//id from the student class is equal to the id of the argument
        this.name=name;
        this.grade=grade;

    }

    /**
     *
     * @return id of the student
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return name of the student
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return grade of the student
     */
    public int getGrade() {
        return grade;
    }

    /**
     *
     * @return fees paid by the student
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     *
     * @return total fees that a student has to pay
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    //Not going to alter students id,name.

    /**
     * Used to update the student's grade
     * @param grade grade is the new grade of the student
     */

    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * Add the fees to the fees paid
     * The school is going to receive the funds
     * @param fees the fees that the student pays
     */
    public void payFees(int fees) {
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    public int getRemainFees(){
        return feesTotal-feesPaid;

    }

    @Override
    public String toString() {
        return "Student's name : " + name + '\n' +
                "Total fees paid so far $ "+feesPaid;
    }
}
