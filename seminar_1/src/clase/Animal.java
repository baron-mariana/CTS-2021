package clase;

public abstract  class Animal {  //nu poate fi instantiata, poate mosteni si poate fi mostanita--pt abstract..sa fie mostenita intr-o clasa concreta
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Animal(String name) {
		super();
		this.name = name;
	}

}
