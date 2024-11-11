package edu.pitt.cs;

public class CatImpl implements Cat {

	private int catId;
	private String catName;
	private boolean catRented;

	public CatImpl(int id, String name) {
		catId = id;
		catName = name;
		catRented = false;
	}

	public void rentCat() {
		catRented = true;
	}

	public void returnCat() {
		catRented = false;
	}

	public void renameCat(String name) {
		catName = name;
	}

	public String getName() {
		return catName;
	}

	public int getId() {
		return catId;
	}

	public boolean getRented() {
		return catRented;
	}

	public String toString() {
		if (!catRented) return "ID " + catId + ". " + catName;
		return "";
	}

}