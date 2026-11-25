/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  PowerpackBackendDefinition.JSON_PROPERTY_BACKGROUND_COLOR,
  PowerpackBackendDefinition.JSON_PROPERTY_BANNER_IMG,
  PowerpackBackendDefinition.JSON_PROPERTY_POWERPACK_ID,
  PowerpackBackendDefinition.JSON_PROPERTY_SHOW_TITLE,
  PowerpackBackendDefinition.JSON_PROPERTY_STATE,
  PowerpackBackendDefinition.JSON_PROPERTY_TEMPLATE_VARIABLES,
  PowerpackBackendDefinition.JSON_PROPERTY_TITLE,
  PowerpackBackendDefinition.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class PowerpackBackendDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BACKGROUND_COLOR = "background_color";
  private String backgroundColor;

  public static final String JSON_PROPERTY_BANNER_IMG = "banner_img";
  private String bannerImg;

  public static final String JSON_PROPERTY_POWERPACK_ID = "powerpack_id";
  private String powerpackId;

  public static final String JSON_PROPERTY_SHOW_TITLE = "show_title";
  private Boolean showTitle;

  public static final String JSON_PROPERTY_STATE = "state";
  private PowerpackState state;

  public static final String JSON_PROPERTY_TEMPLATE_VARIABLES = "template_variables";
  private PowerpackBackendTemplateVariables templateVariables;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TYPE = "type";
  private PowerpackBackendDefinitionType type;

  public PowerpackBackendDefinition() {}

  @JsonCreator
  public PowerpackBackendDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_POWERPACK_ID) String powerpackId,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          PowerpackBackendDefinitionType type) {
    this.powerpackId = powerpackId;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public PowerpackBackendDefinition backgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return backgroundColor
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BACKGROUND_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBackgroundColor() {
    return backgroundColor;
  }

  public void setBackgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
  }

  public PowerpackBackendDefinition bannerImg(String bannerImg) {
    this.bannerImg = bannerImg;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return bannerImg
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BANNER_IMG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBannerImg() {
    return bannerImg;
  }

  public void setBannerImg(String bannerImg) {
    this.bannerImg = bannerImg;
  }

  public PowerpackBackendDefinition powerpackId(String powerpackId) {
    this.powerpackId = powerpackId;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return powerpackId
   */
  @JsonProperty(JSON_PROPERTY_POWERPACK_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPowerpackId() {
    return powerpackId;
  }

  public void setPowerpackId(String powerpackId) {
    this.powerpackId = powerpackId;
  }

  public PowerpackBackendDefinition showTitle(Boolean showTitle) {
    this.showTitle = showTitle;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return showTitle
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHOW_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getShowTitle() {
    return showTitle;
  }

  public void setShowTitle(Boolean showTitle) {
    this.showTitle = showTitle;
  }

  public PowerpackBackendDefinition state(PowerpackState state) {
    this.state = state;
    this.unparsed |= !state.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return state
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public PowerpackState getState() {
    return state;
  }

  public void setState(PowerpackState state) {
    if (!state.isValid()) {
      this.unparsed = true;
    }
    this.state = state;
  }

  public PowerpackBackendDefinition templateVariables(
      PowerpackBackendTemplateVariables templateVariables) {
    this.templateVariables = templateVariables;
    this.unparsed |= templateVariables.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return templateVariables
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEMPLATE_VARIABLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public PowerpackBackendTemplateVariables getTemplateVariables() {
    return templateVariables;
  }

  public void setTemplateVariables(PowerpackBackendTemplateVariables templateVariables) {
    this.templateVariables = templateVariables;
    if (templateVariables != null) {
      this.unparsed |= templateVariables.unparsed;
    }
  }

  public PowerpackBackendDefinition title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return title
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public PowerpackBackendDefinition type(PowerpackBackendDefinitionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public PowerpackBackendDefinitionType getType() {
    return type;
  }

  public void setType(PowerpackBackendDefinitionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this PowerpackBackendDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PowerpackBackendDefinition powerpackBackendDefinition = (PowerpackBackendDefinition) o;
    return Objects.equals(this.backgroundColor, powerpackBackendDefinition.backgroundColor)
        && Objects.equals(this.bannerImg, powerpackBackendDefinition.bannerImg)
        && Objects.equals(this.powerpackId, powerpackBackendDefinition.powerpackId)
        && Objects.equals(this.showTitle, powerpackBackendDefinition.showTitle)
        && Objects.equals(this.state, powerpackBackendDefinition.state)
        && Objects.equals(this.templateVariables, powerpackBackendDefinition.templateVariables)
        && Objects.equals(this.title, powerpackBackendDefinition.title)
        && Objects.equals(this.type, powerpackBackendDefinition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        backgroundColor, bannerImg, powerpackId, showTitle, state, templateVariables, title, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PowerpackBackendDefinition {\n");
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
    sb.append("    bannerImg: ").append(toIndentedString(bannerImg)).append("\n");
    sb.append("    powerpackId: ").append(toIndentedString(powerpackId)).append("\n");
    sb.append("    showTitle: ").append(toIndentedString(showTitle)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    templateVariables: ").append(toIndentedString(templateVariables)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
