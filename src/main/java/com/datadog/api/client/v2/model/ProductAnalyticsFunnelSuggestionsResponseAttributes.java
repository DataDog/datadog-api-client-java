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

/** Attributes of a feature suggestions response. */
@JsonPropertyOrder({ProductAnalyticsFunnelSuggestionsResponseAttributes.JSON_PROPERTY_APPLICATIONS})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsFunnelSuggestionsResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_APPLICATIONS = "applications";
  private List<ProductAnalyticsFunnelSuggestionsApplication> applications = null;

  public ProductAnalyticsFunnelSuggestionsResponseAttributes applications(
      List<ProductAnalyticsFunnelSuggestionsApplication> applications) {
    this.applications = applications;
    if (applications != null) {
      for (ProductAnalyticsFunnelSuggestionsApplication item : applications) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ProductAnalyticsFunnelSuggestionsResponseAttributes addApplicationsItem(
      ProductAnalyticsFunnelSuggestionsApplication applicationsItem) {
    if (this.applications == null) {
      this.applications = new ArrayList<>();
    }
    this.applications.add(applicationsItem);
    this.unparsed |= applicationsItem.unparsed;
    return this;
  }

  /**
   * Suggested features, grouped by application and feature area.
   *
   * @return applications
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPLICATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ProductAnalyticsFunnelSuggestionsApplication> getApplications() {
    return applications;
  }

  public void setApplications(List<ProductAnalyticsFunnelSuggestionsApplication> applications) {
    this.applications = applications;
    if (applications != null) {
      for (ProductAnalyticsFunnelSuggestionsApplication item : applications) {
        this.unparsed |= item.unparsed;
      }
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
   * @return ProductAnalyticsFunnelSuggestionsResponseAttributes
   */
  @JsonAnySetter
  public ProductAnalyticsFunnelSuggestionsResponseAttributes putAdditionalProperty(
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

  /**
   * Return true if this ProductAnalyticsFunnelSuggestionsResponseAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsFunnelSuggestionsResponseAttributes
        productAnalyticsFunnelSuggestionsResponseAttributes =
            (ProductAnalyticsFunnelSuggestionsResponseAttributes) o;
    return Objects.equals(
            this.applications, productAnalyticsFunnelSuggestionsResponseAttributes.applications)
        && Objects.equals(
            this.additionalProperties,
            productAnalyticsFunnelSuggestionsResponseAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applications, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsFunnelSuggestionsResponseAttributes {\n");
    sb.append("    applications: ").append(toIndentedString(applications)).append("\n");
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
