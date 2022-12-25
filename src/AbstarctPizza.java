abstract class AbstarctPizza {

    private boolean isPizzaOpen = true;
    private boolean isPizzaSpicy = false;

    public AbstarctPizza() {
        isPizzaOpen = OpenPizza();
        isPizzaSpicy = SpicyPizza();
    }

    public final void cook()
    {
        MakingPizzaOpen();
        MakingPizzaSpicy();
        AddIngredients();
    }

    abstract void AddIngredients(); //можно было бы передавать, конечно, список, но...

    void MakingPizzaOpen()
    {
        if (isPizzaOpen) {
            System.out.println("Делаем пиццу открытой");
        }
        else {
            System.out.println("Делаем пиццу закрытой");
        }
    }

    void MakingPizzaSpicy()
    {
        if (isPizzaOpen) {
            System.out.println("Делаем пиццу острой");
        }
        else {
            System.out.println("Делаем пиццу неострой");
        }
    }

    boolean OpenPizza() { //использую хук (закрытая или открытая пицца)
        return true;
    }

    boolean SpicyPizza() { //использую хук (острая или неострая пицца)
        return false;
    }

}
