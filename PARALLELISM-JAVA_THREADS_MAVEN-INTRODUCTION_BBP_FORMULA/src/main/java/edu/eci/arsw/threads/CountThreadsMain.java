/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.threads;

/**
 *
 * @author hcadavid
 */
public class CountThreadsMain {
    
    public static void main(String a[]){
    	CountThread thread099 = new CountThread(0, 99);
    	CountThread thread99199 = new CountThread(99, 199);
    	CountThread thread200299 = new CountThread(200, 299);
    	
    	thread099.run();
    	thread99199.run();
    	thread200299.run();
    }
    
}
