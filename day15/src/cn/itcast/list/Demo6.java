package cn.itcast.list;

import java.util.ArrayList;

/*

集合的体系：
----------| Collection  单列集合的根接口
----------------| List 如果实现了List接口的集合类，具备的特点： 有序，可重复。
--------------------| ArrayList   ArrayList 底层是维护了一个Object数组实现 的， 特点: 查询速度快，增删慢。
什么时候使用ArrayList: 如果目前的数据是查询比较多，增删比较少的时候，那么就使用ArrayList存储这批数据。  比如 ：高校的 图书馆


--------------------| LinkedList
--------------------| Vector(了解即可)

----------------| Set  如果实现了Set接口的集合类， 具备的特点： 无序，不可重复。

ArrayList 特有的方法：

	ensureCapacity(int minCapaci上ty)
	trimToSize()  
	

笔试题目： 使用ArrayList无参的构造函数创建一个 对象时， 默认的容量是多少? 如果长度不够使用时又自增增长多少？
	ArrayList底层是维护了一个Object数组实现 的，使用无参构造函数时，Object数组默认的容量是10，当长度不够时，自动增长0.5倍。
	




 */
public class Demo6 {
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		
	}
	
}
