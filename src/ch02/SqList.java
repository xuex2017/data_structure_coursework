package ch02;

/**
 * 
 * ˳�����Ա����������
 * 
 */
public class SqList implements IList {
	private Object[] listElem; // ���Ա�洢�ռ�

	private int curLen; // ��ǰ����

	// ˳���Ĺ��캯��������һ���洢�ռ�����ΪmaxSize�����Ա�
	public SqList(int maxSize) {
		curLen = 0; // ��˳���ĵ�ǰ����Ϊ0
		listElem = new Object[maxSize];// Ϊ˳������maxSize���洢��Ԫ
	}

	// ��һ���Ѿ����ڵ����Ա��óɿձ�
	public void clear() {
		curLen = 0; // ��˳���ĵ�ǰ����Ϊ0

	}

	// �жϵ�ǰ���Ա�������Ԫ�ظ����Ƿ�Ϊ0,��Ϊ0��������true�����򷵻�false
	public boolean isEmpty() {
		return curLen == 0;
	}

	// �����Ա��е�����Ԫ�ظ������ɺ���������ֵ
	public int length() {
		return curLen; // ����˳���ĵ�ǰ����
	}

	// ��ȡ�����Ա��еĵ�i������Ԫ�ز��ɺ���������ֵ������iȡֵ��ΧΪ��0��i��length()-1,���iֵ���ڴ˷�Χ���׳��쳣
	public Object get(int i) throws Exception {
		if (i < 0 || i > curLen - 1) // iС��0���ߴ��ڱ���1
			throw new Exception("��" + i + "��Ԫ�ز�����"); // ����쳣

		return listElem[i]; // ����˳����е�i������Ԫ��
	}

	// �����Ա�ĵ�i������Ԫ��֮ǰ����һ��ֵΪx������Ԫ�ء�����iȡֵ��ΧΪ��0��i��length()�����iֵ���ڴ˷�Χ���׳��쳣,��i=0ʱ��ʾ�ڱ�ͷ����һ������Ԫ��x,��i=length()ʱ��ʾ�ڱ�β����һ������Ԫ��x
	public void insert(int i, Object x) throws Exception {
		if (curLen == listElem.length) // �ж�˳����Ƿ�����
			throw new Exception("˳�������");// ����쳣

		if (i < 0 || i > curLen) // iС��0���ߴ��ڱ�
			throw new Exception("����λ�ò�����");// ����쳣

		for (int j = curLen; j > i; j--)
			listElem[j] = listElem[j - 1];// ����λ�ü�֮���Ԫ�غ���

		listElem[i] = x; // ����x
		curLen++;// ������1
	}

	// �����Ա��е�i������Ԫ��ɾ��������iȡֵ��ΧΪ��0��i��length()- 1,���iֵ���ڴ˷�Χ���׳��쳣
	public void remove(int i) throws Exception {
		if (i < 0 || i > curLen - 1) // iС��1���ߴ��ڱ���1
			throw new Exception("ɾ��λ�ò�����");// ����쳣

		for (int j = i; j < curLen - 1; j++)
			listElem[j] = listElem[j + 1];// ��ɾ��Ԫ��֮���Ԫ������

		curLen--; // ���ȼ�1
	}

	// �������Ա����״γ���ָ��Ԫ�ص�����������б�������Ԫ�أ��򷵻� -1
	public int indexOf(Object x) {
		int j = 0;// jΪ������
		while (j < curLen && !listElem[j].equals(x))
			// ��˳����е��׽�㿪ʼ���ң�ֱ��listElem[j]ָ��Ԫ��x�򵽴�˳���ı�β
			j++;
		if (j < curLen)// �ж�j��λ���Ƿ�λ�ڱ���
			return j; // ����xԪ����˳����е�λ��
		else
			return -1;// xԪ�ز���˳�����
	}

	// ������Ա��е�����Ԫ��
	public void display() {
		for (int j = 0; j < curLen; j++)
			System.out.print(listElem[j] + " ");
		System.out.println();// ����

	}

	// ʵ�ֶ�˳���͵�����
	public void reverse() {
		for (int i = 0,j=curLen-1; i < j; i++,j--) {
			Object temp = listElem[i];
			listElem[i] = listElem[j];
			listElem[j] = temp;
		}
	}

	// ʵ�ֶ�˳�������kλ
	public void shit(int k) {
		int n=curLen,p=0,i,j,l;
        Object temp;
     	for(i=1;i<=k;i++)
          if(n%i==0&&k%i==0) //��n��k�����Լ��p
              p=i;
        for(i=0;i<p;i++){
           j=i;
           l=(i+n-k)%n;
           temp=listElem[i];
           while(l!=i){
             listElem[j]=listElem[l];
             j=l;
             l=(j+n-k)%n;
           }// ѭ������һ��
        listElem[j]=temp;
        }
    }
}
