
public class Bil
{
    String colour = "red";
    Boolean cool = true;
    int speed = 0;
    Speedometer hastighet = new Speedometer();

    //Åka
    void drive(int minutes) {
        hastighet.travel(speed*minutes/60);
    }

    // Gasa lite
    void goFaster(int hurMycket)
    {
        // Kolla först om vi kan öka hastigheten mera
        if (speed + hurMycket > 150) {
            // Nej, det skulle bli för fort
            System.out.println("Det går inte att öka mera, då går det för fort.");
        }
        else {
            // Japp, det går fint
            speed = speed + hurMycket;
            hastighet.setSpeed(speed);
        }
    }

    // Måla om bilen
    void repaint (String newColour)
    {
        colour = newColour;
    }

    // Bromsa
    void goSlower()
    {
        if (speed > 9)
            speed = speed - 10;
        hastighet.setSpeed(speed);
    }

    // Tvärnita
    void stop()
    {
        speed = 0;
        hastighet.setSpeed(speed);

    }
    // Starta
    public static void main(String[] args) {
        Bil bil = new Bil();
        System.out.println("Välkommen till bilen.");
        System.out.println("bilen har startat, styr med w och s.");
        bil.goFaster(160);
        int mySpeed = bil.hastighet.getSpeed();
        System.out.println("nu går bilen i " + mySpeed + " km/h.");

        bil.drive(1);
    }

}



class Speedometer
{
    private	int currentSpeed = 0;
    private int kilometer = 0;

    // Tala om för hastighetsmätaren vad hastigheten är nu
    void setSpeed(int newSpeed) {
        currentSpeed = newSpeed;
    }
    // Se vad hastigheten är
    int getSpeed()
    {
        return currentSpeed;
    }

    // Säga till att vi har åkt en bit
    void travel(int kilometers){
        kilometer += kilometers;
    }
    //Säga hur många kilometer bilen har gott
    int getMileage(){
        return kilometer;
    }
}
