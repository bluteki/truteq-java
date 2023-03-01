package com.bluteki.truteq;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import com.bluteki.truteq.documents.UssdResponse;

public class Response implements ResponseInterface
{
    public static final int USSD_OPEN_SESSION = 2;

    public static final int USSD_CLOSE_SESSION = 3;

    public static final int USSD_REDIRECT = 5;

    protected Integer type;

    protected String msg;

    protected Float cost = 0F;

    protected String reference = "";

    public Response()
    {
    }

    public Response(Integer type, String msg)
    {
        this.type = type;
        this.msg = msg;
    }

    public Response(Integer type, String msg, float cost, String reference)
    {
        this.type = type;
        this.msg = msg;
        this.cost = cost;
        this.reference = reference;
    }

    public Response setType(Integer type)
    {
        this.type = type;
        return this;
    }

    public Integer getType()
    {
        return type;
    }

    public Response setMsg(String msg)
    {
        this.msg = msg;
        return this;
    }

    public String getMsg()
    {
        return msg;
    }

    public Response setCost(Float cost)
    {
        this.cost = cost;
        return this;
    }

    public Float getCost()
    {
        return cost;
    }

    public Response setReference(String reference)
    {
        this.reference = reference;
        return this;
    }

    public String getReference()
    {
        return reference;
    }

    public String xml() throws JAXBException
    {
        UssdResponse response = new UssdResponse(getType(), getMsg(), getCost(), getReference());
        JAXBContext jaxbContext = JAXBContext.newInstance(UssdResponse.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        StringWriter writer = new StringWriter();

        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.marshal(response, writer);

        return writer.toString();
    }
}
