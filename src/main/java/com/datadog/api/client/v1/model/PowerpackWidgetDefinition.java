/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>The powerpack widget allows you to keep similar graphs together on your timeboard. Each group has a custom header, can hold one to many graphs, and is collapsible.</p>
 */
@JsonPropertyOrder({
  PowerpackWidgetDefinition.JSON_PROPERTY_BACKGROUND_COLOR,
  PowerpackWidgetDefinition.JSON_PROPERTY_BANNER_IMG,
  PowerpackWidgetDefinition.JSON_PROPERTY_POWERPACK_ID,
  PowerpackWidgetDefinition.JSON_PROPERTY_SHOW_TITLE,
  PowerpackWidgetDefinition.JSON_PROPERTY_TEMPLATE_VARIABLES,
  PowerpackWidgetDefinition.JSON_PROPERTY_TITLE,
  PowerpackWidgetDefinition.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class PowerpackWidgetDefinition {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_BACKGROUND_COLOR = "background_color";
  private String backgroundColor;

  public static final String JSON_PROPERTY_BANNER_IMG = "banner_img";
  private String bannerImg;

  public static final String JSON_PROPERTY_POWERPACK_ID = "powerpack_id";
  private String powerpackId;

  public static final String JSON_PROPERTY_SHOW_TITLE = "show_title";
  private Boolean showTitle = true;

  public static final String JSON_PROPERTY_TEMPLATE_VARIABLES = "template_variables";
  private PowerpackTemplateVariables templateVariables;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TYPE = "type";
  private PowerpackWidgetDefinitionType type = PowerpackWidgetDefinitionType.POWERPACK;

  public PowerpackWidgetDefinition() {}

  @JsonCreator
  public PowerpackWidgetDefinition(
            @JsonProperty(required=true, value=JSON_PROPERTY_POWERPACK_ID)String powerpackId,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)PowerpackWidgetDefinitionType type) {
        this.powerpackId = powerpackId;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public PowerpackWidgetDefinition backgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }

  /**
   * <p>Background color of the powerpack title.</p>
   * @return backgroundColor
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_BACKGROUND_COLOR)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getBackgroundColor() {
        return backgroundColor;
      }
  public void setBackgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
  }
  public PowerpackWidgetDefinition bannerImg(String bannerImg) {
    this.bannerImg = bannerImg;
    return this;
  }

  /**
   * <p>URL of image to display as a banner for the powerpack.</p>
   * @return bannerImg
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_BANNER_IMG)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getBannerImg() {
        return bannerImg;
      }
  public void setBannerImg(String bannerImg) {
    this.bannerImg = bannerImg;
  }
  public PowerpackWidgetDefinition powerpackId(String powerpackId) {
    this.powerpackId = powerpackId;
    return this;
  }

  /**
   * <p>UUID of the associated powerpack.</p>
   * @return powerpackId
  **/
      @JsonProperty(JSON_PROPERTY_POWERPACK_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getPowerpackId() {
        return powerpackId;
      }
  public void setPowerpackId(String powerpackId) {
    this.powerpackId = powerpackId;
  }
  public PowerpackWidgetDefinition showTitle(Boolean showTitle) {
    this.showTitle = showTitle;
    return this;
  }

  /**
   * <p>Whether to show the title or not.</p>
   * @return showTitle
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SHOW_TITLE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getShowTitle() {
        return showTitle;
      }
  public void setShowTitle(Boolean showTitle) {
    this.showTitle = showTitle;
  }
  public PowerpackWidgetDefinition templateVariables(PowerpackTemplateVariables templateVariables) {
    this.templateVariables = templateVariables;
    this.unparsed |= templateVariables.unparsed;
    return this;
  }

  /**
   * <p>Powerpack template variables.</p>
   * @return templateVariables
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TEMPLATE_VARIABLES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public PowerpackTemplateVariables getTemplateVariables() {
        return templateVariables;
      }
  public void setTemplateVariables(PowerpackTemplateVariables templateVariables) {
    this.templateVariables = templateVariables;
  }
  public PowerpackWidgetDefinition title(String title) {
    this.title = title;
    return this;
  }

  /**
   * <p>Title of the widget.</p>
   * @return title
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TITLE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getTitle() {
        return title;
      }
  public void setTitle(String title) {
    this.title = title;
  }
  public PowerpackWidgetDefinition type(PowerpackWidgetDefinitionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>Type of the powerpack widget.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public PowerpackWidgetDefinitionType getType() {
        return type;
      }
  public void setType(PowerpackWidgetDefinitionType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return PowerpackWidgetDefinition
   */
  @JsonAnySetter
  public PowerpackWidgetDefinition putAdditionalProperty(String key, Object value) {
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
   * Return true if this PowerpackWidgetDefinition object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PowerpackWidgetDefinition powerpackWidgetDefinition = (PowerpackWidgetDefinition) o;
    return Objects.equals(this.backgroundColor, powerpackWidgetDefinition.backgroundColor) && Objects.equals(this.bannerImg, powerpackWidgetDefinition.bannerImg) && Objects.equals(this.powerpackId, powerpackWidgetDefinition.powerpackId) && Objects.equals(this.showTitle, powerpackWidgetDefinition.showTitle) && Objects.equals(this.templateVariables, powerpackWidgetDefinition.templateVariables) && Objects.equals(this.title, powerpackWidgetDefinition.title) && Objects.equals(this.type, powerpackWidgetDefinition.type) && Objects.equals(this.additionalProperties, powerpackWidgetDefinition.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(backgroundColor,bannerImg,powerpackId,showTitle,templateVariables,title,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PowerpackWidgetDefinition {\n");
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
    sb.append("    bannerImg: ").append(toIndentedString(bannerImg)).append("\n");
    sb.append("    powerpackId: ").append(toIndentedString(powerpackId)).append("\n");
    sb.append("    showTitle: ").append(toIndentedString(showTitle)).append("\n");
    sb.append("    templateVariables: ").append(toIndentedString(templateVariables)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
