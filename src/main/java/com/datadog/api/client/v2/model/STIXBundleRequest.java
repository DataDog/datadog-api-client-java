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
   * <p>A STIX 2.1 bundle containing threat intelligence indicator objects.</p>
 */
@JsonPropertyOrder({
  STIXBundleRequest.JSON_PROPERTY_ID,
  STIXBundleRequest.JSON_PROPERTY_OBJECTS,
  STIXBundleRequest.JSON_PROPERTY_SPEC_VERSION,
  STIXBundleRequest.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class STIXBundleRequest {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_OBJECTS = "objects";
  private List<STIXObject> objects = new ArrayList<>();

  public static final String JSON_PROPERTY_SPEC_VERSION = "spec_version";
  private STIXSpecVersion specVersion;

  public static final String JSON_PROPERTY_TYPE = "type";
  private STIXBundleType type;

  public STIXBundleRequest() {}

  @JsonCreator
  public STIXBundleRequest(
            @JsonProperty(required=true, value=JSON_PROPERTY_ID)String id,
            @JsonProperty(required=true, value=JSON_PROPERTY_OBJECTS)List<STIXObject> objects,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)STIXBundleType type) {
        this.id = id;
        this.objects = objects;
        for (STIXObject item : objects) {
          this.unparsed |= item.unparsed;
        }
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public STIXBundleRequest id(String id) {
    this.id = id;
    return this;
  }

  /**
   * <p>The STIX bundle identifier.</p>
   * @return id
  **/
      @JsonProperty(JSON_PROPERTY_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getId() {
        return id;
      }
  public void setId(String id) {
    this.id = id;
  }
  public STIXBundleRequest objects(List<STIXObject> objects) {
    this.objects = objects;
    for (STIXObject item : objects) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public STIXBundleRequest addObjectsItem(STIXObject objectsItem) {
    this.objects.add(objectsItem);
    this.unparsed |= objectsItem.unparsed;
    return this;
  }

  /**
   * <p>The STIX objects included in the bundle. Indicator objects are processed and ingested; all other STIX object types are ignored and are not included in the response counters.</p>
   * @return objects
  **/
      @JsonProperty(JSON_PROPERTY_OBJECTS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<STIXObject> getObjects() {
        return objects;
      }
  public void setObjects(List<STIXObject> objects) {
    this.objects = objects;
    if (objects != null) {
      for (STIXObject item : objects) {
        this.unparsed |= item.unparsed;
      }
    }
  }
  public STIXBundleRequest specVersion(STIXSpecVersion specVersion) {
    this.specVersion = specVersion;
    this.unparsed |= !specVersion.isValid();
    return this;
  }

  /**
   * <p>The supported STIX specification version.</p>
   * @return specVersion
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SPEC_VERSION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public STIXSpecVersion getSpecVersion() {
        return specVersion;
      }
  public void setSpecVersion(STIXSpecVersion specVersion) {
    if (!specVersion.isValid()) {
        this.unparsed = true;
    }
    this.specVersion = specVersion;
  }
  public STIXBundleRequest type(STIXBundleType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>The STIX object type for a bundle.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public STIXBundleType getType() {
        return type;
      }
  public void setType(STIXBundleType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
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
   * @return STIXBundleRequest
   */
  @JsonAnySetter
  public STIXBundleRequest putAdditionalProperty(String key, Object value) {
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
   * Return true if this STIXBundleRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    STIXBundleRequest stixBundleRequest = (STIXBundleRequest) o;
    return Objects.equals(this.id, stixBundleRequest.id) && Objects.equals(this.objects, stixBundleRequest.objects) && Objects.equals(this.specVersion, stixBundleRequest.specVersion) && Objects.equals(this.type, stixBundleRequest.type) && Objects.equals(this.additionalProperties, stixBundleRequest.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(id,objects,specVersion,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class STIXBundleRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    objects: ").append(toIndentedString(objects)).append("\n");
    sb.append("    specVersion: ").append(toIndentedString(specVersion)).append("\n");
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
