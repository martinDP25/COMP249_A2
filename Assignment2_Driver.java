
public class Assignment2_Driver {

	public static void main(String[] args) {

		CityBus city = new CityBus();
		Tram tr = new Tram();
		Tram tr0 = new Tram(10.0, 15, 55555, 2005, "Red Line", "Freddy", 100);
		Ferry fer = new Ferry();
		Metro met = new Metro();
		
		System.out.println(city);
		System.out.println(tr);
		System.out.println(tr0);
		System.out.println(fer);
		System.out.println(met);
		
		System.out.println(tr.equals(tr0));
	}

}
