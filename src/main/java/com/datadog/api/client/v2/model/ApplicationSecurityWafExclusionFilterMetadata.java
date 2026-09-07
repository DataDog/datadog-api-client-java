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
   * <p>Extra information about the exclusion filter.</p>
 */
@JsonPropertyOrder({
  ApplicationSecurityWafExclusionFilterMetadata.JSON_PROPERTY_ADDED_AT,
  ApplicationSecurityWafExclusionFilterMetadata.JSON_PROPERTY_ADDED_BY,
  ApplicationSecurityWafExclusionFilterMetadata.JSON_PROPERTY_ADDED_BY_NAME,
  ApplicationSecurityWafExclusionFilterMetadata.JSON_PROPERTY_MODIFIED_AT,
  ApplicationSecurityWafExclusionFilterMetadata.JSON_PROPERTY_MODIFIED_BY,
  ApplicationSecurityWafExclusionFilterMetadata.JSON_PROPERTY_MODIFIED_BY_NAME
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ApplicationSecurityWafExclusionFilterMetadata {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ADDED_AT = "added_at";
  private OffsetDateTime addedAt;

  public static final String JSON_PROPERTY_ADDED_BY = "added_by";
  private String addedBy;

  public static final String JSON_PROPERTY_ADDED_BY_NAME = "added_by_name";
  private String addedByName;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_MODIFIED_BY = "modified_by";
  private String modifiedBy;

  public static final String JSON_PROPERTY_MODIFIED_BY_NAME = "modified_by_name";
  private String modifiedByName;

  public ApplicationSecurityWafExclusionFilterMetadata addedAt(OffsetDateTime addedAt) {
    this.addedAt = addedAt;
    return this;
  }

  /**
   * <p>The creation date of the exclusion filter.</p>
   * @return addedAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ADDED_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getAddedAt() {
        return addedAt;
      }
  public void setAddedAt(OffsetDateTime addedAt) {
    this.addedAt = addedAt;
  }
  public ApplicationSecurityWafExclusionFilterMetadata addedBy(String addedBy) {
    this.addedBy = addedBy;
    return this;
  }

  /**
   * <p>The handle of the user who created the exclusion filter.</p>
   * @return addedBy
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ADDED_BY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getAddedBy() {
        return addedBy;
      }
  public void setAddedBy(String addedBy) {
    this.addedBy = addedBy;
  }
  public ApplicationSecurityWafExclusionFilterMetadata addedByName(String addedByName) {
    this.addedByName = addedByName;
    return this;
  }

  /**
   * <p>The name of the user who created the exclusion filter.</p>
   * @return addedByName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ADDED_BY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getAddedByName() {
        return addedByName;
      }
  public void setAddedByName(String addedByName) {
    this.addedByName = addedByName;
  }
  public ApplicationSecurityWafExclusionFilterMetadata modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * <p>The last modification date of the exclusion filter.</p>
   * @return modifiedAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getModifiedAt() {
        return modifiedAt;
      }
  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }
  public ApplicationSecurityWafExclusionFilterMetadata modifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }

  /**
   * <p>The handle of the user who last modified the exclusion filter.</p>
   * @return modifiedBy
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MODIFIED_BY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getModifiedBy() {
        return modifiedBy;
      }
  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }
  public ApplicationSecurityWafExclusionFilterMetadata modifiedByName(String modifiedByName) {
    this.modifiedByName = modifiedByName;
    return this;
  }

  /**
   * <p>The name of the user who last modified the exclusion filter.</p>
   * @return modifiedByName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MODIFIED_BY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getModifiedByName() {
        return modifiedByName;
      }
  public void setModifiedByName(String modifiedByName) {
    this.modifiedByName = modifiedByName;
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
   * @return ApplicationSecurityWafExclusionFilterMetadata
   */
  @JsonAnySetter
  public ApplicationSecurityWafExclusionFilterMetadata putAdditionalProperty(String key, Object value) {
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
   * Return true if this ApplicationSecurityWafExclusionFilterMetadata object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationSecurityWafExclusionFilterMetadata applicationSecurityWafExclusionFilterMetadata = (ApplicationSecurityWafExclusionFilterMetadata) o;
    return Objects.equals(this.addedAt, applicationSecurityWafExclusionFilterMetadata.addedAt) && Objects.equals(this.addedBy, applicationSecurityWafExclusionFilterMetadata.addedBy) && Objects.equals(this.addedByName, applicationSecurityWafExclusionFilterMetadata.addedByName) && Objects.equals(this.modifiedAt, applicationSecurityWafExclusionFilterMetadata.modifiedAt) && Objects.equals(this.modifiedBy, applicationSecurityWafExclusionFilterMetadata.modifiedBy) && Objects.equals(this.modifiedByName, applicationSecurityWafExclusionFilterMetadata.modifiedByName) && Objects.equals(this.additionalProperties, applicationSecurityWafExclusionFilterMetadata.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(addedAt,addedBy,addedByName,modifiedAt,modifiedBy,modifiedByName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationSecurityWafExclusionFilterMetadata {\n");
    sb.append("    addedAt: ").append(toIndentedString(addedAt)).append("\n");
    sb.append("    addedBy: ").append(toIndentedString(addedBy)).append("\n");
    sb.append("    addedByName: ").append(toIndentedString(addedByName)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    modifiedByName: ").append(toIndentedString(modifiedByName)).append("\n");
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
