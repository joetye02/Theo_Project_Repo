public class Driver{
    static Vegetable[] vegetables = new Vegetable[3];
    static Fruit[] fruits = new Fruit[3];
    public static void main(String[] args){
        vegetables[0] = new Vegetable("Potato", 1.2, 3.5, true);
        vegetables[1] = new Vegetable("carrot", 1.4, 2.4, false);
        vegetables[2] = new Vegetable("Green Beans", 3.4, 6.3, true);
        fruits[0] = new Fruit("Apple", 3.4, 2.1, true);
        fruits[1] = new Fruit("Pear", 1.3, 2.7, false);
        fruits[2] = new Fruit("Pinapple", 3, 8.7, true);

        fruits[1].setName("Grapes");
        for (int x = 0; x < fruits.length; x++){
            System.out.println("FRUIT: " + (int)fruits[x].getPrice() + " PRICE: " + (int)fruits[x].getPrice()) ;   
        }
        
        
    }
}