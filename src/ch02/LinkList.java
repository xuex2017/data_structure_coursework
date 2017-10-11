package ch02;

/**
 * 
 * ��ͷ���ĵ��������������
 * 
 */
import java.util.Scanner;

public class LinkList implements IList {
	private Node head;// �������ͷָ��

	// ������Ĺ��캯��
	public LinkList() {
		head = new Node(); // ��ʼ��ͷ���
	}

	public LinkList(int n, boolean Order) throws Exception {
		this();// ��ʼ��ͷ���
		if (Order) // ��β�巨˳����������
			create1(n);
		else
			// ��ͷ�巨��λ����������
			create2(n);
	}

	// ��β�巨˳��������������nΪ�õ������Ԫ�ظ���
	public void create1(int n) throws Exception {
		Scanner sc = new Scanner(System.in);// ������������Ķ���
		for (int j = 0; j < n; j++)
			// ����n��Ԫ�ص�ֵ
			insert(length(), sc.next());// �����½��,���뵽��β
	}

	// ��ͷ�巨��λ��������������nΪ�õ������Ԫ�ظ���
	public void create2(int n) throws Exception {
		Scanner sc = new Scanner(System.in);// ������������Ķ���
		for (int j = 0; j < n; j++)
			// ����n��Ԫ�ص�ֵ
			insert(0, sc.next());// �����½��,���뵽��ͷ
	}

	// ��һ���Ѿ����ڵĴ�ͷ��㵥�����óɿձ�
	public void clear() {
		head.setData(null);
		head.setNext(null);
	}

	// �жϵ�ǰ��ͷ���ĵ������Ƿ�Ϊ��
	public boolean isEmpty() {
		return head.getNext() == null;// �ж��׽���Ƿ�Ϊ��
	}

	// ���ͷ��㵥�����е�����Ԫ�ظ������ɺ���������ֵ
	public int length() {
		Node p = head.getNext();// ��ʼ��,pָ���׽��,lengthΪ������
		int length = 0;
		while (p != null) {// ���׽�������ң�ֱ��pΪ��
			p = p.getNext();// ָ���̽��
			++length;// ������1
		}
		return length;
	}

	// ��ȡ��ͷ��㵥�����еĵ�i������Ԫ��
	public Object get(int i) throws Exception {
		Node p = head.getNext();// ��ʼ��,pָ���׽��,jΪ������
		int j = 0;
		while (p != null && j < i) {// ���׽�������ң�ֱ��pָ���i��Ԫ�ػ�pΪ��
			p = p.getNext();// ָ���̽��
			++j;// ��������ֵ��1
		}
		if (j > i || p == null) { // iС��0���ߴ��ڱ���1
			throw new Exception("��" + i + "��Ԫ�ز�����");// ����쳣
		}
		return p.getData();// ����Ԫ��p
	}

	// �ڴ�ͷ��㵥�����е�i������Ԫ��֮ǰ����һ��ֵΪx������Ԫ��
	public void insert(int i, Object x) throws Exception {
		Node p = head;// ��ʼ��pΪͷ���,jΪ������
		int j = -1; // ��i�����ǰ����λ��
		while (p != null && j < i - 1) {// Ѱ��i������ǰ��
			p = p.getNext();
			++j;// ��������ֵ��1
		}
		if (j > i - 1 || p == null) // i���Ϸ�
			throw new Exception("����λ�ò�����");// ����쳣

		Node s = new Node(x); // �����½��
		s.setNext(p.getNext());// ���뵥������
		p.setNext(s);
	}

	// �����Ա��е�i������Ԫ��ɾ��������iȡֵ��ΧΪ��0��i��length()- 1,���iֵ���ڴ˷�Χ���׳��쳣
	public void remove(int i) throws Exception {
		Node p = head;// pָ��Ҫɾ������ǰ�����
		int j = -1;
		while (p.getNext() != null && j < i - 1) {// Ѱ��i������ǰ��
			p = p.getNext();
			++j;// ��������ֵ��1
		}
		if (j > i - 1 || p.getNext() == null) { // iС��0���ߴ��ڱ���1
			throw new Exception("ɾ��λ�ò�����");// ����쳣
		}
		p.setNext(p.getNext().getNext());// ɾ�����
	}

	// �ڴ�ͷ���ĵ������в���ֵΪx��Ԫ�أ�����ҵ����������ظ�Ԫ�������Ա��е�λ�ã����򷵻�-1
	public int indexOf(Object x) {
		Node p = head.getNext();// ��ʼ��,pָ���׽��,jΪ������
		int j = 0;
		while (p != null && !p.getData().equals(x)) {// �ӵ������е��׽��Ԫ�ؿ�ʼ���ң�ֱ��p.getData()ָ��Ԫ��x�򵽴ﵥ����ı�β
			p = p.getNext();// ָ����һ��Ԫ��
			++j;// ��������ֵ��1
		}
		if (p != null)// ���pָ����е�ĳһԪ��
			return j;// ����xԪ����˳����е�λ��
		else
			return -1;// xԪ�ز���˳�����
	}

	// ������Ա��е�����Ԫ��
	public void display() {
		Node node = head.getNext();// ȡ����ͷ���ĵ������е��׽��Ԫ��
		while (node != null) {
			System.out.print(node.getData() + " ");// �������Ԫ�ص�ֵ
			node = node.getNext();// ȡ��һ�����
		}
		System.out.println();// ����
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	// �ڷǵݼ������������в���һ��ֵΪx������Ԫ�أ���ʹ�������Ա�������Ĳ���
	//����һ
    public void insert(int  x) {
		Node p = head.getNext();
		Node q = head;// q������¼p��ǰ�����
		int temp;
		while (p != null) {
			temp = ((Integer) p.getData()).intValue();
			if (temp < x) {
				q = p;
				p = p.getNext();
			} else
				break;
		}

		Node s = new Node(x); // �����½��
		s.setNext(p);// ��s�����뵽�������q�����p���֮��
		q.setNext(s);
	}
    // �ڷǵݼ������������в���һ��ֵΪx������Ԫ�أ���ʹ�������Ա�������Ĳ���
	//������
    public void insert1(int  x) {
		Node p = head.getNext();

		while (p.getNext() != null&&((Integer) p.getNext().getData()).intValue()<x) {
            p = p.getNext();
		}
		Node s = new Node(x); // �����½��
		s.setNext(p.getNext());// ��s�����뵽�������q�����p���֮��
		p.setNext(s);
	}

    // ʵ�ֶԵ�����͵�����(���õ���ͷ�巨)
	public void reverse() {
		Node p = head.getNext();
		head.setNext(null);
		Node q;
		while (p != null) {
			q = p.getNext();
			p.setNext(head.getNext());
			head.setNext(p);
			p = q;
		}
	}

	// ʵ��ɾ����������������ֵ����x�����н��Ĳ����������ر�ɾ�����ĸ���
	public int removeAll(Object x) {
		Node p = head.getNext();// ��ʼ��,pָ���׽��,jΪ������
		Node q = head; // ������¼p��ǰ�����
		int j = 0;// ������¼��ɾ�����ĸ���
		while (p != null) { // �ӵ������е��׽�㿪ʼ�������������һ��
			if (p.getData().equals(x)) {
				q.setNext(p.getNext());
				++j;// ��������ֵ��1
			} else
				q = p;
			p = p.getNext();// ָ����һ��Ԫ��
		}
		return j;// ���ر�ɾ�����ĸ���
	}
}
