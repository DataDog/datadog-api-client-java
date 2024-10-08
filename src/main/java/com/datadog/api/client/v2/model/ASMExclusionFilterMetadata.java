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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Metadata about the exclusion filter. */
@JsonPropertyOrder({
  ASMExclusionFilterMetadata.JSON_PROPERTY_ADDED_AT,
  ASMExclusionFilterMetadata.JSON_PROPERTY_ADDED_BY,
  ASMExclusionFilterMetadata.JSON_PROPERTY_MODIFIED_AT,
  ASMExclusionFilterMetadata.JSON_PROPERTY_MODIFIED_BY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ASMExclusionFilterMetadata {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ADDED_AT = "added_at";
  private OffsetDateTime addedAt;

  public static final String JSON_PROPERTY_ADDED_BY = "added_by";
  private String addedBy;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_MODIFIED_BY = "modified_by";
  private String modifiedBy;

  public ASMExclusionFilterMetadata addedAt(OffsetDateTime addedAt) {
    this.addedAt = addedAt;
    return this;
  }

  /**
   * The timestamp when the exclusion filter was added.
   *
   * @return addedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getAddedAt() {
    return addedAt;
  }

  public void setAddedAt(OffsetDateTime addedAt) {
    this.addedAt = addedAt;
  }

  public ASMExclusionFilterMetadata addedBy(String addedBy) {
    this.addedBy = addedBy;
    return this;
  }

  /**
   * The email address of the user who added the exclusion filter.
   *
   * @return addedBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAddedBy() {
    return addedBy;
  }

  public void setAddedBy(String addedBy) {
    this.addedBy = addedBy;
  }

  public ASMExclusionFilterMetadata modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * The timestamp when the exclusion filter was last modified.
   *
   * @return modifiedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public ASMExclusionFilterMetadata modifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }

  /**
   * The email address of the user who last modified the exclusion filter.
   *
   * @return modifiedBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getModifiedBy() {
    return modifiedBy;
  }

  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
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
   * @return ASMExclusionFilterMetadata
   */
  @JsonAnySetter
  public ASMExclusionFilterMetadata putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ASMExclusionFilterMetadata object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ASMExclusionFilterMetadata asmExclusionFilterMetadata = (ASMExclusionFilterMetadata) o;
    return Objects.equals(this.addedAt, asmExclusionFilterMetadata.addedAt)
        && Objects.equals(this.addedBy, asmExclusionFilterMetadata.addedBy)
        && Objects.equals(this.modifiedAt, asmExclusionFilterMetadata.modifiedAt)
        && Objects.equals(this.modifiedBy, asmExclusionFilterMetadata.modifiedBy)
        && Objects.equals(
            this.additionalProperties, asmExclusionFilterMetadata.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addedAt, addedBy, modifiedAt, modifiedBy, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ASMExclusionFilterMetadata {\n");
    sb.append("    addedAt: ").append(toIndentedString(addedAt)).append("\n");
    sb.append("    addedBy: ").append(toIndentedString(addedBy)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
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
