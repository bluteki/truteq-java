package com.bluteki.truteq;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.bluteki.truteq.documents.UssdRequest;

public class Request implements RequestInterface
{
    /**
     * {@value} New USSD session request.
     */
    public static final int USSD_NEW_REQUEST = 1;

    /**
     * {@value} Existing USSD session request.
     */
    public static final int USSD_EXISTING_SESSION = 2;

    /**
     * {@value} Cancelled USSD session request.
     */
    public static final int USSD_SESSION_CANCELLED = 3;

    /**
     * {@value} Timeout USSD session request.
     */
    public static final int USSD_SESSION_TIMED_OUT = 4;
    
    /**
     * {@value} Charge failed USSD session request
     */
    public static final int USSD_RATE_CHARGE_FAILED = 10;

    /**
     * @var XML string from USSD service.
     */
    private String xml;

    /**
     * @var XML string mapper.
     */
    private UssdRequest ussd;

    public Request(String xml) throws JAXBException
    {
        this.setUssd(this.xml = xml);
    }

    public Long sessionid()
    {
        return ussd.getSessionid();
    }

    public Long msisdn()
    {
        return ussd.getMsisdn();
    }

    public int type()
    {
        return ussd.getType();
    }

    public String msg()
    {
        return ussd.getMsg();
    }

    public String xml()
    {
        return xml;
    }

    protected void setUssd(String xml) throws JAXBException
    {
        this.ussd = this.createUssdXML(xml);
    }

    protected UssdRequest createUssdXML(String xml) throws JAXBException
    {
        JAXBContext jaxbContext = JAXBContext.newInstance(UssdRequest.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        StringReader reader = new StringReader(xml);
        return (UssdRequest) unmarshaller.unmarshal(reader);
    }
}
