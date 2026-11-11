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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Review details of a change request that needed approval. Present on review events, which <code>
 * include_suggestion_events</code> adds. Also present on a change that an approved change request
 * applied, even when <code>include_suggestion_events</code> is <code>false</code>.
 */
@JsonPropertyOrder({
  FeatureFlagChangeEventSuggestionReview.JSON_PROPERTY_LIFECYCLE_STATUS,
  FeatureFlagChangeEventSuggestionReview.JSON_PROPERTY_REQUESTER_COMMENT,
  FeatureFlagChangeEventSuggestionReview.JSON_PROPERTY_REVIEWER_COMMENT,
  FeatureFlagChangeEventSuggestionReview.JSON_PROPERTY_STATUS,
  FeatureFlagChangeEventSuggestionReview.JSON_PROPERTY_SUGGESTION_CREATED_BY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FeatureFlagChangeEventSuggestionReview {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_LIFECYCLE_STATUS = "lifecycle_status";
  private FeatureFlagChangeEventSuggestionLifecycleStatus lifecycleStatus;

  public static final String JSON_PROPERTY_REQUESTER_COMMENT = "requester_comment";
  private String requesterComment;

  public static final String JSON_PROPERTY_REVIEWER_COMMENT = "reviewer_comment";
  private String reviewerComment;

  public static final String JSON_PROPERTY_STATUS = "status";
  private FeatureFlagChangeEventSuggestionStatus status;

  public static final String JSON_PROPERTY_SUGGESTION_CREATED_BY = "suggestion_created_by";
  private String suggestionCreatedBy;

  public FeatureFlagChangeEventSuggestionReview() {}

  @JsonCreator
  public FeatureFlagChangeEventSuggestionReview(
      @JsonProperty(required = true, value = JSON_PROPERTY_LIFECYCLE_STATUS)
          FeatureFlagChangeEventSuggestionLifecycleStatus lifecycleStatus,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS)
          FeatureFlagChangeEventSuggestionStatus status) {
    this.lifecycleStatus = lifecycleStatus;
    this.unparsed |= !lifecycleStatus.isValid();
    this.status = status;
    this.unparsed |= !status.isValid();
  }

  public FeatureFlagChangeEventSuggestionReview lifecycleStatus(
      FeatureFlagChangeEventSuggestionLifecycleStatus lifecycleStatus) {
    this.lifecycleStatus = lifecycleStatus;
    this.unparsed |= !lifecycleStatus.isValid();
    return this;
  }

  /**
   * Where the change request is in its lifecycle.
   *
   * @return lifecycleStatus
   */
  @JsonProperty(JSON_PROPERTY_LIFECYCLE_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public FeatureFlagChangeEventSuggestionLifecycleStatus getLifecycleStatus() {
    return lifecycleStatus;
  }

  public void setLifecycleStatus(FeatureFlagChangeEventSuggestionLifecycleStatus lifecycleStatus) {
    if (!lifecycleStatus.isValid()) {
      this.unparsed = true;
    }
    this.lifecycleStatus = lifecycleStatus;
  }

  public FeatureFlagChangeEventSuggestionReview requesterComment(String requesterComment) {
    this.requesterComment = requesterComment;
    return this;
  }

  /**
   * The comment left by the person who requested the change.
   *
   * @return requesterComment
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUESTER_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRequesterComment() {
    return requesterComment;
  }

  public void setRequesterComment(String requesterComment) {
    this.requesterComment = requesterComment;
  }

  public FeatureFlagChangeEventSuggestionReview reviewerComment(String reviewerComment) {
    this.reviewerComment = reviewerComment;
    return this;
  }

  /**
   * The comment left by the reviewer.
   *
   * @return reviewerComment
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REVIEWER_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getReviewerComment() {
    return reviewerComment;
  }

  public void setReviewerComment(String reviewerComment) {
    this.reviewerComment = reviewerComment;
  }

  public FeatureFlagChangeEventSuggestionReview status(
      FeatureFlagChangeEventSuggestionStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * The review status of the change request.
   *
   * @return status
   */
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public FeatureFlagChangeEventSuggestionStatus getStatus() {
    return status;
  }

  public void setStatus(FeatureFlagChangeEventSuggestionStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
  }

  public FeatureFlagChangeEventSuggestionReview suggestionCreatedBy(String suggestionCreatedBy) {
    this.suggestionCreatedBy = suggestionCreatedBy;
    return this;
  }

  /**
   * The ID of the user who requested the change.
   *
   * @return suggestionCreatedBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUGGESTION_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSuggestionCreatedBy() {
    return suggestionCreatedBy;
  }

  public void setSuggestionCreatedBy(String suggestionCreatedBy) {
    this.suggestionCreatedBy = suggestionCreatedBy;
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
   * @return FeatureFlagChangeEventSuggestionReview
   */
  @JsonAnySetter
  public FeatureFlagChangeEventSuggestionReview putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FeatureFlagChangeEventSuggestionReview object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureFlagChangeEventSuggestionReview featureFlagChangeEventSuggestionReview =
        (FeatureFlagChangeEventSuggestionReview) o;
    return Objects.equals(
            this.lifecycleStatus, featureFlagChangeEventSuggestionReview.lifecycleStatus)
        && Objects.equals(
            this.requesterComment, featureFlagChangeEventSuggestionReview.requesterComment)
        && Objects.equals(
            this.reviewerComment, featureFlagChangeEventSuggestionReview.reviewerComment)
        && Objects.equals(this.status, featureFlagChangeEventSuggestionReview.status)
        && Objects.equals(
            this.suggestionCreatedBy, featureFlagChangeEventSuggestionReview.suggestionCreatedBy)
        && Objects.equals(
            this.additionalProperties, featureFlagChangeEventSuggestionReview.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        lifecycleStatus,
        requesterComment,
        reviewerComment,
        status,
        suggestionCreatedBy,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureFlagChangeEventSuggestionReview {\n");
    sb.append("    lifecycleStatus: ").append(toIndentedString(lifecycleStatus)).append("\n");
    sb.append("    requesterComment: ").append(toIndentedString(requesterComment)).append("\n");
    sb.append("    reviewerComment: ").append(toIndentedString(reviewerComment)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    suggestionCreatedBy: ")
        .append(toIndentedString(suggestionCreatedBy))
        .append("\n");
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
