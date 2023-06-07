package efs.task.collections.data;

import efs.task.collections.entity.Hero;
import efs.task.collections.entity.Town;

import java.util.*;
import java.util.stream.Collectors;

public class DataProvider {

    public static final String DATA_SEPARATOR = ",";

    // TODO Utwórz listę miast na podstawie tablicy Data.baseTownsArray.
    //  Tablica zawiera String zawierający nazwę miasta oraz dwie klasy bohatera związane z tym miastem oddzielone przecinkami.
    //  Korzystając z funkcji split() oraz stałej DATA_SEPARATOR utwórz listę obiektów klasy efs.task.collections.entities.Town.
    //  Funkcja zwraca listę obiektów typu Town ze wszystkimi dziewięcioma podstawowymi miastami.
    public List<Town> getTownsList() {

        List<Town> TownsList = new ArrayList<>();

        for(String elem : Data.baseTownsArray) {
            String[] SplitList = elem.split(DATA_SEPARATOR);
            TownsList.add(new Town(SplitList[0].trim(), Arrays.asList(SplitList[1].trim(), SplitList[2].trim())));
        }

        return TownsList;
    }

    //TODO Analogicznie do getTownsList utwórz listę miast na podstawie tablicy Data.DLCTownsArray
    public List<Town> getDLCTownsList() {
        List<Town> DLCTownsList = new ArrayList<>();

        for(String elem : Data.dlcTownsArray) {
            String[] SplitList = elem.split(DATA_SEPARATOR);
            DLCTownsList.add(new Town(SplitList[0].trim(), Arrays.asList(SplitList[1].trim(), SplitList[2].trim())));
        }

        return DLCTownsList;
    }

    //TODO Na podstawie tablicy Data.baseCharactersArray utworzyć listę bohaterów dostępnych w grze.
    // Tablica Data.baseCharactersArray zawiera oddzielone przecinkiem imie bohatera, klasę bohatera.
    // Korzystając z funkcji split() oraz DATA_SEPARATOR utwórz listę unikalnych obiektów efs.task.collections.entities.Hero.
    // UWAGA w Data.baseCharactersArray niektórzy bohaterowie powtarzają się, do porównania bohaterów używamy zarówno imie jak i jego klasę;
    public Set<Hero> getHeroesSet() {
        Set<Hero> HeroesSet = new HashSet<>();

        for(String elem : Data.baseCharactersArray) {
            String[] SplitList = elem.split(DATA_SEPARATOR);
            HeroesSet.add(new Hero(SplitList[0].trim(), SplitList[1].trim()));
        }

        return HeroesSet;
    }

    //TODO Analogicznie do getHeroesSet utwórz listę bohaterów na podstawie tablicy Data.DLCCharactersArray
    public Set<Hero> getDLCHeroesSet() {
        Set<Hero> DLCHeroesSet = new HashSet<>();

        for(String elem : Data.dlcCharactersArray) {
            String[] SplitList = elem.split(DATA_SEPARATOR);
            DLCHeroesSet.add(new Hero(SplitList[0].trim(), SplitList[1].trim()));
        }

        return DLCHeroesSet;
    }
}
