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

/** A rule violation found in the analyzed source code. */
@JsonPropertyOrder({
  AnalysisViolation.JSON_PROPERTY_CATEGORY,
  AnalysisViolation.JSON_PROPERTY_END,
  AnalysisViolation.JSON_PROPERTY_FIXES,
  AnalysisViolation.JSON_PROPERTY_MESSAGE,
  AnalysisViolation.JSON_PROPERTY_SEVERITY,
  AnalysisViolation.JSON_PROPERTY_START
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AnalysisViolation {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CATEGORY = "category";
  private String category;

  public static final String JSON_PROPERTY_END = "end";
  private AnalysisPosition end;

  public static final String JSON_PROPERTY_FIXES = "fixes";
  private List<AnalysisFix> fixes = new ArrayList<>();

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_SEVERITY = "severity";
  private String severity;

  public static final String JSON_PROPERTY_START = "start";
  private AnalysisPosition start;

  public AnalysisViolation() {}

  @JsonCreator
  public AnalysisViolation(
      @JsonProperty(required = true, value = JSON_PROPERTY_CATEGORY) String category,
      @JsonProperty(required = true, value = JSON_PROPERTY_END) AnalysisPosition end,
      @JsonProperty(required = true, value = JSON_PROPERTY_FIXES) List<AnalysisFix> fixes,
      @JsonProperty(required = true, value = JSON_PROPERTY_MESSAGE) String message,
      @JsonProperty(required = true, value = JSON_PROPERTY_SEVERITY) String severity,
      @JsonProperty(required = true, value = JSON_PROPERTY_START) AnalysisPosition start) {
    this.category = category;
    this.end = end;
    this.unparsed |= end.unparsed;
    this.fixes = fixes;
    for (AnalysisFix item : fixes) {
      this.unparsed |= item.unparsed;
    }
    this.message = message;
    this.severity = severity;
    this.start = start;
    this.unparsed |= start.unparsed;
  }

  public AnalysisViolation category(String category) {
    this.category = category;
    return this;
  }

  /**
   * The category of the violation.
   *
   * @return category
   */
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public AnalysisViolation end(AnalysisPosition end) {
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
    if (end != null) {
      this.unparsed |= end.unparsed;
    }
  }

  public AnalysisViolation fixes(List<AnalysisFix> fixes) {
    this.fixes = fixes;
    for (AnalysisFix item : fixes) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public AnalysisViolation addFixesItem(AnalysisFix fixesItem) {
    this.fixes.add(fixesItem);
    this.unparsed |= fixesItem.unparsed;
    return this;
  }

  /**
   * The list of suggested fixes for this violation.
   *
   * @return fixes
   */
  @JsonProperty(JSON_PROPERTY_FIXES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<AnalysisFix> getFixes() {
    return fixes;
  }

  public void setFixes(List<AnalysisFix> fixes) {
    this.fixes = fixes;
    if (fixes != null) {
      for (AnalysisFix item : fixes) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public AnalysisViolation message(String message) {
    this.message = message;
    return this;
  }

  /**
   * A human-readable description of the violation.
   *
   * @return message
   */
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public AnalysisViolation severity(String severity) {
    this.severity = severity;
    return this;
  }

  /**
   * The severity level of the violation.
   *
   * @return severity
   */
  @JsonProperty(JSON_PROPERTY_SEVERITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSeverity() {
    return severity;
  }

  public void setSeverity(String severity) {
    this.severity = severity;
  }

  public AnalysisViolation start(AnalysisPosition start) {
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
    if (start != null) {
      this.unparsed |= start.unparsed;
    }
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
   * @return AnalysisViolation
   */
  @JsonAnySetter
  public AnalysisViolation putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AnalysisViolation object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalysisViolation analysisViolation = (AnalysisViolation) o;
    return Objects.equals(this.category, analysisViolation.category)
        && Objects.equals(this.end, analysisViolation.end)
        && Objects.equals(this.fixes, analysisViolation.fixes)
        && Objects.equals(this.message, analysisViolation.message)
        && Objects.equals(this.severity, analysisViolation.severity)
        && Objects.equals(this.start, analysisViolation.start)
        && Objects.equals(this.additionalProperties, analysisViolation.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, end, fixes, message, severity, start, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalysisViolation {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    fixes: ").append(toIndentedString(fixes)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
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
