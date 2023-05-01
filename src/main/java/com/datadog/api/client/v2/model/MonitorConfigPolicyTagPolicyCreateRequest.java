/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Tag attributes of a monitor configuration policy. */
@JsonPropertyOrder({
  MonitorConfigPolicyTagPolicyCreateRequest.JSON_PROPERTY_TAG_KEY,
  MonitorConfigPolicyTagPolicyCreateRequest.JSON_PROPERTY_TAG_KEY_REQUIRED,
  MonitorConfigPolicyTagPolicyCreateRequest.JSON_PROPERTY_VALID_TAG_VALUES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonitorConfigPolicyTagPolicyCreateRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_TAG_KEY = "tag_key";
  private String tagKey;

  public static final String JSON_PROPERTY_TAG_KEY_REQUIRED = "tag_key_required";
  private Boolean tagKeyRequired;

  public static final String JSON_PROPERTY_VALID_TAG_VALUES = "valid_tag_values";
  private List<String> validTagValues = new ArrayList<>();

  public MonitorConfigPolicyTagPolicyCreateRequest() {}

  @JsonCreator
  public MonitorConfigPolicyTagPolicyCreateRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_TAG_KEY) String tagKey,
      @JsonProperty(required = true, value = JSON_PROPERTY_TAG_KEY_REQUIRED) Boolean tagKeyRequired,
      @JsonProperty(required = true, value = JSON_PROPERTY_VALID_TAG_VALUES)
          List<String> validTagValues) {
    this.tagKey = tagKey;
    this.tagKeyRequired = tagKeyRequired;
    this.validTagValues = validTagValues;
  }

  public MonitorConfigPolicyTagPolicyCreateRequest tagKey(String tagKey) {
    this.tagKey = tagKey;
    return this;
  }

  /**
   * The key of the tag.
   *
   * @return tagKey
   */
  @JsonProperty(JSON_PROPERTY_TAG_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTagKey() {
    return tagKey;
  }

  public void setTagKey(String tagKey) {
    this.tagKey = tagKey;
  }

  public MonitorConfigPolicyTagPolicyCreateRequest tagKeyRequired(Boolean tagKeyRequired) {
    this.tagKeyRequired = tagKeyRequired;
    return this;
  }

  /**
   * If a tag key is required for monitor creation.
   *
   * @return tagKeyRequired
   */
  @JsonProperty(JSON_PROPERTY_TAG_KEY_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getTagKeyRequired() {
    return tagKeyRequired;
  }

  public void setTagKeyRequired(Boolean tagKeyRequired) {
    this.tagKeyRequired = tagKeyRequired;
  }

  public MonitorConfigPolicyTagPolicyCreateRequest validTagValues(List<String> validTagValues) {
    this.validTagValues = validTagValues;
    return this;
  }

  public MonitorConfigPolicyTagPolicyCreateRequest addValidTagValuesItem(
      String validTagValuesItem) {
    this.validTagValues.add(validTagValuesItem);
    return this;
  }

  /**
   * Valid values for the tag.
   *
   * @return validTagValues
   */
  @JsonProperty(JSON_PROPERTY_VALID_TAG_VALUES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getValidTagValues() {
    return validTagValues;
  }

  public void setValidTagValues(List<String> validTagValues) {
    this.validTagValues = validTagValues;
  }

  /** Return true if this MonitorConfigPolicyTagPolicyCreateRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorConfigPolicyTagPolicyCreateRequest monitorConfigPolicyTagPolicyCreateRequest =
        (MonitorConfigPolicyTagPolicyCreateRequest) o;
    return Objects.equals(this.tagKey, monitorConfigPolicyTagPolicyCreateRequest.tagKey)
        && Objects.equals(
            this.tagKeyRequired, monitorConfigPolicyTagPolicyCreateRequest.tagKeyRequired)
        && Objects.equals(
            this.validTagValues, monitorConfigPolicyTagPolicyCreateRequest.validTagValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tagKey, tagKeyRequired, validTagValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorConfigPolicyTagPolicyCreateRequest {\n");
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
