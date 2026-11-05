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

/** A suggested mitigation. */
@JsonPropertyOrder({
  SecurityAgentInvestigationMitigationSuggestion.JSON_PROPERTY_ACTIONS,
  SecurityAgentInvestigationMitigationSuggestion.JSON_PROPERTY_ID,
  SecurityAgentInvestigationMitigationSuggestion.JSON_PROPERTY_RATIONALE,
  SecurityAgentInvestigationMitigationSuggestion.JSON_PROPERTY_RECOMMENDED,
  SecurityAgentInvestigationMitigationSuggestion.JSON_PROPERTY_SCOPE_NOTE,
  SecurityAgentInvestigationMitigationSuggestion.JSON_PROPERTY_STEP,
  SecurityAgentInvestigationMitigationSuggestion.JSON_PROPERTY_TITLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityAgentInvestigationMitigationSuggestion {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACTIONS = "actions";
  private List<SecurityAgentInvestigationMitigationAction> actions = null;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_RATIONALE = "rationale";
  private String rationale;

  public static final String JSON_PROPERTY_RECOMMENDED = "recommended";
  private Boolean recommended;

  public static final String JSON_PROPERTY_SCOPE_NOTE = "scope_note";
  private String scopeNote;

  public static final String JSON_PROPERTY_STEP = "step";
  private Long step;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public SecurityAgentInvestigationMitigationSuggestion() {}

  @JsonCreator
  public SecurityAgentInvestigationMitigationSuggestion(
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_RATIONALE) String rationale,
      @JsonProperty(required = true, value = JSON_PROPERTY_RECOMMENDED) Boolean recommended,
      @JsonProperty(required = true, value = JSON_PROPERTY_STEP) Long step,
      @JsonProperty(required = true, value = JSON_PROPERTY_TITLE) String title) {
    this.id = id;
    this.rationale = rationale;
    this.recommended = recommended;
    this.step = step;
    this.title = title;
  }

  public SecurityAgentInvestigationMitigationSuggestion actions(
      List<SecurityAgentInvestigationMitigationAction> actions) {
    this.actions = actions;
    if (actions != null) {
      for (SecurityAgentInvestigationMitigationAction item : actions) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public SecurityAgentInvestigationMitigationSuggestion addActionsItem(
      SecurityAgentInvestigationMitigationAction actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<>();
    }
    this.actions.add(actionsItem);
    this.unparsed |= actionsItem.unparsed;
    return this;
  }

  /**
   * Actions that apply the mitigation.
   *
   * @return actions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SecurityAgentInvestigationMitigationAction> getActions() {
    return actions;
  }

  public void setActions(List<SecurityAgentInvestigationMitigationAction> actions) {
    this.actions = actions;
    if (actions != null) {
      for (SecurityAgentInvestigationMitigationAction item : actions) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public SecurityAgentInvestigationMitigationSuggestion id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID of the mitigation.
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SecurityAgentInvestigationMitigationSuggestion rationale(String rationale) {
    this.rationale = rationale;
    return this;
  }

  /**
   * Why the mitigation is suggested.
   *
   * @return rationale
   */
  @JsonProperty(JSON_PROPERTY_RATIONALE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getRationale() {
    return rationale;
  }

  public void setRationale(String rationale) {
    this.rationale = rationale;
  }

  public SecurityAgentInvestigationMitigationSuggestion recommended(Boolean recommended) {
    this.recommended = recommended;
    return this;
  }

  /**
   * Whether the mitigation is recommended.
   *
   * @return recommended
   */
  @JsonProperty(JSON_PROPERTY_RECOMMENDED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getRecommended() {
    return recommended;
  }

  public void setRecommended(Boolean recommended) {
    this.recommended = recommended;
  }

  public SecurityAgentInvestigationMitigationSuggestion scopeNote(String scopeNote) {
    this.scopeNote = scopeNote;
    return this;
  }

  /**
   * What the mitigation applies to.
   *
   * @return scopeNote
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCOPE_NOTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getScopeNote() {
    return scopeNote;
  }

  public void setScopeNote(String scopeNote) {
    this.scopeNote = scopeNote;
  }

  public SecurityAgentInvestigationMitigationSuggestion step(Long step) {
    this.step = step;
    return this;
  }

  /**
   * Order in which to apply the mitigation, starting at 1.
   *
   * @return step
   */
  @JsonProperty(JSON_PROPERTY_STEP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getStep() {
    return step;
  }

  public void setStep(Long step) {
    this.step = step;
  }

  public SecurityAgentInvestigationMitigationSuggestion title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Title of the mitigation.
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
   * @return SecurityAgentInvestigationMitigationSuggestion
   */
  @JsonAnySetter
  public SecurityAgentInvestigationMitigationSuggestion putAdditionalProperty(
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

  /** Return true if this SecurityAgentInvestigationMitigationSuggestion object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityAgentInvestigationMitigationSuggestion securityAgentInvestigationMitigationSuggestion =
        (SecurityAgentInvestigationMitigationSuggestion) o;
    return Objects.equals(this.actions, securityAgentInvestigationMitigationSuggestion.actions)
        && Objects.equals(this.id, securityAgentInvestigationMitigationSuggestion.id)
        && Objects.equals(this.rationale, securityAgentInvestigationMitigationSuggestion.rationale)
        && Objects.equals(
            this.recommended, securityAgentInvestigationMitigationSuggestion.recommended)
        && Objects.equals(this.scopeNote, securityAgentInvestigationMitigationSuggestion.scopeNote)
        && Objects.equals(this.step, securityAgentInvestigationMitigationSuggestion.step)
        && Objects.equals(this.title, securityAgentInvestigationMitigationSuggestion.title)
        && Objects.equals(
            this.additionalProperties,
            securityAgentInvestigationMitigationSuggestion.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        actions, id, rationale, recommended, scopeNote, step, title, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityAgentInvestigationMitigationSuggestion {\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    rationale: ").append(toIndentedString(rationale)).append("\n");
    sb.append("    recommended: ").append(toIndentedString(recommended)).append("\n");
    sb.append("    scopeNote: ").append(toIndentedString(scopeNote)).append("\n");
    sb.append("    step: ").append(toIndentedString(step)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
