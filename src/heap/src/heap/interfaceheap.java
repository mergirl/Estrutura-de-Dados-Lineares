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
	public Object insert(Object o);
	public void min();
	public void downheap();
	public void upheap();
}
