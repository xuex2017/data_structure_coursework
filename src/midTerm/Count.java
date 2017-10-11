package midTerm;

public class Count {//Count类，用于存放单词及其词频
  String term;   //单词
  int freq;   //词频
  
  public Count() {    //无参构造方法
      this.setTerm("");
      this.setFreq(0);
  }
  public Count(String term) {  //有参构造方法
	  this.setTerm(term);
      this.setFreq(1);
      
  }
  
  public Count(String term,int freq) {  //有参构造方法
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