package com.example.Bank;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

@GetMapping("/welcome")
public String welcome() {
return "Welcome to Spring boot Web project";
}

}


