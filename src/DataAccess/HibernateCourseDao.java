package DataAccess;

import InfoAccess.Course;

public class HibernateCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
System.out.println("Hibernate ile veritabanina eklendi");		
	}

}
