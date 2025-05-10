
public class DesignSubway {

    public void CheckIn(int customer, String station, int time) {

    }

    public void CheckOut(int customer, String station, int time) {

    }

    public double AverageTime(String startStation, String endstation) {

        return 0.0;

    }

    public static void main(String[] args) {
        System.out.println("hello world");
    }

}
/*
 * 
 * 12 time for acocunt 45
 * 10 time for account 27
 * 
 * 22 / 2 = 11
 * 
 * 
 * 
 * TC1:
 * checkIn: [45, "Miami", 3]
 * checkIn: [32, "Orlando", 8]
 * checkIn: [27, "Miami", 10]
 * checkOut: [45, "Tampa", 15]
 * checkOut: [27, "Tampa", 20]
 * 
 * averageTime: ["Orlando", "Jacksonville"] -> -1.0
 * checkOut: [32, "Jacksonville", 22]
 * averageTime: ["Orlando", "Jacksonville"] -> 14.0
 * averageTime: ["Miami", "Tampa"] -> 11.0
 * checkIn: [10, "Miami", 24]
 * averageTime: ["Miami", "Tampa"] -> 11.0
 * checkOut: [10, "Tampa", 38]
 * averageTime: ["Miami", "Tampa"] -> 12.0
 * 
 */

/*
 * 
 * 
 * 
 * TC 2:
 * 
 * checkIn: [10, "Miami", 3]
 * checkOut:[10, "Orlando",8]
 * averageTime: ["Miami", "Orlando"] -> 5.0
 * checkIn: [5, "Miami", 10]
 * checkOut: [5, "Orlando", 16]
 * averageTime: ["Miami", "Orlando"] -> 5.5
 * checkIn: [2, "Miami", 21]
 * checkOut: [2, "Orlando", 30]
 * averageTime: ["Orlando", "Miami"] -> -1.0
 * averageTime: ["Miami", "Orlando"] -> 6.666666666666667
 */
