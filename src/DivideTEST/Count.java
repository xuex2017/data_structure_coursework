package DivideTEST;

public class Count {
  String term;
  int freq;
  
  public Count() {    //�޲ι��췽��
      term="";
      freq=0;
  }
  public Count(String term) {  //�вι��췽��
      this.term = term;
      freq = 1;
      
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
