package com.oocl.parkingCompany;

import com.oocl.parkingCompany.Model.ParkingLot;
import com.oocl.parkingCompany.ServiceImpl.ParkingLotServiceImpl;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ParkingLotTest {
    @Test
    public void should_return_parkingLotList_when_call_addParkingLot_input_ParkingLot(){
        ParkingLotServiceImpl parkingLotService = new ParkingLotServiceImpl();
        List<ParkingLot> parkingLotList = parkingLotService.addParkingLot(new ParkingLot(3,3,3,1));
        assertThat(parkingLotList.size(),is(3));
    }

    @Test
    public void should_return_parkingLot_when_call_arrangeParkingBoyInParkingLot_input_parkingLotId_and_parkingBoy(){
        ParkingLotServiceImpl parkingLotService = new ParkingLotServiceImpl();
        ParkingLot parkingLot = parkingLotService.arrangeParkingBoyInParkingLot(1,3);
        assertThat(parkingLot.getParkingBoyId(),is(3));
    }

    @Test
    public void should_return_parkingLotList_when_call_getFilterParkingLotIsAvaliable(){
        ParkingLotServiceImpl parkingLotService = new ParkingLotServiceImpl();
        List<ParkingLot> parkingLotList = parkingLotService.getfilterParkingLotIsAvalidate("avaliable");
        assertThat(parkingLotList.size(),is(1));
    }

}
