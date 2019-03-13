package uno.utils;

public enum Type {
	
	RED_0 ("/uno/images/red_0_9.png",0,0,79),
	RED_1 ("/uno/images/red_0_9.png",1,79,159),
	RED_2 ("/uno/images/red_0_9.png",2,159,240),
	RED_3 ("/uno/images/red_0_9.png",3,240,318),
	RED_4 ("/uno/images/red_0_9.png",4,318,397),
	RED_5 ("/uno/images/red_0_9.png",5,397,476),
	RED_6 ("/uno/images/red_0_9.png",6,0,0),
	RED_7 ("/uno/images/red_0_9.png",7,0,0),
	RED_8 ("/uno/images/red_0_9.png",8,0,0),
	RED_9 ("/uno/images/red_0_9.png",9,0,0),
	RED_PLUS_TWO ("",-1,0,0),
	RED_BLOCK ("",-1,0,0),
	RED_REVERSE ("",-1,0,0),
	
	BLUE_0 ("/uno/images/blue_0_9.png",0,0,0),
	BLUE_1 ("/uno/images/blue_0_9.png",1,0,0),
	BLUE_2 ("/uno/images/blue_0_9.png",2,0,0),
	BLUE_3 ("/uno/images/blue_0_9.png",3,0,0),
	BLUE_4 ("/uno/images/blue_0_9.png",4,0,0),
	BLUE_5 ("/uno/images/blue_0_9.png",5,0,0),
	BLUE_6 ("/uno/images/blue_0_9.png",6,0,0),
	BLUE_7 ("/uno/images/blue_0_9.png",7,0,0),
	BLUE_8 ("/uno/images/blue_0_9.png",8,0,0),
	BLUE_9 ("/uno/images/blue_0_9.png",9,0,0),
	BLUE_PLUS_TWO ("",-1,0,0),
	BLUE_BLOCK ("",-1,0,0),
	BLUE_REVERSE ("",-1,0,0),
	
	GREEN_0 ("/uno/images/green_0_9.png",0,0,0),
	GREEN_1 ("/uno/images/green_0_9.png",1,0,0),
	GREEN_2 ("/uno/images/green_0_9.png",2,0,0),
	GREEN_3 ("/uno/images/green_0_9.png",3,0,0),
	GREEN_4 ("/uno/images/green_0_9.png",4,0,0),
	GREEN_5 ("/uno/images/green_0_9.png",5,0,0),
	GREEN_6 ("/uno/images/green_0_9.png",6,0,0),
	GREEN_7 ("/uno/images/green_0_9.png",7,0,0),
	GREEN_8 ("/uno/images/green_0_9.png",8,0,0),
	GREEN_9 ("/uno/images/green_0_9.png",9,0,0),
	GREEN_PLUS_TWO ("",-1,0,0),
	GREEN_BLOCK ("",-1,0,0),
	GREEN_REVERSE ("",-1,0,0),
	
	YELLOW_0 ("/uno/images/yellow_0_9.png",0,0,0),
	YELLOW_1 ("/uno/images/yellow_0_9.png",1,0,0),
	YELLOW_2 ("/uno/images/yellow_0_9.png",2,0,0),
	YELLOW_3 ("/uno/images/yellow_0_9.png",3,0,0),
	YELLOW_4 ("/uno/images/yellow_0_9.png",4,0,0),
	YELLOW_5 ("/uno/images/yellow_0_9.png",5,0,0),
	YELLOW_6 ("/uno/images/yellow_0_9.png",6,0,0),
	YELLOW_7 ("/uno/images/yellow_0_9.png",7,0,0),
	YELLOW_8 ("/uno/images/yellow_0_9.png",8,0,0),
	YELLOW_9 ("/uno/images/yellow_0_9.png",9,0,0),
	YELLOW_PLUS_TWO ("",-1,0,0),
	YELLOW_BLOCK ("",-1,0,0),
	YELLOW_REVERSE ("",-1,0,0),
	
	COLOR ("",-1,0,0),
	PLUS_FOUR ("",-1,0,0);
	
	private String link;
	private int number;
	private int location1;
	private int location2;
	
	Type(String link, int number, int loc1, int loc2) {
		this.link = link;
		this.number = number;
		this.location1 = loc1;
		this.location2 = loc2;
	}
	
	public String getLink() {
		return link;
	}
	
	public int getNumber() {
		return number;
	}
	
	public int getLocation1() {
		return location1;
	}

	public int getLocation2() {
		return location2;
	}
}
