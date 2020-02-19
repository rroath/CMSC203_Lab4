
public class Television {
	/** 
	*The purpose of this class is to model a television 
	*Richard Roath 2/19/20 
	*/
	
		String MANUFACTURER;
		int SCREEN_SIZE;
		Boolean powerOn;
		int channel;
		int volume;

	/**
	*The purpose of this constructor is to bring in information
	*and initializes the default for variables
	*/
	public Television(String MANUFACTURER, int SCREEN_SIZE)
	{
		this.MANUFACTURER=MANUFACTURER;
		this.SCREEN_SIZE=SCREEN_SIZE;
		powerOn=false;
		channel=2;
		volume=20;
	}

	//access methods

	/**
	 * @return	The volume number
	 */
	public int getVolume(){
	return volume;
	}
	
	/**
	 * @return	The channel number
	 */
	public int getChannel(){
	return channel;
	}
	
	/**
	 * @return	The manufacturer brand
	 */
	public String getManufacturer(){
	return MANUFACTURER;
	}

	/**
	 * @return	The screen size
	 */
	public int getScreenSize(){
	return SCREEN_SIZE;
	}


	//mutated methods

	/**
	 * @param channel	Updates the channel number for the instance
	 */
	public void setChannel(int channel){
		this.channel=channel;
	}
	
	/**
	 * Turns the power off when it's on or on when it's off
	 */
	public void power(){
		powerOn=!powerOn;
	}
	
	/**
	 * Increases the volume by 1
	 */
	public void increaseVolume(){
		volume+=1;
	}
	
	/**
	 * Decreases the volume by 1
	 */
	public void decreaseVolume(){
		volume-=1;
	}


}

