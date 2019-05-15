package ac.za.cput.controller.gameReserve;

import ac.za.cput.service.gameReserve.Imp.DepartmentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Game-Reserve-Management/department")
public class DepartmentController {

    @Autowired
    private DepartmentServiceImp service;

   /*public @ResponseBody
    Department create(@PathVariable String department){
        Department department1 = DepartmentFactory.
    }*/

}
