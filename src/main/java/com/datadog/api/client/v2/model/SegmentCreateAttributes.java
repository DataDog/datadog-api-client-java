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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Attributes of the segment to create. */
@JsonPropertyOrder({
  SegmentCreateAttributes.JSON_PROPERTY_DATA_QUERY,
  SegmentCreateAttributes.JSON_PROPERTY_DESCRIPTION,
  SegmentCreateAttributes.JSON_PROPERTY_NAME,
  SegmentCreateAttributes.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SegmentCreateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA_QUERY = "data_query";
  private SegmentDataQuery dataQuery;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public SegmentCreateAttributes() {}

  @JsonCreator
  public SegmentCreateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_QUERY) SegmentDataQuery dataQuery,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.dataQuery = dataQuery;
    this.unparsed |= dataQuery.unparsed;
    this.name = name;
  }

  public SegmentCreateAttributes dataQuery(SegmentDataQuery dataQuery) {
    this.dataQuery = dataQuery;
    this.unparsed |= dataQuery.unparsed;
    return this;
  }

  /**
   * Defines who belongs to the segment. It contains one or more blocks, up to 20 in total. Use
   * <code>combination</code> to combine named blocks with a boolean formula such as <code>
   * A AND NOT B</code>.
   *
   * @return dataQuery
   */
  @JsonProperty(JSON_PROPERTY_DATA_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SegmentDataQuery getDataQuery() {
    return dataQuery;
  }

  public void setDataQuery(SegmentDataQuery dataQuery) {
    this.dataQuery = dataQuery;
    if (dataQuery != null) {
      this.unparsed |= dataQuery.unparsed;
    }
  }

  public SegmentCreateAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the segment.
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

  public SegmentCreateAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the segment. It must be unique in the organization.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SegmentCreateAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public SegmentCreateAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Tags of the segment. Tags cannot contain commas.
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
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
   * @return SegmentCreateAttributes
   */
  @JsonAnySetter
  public SegmentCreateAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SegmentCreateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SegmentCreateAttributes segmentCreateAttributes = (SegmentCreateAttributes) o;
    return Objects.equals(this.dataQuery, segmentCreateAttributes.dataQuery)
        && Objects.equals(this.description, segmentCreateAttributes.description)
        && Objects.equals(this.name, segmentCreateAttributes.name)
        && Objects.equals(this.tags, segmentCreateAttributes.tags)
        && Objects.equals(this.additionalProperties, segmentCreateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataQuery, description, name, tags, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SegmentCreateAttributes {\n");
    sb.append("    dataQuery: ").append(toIndentedString(dataQuery)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
