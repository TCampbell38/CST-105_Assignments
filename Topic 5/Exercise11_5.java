import java.util.ArrayList;

public class Exercise11_5 {
	private String courseName;
	
	private ArrayList<String> students = new ArrayList<>();
	
	
	public Exercise11_5(String courseName) {
		this.courseName = courseName;
	}
	
	public void addStudents(String student) {
		students.add(student);
	}
	
	public String[] getStudents() {
		return students.toArray(new String[students.size()]);
	}
	
	public int getNumberOfStudents() {
		return students.size();
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void dropStudent(String student) {
		students.remove(student);
	}
	
	public void clear() {
		students.clear();
	}

}
