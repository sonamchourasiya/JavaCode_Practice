package solution1;

public class Exception {

  private String length;
  private String message;
  
  public void setlength(String length)
  {
	  if(length()>80)
		  throw new  ExceptionLineToolLong();
	    this.length=length;
	    this.message=message;
	    
  }

@Override
public String toString() {
	return "Exception [length=" + length + "]";
}
  
  

}
