package ac.za.cput.repository.employee.Imp;

import ac.za.cput.domain.employee.FieldGuide;
import ac.za.cput.factory.employee.FieldGuideFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FieldGuideRepositoryImpTest {

    FieldGuideRepositoryImp fieldGuideRepository;

    @Before
    public void setUp() throws Exception {
        fieldGuideRepository = FieldGuideRepositoryImp.getFieldGuideRepository();

    }

    @Test
    public void create() {
        FieldGuide guide = FieldGuideFactory.getGuide(1,"20/05/19", "International Visitors");
        fieldGuideRepository.create(guide);

        Assert.assertNotNull(fieldGuideRepository.getAll());
    }

    @Test
    public void update() {
        FieldGuide guide = FieldGuideFactory.getGuide(1,"20/05/19", "International Visitors");
        fieldGuideRepository.create(guide);

        Assert.assertNotNull(fieldGuideRepository.getAll());
        FieldGuide guide1 = FieldGuideFactory.getGuide(1,"26/05/19", "International Visitors");
        guide1.setEmpId(guide.getEmpId());
        fieldGuideRepository.update(guide1);

        FieldGuide guide2 = fieldGuideRepository.read(guide1.getEmpId());
        Assert.assertEquals(guide1, guide2);
    }

    @Test
    public void delete() {
        FieldGuide guide = FieldGuideFactory.getGuide(1,"20/05/19", "International Visitors");
        fieldGuideRepository.create(guide);

        Assert.assertNotNull(fieldGuideRepository.getAll());
        fieldGuideRepository.delete(guide.getEmpId());

        FieldGuide guide1 = fieldGuideRepository.read(guide.getEmpId());
        Assert.assertNull(guide1);
    }

    @Test
    public void read() {
        FieldGuide guide = FieldGuideFactory.getGuide(1,"20/05/19", "International Visitors");
        fieldGuideRepository.create(guide);
        Assert.assertNotNull(fieldGuideRepository.getAll());

        FieldGuide onSet = fieldGuideRepository.read(guide.getEmpId());
        Assert.assertEquals(guide, onSet);
    }
}