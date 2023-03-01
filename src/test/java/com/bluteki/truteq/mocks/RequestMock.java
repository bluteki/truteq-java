package com.bluteki.truteq.mocks;

public class RequestMock
{
    public static final int USSD_NEW_REQUEST = 1;
    public static final int USSD_EXISTING_SESSION = 2;
    public static final int USSD_SESSION_CANCELLED = 3;
    public static final int USSD_SESSION_TIMED_OUT = 4;
    public static final int USSD_RATE_CHARGE_FAILED = 10;

    /**
     * 
     */
    private Long sessionId;

    /**
     * 
     */
    private Long msisdn;

    /**
     * 
     */
    private String message;

    /**
     * 
     */
    private int type;

    /**
     * Create TruTeq document.
     * 
     * @param sessionId
     * @param msisdn
     * @param message
     * @param type
     */
    public RequestMock(Long sessionId, Long msisdn, String message, int type)
    {
        this.sessionId = sessionId;
        this.msisdn    = msisdn;
        this.message   = message;
        this.type      = type;
    }
    
    /**
     * Get TruTeq session id.
     * 
     * @return
     */
    public Long sessionId()
    {
        return sessionId;
    }

    /**
     * Get request msisdn/phone number.
     * 
     * @return msisdn
     */
    public Long msisdn()
    {
        return msisdn;
    }

    /**
     * Get request message.
     * 
     * @return message
     */
    public String msg()
    {
        return message;
    }

    /**
     * Get request type from TruTeq.
     * 
     * @return type
     */
    public int type()
    {
        return type;
    }

    /**
     * Convert request to xml string.
     * 
     * @return XML string
     */
    public String xml()
    {
        return String.format(
            new StringBuilder()
                .append("<ussd>\n")
                .append("   <msisdn>%d</msisdn>\n")
                .append("   <sessionid>%d</sessionid>\n")
                .append("   <type>%d</type>\n")
                .append("   <msg>%s</msg>\n")
                .append("</ussd>\n")
                .toString(),
            msisdn,
            sessionId,
            type,
            message
        ) ;
    }
}
