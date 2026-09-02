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

/** The definition of Entity V3 API Kind object. */
@JsonSerialize(using = EntityV3APIKind.EntityV3APIKindSerializer.class)
public class EntityV3APIKind extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("api"));

  public static final EntityV3APIKind API = new EntityV3APIKind("api");

  EntityV3APIKind(String value) {
    super(value, allowedValues);
  }

  public static class EntityV3APIKindSerializer extends StdSerializer<EntityV3APIKind> {
    public EntityV3APIKindSerializer(Class<EntityV3APIKind> t) {
      super(t);
    }

    public EntityV3APIKindSerializer() {
      this(null);
    }

    @Override
    public void serialize(EntityV3APIKind value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static EntityV3APIKind fromValue(String value) {
    return new EntityV3APIKind(value);
  }
}
