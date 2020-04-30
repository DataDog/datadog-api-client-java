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
import com.datadog.api.v1.client.model.HTTPMethod;
import com.datadog.api.v1.client.model.SyntheticsTestRequestBasicAuth;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * TODO.
 */
@ApiModel(description = "TODO.")
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

public class SyntheticsTestRequest {
  public static final String JSON_PROPERTY_BASIC_AUTH = "basicAuth";
  private SyntheticsTestRequestBasicAuth basicAuth;

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


  public SyntheticsTestRequest basicAuth(SyntheticsTestRequestBasicAuth basicAuth) {
    
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

  public SyntheticsTestRequestBasicAuth getBasicAuth() {
    return basicAuth;
  }


  public void setBasicAuth(SyntheticsTestRequestBasicAuth basicAuth) {
    this.basicAuth = basicAuth;
  }


  public SyntheticsTestRequest body(String body) {
    
    this.body = body;
    return this;
  }

   /**
   * TODO.
   * @return body
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TODO.")
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
   * TODO.
   * @return headers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TODO.")
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
   * TODO.
   * @return host
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TODO.")
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
   * TODO.
   * @return port
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TODO.")
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
   * TODO.
   * @return query
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TODO.")
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
   * TODO.
   * @return timeout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TODO.")
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
   * TODO.
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TODO.")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

