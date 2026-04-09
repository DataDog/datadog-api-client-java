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

/** Attributes for creating a secure embed shared dashboard. */
@JsonPropertyOrder({
  SecureEmbedCreateRequestAttributes.JSON_PROPERTY_GLOBAL_TIME,
  SecureEmbedCreateRequestAttributes.JSON_PROPERTY_GLOBAL_TIME_SELECTABLE,
  SecureEmbedCreateRequestAttributes.JSON_PROPERTY_SELECTABLE_TEMPLATE_VARS,
  SecureEmbedCreateRequestAttributes.JSON_PROPERTY_STATUS,
  SecureEmbedCreateRequestAttributes.JSON_PROPERTY_TITLE,
  SecureEmbedCreateRequestAttributes.JSON_PROPERTY_VIEWING_PREFERENCES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecureEmbedCreateRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_GLOBAL_TIME = "global_time";
  private SecureEmbedGlobalTime globalTime;

  public static final String JSON_PROPERTY_GLOBAL_TIME_SELECTABLE = "global_time_selectable";
  private Boolean globalTimeSelectable;

  public static final String JSON_PROPERTY_SELECTABLE_TEMPLATE_VARS = "selectable_template_vars";
  private List<SecureEmbedSelectableTemplateVariable> selectableTemplateVars = new ArrayList<>();

  public static final String JSON_PROPERTY_STATUS = "status";
  private SecureEmbedStatus status;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_VIEWING_PREFERENCES = "viewing_preferences";
  private SecureEmbedViewingPreferences viewingPreferences;

  public SecureEmbedCreateRequestAttributes() {}

  @JsonCreator
  public SecureEmbedCreateRequestAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_GLOBAL_TIME)
          SecureEmbedGlobalTime globalTime,
      @JsonProperty(required = true, value = JSON_PROPERTY_GLOBAL_TIME_SELECTABLE)
          Boolean globalTimeSelectable,
      @JsonProperty(required = true, value = JSON_PROPERTY_SELECTABLE_TEMPLATE_VARS)
          List<SecureEmbedSelectableTemplateVariable> selectableTemplateVars,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS) SecureEmbedStatus status,
      @JsonProperty(required = true, value = JSON_PROPERTY_TITLE) String title,
      @JsonProperty(required = true, value = JSON_PROPERTY_VIEWING_PREFERENCES)
          SecureEmbedViewingPreferences viewingPreferences) {
    this.globalTime = globalTime;
    this.unparsed |= globalTime.unparsed;
    this.globalTimeSelectable = globalTimeSelectable;
    this.selectableTemplateVars = selectableTemplateVars;
    this.status = status;
    this.unparsed |= !status.isValid();
    this.title = title;
    this.viewingPreferences = viewingPreferences;
    this.unparsed |= viewingPreferences.unparsed;
  }

  public SecureEmbedCreateRequestAttributes globalTime(SecureEmbedGlobalTime globalTime) {
    this.globalTime = globalTime;
    this.unparsed |= globalTime.unparsed;
    return this;
  }

  /**
   * Default time range configuration for the secure embed.
   *
   * @return globalTime
   */
  @JsonProperty(JSON_PROPERTY_GLOBAL_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SecureEmbedGlobalTime getGlobalTime() {
    return globalTime;
  }

  public void setGlobalTime(SecureEmbedGlobalTime globalTime) {
    this.globalTime = globalTime;
  }

  public SecureEmbedCreateRequestAttributes globalTimeSelectable(Boolean globalTimeSelectable) {
    this.globalTimeSelectable = globalTimeSelectable;
    return this;
  }

  /**
   * Whether viewers can change the time range.
   *
   * @return globalTimeSelectable
   */
  @JsonProperty(JSON_PROPERTY_GLOBAL_TIME_SELECTABLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getGlobalTimeSelectable() {
    return globalTimeSelectable;
  }

  public void setGlobalTimeSelectable(Boolean globalTimeSelectable) {
    this.globalTimeSelectable = globalTimeSelectable;
  }

  public SecureEmbedCreateRequestAttributes selectableTemplateVars(
      List<SecureEmbedSelectableTemplateVariable> selectableTemplateVars) {
    this.selectableTemplateVars = selectableTemplateVars;
    for (SecureEmbedSelectableTemplateVariable item : selectableTemplateVars) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SecureEmbedCreateRequestAttributes addSelectableTemplateVarsItem(
      SecureEmbedSelectableTemplateVariable selectableTemplateVarsItem) {
    this.selectableTemplateVars.add(selectableTemplateVarsItem);
    this.unparsed |= selectableTemplateVarsItem.unparsed;
    return this;
  }

  /**
   * Template variables viewers can modify.
   *
   * @return selectableTemplateVars
   */
  @JsonProperty(JSON_PROPERTY_SELECTABLE_TEMPLATE_VARS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<SecureEmbedSelectableTemplateVariable> getSelectableTemplateVars() {
    return selectableTemplateVars;
  }

  public void setSelectableTemplateVars(
      List<SecureEmbedSelectableTemplateVariable> selectableTemplateVars) {
    this.selectableTemplateVars = selectableTemplateVars;
  }

  public SecureEmbedCreateRequestAttributes status(SecureEmbedStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * The status of the secure embed share. Active means the shared dashboard is available. Paused
   * means it is not.
   *
   * @return status
   */
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SecureEmbedStatus getStatus() {
    return status;
  }

  public void setStatus(SecureEmbedStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
  }

  public SecureEmbedCreateRequestAttributes title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Display title for the shared dashboard.
   *
   * @return title
   */
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public SecureEmbedCreateRequestAttributes viewingPreferences(
      SecureEmbedViewingPreferences viewingPreferences) {
    this.viewingPreferences = viewingPreferences;
    this.unparsed |= viewingPreferences.unparsed;
    return this;
  }

  /**
   * Display settings for the secure embed shared dashboard.
   *
   * @return viewingPreferences
   */
  @JsonProperty(JSON_PROPERTY_VIEWING_PREFERENCES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SecureEmbedViewingPreferences getViewingPreferences() {
    return viewingPreferences;
  }

  public void setViewingPreferences(SecureEmbedViewingPreferences viewingPreferences) {
    this.viewingPreferences = viewingPreferences;
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
   * @return SecureEmbedCreateRequestAttributes
   */
  @JsonAnySetter
  public SecureEmbedCreateRequestAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SecureEmbedCreateRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecureEmbedCreateRequestAttributes secureEmbedCreateRequestAttributes =
        (SecureEmbedCreateRequestAttributes) o;
    return Objects.equals(this.globalTime, secureEmbedCreateRequestAttributes.globalTime)
        && Objects.equals(
            this.globalTimeSelectable, secureEmbedCreateRequestAttributes.globalTimeSelectable)
        && Objects.equals(
            this.selectableTemplateVars, secureEmbedCreateRequestAttributes.selectableTemplateVars)
        && Objects.equals(this.status, secureEmbedCreateRequestAttributes.status)
        && Objects.equals(this.title, secureEmbedCreateRequestAttributes.title)
        && Objects.equals(
            this.viewingPreferences, secureEmbedCreateRequestAttributes.viewingPreferences)
        && Objects.equals(
            this.additionalProperties, secureEmbedCreateRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        globalTime,
        globalTimeSelectable,
        selectableTemplateVars,
        status,
        title,
        viewingPreferences,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecureEmbedCreateRequestAttributes {\n");
    sb.append("    globalTime: ").append(toIndentedString(globalTime)).append("\n");
    sb.append("    globalTimeSelectable: ")
        .append(toIndentedString(globalTimeSelectable))
        .append("\n");
    sb.append("    selectableTemplateVars: ")
        .append(toIndentedString(selectableTemplateVars))
        .append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    viewingPreferences: ").append(toIndentedString(viewingPreferences)).append("\n");
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
