package professionaleventforcaster;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mr.Mohammed
 */
public class Numerology {
   
//================================ Build contructor for the program====================================
    
		public String cName;
                public String mName;
		public String Birthdate;
                int  resultmname,result;
                
//		public Numerology(String scName,String smName, String sBirthdate, int resultMname, int reSult )
//		{
//			 cName = scName;
//                         mName = smName;
//			 Birthdate = sBirthdate;
//                         resultmname = resultMname;
//                         result = reSult;
//		}

//=========================================== Return the cName inputted==================================
                
		public String getcName()
		{
			return cName;
		}
                
//============================================ Return the mName inputted=====================================
                
		public String getmName()
		{
			return mName;
		}

//============================================ Format the birthdate for Data Extraction===========================
                
		public String getBirthdate()
		{
			String oBirthdate = Birthdate;
			Birthdate = Birthdate.replaceAll("/", "");
			Birthdate = Birthdate.replaceAll("-", "");
			return oBirthdate;
		}

//================================================= Obtain Attitude Number=============================
		public int getAttitude()
		{
			int intNum;
			String sBirthdate ;
			sBirthdate = Birthdate.substring(0,4);
			intNum = Integer.parseInt(sBirthdate);
			intNum = NumFormat(intNum);
			return intNum;
		}

//===================================== Calculate the Birthday Number =====================================
                
		public int getBirthDay()
		{
			int intNum;
			String sBirthdate ;
			sBirthdate = Birthdate.substring(2,4);
			intNum = Integer.parseInt(sBirthdate);
			intNum = NumFormat(intNum);
			return intNum;
		}
                
//==================================== Obtain the LifePath Number=====================================
                
		public int getLifePath()
		{
			int intNum;
			String sBirthdate = Birthdate;
			intNum = Integer.parseInt(sBirthdate);
			intNum = NumFormat(intNum);
			return intNum;
		}

//==================================== Obtain the Current Personality Number===================================
                
		public int getCurrentPersonality(String name)
		{
              
                        int kkkk = 0;
			String sName = name;
	 		sName = sName.replaceAll(" ", "");
	 		sName = sName.toLowerCase();
                        
                     if(!sName.equals("")){
                      char[] chaCpers = sName.toCharArray();//moh 'v','u','t','h' 
                         for(char tempCpers :chaCpers){
                           if(tempCpers == 'b'||tempCpers == 'c'||tempCpers == 'd'||tempCpers == 'f'||tempCpers == 'g'||tempCpers == 'h'||tempCpers == 'j'||tempCpers == 'k'||tempCpers == 'l'||tempCpers == 'm'
                              ||tempCpers == 'n'||tempCpers == 'p'||tempCpers == 'q'||tempCpers == 'r'||tempCpers == 's'||tempCpers == 't'||tempCpers == 'v'||tempCpers == 'w'||tempCpers == 'x'||tempCpers == 'z'){
                                     int re=0;
                               char[] n ={tempCpers};
                                      for(char te :n){
                                         re+=te-96;
                                 if(re >96 || re <123)
                                    
                                     resultmname+=re;
                                      }
                 }if(resultmname ==22|| resultmname ==11 || resultmname ==33){
                         kkkk=resultmname;
                         
                         } 
       
       else if   (resultmname >9 && resultmname !=22 || resultmname !=11 || resultmname !=33 ){
                        kkkk= ((resultmname%9==0)? 9 : resultmname%9);
                         
       }
      }
    }  
	return kkkk ;
		
}
                
          
//==================================== Obtain the Mother Personality Number===================================
                
		public int getMothertPersonality()
		{

			String sName = getmName();
	 		sName = sName.replaceAll(" ", "");
	 		sName = sName.toLowerCase();
                        
                                    
                     if(sName.equals("")){
                         
                         char[] chMpers = sName.toCharArray();
                         
                           for(char tempMpers : chMpers){
                               
                            if(tempMpers == 'b'||tempMpers == 'c'||tempMpers == 'd'||tempMpers == 'f'||tempMpers == 'g'||tempMpers == 'h'||tempMpers == 'j'||tempMpers == 'k'||tempMpers == 'l'||tempMpers == 'm'
                                   ||tempMpers == 'n'||tempMpers == 'p'||tempMpers == 'q'||tempMpers == 'r'||tempMpers == 's'||tempMpers == 't'||tempMpers == 'v'||tempMpers == 'w'||tempMpers == 'x'||tempMpers == 'z'){
                                      
                                         if(tempMpers <=97 && tempMpers >=122){  
                                          
                                             resultmname+=tempMpers-96;
                   }
                                         
                 }while(resultmname >9 && resultmname ==11 || resultmname ==22 || resultmname ==33){
                        result= ((resultmname%9==0)? 9 : resultmname%9);
       }    
      }
    }
	return result ;
		
}
                
// =====================================Calculates the Mother Soul Number==========================================
                
		public int getMotherSoul()
		{
				String sName = getmName();
		 		sName = sName.replaceAll(" ", "");
		 		sName = sName.toLowerCase();
                 if(!sName.equals("")) { 
                     
                 char[] chMsoul = sName.toCharArray();
        
                        for(char tempMsoul : chMsoul){
            
                              if(tempMsoul =='a'|| tempMsoul=='e'||tempMsoul=='i' ||tempMsoul=='o' ||tempMsoul=='u' || tempMsoul=='y'){
                
                                      if(tempMsoul >=97 && tempMsoul <=122){
                
                                    resultmname+=tempMsoul-96;
                    }
                                      
                  }while(resultmname >9 || resultmname == 11 ||  resultmname == 22 ||resultmname == 33){
                             resultmname-=9;
            }
         
       }
   }
 return resultmname;
}



//============================= format the number for display=================================================
                
		public int NumFormat(int iNum)
		{
			String strNum = String.valueOf(iNum);
			int iTotal = 0;
		if (iNum < 10)
		{
			return iNum;
		}
		else
		{
			while (strNum.length() > 1)
			{
				iTotal = 0;
				for( int intCount = 0;
					intCount < strNum.length();
					intCount++)
					{
						iTotal += Integer.parseInt(strNum.substring(intCount,
						(intCount+1)));
					}
					strNum = String.valueOf(iTotal);
			}
		}
		return iTotal;

}
                
                //=================Exit=====================

private JFrame frame;

public void iExitsystem(){
 
    frame = new JFrame("Exit");
    if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Billing System", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
        System.exit(0);
    }
}

//============= Key Numbers Only======================

public void NumbersOnly(java.awt.event.KeyEvent evt){
    
    char iNumber = evt.getKeyChar();
    if(!(Character.isDigit(iNumber)) 
        || (iNumber == KeyEvent.VK_BACK_SPACE)
        ||(iNumber == KeyEvent.VK_DELETE)){
        
        evt.consume();
    }
}
    
    /**
     *
     * @param evt
     */
    public void CharactersOnly(java.awt.event.KeyEvent evt){
    
    char character = evt.getKeyChar();
    if(!(Character.isAlphabetic(character))) 
     {
        
        evt.consume();
    }
        
}

}
