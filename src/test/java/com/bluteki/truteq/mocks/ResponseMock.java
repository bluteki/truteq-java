package com.bluteki.truteq.mocks;

public class ResponseMock
{
    public static final int USSD_OPEN_SESSION = 2;

    public static final int USSD_CLOSE_SESSION = 3;

    public static final int USSD_REDIRECT = 5;

    protected Integer type;

    protected String msg;

    protected Float cost = 0F;

    protected String reference = "";

    public ResponseMock(Integer type, String msg)
    {
        this.type = type;
        this.msg = msg;
    }

    public ResponseMock(Integer type, String msg, Float cost, String reference)
    {
        this.type = type;
        this.msg = msg;
        this.cost = cost;
        this.reference = reference;
    }

    public Integer getType()
    {
        return type;
    }

    public String getMsg()
    {
        return msg;
    }

    public Float getCost()
    {
        return cost;
    }

    public String getReference()
    {
        return reference;
    }

    public String xml()
    {
        return String.format(
            new StringBuilder()
                .append("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n")
                .append("<ussd>\n")
                .append("    <msg>%s</msg>\n")
                .append("    <premium>\n")
                .append("        <cost>%s</cost>\n")
                .append("        <ref>%s</ref>\n")
                .append("    </premium>\n")
                .append("    <type>%d</type>\n")
                .append("</ussd>\n")
                .toString(),
            msg,
            String.format("%.2f", cost).replace(",", ".").toString(),
            reference,
            type
        );
    }    
}

// <ussd>
//     <type>T</type>
//     <msg>MSG</msg>
//     <premium>
//         <cost>C</cost>
//         <ref>R</ref>
//     </premium>
// </ussd>