package com.bluteki.truteq.documents;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

public interface UssdRequestInterface extends Serializable
{
    /**
     * Get request msisdn.
     * 
     * @return The USSD request msisdn.
     */
    @XmlElement 
    public Long getMsisdn();

    /**
     * Set request msisdn.
     * 
     * @param msisdn
     */
    public void setMsisdn(Long msisdn);

    /**
     * Get request session id.
     * 
     * @return The USSD request session id.
     */
    @XmlElement  
    public Long getSessionid();

    /**
     * Set request session id.
     * 
     * @param sessionid
     */
    public void setSessionid(Long sessionid);

    /**
     * Get request type.
     * 
     * @return The USSD request type.
     */
    @XmlElement  
    public int getType();

    /**
     * Set request type.
     * 
     * @param type
     */
    public void setType(int type);

    /**
     * Get request message.
     * 
     * @return The USSD request message.
     */
    @XmlElement  
    public String getMsg();

    /**
     * Set request message.
     * 
     * @param  msg
     */
    public void setMsg(String msg);
}
