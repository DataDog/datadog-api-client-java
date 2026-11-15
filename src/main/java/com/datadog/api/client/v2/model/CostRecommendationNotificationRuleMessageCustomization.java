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

/**
 * Which sections the digest shows. Sent as a whole: sections left out of a request use their
 * defaults, which show everything.
 */
@JsonPropertyOrder({
  CostRecommendationNotificationRuleMessageCustomization.JSON_PROPERTY_ACTIONS,
  CostRecommendationNotificationRuleMessageCustomization.JSON_PROPERTY_HEADER,
  CostRecommendationNotificationRuleMessageCustomization.JSON_PROPERTY_INCLUDE_TAGS,
  CostRecommendationNotificationRuleMessageCustomization.JSON_PROPERTY_MODE,
  CostRecommendationNotificationRuleMessageCustomization.JSON_PROPERTY_PER_REC
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CostRecommendationNotificationRuleMessageCustomization {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACTIONS = "actions";
  private CostRecommendationNotificationRuleMessageActions actions;

  public static final String JSON_PROPERTY_HEADER = "header";
  private CostRecommendationNotificationRuleMessageCustomizationHeader header;

  public static final String JSON_PROPERTY_INCLUDE_TAGS = "include_tags";
  private List<String> includeTags = null;

  public static final String JSON_PROPERTY_MODE = "mode";
  private CostRecommendationNotificationRuleMessageCustomizationMode mode;

  public static final String JSON_PROPERTY_PER_REC = "per_rec";
  private CostRecommendationNotificationRuleMessageCustomizationPerRec perRec;

  public CostRecommendationNotificationRuleMessageCustomization actions(
      CostRecommendationNotificationRuleMessageActions actions) {
    this.actions = actions;
    this.unparsed |= actions.unparsed;
    return this;
  }

  /**
   * Links the digest shows. <code>view_in_ccm</code> is the link to review the recommendations in
   * Cloud Cost Management.
   *
   * @return actions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CostRecommendationNotificationRuleMessageActions getActions() {
    return actions;
  }

  public void setActions(CostRecommendationNotificationRuleMessageActions actions) {
    this.actions = actions;
    if (actions != null) {
      this.unparsed |= actions.unparsed;
    }
  }

  public CostRecommendationNotificationRuleMessageCustomization header(
      CostRecommendationNotificationRuleMessageCustomizationHeader header) {
    this.header = header;
    this.unparsed |= header.unparsed;
    return this;
  }

  /**
   * What the digest header shows.
   *
   * @return header
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEADER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CostRecommendationNotificationRuleMessageCustomizationHeader getHeader() {
    return header;
  }

  public void setHeader(CostRecommendationNotificationRuleMessageCustomizationHeader header) {
    this.header = header;
    if (header != null) {
      this.unparsed |= header.unparsed;
    }
  }

  public CostRecommendationNotificationRuleMessageCustomization includeTags(
      List<String> includeTags) {
    this.includeTags = includeTags;
    return this;
  }

  public CostRecommendationNotificationRuleMessageCustomization addIncludeTagsItem(
      String includeTagsItem) {
    if (this.includeTags == null) {
      this.includeTags = new ArrayList<>();
    }
    this.includeTags.add(includeTagsItem);
    return this;
  }

  /**
   * Tag keys whose values are shown on each recommendation in the digest.
   *
   * @return includeTags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDE_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getIncludeTags() {
    return includeTags;
  }

  public void setIncludeTags(List<String> includeTags) {
    this.includeTags = includeTags;
  }

  public CostRecommendationNotificationRuleMessageCustomization mode(
      CostRecommendationNotificationRuleMessageCustomizationMode mode) {
    this.mode = mode;
    this.unparsed |= !mode.isValid();
    return this;
  }

  /**
   * How the message is customized.
   *
   * @return mode
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CostRecommendationNotificationRuleMessageCustomizationMode getMode() {
    return mode;
  }

  public void setMode(CostRecommendationNotificationRuleMessageCustomizationMode mode) {
    if (!mode.isValid()) {
      this.unparsed = true;
    }
    this.mode = mode;
  }

  public CostRecommendationNotificationRuleMessageCustomization perRec(
      CostRecommendationNotificationRuleMessageCustomizationPerRec perRec) {
    this.perRec = perRec;
    this.unparsed |= perRec.unparsed;
    return this;
  }

  /**
   * What each recommendation in the digest shows.
   *
   * @return perRec
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PER_REC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CostRecommendationNotificationRuleMessageCustomizationPerRec getPerRec() {
    return perRec;
  }

  public void setPerRec(CostRecommendationNotificationRuleMessageCustomizationPerRec perRec) {
    this.perRec = perRec;
    if (perRec != null) {
      this.unparsed |= perRec.unparsed;
    }
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
   * @return CostRecommendationNotificationRuleMessageCustomization
   */
  @JsonAnySetter
  public CostRecommendationNotificationRuleMessageCustomization putAdditionalProperty(
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
   * Return true if this CostRecommendationNotificationRuleMessageCustomization object is equal to
   * o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CostRecommendationNotificationRuleMessageCustomization
        costRecommendationNotificationRuleMessageCustomization =
            (CostRecommendationNotificationRuleMessageCustomization) o;
    return Objects.equals(
            this.actions, costRecommendationNotificationRuleMessageCustomization.actions)
        && Objects.equals(
            this.header, costRecommendationNotificationRuleMessageCustomization.header)
        && Objects.equals(
            this.includeTags, costRecommendationNotificationRuleMessageCustomization.includeTags)
        && Objects.equals(this.mode, costRecommendationNotificationRuleMessageCustomization.mode)
        && Objects.equals(
            this.perRec, costRecommendationNotificationRuleMessageCustomization.perRec)
        && Objects.equals(
            this.additionalProperties,
            costRecommendationNotificationRuleMessageCustomization.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, header, includeTags, mode, perRec, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CostRecommendationNotificationRuleMessageCustomization {\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    includeTags: ").append(toIndentedString(includeTags)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    perRec: ").append(toIndentedString(perRec)).append("\n");
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
