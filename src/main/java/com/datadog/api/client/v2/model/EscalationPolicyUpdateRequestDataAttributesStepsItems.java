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

/**
 * Defines a single escalation step within an escalation policy update request. Contains assignment
 * strategy, escalation timeout, an optional step ID, and a list of targets.
 */
@JsonPropertyOrder({
  EscalationPolicyUpdateRequestDataAttributesStepsItems.JSON_PROPERTY_ASSIGNMENT,
  EscalationPolicyUpdateRequestDataAttributesStepsItems.JSON_PROPERTY_ESCALATE_AFTER_SECONDS,
  EscalationPolicyUpdateRequestDataAttributesStepsItems.JSON_PROPERTY_ID,
  EscalationPolicyUpdateRequestDataAttributesStepsItems.JSON_PROPERTY_TARGETS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EscalationPolicyUpdateRequestDataAttributesStepsItems {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ASSIGNMENT = "assignment";
  private EscalationPolicyStepAttributesAssignment assignment;

  public static final String JSON_PROPERTY_ESCALATE_AFTER_SECONDS = "escalate_after_seconds";
  private Long escalateAfterSeconds;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TARGETS = "targets";
  private List<EscalationPolicyStepTarget> targets = new ArrayList<>();

  public EscalationPolicyUpdateRequestDataAttributesStepsItems() {}

  @JsonCreator
  public EscalationPolicyUpdateRequestDataAttributesStepsItems(
      @JsonProperty(required = true, value = JSON_PROPERTY_TARGETS)
          List<EscalationPolicyStepTarget> targets) {
    this.targets = targets;
  }

  public EscalationPolicyUpdateRequestDataAttributesStepsItems assignment(
      EscalationPolicyStepAttributesAssignment assignment) {
    this.assignment = assignment;
    this.unparsed |= !assignment.isValid();
    return this;
  }

  /**
   * Specifies how this escalation step will assign targets (example <code>default</code> or <code>
   * round-robin</code>).
   *
   * @return assignment
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASSIGNMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EscalationPolicyStepAttributesAssignment getAssignment() {
    return assignment;
  }

  public void setAssignment(EscalationPolicyStepAttributesAssignment assignment) {
    if (!assignment.isValid()) {
      this.unparsed = true;
    }
    this.assignment = assignment;
  }

  public EscalationPolicyUpdateRequestDataAttributesStepsItems escalateAfterSeconds(
      Long escalateAfterSeconds) {
    this.escalateAfterSeconds = escalateAfterSeconds;
    return this;
  }

  /**
   * Defines how many seconds to wait before escalating to the next step. minimum: 60 maximum: 36000
   *
   * @return escalateAfterSeconds
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ESCALATE_AFTER_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEscalateAfterSeconds() {
    return escalateAfterSeconds;
  }

  public void setEscalateAfterSeconds(Long escalateAfterSeconds) {
    this.escalateAfterSeconds = escalateAfterSeconds;
  }

  public EscalationPolicyUpdateRequestDataAttributesStepsItems id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Specifies the unique identifier of this step.
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

  public EscalationPolicyUpdateRequestDataAttributesStepsItems targets(
      List<EscalationPolicyStepTarget> targets) {
    this.targets = targets;
    for (EscalationPolicyStepTarget item : targets) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public EscalationPolicyUpdateRequestDataAttributesStepsItems addTargetsItem(
      EscalationPolicyStepTarget targetsItem) {
    this.targets.add(targetsItem);
    this.unparsed |= targetsItem.unparsed;
    return this;
  }

  /**
   * Specifies the collection of escalation targets for this step.
   *
   * @return targets
   */
  @JsonProperty(JSON_PROPERTY_TARGETS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<EscalationPolicyStepTarget> getTargets() {
    return targets;
  }

  public void setTargets(List<EscalationPolicyStepTarget> targets) {
    this.targets = targets;
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
   * @return EscalationPolicyUpdateRequestDataAttributesStepsItems
   */
  @JsonAnySetter
  public EscalationPolicyUpdateRequestDataAttributesStepsItems putAdditionalProperty(
      String key, Object value) {
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
   * Return true if this EscalationPolicyUpdateRequestDataAttributesStepsItems object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EscalationPolicyUpdateRequestDataAttributesStepsItems
        escalationPolicyUpdateRequestDataAttributesStepsItems =
            (EscalationPolicyUpdateRequestDataAttributesStepsItems) o;
    return Objects.equals(
            this.assignment, escalationPolicyUpdateRequestDataAttributesStepsItems.assignment)
        && Objects.equals(
            this.escalateAfterSeconds,
            escalationPolicyUpdateRequestDataAttributesStepsItems.escalateAfterSeconds)
        && Objects.equals(this.id, escalationPolicyUpdateRequestDataAttributesStepsItems.id)
        && Objects.equals(
            this.targets, escalationPolicyUpdateRequestDataAttributesStepsItems.targets)
        && Objects.equals(
            this.additionalProperties,
            escalationPolicyUpdateRequestDataAttributesStepsItems.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignment, escalateAfterSeconds, id, targets, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EscalationPolicyUpdateRequestDataAttributesStepsItems {\n");
    sb.append("    assignment: ").append(toIndentedString(assignment)).append("\n");
    sb.append("    escalateAfterSeconds: ")
        .append(toIndentedString(escalateAfterSeconds))
        .append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
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
