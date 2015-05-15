package controller;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by i843719 on 11/6/14.
 */
@org.springframework.stereotype.Controller
@RequestMapping("/hello")
public class Controller {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
//
//    @RequestMapping(method= RequestMethod.GET, value={"/authenticate/{username}"})
//    public @ResponseBody
//    User sayHello(@RequestParam(value="name", required=false, defaultValue="Stranger")@PathVariable("username") String username) {
//        return new User(1, String.format(template, "default"));
//    }
}
