public class Vegetable{

    private String name;
    private double price;
    private double weight;
    private boolean organic;

    
    public Vegetable(String name, double price, double weight, boolean organic){

        this.name = name;
        this.price = price;
        this.weight = weight;
        this.organic = organic;

    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return (weight * price);
    }

    public String getNameLen(){
        String astVeg = "";
        for(int x = 0; x < name.length(); x++){
            astVeg = astVeg + "*";
        }
    return astVeg;
    }
}

