
package crypt2;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Crypt2 {
public static byte[] sha1(String message)throws NoSuchAlgorithmException{
    MessageDigest md=MessageDigest.getInstance("SHA-1");
    md.update(message.getBytes());
    byte []s=md.digest();
    return s;
}
 public static String hexaToString(byte[] digest ){ 
         // Convert digest to a string 
         StringBuffer hexString = new StringBuffer(); 
         for (int i = 0; i < digest.length; i++) { 
             if ((0xff & digest[i]) < 0x10) { 
                 hexString.append("0" + Integer.toHexString((0xFF & digest[i]))); 
               } else { 
                 hexString.append(Integer.toHexString(0xFF & digest[i])); 
             } 
         }   
         return hexString.toString();   
     } 

   
    public static void main(String[] args) throws NoSuchAlgorithmException {
      BigInteger comp=new BigInteger ("0");
      BigInteger x=new BigInteger ("0");
      comp=BigInteger.valueOf(0);
     String interval="0000000000000000000ffdd712a852e0d4234e6b";
      x=BigInteger.valueOf(0);
       int three=3;
       int one=1;
       int s=5;
       
       while (s>0){
       String message;
      
       message="mechenguel mohammed hakim"+x.toString();
        byte[] digest = sha1(message);
        String hash = hexaToString(digest);
       s=hash.compareTo(interval);
       comp=comp.add(BigInteger.valueOf(one));
       x=x.add(BigInteger.valueOf(three));
       System.out.println("treating");
       System.out.println(comp);
       
       }
       
       
     System.out.println("le nombre d'essai:"+comp);   
}
}