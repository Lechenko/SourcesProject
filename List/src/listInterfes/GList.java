package listInterfes;

public interface GList<T>
{
	 public void clear();
	    public void init (T[]ini);
	    public T[] toArray();
	    public String toString();
	    public int size();
	    public void print();

	    public void addStart(T val);
	    public void addEnd(T val);
	    public void addPos(int pos, T val);
	    public T delStart();
	    public T delEnd();
	    public T delPos(int pos);

	    public T min();
	    public T max();
	    public int minPos();
	    public int maxPos();

	    public void sort();
	    public void reverse();
	    public void halfReverse();

	    public T get(int pos);
	    public void set(int pos, T val);

}
