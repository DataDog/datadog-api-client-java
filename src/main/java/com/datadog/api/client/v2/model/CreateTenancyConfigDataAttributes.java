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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** The definition of <code>CreateTenancyConfigDataAttributes</code> object. */
@JsonPropertyOrder({
  CreateTenancyConfigDataAttributes.JSON_PROPERTY_AUTH_CREDENTIALS,
  CreateTenancyConfigDataAttributes.JSON_PROPERTY_CONFIG_VERSION,
  CreateTenancyConfigDataAttributes.JSON_PROPERTY_DD_COMPARTMENT_ID,
  CreateTenancyConfigDataAttributes.JSON_PROPERTY_DD_STACK_ID,
  CreateTenancyConfigDataAttributes.JSON_PROPERTY_HOME_REGION,
  CreateTenancyConfigDataAttributes.JSON_PROPERTY_LOGS_CONFIG,
  CreateTenancyConfigDataAttributes.JSON_PROPERTY_METRICS_CONFIG,
  CreateTenancyConfigDataAttributes.JSON_PROPERTY_REGIONS_CONFIG,
  CreateTenancyConfigDataAttributes.JSON_PROPERTY_RESOURCE_COLLECTION_ENABLED,
  CreateTenancyConfigDataAttributes.JSON_PROPERTY_USER_OCID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CreateTenancyConfigDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTH_CREDENTIALS = "auth_credentials";
  private AuthCredentials authCredentials;

  public static final String JSON_PROPERTY_CONFIG_VERSION = "config_version";
  private Long configVersion;

  public static final String JSON_PROPERTY_DD_COMPARTMENT_ID = "dd_compartment_id";
  private String ddCompartmentId;

  public static final String JSON_PROPERTY_DD_STACK_ID = "dd_stack_id";
  private String ddStackId;

  public static final String JSON_PROPERTY_HOME_REGION = "home_region";
  private String homeRegion;

  public static final String JSON_PROPERTY_LOGS_CONFIG = "logs_config";
  private OCILogsConfig logsConfig;

  public static final String JSON_PROPERTY_METRICS_CONFIG = "metrics_config";
  private OCIMetricsConfig metricsConfig;

  public static final String JSON_PROPERTY_REGIONS_CONFIG = "regions_config";
  private RegionsConfig regionsConfig;

  public static final String JSON_PROPERTY_RESOURCE_COLLECTION_ENABLED =
      "resource_collection_enabled";
  private Boolean resourceCollectionEnabled;

  public static final String JSON_PROPERTY_USER_OCID = "user_ocid";
  private String userOcid;

  public CreateTenancyConfigDataAttributes() {}

  @JsonCreator
  public CreateTenancyConfigDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_AUTH_CREDENTIALS)
          AuthCredentials authCredentials,
      @JsonProperty(required = true, value = JSON_PROPERTY_HOME_REGION) String homeRegion,
      @JsonProperty(required = true, value = JSON_PROPERTY_USER_OCID) String userOcid) {
    this.authCredentials = authCredentials;
    this.unparsed |= authCredentials.unparsed;
    this.homeRegion = homeRegion;
    this.userOcid = userOcid;
  }

  public CreateTenancyConfigDataAttributes authCredentials(AuthCredentials authCredentials) {
    this.authCredentials = authCredentials;
    this.unparsed |= authCredentials.unparsed;
    return this;
  }

  /**
   * The auth credentials of the user. Consists of a public key fingerprint and private key.
   *
   * @return authCredentials
   */
  @JsonProperty(JSON_PROPERTY_AUTH_CREDENTIALS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AuthCredentials getAuthCredentials() {
    return authCredentials;
  }

  public void setAuthCredentials(AuthCredentials authCredentials) {
    this.authCredentials = authCredentials;
  }

  public CreateTenancyConfigDataAttributes configVersion(Long configVersion) {
    this.configVersion = configVersion;
    return this;
  }

  /**
   * The config version. It is not recommended to add or change this value, as it is determined
   * internally.
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

  public CreateTenancyConfigDataAttributes ddCompartmentId(String ddCompartmentId) {
    this.ddCompartmentId = ddCompartmentId;
    return this;
  }

  /**
   * The OCID of the compartment containing Datadog managed resources.
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

  public CreateTenancyConfigDataAttributes ddStackId(String ddStackId) {
    this.ddStackId = ddStackId;
    return this;
  }

  /**
   * The OCID of the resource manager stack for creating Datadog managed resources.
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

  public CreateTenancyConfigDataAttributes homeRegion(String homeRegion) {
    this.homeRegion = homeRegion;
    return this;
  }

  /**
   * The home region of the tenancy to be integrated.
   *
   * @return homeRegion
   */
  @JsonProperty(JSON_PROPERTY_HOME_REGION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getHomeRegion() {
    return homeRegion;
  }

  public void setHomeRegion(String homeRegion) {
    this.homeRegion = homeRegion;
  }

  public CreateTenancyConfigDataAttributes logsConfig(OCILogsConfig logsConfig) {
    this.logsConfig = logsConfig;
    this.unparsed |= logsConfig.unparsed;
    return this;
  }

  /**
   * The definition of <code>OCILogsConfig</code> object.
   *
   * @return logsConfig
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGS_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OCILogsConfig getLogsConfig() {
    return logsConfig;
  }

  public void setLogsConfig(OCILogsConfig logsConfig) {
    this.logsConfig = logsConfig;
  }

  public CreateTenancyConfigDataAttributes metricsConfig(OCIMetricsConfig metricsConfig) {
    this.metricsConfig = metricsConfig;
    this.unparsed |= metricsConfig.unparsed;
    return this;
  }

  /**
   * The definition of <code>OCIMetricsConfig</code> object.
   *
   * @return metricsConfig
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRICS_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OCIMetricsConfig getMetricsConfig() {
    return metricsConfig;
  }

  public void setMetricsConfig(OCIMetricsConfig metricsConfig) {
    this.metricsConfig = metricsConfig;
  }

  public CreateTenancyConfigDataAttributes regionsConfig(RegionsConfig regionsConfig) {
    this.regionsConfig = regionsConfig;
    this.unparsed |= regionsConfig.unparsed;
    return this;
  }

  /**
   * The definition of <code>RegionsConfig</code> object.
   *
   * @return regionsConfig
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REGIONS_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RegionsConfig getRegionsConfig() {
    return regionsConfig;
  }

  public void setRegionsConfig(RegionsConfig regionsConfig) {
    this.regionsConfig = regionsConfig;
  }

  public CreateTenancyConfigDataAttributes resourceCollectionEnabled(
      Boolean resourceCollectionEnabled) {
    this.resourceCollectionEnabled = resourceCollectionEnabled;
    return this;
  }

  /**
   * Enable or disable resource collection.
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

  public CreateTenancyConfigDataAttributes userOcid(String userOcid) {
    this.userOcid = userOcid;
    return this;
  }

  /**
   * The OCID of the user needed to authenticate and collect data.
   *
   * @return userOcid
   */
  @JsonProperty(JSON_PROPERTY_USER_OCID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
   * @return CreateTenancyConfigDataAttributes
   */
  @JsonAnySetter
  public CreateTenancyConfigDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CreateTenancyConfigDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTenancyConfigDataAttributes createTenancyConfigDataAttributes =
        (CreateTenancyConfigDataAttributes) o;
    return Objects.equals(this.authCredentials, createTenancyConfigDataAttributes.authCredentials)
        && Objects.equals(this.configVersion, createTenancyConfigDataAttributes.configVersion)
        && Objects.equals(this.ddCompartmentId, createTenancyConfigDataAttributes.ddCompartmentId)
        && Objects.equals(this.ddStackId, createTenancyConfigDataAttributes.ddStackId)
        && Objects.equals(this.homeRegion, createTenancyConfigDataAttributes.homeRegion)
        && Objects.equals(this.logsConfig, createTenancyConfigDataAttributes.logsConfig)
        && Objects.equals(this.metricsConfig, createTenancyConfigDataAttributes.metricsConfig)
        && Objects.equals(this.regionsConfig, createTenancyConfigDataAttributes.regionsConfig)
        && Objects.equals(
            this.resourceCollectionEnabled,
            createTenancyConfigDataAttributes.resourceCollectionEnabled)
        && Objects.equals(this.userOcid, createTenancyConfigDataAttributes.userOcid)
        && Objects.equals(
            this.additionalProperties, createTenancyConfigDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        authCredentials,
        configVersion,
        ddCompartmentId,
        ddStackId,
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
    sb.append("class CreateTenancyConfigDataAttributes {\n");
    sb.append("    authCredentials: ").append(toIndentedString(authCredentials)).append("\n");
    sb.append("    configVersion: ").append(toIndentedString(configVersion)).append("\n");
    sb.append("    ddCompartmentId: ").append(toIndentedString(ddCompartmentId)).append("\n");
    sb.append("    ddStackId: ").append(toIndentedString(ddStackId)).append("\n");
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
