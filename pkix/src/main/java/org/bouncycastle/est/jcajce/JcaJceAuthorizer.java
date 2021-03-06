package org.bouncycastle.est.jcajce;


import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

/**
 * Implementations of this are to examine the chain in conjunction with the authType
 * and  throw some sort of exception or allow the method to complete.
 */
public interface JcaJceAuthorizer<T>
{
    void authorize(X509Certificate[] chain, String authType)
        throws CertificateException;
}
