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

/** The attributes for creating a sample log generation subscription. */
@JsonPropertyOrder({
  SampleLogGenerationSubscriptionCreateAttributes.JSON_PROPERTY_CONTENT_PACK_ID,
  SampleLogGenerationSubscriptionCreateAttributes.JSON_PROPERTY_DURATION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SampleLogGenerationSubscriptionCreateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONTENT_PACK_ID = "content_pack_id";
  private String contentPackId;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private SampleLogGenerationDuration duration = SampleLogGenerationDuration.THREE_DAYS;

  public SampleLogGenerationSubscriptionCreateAttributes() {}

  @JsonCreator
  public SampleLogGenerationSubscriptionCreateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CONTENT_PACK_ID) String contentPackId) {
    this.contentPackId = contentPackId;
  }

  public SampleLogGenerationSubscriptionCreateAttributes contentPackId(String contentPackId) {
    this.contentPackId = contentPackId;
    return this;
  }

  /**
   * The identifier of the Cloud SIEM content pack to subscribe to.
   *
   * @return contentPackId
   */
  @JsonProperty(JSON_PROPERTY_CONTENT_PACK_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getContentPackId() {
    return contentPackId;
  }

  public void setContentPackId(String contentPackId) {
    this.contentPackId = contentPackId;
  }

  public SampleLogGenerationSubscriptionCreateAttributes duration(
      SampleLogGenerationDuration duration) {
    this.duration = duration;
    this.unparsed |= !duration.isValid();
    return this;
  }

  /**
   * How long the subscription should remain active before expiring.
   *
   * @return duration
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SampleLogGenerationDuration getDuration() {
    return duration;
  }

  public void setDuration(SampleLogGenerationDuration duration) {
    if (!duration.isValid()) {
      this.unparsed = true;
    }
    this.duration = duration;
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
   * @return SampleLogGenerationSubscriptionCreateAttributes
   */
  @JsonAnySetter
  public SampleLogGenerationSubscriptionCreateAttributes putAdditionalProperty(
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

  /** Return true if this SampleLogGenerationSubscriptionCreateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SampleLogGenerationSubscriptionCreateAttributes
        sampleLogGenerationSubscriptionCreateAttributes =
            (SampleLogGenerationSubscriptionCreateAttributes) o;
    return Objects.equals(
            this.contentPackId, sampleLogGenerationSubscriptionCreateAttributes.contentPackId)
        && Objects.equals(this.duration, sampleLogGenerationSubscriptionCreateAttributes.duration)
        && Objects.equals(
            this.additionalProperties,
            sampleLogGenerationSubscriptionCreateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentPackId, duration, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SampleLogGenerationSubscriptionCreateAttributes {\n");
    sb.append("    contentPackId: ").append(toIndentedString(contentPackId)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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
