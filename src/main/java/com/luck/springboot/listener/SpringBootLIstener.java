package com.luck.springboot.listener;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class SpringBootLIstener implements ApplicationListener{
	Logger logger=LogManager.getLogger(SpringBootLIstener.class);
	
	public void onApplicationEvent(ApplicationEvent arg0) {
		// TODO Auto-generated method stub
		/**
		 * 应用运行时，事件会以下面的次序发送：
		 1. 在运行开始，但除了监听器注册和初始化以外的任何处理之前，会发送一
			个 ApplicationStartedEvent 。
		 2. 在Environment将被用于已知的上下文，但在上下文被创建前，会发送一
			个 ApplicationEnvironmentPreparedEvent 。
		 3. 在refresh开始前，但在bean定义已被加载后，会发送一
			个 ApplicationPreparedEvent 。
		 4. 在refresh之后，相关的回调处理完，会发送一个 ApplicationReadyEvent ，
			表示应用准备好接收请求了。
		 5. 启动过程中如果出现异常，会发送一个 ApplicationFailedEvent
		 */
		logger.debug("luck:=====================>"+arg0);
	}

	
}
