

# SyntheticsSSLCertificate

Object describing the SSL certificate used for a Synthetic test.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cipher** | **String** | Cipher used for the connection. |  [optional]
**exponent** | **Double** | Exponent associated to the certificate. |  [optional]
**extKeyUsage** | **List&lt;String&gt;** | Array of extensions and details used for the certificate. |  [optional]
**fingerprint** | **String** | MD5 digest of the DER-encoded Certificate information. |  [optional]
**fingerprint256** | **String** | SHA-1 digest of the DER-encoded Certificate information. |  [optional]
**issuer** | [**SyntheticsSSLCertificateIssuer**](SyntheticsSSLCertificateIssuer.md) |  |  [optional]
**modulus** | **String** | Modulus associated to the SSL certificate private key. |  [optional]
**protocol** | **String** | TLS protocol used for the test. |  [optional]
**serialNumber** | **String** | Serial Number assigned by Symantec to the SSL certificate. |  [optional]
**subject** | [**SyntheticsSSLCertificateSubject**](SyntheticsSSLCertificateSubject.md) |  |  [optional]
**validFrom** | **OffsetDateTime** | Date from which the SSL certificate is valid. |  [optional]
**validTo** | **OffsetDateTime** | Date until which the SSL certificate is valid. |  [optional]



