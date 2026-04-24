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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** CI information associated with the test result. */
@JsonPropertyOrder({
  SyntheticsTestResultCI.JSON_PROPERTY_PIPELINE,
  SyntheticsTestResultCI.JSON_PROPERTY_PROVIDER,
  SyntheticsTestResultCI.JSON_PROPERTY_STAGE,
  SyntheticsTestResultCI.JSON_PROPERTY_WORKSPACE_PATH
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestResultCI {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_PIPELINE = "pipeline";
  private SyntheticsTestResultCIPipeline pipeline;

  public static final String JSON_PROPERTY_PROVIDER = "provider";
  private SyntheticsTestResultCIProvider provider;

  public static final String JSON_PROPERTY_STAGE = "stage";
  private SyntheticsTestResultCIStage stage;

  public static final String JSON_PROPERTY_WORKSPACE_PATH = "workspace_path";
  private String workspacePath;

  public SyntheticsTestResultCI pipeline(SyntheticsTestResultCIPipeline pipeline) {
    this.pipeline = pipeline;
    this.unparsed |= pipeline.unparsed;
    return this;
  }

  /**
   * Details of the CI pipeline.
   *
   * @return pipeline
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PIPELINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestResultCIPipeline getPipeline() {
    return pipeline;
  }

  public void setPipeline(SyntheticsTestResultCIPipeline pipeline) {
    this.pipeline = pipeline;
  }

  public SyntheticsTestResultCI provider(SyntheticsTestResultCIProvider provider) {
    this.provider = provider;
    this.unparsed |= provider.unparsed;
    return this;
  }

  /**
   * Details of the CI provider.
   *
   * @return provider
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestResultCIProvider getProvider() {
    return provider;
  }

  public void setProvider(SyntheticsTestResultCIProvider provider) {
    this.provider = provider;
  }

  public SyntheticsTestResultCI stage(SyntheticsTestResultCIStage stage) {
    this.stage = stage;
    this.unparsed |= stage.unparsed;
    return this;
  }

  /**
   * Details of the CI stage.
   *
   * @return stage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestResultCIStage getStage() {
    return stage;
  }

  public void setStage(SyntheticsTestResultCIStage stage) {
    this.stage = stage;
  }

  public SyntheticsTestResultCI workspacePath(String workspacePath) {
    this.workspacePath = workspacePath;
    return this;
  }

  /**
   * Path of the workspace that ran the CI job.
   *
   * @return workspacePath
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WORKSPACE_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getWorkspacePath() {
    return workspacePath;
  }

  public void setWorkspacePath(String workspacePath) {
    this.workspacePath = workspacePath;
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
   * @return SyntheticsTestResultCI
   */
  @JsonAnySetter
  public SyntheticsTestResultCI putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsTestResultCI object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestResultCI syntheticsTestResultCi = (SyntheticsTestResultCI) o;
    return Objects.equals(this.pipeline, syntheticsTestResultCi.pipeline)
        && Objects.equals(this.provider, syntheticsTestResultCi.provider)
        && Objects.equals(this.stage, syntheticsTestResultCi.stage)
        && Objects.equals(this.workspacePath, syntheticsTestResultCi.workspacePath)
        && Objects.equals(this.additionalProperties, syntheticsTestResultCi.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pipeline, provider, stage, workspacePath, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestResultCI {\n");
    sb.append("    pipeline: ").append(toIndentedString(pipeline)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    stage: ").append(toIndentedString(stage)).append("\n");
    sb.append("    workspacePath: ").append(toIndentedString(workspacePath)).append("\n");
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
