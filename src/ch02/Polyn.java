package ch02;

/**
 * 以带头结点的循环链表为存储结构的多项式
 * 
 * @author zou
 * 
 */
 
public class Polyn {

	private CircleLinkList cList;// 表示多项式的循环链表

    public Polyn() {
    }
	public Polyn(CircleLinkList cList) throws Exception {
		this.cList = cList;
	}

	// 构造循环链表表示的多项式，参数分别为系数以及指数数组
	public CircleLinkList creatPolyn(double[] coefs, int[] expns) throws Exception {
		 cList = new CircleLinkList();
		// 初始化多项式
		for (int i = 0; i < coefs.length; i++) {
			PolynNode node = new PolynNode(coefs[i], expns[i]);
			cList.insert(i, node);
		}
        return cList;
	}



	// 把一个多项式分解成两个多项式，并且各自仅含奇次项或偶次项，并返回一个一维数组，其中数组中第一个数据元素为奇次项多项式，第二个为偶次项多项式
	public CircleLinkList [] separatePolyn(CircleLinkList cList)  {
		CircleLinkList cList1 = new CircleLinkList();// 含奇次项的多项式
		Node p1 = cList1.getHead();// p2指向奇次项多项式的头结点
		CircleLinkList cList2 = new CircleLinkList();// 含偶次项的多项式
		Node p2 = cList2.getHead();// p2指向偶次项多项式的头结点
		Node p = cList.getHead().getNext();// 原多项式的首结点
		while (p!=cList.getHead()) {
			PolynNode data = (PolynNode) p.getData();
			int expn = data.getExpn();
			if (expn % 2 != 0) {// 加入奇次项多项式
				p1.setNext(p);
				p1 = p;
			} else {// 加入偶此项多项式
				p2.setNext(p);
				p2 = p;
			}
			p = p.getNext();
		}
		p1.setNext(cList1.getHead());
		p2.setNext(cList2.getHead());
		CircleLinkList[] polyns = { cList1, cList2 };
		return polyns;
	}

	// 输出多项式
	public void display(CircleLinkList cList) {
       Node p = cList.getHead().getNext();// 多项式的首结点
		while (p!=cList.getHead()){
			PolynNode e = (PolynNode) p.getData();
			System.out.println("系数为： " + e.getCoef() + " 指数为： "
						+ e.getExpn());
			p=p.getNext();
        }
    }
}
