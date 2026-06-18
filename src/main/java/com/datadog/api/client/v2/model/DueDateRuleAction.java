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

/** The action to take when the due date rule matches a finding. */
@JsonPropertyOrder({
  DueDateRuleAction.JSON_PROPERTY_DUE_DAYS_PER_SEVERITY,
  DueDateRuleAction.JSON_PROPERTY_DUE_FROM,
  DueDateRuleAction.JSON_PROPERTY_REASON_DESCRIPTION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DueDateRuleAction {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DUE_DAYS_PER_SEVERITY = "due_days_per_severity";
  private List<DueDatePerSeverityItem> dueDaysPerSeverity = new ArrayList<>();

  public static final String JSON_PROPERTY_DUE_FROM = "due_from";
  private DueDateFrom dueFrom;

  public static final String JSON_PROPERTY_REASON_DESCRIPTION = "reason_description";
  private String reasonDescription;

  public DueDateRuleAction() {}

  @JsonCreator
  public DueDateRuleAction(
      @JsonProperty(required = true, value = JSON_PROPERTY_DUE_DAYS_PER_SEVERITY)
          List<DueDatePerSeverityItem> dueDaysPerSeverity,
      @JsonProperty(required = true, value = JSON_PROPERTY_DUE_FROM) DueDateFrom dueFrom) {
    this.dueDaysPerSeverity = dueDaysPerSeverity;
    this.dueFrom = dueFrom;
    this.unparsed |= !dueFrom.isValid();
  }

  public DueDateRuleAction dueDaysPerSeverity(List<DueDatePerSeverityItem> dueDaysPerSeverity) {
    this.dueDaysPerSeverity = dueDaysPerSeverity;
    for (DueDatePerSeverityItem item : dueDaysPerSeverity) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public DueDateRuleAction addDueDaysPerSeverityItem(
      DueDatePerSeverityItem dueDaysPerSeverityItem) {
    this.dueDaysPerSeverity.add(dueDaysPerSeverityItem);
    this.unparsed |= dueDaysPerSeverityItem.unparsed;
    return this;
  }

  /**
   * A list of severity-to-due-date mappings. Each severity may appear at most once.
   *
   * @return dueDaysPerSeverity
   */
  @JsonProperty(JSON_PROPERTY_DUE_DAYS_PER_SEVERITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<DueDatePerSeverityItem> getDueDaysPerSeverity() {
    return dueDaysPerSeverity;
  }

  public void setDueDaysPerSeverity(List<DueDatePerSeverityItem> dueDaysPerSeverity) {
    this.dueDaysPerSeverity = dueDaysPerSeverity;
  }

  public DueDateRuleAction dueFrom(DueDateFrom dueFrom) {
    this.dueFrom = dueFrom;
    this.unparsed |= !dueFrom.isValid();
    return this;
  }

  /**
   * The reference point from which the due date is calculated. When <code>fix_available</code> is
   * selected but not applicable to the finding type, <code>first_seen</code> is used instead.
   *
   * @return dueFrom
   */
  @JsonProperty(JSON_PROPERTY_DUE_FROM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public DueDateFrom getDueFrom() {
    return dueFrom;
  }

  public void setDueFrom(DueDateFrom dueFrom) {
    if (!dueFrom.isValid()) {
      this.unparsed = true;
    }
    this.dueFrom = dueFrom;
  }

  public DueDateRuleAction reasonDescription(String reasonDescription) {
    this.reasonDescription = reasonDescription;
    return this;
  }

  /**
   * An optional description providing more context for the due date assignment.
   *
   * @return reasonDescription
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REASON_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getReasonDescription() {
    return reasonDescription;
  }

  public void setReasonDescription(String reasonDescription) {
    this.reasonDescription = reasonDescription;
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
   * @return DueDateRuleAction
   */
  @JsonAnySetter
  public DueDateRuleAction putAdditionalProperty(String key, Object value) {
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

  /** Return true if this DueDateRuleAction object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DueDateRuleAction dueDateRuleAction = (DueDateRuleAction) o;
    return Objects.equals(this.dueDaysPerSeverity, dueDateRuleAction.dueDaysPerSeverity)
        && Objects.equals(this.dueFrom, dueDateRuleAction.dueFrom)
        && Objects.equals(this.reasonDescription, dueDateRuleAction.reasonDescription)
        && Objects.equals(this.additionalProperties, dueDateRuleAction.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dueDaysPerSeverity, dueFrom, reasonDescription, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DueDateRuleAction {\n");
    sb.append("    dueDaysPerSeverity: ").append(toIndentedString(dueDaysPerSeverity)).append("\n");
    sb.append("    dueFrom: ").append(toIndentedString(dueFrom)).append("\n");
    sb.append("    reasonDescription: ").append(toIndentedString(reasonDescription)).append("\n");
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
