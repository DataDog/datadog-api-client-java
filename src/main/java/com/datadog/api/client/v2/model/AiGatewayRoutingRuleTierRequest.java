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
import org.openapitools.jackson.nullable.JsonNullable;

/** Routing fallback tier used to create or replace a rule. */
@JsonPropertyOrder({
  AiGatewayRoutingRuleTierRequest.JSON_PROPERTY_CLASSIFIER,
  AiGatewayRoutingRuleTierRequest.JSON_PROPERTY_ORDERING,
  AiGatewayRoutingRuleTierRequest.JSON_PROPERTY_TARGETS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayRoutingRuleTierRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CLASSIFIER = "classifier";
  private JsonNullable<AiGatewayRoutingClassifierRequest> classifier =
      JsonNullable.<AiGatewayRoutingClassifierRequest>undefined();

  public static final String JSON_PROPERTY_ORDERING = "ordering";
  private JsonNullable<AiGatewayNullableRoutingRuleTierOrdering> ordering =
      JsonNullable.<AiGatewayNullableRoutingRuleTierOrdering>undefined();

  public static final String JSON_PROPERTY_TARGETS = "targets";
  private List<AiGatewayRoutingRuleTargetRequest> targets = new ArrayList<>();

  public AiGatewayRoutingRuleTierRequest() {}

  @JsonCreator
  public AiGatewayRoutingRuleTierRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_TARGETS)
          List<AiGatewayRoutingRuleTargetRequest> targets) {
    this.targets = targets;
    for (AiGatewayRoutingRuleTargetRequest item : targets) {
      this.unparsed |= item.unparsed;
    }
  }

  public AiGatewayRoutingRuleTierRequest classifier(AiGatewayRoutingClassifierRequest classifier) {
    this.classifier = JsonNullable.<AiGatewayRoutingClassifierRequest>of(classifier);
    return this;
  }

  /**
   * Decision model and settings for a classified tier. Omission preserves the saved classifier;
   * null clears it. Newly selected models require provider View.
   *
   * @return classifier
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public AiGatewayRoutingClassifierRequest getClassifier() {
    return classifier.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CLASSIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<AiGatewayRoutingClassifierRequest> getClassifier_JsonNullable() {
    return classifier;
  }

  @JsonProperty(JSON_PROPERTY_CLASSIFIER)
  public void setClassifier_JsonNullable(
      JsonNullable<AiGatewayRoutingClassifierRequest> classifier) {
    this.classifier = classifier;
  }

  public void setClassifier(AiGatewayRoutingClassifierRequest classifier) {
    this.classifier = JsonNullable.<AiGatewayRoutingClassifierRequest>of(classifier);
  }

  public AiGatewayRoutingRuleTierRequest ordering(
      AiGatewayNullableRoutingRuleTierOrdering ordering) {
    this.ordering = JsonNullable.<AiGatewayNullableRoutingRuleTierOrdering>of(ordering);
    return this;
  }

  /**
   * How a tier orders its targets. Omission preserves the saved same-position tier on update; null
   * resets to configured. New tiers default to configured. The weighted_affinity ordering
   * distributes first-choice assignments by relative target weights and accepts only model targets
   * with an explicit provider, without repeated provider and model pairs in the same tier. The
   * <code>classified</code> ordering is allowed only in the first tier and requires a classifier,
   * destination rubrics, and one default destination.
   *
   * @return ordering
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public AiGatewayNullableRoutingRuleTierOrdering getOrdering() {
    return ordering.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ORDERING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<AiGatewayNullableRoutingRuleTierOrdering> getOrdering_JsonNullable() {
    return ordering;
  }

  @JsonProperty(JSON_PROPERTY_ORDERING)
  public void setOrdering_JsonNullable(
      JsonNullable<AiGatewayNullableRoutingRuleTierOrdering> ordering) {
    this.ordering = ordering;
  }

  public void setOrdering(AiGatewayNullableRoutingRuleTierOrdering ordering) {
    if (!ordering.isValid()) {
      this.unparsed = true;
    }
    this.ordering = JsonNullable.<AiGatewayNullableRoutingRuleTierOrdering>of(ordering);
  }

  public AiGatewayRoutingRuleTierRequest targets(List<AiGatewayRoutingRuleTargetRequest> targets) {
    this.targets = targets;
    for (AiGatewayRoutingRuleTargetRequest item : targets) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public AiGatewayRoutingRuleTierRequest addTargetsItem(
      AiGatewayRoutingRuleTargetRequest targetsItem) {
    this.targets.add(targetsItem);
    this.unparsed |= targetsItem.unparsed;
    return this;
  }

  /**
   * Gettargets
   *
   * @return targets
   */
  @JsonProperty(JSON_PROPERTY_TARGETS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<AiGatewayRoutingRuleTargetRequest> getTargets() {
    return targets;
  }

  public void setTargets(List<AiGatewayRoutingRuleTargetRequest> targets) {
    this.targets = targets;
    if (targets != null) {
      for (AiGatewayRoutingRuleTargetRequest item : targets) {
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
   * @return AiGatewayRoutingRuleTierRequest
   */
  @JsonAnySetter
  public AiGatewayRoutingRuleTierRequest putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AiGatewayRoutingRuleTierRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayRoutingRuleTierRequest aiGatewayRoutingRuleTierRequest =
        (AiGatewayRoutingRuleTierRequest) o;
    return Objects.equals(this.classifier, aiGatewayRoutingRuleTierRequest.classifier)
        && Objects.equals(this.ordering, aiGatewayRoutingRuleTierRequest.ordering)
        && Objects.equals(this.targets, aiGatewayRoutingRuleTierRequest.targets)
        && Objects.equals(
            this.additionalProperties, aiGatewayRoutingRuleTierRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classifier, ordering, targets, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayRoutingRuleTierRequest {\n");
    sb.append("    classifier: ").append(toIndentedString(classifier)).append("\n");
    sb.append("    ordering: ").append(toIndentedString(ordering)).append("\n");
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
