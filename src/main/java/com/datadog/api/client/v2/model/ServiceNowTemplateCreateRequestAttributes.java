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
   * <p>Attributes for creating a ServiceNow template</p>
 */
@JsonPropertyOrder({
  ServiceNowTemplateCreateRequestAttributes.JSON_PROPERTY_ASSIGNMENT_GROUP_ID,
  ServiceNowTemplateCreateRequestAttributes.JSON_PROPERTY_BUSINESS_SERVICE_ID,
  ServiceNowTemplateCreateRequestAttributes.JSON_PROPERTY_FIELDS_MAPPING,
  ServiceNowTemplateCreateRequestAttributes.JSON_PROPERTY_HANDLE_NAME,
  ServiceNowTemplateCreateRequestAttributes.JSON_PROPERTY_INSTANCE_ID,
  ServiceNowTemplateCreateRequestAttributes.JSON_PROPERTY_SERVICENOW_TABLENAME,
  ServiceNowTemplateCreateRequestAttributes.JSON_PROPERTY_USER_ID
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ServiceNowTemplateCreateRequestAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ASSIGNMENT_GROUP_ID = "assignment_group_id";
  private UUID assignmentGroupId;

  public static final String JSON_PROPERTY_BUSINESS_SERVICE_ID = "business_service_id";
  private UUID businessServiceId;

  public static final String JSON_PROPERTY_FIELDS_MAPPING = "fields_mapping";
  private Map<String, String> fieldsMapping = null;

  public static final String JSON_PROPERTY_HANDLE_NAME = "handle_name";
  private String handleName;

  public static final String JSON_PROPERTY_INSTANCE_ID = "instance_id";
  private UUID instanceId;

  public static final String JSON_PROPERTY_SERVICENOW_TABLENAME = "servicenow_tablename";
  private String servicenowTablename;

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private UUID userId;

  public ServiceNowTemplateCreateRequestAttributes() {}

  @JsonCreator
  public ServiceNowTemplateCreateRequestAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_HANDLE_NAME)String handleName,
            @JsonProperty(required=true, value=JSON_PROPERTY_INSTANCE_ID)UUID instanceId,
            @JsonProperty(required=true, value=JSON_PROPERTY_SERVICENOW_TABLENAME)String servicenowTablename) {
        this.handleName = handleName;
        this.instanceId = instanceId;
        this.servicenowTablename = servicenowTablename;
  }
  public ServiceNowTemplateCreateRequestAttributes assignmentGroupId(UUID assignmentGroupId) {
    this.assignmentGroupId = assignmentGroupId;
    return this;
  }

  /**
   * <p>The ID of the assignment group</p>
   * @return assignmentGroupId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ASSIGNMENT_GROUP_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UUID getAssignmentGroupId() {
        return assignmentGroupId;
      }
  public void setAssignmentGroupId(UUID assignmentGroupId) {
    this.assignmentGroupId = assignmentGroupId;
  }
  public ServiceNowTemplateCreateRequestAttributes businessServiceId(UUID businessServiceId) {
    this.businessServiceId = businessServiceId;
    return this;
  }

  /**
   * <p>The ID of the business service</p>
   * @return businessServiceId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_BUSINESS_SERVICE_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UUID getBusinessServiceId() {
        return businessServiceId;
      }
  public void setBusinessServiceId(UUID businessServiceId) {
    this.businessServiceId = businessServiceId;
  }
  public ServiceNowTemplateCreateRequestAttributes fieldsMapping(Map<String, String> fieldsMapping) {
    this.fieldsMapping = fieldsMapping;
    return this;
  }
  public ServiceNowTemplateCreateRequestAttributes putFieldsMappingItem(String key, String fieldsMappingItem) {
    if (this.fieldsMapping == null) {
      this.fieldsMapping = new HashMap<>();
    }
    this.fieldsMapping.put(key, fieldsMappingItem);
    return this;
  }

  /**
   * <p>Custom field mappings for the template</p>
   * @return fieldsMapping
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FIELDS_MAPPING)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Map<String, String> getFieldsMapping() {
        return fieldsMapping;
      }
  public void setFieldsMapping(Map<String, String> fieldsMapping) {
    this.fieldsMapping = fieldsMapping;
  }
  public ServiceNowTemplateCreateRequestAttributes handleName(String handleName) {
    this.handleName = handleName;
    return this;
  }

  /**
   * <p>The handle name of the template</p>
   * @return handleName
  **/
      @JsonProperty(JSON_PROPERTY_HANDLE_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getHandleName() {
        return handleName;
      }
  public void setHandleName(String handleName) {
    this.handleName = handleName;
  }
  public ServiceNowTemplateCreateRequestAttributes instanceId(UUID instanceId) {
    this.instanceId = instanceId;
    return this;
  }

  /**
   * <p>The ID of the ServiceNow instance</p>
   * @return instanceId
  **/
      @JsonProperty(JSON_PROPERTY_INSTANCE_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public UUID getInstanceId() {
        return instanceId;
      }
  public void setInstanceId(UUID instanceId) {
    this.instanceId = instanceId;
  }
  public ServiceNowTemplateCreateRequestAttributes servicenowTablename(String servicenowTablename) {
    this.servicenowTablename = servicenowTablename;
    return this;
  }

  /**
   * <p>The name of the destination ServiceNow table</p>
   * @return servicenowTablename
  **/
      @JsonProperty(JSON_PROPERTY_SERVICENOW_TABLENAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getServicenowTablename() {
        return servicenowTablename;
      }
  public void setServicenowTablename(String servicenowTablename) {
    this.servicenowTablename = servicenowTablename;
  }
  public ServiceNowTemplateCreateRequestAttributes userId(UUID userId) {
    this.userId = userId;
    return this;
  }

  /**
   * <p>The ID of the user</p>
   * @return userId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_USER_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UUID getUserId() {
        return userId;
      }
  public void setUserId(UUID userId) {
    this.userId = userId;
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
   * @return ServiceNowTemplateCreateRequestAttributes
   */
  @JsonAnySetter
  public ServiceNowTemplateCreateRequestAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this ServiceNowTemplateCreateRequestAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceNowTemplateCreateRequestAttributes serviceNowTemplateCreateRequestAttributes = (ServiceNowTemplateCreateRequestAttributes) o;
    return Objects.equals(this.assignmentGroupId, serviceNowTemplateCreateRequestAttributes.assignmentGroupId) && Objects.equals(this.businessServiceId, serviceNowTemplateCreateRequestAttributes.businessServiceId) && Objects.equals(this.fieldsMapping, serviceNowTemplateCreateRequestAttributes.fieldsMapping) && Objects.equals(this.handleName, serviceNowTemplateCreateRequestAttributes.handleName) && Objects.equals(this.instanceId, serviceNowTemplateCreateRequestAttributes.instanceId) && Objects.equals(this.servicenowTablename, serviceNowTemplateCreateRequestAttributes.servicenowTablename) && Objects.equals(this.userId, serviceNowTemplateCreateRequestAttributes.userId) && Objects.equals(this.additionalProperties, serviceNowTemplateCreateRequestAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(assignmentGroupId,businessServiceId,fieldsMapping,handleName,instanceId,servicenowTablename,userId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceNowTemplateCreateRequestAttributes {\n");
    sb.append("    assignmentGroupId: ").append(toIndentedString(assignmentGroupId)).append("\n");
    sb.append("    businessServiceId: ").append(toIndentedString(businessServiceId)).append("\n");
    sb.append("    fieldsMapping: ").append(toIndentedString(fieldsMapping)).append("\n");
    sb.append("    handleName: ").append(toIndentedString(handleName)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    servicenowTablename: ").append(toIndentedString(servicenowTablename)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
