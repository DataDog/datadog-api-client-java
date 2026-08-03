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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Detailed information about a single integration. */
@JsonPropertyOrder({
  FleetIntegrationDetailsV2.JSON_PROPERTY_DATA_TYPE,
  FleetIntegrationDetailsV2.JSON_PROPERTY_ERROR_MESSAGES,
  FleetIntegrationDetailsV2.JSON_PROPERTY_INIT_CONFIG,
  FleetIntegrationDetailsV2.JSON_PROPERTY_INSTANCE_CONFIG,
  FleetIntegrationDetailsV2.JSON_PROPERTY_IS_CUSTOM_CHECK,
  FleetIntegrationDetailsV2.JSON_PROPERTY_IS_DEFAULT,
  FleetIntegrationDetailsV2.JSON_PROPERTY_IS_INIT,
  FleetIntegrationDetailsV2.JSON_PROPERTY_LOG_CONFIG,
  FleetIntegrationDetailsV2.JSON_PROPERTY_NAME,
  FleetIntegrationDetailsV2.JSON_PROPERTY_POD_COUNT,
  FleetIntegrationDetailsV2.JSON_PROPERTY_SOURCE_INDEX,
  FleetIntegrationDetailsV2.JSON_PROPERTY_SOURCE_PATH,
  FleetIntegrationDetailsV2.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FleetIntegrationDetailsV2 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA_TYPE = "data_type";
  private String dataType;

  public static final String JSON_PROPERTY_ERROR_MESSAGES = "error_messages";
  private List<String> errorMessages = null;

  public static final String JSON_PROPERTY_INIT_CONFIG = "init_config";
  private String initConfig;

  public static final String JSON_PROPERTY_INSTANCE_CONFIG = "instance_config";
  private String instanceConfig;

  public static final String JSON_PROPERTY_IS_CUSTOM_CHECK = "is_custom_check";
  private Boolean isCustomCheck;

  public static final String JSON_PROPERTY_IS_DEFAULT = "is_default";
  private Boolean isDefault;

  public static final String JSON_PROPERTY_IS_INIT = "is_init";
  private Boolean isInit;

  public static final String JSON_PROPERTY_LOG_CONFIG = "log_config";
  private String logConfig;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_POD_COUNT = "pod_count";
  private Long podCount;

  public static final String JSON_PROPERTY_SOURCE_INDEX = "source_index";
  private Long sourceIndex;

  public static final String JSON_PROPERTY_SOURCE_PATH = "source_path";
  private String sourcePath;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public FleetIntegrationDetailsV2 dataType(String dataType) {
    this.dataType = dataType;
    return this;
  }

  /**
   * Type of data collected, such as metrics or logs.
   *
   * @return dataType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDataType() {
    return dataType;
  }

  public void setDataType(String dataType) {
    this.dataType = dataType;
  }

  public FleetIntegrationDetailsV2 errorMessages(List<String> errorMessages) {
    this.errorMessages = errorMessages;
    return this;
  }

  public FleetIntegrationDetailsV2 addErrorMessagesItem(String errorMessagesItem) {
    if (this.errorMessages == null) {
      this.errorMessages = new ArrayList<>();
    }
    this.errorMessages.add(errorMessagesItem);
    return this;
  }

  /**
   * Error messages if the integration has issues.
   *
   * @return errorMessages
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_MESSAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getErrorMessages() {
    return errorMessages;
  }

  public void setErrorMessages(List<String> errorMessages) {
    this.errorMessages = errorMessages;
  }

  public FleetIntegrationDetailsV2 initConfig(String initConfig) {
    this.initConfig = initConfig;
    return this;
  }

  /**
   * Initialization configuration (YAML format).
   *
   * @return initConfig
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INIT_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getInitConfig() {
    return initConfig;
  }

  public void setInitConfig(String initConfig) {
    this.initConfig = initConfig;
  }

  public FleetIntegrationDetailsV2 instanceConfig(String instanceConfig) {
    this.instanceConfig = instanceConfig;
    return this;
  }

  /**
   * Instance-specific configuration (YAML format).
   *
   * @return instanceConfig
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INSTANCE_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getInstanceConfig() {
    return instanceConfig;
  }

  public void setInstanceConfig(String instanceConfig) {
    this.instanceConfig = instanceConfig;
  }

  public FleetIntegrationDetailsV2 isCustomCheck(Boolean isCustomCheck) {
    this.isCustomCheck = isCustomCheck;
    return this;
  }

  /**
   * Whether this is a custom integration.
   *
   * @return isCustomCheck
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_CUSTOM_CHECK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsCustomCheck() {
    return isCustomCheck;
  }

  public void setIsCustomCheck(Boolean isCustomCheck) {
    this.isCustomCheck = isCustomCheck;
  }

  public FleetIntegrationDetailsV2 isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  /**
   * Whether this is a default integration instance.
   *
   * @return isDefault
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public FleetIntegrationDetailsV2 isInit(Boolean isInit) {
    this.isInit = isInit;
    return this;
  }

  /**
   * Whether this integration configuration is an init config.
   *
   * @return isInit
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_INIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsInit() {
    return isInit;
  }

  public void setIsInit(Boolean isInit) {
    this.isInit = isInit;
  }

  public FleetIntegrationDetailsV2 logConfig(String logConfig) {
    this.logConfig = logConfig;
    return this;
  }

  /**
   * Log collection configuration (YAML format).
   *
   * @return logConfig
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOG_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLogConfig() {
    return logConfig;
  }

  public void setLogConfig(String logConfig) {
    this.logConfig = logConfig;
  }

  public FleetIntegrationDetailsV2 name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the integration instance.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FleetIntegrationDetailsV2 podCount(Long podCount) {
    this.podCount = podCount;
    return this;
  }

  /**
   * Number of pods running this integration. Absent from the response when the count is zero.
   *
   * @return podCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POD_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getPodCount() {
    return podCount;
  }

  public void setPodCount(Long podCount) {
    this.podCount = podCount;
  }

  public FleetIntegrationDetailsV2 sourceIndex(Long sourceIndex) {
    this.sourceIndex = sourceIndex;
    return this;
  }

  /**
   * Index in the configuration file.
   *
   * @return sourceIndex
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getSourceIndex() {
    return sourceIndex;
  }

  public void setSourceIndex(Long sourceIndex) {
    this.sourceIndex = sourceIndex;
  }

  public FleetIntegrationDetailsV2 sourcePath(String sourcePath) {
    this.sourcePath = sourcePath;
    return this;
  }

  /**
   * Path to the configuration file.
   *
   * @return sourcePath
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSourcePath() {
    return sourcePath;
  }

  public void setSourcePath(String sourcePath) {
    this.sourcePath = sourcePath;
  }

  public FleetIntegrationDetailsV2 type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Integration type.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getType() {
    return type;
  }

  public void setType(String type) {
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
   * @return FleetIntegrationDetailsV2
   */
  @JsonAnySetter
  public FleetIntegrationDetailsV2 putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FleetIntegrationDetailsV2 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FleetIntegrationDetailsV2 fleetIntegrationDetailsV2 = (FleetIntegrationDetailsV2) o;
    return Objects.equals(this.dataType, fleetIntegrationDetailsV2.dataType)
        && Objects.equals(this.errorMessages, fleetIntegrationDetailsV2.errorMessages)
        && Objects.equals(this.initConfig, fleetIntegrationDetailsV2.initConfig)
        && Objects.equals(this.instanceConfig, fleetIntegrationDetailsV2.instanceConfig)
        && Objects.equals(this.isCustomCheck, fleetIntegrationDetailsV2.isCustomCheck)
        && Objects.equals(this.isDefault, fleetIntegrationDetailsV2.isDefault)
        && Objects.equals(this.isInit, fleetIntegrationDetailsV2.isInit)
        && Objects.equals(this.logConfig, fleetIntegrationDetailsV2.logConfig)
        && Objects.equals(this.name, fleetIntegrationDetailsV2.name)
        && Objects.equals(this.podCount, fleetIntegrationDetailsV2.podCount)
        && Objects.equals(this.sourceIndex, fleetIntegrationDetailsV2.sourceIndex)
        && Objects.equals(this.sourcePath, fleetIntegrationDetailsV2.sourcePath)
        && Objects.equals(this.type, fleetIntegrationDetailsV2.type)
        && Objects.equals(
            this.additionalProperties, fleetIntegrationDetailsV2.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        dataType,
        errorMessages,
        initConfig,
        instanceConfig,
        isCustomCheck,
        isDefault,
        isInit,
        logConfig,
        name,
        podCount,
        sourceIndex,
        sourcePath,
        type,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FleetIntegrationDetailsV2 {\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    errorMessages: ").append(toIndentedString(errorMessages)).append("\n");
    sb.append("    initConfig: ").append(toIndentedString(initConfig)).append("\n");
    sb.append("    instanceConfig: ").append(toIndentedString(instanceConfig)).append("\n");
    sb.append("    isCustomCheck: ").append(toIndentedString(isCustomCheck)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    isInit: ").append(toIndentedString(isInit)).append("\n");
    sb.append("    logConfig: ").append(toIndentedString(logConfig)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    podCount: ").append(toIndentedString(podCount)).append("\n");
    sb.append("    sourceIndex: ").append(toIndentedString(sourceIndex)).append("\n");
    sb.append("    sourcePath: ").append(toIndentedString(sourcePath)).append("\n");
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
