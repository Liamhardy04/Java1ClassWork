/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

public class PhoneBook {
//       Person person[]; 
       Person people[] = new Person[100];
           
       int pBLength;
       public PhoneBook() {
           pBLength = 0;
           Person person = new Person("Liam","Hardy","5109238452");
           
         
           
       }
       public void addPerson(String firstName, String lastName, String phoneNumber) {
           people[pBLength] = person;
           pBLength ++;
       
       }
       public void printEntries() {
           for (int i = 0; i < pBLength; i++) {
               System.out.println(people[i]);
           }
    
    }
       

    
}
