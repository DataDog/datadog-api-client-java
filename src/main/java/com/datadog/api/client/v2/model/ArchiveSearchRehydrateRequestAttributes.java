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

/** Attributes accepted when rehydrating an Archive Search. */
@JsonPropertyOrder({ArchiveSearchRehydrateRequestAttributes.JSON_PROPERTY_REHYDRATION})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ArchiveSearchRehydrateRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_REHYDRATION = "rehydration";
  private ArchiveSearchRehydrateRequestRehydration rehydration;

  public ArchiveSearchRehydrateRequestAttributes() {}

  @JsonCreator
  public ArchiveSearchRehydrateRequestAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_REHYDRATION)
          ArchiveSearchRehydrateRequestRehydration rehydration) {
    this.rehydration = rehydration;
    this.unparsed |= rehydration.unparsed;
  }

  public ArchiveSearchRehydrateRequestAttributes rehydration(
      ArchiveSearchRehydrateRequestRehydration rehydration) {
    this.rehydration = rehydration;
    this.unparsed |= rehydration.unparsed;
    return this;
  }

  /**
   * Rehydration settings to apply.
   *
   * @return rehydration
   */
  @JsonProperty(JSON_PROPERTY_REHYDRATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ArchiveSearchRehydrateRequestRehydration getRehydration() {
    return rehydration;
  }

  public void setRehydration(ArchiveSearchRehydrateRequestRehydration rehydration) {
    this.rehydration = rehydration;
    if (rehydration != null) {
      this.unparsed |= rehydration.unparsed;
    }
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
   * @return ArchiveSearchRehydrateRequestAttributes
   */
  @JsonAnySetter
  public ArchiveSearchRehydrateRequestAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ArchiveSearchRehydrateRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArchiveSearchRehydrateRequestAttributes archiveSearchRehydrateRequestAttributes =
        (ArchiveSearchRehydrateRequestAttributes) o;
    return Objects.equals(this.rehydration, archiveSearchRehydrateRequestAttributes.rehydration)
        && Objects.equals(
            this.additionalProperties,
            archiveSearchRehydrateRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rehydration, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArchiveSearchRehydrateRequestAttributes {\n");
    sb.append("    rehydration: ").append(toIndentedString(rehydration)).append("\n");
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
