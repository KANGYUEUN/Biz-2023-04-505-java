package com.callor.shop.config;

public class DBContract {

	public static final String jdbcDriver = "oracle.jdbc.driver.OracleDriver";
	public static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
	public static final String USER_NAME = "shopingcart";
	public static final String PASSWORD = "12341234";

	public static class PRODUCT {
		public static final int PRODUCT_CODE = 1;
		public static final int PRODUCT_NAME = 2;
		public static final int PRODUCT_ITEM = 3;
		public static final int PRODUCT_IPRICE = 4;
		public static final int PRODUCT_OPRICE = 5;
	}

	public static class BUYER {
		public static final int BUID = 1;
		public static final int BUNAME = 2;
		public static final int BUTEL = 3;
		public static final int BUADDR = 4;
	}
}
