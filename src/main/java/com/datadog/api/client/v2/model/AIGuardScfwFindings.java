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
 * The Supply Chain Firewall verdict for the version-pinned install packages found in the request.
 * Evaluation requires Supply Chain Firewall to be enabled for the organization and the caller to
 * have the <code>appsec_vm_read</code> permission. Without that permission, Supply Chain Firewall
 * evaluation is skipped; the AI Guard evaluation request itself is not rejected. Findings are
 * omitted when Supply Chain Firewall does not produce a result. The recommended action combines the
 * package outcomes. Confirmation support is inferred from the evaluator profile, not from a
 * separate confirmation-capability flag. By default, a non-empty <code>meta.coding_agent</code>
 * selects the coding-agent profile, which assumes the caller can ask for confirmation and retains
 * WARN in <code>recommended_action</code>. Omitting <code>meta.coding_agent</code> or setting it to
 * an empty string selects the default profile, which assumes the caller cannot ask for confirmation
 * and returns ALLOW instead of WARN in <code>recommended_action</code>. Package outcomes still
 * retain WARN, and BLOCK is never changed to ALLOW by this rule.
 */
@JsonPropertyOrder({
  AIGuardScfwFindings.JSON_PROPERTY_PACKAGES,
  AIGuardScfwFindings.JSON_PROPERTY_RECOMMENDED_ACTION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AIGuardScfwFindings {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_PACKAGES = "packages";
  private List<AIGuardScfwPackageFinding> packages = null;

  public static final String JSON_PROPERTY_RECOMMENDED_ACTION = "recommended_action";
  private AIGuardScfwOutcome recommendedAction;

  public AIGuardScfwFindings() {}

  @JsonCreator
  public AIGuardScfwFindings(
      @JsonProperty(required = true, value = JSON_PROPERTY_RECOMMENDED_ACTION)
          AIGuardScfwOutcome recommendedAction) {
    this.recommendedAction = recommendedAction;
    this.unparsed |= !recommendedAction.isValid();
  }

  public AIGuardScfwFindings packages(List<AIGuardScfwPackageFinding> packages) {
    this.packages = packages;
    if (packages != null) {
      for (AIGuardScfwPackageFinding item : packages) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public AIGuardScfwFindings addPackagesItem(AIGuardScfwPackageFinding packagesItem) {
    if (this.packages == null) {
      this.packages = new ArrayList<>();
    }
    this.packages.add(packagesItem);
    this.unparsed |= packagesItem.unparsed;
    return this;
  }

  /**
   * The packages the firewall evaluated, <code>ALLOW</code> ones included.
   *
   * @return packages
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PACKAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<AIGuardScfwPackageFinding> getPackages() {
    return packages;
  }

  public void setPackages(List<AIGuardScfwPackageFinding> packages) {
    this.packages = packages;
    if (packages != null) {
      for (AIGuardScfwPackageFinding item : packages) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public AIGuardScfwFindings recommendedAction(AIGuardScfwOutcome recommendedAction) {
    this.recommendedAction = recommendedAction;
    this.unparsed |= !recommendedAction.isValid();
    return this;
  }

  /**
   * The Supply Chain Firewall outcome for a package, a matched rule, or the whole request.
   *
   * @return recommendedAction
   */
  @JsonProperty(JSON_PROPERTY_RECOMMENDED_ACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AIGuardScfwOutcome getRecommendedAction() {
    return recommendedAction;
  }

  public void setRecommendedAction(AIGuardScfwOutcome recommendedAction) {
    if (!recommendedAction.isValid()) {
      this.unparsed = true;
    }
    this.recommendedAction = recommendedAction;
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
   * @return AIGuardScfwFindings
   */
  @JsonAnySetter
  public AIGuardScfwFindings putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AIGuardScfwFindings object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AIGuardScfwFindings aiGuardScfwFindings = (AIGuardScfwFindings) o;
    return Objects.equals(this.packages, aiGuardScfwFindings.packages)
        && Objects.equals(this.recommendedAction, aiGuardScfwFindings.recommendedAction)
        && Objects.equals(this.additionalProperties, aiGuardScfwFindings.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(packages, recommendedAction, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AIGuardScfwFindings {\n");
    sb.append("    packages: ").append(toIndentedString(packages)).append("\n");
    sb.append("    recommendedAction: ").append(toIndentedString(recommendedAction)).append("\n");
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
