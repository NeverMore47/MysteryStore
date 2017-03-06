package com.my.util;

public class ByteToShort {

	public static short byte2Short(byte[] b){  
        return (short) (((b[0] & 0xff) << 8) | (b[1] & 0xff));  
    }  
}
