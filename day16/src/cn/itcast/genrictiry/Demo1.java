package cn.itcast.genrictiry;

import java.util.ArrayList;
/*
 泛型是jdk1.5使用的新特性。
 
 
  泛型的好处：
  	1. 将运行时的异常提前至了编译时。
  	2. 避免了无谓的强制类型转换 。
  	
  
泛型在集合中的常见应用：
  	
  	ArrayList<String>  list = new ArrayList<String>();  true     推荐使用。
  	
  	ArrayList<Object>  list = new ArrayList<String>();  false
  	ArrayList<String>  list = new ArrayList<Object>();  false
  	
  	//以下两种写法主要是为了兼顾新老系统的兼用性问题。
  	 * 
    ArrayList<String>  list = new ArrayList();           true   
  
    ArrayList    list = new ArrayList<String>();   true   
 
注意： 泛型没有多态的概念，左右两边的数据 类型必须 要一致，或者只是写一边的泛型类型。

推荐使用： 两边都写泛型。
 
 
需求： 把一个集合中元素全部转成大写。 
 
 */


public class Demo1 {

	public static void main(String[] args) {
		ArrayList<String>  list = new ArrayList<String>();  //<String> 表示该容器只能存储字符串类型 的数据。
		
		list.add("aa");
		list.add("bb");
		list.add("cc");
		
		for(int i = 0 ; i < list.size() ; i++){
			String str =  list.get(i);
			System.out.println("大写："+ str.toUpperCase());
		}
		
		
		MyUtil.print(list);
		
		
		ArrayList<String> list2 = MyUtil.getList();
		
		
		
	}
	
}
