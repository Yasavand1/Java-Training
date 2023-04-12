package com.extra;



import java.util.Optional;

public class OptionalEg {

	/*public static String getName(){
		return null;	//Bad practice
	}
	*/
	public static Optional<String> getName(){
		if(Math.random() >0.5){
			return Optional.of("Joe");
		}
		return Optional.empty();//Good practice Resultsin Optional[Joe]
	}
	

	public static void main(String[] args) {
		Optional<String> result = getName();
		//System.out.println(result);			//op: Optional[Joe]

		//System.out.println(result.orElse("not found"));	//op: not found
		
		/*Dont use the get() as the following. 
		 * It will throw NoSuchElementException than NullPointerException
		Exception in thread "main" java.util.NoSuchElementException: No value present
		
		*/
		//System.out.println(result.get());		

		//Instead of using get() use orElse() method which returns Optional
		System.out.println(result.orElse("OOOO"));			//Joe
	}

}


