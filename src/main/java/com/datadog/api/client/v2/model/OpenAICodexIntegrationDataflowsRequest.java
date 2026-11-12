/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/**
 * Data Datadog collects from OpenAI Codex, keyed by dataflow id. Daily Codex analytics metrics are
 * always collected; each dataflow here adds a further kind of collection on top of that baseline,
 * so set <code>enabled</code> to start or stop it. Defaults listed on each dataflow apply when the
 * account is created; on update, omitted fields keep their current values. Every dataflow requires
 * an OpenAI enterprise subscription with Codex enabled; a dataflow enabled without it is stored but
 * collects no data.
 */
@JsonPropertyOrder({
  OpenAICodexIntegrationDataflowsRequest.JSON_PROPERTY_OPENAI_CODEX_DORA,
  OpenAICodexIntegrationDataflowsRequest.JSON_PROPERTY_OPENAI_CODEX_TURN_METRICS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OpenAICodexIntegrationDataflowsRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_OPENAI_CODEX_DORA = "openai-codex-dora";
  private OpenAICodexDoraIntegrationDataflowRequest openaiCodexDora;

  public static final String JSON_PROPERTY_OPENAI_CODEX_TURN_METRICS = "openai-codex-turn-metrics";
  private OpenAICodexTurnMetricsIntegrationDataflowRequest openaiCodexTurnMetrics;

  public OpenAICodexIntegrationDataflowsRequest openaiCodexDora(
      OpenAICodexDoraIntegrationDataflowRequest openaiCodexDora) {
    this.openaiCodexDora = openaiCodexDora;
    this.unparsed |= openaiCodexDora.unparsed;
    return this;
  }

  /**
   * A daily per-engineer engagement signal that <a
   * href="https://docs.datadoghq.com/delivery_performance/ai_impact/">AI Impact</a> uses to
   * attribute AI-assisted pull requests.
   *
   * @return openaiCodexDora
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPENAI_CODEX_DORA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OpenAICodexDoraIntegrationDataflowRequest getOpenaiCodexDora() {
    return openaiCodexDora;
  }

  public void setOpenaiCodexDora(OpenAICodexDoraIntegrationDataflowRequest openaiCodexDora) {
    this.openaiCodexDora = openaiCodexDora;
    if (openaiCodexDora != null) {
      this.unparsed |= openaiCodexDora.unparsed;
    }
  }

  public OpenAICodexIntegrationDataflowsRequest openaiCodexTurnMetrics(
      OpenAICodexTurnMetricsIntegrationDataflowRequest openaiCodexTurnMetrics) {
    this.openaiCodexTurnMetrics = openaiCodexTurnMetrics;
    this.unparsed |= openaiCodexTurnMetrics.unparsed;
    return this;
  }

  /**
   * Hourly turn-level metrics from the OpenAI Compliance Logs Platform, including turn and session
   * identity, Work Insights classification, token usage, credits, estimated cost, duration, and
   * skill, plugin, and artifact activity. Turn cost is a provider estimate and can differ from
   * invoiced charges. Requires the <code>
   * chatgpt.enterprise.compliance_logs_platform.workspace_analytics.read</code> scope on the key in
   * <code>authentication</code>; without it this dataflow collects no data.
   *
   * @return openaiCodexTurnMetrics
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPENAI_CODEX_TURN_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OpenAICodexTurnMetricsIntegrationDataflowRequest getOpenaiCodexTurnMetrics() {
    return openaiCodexTurnMetrics;
  }

  public void setOpenaiCodexTurnMetrics(
      OpenAICodexTurnMetricsIntegrationDataflowRequest openaiCodexTurnMetrics) {
    this.openaiCodexTurnMetrics = openaiCodexTurnMetrics;
    if (openaiCodexTurnMetrics != null) {
      this.unparsed |= openaiCodexTurnMetrics.unparsed;
    }
  }

  /** Return true if this OpenAICodexIntegrationDataflowsRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenAICodexIntegrationDataflowsRequest openAiCodexIntegrationDataflowsRequest =
        (OpenAICodexIntegrationDataflowsRequest) o;
    return Objects.equals(
            this.openaiCodexDora, openAiCodexIntegrationDataflowsRequest.openaiCodexDora)
        && Objects.equals(
            this.openaiCodexTurnMetrics,
            openAiCodexIntegrationDataflowsRequest.openaiCodexTurnMetrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(openaiCodexDora, openaiCodexTurnMetrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenAICodexIntegrationDataflowsRequest {\n");
    sb.append("    openaiCodexDora: ").append(toIndentedString(openaiCodexDora)).append("\n");
    sb.append("    openaiCodexTurnMetrics: ")
        .append(toIndentedString(openaiCodexTurnMetrics))
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
