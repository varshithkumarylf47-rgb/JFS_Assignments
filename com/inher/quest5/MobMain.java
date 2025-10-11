package com.inher.quest5;

public class MobMain {
    public static void main(String[] args) {
        Mobile mobile = new FeaturePhone();
        mobile.call();
        System.out.println();
        mobile = new SmartPhone();
        mobile.call();
        SmartPhone smartPhone = (SmartPhone) mobile;
        System.out.print("Apps in Smart phones: ");
        for (String apps : smartPhone.apps()){
            System.out.print(apps+" ");
        }
    }
}
