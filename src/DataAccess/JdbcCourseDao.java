package DataAccess;

import InfoAccess.Course;

public class JdbcCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Jdbc ile veritabanına eklendi");
	}

}
