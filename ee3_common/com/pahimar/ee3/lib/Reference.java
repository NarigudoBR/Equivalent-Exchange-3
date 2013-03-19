package com.pahimar.ee3.lib;

/**
 * Equivalent-Exchange-3
 * 
 * Reference
 * 
 * @author pahimar
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class Reference {

    /* Debug Mode On-Off */
    public static final boolean DEBUG_MODE = false;

    /* General Mod related constants */
    public static final String MOD_ID = "EE3";
    public static final String MOD_NAME = "Equivalent Exchange 3";
    public static final String VERSION = "@VERSION@";
    public static final String VERSION_TYPE = "@VERSION_TYPE@";
    public static final String CHANNEL_NAME = MOD_ID;
    public static final int SECOND_IN_TICKS = 20;
    public static final int SHIFTED_ID_RANGE_CORRECTION = 256;
    public static final String SERVER_PROXY_CLASS = "com.pahimar.ee3.core.proxy.CommonProxy";
    public static final String CLIENT_PROXY_CLASS = "com.pahimar.ee3.core.proxy.ClientProxy";
    public static final int VERSION_CHECK_ATTEMPTS = 3;
    public static final float MODEL_TEXTURE_OFFSET = 0.0002F;

}
