/**
 * 
 */
package heap;

/**
 * @author nilso
 *
 */
public interface interfaceheap {
	public int size();
	public boolean isEmpty();
	public void removeMin();
	public void insert(Object o);
	public int min();
	public void downheap();
	public void upheap();
}
