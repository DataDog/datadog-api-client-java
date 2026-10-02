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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** The feature flag's current staleness state and suggested actions. */
@JsonPropertyOrder({
  FeatureFlagStalenessDetails.JSON_PROPERTY_CODE_REFERENCES,
  FeatureFlagStalenessDetails.JSON_PROPERTY_DISMISSED_BY,
  FeatureFlagStalenessDetails.JSON_PROPERTY_ID,
  FeatureFlagStalenessDetails.JSON_PROPERTY_RECOMMENDED_ACTIONS,
  FeatureFlagStalenessDetails.JSON_PROPERTY_SKIP_STATE_CHECK_UNTIL,
  FeatureFlagStalenessDetails.JSON_PROPERTY_STALE_REASON,
  FeatureFlagStalenessDetails.JSON_PROPERTY_STALENESS_STATUS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FeatureFlagStalenessDetails {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CODE_REFERENCES = "code_references";
  private JsonNullable<List<FeatureFlagStalenessCodeReference>> codeReferences =
      JsonNullable.<List<FeatureFlagStalenessCodeReference>>undefined();

  public static final String JSON_PROPERTY_DISMISSED_BY = "dismissed_by";
  private JsonNullable<String> dismissedBy = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_RECOMMENDED_ACTIONS = "recommended_actions";
  private JsonNullable<List<FeatureFlagStalenessRecommendedAction>> recommendedActions =
      JsonNullable.<List<FeatureFlagStalenessRecommendedAction>>undefined();

  public static final String JSON_PROPERTY_SKIP_STATE_CHECK_UNTIL = "skip_state_check_until";
  private JsonNullable<OffsetDateTime> skipStateCheckUntil =
      JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_STALE_REASON = "stale_reason";
  private JsonNullable<String> staleReason = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_STALENESS_STATUS = "staleness_status";
  private String stalenessStatus;

  public FeatureFlagStalenessDetails codeReferences(
      List<FeatureFlagStalenessCodeReference> codeReferences) {
    this.codeReferences = JsonNullable.<List<FeatureFlagStalenessCodeReference>>of(codeReferences);
    return this;
  }

  public FeatureFlagStalenessDetails addCodeReferencesItem(
      FeatureFlagStalenessCodeReference codeReferencesItem) {
    if (this.codeReferences == null || !this.codeReferences.isPresent()) {
      this.codeReferences =
          JsonNullable.<List<FeatureFlagStalenessCodeReference>>of(new ArrayList<>());
    }
    try {
      this.codeReferences.get().add(codeReferencesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Repositories and files where the flag is referenced in source code.
   *
   * @return codeReferences
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<FeatureFlagStalenessCodeReference> getCodeReferences() {
    return codeReferences.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CODE_REFERENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<FeatureFlagStalenessCodeReference>> getCodeReferences_JsonNullable() {
    return codeReferences;
  }

  @JsonProperty(JSON_PROPERTY_CODE_REFERENCES)
  public void setCodeReferences_JsonNullable(
      JsonNullable<List<FeatureFlagStalenessCodeReference>> codeReferences) {
    this.codeReferences = codeReferences;
  }

  public void setCodeReferences(List<FeatureFlagStalenessCodeReference> codeReferences) {
    this.codeReferences = JsonNullable.<List<FeatureFlagStalenessCodeReference>>of(codeReferences);
  }

  public FeatureFlagStalenessDetails dismissedBy(String dismissedBy) {
    this.dismissedBy = JsonNullable.<String>of(dismissedBy);
    return this;
  }

  /**
   * The ID of the user who dismissed the staleness recommendation.
   *
   * @return dismissedBy
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getDismissedBy() {
    return dismissedBy.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DISMISSED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getDismissedBy_JsonNullable() {
    return dismissedBy;
  }

  @JsonProperty(JSON_PROPERTY_DISMISSED_BY)
  public void setDismissedBy_JsonNullable(JsonNullable<String> dismissedBy) {
    this.dismissedBy = dismissedBy;
  }

  public void setDismissedBy(String dismissedBy) {
    this.dismissedBy = JsonNullable.<String>of(dismissedBy);
  }

  public FeatureFlagStalenessDetails id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the feature flag whose staleness state is returned.
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

  public FeatureFlagStalenessDetails recommendedActions(
      List<FeatureFlagStalenessRecommendedAction> recommendedActions) {
    this.recommendedActions =
        JsonNullable.<List<FeatureFlagStalenessRecommendedAction>>of(recommendedActions);
    return this;
  }

  public FeatureFlagStalenessDetails addRecommendedActionsItem(
      FeatureFlagStalenessRecommendedAction recommendedActionsItem) {
    if (this.recommendedActions == null || !this.recommendedActions.isPresent()) {
      this.recommendedActions =
          JsonNullable.<List<FeatureFlagStalenessRecommendedAction>>of(new ArrayList<>());
    }
    try {
      this.recommendedActions.get().add(recommendedActionsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Suggested actions for the flag. The first action is the primary recommendation.
   *
   * @return recommendedActions
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<FeatureFlagStalenessRecommendedAction> getRecommendedActions() {
    return recommendedActions.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RECOMMENDED_ACTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<FeatureFlagStalenessRecommendedAction>>
      getRecommendedActions_JsonNullable() {
    return recommendedActions;
  }

  @JsonProperty(JSON_PROPERTY_RECOMMENDED_ACTIONS)
  public void setRecommendedActions_JsonNullable(
      JsonNullable<List<FeatureFlagStalenessRecommendedAction>> recommendedActions) {
    this.recommendedActions = recommendedActions;
  }

  public void setRecommendedActions(
      List<FeatureFlagStalenessRecommendedAction> recommendedActions) {
    this.recommendedActions =
        JsonNullable.<List<FeatureFlagStalenessRecommendedAction>>of(recommendedActions);
  }

  public FeatureFlagStalenessDetails skipStateCheckUntil(OffsetDateTime skipStateCheckUntil) {
    this.skipStateCheckUntil = JsonNullable.<OffsetDateTime>of(skipStateCheckUntil);
    return this;
  }

  /**
   * Time until which staleness checks are paused for the flag.
   *
   * @return skipStateCheckUntil
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getSkipStateCheckUntil() {
    return skipStateCheckUntil.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SKIP_STATE_CHECK_UNTIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getSkipStateCheckUntil_JsonNullable() {
    return skipStateCheckUntil;
  }

  @JsonProperty(JSON_PROPERTY_SKIP_STATE_CHECK_UNTIL)
  public void setSkipStateCheckUntil_JsonNullable(
      JsonNullable<OffsetDateTime> skipStateCheckUntil) {
    this.skipStateCheckUntil = skipStateCheckUntil;
  }

  public void setSkipStateCheckUntil(OffsetDateTime skipStateCheckUntil) {
    this.skipStateCheckUntil = JsonNullable.<OffsetDateTime>of(skipStateCheckUntil);
  }

  public FeatureFlagStalenessDetails staleReason(String staleReason) {
    this.staleReason = JsonNullable.<String>of(staleReason);
    return this;
  }

  /**
   * Why the flag is stale or has a manually selected state. Values include <code>FULLY_ROLLED_OUT
   * </code>, <code>NO_EVALUATIONS</code>, <code>NO_ACTIVITY</code>, and <code>USER_SET</code>.
   *
   * @return staleReason
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getStaleReason() {
    return staleReason.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STALE_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getStaleReason_JsonNullable() {
    return staleReason;
  }

  @JsonProperty(JSON_PROPERTY_STALE_REASON)
  public void setStaleReason_JsonNullable(JsonNullable<String> staleReason) {
    this.staleReason = staleReason;
  }

  public void setStaleReason(String staleReason) {
    this.staleReason = JsonNullable.<String>of(staleReason);
  }

  public FeatureFlagStalenessDetails stalenessStatus(String stalenessStatus) {
    this.stalenessStatus = stalenessStatus;
    return this;
  }

  /**
   * The current state, such as <code>ACTIVE</code>, <code>STALE</code>, or <code>PERMANENT</code>.
   *
   * @return stalenessStatus
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STALENESS_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStalenessStatus() {
    return stalenessStatus;
  }

  public void setStalenessStatus(String stalenessStatus) {
    this.stalenessStatus = stalenessStatus;
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
   * @return FeatureFlagStalenessDetails
   */
  @JsonAnySetter
  public FeatureFlagStalenessDetails putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FeatureFlagStalenessDetails object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureFlagStalenessDetails featureFlagStalenessDetails = (FeatureFlagStalenessDetails) o;
    return Objects.equals(this.codeReferences, featureFlagStalenessDetails.codeReferences)
        && Objects.equals(this.dismissedBy, featureFlagStalenessDetails.dismissedBy)
        && Objects.equals(this.id, featureFlagStalenessDetails.id)
        && Objects.equals(this.recommendedActions, featureFlagStalenessDetails.recommendedActions)
        && Objects.equals(this.skipStateCheckUntil, featureFlagStalenessDetails.skipStateCheckUntil)
        && Objects.equals(this.staleReason, featureFlagStalenessDetails.staleReason)
        && Objects.equals(this.stalenessStatus, featureFlagStalenessDetails.stalenessStatus)
        && Objects.equals(
            this.additionalProperties, featureFlagStalenessDetails.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        codeReferences,
        dismissedBy,
        id,
        recommendedActions,
        skipStateCheckUntil,
        staleReason,
        stalenessStatus,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureFlagStalenessDetails {\n");
    sb.append("    codeReferences: ").append(toIndentedString(codeReferences)).append("\n");
    sb.append("    dismissedBy: ").append(toIndentedString(dismissedBy)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    recommendedActions: ").append(toIndentedString(recommendedActions)).append("\n");
    sb.append("    skipStateCheckUntil: ")
        .append(toIndentedString(skipStateCheckUntil))
        .append("\n");
    sb.append("    staleReason: ").append(toIndentedString(staleReason)).append("\n");
    sb.append("    stalenessStatus: ").append(toIndentedString(stalenessStatus)).append("\n");
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
