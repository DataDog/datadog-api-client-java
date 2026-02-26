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

/** Details about the On-Call Page you want to create. */
@JsonPropertyOrder({
  CreatePageRequestDataAttributes.JSON_PROPERTY_DESCRIPTION,
  CreatePageRequestDataAttributes.JSON_PROPERTY_TAGS,
  CreatePageRequestDataAttributes.JSON_PROPERTY_TARGET,
  CreatePageRequestDataAttributes.JSON_PROPERTY_TITLE,
  CreatePageRequestDataAttributes.JSON_PROPERTY_URGENCY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CreatePageRequestDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TARGET = "target";
  private CreatePageRequestDataAttributesTarget target;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_URGENCY = "urgency";
  private PageUrgency urgency = PageUrgency.HIGH;

  public CreatePageRequestDataAttributes() {}

  @JsonCreator
  public CreatePageRequestDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_TARGET)
          CreatePageRequestDataAttributesTarget target,
      @JsonProperty(required = true, value = JSON_PROPERTY_TITLE) String title,
      @JsonProperty(required = true, value = JSON_PROPERTY_URGENCY) PageUrgency urgency) {
    this.target = target;
    this.unparsed |= target.unparsed;
    this.title = title;
    this.urgency = urgency;
    this.unparsed |= !urgency.isValid();
  }

  public CreatePageRequestDataAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A short summary of the issue or context.
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

  public CreatePageRequestDataAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public CreatePageRequestDataAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Tags to help categorize or filter the page.
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

  public CreatePageRequestDataAttributes target(CreatePageRequestDataAttributesTarget target) {
    this.target = target;
    this.unparsed |= target.unparsed;
    return this;
  }

  /**
   * Information about the target to notify (such as a team or user).
   *
   * @return target
   */
  @JsonProperty(JSON_PROPERTY_TARGET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CreatePageRequestDataAttributesTarget getTarget() {
    return target;
  }

  public void setTarget(CreatePageRequestDataAttributesTarget target) {
    this.target = target;
  }

  public CreatePageRequestDataAttributes title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of the page.
   *
   * @return title
   */
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public CreatePageRequestDataAttributes urgency(PageUrgency urgency) {
    this.urgency = urgency;
    this.unparsed |= !urgency.isValid();
    return this;
  }

  /**
   * On-Call Page urgency level.
   *
   * @return urgency
   */
  @JsonProperty(JSON_PROPERTY_URGENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public PageUrgency getUrgency() {
    return urgency;
  }

  public void setUrgency(PageUrgency urgency) {
    if (!urgency.isValid()) {
      this.unparsed = true;
    }
    this.urgency = urgency;
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
   * @return CreatePageRequestDataAttributes
   */
  @JsonAnySetter
  public CreatePageRequestDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CreatePageRequestDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePageRequestDataAttributes createPageRequestDataAttributes =
        (CreatePageRequestDataAttributes) o;
    return Objects.equals(this.description, createPageRequestDataAttributes.description)
        && Objects.equals(this.tags, createPageRequestDataAttributes.tags)
        && Objects.equals(this.target, createPageRequestDataAttributes.target)
        && Objects.equals(this.title, createPageRequestDataAttributes.title)
        && Objects.equals(this.urgency, createPageRequestDataAttributes.urgency)
        && Objects.equals(
            this.additionalProperties, createPageRequestDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, tags, target, title, urgency, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePageRequestDataAttributes {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    urgency: ").append(toIndentedString(urgency)).append("\n");
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
