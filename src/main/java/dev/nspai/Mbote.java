package dev.nspai;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Mbote {

    private static final Logger LOGGER = LoggerFactory.getLogger(Mbote.class);

    @RequestMapping("/mbote")
    public String mboteCongo(){
        LOGGER.info("\"Mbote bae banso na congo Mobimba \uD83C\uDDE8\uD83C\uDDE9 toujours 243. Ninespace Mokonzi ya Code \"");
        return "Mbote bae banso na congo Mobimba 🇨🇩 toujours 243. Ninespace Mokonzi ya Code ";
    }
}
