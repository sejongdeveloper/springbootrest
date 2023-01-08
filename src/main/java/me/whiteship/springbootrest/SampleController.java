package me.whiteship.springbootrest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/hello")
    public String hello() throws InterruptedException {
        Thread.sleep(5_000L);
        return "hello";
    }

    @GetMapping("/world")
    public String world() throws InterruptedException {
        Thread.sleep(3_000L);
        return "world";
    }
}
