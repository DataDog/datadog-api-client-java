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

/** Attributes for creating a new static segment. */
@JsonPropertyOrder({
  RumStaticSegmentCreateAttributes.JSON_PROPERTY_DESCRIPTION,
  RumStaticSegmentCreateAttributes.JSON_PROPERTY_JOURNEY_QUERY_OBJECT,
  RumStaticSegmentCreateAttributes.JSON_PROPERTY_NAME,
  RumStaticSegmentCreateAttributes.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RumStaticSegmentCreateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_JOURNEY_QUERY_OBJECT = "journey_query_object";
  private RumStaticSegmentJourneyQueryObject journeyQueryObject;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public RumStaticSegmentCreateAttributes() {}

  @JsonCreator
  public RumStaticSegmentCreateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_DESCRIPTION) String description,
      @JsonProperty(required = true, value = JSON_PROPERTY_JOURNEY_QUERY_OBJECT)
          RumStaticSegmentJourneyQueryObject journeyQueryObject,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.description = description;
    this.journeyQueryObject = journeyQueryObject;
    this.unparsed |= journeyQueryObject.unparsed;
    this.name = name;
  }

  public RumStaticSegmentCreateAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A description of the static segment.
   *
   * @return description
   */
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public RumStaticSegmentCreateAttributes journeyQueryObject(
      RumStaticSegmentJourneyQueryObject journeyQueryObject) {
    this.journeyQueryObject = journeyQueryObject;
    this.unparsed |= journeyQueryObject.unparsed;
    return this;
  }

  /**
   * The journey query object used to compute the static segment user list.
   *
   * @return journeyQueryObject
   */
  @JsonProperty(JSON_PROPERTY_JOURNEY_QUERY_OBJECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RumStaticSegmentJourneyQueryObject getJourneyQueryObject() {
    return journeyQueryObject;
  }

  public void setJourneyQueryObject(RumStaticSegmentJourneyQueryObject journeyQueryObject) {
    this.journeyQueryObject = journeyQueryObject;
  }

  public RumStaticSegmentCreateAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the static segment.
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

  public RumStaticSegmentCreateAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public RumStaticSegmentCreateAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * A list of tags for the static segment.
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
   * @return RumStaticSegmentCreateAttributes
   */
  @JsonAnySetter
  public RumStaticSegmentCreateAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RumStaticSegmentCreateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RumStaticSegmentCreateAttributes rumStaticSegmentCreateAttributes =
        (RumStaticSegmentCreateAttributes) o;
    return Objects.equals(this.description, rumStaticSegmentCreateAttributes.description)
        && Objects.equals(
            this.journeyQueryObject, rumStaticSegmentCreateAttributes.journeyQueryObject)
        && Objects.equals(this.name, rumStaticSegmentCreateAttributes.name)
        && Objects.equals(this.tags, rumStaticSegmentCreateAttributes.tags)
        && Objects.equals(
            this.additionalProperties, rumStaticSegmentCreateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, journeyQueryObject, name, tags, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RumStaticSegmentCreateAttributes {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    journeyQueryObject: ").append(toIndentedString(journeyQueryObject)).append("\n");
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
