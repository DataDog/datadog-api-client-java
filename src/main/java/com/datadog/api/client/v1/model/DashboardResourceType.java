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

/** Dashboard resource type. */
@JsonSerialize(using = DashboardResourceType.DashboardResourceTypeSerializer.class)
public class DashboardResourceType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("dashboard"));

  public static final DashboardResourceType DASHBOARD = new DashboardResourceType("dashboard");

  DashboardResourceType(String value) {
    super(value, allowedValues);
  }

  public static class DashboardResourceTypeSerializer extends StdSerializer<DashboardResourceType> {
    public DashboardResourceTypeSerializer(Class<DashboardResourceType> t) {
      super(t);
    }

    public DashboardResourceTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DashboardResourceType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DashboardResourceType fromValue(String value) {
    return new DashboardResourceType(value);
  }
}
