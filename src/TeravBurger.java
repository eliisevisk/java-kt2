public class TeravBurger extends Order {

    public TeravBurger() {
        super();

        // teravburger pärib Order klassist fuknctiooni millega saab lisada uue burgeri ilma et peaks ligi pääsema 'menu' muutujale.
        this.addBurger("Spicy", "Veise", "rukkileib", 9.50);

        }
}
