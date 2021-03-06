package ac.za.cput.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    /*@GetMapping("/")
    @ResponseBody
    public String home(){
        return "Game Reserve Management System";
    }*/
    @RequestMapping(value = {"/", "/game/**"})
    public ResponseEntity<String> home() {
        return new ResponseEntity<>("Welcome to the Game Reserve Management System!", HttpStatus.OK);
    }
}
