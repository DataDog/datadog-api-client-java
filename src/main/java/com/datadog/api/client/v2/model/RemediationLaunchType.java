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

/** ECS launch type. */
@JsonSerialize(using = RemediationLaunchType.RemediationLaunchTypeSerializer.class)
public class RemediationLaunchType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("EC2", "FARGATE"));

  public static final RemediationLaunchType EC2 = new RemediationLaunchType("EC2");
  public static final RemediationLaunchType FARGATE = new RemediationLaunchType("FARGATE");

  RemediationLaunchType(String value) {
    super(value, allowedValues);
  }

  public static class RemediationLaunchTypeSerializer extends StdSerializer<RemediationLaunchType> {
    public RemediationLaunchTypeSerializer(Class<RemediationLaunchType> t) {
      super(t);
    }

    public RemediationLaunchTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RemediationLaunchType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RemediationLaunchType fromValue(String value) {
    return new RemediationLaunchType(value);
  }
}
