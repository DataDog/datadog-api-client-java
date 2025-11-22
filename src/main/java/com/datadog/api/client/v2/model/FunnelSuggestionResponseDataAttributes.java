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

/** */
@JsonPropertyOrder({
  FunnelSuggestionResponseDataAttributes.JSON_PROPERTY_ACTIONS,
  FunnelSuggestionResponseDataAttributes.JSON_PROPERTY_VIEWS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FunnelSuggestionResponseDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACTIONS = "actions";
  private List<FunnelSuggestionResponseDataAttributesActionsItems> actions = null;

  public static final String JSON_PROPERTY_VIEWS = "views";
  private List<FunnelSuggestionResponseDataAttributesViewsItems> views = null;

  public FunnelSuggestionResponseDataAttributes actions(
      List<FunnelSuggestionResponseDataAttributesActionsItems> actions) {
    this.actions = actions;
    for (FunnelSuggestionResponseDataAttributesActionsItems item : actions) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public FunnelSuggestionResponseDataAttributes addActionsItem(
      FunnelSuggestionResponseDataAttributesActionsItems actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<>();
    }
    this.actions.add(actionsItem);
    this.unparsed |= actionsItem.unparsed;
    return this;
  }

  /**
   * Getactions
   *
   * @return actions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<FunnelSuggestionResponseDataAttributesActionsItems> getActions() {
    return actions;
  }

  public void setActions(List<FunnelSuggestionResponseDataAttributesActionsItems> actions) {
    this.actions = actions;
  }

  public FunnelSuggestionResponseDataAttributes views(
      List<FunnelSuggestionResponseDataAttributesViewsItems> views) {
    this.views = views;
    for (FunnelSuggestionResponseDataAttributesViewsItems item : views) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public FunnelSuggestionResponseDataAttributes addViewsItem(
      FunnelSuggestionResponseDataAttributesViewsItems viewsItem) {
    if (this.views == null) {
      this.views = new ArrayList<>();
    }
    this.views.add(viewsItem);
    this.unparsed |= viewsItem.unparsed;
    return this;
  }

  /**
   * Getviews
   *
   * @return views
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VIEWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<FunnelSuggestionResponseDataAttributesViewsItems> getViews() {
    return views;
  }

  public void setViews(List<FunnelSuggestionResponseDataAttributesViewsItems> views) {
    this.views = views;
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
   * @return FunnelSuggestionResponseDataAttributes
   */
  @JsonAnySetter
  public FunnelSuggestionResponseDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FunnelSuggestionResponseDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FunnelSuggestionResponseDataAttributes funnelSuggestionResponseDataAttributes =
        (FunnelSuggestionResponseDataAttributes) o;
    return Objects.equals(this.actions, funnelSuggestionResponseDataAttributes.actions)
        && Objects.equals(this.views, funnelSuggestionResponseDataAttributes.views)
        && Objects.equals(
            this.additionalProperties, funnelSuggestionResponseDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, views, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FunnelSuggestionResponseDataAttributes {\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    views: ").append(toIndentedString(views)).append("\n");
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
