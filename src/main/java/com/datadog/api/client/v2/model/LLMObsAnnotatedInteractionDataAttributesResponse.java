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

/** Attributes containing an annotated interaction and its related events. */
@JsonPropertyOrder({
  LLMObsAnnotatedInteractionDataAttributesResponse.JSON_PROPERTY_ANNOTATED_INTERACTION,
  LLMObsAnnotatedInteractionDataAttributesResponse.JSON_PROPERTY_EVENTS,
  LLMObsAnnotatedInteractionDataAttributesResponse.JSON_PROPERTY_INTERACTION_TYPE,
  LLMObsAnnotatedInteractionDataAttributesResponse.JSON_PROPERTY_NEXT_CURSOR
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsAnnotatedInteractionDataAttributesResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ANNOTATED_INTERACTION = "annotated_interaction";
  private LLMObsAnnotatedInteractionItem annotatedInteraction;

  public static final String JSON_PROPERTY_EVENTS = "events";
  private List<LLMObsAnnotatedInteractionEvent> events = new ArrayList<>();

  public static final String JSON_PROPERTY_INTERACTION_TYPE = "interaction_type";
  private LLMObsAnyInteractionType interactionType;

  public static final String JSON_PROPERTY_NEXT_CURSOR = "next_cursor";
  private String nextCursor;

  public LLMObsAnnotatedInteractionDataAttributesResponse() {}

  @JsonCreator
  public LLMObsAnnotatedInteractionDataAttributesResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_ANNOTATED_INTERACTION)
          LLMObsAnnotatedInteractionItem annotatedInteraction,
      @JsonProperty(required = true, value = JSON_PROPERTY_EVENTS)
          List<LLMObsAnnotatedInteractionEvent> events,
      @JsonProperty(required = true, value = JSON_PROPERTY_INTERACTION_TYPE)
          LLMObsAnyInteractionType interactionType) {
    this.annotatedInteraction = annotatedInteraction;
    this.unparsed |= annotatedInteraction.unparsed;
    this.events = events;
    for (LLMObsAnnotatedInteractionEvent item : events) {
      this.unparsed |= item.unparsed;
    }
    this.interactionType = interactionType;
    this.unparsed |= !interactionType.isValid();
  }

  public LLMObsAnnotatedInteractionDataAttributesResponse annotatedInteraction(
      LLMObsAnnotatedInteractionItem annotatedInteraction) {
    this.annotatedInteraction = annotatedInteraction;
    this.unparsed |= annotatedInteraction.unparsed;
    return this;
  }

  /**
   * An interaction with its associated annotations.
   *
   * @return annotatedInteraction
   */
  @JsonProperty(JSON_PROPERTY_ANNOTATED_INTERACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LLMObsAnnotatedInteractionItem getAnnotatedInteraction() {
    return annotatedInteraction;
  }

  public void setAnnotatedInteraction(LLMObsAnnotatedInteractionItem annotatedInteraction) {
    this.annotatedInteraction = annotatedInteraction;
    if (annotatedInteraction != null) {
      this.unparsed |= annotatedInteraction.unparsed;
    }
  }

  public LLMObsAnnotatedInteractionDataAttributesResponse events(
      List<LLMObsAnnotatedInteractionEvent> events) {
    this.events = events;
    for (LLMObsAnnotatedInteractionEvent item : events) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public LLMObsAnnotatedInteractionDataAttributesResponse addEventsItem(
      LLMObsAnnotatedInteractionEvent eventsItem) {
    this.events.add(eventsItem);
    this.unparsed |= eventsItem.unparsed;
    return this;
  }

  /**
   * Page of events associated with the annotated interaction.
   *
   * @return events
   */
  @JsonProperty(JSON_PROPERTY_EVENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<LLMObsAnnotatedInteractionEvent> getEvents() {
    return events;
  }

  public void setEvents(List<LLMObsAnnotatedInteractionEvent> events) {
    this.events = events;
    if (events != null) {
      for (LLMObsAnnotatedInteractionEvent item : events) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public LLMObsAnnotatedInteractionDataAttributesResponse interactionType(
      LLMObsAnyInteractionType interactionType) {
    this.interactionType = interactionType;
    this.unparsed |= !interactionType.isValid();
    return this;
  }

  /**
   * Type of an annotated interaction.
   *
   * @return interactionType
   */
  @JsonProperty(JSON_PROPERTY_INTERACTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LLMObsAnyInteractionType getInteractionType() {
    return interactionType;
  }

  public void setInteractionType(LLMObsAnyInteractionType interactionType) {
    if (!interactionType.isValid()) {
      this.unparsed = true;
    }
    this.interactionType = interactionType;
  }

  public LLMObsAnnotatedInteractionDataAttributesResponse nextCursor(String nextCursor) {
    this.nextCursor = nextCursor;
    return this;
  }

  /**
   * Cursor to retrieve the next page of events. Absent when there are no more events.
   *
   * @return nextCursor
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NEXT_CURSOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getNextCursor() {
    return nextCursor;
  }

  public void setNextCursor(String nextCursor) {
    this.nextCursor = nextCursor;
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
   * @return LLMObsAnnotatedInteractionDataAttributesResponse
   */
  @JsonAnySetter
  public LLMObsAnnotatedInteractionDataAttributesResponse putAdditionalProperty(
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

  /** Return true if this LLMObsAnnotatedInteractionDataAttributesResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsAnnotatedInteractionDataAttributesResponse
        llmObsAnnotatedInteractionDataAttributesResponse =
            (LLMObsAnnotatedInteractionDataAttributesResponse) o;
    return Objects.equals(
            this.annotatedInteraction,
            llmObsAnnotatedInteractionDataAttributesResponse.annotatedInteraction)
        && Objects.equals(this.events, llmObsAnnotatedInteractionDataAttributesResponse.events)
        && Objects.equals(
            this.interactionType, llmObsAnnotatedInteractionDataAttributesResponse.interactionType)
        && Objects.equals(
            this.nextCursor, llmObsAnnotatedInteractionDataAttributesResponse.nextCursor)
        && Objects.equals(
            this.additionalProperties,
            llmObsAnnotatedInteractionDataAttributesResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        annotatedInteraction, events, interactionType, nextCursor, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsAnnotatedInteractionDataAttributesResponse {\n");
    sb.append("    annotatedInteraction: ")
        .append(toIndentedString(annotatedInteraction))
        .append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    interactionType: ").append(toIndentedString(interactionType)).append("\n");
    sb.append("    nextCursor: ").append(toIndentedString(nextCursor)).append("\n");
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
