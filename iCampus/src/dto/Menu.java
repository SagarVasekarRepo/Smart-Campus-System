package dto;

public class Menu 
{
	
public int id;
	
public String name;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String price;

public static int counter=0;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPrice() {
	return price;
}

public void setPrice(String price) {
	this.price = price;
}

}
