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

/** Shared dashboard resource type. */
@JsonSerialize(using = SharedDashboardType.SharedDashboardTypeSerializer.class)
public class SharedDashboardType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("shared_dashboard"));

  public static final SharedDashboardType SHARED_DASHBOARD =
      new SharedDashboardType("shared_dashboard");

  SharedDashboardType(String value) {
    super(value, allowedValues);
  }

  public static class SharedDashboardTypeSerializer extends StdSerializer<SharedDashboardType> {
    public SharedDashboardTypeSerializer(Class<SharedDashboardType> t) {
      super(t);
    }

    public SharedDashboardTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SharedDashboardType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SharedDashboardType fromValue(String value) {
    return new SharedDashboardType(value);
  }
}
