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
public class Cdestiny {
     int  resultmname,result;
     
     
//========================================= Create Current Power Name =====================================
                
		public int getCurrentPowerName(String pname)
		{
                          int kk = 0;
			String  spName =pname;
	 		spName = spName.replaceAll(" ", "");
	 		spName = spName.toLowerCase();
                        
                  if(!spName.equals("")){
                      
                     char[] chCdestiny = spName.toCharArray();// 'v','u','t','h'
                     
                       for(char tempCdestiny :chCdestiny){
                                    int rep=0;
                               char[] np ={tempCdestiny};
                                      for(char tep :np){
                                         rep+=tep-96;
                                 if(rep >96 || rep <123)
                                    
                                     resultmname+=rep;
                                      }
                if(resultmname ==22|| resultmname ==11 || resultmname ==33){
                         kk=resultmname;
                         
                         } 
       
       else if   (resultmname >9 && resultmname !=22 || resultmname !=11 || resultmname !=33 ){
                        kk= ((resultmname%9==0)? 9 : resultmname%9);
                                 
                    }  
                  }            
    
       }
            return kk ;
}
      
}
