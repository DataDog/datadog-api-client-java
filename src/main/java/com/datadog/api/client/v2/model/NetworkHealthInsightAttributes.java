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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Detailed attributes of a network health insight. */
@JsonPropertyOrder({
  NetworkHealthInsightAttributes.JSON_PROPERTY_ACCOUNT_ID,
  NetworkHealthInsightAttributes.JSON_PROPERTY_CERTIFICATE_ID,
  NetworkHealthInsightAttributes.JSON_PROPERTY_CERTIFICATE_LIFETIME_PERCENT,
  NetworkHealthInsightAttributes.JSON_PROPERTY_CLIENT_REGION,
  NetworkHealthInsightAttributes.JSON_PROPERTY_CLIENT_SERVICE,
  NetworkHealthInsightAttributes.JSON_PROPERTY_DAYS_UNTIL_EXPIRATION,
  NetworkHealthInsightAttributes.JSON_PROPERTY_DNS_QUERY,
  NetworkHealthInsightAttributes.JSON_PROPERTY_DNS_SERVER,
  NetworkHealthInsightAttributes.JSON_PROPERTY_DOMAIN_NAME,
  NetworkHealthInsightAttributes.JSON_PROPERTY_FAILURE_MAGNITUDE,
  NetworkHealthInsightAttributes.JSON_PROPERTY_FAILURE_RATE,
  NetworkHealthInsightAttributes.JSON_PROPERTY_FAILURE_TYPE,
  NetworkHealthInsightAttributes.JSON_PROPERTY_LOADBALANCER_ID,
  NetworkHealthInsightAttributes.JSON_PROPERTY_SERVER_REGION,
  NetworkHealthInsightAttributes.JSON_PROPERTY_SERVER_SERVICE,
  NetworkHealthInsightAttributes.JSON_PROPERTY_TOTAL_REQUESTS,
  NetworkHealthInsightAttributes.JSON_PROPERTY_TRAFFIC_VOLUME,
  NetworkHealthInsightAttributes.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class NetworkHealthInsightAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT_ID = "account_id";
  private String accountId;

  public static final String JSON_PROPERTY_CERTIFICATE_ID = "certificate_id";
  private String certificateId;

  public static final String JSON_PROPERTY_CERTIFICATE_LIFETIME_PERCENT =
      "certificate_lifetime_percent";
  private Double certificateLifetimePercent;

  public static final String JSON_PROPERTY_CLIENT_REGION = "client_region";
  private String clientRegion;

  public static final String JSON_PROPERTY_CLIENT_SERVICE = "client_service";
  private String clientService;

  public static final String JSON_PROPERTY_DAYS_UNTIL_EXPIRATION = "days_until_expiration";
  private Long daysUntilExpiration;

  public static final String JSON_PROPERTY_DNS_QUERY = "dns_query";
  private String dnsQuery;

  public static final String JSON_PROPERTY_DNS_SERVER = "dns_server";
  private String dnsServer;

  public static final String JSON_PROPERTY_DOMAIN_NAME = "domain_name";
  private String domainName;

  public static final String JSON_PROPERTY_FAILURE_MAGNITUDE = "failure_magnitude";
  private Long failureMagnitude;

  public static final String JSON_PROPERTY_FAILURE_RATE = "failure_rate";
  private Double failureRate;

  public static final String JSON_PROPERTY_FAILURE_TYPE = "failure_type";
  private NetworkHealthInsightFailureType failureType;

  public static final String JSON_PROPERTY_LOADBALANCER_ID = "loadbalancer_id";
  private String loadbalancerId;

  public static final String JSON_PROPERTY_SERVER_REGION = "server_region";
  private String serverRegion;

  public static final String JSON_PROPERTY_SERVER_SERVICE = "server_service";
  private String serverService;

  public static final String JSON_PROPERTY_TOTAL_REQUESTS = "total_requests";
  private Long totalRequests;

  public static final String JSON_PROPERTY_TRAFFIC_VOLUME = "traffic_volume";
  private NetworkHealthInsightTrafficVolume trafficVolume;

  public static final String JSON_PROPERTY_TYPE = "type";
  private NetworkHealthInsightCategory type;

  public NetworkHealthInsightAttributes accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * AWS account identifier where the certificate is located. Only set for <code>tls-cert</code>
   * insights.
   *
   * @return accountId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public NetworkHealthInsightAttributes certificateId(String certificateId) {
    this.certificateId = certificateId;
    return this;
  }

  /**
   * ARN or identifier of the certificate. Only set for <code>tls-cert</code> insights.
   *
   * @return certificateId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CERTIFICATE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCertificateId() {
    return certificateId;
  }

  public void setCertificateId(String certificateId) {
    this.certificateId = certificateId;
  }

  public NetworkHealthInsightAttributes certificateLifetimePercent(
      Double certificateLifetimePercent) {
    this.certificateLifetimePercent = certificateLifetimePercent;
    return this;
  }

  /**
   * Percentage of the certificate's validity period that has elapsed, ranging from 0 to 100. Only
   * set for <code>tls-cert</code> insights.
   *
   * @return certificateLifetimePercent
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CERTIFICATE_LIFETIME_PERCENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCertificateLifetimePercent() {
    return certificateLifetimePercent;
  }

  public void setCertificateLifetimePercent(Double certificateLifetimePercent) {
    this.certificateLifetimePercent = certificateLifetimePercent;
  }

  public NetworkHealthInsightAttributes clientRegion(String clientRegion) {
    this.clientRegion = clientRegion;
    return this;
  }

  /**
   * AWS region where the client is located. Only set for <code>tls-cert</code> insights.
   *
   * @return clientRegion
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLIENT_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getClientRegion() {
    return clientRegion;
  }

  public void setClientRegion(String clientRegion) {
    this.clientRegion = clientRegion;
  }

  public NetworkHealthInsightAttributes clientService(String clientService) {
    this.clientService = clientService;
    return this;
  }

  /**
   * Name of the service making the request (DNS query or TLS-secured connection). Set to <code>N/A
   * </code> when the client service cannot be determined.
   *
   * @return clientService
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLIENT_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getClientService() {
    return clientService;
  }

  public void setClientService(String clientService) {
    this.clientService = clientService;
  }

  public NetworkHealthInsightAttributes daysUntilExpiration(Long daysUntilExpiration) {
    this.daysUntilExpiration = daysUntilExpiration;
    return this;
  }

  /**
   * Number of days remaining until the certificate expires. Negative values indicate the
   * certificate has already expired. Only set for <code>tls-cert</code> insights.
   *
   * @return daysUntilExpiration
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DAYS_UNTIL_EXPIRATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getDaysUntilExpiration() {
    return daysUntilExpiration;
  }

  public void setDaysUntilExpiration(Long daysUntilExpiration) {
    this.daysUntilExpiration = daysUntilExpiration;
  }

  public NetworkHealthInsightAttributes dnsQuery(String dnsQuery) {
    this.dnsQuery = dnsQuery;
    return this;
  }

  /**
   * Domain name that was being resolved when the DNS failure occurred. Only set for <code>dns
   * </code> insights.
   *
   * @return dnsQuery
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DNS_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDnsQuery() {
    return dnsQuery;
  }

  public void setDnsQuery(String dnsQuery) {
    this.dnsQuery = dnsQuery;
  }

  public NetworkHealthInsightAttributes dnsServer(String dnsServer) {
    this.dnsServer = dnsServer;
    return this;
  }

  /**
   * DNS server that received the failing query. Only set for <code>dns</code> insights.
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

  public NetworkHealthInsightAttributes domainName(String domainName) {
    this.domainName = domainName;
    return this;
  }

  /**
   * Domain name covered by the certificate. Only set for <code>tls-cert</code> insights.
   *
   * @return domainName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOMAIN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDomainName() {
    return domainName;
  }

  public void setDomainName(String domainName) {
    this.domainName = domainName;
  }

  public NetworkHealthInsightAttributes failureMagnitude(Long failureMagnitude) {
    this.failureMagnitude = failureMagnitude;
    return this;
  }

  /**
   * Count of failed events observed during the query window. Only set for <code>dns</code>, <code>
   * tcp</code>, and <code>security-group</code> insights. minimum: 0
   *
   * @return failureMagnitude
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAILURE_MAGNITUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getFailureMagnitude() {
    return failureMagnitude;
  }

  public void setFailureMagnitude(Long failureMagnitude) {
    this.failureMagnitude = failureMagnitude;
  }

  public NetworkHealthInsightAttributes failureRate(Double failureRate) {
    this.failureRate = failureRate;
    return this;
  }

  /**
   * Percentage of requests that failed during the query window, ranging from 0 to 100. Only set for
   * <code>dns</code>, <code>tcp</code>, and <code>security-group</code> insights. minimum: 0
   * maximum: 100
   *
   * @return failureRate
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAILURE_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getFailureRate() {
    return failureRate;
  }

  public void setFailureRate(Double failureRate) {
    this.failureRate = failureRate;
  }

  public NetworkHealthInsightAttributes failureType(NetworkHealthInsightFailureType failureType) {
    this.failureType = failureType;
    this.unparsed |= !failureType.isValid();
    return this;
  }

  /**
   * Specific failure type within the insight category. For DNS insights: <code>timeout</code>,
   * <code>nxdomain</code>, <code>servfail</code>, or <code>general_failure</code>. For TLS
   * certificate insights: <code>expired</code> or <code>expiring_soon</code>. For security group
   * insights: <code>denied</code>.
   *
   * @return failureType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAILURE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public NetworkHealthInsightFailureType getFailureType() {
    return failureType;
  }

  public void setFailureType(NetworkHealthInsightFailureType failureType) {
    if (!failureType.isValid()) {
      this.unparsed = true;
    }
    this.failureType = failureType;
  }

  public NetworkHealthInsightAttributes loadbalancerId(String loadbalancerId) {
    this.loadbalancerId = loadbalancerId;
    return this;
  }

  /**
   * ARN of the load balancer using the certificate. Only set for <code>tls-cert</code> insights.
   *
   * @return loadbalancerId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOADBALANCER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLoadbalancerId() {
    return loadbalancerId;
  }

  public void setLoadbalancerId(String loadbalancerId) {
    this.loadbalancerId = loadbalancerId;
  }

  public NetworkHealthInsightAttributes serverRegion(String serverRegion) {
    this.serverRegion = serverRegion;
    return this;
  }

  /**
   * AWS region where the server or load balancer is located. Only set for <code>tls-cert</code>
   * insights.
   *
   * @return serverRegion
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVER_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getServerRegion() {
    return serverRegion;
  }

  public void setServerRegion(String serverRegion) {
    this.serverRegion = serverRegion;
  }

  public NetworkHealthInsightAttributes serverService(String serverService) {
    this.serverService = serverService;
    return this;
  }

  /**
   * Name of the target service the client was trying to reach.
   *
   * @return serverService
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVER_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getServerService() {
    return serverService;
  }

  public void setServerService(String serverService) {
    this.serverService = serverService;
  }

  public NetworkHealthInsightAttributes totalRequests(Long totalRequests) {
    this.totalRequests = totalRequests;
    return this;
  }

  /**
   * Total number of requests observed during the query window. Provides context for <code>
   * failure_magnitude</code> and <code>failure_rate</code>. Only set for <code>dns</code>, <code>
   * tcp</code>, and <code>security-group</code> insights. minimum: 0
   *
   * @return totalRequests
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTotalRequests() {
    return totalRequests;
  }

  public void setTotalRequests(Long totalRequests) {
    this.totalRequests = totalRequests;
  }

  public NetworkHealthInsightAttributes trafficVolume(
      NetworkHealthInsightTrafficVolume trafficVolume) {
    this.trafficVolume = trafficVolume;
    this.unparsed |= trafficVolume.unparsed;
    return this;
  }

  /**
   * Network traffic volume metrics between the client and server services during the query window.
   *
   * @return trafficVolume
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRAFFIC_VOLUME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public NetworkHealthInsightTrafficVolume getTrafficVolume() {
    return trafficVolume;
  }

  public void setTrafficVolume(NetworkHealthInsightTrafficVolume trafficVolume) {
    this.trafficVolume = trafficVolume;
  }

  public NetworkHealthInsightAttributes type(NetworkHealthInsightCategory type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Category of network health insight. Indicates whether the insight relates to a DNS issue (
   * <code>dns</code>), a TCP issue (<code>tcp</code>), a TLS certificate issue (<code>tls-cert
   * </code>), or a security group denial (<code>security-group</code>).
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public NetworkHealthInsightCategory getType() {
    return type;
  }

  public void setType(NetworkHealthInsightCategory type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
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
   * @return NetworkHealthInsightAttributes
   */
  @JsonAnySetter
  public NetworkHealthInsightAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this NetworkHealthInsightAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkHealthInsightAttributes networkHealthInsightAttributes =
        (NetworkHealthInsightAttributes) o;
    return Objects.equals(this.accountId, networkHealthInsightAttributes.accountId)
        && Objects.equals(this.certificateId, networkHealthInsightAttributes.certificateId)
        && Objects.equals(
            this.certificateLifetimePercent,
            networkHealthInsightAttributes.certificateLifetimePercent)
        && Objects.equals(this.clientRegion, networkHealthInsightAttributes.clientRegion)
        && Objects.equals(this.clientService, networkHealthInsightAttributes.clientService)
        && Objects.equals(
            this.daysUntilExpiration, networkHealthInsightAttributes.daysUntilExpiration)
        && Objects.equals(this.dnsQuery, networkHealthInsightAttributes.dnsQuery)
        && Objects.equals(this.dnsServer, networkHealthInsightAttributes.dnsServer)
        && Objects.equals(this.domainName, networkHealthInsightAttributes.domainName)
        && Objects.equals(this.failureMagnitude, networkHealthInsightAttributes.failureMagnitude)
        && Objects.equals(this.failureRate, networkHealthInsightAttributes.failureRate)
        && Objects.equals(this.failureType, networkHealthInsightAttributes.failureType)
        && Objects.equals(this.loadbalancerId, networkHealthInsightAttributes.loadbalancerId)
        && Objects.equals(this.serverRegion, networkHealthInsightAttributes.serverRegion)
        && Objects.equals(this.serverService, networkHealthInsightAttributes.serverService)
        && Objects.equals(this.totalRequests, networkHealthInsightAttributes.totalRequests)
        && Objects.equals(this.trafficVolume, networkHealthInsightAttributes.trafficVolume)
        && Objects.equals(this.type, networkHealthInsightAttributes.type)
        && Objects.equals(
            this.additionalProperties, networkHealthInsightAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId,
        certificateId,
        certificateLifetimePercent,
        clientRegion,
        clientService,
        daysUntilExpiration,
        dnsQuery,
        dnsServer,
        domainName,
        failureMagnitude,
        failureRate,
        failureType,
        loadbalancerId,
        serverRegion,
        serverService,
        totalRequests,
        trafficVolume,
        type,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkHealthInsightAttributes {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    certificateId: ").append(toIndentedString(certificateId)).append("\n");
    sb.append("    certificateLifetimePercent: ")
        .append(toIndentedString(certificateLifetimePercent))
        .append("\n");
    sb.append("    clientRegion: ").append(toIndentedString(clientRegion)).append("\n");
    sb.append("    clientService: ").append(toIndentedString(clientService)).append("\n");
    sb.append("    daysUntilExpiration: ")
        .append(toIndentedString(daysUntilExpiration))
        .append("\n");
    sb.append("    dnsQuery: ").append(toIndentedString(dnsQuery)).append("\n");
    sb.append("    dnsServer: ").append(toIndentedString(dnsServer)).append("\n");
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
    sb.append("    failureMagnitude: ").append(toIndentedString(failureMagnitude)).append("\n");
    sb.append("    failureRate: ").append(toIndentedString(failureRate)).append("\n");
    sb.append("    failureType: ").append(toIndentedString(failureType)).append("\n");
    sb.append("    loadbalancerId: ").append(toIndentedString(loadbalancerId)).append("\n");
    sb.append("    serverRegion: ").append(toIndentedString(serverRegion)).append("\n");
    sb.append("    serverService: ").append(toIndentedString(serverService)).append("\n");
    sb.append("    totalRequests: ").append(toIndentedString(totalRequests)).append("\n");
    sb.append("    trafficVolume: ").append(toIndentedString(trafficVolume)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
