package com.interfaceBasics.quest5;

import java.util.Scanner;

public class Customer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IFeaturePhone phone;
        System.out.print("1.Basic Mobile Phone\n2.Touch Screen Mobile Phone\nSelect an option: ");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                phone = new BasicMobile();
                phone.call();
                phone.messaging();
                break;
            case 2:
                phone = new TouchScreenMobile();
                phone.call();
                phone.messaging();
                ISmartPhone smartPhone = (ISmartPhone) phone;
                smartPhone.showApps();
                smartPhone.cameraTypes();
                break;
            default:
                System.out.println("Enter valid option");
        }
    }
}
