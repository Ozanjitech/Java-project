/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package professionaleventforcaster;

/**
 *
 * @author Mr. Mohammed
 */
public class Csoul {
     int  resultmname,result;
     
     // =====================================Calculates the Current Soul Number==========================================
                
		public int getCurrentSoul(String sname)
		{
                                int kkk = 0;
				String ssName = sname;
		 		ssName = ssName.replaceAll(" ", "");
		 		ssName = ssName.toLowerCase();
                                
                 if(!ssName.equals("")) {  
                     
                  char[] chCsoul = ssName.toCharArray(); //'c','f','d','m'
                  
                      for(char tempCsoul : chCsoul){
                          
                          if(tempCsoul =='a'|| tempCsoul=='e'||tempCsoul=='i' ||tempCsoul=='o' ||tempCsoul=='u' || tempCsoul=='y'){
                                int reer=0;
                               char[] nn ={tempCsoul};
                                      for(char tes :nn){
                                         reer+=tes-96;
                                 if(reer >96 || reer <123)
                                    
                                     resultmname+=reer;
                                      }
                 }if(resultmname ==22|| resultmname ==11 || resultmname ==33){
                         kkk=resultmname;
                         
                         } 
       
       else if   (resultmname >9 && resultmname !=22 || resultmname !=11 || resultmname !=33 ){
                        kkk= ((resultmname%9==0)? 9 : resultmname%9);
                                 
                    }
            }
         
       }
   
 return kkk;
}

}
