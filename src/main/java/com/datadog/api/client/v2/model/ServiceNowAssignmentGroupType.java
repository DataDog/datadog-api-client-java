/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.datadog.api.client.ModelEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/** Type identifier for ServiceNow assignment group resources */
@JsonSerialize(using = ServiceNowAssignmentGroupType.ServiceNowAssignmentGroupTypeSerializer.class)
public class ServiceNowAssignmentGroupType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("assignment_groups"));

  public static final ServiceNowAssignmentGroupType ASSIGNMENT_GROUPS =
      new ServiceNowAssignmentGroupType("assignment_groups");

  ServiceNowAssignmentGroupType(String value) {
    super(value, allowedValues);
  }

  public static class ServiceNowAssignmentGroupTypeSerializer
      extends StdSerializer<ServiceNowAssignmentGroupType> {
    public ServiceNowAssignmentGroupTypeSerializer(Class<ServiceNowAssignmentGroupType> t) {
      super(t);
    }

    public ServiceNowAssignmentGroupTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ServiceNowAssignmentGroupType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ServiceNowAssignmentGroupType fromValue(String value) {
    return new ServiceNowAssignmentGroupType(value);
  }
}
