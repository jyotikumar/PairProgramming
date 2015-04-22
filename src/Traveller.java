/**
 * Created by welcome on 21-04-2015.
 */
public class Traveller {

    private int parkingId;
    private Car car;

    Traveller(Car car){
        this.car = car;
    }

    public int parkMyCar(ParkingLot parkingLot) {

        parkingId = 0;
        if(parkingLot != null) {
            parkingId = parkingLot.park(car);
            car = null;
        }
        return parkingId;
    }

    public Car unParkMyCar(ParkingLot parkingLot){
        Car car = parkingLot.unPark(parkingId);
        this.car = car;
        return car;
    }

}
