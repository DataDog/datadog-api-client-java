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

/** The result of the AI Guard evaluation. */
@JsonPropertyOrder({
  AIGuardEvaluateResponse.JSON_PROPERTY_ACTION,
  AIGuardEvaluateResponse.JSON_PROPERTY_GLOBAL_PROB,
  AIGuardEvaluateResponse.JSON_PROPERTY_IS_BLOCKING_ENABLED,
  AIGuardEvaluateResponse.JSON_PROPERTY_REASON,
  AIGuardEvaluateResponse.JSON_PROPERTY_SDS_FINDINGS,
  AIGuardEvaluateResponse.JSON_PROPERTY_TAG_PROBS,
  AIGuardEvaluateResponse.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AIGuardEvaluateResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACTION = "action";
  private AIGuardAction action;

  public static final String JSON_PROPERTY_GLOBAL_PROB = "global_prob";
  private Double globalProb;

  public static final String JSON_PROPERTY_IS_BLOCKING_ENABLED = "is_blocking_enabled";
  private Boolean isBlockingEnabled;

  public static final String JSON_PROPERTY_REASON = "reason";
  private String reason;

  public static final String JSON_PROPERTY_SDS_FINDINGS = "sds_findings";
  private List<AIGuardSdsFinding> sdsFindings = null;

  public static final String JSON_PROPERTY_TAG_PROBS = "tag_probs";
  private Map<String, Double> tagProbs = new HashMap<String, Double>();

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = new ArrayList<>();

  public AIGuardEvaluateResponse() {}

  @JsonCreator
  public AIGuardEvaluateResponse(
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
    this.tags = tags;
  }

  public AIGuardEvaluateResponse action(AIGuardAction action) {
    this.action = action;
    this.unparsed |= !action.isValid();
    return this;
  }

  /**
   * The action recommendation from the AI Guard evaluation.
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

  public AIGuardEvaluateResponse globalProb(Double globalProb) {
    this.globalProb = globalProb;
    return this;
  }

  /**
   * The overall threat probability score across all evaluated tags.
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

  public AIGuardEvaluateResponse isBlockingEnabled(Boolean isBlockingEnabled) {
    this.isBlockingEnabled = isBlockingEnabled;
    return this;
  }

  /**
   * Whether blocking mode is enabled for this organization.
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

  public AIGuardEvaluateResponse reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * A human-readable explanation of the action recommendation.
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

  public AIGuardEvaluateResponse sdsFindings(List<AIGuardSdsFinding> sdsFindings) {
    this.sdsFindings = sdsFindings;
    for (AIGuardSdsFinding item : sdsFindings) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public AIGuardEvaluateResponse addSdsFindingsItem(AIGuardSdsFinding sdsFindingsItem) {
    if (this.sdsFindings == null) {
      this.sdsFindings = new ArrayList<>();
    }
    this.sdsFindings.add(sdsFindingsItem);
    this.unparsed |= sdsFindingsItem.unparsed;
    return this;
  }

  /**
   * Sensitive data findings detected in the evaluated conversation.
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
  }

  public AIGuardEvaluateResponse tagProbs(Map<String, Double> tagProbs) {
    this.tagProbs = tagProbs;
    return this;
  }

  public AIGuardEvaluateResponse putTagProbsItem(String key, Double tagProbsItem) {
    this.tagProbs.put(key, tagProbsItem);
    return this;
  }

  /**
   * Probability scores for each evaluated threat tag.
   *
   * @return tagProbs
   */
  @JsonProperty(JSON_PROPERTY_TAG_PROBS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Map<String, Double> getTagProbs() {
    return tagProbs;
  }

  public void setTagProbs(Map<String, Double> tagProbs) {
    this.tagProbs = tagProbs;
  }

  public AIGuardEvaluateResponse tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public AIGuardEvaluateResponse addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Security threat tags detected in the evaluated conversation.
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
   * @return AIGuardEvaluateResponse
   */
  @JsonAnySetter
  public AIGuardEvaluateResponse putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AIGuardEvaluateResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AIGuardEvaluateResponse aiGuardEvaluateResponse = (AIGuardEvaluateResponse) o;
    return Objects.equals(this.action, aiGuardEvaluateResponse.action)
        && Objects.equals(this.globalProb, aiGuardEvaluateResponse.globalProb)
        && Objects.equals(this.isBlockingEnabled, aiGuardEvaluateResponse.isBlockingEnabled)
        && Objects.equals(this.reason, aiGuardEvaluateResponse.reason)
        && Objects.equals(this.sdsFindings, aiGuardEvaluateResponse.sdsFindings)
        && Objects.equals(this.tagProbs, aiGuardEvaluateResponse.tagProbs)
        && Objects.equals(this.tags, aiGuardEvaluateResponse.tags)
        && Objects.equals(this.additionalProperties, aiGuardEvaluateResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        action,
        globalProb,
        isBlockingEnabled,
        reason,
        sdsFindings,
        tagProbs,
        tags,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AIGuardEvaluateResponse {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    globalProb: ").append(toIndentedString(globalProb)).append("\n");
    sb.append("    isBlockingEnabled: ").append(toIndentedString(isBlockingEnabled)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
