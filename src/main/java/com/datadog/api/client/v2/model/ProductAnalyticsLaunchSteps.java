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

/** Steps of the launch. */
@JsonPropertyOrder({
  ProductAnalyticsLaunchSteps.JSON_PROPERTY_DASHBOARD,
  ProductAnalyticsLaunchSteps.JSON_PROPERTY_EXPERIMENT,
  ProductAnalyticsLaunchSteps.JSON_PROPERTY_FUNNEL,
  ProductAnalyticsLaunchSteps.JSON_PROPERTY_TRACKING_PLAN
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsLaunchSteps {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DASHBOARD = "dashboard";
  private ProductAnalyticsLaunchDashboardStep dashboard;

  public static final String JSON_PROPERTY_EXPERIMENT = "experiment";
  private ProductAnalyticsLaunchExperimentStep experiment;

  public static final String JSON_PROPERTY_FUNNEL = "funnel";
  private ProductAnalyticsLaunchFunnelStep funnel;

  public static final String JSON_PROPERTY_TRACKING_PLAN = "tracking_plan";
  private ProductAnalyticsLaunchTrackingPlan trackingPlan;

  public ProductAnalyticsLaunchSteps dashboard(ProductAnalyticsLaunchDashboardStep dashboard) {
    this.dashboard = dashboard;
    this.unparsed |= dashboard.unparsed;
    return this;
  }

  /**
   * Dashboard linked to the launch.
   *
   * @return dashboard
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DASHBOARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ProductAnalyticsLaunchDashboardStep getDashboard() {
    return dashboard;
  }

  public void setDashboard(ProductAnalyticsLaunchDashboardStep dashboard) {
    this.dashboard = dashboard;
    if (dashboard != null) {
      this.unparsed |= dashboard.unparsed;
    }
  }

  public ProductAnalyticsLaunchSteps experiment(ProductAnalyticsLaunchExperimentStep experiment) {
    this.experiment = experiment;
    this.unparsed |= experiment.unparsed;
    return this;
  }

  /**
   * Experiment linked to the launch. The draft fields are cleared when <code>experiment_id</code>
   * is set.
   *
   * @return experiment
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPERIMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ProductAnalyticsLaunchExperimentStep getExperiment() {
    return experiment;
  }

  public void setExperiment(ProductAnalyticsLaunchExperimentStep experiment) {
    this.experiment = experiment;
    if (experiment != null) {
      this.unparsed |= experiment.unparsed;
    }
  }

  public ProductAnalyticsLaunchSteps funnel(ProductAnalyticsLaunchFunnelStep funnel) {
    this.funnel = funnel;
    this.unparsed |= funnel.unparsed;
    return this;
  }

  /**
   * Funnel linked to the launch.
   *
   * @return funnel
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FUNNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ProductAnalyticsLaunchFunnelStep getFunnel() {
    return funnel;
  }

  public void setFunnel(ProductAnalyticsLaunchFunnelStep funnel) {
    this.funnel = funnel;
    if (funnel != null) {
      this.unparsed |= funnel.unparsed;
    }
  }

  public ProductAnalyticsLaunchSteps trackingPlan(ProductAnalyticsLaunchTrackingPlan trackingPlan) {
    this.trackingPlan = trackingPlan;
    this.unparsed |= trackingPlan.unparsed;
    return this;
  }

  /**
   * Tracking plan of a launch, listing the events and properties to instrument.
   *
   * @return trackingPlan
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRACKING_PLAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ProductAnalyticsLaunchTrackingPlan getTrackingPlan() {
    return trackingPlan;
  }

  public void setTrackingPlan(ProductAnalyticsLaunchTrackingPlan trackingPlan) {
    this.trackingPlan = trackingPlan;
    if (trackingPlan != null) {
      this.unparsed |= trackingPlan.unparsed;
    }
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
   * @return ProductAnalyticsLaunchSteps
   */
  @JsonAnySetter
  public ProductAnalyticsLaunchSteps putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ProductAnalyticsLaunchSteps object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsLaunchSteps productAnalyticsLaunchSteps = (ProductAnalyticsLaunchSteps) o;
    return Objects.equals(this.dashboard, productAnalyticsLaunchSteps.dashboard)
        && Objects.equals(this.experiment, productAnalyticsLaunchSteps.experiment)
        && Objects.equals(this.funnel, productAnalyticsLaunchSteps.funnel)
        && Objects.equals(this.trackingPlan, productAnalyticsLaunchSteps.trackingPlan)
        && Objects.equals(
            this.additionalProperties, productAnalyticsLaunchSteps.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboard, experiment, funnel, trackingPlan, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsLaunchSteps {\n");
    sb.append("    dashboard: ").append(toIndentedString(dashboard)).append("\n");
    sb.append("    experiment: ").append(toIndentedString(experiment)).append("\n");
    sb.append("    funnel: ").append(toIndentedString(funnel)).append("\n");
    sb.append("    trackingPlan: ").append(toIndentedString(trackingPlan)).append("\n");
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
