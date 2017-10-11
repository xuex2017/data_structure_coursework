package midTerm;
import java.util.Scanner;


public class MyLinkList {
	private MyNode head;// �������ͷָ��

	// ������Ĺ��캯��
	public MyLinkList() {
		head = new MyNode(); // ��ʼ��ͷ���
	}

	public MyLinkList(int n, boolean Order) throws Exception {
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
		MyNode p = head.getNext();// ��ʼ��,pָ���׽��,lengthΪ������
		int length = 0;
		while (p != null) {// ���׽�������ң�ֱ��pΪ��
			p = p.getNext();// ָ���̽��
			++length;// ������1
		}
		return length;
	}

	// ��ȡ��ͷ��㵥�����еĵ�i������Ԫ��
	public String get(int i) throws Exception {
		MyNode p = head.getNext();// ��ʼ��,pָ���׽��,jΪ������
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
	public void insert(int i, String x) throws Exception {
		MyNode p = head;// ��ʼ��pΪͷ���,jΪ������
		int j = -1; // ��i�����ǰ����λ��
		while (p != null && j < i - 1) {// Ѱ��i������ǰ��
			p = p.getNext();
			++j;// ��������ֵ��1
		}
		if (j > i - 1 || p == null) // i���Ϸ�
			throw new Exception("����λ�ò�����");// ����쳣

		MyNode s = new MyNode(x); // �����½��
		s.setNext(p.getNext());// ���뵥������
		p.setNext(s);
	}

	// �����Ա��е�i������Ԫ��ɾ��������iȡֵ��ΧΪ��0��i��length()- 1,���iֵ���ڴ˷�Χ���׳��쳣
	public void remove(int i) throws Exception {
		MyNode p = head;// pָ��Ҫɾ������ǰ�����
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
	public int indexOf(String x) {
		MyNode p = head.getNext();// ��ʼ��,pָ���׽��,jΪ������
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
		MyNode node = head.getNext();// ȡ����ͷ���ĵ������е��׽��Ԫ��
		while (node != null) {
			System.out.print(node.getData() + " ");// �������Ԫ�ص�ֵ
			node = node.getNext();// ȡ��һ�����
		}
		System.out.println();// ����
	}

	public MyNode getHead() {
		return head;
	}

	public void setHead(MyNode head) {
		this.head = head;
	}

	// �ڷǵݼ������������в���һ��ֵΪx������Ԫ�أ���ʹ�������Ա�������Ĳ���
	//����һ
    public void insert(String  x) {
		MyNode p = head.getNext();
		MyNode q = head;// q������¼p��ǰ�����
		String temp;
		while (p != null) {
			temp = p.getData();
			if (temp.compareTo(x)<0) {
				q = p;
				p = p.getNext();
			} else
				break;
		}

		MyNode s = new MyNode(x); // �����½��
		s.setNext(p);// ��s�����뵽�������q�����p���֮��
		q.setNext(s);
	}
    // �ڷǵݼ������������в���һ��ֵΪx������Ԫ�أ���ʹ�������Ա�������Ĳ���
	//������
    public void insert1(String  x) {
		MyNode p = head.getNext();

		while (p.getNext() != null&&p.getNext().getData().compareTo(x)<0) {
            p = p.getNext();
		}
		MyNode s = new MyNode(x); // �����½��
		s.setNext(p.getNext());// ��s�����뵽�������q�����p���֮��
		p.setNext(s);
	}

  
	// ʵ��ɾ����������������ֵ����x�����н��Ĳ����������ر�ɾ�����ĸ���
	public int removeAll(Object x) {
		MyNode p = head.getNext();// ��ʼ��,pָ���׽��,jΪ������
		MyNode q = head; // ������¼p��ǰ�����
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
