
package com.bluteki.truteq;

public interface RequestInterface
{
    /**
     * 
     * @return
     */
    public Long sessionid();

    /**
     * 
     * @return
     */
    public Long msisdn();

    /**
     * 
     * @return
     */
    public int type();

    /**
     * 
     * @return
     */
    public String msg();

    /**
     * 
     * @return
     */
    public String xml();
}