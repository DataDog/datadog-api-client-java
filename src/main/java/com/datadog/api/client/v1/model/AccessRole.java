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

/**
 * The access role of the user. Options are <strong>st</strong> (standard user),
 * <strong>adm</strong> (admin user), or <strong>ro</strong> (read-only user).
 */
@JsonSerialize(using = AccessRole.AccessRoleSerializer.class)
public class AccessRole extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("st", "adm", "ro", "ERROR"));

  public static final AccessRole STANDARD = new AccessRole("st");
  public static final AccessRole ADMIN = new AccessRole("adm");
  public static final AccessRole READ_ONLY = new AccessRole("ro");
  public static final AccessRole ERROR = new AccessRole("ERROR");

  AccessRole(String value) {
    super(value, allowedValues);
  }

  public static class AccessRoleSerializer extends StdSerializer<AccessRole> {
    public AccessRoleSerializer(Class<AccessRole> t) {
      super(t);
    }

    public AccessRoleSerializer() {
      this(null);
    }

    @Override
    public void serialize(AccessRole value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AccessRole fromValue(String value) {
    return new AccessRole(value);
  }
}
