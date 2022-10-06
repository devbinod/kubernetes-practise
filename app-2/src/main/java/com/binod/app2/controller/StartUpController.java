package com.binod.app2.controller;

import com.binod.k8demo.entity.Version;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartUpController {

    @GetMapping("/app2")
    private Version getVersion() {
        return new Version();
    }
}
