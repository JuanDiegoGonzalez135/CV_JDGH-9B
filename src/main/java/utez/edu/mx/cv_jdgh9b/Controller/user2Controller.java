package utez.edu.mx.cv_jdgh9b.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/user2/")
public class user2Controller{
    @GetMapping("")
    public String messaje(){
        return "Hola desde User2";
    }
}
