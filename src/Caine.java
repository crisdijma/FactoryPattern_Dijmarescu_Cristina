public class Caine implements Animal{

    //Clasa caine care implementeaza interfata Animal si descrie un caine si cate grame de mancare consuma acesta pe zi

    private String nume;
    private Integer varsta;
    private String denumire_hrana;

    public Caine(String nume, Integer varsta, String denumire_hrana) {
        this.nume = nume;
        this.varsta = varsta;
        this.denumire_hrana = denumire_hrana;
    }

    //aceasta functie de calcul al gramajului este apelata mai jos in rescrierea functiei eats
    public Integer gramaj_hrana()
    {
        return (70*varsta);
    }

    //rescriu functia eats definita in interfata Animal
    @Override
    public void eats() {
        System.out.println("Cainele " + nume + " mananca "+ gramaj_hrana() + " grame de " + denumire_hrana);
    }
}
