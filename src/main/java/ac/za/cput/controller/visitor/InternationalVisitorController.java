package ac.za.cput.controller.visitor;

import ac.za.cput.domain.visitor.InternationalVisitor;
import ac.za.cput.service.visitor.Imp.InternationalVisitorServiceImp;
//import javafx.scene.effect.SepiaTone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/visitor/internationalVisitor")
public class InternationalVisitorController {

    @Autowired
    private InternationalVisitorServiceImp internationalVisitorService;

    @PostMapping("/create")
    @ResponseBody
    public InternationalVisitor create(InternationalVisitor internationalVisitor){
        return internationalVisitorService.create(internationalVisitor);
    }

    @PutMapping("/update")
    //@PostMapping("/update")
    @ResponseBody
    public InternationalVisitor update(InternationalVisitor internationalVisitor){
        return internationalVisitorService.update(internationalVisitor);
    }

    @DeleteMapping("/delete/{id}")
    //@GetMapping
    @ResponseBody
    public void delete(@PathVariable int id){
        internationalVisitorService.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public InternationalVisitor read(@PathVariable int id){
        return internationalVisitorService.read(id);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<InternationalVisitor> getAll(){
        return internationalVisitorService.getAll();
    }

}
