package week11.d02.junior;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourierTest {

    private Courier courier = new Courier();

    @Test
    void addTest() {

        Ride ride1 = new Ride( 1 ,1, 12 );
        Ride ride2= new Ride( 1 ,2, 11 );
        Ride ride3 = new Ride( 2 ,1, 10 );
        Ride ride4 = new Ride( 4 ,1, 19 );
        courier.addRide(ride1);
        courier.addRide(ride2);
        assertEquals(2, courier.getRides().size());
    }

    @Test
    void dayOff() {
        Ride ride1 = new Ride( 1 ,1, 12 );
        Ride ride2= new Ride( 1 ,2, 11 );
        Ride ride3 = new Ride( 2 ,1, 10 );
        Ride ride4 = new Ride( 4 ,1, 19 );
        courier.addRide(ride1);
        courier.addRide(ride2);
        courier.addRide(ride3);
        courier.addRide(ride4);
        assertEquals(3, courier.getDayOff());
    }

}