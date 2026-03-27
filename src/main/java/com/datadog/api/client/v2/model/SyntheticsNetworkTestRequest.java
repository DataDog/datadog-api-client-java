/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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
   * <p>Object describing the request for a Network Path test.</p>
 */
@JsonPropertyOrder({
  SyntheticsNetworkTestRequest.JSON_PROPERTY_DESTINATION_SERVICE,
  SyntheticsNetworkTestRequest.JSON_PROPERTY_E2E_QUERIES,
  SyntheticsNetworkTestRequest.JSON_PROPERTY_HOST,
  SyntheticsNetworkTestRequest.JSON_PROPERTY_MAX_TTL,
  SyntheticsNetworkTestRequest.JSON_PROPERTY_PORT,
  SyntheticsNetworkTestRequest.JSON_PROPERTY_SOURCE_SERVICE,
  SyntheticsNetworkTestRequest.JSON_PROPERTY_TCP_METHOD,
  SyntheticsNetworkTestRequest.JSON_PROPERTY_TIMEOUT,
  SyntheticsNetworkTestRequest.JSON_PROPERTY_TRACEROUTE_QUERIES
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsNetworkTestRequest {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESTINATION_SERVICE = "destination_service";
  private String destinationService;

  public static final String JSON_PROPERTY_E2E_QUERIES = "e2e_queries";
  private Long e2eQueries;

  public static final String JSON_PROPERTY_HOST = "host";
  private String host;

  public static final String JSON_PROPERTY_MAX_TTL = "max_ttl";
  private Long maxTtl;

  public static final String JSON_PROPERTY_PORT = "port";
  private Long port;

  public static final String JSON_PROPERTY_SOURCE_SERVICE = "source_service";
  private String sourceService;

  public static final String JSON_PROPERTY_TCP_METHOD = "tcp_method";
  private SyntheticsNetworkTestRequestTCPMethod tcpMethod;

  public static final String JSON_PROPERTY_TIMEOUT = "timeout";
  private Long timeout;

  public static final String JSON_PROPERTY_TRACEROUTE_QUERIES = "traceroute_queries";
  private Long tracerouteQueries;

  public SyntheticsNetworkTestRequest() {}

  @JsonCreator
  public SyntheticsNetworkTestRequest(
            @JsonProperty(required=true, value=JSON_PROPERTY_E2E_QUERIES)Long e2eQueries,
            @JsonProperty(required=true, value=JSON_PROPERTY_HOST)String host,
            @JsonProperty(required=true, value=JSON_PROPERTY_MAX_TTL)Long maxTtl,
            @JsonProperty(required=true, value=JSON_PROPERTY_TRACEROUTE_QUERIES)Long tracerouteQueries) {
        this.e2eQueries = e2eQueries;
        this.host = host;
        this.maxTtl = maxTtl;
        this.tracerouteQueries = tracerouteQueries;
  }
  public SyntheticsNetworkTestRequest destinationService(String destinationService) {
    this.destinationService = destinationService;
    return this;
  }

  /**
   * <p>An optional label displayed for the destination host in the Network Path visualization.</p>
   * @return destinationService
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DESTINATION_SERVICE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getDestinationService() {
        return destinationService;
      }
  public void setDestinationService(String destinationService) {
    this.destinationService = destinationService;
  }
  public SyntheticsNetworkTestRequest e2eQueries(Long e2eQueries) {
    this.e2eQueries = e2eQueries;
    return this;
  }

  /**
   * <p>The number of packets sent to probe the destination to measure packet loss, latency and jitter.</p>
   * @return e2eQueries
  **/
      @JsonProperty(JSON_PROPERTY_E2E_QUERIES)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Long getE2eQueries() {
        return e2eQueries;
      }
  public void setE2eQueries(Long e2eQueries) {
    this.e2eQueries = e2eQueries;
  }
  public SyntheticsNetworkTestRequest host(String host) {
    this.host = host;
    return this;
  }

  /**
   * <p>Host name to query.</p>
   * @return host
  **/
      @JsonProperty(JSON_PROPERTY_HOST)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getHost() {
        return host;
      }
  public void setHost(String host) {
    this.host = host;
  }
  public SyntheticsNetworkTestRequest maxTtl(Long maxTtl) {
    this.maxTtl = maxTtl;
    return this;
  }

  /**
   * <p>The maximum time-to-live (max number of hops) used in outgoing probe packets.</p>
   * @return maxTtl
  **/
      @JsonProperty(JSON_PROPERTY_MAX_TTL)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Long getMaxTtl() {
        return maxTtl;
      }
  public void setMaxTtl(Long maxTtl) {
    this.maxTtl = maxTtl;
  }
  public SyntheticsNetworkTestRequest port(Long port) {
    this.port = port;
    return this;
  }

  /**
   * <p>For TCP or UDP tests, the port to use when performing the test.
   * If not set on a UDP test, a random port is assigned, which may affect the results.</p>
   * @return port
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PORT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getPort() {
        return port;
      }
  public void setPort(Long port) {
    this.port = port;
  }
  public SyntheticsNetworkTestRequest sourceService(String sourceService) {
    this.sourceService = sourceService;
    return this;
  }

  /**
   * <p>An optional label displayed for the source host in the Network Path visualization.</p>
   * @return sourceService
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SOURCE_SERVICE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getSourceService() {
        return sourceService;
      }
  public void setSourceService(String sourceService) {
    this.sourceService = sourceService;
  }
  public SyntheticsNetworkTestRequest tcpMethod(SyntheticsNetworkTestRequestTCPMethod tcpMethod) {
    this.tcpMethod = tcpMethod;
    this.unparsed |= !tcpMethod.isValid();
    return this;
  }

  /**
   * <p>For TCP tests, the TCP traceroute strategy.</p>
   * @return tcpMethod
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TCP_METHOD)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SyntheticsNetworkTestRequestTCPMethod getTcpMethod() {
        return tcpMethod;
      }
  public void setTcpMethod(SyntheticsNetworkTestRequestTCPMethod tcpMethod) {
    if (!tcpMethod.isValid()) {
        this.unparsed = true;
    }
    this.tcpMethod = tcpMethod;
  }
  public SyntheticsNetworkTestRequest timeout(Long timeout) {
    this.timeout = timeout;
    return this;
  }

  /**
   * <p>Timeout in seconds.</p>
   * @return timeout
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TIMEOUT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getTimeout() {
        return timeout;
      }
  public void setTimeout(Long timeout) {
    this.timeout = timeout;
  }
  public SyntheticsNetworkTestRequest tracerouteQueries(Long tracerouteQueries) {
    this.tracerouteQueries = tracerouteQueries;
    return this;
  }

  /**
   * <p>The number of traceroute path tracings.</p>
   * @return tracerouteQueries
  **/
      @JsonProperty(JSON_PROPERTY_TRACEROUTE_QUERIES)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Long getTracerouteQueries() {
        return tracerouteQueries;
      }
  public void setTracerouteQueries(Long tracerouteQueries) {
    this.tracerouteQueries = tracerouteQueries;
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
   * @return SyntheticsNetworkTestRequest
   */
  @JsonAnySetter
  public SyntheticsNetworkTestRequest putAdditionalProperty(String key, Object value) {
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
   * Return true if this SyntheticsNetworkTestRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsNetworkTestRequest syntheticsNetworkTestRequest = (SyntheticsNetworkTestRequest) o;
    return Objects.equals(this.destinationService, syntheticsNetworkTestRequest.destinationService) && Objects.equals(this.e2eQueries, syntheticsNetworkTestRequest.e2eQueries) && Objects.equals(this.host, syntheticsNetworkTestRequest.host) && Objects.equals(this.maxTtl, syntheticsNetworkTestRequest.maxTtl) && Objects.equals(this.port, syntheticsNetworkTestRequest.port) && Objects.equals(this.sourceService, syntheticsNetworkTestRequest.sourceService) && Objects.equals(this.tcpMethod, syntheticsNetworkTestRequest.tcpMethod) && Objects.equals(this.timeout, syntheticsNetworkTestRequest.timeout) && Objects.equals(this.tracerouteQueries, syntheticsNetworkTestRequest.tracerouteQueries) && Objects.equals(this.additionalProperties, syntheticsNetworkTestRequest.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(destinationService,e2eQueries,host,maxTtl,port,sourceService,tcpMethod,timeout,tracerouteQueries, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsNetworkTestRequest {\n");
    sb.append("    destinationService: ").append(toIndentedString(destinationService)).append("\n");
    sb.append("    e2eQueries: ").append(toIndentedString(e2eQueries)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    maxTtl: ").append(toIndentedString(maxTtl)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    sourceService: ").append(toIndentedString(sourceService)).append("\n");
    sb.append("    tcpMethod: ").append(toIndentedString(tcpMethod)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    tracerouteQueries: ").append(toIndentedString(tracerouteQueries)).append("\n");
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
