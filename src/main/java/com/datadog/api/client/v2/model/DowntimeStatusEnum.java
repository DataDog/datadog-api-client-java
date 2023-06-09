/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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

/** The current status of the downtime. */
@JsonSerialize(using = DowntimeStatusEnum.DowntimeStatusEnumSerializer.class)
public class DowntimeStatusEnum {

  public static final DowntimeStatusEnum ACTIVE = new DowntimeStatusEnum("active");
  public static final DowntimeStatusEnum CANCELED = new DowntimeStatusEnum("canceled");
  public static final DowntimeStatusEnum ENDED = new DowntimeStatusEnum("ended");
  public static final DowntimeStatusEnum SCHEDULED = new DowntimeStatusEnum("scheduled");

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("active", "canceled", "ended", "scheduled"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  DowntimeStatusEnum(String value) {
    this.value = value;
  }

  public static class DowntimeStatusEnumSerializer extends StdSerializer<DowntimeStatusEnum> {
    public DowntimeStatusEnumSerializer(Class<DowntimeStatusEnum> t) {
      super(t);
    }

    public DowntimeStatusEnumSerializer() {
      this(null);
    }

    @Override
    public void serialize(DowntimeStatusEnum value, JsonGenerator jgen, SerializerProvider provider)
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

  /** Return true if this DowntimeStatusEnum object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((DowntimeStatusEnum) o).value);
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
  public static DowntimeStatusEnum fromValue(String value) {
    return new DowntimeStatusEnum(value);
  }
}
