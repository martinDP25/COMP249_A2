
public class PublicTransportation {

	double ticketPrice;
	int numStops;
	
	//Default Constructor
	public PublicTransportation()
	{
		ticketPrice=10.0;
		numStops=15;
	}
	
	//Parameterized Constructor
	public PublicTransportation(double tP, int nS)
	{
		ticketPrice=tP;
		numStops=nS;
	}
	
	//Copy Constructor
	public PublicTransportation(PublicTransportation pubTran)
	{
		ticketPrice=pubTran.ticketPrice;
		numStops=pubTran.numStops;
	}
}

//CityBus class inherits from PublicTransportation class.
class CityBus extends PublicTransportation {
	
	long routeNum;
	int beginOpYear;
	String lineName, driverName;
	
	//Default Constructor
	public CityBus() 
	{
		
		routeNum=55555;
		beginOpYear=2005;
		lineName="Red Line";
		driverName="Freddy";
	}
	
	//Parameterized Constructor
	public CityBus(double tP, int nS, long rN, int bOY, String lN, String dN) 
	{
		super(tP, nS);

		routeNum=rN;
		beginOpYear=bOY;
		lineName=lN;
		driverName=dN;
	}
	
	//Copy Constructor
	public CityBus(CityBus cityB)
	{
		routeNum=cityB.routeNum;
		beginOpYear=cityB.beginOpYear;
		lineName=cityB.lineName;
		driverName=cityB.driverName;
	}
	
	public boolean equals(Object obj)
	{
		if(obj==null)
		{
			return false;
		}
		if(obj instanceof Tram)
		{
			CityBus cityObj = (CityBus) obj;
			if(this.ticketPrice==cityObj.ticketPrice && this.numStops==cityObj.numStops && this.routeNum==cityObj.routeNum && this.beginOpYear==cityObj.beginOpYear && this.lineName==cityObj.lineName && this.driverName==cityObj.driverName)
			{
				return true;
			}
		}
		
		return false;
	}
	
	public String toString()
	{
		return ("City Bus Information \n\nCosts: " + ticketPrice + "\nStops: " + numStops + "\nBegan Operation: " + beginOpYear + "\nRoute Number: " + routeNum + "\nLine name: " + lineName + "\nDrivers name: " + driverName + "\n");
	}
}

//Tram class inherits from CityBus class.
class Tram extends CityBus {
	
	int maxSpeed;
	
	//Default Constructor
	public Tram()
	{
		maxSpeed=100;
	}
	
	//Parameterized Constructor
	public Tram(double tP, int nS, long rN, int bOY, String lN, String dN, int mS)
	{
		super(tP, nS, rN, bOY, lN, dN);
		
		maxSpeed=mS;
	}
	
	//Copy Constructor
	public Tram(Tram t)
	{
		maxSpeed=t.maxSpeed;
	}
	
	public boolean equals(Object obj)
	{
		if(obj==null)
		{
			return false;
		}
		if(obj instanceof Tram)
		{
			Tram tramObj = (Tram) obj;
			if(this.maxSpeed==tramObj.maxSpeed && this.ticketPrice==tramObj.ticketPrice && this.numStops==tramObj.numStops && this.routeNum==tramObj.routeNum && this.beginOpYear==tramObj.beginOpYear && this.lineName==tramObj.lineName && this.driverName==tramObj.driverName)
			{
				return true;
			}
		}
		
		return false;
	}
	
	public String toString()
	{
		return ("Tram Information \n\nMax Speed: " + maxSpeed + " km/h\nCosts: " + ticketPrice + "\nStops: " + numStops + "\nBegan Operation: " + beginOpYear + "\nRoute Number: " + routeNum + "\nLine name: " + lineName + "\nDrivers name: " + driverName + "\n");
	}
	
}

//Metro class inherits from CityBus class.
class Metro extends CityBus {
	
	int numVehicles;
	String cityName;
	
	//Default Constructor
	public Metro()
	{
		numVehicles=10;
		cityName="San Francisco";
	}
	
	//Parameterized Constructor
	public Metro(double tP, int nS, long rN, int bOY, String lN, String dN, int nV, String cN)
	{
		super(tP, nS, rN, bOY, lN, dN);
		
		numVehicles=nV;
		cityName=cN;
	}
	
	//Copy Constructor
	public Metro(Metro m)
	{
		numVehicles=m.numVehicles;
		cityName=m.cityName;
	}
	
	public boolean equals(Object obj)
	{
		if(obj==null)
		{
			return false;
		}
		if(obj instanceof Tram)
		{
			Metro metroObj = (Metro) obj;
			if(this.numVehicles==metroObj.numVehicles && this.cityName==metroObj.cityName && this.ticketPrice==metroObj.ticketPrice && this.numStops==metroObj.numStops && this.routeNum==metroObj.routeNum && this.beginOpYear==metroObj.beginOpYear && this.lineName==metroObj.lineName && this.driverName==metroObj.driverName)
			{
				return true;
			}
		}
		
		return false;
	}
	
	public String toString()
	{
		return ("Metro Information \n\nCosts: " + ticketPrice + "\nStops: " + numStops + "\nBegan Operation: " + beginOpYear + "\nRoute Number: " + routeNum + "\nLine name: " + lineName + "\nDrivers name: " + driverName + "\nCity Name: " + cityName + "\nNumber of Vehicles: " + numVehicles + "\n");
	}
}

//Ferry class inherits from PublicTransportation class.
class Ferry extends PublicTransportation {
	
	int buildYear;
	String shipName;
	
	//Default Constructor
	public Ferry()
	{
		buildYear=1995;
		shipName="Floating Apple";
	}
	
	//Parameterized Constructor
	public Ferry(double tP, int nS, int bY, String sN)
	{
		super(tP, nS);
		
		buildYear=bY;
		shipName=sN;
	}
	
	//Copy Constructor
	public Ferry(Ferry f)
	{
		buildYear=f.buildYear;
		shipName=f.shipName;
	}
	
	public String toString()
	{
		return ("Ferry Information \n\nCosts: " + ticketPrice + "\nStops: " + numStops + "\nBegan Operation: " + buildYear + "\nShip Name: " + shipName + "\n");
	}
}

class Aircraft extends PublicTransportation {
	
	enum classType {
		Helicopter, Airline, Glider, Balloon
	}
	enum maintenanceType {
		Weekly, Monthly, Yearly
	}
	
	public Aircraft()
	{
		
	}
	
}