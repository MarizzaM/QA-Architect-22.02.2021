package com.app;

public class Main {

    public static void main(String[] args) {

        Android android = new Android();
        Iphone iphone = new Iphone();
        Lumia lumia = new Lumia();

        MobilePhone [] mobilePhones = new MobilePhone[] {android, iphone,lumia};

        mysteryPhon(android);

    }

    private static void mysteryPhon(MobilePhone m)
    {

        System.out.println(m);

        if (m instanceof Android) {
            Android android = (Android) m;
            android.getAndroidOs();
        }
    }

    private static void PrintPhoneData( MobilePhone m ){

        if (m instanceof Android)
        {
            Android m_as_Android = (Android)m;
            System.out.println(m_as_Android.getAndroidOs());
        }

        if (m instanceof Iphone)
        {
            Iphone m_as_Iphone = (Iphone)m;
            System.out.println(m_as_Iphone.getIphoneOs());
        }

        if (m instanceof Lumia)
        {
            Lumia m_as_Lumia = (Lumia)m;
            System.out.println(m_as_Lumia.getMsOs());
        }
    }
}
