package grapp.grapp;

import java.util.ArrayList;
import java.util.List;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class appController {

    @RequestMapping(value= "/")
    String index(Model model){
        model.addAttribute("key", "prueba");
        return "index";
    }

    @RequestMapping(value="/", method = RequestMethod.POST)
    String indexPost(Model model, @RequestBody formulario form){

        List<String> listado = new ArrayList<String>();
        listado.add("primero");
        listado.add("tercero");
        listado.add("quinto");
        model.addAttribute("users", listado);
        model.addAttribute("photo", form.img);
        return "index";
    }

}
