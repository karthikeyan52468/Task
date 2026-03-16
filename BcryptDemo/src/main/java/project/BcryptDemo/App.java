package project.BcryptDemo;

import org.mindrot.jbcrypt.BCrypt;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String s1="helloworld";
        String s2="$2a$10$P4oWKTZpobEw..KPWO0BXO7Ggut2kzQdLO.vaR65sJK8dJ136lN26";
        if(BCrypt.checkpw(s1, s2))
        {
        	System.out.print(true);
        }
        else {
        	System.out.println(false);
        }
      //  System.out.println(BCrypt.hashpw(s1, BCrypt.gensalt()));
      	
    }
}
