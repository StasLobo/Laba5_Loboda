package Loboda.db;

public class DatabaseExeption extends Exception {

	public DatabaseExeption(Exception e) {
		super(e);
	}
	public DatabaseExeption(String string) {
		super(string);
	}
}
