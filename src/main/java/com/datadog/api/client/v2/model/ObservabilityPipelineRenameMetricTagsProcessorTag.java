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

/** Defines how to rename a tag on metric events. */
@JsonPropertyOrder({
  ObservabilityPipelineRenameMetricTagsProcessorTag.JSON_PROPERTY_RENAME_TO,
  ObservabilityPipelineRenameMetricTagsProcessorTag.JSON_PROPERTY_TAG
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineRenameMetricTagsProcessorTag {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_RENAME_TO = "rename_to";
  private String renameTo;

  public static final String JSON_PROPERTY_TAG = "tag";
  private String tag;

  public ObservabilityPipelineRenameMetricTagsProcessorTag() {}

  @JsonCreator
  public ObservabilityPipelineRenameMetricTagsProcessorTag(
      @JsonProperty(required = true, value = JSON_PROPERTY_RENAME_TO) String renameTo,
      @JsonProperty(required = true, value = JSON_PROPERTY_TAG) String tag) {
    this.renameTo = renameTo;
    this.tag = tag;
  }

  public ObservabilityPipelineRenameMetricTagsProcessorTag renameTo(String renameTo) {
    this.renameTo = renameTo;
    return this;
  }

  /**
   * The new tag key to assign in place of the original.
   *
   * @return renameTo
   */
  @JsonProperty(JSON_PROPERTY_RENAME_TO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getRenameTo() {
    return renameTo;
  }

  public void setRenameTo(String renameTo) {
    this.renameTo = renameTo;
  }

  public ObservabilityPipelineRenameMetricTagsProcessorTag tag(String tag) {
    this.tag = tag;
    return this;
  }

  /**
   * The original tag key on the metric event.
   *
   * @return tag
   */
  @JsonProperty(JSON_PROPERTY_TAG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
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
   * @return ObservabilityPipelineRenameMetricTagsProcessorTag
   */
  @JsonAnySetter
  public ObservabilityPipelineRenameMetricTagsProcessorTag putAdditionalProperty(
      String key, Object value) {
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

  /** Return true if this ObservabilityPipelineRenameMetricTagsProcessorTag object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineRenameMetricTagsProcessorTag
        observabilityPipelineRenameMetricTagsProcessorTag =
            (ObservabilityPipelineRenameMetricTagsProcessorTag) o;
    return Objects.equals(this.renameTo, observabilityPipelineRenameMetricTagsProcessorTag.renameTo)
        && Objects.equals(this.tag, observabilityPipelineRenameMetricTagsProcessorTag.tag)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineRenameMetricTagsProcessorTag.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(renameTo, tag, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineRenameMetricTagsProcessorTag {\n");
    sb.append("    renameTo: ").append(toIndentedString(renameTo)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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
