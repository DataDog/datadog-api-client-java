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
   * <p>Code vulnerability location.</p>
 */
@JsonPropertyOrder({
  CodeLocation.JSON_PROPERTY_FILE_PATH,
  CodeLocation.JSON_PROPERTY_LOCATION,
  CodeLocation.JSON_PROPERTY_METHOD
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CodeLocation {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_FILE_PATH = "file_path";
  private String filePath;

  public static final String JSON_PROPERTY_LOCATION = "location";
  private String location;

  public static final String JSON_PROPERTY_METHOD = "method";
  private String method;

  public CodeLocation() {}

  @JsonCreator
  public CodeLocation(
            @JsonProperty(required=true, value=JSON_PROPERTY_LOCATION)String location) {
        this.location = location;
  }
  public CodeLocation filePath(String filePath) {
    this.filePath = filePath;
    return this;
  }

  /**
   * <p>Vulnerability location file path.</p>
   * @return filePath
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FILE_PATH)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getFilePath() {
        return filePath;
      }
  public void setFilePath(String filePath) {
    this.filePath = filePath;
  }
  public CodeLocation location(String location) {
    this.location = location;
    return this;
  }

  /**
   * <p>Vulnerability extracted location.</p>
   * @return location
  **/
      @JsonProperty(JSON_PROPERTY_LOCATION)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getLocation() {
        return location;
      }
  public void setLocation(String location) {
    this.location = location;
  }
  public CodeLocation method(String method) {
    this.method = method;
    return this;
  }

  /**
   * <p>Vulnerability location method.</p>
   * @return method
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_METHOD)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getMethod() {
        return method;
      }
  public void setMethod(String method) {
    this.method = method;
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
   * @return CodeLocation
   */
  @JsonAnySetter
  public CodeLocation putAdditionalProperty(String key, Object value) {
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
   * Return true if this CodeLocation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CodeLocation codeLocation = (CodeLocation) o;
    return Objects.equals(this.filePath, codeLocation.filePath) && Objects.equals(this.location, codeLocation.location) && Objects.equals(this.method, codeLocation.method) && Objects.equals(this.additionalProperties, codeLocation.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(filePath,location,method, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CodeLocation {\n");
    sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
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
