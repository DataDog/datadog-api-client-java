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

/** The type of principal allowed to act on behalf of the downtime. */
@JsonSerialize(using = DowntimeRunAsPrincipalType.DowntimeRunAsPrincipalTypeSerializer.class)
public class DowntimeRunAsPrincipalType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("user", "role", "team"));

  public static final DowntimeRunAsPrincipalType USER = new DowntimeRunAsPrincipalType("user");
  public static final DowntimeRunAsPrincipalType ROLE = new DowntimeRunAsPrincipalType("role");
  public static final DowntimeRunAsPrincipalType TEAM = new DowntimeRunAsPrincipalType("team");

  DowntimeRunAsPrincipalType(String value) {
    super(value, allowedValues);
  }

  public static class DowntimeRunAsPrincipalTypeSerializer
      extends StdSerializer<DowntimeRunAsPrincipalType> {
    public DowntimeRunAsPrincipalTypeSerializer(Class<DowntimeRunAsPrincipalType> t) {
      super(t);
    }

    public DowntimeRunAsPrincipalTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DowntimeRunAsPrincipalType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DowntimeRunAsPrincipalType fromValue(String value) {
    return new DowntimeRunAsPrincipalType(value);
  }
}
