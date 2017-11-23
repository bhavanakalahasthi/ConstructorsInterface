
public class Television implements InterTelevision{
// states - fields
int channel;
int volume;
int mute;
String play;
int on;
//default constructor


//parameterized constructor
public Television(int channel,int volume,int mute,String play,int on){
	this.channel=channel;
	this.volume=volume;
	this.mute=mute;
	this.play=play;
	this.on=on;
	
}

//methods - behaviors
//method 1 to make changes to volume and channel the condition to satisfy
public void toOperate(int newValue1)
{
	if(newValue1==1)
	{
		on=newValue1;
		System.out.println("its automated" +on);
		}
	else
	{
		System.err.println("switch off");
	}
}
//method 2(to change channel)
public void changeChannel(int newValue){
	if(newValue>1 && newValue<=100)
	{
        channel=newValue;
        System.out.println("the channel changed to" +channel);
        
        
} else
{
	System.err.println("invalid request. Please enter valid channel number");
}
}
//method 3(to change volume)
public void increaseVolume(int newValue){
	if(newValue>=volume)
	{
		volume=volume+newValue;	
		System.out.println("volume" +volume);
	}
	
}
//to mute 
public void increaseVolume(int newValue,String play){
    if(this.play==play)
    {
   
	if(newValue<1)
	{
		System.out.println("It is muted... volume now is 0\n");
	}
	else
	{
		volume=volume+newValue;
	}
    }
	}

//print details
void printStatus()
{
	System.out.println("Successfully updated the changes");
}


}