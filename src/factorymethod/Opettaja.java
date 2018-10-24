package factorymethod;

public class Opettaja extends AterioivaOtus {

    @Override
    public Juoma createJuoma(){
        return new Vesi();
    };

}
