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

/** Case status */
@JsonSerialize(using = Case3rdPartyTicketStatus.Case3rdPartyTicketStatusSerializer.class)
public class Case3rdPartyTicketStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("IN_PROGRESS", "COMPLETED", "FAILED"));

  public static final Case3rdPartyTicketStatus IN_PROGRESS =
      new Case3rdPartyTicketStatus("IN_PROGRESS");
  public static final Case3rdPartyTicketStatus COMPLETED =
      new Case3rdPartyTicketStatus("COMPLETED");
  public static final Case3rdPartyTicketStatus FAILED = new Case3rdPartyTicketStatus("FAILED");

  Case3rdPartyTicketStatus(String value) {
    super(value, allowedValues);
  }

  public static class Case3rdPartyTicketStatusSerializer
      extends StdSerializer<Case3rdPartyTicketStatus> {
    public Case3rdPartyTicketStatusSerializer(Class<Case3rdPartyTicketStatus> t) {
      super(t);
    }

    public Case3rdPartyTicketStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        Case3rdPartyTicketStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static Case3rdPartyTicketStatus fromValue(String value) {
    return new Case3rdPartyTicketStatus(value);
  }
}
