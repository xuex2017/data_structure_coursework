package DivideTEST;

import midTerm.MyLinkList;


public class testDivide {
	public static void main(String[] args) {
        String str1 = "shine bright like a diamond  \n shine bright like a diamond  \nshine bright like a diamond  \nfind light in a beautiful sea I choose to be happy";
        DvdStr sstr = new DvdStr(str1);
        Count[] test=new Count[500];
        test=sstr.Divide();
        System.out.println("ԭ�ַ���Ϊ "+str1);
        for(int i=0;i<500;i++)
        if(test[i].getTerm()!="")	
        System.out.println("����"+test[i].getTerm()+"������"+test[i].getFreq()+"��");
        MyLinkList allWord=new MyLinkList();//�鲢ʮ��ժҪ�����в�ͬ�Ĵ�
     
        	for(int j=0;j<500;j++)
        	if(test[j].getTerm()!="")
        	allWord.insert(test[j].getTerm());
        
        int sum=allWord.length();
        System.out.println("����"+sum+"����ͬ�Ĵ�");
    }
}
