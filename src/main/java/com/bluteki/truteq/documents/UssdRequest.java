package com.bluteki.truteq.documents;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * <ussd>
 *     <msisdn>M</msisdn>
 *     <sessionid>S</sessionid>
 *     <type>T</type>
 *     <msg>MSG</msg>
 *     <position mcc="M" mnc="N" lac="L" cid="C" />
 * </ussd> 
 */
@XmlRootElement(name = "ussd")
public class UssdRequest implements UssdRequestInterface
{
    private Long msisdn;

    private Long sessionid;

    private Integer type;

    private String msg;
  
    public UssdRequest()
    {
    }  

    public UssdRequest(Long msisdn, Long sessionid, int type, String msg)
    {  
        super();
        this.msisdn = msisdn;
        this.sessionid = sessionid;
    }

    @XmlElement  
    public Long getMsisdn()
    {  
        return msisdn;  
    }

    public void setMsisdn(Long msisdn)
    {
        this.msisdn = msisdn;
    }

    @XmlElement  
    public Long getSessionid()
    {  
        return sessionid;  
    }

    public void setSessionid(Long sessionid)
    {
        this.sessionid = sessionid;
    }

    @XmlElement  
    public int getType()
    {  
        return type;  
    }

    public void setType(int type)
    {
        this.type = type;
    }

    @XmlElement  
    public String getMsg()
    {  
        return msg;  
    }

    public void setMsg(String msg)
    {
        this.msg = msg;
    }
}