package ru.mirea.webPetShop.myPets;

import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class PetService {
    List<Pet> pets() {
        List<Pet> pets = new LinkedList<Pet>();
        pets.add(new Pet(0, 5, "cat"));
        pets.add(new Pet(1, 10, "dog"));
        return pets;
    }
}
