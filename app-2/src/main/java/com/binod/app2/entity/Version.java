package com.binod.k8demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Version {
    private String text = "Returning from application 2";
    private String uuid = UUID.randomUUID().toString();
    private LocalDate date = LocalDate.now();
}
