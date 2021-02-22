package com.app;

public class Iphone extends MobilePhone{
    protected float m_ios_version;

    public float getIphoneOs(){
        return m_ios_version;
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "m_ios_version=" + m_ios_version +
                "} " + super.toString();
    }
}
