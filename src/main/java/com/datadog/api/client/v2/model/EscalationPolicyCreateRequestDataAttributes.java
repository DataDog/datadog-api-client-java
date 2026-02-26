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
 * Defines the attributes for creating an escalation policy, including its description, name,
 * resolution behavior, retries, and steps.
 */
@JsonPropertyOrder({
  EscalationPolicyCreateRequestDataAttributes.JSON_PROPERTY_NAME,
  EscalationPolicyCreateRequestDataAttributes.JSON_PROPERTY_RESOLVE_PAGE_ON_POLICY_END,
  EscalationPolicyCreateRequestDataAttributes.JSON_PROPERTY_RETRIES,
  EscalationPolicyCreateRequestDataAttributes.JSON_PROPERTY_STEPS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EscalationPolicyCreateRequestDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_RESOLVE_PAGE_ON_POLICY_END =
      "resolve_page_on_policy_end";
  private Boolean resolvePageOnPolicyEnd;

  public static final String JSON_PROPERTY_RETRIES = "retries";
  private Long retries;

  public static final String JSON_PROPERTY_STEPS = "steps";
  private List<EscalationPolicyCreateRequestDataAttributesStepsItems> steps = new ArrayList<>();

  public EscalationPolicyCreateRequestDataAttributes() {}

  @JsonCreator
  public EscalationPolicyCreateRequestDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_STEPS)
          List<EscalationPolicyCreateRequestDataAttributesStepsItems> steps) {
    this.name = name;
    this.steps = steps;
  }

  public EscalationPolicyCreateRequestDataAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Specifies the name for the new escalation policy.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EscalationPolicyCreateRequestDataAttributes resolvePageOnPolicyEnd(
      Boolean resolvePageOnPolicyEnd) {
    this.resolvePageOnPolicyEnd = resolvePageOnPolicyEnd;
    return this;
  }

  /**
   * Indicates whether the page is automatically resolved when the policy ends.
   *
   * @return resolvePageOnPolicyEnd
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESOLVE_PAGE_ON_POLICY_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getResolvePageOnPolicyEnd() {
    return resolvePageOnPolicyEnd;
  }

  public void setResolvePageOnPolicyEnd(Boolean resolvePageOnPolicyEnd) {
    this.resolvePageOnPolicyEnd = resolvePageOnPolicyEnd;
  }

  public EscalationPolicyCreateRequestDataAttributes retries(Long retries) {
    this.retries = retries;
    return this;
  }

  /**
   * Specifies how many times the escalation sequence is retried if there is no response. minimum: 0
   * maximum: 10
   *
   * @return retries
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RETRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRetries() {
    return retries;
  }

  public void setRetries(Long retries) {
    this.retries = retries;
  }

  public EscalationPolicyCreateRequestDataAttributes steps(
      List<EscalationPolicyCreateRequestDataAttributesStepsItems> steps) {
    this.steps = steps;
    for (EscalationPolicyCreateRequestDataAttributesStepsItems item : steps) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public EscalationPolicyCreateRequestDataAttributes addStepsItem(
      EscalationPolicyCreateRequestDataAttributesStepsItems stepsItem) {
    this.steps.add(stepsItem);
    this.unparsed |= stepsItem.unparsed;
    return this;
  }

  /**
   * A list of escalation steps, each defining assignment, escalation timeout, and targets for the
   * new policy.
   *
   * @return steps
   */
  @JsonProperty(JSON_PROPERTY_STEPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<EscalationPolicyCreateRequestDataAttributesStepsItems> getSteps() {
    return steps;
  }

  public void setSteps(List<EscalationPolicyCreateRequestDataAttributesStepsItems> steps) {
    this.steps = steps;
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
   * @return EscalationPolicyCreateRequestDataAttributes
   */
  @JsonAnySetter
  public EscalationPolicyCreateRequestDataAttributes putAdditionalProperty(
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

  /** Return true if this EscalationPolicyCreateRequestDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EscalationPolicyCreateRequestDataAttributes escalationPolicyCreateRequestDataAttributes =
        (EscalationPolicyCreateRequestDataAttributes) o;
    return Objects.equals(this.name, escalationPolicyCreateRequestDataAttributes.name)
        && Objects.equals(
            this.resolvePageOnPolicyEnd,
            escalationPolicyCreateRequestDataAttributes.resolvePageOnPolicyEnd)
        && Objects.equals(this.retries, escalationPolicyCreateRequestDataAttributes.retries)
        && Objects.equals(this.steps, escalationPolicyCreateRequestDataAttributes.steps)
        && Objects.equals(
            this.additionalProperties,
            escalationPolicyCreateRequestDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, resolvePageOnPolicyEnd, retries, steps, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EscalationPolicyCreateRequestDataAttributes {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    resolvePageOnPolicyEnd: ")
        .append(toIndentedString(resolvePageOnPolicyEnd))
        .append("\n");
    sb.append("    retries: ").append(toIndentedString(retries)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
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
