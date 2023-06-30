/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** Type of the service summary widget. */
@JsonSerialize(
    using = ServiceSummaryWidgetDefinitionType.ServiceSummaryWidgetDefinitionTypeSerializer.class)
public class ServiceSummaryWidgetDefinitionType extends ModelEnum<String> {

  public static final ServiceSummaryWidgetDefinitionType TRACE_SERVICE =
      new ServiceSummaryWidgetDefinitionType("trace_service");

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("trace_service"));

  ServiceSummaryWidgetDefinitionType(String value) {
    this.value = value;
    this.localAllowedValues = allowedValues;
  }

  public static class ServiceSummaryWidgetDefinitionTypeSerializer
      extends StdSerializer<ServiceSummaryWidgetDefinitionType> {
    public ServiceSummaryWidgetDefinitionTypeSerializer(
        Class<ServiceSummaryWidgetDefinitionType> t) {
      super(t);
    }

    public ServiceSummaryWidgetDefinitionTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ServiceSummaryWidgetDefinitionType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ServiceSummaryWidgetDefinitionType fromValue(String value) {
    return new ServiceSummaryWidgetDefinitionType(value);
  }
}
