package com.saf.constants;

public final class FrameworkConstants {
	
	private FrameworkConstants() {}
	
	private static final String RESOURCEPATH = System.getProperty("user.dir") +"/src/test/resources";
	private static final String CONFIGFILEPATH = RESOURCEPATH +"/Config/config.properties";
	
	public static String getConfigFilePath() {
		return CONFIGFILEPATH;
	}

	

}
