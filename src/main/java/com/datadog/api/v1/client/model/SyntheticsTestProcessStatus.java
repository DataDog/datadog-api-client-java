/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/** Status of a Synthetic test. */
@JsonSerialize(using = SyntheticsTestProcessStatus.SyntheticsTestProcessStatusSerializer.class)
public class SyntheticsTestProcessStatus {

  public static final SyntheticsTestProcessStatus NOT_SCHEDULED =
      new SyntheticsTestProcessStatus("not_scheduled");
  public static final SyntheticsTestProcessStatus SCHEDULED =
      new SyntheticsTestProcessStatus("scheduled");
  public static final SyntheticsTestProcessStatus STARTED =
      new SyntheticsTestProcessStatus("started");
  public static final SyntheticsTestProcessStatus FINISHED =
      new SyntheticsTestProcessStatus("finished");
  public static final SyntheticsTestProcessStatus FINISHED_WITH_ERROR =
      new SyntheticsTestProcessStatus("finished_with_error");

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "not_scheduled", "scheduled", "started", "finished", "finished_with_error"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  SyntheticsTestProcessStatus(String value) {
    this.value = value;
  }

  public static class SyntheticsTestProcessStatusSerializer
      extends StdSerializer<SyntheticsTestProcessStatus> {
    public SyntheticsTestProcessStatusSerializer(Class<SyntheticsTestProcessStatus> t) {
      super(t);
    }

    public SyntheticsTestProcessStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SyntheticsTestProcessStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonValue
  public String getValue() {
    return this.value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  /** Return true if this SyntheticsTestProcessStatus object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((SyntheticsTestProcessStatus) o).value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static SyntheticsTestProcessStatus fromValue(String value) {
    return new SyntheticsTestProcessStatus(value);
  }
}
