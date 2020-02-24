// Java 7 enable TLSv1.2
// This will help you to enable requests in java 7 - 
// It can fix issues like I/O Connection reset / Connection Refuse / Socket

/*
try {
				SSLContext sc = SSLContext.getInstance("TLSv1.2");
				sc.init(null, null, new SecureRandom());
				HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
			} catch (Exception e) {
				;
			}
 */
