
package builderpatterndemo2;
import builderpatterndemo2.generator.PasswordGenerator;
import builderpatterndemo2.generator.PasswordGeneratorBuilder;

/**
 *
 * @author Angie Mora Núñez
 */
public class BuilderPatternDemo2 {

    public static void main(String args[]) {
       
       PasswordGeneratorBuilder builder = new  PasswordGeneratorBuilder();
        PasswordGenerator generator = builder.withmaxLength(10)
               .withminNumbers(1)
               .withMinSpecialChars(2)
               .withMinUpperCase(1)
               .withspecialChars(new char[]{'&','$','%','@','#'})
               .withMaxLength(4)
               .build();
     
       System.out.println(generator.generate(generator));
       
        
}//main

}//BuilderPattherndemo   
