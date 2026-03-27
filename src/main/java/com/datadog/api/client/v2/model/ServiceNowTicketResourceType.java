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

/** ServiceNow ticket resource type */
@JsonSerialize(using = ServiceNowTicketResourceType.ServiceNowTicketResourceTypeSerializer.class)
public class ServiceNowTicketResourceType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("tickets"));

  public static final ServiceNowTicketResourceType TICKETS =
      new ServiceNowTicketResourceType("tickets");

  ServiceNowTicketResourceType(String value) {
    super(value, allowedValues);
  }

  public static class ServiceNowTicketResourceTypeSerializer
      extends StdSerializer<ServiceNowTicketResourceType> {
    public ServiceNowTicketResourceTypeSerializer(Class<ServiceNowTicketResourceType> t) {
      super(t);
    }

    public ServiceNowTicketResourceTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ServiceNowTicketResourceType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ServiceNowTicketResourceType fromValue(String value) {
    return new ServiceNowTicketResourceType(value);
  }
}
