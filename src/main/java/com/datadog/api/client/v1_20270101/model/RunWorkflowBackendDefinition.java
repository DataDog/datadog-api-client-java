/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  RunWorkflowBackendDefinition.JSON_PROPERTY_DESCRIPTION,
  RunWorkflowBackendDefinition.JSON_PROPERTY_INPUTS,
  RunWorkflowBackendDefinition.JSON_PROPERTY_NOTES,
  RunWorkflowBackendDefinition.JSON_PROPERTY_TITLE,
  RunWorkflowBackendDefinition.JSON_PROPERTY_TITLE_ALIGN,
  RunWorkflowBackendDefinition.JSON_PROPERTY_TITLE_SIZE,
  RunWorkflowBackendDefinition.JSON_PROPERTY_TYPE,
  RunWorkflowBackendDefinition.JSON_PROPERTY_WORKFLOW_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RunWorkflowBackendDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_INPUTS = "inputs";
  private List<RunWorkflowExecutionInput> inputs = null;

  public static final String JSON_PROPERTY_NOTES = "notes";
  private String notes;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TITLE_ALIGN = "title_align";
  private WidgetTextAlign titleAlign;

  public static final String JSON_PROPERTY_TITLE_SIZE = "title_size";
  private String titleSize;

  public static final String JSON_PROPERTY_TYPE = "type";
  private RunWorkflowBackendDefinitionType type;

  public static final String JSON_PROPERTY_WORKFLOW_ID = "workflow_id";
  private String workflowId;

  public RunWorkflowBackendDefinition() {}

  @JsonCreator
  public RunWorkflowBackendDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          RunWorkflowBackendDefinitionType type,
      @JsonProperty(required = true, value = JSON_PROPERTY_WORKFLOW_ID) String workflowId) {
    this.type = type;
    this.unparsed |= !type.isValid();
    this.workflowId = workflowId;
  }

  public RunWorkflowBackendDefinition description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public RunWorkflowBackendDefinition inputs(List<RunWorkflowExecutionInput> inputs) {
    this.inputs = inputs;
    if (inputs != null) {
      for (RunWorkflowExecutionInput item : inputs) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public RunWorkflowBackendDefinition addInputsItem(RunWorkflowExecutionInput inputsItem) {
    if (this.inputs == null) {
      this.inputs = new ArrayList<>();
    }
    this.inputs.add(inputsItem);
    this.unparsed |= inputsItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return inputs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INPUTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<RunWorkflowExecutionInput> getInputs() {
    return inputs;
  }

  public void setInputs(List<RunWorkflowExecutionInput> inputs) {
    this.inputs = inputs;
    if (inputs != null) {
      for (RunWorkflowExecutionInput item : inputs) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public RunWorkflowBackendDefinition notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return notes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public RunWorkflowBackendDefinition title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public RunWorkflowBackendDefinition titleAlign(WidgetTextAlign titleAlign) {
    this.titleAlign = titleAlign;
    this.unparsed |= !titleAlign.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return titleAlign
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE_ALIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetTextAlign getTitleAlign() {
    return titleAlign;
  }

  public void setTitleAlign(WidgetTextAlign titleAlign) {
    if (!titleAlign.isValid()) {
      this.unparsed = true;
    }
    this.titleAlign = titleAlign;
  }

  public RunWorkflowBackendDefinition titleSize(String titleSize) {
    this.titleSize = titleSize;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return titleSize
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitleSize() {
    return titleSize;
  }

  public void setTitleSize(String titleSize) {
    this.titleSize = titleSize;
  }

  public RunWorkflowBackendDefinition type(RunWorkflowBackendDefinitionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RunWorkflowBackendDefinitionType getType() {
    return type;
  }

  public void setType(RunWorkflowBackendDefinitionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public RunWorkflowBackendDefinition workflowId(String workflowId) {
    this.workflowId = workflowId;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return workflowId
   */
  @JsonProperty(JSON_PROPERTY_WORKFLOW_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getWorkflowId() {
    return workflowId;
  }

  public void setWorkflowId(String workflowId) {
    this.workflowId = workflowId;
  }

  /** Return true if this RunWorkflowBackendDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunWorkflowBackendDefinition runWorkflowBackendDefinition = (RunWorkflowBackendDefinition) o;
    return Objects.equals(this.description, runWorkflowBackendDefinition.description)
        && Objects.equals(this.inputs, runWorkflowBackendDefinition.inputs)
        && Objects.equals(this.notes, runWorkflowBackendDefinition.notes)
        && Objects.equals(this.title, runWorkflowBackendDefinition.title)
        && Objects.equals(this.titleAlign, runWorkflowBackendDefinition.titleAlign)
        && Objects.equals(this.titleSize, runWorkflowBackendDefinition.titleSize)
        && Objects.equals(this.type, runWorkflowBackendDefinition.type)
        && Objects.equals(this.workflowId, runWorkflowBackendDefinition.workflowId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, inputs, notes, title, titleAlign, titleSize, type, workflowId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunWorkflowBackendDefinition {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    titleAlign: ").append(toIndentedString(titleAlign)).append("\n");
    sb.append("    titleSize: ").append(toIndentedString(titleSize)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
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
