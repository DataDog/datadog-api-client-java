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

/** Determines whether the batch has passed, failed, or is in progress. */
@JsonSerialize(using = SyntheticsBatchStatus.SyntheticsBatchStatusSerializer.class)
public class SyntheticsBatchStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("passed", "skipped", "failed"));

  public static final SyntheticsBatchStatus PASSED = new SyntheticsBatchStatus("passed");
  public static final SyntheticsBatchStatus SKIPPED = new SyntheticsBatchStatus("skipped");
  public static final SyntheticsBatchStatus FAILED = new SyntheticsBatchStatus("failed");

  SyntheticsBatchStatus(String value) {
    super(value, allowedValues);
  }

  public static class SyntheticsBatchStatusSerializer extends StdSerializer<SyntheticsBatchStatus> {
    public SyntheticsBatchStatusSerializer(Class<SyntheticsBatchStatus> t) {
      super(t);
    }

    public SyntheticsBatchStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SyntheticsBatchStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SyntheticsBatchStatus fromValue(String value) {
    return new SyntheticsBatchStatus(value);
  }
}
