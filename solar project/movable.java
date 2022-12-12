public class movable{
    private double distance;
    private double angle;
    private double diameter;
    private String colour;
    private double centreOfRotationDistance;
    private double centreOfRotationAngle;

        public movable(double distance, double angle, double diameter, String colour, double centreOfRotationDistance, double centreOfRotationAngle){
            
            this.distance = distance;
            this.angle = angle;
            this.diameter = diameter;
            this.colour = colour;
            this.centreOfRotationDistance = centreOfRotationDistance;
            this.centreOfRotationAngle = centreOfRotationAngle;
            
        }
    
        public void displayObj(Solar solarSystem){
            solarSystem.drawSolarObjectAbout(distance, angle, diameter, colour, centreOfRotationDistance, centreOfRotationAngle);
        }
    }
    