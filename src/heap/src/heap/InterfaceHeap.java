/**
 * 
 */
package heap;

/**
 * @author nilso
 *
 */
public interface InterfaceHeap {
	public int size();
	public boolean isEmpty();
	public void removeMin();
	public void insert(Object o);
	public Object min();
	public void downheap();
	public void upheap();
	public void display();
}