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

/** Type identifier for ServiceNow business service resources */
@JsonSerialize(using = ServiceNowBusinessServiceType.ServiceNowBusinessServiceTypeSerializer.class)
public class ServiceNowBusinessServiceType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("business_services"));

  public static final ServiceNowBusinessServiceType BUSINESS_SERVICES =
      new ServiceNowBusinessServiceType("business_services");

  ServiceNowBusinessServiceType(String value) {
    super(value, allowedValues);
  }

  public static class ServiceNowBusinessServiceTypeSerializer
      extends StdSerializer<ServiceNowBusinessServiceType> {
    public ServiceNowBusinessServiceTypeSerializer(Class<ServiceNowBusinessServiceType> t) {
      super(t);
    }

    public ServiceNowBusinessServiceTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ServiceNowBusinessServiceType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ServiceNowBusinessServiceType fromValue(String value) {
    return new ServiceNowBusinessServiceType(value);
  }
}
