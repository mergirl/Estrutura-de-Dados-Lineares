package Dicionário;

public interface InterfaceDi {
	public void insertItem(int k);
	public int removeElement(int k) throws HashException;
	public int findElement(int k) throws HashException;
	public void display();
}
