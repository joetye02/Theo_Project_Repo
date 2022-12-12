public class Fruit{

    private String name;
    private double price;
    private double weight;
    private boolean organic;

    public Fruit(String name, double price, double weight, boolean organic){

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
        String astFru = "";
        for(int x = 0; x < name.length(); x++){
            astFru = astFru + "*";
        }

    return astFru;
    }
}