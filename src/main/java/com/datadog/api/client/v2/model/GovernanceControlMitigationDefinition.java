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

/** The definition of a mitigation available for a control. */
@JsonPropertyOrder({
  GovernanceControlMitigationDefinition.JSON_PROPERTY_ACTION_VERB,
  GovernanceControlMitigationDefinition.JSON_PROPERTY_DESCRIPTION,
  GovernanceControlMitigationDefinition.JSON_PROPERTY_EXECUTION_MODES,
  GovernanceControlMitigationDefinition.JSON_PROPERTY_FEATURE_FLAGS,
  GovernanceControlMitigationDefinition.JSON_PROPERTY_ID,
  GovernanceControlMitigationDefinition.JSON_PROPERTY_MANUAL_MITIGATION_WARNING,
  GovernanceControlMitigationDefinition.JSON_PROPERTY_PERMISSIONS,
  GovernanceControlMitigationDefinition.JSON_PROPERTY_REQUIRES_AI,
  GovernanceControlMitigationDefinition.JSON_PROPERTY_SUPPORTED_PARAMETERS,
  GovernanceControlMitigationDefinition.JSON_PROPERTY_TITLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GovernanceControlMitigationDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACTION_VERB = "action_verb";
  private String actionVerb;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_EXECUTION_MODES = "execution_modes";
  private List<String> executionModes = null;

  public static final String JSON_PROPERTY_FEATURE_FLAGS = "feature_flags";
  private List<String> featureFlags = new ArrayList<>();

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_MANUAL_MITIGATION_WARNING = "manual_mitigation_warning";
  private String manualMitigationWarning;

  public static final String JSON_PROPERTY_PERMISSIONS = "permissions";
  private List<String> permissions = new ArrayList<>();

  public static final String JSON_PROPERTY_REQUIRES_AI = "requires_ai";
  private Boolean requiresAi;

  public static final String JSON_PROPERTY_SUPPORTED_PARAMETERS = "supported_parameters";
  private List<GovernanceControlParameterDefinition> supportedParameters = new ArrayList<>();

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public GovernanceControlMitigationDefinition() {}

  @JsonCreator
  public GovernanceControlMitigationDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_ACTION_VERB) String actionVerb,
      @JsonProperty(required = true, value = JSON_PROPERTY_DESCRIPTION) String description,
      @JsonProperty(required = true, value = JSON_PROPERTY_FEATURE_FLAGS) List<String> featureFlags,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_MANUAL_MITIGATION_WARNING)
          String manualMitigationWarning,
      @JsonProperty(required = true, value = JSON_PROPERTY_PERMISSIONS) List<String> permissions,
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUIRES_AI) Boolean requiresAi,
      @JsonProperty(required = true, value = JSON_PROPERTY_SUPPORTED_PARAMETERS)
          List<GovernanceControlParameterDefinition> supportedParameters,
      @JsonProperty(required = true, value = JSON_PROPERTY_TITLE) String title) {
    this.actionVerb = actionVerb;
    this.description = description;
    this.featureFlags = featureFlags;
    this.id = id;
    this.manualMitigationWarning = manualMitigationWarning;
    this.permissions = permissions;
    this.requiresAi = requiresAi;
    this.supportedParameters = supportedParameters;
    for (GovernanceControlParameterDefinition item : supportedParameters) {
      this.unparsed |= item.unparsed;
    }
    this.title = title;
  }

  public GovernanceControlMitigationDefinition actionVerb(String actionVerb) {
    this.actionVerb = actionVerb;
    return this;
  }

  /**
   * The verb describing the mitigation action, such as <code>revoke</code> or <code>delete</code>.
   *
   * @return actionVerb
   */
  @JsonProperty(JSON_PROPERTY_ACTION_VERB)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getActionVerb() {
    return actionVerb;
  }

  public void setActionVerb(String actionVerb) {
    this.actionVerb = actionVerb;
  }

  public GovernanceControlMitigationDefinition description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A human-readable description of the mitigation.
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

  public GovernanceControlMitigationDefinition executionModes(List<String> executionModes) {
    this.executionModes = executionModes;
    return this;
  }

  public GovernanceControlMitigationDefinition addExecutionModesItem(String executionModesItem) {
    if (this.executionModes == null) {
      this.executionModes = new ArrayList<>();
    }
    this.executionModes.add(executionModesItem);
    return this;
  }

  /**
   * The execution modes the mitigation supports, such as <code>manual</code> or <code>automatic
   * </code>.
   *
   * @return executionModes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXECUTION_MODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getExecutionModes() {
    return executionModes;
  }

  public void setExecutionModes(List<String> executionModes) {
    this.executionModes = executionModes;
  }

  public GovernanceControlMitigationDefinition featureFlags(List<String> featureFlags) {
    this.featureFlags = featureFlags;
    return this;
  }

  public GovernanceControlMitigationDefinition addFeatureFlagsItem(String featureFlagsItem) {
    this.featureFlags.add(featureFlagsItem);
    return this;
  }

  /**
   * The feature flags that gate the mitigation.
   *
   * @return featureFlags
   */
  @JsonProperty(JSON_PROPERTY_FEATURE_FLAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getFeatureFlags() {
    return featureFlags;
  }

  public void setFeatureFlags(List<String> featureFlags) {
    this.featureFlags = featureFlags;
  }

  public GovernanceControlMitigationDefinition id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier of the mitigation.
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

  public GovernanceControlMitigationDefinition manualMitigationWarning(
      String manualMitigationWarning) {
    this.manualMitigationWarning = manualMitigationWarning;
    return this;
  }

  /**
   * A warning shown to the user before applying the mitigation manually.
   *
   * @return manualMitigationWarning
   */
  @JsonProperty(JSON_PROPERTY_MANUAL_MITIGATION_WARNING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getManualMitigationWarning() {
    return manualMitigationWarning;
  }

  public void setManualMitigationWarning(String manualMitigationWarning) {
    this.manualMitigationWarning = manualMitigationWarning;
  }

  public GovernanceControlMitigationDefinition permissions(List<String> permissions) {
    this.permissions = permissions;
    return this;
  }

  public GovernanceControlMitigationDefinition addPermissionsItem(String permissionsItem) {
    this.permissions.add(permissionsItem);
    return this;
  }

  /**
   * The permissions required to apply the mitigation.
   *
   * @return permissions
   */
  @JsonProperty(JSON_PROPERTY_PERMISSIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<String> permissions) {
    this.permissions = permissions;
  }

  public GovernanceControlMitigationDefinition requiresAi(Boolean requiresAi) {
    this.requiresAi = requiresAi;
    return this;
  }

  /**
   * Whether the mitigation requires AI to be enabled.
   *
   * @return requiresAi
   */
  @JsonProperty(JSON_PROPERTY_REQUIRES_AI)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getRequiresAi() {
    return requiresAi;
  }

  public void setRequiresAi(Boolean requiresAi) {
    this.requiresAi = requiresAi;
  }

  public GovernanceControlMitigationDefinition supportedParameters(
      List<GovernanceControlParameterDefinition> supportedParameters) {
    this.supportedParameters = supportedParameters;
    for (GovernanceControlParameterDefinition item : supportedParameters) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public GovernanceControlMitigationDefinition addSupportedParametersItem(
      GovernanceControlParameterDefinition supportedParametersItem) {
    this.supportedParameters.add(supportedParametersItem);
    this.unparsed |= supportedParametersItem.unparsed;
    return this;
  }

  /**
   * An array of parameter definitions.
   *
   * @return supportedParameters
   */
  @JsonProperty(JSON_PROPERTY_SUPPORTED_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<GovernanceControlParameterDefinition> getSupportedParameters() {
    return supportedParameters;
  }

  public void setSupportedParameters(
      List<GovernanceControlParameterDefinition> supportedParameters) {
    this.supportedParameters = supportedParameters;
    if (supportedParameters != null) {
      for (GovernanceControlParameterDefinition item : supportedParameters) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public GovernanceControlMitigationDefinition title(String title) {
    this.title = title;
    return this;
  }

  /**
   * A short, human-readable name for the mitigation.
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
   * @return GovernanceControlMitigationDefinition
   */
  @JsonAnySetter
  public GovernanceControlMitigationDefinition putAdditionalProperty(String key, Object value) {
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

  /** Return true if this GovernanceControlMitigationDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GovernanceControlMitigationDefinition governanceControlMitigationDefinition =
        (GovernanceControlMitigationDefinition) o;
    return Objects.equals(this.actionVerb, governanceControlMitigationDefinition.actionVerb)
        && Objects.equals(this.description, governanceControlMitigationDefinition.description)
        && Objects.equals(this.executionModes, governanceControlMitigationDefinition.executionModes)
        && Objects.equals(this.featureFlags, governanceControlMitigationDefinition.featureFlags)
        && Objects.equals(this.id, governanceControlMitigationDefinition.id)
        && Objects.equals(
            this.manualMitigationWarning,
            governanceControlMitigationDefinition.manualMitigationWarning)
        && Objects.equals(this.permissions, governanceControlMitigationDefinition.permissions)
        && Objects.equals(this.requiresAi, governanceControlMitigationDefinition.requiresAi)
        && Objects.equals(
            this.supportedParameters, governanceControlMitigationDefinition.supportedParameters)
        && Objects.equals(this.title, governanceControlMitigationDefinition.title)
        && Objects.equals(
            this.additionalProperties, governanceControlMitigationDefinition.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        actionVerb,
        description,
        executionModes,
        featureFlags,
        id,
        manualMitigationWarning,
        permissions,
        requiresAi,
        supportedParameters,
        title,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GovernanceControlMitigationDefinition {\n");
    sb.append("    actionVerb: ").append(toIndentedString(actionVerb)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    executionModes: ").append(toIndentedString(executionModes)).append("\n");
    sb.append("    featureFlags: ").append(toIndentedString(featureFlags)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    manualMitigationWarning: ")
        .append(toIndentedString(manualMitigationWarning))
        .append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    requiresAi: ").append(toIndentedString(requiresAi)).append("\n");
    sb.append("    supportedParameters: ")
        .append(toIndentedString(supportedParameters))
        .append("\n");
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
