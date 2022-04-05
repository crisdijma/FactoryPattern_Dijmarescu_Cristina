public class Iepure implements Animal{

    //Clasa iepure care implementeaza interfata Animal si descrie un iepure si cate grame de mancare consuma acesta pe zi

    private String nume;
    private Integer varsta;
    private String denumire_hrana;

    public Iepure(String nume, Integer varsta, String denumire_hrana) {
        this.nume = nume;
        this.varsta = varsta;
        this.denumire_hrana = denumire_hrana;
    }

    //aceasta functie de calcul al gramajului este apelata mai jos in rescrierea functiei eats
    public Integer gramaj_hrana()
    {
        return (5*varsta);
    }

    //rescriu functia eats definita in interfata Animal
    @Override
    public void eats() {
        System.out.println("Iepurele " + nume + " mananca "+ gramaj_hrana() + " grame de " + denumire_hrana);
    }
}
