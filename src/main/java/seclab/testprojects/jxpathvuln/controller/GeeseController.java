package seclab.testprojects.jxpathvuln.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import seclab.testprojects.jxpathvuln.repository.GeeseRepository;

@Controller
public class GeeseController { // Name is a wish, in reality geese can't be controlled...

    private final GeeseRepository geeseRepository = new GeeseRepository();

    @GetMapping("find")
    public Object findGoose(@RequestParam(defaultValue = "/") String path) {
        var pathAdjusted = path.replace("@", "");
        return geeseRepository.find(pathAdjusted);
    }
}
