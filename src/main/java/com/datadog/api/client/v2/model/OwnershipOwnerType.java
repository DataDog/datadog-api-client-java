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

/** The owner type for an ownership inference. */
@JsonSerialize(using = OwnershipOwnerType.OwnershipOwnerTypeSerializer.class)
public class OwnershipOwnerType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("user", "team", "service", "unknown"));

  public static final OwnershipOwnerType USER = new OwnershipOwnerType("user");
  public static final OwnershipOwnerType TEAM = new OwnershipOwnerType("team");
  public static final OwnershipOwnerType SERVICE = new OwnershipOwnerType("service");
  public static final OwnershipOwnerType UNKNOWN = new OwnershipOwnerType("unknown");

  OwnershipOwnerType(String value) {
    super(value, allowedValues);
  }

  public static class OwnershipOwnerTypeSerializer extends StdSerializer<OwnershipOwnerType> {
    public OwnershipOwnerTypeSerializer(Class<OwnershipOwnerType> t) {
      super(t);
    }

    public OwnershipOwnerTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(OwnershipOwnerType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static OwnershipOwnerType fromValue(String value) {
    return new OwnershipOwnerType(value);
  }
}
