package ex03;

public class Person {
	String _name;
	String _adress;
	
	public Person(String name, String adress) {
		this._name = name;
		this._adress = adress;
	}
	public String getName() {
		return _name;
	}
	public String getAdress() {
		return _adress;
	}
	public void setAdress(String adress) {
		this._adress = adress;
	}
	public String toString() {
		String txt = String.format("Author[Name = %s, Adress = %s]", _name, _adress);
		return txt; 
	}
}
