package midTerm;

import ch02.Node;

public class MyNode {

	private String data; // 存放结点值

	private MyNode next; // 后继结点的引用

	public MyNode() { // 无参数时的构造函数
		this(null, null);
	}

	public MyNode(String data) { // 构造值为data的结点
		this(data, null);
	}

	public MyNode(String data, MyNode next) {
		this.data = data;
		this.next = next;
	}

	public String getData() {
		return data;
	}

	public MyNode getNext() {
		return next;
	}

	public void setData(String data) {
		this.data = data;
	}

	public void setNext(MyNode next) {
		this.next = next;
	}

}
