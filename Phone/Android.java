package com.app;

public class Android extends MobilePhone{
    protected float m_andoird_os;

    public Android(String m_color, float m_size, float m_andoird_os) {
    super(m_color, m_size);
    this.m_andoird_os = m_andoird_os;
    }
    
    public float getAndroidOs (){
        return m_andoird_os;
    }

    @Override
    public String toString() {
        return "Android{" +
                "m_andoird_os=" + m_andoird_os +
                "} " + super.toString();
    }


}
