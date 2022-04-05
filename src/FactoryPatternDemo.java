public class FactoryPatternDemo {

    //aceaasta clasa ne arata cum functioneaza FactoryPattern-ul si creeaza 3 animale (un caine, o pisica si un iepure)
    //clasa afiseaza pentru fiecare animal creat cate grame de mancare consuma

    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();

        Animal animal_1 = animalFactory.getAnimal("PISICA", "Kitty", 4,"Whiskas");

        //apeleaza metoda eats din clasa Pisica
        animal_1.eats();


        Animal animal_2 = animalFactory.getAnimal("CAINE", "Rex", 12, "Royal Canin");

        //apeleaza metoda eats din clasa Caine
        animal_2.eats();


        Animal animal_3 = animalFactory.getAnimal("IEPURE", "TupTup", 2, "Morcovi");

        //apeleaza metoda eats din clasa Iepure
        animal_3.eats();
    }
}
