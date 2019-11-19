package cards;

import javax.sql.rowset.CachedRowSet;

public class AnimalCard implements CardMethods {

    private final Animal animal;

    AnimalCard(Animal animal) {
        this.animal = animal;
    }

    @Override
    public boolean snap( AnimalCard otherCard ){
        return otherCard != null && this.animal.equals(otherCard.animal);
    }

    @Override
    public String toString() {
        return animal.toString();
    }
}
