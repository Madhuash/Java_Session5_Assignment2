

	public class Building {
		String color;		   
		   int size;
		void attributes() {
		      System.out.println("Color : " + color);		   
		      System.out.println("Size : " + size);
		   }
	    }

	class Banglow extends Building{
		
	int rooms;
		void attributesBunglow() {
		      // The subclass refers to the members of the superclass
		      System.out.println("Color of Car : " + color);
		      System.out.println("Size of Car : " + size);
		      System.out.println("No of Rooms of House : " + rooms);
		}
	}
		
		class Flat extends Building{
			
			int floor;
				void attributesFlat() {
				      // The subclass refers to the members of the superclass
				      System.out.println("Color of Car : " + color);
				      System.out.println("Size of Car : " + size);
				      System.out.println("Floor of the Flat : " + floor);
				}		
	}
	