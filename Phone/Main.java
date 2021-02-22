package com.app;

public class Main {

    public static void main(String[] args) {

        Android android = new Android("black",4.1f,10f);
        Iphone iphone = new Iphone("white", 5.2f, 15f);
        Lumia lumia = new Lumia("gray", 6.2f, 3);

        MobilePhone [] mobilePhones = new MobilePhone[] {android, iphone,lumia};

        mysteryPhone(android);

    }

    private static void mysteryPhone(MobilePhone m)
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

        else if (m instanceof Iphone)
        {
            Iphone m_as_Iphone = (Iphone)m;
            System.out.println(m_as_Iphone.getIphoneOs());
        }

        else if (m instanceof Lumia)
        {
            Lumia m_as_Lumia = (Lumia)m;
            System.out.println(m_as_Lumia.getMsOs());
        }
        else {
            throw new ClassCastException("Error...");
        }
    }
}
