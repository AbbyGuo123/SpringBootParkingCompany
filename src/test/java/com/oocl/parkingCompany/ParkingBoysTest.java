package com.oocl.parkingCompany;

import com.oocl.parkingCompany.Model.ParkingBoy;
import com.oocl.parkingCompany.Model.ParkingLot;
import com.oocl.parkingCompany.ServiceImpl.ParkingBoysServiceImpl;
import com.oocl.parkingCompany.ServiceImpl.ParkingLotServiceImpl;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ParkingBoysTest {

    @Test
    public void should_return_parkingBoy_when_call_addParkingBoy_input_ParkingBoy(){
        ParkingBoysServiceImpl parkingBoysServiceImpl =  new ParkingBoysServiceImpl();
        List<ParkingBoy> parkingBoyList = parkingBoysServiceImpl.addparkingBoy(new ParkingBoy(1,"parkBoy1"));
        assertThat(parkingBoyList.size(),is(3));
    }


}
