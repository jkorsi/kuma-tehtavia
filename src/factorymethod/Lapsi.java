package factorymethod;

public class Lapsi extends AterioivaOtus {


    @Override
    public Juoma createJuoma(){
        return new Mehu();
    };

}
