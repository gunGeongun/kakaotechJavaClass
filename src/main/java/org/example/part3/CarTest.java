package org.example.part3;

import org.example.model.CarDTO;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        //Q. 자동차의 정보를 키보드로 부터 입력받아서 다른 메서드로 이동 해야되는 경우를 생각해보자
        Scanner scan = new Scanner(System.in);
        System.out.print("자동차일련번호:");
        int carSn = scan.nextInt();

        scan.nextLine();

        System.out.print("자동차이름:");
        String carName = scan.nextLine();

        System.out.print("자동차가격:");
        int carPrice = scan.nextInt();

        scan.nextLine();

        System.out.print("자동차소유자:");
        String carOwner = scan.nextLine();


        System.out.print("자동차년식:");
        int carYear = scan.nextInt();

        scan.nextLine();

        System.out.print("자동차타입:"); // G(휘발유) , D(경유)
        String carType = scan.nextLine();

        CarDTO car =  new CarDTO(); // CarDTO 객체생성
        car.carSn = carSn;
        car.carName = carName;
        car.carPrice = carPrice;
        car.carOwner = carOwner;
        car.carYear = carYear;
        car.carType = carType;
        carInfoPrint(car);


    }
    public static void carInfoPrint(CarDTO car){ // Call by Reference
        System.out.println(car.carSn + "\t" + car.carName + "\t" + car.carPrice +"\t" + car.carOwner+"\t" + car.carYear + "\t" + car.carType);
    }
}
