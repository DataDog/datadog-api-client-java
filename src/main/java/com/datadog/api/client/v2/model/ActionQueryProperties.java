/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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
   * <p>The properties of the action query.</p>
 */
@JsonPropertyOrder({
  ActionQueryProperties.JSON_PROPERTY_CONDITION,
  ActionQueryProperties.JSON_PROPERTY_DEBOUNCE_IN_MS,
  ActionQueryProperties.JSON_PROPERTY_MOCKED_OUTPUTS,
  ActionQueryProperties.JSON_PROPERTY_ONLY_TRIGGER_MANUALLY,
  ActionQueryProperties.JSON_PROPERTY_OUTPUTS,
  ActionQueryProperties.JSON_PROPERTY_POLLING_INTERVAL_IN_MS,
  ActionQueryProperties.JSON_PROPERTY_REQUIRES_CONFIRMATION,
  ActionQueryProperties.JSON_PROPERTY_SHOW_TOAST_ON_ERROR,
  ActionQueryProperties.JSON_PROPERTY_SPEC
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ActionQueryProperties {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONDITION = "condition";
  private ActionQueryCondition condition;

  public static final String JSON_PROPERTY_DEBOUNCE_IN_MS = "debounceInMs";
  private ActionQueryDebounceInMs debounceInMs;

  public static final String JSON_PROPERTY_MOCKED_OUTPUTS = "mockedOutputs";
  private ActionQueryMockedOutputs mockedOutputs;

  public static final String JSON_PROPERTY_ONLY_TRIGGER_MANUALLY = "onlyTriggerManually";
  private ActionQueryOnlyTriggerManually onlyTriggerManually;

  public static final String JSON_PROPERTY_OUTPUTS = "outputs";
  private String outputs;

  public static final String JSON_PROPERTY_POLLING_INTERVAL_IN_MS = "pollingIntervalInMs";
  private ActionQueryPollingIntervalInMs pollingIntervalInMs;

  public static final String JSON_PROPERTY_REQUIRES_CONFIRMATION = "requiresConfirmation";
  private ActionQueryRequiresConfirmation requiresConfirmation;

  public static final String JSON_PROPERTY_SHOW_TOAST_ON_ERROR = "showToastOnError";
  private ActionQueryShowToastOnError showToastOnError;

  public static final String JSON_PROPERTY_SPEC = "spec";
  private ActionQuerySpec spec;

  public ActionQueryProperties() {}

  @JsonCreator
  public ActionQueryProperties(
            @JsonProperty(required=true, value=JSON_PROPERTY_SPEC)ActionQuerySpec spec) {
        this.spec = spec;
        this.unparsed |= spec.unparsed;
  }
  public ActionQueryProperties condition(ActionQueryCondition condition) {
    this.condition = condition;
    this.unparsed |= condition.unparsed;
    return this;
  }

  /**
   * <p>Whether to run this query. If specified, the query will only run if this condition evaluates to <code>true</code> in JavaScript and all other conditions are also met.</p>
   * @return condition
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CONDITION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ActionQueryCondition getCondition() {
        return condition;
      }
  public void setCondition(ActionQueryCondition condition) {
    this.condition = condition;
  }
  public ActionQueryProperties debounceInMs(ActionQueryDebounceInMs debounceInMs) {
    this.debounceInMs = debounceInMs;
    this.unparsed |= debounceInMs.unparsed;
    return this;
  }

  /**
   * <p>The minimum time in milliseconds that must pass before the query can be triggered again. This is useful for preventing accidental double-clicks from triggering the query multiple times.</p>
   * @return debounceInMs
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DEBOUNCE_IN_MS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ActionQueryDebounceInMs getDebounceInMs() {
        return debounceInMs;
      }
  public void setDebounceInMs(ActionQueryDebounceInMs debounceInMs) {
    this.debounceInMs = debounceInMs;
  }
  public ActionQueryProperties mockedOutputs(ActionQueryMockedOutputs mockedOutputs) {
    this.mockedOutputs = mockedOutputs;
    this.unparsed |= mockedOutputs.unparsed;
    return this;
  }

  /**
   * <p>The mocked outputs of the action query. This is useful for testing the app without actually running the action.</p>
   * @return mockedOutputs
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MOCKED_OUTPUTS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ActionQueryMockedOutputs getMockedOutputs() {
        return mockedOutputs;
      }
  public void setMockedOutputs(ActionQueryMockedOutputs mockedOutputs) {
    this.mockedOutputs = mockedOutputs;
  }
  public ActionQueryProperties onlyTriggerManually(ActionQueryOnlyTriggerManually onlyTriggerManually) {
    this.onlyTriggerManually = onlyTriggerManually;
    this.unparsed |= onlyTriggerManually.unparsed;
    return this;
  }

  /**
   * <p>Determines when this query is executed. If set to <code>false</code>, the query will run when the app loads and whenever any query arguments change. If set to <code>true</code>, the query will only run when manually triggered from elsewhere in the app.</p>
   * @return onlyTriggerManually
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ONLY_TRIGGER_MANUALLY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ActionQueryOnlyTriggerManually getOnlyTriggerManually() {
        return onlyTriggerManually;
      }
  public void setOnlyTriggerManually(ActionQueryOnlyTriggerManually onlyTriggerManually) {
    this.onlyTriggerManually = onlyTriggerManually;
  }
  public ActionQueryProperties outputs(String outputs) {
    this.outputs = outputs;
    return this;
  }

  /**
   * <p>The post-query transformation function, which is a JavaScript function that changes the query's <code>.outputs</code> property after the query's execution.</p>
   * @return outputs
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_OUTPUTS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getOutputs() {
        return outputs;
      }
  public void setOutputs(String outputs) {
    this.outputs = outputs;
  }
  public ActionQueryProperties pollingIntervalInMs(ActionQueryPollingIntervalInMs pollingIntervalInMs) {
    this.pollingIntervalInMs = pollingIntervalInMs;
    this.unparsed |= pollingIntervalInMs.unparsed;
    return this;
  }

  /**
   * <p>If specified, the app will poll the query at the specified interval in milliseconds. The minimum polling interval is 15 seconds. The query will only poll when the app's browser tab is active.</p>
   * @return pollingIntervalInMs
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_POLLING_INTERVAL_IN_MS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ActionQueryPollingIntervalInMs getPollingIntervalInMs() {
        return pollingIntervalInMs;
      }
  public void setPollingIntervalInMs(ActionQueryPollingIntervalInMs pollingIntervalInMs) {
    this.pollingIntervalInMs = pollingIntervalInMs;
  }
  public ActionQueryProperties requiresConfirmation(ActionQueryRequiresConfirmation requiresConfirmation) {
    this.requiresConfirmation = requiresConfirmation;
    this.unparsed |= requiresConfirmation.unparsed;
    return this;
  }

  /**
   * <p>Whether to prompt the user to confirm this query before it runs.</p>
   * @return requiresConfirmation
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_REQUIRES_CONFIRMATION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ActionQueryRequiresConfirmation getRequiresConfirmation() {
        return requiresConfirmation;
      }
  public void setRequiresConfirmation(ActionQueryRequiresConfirmation requiresConfirmation) {
    this.requiresConfirmation = requiresConfirmation;
  }
  public ActionQueryProperties showToastOnError(ActionQueryShowToastOnError showToastOnError) {
    this.showToastOnError = showToastOnError;
    this.unparsed |= showToastOnError.unparsed;
    return this;
  }

  /**
   * <p>Whether to display a toast to the user when the query returns an error.</p>
   * @return showToastOnError
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SHOW_TOAST_ON_ERROR)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ActionQueryShowToastOnError getShowToastOnError() {
        return showToastOnError;
      }
  public void setShowToastOnError(ActionQueryShowToastOnError showToastOnError) {
    this.showToastOnError = showToastOnError;
  }
  public ActionQueryProperties spec(ActionQuerySpec spec) {
    this.spec = spec;
    this.unparsed |= spec.unparsed;
    return this;
  }

  /**
   * <p>The definition of the action query.</p>
   * @return spec
  **/
      @JsonProperty(JSON_PROPERTY_SPEC)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ActionQuerySpec getSpec() {
        return spec;
      }
  public void setSpec(ActionQuerySpec spec) {
    this.spec = spec;
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
   * @return ActionQueryProperties
   */
  @JsonAnySetter
  public ActionQueryProperties putAdditionalProperty(String key, Object value) {
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
   * Return true if this ActionQueryProperties object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionQueryProperties actionQueryProperties = (ActionQueryProperties) o;
    return Objects.equals(this.condition, actionQueryProperties.condition) && Objects.equals(this.debounceInMs, actionQueryProperties.debounceInMs) && Objects.equals(this.mockedOutputs, actionQueryProperties.mockedOutputs) && Objects.equals(this.onlyTriggerManually, actionQueryProperties.onlyTriggerManually) && Objects.equals(this.outputs, actionQueryProperties.outputs) && Objects.equals(this.pollingIntervalInMs, actionQueryProperties.pollingIntervalInMs) && Objects.equals(this.requiresConfirmation, actionQueryProperties.requiresConfirmation) && Objects.equals(this.showToastOnError, actionQueryProperties.showToastOnError) && Objects.equals(this.spec, actionQueryProperties.spec) && Objects.equals(this.additionalProperties, actionQueryProperties.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(condition,debounceInMs,mockedOutputs,onlyTriggerManually,outputs,pollingIntervalInMs,requiresConfirmation,showToastOnError,spec, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionQueryProperties {\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    debounceInMs: ").append(toIndentedString(debounceInMs)).append("\n");
    sb.append("    mockedOutputs: ").append(toIndentedString(mockedOutputs)).append("\n");
    sb.append("    onlyTriggerManually: ").append(toIndentedString(onlyTriggerManually)).append("\n");
    sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
    sb.append("    pollingIntervalInMs: ").append(toIndentedString(pollingIntervalInMs)).append("\n");
    sb.append("    requiresConfirmation: ").append(toIndentedString(requiresConfirmation)).append("\n");
    sb.append("    showToastOnError: ").append(toIndentedString(showToastOnError)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
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
