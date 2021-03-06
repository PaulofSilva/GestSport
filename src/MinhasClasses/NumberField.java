/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MinhasClasses;

import javax.swing.JTextField;  
import javax.swing.text.AttributeSet;  
import javax.swing.text.BadLocationException;  
import javax.swing.text.Document;  
import javax.swing.text.PlainDocument; 

/**
 *
 * @author Paulo Silva
 */
public class NumberField extends JTextField 
{
    /** 
     *  
     */  
    private static final long serialVersionUID = 1L;  
  
    public NumberField(int cols) {  
         super(cols);  
     }  
  
     protected Document createDefaultModel() {  
          return new NumberDocument();  
     }  
  
     static class NumberDocument extends PlainDocument {  
  
         /** 
         *  
         */  
        private static final long serialVersionUID = 1L;  
  
        public void insertString(int offs, String str, AttributeSet a)   
              throws BadLocationException {  
  
              if (str == null) {  
              return;  
              }  
              for (int i = 0; i < str.length(); i++) {  
                  if(Character.isDigit(str.charAt(i))== false){  
                      return;  
                  }  
              }  
              super.insertString(offs, new String(str), a);  
          }  
     }  
    
}
