package ac.za.cput.repository.gameReserve.Imp;

import ac.za.cput.domain.gameReserve.Department;
import ac.za.cput.factory.gameReserve.DepartmentFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DepartmentRepositoryImpTest {

    DepartmentRepositoryImp departmentRepository;

    @Before
    public void setUp() throws Exception {
        departmentRepository = DepartmentRepositoryImp.getDepartmentRepository();
    }

    @Test
    public void create() {
        Department department = DepartmentFactory.getDepartment(1,1, null);
        departmentRepository.create(department);

        Assert.assertNotNull(departmentRepository.getAll());
    }

    @Test
    public void update() {
        Department department = DepartmentFactory.getDepartment(1,1, null);
        departmentRepository.create(department);

        Assert.assertNotNull(departmentRepository.getAll());

        Department departmentUpdate = DepartmentFactory.getDepartment(1,2,null);
        departmentUpdate.setDeptId(department.getDeptId());
        departmentRepository.update(departmentUpdate);

        Department department1 = departmentRepository.read(departmentUpdate.getDeptId());
        Assert.assertEquals(departmentUpdate, department1);
    }

    @Test
    public void delete() {
        Department department = DepartmentFactory.getDepartment(1,1, null);
        departmentRepository.create(department);

        Assert.assertNotNull(departmentRepository.getAll());

        departmentRepository.delete(department.getDeptId());
        Department department1 = departmentRepository.read(department.getDeptId());
        Assert.assertNull(department1);
    }

    @Test
    public void read() {
        Department department = DepartmentFactory.getDepartment(1,1, null);
        departmentRepository.create(department);

        Assert.assertNotNull(departmentRepository.getAll());

        Department onSet = departmentRepository.read(department.getDeptId());
        Assert.assertEquals(department, onSet);
    }
}