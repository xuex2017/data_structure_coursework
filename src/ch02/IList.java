package ch02;

/**
 * 
 * ���Ա�Ľӿ�
 * 
 */
public interface IList {
	public void clear(); // ��һ���Ѿ����ڵ����Ա��óɿձ�

	public boolean isEmpty(); // �жϵ�ǰ���Ա��е�����Ԫ�ظ����Ƿ�Ϊ0,��Ϊ0��������true�����򷵻�false

	public int length(); // �����Ա��е�����Ԫ�ظ������ɺ���������ֵ

	public Object get(int i) throws Exception;// ��ȡ�����Ա��еĵ�i������Ԫ�ز��ɺ���������ֵ������iȡֵ��ΧΪ��0��i��length()-1,���iֵ���ڴ˷�Χ���׳��쳣

	public void insert(int i, Object x) throws Exception;// �����Ա�ĵ�i������Ԫ��֮ǰ����һ��ֵΪx������Ԫ�ء�����iȡֵ��ΧΪ��0��i��length()�����iֵ���ڴ˷�Χ���׳��쳣,��i=0ʱ��ʾ�ڱ�ͷ����һ������Ԫ��x,��i=length()ʱ��ʾ�ڱ�β����һ������Ԫ��x

	public void remove(int i) throws Exception;// �����Ա��е�i������Ԫ��ɾ��������iȡֵ��ΧΪ��0��i��length()- 1,���iֵ���ڴ˷�Χ���׳��쳣

	public int indexOf(Object x);// �������Ա����״γ���ָ��Ԫ�ص�����������б�������Ԫ�أ��򷵻� -1
	
	public void display();// ������Ա��е�����Ԫ��

}
