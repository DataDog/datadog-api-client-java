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

/** The evaluation result with the recommended action and detected threat information. */
@JsonPropertyOrder({
  AIGuardEvaluateAttributesResponse.JSON_PROPERTY_ACTION,
  AIGuardEvaluateAttributesResponse.JSON_PROPERTY_GLOBAL_PROB,
  AIGuardEvaluateAttributesResponse.JSON_PROPERTY_IS_BLOCKING_ENABLED,
  AIGuardEvaluateAttributesResponse.JSON_PROPERTY_REASON,
  AIGuardEvaluateAttributesResponse.JSON_PROPERTY_REDACTION_REPLACEMENTS,
  AIGuardEvaluateAttributesResponse.JSON_PROPERTY_SCFW_FINDINGS,
  AIGuardEvaluateAttributesResponse.JSON_PROPERTY_SDS_FINDINGS,
  AIGuardEvaluateAttributesResponse.JSON_PROPERTY_TAG_PROBS,
  AIGuardEvaluateAttributesResponse.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AIGuardEvaluateAttributesResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACTION = "action";
  private AIGuardAction action;

  public static final String JSON_PROPERTY_GLOBAL_PROB = "global_prob";
  private Double globalProb;

  public static final String JSON_PROPERTY_IS_BLOCKING_ENABLED = "is_blocking_enabled";
  private Boolean isBlockingEnabled;

  public static final String JSON_PROPERTY_REASON = "reason";
  private String reason;

  public static final String JSON_PROPERTY_REDACTION_REPLACEMENTS = "redaction_replacements";
  private List<AIGuardRedactionReplacement> redactionReplacements = null;

  public static final String JSON_PROPERTY_SCFW_FINDINGS = "scfw_findings";
  private AIGuardScfwFindings scfwFindings;

  public static final String JSON_PROPERTY_SDS_FINDINGS = "sds_findings";
  private List<AIGuardSdsFinding> sdsFindings = null;

  public static final String JSON_PROPERTY_TAG_PROBS = "tag_probs";
  private Map<String, Double> tagProbs = new HashMap<String, Double>();

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = new ArrayList<>();

  public AIGuardEvaluateAttributesResponse() {}

  @JsonCreator
  public AIGuardEvaluateAttributesResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_ACTION) AIGuardAction action,
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_BLOCKING_ENABLED)
          Boolean isBlockingEnabled,
      @JsonProperty(required = true, value = JSON_PROPERTY_REASON) String reason,
      @JsonProperty(required = true, value = JSON_PROPERTY_TAG_PROBS) Map<String, Double> tagProbs,
      @JsonProperty(required = true, value = JSON_PROPERTY_TAGS) List<String> tags) {
    this.action = action;
    this.unparsed |= !action.isValid();
    this.isBlockingEnabled = isBlockingEnabled;
    this.reason = reason;
    this.tagProbs = tagProbs;
    if (tagProbs != null) {}
    this.tags = tags;
  }

  public AIGuardEvaluateAttributesResponse action(AIGuardAction action) {
    this.action = action;
    this.unparsed |= !action.isValid();
    return this;
  }

  /**
   * The recommended action for the evaluated conversation.
   *
   * @return action
   */
  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AIGuardAction getAction() {
    return action;
  }

  public void setAction(AIGuardAction action) {
    if (!action.isValid()) {
      this.unparsed = true;
    }
    this.action = action;
  }

  public AIGuardEvaluateAttributesResponse globalProb(Double globalProb) {
    this.globalProb = globalProb;
    return this;
  }

  /**
   * The global threat probability, between <code>0</code> and <code>1</code>. Included only when
   * computed.
   *
   * @return globalProb
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GLOBAL_PROB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getGlobalProb() {
    return globalProb;
  }

  public void setGlobalProb(Double globalProb) {
    this.globalProb = globalProb;
  }

  public AIGuardEvaluateAttributesResponse isBlockingEnabled(Boolean isBlockingEnabled) {
    this.isBlockingEnabled = isBlockingEnabled;
    return this;
  }

  /**
   * Whether blocking is enabled for the organization.
   *
   * @return isBlockingEnabled
   */
  @JsonProperty(JSON_PROPERTY_IS_BLOCKING_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getIsBlockingEnabled() {
    return isBlockingEnabled;
  }

  public void setIsBlockingEnabled(Boolean isBlockingEnabled) {
    this.isBlockingEnabled = isBlockingEnabled;
  }

  public AIGuardEvaluateAttributesResponse reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * The explanation for the recommended action, for logging rather than user-facing display.
   *
   * @return reason
   */
  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public AIGuardEvaluateAttributesResponse redactionReplacements(
      List<AIGuardRedactionReplacement> redactionReplacements) {
    this.redactionReplacements = redactionReplacements;
    if (redactionReplacements != null) {
      for (AIGuardRedactionReplacement item : redactionReplacements) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public AIGuardEvaluateAttributesResponse addRedactionReplacementsItem(
      AIGuardRedactionReplacement redactionReplacementsItem) {
    if (this.redactionReplacements == null) {
      this.redactionReplacements = new ArrayList<>();
    }
    this.redactionReplacements.add(redactionReplacementsItem);
    this.unparsed |= redactionReplacementsItem.unparsed;
    return this;
  }

  /**
   * The redacted replacements computed for the request. Included only when redaction applies.
   *
   * @return redactionReplacements
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REDACTION_REPLACEMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<AIGuardRedactionReplacement> getRedactionReplacements() {
    return redactionReplacements;
  }

  public void setRedactionReplacements(List<AIGuardRedactionReplacement> redactionReplacements) {
    this.redactionReplacements = redactionReplacements;
    if (redactionReplacements != null) {
      for (AIGuardRedactionReplacement item : redactionReplacements) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public AIGuardEvaluateAttributesResponse scfwFindings(AIGuardScfwFindings scfwFindings) {
    this.scfwFindings = scfwFindings;
    this.unparsed |= scfwFindings.unparsed;
    return this;
  }

  /**
   * The Supply Chain Firewall verdict for the version-pinned install packages found in the request.
   * Evaluation requires Supply Chain Firewall to be enabled for the organization and the caller to
   * have the <code>appsec_vm_read</code> permission. Without that permission, Supply Chain Firewall
   * evaluation is skipped; the AI Guard evaluation request itself is not rejected. Findings are
   * omitted when Supply Chain Firewall does not produce a result. The recommended action combines
   * the package outcomes. Confirmation support is inferred from the evaluator profile, not from a
   * separate confirmation-capability flag. By default, a non-empty <code>meta.coding_agent</code>
   * selects the coding-agent profile, which assumes the caller can ask for confirmation and retains
   * WARN in <code>recommended_action</code>. Omitting <code>meta.coding_agent</code> or setting it
   * to an empty string selects the default profile, which assumes the caller cannot ask for
   * confirmation and returns ALLOW instead of WARN in <code>recommended_action</code>. Package
   * outcomes still retain WARN, and BLOCK is never changed to ALLOW by this rule.
   *
   * @return scfwFindings
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCFW_FINDINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AIGuardScfwFindings getScfwFindings() {
    return scfwFindings;
  }

  public void setScfwFindings(AIGuardScfwFindings scfwFindings) {
    this.scfwFindings = scfwFindings;
    if (scfwFindings != null) {
      this.unparsed |= scfwFindings.unparsed;
    }
  }

  public AIGuardEvaluateAttributesResponse sdsFindings(List<AIGuardSdsFinding> sdsFindings) {
    this.sdsFindings = sdsFindings;
    if (sdsFindings != null) {
      for (AIGuardSdsFinding item : sdsFindings) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public AIGuardEvaluateAttributesResponse addSdsFindingsItem(AIGuardSdsFinding sdsFindingsItem) {
    if (this.sdsFindings == null) {
      this.sdsFindings = new ArrayList<>();
    }
    this.sdsFindings.add(sdsFindingsItem);
    this.unparsed |= sdsFindingsItem.unparsed;
    return this;
  }

  /**
   * The sensitive data findings from the Sensitive Data Scanner. Included only when findings exist.
   *
   * @return sdsFindings
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SDS_FINDINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<AIGuardSdsFinding> getSdsFindings() {
    return sdsFindings;
  }

  public void setSdsFindings(List<AIGuardSdsFinding> sdsFindings) {
    this.sdsFindings = sdsFindings;
    if (sdsFindings != null) {
      for (AIGuardSdsFinding item : sdsFindings) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public AIGuardEvaluateAttributesResponse tagProbs(Map<String, Double> tagProbs) {
    this.tagProbs = tagProbs;
    if (tagProbs != null) {}
    return this;
  }

  public AIGuardEvaluateAttributesResponse putTagProbsItem(String key, Double tagProbsItem) {
    this.tagProbs.put(key, tagProbsItem);
    return this;
  }

  /**
   * The detection confidence for each threat tag, between <code>0</code> and <code>1</code>. May be
   * null when the evaluation does not produce per-category scores.
   *
   * @return tagProbs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAG_PROBS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Map<String, Double> getTagProbs() {
    return tagProbs;
  }

  public void setTagProbs(Map<String, Double> tagProbs) {
    this.tagProbs = tagProbs;
  }

  public AIGuardEvaluateAttributesResponse tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public AIGuardEvaluateAttributesResponse addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * The threat tags detected in the conversation.
   *
   * @return tags
   */
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
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
   * @return AIGuardEvaluateAttributesResponse
   */
  @JsonAnySetter
  public AIGuardEvaluateAttributesResponse putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AIGuardEvaluateAttributesResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AIGuardEvaluateAttributesResponse aiGuardEvaluateAttributesResponse =
        (AIGuardEvaluateAttributesResponse) o;
    return Objects.equals(this.action, aiGuardEvaluateAttributesResponse.action)
        && Objects.equals(this.globalProb, aiGuardEvaluateAttributesResponse.globalProb)
        && Objects.equals(
            this.isBlockingEnabled, aiGuardEvaluateAttributesResponse.isBlockingEnabled)
        && Objects.equals(this.reason, aiGuardEvaluateAttributesResponse.reason)
        && Objects.equals(
            this.redactionReplacements, aiGuardEvaluateAttributesResponse.redactionReplacements)
        && Objects.equals(this.scfwFindings, aiGuardEvaluateAttributesResponse.scfwFindings)
        && Objects.equals(this.sdsFindings, aiGuardEvaluateAttributesResponse.sdsFindings)
        && Objects.equals(this.tagProbs, aiGuardEvaluateAttributesResponse.tagProbs)
        && Objects.equals(this.tags, aiGuardEvaluateAttributesResponse.tags)
        && Objects.equals(
            this.additionalProperties, aiGuardEvaluateAttributesResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        action,
        globalProb,
        isBlockingEnabled,
        reason,
        redactionReplacements,
        scfwFindings,
        sdsFindings,
        tagProbs,
        tags,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AIGuardEvaluateAttributesResponse {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    globalProb: ").append(toIndentedString(globalProb)).append("\n");
    sb.append("    isBlockingEnabled: ").append(toIndentedString(isBlockingEnabled)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    redactionReplacements: ")
        .append(toIndentedString(redactionReplacements))
        .append("\n");
    sb.append("    scfwFindings: ").append(toIndentedString(scfwFindings)).append("\n");
    sb.append("    sdsFindings: ").append(toIndentedString(sdsFindings)).append("\n");
    sb.append("    tagProbs: ").append(toIndentedString(tagProbs)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
