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

/** Attributes of investigation feedback. */
@JsonPropertyOrder({
  SecurityMonitoringSignalInvestigationFeedbackResponseAttributes.JSON_PROPERTY_FEEDBACK,
  SecurityMonitoringSignalInvestigationFeedbackResponseAttributes.JSON_PROPERTY_FEEDBACK_CONTENT,
  SecurityMonitoringSignalInvestigationFeedbackResponseAttributes.JSON_PROPERTY_INVESTIGATION_ID,
  SecurityMonitoringSignalInvestigationFeedbackResponseAttributes.JSON_PROPERTY_RATING,
  SecurityMonitoringSignalInvestigationFeedbackResponseAttributes.JSON_PROPERTY_SIGNAL_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringSignalInvestigationFeedbackResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FEEDBACK = "feedback";
  private String feedback;

  public static final String JSON_PROPERTY_FEEDBACK_CONTENT = "feedback_content";
  private List<SecurityMonitoringSignalInvestigationFeedbackSection> feedbackContent = null;

  public static final String JSON_PROPERTY_INVESTIGATION_ID = "investigation_id";
  private String investigationId;

  public static final String JSON_PROPERTY_RATING = "rating";
  private String rating;

  public static final String JSON_PROPERTY_SIGNAL_ID = "signal_id";
  private String signalId;

  public SecurityMonitoringSignalInvestigationFeedbackResponseAttributes() {}

  @JsonCreator
  public SecurityMonitoringSignalInvestigationFeedbackResponseAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_FEEDBACK) String feedback,
      @JsonProperty(required = true, value = JSON_PROPERTY_INVESTIGATION_ID) String investigationId,
      @JsonProperty(required = true, value = JSON_PROPERTY_SIGNAL_ID) String signalId) {
    this.feedback = feedback;
    this.investigationId = investigationId;
    this.signalId = signalId;
  }

  public SecurityMonitoringSignalInvestigationFeedbackResponseAttributes feedback(String feedback) {
    this.feedback = feedback;
    return this;
  }

  /**
   * The feedback text.
   *
   * @return feedback
   */
  @JsonProperty(JSON_PROPERTY_FEEDBACK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getFeedback() {
    return feedback;
  }

  public void setFeedback(String feedback) {
    this.feedback = feedback;
  }

  public SecurityMonitoringSignalInvestigationFeedbackResponseAttributes feedbackContent(
      List<SecurityMonitoringSignalInvestigationFeedbackSection> feedbackContent) {
    this.feedbackContent = feedbackContent;
    for (SecurityMonitoringSignalInvestigationFeedbackSection item : feedbackContent) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SecurityMonitoringSignalInvestigationFeedbackResponseAttributes addFeedbackContentItem(
      SecurityMonitoringSignalInvestigationFeedbackSection feedbackContentItem) {
    if (this.feedbackContent == null) {
      this.feedbackContent = new ArrayList<>();
    }
    this.feedbackContent.add(feedbackContentItem);
    this.unparsed |= feedbackContentItem.unparsed;
    return this;
  }

  /**
   * Structured feedback content.
   *
   * @return feedbackContent
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FEEDBACK_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SecurityMonitoringSignalInvestigationFeedbackSection> getFeedbackContent() {
    return feedbackContent;
  }

  public void setFeedbackContent(
      List<SecurityMonitoringSignalInvestigationFeedbackSection> feedbackContent) {
    this.feedbackContent = feedbackContent;
  }

  public SecurityMonitoringSignalInvestigationFeedbackResponseAttributes investigationId(
      String investigationId) {
    this.investigationId = investigationId;
    return this;
  }

  /**
   * The unique ID of the investigation.
   *
   * @return investigationId
   */
  @JsonProperty(JSON_PROPERTY_INVESTIGATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getInvestigationId() {
    return investigationId;
  }

  public void setInvestigationId(String investigationId) {
    this.investigationId = investigationId;
  }

  public SecurityMonitoringSignalInvestigationFeedbackResponseAttributes rating(String rating) {
    this.rating = rating;
    return this;
  }

  /**
   * The rating value.
   *
   * @return rating
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RATING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRating() {
    return rating;
  }

  public void setRating(String rating) {
    this.rating = rating;
  }

  public SecurityMonitoringSignalInvestigationFeedbackResponseAttributes signalId(String signalId) {
    this.signalId = signalId;
    return this;
  }

  /**
   * The unique ID of the security signal.
   *
   * @return signalId
   */
  @JsonProperty(JSON_PROPERTY_SIGNAL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSignalId() {
    return signalId;
  }

  public void setSignalId(String signalId) {
    this.signalId = signalId;
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
   * @return SecurityMonitoringSignalInvestigationFeedbackResponseAttributes
   */
  @JsonAnySetter
  public SecurityMonitoringSignalInvestigationFeedbackResponseAttributes putAdditionalProperty(
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

  /**
   * Return true if this SecurityMonitoringSignalInvestigationFeedbackResponseAttributes object is
   * equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringSignalInvestigationFeedbackResponseAttributes
        securityMonitoringSignalInvestigationFeedbackResponseAttributes =
            (SecurityMonitoringSignalInvestigationFeedbackResponseAttributes) o;
    return Objects.equals(
            this.feedback, securityMonitoringSignalInvestigationFeedbackResponseAttributes.feedback)
        && Objects.equals(
            this.feedbackContent,
            securityMonitoringSignalInvestigationFeedbackResponseAttributes.feedbackContent)
        && Objects.equals(
            this.investigationId,
            securityMonitoringSignalInvestigationFeedbackResponseAttributes.investigationId)
        && Objects.equals(
            this.rating, securityMonitoringSignalInvestigationFeedbackResponseAttributes.rating)
        && Objects.equals(
            this.signalId, securityMonitoringSignalInvestigationFeedbackResponseAttributes.signalId)
        && Objects.equals(
            this.additionalProperties,
            securityMonitoringSignalInvestigationFeedbackResponseAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        feedback, feedbackContent, investigationId, rating, signalId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringSignalInvestigationFeedbackResponseAttributes {\n");
    sb.append("    feedback: ").append(toIndentedString(feedback)).append("\n");
    sb.append("    feedbackContent: ").append(toIndentedString(feedbackContent)).append("\n");
    sb.append("    investigationId: ").append(toIndentedString(investigationId)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    signalId: ").append(toIndentedString(signalId)).append("\n");
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
