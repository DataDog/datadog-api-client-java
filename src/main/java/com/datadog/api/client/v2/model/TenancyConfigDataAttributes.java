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
  TenancyConfigDataAttributes.JSON_PROPERTY_BILLING_PLAN_ID,
  TenancyConfigDataAttributes.JSON_PROPERTY_CONFIG_VERSION,
  TenancyConfigDataAttributes.JSON_PROPERTY_COST_COLLECTION_ENABLED,
  TenancyConfigDataAttributes.JSON_PROPERTY_DD_COMPARTMENT_ID,
  TenancyConfigDataAttributes.JSON_PROPERTY_DD_STACK_ID,
  TenancyConfigDataAttributes.JSON_PROPERTY_HOME_REGION,
  TenancyConfigDataAttributes.JSON_PROPERTY_LOGS_CONFIG,
  TenancyConfigDataAttributes.JSON_PROPERTY_METRICS_CONFIG,
  TenancyConfigDataAttributes.JSON_PROPERTY_PARENT_TENANCY_NAME,
  TenancyConfigDataAttributes.JSON_PROPERTY_REGIONS_CONFIG,
  TenancyConfigDataAttributes.JSON_PROPERTY_RESOURCE_COLLECTION_ENABLED,
  TenancyConfigDataAttributes.JSON_PROPERTY_TENANCY_NAME,
  TenancyConfigDataAttributes.JSON_PROPERTY_USER_OCID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TenancyConfigDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BILLING_PLAN_ID = "billing_plan_id";
  private Integer billingPlanId;

  public static final String JSON_PROPERTY_CONFIG_VERSION = "config_version";
  private Long configVersion;

  public static final String JSON_PROPERTY_COST_COLLECTION_ENABLED = "cost_collection_enabled";
  private Boolean costCollectionEnabled;

  public static final String JSON_PROPERTY_DD_COMPARTMENT_ID = "dd_compartment_id";
  private String ddCompartmentId;

  public static final String JSON_PROPERTY_DD_STACK_ID = "dd_stack_id";
  private String ddStackId;

  public static final String JSON_PROPERTY_HOME_REGION = "home_region";
  private String homeRegion;

  public static final String JSON_PROPERTY_LOGS_CONFIG = "logs_config";
  private TenancyConfigDataAttributesLogsConfig logsConfig;

  public static final String JSON_PROPERTY_METRICS_CONFIG = "metrics_config";
  private TenancyConfigDataAttributesMetricsConfig metricsConfig;

  public static final String JSON_PROPERTY_PARENT_TENANCY_NAME = "parent_tenancy_name";
  private String parentTenancyName;

  public static final String JSON_PROPERTY_REGIONS_CONFIG = "regions_config";
  private TenancyConfigDataAttributesRegionsConfig regionsConfig;

  public static final String JSON_PROPERTY_RESOURCE_COLLECTION_ENABLED =
      "resource_collection_enabled";
  private Boolean resourceCollectionEnabled;

  public static final String JSON_PROPERTY_TENANCY_NAME = "tenancy_name";
  private String tenancyName;

  public static final String JSON_PROPERTY_USER_OCID = "user_ocid";
  private String userOcid;

  public TenancyConfigDataAttributes billingPlanId(Integer billingPlanId) {
    this.billingPlanId = billingPlanId;
    return this;
  }

  /**
   * GetbillingPlanId maximum: 2147483647
   *
   * @return billingPlanId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BILLING_PLAN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getBillingPlanId() {
    return billingPlanId;
  }

  public void setBillingPlanId(Integer billingPlanId) {
    this.billingPlanId = billingPlanId;
  }

  public TenancyConfigDataAttributes configVersion(Long configVersion) {
    this.configVersion = configVersion;
    return this;
  }

  /**
   * GetconfigVersion
   *
   * @return configVersion
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONFIG_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getConfigVersion() {
    return configVersion;
  }

  public void setConfigVersion(Long configVersion) {
    this.configVersion = configVersion;
  }

  public TenancyConfigDataAttributes costCollectionEnabled(Boolean costCollectionEnabled) {
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

  public TenancyConfigDataAttributes ddCompartmentId(String ddCompartmentId) {
    this.ddCompartmentId = ddCompartmentId;
    return this;
  }

  /**
   * GetddCompartmentId
   *
   * @return ddCompartmentId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DD_COMPARTMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDdCompartmentId() {
    return ddCompartmentId;
  }

  public void setDdCompartmentId(String ddCompartmentId) {
    this.ddCompartmentId = ddCompartmentId;
  }

  public TenancyConfigDataAttributes ddStackId(String ddStackId) {
    this.ddStackId = ddStackId;
    return this;
  }

  /**
   * GetddStackId
   *
   * @return ddStackId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DD_STACK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDdStackId() {
    return ddStackId;
  }

  public void setDdStackId(String ddStackId) {
    this.ddStackId = ddStackId;
  }

  public TenancyConfigDataAttributes homeRegion(String homeRegion) {
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

  public TenancyConfigDataAttributes logsConfig(TenancyConfigDataAttributesLogsConfig logsConfig) {
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
  public TenancyConfigDataAttributesLogsConfig getLogsConfig() {
    return logsConfig;
  }

  public void setLogsConfig(TenancyConfigDataAttributesLogsConfig logsConfig) {
    this.logsConfig = logsConfig;
  }

  public TenancyConfigDataAttributes metricsConfig(
      TenancyConfigDataAttributesMetricsConfig metricsConfig) {
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
  public TenancyConfigDataAttributesMetricsConfig getMetricsConfig() {
    return metricsConfig;
  }

  public void setMetricsConfig(TenancyConfigDataAttributesMetricsConfig metricsConfig) {
    this.metricsConfig = metricsConfig;
  }

  public TenancyConfigDataAttributes parentTenancyName(String parentTenancyName) {
    this.parentTenancyName = parentTenancyName;
    return this;
  }

  /**
   * GetparentTenancyName
   *
   * @return parentTenancyName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARENT_TENANCY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getParentTenancyName() {
    return parentTenancyName;
  }

  public void setParentTenancyName(String parentTenancyName) {
    this.parentTenancyName = parentTenancyName;
  }

  public TenancyConfigDataAttributes regionsConfig(
      TenancyConfigDataAttributesRegionsConfig regionsConfig) {
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
  public TenancyConfigDataAttributesRegionsConfig getRegionsConfig() {
    return regionsConfig;
  }

  public void setRegionsConfig(TenancyConfigDataAttributesRegionsConfig regionsConfig) {
    this.regionsConfig = regionsConfig;
  }

  public TenancyConfigDataAttributes resourceCollectionEnabled(Boolean resourceCollectionEnabled) {
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

  public TenancyConfigDataAttributes tenancyName(String tenancyName) {
    this.tenancyName = tenancyName;
    return this;
  }

  /**
   * GettenancyName
   *
   * @return tenancyName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TENANCY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTenancyName() {
    return tenancyName;
  }

  public void setTenancyName(String tenancyName) {
    this.tenancyName = tenancyName;
  }

  public TenancyConfigDataAttributes userOcid(String userOcid) {
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
   * @return TenancyConfigDataAttributes
   */
  @JsonAnySetter
  public TenancyConfigDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TenancyConfigDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TenancyConfigDataAttributes tenancyConfigDataAttributes = (TenancyConfigDataAttributes) o;
    return Objects.equals(this.billingPlanId, tenancyConfigDataAttributes.billingPlanId)
        && Objects.equals(this.configVersion, tenancyConfigDataAttributes.configVersion)
        && Objects.equals(
            this.costCollectionEnabled, tenancyConfigDataAttributes.costCollectionEnabled)
        && Objects.equals(this.ddCompartmentId, tenancyConfigDataAttributes.ddCompartmentId)
        && Objects.equals(this.ddStackId, tenancyConfigDataAttributes.ddStackId)
        && Objects.equals(this.homeRegion, tenancyConfigDataAttributes.homeRegion)
        && Objects.equals(this.logsConfig, tenancyConfigDataAttributes.logsConfig)
        && Objects.equals(this.metricsConfig, tenancyConfigDataAttributes.metricsConfig)
        && Objects.equals(this.parentTenancyName, tenancyConfigDataAttributes.parentTenancyName)
        && Objects.equals(this.regionsConfig, tenancyConfigDataAttributes.regionsConfig)
        && Objects.equals(
            this.resourceCollectionEnabled, tenancyConfigDataAttributes.resourceCollectionEnabled)
        && Objects.equals(this.tenancyName, tenancyConfigDataAttributes.tenancyName)
        && Objects.equals(this.userOcid, tenancyConfigDataAttributes.userOcid)
        && Objects.equals(
            this.additionalProperties, tenancyConfigDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        billingPlanId,
        configVersion,
        costCollectionEnabled,
        ddCompartmentId,
        ddStackId,
        homeRegion,
        logsConfig,
        metricsConfig,
        parentTenancyName,
        regionsConfig,
        resourceCollectionEnabled,
        tenancyName,
        userOcid,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TenancyConfigDataAttributes {\n");
    sb.append("    billingPlanId: ").append(toIndentedString(billingPlanId)).append("\n");
    sb.append("    configVersion: ").append(toIndentedString(configVersion)).append("\n");
    sb.append("    costCollectionEnabled: ")
        .append(toIndentedString(costCollectionEnabled))
        .append("\n");
    sb.append("    ddCompartmentId: ").append(toIndentedString(ddCompartmentId)).append("\n");
    sb.append("    ddStackId: ").append(toIndentedString(ddStackId)).append("\n");
    sb.append("    homeRegion: ").append(toIndentedString(homeRegion)).append("\n");
    sb.append("    logsConfig: ").append(toIndentedString(logsConfig)).append("\n");
    sb.append("    metricsConfig: ").append(toIndentedString(metricsConfig)).append("\n");
    sb.append("    parentTenancyName: ").append(toIndentedString(parentTenancyName)).append("\n");
    sb.append("    regionsConfig: ").append(toIndentedString(regionsConfig)).append("\n");
    sb.append("    resourceCollectionEnabled: ")
        .append(toIndentedString(resourceCollectionEnabled))
        .append("\n");
    sb.append("    tenancyName: ").append(toIndentedString(tenancyName)).append("\n");
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
