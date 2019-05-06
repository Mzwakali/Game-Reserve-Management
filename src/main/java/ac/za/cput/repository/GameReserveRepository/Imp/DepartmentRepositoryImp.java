package ac.za.cput.repository.GameReserveRepository.Imp;

import ac.za.cput.domain.GameReserve.Department;
import ac.za.cput.repository.GameReserveRepository.DepartmentRepository;

import java.util.HashSet;
import java.util.Set;

public class DepartmentRepositoryImp implements DepartmentRepository {
    private static DepartmentRepositoryImp departmentRepository = null;
    private Set<Department> departments;

    private DepartmentRepositoryImp(){
        this.departments = new HashSet<>();
    }

    public static DepartmentRepositoryImp getDepartmentRepository(){
        if (departmentRepository == null){
            departmentRepository = new DepartmentRepositoryImp();
        }
        return departmentRepository;
    }

    public Department find(int id){
        return departments.stream().filter(department -> department.getDeptId() == id).findAny().orElse(null);
    }

    @Override
    public Set<Department> getAll() {
        return departments;
    }

    @Override
    public Department create(Department department) {
        this.departments.add(department);
        return department;
    }

    @Override
    public Department update(Department department) {
        Department department1 = find(department.getDeptId());
        if (departments.contains(department1)){
            departments.remove(department1);
            departments.add(department);
        }
        return department1;
    }

    @Override
    public void delete(Integer id) {
        Department department = find(id);
        this.departments.remove(department);
    }

    @Override
    public Department read(int id) {
        Department department = find(id);
        if (department == null){
            return null;
        }
        else {
            return department;
        }
    }
}
