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

/** */
@JsonPropertyOrder({
  UpdateTenancyConfigDataAttributes.JSON_PROPERTY_AUTH_CREDENTIALS,
  UpdateTenancyConfigDataAttributes.JSON_PROPERTY_COST_COLLECTION_ENABLED,
  UpdateTenancyConfigDataAttributes.JSON_PROPERTY_HOME_REGION,
  UpdateTenancyConfigDataAttributes.JSON_PROPERTY_LOGS_CONFIG,
  UpdateTenancyConfigDataAttributes.JSON_PROPERTY_METRICS_CONFIG,
  UpdateTenancyConfigDataAttributes.JSON_PROPERTY_REGIONS_CONFIG,
  UpdateTenancyConfigDataAttributes.JSON_PROPERTY_RESOURCE_COLLECTION_ENABLED,
  UpdateTenancyConfigDataAttributes.JSON_PROPERTY_USER_OCID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UpdateTenancyConfigDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTH_CREDENTIALS = "auth_credentials";
  private UpdateTenancyConfigDataAttributesAuthCredentials authCredentials;

  public static final String JSON_PROPERTY_COST_COLLECTION_ENABLED = "cost_collection_enabled";
  private Boolean costCollectionEnabled;

  public static final String JSON_PROPERTY_HOME_REGION = "home_region";
  private String homeRegion;

  public static final String JSON_PROPERTY_LOGS_CONFIG = "logs_config";
  private UpdateTenancyConfigDataAttributesLogsConfig logsConfig;

  public static final String JSON_PROPERTY_METRICS_CONFIG = "metrics_config";
  private UpdateTenancyConfigDataAttributesMetricsConfig metricsConfig;

  public static final String JSON_PROPERTY_REGIONS_CONFIG = "regions_config";
  private UpdateTenancyConfigDataAttributesRegionsConfig regionsConfig;

  public static final String JSON_PROPERTY_RESOURCE_COLLECTION_ENABLED =
      "resource_collection_enabled";
  private Boolean resourceCollectionEnabled;

  public static final String JSON_PROPERTY_USER_OCID = "user_ocid";
  private String userOcid;

  public UpdateTenancyConfigDataAttributes authCredentials(
      UpdateTenancyConfigDataAttributesAuthCredentials authCredentials) {
    this.authCredentials = authCredentials;
    this.unparsed |= authCredentials.unparsed;
    return this;
  }

  /**
   * GetauthCredentials
   *
   * @return authCredentials
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTH_CREDENTIALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UpdateTenancyConfigDataAttributesAuthCredentials getAuthCredentials() {
    return authCredentials;
  }

  public void setAuthCredentials(UpdateTenancyConfigDataAttributesAuthCredentials authCredentials) {
    this.authCredentials = authCredentials;
  }

  public UpdateTenancyConfigDataAttributes costCollectionEnabled(Boolean costCollectionEnabled) {
    this.costCollectionEnabled = costCollectionEnabled;
    return this;
  }

  /**
   * GetcostCollectionEnabled
   *
   * @return costCollectionEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COST_COLLECTION_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getCostCollectionEnabled() {
    return costCollectionEnabled;
  }

  public void setCostCollectionEnabled(Boolean costCollectionEnabled) {
    this.costCollectionEnabled = costCollectionEnabled;
  }

  public UpdateTenancyConfigDataAttributes homeRegion(String homeRegion) {
    this.homeRegion = homeRegion;
    return this;
  }

  /**
   * GethomeRegion
   *
   * @return homeRegion
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOME_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getHomeRegion() {
    return homeRegion;
  }

  public void setHomeRegion(String homeRegion) {
    this.homeRegion = homeRegion;
  }

  public UpdateTenancyConfigDataAttributes logsConfig(
      UpdateTenancyConfigDataAttributesLogsConfig logsConfig) {
    this.logsConfig = logsConfig;
    this.unparsed |= logsConfig.unparsed;
    return this;
  }

  /**
   * GetlogsConfig
   *
   * @return logsConfig
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGS_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UpdateTenancyConfigDataAttributesLogsConfig getLogsConfig() {
    return logsConfig;
  }

  public void setLogsConfig(UpdateTenancyConfigDataAttributesLogsConfig logsConfig) {
    this.logsConfig = logsConfig;
  }

  public UpdateTenancyConfigDataAttributes metricsConfig(
      UpdateTenancyConfigDataAttributesMetricsConfig metricsConfig) {
    this.metricsConfig = metricsConfig;
    this.unparsed |= metricsConfig.unparsed;
    return this;
  }

  /**
   * GetmetricsConfig
   *
   * @return metricsConfig
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRICS_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UpdateTenancyConfigDataAttributesMetricsConfig getMetricsConfig() {
    return metricsConfig;
  }

  public void setMetricsConfig(UpdateTenancyConfigDataAttributesMetricsConfig metricsConfig) {
    this.metricsConfig = metricsConfig;
  }

  public UpdateTenancyConfigDataAttributes regionsConfig(
      UpdateTenancyConfigDataAttributesRegionsConfig regionsConfig) {
    this.regionsConfig = regionsConfig;
    this.unparsed |= regionsConfig.unparsed;
    return this;
  }

  /**
   * GetregionsConfig
   *
   * @return regionsConfig
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REGIONS_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UpdateTenancyConfigDataAttributesRegionsConfig getRegionsConfig() {
    return regionsConfig;
  }

  public void setRegionsConfig(UpdateTenancyConfigDataAttributesRegionsConfig regionsConfig) {
    this.regionsConfig = regionsConfig;
  }

  public UpdateTenancyConfigDataAttributes resourceCollectionEnabled(
      Boolean resourceCollectionEnabled) {
    this.resourceCollectionEnabled = resourceCollectionEnabled;
    return this;
  }

  /**
   * GetresourceCollectionEnabled
   *
   * @return resourceCollectionEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESOURCE_COLLECTION_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getResourceCollectionEnabled() {
    return resourceCollectionEnabled;
  }

  public void setResourceCollectionEnabled(Boolean resourceCollectionEnabled) {
    this.resourceCollectionEnabled = resourceCollectionEnabled;
  }

  public UpdateTenancyConfigDataAttributes userOcid(String userOcid) {
    this.userOcid = userOcid;
    return this;
  }

  /**
   * GetuserOcid
   *
   * @return userOcid
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_OCID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUserOcid() {
    return userOcid;
  }

  public void setUserOcid(String userOcid) {
    this.userOcid = userOcid;
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
   * @return UpdateTenancyConfigDataAttributes
   */
  @JsonAnySetter
  public UpdateTenancyConfigDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this UpdateTenancyConfigDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateTenancyConfigDataAttributes updateTenancyConfigDataAttributes =
        (UpdateTenancyConfigDataAttributes) o;
    return Objects.equals(this.authCredentials, updateTenancyConfigDataAttributes.authCredentials)
        && Objects.equals(
            this.costCollectionEnabled, updateTenancyConfigDataAttributes.costCollectionEnabled)
        && Objects.equals(this.homeRegion, updateTenancyConfigDataAttributes.homeRegion)
        && Objects.equals(this.logsConfig, updateTenancyConfigDataAttributes.logsConfig)
        && Objects.equals(this.metricsConfig, updateTenancyConfigDataAttributes.metricsConfig)
        && Objects.equals(this.regionsConfig, updateTenancyConfigDataAttributes.regionsConfig)
        && Objects.equals(
            this.resourceCollectionEnabled,
            updateTenancyConfigDataAttributes.resourceCollectionEnabled)
        && Objects.equals(this.userOcid, updateTenancyConfigDataAttributes.userOcid)
        && Objects.equals(
            this.additionalProperties, updateTenancyConfigDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        authCredentials,
        costCollectionEnabled,
        homeRegion,
        logsConfig,
        metricsConfig,
        regionsConfig,
        resourceCollectionEnabled,
        userOcid,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateTenancyConfigDataAttributes {\n");
    sb.append("    authCredentials: ").append(toIndentedString(authCredentials)).append("\n");
    sb.append("    costCollectionEnabled: ")
        .append(toIndentedString(costCollectionEnabled))
        .append("\n");
    sb.append("    homeRegion: ").append(toIndentedString(homeRegion)).append("\n");
    sb.append("    logsConfig: ").append(toIndentedString(logsConfig)).append("\n");
    sb.append("    metricsConfig: ").append(toIndentedString(metricsConfig)).append("\n");
    sb.append("    regionsConfig: ").append(toIndentedString(regionsConfig)).append("\n");
    sb.append("    resourceCollectionEnabled: ")
        .append(toIndentedString(resourceCollectionEnabled))
        .append("\n");
    sb.append("    userOcid: ").append(toIndentedString(userOcid)).append("\n");
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
