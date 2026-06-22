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

/** Plan status. */
@JsonSerialize(using = RemediationPlanStatus.RemediationPlanStatusSerializer.class)
public class RemediationPlanStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("pending", "in_progress", "completed", "failed"));

  public static final RemediationPlanStatus PENDING = new RemediationPlanStatus("pending");
  public static final RemediationPlanStatus IN_PROGRESS = new RemediationPlanStatus("in_progress");
  public static final RemediationPlanStatus COMPLETED = new RemediationPlanStatus("completed");
  public static final RemediationPlanStatus FAILED = new RemediationPlanStatus("failed");

  RemediationPlanStatus(String value) {
    super(value, allowedValues);
  }

  public static class RemediationPlanStatusSerializer extends StdSerializer<RemediationPlanStatus> {
    public RemediationPlanStatusSerializer(Class<RemediationPlanStatus> t) {
      super(t);
    }

    public RemediationPlanStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RemediationPlanStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RemediationPlanStatus fromValue(String value) {
    return new RemediationPlanStatus(value);
  }
}
