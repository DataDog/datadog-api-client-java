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

/** Investigation status. */
@JsonSerialize(
    using = RemediationInvestigationStatus.RemediationInvestigationStatusSerializer.class)
public class RemediationInvestigationStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("open", "approval_required", "executing", "succeeded", "failed"));

  public static final RemediationInvestigationStatus OPEN =
      new RemediationInvestigationStatus("open");
  public static final RemediationInvestigationStatus APPROVAL_REQUIRED =
      new RemediationInvestigationStatus("approval_required");
  public static final RemediationInvestigationStatus EXECUTING =
      new RemediationInvestigationStatus("executing");
  public static final RemediationInvestigationStatus SUCCEEDED =
      new RemediationInvestigationStatus("succeeded");
  public static final RemediationInvestigationStatus FAILED =
      new RemediationInvestigationStatus("failed");

  RemediationInvestigationStatus(String value) {
    super(value, allowedValues);
  }

  public static class RemediationInvestigationStatusSerializer
      extends StdSerializer<RemediationInvestigationStatus> {
    public RemediationInvestigationStatusSerializer(Class<RemediationInvestigationStatus> t) {
      super(t);
    }

    public RemediationInvestigationStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RemediationInvestigationStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RemediationInvestigationStatus fromValue(String value) {
    return new RemediationInvestigationStatus(value);
  }
}
