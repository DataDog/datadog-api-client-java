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
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

/** Details about the feature flag's staleness status. */
@JsonPropertyOrder({
  FeatureFlagAttributesStalenessDetails.JSON_PROPERTY_CODE_REFERENCES,
  FeatureFlagAttributesStalenessDetails.JSON_PROPERTY_DISMISSED_BY,
  FeatureFlagAttributesStalenessDetails.JSON_PROPERTY_ID,
  FeatureFlagAttributesStalenessDetails.JSON_PROPERTY_RECOMMENDED_ACTIONS,
  FeatureFlagAttributesStalenessDetails.JSON_PROPERTY_SKIP_STATE_CHECK_UNTIL,
  FeatureFlagAttributesStalenessDetails.JSON_PROPERTY_STALE_REASON,
  FeatureFlagAttributesStalenessDetails.JSON_PROPERTY_STALENESS_STATUS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FeatureFlagAttributesStalenessDetails {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CODE_REFERENCES = "code_references";
  private JsonNullable<List<Map<String, Object>>> codeReferences =
      JsonNullable.<List<Map<String, Object>>>undefined();

  public static final String JSON_PROPERTY_DISMISSED_BY = "dismissed_by";
  private JsonNullable<UUID> dismissedBy = JsonNullable.<UUID>undefined();

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_RECOMMENDED_ACTIONS = "recommended_actions";
  private JsonNullable<List<Map<String, Object>>> recommendedActions =
      JsonNullable.<List<Map<String, Object>>>undefined();

  public static final String JSON_PROPERTY_SKIP_STATE_CHECK_UNTIL = "skip_state_check_until";
  private JsonNullable<OffsetDateTime> skipStateCheckUntil =
      JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_STALE_REASON = "stale_reason";
  private JsonNullable<String> staleReason = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_STALENESS_STATUS = "staleness_status";
  private String stalenessStatus;

  public FeatureFlagAttributesStalenessDetails codeReferences(
      List<Map<String, Object>> codeReferences) {
    this.codeReferences = JsonNullable.<List<Map<String, Object>>>of(codeReferences);
    return this;
  }

  public FeatureFlagAttributesStalenessDetails addCodeReferencesItem(
      Map<String, Object> codeReferencesItem) {
    if (this.codeReferences == null || !this.codeReferences.isPresent()) {
      this.codeReferences = JsonNullable.<List<Map<String, Object>>>of(new ArrayList<>());
    }
    try {
      this.codeReferences.get().add(codeReferencesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Code references associated with the feature flag.
   *
   * @return codeReferences
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<Map<String, Object>> getCodeReferences() {
    return codeReferences.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CODE_REFERENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<Map<String, Object>>> getCodeReferences_JsonNullable() {
    return codeReferences;
  }

  @JsonProperty(JSON_PROPERTY_CODE_REFERENCES)
  public void setCodeReferences_JsonNullable(
      JsonNullable<List<Map<String, Object>>> codeReferences) {
    this.codeReferences = codeReferences;
  }

  public void setCodeReferences(List<Map<String, Object>> codeReferences) {
    this.codeReferences = JsonNullable.<List<Map<String, Object>>>of(codeReferences);
  }

  public FeatureFlagAttributesStalenessDetails dismissedBy(UUID dismissedBy) {
    this.dismissedBy = JsonNullable.<UUID>of(dismissedBy);
    return this;
  }

  /**
   * The ID of the user who dismissed the staleness notification.
   *
   * @return dismissedBy
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public UUID getDismissedBy() {
    return dismissedBy.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DISMISSED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<UUID> getDismissedBy_JsonNullable() {
    return dismissedBy;
  }

  @JsonProperty(JSON_PROPERTY_DISMISSED_BY)
  public void setDismissedBy_JsonNullable(JsonNullable<UUID> dismissedBy) {
    this.dismissedBy = dismissedBy;
  }

  public void setDismissedBy(UUID dismissedBy) {
    this.dismissedBy = JsonNullable.<UUID>of(dismissedBy);
  }

  public FeatureFlagAttributesStalenessDetails id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier of the staleness details record.
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public FeatureFlagAttributesStalenessDetails recommendedActions(
      List<Map<String, Object>> recommendedActions) {
    this.recommendedActions = JsonNullable.<List<Map<String, Object>>>of(recommendedActions);
    return this;
  }

  public FeatureFlagAttributesStalenessDetails addRecommendedActionsItem(
      Map<String, Object> recommendedActionsItem) {
    if (this.recommendedActions == null || !this.recommendedActions.isPresent()) {
      this.recommendedActions = JsonNullable.<List<Map<String, Object>>>of(new ArrayList<>());
    }
    try {
      this.recommendedActions.get().add(recommendedActionsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Recommended actions to address the feature flag's staleness.
   *
   * @return recommendedActions
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<Map<String, Object>> getRecommendedActions() {
    return recommendedActions.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RECOMMENDED_ACTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<Map<String, Object>>> getRecommendedActions_JsonNullable() {
    return recommendedActions;
  }

  @JsonProperty(JSON_PROPERTY_RECOMMENDED_ACTIONS)
  public void setRecommendedActions_JsonNullable(
      JsonNullable<List<Map<String, Object>>> recommendedActions) {
    this.recommendedActions = recommendedActions;
  }

  public void setRecommendedActions(List<Map<String, Object>> recommendedActions) {
    this.recommendedActions = JsonNullable.<List<Map<String, Object>>>of(recommendedActions);
  }

  public FeatureFlagAttributesStalenessDetails skipStateCheckUntil(
      OffsetDateTime skipStateCheckUntil) {
    this.skipStateCheckUntil = JsonNullable.<OffsetDateTime>of(skipStateCheckUntil);
    return this;
  }

  /**
   * The timestamp until which staleness checks are skipped.
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

  public FeatureFlagAttributesStalenessDetails staleReason(String staleReason) {
    this.staleReason = JsonNullable.<String>of(staleReason);
    return this;
  }

  /**
   * The reason the feature flag is considered stale.
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

  public FeatureFlagAttributesStalenessDetails stalenessStatus(String stalenessStatus) {
    this.stalenessStatus = stalenessStatus;
    return this;
  }

  /**
   * The staleness status of the feature flag.
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
   * @return FeatureFlagAttributesStalenessDetails
   */
  @JsonAnySetter
  public FeatureFlagAttributesStalenessDetails putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FeatureFlagAttributesStalenessDetails object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureFlagAttributesStalenessDetails featureFlagAttributesStalenessDetails =
        (FeatureFlagAttributesStalenessDetails) o;
    return Objects.equals(this.codeReferences, featureFlagAttributesStalenessDetails.codeReferences)
        && Objects.equals(this.dismissedBy, featureFlagAttributesStalenessDetails.dismissedBy)
        && Objects.equals(this.id, featureFlagAttributesStalenessDetails.id)
        && Objects.equals(
            this.recommendedActions, featureFlagAttributesStalenessDetails.recommendedActions)
        && Objects.equals(
            this.skipStateCheckUntil, featureFlagAttributesStalenessDetails.skipStateCheckUntil)
        && Objects.equals(this.staleReason, featureFlagAttributesStalenessDetails.staleReason)
        && Objects.equals(
            this.stalenessStatus, featureFlagAttributesStalenessDetails.stalenessStatus)
        && Objects.equals(
            this.additionalProperties, featureFlagAttributesStalenessDetails.additionalProperties);
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
    sb.append("class FeatureFlagAttributesStalenessDetails {\n");
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
