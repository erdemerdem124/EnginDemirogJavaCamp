package InfoAccess;

import DataAccess.HibernateCourseDao;
import business.PageManagement;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MailLogger;

public class Main {
public static void main(String[] args)throws Exception {
		Logger[] loggers = {new DatabaseLogger(),new MailLogger(),new FileLogger()};
		Course c2=new Course("Baslangic Java",12,new Instructor("Erdem Kara", 8500, 21),new Category("Programming",5));

PageManagement pageManagement=new PageManagement(new HibernateCourseDao(),loggers);
pageManagement.add(c2);
}


}
