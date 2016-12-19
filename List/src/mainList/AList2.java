package mainList;

import java.util.Iterator;

import listInterfes.EList;
import mainList.AList1.MyIter;

/**
 * Created by Yura on 21.05.2016.
 */
public class AList2 implements EList
{

	int[] arr = new int[30];
	int start = arr.length / 2;
	int end = arr.length / 2;

	/**
	 * ---------------------------------Metod clear
	 */

	@Override
	public void clear() {

		start = arr.length / 2;
		end = arr.length / 2;
	}

	/**
	 * ---------------------------------Metod init
	 */

	@Override
	public void init(int[] ini) {
		if (ini == null)
			ini = new int[0];
		start = arr.length / 2 - ini.length / 2;
		end = start + ini.length;
		for (int i = 0; i < ini.length; i++) {
			arr[start + i] = ini[i];
		}
	}

	/**
	 * ---------------------------------Metod toArrya.....................
	 */

	@Override
	public int[] toArray() {
		int[] tmp = new int[size()];
		for (int i = 0; i < size(); i++)
		{
			tmp[i] = arr[start + i];
		}
		return tmp;
	}

	/**
	 * ---------------------------------Metod Size
	 */

	@Override
	public int size() {
		return end - start;
	}

	/**
	 * ---------------------------------Metod addStart
	 */

	@Override
	public void addStart(int val) {
		arr[--start] = val;
	}

	/**
	 * ------------------------------------------Metod Print
	 */
	
	@Override
	public void print(){
		for (int i=0; i < arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}     
	}

	/**
	 * ------------------------------------------Metod toString
	 */

	@Override
	public String toString() 
	{

		String str = "";

		for (int i = start; i < end; i++)
		{
			str += arr[i];
			if (i < end - 1)
				str += ",";
		}
		return str;
	}

	/**
	 * ---------------------------------Metod addEnd
	 */
	
	@Override
	public void addEnd(int val) {
		arr[end] = val;
		end++;
	}
	
	/**
	 * ---------------------------------Metod addPos
	 */
	
	@Override
	public void addPos(int pos, int val) {
		
		if (pos < 0 || pos> size())
		{
			addStart(val);
		}
		for (int i = end; i>start+pos; i--)
		{
			arr[i] = arr[i-1];
			//			arr[i+1] = arr[i];
		}
		end++;
		arr[start+pos]=val;
	}
	
	/**
	 * ---------------------------------Metod delStart
	 */
	
	@Override
	public int delStart() {
		if (size() == 0)
		{
			throw new IllegalArgumentException();
		}
		int delValue = arr[start];
		start++;
		return delValue;
	}

	/**
	 * ---------------------------------Metod delEnd
	 */
	
	@Override
	public int delEnd() {
		if (size() == 0)
		{
			throw new IllegalArgumentException();
		}
		int delValue = arr[end - 1];
		end--;
		return delValue;
	}

	/**
	 * ---------------------------------Metod delPos
	 */
	
	@Override
	public int delPos(int pos) {
		if (pos < 0 || pos >= size())
		{
			throw new IllegalArgumentException();
		}
		int delValue = arr[start + pos];
		if (start + pos < arr.length / 2)
		{
			for (int i = start; i < start + pos; i++)
			{
				arr[start + i] = arr[start - 1 + i];
			}
			start++;
		}
		else
		{
			for (int i = start + pos; i < end - 1; i++)
			{
				arr[i] = arr[i + 1];
			}
			end--;
		}
		return delValue;
	}

	/**
	 *-------------------------------------------Metod Min
	 */
	
	@Override
	public int min() {
		if (size() == 0)
		{
			throw new IllegalArgumentException();
		}
		int min = arr[start];
		for (int i = start + 1; i < end; i++)
		{
			if (min > arr[i])
			{
				min = arr[i];
			}
		}
		return min;
	}

	/**
	 * ------------------------------------------Metod Max
	 */
	
	@Override
	public int max() {
		if (size() == 0)
		{
			throw new IllegalArgumentException();
		}
		int max = arr[start];
		for (int i = start + 1; i < end; i++)
		{
			if (max < arr[i])
			{
				max = arr[i];
			}
		}
		return max;
	}

	/**
	 * ------------------------------------------Metod minPos
	 */
	
	@Override
	public int minPos() {
		if (size() == 0)
		{
			throw new IllegalArgumentException();
		}
		int minPos = start;
		for (int i = start + 1; i < end; i++)
		{
			if (arr[minPos] > arr[i])
			{
				minPos = i;
			}
		}
		return minPos - start;
	}

	/**
	 * ------------------------------------------Metod maxPos
	 */
	
	@Override
	public int maxPos() {
		if (size() == 0)
		{
			throw new IllegalArgumentException();
		}
		int maxPos = start;
		for (int i = start + 1; i < end; i++)
		{
			if (arr[maxPos] < arr[i])
			{
				maxPos = i;
			}
		}
		return maxPos - start;
	}

	/**
	 * ------------------------------------------Metod sort
	 */
	
	@Override
	public void sort() {
		for (int i = 0; i < size() - 1; i++)
		{
			for (int j = 0; j < size() - 1; j++)
			{
				if (arr[start + j] > arr[start + j + 1])
				{
					int tmp = arr[start + j];
					arr[start + j] = arr[start + j + 1];
					arr[start + j + 1] = tmp;
				}
			}
		}
	}

	/**
	 * ------------------------------------------Metod reverse
	 */
	
	@Override
	public void reverse() {
		int tmp = 0;
		for (int i = 0; i < size() / 2; i++)
		{
			tmp = arr[start + i];
			arr[start + i] = arr[end - 1 - i];
			arr[end - 1 - i] = tmp;
		}
	}

	/**
	 * ------------------------------------------Metod halfReverse
	 */
	
	@Override
	public void halfReverse() {
		int tmp = 0;
		int d = (size() % 2 == 0) ? 0 : 1;
		for (int i = 0; i < size() / 2; i++)
		{
			tmp = arr[start + i];
			arr[start + i] = arr[start + size() / 2 + i + d];
			arr[start + size() / 2 + i + d] = tmp;
		}
	}

	/**
	 * ------------------------------------------Metod get
	 */
	
	@Override
	public int get(int pos) {
		if (pos < 0 || pos >= size())
		{
			throw new IllegalArgumentException();
		}
		return arr[start + pos];
	}

	/**
	 * ------------------------------------------Metod set
	 */
	
	@Override
	public void set(int pos, int val) {
		if (pos < 0 || pos >= size())
		{
			throw new IllegalArgumentException();
		}
		arr[start + pos] = val;
	}
	
	/**
	 * ------------------------------------------Metod iterator
	 */
	@Override
	public Iterator<Integer> iterator() {

		return new MyIter(arr);
	}
	class MyIter implements Iterator<Integer>
	{
		int i = start;
		int[] ar = null;

		public MyIter(int[] ar) {
			this.ar = ar;

		}
		@Override
		public boolean hasNext() {

			return i < end;
		}

		@Override
		public Integer next() {
			int ret = ar[i];
			i++;
			return ret;
		}

	}
}
