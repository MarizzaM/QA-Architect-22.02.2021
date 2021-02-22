package com.app;

public class Iphone extends MobilePhone{
    protected float m_ios_version;

    public float getIphoneOs(){
        return m_ios_version;
    }
    
    public Iphone(String m_color, float m_size, float m_ios_version) {
    super(m_color, m_size);
    this.m_ios_version = m_ios_version;
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "m_ios_version=" + m_ios_version +
                "} " + super.toString();
    }
}
