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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Only supported for <code>proportional_timeseries</code> and <code>even_timeseries</code> rules.
 * Applies tag key renames and tag value transforms to timeseries input rows after <code>
 * mapping_transform</code>.
 */
@JsonPropertyOrder({
  ArbitraryRuleTagTransforms.JSON_PROPERTY_TAG_KEY_RENAME,
  ArbitraryRuleTagTransforms.JSON_PROPERTY_TAG_VALUE_TRANSFORMS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ArbitraryRuleTagTransforms {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_TAG_KEY_RENAME = "tag_key_rename";
  private Map<String, String> tagKeyRename = null;

  public static final String JSON_PROPERTY_TAG_VALUE_TRANSFORMS = "tag_value_transforms";
  private Map<String, ArbitraryRuleTagValueTransform> tagValueTransforms = null;

  public ArbitraryRuleTagTransforms tagKeyRename(Map<String, String> tagKeyRename) {
    this.tagKeyRename = tagKeyRename;
    return this;
  }

  public ArbitraryRuleTagTransforms putTagKeyRenameItem(String key, String tagKeyRenameItem) {
    if (this.tagKeyRename == null) {
      this.tagKeyRename = new HashMap<>();
    }
    this.tagKeyRename.put(key, tagKeyRenameItem);
    return this;
  }

  /**
   * Map of source tag key to renamed tag key.
   *
   * @return tagKeyRename
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAG_KEY_RENAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getTagKeyRename() {
    return tagKeyRename;
  }

  public void setTagKeyRename(Map<String, String> tagKeyRename) {
    this.tagKeyRename = tagKeyRename;
  }

  public ArbitraryRuleTagTransforms tagValueTransforms(
      Map<String, ArbitraryRuleTagValueTransform> tagValueTransforms) {
    this.tagValueTransforms = tagValueTransforms;
    return this;
  }

  public ArbitraryRuleTagTransforms putTagValueTransformsItem(
      String key, ArbitraryRuleTagValueTransform tagValueTransformsItem) {
    if (this.tagValueTransforms == null) {
      this.tagValueTransforms = new HashMap<>();
    }
    this.tagValueTransforms.put(key, tagValueTransformsItem);
    return this;
  }

  /**
   * Map of tag key to the transform applied to its values.
   *
   * @return tagValueTransforms
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAG_VALUE_TRANSFORMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, ArbitraryRuleTagValueTransform> getTagValueTransforms() {
    return tagValueTransforms;
  }

  public void setTagValueTransforms(
      Map<String, ArbitraryRuleTagValueTransform> tagValueTransforms) {
    this.tagValueTransforms = tagValueTransforms;
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
   * @return ArbitraryRuleTagTransforms
   */
  @JsonAnySetter
  public ArbitraryRuleTagTransforms putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ArbitraryRuleTagTransforms object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArbitraryRuleTagTransforms arbitraryRuleTagTransforms = (ArbitraryRuleTagTransforms) o;
    return Objects.equals(this.tagKeyRename, arbitraryRuleTagTransforms.tagKeyRename)
        && Objects.equals(this.tagValueTransforms, arbitraryRuleTagTransforms.tagValueTransforms)
        && Objects.equals(
            this.additionalProperties, arbitraryRuleTagTransforms.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tagKeyRename, tagValueTransforms, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArbitraryRuleTagTransforms {\n");
    sb.append("    tagKeyRename: ").append(toIndentedString(tagKeyRename)).append("\n");
    sb.append("    tagValueTransforms: ").append(toIndentedString(tagValueTransforms)).append("\n");
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
