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
   * <p>The AWS Account Integration Config to be updated.</p>
 */
@JsonPropertyOrder({
  AWSAccountUpdateRequestAttributes.JSON_PROPERTY_ACCOUNT_TAGS,
  AWSAccountUpdateRequestAttributes.JSON_PROPERTY_AUTH_CONFIG,
  AWSAccountUpdateRequestAttributes.JSON_PROPERTY_AWS_ACCOUNT_ID,
  AWSAccountUpdateRequestAttributes.JSON_PROPERTY_AWS_PARTITION,
  AWSAccountUpdateRequestAttributes.JSON_PROPERTY_AWS_REGIONS,
  AWSAccountUpdateRequestAttributes.JSON_PROPERTY_LOGS_CONFIG,
  AWSAccountUpdateRequestAttributes.JSON_PROPERTY_METRICS_CONFIG,
  AWSAccountUpdateRequestAttributes.JSON_PROPERTY_RESOURCES_CONFIG,
  AWSAccountUpdateRequestAttributes.JSON_PROPERTY_TRACES_CONFIG
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AWSAccountUpdateRequestAttributes {
  @JsonIgnore
  public boolean unparsed = false;
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

  public static final String JSON_PROPERTY_LOGS_CONFIG = "logs_config";
  private AWSLogsConfig logsConfig;

  public static final String JSON_PROPERTY_METRICS_CONFIG = "metrics_config";
  private AWSMetricsConfig metricsConfig;

  public static final String JSON_PROPERTY_RESOURCES_CONFIG = "resources_config";
  private AWSResourcesConfig resourcesConfig;

  public static final String JSON_PROPERTY_TRACES_CONFIG = "traces_config";
  private AWSTracesConfig tracesConfig;

  public AWSAccountUpdateRequestAttributes() {}

  @JsonCreator
  public AWSAccountUpdateRequestAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_AWS_ACCOUNT_ID)String awsAccountId) {
        this.awsAccountId = awsAccountId;
  }
  public AWSAccountUpdateRequestAttributes accountTags(List<String> accountTags) {
    this.accountTags = JsonNullable.<List<String>>of(accountTags);
    return this;
  }
  public AWSAccountUpdateRequestAttributes addAccountTagsItem(String accountTagsItem) {
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
   * <p>Tags to apply to all hosts and metrics reporting for this account. Defaults to <code>[]</code>.</p>
   * @return accountTags
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public List<String> getAccountTags() {
        return accountTags.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_ACCOUNT_TAGS)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getAccountTags_JsonNullable() {
    return accountTags;
  }
  @JsonProperty(JSON_PROPERTY_ACCOUNT_TAGS)public void setAccountTags_JsonNullable(JsonNullable<List<String>> accountTags) {
    this.accountTags = accountTags;
  }
  public void setAccountTags(List<String> accountTags) {
    this.accountTags = JsonNullable.<List<String>>of(accountTags);
  }
  public AWSAccountUpdateRequestAttributes authConfig(AWSAuthConfig authConfig) {
    this.authConfig = authConfig;
    this.unparsed |= authConfig.unparsed;
    return this;
  }

  /**
   * <p>AWS Authentication config.</p>
   * @return authConfig
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_AUTH_CONFIG)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public AWSAuthConfig getAuthConfig() {
        return authConfig;
      }
  public void setAuthConfig(AWSAuthConfig authConfig) {
    this.authConfig = authConfig;
  }
  public AWSAccountUpdateRequestAttributes awsAccountId(String awsAccountId) {
    this.awsAccountId = awsAccountId;
    return this;
  }

  /**
   * <p>AWS Account ID.</p>
   * @return awsAccountId
  **/
      @JsonProperty(JSON_PROPERTY_AWS_ACCOUNT_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getAwsAccountId() {
        return awsAccountId;
      }
  public void setAwsAccountId(String awsAccountId) {
    this.awsAccountId = awsAccountId;
  }
  public AWSAccountUpdateRequestAttributes awsPartition(AWSAccountPartition awsPartition) {
    this.awsPartition = awsPartition;
    this.unparsed |= !awsPartition.isValid();
    return this;
  }

  /**
   * <p>AWS partition your AWS account is scoped to. Defaults to <code>aws</code>.
   * See <a href="https://docs.aws.amazon.com/whitepapers/latest/aws-fault-isolation-boundaries/partitions.html">Partitions</a>
   * in the AWS documentation for more information.</p>
   * @return awsPartition
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_AWS_PARTITION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public AWSAccountPartition getAwsPartition() {
        return awsPartition;
      }
  public void setAwsPartition(AWSAccountPartition awsPartition) {
    if (!awsPartition.isValid()) {
        this.unparsed = true;
    }
    this.awsPartition = awsPartition;
  }
  public AWSAccountUpdateRequestAttributes awsRegions(AWSRegions awsRegions) {
    this.awsRegions = awsRegions;
    this.unparsed |= awsRegions.unparsed;
    return this;
  }

  /**
   * <p>AWS Regions to collect data from. Defaults to <code>include_all</code>.</p>
   * @return awsRegions
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_AWS_REGIONS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public AWSRegions getAwsRegions() {
        return awsRegions;
      }
  public void setAwsRegions(AWSRegions awsRegions) {
    this.awsRegions = awsRegions;
  }
  public AWSAccountUpdateRequestAttributes logsConfig(AWSLogsConfig logsConfig) {
    this.logsConfig = logsConfig;
    this.unparsed |= logsConfig.unparsed;
    return this;
  }

  /**
   * <p>AWS Logs Collection config.</p>
   * @return logsConfig
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LOGS_CONFIG)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public AWSLogsConfig getLogsConfig() {
        return logsConfig;
      }
  public void setLogsConfig(AWSLogsConfig logsConfig) {
    this.logsConfig = logsConfig;
  }
  public AWSAccountUpdateRequestAttributes metricsConfig(AWSMetricsConfig metricsConfig) {
    this.metricsConfig = metricsConfig;
    this.unparsed |= metricsConfig.unparsed;
    return this;
  }

  /**
   * <p>AWS Metrics Collection config.</p>
   * @return metricsConfig
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_METRICS_CONFIG)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public AWSMetricsConfig getMetricsConfig() {
        return metricsConfig;
      }
  public void setMetricsConfig(AWSMetricsConfig metricsConfig) {
    this.metricsConfig = metricsConfig;
  }
  public AWSAccountUpdateRequestAttributes resourcesConfig(AWSResourcesConfig resourcesConfig) {
    this.resourcesConfig = resourcesConfig;
    this.unparsed |= resourcesConfig.unparsed;
    return this;
  }

  /**
   * <p>AWS Resources Collection config.</p>
   * @return resourcesConfig
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RESOURCES_CONFIG)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public AWSResourcesConfig getResourcesConfig() {
        return resourcesConfig;
      }
  public void setResourcesConfig(AWSResourcesConfig resourcesConfig) {
    this.resourcesConfig = resourcesConfig;
  }
  public AWSAccountUpdateRequestAttributes tracesConfig(AWSTracesConfig tracesConfig) {
    this.tracesConfig = tracesConfig;
    this.unparsed |= tracesConfig.unparsed;
    return this;
  }

  /**
   * <p>AWS Traces Collection config.</p>
   * @return tracesConfig
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TRACES_CONFIG)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public AWSTracesConfig getTracesConfig() {
        return tracesConfig;
      }
  public void setTracesConfig(AWSTracesConfig tracesConfig) {
    this.tracesConfig = tracesConfig;
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
   * @return AWSAccountUpdateRequestAttributes
   */
  @JsonAnySetter
  public AWSAccountUpdateRequestAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this AWSAccountUpdateRequestAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AWSAccountUpdateRequestAttributes awsAccountUpdateRequestAttributes = (AWSAccountUpdateRequestAttributes) o;
    return Objects.equals(this.accountTags, awsAccountUpdateRequestAttributes.accountTags) && Objects.equals(this.authConfig, awsAccountUpdateRequestAttributes.authConfig) && Objects.equals(this.awsAccountId, awsAccountUpdateRequestAttributes.awsAccountId) && Objects.equals(this.awsPartition, awsAccountUpdateRequestAttributes.awsPartition) && Objects.equals(this.awsRegions, awsAccountUpdateRequestAttributes.awsRegions) && Objects.equals(this.logsConfig, awsAccountUpdateRequestAttributes.logsConfig) && Objects.equals(this.metricsConfig, awsAccountUpdateRequestAttributes.metricsConfig) && Objects.equals(this.resourcesConfig, awsAccountUpdateRequestAttributes.resourcesConfig) && Objects.equals(this.tracesConfig, awsAccountUpdateRequestAttributes.tracesConfig) && Objects.equals(this.additionalProperties, awsAccountUpdateRequestAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(accountTags,authConfig,awsAccountId,awsPartition,awsRegions,logsConfig,metricsConfig,resourcesConfig,tracesConfig, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AWSAccountUpdateRequestAttributes {\n");
    sb.append("    accountTags: ").append(toIndentedString(accountTags)).append("\n");
    sb.append("    authConfig: ").append(toIndentedString(authConfig)).append("\n");
    sb.append("    awsAccountId: ").append(toIndentedString(awsAccountId)).append("\n");
    sb.append("    awsPartition: ").append(toIndentedString(awsPartition)).append("\n");
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
