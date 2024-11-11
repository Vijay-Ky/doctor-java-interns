package com.doctorjava.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController
{
    @GetMapping("/")
    public String hello()
    {
        return "hello from hello()";
    }

    @GetMapping("/security")
    public String welcome()
    {
        return "hello from welcome()";
    }

    @GetMapping("/spring")
    public String springDevTool()
    {
        return "hello from springDevTool()";
    }


    @GetMapping("/abc")
    public String abcXyz()
    {
        return "hello from abcXyz()";
    }
}
