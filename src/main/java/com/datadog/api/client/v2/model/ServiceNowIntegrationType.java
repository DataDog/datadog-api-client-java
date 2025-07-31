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

/** The definition of the <code>ServiceNowIntegrationType</code> object. */
@JsonSerialize(using = ServiceNowIntegrationType.ServiceNowIntegrationTypeSerializer.class)
public class ServiceNowIntegrationType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("ServiceNow"));

  public static final ServiceNowIntegrationType SERVICENOW =
      new ServiceNowIntegrationType("ServiceNow");

  ServiceNowIntegrationType(String value) {
    super(value, allowedValues);
  }

  public static class ServiceNowIntegrationTypeSerializer
      extends StdSerializer<ServiceNowIntegrationType> {
    public ServiceNowIntegrationTypeSerializer(Class<ServiceNowIntegrationType> t) {
      super(t);
    }

    public ServiceNowIntegrationTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ServiceNowIntegrationType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ServiceNowIntegrationType fromValue(String value) {
    return new ServiceNowIntegrationType(value);
  }
}
