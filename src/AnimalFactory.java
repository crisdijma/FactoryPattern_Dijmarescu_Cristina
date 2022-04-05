public class AnimalFactory {

    //clasa AnimalFactory ne creeaza ori un caine ori o pisica ori un iepure in functie de ce parametru ii dam noi
    public Animal getAnimal(String animalType, String nume, Integer varsta, String denumire_hrana){
        if(animalType == null){
            return null;
        }
        if(animalType.equalsIgnoreCase("PISICA")){
            return new Pisica(nume, varsta, denumire_hrana);

        } else if(animalType.equalsIgnoreCase("CAINE")){
            return new Caine(nume, varsta, denumire_hrana);

        } else if(animalType.equalsIgnoreCase("IEPURE")){
            return new Iepure(nume, varsta, denumire_hrana);
        }

        return null;
    }

}
