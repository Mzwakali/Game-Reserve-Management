package ac.za.cput.controller.employee;

import ac.za.cput.domain.employee.Caretaker;
import ac.za.cput.service.employee.CaretakerService;
import ac.za.cput.service.employee.Imp.CaretakerServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/employee/caretaker")
public class CaretakerController {

    @Autowired
    private CaretakerServiceImp service;

    @PostMapping("/create")
    @ResponseBody
    public Caretaker create(Caretaker caretaker){
        return service.create(caretaker);
    }

    @PutMapping("/update")
    //@PostMapping("/update")
    @ResponseBody
    public Caretaker update(Caretaker caretaker){
        return service.update(caretaker);
    }

    @DeleteMapping("/delete/{id}")
    //@GetMapping
    @ResponseBody
    public void delete(@PathVariable int id){
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Caretaker read(@PathVariable int id){
        return service.read(id);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<Caretaker> getAll(){
        return service.getAll();
    }

}
