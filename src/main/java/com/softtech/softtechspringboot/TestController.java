package com.softtech.softtechspringboot;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tests")
public class TestController {

    @RequestMapping(method = RequestMethod.GET, path ="/hello")
    public  void sayHello(){
        System.out.println("Hello");
    }

    //Yukarıdakini yazmak yerine direk bunu kullanabiliriz. Ayrıca yukarıya TestController için path verildiği için getmappingin içi boş bırakılırsa burada. Bunu döndürecek
    @GetMapping("/helloworld")
    public String sayHelloWorld(){
        return "Hello World Bitches";
    }
    @GetMapping("/helloworld/{person}") //path'ler unique olmalı
    public  String sayHelloWorld(@PathVariable String person){
        return "Hello " + person;
    }
    @GetMapping("/helloworldtoperson")
    public  String personParam(@RequestParam String name,@RequestParam String surname){
        //http://localhost:8080/api/tests/helloworldtoperson?name=Arda&surname=Nogay
        return "Hello " + name + " "  + surname;
    }
}
