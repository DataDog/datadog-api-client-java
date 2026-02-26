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

/** Type of the object */
@JsonSerialize(using = IssueUserType.IssueUserTypeSerializer.class)
public class IssueUserType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("user"));

  public static final IssueUserType USER = new IssueUserType("user");

  IssueUserType(String value) {
    super(value, allowedValues);
  }

  public static class IssueUserTypeSerializer extends StdSerializer<IssueUserType> {
    public IssueUserTypeSerializer(Class<IssueUserType> t) {
      super(t);
    }

    public IssueUserTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(IssueUserType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static IssueUserType fromValue(String value) {
    return new IssueUserType(value);
  }
}
