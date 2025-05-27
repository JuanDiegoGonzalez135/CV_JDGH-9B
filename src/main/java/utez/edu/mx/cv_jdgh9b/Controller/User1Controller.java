package utez.edu.mx.cv_jdgh9b.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/user1")
public class User1Controller {
    @GetMapping("")
    public void Hola(){
        System.out.println("Hola soy User 1");
    }
}
