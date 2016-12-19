package mainList;

import java.util.Iterator;

import listInterfes.EList;

/**
 * AList1 
 */
public class AList1 implements EList, Iterable<Integer> {

	int[] arr = new int[10];
	public int index = 0;

	/**
	 * ---------------------------------Metod clear
	 */
	
	@Override
	public void clear() {
		index = 0;
	}
	
	/**
	 * ---------------------------------Metod init
	 */
	
	@Override
	public void init (int[]ini) {
		if(ini == null || arr.length == 0){
			ini = new int[0];
		}
		for (int i = 0; i < ini.length; i++)
		{
			arr[i] = ini[i];
		}
		index = ini.length;

	}
	
	/**
	 * ---------------------------------Metod toArrya.....................
	 */
	
	@Override
	public int[] toArray() {
		int[] tmp = new int[index];
		for (int i = 0; i < index; i++)
		{
			tmp[i] = arr[i];
		}
		return tmp;
	}

	/**
	 * ------------------------------------------Metod Print
	 */
	
	public void print()
	{
		for (int i=0; i < index; i++)
		{
			System.out.print(arr[i]+" ");
		}

		System.out.println();
	}
	
	/**
	 * ------------------------------------------Metod toString
	 */
	
	@Override
	public String toString() {
		String text="";

		for(int i= 0 ;i < index;i++)
		{
			text += arr[i];
			if(i < index -1)
			{
			text += ",";
			}
			
		}
		return text;
		
	}
	
	/**
	 * ---------------------------------Metod Size
	 */
	
	@Override
	public int size()  {
		return index;
	}
	
	/**
	 * ---------------------------------Metod addStart
	 */
	
	@Override
	public void addStart(int val) {

		for (int i = index; i > 0; i--)
		{
			arr[i] = arr[i-1];
		}
		arr[0] = val;
		index++;
	}
	
	/**
	 * ---------------------------------Metod addEnd
	 */
	
	@Override
	public void addEnd(int val) {
		if(val == 0){
			throw new IllegalArgumentException();
		}
		arr[index++] = val;
	}
	
	/**
	 * ---------------------------------Metod addPos
	 */
	
	@Override
	public void addPos(int pos, int val){
		if(pos < 0 || pos > index)
		{
			throw new IllegalArgumentException();
		}
		for (int i = index; i > pos; i--) {
			arr[i] = arr[i - 1];
		}
		index++;
		arr[pos] = val;
	}
	
	/**
	 * ---------------------------------Metod delStart
	 */
	
	@Override
	public int delStart(){
		if( index == 0 )
		{
			throw new IllegalArgumentException();
		}
		int res = arr[0];
		for (int i = 0; i < index; i++)
		{
			arr[i] = arr[i + 1];
		}
		index--;
		return res;
	}
	
	/**
	 * ---------------------------------Metod delEnd
	 */
	
	@Override
	public int delEnd(){

		if( index == 0 )
		{
			throw new IllegalArgumentException();
		}
		int res = arr[--index];
		return res;
	}
	
	/**
	 * ---------------------------------Metod delPos
	 */
	
	@Override
	public int delPos(int pos){
		if(index == 0 || pos < 0 || pos >= index){
			throw new IllegalArgumentException();
		}
		int res = arr[pos];
		for(int i = pos; i < index - 1 ; i++)
		{
			arr[i] = arr[i + 1];
		}
		index--;
		return res;
	}
	
	/**
	 *-------------------------------------------Metod Min
	 */
	
	@Override
	public int min(){
		if(index == 0){
			throw new IllegalArgumentException();
		}
		int min = arr[0];
		for (int i = 1; i < index; i++) {
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
	public int max(){
		if(index == 0) {
			throw new IllegalArgumentException();
		}
		int max = arr[0];
		for (int i = 1; i < index; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	
	/**
	 * ------------------------------------------Metod minPos
	 */
	
	@Override
	public int minPos(){
		int min = 0;
		for (int i = 1; i < index; i++) {
			if(arr[i] < arr[min]){
				min = i;
			}
		}
		return min;
	}
	
	/**
	 * ------------------------------------------Metod maxPos
	 */
	
	@Override
	public int maxPos(){
		int max = 0;
		for (int i = 1; i < index; i++) {
			if(arr[i] > arr[max]){
				max = i;
			}
		}
		return max;
	}
	
	/**
	 * ------------------------------------------Metod sort
	 */
	
	@Override
	public void sort() {
		if(index == 0){
			throw new IllegalArgumentException();
		}
		for (int i = index-1; i>=1; i--)
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
	public void reverse(){
		if (index == 0){
			throw new IllegalArgumentException();
		}
		for (int i = 0; i < index / 2; i++)
		{
			int tmp = arr[i];
			arr[i] = arr[index - 1 - i];
			arr[index - 1 - i] = tmp;
		}
	}
	
	/**
	 * ------------------------------------------Metod halfReverse
	 */
	
	@Override
	public void halfReverse() {
		int tmp;
		int d = (index % 2 == 0) ? 0 : 1;
		for (int i = 0; i < index / 2; i++)
		{
			tmp = arr[i];
			arr[i] = arr[index / 2 + i + d];
			arr[index / 2 + i + d] = tmp;
		}
	}
	
	/**
	 * ------------------------------------------Metod get
	 */
	
	@Override
	public int get(int pos){
		if( pos < 0 || pos >= index )
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
	public void set(int pos, int val){
		if( pos < 0 || pos >= index )
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
		
		public MyIter(int[] ar) {
			this.arr = ar;
			
		}
		@Override
		public boolean hasNext() {

			return i < index;
		}

		@Override
		public Integer next() {
			   return arr[i++];
		}

	}


}

