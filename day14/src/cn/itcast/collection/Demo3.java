package cn.itcast.collection;

import java.util.ArrayList;
import java.util.Collection;

/*
�ж�
	isEmpty() 
	contains(Object o) 
	containsAll(Collection<?> c)
*/

class Person{
	
	int id; 
	
	String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "{��ţ�"+this.id+" ������"+ this.name+"}";
	}
	
	@Override
	public boolean equals(Object obj) {
		Person p = (Person)obj;
		return this.id == p.id ;
	}
	
	
	//java�淶�� һ����дequlas�������Ƕ�����дhashCode�����ġ�
	@Override
	public int hashCode() {
		return this.id;
	}
	
	
	
}


class Dog{}


public class Demo3 {
	
	public static void main(String[] args) {
		/*Collection c = new ArrayList();
		c.add("��ƻ�");
		c.add("��ź�");
		c.add("������");
		System.out.println("�жϼ����Ƿ�Ϊ��Ԫ�أ�"+ c.isEmpty());
		System.out.println("�жϼ������Ƿ����ָ����Ԫ�أ�"+ c.contains("������"));*/
		
		//���������Զ����Ԫ��
		Collection c = new ArrayList();
		c.add(new Person(110,"����"));
		c.add(new Person(119,"��ʣ"));
		c.add(new Person(120,"����"));
		
		
		Collection c2 = new ArrayList();
		c2.add(new Person(110,"����"));
		c2.add(new Person(119,"��ʣ"));
		c2.add(new Person(104,"�¹�ʣ"));
		
		
		System.out.println("c�����а���c2�����е�����Ԫ����"+ c.containsAll(c2));
		
		
		//�������ʵ�����У�ֻҪ����֤���һ�£���ô��Ϊͬһ���ˡ�
		System.out.println("���ڸ�Ԫ����"+c.contains(new Person(120,"������"))); // ��ʵcontains�����ڲ���������equals�������бȽϵġ�
		System.out.println("���ϵ�Ԫ�أ�"+ c);
		
		
	}
}