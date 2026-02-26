/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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
   * <p>Run workflow is widget that allows you to run a workflow from a dashboard.</p>
 */
@JsonPropertyOrder({
  RunWorkflowWidgetDefinition.JSON_PROPERTY_CUSTOM_LINKS,
  RunWorkflowWidgetDefinition.JSON_PROPERTY_INPUTS,
  RunWorkflowWidgetDefinition.JSON_PROPERTY_TIME,
  RunWorkflowWidgetDefinition.JSON_PROPERTY_TITLE,
  RunWorkflowWidgetDefinition.JSON_PROPERTY_TITLE_ALIGN,
  RunWorkflowWidgetDefinition.JSON_PROPERTY_TITLE_SIZE,
  RunWorkflowWidgetDefinition.JSON_PROPERTY_TYPE,
  RunWorkflowWidgetDefinition.JSON_PROPERTY_WORKFLOW_ID
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RunWorkflowWidgetDefinition {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CUSTOM_LINKS = "custom_links";
  private List<WidgetCustomLink> customLinks = null;

  public static final String JSON_PROPERTY_INPUTS = "inputs";
  private List<RunWorkflowWidgetInput> inputs = null;

  public static final String JSON_PROPERTY_TIME = "time";
  private WidgetTime time;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TITLE_ALIGN = "title_align";
  private WidgetTextAlign titleAlign;

  public static final String JSON_PROPERTY_TITLE_SIZE = "title_size";
  private String titleSize;

  public static final String JSON_PROPERTY_TYPE = "type";
  private RunWorkflowWidgetDefinitionType type = RunWorkflowWidgetDefinitionType.RUN_WORKFLOW;

  public static final String JSON_PROPERTY_WORKFLOW_ID = "workflow_id";
  private String workflowId;

  public RunWorkflowWidgetDefinition() {}

  @JsonCreator
  public RunWorkflowWidgetDefinition(
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)RunWorkflowWidgetDefinitionType type,
            @JsonProperty(required=true, value=JSON_PROPERTY_WORKFLOW_ID)String workflowId) {
        this.type = type;
        this.unparsed |= !type.isValid();
        this.workflowId = workflowId;
  }
  public RunWorkflowWidgetDefinition customLinks(List<WidgetCustomLink> customLinks) {
    this.customLinks = customLinks;
    for (WidgetCustomLink item : customLinks) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public RunWorkflowWidgetDefinition addCustomLinksItem(WidgetCustomLink customLinksItem) {
    if (this.customLinks == null) {
      this.customLinks = new ArrayList<>();
    }
    this.customLinks.add(customLinksItem);
    this.unparsed |= customLinksItem.unparsed;
    return this;
  }

  /**
   * <p>List of custom links.</p>
   * @return customLinks
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CUSTOM_LINKS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<WidgetCustomLink> getCustomLinks() {
        return customLinks;
      }
  public void setCustomLinks(List<WidgetCustomLink> customLinks) {
    this.customLinks = customLinks;
  }
  public RunWorkflowWidgetDefinition inputs(List<RunWorkflowWidgetInput> inputs) {
    this.inputs = inputs;
    for (RunWorkflowWidgetInput item : inputs) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public RunWorkflowWidgetDefinition addInputsItem(RunWorkflowWidgetInput inputsItem) {
    if (this.inputs == null) {
      this.inputs = new ArrayList<>();
    }
    this.inputs.add(inputsItem);
    this.unparsed |= inputsItem.unparsed;
    return this;
  }

  /**
   * <p>Array of workflow inputs to map to dashboard template variables.</p>
   * @return inputs
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INPUTS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<RunWorkflowWidgetInput> getInputs() {
        return inputs;
      }
  public void setInputs(List<RunWorkflowWidgetInput> inputs) {
    this.inputs = inputs;
  }
  public RunWorkflowWidgetDefinition time(WidgetTime time) {
    this.time = time;
    this.unparsed |= time.unparsed;
    return this;
  }

  /**
   * <p>Time setting for the widget.</p>
   * @return time
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TIME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public WidgetTime getTime() {
        return time;
      }
  public void setTime(WidgetTime time) {
    this.time = time;
  }
  public RunWorkflowWidgetDefinition title(String title) {
    this.title = title;
    return this;
  }

  /**
   * <p>Title of your widget.</p>
   * @return title
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TITLE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getTitle() {
        return title;
      }
  public void setTitle(String title) {
    this.title = title;
  }
  public RunWorkflowWidgetDefinition titleAlign(WidgetTextAlign titleAlign) {
    this.titleAlign = titleAlign;
    this.unparsed |= !titleAlign.isValid();
    return this;
  }

  /**
   * <p>How to align the text on the widget.</p>
   * @return titleAlign
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TITLE_ALIGN)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public WidgetTextAlign getTitleAlign() {
        return titleAlign;
      }
  public void setTitleAlign(WidgetTextAlign titleAlign) {
    if (!titleAlign.isValid()) {
        this.unparsed = true;
    }
    this.titleAlign = titleAlign;
  }
  public RunWorkflowWidgetDefinition titleSize(String titleSize) {
    this.titleSize = titleSize;
    return this;
  }

  /**
   * <p>Size of the title.</p>
   * @return titleSize
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TITLE_SIZE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getTitleSize() {
        return titleSize;
      }
  public void setTitleSize(String titleSize) {
    this.titleSize = titleSize;
  }
  public RunWorkflowWidgetDefinition type(RunWorkflowWidgetDefinitionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>Type of the run workflow widget.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public RunWorkflowWidgetDefinitionType getType() {
        return type;
      }
  public void setType(RunWorkflowWidgetDefinitionType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
  }
  public RunWorkflowWidgetDefinition workflowId(String workflowId) {
    this.workflowId = workflowId;
    return this;
  }

  /**
   * <p>Workflow id.</p>
   * @return workflowId
  **/
      @JsonProperty(JSON_PROPERTY_WORKFLOW_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getWorkflowId() {
        return workflowId;
      }
  public void setWorkflowId(String workflowId) {
    this.workflowId = workflowId;
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
   * @return RunWorkflowWidgetDefinition
   */
  @JsonAnySetter
  public RunWorkflowWidgetDefinition putAdditionalProperty(String key, Object value) {
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
   * Return true if this RunWorkflowWidgetDefinition object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunWorkflowWidgetDefinition runWorkflowWidgetDefinition = (RunWorkflowWidgetDefinition) o;
    return Objects.equals(this.customLinks, runWorkflowWidgetDefinition.customLinks) && Objects.equals(this.inputs, runWorkflowWidgetDefinition.inputs) && Objects.equals(this.time, runWorkflowWidgetDefinition.time) && Objects.equals(this.title, runWorkflowWidgetDefinition.title) && Objects.equals(this.titleAlign, runWorkflowWidgetDefinition.titleAlign) && Objects.equals(this.titleSize, runWorkflowWidgetDefinition.titleSize) && Objects.equals(this.type, runWorkflowWidgetDefinition.type) && Objects.equals(this.workflowId, runWorkflowWidgetDefinition.workflowId) && Objects.equals(this.additionalProperties, runWorkflowWidgetDefinition.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(customLinks,inputs,time,title,titleAlign,titleSize,type,workflowId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunWorkflowWidgetDefinition {\n");
    sb.append("    customLinks: ").append(toIndentedString(customLinks)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    titleAlign: ").append(toIndentedString(titleAlign)).append("\n");
    sb.append("    titleSize: ").append(toIndentedString(titleSize)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
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
