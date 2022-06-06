package in.com.app.unmarshalling;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import in.com.app.binding.Student;

public class UnMarshalling {
	public static void main(String[] args) throws Exception {
		JAXBContext instance =  JAXBContext.newInstance(Student.class);
		Unmarshaller unmarshal = instance.createUnmarshaller();
		Object obj = unmarshal.unmarshal(new File("student.xml"));
		Student student = (Student)obj;
		System.out.println(student);
	}
}
