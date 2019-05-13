package ac.za.cput.service.GameReserveService.Imp;

import ac.za.cput.domain.GameReserve.Department;
import ac.za.cput.repository.GameReserveRepository.DepartmentRepository;
import ac.za.cput.repository.GameReserveRepository.Imp.DepartmentRepositoryImp;
import ac.za.cput.service.GameReserveService.DepartmentService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class DepartmentServiceImp implements DepartmentService {
    private static DepartmentServiceImp departmentService = null;
    private DepartmentRepository repository;

    private DepartmentServiceImp(){
        this.repository = DepartmentRepositoryImp.getDepartmentRepository();
    }

    public static DepartmentServiceImp getDepartmentService(){
        if (departmentService == null){
            departmentService = new DepartmentServiceImp();
        }
        return departmentService;
    }

    @Override
    public Set<Department> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Department create(Department department) {
        return this.repository.create(department);
    }

    @Override
    public Department update(Department department) {
        return this.repository.update(department);
    }

    @Override
    public void delete(Integer id) {
        this.repository.delete(id);
    }

    @Override
    public Department read(int id) {
        return this.repository.read(id);
    }
}
