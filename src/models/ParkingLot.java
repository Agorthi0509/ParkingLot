package models;

import strategies.ParkingPlaceAllotmentStrategy;
import strategies.BillingStrategy;

import java.util.List;

public class ParkingLot {
    private List<ParkingFloor> floors;
    private List<Gate> gates;
   private ParkingLotStatus parkingLotStatus;
    private ParkingPlaceAllotmentStrategy allotmentStrategy;
    private BillingStrategy billingStrategy;

    public List<ParkingFloor> getFloors() {
        return floors;
    }

    public void setFloors(List<ParkingFloor> floors) {
        this.floors = floors;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public ParkingPlaceAllotmentStrategy getAllotmentStrategy() {
        return allotmentStrategy;
    }

    public void setAllotmentStrategy(ParkingPlaceAllotmentStrategy allotmentStrategy) {
        this.allotmentStrategy = allotmentStrategy;
    }

    public BillingStrategy getBillingStrategy() {
        return billingStrategy;
    }

    public void setBillingStrategy(BillingStrategy billingStrategy) {
        this.billingStrategy = billingStrategy;
    }
}
