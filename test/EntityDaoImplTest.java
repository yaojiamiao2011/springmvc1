

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.mvc.dao.EntityDao;
import com.mvc.entity.Student;

public class EntityDaoImplTest {

	@Autowired
	private EntityDao entityDao;

	@Test
	public void testSave() {
		//fail("Not yet implemented");

		Student st = new Student();
		st.setId(2);
		st.setPsw("123");
		st.setUser("yjm");
		
		entityDao.save(st);

	}


}
