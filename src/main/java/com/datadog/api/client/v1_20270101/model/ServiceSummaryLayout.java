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
@JsonSerialize(using = ServiceSummaryLayout.ServiceSummaryLayoutSerializer.class)
public class ServiceSummaryLayout extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("one_column", "two_column", "three_column"));

  public static final ServiceSummaryLayout ONE_COLUMN = new ServiceSummaryLayout("one_column");
  public static final ServiceSummaryLayout TWO_COLUMN = new ServiceSummaryLayout("two_column");
  public static final ServiceSummaryLayout THREE_COLUMN = new ServiceSummaryLayout("three_column");

  ServiceSummaryLayout(String value) {
    super(value, allowedValues);
  }

  public static class ServiceSummaryLayoutSerializer extends StdSerializer<ServiceSummaryLayout> {
    public ServiceSummaryLayoutSerializer(Class<ServiceSummaryLayout> t) {
      super(t);
    }

    public ServiceSummaryLayoutSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ServiceSummaryLayout value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ServiceSummaryLayout fromValue(String value) {
    return new ServiceSummaryLayout(value);
  }
}
