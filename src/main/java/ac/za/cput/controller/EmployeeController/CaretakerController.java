package ac.za.cput.controller.EmployeeController;

import ac.za.cput.domain.Employee.Caretaker;
import ac.za.cput.factory.CareTakerFactory;
import ac.za.cput.service.EmployeeService.CaretakerService;
import ac.za.cput.service.EmployeeService.Imp.CaretakerServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.Caret;
import java.util.Set;

@RestController
@RequestMapping("/Caretaker")
public class CaretakerController {

    @Autowired
    private CaretakerService service;

    @PostMapping("/create")
    @ResponseBody
    public Caretaker create(Caretaker caretaker){
        return service.create(caretaker);
    }

    @PostMapping("/update")
    @ResponseBody
    public Caretaker update(Caretaker caretaker){
        return service.update(caretaker);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable int id){
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Caretaker read(@PathVariable int id){
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Caretaker> getAll(){
        return service.getAll();
    }

}
