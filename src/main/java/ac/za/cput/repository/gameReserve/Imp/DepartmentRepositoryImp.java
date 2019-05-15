package ac.za.cput.repository.gameReserve.Imp;

import ac.za.cput.domain.gameReserve.Department;
import ac.za.cput.repository.gameReserve.DepartmentRepository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DepartmentRepositoryImp implements DepartmentRepository {
    private static DepartmentRepositoryImp departmentRepository = null;
    private Map<Integer, Department> departments;

    private DepartmentRepositoryImp(){
        this.departments = new HashMap<>();
    }

    public static DepartmentRepositoryImp getDepartmentRepository(){
        if (departmentRepository == null){
            departmentRepository = new DepartmentRepositoryImp();
        }
        return departmentRepository;
    }

    /*public Department find(int id){
        return departments.stream().filter(department -> department.getDeptId() == id).findAny().orElse(null);
    }*/

    @Override
    public Set<Department> getAll() {
        return new HashSet<>(departments.values());
    }

    @Override
    public Department create(Department department) {
        this.departments.put(department.getDeptId(), department);
        return department;
    }

    @Override
    public Department update(Department department) {
       /* Department department1 = find(department.getDeptId());
        if (departments.contains(department1)){
            departments.remove(department1);
            departments.add(department);
        }*/
       departments.replace(department.getDeptId(), department);
        return departments.get(department.getDeptId());
    }

    @Override
    public void delete(Integer id) {
        //Department department = find(id);
        this.departments.remove(id);
    }

    @Override
    public Department read(int id) {
        /*Department department = find(id);
        if (department == null){
            return null;
        }
        else {
            return department;
        }*/
        return departments.get(id);
    }
}
