package com.example.chenkun.logcontrol.util;

/**
 * log util, using this tool, you can control your log as a system.
 * 
 * @author sky
 * @version 1.0
 */
public final class Log {
	/** log flag you can call {@code setDebug(true)} start log, defalut false */
	private static boolean sDebug = false;
	/** log level, follow the system level */
	public static final int VERBOSE = 1;
	public static final int DEBUG = 2;
	public static final int INFO = 3;
	public static final int WARN = 4;
	public static final int ERROR = 5;
	
	private Log() {}

	/** @see android.util.Log.v(String tag, String msg) */
	public static void v(String tag, String msg) {
		if (sDebug)
			log(VERBOSE, tag, msg, null);
	}

	/** @see android.util.Log.v(String tag, String msg, Throwable tr) */
	public static void v(String tag, String msg, Throwable tr) {
		if (sDebug)
			log(VERBOSE, tag, msg, tr);
	}

	/** @see android.util.Log.d(String tag, String msg) */
	public static void d(String tag, String msg) {
		if (sDebug)
			log(DEBUG, tag, msg, null);
	}

	/** @see android.util.Log.d(String tag, String msg, Throwable tr) */
	public static void d(String tag, String msg, Throwable tr) {
		if (sDebug)
			log(DEBUG, tag, msg, tr);
	}

	/** @see android.util.Log.i(String tag, String msg) */
	public static void i(String tag, String msg) {
		if (sDebug)
			log(INFO, tag, msg, null);
	}

	/** @see android.util.Log.i(String tag, String msg, Throwable tr) */
	public static void i(String tag, String msg, Throwable tr) {
		if (sDebug)
			log(INFO, tag, msg, tr);
	}

	/** @see android.util.Log.w(String tag, String msg) */
	public static void w(String tag, String msg) {
		if (sDebug)
			log(WARN, tag, msg, null);
	}

	/** @see android.util.Log.w(String tag, String msg, Throwable tr) */
	public static void w(String tag, String msg, Throwable tr) {
		if (sDebug)
			log(WARN, tag, msg, tr);
	}

	/** @see android.util.Log.e(String tag, String msg) */
	public static void e(String tag, String msg) {
		if (sDebug)
			log(ERROR, tag, msg, null);
	}

	/** @see android.util.Log.e(String tag, String msg, Throwable tr) */
	public static void e(String tag, String msg, Throwable tr) {
		if (sDebug)
			log(ERROR, tag, msg, tr);
	}

	/**
	 * log control switch, true represents printing log, otherwise false
	 * 
	 * @param debug @see boolean
	 */
	public static void setDebug(boolean debug) {
		sDebug = debug;
	}

	/**
	 * call system log print
	 * 
	 * @param type log level
	 * @param tag Used to identify the source of a log message. It usually
	 *            identifies the class or activity where the log call occurs.
	 * @param msg The message you would like logged.
	 * @param tr An exception to log
	 */
	private static void log(int type, String tag, String msg, Throwable tr) {
		switch (type) {
		case VERBOSE:
			android.util.Log.v(tag, msg, tr);
			break;
		case DEBUG:
			android.util.Log.d(tag, msg, tr);
			break;
		case INFO:
			android.util.Log.i(tag, msg, tr);
			break;
		case WARN:
			android.util.Log.w(tag, msg, tr);
			break;
		case ERROR:
			android.util.Log.e(tag, msg, tr);
			break;
		default:
			android.util.Log.i(tag, msg, tr);
			break;
		}
	}

}
