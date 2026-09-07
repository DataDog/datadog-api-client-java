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
   * <p>Container Image breakdown by supported platform.</p>
 */
@JsonPropertyOrder({
  ContainerImageFlavor.JSON_PROPERTY_BUILT_AT,
  ContainerImageFlavor.JSON_PROPERTY_OS_ARCHITECTURE,
  ContainerImageFlavor.JSON_PROPERTY_OS_NAME,
  ContainerImageFlavor.JSON_PROPERTY_OS_VERSION,
  ContainerImageFlavor.JSON_PROPERTY_SIZE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ContainerImageFlavor {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_BUILT_AT = "built_at";
  private String builtAt;

  public static final String JSON_PROPERTY_OS_ARCHITECTURE = "os_architecture";
  private String osArchitecture;

  public static final String JSON_PROPERTY_OS_NAME = "os_name";
  private String osName;

  public static final String JSON_PROPERTY_OS_VERSION = "os_version";
  private String osVersion;

  public static final String JSON_PROPERTY_SIZE = "size";
  private Long size;

  public ContainerImageFlavor builtAt(String builtAt) {
    this.builtAt = builtAt;
    return this;
  }

  /**
   * <p>Time the platform-specific Container Image was built.</p>
   * @return builtAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_BUILT_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getBuiltAt() {
        return builtAt;
      }
  public void setBuiltAt(String builtAt) {
    this.builtAt = builtAt;
  }
  public ContainerImageFlavor osArchitecture(String osArchitecture) {
    this.osArchitecture = osArchitecture;
    return this;
  }

  /**
   * <p>Operating System architecture supported by the Container Image.</p>
   * @return osArchitecture
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_OS_ARCHITECTURE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getOsArchitecture() {
        return osArchitecture;
      }
  public void setOsArchitecture(String osArchitecture) {
    this.osArchitecture = osArchitecture;
  }
  public ContainerImageFlavor osName(String osName) {
    this.osName = osName;
    return this;
  }

  /**
   * <p>Operating System name supported by the Container Image.</p>
   * @return osName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_OS_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getOsName() {
        return osName;
      }
  public void setOsName(String osName) {
    this.osName = osName;
  }
  public ContainerImageFlavor osVersion(String osVersion) {
    this.osVersion = osVersion;
    return this;
  }

  /**
   * <p>Operating System version supported by the Container Image.</p>
   * @return osVersion
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_OS_VERSION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getOsVersion() {
        return osVersion;
      }
  public void setOsVersion(String osVersion) {
    this.osVersion = osVersion;
  }
  public ContainerImageFlavor size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * <p>Size of the platform-specific Container Image.</p>
   * @return size
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SIZE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getSize() {
        return size;
      }
  public void setSize(Long size) {
    this.size = size;
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
   * @return ContainerImageFlavor
   */
  @JsonAnySetter
  public ContainerImageFlavor putAdditionalProperty(String key, Object value) {
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
   * Return true if this ContainerImageFlavor object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerImageFlavor containerImageFlavor = (ContainerImageFlavor) o;
    return Objects.equals(this.builtAt, containerImageFlavor.builtAt) && Objects.equals(this.osArchitecture, containerImageFlavor.osArchitecture) && Objects.equals(this.osName, containerImageFlavor.osName) && Objects.equals(this.osVersion, containerImageFlavor.osVersion) && Objects.equals(this.size, containerImageFlavor.size) && Objects.equals(this.additionalProperties, containerImageFlavor.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(builtAt,osArchitecture,osName,osVersion,size, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerImageFlavor {\n");
    sb.append("    builtAt: ").append(toIndentedString(builtAt)).append("\n");
    sb.append("    osArchitecture: ").append(toIndentedString(osArchitecture)).append("\n");
    sb.append("    osName: ").append(toIndentedString(osName)).append("\n");
    sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
