package com.api.parkingcontrol;

import com.api.parkingcontrol.controllers.ParkingSpotController;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestUnitParkingSpotController {
    @Test
    public void testUnit(){
        ParkingSpotController controller = new ParkingSpotController();
        String result = controller.test();
        assertEquals("Olá mundo!!", result);
    }
}