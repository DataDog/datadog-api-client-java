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
   * <p>Configuration information organized by layers.</p>
 */
@JsonPropertyOrder({
  FleetConfigurationLayer.JSON_PROPERTY_COMPILED_CONFIGURATION,
  FleetConfigurationLayer.JSON_PROPERTY_ENV_CONFIGURATION,
  FleetConfigurationLayer.JSON_PROPERTY_FILE_CONFIGURATION,
  FleetConfigurationLayer.JSON_PROPERTY_PARSED_CONFIGURATION,
  FleetConfigurationLayer.JSON_PROPERTY_REMOTE_CONFIGURATION,
  FleetConfigurationLayer.JSON_PROPERTY_RUNTIME_CONFIGURATION
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FleetConfigurationLayer {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPILED_CONFIGURATION = "compiled_configuration";
  private String compiledConfiguration;

  public static final String JSON_PROPERTY_ENV_CONFIGURATION = "env_configuration";
  private String envConfiguration;

  public static final String JSON_PROPERTY_FILE_CONFIGURATION = "file_configuration";
  private String fileConfiguration;

  public static final String JSON_PROPERTY_PARSED_CONFIGURATION = "parsed_configuration";
  private String parsedConfiguration;

  public static final String JSON_PROPERTY_REMOTE_CONFIGURATION = "remote_configuration";
  private String remoteConfiguration;

  public static final String JSON_PROPERTY_RUNTIME_CONFIGURATION = "runtime_configuration";
  private String runtimeConfiguration;

  public FleetConfigurationLayer compiledConfiguration(String compiledConfiguration) {
    this.compiledConfiguration = compiledConfiguration;
    return this;
  }

  /**
   * <p>The final compiled configuration.</p>
   * @return compiledConfiguration
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_COMPILED_CONFIGURATION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getCompiledConfiguration() {
        return compiledConfiguration;
      }
  public void setCompiledConfiguration(String compiledConfiguration) {
    this.compiledConfiguration = compiledConfiguration;
  }
  public FleetConfigurationLayer envConfiguration(String envConfiguration) {
    this.envConfiguration = envConfiguration;
    return this;
  }

  /**
   * <p>Configuration from environment variables.</p>
   * @return envConfiguration
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ENV_CONFIGURATION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getEnvConfiguration() {
        return envConfiguration;
      }
  public void setEnvConfiguration(String envConfiguration) {
    this.envConfiguration = envConfiguration;
  }
  public FleetConfigurationLayer fileConfiguration(String fileConfiguration) {
    this.fileConfiguration = fileConfiguration;
    return this;
  }

  /**
   * <p>Configuration from files.</p>
   * @return fileConfiguration
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FILE_CONFIGURATION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getFileConfiguration() {
        return fileConfiguration;
      }
  public void setFileConfiguration(String fileConfiguration) {
    this.fileConfiguration = fileConfiguration;
  }
  public FleetConfigurationLayer parsedConfiguration(String parsedConfiguration) {
    this.parsedConfiguration = parsedConfiguration;
    return this;
  }

  /**
   * <p>Parsed configuration output.</p>
   * @return parsedConfiguration
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PARSED_CONFIGURATION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getParsedConfiguration() {
        return parsedConfiguration;
      }
  public void setParsedConfiguration(String parsedConfiguration) {
    this.parsedConfiguration = parsedConfiguration;
  }
  public FleetConfigurationLayer remoteConfiguration(String remoteConfiguration) {
    this.remoteConfiguration = remoteConfiguration;
    return this;
  }

  /**
   * <p>Remote configuration settings.</p>
   * @return remoteConfiguration
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_REMOTE_CONFIGURATION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getRemoteConfiguration() {
        return remoteConfiguration;
      }
  public void setRemoteConfiguration(String remoteConfiguration) {
    this.remoteConfiguration = remoteConfiguration;
  }
  public FleetConfigurationLayer runtimeConfiguration(String runtimeConfiguration) {
    this.runtimeConfiguration = runtimeConfiguration;
    return this;
  }

  /**
   * <p>Runtime configuration.</p>
   * @return runtimeConfiguration
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RUNTIME_CONFIGURATION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getRuntimeConfiguration() {
        return runtimeConfiguration;
      }
  public void setRuntimeConfiguration(String runtimeConfiguration) {
    this.runtimeConfiguration = runtimeConfiguration;
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
   * @return FleetConfigurationLayer
   */
  @JsonAnySetter
  public FleetConfigurationLayer putAdditionalProperty(String key, Object value) {
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
   * Return true if this FleetConfigurationLayer object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FleetConfigurationLayer fleetConfigurationLayer = (FleetConfigurationLayer) o;
    return Objects.equals(this.compiledConfiguration, fleetConfigurationLayer.compiledConfiguration) && Objects.equals(this.envConfiguration, fleetConfigurationLayer.envConfiguration) && Objects.equals(this.fileConfiguration, fleetConfigurationLayer.fileConfiguration) && Objects.equals(this.parsedConfiguration, fleetConfigurationLayer.parsedConfiguration) && Objects.equals(this.remoteConfiguration, fleetConfigurationLayer.remoteConfiguration) && Objects.equals(this.runtimeConfiguration, fleetConfigurationLayer.runtimeConfiguration) && Objects.equals(this.additionalProperties, fleetConfigurationLayer.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(compiledConfiguration,envConfiguration,fileConfiguration,parsedConfiguration,remoteConfiguration,runtimeConfiguration, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FleetConfigurationLayer {\n");
    sb.append("    compiledConfiguration: ").append(toIndentedString(compiledConfiguration)).append("\n");
    sb.append("    envConfiguration: ").append(toIndentedString(envConfiguration)).append("\n");
    sb.append("    fileConfiguration: ").append(toIndentedString(fileConfiguration)).append("\n");
    sb.append("    parsedConfiguration: ").append(toIndentedString(parsedConfiguration)).append("\n");
    sb.append("    remoteConfiguration: ").append(toIndentedString(remoteConfiguration)).append("\n");
    sb.append("    runtimeConfiguration: ").append(toIndentedString(runtimeConfiguration)).append("\n");
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
