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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** AWS Account response attributes. */
@JsonPropertyOrder({
  AWSAccountResponseAttributes.JSON_PROPERTY_ACCOUNT_TAGS,
  AWSAccountResponseAttributes.JSON_PROPERTY_AUTH_CONFIG,
  AWSAccountResponseAttributes.JSON_PROPERTY_AWS_ACCOUNT_ID,
  AWSAccountResponseAttributes.JSON_PROPERTY_AWS_PARTITION,
  AWSAccountResponseAttributes.JSON_PROPERTY_AWS_REGIONS,
  AWSAccountResponseAttributes.JSON_PROPERTY_CREATED_AT,
  AWSAccountResponseAttributes.JSON_PROPERTY_LOGS_CONFIG,
  AWSAccountResponseAttributes.JSON_PROPERTY_METRICS_CONFIG,
  AWSAccountResponseAttributes.JSON_PROPERTY_MODIFIED_AT,
  AWSAccountResponseAttributes.JSON_PROPERTY_RESOURCES_CONFIG,
  AWSAccountResponseAttributes.JSON_PROPERTY_TRACES_CONFIG
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AWSAccountResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT_TAGS = "account_tags";
  private JsonNullable<List<String>> accountTags = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_AUTH_CONFIG = "auth_config";
  private AWSAuthConfig authConfig;

  public static final String JSON_PROPERTY_AWS_ACCOUNT_ID = "aws_account_id";
  private String awsAccountId;

  public static final String JSON_PROPERTY_AWS_PARTITION = "aws_partition";
  private AWSAccountPartition awsPartition;

  public static final String JSON_PROPERTY_AWS_REGIONS = "aws_regions";
  private AWSRegions awsRegions;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_LOGS_CONFIG = "logs_config";
  private AWSLogsConfig logsConfig;

  public static final String JSON_PROPERTY_METRICS_CONFIG = "metrics_config";
  private AWSMetricsConfig metricsConfig;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_RESOURCES_CONFIG = "resources_config";
  private AWSResourcesConfig resourcesConfig;

  public static final String JSON_PROPERTY_TRACES_CONFIG = "traces_config";
  private AWSTracesConfig tracesConfig;

  public AWSAccountResponseAttributes() {}

  @JsonCreator
  public AWSAccountResponseAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_AWS_ACCOUNT_ID) String awsAccountId) {
    this.awsAccountId = awsAccountId;
  }

  public AWSAccountResponseAttributes accountTags(List<String> accountTags) {
    this.accountTags = JsonNullable.<List<String>>of(accountTags);
    return this;
  }

  public AWSAccountResponseAttributes addAccountTagsItem(String accountTagsItem) {
    if (this.accountTags == null || !this.accountTags.isPresent()) {
      this.accountTags = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.accountTags.get().add(accountTagsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Tags to apply to all hosts and metrics reporting for this account. Defaults to <code>[]</code>.
   *
   * @return accountTags
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<String> getAccountTags() {
    return accountTags.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ACCOUNT_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getAccountTags_JsonNullable() {
    return accountTags;
  }

  @JsonProperty(JSON_PROPERTY_ACCOUNT_TAGS)
  public void setAccountTags_JsonNullable(JsonNullable<List<String>> accountTags) {
    this.accountTags = accountTags;
  }

  public void setAccountTags(List<String> accountTags) {
    this.accountTags = JsonNullable.<List<String>>of(accountTags);
  }

  public AWSAccountResponseAttributes authConfig(AWSAuthConfig authConfig) {
    this.authConfig = authConfig;
    this.unparsed |= authConfig.unparsed;
    return this;
  }

  /**
   * AWS Authentication config.
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

  public AWSAccountResponseAttributes awsAccountId(String awsAccountId) {
    this.awsAccountId = awsAccountId;
    return this;
  }

  /**
   * AWS Account ID.
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

  public AWSAccountResponseAttributes awsPartition(AWSAccountPartition awsPartition) {
    this.awsPartition = awsPartition;
    this.unparsed |= !awsPartition.isValid();
    return this;
  }

  /**
   * AWS partition your AWS account is scoped to. Defaults to <code>aws</code>. See <a
   * href="https://docs.aws.amazon.com/whitepapers/latest/aws-fault-isolation-boundaries/partitions.html">Partitions</a>
   * in the AWS documentation for more information.
   *
   * @return awsPartition
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AWS_PARTITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AWSAccountPartition getAwsPartition() {
    return awsPartition;
  }

  public void setAwsPartition(AWSAccountPartition awsPartition) {
    if (!awsPartition.isValid()) {
      this.unparsed = true;
    }
    this.awsPartition = awsPartition;
  }

  public AWSAccountResponseAttributes awsRegions(AWSRegions awsRegions) {
    this.awsRegions = awsRegions;
    this.unparsed |= awsRegions.unparsed;
    return this;
  }

  /**
   * AWS Regions to collect data from. Defaults to <code>include_all</code>.
   *
   * @return awsRegions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AWS_REGIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AWSRegions getAwsRegions() {
    return awsRegions;
  }

  public void setAwsRegions(AWSRegions awsRegions) {
    this.awsRegions = awsRegions;
  }

  /**
   * Timestamp of when the account integration was created.
   *
   * @return createdAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public AWSAccountResponseAttributes logsConfig(AWSLogsConfig logsConfig) {
    this.logsConfig = logsConfig;
    this.unparsed |= logsConfig.unparsed;
    return this;
  }

  /**
   * AWS Logs Collection config.
   *
   * @return logsConfig
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGS_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AWSLogsConfig getLogsConfig() {
    return logsConfig;
  }

  public void setLogsConfig(AWSLogsConfig logsConfig) {
    this.logsConfig = logsConfig;
  }

  public AWSAccountResponseAttributes metricsConfig(AWSMetricsConfig metricsConfig) {
    this.metricsConfig = metricsConfig;
    this.unparsed |= metricsConfig.unparsed;
    return this;
  }

  /**
   * AWS Metrics Collection config.
   *
   * @return metricsConfig
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRICS_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AWSMetricsConfig getMetricsConfig() {
    return metricsConfig;
  }

  public void setMetricsConfig(AWSMetricsConfig metricsConfig) {
    this.metricsConfig = metricsConfig;
  }

  /**
   * Timestamp of when the account integration was updated.
   *
   * @return modifiedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  public AWSAccountResponseAttributes resourcesConfig(AWSResourcesConfig resourcesConfig) {
    this.resourcesConfig = resourcesConfig;
    this.unparsed |= resourcesConfig.unparsed;
    return this;
  }

  /**
   * AWS Resources Collection config.
   *
   * @return resourcesConfig
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESOURCES_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AWSResourcesConfig getResourcesConfig() {
    return resourcesConfig;
  }

  public void setResourcesConfig(AWSResourcesConfig resourcesConfig) {
    this.resourcesConfig = resourcesConfig;
  }

  public AWSAccountResponseAttributes tracesConfig(AWSTracesConfig tracesConfig) {
    this.tracesConfig = tracesConfig;
    this.unparsed |= tracesConfig.unparsed;
    return this;
  }

  /**
   * AWS Traces Collection config.
   *
   * @return tracesConfig
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRACES_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AWSTracesConfig getTracesConfig() {
    return tracesConfig;
  }

  public void setTracesConfig(AWSTracesConfig tracesConfig) {
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
   * @return AWSAccountResponseAttributes
   */
  @JsonAnySetter
  public AWSAccountResponseAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AWSAccountResponseAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AWSAccountResponseAttributes awsAccountResponseAttributes = (AWSAccountResponseAttributes) o;
    return Objects.equals(this.accountTags, awsAccountResponseAttributes.accountTags)
        && Objects.equals(this.authConfig, awsAccountResponseAttributes.authConfig)
        && Objects.equals(this.awsAccountId, awsAccountResponseAttributes.awsAccountId)
        && Objects.equals(this.awsPartition, awsAccountResponseAttributes.awsPartition)
        && Objects.equals(this.awsRegions, awsAccountResponseAttributes.awsRegions)
        && Objects.equals(this.createdAt, awsAccountResponseAttributes.createdAt)
        && Objects.equals(this.logsConfig, awsAccountResponseAttributes.logsConfig)
        && Objects.equals(this.metricsConfig, awsAccountResponseAttributes.metricsConfig)
        && Objects.equals(this.modifiedAt, awsAccountResponseAttributes.modifiedAt)
        && Objects.equals(this.resourcesConfig, awsAccountResponseAttributes.resourcesConfig)
        && Objects.equals(this.tracesConfig, awsAccountResponseAttributes.tracesConfig)
        && Objects.equals(
            this.additionalProperties, awsAccountResponseAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountTags,
        authConfig,
        awsAccountId,
        awsPartition,
        awsRegions,
        createdAt,
        logsConfig,
        metricsConfig,
        modifiedAt,
        resourcesConfig,
        tracesConfig,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AWSAccountResponseAttributes {\n");
    sb.append("    accountTags: ").append(toIndentedString(accountTags)).append("\n");
    sb.append("    authConfig: ").append(toIndentedString(authConfig)).append("\n");
    sb.append("    awsAccountId: ").append(toIndentedString(awsAccountId)).append("\n");
    sb.append("    awsPartition: ").append(toIndentedString(awsPartition)).append("\n");
    sb.append("    awsRegions: ").append(toIndentedString(awsRegions)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    logsConfig: ").append(toIndentedString(logsConfig)).append("\n");
    sb.append("    metricsConfig: ").append(toIndentedString(metricsConfig)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
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
