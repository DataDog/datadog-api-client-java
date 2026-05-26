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

/** A single edit operation within a fix suggestion for a rule violation. */
@JsonPropertyOrder({
  AnalysisEdit.JSON_PROPERTY_CONTENT,
  AnalysisEdit.JSON_PROPERTY_EDIT_TYPE,
  AnalysisEdit.JSON_PROPERTY_END,
  AnalysisEdit.JSON_PROPERTY_START
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AnalysisEdit {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONTENT = "content";
  private String content;

  public static final String JSON_PROPERTY_EDIT_TYPE = "edit_type";
  private AnalysisEditType editType = AnalysisEditType.ADD;

  public static final String JSON_PROPERTY_END = "end";
  private AnalysisPosition end;

  public static final String JSON_PROPERTY_START = "start";
  private AnalysisPosition start;

  public AnalysisEdit() {}

  @JsonCreator
  public AnalysisEdit(
      @JsonProperty(required = true, value = JSON_PROPERTY_CONTENT) String content,
      @JsonProperty(required = true, value = JSON_PROPERTY_EDIT_TYPE) AnalysisEditType editType,
      @JsonProperty(required = true, value = JSON_PROPERTY_END) AnalysisPosition end,
      @JsonProperty(required = true, value = JSON_PROPERTY_START) AnalysisPosition start) {
    this.content = content;
    if (content != null) {}
    this.editType = editType;
    this.unparsed |= !editType.isValid();
    this.end = end;
    this.unparsed |= end.unparsed;
    this.start = start;
    this.unparsed |= start.unparsed;
  }

  public AnalysisEdit content(String content) {
    this.content = content;
    if (content != null) {}
    return this;
  }

  /**
   * The content to insert or replace at the specified position, if applicable.
   *
   * @return content
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public AnalysisEdit editType(AnalysisEditType editType) {
    this.editType = editType;
    this.unparsed |= !editType.isValid();
    return this;
  }

  /**
   * The type of code edit to apply when fixing a violation.
   *
   * @return editType
   */
  @JsonProperty(JSON_PROPERTY_EDIT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AnalysisEditType getEditType() {
    return editType;
  }

  public void setEditType(AnalysisEditType editType) {
    if (!editType.isValid()) {
      this.unparsed = true;
    }
    this.editType = editType;
  }

  public AnalysisEdit end(AnalysisPosition end) {
    this.end = end;
    this.unparsed |= end.unparsed;
    return this;
  }

  /**
   * A position in source code, identified by line and column numbers.
   *
   * @return end
   */
  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AnalysisPosition getEnd() {
    return end;
  }

  public void setEnd(AnalysisPosition end) {
    this.end = end;
  }

  public AnalysisEdit start(AnalysisPosition start) {
    this.start = start;
    this.unparsed |= start.unparsed;
    return this;
  }

  /**
   * A position in source code, identified by line and column numbers.
   *
   * @return start
   */
  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AnalysisPosition getStart() {
    return start;
  }

  public void setStart(AnalysisPosition start) {
    this.start = start;
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
   * @return AnalysisEdit
   */
  @JsonAnySetter
  public AnalysisEdit putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AnalysisEdit object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalysisEdit analysisEdit = (AnalysisEdit) o;
    return Objects.equals(this.content, analysisEdit.content)
        && Objects.equals(this.editType, analysisEdit.editType)
        && Objects.equals(this.end, analysisEdit.end)
        && Objects.equals(this.start, analysisEdit.start)
        && Objects.equals(this.additionalProperties, analysisEdit.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, editType, end, start, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalysisEdit {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    editType: ").append(toIndentedString(editType)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
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
