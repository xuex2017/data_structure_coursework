package midTerm;

//ͼ���ڽӱ�洢��ʾ�еĶ�������
public class VNode {
	private Object data;// ������Ϣ

	private ArcNode firstArc;// ָ���һ�������ڸö���Ļ�

	public VNode() {
		this(null, null);
	}
	public VNode(Object data) {
		this(data, null);
	}
	public VNode(Object data, ArcNode firstArc) {
		this.data = data;
		this.firstArc = firstArc;
	}

	public Object getData() {
		return data;
	}

	public ArcNode getFirstArc() {
		return firstArc;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public void setFirstArc(ArcNode firstArc) {
		this.firstArc = firstArc;
	}



}
