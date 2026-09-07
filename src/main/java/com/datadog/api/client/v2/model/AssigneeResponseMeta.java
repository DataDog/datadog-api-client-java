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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Per-finding warnings and failures produced while processing the bulk assignee request. */
@JsonPropertyOrder({
  AssigneeResponseMeta.JSON_PROPERTY_FAILURES,
  AssigneeResponseMeta.JSON_PROPERTY_WARNINGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AssigneeResponseMeta {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FAILURES = "failures";
  private List<AssignmentResult> failures = null;

  public static final String JSON_PROPERTY_WARNINGS = "warnings";
  private List<AssignmentResult> warnings = null;

  public AssigneeResponseMeta failures(List<AssignmentResult> failures) {
    this.failures = failures;
    if (failures != null) {
      for (AssignmentResult item : failures) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public AssigneeResponseMeta addFailuresItem(AssignmentResult failuresItem) {
    if (this.failures == null) {
      this.failures = new ArrayList<>();
    }
    this.failures.add(failuresItem);
    this.unparsed |= failuresItem.unparsed;
    return this;
  }

  /**
   * Findings that could not be assigned or unassigned.
   *
   * @return failures
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAILURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<AssignmentResult> getFailures() {
    return failures;
  }

  public void setFailures(List<AssignmentResult> failures) {
    this.failures = failures;
    if (failures != null) {
      for (AssignmentResult item : failures) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public AssigneeResponseMeta warnings(List<AssignmentResult> warnings) {
    this.warnings = warnings;
    if (warnings != null) {
      for (AssignmentResult item : warnings) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public AssigneeResponseMeta addWarningsItem(AssignmentResult warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    this.unparsed |= warningsItem.unparsed;
    return this;
  }

  /**
   * Findings for which the assignment succeeded but a non-critical error occurred during
   * processing.
   *
   * @return warnings
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<AssignmentResult> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<AssignmentResult> warnings) {
    this.warnings = warnings;
    if (warnings != null) {
      for (AssignmentResult item : warnings) {
        this.unparsed |= item.unparsed;
      }
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
   * @return AssigneeResponseMeta
   */
  @JsonAnySetter
  public AssigneeResponseMeta putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AssigneeResponseMeta object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssigneeResponseMeta assigneeResponseMeta = (AssigneeResponseMeta) o;
    return Objects.equals(this.failures, assigneeResponseMeta.failures)
        && Objects.equals(this.warnings, assigneeResponseMeta.warnings)
        && Objects.equals(this.additionalProperties, assigneeResponseMeta.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failures, warnings, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssigneeResponseMeta {\n");
    sb.append("    failures: ").append(toIndentedString(failures)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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
