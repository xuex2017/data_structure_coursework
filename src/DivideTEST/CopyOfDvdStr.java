package DivideTEST;

import ch04.SeqString;


/**
 * 3.1����д����SeqString��ĳ�Ա����count(),ͳ�Ƶ�ǰ�ַ����еĵ��ʸ�����
 
 */
public class CopyOfDvdStr extends SeqString {

    public CopyOfDvdStr(String str) {
        super(str);
    }

    public Count[] Divide() {//�������ִʲ�����
    	Count[] result=new Count[500];
        for(int i=0;i<500;i++){
        	result[i]=new Count();
        }
        
        int sum=0;//����
        char currChar,preChar;
        
        int m=0;//�µ��ʵĵ�һ���ַ��±�
        int n=0;//�µ��ʺ��һ������ĸ�ַ����±�
        String currWord="";
        
       
        for (int i = n; i < this.length(); i++) {
        	
            currChar = this.charAt(i);   //��ǰ�ַ�
            if(i!=0){
            preChar = this.charAt(i - 1);  //ǰһ���ַ�
            }
            else
            	preChar=' ';
            if (((int) (preChar) < 65 || (int) (preChar) > 122 //��ǰ�ַ���ǰһ���ַ�������ĸ
                    || ((int) (preChar) > 90 && (int) (preChar) < 97))
                    && (((int) (currChar) >= 65 && (int) (currChar) <= 90) //��ǰ�ַ�����ĸ
                    || ((int) (currChar) >= 97 && (int) (currChar) <= 122))) {
                m=i;
            }
        }
        
        for (n= m+1; n < this.length(); n++) {
        	
            currChar = this.charAt(n);   //��ǰ�ַ�
            preChar = this.charAt(n - 1);  //ǰһ���ַ�
            if (((int) (currChar) < 65 || (int) (currChar) > 122 //��ǰ�ַ�������ĸ
                    || ((int) (currChar) > 90 && (int) (currChar) < 97))
                    && (((int) (preChar) >= 65 && (int) (preChar) <= 90) //��ǰ�ַ���ǰһ���ַ�����ĸ
                    || ((int) (preChar) >= 97 && (int) (preChar) <= 122))) {
            	currWord+=this.substring(m,n);//��ǰ����
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
        
  
        for(int p=0;p<sum;p++){//��������
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

