/**
 * Created by amolina on 10/08/17.
 */
public class Bycicle {

    public class Wheel{
        public int getNUmber(){
            return 2;
        }
    }



    public Bycicle(int gear){
        Wheel llanta  = new Wheel();
        this.gear = gear;
    }

    private int gear;

    public static int getNumberWheels(){
        return 2;
    }

    public int getGear(){
        return gear;
    }
}
