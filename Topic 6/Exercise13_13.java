
public class Exercise13_13 implements Cloneable {
	private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;
    
    @Override
    public Object clone() {
    	Exercise13_13 copy;
    	
    	try{
    		copy = (Exercise13_13) super.clone();
    	}
    	
    	catch (CloneNotSupportedException e) {
    		return null;
    	}
    	
    	return copy;
    }

    public Exercise13_13(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {

        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {

        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

}