package ac.za.cput.service.gameReserve.Imp;

import ac.za.cput.domain.gameReserve.Department;
import ac.za.cput.factory.gameReserve.DepartmentFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DepartmentServiceImpTest {

    private DepartmentServiceImp departmentService;

    @Before
    public void setUp() throws Exception {
        departmentService = new DepartmentServiceImp();
    }

    @Test
    public void create() {
        Department department = DepartmentFactory.getDepartment(2,2,null);
        departmentService.create(department);
        Assert.assertNotNull(departmentService.getAll());

    }

    @Test
    public void update() {
        Department department = DepartmentFactory.getDepartment(2,2,null);
        departmentService.create(department);
        Assert.assertNotNull(departmentService.getAll());

        Department departmentUpdate = DepartmentFactory.getDepartment(4,4, null);
        departmentUpdate.setDeptId(department.getDeptId());
        departmentService.update(departmentUpdate);

        Department departmentNew = departmentService.read(departmentUpdate.getDeptId());
        Assert.assertEquals(departmentUpdate, departmentNew);
    }

    @Test
    public void delete() {
        Department department = DepartmentFactory.getDepartment(2,2,null);
        departmentService.create(department);
        Assert.assertNotNull(departmentService.getAll());

        departmentService.delete(department.getDeptId());

        Department excluded = departmentService.read(department.getDeptId());
        Assert.assertNull(excluded);
    }

    @Test
    public void read() {
        Department department = DepartmentFactory.getDepartment(2,2,null);
        departmentService.create(department);
        Assert.assertNotNull(departmentService.getAll());

        Department departmentRead = departmentService.read(department.getDeptId());
        Assert.assertEquals(department,departmentRead);
    }
}