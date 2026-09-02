/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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
   * <p>Configuration of the schema data to use.</p>
 */
@JsonPropertyOrder({
  LogsSchemaData.JSON_PROPERTY_CLASS_NAME,
  LogsSchemaData.JSON_PROPERTY_CLASS_UID,
  LogsSchemaData.JSON_PROPERTY_PROFILES,
  LogsSchemaData.JSON_PROPERTY_SCHEMA_TYPE,
  LogsSchemaData.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsSchemaData {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CLASS_NAME = "class_name";
  private String className;

  public static final String JSON_PROPERTY_CLASS_UID = "class_uid";
  private Long classUid;

  public static final String JSON_PROPERTY_PROFILES = "profiles";
  private List<String> profiles = null;

  public static final String JSON_PROPERTY_SCHEMA_TYPE = "schema_type";
  private String schemaType;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public LogsSchemaData() {}

  @JsonCreator
  public LogsSchemaData(
            @JsonProperty(required=true, value=JSON_PROPERTY_CLASS_NAME)String className,
            @JsonProperty(required=true, value=JSON_PROPERTY_CLASS_UID)Long classUid,
            @JsonProperty(required=true, value=JSON_PROPERTY_SCHEMA_TYPE)String schemaType,
            @JsonProperty(required=true, value=JSON_PROPERTY_VERSION)String version) {
        this.className = className;
        this.classUid = classUid;
        this.schemaType = schemaType;
        this.version = version;
  }
  public LogsSchemaData className(String className) {
    this.className = className;
    return this;
  }

  /**
   * <p>Class name of the schema to use.</p>
   * @return className
  **/
      @JsonProperty(JSON_PROPERTY_CLASS_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getClassName() {
        return className;
      }
  public void setClassName(String className) {
    this.className = className;
  }
  public LogsSchemaData classUid(Long classUid) {
    this.classUid = classUid;
    return this;
  }

  /**
   * <p>Class UID of the schema to use.</p>
   * @return classUid
  **/
      @JsonProperty(JSON_PROPERTY_CLASS_UID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Long getClassUid() {
        return classUid;
      }
  public void setClassUid(Long classUid) {
    this.classUid = classUid;
  }
  public LogsSchemaData profiles(List<String> profiles) {
    this.profiles = profiles;
    return this;
  }
  public LogsSchemaData addProfilesItem(String profilesItem) {
    if (this.profiles == null) {
      this.profiles = new ArrayList<>();
    }
    this.profiles.add(profilesItem);
    return this;
  }

  /**
   * <p>Optional list of profiles to modify the schema.</p>
   * @return profiles
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PROFILES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getProfiles() {
        return profiles;
      }
  public void setProfiles(List<String> profiles) {
    this.profiles = profiles;
  }
  public LogsSchemaData schemaType(String schemaType) {
    this.schemaType = schemaType;
    return this;
  }

  /**
   * <p>Type of schema to use.</p>
   * @return schemaType
  **/
      @JsonProperty(JSON_PROPERTY_SCHEMA_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getSchemaType() {
        return schemaType;
      }
  public void setSchemaType(String schemaType) {
    this.schemaType = schemaType;
  }
  public LogsSchemaData version(String version) {
    this.version = version;
    return this;
  }

  /**
   * <p>Version of the schema to use.</p>
   * @return version
  **/
      @JsonProperty(JSON_PROPERTY_VERSION)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getVersion() {
        return version;
      }
  public void setVersion(String version) {
    this.version = version;
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
   * @return LogsSchemaData
   */
  @JsonAnySetter
  public LogsSchemaData putAdditionalProperty(String key, Object value) {
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
   * Return true if this LogsSchemaData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsSchemaData logsSchemaData = (LogsSchemaData) o;
    return Objects.equals(this.className, logsSchemaData.className) && Objects.equals(this.classUid, logsSchemaData.classUid) && Objects.equals(this.profiles, logsSchemaData.profiles) && Objects.equals(this.schemaType, logsSchemaData.schemaType) && Objects.equals(this.version, logsSchemaData.version) && Objects.equals(this.additionalProperties, logsSchemaData.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(className,classUid,profiles,schemaType,version, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsSchemaData {\n");
    sb.append("    className: ").append(toIndentedString(className)).append("\n");
    sb.append("    classUid: ").append(toIndentedString(classUid)).append("\n");
    sb.append("    profiles: ").append(toIndentedString(profiles)).append("\n");
    sb.append("    schemaType: ").append(toIndentedString(schemaType)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
