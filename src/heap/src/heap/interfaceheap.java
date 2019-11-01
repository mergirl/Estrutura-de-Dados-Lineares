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
	public void insert(int o);
	public Object min();
	public void downheap();
	public void upheap();
}
