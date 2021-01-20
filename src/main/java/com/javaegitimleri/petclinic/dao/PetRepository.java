package com.javaegitimleri.petclinic.dao;

import com.javaegitimleri.petclinic.model.Pet;

import java.util.List;

public interface PetRepository {
    List<Pet> findAll();
    Pet findById(Long id);
    List<Pet> findByOwnerId(Long ownerId);
    void create(Pet pet);
    void delete(Long id);
    Pet update(Pet pet);
    void deleteByOwnerId(Long ownerId);

}
