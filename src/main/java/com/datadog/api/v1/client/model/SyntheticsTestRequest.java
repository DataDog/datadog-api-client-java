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

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.datadog.api.v1.client.model.HTTPMethod;
import com.datadog.api.v1.client.model.SyntheticsBasicAuth;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v1.client.JSON;


/**
 * Object describing the Synthetic test request.
 */
@ApiModel(description = "Object describing the Synthetic test request.")
@JsonPropertyOrder({
  SyntheticsTestRequest.JSON_PROPERTY_BASIC_AUTH,
  SyntheticsTestRequest.JSON_PROPERTY_BODY,
  SyntheticsTestRequest.JSON_PROPERTY_HEADERS,
  SyntheticsTestRequest.JSON_PROPERTY_HOST,
  SyntheticsTestRequest.JSON_PROPERTY_METHOD,
  SyntheticsTestRequest.JSON_PROPERTY_PORT,
  SyntheticsTestRequest.JSON_PROPERTY_QUERY,
  SyntheticsTestRequest.JSON_PROPERTY_TIMEOUT,
  SyntheticsTestRequest.JSON_PROPERTY_URL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SyntheticsTestRequest {
  public static final String JSON_PROPERTY_BASIC_AUTH = "basicAuth";
  private SyntheticsBasicAuth basicAuth;

  public static final String JSON_PROPERTY_BODY = "body";
  private String body;

  public static final String JSON_PROPERTY_HEADERS = "headers";
  private Map<String, String> headers = null;

  public static final String JSON_PROPERTY_HOST = "host";
  private String host;

  public static final String JSON_PROPERTY_METHOD = "method";
  private HTTPMethod method;

  public static final String JSON_PROPERTY_PORT = "port";
  private Long port;

  public static final String JSON_PROPERTY_QUERY = "query";
  private Object query;

  public static final String JSON_PROPERTY_TIMEOUT = "timeout";
  private Double timeout;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;


  public SyntheticsTestRequest basicAuth(SyntheticsBasicAuth basicAuth) {
    this.basicAuth = basicAuth;
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
    this.method = method;
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


  public SyntheticsTestRequest timeout(Double timeout) {
    this.timeout = timeout;
    return this;
  }

   /**
   * Timeout in millisecond for the test.
   * @return timeout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timeout in millisecond for the test.")
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
  @ApiModelProperty(value = "URL to perform the test with.")
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
    return Objects.equals(this.basicAuth, syntheticsTestRequest.basicAuth) &&
        Objects.equals(this.body, syntheticsTestRequest.body) &&
        Objects.equals(this.headers, syntheticsTestRequest.headers) &&
        Objects.equals(this.host, syntheticsTestRequest.host) &&
        Objects.equals(this.method, syntheticsTestRequest.method) &&
        Objects.equals(this.port, syntheticsTestRequest.port) &&
        Objects.equals(this.query, syntheticsTestRequest.query) &&
        Objects.equals(this.timeout, syntheticsTestRequest.timeout) &&
        Objects.equals(this.url, syntheticsTestRequest.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(basicAuth, body, headers, host, method, port, query, timeout, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestRequest {\n");
    sb.append("    basicAuth: ").append(toIndentedString(basicAuth)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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

