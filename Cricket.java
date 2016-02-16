class Cricket{
	private String team;
	private String captain;

	public Cricket (String teamName,String captainName){
		this.team = teamName;
		this.captain = captainName;
	} 

	public void teamInfo(){
		System.out.println("Team "+this.team+ " which Captain is "+this.captain);
	}

	public void iccRating(int num){
		System.out.println("has ICC rating in the world "+num+"and");
	}

	public void hasWorldCup(int total){
		System.out.println("won world cup "+total+" times");
	}	
}