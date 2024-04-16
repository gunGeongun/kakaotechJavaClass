package org.example.part3;

import org.example.model.CarDTO;
import org.example.model.CarUtility;

public class CarUtilityTest {
    public static void main(String[] args) {
        // Car 정보를 출력하는 동작을 가지고있는 Utility클래스 설계
        int carSn = 1110;
        String carName = "BMW";
        int carPrice = 90000000;
        String carOwner = "홍길동";
        int carYear = 2015;
        String carType = "G";

        CarDTO car = new CarDTO();
        car.carSn = carSn;
        car.carName = carName;
        car.carPrice =carPrice;
        car.carOwner = carOwner;
        car.carYear =carYear;
        car.carType =carType;

        CarUtility carutil = new CarUtility();
        carutil.carPrint(car);
    }

}
