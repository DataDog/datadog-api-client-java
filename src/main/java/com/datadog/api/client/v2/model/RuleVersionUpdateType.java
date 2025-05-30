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

/** The type of change. */
@JsonSerialize(using = RuleVersionUpdateType.RuleVersionUpdateTypeSerializer.class)
public class RuleVersionUpdateType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("create", "update", "delete"));

  public static final RuleVersionUpdateType CREATE = new RuleVersionUpdateType("create");
  public static final RuleVersionUpdateType UPDATE = new RuleVersionUpdateType("update");
  public static final RuleVersionUpdateType DELETE = new RuleVersionUpdateType("delete");

  RuleVersionUpdateType(String value) {
    super(value, allowedValues);
  }

  public static class RuleVersionUpdateTypeSerializer extends StdSerializer<RuleVersionUpdateType> {
    public RuleVersionUpdateTypeSerializer(Class<RuleVersionUpdateType> t) {
      super(t);
    }

    public RuleVersionUpdateTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RuleVersionUpdateType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RuleVersionUpdateType fromValue(String value) {
    return new RuleVersionUpdateType(value);
  }
}
