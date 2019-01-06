package com.venture.some.design.pattern.main;

import com.venture.some.design.pattern.WechatServer;
import com.venture.some.design.pattern.impl.User;

public class ObserverPattern {

	public static void main(String[] args) {

		WechatServer wechatServer = new WechatServer();
		
		wechatServer.registerOberver(new User("Robert"));
		wechatServer.registerOberver(new User("John"));
		wechatServer.registerOberver(new User("Lucy"));
		
		wechatServer.notifyOberver("Java");
	}
}
