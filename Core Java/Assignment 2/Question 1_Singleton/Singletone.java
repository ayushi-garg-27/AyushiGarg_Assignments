package assignment.second.java.first_Question.Singleton;

public class Singletone {
	private static Singletone single_instance = null;
	  

    public String s;
  

    private Singletone()
    {
        s = "This is a Singleton Class and It cannot be inherited";
    }
  
    
    public static Singletone getInstance()
    {
        if (single_instance == null)
            single_instance = new Singletone();
  
        return single_instance;
    }

}
