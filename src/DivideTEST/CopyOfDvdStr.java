package DivideTEST;

import ch04.SeqString;


/**
 * 3.1：编写基于SeqString类的成员函数count(),统计当前字符串中的单词个数。
 
 */
public class CopyOfDvdStr extends SeqString {

    public CopyOfDvdStr(String str) {
        super(str);
    }

    public Count[] Divide() {//方法：分词并计数
    	Count[] result=new Count[500];
        for(int i=0;i<500;i++){
        	result[i]=new Count();
        }
        
        int sum=0;//词数
        char currChar,preChar;
        
        int m=0;//新单词的第一个字符下标
        int n=0;//新单词后第一个非字母字符的下标
        String currWord="";
        
       
        for (int i = n; i < this.length(); i++) {
        	
            currChar = this.charAt(i);   //当前字符
            if(i!=0){
            preChar = this.charAt(i - 1);  //前一个字符
            }
            else
            	preChar=' ';
            if (((int) (preChar) < 65 || (int) (preChar) > 122 //当前字符的前一个字符不是字母
                    || ((int) (preChar) > 90 && (int) (preChar) < 97))
                    && (((int) (currChar) >= 65 && (int) (currChar) <= 90) //当前字符是字母
                    || ((int) (currChar) >= 97 && (int) (currChar) <= 122))) {
                m=i;
            }
        }
        
        for (n= m+1; n < this.length(); n++) {
        	
            currChar = this.charAt(n);   //当前字符
            preChar = this.charAt(n - 1);  //前一个字符
            if (((int) (currChar) < 65 || (int) (currChar) > 122 //当前字符不是字母
                    || ((int) (currChar) > 90 && (int) (currChar) < 97))
                    && (((int) (preChar) >= 65 && (int) (preChar) <= 90) //当前字符的前一个字符是字母
                    || ((int) (preChar) >= 97 && (int) (preChar) <= 122))) {
            	currWord+=this.substring(m,n);//当前单词
            	m=n;
            }
        }
        
        
        for(int i=0;i<sum+1;i++){
        	if (currWord.equals(result[i].term)){
        	    result[i].setFreq(result[i].getFreq()+1);	
        	}
        	else {
        	result[sum]=new Count(currWord);
    		sum++;
        	}
        	currWord="";
        		
        }
        
  
        for(int p=0;p<sum;p++){//单词排序
        	for(int q=p;q<sum;q++)
        	if (result[q].term.compareTo(result[p].term)<0){
        		Count temp=new Count();
        		temp.setTerm (result[p].getTerm());
        		temp.setFreq (result[p].getFreq());
        		result[p].setTerm(result[q].getTerm());
        		result[p].setFreq(result[q].getFreq());
        		result[q].setTerm(temp.getTerm());
        		result[q].setFreq(temp.getFreq());	
        	}
        }
        return result;
    }


}

