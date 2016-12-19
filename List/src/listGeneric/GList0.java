package listGeneric;



import listInterfes.GList;

public class GList0<T> implements GList<T>
{
	
	Object[] arr = new Comparable[0];

	@Override
	public void clear() {
		arr = new Comparable[0];
		
	}

	@Override
	public void init(T[] ini) {
		if(ini == null){
			return;
		}
		arr = new Comparable[ini.length];
		for (int i = 0; i < ini.length; i++) {
			arr[i] = ini[i];
		}
		
	}

	@Override
	public T[] toArray() {
		Comparable[] tmp = new Comparable[arr.length];
		for (int i = 0; i < tmp.length; i++) {
			tmp[i] = (Comparable)arr[i];
		}
		return (T[])tmp;
	}
	
    @Override
	public String toString(){
    	String str = "";
    	for (int i = 0; i < arr.length; i++) {
    		str += arr[i];
    		if(i < arr.length -1){
    			str = ",";
			}
		}
		return str;
		
	}
	@Override
	public int size() {
		return arr.length;
	}

	@Override
	public void print() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();	
	}

	@Override
	public void addStart(T val) {
		Comparable[] tmp = new Comparable[arr.length + 1];
		for (int i = 0; i < tmp.length; i++) {
			tmp[i] = (Comparable)arr[i - 1];
		}
		tmp[0] = (Comparable)val;
		arr = tmp;
		
	}

	@Override
	public void addEnd(T val) {
		Comparable[] tmp = new Comparable[arr.length + 1];
		for (int i = 0; i < tmp.length; i++) {
			tmp[i] = (Comparable)arr[i];
		}
		tmp[arr.length] = (Comparable)val;
		arr = tmp;
	}

	@Override
	public void addPos(int pos, T val) {
		
		
	}

	@Override
	public T delStart() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T delEnd() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T delPos(int pos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T min() {
		return (T)arr[minPos()];
	}

	@Override
	public T max() {
		
		return (T)arr[maxPos()];
	}

	@Override
	public int minPos() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int maxPos() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void sort() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reverse() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void halfReverse() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T get(int pos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void set(int pos, T val) {
		// TODO Auto-generated method stub
		
	}
	
	

}
