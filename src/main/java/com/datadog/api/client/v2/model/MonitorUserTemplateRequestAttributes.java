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
   * <p>Attributes for a monitor user template.</p>
 */
@JsonPropertyOrder({
  MonitorUserTemplateRequestAttributes.JSON_PROPERTY_DESCRIPTION,
  MonitorUserTemplateRequestAttributes.JSON_PROPERTY_MONITOR_DEFINITION,
  MonitorUserTemplateRequestAttributes.JSON_PROPERTY_TAGS,
  MonitorUserTemplateRequestAttributes.JSON_PROPERTY_TEMPLATE_VARIABLES,
  MonitorUserTemplateRequestAttributes.JSON_PROPERTY_TITLE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonitorUserTemplateRequestAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MONITOR_DEFINITION = "monitor_definition";
  private Map<String, Object> monitorDefinition = new HashMap<String, Object>();

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = new ArrayList<>();

  public static final String JSON_PROPERTY_TEMPLATE_VARIABLES = "template_variables";
  private List<MonitorUserTemplateTemplateVariablesItems> templateVariables = null;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public MonitorUserTemplateRequestAttributes() {}

  @JsonCreator
  public MonitorUserTemplateRequestAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_MONITOR_DEFINITION)Map<String, Object> monitorDefinition,
            @JsonProperty(required=true, value=JSON_PROPERTY_TAGS)List<String> tags,
            @JsonProperty(required=true, value=JSON_PROPERTY_TITLE)String title) {
        this.monitorDefinition = monitorDefinition;
        this.tags = tags;
        this.title = title;
  }
  public MonitorUserTemplateRequestAttributes description(String description) {
    this.description = JsonNullable.<String>of(description);
    return this;
  }

  /**
   * <p>A brief description of the monitor user template.</p>
   * @return description
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public String getDescription() {
        return description.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getDescription_JsonNullable() {
    return description;
  }
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)public void setDescription_JsonNullable(JsonNullable<String> description) {
    this.description = description;
  }
  public void setDescription(String description) {
    this.description = JsonNullable.<String>of(description);
  }
  public MonitorUserTemplateRequestAttributes monitorDefinition(Map<String, Object> monitorDefinition) {
    this.monitorDefinition = monitorDefinition;
    return this;
  }
  public MonitorUserTemplateRequestAttributes putMonitorDefinitionItem(String key, Object monitorDefinitionItem) {
    this.monitorDefinition.put(key, monitorDefinitionItem);
    return this;
  }

  /**
   * <p>A valid monitor definition in the same format as the <a href="https://docs.datadoghq.com/api/latest/monitors/#create-a-monitor">V1 Monitor API</a>.</p>
   * @return monitorDefinition
  **/
      @JsonProperty(JSON_PROPERTY_MONITOR_DEFINITION)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Map<String, Object> getMonitorDefinition() {
        return monitorDefinition;
      }
  public void setMonitorDefinition(Map<String, Object> monitorDefinition) {
    this.monitorDefinition = monitorDefinition;
  }
  public MonitorUserTemplateRequestAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }
  public MonitorUserTemplateRequestAttributes addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * <p>The definition of <code>MonitorUserTemplateTags</code> object.</p>
   * @return tags
  **/
      @JsonProperty(JSON_PROPERTY_TAGS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<String> getTags() {
        return tags;
      }
  public void setTags(List<String> tags) {
    this.tags = tags;
  }
  public MonitorUserTemplateRequestAttributes templateVariables(List<MonitorUserTemplateTemplateVariablesItems> templateVariables) {
    this.templateVariables = templateVariables;
    for (MonitorUserTemplateTemplateVariablesItems item : templateVariables) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public MonitorUserTemplateRequestAttributes addTemplateVariablesItem(MonitorUserTemplateTemplateVariablesItems templateVariablesItem) {
    if (this.templateVariables == null) {
      this.templateVariables = new ArrayList<>();
    }
    this.templateVariables.add(templateVariablesItem);
    this.unparsed |= templateVariablesItem.unparsed;
    return this;
  }

  /**
   * <p>The definition of <code>MonitorUserTemplateTemplateVariables</code> object.</p>
   * @return templateVariables
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TEMPLATE_VARIABLES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<MonitorUserTemplateTemplateVariablesItems> getTemplateVariables() {
        return templateVariables;
      }
  public void setTemplateVariables(List<MonitorUserTemplateTemplateVariablesItems> templateVariables) {
    this.templateVariables = templateVariables;
  }
  public MonitorUserTemplateRequestAttributes title(String title) {
    this.title = title;
    return this;
  }

  /**
   * <p>The title of the monitor user template.</p>
   * @return title
  **/
      @JsonProperty(JSON_PROPERTY_TITLE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getTitle() {
        return title;
      }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Return true if this MonitorUserTemplateRequestAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorUserTemplateRequestAttributes monitorUserTemplateRequestAttributes = (MonitorUserTemplateRequestAttributes) o;
    return Objects.equals(this.description, monitorUserTemplateRequestAttributes.description) && Objects.equals(this.monitorDefinition, monitorUserTemplateRequestAttributes.monitorDefinition) && Objects.equals(this.tags, monitorUserTemplateRequestAttributes.tags) && Objects.equals(this.templateVariables, monitorUserTemplateRequestAttributes.templateVariables) && Objects.equals(this.title, monitorUserTemplateRequestAttributes.title);
  }


  @Override
  public int hashCode() {
    return Objects.hash(description,monitorDefinition,tags,templateVariables,title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorUserTemplateRequestAttributes {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    monitorDefinition: ").append(toIndentedString(monitorDefinition)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    templateVariables: ").append(toIndentedString(templateVariables)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
