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

/** Type identifier for ServiceNow template resources */
@JsonSerialize(using = ServiceNowTemplateType.ServiceNowTemplateTypeSerializer.class)
public class ServiceNowTemplateType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("servicenow_templates"));

  public static final ServiceNowTemplateType SERVICENOW_TEMPLATES =
      new ServiceNowTemplateType("servicenow_templates");

  ServiceNowTemplateType(String value) {
    super(value, allowedValues);
  }

  public static class ServiceNowTemplateTypeSerializer
      extends StdSerializer<ServiceNowTemplateType> {
    public ServiceNowTemplateTypeSerializer(Class<ServiceNowTemplateType> t) {
      super(t);
    }

    public ServiceNowTemplateTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ServiceNowTemplateType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ServiceNowTemplateType fromValue(String value) {
    return new ServiceNowTemplateType(value);
  }
}
