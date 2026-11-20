/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

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

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonSerialize(
    using = ServiceSummaryBackendDefinitionType.ServiceSummaryBackendDefinitionTypeSerializer.class)
public class ServiceSummaryBackendDefinitionType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("trace_service"));

  public static final ServiceSummaryBackendDefinitionType TRACE_SERVICE =
      new ServiceSummaryBackendDefinitionType("trace_service");

  ServiceSummaryBackendDefinitionType(String value) {
    super(value, allowedValues);
  }

  public static class ServiceSummaryBackendDefinitionTypeSerializer
      extends StdSerializer<ServiceSummaryBackendDefinitionType> {
    public ServiceSummaryBackendDefinitionTypeSerializer(
        Class<ServiceSummaryBackendDefinitionType> t) {
      super(t);
    }

    public ServiceSummaryBackendDefinitionTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ServiceSummaryBackendDefinitionType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ServiceSummaryBackendDefinitionType fromValue(String value) {
    return new ServiceSummaryBackendDefinitionType(value);
  }
}
