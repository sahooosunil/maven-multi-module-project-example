package com.swiggy.controller;

import com.swiggy.service.SwiggyService;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Data
public class SwiggyTestController {

    private final SwiggyService swiggyService;

    @GetMapping("test")
    public String test(){
        return swiggyService.getMessage();
    }
}
