import java.util.Map;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class appController {

    @RequestMapping("/")
    String index(Map<String,Object> model){
        model.put("key", "prueba");
        return "index";
    }
}
