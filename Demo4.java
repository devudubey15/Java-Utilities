// create a parent class "Artist" with a member function "void perform()".
// now derive following child classes from "Artist"
// 	Actor,Singer and Musician and override "perform" in these classes to write the specific task.
// inside "Actor" class define one more method
// 	void changeGateUp()
// 	{
// 		S.o.p("as per the role demands");
// 	}

// now create a Demo class with main function.
// inside main function create array of "Artist" with size 3.
// store instances of the above child classes in it.
// Now traverse through the array and invoke "perform" of each child class.
//  In addition to this wherever "Actor" object is there inside the array , also perform "changeGateUp()" method.
class Artist
{
	void Perform()
	{
		System.out.println("Artist");
	}
}
class Actor extends Artist
{
	void Perform()
	{
		System.out.println("Actor");
	}
	void changeGateUp()
	{
		System.out.println("as per the role demands");
	}
}
class Singer extends Artist
{
	void Perform()
	{
		System.out.println("Singer");
	}
}
class Musician extends Artist
{
	void Perform()
	{
		System.out.println("Music");
	}
}
public class Demo4
{
	public static void main(String[] args)
	{
		Artist artist[] = new Artist[3];
		artist[0] = new Actor();
		artist[1] = new Singer();
		artist[2] = new Musician(); 

		for(int i=0; i<artist.length;i++)
		{
			artist[i].Perform();

			if(artist[i] instanceof Actor)
			{
				Actor ref = (Actor) artist[i];
				ref.changeGateUp();
			}
		}
	}
}