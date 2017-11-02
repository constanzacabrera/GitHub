package Chap6Lab;

//The purpose of this class is to model a television
//Constanza Cabrera
//10.22.15


public class Television
{
    private String MANUFACTURER; 
    private int SCREEN_SIZE;
    private int volume = 20;
    private int channel = 2;
    private boolean powerOn = false;

    public Television(String brand, int size)
    {
        MANUFACTURER = brand;
        SCREEN_SIZE = size;
    }
    public void power()
    {
        if (powerOn==false)
            powerOn=true;
        else if (powerOn==true)
            powerOn=false;
    }
    public void increaseVolume()
    {
        volume+=1;
    }
    public void decreaseVolume()
    {
        volume-=1;
    }
    public int getChannel()
    {
        return channel;
    }
    public int getVolume()
    {
        return volume;
    }
    public String getManufacturer()
    {
        return MANUFACTURER;
    }
    public int getScreenSize()
    {
        return SCREEN_SIZE;
    }
    public void setChannel(int station)
    {
        channel = station;
    }
    public void power(boolean powerOn)
    {
        powerOn = !powerOn;
    }
    public void increaseVolume(int volume)
    {
        volume++;
    }
    public void decreaseVolume(int volume)
    {
        volume--;
    }
}