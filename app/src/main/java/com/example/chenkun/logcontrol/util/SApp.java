package com.example.chenkun.logcontrol.util;

import android.app.Application;
/**
 * provide server domain and log log control, in principle, 
 * each application should inherit it. 
 * @author sky
 * @author 1.0
 */
public abstract class SApp extends Application {
	/** whether stored in debug mode */
	private static boolean sDebugMode = false;
	/**
	 * server domain name, you can use {@code sDomain} + hostPath() stitching
	 * the various applications of URL
	 */
	private static String sDomain = "http://www.emporia.com/";
	/** when the server using c++ prepared, available  */
	private static String sCgi = "cgi-bin/";
	private static String sPath = "launcher";

	@Override
	public void onCreate() {
		super.onCreate();
		sDebugMode = isDebugMode();
		sPath = hostPath();
		// FIXME:start log control
		Log.setDebug(sDebugMode);
		// FIXME: register activity lifecycle
		registerActivityLifecycleCallbacks(new ActivityLifecycleMonitor());
		if (sDebugMode) {
			//FIXME: debug mode server domain name  
			sDomain = "http://www.emporia.com.debug/";
		}
	}
	/**
	 * get application server url
	 * @return return url string
	 */
	public static String getServerUrl() {
		return sDomain + sCgi + sPath;
	}

	/**
	 * sub class can control the log switch
	 * @return print as true, otherwise false
	 */
	protected abstract boolean isDebugMode();

	/**
	 * path in URL
	 * @return application path String
	 */
	protected abstract String hostPath();

}
