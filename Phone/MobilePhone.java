package com.app;

public class MobilePhone {
    protected String m_color;
    protected float m_size;
    
    public MobilePhone(String m_color, float m_size) {
    this.m_color = m_color;
    this.m_size = m_size;
}

    @Override
    public String toString() {
        return "MobilePhone{" +
                "m_color='" + m_color + '\'' +
                ", m_size=" + m_size +
                '}';
    }
}
