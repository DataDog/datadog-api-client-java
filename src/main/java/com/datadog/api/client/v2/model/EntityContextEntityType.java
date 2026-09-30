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

/**
 * The type of entity to retrieve. Only <code>siem_entity_identity</code> is currently supported.
 */
@JsonSerialize(using = EntityContextEntityType.EntityContextEntityTypeSerializer.class)
public class EntityContextEntityType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("siem_entity_identity"));

  public static final EntityContextEntityType SIEM_ENTITY_IDENTITY =
      new EntityContextEntityType("siem_entity_identity");

  EntityContextEntityType(String value) {
    super(value, allowedValues);
  }

  public static class EntityContextEntityTypeSerializer
      extends StdSerializer<EntityContextEntityType> {
    public EntityContextEntityTypeSerializer(Class<EntityContextEntityType> t) {
      super(t);
    }

    public EntityContextEntityTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        EntityContextEntityType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static EntityContextEntityType fromValue(String value) {
    return new EntityContextEntityType(value);
  }
}
