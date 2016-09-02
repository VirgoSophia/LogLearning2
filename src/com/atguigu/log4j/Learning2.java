package com.atguigu.log4j;

import org.apache.log4j.Logger;

public class Learning2 {
	
	private static final Logger logger = Logger.getLogger(Learning2.class);
	
	public static void main(String[] args) {
		logger.info("-------start");
		logger.debug("-------debug");
		int a = 0;
		try {
			a = 19/0;
		} catch (Exception e) {
			logger.error(e.getMessage(), e.getCause());
		}
		logger.warn("-------warn");
		logger.info("-------end"+a);
		
	}

}
