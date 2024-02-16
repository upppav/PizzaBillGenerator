public class DeluxPizza extends Pizza{
    public DeluxPizza(boolean veg) {
        super(veg);
        super.addExtraCheez();
        super.addExtraTopping();
    }

    @Override
    public void addExtraTopping() {

    }

    @Override
    public void addExtraCheez() {

    }
}
