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
   * <p>The incident's attributes for a create request.</p>
 */
@JsonPropertyOrder({
  IncidentCreateAttributes.JSON_PROPERTY_CUSTOMER_IMPACT_SCOPE,
  IncidentCreateAttributes.JSON_PROPERTY_CUSTOMER_IMPACTED,
  IncidentCreateAttributes.JSON_PROPERTY_FIELDS,
  IncidentCreateAttributes.JSON_PROPERTY_INCIDENT_TYPE_UUID,
  IncidentCreateAttributes.JSON_PROPERTY_INITIAL_CELLS,
  IncidentCreateAttributes.JSON_PROPERTY_IS_TEST,
  IncidentCreateAttributes.JSON_PROPERTY_NOTIFICATION_HANDLES,
  IncidentCreateAttributes.JSON_PROPERTY_TITLE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentCreateAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CUSTOMER_IMPACT_SCOPE = "customer_impact_scope";
  private String customerImpactScope;

  public static final String JSON_PROPERTY_CUSTOMER_IMPACTED = "customer_impacted";
  private Boolean customerImpacted;

  public static final String JSON_PROPERTY_FIELDS = "fields";
  private Map<String, IncidentFieldAttributes> fields = null;

  public static final String JSON_PROPERTY_INCIDENT_TYPE_UUID = "incident_type_uuid";
  private String incidentTypeUuid;

  public static final String JSON_PROPERTY_INITIAL_CELLS = "initial_cells";
  private List<IncidentTimelineCellCreateAttributes> initialCells = null;

  public static final String JSON_PROPERTY_IS_TEST = "is_test";
  private Boolean isTest;

  public static final String JSON_PROPERTY_NOTIFICATION_HANDLES = "notification_handles";
  private List<IncidentNotificationHandle> notificationHandles = null;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public IncidentCreateAttributes() {}

  @JsonCreator
  public IncidentCreateAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_CUSTOMER_IMPACTED)Boolean customerImpacted,
            @JsonProperty(required=true, value=JSON_PROPERTY_TITLE)String title) {
        this.customerImpacted = customerImpacted;
        this.title = title;
  }
  public IncidentCreateAttributes customerImpactScope(String customerImpactScope) {
    this.customerImpactScope = customerImpactScope;
    return this;
  }

  /**
   * <p>Required if <code>customer_impacted:"true"</code>. A summary of the impact customers experienced during the incident.</p>
   * @return customerImpactScope
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CUSTOMER_IMPACT_SCOPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getCustomerImpactScope() {
        return customerImpactScope;
      }
  public void setCustomerImpactScope(String customerImpactScope) {
    this.customerImpactScope = customerImpactScope;
  }
  public IncidentCreateAttributes customerImpacted(Boolean customerImpacted) {
    this.customerImpacted = customerImpacted;
    return this;
  }

  /**
   * <p>A flag indicating whether the incident caused customer impact.</p>
   * @return customerImpacted
  **/
      @JsonProperty(JSON_PROPERTY_CUSTOMER_IMPACTED)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Boolean getCustomerImpacted() {
        return customerImpacted;
      }
  public void setCustomerImpacted(Boolean customerImpacted) {
    this.customerImpacted = customerImpacted;
  }
  public IncidentCreateAttributes fields(Map<String, IncidentFieldAttributes> fields) {
    this.fields = fields;
    return this;
  }
  public IncidentCreateAttributes putFieldsItem(String key, IncidentFieldAttributes fieldsItem) {
    if (this.fields == null) {
      this.fields = new HashMap<>();
    }
    this.fields.put(key, fieldsItem);
    return this;
  }

  /**
   * <p>A condensed view of the user-defined fields for which to create initial selections.</p>
   * @return fields
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FIELDS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Map<String, IncidentFieldAttributes> getFields() {
        return fields;
      }
  public void setFields(Map<String, IncidentFieldAttributes> fields) {
    this.fields = fields;
  }
  public IncidentCreateAttributes incidentTypeUuid(String incidentTypeUuid) {
    this.incidentTypeUuid = incidentTypeUuid;
    return this;
  }

  /**
   * <p>A unique identifier that represents an incident type. The default incident type will be used if this property is not provided.</p>
   * @return incidentTypeUuid
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INCIDENT_TYPE_UUID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getIncidentTypeUuid() {
        return incidentTypeUuid;
      }
  public void setIncidentTypeUuid(String incidentTypeUuid) {
    this.incidentTypeUuid = incidentTypeUuid;
  }
  public IncidentCreateAttributes initialCells(List<IncidentTimelineCellCreateAttributes> initialCells) {
    this.initialCells = initialCells;
    for (IncidentTimelineCellCreateAttributes item : initialCells) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public IncidentCreateAttributes addInitialCellsItem(IncidentTimelineCellCreateAttributes initialCellsItem) {
    if (this.initialCells == null) {
      this.initialCells = new ArrayList<>();
    }
    this.initialCells.add(initialCellsItem);
    this.unparsed |= initialCellsItem.unparsed;
    return this;
  }

  /**
   * <p>An array of initial timeline cells to be placed at the beginning of the incident timeline.</p>
   * @return initialCells
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INITIAL_CELLS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<IncidentTimelineCellCreateAttributes> getInitialCells() {
        return initialCells;
      }
  public void setInitialCells(List<IncidentTimelineCellCreateAttributes> initialCells) {
    this.initialCells = initialCells;
  }
  public IncidentCreateAttributes isTest(Boolean isTest) {
    this.isTest = isTest;
    return this;
  }

  /**
   * <p>A flag indicating whether the incident is a test incident.</p>
   * @return isTest
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_IS_TEST)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getIsTest() {
        return isTest;
      }
  public void setIsTest(Boolean isTest) {
    this.isTest = isTest;
  }
  public IncidentCreateAttributes notificationHandles(List<IncidentNotificationHandle> notificationHandles) {
    this.notificationHandles = notificationHandles;
    for (IncidentNotificationHandle item : notificationHandles) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public IncidentCreateAttributes addNotificationHandlesItem(IncidentNotificationHandle notificationHandlesItem) {
    if (this.notificationHandles == null) {
      this.notificationHandles = new ArrayList<>();
    }
    this.notificationHandles.add(notificationHandlesItem);
    this.unparsed |= notificationHandlesItem.unparsed;
    return this;
  }

  /**
   * <p>Notification handles that will be notified of the incident at creation.</p>
   * @return notificationHandles
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NOTIFICATION_HANDLES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<IncidentNotificationHandle> getNotificationHandles() {
        return notificationHandles;
      }
  public void setNotificationHandles(List<IncidentNotificationHandle> notificationHandles) {
    this.notificationHandles = notificationHandles;
  }
  public IncidentCreateAttributes title(String title) {
    this.title = title;
    return this;
  }

  /**
   * <p>The title of the incident, which summarizes what happened.</p>
   * @return title
  **/
      @JsonProperty(JSON_PROPERTY_TITLE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getTitle() {
        return title;
      }
  public void setTitle(String title) {
    this.title = title;
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
   * @return IncidentCreateAttributes
   */
  @JsonAnySetter
  public IncidentCreateAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this IncidentCreateAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentCreateAttributes incidentCreateAttributes = (IncidentCreateAttributes) o;
    return Objects.equals(this.customerImpactScope, incidentCreateAttributes.customerImpactScope) && Objects.equals(this.customerImpacted, incidentCreateAttributes.customerImpacted) && Objects.equals(this.fields, incidentCreateAttributes.fields) && Objects.equals(this.incidentTypeUuid, incidentCreateAttributes.incidentTypeUuid) && Objects.equals(this.initialCells, incidentCreateAttributes.initialCells) && Objects.equals(this.isTest, incidentCreateAttributes.isTest) && Objects.equals(this.notificationHandles, incidentCreateAttributes.notificationHandles) && Objects.equals(this.title, incidentCreateAttributes.title) && Objects.equals(this.additionalProperties, incidentCreateAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(customerImpactScope,customerImpacted,fields,incidentTypeUuid,initialCells,isTest,notificationHandles,title, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentCreateAttributes {\n");
    sb.append("    customerImpactScope: ").append(toIndentedString(customerImpactScope)).append("\n");
    sb.append("    customerImpacted: ").append(toIndentedString(customerImpacted)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    incidentTypeUuid: ").append(toIndentedString(incidentTypeUuid)).append("\n");
    sb.append("    initialCells: ").append(toIndentedString(initialCells)).append("\n");
    sb.append("    isTest: ").append(toIndentedString(isTest)).append("\n");
    sb.append("    notificationHandles: ").append(toIndentedString(notificationHandles)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
