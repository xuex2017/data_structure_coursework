package midTerm;



import ch04.CrossList;
import ch04.OLNode;
import ch06.MGraph;



public class MidTerm {
	static final String X1="a";//将文摘中高频出现的虚词赋值给静态变量X1~X21
	static final String X2="an";
	static final String X3="and";
	static final String X4="for";
	static final String X5="in";
	static final String X6="is";
	static final String X7="are";
	static final String X8="the";
	static final String X9="to";
	static final String X10="on";
	static final String X11="that";
	static final String X12="this";
	static final String X13="of";
	static final String X14="The";
	static final String X15="as";
	static final String X16="In";
	static final String X17="we";
	static final String X18="be";
	static final String X19="by";
	static final String X20="This";
	static final String X21="with";

   
   
    
    public static void main(String[] args) {
        String str1 = "Global positioning system-enabled vehicles provide an efficient way to obtain large quantities of movement data for individuals. However, the raw data usually lack activity information, which is highly valuable for a range of applications and services. This study provides a novel and practical framework for inferring the trip purposes of taxi passengers such that the semantics of taxi trajectory data can be enriched. The probability of points of interest to be visited is modeled by Bayes' rules, which take both spatial and temporal constraints into consideration. Combining this approach with Monte Carlo simulations, we conduct a study on Shanghai taxi trajectory data. Our results closely approximate the residents' travel survey data in Shanghai. Furthermore, we reveal the spatiotemporal characteristics of nine daily activity types based on inference results, including their temporal regularities, spatial dynamics, and distributions of trip lengths and directions. In the era of big data, we encounter the dilemma of trajectory data rich but activity information poor when investigating human movements from various data sources. This study presents a promising step toward mining abundant activity information from individuals' trajectories.";
        String str2 = "Online news has become one of the major channels for Internet users to get news. News websites are daily overwhelmed with plenty of news articles. Huge amounts of online news articles are generated and updated everyday, and the processing and analysis of this large corpus of data is an important challenge. This challenge needs to be tackled by using big data techniques which process large volume of data within limited run times. Also, since we are heading into a social-media data explosion, techniques such as text mining or social network analysis need to be seriously taken into consideration. In this work we focus on one of the most common daily activities: web news reading. News websites produce thousands of articles covering a wide spectrum of topics or categories which can be considered as a big data problem. In order to extract useful information, these news articles need to be processed by using big data techniques. In this context, we present an approach for classifying huge amounts of different news articles into various categories (topic areas) based on the text content of the articles. Since these categories are constantly updated with new articles, our approach is based on Evolving Fuzzy Systems (EFS). The EFS can update in real time the model that describes a category according to the changes in the content of the corresponding articles. The novelty of the proposed system relies in the treatment of the web news articles to be used by these systems and the implementation and adjustment of them for this task. Our proposal not only classifies news articles, but it also creates human interpretable models of the different categories. This approach has been successfully tested using real on-line news. (C) 2015 Elsevier B.V. All rights reserved.";
        String str3 = "Big data has become an important issue for a large number of research areas such as data mining, machine learning, computational intelligence, information fusion, the semantic Web, and social networks. The rise of different big data frameworks such as Apache Hadoop and, more recently, Spark, for massive data processing based on the MapReduce paradigm has allowed for the efficient utilisation of data mining methods and machine learning algorithms in different domains. A number of libraries such as Mahout and SparkMLib have been designed to develop new efficient applications based on machine learning algorithms. The combination of big data technologies and traditional machine learning algorithms has generated new and interesting challenges in other areas as social media and social networks. These new challenges are focused mainly on problems such as data processing, data storage, data representation, and how data can be used for pattern mining, analysing user behaviours, and visualizing and tracking data, among others. In this paper, we present a revision of the new methodologies that is designed to allow for efficient data mining and information fusion from social media and of the new applications and frameworks that are currently appearing under the umbrella of the social networks, social media and big data paradigms. (C) 2015 Elsevier B.V. All rights reserved.";
        String str4 = "Data mining is a technique used to discover pattern and knowledge from a big amount of data. It uses artificial intelligence, automatic learning, statistics, databases, etc. In this study, DM was successfully used as a predictive tool to assess disyllabic speech test performance in bilateral implanted patients with a success rate above 90 %. 60 bilateral sequentially implanted adult patients were included in the study. The DM algorithms developed found correlations between unilateral medical records and Audiological test results and bilateral performance by establishing relevant variables based on two DM techniques: the classifier and the estimation. The nearest neighbor algorithm was implemented in the first case, and the linear regression in the second. The results showed that patients with unilateral disyllabic test results below 70 % benefited the most from a bilateral implantation. Finally, it was observed that its benefits decrease as the inter-implant time increases.";
        String str5 = "Desired material synthesis and design can be directly predicted on the basis of first principle calculations and machine learning. Material big data is constructed based on density functional theory where every possible element combinations are considered and then used as training sets for support vector machines. The predicted material properties for common materials are successfully matched with experimental data. In addition, material combinations based on desired material properties are also able to be predicted. Thus, the proposed work flow becomes the bridge between the material database and designing materials. The approach enables efficient material mining from material big data and could potentially reveal undiscovered desired materials. This approach could also potentially enable targeted material mining from material big data, the unveiling of undiscovered desired materials, and the execution of targeted material synthesis in experiment. (C) 2015 Elsevier B.V. All rights reserved.";
        String str6 = "Quality Management occupies a strategic role in organizations, and the adoption of computer tools within an aligned information architecture facilitates the challenge of making more with less, promoting the development of a competitive edge and sustainability. A formal Information Architecture (IA) lends organizations an enhanced knowledge but, above all, favours management. This simplifies the reinvention of processes, the reformulation of procedures, bridging and the cooperation amongst the multiple actors of an organization. In the present investigation work we planned the IA for the Quality Management System (QMS) of a Hospital, which allowed us to develop and implement the QUALITUS (QUALITUS, name of the computer application developed to support Quality Management in a Hospital Unit) computer application. This solution translated itself in significant gains for the Hospital Unit under study, accelerating the quality management process and reducing the tasks, the number of documents, the information to be filled in and information errors, amongst others.";
        String str7 = "It is challenging to get an overview and understanding of the activities and their relations at an emergency department (ED). This is due to the complicated relations among activities - called operations in this paper - and the always changing system behavior. Two key enablers to get this overview are the transformation of real-time events into understandable information and an operation-based behavior description. This paper presents an event-based information architecture for healthcare (EVAH) for gathering state changing events in real-time at an ED and how these are transformed into an operation-based representation. EVAH together with the tool Sequence Planner, will be used for visualization, online prognosis and optimization.";
        String str8 = "Organizing and structuring online information becomes a mainstream activity within large organizations as increasing volumes of information are made available via the web. General methodologies, best practice, and guidelines for web information architecture (IA) have been developed and refined. This research paper extends the knowledge base for web IA by examining situated practice within large organizations and building theory to provide a deeper understanding of how large organizations construct information-rich websites. A grounded theory, The Situated Practice of Web IA in Large Organizations, is proposed as an integrated theoretical framework for practice in this context. The theoretical framework is composed of 4 foundational constructs titled: owning, negotiating, enacting, and knowing web IA. Building on these foundations, an integrating central construct of practicing web IA is proposed. This theoretical framework will inform large organizations and practitioners as they approach web IA.";
        String str9 = "An Information Architecture is the basis for a comprehensive and integrated information system of any organization, capable of providing answers that meet the challenges posed by the contemporary competitive environment. In this paper we analyse a number of representative methodologies used in Information Architecture definitions and, based on a set of pre-defined criteria, we select the Adapted BSP ( Business Systems Planning) Methodology to apply in a local public administration organization in Portugal. This methodology proved to be sufficiently flexible and suited to the goals proposed.";
        String str10= "Modern digital libraries not only contain rich digital resources, they are also required to provide an environment which integrates collection provision, information services, and academic activities to support effective learning. This work chose the Digital Library of Nature and Culture established by the National Museum of Natural Science in Taiwan to investigate whether the design of the information architecture of a digital library influences learning performance and whether learners with different learning styles have different information usage behaviors and learning performance when they use the digital library to support e-learning. This work suggested that e-learning supported by a digital library resulted in excellent learning performance. Regarding the influence of information architecture on learning performance, this work found that the organization system was crucial to learning performance. Further, learners with different learning performance exhibit different behaviors when they use the information architecture of the digital library. Another finding was that the learning performance of global learners was better than that of sequential learners. Global learners and those learners with superior learning performance relied more heavily on the organization system, while sequential learners and those learners with inferior learning performance relied more heavily on the search system. (C) 2014 Elsevier Ltd. All rights reserved.";
        DvdStr [] paperAbstract = new DvdStr [10];
        paperAbstract[0] = new DvdStr(str1);
        paperAbstract[1] = new DvdStr(str2);
        paperAbstract[2] = new DvdStr(str3);
        paperAbstract[3] = new DvdStr(str4);
        paperAbstract[4] = new DvdStr(str5);
        paperAbstract[5] = new DvdStr(str6);
        paperAbstract[6] = new DvdStr(str7);
        paperAbstract[7] = new DvdStr(str8);
        paperAbstract[8] = new DvdStr(str9);
        paperAbstract[9] = new DvdStr(str10);
        Count[][] Divide=new Count[10][500];
        
        for(int i=0;i<10;i++){
        	Divide[i]=paperAbstract[i].Divide();
        }
        
        MyLinkList allWord=new MyLinkList();//归并十个摘要中所有不同的词
        
        String Total=new String();
        Total+=str1+str2+str3+str4+str5+str6+str7+str8+str9+str10;
        DvdStr AllAbstract = new DvdStr(Total);
        Count[] TotalCount=new Count[2000];
        TotalCount= AllAbstract.Divide();
        
        
        for(int i=0;i<2000;i++){
        	if(TotalCount[i].getTerm()!=null&&TotalCount[i].getTerm()!="")
        		allWord.insert(TotalCount[i].getTerm());
        	else break;
        }
        int sum=allWord.length();
        
        
         System.out.println("十篇摘要中共有"+sum+"个不同的词");
         
         CrossList countWord=new CrossList(10,sum);//创建十字链表
         for(int i=0;i<10;i++){
         	for(int j=0;j<sum;j++){
         		if(Divide[i][j].getTerm()!=null&&Divide[i][j].getTerm()!=""){
         		int index=allWord.indexOf(Divide[i][j].getTerm());
         		countWord.Insert(i+1,index+1, Divide[i][j].getFreq());//存放词频
         		}
         		else break;
         		}
         }
         String[] word=new String[sum];
         for(int i=0;i<sum;i++){
         	word[i]=TotalCount[i].getTerm();
         }
         System.out.println("摘要-词的稀疏矩阵的三元组形式输出为");
         countWord.printByTriple();//输出十字链表
         
         MGraph collocate=new MGraph();//创建无向网collocate
         collocate.createUDN(sum,sum*sum,word);
         
       
         for(int i=0;i<10;i++){//给边赋权值，横向扫描
        	 
        		 OLNode rtemp1 =countWord.rhead[i];
            	 rtemp1 = rtemp1.getRight;
        		
                 for (int j = 0; j < sum; j++) {

                     if (rtemp1 != null &&  rtemp1.col == j+1) {//第j+1个词在第i+1行出现过
                    	 OLNode rtemp2 =rtemp1.getRight;
                    	 for(int k=j+1; k<sum; k++){
                    		 
                    		 if (rtemp2 != null &&  rtemp2.col == k + 1){//第k+1个词在第i+1行出现过
                    			
                    		 collocate.arcs[j][k]+=min(rtemp1.e,rtemp2.e); //两个词的共现次数取较小值
                    		 collocate.arcs[k][j]=collocate.arcs[j][k]; 
                    		  
                    		 rtemp2 = rtemp2.getRight;
                    		 }
                    		 
                    			 
                    	 }   
                    	 rtemp1 = rtemp1.getRight; 
                     }
            			 
            		 
                 }
                
         }
         
       
         
         System.out.println("十篇摘要中，按照单词共现次数由高到低，共现结果为：");
         
         for(int k=60;k>3;k--)//按照边的权值由高到低输出词的共现次数
        	 for(int i=0;i<sum;i++)
        		 for(int j=i+1;j<sum;j++){
             		if(collocate.arcs[i][j]==k)
             			if(word[i].compareTo(X1)!=0&&word[i].compareTo(X2)!=0//剔除虚词
             			&&word[i].compareTo(X3)!=0&&word[i].compareTo(X4)!=0
             			&&word[i].compareTo(X5)!=0&&word[i].compareTo(X6)!=0
             			&&word[i].compareTo(X7)!=0&&word[i].compareTo(X8)!=0
             			&&word[i].compareTo(X9)!=0&&word[i].compareTo(X10)!=0
             			&&word[i].compareTo(X11)!=0&&word[i].compareTo(X12)!=0
             			&&word[i].compareTo(X13)!=0&&word[i].compareTo(X14)!=0
                     	&&word[i].compareTo(X15)!=0&&word[i].compareTo(X16)!=0
                     	&&word[i].compareTo(X17)!=0&&word[i].compareTo(X18)!=0
                     	&&word[i].compareTo(X19)!=0&&word[i].compareTo(X20)!=0
                        &&word[i].compareTo(X21)!=0
             			&&word[j].compareTo(X1)!=0&&word[j].compareTo(X2)!=0
             			&&word[j].compareTo(X3)!=0&&word[j].compareTo(X4)!=0
             			&&word[j].compareTo(X5)!=0&&word[j].compareTo(X6)!=0
             			&&word[j].compareTo(X7)!=0&&word[j].compareTo(X8)!=0
             			&&word[j].compareTo(X9)!=0&&word[j].compareTo(X10)!=0
             			&&word[j].compareTo(X11)!=0&&word[j].compareTo(X12)!=0
             			&&word[j].compareTo(X13)!=0&&word[j].compareTo(X14)!=0
                     	&&word[j].compareTo(X15)!=0&&word[j].compareTo(X16)!=0
                     	&&word[j].compareTo(X17)!=0&&word[j].compareTo(X18)!=0
                     	&&word[j].compareTo(X19)!=0&&word[j].compareTo(X20)!=0
                        &&word[j].compareTo(X21)!=0)
             	         System.out.println("单词  "+word[i]+" 和单词  "+word[j]+"共现"+collocate.arcs[i][j]+"次");
 
        		 }

     
    
        
    }

	private static int min(int e, int e2) {
		if(e<=e2)
		return (e);
		else return e2;
	}
    }
    

