package com.alkemy.challenge.controllers;

import com.alkemy.challenge.entity.Characters;

import com.alkemy.challenge.services.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/characters")
public class CharacterController {

        @Autowired
        private CharacterService CharacterService;

       /* @Autowired
        private PeliculaService peliculaService;*/

//        @GetMapping()
//        public ArrayList<String> listarPersonajes() {
//            List<Personaje> lista = personajeService.listarPersonajes();
//            ArrayList<String> personajes = new ArrayList();
//
//            lista.forEach((l) -> {
//                personajes.add("{ Imagen: " + l.getImagen() + ", Nombre: " + l.getNombre() + " }");
//            });
//            return personajes;
//        }
//
//    @RequestMapping(value = "characters")
//    public List<Characters> getCharacters(){
//
//        List<Characters> characters = new ArrayList<>();
//
//        Characters character = new Characters();
//        character.setId("");
//        character.setImg("img/mickey");
//        character.setName("Mickey");
//        character.setAge(100);
//        character.setWeight(61);
//        character.setLife("a very funny mouse");
//
//        Characters character2 = new Characters();
//        character2.setId("");
//        character.setImg("img/minnie");
//        character2.setName("Minnie");
//        character2.setAge(100);
//        character2.setWeight(61);
//        character2.setLife("a very funny mouse");
//
//        Characters character3 = new Characters();
//        character3.setId("");
//        character.setImg("img/donald");
//        character3.setName("Donald");
//        character3.setAge(100);
//        character3.setWeight(61);
//        character3.setLife("a very funny duck");
//
//        Characters character4 = new Characters();
//        character4.setId("");
//        character.setImg("img/pluto");
//        character4.setName("Pluto");
//        character4.setAge(100);
//        character4.setWeight(61);
//        character4.setLife("a very funny dog");
//
//        characters.add(character);
//        characters.add(character2);
//        characters.add(character3);
//        characters.add(character4);
//
//
//        return characters;
//
//    }
//
//    @RequestMapping(value = "characters/search")
//    public Characters search(){
//
//        Characters character = new Characters();
//
//        character.setName("Mickey");
//        character.setAge(100);
//        character.setWeight(61);
//        character.setLife("a very funny mouse");
//
//        return character;
//
//    }
//
//    @RequestMapping(value = "characters/edit")
//    public Characters edit(){
//
//        Characters character = new Characters();
//
//        character.setName("Mickey");
//        character.setAge(100);
//        character.setWeight(61);
//        character.setLife("a very funny mouse");
//
//        return character;
//
//    }
//
//
//    @RequestMapping(value = "characters/delete")
//    public Characters delete(){
//
//        Characters character = new Characters();
//        character.setName("Mickey");
//        character.setAge(100);
//        character.setWeight(61);
//        character.setLife("a very funny mouse");
//
//        return character;
//
//    }
    }
