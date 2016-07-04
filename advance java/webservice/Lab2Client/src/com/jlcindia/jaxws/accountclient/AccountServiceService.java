package com.jlcindia.jaxws.accountclient;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * <p>
 * An example of how this class may be used:
 * 
 * <pre>
 * AccountServiceService service = new AccountServiceService();
 * AccountServiceDelegate portType = service.getAccountServicePort();
 * portType.getBal(...);
 * </pre>
 * 
 * </p>
 * 
 */
@WebServiceClient(name = "AccountServiceService", targetNamespace = "http://account.jaxws.jlcindia.com/", wsdlLocation = "http://prabhatpc:5555/Lab2/AccountServicePort?wsdl")
public class AccountServiceService extends Service {

	private final static URL ACCOUNTSERVICESERVICE_WSDL_LOCATION;
	private final static Logger logger = Logger
			.getLogger(com.jlcindia.jaxws.accountclient.AccountServiceService.class
					.getName());

	static {
		URL url = null;
		try {
			URL baseUrl;
			baseUrl = com.jlcindia.jaxws.accountclient.AccountServiceService.class
					.getResource(".");
			url = new URL(baseUrl,
					"http://prabhatpc:5555/Lab2/AccountServicePort?wsdl");
		} catch (MalformedURLException e) {
			logger.warning("Failed to create URL for the wsdl Location: 'http://prabhatpc:5555/Lab2/AccountServicePort?wsdl', retrying as a local file");
			logger.warning(e.getMessage());
		}
		ACCOUNTSERVICESERVICE_WSDL_LOCATION = url;
	}

	public AccountServiceService(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public AccountServiceService() {
		super(ACCOUNTSERVICESERVICE_WSDL_LOCATION, new QName(
				"http://account.jaxws.jlcindia.com/", "AccountServiceService"));
	}

	/**
	 * 
	 * @return returns AccountServiceDelegate
	 */
	@WebEndpoint(name = "AccountServicePort")
	public AccountServiceDelegate getAccountServicePort() {
		return super.getPort(new QName("http://account.jaxws.jlcindia.com/",
				"AccountServicePort"), AccountServiceDelegate.class);
	}

}
