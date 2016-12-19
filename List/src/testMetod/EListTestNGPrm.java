package testMetod;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertArrayEquals;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import listInterfes.EList;
import mainList.AList0;
import mainList.AList1;
import mainList.AList2;
import mainList.LList1;





public class EListTestNGPrm 
{


	@DataProvider
	public Object[][] mainList() {
		return new Object[][]{
			{ new AList0() },
			{ new AList1() },
			{ new AList2() },
			{ new LList1() }

		};
	}

	/**
	 * Тесты метода clear

	 */
	
	@Test(dataProvider = "mainList", groups={"clear"})
	public void testClear_0(EList obj)
	{
		int[] ini = {};
		obj.init(ini);
		obj.clear();
		assertEquals(0, obj.size());
		int[] act = obj.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}

	@Test(dataProvider = "mainList", groups={"clear"})
	public void testClear_1(EList obj)
	{
		int[] ini = {10};
		obj.init(ini);
		obj.clear();
		assertEquals(0, obj.size());
		int[] act = obj.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	
	
	@Test(dataProvider = "mainList", groups={"clear"})
	public void testClear_2(EList obj)
	{
		int[] ini = {10,20};
		obj.init(ini);
		obj.clear();
		assertEquals(0, obj.size());
		int[] act = obj.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test(dataProvider = "mainList", groups={"clear"})
	public void testClear_many(EList obj)
	{
		int[] ini = {10,20,77,11,24,82};
		obj.init(ini);
		obj.clear();
		assertEquals(0, obj.size());
		int[] act = obj.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}

	/**
	 * Тесты метода print
	 */
	@Test(dataProvider = "mainList", groups={"toString"})
	public void test_toString_0(EList obj)
	{
		int[]ini={};
		obj.init(ini);
		String txt = obj.toString();
		String res = "";
		assertEquals(res, txt);
	}

	@Test(dataProvider = "mainList", groups={"toString"})
	public void test_toString_1(EList obj)
	{
		int[]ini={1};
		obj.init(ini);
		String txt = obj.toString();
		String res="1,";
		obj.print();
		assertEquals(res, txt);

	}

	@Test(dataProvider = "mainList", groups={"toString"})
	public void test_toString_2(EList obj)
	{
		int[]ini={4,8};
		obj.init(ini);
		String act  = obj.toString();
		String exp ="4,8,";
		obj.print();
		assertEquals(exp, act);
	}
	@Test(dataProvider = "mainList", groups={"toString"})
	public void test_toString_many(EList obj)
	{
		int[]ini={1,2,3,4,5,6,7,8,9,10};
		obj.init(ini);
		String txt = obj.toString();
		String res="1,2,3,4,5,6,7,8,9,10,";
		assertEquals(res, txt);
	}
	/**
	 * Тесты метода size
	 */
	@Test(dataProvider = "mainList", groups={"size"})
	public void testSize_0(EList obj)
	{
		int[] ini = {};
		obj.init(ini);
		assertEquals(0, obj.size());
	}

	@Test(dataProvider = "mainList", groups={"size"})
	public void testSize_1(EList obj) {
		int[] ini = {0};
		obj.init(ini);
		assertEquals(1, obj.size());
	}

	@Test(dataProvider = "mainList", groups={"size"})
	public void testSize_4(EList obj) {
		int[] ini = {1, 10, 55, 68};
		obj.init(ini);
		assertEquals(4, obj.size());
	}

	@Test(dataProvider = "mainList", groups={"size"})
	public void testSize_many(EList obj) {
		int[] ini = new int[10];
		obj.init(ini);
		assertEquals(10, obj.size());
	}
	/**
	 * Тесты метода init
	 */
	@Test(dataProvider = "mainList", groups={"init"})
	public void testInit_null(EList obj) {
		int[] ini = null;
		obj.init(ini);
		assertEquals(0, obj.size());

	}
	@Test(dataProvider = "mainList", groups={"init"})
	public void testInit_0(EList obj) {
		int[] ini = new int[0];
		obj.init(ini);
		assertEquals(0, obj.size());
		int[] act = obj.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test(dataProvider = "mainList", groups={"init"})
	public void testInit_1(EList obj) {
		int[] ini = {0};
		obj.init(ini);
		assertEquals(1, obj.size());
	}

	@Test(dataProvider = "mainList", groups={"init"})
	public void testInit_2(EList obj) {
		int[] ini = {0, 10};
		obj.init(ini);
		assertEquals(2, obj.size());
	}

	@Test(dataProvider = "mainList", groups={"init"})
	public void testInit_many(EList obj) {
		int[] ini = new int[8];
		obj.init(ini);
		assertEquals(8, obj.size());
	}
	/**
	 * Тесты метода toArrya
	 */
	@Test(dataProvider = "mainList", groups={"toArray"})
	public void testToArray_0(EList obj)
	{
		int[] ini = {};
		obj.init(ini);
		int[] act = obj.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test(dataProvider = "mainList", groups={"toArray"})
	public void testToArray_1(EList obj)
	{
		int[] ini = {10};
		obj.init(ini);
		int[] act = obj.toArray();
		int[] exp = {10};
		assertArrayEquals(exp, act);
	}
	@Test(dataProvider = "mainList", groups={"toArray"})
	public void testToArray_2(EList obj)
	{
		int[] ini = {10,20};
		obj.init(ini);
		int[] act = obj.toArray();
		int[] exp = {10,20};
		assertArrayEquals(exp, act);
	}
	@Test(dataProvider = "mainList", groups={"toArray"})
	public void testToArray_many(EList obj)
	{
		int[] ini = {10,20,77,11,24,82};
		obj.init(ini);
		int[] act = obj.toArray();
		int[] exp = {10,20,77,11,24,82};
		assertArrayEquals(exp, act);
	}
	/**
	 *  Тест метода Min
	 */
	@Test(dataProvider = "mainList", groups={"min"}, expectedExceptions = IllegalArgumentException.class)
	public void testMin_0(EList obj)
	{
		int[] ini = {};
		obj.init(ini);
		obj.min();
		assertEquals(0, obj.size());
	}
	@Test(dataProvider = "mainList", groups={"min"})
	public void testMin_1(EList obj)
	{
		int[] ini = {5};
		obj.init(ini);
		obj.min();
		assertEquals(1, obj.size());
	}
	@Test(dataProvider = "mainList", groups={"min"})
	public void testMin_2(EList obj)
	{
		int[] ini = {10, 5};
		obj.init(ini);
		assertEquals(5, obj.min());
	}
	@Test(dataProvider = "mainList", groups={"min"})
	public void testMin_many(EList obj)
	{
		int[] ini = {10, 20, 15, 65, 48, 77, 5, 99, 88, 8};
		obj.init(ini);
		assertEquals(5, obj.min());
	}
	/**
	 *  Тест метода Max
	 */
	@Test(dataProvider = "mainList", groups={"max"}, expectedExceptions = IllegalArgumentException.class)
	public void testMax_0(EList obj)
	{
		int[] ini = {};
		obj.init(ini);
		obj.max();
		assertEquals(0, obj.size());
	}
	@Test(dataProvider = "mainList", groups={"max"})
	public void testMax_1(EList obj)
	{
		int[] ini = {5};
		obj.init(ini);
		obj.max();
		assertEquals(1, obj.size());
	}
	@Test(dataProvider = "mainList", groups={"max"})
	public void testMax_2(EList obj)
	{
		int[] ini = {10, 5};
		obj.init(ini);
		assertEquals(10, obj.max());
	}
	@Test(dataProvider = "mainList", groups={"max"})
	public void testMax_many(EList obj)
	{
		int[] ini = {10, 20, 15, 65, 48, 77, 5, 99, 88, 8};
		obj.init(ini);
		assertEquals(99, obj.max());
	}
	/**
	 *  Тест метода addStart
	 */
	@Test(dataProvider = "mainList", groups={"addStart"})
	public void testAddStart_0(EList obj)
	{
		int[] ini = {};
		obj.init(ini);
		obj.addStart(99);
		assertEquals(1, obj.size());
		int[] act = obj.toArray();
		int[] exp = {99};
		assertArrayEquals(exp, act);
	}
	@Test(dataProvider = "mainList", groups={"addStart"})
	public void testAddStart_1(EList obj)
	{
		int[] ini = {10};
		obj.init(ini);
		obj.addStart(99);
		assertEquals(2, obj.size());
		int[] act = obj.toArray();
		int[] exp = {99,10};
		assertArrayEquals(exp, act);
	}
	@Test(dataProvider = "mainList", groups={"addStart"})
	public void testAddStart_2(EList obj)
	{
		int[] ini = {10,20};
		obj.init(ini);
		obj.addStart(99);
		assertEquals(3, obj.size());
		int[] act = obj.toArray();
		int[] exp = {99,10,20};
		assertArrayEquals(exp, act);
	}
	@Test(dataProvider = "mainList", groups={"addStart"})
	public void testAddStart_many(EList obj)
	{
		int[] ini = {10,20,77,11,24,82};
		obj.init(ini);
		obj.addStart(99);
		assertEquals(7, obj.size());
		int[] act = obj.toArray();
		int[] exp = {99,10,20,77,11,24,82};
		assertArrayEquals(exp, act);
	}
	/**
	 *  Тест метода addEnd
	 */
	@Test(dataProvider = "mainList", groups={"addEnd"})
	public void testAddEnd_0(EList obj)
	{
		int[] ini = {};
		obj.init(ini);
		obj.addEnd(99);
		assertEquals(1, obj.size());
		int[] act = obj.toArray();
		int[] exp = {99};
		assertArrayEquals(exp, act);
	}
	@Test(dataProvider = "mainList", groups={"addEnd"})
	public void testAddEnd_1(EList obj)
	{
		int[] ini = {10};
		obj.init(ini);
		obj.addEnd(99);
		assertEquals(2, obj.size());
		int[] act = obj.toArray();
		int[] exp = {10,99};
		assertArrayEquals(exp, act);
	}
	@Test(dataProvider = "mainList", groups={"addEnd"})
	public void testAddEnd_2(EList obj)
	{
		int[] ini = {10,20};
		obj.init(ini);
		obj.addEnd(99);
		assertEquals(3, obj.size());
		int[] act = obj.toArray();
		int[] exp = {10,20,99};
		assertArrayEquals(exp, act);
	}
	@Test(dataProvider = "mainList", groups={"addEnd"})
	public void testAddEnd_many(EList obj)
	{
		int[] ini = {10,20,77,11,24,82};
		obj.init(ini);
		obj.addEnd(99);
		assertEquals(7, obj.size());
		int[] act = obj.toArray();
		int[] exp = {10,20,77,11,24,82,99};
		assertArrayEquals(exp, act);
	}
	/**
	 *  Тест метода addPos
	 */
	@Test(dataProvider = "mainList", groups={"addPos"})
	public void test_AddPos_1(EList obj)
	{
		int[] ini = {10};
		obj.init(ini);
		obj.addPos(1, 11);
		int[] exp = {10, 11};
		int[] act = obj.toArray();
		assertArrayEquals(exp, act);
	}

	@Test(dataProvider = "mainList", groups={"addPos"})
	public void test_AddPos_2(EList obj)
	{
		int[] ini = {10, 30};
		obj.init(ini);
		obj.addPos(1, 11);
		int[] exp = {10, 11, 30};
		int[] act = obj.toArray();
		assertArrayEquals(exp, act);
	}

	@Test(dataProvider = "mainList", groups={"addPos"})
	public void test_AddPos_many(EList obj)
	{
		int[] ini = {10, 30, 77, 11, 22, 34, 99};
		obj.init(ini);
		obj.addPos(2, 11);
		int[] exp = {10, 30, 11, 77, 11, 22, 34, 99};
		int[] act = obj.toArray();
		assertArrayEquals(exp, act);
	}
	@Test(dataProvider = "mainList", groups={"addPos"})
	public void test_AddPos_many2(EList obj)
	{
		int[] ini = {10, 30, 77, 22, 34, 99, 55};
		obj.init(ini);
		obj.addPos(0, 11);
		int[] exp = {11, 10, 30, 77, 22, 34, 99, 55};
		int[] act = obj.toArray();
		assertArrayEquals(exp, act);
	}
	/**
	 *  Тест метода delEnd
	 */
	@Test(dataProvider = "mainList", groups={"delEnd"})
	public void test_Del_End_1(EList obj)
	{
		int[] ini = {10};
		obj.init(ini);
		obj.delEnd();
		int[] exp = {};
		int[] act = obj.toArray();
		assertArrayEquals(exp, act);
	}

	@Test(dataProvider = "mainList", groups={"delEnd"})
	public void test_Del_End_2(EList obj)
	{
		int[] ini = {10, 30};
		obj.init(ini);
		obj.delEnd();
		int[] exp = {10};
		int[] act = obj.toArray();
		assertArrayEquals(exp, act);
	}

	@Test(dataProvider = "mainList", groups={"delEnd"})
	public void test_Del_End_many(EList obj)
	{
		int[] ini = {10, 30, 77, 11, 22, 34, 99};
		obj.init(ini);
		obj.delEnd();
		int[] exp = {10, 30, 77, 11, 22, 34};
		int[] act = obj.toArray();
		assertArrayEquals(exp, act);
	}
	/**
	 *  Тест метода delStart
	 */
	@Test(dataProvider = "mainList", groups={"delStart"}, expectedExceptions = IllegalArgumentException.class) 
	public void test_Del_Start_0(EList obj)
	{
		int[] ini = {};
		obj.init(ini);
		obj.delStart();
		int[] exp = {};
		int[] act = obj.toArray();
		assertArrayEquals(exp, act);
	}

	@Test(dataProvider = "mainList", groups={"delStart"})
	public void test_Del_Start_1(EList obj)
	{
		int[] ini = {10};
		obj.init(ini);
		obj.delStart();
		int[] exp = {};
		int[] act = obj.toArray();
		assertArrayEquals(exp, act);
	}

	@Test(dataProvider = "mainList", groups={"delStart"})
	public void test_Del_Start_2(EList obj)
	{
		int[] ini = {10, 30};
		obj.init(ini);
		obj.delStart();
		int[] exp = {30};
		int[] act = obj.toArray();
		assertArrayEquals(exp, act);
	}

	@Test(dataProvider = "mainList", groups={"delStart"})
	public void test_Del_Start_many(EList obj)
	{
		int[] ini = {10, 30, 77, 11, 22, 34, 99};
		obj.init(ini);
		obj.delStart();
		int[] exp = {30, 77, 11, 22, 34, 99};
		int[] act = obj.toArray();
		assertArrayEquals(exp, act);
	}
	/**
	 *  Тест метода delPos
	 */
	@Test(dataProvider = "mainList", groups={"delPos"})
	public void test_DelPos_1(EList obj)
	{
		int[] ini = {10};
		obj.init(ini);
		obj.delPos(0);
		int[] exp = {};
		int[] act = obj.toArray();
		assertArrayEquals(exp, act);
	}

	@Test(dataProvider = "mainList", groups={"delPos"})
	public void test_Del_Pos_2_0(EList obj)
	{
		int[] ini = {10, 30};
		obj.init(ini);
		obj.delPos(0);
		int[] exp = {30};
		int[] act = obj.toArray();
		assertArrayEquals(exp, act);
	}

	@Test(dataProvider = "mainList", groups={"delPos"})
	public void test_Del_Pos_2_1(EList obj)
	{
		int[] ini = {10, 30};
		obj.init(ini);
		obj.delPos(1);
		int[] exp = {10};
		int[] act = obj.toArray();
		assertArrayEquals(exp, act);
	}

	@Test(dataProvider = "mainList", groups={"delPos"})
	public void test_DelPos_many(EList obj)
	{
		int[] ini = {10, 30, 77, 11, 22, 34, 99};
		obj.init(ini);
		obj.delPos(2);
		int[] exp = {10, 30, 11, 22, 34, 99};
		int[] act = obj.toArray();
		assertArrayEquals(exp, act);
	}
	/**
	 *  Тест метода sort
	 */
	@Test(dataProvider = "mainList", groups={"sort"})
	public void test_Sort_1(EList obj)
	{
		int[] ini = {10};
		obj.init(ini);
		obj.sort();
		int[] exp = {10};
		int[] act = obj.toArray();
		assertArrayEquals(exp, act);
	}

	@Test(dataProvider = "mainList", groups={"sort"})
	public void test_Sort_2(EList obj)
	{
		int[] ini = {10, 0};
		obj.init(ini);
		obj.sort();
		int[] exp = {0, 10};
		int[] act = obj.toArray();
		assertArrayEquals(exp, act);
	}

	@Test(dataProvider = "mainList", groups={"sort"})
	public void test_Sort_many(EList obj)
	{
		int[] ini = {10, 30, 77, 11, 22, 34, 99};
		obj.init(ini);
		obj.sort();
		int[] exp = {10, 11, 22, 30, 34, 77, 99};
		int[] act = obj.toArray();
		assertArrayEquals(exp, act);
	}

	@Test(dataProvider = "mainList", groups={"sort"})
	public void test_Sort_many_2(EList obj)
	{
		int[] ini = {40, 30, 77, 11, 22, 34, 99};
		obj.init(ini);
		obj.sort();
		int[] exp = {11, 22, 30, 34, 40, 77, 99};
		int[] act = obj.toArray();
		assertArrayEquals(exp, act);
	}
	/**
	 *  Тест метода reverse
	 */
	@Test(dataProvider = "mainList", groups={"reverse"})
	public void test_Reverse_1(EList obj)
	{
		int[] ini = {10};
		obj.init(ini);
		obj.reverse();
		int[] exp = {10};
		int[] act = obj.toArray();
		assertArrayEquals(exp, act);
	}

	@Test(dataProvider = "mainList", groups={"reverse"})
	public void test_Reverse_2(EList obj)
	{
		int[] ini = {10, 30};
		obj.init(ini);
		obj.reverse();
		int[] act = {30, 10};
		int[] exp = obj.toArray();
		assertArrayEquals(exp, act);
	}

	@Test(dataProvider = "mainList", groups={"reverse"})
	public void test_Reverse_many(EList obj)
	{
		int[] ini = {10, 30, 77, 11, 22, 34, 99};
		obj.init(ini);
		obj.reverse();
		int[] exp = {99, 34, 22, 11, 77, 30, 10};
		int[] act = obj.toArray();
		assertArrayEquals(exp, act);
	}
	/**
	 *  Тест метода get
	 */
	@Test(dataProvider = "mainList", groups={"get"}, expectedExceptions = IllegalArgumentException.class) 
	public void test_Get_0_OutOffBounds(EList obj)
	{
		int[] ini = {};
		obj.init(ini);
		obj.get(1);
	}

	@Test(dataProvider = "mainList", groups={"get"}, expectedExceptions = IllegalArgumentException.class) 
	public void test_Get_1_OutOffBounds(EList obj)
	{
		int[] ini = {10};
		obj.init(ini);
		obj.get(2);
	}

	@Test(dataProvider = "mainList", groups={"get"})
	public void test_Get_1(EList obj)
	{
		int[] ini = {10};
		obj.init(ini);
		assertEquals(10, obj.get(0));
	}

	@Test(dataProvider = "mainList", groups={"get"})
	public void test_Get_2(EList obj)
	{
		int[] ini = {10, 30};
		obj.init(ini);
		assertEquals(30,obj.get(1));
	}

	@Test(dataProvider = "mainList", groups={"get"})
	public void test_Get_many(EList obj)
	{
		int[] ini = {10, 30, 77, 11, 22, 34, 99};
		obj.init(ini);
		assertEquals(77, obj.get(2));
	}
	/**
	 *  Тест метода set
	 */
	@Test(dataProvider = "mainList", groups={"set"}, expectedExceptions = IllegalArgumentException.class) 
	public void test_Set_0_OutOffBounds(EList obj)
	{
		int[] ini = {};
		obj.init(ini);
		obj.set(1, 10);
	}

	@Test(dataProvider = "mainList", groups={"set"})
	public void test_Set_1(EList obj)
	{
		int[] ini = {10};
		obj.init(ini);
		obj.set(0, 11);
		int[] exp = {11};
		int[] act = obj.toArray();
		assertArrayEquals(exp, act);
	}

	@Test(dataProvider = "mainList", groups={"set"}, expectedExceptions = IllegalArgumentException.class) 
	public void test_Set_1_OutOffBounds(EList obj)
	{
		int[] ini = {10};
		obj.init(ini);
		obj.set(2, 1);
	}

	@Test(dataProvider = "mainList", groups={"set"})
	public void test_Set_2(EList obj)
	{
		int[] ini = {10, 30};
		obj.init(ini);
		obj.set(0, 11);
		int[] exp = {11, 30};
		int[] act = obj.toArray();
		assertArrayEquals(exp, act);
	}

	@Test(dataProvider = "mainList", groups={"set"})
	public void test_Set_many(EList obj)
	{
		int[] ini = {10, 30, 77, 11, 22, 34, 99};
		obj.init(ini);
		obj.set(2, 11);
		int[] exp = {10, 30, 11, 11, 22, 34, 99};
		int[] act = obj.toArray();
		assertArrayEquals(exp, act);
	}
	/**
	 *  Тест метода minPos
	 */
	@Test(dataProvider = "mainList", groups={"minPos"})
	public void test_minPos_1(EList obj)
	{
		int[] ini = {5};
		obj.init(ini);
		assertEquals(0, obj.minPos());
	}

	@Test(dataProvider = "mainList", groups={"minPos"})
	public void test_minPos_2(EList obj)
	{
		int[] ini = {10, 3};
		obj.init(ini);
		assertEquals(1, obj.minPos());
	}

	@Test(dataProvider = "mainList", groups={"minPos"})
	public void test_minPos_many(EList obj)
	{
		int[] ini = {10, 30, 77, 11, 2, 34, 99};
		obj.init(ini);
		assertEquals(4, obj.minPos());
	}
	/**
	 *  Тест метода maxPos
	 */
	@Test(dataProvider = "mainList", groups={"maxPos"})
	public void test_maxPos_1(EList obj)
	{
		int[] ini = {5};
		obj.init(ini);
		assertEquals(0, obj.maxPos());
	}

	@Test(dataProvider = "mainList", groups={"maxPos"})
	public void test_maxPos_2(EList obj)
	{
		int[] ini = {10, 33};
		obj.init(ini);
		assertEquals(1, obj.maxPos());
	}

	@Test(dataProvider = "mainList", groups={"maxPos"})
	public void test_maxPos_many(EList obj)
	{
		int[] ini = {10, 30, 77, 11, 2, 34, 99, 85};
		obj.init(ini);
		assertEquals(6, obj.maxPos());
	}
	/**
	 * Тесты метода halfReverse
	 */
	@Test(dataProvider = "mainList", groups={"halfReverse"})
	public void test_halfReverse_0(EList obj)
	{
		int[] ini = {};
		obj.init(ini);
		obj.halfReverse();
		int[] exp = {};
		int[] act = obj.toArray();
		assertArrayEquals(exp, act);
	}
	@Test(dataProvider = "mainList", groups={"halfReverse"})
	public void test_halfReverse_1(EList obj)
	{
		int[] ini = {10};
		obj.init(ini);
		obj.halfReverse();
		int[] exp = {10};
		int[] act = obj.toArray();
		assertArrayEquals(exp, act);
	}
	@Test(dataProvider = "mainList", groups={"halfReverse"})
	public void test_halfReverse_2(EList obj)
	{
		int[] ini = {10, 30};
		obj.init(ini);
		obj.halfReverse();
		int[] exp = {30, 10};
		int[] act = obj.toArray();
		assertArrayEquals(exp, act);
	}
	@Test(dataProvider = "mainList", groups={"halfReverse"})
	public void test_halfReverse_many(EList obj)
	{
		int[] ini = {1, 2, 3, 4};
		obj.init(ini);
		obj.halfReverse();
		int[] exp = {3, 4, 1, 2};
		int[] act = obj.toArray();
		assertArrayEquals(exp, act);
	}

	@Test(dataProvider = "mainList", groups={"Iterator"})
	public void test_Iterator_00(EList obj)
	{
		int[] ini = {};
		obj.init(ini);
		for(Integer x : obj){
			assertEquals(0,obj.toArray());
		}
	}

	@Test(dataProvider = "mainList", groups={"Iterator"})
	public void test_Iterator_01(EList obj)
	{
		int[] ini = {10};
		obj.init(ini);
		for(Integer x : obj){
			assertEquals(1,obj.toArray());
		}
	}

	@Test(dataProvider = "mainList", groups={"Iterator"})
	public void test_Iterator_02(EList obj)
	{
		int[] ini = {10,20,40,80,5};
		obj.init(ini);
		obj.print();
		for(Integer x : obj){
			assertEquals(5,obj.toArray());
		}
	}  
}
