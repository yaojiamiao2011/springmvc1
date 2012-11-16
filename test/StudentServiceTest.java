//这些测试的还是无法通过哈！！

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.mvc.entity.Student;
import com.mvc.service.StudentService;

public class StudentServiceTest {
	
	@Autowired
	private StudentService studentService;
	

	@Test
	public void testGetStudentList() {
		//fail("Not yet implemented");
	}


	@Test
	public void testSave() {
		//fail("Not yet implemented");
		Student st=new Student();
		st.setUser("yao");
		st.setPsw("123");
		//st.setId(1);
		
		studentService.save(st);
		
	}

}
