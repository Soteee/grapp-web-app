package grapp.grapp;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class appController {

    @GetMapping(value= "/")
    String index(Model model){
        model.addAttribute("key", "prueba");
        List<String> listado = new ArrayList<String>();
        listado.add("primero");
        listado.add("tercero");
        listado.add("quinto");
        model.addAttribute("users", listado);
        return "index.html";
    }

    @GetMapping(value="/form")
    String form(Model model){
        return "form.html";
    }

    @PostMapping(value="/form")
    String formPost(Model model, @Valid Formulario formulario, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "form.html";
        }
        model.addAttribute("confirmation", "He recibido el POST y los campos estan bien");
        return "form.html";
    }

}
