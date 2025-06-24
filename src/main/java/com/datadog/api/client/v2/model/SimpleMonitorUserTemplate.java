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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** A simplified version of a monitor user template. */
@JsonPropertyOrder({
  SimpleMonitorUserTemplate.JSON_PROPERTY_CREATED,
  SimpleMonitorUserTemplate.JSON_PROPERTY_DESCRIPTION,
  SimpleMonitorUserTemplate.JSON_PROPERTY_ID,
  SimpleMonitorUserTemplate.JSON_PROPERTY_MONITOR_DEFINITION,
  SimpleMonitorUserTemplate.JSON_PROPERTY_TAGS,
  SimpleMonitorUserTemplate.JSON_PROPERTY_TEMPLATE_VARIABLES,
  SimpleMonitorUserTemplate.JSON_PROPERTY_TITLE,
  SimpleMonitorUserTemplate.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SimpleMonitorUserTemplate {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED = "created";
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_MONITOR_DEFINITION = "monitor_definition";
  private Map<String, Object> monitorDefinition = null;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TEMPLATE_VARIABLES = "template_variables";
  private List<MonitorUserTemplateTemplateVariablesItems> templateVariables = null;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_VERSION = "version";
  private JsonNullable<Long> version = JsonNullable.<Long>undefined();

  /**
   * The created timestamp of the template.
   *
   * @return created
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreated() {
    return created;
  }

  public SimpleMonitorUserTemplate description(String description) {
    this.description = JsonNullable.<String>of(description);
    return this;
  }

  /**
   * A brief description of the monitor user template.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getDescription() {
    return description.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getDescription_JsonNullable() {
    return description;
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  public void setDescription_JsonNullable(JsonNullable<String> description) {
    this.description = description;
  }

  public void setDescription(String description) {
    this.description = JsonNullable.<String>of(description);
  }

  public SimpleMonitorUserTemplate id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier. The initial version will match the template ID.
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SimpleMonitorUserTemplate monitorDefinition(Map<String, Object> monitorDefinition) {
    this.monitorDefinition = monitorDefinition;
    return this;
  }

  public SimpleMonitorUserTemplate putMonitorDefinitionItem(
      String key, Object monitorDefinitionItem) {
    if (this.monitorDefinition == null) {
      this.monitorDefinition = new HashMap<>();
    }
    this.monitorDefinition.put(key, monitorDefinitionItem);
    return this;
  }

  /**
   * A valid monitor definition in the same format as the <a
   * href="https://docs.datadoghq.com/api/latest/monitors/#create-a-monitor">V1 Monitor API</a>.
   *
   * @return monitorDefinition
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MONITOR_DEFINITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getMonitorDefinition() {
    return monitorDefinition;
  }

  public void setMonitorDefinition(Map<String, Object> monitorDefinition) {
    this.monitorDefinition = monitorDefinition;
  }

  public SimpleMonitorUserTemplate tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public SimpleMonitorUserTemplate addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * The definition of <code>MonitorUserTemplateTags</code> object.
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

  public SimpleMonitorUserTemplate templateVariables(
      List<MonitorUserTemplateTemplateVariablesItems> templateVariables) {
    this.templateVariables = templateVariables;
    for (MonitorUserTemplateTemplateVariablesItems item : templateVariables) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SimpleMonitorUserTemplate addTemplateVariablesItem(
      MonitorUserTemplateTemplateVariablesItems templateVariablesItem) {
    if (this.templateVariables == null) {
      this.templateVariables = new ArrayList<>();
    }
    this.templateVariables.add(templateVariablesItem);
    this.unparsed |= templateVariablesItem.unparsed;
    return this;
  }

  /**
   * The definition of <code>MonitorUserTemplateTemplateVariables</code> object.
   *
   * @return templateVariables
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEMPLATE_VARIABLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<MonitorUserTemplateTemplateVariablesItems> getTemplateVariables() {
    return templateVariables;
  }

  public void setTemplateVariables(
      List<MonitorUserTemplateTemplateVariablesItems> templateVariables) {
    this.templateVariables = templateVariables;
  }

  public SimpleMonitorUserTemplate title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of the monitor user template.
   *
   * @return title
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * The version of the monitor user template.
   *
   * @return version
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getVersion() {

    if (version == null) {
      version = JsonNullable.<Long>undefined();
    }
    return version.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getVersion_JsonNullable() {
    return version;
  }

  @JsonProperty(JSON_PROPERTY_VERSION)
  private void setVersion_JsonNullable(JsonNullable<Long> version) {
    this.version = version;
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
   * @return SimpleMonitorUserTemplate
   */
  @JsonAnySetter
  public SimpleMonitorUserTemplate putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SimpleMonitorUserTemplate object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimpleMonitorUserTemplate simpleMonitorUserTemplate = (SimpleMonitorUserTemplate) o;
    return Objects.equals(this.created, simpleMonitorUserTemplate.created)
        && Objects.equals(this.description, simpleMonitorUserTemplate.description)
        && Objects.equals(this.id, simpleMonitorUserTemplate.id)
        && Objects.equals(this.monitorDefinition, simpleMonitorUserTemplate.monitorDefinition)
        && Objects.equals(this.tags, simpleMonitorUserTemplate.tags)
        && Objects.equals(this.templateVariables, simpleMonitorUserTemplate.templateVariables)
        && Objects.equals(this.title, simpleMonitorUserTemplate.title)
        && Objects.equals(this.version, simpleMonitorUserTemplate.version)
        && Objects.equals(
            this.additionalProperties, simpleMonitorUserTemplate.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        created,
        description,
        id,
        monitorDefinition,
        tags,
        templateVariables,
        title,
        version,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleMonitorUserTemplate {\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    monitorDefinition: ").append(toIndentedString(monitorDefinition)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    templateVariables: ").append(toIndentedString(templateVariables)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
