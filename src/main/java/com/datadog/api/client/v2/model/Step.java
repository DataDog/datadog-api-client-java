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
   * <p>A Step is a sub-component of a workflow. Each Step performs an action.</p>
 */
@JsonPropertyOrder({
  Step.JSON_PROPERTY_ACTION_ID,
  Step.JSON_PROPERTY_COMPLETION_GATE,
  Step.JSON_PROPERTY_CONNECTION_LABEL,
  Step.JSON_PROPERTY_DISPLAY,
  Step.JSON_PROPERTY_ERROR_HANDLERS,
  Step.JSON_PROPERTY_NAME,
  Step.JSON_PROPERTY_OUTBOUND_EDGES,
  Step.JSON_PROPERTY_PARAMETERS,
  Step.JSON_PROPERTY_READINESS_GATE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class Step {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACTION_ID = "actionId";
  private String actionId;

  public static final String JSON_PROPERTY_COMPLETION_GATE = "completionGate";
  private CompletionGate completionGate;

  public static final String JSON_PROPERTY_CONNECTION_LABEL = "connectionLabel";
  private String connectionLabel;

  public static final String JSON_PROPERTY_DISPLAY = "display";
  private StepDisplay display;

  public static final String JSON_PROPERTY_ERROR_HANDLERS = "errorHandlers";
  private List<ErrorHandler> errorHandlers = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OUTBOUND_EDGES = "outboundEdges";
  private List<OutboundEdge> outboundEdges = null;

  public static final String JSON_PROPERTY_PARAMETERS = "parameters";
  private List<Parameter> parameters = null;

  public static final String JSON_PROPERTY_READINESS_GATE = "readinessGate";
  private ReadinessGate readinessGate;

  public Step() {}

  @JsonCreator
  public Step(
            @JsonProperty(required=true, value=JSON_PROPERTY_ACTION_ID)String actionId,
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name) {
        this.actionId = actionId;
        this.name = name;
  }
  public Step actionId(String actionId) {
    this.actionId = actionId;
    return this;
  }

  /**
   * <p>The unique identifier of an action.</p>
   * @return actionId
  **/
      @JsonProperty(JSON_PROPERTY_ACTION_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getActionId() {
        return actionId;
      }
  public void setActionId(String actionId) {
    this.actionId = actionId;
  }
  public Step completionGate(CompletionGate completionGate) {
    this.completionGate = completionGate;
    this.unparsed |= completionGate.unparsed;
    return this;
  }

  /**
   * <p>Used to create conditions before running subsequent actions.</p>
   * @return completionGate
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_COMPLETION_GATE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public CompletionGate getCompletionGate() {
        return completionGate;
      }
  public void setCompletionGate(CompletionGate completionGate) {
    this.completionGate = completionGate;
  }
  public Step connectionLabel(String connectionLabel) {
    this.connectionLabel = connectionLabel;
    return this;
  }

  /**
   * <p>The unique identifier of a connection defined in the spec.</p>
   * @return connectionLabel
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CONNECTION_LABEL)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getConnectionLabel() {
        return connectionLabel;
      }
  public void setConnectionLabel(String connectionLabel) {
    this.connectionLabel = connectionLabel;
  }
  public Step display(StepDisplay display) {
    this.display = display;
    this.unparsed |= display.unparsed;
    return this;
  }

  /**
   * <p>The definition of <code>StepDisplay</code> object.</p>
   * @return display
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DISPLAY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public StepDisplay getDisplay() {
        return display;
      }
  public void setDisplay(StepDisplay display) {
    this.display = display;
  }
  public Step errorHandlers(List<ErrorHandler> errorHandlers) {
    this.errorHandlers = errorHandlers;
    for (ErrorHandler item : errorHandlers) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public Step addErrorHandlersItem(ErrorHandler errorHandlersItem) {
    if (this.errorHandlers == null) {
      this.errorHandlers = new ArrayList<>();
    }
    this.errorHandlers.add(errorHandlersItem);
    this.unparsed |= errorHandlersItem.unparsed;
    return this;
  }

  /**
   * <p>The <code>Step</code> <code>errorHandlers</code>.</p>
   * @return errorHandlers
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ERROR_HANDLERS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<ErrorHandler> getErrorHandlers() {
        return errorHandlers;
      }
  public void setErrorHandlers(List<ErrorHandler> errorHandlers) {
    this.errorHandlers = errorHandlers;
  }
  public Step name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Name of the step.</p>
   * @return name
  **/
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public Step outboundEdges(List<OutboundEdge> outboundEdges) {
    this.outboundEdges = outboundEdges;
    for (OutboundEdge item : outboundEdges) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public Step addOutboundEdgesItem(OutboundEdge outboundEdgesItem) {
    if (this.outboundEdges == null) {
      this.outboundEdges = new ArrayList<>();
    }
    this.outboundEdges.add(outboundEdgesItem);
    this.unparsed |= outboundEdgesItem.unparsed;
    return this;
  }

  /**
   * <p>A list of subsequent actions to run.</p>
   * @return outboundEdges
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_OUTBOUND_EDGES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<OutboundEdge> getOutboundEdges() {
        return outboundEdges;
      }
  public void setOutboundEdges(List<OutboundEdge> outboundEdges) {
    this.outboundEdges = outboundEdges;
  }
  public Step parameters(List<Parameter> parameters) {
    this.parameters = parameters;
    for (Parameter item : parameters) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public Step addParametersItem(Parameter parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<>();
    }
    this.parameters.add(parametersItem);
    this.unparsed |= parametersItem.unparsed;
    return this;
  }

  /**
   * <p>A list of inputs for an action.</p>
   * @return parameters
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PARAMETERS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<Parameter> getParameters() {
        return parameters;
      }
  public void setParameters(List<Parameter> parameters) {
    this.parameters = parameters;
  }
  public Step readinessGate(ReadinessGate readinessGate) {
    this.readinessGate = readinessGate;
    this.unparsed |= readinessGate.unparsed;
    return this;
  }

  /**
   * <p>Used to merge multiple branches into a single branch.</p>
   * @return readinessGate
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_READINESS_GATE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ReadinessGate getReadinessGate() {
        return readinessGate;
      }
  public void setReadinessGate(ReadinessGate readinessGate) {
    this.readinessGate = readinessGate;
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
   * @return Step
   */
  @JsonAnySetter
  public Step putAdditionalProperty(String key, Object value) {
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
   * Return true if this Step object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Step step = (Step) o;
    return Objects.equals(this.actionId, step.actionId) && Objects.equals(this.completionGate, step.completionGate) && Objects.equals(this.connectionLabel, step.connectionLabel) && Objects.equals(this.display, step.display) && Objects.equals(this.errorHandlers, step.errorHandlers) && Objects.equals(this.name, step.name) && Objects.equals(this.outboundEdges, step.outboundEdges) && Objects.equals(this.parameters, step.parameters) && Objects.equals(this.readinessGate, step.readinessGate) && Objects.equals(this.additionalProperties, step.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(actionId,completionGate,connectionLabel,display,errorHandlers,name,outboundEdges,parameters,readinessGate, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Step {\n");
    sb.append("    actionId: ").append(toIndentedString(actionId)).append("\n");
    sb.append("    completionGate: ").append(toIndentedString(completionGate)).append("\n");
    sb.append("    connectionLabel: ").append(toIndentedString(connectionLabel)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    errorHandlers: ").append(toIndentedString(errorHandlers)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    outboundEdges: ").append(toIndentedString(outboundEdges)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    readinessGate: ").append(toIndentedString(readinessGate)).append("\n");
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
