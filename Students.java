package week3.day1;

public class Students {
    public void getStudentInfo( int id) {
    	System.out.println("student id is :" +id);
    }
    public void getStudentInfo(int id ,String name) {
    	System.out.println("student id is:"+id);
    	System.out.println("student name is:"+name);
   
    }
    public void getStudentInfo(String email,int phonenumber) {
    	System.out.println("Student email is:"+email);
    	System.out.println("Student phonenumber is:"+phonenumber);
    }
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Students st = new Students();
		st.getStudentInfo(100);
	    st.getStudentInfo(100,"Revathi");
		st.getStudentInfo("revathivassu@gmail.com", 906925112);

	}

}
