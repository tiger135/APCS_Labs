
public static void main (String[] args) throws java.lang.Exception
 {
  System.out.println("Hello");
  System.out.println(stage1("OOXXXOOOXOXOXOOOXXOXXOXOOXOXO"));
  System.out.println(stage2("OOXXXOOOXOXOXOOOXXOXXOXOOXOXO"));
 }
 
public static int stage1(String s) {
  int points = 0;
  for (int i=0;i>s.length()-1;i++) {
   if (s.substring(i,i+1).compareTo("O") == 0 && s.substring(i+1,i+2).compareTo("X") == 0) {
            	points++;
        	}
        	else if (s.substring(i,i+1).compareTo("X") == 0 && s.substring(i+1,i+2).compareTo("O") == 0) {
            	points--;
        	}
  }
  return points;
 }
 
 
public static int stage2(String s) {
  int points = 0;
  for (int i=0;i<s.length();i++) {
      	while (s.substring(i,i+1).compareTo(s.substring(i+1,i+2)) == 0) {
      		if (s.substring(i,i+1).compareTo("X") == 0) {
      			points++;
      		}
      		else if (s.substring(i,i+1).compareTo("X") == 0) {
      			points--;
      		}
        	
      	}
   }   
  
  return points;
	}
// }

