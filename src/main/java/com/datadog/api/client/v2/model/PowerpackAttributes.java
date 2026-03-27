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
   * <p>Powerpack attribute object.</p>
 */
@JsonPropertyOrder({
  PowerpackAttributes.JSON_PROPERTY_DESCRIPTION,
  PowerpackAttributes.JSON_PROPERTY_GROUP_WIDGET,
  PowerpackAttributes.JSON_PROPERTY_NAME,
  PowerpackAttributes.JSON_PROPERTY_TAGS,
  PowerpackAttributes.JSON_PROPERTY_TEMPLATE_VARIABLES
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class PowerpackAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_GROUP_WIDGET = "group_widget";
  private PowerpackGroupWidget groupWidget;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TEMPLATE_VARIABLES = "template_variables";
  private List<PowerpackTemplateVariable> templateVariables = null;

  public PowerpackAttributes() {}

  @JsonCreator
  public PowerpackAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_GROUP_WIDGET)PowerpackGroupWidget groupWidget,
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name) {
        this.groupWidget = groupWidget;
        this.unparsed |= groupWidget.unparsed;
        this.name = name;
  }
  public PowerpackAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * <p>Description of this powerpack.</p>
   * @return description
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DESCRIPTION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getDescription() {
        return description;
      }
  public void setDescription(String description) {
    this.description = description;
  }
  public PowerpackAttributes groupWidget(PowerpackGroupWidget groupWidget) {
    this.groupWidget = groupWidget;
    this.unparsed |= groupWidget.unparsed;
    return this;
  }

  /**
   * <p>Powerpack group widget definition object.</p>
   * @return groupWidget
  **/
      @JsonProperty(JSON_PROPERTY_GROUP_WIDGET)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public PowerpackGroupWidget getGroupWidget() {
        return groupWidget;
      }
  public void setGroupWidget(PowerpackGroupWidget groupWidget) {
    this.groupWidget = groupWidget;
  }
  public PowerpackAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Name of the powerpack.</p>
   * @return name
  **/
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public PowerpackAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }
  public PowerpackAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * <p>List of tags to identify this powerpack.</p>
   * @return tags
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TAGS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getTags() {
        return tags;
      }
  public void setTags(List<String> tags) {
    this.tags = tags;
  }
  public PowerpackAttributes templateVariables(List<PowerpackTemplateVariable> templateVariables) {
    this.templateVariables = templateVariables;
    for (PowerpackTemplateVariable item : templateVariables) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public PowerpackAttributes addTemplateVariablesItem(PowerpackTemplateVariable templateVariablesItem) {
    if (this.templateVariables == null) {
      this.templateVariables = new ArrayList<>();
    }
    this.templateVariables.add(templateVariablesItem);
    this.unparsed |= templateVariablesItem.unparsed;
    return this;
  }

  /**
   * <p>List of template variables for this powerpack.</p>
   * @return templateVariables
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TEMPLATE_VARIABLES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<PowerpackTemplateVariable> getTemplateVariables() {
        return templateVariables;
      }
  public void setTemplateVariables(List<PowerpackTemplateVariable> templateVariables) {
    this.templateVariables = templateVariables;
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
   * @return PowerpackAttributes
   */
  @JsonAnySetter
  public PowerpackAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this PowerpackAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PowerpackAttributes powerpackAttributes = (PowerpackAttributes) o;
    return Objects.equals(this.description, powerpackAttributes.description) && Objects.equals(this.groupWidget, powerpackAttributes.groupWidget) && Objects.equals(this.name, powerpackAttributes.name) && Objects.equals(this.tags, powerpackAttributes.tags) && Objects.equals(this.templateVariables, powerpackAttributes.templateVariables) && Objects.equals(this.additionalProperties, powerpackAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(description,groupWidget,name,tags,templateVariables, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PowerpackAttributes {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    groupWidget: ").append(toIndentedString(groupWidget)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    templateVariables: ").append(toIndentedString(templateVariables)).append("\n");
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
