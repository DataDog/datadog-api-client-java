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

/** The spec defines what the workflow does. */
@JsonPropertyOrder({
  Spec.JSON_PROPERTY_ANNOTATIONS,
  Spec.JSON_PROPERTY_CONNECTION_ENVS,
  Spec.JSON_PROPERTY_HANDLE,
  Spec.JSON_PROPERTY_INPUT_SCHEMA,
  Spec.JSON_PROPERTY_OUTPUT_SCHEMA,
  Spec.JSON_PROPERTY_STEPS,
  Spec.JSON_PROPERTY_TRIGGERS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class Spec {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ANNOTATIONS = "annotations";
  private List<Annotation> annotations = null;

  public static final String JSON_PROPERTY_CONNECTION_ENVS = "connectionEnvs";
  private List<ConnectionEnv> connectionEnvs = null;

  public static final String JSON_PROPERTY_HANDLE = "handle";
  private String handle;

  public static final String JSON_PROPERTY_INPUT_SCHEMA = "inputSchema";
  private InputSchema inputSchema;

  public static final String JSON_PROPERTY_OUTPUT_SCHEMA = "outputSchema";
  private OutputSchema outputSchema;

  public static final String JSON_PROPERTY_STEPS = "steps";
  private List<Step> steps = null;

  public static final String JSON_PROPERTY_TRIGGERS = "triggers";
  private List<Trigger> triggers = null;

  public Spec annotations(List<Annotation> annotations) {
    this.annotations = annotations;
    for (Annotation item : annotations) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public Spec addAnnotationsItem(Annotation annotationsItem) {
    if (this.annotations == null) {
      this.annotations = new ArrayList<>();
    }
    this.annotations.add(annotationsItem);
    this.unparsed |= annotationsItem.unparsed;
    return this;
  }

  /**
   * A list of annotations used in the workflow. These are like sticky notes for your workflow!
   *
   * @return annotations
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANNOTATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Annotation> getAnnotations() {
    return annotations;
  }

  public void setAnnotations(List<Annotation> annotations) {
    this.annotations = annotations;
  }

  public Spec connectionEnvs(List<ConnectionEnv> connectionEnvs) {
    this.connectionEnvs = connectionEnvs;
    for (ConnectionEnv item : connectionEnvs) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public Spec addConnectionEnvsItem(ConnectionEnv connectionEnvsItem) {
    if (this.connectionEnvs == null) {
      this.connectionEnvs = new ArrayList<>();
    }
    this.connectionEnvs.add(connectionEnvsItem);
    this.unparsed |= connectionEnvsItem.unparsed;
    return this;
  }

  /**
   * A list of connections or connection groups used in the workflow.
   *
   * @return connectionEnvs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONNECTION_ENVS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ConnectionEnv> getConnectionEnvs() {
    return connectionEnvs;
  }

  public void setConnectionEnvs(List<ConnectionEnv> connectionEnvs) {
    this.connectionEnvs = connectionEnvs;
  }

  public Spec handle(String handle) {
    this.handle = handle;
    return this;
  }

  /**
   * Unique identifier used to trigger workflows automatically in Datadog.
   *
   * @return handle
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HANDLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  public Spec inputSchema(InputSchema inputSchema) {
    this.inputSchema = inputSchema;
    this.unparsed |= inputSchema.unparsed;
    return this;
  }

  /**
   * A list of input parameters for the workflow. These can be used as dynamic runtime values in
   * your workflow.
   *
   * @return inputSchema
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INPUT_SCHEMA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public InputSchema getInputSchema() {
    return inputSchema;
  }

  public void setInputSchema(InputSchema inputSchema) {
    this.inputSchema = inputSchema;
  }

  public Spec outputSchema(OutputSchema outputSchema) {
    this.outputSchema = outputSchema;
    this.unparsed |= outputSchema.unparsed;
    return this;
  }

  /**
   * A list of output parameters for the workflow.
   *
   * @return outputSchema
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OUTPUT_SCHEMA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OutputSchema getOutputSchema() {
    return outputSchema;
  }

  public void setOutputSchema(OutputSchema outputSchema) {
    this.outputSchema = outputSchema;
  }

  public Spec steps(List<Step> steps) {
    this.steps = steps;
    for (Step item : steps) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public Spec addStepsItem(Step stepsItem) {
    if (this.steps == null) {
      this.steps = new ArrayList<>();
    }
    this.steps.add(stepsItem);
    this.unparsed |= stepsItem.unparsed;
    return this;
  }

  /**
   * A <code>Step</code> is a sub-component of a workflow. Each <code>Step</code> performs an
   * action.
   *
   * @return steps
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STEPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Step> getSteps() {
    return steps;
  }

  public void setSteps(List<Step> steps) {
    this.steps = steps;
  }

  public Spec triggers(List<Trigger> triggers) {
    this.triggers = triggers;
    for (Trigger item : triggers) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public Spec addTriggersItem(Trigger triggersItem) {
    if (this.triggers == null) {
      this.triggers = new ArrayList<>();
    }
    this.triggers.add(triggersItem);
    this.unparsed |= triggersItem.unparsed;
    return this;
  }

  /**
   * The list of triggers that activate this workflow. At least one trigger is required, and each
   * trigger type may appear at most once.
   *
   * @return triggers
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRIGGERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Trigger> getTriggers() {
    return triggers;
  }

  public void setTriggers(List<Trigger> triggers) {
    this.triggers = triggers;
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
   * @return Spec
   */
  @JsonAnySetter
  public Spec putAdditionalProperty(String key, Object value) {
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

  /** Return true if this Spec object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Spec spec = (Spec) o;
    return Objects.equals(this.annotations, spec.annotations)
        && Objects.equals(this.connectionEnvs, spec.connectionEnvs)
        && Objects.equals(this.handle, spec.handle)
        && Objects.equals(this.inputSchema, spec.inputSchema)
        && Objects.equals(this.outputSchema, spec.outputSchema)
        && Objects.equals(this.steps, spec.steps)
        && Objects.equals(this.triggers, spec.triggers)
        && Objects.equals(this.additionalProperties, spec.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        annotations,
        connectionEnvs,
        handle,
        inputSchema,
        outputSchema,
        steps,
        triggers,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Spec {\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    connectionEnvs: ").append(toIndentedString(connectionEnvs)).append("\n");
    sb.append("    handle: ").append(toIndentedString(handle)).append("\n");
    sb.append("    inputSchema: ").append(toIndentedString(inputSchema)).append("\n");
    sb.append("    outputSchema: ").append(toIndentedString(outputSchema)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    triggers: ").append(toIndentedString(triggers)).append("\n");
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
