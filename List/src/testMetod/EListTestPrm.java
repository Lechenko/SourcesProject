package testMetod;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import listInterfes.EList;
import mainList.AList0;
import mainList.AList1;
import mainList.AList2;
import mainList.LList1;


@RunWith(Parameterized.class)
public class EListTestPrm 
{

	EList ls = null;

	@Parameters
	public static Collection<Object[]> data() 
	{

		return Arrays.asList(new Object[][]

				{

			{ new AList0() },
			{ new AList1() },
			{ new AList2() },
			{ new LList1() }


				});

	}
	public EListTestPrm(EList prm) {
		ls = prm;
	}

	@Before
	public void setUp() {
		ls.clear();
	}

	/**
	 * Тесты метода clear
	 */

	@Test
	public void testClear_null()
	{
		int[] ini = null;
		ls.init(ini);
		ls.clear();
		assertEquals(0, ls.size());
		int[] act = ls.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testClear_0()
	{
		int[] ini = {};
		ls.init(ini);
		ls.clear();
		assertEquals(0, ls.size());
		int[] act = ls.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testClear_1()
	{
		int[] ini = {10};
		ls.init(ini);
		ls.clear();
		assertEquals(0, ls.size());
		int[] act = ls.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testClear_2()
	{
		int[] ini = {10,20};
		ls.init(ini);
		ls.clear();
		assertEquals(0, ls.size());
		int[] act = ls.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testClear_many()
	{
		int[] ini = {10,20,77,11,24,82};
		ls.init(ini);
		ls.clear();
		assertEquals(0, ls.size());
		int[] act = ls.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}

	/**
	 * Тесты метода print
	 */
	@Test
	public void test_toString_0()
	{
		int[]ini={};
		ls.init(ini);
		String txt = ls.toString();
		String res = "";
		assertEquals(res, txt);
	}

	@Test
	public void test_toString_1()
	{
		int[]ini={1};
		ls.init(ini);
		String act = ls.toString();
		String res="1";
		assertEquals(act, act);
		
	}

	@Test
	public void test_toString_2()
	{
		int[]ini={4,8};
		ls.init(ini);
		String act  = ls.toString();
		String exp ="4,8";
		assertEquals(exp, act);
	}
	@Test
	public void test_toString_many()
	{
		int[]ini={1,2,3,4,5,6,7,8,9,10};
		ls.init(ini);
		String txt = ls.toString();
		String res="1,2,3,4,5,6,7,8,9,10";
		assertEquals(res, txt);
	}
	/**
	 * Тесты метода size
	 */
	@Test
	public void testSize_0() {
		int[] ini = {};
		ls.init(ini);
		assertEquals(0, ls.size());
	}

	@Test
	public void testSize_1() {
		int[] ini = {0};
		ls.init(ini);
		assertEquals(1, ls.size());
	}

	@Test
	public void testSize_4() {
		int[] ini = {1, 10, 55, 68};
		ls.init(ini);
		assertEquals(4, ls.size());
	}

	@Test
	public void testSize_many() {
		int[] ini = new int[10];
		ls.init(ini);
		assertEquals(10, ls.size());
	}
	/**
	 * Тесты метода init
	 */
	@Test
	public void testInit_null() {
		int[] ini = null;
		ls.init(ini);
		assertEquals(0, ls.size());

	}
	@Test
	public void testInit_0() {
		int[] ini = new int[0];
		ls.init(ini);
		assertEquals(0, ls.size());
		int[] act = ls.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testInit_1() {
		int[] ini = {0};
		ls.init(ini);
		assertEquals(1, ls.size());
	}

	@Test
	public void testInit_2() {
		int[] ini = {0, 10};
		ls.init(ini);
		assertEquals(2, ls.size());
	}

	@Test
	public void testInit_many() {
		int[] ini = new int[8];
		ls.init(ini);
		assertEquals(8, ls.size());
	}
	/**
	 * Тесты метода toArrya
	 */
	@Test
	public void testToArray_0()
	{
		int[] ini = {};
		ls.init(ini);
		int[] act = ls.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testToArray_1()
	{
		int[] ini = {10};
		ls.init(ini);
		int[] act = ls.toArray();
		int[] exp = {10};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testToArray_2()
	{
		int[] ini = {10,20};
		ls.init(ini);
		int[] act = ls.toArray();
		int[] exp = {10,20};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testToArray_many()
	{
		int[] ini = {10,20,77,11,24,82};
		ls.init(ini);
		int[] act = ls.toArray();
		int[] exp = {10,20,77,11,24,82};
		assertArrayEquals(exp, act);
	}
	/**
	 *  Тест метода Min
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testMin_0()
	{
		int[] ini = {};
		ls.init(ini);
		ls.min();
		assertEquals(0, ls.size());
	}
	@Test
	public void testMin_1()
	{
		int[] ini = {5};
		ls.init(ini);
		ls.min();
		assertEquals(1, ls.size());
	}
	@Test
	public void testMin_2()
	{
		int[] ini = {10, 5};
		ls.init(ini);
		assertEquals(5, ls.min());
	}
	@Test
	public void testMin_many()
	{
		int[] ini = {10, 20, 15, 65, 48, 77, 5, 99, 88, 8};
		ls.init(ini);
		assertEquals(5, ls.min());
	}
	/**
	 *  Тест метода Max
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testMax_0()
	{
		int[] ini = {};
		ls.init(ini);
		ls.max();
		assertEquals(0, ls.size());
	}
	@Test
	public void testMax_1()
	{
		int[] ini = {5};
		ls.init(ini);
		ls.max();
		assertEquals(1, ls.size());
	}
	@Test
	public void testMax_2()
	{
		int[] ini = {10, 5};
		ls.init(ini);
		assertEquals(10, ls.max());
	}
	@Test
	public void testMax_many()
	{
		int[] ini = {10, 20, 15, 65, 48, 77, 5, 99, 88, 8};
		ls.init(ini);
		assertEquals(99, ls.max());
	}
	/**
	 *  Тест метода addStart
	 */
	@Test
	public void testAddStart_0()
	{
		int[] ini = {};
		ls.init(ini);
		ls.addStart(99);
		assertEquals(1, ls.size());
		int[] act = ls.toArray();
		int[] exp = {99};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testAddStart_1()
	{
		int[] ini = {10};
		ls.init(ini);
		ls.addStart(99);
		assertEquals(2, ls.size());
		int[] act = ls.toArray();
		int[] exp = {99,10};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testAddStart_2()
	{
		int[] ini = {10,20};
		ls.init(ini);
		ls.addStart(99);
		assertEquals(3, ls.size());
		int[] act = ls.toArray();
		int[] exp = {99,10,20};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testAddStart_many()
	{
		int[] ini = {10,20,77,11,24,82};
		ls.init(ini);
		ls.addStart(99);
		assertEquals(7, ls.size());
		int[] act = ls.toArray();
		int[] exp = {99,10,20,77,11,24,82};
		assertArrayEquals(exp, act);
	}
	/**
	 *  Тест метода addEnd
	 */
	@Test
	public void testAddEnd_0()
	{
		int[] ini = {};
		ls.init(ini);
		ls.addEnd(99);
		assertEquals(1, ls.size());
		int[] act = ls.toArray();
		int[] exp = {99};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testAddEnd_1()
	{
		int[] ini = {10};
		ls.init(ini);
		ls.addEnd(99);
		assertEquals(2, ls.size());
		int[] act = ls.toArray();
		int[] exp = {10,99};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testAddEnd_2()
	{
		int[] ini = {10,20};
		ls.init(ini);
		ls.addEnd(99);
		assertEquals(3, ls.size());
		int[] act = ls.toArray();
		int[] exp = {10,20,99};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testAddEnd_many()
	{
		int[] ini = {10,20,77,11,24,82};
		ls.init(ini);
		ls.addEnd(99);
		assertEquals(7, ls.size());
		int[] act = ls.toArray();
		int[] exp = {10,20,77,11,24,82,99};
		assertArrayEquals(exp, act);
	}
	/**
	 *  Тест метода addPos
	 */
	@Test
	public void test_AddPos_1()
	{
		int[] ini = {10};
		ls.init(ini);
		ls.addPos(1, 11);
		int[] exp = {10, 11};
		int[] act = ls.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void test_AddPos_2()
	{
		int[] ini = {10, 30};
		ls.init(ini);
		ls.addPos(1, 11);
		int[] exp = {10, 11, 30};
		int[] act = ls.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void test_AddPos_many()
	{
		int[] ini = {10, 30, 77, 11, 22, 34, 99};
		ls.init(ini);
		ls.addPos(2, 11);
		int[] exp = {10, 30, 11, 77, 11, 22, 34, 99};
		int[] act = ls.toArray();
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_AddPos_many2()
	{
		int[] ini = {10, 30, 77, 22, 34, 99, 55};
		ls.init(ini);
		ls.addPos(0, 11);
		int[] exp = {11, 10, 30, 77, 22, 34, 99, 55};
		int[] act = ls.toArray();
		assertArrayEquals(exp, act);
	}
	/**
	 *  Тест метода delEnd
	 */
	@Test
	public void test_Del_End_1()
	{
		int[] ini = {10};
		ls.init(ini);
		ls.delEnd();
		int[] exp = {};
		int[] act = ls.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void test_Del_End_2()
	{
		int[] ini = {10, 30};
		ls.init(ini);
		ls.delEnd();
		int[] exp = {10};
		int[] act = ls.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void test_Del_End_many()
	{
		int[] ini = {10, 30, 77, 11, 22, 34, 99};
		ls.init(ini);
		ls.delEnd();
		int[] exp = {10, 30, 77, 11, 22, 34};
		int[] act = ls.toArray();
		assertArrayEquals(exp, act);
	}
	/**
	 *  Тест метода delStart
	 */
	@Test (expected = IllegalArgumentException.class)
	public void test_Del_Start_0()
	{
		int[] ini = {};
		ls.init(ini);
		ls.delStart();
		int[] exp = {};
		int[] act = ls.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void test_Del_Start_1()
	{
		int[] ini = {10};
		ls.init(ini);
		ls.delStart();
		int[] exp = {};
		int[] act = ls.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void test_Del_Start_2()
	{
		int[] ini = {10, 30};
		ls.init(ini);
		ls.delStart();
		int[] exp = {30};
		int[] act = ls.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void test_Del_Start_many()
	{
		int[] ini = {10, 30, 77, 11, 22, 34, 99};
		ls.init(ini);
		ls.delStart();
		int[] exp = {30, 77, 11, 22, 34, 99};
		int[] act = ls.toArray();
		assertArrayEquals(exp, act);
	}
	/**
	 *  Тест метода delPos
	 */
	@Test
	public void test_DelPos_1()
	{
		int[] ini = {10};
		ls.init(ini);
		ls.delPos(0);
		int[] exp = {};
		int[] act = ls.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void test_Del_Pos_2_0()
	{
		int[] ini = {10, 30};
		ls.init(ini);
		ls.delPos(0);
		int[] exp = {30};
		int[] act = ls.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void test_Del_Pos_2_1()
	{
		int[] ini = {10, 30};
		ls.init(ini);
		ls.delPos(1);
		int[] exp = {10};
		int[] act = ls.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void test_DelPos_many()
	{
		int[] ini = {10,20,77,11,24,82};
		ls.init(ini);
		int del = ls.delPos(3);
		int[] act = ls.toArray();
		int[] exp = {10,20,77,24,82};
		assertEquals(5, ls.size());
		assertArrayEquals(exp, act);
		assertEquals(11, del);
	}
	/**
	 *  Тест метода sort
	 */
	@Test
	public void test_Sort_1()
	{
		int[] ini = {10};
		ls.init(ini);
		ls.sort();
		int[] exp = {10};
		int[] act = ls.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void test_Sort_2()
	{
		int[] ini = {10, 0};
		ls.init(ini);
		ls.sort();
		int[] exp = {0, 10};
		int[] act = ls.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void test_Sort_many()
	{
		int[] ini = {10,20,77,11,24,82};
		ls.init(ini);
		ls.sort();
		int[] exp = {10,11,20,24,77,82};
		int[] act = ls.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void test_Sort_many_2()
	{
		int[] ini = {40, 30, 77, 11, 22, 34, 99};
		ls.init(ini);
		ls.sort();
		int[] exp = {11, 22, 30, 34, 40, 77, 99};
		int[] act = ls.toArray();
		assertArrayEquals(exp, act);
	}
	/**
	 *  Тест метода reverse
	 */
	@Test
	public void test_Reverse_1()
	{
		int[] ini = {10};
		ls.init(ini);
		ls.reverse();
		int[] exp = {10};
		int[] act = ls.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void test_Reverse_2()
	{
		int[] ini = {10, 30};
		ls.init(ini);
		ls.reverse();
		int[] exp = {30, 10};
		int[] act = ls.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void test_Reverse_many()
	{
		int[] ini = {10, 30, 77, 11, 22, 34, 99};
		ls.init(ini);
		ls.reverse();
		int[] exp = {99, 34, 22, 11, 77, 30, 10};
		int[] act = ls.toArray();
		assertArrayEquals(exp, act);
	}
	/**
	 *  Тест метода get
	 */
	@Test (expected = IllegalArgumentException.class)
	public void test_Get_0_OutOffBounds()
	{
		int[] ini = {};
		ls.init(ini);
		ls.get(1);
	}

	@Test (expected = IllegalArgumentException.class)
	public void test_Get_1_OutOffBounds()
	{
		int[] ini = {10};
		ls.init(ini);
		ls.get(2);
	}

	@Test
	public void test_Get_1()
	{
		int[] ini = {10};
		ls.init(ini);
		assertEquals(10, ls.get(0));
	}

	@Test
	public void test_Get_2()
	{
		int[] ini = {10, 30};
		ls.init(ini);
		assertEquals(30,ls.get(1));
	}

	@Test
	public void test_Get_many()
	{
		int[] ini = {10, 30, 77, 11, 22, 34, 99};
		ls.init(ini);
		assertEquals(77, ls.get(2));
	}
	/**
	 *  Тест метода set
	 */
	@Test (expected = IllegalArgumentException.class)
	public void test_Set_0_OutOffBounds()
	{
		int[] ini = {};
		ls.init(ini);
		ls.set(1, 10);
	}

	@Test
	public void test_Set_1()
	{
		int[] ini = {10};
		ls.init(ini);
		ls.set(0, 11);
		int[] exp = {11};
		int[] act = ls.toArray();
		assertArrayEquals(exp, act);
	}

	@Test (expected = IllegalArgumentException.class)
	public void test_Set_1_OutOffBounds()
	{
		int[] ini = {10};
		ls.init(ini);
		ls.set(2, 1);
	}

	@Test
	public void test_Set_2()
	{
		int[] ini = {10, 30};
		ls.init(ini);
		ls.set(0, 11);
		int[] exp = {11, 30};
		int[] act = ls.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void test_Set_many()
	{
		int[] ini = {10, 30, 77, 11, 22, 34, 99};
		ls.init(ini);
		ls.set(2, 11);
		int[] exp = {10, 30, 11, 11, 22, 34, 99};
		int[] act = ls.toArray();
		assertArrayEquals(exp, act);
	}
	/**
	 *  Тест метода minPos
	 */
	@Test
	public void test_minPos_1()
	{
		int[] ini = {5};
		ls.init(ini);
		assertEquals(0, ls.minPos());
	}

	@Test
	public void test_minPos_2()
	{
		int[] ini = {10, 3};
		ls.init(ini);
		assertEquals(1, ls.minPos());
	}

	@Test
	public void test_minPos_many()
	{
		int[] ini = {10, 30, 77, 11, 2, 34, 99};
		ls.init(ini);
		assertEquals(4, ls.minPos());
	}
	/**
	 *  Тест метода maxPos
	 */
	@Test
	public void test_maxPos_1()
	{
		int[] ini = {5};
		ls.init(ini);
		assertEquals(0, ls.maxPos());
	}

	@Test
	public void test_maxPos_2()
	{
		int[] ini = {10, 33};
		ls.init(ini);
		assertEquals(1, ls.maxPos());
	}

	@Test
	public void test_maxPos_many()
	{
		int[] ini = {10, 30, 77, 11, 2, 34, 99, 85};
		ls.init(ini);
		assertEquals(6, ls.maxPos());
	}
	/**
	 * Тесты метода halfReverse
	 */
	@Test()
	public void test_halfReverse_0()
	{
		int[] ini = {};
		ls.init(ini);
		ls.halfReverse();
		int[] exp = {};
		int[] act = ls.toArray();
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_halfReverse_1()
	{
		int[] ini = {10};
		ls.init(ini);
		ls.halfReverse();
		int[] exp = {10};
		int[] act = ls.toArray();
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_halfReverse_2()
	{
		int[] ini = {10, 30};
		ls.init(ini);
		ls.halfReverse();
		int[] exp = {30, 10};
		int[] act = ls.toArray();
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_halfReverse_many()
	{
		int[] ini = {10,20,77,11,24,82};
		ls.init(ini);
		ls.halfReverse();
		int[] exp = {11,24,82,10,20,77};
		int[] act = ls.toArray();
		assertArrayEquals(exp, act);
	}
	
	@Test
	public void test_Iterator_0() 
	{
		int[] ini = {};
		ls.init(ini);
		String act = ls.toString();
		int [] ar = ls.toArray();
		String str = "";
		int j = 0;
		for(Integer i : ls)
		{
			str +=( i );
			if(j < ar.length-1)
				str += ",";
			assertEquals(i.intValue(), ar[j]);
			j++;
		}
		assertEquals(str, act);
	}
	
	@Test
	public void test_Iterator_1() 
	{
		int[] ini = {10};
		ls.init(ini);
		String act = ls.toString();
		int [] ar = ls.toArray();
		String str = "";
		int j = 0;
		for(Integer i : ls)
		{
			str +=( i );
			if(j < ar.length-1)
				str += ",";
			assertEquals(i.intValue(), ar[j]);
			j++;
		}
		assertEquals(str, act);
	}
	
	@Test
	public void test_Iterator_2() 
	{
		int[] ini = {10,20};
		ls.init(ini);
		String act = ls.toString();
		int [] ar = ls.toArray();
		String str = "";
		int j = 0;
		for(Integer i : ls)
		{
			str +=( i );
			if(j < ar.length-1)
				str += ",";
			assertEquals(i.intValue(), ar[j]);
			j++;
		}
		assertEquals(str, act);
	}
	
	@Test
	public void test_Iterator_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		ls.init(ini);
		int [] ar = ls.toArray();
		String act = ls.toString();
		String str = "";
		int j = 0;
		for(Integer i : ls)
		{
			str +=( i );
			if(j < ar.length-1)
				str += ",";
			assertEquals(i.intValue(), ar[j]);
			j++;
		}
		assertEquals(str, act);
	
	}
}


