package com.bluteki.truteq.documents.children;

import javax.xml.bind.annotation.XmlElement;

public interface PremiumInterface
{
    /**
     * 
     * @return The amount to charge the msisdn
     */
    @XmlElement
    public Float getCost();

    /**
     * @param cost The amount to charge the msisdn that is making the request.
     */
    public void setCost(Float cost);

    /**
     * 
     * @return
     */
    @XmlElement
    public String getRef();

    /**
     * 
     * @param ref
     */
    public void setRef(String ref);
}
