package studentmanagment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController  
@CrossOrigin(origins="http://localhost:4200")  
@RequestMapping(value="/api") 
public class Stcontroller {
	@Autowired  
    private Stservice studentservice; 
	@PostMapping("save")
	@ResponseBody
	public Student saveStudent(@RequestBody Student student) {
		 return studentservice.saveStudent(student);
		
	}
	@GetMapping("studentlist")
	@ResponseBody
	public List<Student> list() {
		return studentservice.studentlist();
	}
	@PostMapping("addstudent")
	@ResponseBody
    public void add(@RequestBody Student student) {
		
        student=studentservice.addstudent(student);
    }
	@DeleteMapping("deletestudent/{id}")
	@ResponseBody
	public void delete(@RequestParam int id) {
		studentservice.deletestudent(id);
	}
	@PutMapping("updatestudent/{id}")
	@ResponseBody
	public void update(@RequestParam int id,@RequestParam String name) {
		studentservice.updatestudent(id, name);
	}
	
}
