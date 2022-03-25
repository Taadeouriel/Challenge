package com.alkemy.challenge.repositories;

import com.alkemy.challenge.entity.Characters;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface CharacterRepositorie extends JpaRepository<Characters,String> {

    public abstract ArrayList<Characters> findByName(String name);
    public abstract ArrayList<Characters> findByAge(Integer age);

}
