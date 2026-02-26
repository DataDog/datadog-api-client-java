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
   * <p>Detailed information about a single integration.</p>
 */
@JsonPropertyOrder({
  FleetIntegrationDetails.JSON_PROPERTY_DATA_TYPE,
  FleetIntegrationDetails.JSON_PROPERTY_ERROR_MESSAGES,
  FleetIntegrationDetails.JSON_PROPERTY_INIT_CONFIG,
  FleetIntegrationDetails.JSON_PROPERTY_INSTANCE_CONFIG,
  FleetIntegrationDetails.JSON_PROPERTY_IS_CUSTOM_CHECK,
  FleetIntegrationDetails.JSON_PROPERTY_LOG_CONFIG,
  FleetIntegrationDetails.JSON_PROPERTY_NAME,
  FleetIntegrationDetails.JSON_PROPERTY_SOURCE_INDEX,
  FleetIntegrationDetails.JSON_PROPERTY_SOURCE_PATH,
  FleetIntegrationDetails.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FleetIntegrationDetails {
  @JsonIgnore
  public boolean unparsed = false;
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

  public static final String JSON_PROPERTY_LOG_CONFIG = "log_config";
  private String logConfig;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SOURCE_INDEX = "source_index";
  private Long sourceIndex;

  public static final String JSON_PROPERTY_SOURCE_PATH = "source_path";
  private String sourcePath;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public FleetIntegrationDetails dataType(String dataType) {
    this.dataType = dataType;
    return this;
  }

  /**
   * <p>Type of data collected (metrics, logs).</p>
   * @return dataType
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DATA_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getDataType() {
        return dataType;
      }
  public void setDataType(String dataType) {
    this.dataType = dataType;
  }
  public FleetIntegrationDetails errorMessages(List<String> errorMessages) {
    this.errorMessages = errorMessages;
    return this;
  }
  public FleetIntegrationDetails addErrorMessagesItem(String errorMessagesItem) {
    if (this.errorMessages == null) {
      this.errorMessages = new ArrayList<>();
    }
    this.errorMessages.add(errorMessagesItem);
    return this;
  }

  /**
   * <p>Error messages if the integration has issues.</p>
   * @return errorMessages
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ERROR_MESSAGES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getErrorMessages() {
        return errorMessages;
      }
  public void setErrorMessages(List<String> errorMessages) {
    this.errorMessages = errorMessages;
  }
  public FleetIntegrationDetails initConfig(String initConfig) {
    this.initConfig = initConfig;
    return this;
  }

  /**
   * <p>Initialization configuration (YAML format).</p>
   * @return initConfig
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INIT_CONFIG)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getInitConfig() {
        return initConfig;
      }
  public void setInitConfig(String initConfig) {
    this.initConfig = initConfig;
  }
  public FleetIntegrationDetails instanceConfig(String instanceConfig) {
    this.instanceConfig = instanceConfig;
    return this;
  }

  /**
   * <p>Instance-specific configuration (YAML format).</p>
   * @return instanceConfig
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INSTANCE_CONFIG)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getInstanceConfig() {
        return instanceConfig;
      }
  public void setInstanceConfig(String instanceConfig) {
    this.instanceConfig = instanceConfig;
  }
  public FleetIntegrationDetails isCustomCheck(Boolean isCustomCheck) {
    this.isCustomCheck = isCustomCheck;
    return this;
  }

  /**
   * <p>Whether this is a custom integration.</p>
   * @return isCustomCheck
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_IS_CUSTOM_CHECK)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getIsCustomCheck() {
        return isCustomCheck;
      }
  public void setIsCustomCheck(Boolean isCustomCheck) {
    this.isCustomCheck = isCustomCheck;
  }
  public FleetIntegrationDetails logConfig(String logConfig) {
    this.logConfig = logConfig;
    return this;
  }

  /**
   * <p>Log collection configuration (YAML format).</p>
   * @return logConfig
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LOG_CONFIG)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getLogConfig() {
        return logConfig;
      }
  public void setLogConfig(String logConfig) {
    this.logConfig = logConfig;
  }
  public FleetIntegrationDetails name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Name of the integration instance.</p>
   * @return name
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public FleetIntegrationDetails sourceIndex(Long sourceIndex) {
    this.sourceIndex = sourceIndex;
    return this;
  }

  /**
   * <p>Index in the configuration file.</p>
   * @return sourceIndex
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SOURCE_INDEX)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getSourceIndex() {
        return sourceIndex;
      }
  public void setSourceIndex(Long sourceIndex) {
    this.sourceIndex = sourceIndex;
  }
  public FleetIntegrationDetails sourcePath(String sourcePath) {
    this.sourcePath = sourcePath;
    return this;
  }

  /**
   * <p>Path to the configuration file.</p>
   * @return sourcePath
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SOURCE_PATH)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getSourcePath() {
        return sourcePath;
      }
  public void setSourcePath(String sourcePath) {
    this.sourcePath = sourcePath;
  }
  public FleetIntegrationDetails type(String type) {
    this.type = type;
    return this;
  }

  /**
   * <p>Integration type.</p>
   * @return type
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getType() {
        return type;
      }
  public void setType(String type) {
    this.type = type;
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
   * @return FleetIntegrationDetails
   */
  @JsonAnySetter
  public FleetIntegrationDetails putAdditionalProperty(String key, Object value) {
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
   * Return true if this FleetIntegrationDetails object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FleetIntegrationDetails fleetIntegrationDetails = (FleetIntegrationDetails) o;
    return Objects.equals(this.dataType, fleetIntegrationDetails.dataType) && Objects.equals(this.errorMessages, fleetIntegrationDetails.errorMessages) && Objects.equals(this.initConfig, fleetIntegrationDetails.initConfig) && Objects.equals(this.instanceConfig, fleetIntegrationDetails.instanceConfig) && Objects.equals(this.isCustomCheck, fleetIntegrationDetails.isCustomCheck) && Objects.equals(this.logConfig, fleetIntegrationDetails.logConfig) && Objects.equals(this.name, fleetIntegrationDetails.name) && Objects.equals(this.sourceIndex, fleetIntegrationDetails.sourceIndex) && Objects.equals(this.sourcePath, fleetIntegrationDetails.sourcePath) && Objects.equals(this.type, fleetIntegrationDetails.type) && Objects.equals(this.additionalProperties, fleetIntegrationDetails.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(dataType,errorMessages,initConfig,instanceConfig,isCustomCheck,logConfig,name,sourceIndex,sourcePath,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FleetIntegrationDetails {\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    errorMessages: ").append(toIndentedString(errorMessages)).append("\n");
    sb.append("    initConfig: ").append(toIndentedString(initConfig)).append("\n");
    sb.append("    instanceConfig: ").append(toIndentedString(instanceConfig)).append("\n");
    sb.append("    isCustomCheck: ").append(toIndentedString(isCustomCheck)).append("\n");
    sb.append("    logConfig: ").append(toIndentedString(logConfig)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
