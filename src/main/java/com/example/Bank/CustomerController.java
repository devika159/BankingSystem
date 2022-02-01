package com.example.Bank;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CustomerController {

@GetMapping(path="/all")
@ResponseBody
public String getCustomerDetails() {
return "This is test with Controller";
}
}