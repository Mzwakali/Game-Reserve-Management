package ac.za.cput.controller.gameReserve;

import ac.za.cput.domain.gameReserve.Department;
import ac.za.cput.service.gameReserve.Imp.DepartmentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/game/department")
public class DepartmentController {

    @Autowired
    private DepartmentServiceImp service;

    @PostMapping("/create")
    @ResponseBody
    public Department create(Department department){
        return service.create(department);
    }

    @PutMapping("/update")
    //@PostMapping("/update")
    @ResponseBody
    public Department update(Department department){
        return service.update(department);
    }

    @DeleteMapping("/delete/{id}")
    //@GetMapping
    @ResponseBody
    public void delete(@PathVariable int id){
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Department read(@PathVariable int id){
        return service.read(id);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public List<Department> getAll(){
        return service.getAll();
    }
}
