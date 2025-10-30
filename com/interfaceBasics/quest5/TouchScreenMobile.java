package com.interfaceBasics.quest5;

public class TouchScreenMobile extends BasicMobile implements ISmartPhone{
    @Override
    public void call() {
        System.out.println("call using touch screen");
    }

    @Override
    public void messaging() {
        System.out.println("SMS messaging service\nCan use messaging apps on the phone like Whatsapp,Instagram etc.,");
    }

    @Override
    public void showApps() {
        System.out.println("Apps on Phone: Snapchat, Instagram, Whatsapp, Facebook, Youtube");
    }

    @Override
    public void cameraTypes() {
        System.out.println("Camera Types: Selfie, Rear Camera");
    }
}
