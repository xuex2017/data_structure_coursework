package DivideTEST;

import ch04.SeqString;


/**
统计当前字符串中的单词个数。
 
 */
public class DvdStr extends SeqString {

    public DvdStr(String str) {
        super(str);
    }

    public Count[] Divide() {//方法：分词并计数
    	Count[] result=new Count[500];
        for(int i=0;i<500;i++){
        	result[i]=new Count();
        }
        
        int sum=0;//词数
        char currChar,preChar;
        
       
        String currWord=new String();
        
        currWord=currWord+this.charAt(0);
        for (int i = 1; i < this.length(); i++) {
        	currChar = this.charAt(i);   //当前字符
            preChar = this.charAt(i - 1);  //前一个字符
            if (((int) (currChar) < 65 || (int) (currChar) > 122 //当前字符不是字母
                    || ((int) (currChar) > 90 && (int) (currChar) < 97))
                    && (((int) (preChar) >= 65 && (int) (preChar) <= 90) //当前字符的前一个字符是字母
                    || ((int) (preChar) >= 97 && (int) (preChar) <= 122))) 
            { 
            	if(sum==0){
            	result[sum]=new Count(currWord);
        		sum++;		
                }
            	else{
            		int j=0;
            		for(j=0;j<sum;j++){
            			if (currWord.equals(result[j].getTerm())){//如果有相同的词，词频加1
            				result[j].setFreq(result[j].getFreq()+1);	
            				j=-1;
            				break;
            				}
            		}
            			if(j!=-1){//没有相同的词，新建result[]
            				result[sum]=new Count(currWord);
            				sum++;
            				}
            	}	
            	currWord=new String();
            	}
            
            else{
            	if((((int) (charAt(i)) >= 65 && (int) (charAt(i)) <= 90) 
                        || ((int) (charAt(i)) >= 97 && (int) (charAt(i)) <= 122)))
            	currWord=currWord+this.charAt(i);
            	}
           
            	
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

