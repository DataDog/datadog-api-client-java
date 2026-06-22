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

/** The kind of ECS workload that owns the problematic tasks. */
@JsonSerialize(using = RemediationWorkloadType.RemediationWorkloadTypeSerializer.class)
public class RemediationWorkloadType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("WORKLOAD_TYPE_UNSPECIFIED", "SERVICE", "STANDALONE_TASK", "DAEMON"));

  public static final RemediationWorkloadType WORKLOAD_TYPE_UNSPECIFIED =
      new RemediationWorkloadType("WORKLOAD_TYPE_UNSPECIFIED");
  public static final RemediationWorkloadType SERVICE = new RemediationWorkloadType("SERVICE");
  public static final RemediationWorkloadType STANDALONE_TASK =
      new RemediationWorkloadType("STANDALONE_TASK");
  public static final RemediationWorkloadType DAEMON = new RemediationWorkloadType("DAEMON");

  RemediationWorkloadType(String value) {
    super(value, allowedValues);
  }

  public static class RemediationWorkloadTypeSerializer
      extends StdSerializer<RemediationWorkloadType> {
    public RemediationWorkloadTypeSerializer(Class<RemediationWorkloadType> t) {
      super(t);
    }

    public RemediationWorkloadTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RemediationWorkloadType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RemediationWorkloadType fromValue(String value) {
    return new RemediationWorkloadType(value);
  }
}
