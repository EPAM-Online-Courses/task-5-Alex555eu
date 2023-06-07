package efs.task.collections.entity;

import java.util.List;
import java.util.Objects;

public class Town implements Comparable {
    private String townName;
    private List<String> startingHeroClasses;

    public Town(String townName, List<String> startingHeroesClass) {
        this.townName = townName;
        startingHeroClasses = startingHeroesClass;
    }

    public String getTownName() {
        return townName;
    }

    public List<String> getStartingHeroClasses() {
        return startingHeroClasses;
    }

    //TODO implementacja metody equal porównująca obiekty Town na podstawie tylko townName.
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Town))
            return false;
        Town object = (Town) o;
        return townName.equals(object.getTownName());
    }

    //TODO implementacja metody equal biorąca pod uwagę tylko townName.
    @Override
    public int hashCode() {
        return Objects.hash(townName);
    }

    @Override
    public String toString() {
        return "Miasto :" + townName;
    }

    @Override
    public int compareTo(Object o) {
        Town town = (Town) o;
        return this.getTownName().compareTo(town.getTownName());
    }
}
