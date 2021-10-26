/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.datadog.api.v2.client.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Object containing the definition of a metric&#39;s tags. */
@ApiModel(description = "Object containing the definition of a metric's tags.")
@JsonPropertyOrder({MetricAllTagsAttributes.JSON_PROPERTY_TAGS})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MetricAllTagsAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public MetricAllTagsAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public MetricAllTagsAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * List of indexed tag value pairs.
   *
   * @return tags
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      example = "[\"sport:golf\",\"sport:football\",\"animal:dog\"]",
      value = "List of indexed tag value pairs.")
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  /** Return true if this MetricAllTagsAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricAllTagsAttributes metricAllTagsAttributes = (MetricAllTagsAttributes) o;
    return Objects.equals(this.tags, metricAllTagsAttributes.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricAllTagsAttributes {\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
