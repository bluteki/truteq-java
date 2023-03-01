package com.bluteki.truteq;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.xml.bind.JAXBException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.bluteki.truteq.mocks.ResponseMock;

public class ResponseTest
{
    protected ResponseMock mock;

    @BeforeEach
    public void setUp()
    {
        mock = new ResponseMock(
            ResponseMock.USSD_OPEN_SESSION,
            "Welcome to TruTeq USSD service.",
            2.34F,
            "94h4398932"
        );
    }

    @Test
    public void testResponseClassHasResponseCodes()
    {
        assertEquals(ResponseMock.USSD_OPEN_SESSION, Response.USSD_OPEN_SESSION);
        assertEquals(ResponseMock.USSD_CLOSE_SESSION, Response.USSD_CLOSE_SESSION);
        assertEquals(ResponseMock.USSD_REDIRECT, Response.USSD_REDIRECT);
    }

    @Test
    public void testSetResponseParametersUsingConstructor()
    {
        Response response = new Response(
            mock.getType(),
            mock.getMsg(),
            mock.getCost(),
            mock.getReference()
        );

        assertEquals(mock.getType(), response.getType());
        assertEquals(mock.getMsg(), response.getMsg());
        assertEquals(mock.getCost(), response.getCost());
        assertEquals(mock.getReference(), response.getReference());
    }

    @Test
    public void testSetResponseParametersUsingSetters()
    {
        Response response = new Response()
            .setType(mock.getType())
            .setMsg(mock.getMsg())
            .setCost(mock.getCost())
            .setReference(mock.getReference());
            
        assertEquals(mock.getType(), response.getType());
        assertEquals(mock.getMsg(), response.getMsg());
        assertEquals(mock.getCost(), response.getCost());
        assertEquals(mock.getReference(), response.getReference());
    }

    @Test
    public void testGetResponseXml() throws JAXBException
    {
        Response response = new Response()
            .setType(mock.getType())
            .setMsg(mock.getMsg())
            .setCost(mock.getCost())
            .setReference(mock.getReference());

        assertEquals(mock.xml(), response.xml());
    }
}
