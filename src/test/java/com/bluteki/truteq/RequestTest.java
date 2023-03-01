
package com.bluteki.truteq;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import javax.xml.bind.JAXBException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.bluteki.truteq.mocks.RequestMock;

public class RequestTest
{
    protected RequestMock mock;

    @BeforeEach
    public void setUp()
    {
        mock = new RequestMock(
            4321423523L,
            2565745654L,
            "Welcome To TruTeq USSD Service.",
            1
        );
    }

    @Test
    public void testRequestClassHasRequestCodes()
    {
        assertEquals(RequestMock.USSD_NEW_REQUEST, Request.USSD_NEW_REQUEST);
        assertEquals(RequestMock.USSD_EXISTING_SESSION, Request.USSD_EXISTING_SESSION);
        assertEquals(RequestMock.USSD_SESSION_CANCELLED, Request.USSD_SESSION_CANCELLED);
        assertEquals(RequestMock.USSD_SESSION_TIMED_OUT, Request.USSD_SESSION_TIMED_OUT);
        assertEquals(RequestMock.USSD_RATE_CHARGE_FAILED, Request.USSD_RATE_CHARGE_FAILED);
    }

    @Test
    public void testSetTruTeqRequestXML() throws JAXBException
    {
        Request request = new Request(mock.xml());

        assertEquals(mock.xml(), request.xml());
    }

    @Test
    public void testSetTruTeqRequestWithInvalidXML() throws JAXBException
    {
        assertThrows(JAXBException.class, () -> new Request("").xml());
    }

    @Test
    public void testGetTruTeqRequestMsisdn() throws JAXBException
    {
        Request request = new Request(mock.xml());

        assertEquals(mock.msisdn(), request.msisdn());
    }

    @Test
    public void testGetTruTeqRequestSessionId() throws JAXBException
    {
        Request request = new Request(mock.xml());

        assertEquals(mock.sessionId(), request.sessionid());
    }

    @Test
    public void testGetTruTeqRequestType() throws JAXBException
    {
        Request request = new Request(mock.xml());

        assertEquals(mock.type(), request.type());
    }

    @Test
    public void testGetTruTeqRequestMessage() throws JAXBException
    {
        Request request = new Request(mock.xml());

        assertEquals(mock.msg(), request.msg());
    }
}