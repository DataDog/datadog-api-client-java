/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>Object describing the Synthetic test request.</p>
 */
@JsonPropertyOrder({
  SyntheticsTestRequest.JSON_PROPERTY_ALLOW_INSECURE,
  SyntheticsTestRequest.JSON_PROPERTY_BASIC_AUTH,
  SyntheticsTestRequest.JSON_PROPERTY_BODY,
  SyntheticsTestRequest.JSON_PROPERTY_BODY_TYPE,
  SyntheticsTestRequest.JSON_PROPERTY_CALL_TYPE,
  SyntheticsTestRequest.JSON_PROPERTY_CERTIFICATE,
  SyntheticsTestRequest.JSON_PROPERTY_CERTIFICATE_DOMAINS,
  SyntheticsTestRequest.JSON_PROPERTY_CHECK_CERTIFICATE_REVOCATION,
  SyntheticsTestRequest.JSON_PROPERTY_COMPRESSED_JSON_DESCRIPTOR,
  SyntheticsTestRequest.JSON_PROPERTY_COMPRESSED_PROTO_FILE,
  SyntheticsTestRequest.JSON_PROPERTY_DISABLE_AIA_INTERMEDIATE_FETCHING,
  SyntheticsTestRequest.JSON_PROPERTY_DNS_SERVER,
  SyntheticsTestRequest.JSON_PROPERTY_DNS_SERVER_PORT,
  SyntheticsTestRequest.JSON_PROPERTY_FILES,
  SyntheticsTestRequest.JSON_PROPERTY_FOLLOW_REDIRECTS,
  SyntheticsTestRequest.JSON_PROPERTY_FORM,
  SyntheticsTestRequest.JSON_PROPERTY_HEADERS,
  SyntheticsTestRequest.JSON_PROPERTY_HOST,
  SyntheticsTestRequest.JSON_PROPERTY_HTTP_VERSION,
  SyntheticsTestRequest.JSON_PROPERTY_IS_MESSAGE_BASE64_ENCODED,
  SyntheticsTestRequest.JSON_PROPERTY_MESSAGE,
  SyntheticsTestRequest.JSON_PROPERTY_METADATA,
  SyntheticsTestRequest.JSON_PROPERTY_METHOD,
  SyntheticsTestRequest.JSON_PROPERTY_NO_SAVING_RESPONSE_BODY,
  SyntheticsTestRequest.JSON_PROPERTY_NUMBER_OF_PACKETS,
  SyntheticsTestRequest.JSON_PROPERTY_PERSIST_COOKIES,
  SyntheticsTestRequest.JSON_PROPERTY_PORT,
  SyntheticsTestRequest.JSON_PROPERTY_PROXY,
  SyntheticsTestRequest.JSON_PROPERTY_QUERY,
  SyntheticsTestRequest.JSON_PROPERTY_SERVERNAME,
  SyntheticsTestRequest.JSON_PROPERTY_SERVICE,
  SyntheticsTestRequest.JSON_PROPERTY_SHOULD_TRACK_HOPS,
  SyntheticsTestRequest.JSON_PROPERTY_TIMEOUT,
  SyntheticsTestRequest.JSON_PROPERTY_URL
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestRequest {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALLOW_INSECURE = "allow_insecure";
  private Boolean allowInsecure;

  public static final String JSON_PROPERTY_BASIC_AUTH = "basicAuth";
  private SyntheticsBasicAuth basicAuth;

  public static final String JSON_PROPERTY_BODY = "body";
  private String body;

  public static final String JSON_PROPERTY_BODY_TYPE = "bodyType";
  private SyntheticsTestRequestBodyType bodyType;

  public static final String JSON_PROPERTY_CALL_TYPE = "callType";
  private SyntheticsTestCallType callType;

  public static final String JSON_PROPERTY_CERTIFICATE = "certificate";
  private SyntheticsTestRequestCertificate certificate;

  public static final String JSON_PROPERTY_CERTIFICATE_DOMAINS = "certificateDomains";
  private List<String> certificateDomains = null;

  public static final String JSON_PROPERTY_CHECK_CERTIFICATE_REVOCATION = "checkCertificateRevocation";
  private Boolean checkCertificateRevocation;

  public static final String JSON_PROPERTY_COMPRESSED_JSON_DESCRIPTOR = "compressedJsonDescriptor";
  private String compressedJsonDescriptor;

  public static final String JSON_PROPERTY_COMPRESSED_PROTO_FILE = "compressedProtoFile";
  private String compressedProtoFile;

  public static final String JSON_PROPERTY_DISABLE_AIA_INTERMEDIATE_FETCHING = "disableAiaIntermediateFetching";
  private Boolean disableAiaIntermediateFetching;

  public static final String JSON_PROPERTY_DNS_SERVER = "dnsServer";
  private String dnsServer;

  public static final String JSON_PROPERTY_DNS_SERVER_PORT = "dnsServerPort";
  private SyntheticsTestRequestDNSServerPort dnsServerPort;

  public static final String JSON_PROPERTY_FILES = "files";
  private List<SyntheticsTestRequestBodyFile> files = null;

  public static final String JSON_PROPERTY_FOLLOW_REDIRECTS = "follow_redirects";
  private Boolean followRedirects;

  public static final String JSON_PROPERTY_FORM = "form";
  private Map<String, String> form = null;

  public static final String JSON_PROPERTY_HEADERS = "headers";
  private Map<String, String> headers = null;

  public static final String JSON_PROPERTY_HOST = "host";
  private String host;

  public static final String JSON_PROPERTY_HTTP_VERSION = "httpVersion";
  private SyntheticsTestOptionsHTTPVersion httpVersion;

  public static final String JSON_PROPERTY_IS_MESSAGE_BASE64_ENCODED = "isMessageBase64Encoded";
  private Boolean isMessageBase64Encoded;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Map<String, String> metadata = null;

  public static final String JSON_PROPERTY_METHOD = "method";
  private String method;

  public static final String JSON_PROPERTY_NO_SAVING_RESPONSE_BODY = "noSavingResponseBody";
  private Boolean noSavingResponseBody;

  public static final String JSON_PROPERTY_NUMBER_OF_PACKETS = "numberOfPackets";
  private Integer numberOfPackets;

  public static final String JSON_PROPERTY_PERSIST_COOKIES = "persistCookies";
  private Boolean persistCookies;

  public static final String JSON_PROPERTY_PORT = "port";
  private SyntheticsTestRequestPort port;

  public static final String JSON_PROPERTY_PROXY = "proxy";
  private SyntheticsTestRequestProxy proxy;

  public static final String JSON_PROPERTY_QUERY = "query";
  private Object query;

  public static final String JSON_PROPERTY_SERVERNAME = "servername";
  private String servername;

  public static final String JSON_PROPERTY_SERVICE = "service";
  private String service;

  public static final String JSON_PROPERTY_SHOULD_TRACK_HOPS = "shouldTrackHops";
  private Boolean shouldTrackHops;

  public static final String JSON_PROPERTY_TIMEOUT = "timeout";
  private Double timeout;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public SyntheticsTestRequest allowInsecure(Boolean allowInsecure) {
    this.allowInsecure = allowInsecure;
    return this;
  }

  /**
   * <p>Allows loading insecure content for an HTTP request in a multistep test step.</p>
   * @return allowInsecure
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ALLOW_INSECURE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getAllowInsecure() {
        return allowInsecure;
      }
  public void setAllowInsecure(Boolean allowInsecure) {
    this.allowInsecure = allowInsecure;
  }
  public SyntheticsTestRequest basicAuth(SyntheticsBasicAuth basicAuth) {
    this.basicAuth = basicAuth;
    this.unparsed |= basicAuth.unparsed;
    return this;
  }

  /**
   * <p>Object to handle basic authentication when performing the test.</p>
   * @return basicAuth
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_BASIC_AUTH)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SyntheticsBasicAuth getBasicAuth() {
        return basicAuth;
      }
  public void setBasicAuth(SyntheticsBasicAuth basicAuth) {
    this.basicAuth = basicAuth;
  }
  public SyntheticsTestRequest body(String body) {
    this.body = body;
    return this;
  }

  /**
   * <p>Body to include in the test.</p>
   * @return body
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_BODY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getBody() {
        return body;
      }
  public void setBody(String body) {
    this.body = body;
  }
  public SyntheticsTestRequest bodyType(SyntheticsTestRequestBodyType bodyType) {
    this.bodyType = bodyType;
    this.unparsed |= !bodyType.isValid();
    return this;
  }

  /**
   * <p>Type of the request body.</p>
   * @return bodyType
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_BODY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SyntheticsTestRequestBodyType getBodyType() {
        return bodyType;
      }
  public void setBodyType(SyntheticsTestRequestBodyType bodyType) {
    if (!bodyType.isValid()) {
        this.unparsed = true;
    }
    this.bodyType = bodyType;
  }
  public SyntheticsTestRequest callType(SyntheticsTestCallType callType) {
    this.callType = callType;
    this.unparsed |= !callType.isValid();
    return this;
  }

  /**
   * <p>The type of gRPC call to perform.</p>
   * @return callType
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CALL_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SyntheticsTestCallType getCallType() {
        return callType;
      }
  public void setCallType(SyntheticsTestCallType callType) {
    if (!callType.isValid()) {
        this.unparsed = true;
    }
    this.callType = callType;
  }
  public SyntheticsTestRequest certificate(SyntheticsTestRequestCertificate certificate) {
    this.certificate = certificate;
    this.unparsed |= certificate.unparsed;
    return this;
  }

  /**
   * <p>Client certificate to use when performing the test request.</p>
   * @return certificate
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CERTIFICATE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SyntheticsTestRequestCertificate getCertificate() {
        return certificate;
      }
  public void setCertificate(SyntheticsTestRequestCertificate certificate) {
    this.certificate = certificate;
  }
  public SyntheticsTestRequest certificateDomains(List<String> certificateDomains) {
    this.certificateDomains = certificateDomains;
    return this;
  }
  public SyntheticsTestRequest addCertificateDomainsItem(String certificateDomainsItem) {
    if (this.certificateDomains == null) {
      this.certificateDomains = new ArrayList<>();
    }
    this.certificateDomains.add(certificateDomainsItem);
    return this;
  }

  /**
   * <p>By default, the client certificate is applied on the domain of the starting URL for browser tests. If you want your client certificate to be applied on other domains instead, add them in <code>certificateDomains</code>.</p>
   * @return certificateDomains
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CERTIFICATE_DOMAINS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getCertificateDomains() {
        return certificateDomains;
      }
  public void setCertificateDomains(List<String> certificateDomains) {
    this.certificateDomains = certificateDomains;
  }
  public SyntheticsTestRequest checkCertificateRevocation(Boolean checkCertificateRevocation) {
    this.checkCertificateRevocation = checkCertificateRevocation;
    return this;
  }

  /**
   * <p>Check for certificate revocation.</p>
   * @return checkCertificateRevocation
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CHECK_CERTIFICATE_REVOCATION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getCheckCertificateRevocation() {
        return checkCertificateRevocation;
      }
  public void setCheckCertificateRevocation(Boolean checkCertificateRevocation) {
    this.checkCertificateRevocation = checkCertificateRevocation;
  }
  public SyntheticsTestRequest compressedJsonDescriptor(String compressedJsonDescriptor) {
    this.compressedJsonDescriptor = compressedJsonDescriptor;
    return this;
  }

  /**
   * <p>A protobuf JSON descriptor that needs to be gzipped first then base64 encoded.</p>
   * @return compressedJsonDescriptor
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_COMPRESSED_JSON_DESCRIPTOR)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getCompressedJsonDescriptor() {
        return compressedJsonDescriptor;
      }
  public void setCompressedJsonDescriptor(String compressedJsonDescriptor) {
    this.compressedJsonDescriptor = compressedJsonDescriptor;
  }
  public SyntheticsTestRequest compressedProtoFile(String compressedProtoFile) {
    this.compressedProtoFile = compressedProtoFile;
    return this;
  }

  /**
   * <p>A protobuf file that needs to be gzipped first then base64 encoded.</p>
   * @return compressedProtoFile
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_COMPRESSED_PROTO_FILE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getCompressedProtoFile() {
        return compressedProtoFile;
      }
  public void setCompressedProtoFile(String compressedProtoFile) {
    this.compressedProtoFile = compressedProtoFile;
  }
  public SyntheticsTestRequest disableAiaIntermediateFetching(Boolean disableAiaIntermediateFetching) {
    this.disableAiaIntermediateFetching = disableAiaIntermediateFetching;
    return this;
  }

  /**
   * <p>Disable fetching intermediate certificates from AIA.</p>
   * @return disableAiaIntermediateFetching
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DISABLE_AIA_INTERMEDIATE_FETCHING)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getDisableAiaIntermediateFetching() {
        return disableAiaIntermediateFetching;
      }
  public void setDisableAiaIntermediateFetching(Boolean disableAiaIntermediateFetching) {
    this.disableAiaIntermediateFetching = disableAiaIntermediateFetching;
  }
  public SyntheticsTestRequest dnsServer(String dnsServer) {
    this.dnsServer = dnsServer;
    return this;
  }

  /**
   * <p>DNS server to use for DNS tests.</p>
   * @return dnsServer
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DNS_SERVER)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getDnsServer() {
        return dnsServer;
      }
  public void setDnsServer(String dnsServer) {
    this.dnsServer = dnsServer;
  }
  public SyntheticsTestRequest dnsServerPort(SyntheticsTestRequestDNSServerPort dnsServerPort) {
    this.dnsServerPort = dnsServerPort;
    this.unparsed |= dnsServerPort.unparsed;
    return this;
  }

  /**
   * <p>DNS server port to use for DNS tests.</p>
   * @return dnsServerPort
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DNS_SERVER_PORT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SyntheticsTestRequestDNSServerPort getDnsServerPort() {
        return dnsServerPort;
      }
  public void setDnsServerPort(SyntheticsTestRequestDNSServerPort dnsServerPort) {
    this.dnsServerPort = dnsServerPort;
  }
  public SyntheticsTestRequest files(List<SyntheticsTestRequestBodyFile> files) {
    this.files = files;
    for (SyntheticsTestRequestBodyFile item : files) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public SyntheticsTestRequest addFilesItem(SyntheticsTestRequestBodyFile filesItem) {
    if (this.files == null) {
      this.files = new ArrayList<>();
    }
    this.files.add(filesItem);
    this.unparsed |= filesItem.unparsed;
    return this;
  }

  /**
   * <p>Files to be used as part of the request in the test. Only valid if <code>bodyType</code> is <code>multipart/form-data</code>.</p>
   * @return files
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FILES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<SyntheticsTestRequestBodyFile> getFiles() {
        return files;
      }
  public void setFiles(List<SyntheticsTestRequestBodyFile> files) {
    this.files = files;
  }
  public SyntheticsTestRequest followRedirects(Boolean followRedirects) {
    this.followRedirects = followRedirects;
    return this;
  }

  /**
   * <p>Specifies whether or not the request follows redirects.</p>
   * @return followRedirects
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FOLLOW_REDIRECTS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getFollowRedirects() {
        return followRedirects;
      }
  public void setFollowRedirects(Boolean followRedirects) {
    this.followRedirects = followRedirects;
  }
  public SyntheticsTestRequest form(Map<String, String> form) {
    this.form = form;
    return this;
  }
  public SyntheticsTestRequest putFormItem(String key, String formItem) {
    if (this.form == null) {
      this.form = new HashMap<>();
    }
    this.form.put(key, formItem);
    return this;
  }

  /**
   * <p>Form to be used as part of the request in the test. Only valid if <code>bodyType</code> is <code>multipart/form-data</code>.</p>
   * @return form
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FORM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Map<String, String> getForm() {
        return form;
      }
  public void setForm(Map<String, String> form) {
    this.form = form;
  }
  public SyntheticsTestRequest headers(Map<String, String> headers) {
    this.headers = headers;
    return this;
  }
  public SyntheticsTestRequest putHeadersItem(String key, String headersItem) {
    if (this.headers == null) {
      this.headers = new HashMap<>();
    }
    this.headers.put(key, headersItem);
    return this;
  }

  /**
   * <p>Headers to include when performing the test.</p>
   * @return headers
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_HEADERS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Map<String, String> getHeaders() {
        return headers;
      }
  public void setHeaders(Map<String, String> headers) {
    this.headers = headers;
  }
  public SyntheticsTestRequest host(String host) {
    this.host = host;
    return this;
  }

  /**
   * <p>Host name to perform the test with.</p>
   * @return host
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_HOST)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getHost() {
        return host;
      }
  public void setHost(String host) {
    this.host = host;
  }
  public SyntheticsTestRequest httpVersion(SyntheticsTestOptionsHTTPVersion httpVersion) {
    this.httpVersion = httpVersion;
    this.unparsed |= !httpVersion.isValid();
    return this;
  }

  /**
   * <p>HTTP version to use for a Synthetic test.</p>
   * @return httpVersion
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_HTTP_VERSION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SyntheticsTestOptionsHTTPVersion getHttpVersion() {
        return httpVersion;
      }
  public void setHttpVersion(SyntheticsTestOptionsHTTPVersion httpVersion) {
    if (!httpVersion.isValid()) {
        this.unparsed = true;
    }
    this.httpVersion = httpVersion;
  }
  public SyntheticsTestRequest isMessageBase64Encoded(Boolean isMessageBase64Encoded) {
    this.isMessageBase64Encoded = isMessageBase64Encoded;
    return this;
  }

  /**
   * <p>Whether the message is base64 encoded.</p>
   * @return isMessageBase64Encoded
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_IS_MESSAGE_BASE64_ENCODED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getIsMessageBase64Encoded() {
        return isMessageBase64Encoded;
      }
  public void setIsMessageBase64Encoded(Boolean isMessageBase64Encoded) {
    this.isMessageBase64Encoded = isMessageBase64Encoded;
  }
  public SyntheticsTestRequest message(String message) {
    this.message = message;
    return this;
  }

  /**
   * <p>Message to send for UDP or WebSocket tests.</p>
   * @return message
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MESSAGE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getMessage() {
        return message;
      }
  public void setMessage(String message) {
    this.message = message;
  }
  public SyntheticsTestRequest metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }
  public SyntheticsTestRequest putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

  /**
   * <p>Metadata to include when performing the gRPC test.</p>
   * @return metadata
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_METADATA)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Map<String, String> getMetadata() {
        return metadata;
      }
  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }
  public SyntheticsTestRequest method(String method) {
    this.method = method;
    return this;
  }

  /**
   * <p>Either the HTTP method/verb to use or a gRPC method available on the service set in the <code>service</code> field. Required if <code>subtype</code> is <code>HTTP</code> or if <code>subtype</code> is <code>grpc</code> and <code>callType</code> is <code>unary</code>.</p>
   * @return method
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_METHOD)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getMethod() {
        return method;
      }
  public void setMethod(String method) {
    this.method = method;
  }
  public SyntheticsTestRequest noSavingResponseBody(Boolean noSavingResponseBody) {
    this.noSavingResponseBody = noSavingResponseBody;
    return this;
  }

  /**
   * <p>Determines whether or not to save the response body.</p>
   * @return noSavingResponseBody
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NO_SAVING_RESPONSE_BODY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getNoSavingResponseBody() {
        return noSavingResponseBody;
      }
  public void setNoSavingResponseBody(Boolean noSavingResponseBody) {
    this.noSavingResponseBody = noSavingResponseBody;
  }
  public SyntheticsTestRequest numberOfPackets(Integer numberOfPackets) {
    this.numberOfPackets = numberOfPackets;
    return this;
  }

  /**
   * <p>Number of pings to use per test.</p>
   * minimum: 0
   * maximum: 10
   * @return numberOfPackets
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NUMBER_OF_PACKETS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Integer getNumberOfPackets() {
        return numberOfPackets;
      }
  public void setNumberOfPackets(Integer numberOfPackets) {
    this.numberOfPackets = numberOfPackets;
  }
  public SyntheticsTestRequest persistCookies(Boolean persistCookies) {
    this.persistCookies = persistCookies;
    return this;
  }

  /**
   * <p>Persist cookies across redirects.</p>
   * @return persistCookies
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PERSIST_COOKIES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getPersistCookies() {
        return persistCookies;
      }
  public void setPersistCookies(Boolean persistCookies) {
    this.persistCookies = persistCookies;
  }
  public SyntheticsTestRequest port(SyntheticsTestRequestPort port) {
    this.port = port;
    this.unparsed |= port.unparsed;
    return this;
  }

  /**
   * <p>Port to use when performing the test.</p>
   * @return port
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PORT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SyntheticsTestRequestPort getPort() {
        return port;
      }
  public void setPort(SyntheticsTestRequestPort port) {
    this.port = port;
  }
  public SyntheticsTestRequest proxy(SyntheticsTestRequestProxy proxy) {
    this.proxy = proxy;
    this.unparsed |= proxy.unparsed;
    return this;
  }

  /**
   * <p>The proxy to perform the test.</p>
   * @return proxy
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PROXY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SyntheticsTestRequestProxy getProxy() {
        return proxy;
      }
  public void setProxy(SyntheticsTestRequestProxy proxy) {
    this.proxy = proxy;
  }
  public SyntheticsTestRequest query(Object query) {
    this.query = query;
    return this;
  }

  /**
   * <p>Query to use for the test.</p>
   * @return query
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_QUERY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Object getQuery() {
        return query;
      }
  public void setQuery(Object query) {
    this.query = query;
  }
  public SyntheticsTestRequest servername(String servername) {
    this.servername = servername;
    return this;
  }

  /**
   * <p>For SSL tests, it specifies on which server you want to initiate the TLS handshake,
   * allowing the server to present one of multiple possible certificates on
   * the same IP address and TCP port number.</p>
   * @return servername
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SERVERNAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getServername() {
        return servername;
      }
  public void setServername(String servername) {
    this.servername = servername;
  }
  public SyntheticsTestRequest service(String service) {
    this.service = service;
    return this;
  }

  /**
   * <p>The gRPC service on which you want to perform the gRPC call.</p>
   * @return service
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SERVICE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getService() {
        return service;
      }
  public void setService(String service) {
    this.service = service;
  }
  public SyntheticsTestRequest shouldTrackHops(Boolean shouldTrackHops) {
    this.shouldTrackHops = shouldTrackHops;
    return this;
  }

  /**
   * <p>Turns on a traceroute probe to discover all gateways along the path to the host destination.</p>
   * @return shouldTrackHops
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SHOULD_TRACK_HOPS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getShouldTrackHops() {
        return shouldTrackHops;
      }
  public void setShouldTrackHops(Boolean shouldTrackHops) {
    this.shouldTrackHops = shouldTrackHops;
  }
  public SyntheticsTestRequest timeout(Double timeout) {
    this.timeout = timeout;
    return this;
  }

  /**
   * <p>Timeout in seconds for the test.</p>
   * @return timeout
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TIMEOUT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Double getTimeout() {
        return timeout;
      }
  public void setTimeout(Double timeout) {
    this.timeout = timeout;
  }
  public SyntheticsTestRequest url(String url) {
    this.url = url;
    return this;
  }

  /**
   * <p>URL to perform the test with.</p>
   * @return url
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_URL)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getUrl() {
        return url;
      }
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return SyntheticsTestRequest
   */
  @JsonAnySetter
  public SyntheticsTestRequest putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return The additional properties
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key The arbitrary key to get
   * @return The specific additional property for the given key
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }

  /**
   * Return true if this SyntheticsTestRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestRequest syntheticsTestRequest = (SyntheticsTestRequest) o;
    return Objects.equals(this.allowInsecure, syntheticsTestRequest.allowInsecure) && Objects.equals(this.basicAuth, syntheticsTestRequest.basicAuth) && Objects.equals(this.body, syntheticsTestRequest.body) && Objects.equals(this.bodyType, syntheticsTestRequest.bodyType) && Objects.equals(this.callType, syntheticsTestRequest.callType) && Objects.equals(this.certificate, syntheticsTestRequest.certificate) && Objects.equals(this.certificateDomains, syntheticsTestRequest.certificateDomains) && Objects.equals(this.checkCertificateRevocation, syntheticsTestRequest.checkCertificateRevocation) && Objects.equals(this.compressedJsonDescriptor, syntheticsTestRequest.compressedJsonDescriptor) && Objects.equals(this.compressedProtoFile, syntheticsTestRequest.compressedProtoFile) && Objects.equals(this.disableAiaIntermediateFetching, syntheticsTestRequest.disableAiaIntermediateFetching) && Objects.equals(this.dnsServer, syntheticsTestRequest.dnsServer) && Objects.equals(this.dnsServerPort, syntheticsTestRequest.dnsServerPort) && Objects.equals(this.files, syntheticsTestRequest.files) && Objects.equals(this.followRedirects, syntheticsTestRequest.followRedirects) && Objects.equals(this.form, syntheticsTestRequest.form) && Objects.equals(this.headers, syntheticsTestRequest.headers) && Objects.equals(this.host, syntheticsTestRequest.host) && Objects.equals(this.httpVersion, syntheticsTestRequest.httpVersion) && Objects.equals(this.isMessageBase64Encoded, syntheticsTestRequest.isMessageBase64Encoded) && Objects.equals(this.message, syntheticsTestRequest.message) && Objects.equals(this.metadata, syntheticsTestRequest.metadata) && Objects.equals(this.method, syntheticsTestRequest.method) && Objects.equals(this.noSavingResponseBody, syntheticsTestRequest.noSavingResponseBody) && Objects.equals(this.numberOfPackets, syntheticsTestRequest.numberOfPackets) && Objects.equals(this.persistCookies, syntheticsTestRequest.persistCookies) && Objects.equals(this.port, syntheticsTestRequest.port) && Objects.equals(this.proxy, syntheticsTestRequest.proxy) && Objects.equals(this.query, syntheticsTestRequest.query) && Objects.equals(this.servername, syntheticsTestRequest.servername) && Objects.equals(this.service, syntheticsTestRequest.service) && Objects.equals(this.shouldTrackHops, syntheticsTestRequest.shouldTrackHops) && Objects.equals(this.timeout, syntheticsTestRequest.timeout) && Objects.equals(this.url, syntheticsTestRequest.url) && Objects.equals(this.additionalProperties, syntheticsTestRequest.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(allowInsecure,basicAuth,body,bodyType,callType,certificate,certificateDomains,checkCertificateRevocation,compressedJsonDescriptor,compressedProtoFile,disableAiaIntermediateFetching,dnsServer,dnsServerPort,files,followRedirects,form,headers,host,httpVersion,isMessageBase64Encoded,message,metadata,method,noSavingResponseBody,numberOfPackets,persistCookies,port,proxy,query,servername,service,shouldTrackHops,timeout,url, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestRequest {\n");
    sb.append("    allowInsecure: ").append(toIndentedString(allowInsecure)).append("\n");
    sb.append("    basicAuth: ").append(toIndentedString(basicAuth)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    bodyType: ").append(toIndentedString(bodyType)).append("\n");
    sb.append("    callType: ").append(toIndentedString(callType)).append("\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    certificateDomains: ").append(toIndentedString(certificateDomains)).append("\n");
    sb.append("    checkCertificateRevocation: ").append(toIndentedString(checkCertificateRevocation)).append("\n");
    sb.append("    compressedJsonDescriptor: ").append(toIndentedString(compressedJsonDescriptor)).append("\n");
    sb.append("    compressedProtoFile: ").append(toIndentedString(compressedProtoFile)).append("\n");
    sb.append("    disableAiaIntermediateFetching: ").append(toIndentedString(disableAiaIntermediateFetching)).append("\n");
    sb.append("    dnsServer: ").append(toIndentedString(dnsServer)).append("\n");
    sb.append("    dnsServerPort: ").append(toIndentedString(dnsServerPort)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    followRedirects: ").append(toIndentedString(followRedirects)).append("\n");
    sb.append("    form: ").append(toIndentedString(form)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    httpVersion: ").append(toIndentedString(httpVersion)).append("\n");
    sb.append("    isMessageBase64Encoded: ").append(toIndentedString(isMessageBase64Encoded)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    noSavingResponseBody: ").append(toIndentedString(noSavingResponseBody)).append("\n");
    sb.append("    numberOfPackets: ").append(toIndentedString(numberOfPackets)).append("\n");
    sb.append("    persistCookies: ").append(toIndentedString(persistCookies)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    proxy: ").append(toIndentedString(proxy)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    servername: ").append(toIndentedString(servername)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    shouldTrackHops: ").append(toIndentedString(shouldTrackHops)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
