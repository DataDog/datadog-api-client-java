/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/**
 * The status of a service check. Set to <code>0</code> for OK, <code>1</code> for warning, <code>2
 * </code> for critical, and <code>3</code> for unknown.
 */
@JsonSerialize(using = ServiceCheckStatus.ServiceCheckStatusSerializer.class)
public class ServiceCheckStatus {

  public static final ServiceCheckStatus OK = new ServiceCheckStatus(0);
  public static final ServiceCheckStatus WARNING = new ServiceCheckStatus(1);
  public static final ServiceCheckStatus CRITICAL = new ServiceCheckStatus(2);
  public static final ServiceCheckStatus UNKNOWN = new ServiceCheckStatus(3);

  private static final Set<Integer> allowedValues = new HashSet<Integer>(Arrays.asList(0, 1, 2, 3));

  private Integer value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  ServiceCheckStatus(Integer value) {
    this.value = value;
  }

  public static class ServiceCheckStatusSerializer extends StdSerializer<ServiceCheckStatus> {
    public ServiceCheckStatusSerializer(Class<ServiceCheckStatus> t) {
      super(t);
    }

    public ServiceCheckStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(ServiceCheckStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonValue
  public Integer getValue() {
    return this.value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }

  /** Return true if this ServiceCheckStatus object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((ServiceCheckStatus) o).value);
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
  public static ServiceCheckStatus fromValue(Integer value) {
    return new ServiceCheckStatus(value);
  }
}
