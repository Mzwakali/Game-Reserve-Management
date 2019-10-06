package ac.za.cput.service.gameReserve.Imp;

import ac.za.cput.domain.gameReserve.Department;
import ac.za.cput.repository.gameReserve.DepartmentRepository;
//import ac.za.cput.repository.gameReserve.Imp.DepartmentRepositoryImp;
import ac.za.cput.service.gameReserve.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImp implements DepartmentService {

    private static DepartmentService departmentService = null;

    @Autowired
    private DepartmentRepository repository;

    /*DepartmentServiceImp(){
        this.repository = DepartmentRepositoryImp.getDepartmentRepository();
    }*/

    public static DepartmentService getDepartmentService(){
        if (departmentService == null){
            departmentService = new DepartmentServiceImp();
        }
        return departmentService;
    }

    @Override
    public List<Department> getAll() {
        return this.repository.findAll();
    }

    @Override
    public Department create(Department department) {
        return this.repository.save(department);
    }

    @Override
    public Department update(Department department) {
        return this.repository.save(department);
    }

    @Override
    public void delete(Integer id) {
        this.repository.deleteById(id);
    }

    @Override
    public Department read(int id) {
        Optional<Department> optionalDepartment = this.repository.findById(id);
        return optionalDepartment.orElse(null);
    }
}
