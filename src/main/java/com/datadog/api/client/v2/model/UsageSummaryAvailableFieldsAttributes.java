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

/**
 * The lists of field names returned by <code>GET /api/v1/usage/summary</code> at each of its three
 * response levels. Each list contains every key the data endpoint emits—both typed fields declared
 * in the OpenAPI spec and untyped keys exposed through <code>additionalProperties</code>.
 */
@JsonPropertyOrder({
  UsageSummaryAvailableFieldsAttributes.JSON_PROPERTY_DATE_FIELDS,
  UsageSummaryAvailableFieldsAttributes.JSON_PROPERTY_DATE_ORG_FIELDS,
  UsageSummaryAvailableFieldsAttributes.JSON_PROPERTY_RESPONSE_FIELDS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageSummaryAvailableFieldsAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATE_FIELDS = "date_fields";
  private List<String> dateFields = null;

  public static final String JSON_PROPERTY_DATE_ORG_FIELDS = "date_org_fields";
  private List<String> dateOrgFields = null;

  public static final String JSON_PROPERTY_RESPONSE_FIELDS = "response_fields";
  private List<String> responseFields = null;

  public UsageSummaryAvailableFieldsAttributes dateFields(List<String> dateFields) {
    this.dateFields = dateFields;
    return this;
  }

  public UsageSummaryAvailableFieldsAttributes addDateFieldsItem(String dateFieldsItem) {
    if (this.dateFields == null) {
      this.dateFields = new ArrayList<>();
    }
    this.dateFields.add(dateFieldsItem);
    return this;
  }

  /**
   * Sorted list of every key returned inside each <code>UsageSummaryDate</code> entry of <code>
   * usage[]</code> (typed fields and <code>additionalProperties</code> keys combined).
   *
   * @return dateFields
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getDateFields() {
    return dateFields;
  }

  public void setDateFields(List<String> dateFields) {
    this.dateFields = dateFields;
  }

  public UsageSummaryAvailableFieldsAttributes dateOrgFields(List<String> dateOrgFields) {
    this.dateOrgFields = dateOrgFields;
    return this;
  }

  public UsageSummaryAvailableFieldsAttributes addDateOrgFieldsItem(String dateOrgFieldsItem) {
    if (this.dateOrgFields == null) {
      this.dateOrgFields = new ArrayList<>();
    }
    this.dateOrgFields.add(dateOrgFieldsItem);
    return this;
  }

  /**
   * Sorted list of every key returned inside each <code>UsageSummaryDateOrg</code> entry of <code>
   * usage[].orgs[]</code> (typed fields and <code>additionalProperties</code> keys combined).
   *
   * @return dateOrgFields
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE_ORG_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getDateOrgFields() {
    return dateOrgFields;
  }

  public void setDateOrgFields(List<String> dateOrgFields) {
    this.dateOrgFields = dateOrgFields;
  }

  public UsageSummaryAvailableFieldsAttributes responseFields(List<String> responseFields) {
    this.responseFields = responseFields;
    return this;
  }

  public UsageSummaryAvailableFieldsAttributes addResponseFieldsItem(String responseFieldsItem) {
    if (this.responseFields == null) {
      this.responseFields = new ArrayList<>();
    }
    this.responseFields.add(responseFieldsItem);
    return this;
  }

  /**
   * Sorted list of every key returned as a direct property of <code>UsageSummaryResponse</code>
   * (typed fields and <code>additionalProperties</code> keys combined).
   *
   * @return responseFields
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESPONSE_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getResponseFields() {
    return responseFields;
  }

  public void setResponseFields(List<String> responseFields) {
    this.responseFields = responseFields;
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
   * @return UsageSummaryAvailableFieldsAttributes
   */
  @JsonAnySetter
  public UsageSummaryAvailableFieldsAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this UsageSummaryAvailableFieldsAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageSummaryAvailableFieldsAttributes usageSummaryAvailableFieldsAttributes =
        (UsageSummaryAvailableFieldsAttributes) o;
    return Objects.equals(this.dateFields, usageSummaryAvailableFieldsAttributes.dateFields)
        && Objects.equals(this.dateOrgFields, usageSummaryAvailableFieldsAttributes.dateOrgFields)
        && Objects.equals(this.responseFields, usageSummaryAvailableFieldsAttributes.responseFields)
        && Objects.equals(
            this.additionalProperties, usageSummaryAvailableFieldsAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateFields, dateOrgFields, responseFields, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageSummaryAvailableFieldsAttributes {\n");
    sb.append("    dateFields: ").append(toIndentedString(dateFields)).append("\n");
    sb.append("    dateOrgFields: ").append(toIndentedString(dateOrgFields)).append("\n");
    sb.append("    responseFields: ").append(toIndentedString(responseFields)).append("\n");
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
