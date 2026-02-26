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

/** The definition of Entity V3 Service Kind object. */
@JsonSerialize(using = EntityV3ServiceKind.EntityV3ServiceKindSerializer.class)
public class EntityV3ServiceKind extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("service"));

  public static final EntityV3ServiceKind SERVICE = new EntityV3ServiceKind("service");

  EntityV3ServiceKind(String value) {
    super(value, allowedValues);
  }

  public static class EntityV3ServiceKindSerializer extends StdSerializer<EntityV3ServiceKind> {
    public EntityV3ServiceKindSerializer(Class<EntityV3ServiceKind> t) {
      super(t);
    }

    public EntityV3ServiceKindSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        EntityV3ServiceKind value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static EntityV3ServiceKind fromValue(String value) {
    return new EntityV3ServiceKind(value);
  }
}
