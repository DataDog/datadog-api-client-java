/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Tag attributes of a monitor configuration policy. */
@JsonPropertyOrder({
  MonitorConfigPolicyTagPolicy.JSON_PROPERTY_TAG_KEY,
  MonitorConfigPolicyTagPolicy.JSON_PROPERTY_TAG_KEY_REQUIRED,
  MonitorConfigPolicyTagPolicy.JSON_PROPERTY_VALID_TAG_VALUES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonitorConfigPolicyTagPolicy {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_TAG_KEY = "tag_key";
  private String tagKey;

  public static final String JSON_PROPERTY_TAG_KEY_REQUIRED = "tag_key_required";
  private Boolean tagKeyRequired;

  public static final String JSON_PROPERTY_VALID_TAG_VALUES = "valid_tag_values";
  private List<String> validTagValues = null;

  public MonitorConfigPolicyTagPolicy tagKey(String tagKey) {
    this.tagKey = tagKey;
    return this;
  }

  /**
   * The key of the tag.
   *
   * @return tagKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAG_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTagKey() {
    return tagKey;
  }

  public void setTagKey(String tagKey) {
    this.tagKey = tagKey;
  }

  public MonitorConfigPolicyTagPolicy tagKeyRequired(Boolean tagKeyRequired) {
    this.tagKeyRequired = tagKeyRequired;
    return this;
  }

  /**
   * If a tag key is required for monitor creation.
   *
   * @return tagKeyRequired
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAG_KEY_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getTagKeyRequired() {
    return tagKeyRequired;
  }

  public void setTagKeyRequired(Boolean tagKeyRequired) {
    this.tagKeyRequired = tagKeyRequired;
  }

  public MonitorConfigPolicyTagPolicy validTagValues(List<String> validTagValues) {
    this.validTagValues = validTagValues;
    return this;
  }

  public MonitorConfigPolicyTagPolicy addValidTagValuesItem(String validTagValuesItem) {
    if (this.validTagValues == null) {
      this.validTagValues = new ArrayList<>();
    }
    this.validTagValues.add(validTagValuesItem);
    return this;
  }

  /**
   * Valid values for the tag.
   *
   * @return validTagValues
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALID_TAG_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getValidTagValues() {
    return validTagValues;
  }

  public void setValidTagValues(List<String> validTagValues) {
    this.validTagValues = validTagValues;
  }

  /** Return true if this MonitorConfigPolicyTagPolicy object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorConfigPolicyTagPolicy monitorConfigPolicyTagPolicy = (MonitorConfigPolicyTagPolicy) o;
    return Objects.equals(this.tagKey, monitorConfigPolicyTagPolicy.tagKey)
        && Objects.equals(this.tagKeyRequired, monitorConfigPolicyTagPolicy.tagKeyRequired)
        && Objects.equals(this.validTagValues, monitorConfigPolicyTagPolicy.validTagValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tagKey, tagKeyRequired, validTagValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorConfigPolicyTagPolicy {\n");
    sb.append("    tagKey: ").append(toIndentedString(tagKey)).append("\n");
    sb.append("    tagKeyRequired: ").append(toIndentedString(tagKeyRequired)).append("\n");
    sb.append("    validTagValues: ").append(toIndentedString(validTagValues)).append("\n");
    sb.append("}");
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
