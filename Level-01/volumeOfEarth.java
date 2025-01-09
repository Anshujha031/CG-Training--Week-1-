class volumeOfEarth{
	public static void main(String[] args){
		double radius = 6378;
		double volKm = ((4/3)* 3.14 * (radius * radius * radius));
		double radiusInMiles = radius * 0.62;
		double volInMiles = (4/3) * 3.14 * (radiusInMiles * radiusInMiles * radiusInMiles);
		System.out.println("The volume of earth in cubic kilometer is " + volKm + " and cubic miles is " + volInMiles);
	}
}	