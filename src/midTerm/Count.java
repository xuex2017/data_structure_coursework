package midTerm;

public class Count {//Count�࣬���ڴ�ŵ��ʼ����Ƶ
  String term;   //����
  int freq;   //��Ƶ
  
  public Count() {    //�޲ι��췽��
      this.setTerm("");
      this.setFreq(0);
  }
  public Count(String term) {  //�вι��췽��
	  this.setTerm(term);
      this.setFreq(1);
      
  }
  
  public Count(String term,int freq) {  //�вι��췽��
	  this.setTerm(term);
      this.setFreq(freq   );
      
  }
  
  public void setTerm(String term){
	  this.term=term;
  }
  
  public void setFreq(int freq){
	  this.freq=freq;
  }
  
  public String getTerm(){
	  return this.term;
  }
  
  public int getFreq(){
	  return this.freq;
  }
}