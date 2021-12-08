/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employees;

import java.util.Calendar;

/**
 *
 * @author admin
 */
//hello abvcdjhksd
public class Employees {
  
   
    public static void main(String[] args) {
    int Experiences=0;
     int Intern = 0;
     int Fresher=0;
          Calendar instance = Calendar.getInstance();
        int year = instance.get(Calendar.YEAR);
        for (int i = 2010; i <= year; i++) {
            Intern += 10;
            Experiences += 20;
            Fresher += 15;
             int total1 = Intern+Experiences+Fresher;
             if(i==2010){
                System.out.println("Số nhân viên thấp nhất công ty là "+ total1);
            }
             if(i == year){
                 System.out.println("Số nhân viên cao nhất công ty là "+ total1);
             }
            System.out.println("Số nhân viên năm "+i+" là :" +total1);
            
        }
        int total = Intern+Experiences+Fresher;
        System.out.println("Tổng số nhân viên từ 2010 đến nay là: " + total );
        System.out.println("Tông số bạn Intern công ty hiện có là: " + Intern);
        System.out.println("Tông số bạn Fresher công ty hiện có là: " + Fresher);
         System.out.println("Tông số bạn Experiences công ty hiện có là: " + Experiences);
         
         
    }
    
    
    
}
