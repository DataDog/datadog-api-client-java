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

/** A suggestion to tune the detection rule. */
@JsonPropertyOrder({
  SecurityAgentInvestigationRuleTuningSuggestion.JSON_PROPERTY_ACTION_TYPE,
  SecurityAgentInvestigationRuleTuningSuggestion.JSON_PROPERTY_CONDITIONS,
  SecurityAgentInvestigationRuleTuningSuggestion.JSON_PROPERTY_DESCRIPTION,
  SecurityAgentInvestigationRuleTuningSuggestion.JSON_PROPERTY_ESTIMATED_SILENCED_COUNT,
  SecurityAgentInvestigationRuleTuningSuggestion.JSON_PROPERTY_ID,
  SecurityAgentInvestigationRuleTuningSuggestion.JSON_PROPERTY_MATCH_LOGIC,
  SecurityAgentInvestigationRuleTuningSuggestion.JSON_PROPERTY_RECOMMENDED,
  SecurityAgentInvestigationRuleTuningSuggestion.JSON_PROPERTY_RULE_ID,
  SecurityAgentInvestigationRuleTuningSuggestion.JSON_PROPERTY_TITLE,
  SecurityAgentInvestigationRuleTuningSuggestion.JSON_PROPERTY_WARNING,
  SecurityAgentInvestigationRuleTuningSuggestion.JSON_PROPERTY_WHY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityAgentInvestigationRuleTuningSuggestion {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACTION_TYPE = "action_type";
  private String actionType;

  public static final String JSON_PROPERTY_CONDITIONS = "conditions";
  private List<SecurityAgentInvestigationRuleTuningCondition> conditions = new ArrayList<>();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ESTIMATED_SILENCED_COUNT = "estimated_silenced_count";
  private Long estimatedSilencedCount;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_MATCH_LOGIC = "match_logic";
  private String matchLogic;

  public static final String JSON_PROPERTY_RECOMMENDED = "recommended";
  private Boolean recommended;

  public static final String JSON_PROPERTY_RULE_ID = "rule_id";
  private String ruleId;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_WARNING = "warning";
  private String warning;

  public static final String JSON_PROPERTY_WHY = "why";
  private String why;

  public SecurityAgentInvestigationRuleTuningSuggestion() {}

  @JsonCreator
  public SecurityAgentInvestigationRuleTuningSuggestion(
      @JsonProperty(required = true, value = JSON_PROPERTY_ACTION_TYPE) String actionType,
      @JsonProperty(required = true, value = JSON_PROPERTY_CONDITIONS)
          List<SecurityAgentInvestigationRuleTuningCondition> conditions,
      @JsonProperty(required = true, value = JSON_PROPERTY_DESCRIPTION) String description,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_MATCH_LOGIC) String matchLogic,
      @JsonProperty(required = true, value = JSON_PROPERTY_RECOMMENDED) Boolean recommended,
      @JsonProperty(required = true, value = JSON_PROPERTY_RULE_ID) String ruleId,
      @JsonProperty(required = true, value = JSON_PROPERTY_TITLE) String title,
      @JsonProperty(required = true, value = JSON_PROPERTY_WARNING) String warning,
      @JsonProperty(required = true, value = JSON_PROPERTY_WHY) String why) {
    this.actionType = actionType;
    this.conditions = conditions;
    for (SecurityAgentInvestigationRuleTuningCondition item : conditions) {
      this.unparsed |= item.unparsed;
    }
    this.description = description;
    this.id = id;
    this.matchLogic = matchLogic;
    this.recommended = recommended;
    this.ruleId = ruleId;
    this.title = title;
    this.warning = warning;
    this.why = why;
  }

  public SecurityAgentInvestigationRuleTuningSuggestion actionType(String actionType) {
    this.actionType = actionType;
    return this;
  }

  /**
   * Kind of change the suggestion makes to the rule.
   *
   * @return actionType
   */
  @JsonProperty(JSON_PROPERTY_ACTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getActionType() {
    return actionType;
  }

  public void setActionType(String actionType) {
    this.actionType = actionType;
  }

  public SecurityAgentInvestigationRuleTuningSuggestion conditions(
      List<SecurityAgentInvestigationRuleTuningCondition> conditions) {
    this.conditions = conditions;
    for (SecurityAgentInvestigationRuleTuningCondition item : conditions) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SecurityAgentInvestigationRuleTuningSuggestion addConditionsItem(
      SecurityAgentInvestigationRuleTuningCondition conditionsItem) {
    this.conditions.add(conditionsItem);
    this.unparsed |= conditionsItem.unparsed;
    return this;
  }

  /**
   * The conditions the change applies to.
   *
   * @return conditions
   */
  @JsonProperty(JSON_PROPERTY_CONDITIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<SecurityAgentInvestigationRuleTuningCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<SecurityAgentInvestigationRuleTuningCondition> conditions) {
    this.conditions = conditions;
    if (conditions != null) {
      for (SecurityAgentInvestigationRuleTuningCondition item : conditions) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public SecurityAgentInvestigationRuleTuningSuggestion description(String description) {
    this.description = description;
    return this;
  }

  /**
   * What the suggestion changes.
   *
   * @return description
   */
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SecurityAgentInvestigationRuleTuningSuggestion estimatedSilencedCount(
      Long estimatedSilencedCount) {
    this.estimatedSilencedCount = estimatedSilencedCount;
    return this;
  }

  /**
   * Estimated number of signals the change would have silenced in the window.
   *
   * @return estimatedSilencedCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ESTIMATED_SILENCED_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEstimatedSilencedCount() {
    return estimatedSilencedCount;
  }

  public void setEstimatedSilencedCount(Long estimatedSilencedCount) {
    this.estimatedSilencedCount = estimatedSilencedCount;
  }

  public SecurityAgentInvestigationRuleTuningSuggestion id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID of the suggestion.
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

  public SecurityAgentInvestigationRuleTuningSuggestion matchLogic(String matchLogic) {
    this.matchLogic = matchLogic;
    return this;
  }

  /**
   * How the conditions combine, such as AND or OR.
   *
   * @return matchLogic
   */
  @JsonProperty(JSON_PROPERTY_MATCH_LOGIC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMatchLogic() {
    return matchLogic;
  }

  public void setMatchLogic(String matchLogic) {
    this.matchLogic = matchLogic;
  }

  public SecurityAgentInvestigationRuleTuningSuggestion recommended(Boolean recommended) {
    this.recommended = recommended;
    return this;
  }

  /**
   * Whether the suggestion is recommended.
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

  public SecurityAgentInvestigationRuleTuningSuggestion ruleId(String ruleId) {
    this.ruleId = ruleId;
    return this;
  }

  /**
   * ID of the detection rule.
   *
   * @return ruleId
   */
  @JsonProperty(JSON_PROPERTY_RULE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getRuleId() {
    return ruleId;
  }

  public void setRuleId(String ruleId) {
    this.ruleId = ruleId;
  }

  public SecurityAgentInvestigationRuleTuningSuggestion title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Title of the suggestion.
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

  public SecurityAgentInvestigationRuleTuningSuggestion warning(String warning) {
    this.warning = warning;
    return this;
  }

  /**
   * What the change could hide. It can be empty.
   *
   * @return warning
   */
  @JsonProperty(JSON_PROPERTY_WARNING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getWarning() {
    return warning;
  }

  public void setWarning(String warning) {
    this.warning = warning;
  }

  public SecurityAgentInvestigationRuleTuningSuggestion why(String why) {
    this.why = why;
    return this;
  }

  /**
   * Why the suggestion is made.
   *
   * @return why
   */
  @JsonProperty(JSON_PROPERTY_WHY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getWhy() {
    return why;
  }

  public void setWhy(String why) {
    this.why = why;
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
   * @return SecurityAgentInvestigationRuleTuningSuggestion
   */
  @JsonAnySetter
  public SecurityAgentInvestigationRuleTuningSuggestion putAdditionalProperty(
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

  /** Return true if this SecurityAgentInvestigationRuleTuningSuggestion object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityAgentInvestigationRuleTuningSuggestion securityAgentInvestigationRuleTuningSuggestion =
        (SecurityAgentInvestigationRuleTuningSuggestion) o;
    return Objects.equals(
            this.actionType, securityAgentInvestigationRuleTuningSuggestion.actionType)
        && Objects.equals(
            this.conditions, securityAgentInvestigationRuleTuningSuggestion.conditions)
        && Objects.equals(
            this.description, securityAgentInvestigationRuleTuningSuggestion.description)
        && Objects.equals(
            this.estimatedSilencedCount,
            securityAgentInvestigationRuleTuningSuggestion.estimatedSilencedCount)
        && Objects.equals(this.id, securityAgentInvestigationRuleTuningSuggestion.id)
        && Objects.equals(
            this.matchLogic, securityAgentInvestigationRuleTuningSuggestion.matchLogic)
        && Objects.equals(
            this.recommended, securityAgentInvestigationRuleTuningSuggestion.recommended)
        && Objects.equals(this.ruleId, securityAgentInvestigationRuleTuningSuggestion.ruleId)
        && Objects.equals(this.title, securityAgentInvestigationRuleTuningSuggestion.title)
        && Objects.equals(this.warning, securityAgentInvestigationRuleTuningSuggestion.warning)
        && Objects.equals(this.why, securityAgentInvestigationRuleTuningSuggestion.why)
        && Objects.equals(
            this.additionalProperties,
            securityAgentInvestigationRuleTuningSuggestion.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        actionType,
        conditions,
        description,
        estimatedSilencedCount,
        id,
        matchLogic,
        recommended,
        ruleId,
        title,
        warning,
        why,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityAgentInvestigationRuleTuningSuggestion {\n");
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    estimatedSilencedCount: ")
        .append(toIndentedString(estimatedSilencedCount))
        .append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    matchLogic: ").append(toIndentedString(matchLogic)).append("\n");
    sb.append("    recommended: ").append(toIndentedString(recommended)).append("\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    warning: ").append(toIndentedString(warning)).append("\n");
    sb.append("    why: ").append(toIndentedString(why)).append("\n");
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
