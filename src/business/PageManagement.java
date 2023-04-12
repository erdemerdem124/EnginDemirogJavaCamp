package business;

import DataAccess.CourseDao;
import InfoAccess.Course;
import core.logging.Logger;

public class PageManagement {
private CourseDao courseDao;
private Logger[] loggers;

public PageManagement(CourseDao courseDao,Logger[] loggers) {
	this.courseDao=courseDao;
	this.loggers=loggers;
}
public void add(Course course) throws Exception{
	if(course.getPrice()<0) {
		throw new Exception("Kurs fiyati sifirdan kücük olamaz");
	}
	courseDao.add(course);
	for(Logger logger:loggers) {
		logger.log(course.getName());
	}
}

}