package com.basics.quest5;

public class MobileMain {
    public static void main(String[] args) {
        Mobile mobile1 = new Mobile("iphone17", "Apple", 58200);
        Mobile mobile2 = new Mobile("S25", "Samsung", 52452);
        Mobile mobile3 = new Mobile("330", "nokia", 123654);
        Mobile mobile4 = new Mobile("pi", "HTC", 9999);
        Mobile mobile5 = new Mobile("pixel", "Google", 478513);

        Mobile[] mobileArray = new Mobile[5];
        mobileArray[0] = mobile1;
        mobileArray[1] = mobile2;
        mobileArray[2] = mobile3;
        mobileArray[3] = mobile4;
        mobileArray[4] = mobile5;
        for (Mobile mobiles : mobileArray) {
            System.out.println(mobiles);
        }
        System.out.println();

        for (int i = 0; i < mobileArray.length; i++) {
            if (mobileArray[i].brand.equals("Samsung")){
                System.out.println(mobileArray[i]);
            }
        }

    }
}
