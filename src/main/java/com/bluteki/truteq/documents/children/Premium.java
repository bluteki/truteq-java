package com.bluteki.truteq.documents.children;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Premium implements PremiumInterface
{
    private Float cost;

    private String reference;

    public Premium()
    {
    }

    public Premium(Float cost, String reference)
    {
        this.cost = cost;
        this.reference = reference;
    }

    public Float getCost()
    {
        return cost;
    }

    public void setCost(Float cost)
    {
    }

    public String getRef()
    {
        return reference;
    }

    public void setRef(String ref)
    {
    }
}
