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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Attributes for updating an Agent Observability annotation queue. All fields are optional. */
@JsonPropertyOrder({
  LLMObsAnnotationQueueUpdateDataAttributesRequest.JSON_PROPERTY_ANNOTATION_SCHEMA,
  LLMObsAnnotationQueueUpdateDataAttributesRequest.JSON_PROPERTY_DESCRIPTION,
  LLMObsAnnotationQueueUpdateDataAttributesRequest.JSON_PROPERTY_NAME,
  LLMObsAnnotationQueueUpdateDataAttributesRequest.JSON_PROPERTY_RESTRICT_TO_ASSIGNEES,
  LLMObsAnnotationQueueUpdateDataAttributesRequest.JSON_PROPERTY_RESTRICT_TO_REVIEWERS,
  LLMObsAnnotationQueueUpdateDataAttributesRequest.JSON_PROPERTY_REVIEWER_EMAILS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsAnnotationQueueUpdateDataAttributesRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ANNOTATION_SCHEMA = "annotation_schema";
  private LLMObsAnnotationSchema annotationSchema;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_RESTRICT_TO_ASSIGNEES = "restrict_to_assignees";
  private Boolean restrictToAssignees;

  public static final String JSON_PROPERTY_RESTRICT_TO_REVIEWERS = "restrict_to_reviewers";
  private Boolean restrictToReviewers;

  public static final String JSON_PROPERTY_REVIEWER_EMAILS = "reviewer_emails";
  private List<String> reviewerEmails = null;

  public LLMObsAnnotationQueueUpdateDataAttributesRequest annotationSchema(
      LLMObsAnnotationSchema annotationSchema) {
    this.annotationSchema = annotationSchema;
    this.unparsed |= annotationSchema.unparsed;
    return this;
  }

  /**
   * Schema defining the labels for an annotation queue.
   *
   * @return annotationSchema
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANNOTATION_SCHEMA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LLMObsAnnotationSchema getAnnotationSchema() {
    return annotationSchema;
  }

  public void setAnnotationSchema(LLMObsAnnotationSchema annotationSchema) {
    this.annotationSchema = annotationSchema;
    if (annotationSchema != null) {
      this.unparsed |= annotationSchema.unparsed;
    }
  }

  public LLMObsAnnotationQueueUpdateDataAttributesRequest description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Updated description of the annotation queue.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LLMObsAnnotationQueueUpdateDataAttributesRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Updated name of the annotation queue.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LLMObsAnnotationQueueUpdateDataAttributesRequest restrictToAssignees(
      Boolean restrictToAssignees) {
    this.restrictToAssignees = restrictToAssignees;
    return this;
  }

  /**
   * Whether annotation access is restricted to assigned users.
   *
   * @return restrictToAssignees
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESTRICT_TO_ASSIGNEES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getRestrictToAssignees() {
    return restrictToAssignees;
  }

  public void setRestrictToAssignees(Boolean restrictToAssignees) {
    this.restrictToAssignees = restrictToAssignees;
  }

  public LLMObsAnnotationQueueUpdateDataAttributesRequest restrictToReviewers(
      Boolean restrictToReviewers) {
    this.restrictToReviewers = restrictToReviewers;
    return this;
  }

  /**
   * Whether annotation access is restricted to queue reviewers.
   *
   * @return restrictToReviewers
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESTRICT_TO_REVIEWERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getRestrictToReviewers() {
    return restrictToReviewers;
  }

  public void setRestrictToReviewers(Boolean restrictToReviewers) {
    this.restrictToReviewers = restrictToReviewers;
  }

  public LLMObsAnnotationQueueUpdateDataAttributesRequest reviewerEmails(
      List<String> reviewerEmails) {
    this.reviewerEmails = reviewerEmails;
    return this;
  }

  public LLMObsAnnotationQueueUpdateDataAttributesRequest addReviewerEmailsItem(
      String reviewerEmailsItem) {
    if (this.reviewerEmails == null) {
      this.reviewerEmails = new ArrayList<>();
    }
    this.reviewerEmails.add(reviewerEmailsItem);
    return this;
  }

  /**
   * Updated email addresses of reviewers who can access the annotation queue.
   *
   * @return reviewerEmails
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REVIEWER_EMAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getReviewerEmails() {
    return reviewerEmails;
  }

  public void setReviewerEmails(List<String> reviewerEmails) {
    this.reviewerEmails = reviewerEmails;
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
   * @return LLMObsAnnotationQueueUpdateDataAttributesRequest
   */
  @JsonAnySetter
  public LLMObsAnnotationQueueUpdateDataAttributesRequest putAdditionalProperty(
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

  /** Return true if this LLMObsAnnotationQueueUpdateDataAttributesRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsAnnotationQueueUpdateDataAttributesRequest
        llmObsAnnotationQueueUpdateDataAttributesRequest =
            (LLMObsAnnotationQueueUpdateDataAttributesRequest) o;
    return Objects.equals(
            this.annotationSchema,
            llmObsAnnotationQueueUpdateDataAttributesRequest.annotationSchema)
        && Objects.equals(
            this.description, llmObsAnnotationQueueUpdateDataAttributesRequest.description)
        && Objects.equals(this.name, llmObsAnnotationQueueUpdateDataAttributesRequest.name)
        && Objects.equals(
            this.restrictToAssignees,
            llmObsAnnotationQueueUpdateDataAttributesRequest.restrictToAssignees)
        && Objects.equals(
            this.restrictToReviewers,
            llmObsAnnotationQueueUpdateDataAttributesRequest.restrictToReviewers)
        && Objects.equals(
            this.reviewerEmails, llmObsAnnotationQueueUpdateDataAttributesRequest.reviewerEmails)
        && Objects.equals(
            this.additionalProperties,
            llmObsAnnotationQueueUpdateDataAttributesRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        annotationSchema,
        description,
        name,
        restrictToAssignees,
        restrictToReviewers,
        reviewerEmails,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsAnnotationQueueUpdateDataAttributesRequest {\n");
    sb.append("    annotationSchema: ").append(toIndentedString(annotationSchema)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    restrictToAssignees: ")
        .append(toIndentedString(restrictToAssignees))
        .append("\n");
    sb.append("    restrictToReviewers: ")
        .append(toIndentedString(restrictToReviewers))
        .append("\n");
    sb.append("    reviewerEmails: ").append(toIndentedString(reviewerEmails)).append("\n");
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
