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

/** Routing fallback tier containing targets and their effective ordering. */
@JsonPropertyOrder({
  AiGatewayRoutingRuleTier.JSON_PROPERTY_CLASSIFIER,
  AiGatewayRoutingRuleTier.JSON_PROPERTY_ORDERING,
  AiGatewayRoutingRuleTier.JSON_PROPERTY_ORDERING_ISSUE,
  AiGatewayRoutingRuleTier.JSON_PROPERTY_TARGETS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayRoutingRuleTier {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CLASSIFIER = "classifier";
  private AiGatewayRoutingClassifier classifier;

  public static final String JSON_PROPERTY_ORDERING = "ordering";
  private AiGatewayRoutingRuleTierOrdering ordering;

  public static final String JSON_PROPERTY_ORDERING_ISSUE = "ordering_issue";
  private AiGatewayRoutingRuleTierOrderingIssue orderingIssue;

  public static final String JSON_PROPERTY_TARGETS = "targets";
  private List<AiGatewayRoutingRuleTarget> targets = new ArrayList<>();

  public AiGatewayRoutingRuleTier() {}

  @JsonCreator
  public AiGatewayRoutingRuleTier(
      @JsonProperty(required = true, value = JSON_PROPERTY_ORDERING)
          AiGatewayRoutingRuleTierOrdering ordering,
      @JsonProperty(required = true, value = JSON_PROPERTY_TARGETS)
          List<AiGatewayRoutingRuleTarget> targets) {
    this.ordering = ordering;
    this.unparsed |= !ordering.isValid();
    this.targets = targets;
    for (AiGatewayRoutingRuleTarget item : targets) {
      this.unparsed |= item.unparsed;
    }
  }

  public AiGatewayRoutingRuleTier classifier(AiGatewayRoutingClassifier classifier) {
    this.classifier = classifier;
    this.unparsed |= classifier.unparsed;
    return this;
  }

  /**
   * Saved classified-tier settings. Provider and model are empty when the caller cannot view the
   * provider.
   *
   * @return classifier
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLASSIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AiGatewayRoutingClassifier getClassifier() {
    return classifier;
  }

  public void setClassifier(AiGatewayRoutingClassifier classifier) {
    this.classifier = classifier;
    if (classifier != null) {
      this.unparsed |= classifier.unparsed;
    }
  }

  public AiGatewayRoutingRuleTier ordering(AiGatewayRoutingRuleTierOrdering ordering) {
    this.ordering = ordering;
    this.unparsed |= !ordering.isValid();
    return this;
  }

  /**
   * How a tier orders its targets.
   *
   * @return ordering
   */
  @JsonProperty(JSON_PROPERTY_ORDERING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AiGatewayRoutingRuleTierOrdering getOrdering() {
    return ordering;
  }

  public void setOrdering(AiGatewayRoutingRuleTierOrdering ordering) {
    if (!ordering.isValid()) {
      this.unparsed = true;
    }
    this.ordering = ordering;
  }

  /**
   * Stored tier ordering is inconsistent. mixed means targets have different supported orderings,
   * and unknown means a target has an unsupported ordering. The tier is reported as configured
   * without weights. Replace the rule to repair it. Omitted for consistent tiers. A forced deletion
   * cannot rewrite a surviving tier with an unknown issue.
   *
   * @return orderingIssue
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORDERING_ISSUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AiGatewayRoutingRuleTierOrderingIssue getOrderingIssue() {
    return orderingIssue;
  }

  public AiGatewayRoutingRuleTier targets(List<AiGatewayRoutingRuleTarget> targets) {
    this.targets = targets;
    for (AiGatewayRoutingRuleTarget item : targets) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public AiGatewayRoutingRuleTier addTargetsItem(AiGatewayRoutingRuleTarget targetsItem) {
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
  public List<AiGatewayRoutingRuleTarget> getTargets() {
    return targets;
  }

  public void setTargets(List<AiGatewayRoutingRuleTarget> targets) {
    this.targets = targets;
    if (targets != null) {
      for (AiGatewayRoutingRuleTarget item : targets) {
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
   * @return AiGatewayRoutingRuleTier
   */
  @JsonAnySetter
  public AiGatewayRoutingRuleTier putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AiGatewayRoutingRuleTier object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayRoutingRuleTier aiGatewayRoutingRuleTier = (AiGatewayRoutingRuleTier) o;
    return Objects.equals(this.classifier, aiGatewayRoutingRuleTier.classifier)
        && Objects.equals(this.ordering, aiGatewayRoutingRuleTier.ordering)
        && Objects.equals(this.orderingIssue, aiGatewayRoutingRuleTier.orderingIssue)
        && Objects.equals(this.targets, aiGatewayRoutingRuleTier.targets)
        && Objects.equals(this.additionalProperties, aiGatewayRoutingRuleTier.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classifier, ordering, orderingIssue, targets, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayRoutingRuleTier {\n");
    sb.append("    classifier: ").append(toIndentedString(classifier)).append("\n");
    sb.append("    ordering: ").append(toIndentedString(ordering)).append("\n");
    sb.append("    orderingIssue: ").append(toIndentedString(orderingIssue)).append("\n");
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
