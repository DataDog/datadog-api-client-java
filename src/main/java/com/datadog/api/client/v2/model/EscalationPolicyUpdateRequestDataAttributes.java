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
   * <p>Defines the attributes that can be updated for an escalation policy, such as description, name, resolution behavior, retries, and steps.</p>
 */
@JsonPropertyOrder({
  EscalationPolicyUpdateRequestDataAttributes.JSON_PROPERTY_NAME,
  EscalationPolicyUpdateRequestDataAttributes.JSON_PROPERTY_RESOLVE_PAGE_ON_POLICY_END,
  EscalationPolicyUpdateRequestDataAttributes.JSON_PROPERTY_RETRIES,
  EscalationPolicyUpdateRequestDataAttributes.JSON_PROPERTY_STEPS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EscalationPolicyUpdateRequestDataAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_RESOLVE_PAGE_ON_POLICY_END = "resolve_page_on_policy_end";
  private Boolean resolvePageOnPolicyEnd;

  public static final String JSON_PROPERTY_RETRIES = "retries";
  private Long retries;

  public static final String JSON_PROPERTY_STEPS = "steps";
  private List<EscalationPolicyUpdateRequestDataAttributesStepsItems> steps = new ArrayList<>();

  public EscalationPolicyUpdateRequestDataAttributes() {}

  @JsonCreator
  public EscalationPolicyUpdateRequestDataAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name,
            @JsonProperty(required=true, value=JSON_PROPERTY_STEPS)List<EscalationPolicyUpdateRequestDataAttributesStepsItems> steps) {
        this.name = name;
        this.steps = steps;
  }
  public EscalationPolicyUpdateRequestDataAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Specifies the name of the escalation policy.</p>
   * @return name
  **/
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public EscalationPolicyUpdateRequestDataAttributes resolvePageOnPolicyEnd(Boolean resolvePageOnPolicyEnd) {
    this.resolvePageOnPolicyEnd = resolvePageOnPolicyEnd;
    return this;
  }

  /**
   * <p>Indicates whether the page is automatically resolved when the policy ends.</p>
   * @return resolvePageOnPolicyEnd
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RESOLVE_PAGE_ON_POLICY_END)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getResolvePageOnPolicyEnd() {
        return resolvePageOnPolicyEnd;
      }
  public void setResolvePageOnPolicyEnd(Boolean resolvePageOnPolicyEnd) {
    this.resolvePageOnPolicyEnd = resolvePageOnPolicyEnd;
  }
  public EscalationPolicyUpdateRequestDataAttributes retries(Long retries) {
    this.retries = retries;
    return this;
  }

  /**
   * <p>Specifies how many times the escalation sequence is retried if there is no response.</p>
   * minimum: 0
   * maximum: 10
   * @return retries
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RETRIES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getRetries() {
        return retries;
      }
  public void setRetries(Long retries) {
    this.retries = retries;
  }
  public EscalationPolicyUpdateRequestDataAttributes steps(List<EscalationPolicyUpdateRequestDataAttributesStepsItems> steps) {
    this.steps = steps;
    for (EscalationPolicyUpdateRequestDataAttributesStepsItems item : steps) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public EscalationPolicyUpdateRequestDataAttributes addStepsItem(EscalationPolicyUpdateRequestDataAttributesStepsItems stepsItem) {
    this.steps.add(stepsItem);
    this.unparsed |= stepsItem.unparsed;
    return this;
  }

  /**
   * <p>A list of escalation steps, each defining assignment, escalation timeout, and targets.</p>
   * @return steps
  **/
      @JsonProperty(JSON_PROPERTY_STEPS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<EscalationPolicyUpdateRequestDataAttributesStepsItems> getSteps() {
        return steps;
      }
  public void setSteps(List<EscalationPolicyUpdateRequestDataAttributesStepsItems> steps) {
    this.steps = steps;
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
   * @return EscalationPolicyUpdateRequestDataAttributes
   */
  @JsonAnySetter
  public EscalationPolicyUpdateRequestDataAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this EscalationPolicyUpdateRequestDataAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EscalationPolicyUpdateRequestDataAttributes escalationPolicyUpdateRequestDataAttributes = (EscalationPolicyUpdateRequestDataAttributes) o;
    return Objects.equals(this.name, escalationPolicyUpdateRequestDataAttributes.name) && Objects.equals(this.resolvePageOnPolicyEnd, escalationPolicyUpdateRequestDataAttributes.resolvePageOnPolicyEnd) && Objects.equals(this.retries, escalationPolicyUpdateRequestDataAttributes.retries) && Objects.equals(this.steps, escalationPolicyUpdateRequestDataAttributes.steps) && Objects.equals(this.additionalProperties, escalationPolicyUpdateRequestDataAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(name,resolvePageOnPolicyEnd,retries,steps, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EscalationPolicyUpdateRequestDataAttributes {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    resolvePageOnPolicyEnd: ").append(toIndentedString(resolvePageOnPolicyEnd)).append("\n");
    sb.append("    retries: ").append(toIndentedString(retries)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
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
