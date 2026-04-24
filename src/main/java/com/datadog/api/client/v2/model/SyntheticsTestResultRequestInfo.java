/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Details of the outgoing request made during the test execution. */
@JsonPropertyOrder({
  SyntheticsTestResultRequestInfo.JSON_PROPERTY_ALLOW_INSECURE,
  SyntheticsTestResultRequestInfo.JSON_PROPERTY_BODY,
  SyntheticsTestResultRequestInfo.JSON_PROPERTY_CALL_TYPE,
  SyntheticsTestResultRequestInfo.JSON_PROPERTY_DESTINATION_SERVICE,
  SyntheticsTestResultRequestInfo.JSON_PROPERTY_DNS_SERVER,
  SyntheticsTestResultRequestInfo.JSON_PROPERTY_DNS_SERVER_PORT,
  SyntheticsTestResultRequestInfo.JSON_PROPERTY_E2E_QUERIES,
  SyntheticsTestResultRequestInfo.JSON_PROPERTY_FILES,
  SyntheticsTestResultRequestInfo.JSON_PROPERTY_HEADERS,
  SyntheticsTestResultRequestInfo.JSON_PROPERTY_HOST,
  SyntheticsTestResultRequestInfo.JSON_PROPERTY_MAX_TTL,
  SyntheticsTestResultRequestInfo.JSON_PROPERTY_MESSAGE,
  SyntheticsTestResultRequestInfo.JSON_PROPERTY_METHOD,
  SyntheticsTestResultRequestInfo.JSON_PROPERTY_NO_SAVING_RESPONSE_BODY,
  SyntheticsTestResultRequestInfo.JSON_PROPERTY_PORT,
  SyntheticsTestResultRequestInfo.JSON_PROPERTY_SERVICE,
  SyntheticsTestResultRequestInfo.JSON_PROPERTY_SOURCE_SERVICE,
  SyntheticsTestResultRequestInfo.JSON_PROPERTY_TIMEOUT,
  SyntheticsTestResultRequestInfo.JSON_PROPERTY_TOOL_NAME,
  SyntheticsTestResultRequestInfo.JSON_PROPERTY_TRACEROUTE_QUERIES,
  SyntheticsTestResultRequestInfo.JSON_PROPERTY_URL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestResultRequestInfo {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALLOW_INSECURE = "allow_insecure";
  private Boolean allowInsecure;

  public static final String JSON_PROPERTY_BODY = "body";
  private String body;

  public static final String JSON_PROPERTY_CALL_TYPE = "call_type";
  private String callType;

  public static final String JSON_PROPERTY_DESTINATION_SERVICE = "destination_service";
  private String destinationService;

  public static final String JSON_PROPERTY_DNS_SERVER = "dns_server";
  private String dnsServer;

  public static final String JSON_PROPERTY_DNS_SERVER_PORT = "dns_server_port";
  private Long dnsServerPort;

  public static final String JSON_PROPERTY_E2E_QUERIES = "e2e_queries";
  private Long e2eQueries;

  public static final String JSON_PROPERTY_FILES = "files";
  private List<SyntheticsTestResultFileRef> files = null;

  public static final String JSON_PROPERTY_HEADERS = "headers";
  private Map<String, Object> headers = null;

  public static final String JSON_PROPERTY_HOST = "host";
  private String host;

  public static final String JSON_PROPERTY_MAX_TTL = "max_ttl";
  private Long maxTtl;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_METHOD = "method";
  private String method;

  public static final String JSON_PROPERTY_NO_SAVING_RESPONSE_BODY = "no_saving_response_body";
  private Boolean noSavingResponseBody;

  public static final String JSON_PROPERTY_PORT = "port";
  private Object port = null;

  public static final String JSON_PROPERTY_SERVICE = "service";
  private String service;

  public static final String JSON_PROPERTY_SOURCE_SERVICE = "source_service";
  private String sourceService;

  public static final String JSON_PROPERTY_TIMEOUT = "timeout";
  private Long timeout;

  public static final String JSON_PROPERTY_TOOL_NAME = "tool_name";
  private String toolName;

  public static final String JSON_PROPERTY_TRACEROUTE_QUERIES = "traceroute_queries";
  private Long tracerouteQueries;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public SyntheticsTestResultRequestInfo allowInsecure(Boolean allowInsecure) {
    this.allowInsecure = allowInsecure;
    return this;
  }

  /**
   * Whether insecure certificates are allowed for this request.
   *
   * @return allowInsecure
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOW_INSECURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getAllowInsecure() {
    return allowInsecure;
  }

  public void setAllowInsecure(Boolean allowInsecure) {
    this.allowInsecure = allowInsecure;
  }

  public SyntheticsTestResultRequestInfo body(String body) {
    this.body = body;
    return this;
  }

  /**
   * Body sent with the request.
   *
   * @return body
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public SyntheticsTestResultRequestInfo callType(String callType) {
    this.callType = callType;
    return this;
  }

  /**
   * gRPC call type (for example, <code>unary</code>, <code>healthCheck</code>, or <code>reflection
   * </code>).
   *
   * @return callType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CALL_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCallType() {
    return callType;
  }

  public void setCallType(String callType) {
    this.callType = callType;
  }

  public SyntheticsTestResultRequestInfo destinationService(String destinationService) {
    this.destinationService = destinationService;
    return this;
  }

  /**
   * Destination service for a Network Path test.
   *
   * @return destinationService
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESTINATION_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDestinationService() {
    return destinationService;
  }

  public void setDestinationService(String destinationService) {
    this.destinationService = destinationService;
  }

  public SyntheticsTestResultRequestInfo dnsServer(String dnsServer) {
    this.dnsServer = dnsServer;
    return this;
  }

  /**
   * DNS server used to resolve the target host.
   *
   * @return dnsServer
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DNS_SERVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDnsServer() {
    return dnsServer;
  }

  public void setDnsServer(String dnsServer) {
    this.dnsServer = dnsServer;
  }

  public SyntheticsTestResultRequestInfo dnsServerPort(Long dnsServerPort) {
    this.dnsServerPort = dnsServerPort;
    return this;
  }

  /**
   * Port of the DNS server used for resolution.
   *
   * @return dnsServerPort
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DNS_SERVER_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getDnsServerPort() {
    return dnsServerPort;
  }

  public void setDnsServerPort(Long dnsServerPort) {
    this.dnsServerPort = dnsServerPort;
  }

  public SyntheticsTestResultRequestInfo e2eQueries(Long e2eQueries) {
    this.e2eQueries = e2eQueries;
    return this;
  }

  /**
   * Number of end-to-end probe queries issued.
   *
   * @return e2eQueries
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_E2E_QUERIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getE2eQueries() {
    return e2eQueries;
  }

  public void setE2eQueries(Long e2eQueries) {
    this.e2eQueries = e2eQueries;
  }

  public SyntheticsTestResultRequestInfo files(List<SyntheticsTestResultFileRef> files) {
    this.files = files;
    for (SyntheticsTestResultFileRef item : files) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SyntheticsTestResultRequestInfo addFilesItem(SyntheticsTestResultFileRef filesItem) {
    if (this.files == null) {
      this.files = new ArrayList<>();
    }
    this.files.add(filesItem);
    this.unparsed |= filesItem.unparsed;
    return this;
  }

  /**
   * Files attached to the request.
   *
   * @return files
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SyntheticsTestResultFileRef> getFiles() {
    return files;
  }

  public void setFiles(List<SyntheticsTestResultFileRef> files) {
    this.files = files;
  }

  public SyntheticsTestResultRequestInfo headers(Map<String, Object> headers) {
    this.headers = headers;
    return this;
  }

  public SyntheticsTestResultRequestInfo putHeadersItem(String key, Object headersItem) {
    if (this.headers == null) {
      this.headers = new HashMap<>();
    }
    this.headers.put(key, headersItem);
    return this;
  }

  /**
   * Headers sent with the request.
   *
   * @return headers
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getHeaders() {
    return headers;
  }

  public void setHeaders(Map<String, Object> headers) {
    this.headers = headers;
  }

  public SyntheticsTestResultRequestInfo host(String host) {
    this.host = host;
    return this;
  }

  /**
   * Host targeted by the request.
   *
   * @return host
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public SyntheticsTestResultRequestInfo maxTtl(Long maxTtl) {
    this.maxTtl = maxTtl;
    return this;
  }

  /**
   * Maximum TTL for network probe packets.
   *
   * @return maxTtl
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_TTL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxTtl() {
    return maxTtl;
  }

  public void setMaxTtl(Long maxTtl) {
    this.maxTtl = maxTtl;
  }

  public SyntheticsTestResultRequestInfo message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Message sent with the request (for WebSocket/TCP/UDP tests).
   *
   * @return message
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public SyntheticsTestResultRequestInfo method(String method) {
    this.method = method;
    return this;
  }

  /**
   * HTTP method used for the request.
   *
   * @return method
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public SyntheticsTestResultRequestInfo noSavingResponseBody(Boolean noSavingResponseBody) {
    this.noSavingResponseBody = noSavingResponseBody;
    return this;
  }

  /**
   * Whether the response body was not saved.
   *
   * @return noSavingResponseBody
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NO_SAVING_RESPONSE_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getNoSavingResponseBody() {
    return noSavingResponseBody;
  }

  public void setNoSavingResponseBody(Boolean noSavingResponseBody) {
    this.noSavingResponseBody = noSavingResponseBody;
  }

  public SyntheticsTestResultRequestInfo port(Object port) {
    this.port = port;
    return this;
  }

  /**
   * Port targeted by the request. Can be a number or a string variable reference.
   *
   * @return port
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Object getPort() {
    return port;
  }

  public void setPort(Object port) {
    this.port = port;
  }

  public SyntheticsTestResultRequestInfo service(String service) {
    this.service = service;
    return this;
  }

  /**
   * Service name targeted by the request (for gRPC tests).
   *
   * @return service
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getService() {
    return service;
  }

  public void setService(String service) {
    this.service = service;
  }

  public SyntheticsTestResultRequestInfo sourceService(String sourceService) {
    this.sourceService = sourceService;
    return this;
  }

  /**
   * Source service for a Network Path test.
   *
   * @return sourceService
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSourceService() {
    return sourceService;
  }

  public void setSourceService(String sourceService) {
    this.sourceService = sourceService;
  }

  public SyntheticsTestResultRequestInfo timeout(Long timeout) {
    this.timeout = timeout;
    return this;
  }

  /**
   * Request timeout in milliseconds.
   *
   * @return timeout
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMEOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTimeout() {
    return timeout;
  }

  public void setTimeout(Long timeout) {
    this.timeout = timeout;
  }

  public SyntheticsTestResultRequestInfo toolName(String toolName) {
    this.toolName = toolName;
    return this;
  }

  /**
   * Name of the MCP tool called (MCP tests only).
   *
   * @return toolName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOOL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getToolName() {
    return toolName;
  }

  public void setToolName(String toolName) {
    this.toolName = toolName;
  }

  public SyntheticsTestResultRequestInfo tracerouteQueries(Long tracerouteQueries) {
    this.tracerouteQueries = tracerouteQueries;
    return this;
  }

  /**
   * Number of traceroute probe queries issued.
   *
   * @return tracerouteQueries
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRACEROUTE_QUERIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTracerouteQueries() {
    return tracerouteQueries;
  }

  public void setTracerouteQueries(Long tracerouteQueries) {
    this.tracerouteQueries = tracerouteQueries;
  }

  public SyntheticsTestResultRequestInfo url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL targeted by the request.
   *
   * @return url
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * A container for additional, undeclared properties. This is a holder for any undeclared
   * properties as specified with the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value. If the property
   * does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return SyntheticsTestResultRequestInfo
   */
  @JsonAnySetter
  public SyntheticsTestResultRequestInfo putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsTestResultRequestInfo object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestResultRequestInfo syntheticsTestResultRequestInfo =
        (SyntheticsTestResultRequestInfo) o;
    return Objects.equals(this.allowInsecure, syntheticsTestResultRequestInfo.allowInsecure)
        && Objects.equals(this.body, syntheticsTestResultRequestInfo.body)
        && Objects.equals(this.callType, syntheticsTestResultRequestInfo.callType)
        && Objects.equals(
            this.destinationService, syntheticsTestResultRequestInfo.destinationService)
        && Objects.equals(this.dnsServer, syntheticsTestResultRequestInfo.dnsServer)
        && Objects.equals(this.dnsServerPort, syntheticsTestResultRequestInfo.dnsServerPort)
        && Objects.equals(this.e2eQueries, syntheticsTestResultRequestInfo.e2eQueries)
        && Objects.equals(this.files, syntheticsTestResultRequestInfo.files)
        && Objects.equals(this.headers, syntheticsTestResultRequestInfo.headers)
        && Objects.equals(this.host, syntheticsTestResultRequestInfo.host)
        && Objects.equals(this.maxTtl, syntheticsTestResultRequestInfo.maxTtl)
        && Objects.equals(this.message, syntheticsTestResultRequestInfo.message)
        && Objects.equals(this.method, syntheticsTestResultRequestInfo.method)
        && Objects.equals(
            this.noSavingResponseBody, syntheticsTestResultRequestInfo.noSavingResponseBody)
        && Objects.equals(this.port, syntheticsTestResultRequestInfo.port)
        && Objects.equals(this.service, syntheticsTestResultRequestInfo.service)
        && Objects.equals(this.sourceService, syntheticsTestResultRequestInfo.sourceService)
        && Objects.equals(this.timeout, syntheticsTestResultRequestInfo.timeout)
        && Objects.equals(this.toolName, syntheticsTestResultRequestInfo.toolName)
        && Objects.equals(this.tracerouteQueries, syntheticsTestResultRequestInfo.tracerouteQueries)
        && Objects.equals(this.url, syntheticsTestResultRequestInfo.url)
        && Objects.equals(
            this.additionalProperties, syntheticsTestResultRequestInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        allowInsecure,
        body,
        callType,
        destinationService,
        dnsServer,
        dnsServerPort,
        e2eQueries,
        files,
        headers,
        host,
        maxTtl,
        message,
        method,
        noSavingResponseBody,
        port,
        service,
        sourceService,
        timeout,
        toolName,
        tracerouteQueries,
        url,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestResultRequestInfo {\n");
    sb.append("    allowInsecure: ").append(toIndentedString(allowInsecure)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    callType: ").append(toIndentedString(callType)).append("\n");
    sb.append("    destinationService: ").append(toIndentedString(destinationService)).append("\n");
    sb.append("    dnsServer: ").append(toIndentedString(dnsServer)).append("\n");
    sb.append("    dnsServerPort: ").append(toIndentedString(dnsServerPort)).append("\n");
    sb.append("    e2eQueries: ").append(toIndentedString(e2eQueries)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    maxTtl: ").append(toIndentedString(maxTtl)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    noSavingResponseBody: ")
        .append(toIndentedString(noSavingResponseBody))
        .append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    sourceService: ").append(toIndentedString(sourceService)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    toolName: ").append(toIndentedString(toolName)).append("\n");
    sb.append("    tracerouteQueries: ").append(toIndentedString(tracerouteQueries)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
