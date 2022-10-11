package studentmanagment;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;





public class Stservice {
	private final Strepository sr;
	@Autowired
	public Stservice(Strepository sr) {
		
		this.sr = sr;
	}
public List<Student>studentlist(){
		
		return sr.findAll();
				
				
		
	}
public Student addstudent(Student s) {
	
	return sr.save(s);
	
}
public void deletestudent(int id) {
	 sr.deleteById(id);
}
public void updatestudent(int id,String name) {
	Student s = sr.findById(id);
	s.setName(name);
	sr.save(s);
	
}
public Student saveStudent(Student student) {
	return sr.save(student);
}
}
