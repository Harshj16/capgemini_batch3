package withenum01.enumerator;

public enum Currency {

	PENNY(1){

		@Override
		public String color() {
			return "Copper";
		}}, 
	NICKLE(5){

		@Override
		public String color() {
			
			return "Bronze";
		}}, 
	
	DIME(10){

		@Override
		public String color() {
			
			return "Silver";
		}}, 
	QUARTER(25){

			@Override
			public String color() {
				
				return "Silver";
			}};

	private int value;

	private Currency(int value) {
		this.value = value;
	}
	
	public abstract String color();
	
	@Override
	public String toString() {
		String finalValue = null;
		switch (this) {
		case PENNY:
			finalValue= "PENNY : "+value+":"+color();
			break;
		case NICKLE:
			finalValue= "NICKLE : "+value+":"+color();
			break;
		case DIME:
			finalValue= "DIME : "+value+":"+color();
			break;
		case QUARTER:
			finalValue= "QUARTER : "+value+":"+color();
			break;
		default:
			break;
		}
		return finalValue;
	}
}
