/**
 * 
 */
package com.venture.some.design.pattern;

import java.util.Date;

/**
 * @author SSH8963
 *
 */
public class ChatRoom {
	
	public static void sendMessage(User user) {
		
		System.out.println(new Date().toString()
		         + " [" + user.getName() +"] : " + user.getMessage());
	}

}
