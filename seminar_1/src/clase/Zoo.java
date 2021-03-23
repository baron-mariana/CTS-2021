package clase;
import java.util.ArrayList; 
import java.util.List;

public class Zoo {
	
	private Zookeeper zookeeper;
	private List<Animal> anaimalList;
	private List<Animal> animalList;
	
	public Zoo() {
		this.animalList=new ArrayList<>();
		this.zookeeper=new Zookeeper("Ion");
		
		
	}
	public Zoo(Zookeeper zookeeper, List<Animal> animalList) {
	    this.zookeeper = zookeeper;
		this.animalList = animalList;
	}
	
	public void adaugaAnimal(Animal animal)
	{
		animalList.add(animal );
		
	}
	public void feedAnimals()
	{
		for(Animal animal:animalList) {
			zookeeper.feed(animal);
		}
	}

}
