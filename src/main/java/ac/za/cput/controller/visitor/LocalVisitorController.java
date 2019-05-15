package ac.za.cput.controller.visitor;

import ac.za.cput.domain.visitor.LocalVisitor;
import ac.za.cput.service.visitor.Imp.LocalVisitorServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/visitor/locals")
public class LocalVisitorController {

    @Autowired
    private LocalVisitorServiceImp localVisitorService;

    @PostMapping("/create")
    @ResponseBody
    public LocalVisitor create(LocalVisitor localVisitor){
        return localVisitorService.create(localVisitor);
    }

    @PutMapping("/update")
    //@PostMapping("/update")
    @ResponseBody
    public LocalVisitor update(LocalVisitor localVisitor){
        return localVisitorService.update(localVisitor);
    }

    @DeleteMapping("/delete/{id}")
    //@GetMapping
    @ResponseBody
    public void delete(@PathVariable int id){
        localVisitorService.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public LocalVisitor read(@PathVariable int id){
        return localVisitorService.read(id);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<LocalVisitor> getAll(){
        return localVisitorService.getAll();
    }

}
