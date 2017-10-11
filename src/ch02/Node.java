package ch02;

/**
 * 
 * ������Ľ��
 * 
 */
public class Node {
	private Object data; // ��Ž��ֵ

	private Node next; // ��̽�������

	public Node() { // �޲���ʱ�Ĺ��캯��
		this(null, null);
	}

	public Node(Object data) { // ����ֵΪdata�Ľ��
		this(data, null);
	}

	public Node(Object data, Node next) {
		this.data = data;
		this.next = next;
	}

	public Object getData() {
		return data;
	}

	public Node getNext() {
		return next;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
