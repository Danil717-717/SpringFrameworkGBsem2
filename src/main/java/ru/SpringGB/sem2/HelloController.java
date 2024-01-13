package ru.SpringGB.sem2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HelloController {
    /*
    code sem2

    private final HelloService helloService;

    @Autowired
    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/sem2")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name){
        //return "Hello!!!";
        return this.helloService.getGreeting();
    }

    */



    @GetMapping( "greeting")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }



//    public String home() {
//        return MyView.draw();
//    }

//    @GetMapping("/delete")
//    public String delete() {
//        return MyView.delete();
//    }

//    @GetMapping("/add")
//    public String add() {
//        return MyView.add();
//    }

    // @PutMapping
    // public void addNew(){}



}
