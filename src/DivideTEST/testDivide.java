package DivideTEST;

import midTerm.MyLinkList;


public class testDivide {
	public static void main(String[] args) {
        String str1 = "shine bright like a diamond  \n shine bright like a diamond  \nshine bright like a diamond  \nfind light in a beautiful sea I choose to be happy";
        DvdStr sstr = new DvdStr(str1);
        Count[] test=new Count[500];
        test=sstr.Divide();
        System.out.println("原字符串为 "+str1);
        for(int i=0;i<500;i++)
        if(test[i].getTerm()!="")	
        System.out.println("单词"+test[i].getTerm()+"出现了"+test[i].getFreq()+"次");
        MyLinkList allWord=new MyLinkList();//归并十个摘要中所有不同的词
     
        	for(int j=0;j<500;j++)
        	if(test[j].getTerm()!="")
        	allWord.insert(test[j].getTerm());
        
        int sum=allWord.length();
        System.out.println("共有"+sum+"个不同的词");
    }
}
