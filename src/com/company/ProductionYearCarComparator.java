package com.company;

import com.company.devices.Car;

import java.util.Comparator;

public class ProductionYearCarComparator implements Comparator<Car> {
    @Override
    public int compare(Car car1,Car car2){
        //jeżeli car1 ma być 1 to zwróć ujemną wartość
        //jeżeli car2 ma być 1 to zwróc dodatnią wartość
        //jeżeli nie ma znaczenia zwróć zero
        //if(car1.yearOfProduction<car2.yearOfProduction){
        //    return -1;
        //}else if (car1.yearOfProduction>car2.yearOfProduction){
        //    return 1;
        //}else{
        //    return 0;
        //}
        return car2.yearOfProduction- car1.yearOfProduction;
    }

}
