package ac.za.cput.factory.visitor;

import ac.za.cput.domain.employee.Employee;
import ac.za.cput.domain.employee.FieldGuide;
import ac.za.cput.domain.visitor.Visitor;
import ac.za.cput.factory.employee.CareTakerFactory;
import ac.za.cput.factory.employee.FieldGuideFactory;
import ac.za.cput.factory.visitor.VisitorFactory;
import ac.za.cput.util.Misc;
import org.junit.Test;

public class VisitorFactoryTest {

    @Test
    public void getVisitor(){
        String firstName = "Thando";
        String lastName = "Mzwakali";
        String cellphone = "0842731178";
        //String guide = FieldGuideFactory.getGuide(firstName);
        Employee employee = CareTakerFactory.getCareTaker("Joseph", "Mosenga","Marine_Guide",35);
        Visitor visitor;
        //FieldGuide guide;
        //visitor = VisitorFactory.getVisitor(Misc.generateId(), firstName, lastName, cellphone);
        // Assert.assertNotNull();

    }

}