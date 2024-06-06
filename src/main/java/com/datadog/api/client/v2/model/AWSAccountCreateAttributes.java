/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** AWS Account attributes for creation */
@JsonPropertyOrder({
  AWSAccountCreateAttributes.JSON_PROPERTY_ACCOUNT_TAGS,
  AWSAccountCreateAttributes.JSON_PROPERTY_AUTH_CONFIG,
  AWSAccountCreateAttributes.JSON_PROPERTY_AWS_ACCOUNT_ID,
  AWSAccountCreateAttributes.JSON_PROPERTY_AWS_REGIONS,
  AWSAccountCreateAttributes.JSON_PROPERTY_LOGS_CONFIG,
  AWSAccountCreateAttributes.JSON_PROPERTY_METRICS_CONFIG,
  AWSAccountCreateAttributes.JSON_PROPERTY_RESOURCES_CONFIG,
  AWSAccountCreateAttributes.JSON_PROPERTY_TRACES_CONFIG
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AWSAccountCreateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT_TAGS = "account_tags";
  private List<String> accountTags = null;

  public static final String JSON_PROPERTY_AUTH_CONFIG = "auth_config";
  private AWSAuthConfig authConfig;

  public static final String JSON_PROPERTY_AWS_ACCOUNT_ID = "aws_account_id";
  private String awsAccountId;

  public static final String JSON_PROPERTY_AWS_REGIONS = "aws_regions";
  private AWSRegionsList awsRegions;

  public static final String JSON_PROPERTY_LOGS_CONFIG = "logs_config";
  private AWSLogs logsConfig;

  public static final String JSON_PROPERTY_METRICS_CONFIG = "metrics_config";
  private AWSMetrics metricsConfig;

  public static final String JSON_PROPERTY_RESOURCES_CONFIG = "resources_config";
  private AWSResources resourcesConfig;

  public static final String JSON_PROPERTY_TRACES_CONFIG = "traces_config";
  private AWSTraces tracesConfig;

  public AWSAccountCreateAttributes() {}

  @JsonCreator
  public AWSAccountCreateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_AWS_ACCOUNT_ID) String awsAccountId) {
    this.awsAccountId = awsAccountId;
  }

  public AWSAccountCreateAttributes accountTags(List<String> accountTags) {
    this.accountTags = accountTags;
    return this;
  }

  public AWSAccountCreateAttributes addAccountTagsItem(String accountTagsItem) {
    if (this.accountTags == null) {
      this.accountTags = new ArrayList<>();
    }
    this.accountTags.add(accountTagsItem);
    return this;
  }

  /**
   * Tags to apply to all metrics in the account
   *
   * @return accountTags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getAccountTags() {
    return accountTags;
  }

  public void setAccountTags(List<String> accountTags) {
    this.accountTags = accountTags;
  }

  public AWSAccountCreateAttributes authConfig(AWSAuthConfig authConfig) {
    this.authConfig = authConfig;
    this.unparsed |= authConfig.unparsed;
    return this;
  }

  /**
   * AWS Authentication config
   *
   * @return authConfig
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTH_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AWSAuthConfig getAuthConfig() {
    return authConfig;
  }

  public void setAuthConfig(AWSAuthConfig authConfig) {
    this.authConfig = authConfig;
  }

  public AWSAccountCreateAttributes awsAccountId(String awsAccountId) {
    this.awsAccountId = awsAccountId;
    return this;
  }

  /**
   * AWS Account ID
   *
   * @return awsAccountId
   */
  @JsonProperty(JSON_PROPERTY_AWS_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAwsAccountId() {
    return awsAccountId;
  }

  public void setAwsAccountId(String awsAccountId) {
    this.awsAccountId = awsAccountId;
  }

  public AWSAccountCreateAttributes awsRegions(AWSRegionsList awsRegions) {
    this.awsRegions = awsRegions;
    this.unparsed |= awsRegions.unparsed;
    return this;
  }

  /**
   * AWS Regions to collect data from
   *
   * @return awsRegions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AWS_REGIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AWSRegionsList getAwsRegions() {
    return awsRegions;
  }

  public void setAwsRegions(AWSRegionsList awsRegions) {
    this.awsRegions = awsRegions;
  }

  public AWSAccountCreateAttributes logsConfig(AWSLogs logsConfig) {
    this.logsConfig = logsConfig;
    this.unparsed |= logsConfig.unparsed;
    return this;
  }

  /**
   * AWS Logs config
   *
   * @return logsConfig
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGS_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AWSLogs getLogsConfig() {
    return logsConfig;
  }

  public void setLogsConfig(AWSLogs logsConfig) {
    this.logsConfig = logsConfig;
  }

  public AWSAccountCreateAttributes metricsConfig(AWSMetrics metricsConfig) {
    this.metricsConfig = metricsConfig;
    this.unparsed |= metricsConfig.unparsed;
    return this;
  }

  /**
   * AWS Metrics config
   *
   * @return metricsConfig
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRICS_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AWSMetrics getMetricsConfig() {
    return metricsConfig;
  }

  public void setMetricsConfig(AWSMetrics metricsConfig) {
    this.metricsConfig = metricsConfig;
  }

  public AWSAccountCreateAttributes resourcesConfig(AWSResources resourcesConfig) {
    this.resourcesConfig = resourcesConfig;
    this.unparsed |= resourcesConfig.unparsed;
    return this;
  }

  /**
   * AWS Resources config
   *
   * @return resourcesConfig
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESOURCES_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AWSResources getResourcesConfig() {
    return resourcesConfig;
  }

  public void setResourcesConfig(AWSResources resourcesConfig) {
    this.resourcesConfig = resourcesConfig;
  }

  public AWSAccountCreateAttributes tracesConfig(AWSTraces tracesConfig) {
    this.tracesConfig = tracesConfig;
    this.unparsed |= tracesConfig.unparsed;
    return this;
  }

  /**
   * AWS Traces config
   *
   * @return tracesConfig
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRACES_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AWSTraces getTracesConfig() {
    return tracesConfig;
  }

  public void setTracesConfig(AWSTraces tracesConfig) {
    this.tracesConfig = tracesConfig;
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
   * @return AWSAccountCreateAttributes
   */
  @JsonAnySetter
  public AWSAccountCreateAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AWSAccountCreateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AWSAccountCreateAttributes awsAccountCreateAttributes = (AWSAccountCreateAttributes) o;
    return Objects.equals(this.accountTags, awsAccountCreateAttributes.accountTags)
        && Objects.equals(this.authConfig, awsAccountCreateAttributes.authConfig)
        && Objects.equals(this.awsAccountId, awsAccountCreateAttributes.awsAccountId)
        && Objects.equals(this.awsRegions, awsAccountCreateAttributes.awsRegions)
        && Objects.equals(this.logsConfig, awsAccountCreateAttributes.logsConfig)
        && Objects.equals(this.metricsConfig, awsAccountCreateAttributes.metricsConfig)
        && Objects.equals(this.resourcesConfig, awsAccountCreateAttributes.resourcesConfig)
        && Objects.equals(this.tracesConfig, awsAccountCreateAttributes.tracesConfig)
        && Objects.equals(
            this.additionalProperties, awsAccountCreateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountTags,
        authConfig,
        awsAccountId,
        awsRegions,
        logsConfig,
        metricsConfig,
        resourcesConfig,
        tracesConfig,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AWSAccountCreateAttributes {\n");
    sb.append("    accountTags: ").append(toIndentedString(accountTags)).append("\n");
    sb.append("    authConfig: ").append(toIndentedString(authConfig)).append("\n");
    sb.append("    awsAccountId: ").append(toIndentedString(awsAccountId)).append("\n");
    sb.append("    awsRegions: ").append(toIndentedString(awsRegions)).append("\n");
    sb.append("    logsConfig: ").append(toIndentedString(logsConfig)).append("\n");
    sb.append("    metricsConfig: ").append(toIndentedString(metricsConfig)).append("\n");
    sb.append("    resourcesConfig: ").append(toIndentedString(resourcesConfig)).append("\n");
    sb.append("    tracesConfig: ").append(toIndentedString(tracesConfig)).append("\n");
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
