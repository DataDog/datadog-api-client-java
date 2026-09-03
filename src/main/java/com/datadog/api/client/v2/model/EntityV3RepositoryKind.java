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

/** The definition of Entity V3 Repository Kind object. */
@JsonSerialize(using = EntityV3RepositoryKind.EntityV3RepositoryKindSerializer.class)
public class EntityV3RepositoryKind extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("repository"));

  public static final EntityV3RepositoryKind REPOSITORY = new EntityV3RepositoryKind("repository");

  EntityV3RepositoryKind(String value) {
    super(value, allowedValues);
  }

  public static class EntityV3RepositoryKindSerializer
      extends StdSerializer<EntityV3RepositoryKind> {
    public EntityV3RepositoryKindSerializer(Class<EntityV3RepositoryKind> t) {
      super(t);
    }

    public EntityV3RepositoryKindSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        EntityV3RepositoryKind value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static EntityV3RepositoryKind fromValue(String value) {
    return new EntityV3RepositoryKind(value);
  }
}
