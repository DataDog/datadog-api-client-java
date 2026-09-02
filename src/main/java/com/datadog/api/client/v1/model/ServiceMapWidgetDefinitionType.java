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

/** Type of the service map widget. */
@JsonSerialize(
    using = ServiceMapWidgetDefinitionType.ServiceMapWidgetDefinitionTypeSerializer.class)
public class ServiceMapWidgetDefinitionType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("servicemap"));

  public static final ServiceMapWidgetDefinitionType SERVICEMAP =
      new ServiceMapWidgetDefinitionType("servicemap");

  ServiceMapWidgetDefinitionType(String value) {
    super(value, allowedValues);
  }

  public static class ServiceMapWidgetDefinitionTypeSerializer
      extends StdSerializer<ServiceMapWidgetDefinitionType> {
    public ServiceMapWidgetDefinitionTypeSerializer(Class<ServiceMapWidgetDefinitionType> t) {
      super(t);
    }

    public ServiceMapWidgetDefinitionTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ServiceMapWidgetDefinitionType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ServiceMapWidgetDefinitionType fromValue(String value) {
    return new ServiceMapWidgetDefinitionType(value);
  }
}
