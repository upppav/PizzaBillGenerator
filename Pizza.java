public class Pizza {

    private int price;
    private boolean veg;
    private int basePizzaPrice;
    private boolean addToppings=false;
    private boolean addCheez=false;
    private boolean carryBag=false;
    public Pizza(boolean veg) {
        this.veg = veg;
        if(veg)
        {
            price=300;

        }
        else {
            price=400;
        }
        basePizzaPrice=this.price;
    }

    public void addExtraTopping()
    {
        addToppings=true;
        price +=100;

    }
    public void addExtraCheez()
    {
        addCheez=true;
        price+=150;
    }
    public void takeAway()
    {
        carryBag=true;
        price+=20;
    }



    public void getBill()
    {
        System.out.println("Base pizza price : "+basePizzaPrice);
        if(addCheez)
        {
            System.out.println("Added Extra Cheez : "+150);
        }
        if (addToppings)
        {
            System.out.println("Added Extra Toppings : "+100);
        }
        if(carryBag)
        {
            System.out.println("Carry Bag Charges : "+20);
        }
        System.out.println("Total Bill is : "+price);
    }
}
