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
   * <p>The source code location where a dependency is declared, including block, name, namespace, and version positions within the file.</p>
 */
@JsonPropertyOrder({
  ScaRequestDataAttributesDependenciesItemsLocationsItems.JSON_PROPERTY_BLOCK,
  ScaRequestDataAttributesDependenciesItemsLocationsItems.JSON_PROPERTY_NAME,
  ScaRequestDataAttributesDependenciesItemsLocationsItems.JSON_PROPERTY_NAMESPACE,
  ScaRequestDataAttributesDependenciesItemsLocationsItems.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ScaRequestDataAttributesDependenciesItemsLocationsItems {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_BLOCK = "block";
  private ScaRequestDataAttributesDependenciesItemsLocationsItemsFilePosition block;

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<ScaRequestDataAttributesDependenciesItemsLocationsItemsNullableFilePosition> name = JsonNullable.<ScaRequestDataAttributesDependenciesItemsLocationsItemsNullableFilePosition>undefined();

  public static final String JSON_PROPERTY_NAMESPACE = "namespace";
  private JsonNullable<ScaRequestDataAttributesDependenciesItemsLocationsItemsNullableFilePosition> namespace = JsonNullable.<ScaRequestDataAttributesDependenciesItemsLocationsItemsNullableFilePosition>undefined();

  public static final String JSON_PROPERTY_VERSION = "version";
  private JsonNullable<ScaRequestDataAttributesDependenciesItemsLocationsItemsNullableFilePosition> version = JsonNullable.<ScaRequestDataAttributesDependenciesItemsLocationsItemsNullableFilePosition>undefined();

  public ScaRequestDataAttributesDependenciesItemsLocationsItems block(ScaRequestDataAttributesDependenciesItemsLocationsItemsFilePosition block) {
    this.block = block;
    this.unparsed |= block.unparsed;
    return this;
  }

  /**
   * <p>A range within a file defined by a start and end position, along with the file name.</p>
   * @return block
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_BLOCK)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ScaRequestDataAttributesDependenciesItemsLocationsItemsFilePosition getBlock() {
        return block;
      }
  public void setBlock(ScaRequestDataAttributesDependenciesItemsLocationsItemsFilePosition block) {
    this.block = block;
    if (block != null) {
      this.unparsed |= block.unparsed;
    }
  }
  public ScaRequestDataAttributesDependenciesItemsLocationsItems name(ScaRequestDataAttributesDependenciesItemsLocationsItemsNullableFilePosition name) {
    this.name = JsonNullable.<ScaRequestDataAttributesDependenciesItemsLocationsItemsNullableFilePosition>of(name);
    return this;
  }

  /**
   * <p>A nullable range within a file defined by a start and end position, along with the file name.</p>
   * @return name
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public ScaRequestDataAttributesDependenciesItemsLocationsItemsNullableFilePosition getName() {
        return name.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<ScaRequestDataAttributesDependenciesItemsLocationsItemsNullableFilePosition> getName_JsonNullable() {
    return name;
  }
  @JsonProperty(JSON_PROPERTY_NAME)public void setName_JsonNullable(JsonNullable<ScaRequestDataAttributesDependenciesItemsLocationsItemsNullableFilePosition> name) {
    this.name = name;
  }
  public void setName(ScaRequestDataAttributesDependenciesItemsLocationsItemsNullableFilePosition name) {
    this.name = JsonNullable.<ScaRequestDataAttributesDependenciesItemsLocationsItemsNullableFilePosition>of(name);
  }
  public ScaRequestDataAttributesDependenciesItemsLocationsItems namespace(ScaRequestDataAttributesDependenciesItemsLocationsItemsNullableFilePosition namespace) {
    this.namespace = JsonNullable.<ScaRequestDataAttributesDependenciesItemsLocationsItemsNullableFilePosition>of(namespace);
    return this;
  }

  /**
   * <p>A nullable range within a file defined by a start and end position, along with the file name.</p>
   * @return namespace
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public ScaRequestDataAttributesDependenciesItemsLocationsItemsNullableFilePosition getNamespace() {
        return namespace.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_NAMESPACE)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<ScaRequestDataAttributesDependenciesItemsLocationsItemsNullableFilePosition> getNamespace_JsonNullable() {
    return namespace;
  }
  @JsonProperty(JSON_PROPERTY_NAMESPACE)public void setNamespace_JsonNullable(JsonNullable<ScaRequestDataAttributesDependenciesItemsLocationsItemsNullableFilePosition> namespace) {
    this.namespace = namespace;
  }
  public void setNamespace(ScaRequestDataAttributesDependenciesItemsLocationsItemsNullableFilePosition namespace) {
    this.namespace = JsonNullable.<ScaRequestDataAttributesDependenciesItemsLocationsItemsNullableFilePosition>of(namespace);
  }
  public ScaRequestDataAttributesDependenciesItemsLocationsItems version(ScaRequestDataAttributesDependenciesItemsLocationsItemsNullableFilePosition version) {
    this.version = JsonNullable.<ScaRequestDataAttributesDependenciesItemsLocationsItemsNullableFilePosition>of(version);
    return this;
  }

  /**
   * <p>A nullable range within a file defined by a start and end position, along with the file name.</p>
   * @return version
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public ScaRequestDataAttributesDependenciesItemsLocationsItemsNullableFilePosition getVersion() {
        return version.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<ScaRequestDataAttributesDependenciesItemsLocationsItemsNullableFilePosition> getVersion_JsonNullable() {
    return version;
  }
  @JsonProperty(JSON_PROPERTY_VERSION)public void setVersion_JsonNullable(JsonNullable<ScaRequestDataAttributesDependenciesItemsLocationsItemsNullableFilePosition> version) {
    this.version = version;
  }
  public void setVersion(ScaRequestDataAttributesDependenciesItemsLocationsItemsNullableFilePosition version) {
    this.version = JsonNullable.<ScaRequestDataAttributesDependenciesItemsLocationsItemsNullableFilePosition>of(version);
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
   * @return ScaRequestDataAttributesDependenciesItemsLocationsItems
   */
  @JsonAnySetter
  public ScaRequestDataAttributesDependenciesItemsLocationsItems putAdditionalProperty(String key, Object value) {
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
   * Return true if this ScaRequestDataAttributesDependenciesItemsLocationsItems object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScaRequestDataAttributesDependenciesItemsLocationsItems scaRequestDataAttributesDependenciesItemsLocationsItems = (ScaRequestDataAttributesDependenciesItemsLocationsItems) o;
    return Objects.equals(this.block, scaRequestDataAttributesDependenciesItemsLocationsItems.block) && Objects.equals(this.name, scaRequestDataAttributesDependenciesItemsLocationsItems.name) && Objects.equals(this.namespace, scaRequestDataAttributesDependenciesItemsLocationsItems.namespace) && Objects.equals(this.version, scaRequestDataAttributesDependenciesItemsLocationsItems.version) && Objects.equals(this.additionalProperties, scaRequestDataAttributesDependenciesItemsLocationsItems.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(block,name,namespace,version, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScaRequestDataAttributesDependenciesItemsLocationsItems {\n");
    sb.append("    block: ").append(toIndentedString(block)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
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
