package com.happeo.utilities;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class ReadConfig {

	Properties pro;

	public ReadConfig()
	{
		File src = new File("./Config/config.properties");

		{
			try {
				FileInputStream fis = new FileInputStream(src);
				pro = new Properties();
				pro.load(fis);
			} catch (IOException e) {

				System.out.println("Exception is " +e.getMessage());
			}
		}



	}
	public String getApplicationURL()
	{
		String url = pro.getProperty("baseURL");
		return url;

	}
	public String getUsername()
	{
		String username = pro.getProperty("username");
		return username;

	}
	public String getPassword()
	{
		String password = pro.getProperty("password");
		return password;

	}
	public String getChromePath()
	{
		String chromepath = pro.getProperty("chromepath");
		return chromepath;

	}

	public String SearchBoxValForPageGroup()
	{
		String searchValPage = pro.getProperty("searchboxvalforpage");
		return searchValPage;

	}
	public String SearchBoxValForIntChnl()
	{
		String searchboxvalforInterviewChannel = pro.getProperty("searchboxvalforInterviewChannel");
		return searchboxvalforInterviewChannel;

	}
	public String ToRandomPost()
	{
		String ToWriteRandomPost = pro.getProperty("ToWriteRandomPost");
		return ToWriteRandomPost;

	}
	public String PageNameVal()
	{
		String pagenameval = pro.getProperty("PageName");
		return pagenameval;

	}
}


