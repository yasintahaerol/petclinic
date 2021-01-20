package com.javaegitimleri.petclinic;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@RequiredArgsConstructor
@ConfigurationProperties(prefix = "petclinic")
public class PetClinicProperties {
    private boolean displayOwnersWithPaths = false;


}
