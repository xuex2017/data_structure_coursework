package midTerm;

import ch02.Node;

public class MyNode {

	private String data; // ��Ž��ֵ

	private MyNode next; // ��̽�������

	public MyNode() { // �޲���ʱ�Ĺ��캯��
		this(null, null);
	}

	public MyNode(String data) { // ����ֵΪdata�Ľ��
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
