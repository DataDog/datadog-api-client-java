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

/** Attributes for investigation feedback. */
@JsonPropertyOrder({
  SecurityMonitoringSignalInvestigationFeedbackRequestAttributes.JSON_PROPERTY_FEEDBACK,
  SecurityMonitoringSignalInvestigationFeedbackRequestAttributes.JSON_PROPERTY_FEEDBACK_CONTENT,
  SecurityMonitoringSignalInvestigationFeedbackRequestAttributes.JSON_PROPERTY_INCOMPLETE,
  SecurityMonitoringSignalInvestigationFeedbackRequestAttributes.JSON_PROPERTY_RATING,
  SecurityMonitoringSignalInvestigationFeedbackRequestAttributes.JSON_PROPERTY_SIGNAL_ID,
  SecurityMonitoringSignalInvestigationFeedbackRequestAttributes.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringSignalInvestigationFeedbackRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FEEDBACK = "feedback";
  private String feedback;

  public static final String JSON_PROPERTY_FEEDBACK_CONTENT = "feedback_content";
  private List<SecurityMonitoringSignalInvestigationFeedbackSection> feedbackContent = null;

  public static final String JSON_PROPERTY_INCOMPLETE = "incomplete";
  private Boolean incomplete;

  public static final String JSON_PROPERTY_RATING = "rating";
  private String rating;

  public static final String JSON_PROPERTY_SIGNAL_ID = "signal_id";
  private String signalId;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public SecurityMonitoringSignalInvestigationFeedbackRequestAttributes() {}

  @JsonCreator
  public SecurityMonitoringSignalInvestigationFeedbackRequestAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_FEEDBACK) String feedback,
      @JsonProperty(required = true, value = JSON_PROPERTY_SIGNAL_ID) String signalId) {
    this.feedback = feedback;
    this.signalId = signalId;
  }

  public SecurityMonitoringSignalInvestigationFeedbackRequestAttributes feedback(String feedback) {
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

  public SecurityMonitoringSignalInvestigationFeedbackRequestAttributes feedbackContent(
      List<SecurityMonitoringSignalInvestigationFeedbackSection> feedbackContent) {
    this.feedbackContent = feedbackContent;
    for (SecurityMonitoringSignalInvestigationFeedbackSection item : feedbackContent) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SecurityMonitoringSignalInvestigationFeedbackRequestAttributes addFeedbackContentItem(
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

  public SecurityMonitoringSignalInvestigationFeedbackRequestAttributes incomplete(
      Boolean incomplete) {
    this.incomplete = incomplete;
    return this;
  }

  /**
   * Whether the feedback is incomplete.
   *
   * @return incomplete
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCOMPLETE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIncomplete() {
    return incomplete;
  }

  public void setIncomplete(Boolean incomplete) {
    this.incomplete = incomplete;
  }

  public SecurityMonitoringSignalInvestigationFeedbackRequestAttributes rating(String rating) {
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

  public SecurityMonitoringSignalInvestigationFeedbackRequestAttributes signalId(String signalId) {
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

  public SecurityMonitoringSignalInvestigationFeedbackRequestAttributes type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of feedback.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
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
   * @return SecurityMonitoringSignalInvestigationFeedbackRequestAttributes
   */
  @JsonAnySetter
  public SecurityMonitoringSignalInvestigationFeedbackRequestAttributes putAdditionalProperty(
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
   * Return true if this SecurityMonitoringSignalInvestigationFeedbackRequestAttributes object is
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
    SecurityMonitoringSignalInvestigationFeedbackRequestAttributes
        securityMonitoringSignalInvestigationFeedbackRequestAttributes =
            (SecurityMonitoringSignalInvestigationFeedbackRequestAttributes) o;
    return Objects.equals(
            this.feedback, securityMonitoringSignalInvestigationFeedbackRequestAttributes.feedback)
        && Objects.equals(
            this.feedbackContent,
            securityMonitoringSignalInvestigationFeedbackRequestAttributes.feedbackContent)
        && Objects.equals(
            this.incomplete,
            securityMonitoringSignalInvestigationFeedbackRequestAttributes.incomplete)
        && Objects.equals(
            this.rating, securityMonitoringSignalInvestigationFeedbackRequestAttributes.rating)
        && Objects.equals(
            this.signalId, securityMonitoringSignalInvestigationFeedbackRequestAttributes.signalId)
        && Objects.equals(
            this.type, securityMonitoringSignalInvestigationFeedbackRequestAttributes.type)
        && Objects.equals(
            this.additionalProperties,
            securityMonitoringSignalInvestigationFeedbackRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        feedback, feedbackContent, incomplete, rating, signalId, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringSignalInvestigationFeedbackRequestAttributes {\n");
    sb.append("    feedback: ").append(toIndentedString(feedback)).append("\n");
    sb.append("    feedbackContent: ").append(toIndentedString(feedbackContent)).append("\n");
    sb.append("    incomplete: ").append(toIndentedString(incomplete)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    signalId: ").append(toIndentedString(signalId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
