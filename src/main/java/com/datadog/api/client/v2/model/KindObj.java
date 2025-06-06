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

/** Schema for kind. */
@JsonPropertyOrder({
  KindObj.JSON_PROPERTY_DESCRIPTION,
  KindObj.JSON_PROPERTY_DISPLAY_NAME,
  KindObj.JSON_PROPERTY_KIND
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class KindObj {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
  private String displayName;

  public static final String JSON_PROPERTY_KIND = "kind";
  private String kind;

  public KindObj() {}

  @JsonCreator
  public KindObj(@JsonProperty(required = true, value = JSON_PROPERTY_KIND) String kind) {
    this.kind = kind;
  }

  public KindObj description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Short description of the kind.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public KindObj displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The display name of the kind. Automatically generated if not provided.
   *
   * @return displayName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public KindObj kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The name of the kind to create or update. This must be in kebab-case format.
   *
   * @return kind
   */
  @JsonProperty(JSON_PROPERTY_KIND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
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
   * @return KindObj
   */
  @JsonAnySetter
  public KindObj putAdditionalProperty(String key, Object value) {
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

  /** Return true if this KindObj object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KindObj kindObj = (KindObj) o;
    return Objects.equals(this.description, kindObj.description)
        && Objects.equals(this.displayName, kindObj.displayName)
        && Objects.equals(this.kind, kindObj.kind)
        && Objects.equals(this.additionalProperties, kindObj.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, displayName, kind, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KindObj {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
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
