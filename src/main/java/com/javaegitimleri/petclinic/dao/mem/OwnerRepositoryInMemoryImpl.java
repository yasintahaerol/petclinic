package com.javaegitimleri.petclinic.dao.mem;

import com.javaegitimleri.petclinic.dao.OwnerRepository;
import com.javaegitimleri.petclinic.model.Owner;
import lombok.val;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Collectors;

@Repository
public class OwnerRepositoryInMemoryImpl implements OwnerRepository {

    private Map<Long, Owner> ownerMap = new HashMap<>();

    public OwnerRepositoryInMemoryImpl() {
        Owner owner1 = new Owner();
        owner1.setFirstName("yasin");
        owner1.setLastName("erol");
        owner1.setId(1L);

        Owner owner2 = new Owner();
        owner2.setFirstName("erol");
        owner2.setLastName("erol");
        owner2.setId(2L);

        Owner owner3 = new Owner();
        owner3.setFirstName("emine");
        owner3.setLastName("erol");
        owner3.setId(3L);

        Owner owner4 = new Owner();
        owner4.setFirstName("berna");
        owner4.setLastName("akman");
        owner4.setId(4L);

        ownerMap.put(owner1.getId(), owner1);
        ownerMap.put(owner2.getId(), owner2);
        ownerMap.put(owner3.getId(), owner3);
        ownerMap.put(owner4.getId(), owner4);

    }

    @Override
    public List<Owner> findAll() {
        return new ArrayList<Owner>(ownerMap.values());
    }

    @Override
    public Owner findById(Long id) {

        return ownerMap.get(id);
    }

    @Override
    public List<Owner> findByLastName(String lastName) {
        return ownerMap.values().stream().filter(o -> o.getLastName().equalsIgnoreCase(lastName)).collect(Collectors.toList());
        // filter kullanarak map içerisindeki degerleri tek tek aldık sonra o ownerların lastName lerini input ile aynı olanları
        // collect ile beraber listeye cevirip return ettik.
    }

    @Override
    public void create(Owner owner) {
        owner.setId(new Date().getTime());
        ownerMap.put(owner.getId(), owner);
    }

    @Override
    public Owner update(Owner owner) {
        ownerMap.replace(owner.getId(), owner);
        return owner;
    }

    @Override
    public void delete(Long id) {
        ownerMap.remove(id);
    }
}
