package in.com.app.marshalling;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import in.com.app.binding.Student;

public class Marshalling {
	public static void main(String[] args) throws Exception {
		Student student = new Student();

		student.setId(101);
		student.setName("Kalidas");
		student.setRank(10552);

		JAXBContext context = JAXBContext.newInstance(Student.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.marshal(student, new File("student.xml"));
	}

}
