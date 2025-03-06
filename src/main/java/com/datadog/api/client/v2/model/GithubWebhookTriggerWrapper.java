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

/** Schema for a GitHub webhook-based trigger. */
@JsonPropertyOrder({
  GithubWebhookTriggerWrapper.JSON_PROPERTY_GITHUB_WEBHOOK_TRIGGER,
  GithubWebhookTriggerWrapper.JSON_PROPERTY_START_STEP_NAMES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GithubWebhookTriggerWrapper {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_GITHUB_WEBHOOK_TRIGGER = "githubWebhookTrigger";
  private GithubWebhookTrigger githubWebhookTrigger;

  public static final String JSON_PROPERTY_START_STEP_NAMES = "startStepNames";
  private List<String> startStepNames = null;

  public GithubWebhookTriggerWrapper() {}

  @JsonCreator
  public GithubWebhookTriggerWrapper(
      @JsonProperty(required = true, value = JSON_PROPERTY_GITHUB_WEBHOOK_TRIGGER)
          GithubWebhookTrigger githubWebhookTrigger) {
    this.githubWebhookTrigger = githubWebhookTrigger;
    this.unparsed |= githubWebhookTrigger.unparsed;
  }

  public GithubWebhookTriggerWrapper githubWebhookTrigger(
      GithubWebhookTrigger githubWebhookTrigger) {
    this.githubWebhookTrigger = githubWebhookTrigger;
    this.unparsed |= githubWebhookTrigger.unparsed;
    return this;
  }

  /**
   * Trigger a workflow VIA GitHub webhook. To trigger a workflow from GitHub, you must set a <code>
   * webhookSecret</code>. In your GitHub Webhook Settings, set the Payload URL to
   * "base_url"/api/v2/workflows/"workflow_id"/webhook?orgId="org_id", select application/json for
   * the content type, and be highly recommend enabling SSL verification for security. The workflow
   * must be published.
   *
   * @return githubWebhookTrigger
   */
  @JsonProperty(JSON_PROPERTY_GITHUB_WEBHOOK_TRIGGER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public GithubWebhookTrigger getGithubWebhookTrigger() {
    return githubWebhookTrigger;
  }

  public void setGithubWebhookTrigger(GithubWebhookTrigger githubWebhookTrigger) {
    this.githubWebhookTrigger = githubWebhookTrigger;
  }

  public GithubWebhookTriggerWrapper startStepNames(List<String> startStepNames) {
    this.startStepNames = startStepNames;
    return this;
  }

  public GithubWebhookTriggerWrapper addStartStepNamesItem(String startStepNamesItem) {
    if (this.startStepNames == null) {
      this.startStepNames = new ArrayList<>();
    }
    this.startStepNames.add(startStepNamesItem);
    return this;
  }

  /**
   * A list of steps that run first after a trigger fires.
   *
   * @return startStepNames
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_STEP_NAMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getStartStepNames() {
    return startStepNames;
  }

  public void setStartStepNames(List<String> startStepNames) {
    this.startStepNames = startStepNames;
  }

  /** Return true if this GithubWebhookTriggerWrapper object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GithubWebhookTriggerWrapper githubWebhookTriggerWrapper = (GithubWebhookTriggerWrapper) o;
    return Objects.equals(
            this.githubWebhookTrigger, githubWebhookTriggerWrapper.githubWebhookTrigger)
        && Objects.equals(this.startStepNames, githubWebhookTriggerWrapper.startStepNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(githubWebhookTrigger, startStepNames);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GithubWebhookTriggerWrapper {\n");
    sb.append("    githubWebhookTrigger: ")
        .append(toIndentedString(githubWebhookTrigger))
        .append("\n");
    sb.append("    startStepNames: ").append(toIndentedString(startStepNames)).append("\n");
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
