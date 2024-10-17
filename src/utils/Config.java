package utils;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public abstract class Config {
	public static String ipServidor;
	public static int puertoServidor;

	public static void load() {
		try {
			Properties prop = new Properties();
			InputStream is  = new FileInputStream("config.properties");
			prop.load(is);
			ipServidor = prop.getProperty("ipServidor");
			puertoServidor = Integer.parseInt(prop.getProperty("puertoServidor"));
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}