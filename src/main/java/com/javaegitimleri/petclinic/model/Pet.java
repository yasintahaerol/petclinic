package com.javaegitimleri.petclinic.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
public class Pet {
    private Long id;
    private String name;
    private Date birthDate;

    private Owner owner;

}
