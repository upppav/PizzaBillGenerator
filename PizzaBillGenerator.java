public class PizzaBillGenerator {
    public static void main(String[] args) {
   Pizza p= new Pizza(true);
   p.addExtraTopping();
   p.addExtraCheez();
   p.takeAway();
   p.getBill();
        System.out.println();
        System.out.println("-----------------------Welcome to DeluxPizza Section-----------------------");
        System.out.println();

        DeluxPizza d=new DeluxPizza(false);

        d.addExtraCheez();
        d.addExtraTopping();
        d.takeAway();
        d.getBill();

    }
}
