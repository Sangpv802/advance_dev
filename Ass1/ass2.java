class TV {
    int channel = 1;
    int volumneLevel = 1;
    boolean on = false;
    public TV(){}

    public void turnOn()
    {
        on = true;
    }

    public void turnOff()
    {
        on = false;
    }

    public void setChennel(int newChannel)
    {
        if( on == true && newChannel >= 1 && newChannel <= 120)
        {
            channel = newChannel;
        }
        else
        {
            System.out.println("Error: TV is either OFF or invalid Channel");
        }
    }

    public void setVolume( int newVolumeLevel)
    {
        if( on == true && newVolumeLevel >= 1 && newVolumeLevel <= 7)
        {
            volumneLevel = newVolumeLevel;
        }
        else
        {
            System.out.println("Error: TV is either OFF or invalid Volume level");
        }
    }

    public void channelUp()
    {
        if( on == true && channel < 120 && channel >= 0 )
        {
            channel ++;
        }
        else
        {
            System.out.println("Error: TV is either OFF or increase invalid Channel");
        }
    }

    public void channeldown()
    {
        if( on == true && channel <= 120 && channel > 1 )
        {
            channel --;
        }
    }

    public void volumeUp()
    {
        if( on == true && volumneLevel < 7 && volumneLevel >= 0 )
        {
            volumneLevel ++;
        }
    }

    public void volumeDown()
    {
        if( on == true && volumneLevel <= 7 && volumneLevel > 1 )
        {
            volumneLevel --;
        }
    }

    public static void main(String[] args)
    {
        TV tv = new TV();
        tv.turnOn();
        tv.setChennel(130);
        tv.setVolume(3);
        System.out.println("Channel is: " + tv.channel + " Volume level is: " + tv.volumneLevel);
        tv.channelUp();
        tv.volumeUp();
        System.out.println("Channel is: " + tv.channel + " Volume level is: " + tv.volumneLevel);
        tv.turnOff();
        System.out.println("TV is turn off");
    }

}