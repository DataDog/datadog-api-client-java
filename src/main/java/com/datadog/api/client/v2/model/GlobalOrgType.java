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

/** The resource type for global user organizations. */
@JsonSerialize(using = GlobalOrgType.GlobalOrgTypeSerializer.class)
public class GlobalOrgType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("global_user_orgs"));

  public static final GlobalOrgType GLOBAL_USER_ORGS = new GlobalOrgType("global_user_orgs");

  GlobalOrgType(String value) {
    super(value, allowedValues);
  }

  public static class GlobalOrgTypeSerializer extends StdSerializer<GlobalOrgType> {
    public GlobalOrgTypeSerializer(Class<GlobalOrgType> t) {
      super(t);
    }

    public GlobalOrgTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(GlobalOrgType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static GlobalOrgType fromValue(String value) {
    return new GlobalOrgType(value);
  }
}
