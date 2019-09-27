package me.fwfurtado;

import java.util.Map;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private final String url;

    public HomeController(@Value("${caelum.system.url}") String url) {
        this.url = url;
    }

    @GetMapping
    Map<String, String> show() {
        return Map.of("url", url);
    }

}
