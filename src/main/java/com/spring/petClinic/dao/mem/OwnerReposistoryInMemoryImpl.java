package com.spring.petClinic.dao.mem;

import com.spring.petClinic.dao.OwnerRepository;
import com.spring.petClinic.model.Owner;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class OwnerReposistoryInMemoryImpl implements OwnerRepository {

    private Map
    @Override
    public List<Owner> findAll() {
        return null;
    }

    @Override
    public Owner findById(Long id) {
        return null;
    }

    @Override
    public List<Owner> findByLastName(String lastName) {
        return null;
    }

    @Override
    public void create(Owner owner) {

    }

    @Override
    public Owner update(Owner owner) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
