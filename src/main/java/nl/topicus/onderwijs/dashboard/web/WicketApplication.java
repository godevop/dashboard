package nl.topicus.onderwijs.dashboard.web;

import nl.topicus.onderwijs.dashboard.web.pages.DashboardPage;

import org.apache.wicket.protocol.http.WebApplication;

/**
 * Application object for your web application. If you want to run this application without deploying, run the Start class.
 * 
 * @see nl.topicus.onderwijs.dashboard.Start#main(String[])
 */
public class WicketApplication extends WebApplication
{    
    /**
     * Constructor
     */
	public WicketApplication()
	{
	}
	
	/**
	 * @see org.apache.wicket.Application#getHomePage()
	 */
	public Class<DashboardPage> getHomePage()
	{
		return DashboardPage.class;
	}

}
