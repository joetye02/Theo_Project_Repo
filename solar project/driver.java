public class driver {
    
    public static void main(String[] args){
        
        
        Solar solarSystem = new Solar(1024, 1024);
        stationary sun; 
        movable earth; 
        movable mars;
        movable jupiter;
        movable neptune;

        int earthOrbit = 0;
        int marsOrbit = 0;
        int jupiterOrbit = 50;
        int neptuneOrbit = 20;
        while(true){

            sun = new stationary(0, 0, 218, "ORANGE");
            earth = new movable(150, earthOrbit, 5, "GREEN", 0, 0);
            mars = new movable(200, marsOrbit, 6, "RED", 0, 0);
            jupiter = new movable(400, jupiterOrbit, 15, "YELLOW", 4, 0);
            neptune = new movable(450, neptuneOrbit, 10, "BLUE", 10, 0);


            solarSystem.finishedDrawing();
            sun.displayObj(solarSystem);
            earth.displayObj(solarSystem);
            mars.displayObj(solarSystem);
            jupiter.displayObj(solarSystem);
            neptune.displayObj(solarSystem);

            earthOrbit += 2;
            marsOrbit += 3;
            jupiterOrbit += 1.5;
            neptuneOrbit += 1;
        }
    }

}
