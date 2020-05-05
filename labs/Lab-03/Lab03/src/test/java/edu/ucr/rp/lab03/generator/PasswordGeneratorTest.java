
package edu.ucr.rp.lab03.generator;

import java.util.stream.Stream;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



/**
 *
 * @author Angie Mora Núñez
 */
public class PasswordGeneratorTest {
PasswordGeneratorBuilder builder = new PasswordGeneratorBuilder();

@Before
public void setUp(){
            builder
                .withspecialChars(new char[]{'#', '@', ')'})
                .withMinSpecialChars(2)
                .withMinUpperCase(2)
                .withminNumbers(1)
                .withmaxLength(8);
}//setUp

  //*******************************************************************************************
    /**
     * Scenario: Generar un password con al menos 1 mayúscula - Given: Cantidad mínima de mayúscula -> Precondiciones
     * - When: Generamos el password -> Acción a probar
     * - Then: El password contiene al menos mayúscula -> Validaciones
     */
    @Test
    public void givenAnUppercaseAPasswordIsGenerated(){
        PasswordGenerator passwordGenerator = builder.build();
            setUp();
        
        String password = passwordGenerator.generate();
        System.out.println(password);
        Assert.assertTrue("Invalid number of uppercase", getUpperCases(password)>=1);//validación 
    }//obtener eL uppercase
    
    private long getUpperCases(String password) {
        //asde@$%f ->['a','s','d','e','@','$','%','f']
        return password.chars().filter(letter -> Character.isUpperCase(letter)).count();
    }//getUppercase
  //*******************************************************************************************
    
    /**
     * Scenario: Generar un password con al menos 1 caracter especial - Given:
     * Given Cantidad mínima de un caracter especial - 
     * And: una lista de caracters -
     * When: Generamos el password - 
     * Then: El password contiene al menos un
     * caracter especial de la lista de caracters
     */
    //*******************************************************************************************  
     @Test
     public void givenAnSpecialCharsPasswordGenerate(){
        PasswordGenerator passwordGenerator = builder
                .withspecialChars(new char[]{'#', '@', ')'})
                .withMinSpecialChars(2)
                .withMinUpperCase(2)
                .withminNumbers(1)
                .withMaxLength(10)
                .build();
      
        
        String password = passwordGenerator.generate();
         System.out.println(password);
        Assert.assertTrue("Invalid number of uppercase", getSpecialchars(password)>=1);//validación 
        Assert.assertTrue("Invalid number of uppercase", containsSpecialChar(password,'#', '@', ')','!'));
    }//obtener el uppercase
    
    private long getSpecialchars(String password) {
        //asde@$%f ->['a','s','d','e','@','$','%','f']
        return password.chars().filter(it -> !Character.isLetter(it)).count();
    }//getUppercase obteer los que tiene
    
    private boolean containsSpecialChar(String password, Character...specialChars){
        return password.chars().filter(specialChar-> Stream.of(specialChars).
                    filter(param ->specialChar==param).findAny().
                    isPresent()).findAny().isPresent(); 
    }//password boolean si existe o no el carcater
  
    
    //*******************************************************************************************
    /**
     * Scenario: Generar un password con minimo 4 números :
     * Given Cantidad mínima de numeros - 
     * When: Generamos el password -
     */
    
     @Test
     public void givenAnNumberIsGenerated(){
        PasswordGenerator passwordGenerator = builder.build();
            setUp();
        
        String password = passwordGenerator.generate();
         System.out.println(password);
        Assert.assertTrue("Invalid number of uppercase", getUpperCases(password)>=1);//validación 
    }//obtener eL uppercase
    
    private long getNumber(String password) {
        //asde@$%f ->['a','s','d','e','@','$','%','f']
         return password.chars().filter(Number -> Character.isDigit(Number)).count();
    }//getUppercase
    
    
    //*******************************************************************************************
    /**
     * Scenario: Generar un password con al menos 1 caracter especial - Given:
     * Given Cantidad mínima de un caracter especial - 
     * And: una lista de caracters -
     * When: Generamos el password - 
     * Then: El password contiene al menos un
     * caracter especial de la lista de caracters
     */


  //*******************************************************************************************
   @Test
     public void givenAnSpecialCharscantidadPasswordGenerate(){
        PasswordGenerator passwordGenerator = builder
                .withspecialChars(new char[]{'#', '@', ')'})
                .withMinSpecialChars(4)
                .withMinUpperCase(2)
                .withminNumbers(1)
                .withMaxLength(10)
                .build();
      
        
        String password = passwordGenerator.generate();
         System.out.println(password);
        Assert.assertTrue("Invalid number of uppercase", getSpecialcharscantidad(password)>=4);//validación 
        Assert.assertTrue("Invalid number of uppercase", containsSpecialChar(password,'#', '@', ')','!'));
    }//obtener el uppercase
    
    private long getSpecialcharscantidad(String password) {
        //asde@$%f ->['a','s','d','e','@','$','%','f']
        return password.chars().filter(it -> !Character.isLetter(it)).count();
    }//getUppercase obteer los que tiene
    
    private boolean containsSpecialCharcantidad(String password, Character...specialChars){
        return password.chars().filter(specialChar-> Stream.of(specialChars).
                    filter(param ->specialChar==param).findAny().
                    isPresent()).findAny().isPresent(); 
    }//password boolean si existe o no el carcater
  

    
    
      //*******************************************************************************************
    /**
     * Scenario: Generar un password con minimo 4 letras mayusculas :
     * Given Cantidad mínima de numeros - 
     * When: Generamos el password -
     */
    
//     @Test
//     public void givenAnUpperCase(){
//        PasswordGenerator passwordGenerator = builder.build();
//            setUp();
//        
//        String password = passwordGenerator.generate();
//         System.out.println(password);
//        Assert.assertTrue("Invalid number of uppercase", getUpperCases(password)>=1);//validación 
//    }//obtener eL uppercase
//    
//    private long getLetter(String password) {
//        //asde@$%f ->['a','s','d','e','@','$','%','f']
//         return password.chars().filter(letter -> Character.isLetter(letter).count());
//    }//getUppercase
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}//PassworGenerateMain


  
   






    
//    private long getSpecialChar (String password){
//        int count = 0;
//        //{'@','&','#'}
//            for(int i=0;i<password.length(); i++){
//                if(password.charAt(i)=='@'||
//                password.charAt(i)=='&'||
//                password.charAt(i)=='#'){
//                count++;
//                }
//            }
//        return count;
//    }
//    
//    
//    
//    ------
//    
//        private boolean containsSpecialChar(String password, Character...specialChars){
//        //"edre$%" ->[e,d,r,e,$,%]
//       return  password.chars()
//                .filter(specialChar -> Stream.of(specialChars).filter(param ->specialChar==param )
//                        .findAny().isPresent()).findAny().isPresent();
//        
//    }
//    
//    
//    ----
//            Assert.assertTrue("Invalid speacial char", containsSpecialChar(password,'#', '@', ')'));
//
//    
    
    