package com.basic.java.constractor;

public class ConstractorConceptLearning {
	
	int a ;

	
	ConstractorConceptLearning(){
		
		System.out.println("Hi am constructor");
	}
	
ConstractorConceptLearning(int b){
		
		System.out.println("Hi am param constructor");
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstractorConceptLearning constractorConceptLearning = new ConstractorConceptLearning();
		ConstractorConceptLearning constractorConceptLearning1 = new ConstractorConceptLearning(10);
		
		System.out.println(constractorConceptLearning.a);

	}

}
