public class stationary {
private double distance;
private double angle;
private double diameter;
private String colour;

    public stationary(double distance, double angle, double diameter, String colour){
        
        this.distance = distance;
        this.angle = angle;
        this.diameter = diameter;
        this.colour = colour;
        
    }

    public void displayObj(Solar solarSystem){
        solarSystem.drawSolarObject(distance, angle, diameter, colour);
    }
}
