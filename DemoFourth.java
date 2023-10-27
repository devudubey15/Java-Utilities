// 4) create two classes
// 	Engine
// 		private int speed
// 		private String type
// 			setters and getters

// 	Car
// 		private Engine engine;
// 		private String modelname;
// 			setters and getters

// define class "Demo" with main
// 	inside main create object of Car and then pass Engine to its setEngine method.
// 	now serialize this object of Car and deserialize it.
import java.io.*;

class Engine implements Serializable 
{
	private int speed;
	private String type;

	void setterEngine( String type,int speed)
	{
		this.speed = speed;
		this.type = type;
		System.out.println("inside the setter");
	}
	int getSpeed()
	{
		System.out.println("inside getspeed");
		return this.speed;
	}
	String getType()
	{
		System.out.println("inside getType");
		return this.type;
	}

	public String toString()
	{
		return " Engine_Top_Speed : " + this.speed + ", EngineType : " + this.type ;
	}

}
class Car implements Serializable{
	private Engine engine;
 	private String modelname;

	void setterCar(Engine engine, String modelname)
	{
		this.engine = engine;
		this.modelname = modelname;
		System.out.println("inside SetterCar");
	}
	Engine getEngine()
	{
		System.out.println("inside GetEngine");
		return this.engine;
	}
	String getModelname()
	{
		System.out.println("inside GetModelName");
        return this.modelname;
	}
	public String toString()
	{
		return "[ Car: " +" Model: " + this.getModelname() +", " + this.getEngine() + "]"; 
	}
}
// define class "Demo" with main
// 	inside main create object of Car and then pass Engine to its setEngine method.
// 	now serialize this object of Car and deserialize it.
public class DemoFourth
{
	public static void main(String args[])
	{
		Car car = new Car();
		Engine engine = new Engine();
		engine.setterEngine("1.4 L Smartstream G1.4 T", 200);
		car.setterCar(engine,"creta sx");
		String path = "C://Users//Satyakam//OneDrive//Dev//OneDrive//Documents//c-dac//nitin_sir//java//Day_13//day13_ccode//Abc_13_4.txt";
		try{
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(car);
			System.out.println("object stored inside the file ");
			oos.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		try{
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream Ois = new ObjectInputStream(fis);
			Car c =(Car) Ois.readObject();
			System.out.println(c);
			Ois.close();

		}
		catch(IOException | ClassNotFoundException |ClassCastException e)
		{
			e.printStackTrace();
		}

	}
}