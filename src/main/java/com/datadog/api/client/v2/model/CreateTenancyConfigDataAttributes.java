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

 */
@JsonPropertyOrder({
  CreateTenancyConfigDataAttributes.JSON_PROPERTY_AUTH_CREDENTIALS,
  CreateTenancyConfigDataAttributes.JSON_PROPERTY_CONFIG_VERSION,
  CreateTenancyConfigDataAttributes.JSON_PROPERTY_COST_COLLECTION_ENABLED,
  CreateTenancyConfigDataAttributes.JSON_PROPERTY_DD_COMPARTMENT_ID,
  CreateTenancyConfigDataAttributes.JSON_PROPERTY_DD_STACK_ID,
  CreateTenancyConfigDataAttributes.JSON_PROPERTY_HOME_REGION,
  CreateTenancyConfigDataAttributes.JSON_PROPERTY_LOGS_CONFIG,
  CreateTenancyConfigDataAttributes.JSON_PROPERTY_METRICS_CONFIG,
  CreateTenancyConfigDataAttributes.JSON_PROPERTY_REGIONS_CONFIG,
  CreateTenancyConfigDataAttributes.JSON_PROPERTY_RESOURCE_COLLECTION_ENABLED,
  CreateTenancyConfigDataAttributes.JSON_PROPERTY_USER_OCID
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CreateTenancyConfigDataAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTH_CREDENTIALS = "auth_credentials";
  private CreateTenancyConfigDataAttributesAuthCredentials authCredentials;

  public static final String JSON_PROPERTY_CONFIG_VERSION = "config_version";
  private JsonNullable<Long> configVersion = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_COST_COLLECTION_ENABLED = "cost_collection_enabled";
  private Boolean costCollectionEnabled;

  public static final String JSON_PROPERTY_DD_COMPARTMENT_ID = "dd_compartment_id";
  private String ddCompartmentId;

  public static final String JSON_PROPERTY_DD_STACK_ID = "dd_stack_id";
  private String ddStackId;

  public static final String JSON_PROPERTY_HOME_REGION = "home_region";
  private String homeRegion;

  public static final String JSON_PROPERTY_LOGS_CONFIG = "logs_config";
  private CreateTenancyConfigDataAttributesLogsConfig logsConfig;

  public static final String JSON_PROPERTY_METRICS_CONFIG = "metrics_config";
  private CreateTenancyConfigDataAttributesMetricsConfig metricsConfig;

  public static final String JSON_PROPERTY_REGIONS_CONFIG = "regions_config";
  private CreateTenancyConfigDataAttributesRegionsConfig regionsConfig;

  public static final String JSON_PROPERTY_RESOURCE_COLLECTION_ENABLED = "resource_collection_enabled";
  private Boolean resourceCollectionEnabled;

  public static final String JSON_PROPERTY_USER_OCID = "user_ocid";
  private String userOcid;

  public CreateTenancyConfigDataAttributes() {}

  @JsonCreator
  public CreateTenancyConfigDataAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_AUTH_CREDENTIALS)CreateTenancyConfigDataAttributesAuthCredentials authCredentials,
            @JsonProperty(required=true, value=JSON_PROPERTY_HOME_REGION)String homeRegion,
            @JsonProperty(required=true, value=JSON_PROPERTY_USER_OCID)String userOcid) {
        this.authCredentials = authCredentials;
        this.unparsed |= authCredentials.unparsed;
        this.homeRegion = homeRegion;
        this.userOcid = userOcid;
  }
  public CreateTenancyConfigDataAttributes authCredentials(CreateTenancyConfigDataAttributesAuthCredentials authCredentials) {
    this.authCredentials = authCredentials;
    this.unparsed |= authCredentials.unparsed;
    return this;
  }

  /**
   * <p>GetauthCredentials</p>
   * @return authCredentials
  **/
      @JsonProperty(JSON_PROPERTY_AUTH_CREDENTIALS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public CreateTenancyConfigDataAttributesAuthCredentials getAuthCredentials() {
        return authCredentials;
      }
  public void setAuthCredentials(CreateTenancyConfigDataAttributesAuthCredentials authCredentials) {
    this.authCredentials = authCredentials;
  }
  public CreateTenancyConfigDataAttributes configVersion(Long configVersion) {
    this.configVersion = JsonNullable.<Long>of(configVersion);
    return this;
  }

  /**
   * <p>GetconfigVersion</p>
   * @return configVersion
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public Long getConfigVersion() {
        return configVersion.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_CONFIG_VERSION)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getConfigVersion_JsonNullable() {
    return configVersion;
  }
  @JsonProperty(JSON_PROPERTY_CONFIG_VERSION)public void setConfigVersion_JsonNullable(JsonNullable<Long> configVersion) {
    this.configVersion = configVersion;
  }
  public void setConfigVersion(Long configVersion) {
    this.configVersion = JsonNullable.<Long>of(configVersion);
  }
  public CreateTenancyConfigDataAttributes costCollectionEnabled(Boolean costCollectionEnabled) {
    this.costCollectionEnabled = costCollectionEnabled;
    return this;
  }

  /**
   * <p>GetcostCollectionEnabled</p>
   * @return costCollectionEnabled
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_COST_COLLECTION_ENABLED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getCostCollectionEnabled() {
        return costCollectionEnabled;
      }
  public void setCostCollectionEnabled(Boolean costCollectionEnabled) {
    this.costCollectionEnabled = costCollectionEnabled;
  }
  public CreateTenancyConfigDataAttributes ddCompartmentId(String ddCompartmentId) {
    this.ddCompartmentId = ddCompartmentId;
    return this;
  }

  /**
   * <p>GetddCompartmentId</p>
   * @return ddCompartmentId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DD_COMPARTMENT_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>GetddStackId</p>
   * @return ddStackId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DD_STACK_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>GethomeRegion</p>
   * @return homeRegion
  **/
      @JsonProperty(JSON_PROPERTY_HOME_REGION)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getHomeRegion() {
        return homeRegion;
      }
  public void setHomeRegion(String homeRegion) {
    this.homeRegion = homeRegion;
  }
  public CreateTenancyConfigDataAttributes logsConfig(CreateTenancyConfigDataAttributesLogsConfig logsConfig) {
    this.logsConfig = logsConfig;
    this.unparsed |= logsConfig.unparsed;
    return this;
  }

  /**
   * <p>GetlogsConfig</p>
   * @return logsConfig
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LOGS_CONFIG)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public CreateTenancyConfigDataAttributesLogsConfig getLogsConfig() {
        return logsConfig;
      }
  public void setLogsConfig(CreateTenancyConfigDataAttributesLogsConfig logsConfig) {
    this.logsConfig = logsConfig;
  }
  public CreateTenancyConfigDataAttributes metricsConfig(CreateTenancyConfigDataAttributesMetricsConfig metricsConfig) {
    this.metricsConfig = metricsConfig;
    this.unparsed |= metricsConfig.unparsed;
    return this;
  }

  /**
   * <p>GetmetricsConfig</p>
   * @return metricsConfig
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_METRICS_CONFIG)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public CreateTenancyConfigDataAttributesMetricsConfig getMetricsConfig() {
        return metricsConfig;
      }
  public void setMetricsConfig(CreateTenancyConfigDataAttributesMetricsConfig metricsConfig) {
    this.metricsConfig = metricsConfig;
  }
  public CreateTenancyConfigDataAttributes regionsConfig(CreateTenancyConfigDataAttributesRegionsConfig regionsConfig) {
    this.regionsConfig = regionsConfig;
    this.unparsed |= regionsConfig.unparsed;
    return this;
  }

  /**
   * <p>GetregionsConfig</p>
   * @return regionsConfig
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_REGIONS_CONFIG)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public CreateTenancyConfigDataAttributesRegionsConfig getRegionsConfig() {
        return regionsConfig;
      }
  public void setRegionsConfig(CreateTenancyConfigDataAttributesRegionsConfig regionsConfig) {
    this.regionsConfig = regionsConfig;
  }
  public CreateTenancyConfigDataAttributes resourceCollectionEnabled(Boolean resourceCollectionEnabled) {
    this.resourceCollectionEnabled = resourceCollectionEnabled;
    return this;
  }

  /**
   * <p>GetresourceCollectionEnabled</p>
   * @return resourceCollectionEnabled
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RESOURCE_COLLECTION_ENABLED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>GetuserOcid</p>
   * @return userOcid
  **/
      @JsonProperty(JSON_PROPERTY_USER_OCID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getUserOcid() {
        return userOcid;
      }
  public void setUserOcid(String userOcid) {
    this.userOcid = userOcid;
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

  /**
   * Return true if this CreateTenancyConfigDataAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTenancyConfigDataAttributes createTenancyConfigDataAttributes = (CreateTenancyConfigDataAttributes) o;
    return Objects.equals(this.authCredentials, createTenancyConfigDataAttributes.authCredentials) && Objects.equals(this.configVersion, createTenancyConfigDataAttributes.configVersion) && Objects.equals(this.costCollectionEnabled, createTenancyConfigDataAttributes.costCollectionEnabled) && Objects.equals(this.ddCompartmentId, createTenancyConfigDataAttributes.ddCompartmentId) && Objects.equals(this.ddStackId, createTenancyConfigDataAttributes.ddStackId) && Objects.equals(this.homeRegion, createTenancyConfigDataAttributes.homeRegion) && Objects.equals(this.logsConfig, createTenancyConfigDataAttributes.logsConfig) && Objects.equals(this.metricsConfig, createTenancyConfigDataAttributes.metricsConfig) && Objects.equals(this.regionsConfig, createTenancyConfigDataAttributes.regionsConfig) && Objects.equals(this.resourceCollectionEnabled, createTenancyConfigDataAttributes.resourceCollectionEnabled) && Objects.equals(this.userOcid, createTenancyConfigDataAttributes.userOcid) && Objects.equals(this.additionalProperties, createTenancyConfigDataAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(authCredentials,configVersion,costCollectionEnabled,ddCompartmentId,ddStackId,homeRegion,logsConfig,metricsConfig,regionsConfig,resourceCollectionEnabled,userOcid, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTenancyConfigDataAttributes {\n");
    sb.append("    authCredentials: ").append(toIndentedString(authCredentials)).append("\n");
    sb.append("    configVersion: ").append(toIndentedString(configVersion)).append("\n");
    sb.append("    costCollectionEnabled: ").append(toIndentedString(costCollectionEnabled)).append("\n");
    sb.append("    ddCompartmentId: ").append(toIndentedString(ddCompartmentId)).append("\n");
    sb.append("    ddStackId: ").append(toIndentedString(ddStackId)).append("\n");
    sb.append("    homeRegion: ").append(toIndentedString(homeRegion)).append("\n");
    sb.append("    logsConfig: ").append(toIndentedString(logsConfig)).append("\n");
    sb.append("    metricsConfig: ").append(toIndentedString(metricsConfig)).append("\n");
    sb.append("    regionsConfig: ").append(toIndentedString(regionsConfig)).append("\n");
    sb.append("    resourceCollectionEnabled: ").append(toIndentedString(resourceCollectionEnabled)).append("\n");
    sb.append("    userOcid: ").append(toIndentedString(userOcid)).append("\n");
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
