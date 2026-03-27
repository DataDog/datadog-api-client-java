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

/** The definition of Entity V3 System Kind object. */
@JsonSerialize(using = EntityV3SystemKind.EntityV3SystemKindSerializer.class)
public class EntityV3SystemKind extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("system"));

  public static final EntityV3SystemKind SYSTEM = new EntityV3SystemKind("system");

  EntityV3SystemKind(String value) {
    super(value, allowedValues);
  }

  public static class EntityV3SystemKindSerializer extends StdSerializer<EntityV3SystemKind> {
    public EntityV3SystemKindSerializer(Class<EntityV3SystemKind> t) {
      super(t);
    }

    public EntityV3SystemKindSerializer() {
      this(null);
    }

    @Override
    public void serialize(EntityV3SystemKind value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static EntityV3SystemKind fromValue(String value) {
    return new EntityV3SystemKind(value);
  }
}
