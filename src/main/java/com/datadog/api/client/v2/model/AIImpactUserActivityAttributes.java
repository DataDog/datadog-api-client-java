/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Daily AI coding tool activity for a single user. Each entry reports whether the user was active
 * on a given day and which AI tools and models they used.
 */
@JsonPropertyOrder({
  AIImpactUserActivityAttributes.JSON_PROPERTY_DAY,
  AIImpactUserActivityAttributes.JSON_PROPERTY_IS_ACTIVE,
  AIImpactUserActivityAttributes.JSON_PROPERTY_MODELS,
  AIImpactUserActivityAttributes.JSON_PROPERTY_TOOLS,
  AIImpactUserActivityAttributes.JSON_PROPERTY_USER_EMAIL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AIImpactUserActivityAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DAY = "day";
  private String day;

  public static final String JSON_PROPERTY_IS_ACTIVE = "is_active";
  private Boolean isActive;

  public static final String JSON_PROPERTY_MODELS = "models";
  private List<String> models = null;

  public static final String JSON_PROPERTY_TOOLS = "tools";
  private List<String> tools = new ArrayList<>();

  public static final String JSON_PROPERTY_USER_EMAIL = "user_email";
  private String userEmail;

  public AIImpactUserActivityAttributes() {}

  @JsonCreator
  public AIImpactUserActivityAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_DAY) String day,
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_ACTIVE) Boolean isActive,
      @JsonProperty(required = true, value = JSON_PROPERTY_TOOLS) List<String> tools,
      @JsonProperty(required = true, value = JSON_PROPERTY_USER_EMAIL) String userEmail) {
    this.day = day;
    this.isActive = isActive;
    this.tools = tools;
    this.userEmail = userEmail;
  }

  public AIImpactUserActivityAttributes day(String day) {
    this.day = day;
    return this;
  }

  /**
   * The day the activity refers to, in <code>YYYY-MM-DD</code> format.
   *
   * @return day
   */
  @JsonProperty(JSON_PROPERTY_DAY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDay() {
    return day;
  }

  public void setDay(String day) {
    this.day = day;
  }

  public AIImpactUserActivityAttributes isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * Whether the user actively used the listed AI tools on that day.
   *
   * @return isActive
   */
  @JsonProperty(JSON_PROPERTY_IS_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public AIImpactUserActivityAttributes models(List<String> models) {
    this.models = models;
    return this;
  }

  public AIImpactUserActivityAttributes addModelsItem(String modelsItem) {
    if (this.models == null) {
      this.models = new ArrayList<>();
    }
    this.models.add(modelsItem);
    return this;
  }

  /**
   * The AI models the user used on that day, for example <code>claude-sonnet-4.5</code> or <code>
   * gpt-5</code>. Values are lowercased and duplicates are removed.
   *
   * @return models
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getModels() {
    return models;
  }

  public void setModels(List<String> models) {
    this.models = models;
  }

  public AIImpactUserActivityAttributes tools(List<String> tools) {
    this.tools = tools;
    return this;
  }

  public AIImpactUserActivityAttributes addToolsItem(String toolsItem) {
    this.tools.add(toolsItem);
    return this;
  }

  /**
   * The AI coding tools the user used on that day, for example <code>Claude Code</code>, <code>
   * Cursor</code>, or <code>GitHub Copilot</code>. Known tools are normalized to a canonical name (
   * <code>claude_code</code>, <code>cursor</code>, <code>copilot</code>), and other values are
   * converted to snake case. Entries must not be empty.
   *
   * @return tools
   */
  @JsonProperty(JSON_PROPERTY_TOOLS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getTools() {
    return tools;
  }

  public void setTools(List<String> tools) {
    this.tools = tools;
  }

  public AIImpactUserActivityAttributes userEmail(String userEmail) {
    this.userEmail = userEmail;
    return this;
  }

  /**
   * The email address of the user. It is case-insensitive and is matched against the email
   * addresses of commit authors.
   *
   * @return userEmail
   */
  @JsonProperty(JSON_PROPERTY_USER_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }

  /** Return true if this AIImpactUserActivityAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AIImpactUserActivityAttributes aiImpactUserActivityAttributes =
        (AIImpactUserActivityAttributes) o;
    return Objects.equals(this.day, aiImpactUserActivityAttributes.day)
        && Objects.equals(this.isActive, aiImpactUserActivityAttributes.isActive)
        && Objects.equals(this.models, aiImpactUserActivityAttributes.models)
        && Objects.equals(this.tools, aiImpactUserActivityAttributes.tools)
        && Objects.equals(this.userEmail, aiImpactUserActivityAttributes.userEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(day, isActive, models, tools, userEmail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AIImpactUserActivityAttributes {\n");
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    models: ").append(toIndentedString(models)).append("\n");
    sb.append("    tools: ").append(toIndentedString(tools)).append("\n");
    sb.append("    userEmail: ").append(toIndentedString(userEmail)).append("\n");
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
