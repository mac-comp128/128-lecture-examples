package LectureExamples;

public class Student {
    /* Private instance variables */
    private String studentName;   /* The student's name           */
    private int studentID;        /* The student's ID number      */
    private double creditsEarned; /* The number of credits earned */
    private boolean paidUp;       /* Whether student is paid up   */

	/* Public constants */

    /** The number of credits required for graduation */
    public static final double CREDITS_TO_GRADUATE = 128.0;

    /**
     * Creates a new Student object with the specified name and ID.
     * @param name The student's name as a String
     * @param id The student's ID number as an int
     */
    public Student(String name, int id) {
        studentName = name;
        studentID = id;
    }

    /**
     * Gets the name of this student.
     * @return The name of this student
     */
    public String getName() {
        return studentName;
    }

    /**
     * Gets the ID number of this student.
     * @return The ID number of this student
     */
    public int getID() {
        return studentID;
    }

    /**
     * Sets the number of credits earned.
     * @param credits The new number of credits earned
     */
    public void setCredits(double credits) {
        creditsEarned = credits;
    }

    /**
     * Gets the number of credits earned.
     * @return The number of credits this student has earned
     */
    public double getCredits() {
        return creditsEarned;
    }

    /**
     * Sets whether the student is paid up.
     * @param flag The value true or false indicating paid-up status
     */
    public void setPaidUp(boolean flag) {
        paidUp = flag;
    }

    /**
     * Returns whether the student is paid up.
     * @return Whether the student is paid up
     */
    public boolean isPaidUp() {
        return paidUp;
    }

    /**
     * Creates a string identifying this student.
     * @return The string used to display this student
     */
    @Override
    public String toString() {
        return studentName + " (#" + studentID + ")";
    }

   
}
