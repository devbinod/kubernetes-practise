package com.binod.k8demo.controller;

import com.binod.k8demo.entity.Version;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartUpController {

    @GetMapping("/app1")
    private Version getVersion() {
        return new Version();
    }
}
