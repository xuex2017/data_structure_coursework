package DivideTEST;

import ch04.SeqString;


/**
ͳ�Ƶ�ǰ�ַ����еĵ��ʸ�����
 
 */
public class DvdStr extends SeqString {

    public DvdStr(String str) {
        super(str);
    }

    public Count[] Divide() {//�������ִʲ�����
    	Count[] result=new Count[500];
        for(int i=0;i<500;i++){
        	result[i]=new Count();
        }
        
        int sum=0;//����
        char currChar,preChar;
        
       
        String currWord=new String();
        
        currWord=currWord+this.charAt(0);
        for (int i = 1; i < this.length(); i++) {
        	currChar = this.charAt(i);   //��ǰ�ַ�
            preChar = this.charAt(i - 1);  //ǰһ���ַ�
            if (((int) (currChar) < 65 || (int) (currChar) > 122 //��ǰ�ַ�������ĸ
                    || ((int) (currChar) > 90 && (int) (currChar) < 97))
                    && (((int) (preChar) >= 65 && (int) (preChar) <= 90) //��ǰ�ַ���ǰһ���ַ�����ĸ
                    || ((int) (preChar) >= 97 && (int) (preChar) <= 122))) 
            { 
            	if(sum==0){
            	result[sum]=new Count(currWord);
        		sum++;		
                }
            	else{
            		int j=0;
            		for(j=0;j<sum;j++){
            			if (currWord.equals(result[j].getTerm())){//�������ͬ�Ĵʣ���Ƶ��1
            				result[j].setFreq(result[j].getFreq()+1);	
            				j=-1;
            				break;
            				}
            		}
            			if(j!=-1){//û����ͬ�Ĵʣ��½�result[]
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

