package mainList;

import java.util.Iterator;

import listInterfes.EList;




public class AList0  implements EList
{	
	int[] arr = new int[0];

	/**
	 * ---------------------------------Metod clear
	 */
	
	@Override
	public void clear()
	{
		arr = new int[0];
	}

	/**
	 * ---------------------------------Metod init
	 */
	
	@Override
	public void init(int[] ini)
	{
		if(ini == null){
			ini = new int[0];
		}
		arr = new int[ini.length];
		for (int i = 0; i < ini.length; i++)
		{
			arr[i] = ini[i];
		}
	}

	/**
	 * ---------------------------------Metod toArrya.....................
	 */
	
	@Override
	public int[] toArray() 
	{
		int[] ret = new int[arr.length];
		for (int i = 0; i < arr.length; i++)
		{
			ret[i] = arr[i];
		}
		return ret;
	}

	/**
	 * ---------------------------------Metod Size
	 */
	
	@Override
	public int size()
	{
		return arr.length;
	}

	/**
	 * ---------------------------------Metod addStart
	 */
	
	@Override
	public void addStart(int val) 
	{
		int[] tmp = new int[arr.length + 1];

		for ( int i = 1; i < tmp.length; i++)
		{
			tmp[i] = arr[i - 1];
		}
		tmp[0] = val;
		arr = tmp;
	}

	/**
	 * ------------------------------------------Metod toString
	 */
	
	@Override
	public String toString()
	{
		String str = "";
		for (int i = 0; i < arr.length; i++) {
			str += arr[i];
			if(i < arr.length -1 )
			{
				str += ",";
			}
		}
		return str;
	}
	
	/**
	 * ------------------------------------------Metod Print
	 */
	
	@Override
	public void print()
	{
		for (int i=0; i < arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}

		System.out.println();
	}

	/**
	 * ---------------------------------Metod addEnd
	 */
	
	@Override
	public void addEnd(int val) {
		int[] tmp = new int[arr.length + 1];
		for (int i = 0; i < arr.length; i++)
		{
			tmp[i] = arr[i];
		}
		tmp[arr.length] = val;
		arr = tmp;
	}

	/**
	 * ---------------------------------Metod addPos
	 */
	
	@Override
	public void addPos(int pos, int val) {
		if(pos < 0 || pos > arr.length)
		{
			throw new IllegalArgumentException();
		}
		int[] tmp = new int[arr.length + 1];

		for ( int i = 0; i < pos; i++)
		{
			tmp[i] = arr[i];
		}
		tmp[pos] = val;

		for (int i = pos + 1; i < tmp.length; i++) {
			tmp[i] = arr[i - 1];
		}
		arr = tmp;

	}

	/**
	 * ---------------------------------Metod delStart
	 */
	
	@Override
	public int delStart() {
		if(arr.length == 0){
			throw new IllegalArgumentException();
		}
		int res = arr[0];
		int[] tmp = new int[arr.length - 1];
		for ( int i = 0; i < tmp.length; i++)
		{
			tmp[i] = arr[i + 1];
		}
		arr = tmp;
		return res;
	}

	/**
	 * ---------------------------------Metod delEnd
	 */
	
	@Override
	public int delEnd() {
		if(arr.length == 0 ){
			throw new ArrayIndexOutOfBoundsException();
		}
		int res = arr[arr.length - 1];
		int[] tmp = new int[arr.length - 1];
		for ( int i = 0; i < tmp.length; i++)
		{
			tmp[i] = arr[i];
		}
		arr = tmp;
		return res;
	}

	/**
	 * ---------------------------------Metod delPos
	 */
	
	@Override
	public int delPos(int pos) {
		if(arr.length == 0 || pos < 0 || pos >= arr.length ){
			throw new IllegalArgumentException();
		}
		int res = arr[pos];
		int tmp []= new int [arr.length-1];

		for (int i = 0; i < pos; i++)
		{
			tmp[i] = arr[i];
		}
		for (int i = pos; i < tmp.length; i++) {
			tmp[i] = arr[ i + 1];
		}
		arr = tmp;
		return res;
	}

	/**
	 *-------------------------------------------Metod Min
	 */
	
	@Override
	public int min() {
		if(arr.length == 0){
			throw new IllegalArgumentException();
		}
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(min > arr[i]){
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
		if(arr.length == 0){
			throw new IllegalArgumentException();
		}
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(max < arr[i]){
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
		int indexMin = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < arr[indexMin]){
				indexMin = i;
			}

		}
		return indexMin;
	}

	/**
	 * ------------------------------------------Metod maxPos
	 */
	
	@Override
	public int maxPos() {
		int indexMax = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > arr[indexMax]){
				indexMax = i;
			}
		}
		return indexMax;
	}

	/**
	 * ------------------------------------------Metod sort
	 */
	
	@Override
	public void sort() {
		if(arr.length == 0){
			throw new IllegalArgumentException();
		}
		for (int i = arr.length - 1; i>=1; i--)
		{
			for (int j = 0; j <i; j++)
			{
				if (arr[j]>arr[j + 1])
				{
					int buf = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = buf;
				}
			}
		}
	}

	/**
	 * ------------------------------------------Metod reverse
	 */
	
	@Override
	public void reverse() {
		if (arr.length == 0){
			throw new IllegalArgumentException();
		}
		for (int i = 0; i < arr.length / 2; i++)
		{
			int tmp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = tmp;
		}
	}

	/**
	 * ------------------------------------------Metod halfReverse
	 */
	
	@Override
	public void halfReverse() {
		int tmp = 0;
		int d = (arr.length % 2 == 0) ? 0 : 1;
		for (int i = 0; i < arr.length / 2; i++)
		{
			tmp = arr[i];
			arr[i] = arr[arr.length / 2 + i + d];
			arr[arr.length / 2 + i + d] = tmp;
		}
	}

	/**
	 * ------------------------------------------Metod get
	 */
	
	@Override
	public int get(int pos) {
		if( pos < 0 || pos >= arr.length )
		{
			throw new IllegalArgumentException();
		}
		int pas = arr[pos];
		return pas;
	}

	/**
	 * ------------------------------------------Metod set
	 */
	
	@Override
	public void set(int pos, int val) {
		if( pos < 0 || pos >= arr.length )
		{
			throw new IllegalArgumentException();
		}
		arr[pos] = val;
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
		int i = 0;
		int[] arr;

		public MyIter(int[] arr)
		{
			this.arr = arr;

		}
		@Override
		public boolean hasNext() {

			return i < arr.length;
		}

		@Override
		public Integer next() {
			return arr[i++];
		}
	}
}
