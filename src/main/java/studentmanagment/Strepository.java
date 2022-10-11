package studentmanagment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository

public interface Strepository extends JpaRepository<Student, Integer>{
	Student findById(int id);
	
}
