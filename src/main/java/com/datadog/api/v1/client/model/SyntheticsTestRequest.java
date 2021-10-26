/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.datadog.api.v1.client.model;

import com.datadog.api.v1.client.JSON;
import com.datadog.api.v1.client.model.HTTPMethod;
import com.datadog.api.v1.client.model.SyntheticsBasicAuth;
import com.datadog.api.v1.client.model.SyntheticsTestRequestCertificate;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map;
import java.util.Objects;

/**
 * Object describing the Synthetic test request.
 */
@ApiModel(description = "Object describing the Synthetic test request.")
@JsonPropertyOrder(
    {
        SyntheticsTestRequest.JSON_PROPERTY_ALLOW_INSECURE,
        SyntheticsTestRequest.JSON_PROPERTY_BASIC_AUTH,
        SyntheticsTestRequest.JSON_PROPERTY_BODY,
        SyntheticsTestRequest.JSON_PROPERTY_CERTIFICATE,
        SyntheticsTestRequest.JSON_PROPERTY_DNS_SERVER,
        SyntheticsTestRequest.JSON_PROPERTY_DNS_SERVER_PORT,
        SyntheticsTestRequest.JSON_PROPERTY_FOLLOW_REDIRECTS,
        SyntheticsTestRequest.JSON_PROPERTY_HEADERS,
        SyntheticsTestRequest.JSON_PROPERTY_HOST,
        SyntheticsTestRequest.JSON_PROPERTY_METHOD,
        SyntheticsTestRequest.JSON_PROPERTY_NO_SAVING_RESPONSE_BODY,
        SyntheticsTestRequest.JSON_PROPERTY_NUMBER_OF_PACKETS,
        SyntheticsTestRequest.JSON_PROPERTY_PORT,
        SyntheticsTestRequest.JSON_PROPERTY_QUERY,
        SyntheticsTestRequest.JSON_PROPERTY_SERVERNAME,
        SyntheticsTestRequest.JSON_PROPERTY_SHOULD_TRACK_HOPS,
        SyntheticsTestRequest.JSON_PROPERTY_TIMEOUT,
        SyntheticsTestRequest.JSON_PROPERTY_URL
    }
)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SyntheticsTestRequest {

    @JsonIgnore
    public boolean unparsed = false;

    public static final String JSON_PROPERTY_ALLOW_INSECURE = "allow_insecure";
    private Boolean allowInsecure;

    public static final String JSON_PROPERTY_BASIC_AUTH = "basicAuth";
    private SyntheticsBasicAuth basicAuth;

    public static final String JSON_PROPERTY_BODY = "body";
    private String body;

    public static final String JSON_PROPERTY_CERTIFICATE = "certificate";
    private SyntheticsTestRequestCertificate certificate;

    public static final String JSON_PROPERTY_DNS_SERVER = "dnsServer";
    private String dnsServer;

    public static final String JSON_PROPERTY_DNS_SERVER_PORT = "dnsServerPort";
    private Integer dnsServerPort;

    public static final String JSON_PROPERTY_FOLLOW_REDIRECTS = "follow_redirects";
    private Boolean followRedirects;

    public static final String JSON_PROPERTY_HEADERS = "headers";
    private Map<String, String> headers = null;

    public static final String JSON_PROPERTY_HOST = "host";
    private String host;

    public static final String JSON_PROPERTY_METHOD = "method";
    private HTTPMethod method;

    public static final String JSON_PROPERTY_NO_SAVING_RESPONSE_BODY = "noSavingResponseBody";
    private Boolean noSavingResponseBody;

    public static final String JSON_PROPERTY_NUMBER_OF_PACKETS = "numberOfPackets";
    private Integer numberOfPackets;

    public static final String JSON_PROPERTY_PORT = "port";
    private Long port;

    public static final String JSON_PROPERTY_QUERY = "query";
    private Object query;

    public static final String JSON_PROPERTY_SERVERNAME = "servername";
    private String servername;

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
     * Allows loading insecure content for an HTTP request in a multistep test step.
     * @return allowInsecure
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Allows loading insecure content for an HTTP request in a multistep test step.")
    @JsonProperty(JSON_PROPERTY_ALLOW_INSECURE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
     * Get basicAuth
     * @return basicAuth
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_BASIC_AUTH)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
     * Body to include in the test.
     * @return body
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Body to include in the test.")
    @JsonProperty(JSON_PROPERTY_BODY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public SyntheticsTestRequest certificate(SyntheticsTestRequestCertificate certificate) {
        this.certificate = certificate;
        this.unparsed |= certificate.unparsed;
        return this;
    }

    /**
     * Get certificate
     * @return certificate
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_CERTIFICATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public SyntheticsTestRequestCertificate getCertificate() {
        return certificate;
    }

    public void setCertificate(SyntheticsTestRequestCertificate certificate) {
        this.certificate = certificate;
    }

    public SyntheticsTestRequest dnsServer(String dnsServer) {
        this.dnsServer = dnsServer;
        return this;
    }

    /**
     * DNS server to use for DNS tests.
     * @return dnsServer
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "DNS server to use for DNS tests.")
    @JsonProperty(JSON_PROPERTY_DNS_SERVER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getDnsServer() {
        return dnsServer;
    }

    public void setDnsServer(String dnsServer) {
        this.dnsServer = dnsServer;
    }

    public SyntheticsTestRequest dnsServerPort(Integer dnsServerPort) {
        this.dnsServerPort = dnsServerPort;
        return this;
    }

    /**
     * DNS server port to use for DNS tests.
     * minimum: 1
     * maximum: 65535
     * @return dnsServerPort
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "DNS server port to use for DNS tests.")
    @JsonProperty(JSON_PROPERTY_DNS_SERVER_PORT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getDnsServerPort() {
        return dnsServerPort;
    }

    public void setDnsServerPort(Integer dnsServerPort) {
        this.dnsServerPort = dnsServerPort;
    }

    public SyntheticsTestRequest followRedirects(Boolean followRedirects) {
        this.followRedirects = followRedirects;
        return this;
    }

    /**
     * Specifies whether or not the request follows redirects.
     * @return followRedirects
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Specifies whether or not the request follows redirects.")
    @JsonProperty(JSON_PROPERTY_FOLLOW_REDIRECTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getFollowRedirects() {
        return followRedirects;
    }

    public void setFollowRedirects(Boolean followRedirects) {
        this.followRedirects = followRedirects;
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
     * Headers to include when performing the test.
     * @return headers
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Headers to include when performing the test.")
    @JsonProperty(JSON_PROPERTY_HEADERS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
     * Host name to perform the test with.
     * @return host
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Host name to perform the test with.")
    @JsonProperty(JSON_PROPERTY_HOST)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public SyntheticsTestRequest method(HTTPMethod method) {
        this.method = method;
        this.unparsed |= !method.isValid();
        return this;
    }

    /**
     * Get method
     * @return method
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_METHOD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public HTTPMethod getMethod() {
        return method;
    }

    public void setMethod(HTTPMethod method) {
        if (!method.isValid()) {
            this.unparsed = true;
        }
        this.method = method;
    }

    public SyntheticsTestRequest noSavingResponseBody(Boolean noSavingResponseBody) {
        this.noSavingResponseBody = noSavingResponseBody;
        return this;
    }

    /**
     * Determines whether or not to save the response body.
     * @return noSavingResponseBody
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Determines whether or not to save the response body.")
    @JsonProperty(JSON_PROPERTY_NO_SAVING_RESPONSE_BODY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
     * Number of pings to use per test.
     * minimum: 0
     * maximum: 10
     * @return numberOfPackets
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Number of pings to use per test.")
    @JsonProperty(JSON_PROPERTY_NUMBER_OF_PACKETS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getNumberOfPackets() {
        return numberOfPackets;
    }

    public void setNumberOfPackets(Integer numberOfPackets) {
        this.numberOfPackets = numberOfPackets;
    }

    public SyntheticsTestRequest port(Long port) {
        this.port = port;
        return this;
    }

    /**
     * Port to use when performing the test.
     * @return port
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Port to use when performing the test.")
    @JsonProperty(JSON_PROPERTY_PORT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Long getPort() {
        return port;
    }

    public void setPort(Long port) {
        this.port = port;
    }

    public SyntheticsTestRequest query(Object query) {
        this.query = query;
        return this;
    }

    /**
     * Query to use for the test.
     * @return query
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Query to use for the test.")
    @JsonProperty(JSON_PROPERTY_QUERY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
     * For SSL tests, it specifies on which server you want to initiate the TLS handshake, allowing the server to present one of multiple possible certificates on the same IP address and TCP port number.
     * @return servername
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        value = "For SSL tests, it specifies on which server you want to initiate the TLS handshake, allowing the server to present one of multiple possible certificates on the same IP address and TCP port number."
    )
    @JsonProperty(JSON_PROPERTY_SERVERNAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getServername() {
        return servername;
    }

    public void setServername(String servername) {
        this.servername = servername;
    }

    public SyntheticsTestRequest shouldTrackHops(Boolean shouldTrackHops) {
        this.shouldTrackHops = shouldTrackHops;
        return this;
    }

    /**
     * Turns on a traceroute probe to discover all gateways along the path to the host destination.
     * @return shouldTrackHops
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Turns on a traceroute probe to discover all gateways along the path to the host destination.")
    @JsonProperty(JSON_PROPERTY_SHOULD_TRACK_HOPS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
     * Timeout in seconds for the test.
     * @return timeout
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Timeout in seconds for the test.")
    @JsonProperty(JSON_PROPERTY_TIMEOUT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
     * URL to perform the test with.
     * @return url
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "https://example.com", value = "URL to perform the test with.")
    @JsonProperty(JSON_PROPERTY_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
        return (
            Objects.equals(this.allowInsecure, syntheticsTestRequest.allowInsecure) &&
            Objects.equals(this.basicAuth, syntheticsTestRequest.basicAuth) &&
            Objects.equals(this.body, syntheticsTestRequest.body) &&
            Objects.equals(this.certificate, syntheticsTestRequest.certificate) &&
            Objects.equals(this.dnsServer, syntheticsTestRequest.dnsServer) &&
            Objects.equals(this.dnsServerPort, syntheticsTestRequest.dnsServerPort) &&
            Objects.equals(this.followRedirects, syntheticsTestRequest.followRedirects) &&
            Objects.equals(this.headers, syntheticsTestRequest.headers) &&
            Objects.equals(this.host, syntheticsTestRequest.host) &&
            Objects.equals(this.method, syntheticsTestRequest.method) &&
            Objects.equals(this.noSavingResponseBody, syntheticsTestRequest.noSavingResponseBody) &&
            Objects.equals(this.numberOfPackets, syntheticsTestRequest.numberOfPackets) &&
            Objects.equals(this.port, syntheticsTestRequest.port) &&
            Objects.equals(this.query, syntheticsTestRequest.query) &&
            Objects.equals(this.servername, syntheticsTestRequest.servername) &&
            Objects.equals(this.shouldTrackHops, syntheticsTestRequest.shouldTrackHops) &&
            Objects.equals(this.timeout, syntheticsTestRequest.timeout) &&
            Objects.equals(this.url, syntheticsTestRequest.url)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            allowInsecure,
            basicAuth,
            body,
            certificate,
            dnsServer,
            dnsServerPort,
            followRedirects,
            headers,
            host,
            method,
            noSavingResponseBody,
            numberOfPackets,
            port,
            query,
            servername,
            shouldTrackHops,
            timeout,
            url
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SyntheticsTestRequest {\n");
        sb.append("    allowInsecure: ").append(toIndentedString(allowInsecure)).append("\n");
        sb.append("    basicAuth: ").append(toIndentedString(basicAuth)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
        sb.append("    dnsServer: ").append(toIndentedString(dnsServer)).append("\n");
        sb.append("    dnsServerPort: ").append(toIndentedString(dnsServerPort)).append("\n");
        sb.append("    followRedirects: ").append(toIndentedString(followRedirects)).append("\n");
        sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    method: ").append(toIndentedString(method)).append("\n");
        sb.append("    noSavingResponseBody: ").append(toIndentedString(noSavingResponseBody)).append("\n");
        sb.append("    numberOfPackets: ").append(toIndentedString(numberOfPackets)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    query: ").append(toIndentedString(query)).append("\n");
        sb.append("    servername: ").append(toIndentedString(servername)).append("\n");
        sb.append("    shouldTrackHops: ").append(toIndentedString(shouldTrackHops)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("}");
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
