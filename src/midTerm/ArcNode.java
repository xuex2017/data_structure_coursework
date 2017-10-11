package midTerm;

//ͼ���ڽӱ�洢��ʾ�еĻ������
public class ArcNode {
	private int adjVex;// �û���ָ��Ķ���λ��

	private int value;// �ߵ�Ȩֵ

	private ArcNode nextArc;// ָ����һ����

	public ArcNode() {
		this(-1, 0, null);
	}

	public ArcNode(int adjVex) {
		this(adjVex, 0, null);
	}

	public ArcNode(int adjVex, int value) {
		this(adjVex, value, null);
	}

	public ArcNode(int adjVex, int value, ArcNode nextArc) {
		this.value = value;
		this.adjVex = adjVex;
		this.nextArc = nextArc;
	}

	public int getValue() {
		return value;
	}

	public ArcNode getNextArc() {
		return nextArc;
	}

	public int getAdjVex() {
		return adjVex;
	}

	public void setAdjVex(int adjVex) {
		this.adjVex = adjVex;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public void setNextArc(ArcNode nextArc) {
		this.nextArc = nextArc;
	}
}
