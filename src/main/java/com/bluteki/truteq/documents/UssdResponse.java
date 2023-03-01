package com.bluteki.truteq.documents;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.bluteki.truteq.documents.children.Premium;

@XmlRootElement(name = "ussd")
public class UssdResponse implements UssdResponseInterface
{
    private Integer type;

    private String msg;

    private Float cost;

    private String reference;

    public UssdResponse()
    {
    }

    public UssdResponse(Integer type, String msg)
    {
        this.type = type;
        this.msg = msg;
    }

    public UssdResponse(Integer type, String msg, Float cost, String reference)
    {
        this.type = type;
        this.msg = msg;
        this.cost = cost;
        this.reference = reference;
    }

    @XmlElement 
    public Integer getType()
    {  
        return type;  
    }

    public void setType(Integer type)
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

    @XmlElement
    public Premium getPremium()
    {
        return new Premium(cost, reference);
    }
}
