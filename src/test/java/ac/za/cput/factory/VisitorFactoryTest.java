package ac.za.cput.factory;

import ac.za.cput.domain.Employee.Employee;
import ac.za.cput.domain.Employee.FieldGuide;
import ac.za.cput.domain.Visitor.Visitor;
import ac.za.cput.util.Misc;
import org.junit.Test;

public class VisitorFactoryTest {

    @Test
    public void getVisitor(){
        String firstName = "Thando";
        String lastName = "Mzwakali";
        String cellphone = "0842731178";
        FieldGuide guide = FieldGuideFactory.getGuide(firstName);
        Employee employee = CareTakerFactory.getCareTaker("Joseph", "Mosenga","Marine_Guide",35);
        Visitor visitor;
        //FieldGuide guide;
        visitor = VisitorFactory.getVisitor(Misc.generateId(), firstName, lastName, cellphone, guide);
       // Assert.assertNotNull();

    }

}