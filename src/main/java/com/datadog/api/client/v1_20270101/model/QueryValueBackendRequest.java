/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.datadog.api.client.AbstractOpenApiSchema;
import com.datadog.api.client.JSON;
import com.datadog.api.client.UnparsedObject;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import jakarta.ws.rs.core.GenericType;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
@JsonDeserialize(using = QueryValueBackendRequest.QueryValueBackendRequestDeserializer.class)
@JsonSerialize(using = QueryValueBackendRequest.QueryValueBackendRequestSerializer.class)
public class QueryValueBackendRequest extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(QueryValueBackendRequest.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class QueryValueBackendRequestSerializer
      extends StdSerializer<QueryValueBackendRequest> {
    public QueryValueBackendRequestSerializer(Class<QueryValueBackendRequest> t) {
      super(t);
    }

    public QueryValueBackendRequestSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        QueryValueBackendRequest value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class QueryValueBackendRequestDeserializer
      extends StdDeserializer<QueryValueBackendRequest> {
    public QueryValueBackendRequestDeserializer() {
      this(QueryValueBackendRequest.class);
    }

    public QueryValueBackendRequestDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public QueryValueBackendRequest deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize QueryValueBackendRequest20270101OneOf
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (QueryValueBackendRequest20270101OneOf.class.equals(Integer.class)
            || QueryValueBackendRequest20270101OneOf.class.equals(Long.class)
            || QueryValueBackendRequest20270101OneOf.class.equals(Float.class)
            || QueryValueBackendRequest20270101OneOf.class.equals(Double.class)
            || QueryValueBackendRequest20270101OneOf.class.equals(Boolean.class)
            || QueryValueBackendRequest20270101OneOf.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((QueryValueBackendRequest20270101OneOf.class.equals(Integer.class)
                        || QueryValueBackendRequest20270101OneOf.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((QueryValueBackendRequest20270101OneOf.class.equals(Float.class)
                        || QueryValueBackendRequest20270101OneOf.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (QueryValueBackendRequest20270101OneOf.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (QueryValueBackendRequest20270101OneOf.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec()).readValueAs(QueryValueBackendRequest20270101OneOf.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((QueryValueBackendRequest20270101OneOf) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'QueryValueBackendRequest20270101OneOf'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'QueryValueBackendRequest20270101OneOf'",
            e);
      }

      // deserialize QueryValueBackendRequest20270101OneOf4460683296
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (QueryValueBackendRequest20270101OneOf4460683296.class.equals(Integer.class)
            || QueryValueBackendRequest20270101OneOf4460683296.class.equals(Long.class)
            || QueryValueBackendRequest20270101OneOf4460683296.class.equals(Float.class)
            || QueryValueBackendRequest20270101OneOf4460683296.class.equals(Double.class)
            || QueryValueBackendRequest20270101OneOf4460683296.class.equals(Boolean.class)
            || QueryValueBackendRequest20270101OneOf4460683296.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((QueryValueBackendRequest20270101OneOf4460683296.class.equals(Integer.class)
                        || QueryValueBackendRequest20270101OneOf4460683296.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((QueryValueBackendRequest20270101OneOf4460683296.class.equals(Float.class)
                        || QueryValueBackendRequest20270101OneOf4460683296.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (QueryValueBackendRequest20270101OneOf4460683296.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (QueryValueBackendRequest20270101OneOf4460683296.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(QueryValueBackendRequest20270101OneOf4460683296.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((QueryValueBackendRequest20270101OneOf4460683296) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'QueryValueBackendRequest20270101OneOf4460683296'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'QueryValueBackendRequest20270101OneOf4460683296'",
            e);
      }

      // deserialize QueryValueBackendRequest20270101OneOf4460685056
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (QueryValueBackendRequest20270101OneOf4460685056.class.equals(Integer.class)
            || QueryValueBackendRequest20270101OneOf4460685056.class.equals(Long.class)
            || QueryValueBackendRequest20270101OneOf4460685056.class.equals(Float.class)
            || QueryValueBackendRequest20270101OneOf4460685056.class.equals(Double.class)
            || QueryValueBackendRequest20270101OneOf4460685056.class.equals(Boolean.class)
            || QueryValueBackendRequest20270101OneOf4460685056.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((QueryValueBackendRequest20270101OneOf4460685056.class.equals(Integer.class)
                        || QueryValueBackendRequest20270101OneOf4460685056.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((QueryValueBackendRequest20270101OneOf4460685056.class.equals(Float.class)
                        || QueryValueBackendRequest20270101OneOf4460685056.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (QueryValueBackendRequest20270101OneOf4460685056.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (QueryValueBackendRequest20270101OneOf4460685056.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(QueryValueBackendRequest20270101OneOf4460685056.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((QueryValueBackendRequest20270101OneOf4460685056) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'QueryValueBackendRequest20270101OneOf4460685056'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'QueryValueBackendRequest20270101OneOf4460685056'",
            e);
      }

      // deserialize QueryValueBackendRequest20270101OneOf4460686496
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (QueryValueBackendRequest20270101OneOf4460686496.class.equals(Integer.class)
            || QueryValueBackendRequest20270101OneOf4460686496.class.equals(Long.class)
            || QueryValueBackendRequest20270101OneOf4460686496.class.equals(Float.class)
            || QueryValueBackendRequest20270101OneOf4460686496.class.equals(Double.class)
            || QueryValueBackendRequest20270101OneOf4460686496.class.equals(Boolean.class)
            || QueryValueBackendRequest20270101OneOf4460686496.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((QueryValueBackendRequest20270101OneOf4460686496.class.equals(Integer.class)
                        || QueryValueBackendRequest20270101OneOf4460686496.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((QueryValueBackendRequest20270101OneOf4460686496.class.equals(Float.class)
                        || QueryValueBackendRequest20270101OneOf4460686496.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (QueryValueBackendRequest20270101OneOf4460686496.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (QueryValueBackendRequest20270101OneOf4460686496.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(QueryValueBackendRequest20270101OneOf4460686496.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((QueryValueBackendRequest20270101OneOf4460686496) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'QueryValueBackendRequest20270101OneOf4460686496'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'QueryValueBackendRequest20270101OneOf4460686496'",
            e);
      }

      // deserialize QueryValueBackendRequest20270101OneOf4460688416
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (QueryValueBackendRequest20270101OneOf4460688416.class.equals(Integer.class)
            || QueryValueBackendRequest20270101OneOf4460688416.class.equals(Long.class)
            || QueryValueBackendRequest20270101OneOf4460688416.class.equals(Float.class)
            || QueryValueBackendRequest20270101OneOf4460688416.class.equals(Double.class)
            || QueryValueBackendRequest20270101OneOf4460688416.class.equals(Boolean.class)
            || QueryValueBackendRequest20270101OneOf4460688416.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((QueryValueBackendRequest20270101OneOf4460688416.class.equals(Integer.class)
                        || QueryValueBackendRequest20270101OneOf4460688416.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((QueryValueBackendRequest20270101OneOf4460688416.class.equals(Float.class)
                        || QueryValueBackendRequest20270101OneOf4460688416.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (QueryValueBackendRequest20270101OneOf4460688416.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (QueryValueBackendRequest20270101OneOf4460688416.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(QueryValueBackendRequest20270101OneOf4460688416.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((QueryValueBackendRequest20270101OneOf4460688416) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'QueryValueBackendRequest20270101OneOf4460688416'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'QueryValueBackendRequest20270101OneOf4460688416'",
            e);
      }

      // deserialize QueryValueBackendRequest20270101OneOf4460689536
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (QueryValueBackendRequest20270101OneOf4460689536.class.equals(Integer.class)
            || QueryValueBackendRequest20270101OneOf4460689536.class.equals(Long.class)
            || QueryValueBackendRequest20270101OneOf4460689536.class.equals(Float.class)
            || QueryValueBackendRequest20270101OneOf4460689536.class.equals(Double.class)
            || QueryValueBackendRequest20270101OneOf4460689536.class.equals(Boolean.class)
            || QueryValueBackendRequest20270101OneOf4460689536.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((QueryValueBackendRequest20270101OneOf4460689536.class.equals(Integer.class)
                        || QueryValueBackendRequest20270101OneOf4460689536.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((QueryValueBackendRequest20270101OneOf4460689536.class.equals(Float.class)
                        || QueryValueBackendRequest20270101OneOf4460689536.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (QueryValueBackendRequest20270101OneOf4460689536.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (QueryValueBackendRequest20270101OneOf4460689536.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(QueryValueBackendRequest20270101OneOf4460689536.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((QueryValueBackendRequest20270101OneOf4460689536) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'QueryValueBackendRequest20270101OneOf4460689536'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'QueryValueBackendRequest20270101OneOf4460689536'",
            e);
      }

      // deserialize QueryValueBackendRequest20270101OneOf4460690656
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (QueryValueBackendRequest20270101OneOf4460690656.class.equals(Integer.class)
            || QueryValueBackendRequest20270101OneOf4460690656.class.equals(Long.class)
            || QueryValueBackendRequest20270101OneOf4460690656.class.equals(Float.class)
            || QueryValueBackendRequest20270101OneOf4460690656.class.equals(Double.class)
            || QueryValueBackendRequest20270101OneOf4460690656.class.equals(Boolean.class)
            || QueryValueBackendRequest20270101OneOf4460690656.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((QueryValueBackendRequest20270101OneOf4460690656.class.equals(Integer.class)
                        || QueryValueBackendRequest20270101OneOf4460690656.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((QueryValueBackendRequest20270101OneOf4460690656.class.equals(Float.class)
                        || QueryValueBackendRequest20270101OneOf4460690656.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (QueryValueBackendRequest20270101OneOf4460690656.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (QueryValueBackendRequest20270101OneOf4460690656.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(QueryValueBackendRequest20270101OneOf4460690656.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((QueryValueBackendRequest20270101OneOf4460690656) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'QueryValueBackendRequest20270101OneOf4460690656'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'QueryValueBackendRequest20270101OneOf4460690656'",
            e);
      }

      // deserialize QueryValueBackendRequest20270101OneOf4460904832
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (QueryValueBackendRequest20270101OneOf4460904832.class.equals(Integer.class)
            || QueryValueBackendRequest20270101OneOf4460904832.class.equals(Long.class)
            || QueryValueBackendRequest20270101OneOf4460904832.class.equals(Float.class)
            || QueryValueBackendRequest20270101OneOf4460904832.class.equals(Double.class)
            || QueryValueBackendRequest20270101OneOf4460904832.class.equals(Boolean.class)
            || QueryValueBackendRequest20270101OneOf4460904832.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((QueryValueBackendRequest20270101OneOf4460904832.class.equals(Integer.class)
                        || QueryValueBackendRequest20270101OneOf4460904832.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((QueryValueBackendRequest20270101OneOf4460904832.class.equals(Float.class)
                        || QueryValueBackendRequest20270101OneOf4460904832.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (QueryValueBackendRequest20270101OneOf4460904832.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (QueryValueBackendRequest20270101OneOf4460904832.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(QueryValueBackendRequest20270101OneOf4460904832.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((QueryValueBackendRequest20270101OneOf4460904832) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'QueryValueBackendRequest20270101OneOf4460904832'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'QueryValueBackendRequest20270101OneOf4460904832'",
            e);
      }

      // deserialize QueryValueBackendRequest20270101OneOf4460905952
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (QueryValueBackendRequest20270101OneOf4460905952.class.equals(Integer.class)
            || QueryValueBackendRequest20270101OneOf4460905952.class.equals(Long.class)
            || QueryValueBackendRequest20270101OneOf4460905952.class.equals(Float.class)
            || QueryValueBackendRequest20270101OneOf4460905952.class.equals(Double.class)
            || QueryValueBackendRequest20270101OneOf4460905952.class.equals(Boolean.class)
            || QueryValueBackendRequest20270101OneOf4460905952.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((QueryValueBackendRequest20270101OneOf4460905952.class.equals(Integer.class)
                        || QueryValueBackendRequest20270101OneOf4460905952.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((QueryValueBackendRequest20270101OneOf4460905952.class.equals(Float.class)
                        || QueryValueBackendRequest20270101OneOf4460905952.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (QueryValueBackendRequest20270101OneOf4460905952.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (QueryValueBackendRequest20270101OneOf4460905952.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(QueryValueBackendRequest20270101OneOf4460905952.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((QueryValueBackendRequest20270101OneOf4460905952) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'QueryValueBackendRequest20270101OneOf4460905952'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'QueryValueBackendRequest20270101OneOf4460905952'",
            e);
      }

      // deserialize QueryValueBackendRequest20270101OneOf4460907072
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (QueryValueBackendRequest20270101OneOf4460907072.class.equals(Integer.class)
            || QueryValueBackendRequest20270101OneOf4460907072.class.equals(Long.class)
            || QueryValueBackendRequest20270101OneOf4460907072.class.equals(Float.class)
            || QueryValueBackendRequest20270101OneOf4460907072.class.equals(Double.class)
            || QueryValueBackendRequest20270101OneOf4460907072.class.equals(Boolean.class)
            || QueryValueBackendRequest20270101OneOf4460907072.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((QueryValueBackendRequest20270101OneOf4460907072.class.equals(Integer.class)
                        || QueryValueBackendRequest20270101OneOf4460907072.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((QueryValueBackendRequest20270101OneOf4460907072.class.equals(Float.class)
                        || QueryValueBackendRequest20270101OneOf4460907072.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (QueryValueBackendRequest20270101OneOf4460907072.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (QueryValueBackendRequest20270101OneOf4460907072.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(QueryValueBackendRequest20270101OneOf4460907072.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((QueryValueBackendRequest20270101OneOf4460907072) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'QueryValueBackendRequest20270101OneOf4460907072'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'QueryValueBackendRequest20270101OneOf4460907072'",
            e);
      }

      // deserialize QueryValueBackendRequest20270101OneOf4460908192
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (QueryValueBackendRequest20270101OneOf4460908192.class.equals(Integer.class)
            || QueryValueBackendRequest20270101OneOf4460908192.class.equals(Long.class)
            || QueryValueBackendRequest20270101OneOf4460908192.class.equals(Float.class)
            || QueryValueBackendRequest20270101OneOf4460908192.class.equals(Double.class)
            || QueryValueBackendRequest20270101OneOf4460908192.class.equals(Boolean.class)
            || QueryValueBackendRequest20270101OneOf4460908192.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((QueryValueBackendRequest20270101OneOf4460908192.class.equals(Integer.class)
                        || QueryValueBackendRequest20270101OneOf4460908192.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((QueryValueBackendRequest20270101OneOf4460908192.class.equals(Float.class)
                        || QueryValueBackendRequest20270101OneOf4460908192.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (QueryValueBackendRequest20270101OneOf4460908192.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (QueryValueBackendRequest20270101OneOf4460908192.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(QueryValueBackendRequest20270101OneOf4460908192.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((QueryValueBackendRequest20270101OneOf4460908192) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'QueryValueBackendRequest20270101OneOf4460908192'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'QueryValueBackendRequest20270101OneOf4460908192'",
            e);
      }

      // deserialize QueryValueBackendRequest20270101OneOf4460909312
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (QueryValueBackendRequest20270101OneOf4460909312.class.equals(Integer.class)
            || QueryValueBackendRequest20270101OneOf4460909312.class.equals(Long.class)
            || QueryValueBackendRequest20270101OneOf4460909312.class.equals(Float.class)
            || QueryValueBackendRequest20270101OneOf4460909312.class.equals(Double.class)
            || QueryValueBackendRequest20270101OneOf4460909312.class.equals(Boolean.class)
            || QueryValueBackendRequest20270101OneOf4460909312.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((QueryValueBackendRequest20270101OneOf4460909312.class.equals(Integer.class)
                        || QueryValueBackendRequest20270101OneOf4460909312.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((QueryValueBackendRequest20270101OneOf4460909312.class.equals(Float.class)
                        || QueryValueBackendRequest20270101OneOf4460909312.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (QueryValueBackendRequest20270101OneOf4460909312.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (QueryValueBackendRequest20270101OneOf4460909312.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(QueryValueBackendRequest20270101OneOf4460909312.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((QueryValueBackendRequest20270101OneOf4460909312) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'QueryValueBackendRequest20270101OneOf4460909312'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'QueryValueBackendRequest20270101OneOf4460909312'",
            e);
      }

      // deserialize QueryValueBackendRequest20270101OneOf4460910432
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (QueryValueBackendRequest20270101OneOf4460910432.class.equals(Integer.class)
            || QueryValueBackendRequest20270101OneOf4460910432.class.equals(Long.class)
            || QueryValueBackendRequest20270101OneOf4460910432.class.equals(Float.class)
            || QueryValueBackendRequest20270101OneOf4460910432.class.equals(Double.class)
            || QueryValueBackendRequest20270101OneOf4460910432.class.equals(Boolean.class)
            || QueryValueBackendRequest20270101OneOf4460910432.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((QueryValueBackendRequest20270101OneOf4460910432.class.equals(Integer.class)
                        || QueryValueBackendRequest20270101OneOf4460910432.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((QueryValueBackendRequest20270101OneOf4460910432.class.equals(Float.class)
                        || QueryValueBackendRequest20270101OneOf4460910432.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (QueryValueBackendRequest20270101OneOf4460910432.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (QueryValueBackendRequest20270101OneOf4460910432.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(QueryValueBackendRequest20270101OneOf4460910432.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((QueryValueBackendRequest20270101OneOf4460910432) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'QueryValueBackendRequest20270101OneOf4460910432'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'QueryValueBackendRequest20270101OneOf4460910432'",
            e);
      }

      // deserialize QueryValueBackendRequest20270101OneOf4460911552
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (QueryValueBackendRequest20270101OneOf4460911552.class.equals(Integer.class)
            || QueryValueBackendRequest20270101OneOf4460911552.class.equals(Long.class)
            || QueryValueBackendRequest20270101OneOf4460911552.class.equals(Float.class)
            || QueryValueBackendRequest20270101OneOf4460911552.class.equals(Double.class)
            || QueryValueBackendRequest20270101OneOf4460911552.class.equals(Boolean.class)
            || QueryValueBackendRequest20270101OneOf4460911552.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((QueryValueBackendRequest20270101OneOf4460911552.class.equals(Integer.class)
                        || QueryValueBackendRequest20270101OneOf4460911552.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((QueryValueBackendRequest20270101OneOf4460911552.class.equals(Float.class)
                        || QueryValueBackendRequest20270101OneOf4460911552.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (QueryValueBackendRequest20270101OneOf4460911552.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (QueryValueBackendRequest20270101OneOf4460911552.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(QueryValueBackendRequest20270101OneOf4460911552.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((QueryValueBackendRequest20270101OneOf4460911552) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'QueryValueBackendRequest20270101OneOf4460911552'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'QueryValueBackendRequest20270101OneOf4460911552'",
            e);
      }

      // deserialize QueryValueBackendRequest20270101OneOf4460912672
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (QueryValueBackendRequest20270101OneOf4460912672.class.equals(Integer.class)
            || QueryValueBackendRequest20270101OneOf4460912672.class.equals(Long.class)
            || QueryValueBackendRequest20270101OneOf4460912672.class.equals(Float.class)
            || QueryValueBackendRequest20270101OneOf4460912672.class.equals(Double.class)
            || QueryValueBackendRequest20270101OneOf4460912672.class.equals(Boolean.class)
            || QueryValueBackendRequest20270101OneOf4460912672.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((QueryValueBackendRequest20270101OneOf4460912672.class.equals(Integer.class)
                        || QueryValueBackendRequest20270101OneOf4460912672.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((QueryValueBackendRequest20270101OneOf4460912672.class.equals(Float.class)
                        || QueryValueBackendRequest20270101OneOf4460912672.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (QueryValueBackendRequest20270101OneOf4460912672.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (QueryValueBackendRequest20270101OneOf4460912672.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(QueryValueBackendRequest20270101OneOf4460912672.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((QueryValueBackendRequest20270101OneOf4460912672) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'QueryValueBackendRequest20270101OneOf4460912672'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'QueryValueBackendRequest20270101OneOf4460912672'",
            e);
      }

      // deserialize QueryValueBackendRequest20270101OneOf4460913792
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (QueryValueBackendRequest20270101OneOf4460913792.class.equals(Integer.class)
            || QueryValueBackendRequest20270101OneOf4460913792.class.equals(Long.class)
            || QueryValueBackendRequest20270101OneOf4460913792.class.equals(Float.class)
            || QueryValueBackendRequest20270101OneOf4460913792.class.equals(Double.class)
            || QueryValueBackendRequest20270101OneOf4460913792.class.equals(Boolean.class)
            || QueryValueBackendRequest20270101OneOf4460913792.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((QueryValueBackendRequest20270101OneOf4460913792.class.equals(Integer.class)
                        || QueryValueBackendRequest20270101OneOf4460913792.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((QueryValueBackendRequest20270101OneOf4460913792.class.equals(Float.class)
                        || QueryValueBackendRequest20270101OneOf4460913792.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (QueryValueBackendRequest20270101OneOf4460913792.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (QueryValueBackendRequest20270101OneOf4460913792.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(QueryValueBackendRequest20270101OneOf4460913792.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((QueryValueBackendRequest20270101OneOf4460913792) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'QueryValueBackendRequest20270101OneOf4460913792'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'QueryValueBackendRequest20270101OneOf4460913792'",
            e);
      }

      // deserialize QueryValueBackendRequest20270101OneOf4460914912
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (QueryValueBackendRequest20270101OneOf4460914912.class.equals(Integer.class)
            || QueryValueBackendRequest20270101OneOf4460914912.class.equals(Long.class)
            || QueryValueBackendRequest20270101OneOf4460914912.class.equals(Float.class)
            || QueryValueBackendRequest20270101OneOf4460914912.class.equals(Double.class)
            || QueryValueBackendRequest20270101OneOf4460914912.class.equals(Boolean.class)
            || QueryValueBackendRequest20270101OneOf4460914912.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((QueryValueBackendRequest20270101OneOf4460914912.class.equals(Integer.class)
                        || QueryValueBackendRequest20270101OneOf4460914912.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((QueryValueBackendRequest20270101OneOf4460914912.class.equals(Float.class)
                        || QueryValueBackendRequest20270101OneOf4460914912.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (QueryValueBackendRequest20270101OneOf4460914912.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (QueryValueBackendRequest20270101OneOf4460914912.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(QueryValueBackendRequest20270101OneOf4460914912.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((QueryValueBackendRequest20270101OneOf4460914912) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'QueryValueBackendRequest20270101OneOf4460914912'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'QueryValueBackendRequest20270101OneOf4460914912'",
            e);
      }

      // deserialize QueryValueBackendRequest20270101OneOf4460916032
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (QueryValueBackendRequest20270101OneOf4460916032.class.equals(Integer.class)
            || QueryValueBackendRequest20270101OneOf4460916032.class.equals(Long.class)
            || QueryValueBackendRequest20270101OneOf4460916032.class.equals(Float.class)
            || QueryValueBackendRequest20270101OneOf4460916032.class.equals(Double.class)
            || QueryValueBackendRequest20270101OneOf4460916032.class.equals(Boolean.class)
            || QueryValueBackendRequest20270101OneOf4460916032.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((QueryValueBackendRequest20270101OneOf4460916032.class.equals(Integer.class)
                        || QueryValueBackendRequest20270101OneOf4460916032.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((QueryValueBackendRequest20270101OneOf4460916032.class.equals(Float.class)
                        || QueryValueBackendRequest20270101OneOf4460916032.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (QueryValueBackendRequest20270101OneOf4460916032.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (QueryValueBackendRequest20270101OneOf4460916032.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(QueryValueBackendRequest20270101OneOf4460916032.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((QueryValueBackendRequest20270101OneOf4460916032) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'QueryValueBackendRequest20270101OneOf4460916032'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'QueryValueBackendRequest20270101OneOf4460916032'",
            e);
      }

      // deserialize QueryValueBackendRequest20270101OneOf4460917152
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (QueryValueBackendRequest20270101OneOf4460917152.class.equals(Integer.class)
            || QueryValueBackendRequest20270101OneOf4460917152.class.equals(Long.class)
            || QueryValueBackendRequest20270101OneOf4460917152.class.equals(Float.class)
            || QueryValueBackendRequest20270101OneOf4460917152.class.equals(Double.class)
            || QueryValueBackendRequest20270101OneOf4460917152.class.equals(Boolean.class)
            || QueryValueBackendRequest20270101OneOf4460917152.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((QueryValueBackendRequest20270101OneOf4460917152.class.equals(Integer.class)
                        || QueryValueBackendRequest20270101OneOf4460917152.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((QueryValueBackendRequest20270101OneOf4460917152.class.equals(Float.class)
                        || QueryValueBackendRequest20270101OneOf4460917152.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (QueryValueBackendRequest20270101OneOf4460917152.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (QueryValueBackendRequest20270101OneOf4460917152.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(QueryValueBackendRequest20270101OneOf4460917152.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((QueryValueBackendRequest20270101OneOf4460917152) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'QueryValueBackendRequest20270101OneOf4460917152'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'QueryValueBackendRequest20270101OneOf4460917152'",
            e);
      }

      // deserialize QueryValueBackendRequest20270101OneOf4460918912
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (QueryValueBackendRequest20270101OneOf4460918912.class.equals(Integer.class)
            || QueryValueBackendRequest20270101OneOf4460918912.class.equals(Long.class)
            || QueryValueBackendRequest20270101OneOf4460918912.class.equals(Float.class)
            || QueryValueBackendRequest20270101OneOf4460918912.class.equals(Double.class)
            || QueryValueBackendRequest20270101OneOf4460918912.class.equals(Boolean.class)
            || QueryValueBackendRequest20270101OneOf4460918912.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((QueryValueBackendRequest20270101OneOf4460918912.class.equals(Integer.class)
                        || QueryValueBackendRequest20270101OneOf4460918912.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((QueryValueBackendRequest20270101OneOf4460918912.class.equals(Float.class)
                        || QueryValueBackendRequest20270101OneOf4460918912.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (QueryValueBackendRequest20270101OneOf4460918912.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (QueryValueBackendRequest20270101OneOf4460918912.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(QueryValueBackendRequest20270101OneOf4460918912.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((QueryValueBackendRequest20270101OneOf4460918912) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'QueryValueBackendRequest20270101OneOf4460918912'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'QueryValueBackendRequest20270101OneOf4460918912'",
            e);
      }

      QueryValueBackendRequest ret = new QueryValueBackendRequest();
      if (match == 1) {
        ret.setActualInstance(deserialized);
      } else {
        Map<String, Object> res =
            new ObjectMapper()
                .readValue(
                    tree.traverse(jp.getCodec()).readValueAsTree().toString(),
                    new TypeReference<Map<String, Object>>() {});
        ret.setActualInstance(new UnparsedObject(res));
      }
      return ret;
    }

    /** Handle deserialization of the 'null' value. */
    @Override
    public QueryValueBackendRequest getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "QueryValueBackendRequest cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public QueryValueBackendRequest() {
    super("oneOf", Boolean.FALSE);
  }

  public QueryValueBackendRequest(QueryValueBackendRequest20270101OneOf o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public QueryValueBackendRequest(QueryValueBackendRequest20270101OneOf4460683296 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public QueryValueBackendRequest(QueryValueBackendRequest20270101OneOf4460685056 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public QueryValueBackendRequest(QueryValueBackendRequest20270101OneOf4460686496 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public QueryValueBackendRequest(QueryValueBackendRequest20270101OneOf4460688416 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public QueryValueBackendRequest(QueryValueBackendRequest20270101OneOf4460689536 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public QueryValueBackendRequest(QueryValueBackendRequest20270101OneOf4460690656 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public QueryValueBackendRequest(QueryValueBackendRequest20270101OneOf4460904832 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public QueryValueBackendRequest(QueryValueBackendRequest20270101OneOf4460905952 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public QueryValueBackendRequest(QueryValueBackendRequest20270101OneOf4460907072 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public QueryValueBackendRequest(QueryValueBackendRequest20270101OneOf4460908192 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public QueryValueBackendRequest(QueryValueBackendRequest20270101OneOf4460909312 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public QueryValueBackendRequest(QueryValueBackendRequest20270101OneOf4460910432 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public QueryValueBackendRequest(QueryValueBackendRequest20270101OneOf4460911552 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public QueryValueBackendRequest(QueryValueBackendRequest20270101OneOf4460912672 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public QueryValueBackendRequest(QueryValueBackendRequest20270101OneOf4460913792 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public QueryValueBackendRequest(QueryValueBackendRequest20270101OneOf4460914912 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public QueryValueBackendRequest(QueryValueBackendRequest20270101OneOf4460916032 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public QueryValueBackendRequest(QueryValueBackendRequest20270101OneOf4460917152 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public QueryValueBackendRequest(QueryValueBackendRequest20270101OneOf4460918912 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "QueryValueBackendRequest20270101OneOf",
        new GenericType<QueryValueBackendRequest20270101OneOf>() {});
    schemas.put(
        "QueryValueBackendRequest20270101OneOf4460683296",
        new GenericType<QueryValueBackendRequest20270101OneOf4460683296>() {});
    schemas.put(
        "QueryValueBackendRequest20270101OneOf4460685056",
        new GenericType<QueryValueBackendRequest20270101OneOf4460685056>() {});
    schemas.put(
        "QueryValueBackendRequest20270101OneOf4460686496",
        new GenericType<QueryValueBackendRequest20270101OneOf4460686496>() {});
    schemas.put(
        "QueryValueBackendRequest20270101OneOf4460688416",
        new GenericType<QueryValueBackendRequest20270101OneOf4460688416>() {});
    schemas.put(
        "QueryValueBackendRequest20270101OneOf4460689536",
        new GenericType<QueryValueBackendRequest20270101OneOf4460689536>() {});
    schemas.put(
        "QueryValueBackendRequest20270101OneOf4460690656",
        new GenericType<QueryValueBackendRequest20270101OneOf4460690656>() {});
    schemas.put(
        "QueryValueBackendRequest20270101OneOf4460904832",
        new GenericType<QueryValueBackendRequest20270101OneOf4460904832>() {});
    schemas.put(
        "QueryValueBackendRequest20270101OneOf4460905952",
        new GenericType<QueryValueBackendRequest20270101OneOf4460905952>() {});
    schemas.put(
        "QueryValueBackendRequest20270101OneOf4460907072",
        new GenericType<QueryValueBackendRequest20270101OneOf4460907072>() {});
    schemas.put(
        "QueryValueBackendRequest20270101OneOf4460908192",
        new GenericType<QueryValueBackendRequest20270101OneOf4460908192>() {});
    schemas.put(
        "QueryValueBackendRequest20270101OneOf4460909312",
        new GenericType<QueryValueBackendRequest20270101OneOf4460909312>() {});
    schemas.put(
        "QueryValueBackendRequest20270101OneOf4460910432",
        new GenericType<QueryValueBackendRequest20270101OneOf4460910432>() {});
    schemas.put(
        "QueryValueBackendRequest20270101OneOf4460911552",
        new GenericType<QueryValueBackendRequest20270101OneOf4460911552>() {});
    schemas.put(
        "QueryValueBackendRequest20270101OneOf4460912672",
        new GenericType<QueryValueBackendRequest20270101OneOf4460912672>() {});
    schemas.put(
        "QueryValueBackendRequest20270101OneOf4460913792",
        new GenericType<QueryValueBackendRequest20270101OneOf4460913792>() {});
    schemas.put(
        "QueryValueBackendRequest20270101OneOf4460914912",
        new GenericType<QueryValueBackendRequest20270101OneOf4460914912>() {});
    schemas.put(
        "QueryValueBackendRequest20270101OneOf4460916032",
        new GenericType<QueryValueBackendRequest20270101OneOf4460916032>() {});
    schemas.put(
        "QueryValueBackendRequest20270101OneOf4460917152",
        new GenericType<QueryValueBackendRequest20270101OneOf4460917152>() {});
    schemas.put(
        "QueryValueBackendRequest20270101OneOf4460918912",
        new GenericType<QueryValueBackendRequest20270101OneOf4460918912>() {});
    JSON.registerDescendants(QueryValueBackendRequest.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return QueryValueBackendRequest.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: QueryValueBackendRequest20270101OneOf,
   * QueryValueBackendRequest20270101OneOf4460683296,
   * QueryValueBackendRequest20270101OneOf4460685056,
   * QueryValueBackendRequest20270101OneOf4460686496,
   * QueryValueBackendRequest20270101OneOf4460688416,
   * QueryValueBackendRequest20270101OneOf4460689536,
   * QueryValueBackendRequest20270101OneOf4460690656,
   * QueryValueBackendRequest20270101OneOf4460904832,
   * QueryValueBackendRequest20270101OneOf4460905952,
   * QueryValueBackendRequest20270101OneOf4460907072,
   * QueryValueBackendRequest20270101OneOf4460908192,
   * QueryValueBackendRequest20270101OneOf4460909312,
   * QueryValueBackendRequest20270101OneOf4460910432,
   * QueryValueBackendRequest20270101OneOf4460911552,
   * QueryValueBackendRequest20270101OneOf4460912672,
   * QueryValueBackendRequest20270101OneOf4460913792,
   * QueryValueBackendRequest20270101OneOf4460914912,
   * QueryValueBackendRequest20270101OneOf4460916032,
   * QueryValueBackendRequest20270101OneOf4460917152,
   * QueryValueBackendRequest20270101OneOf4460918912
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        QueryValueBackendRequest20270101OneOf.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        QueryValueBackendRequest20270101OneOf4460683296.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        QueryValueBackendRequest20270101OneOf4460685056.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        QueryValueBackendRequest20270101OneOf4460686496.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        QueryValueBackendRequest20270101OneOf4460688416.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        QueryValueBackendRequest20270101OneOf4460689536.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        QueryValueBackendRequest20270101OneOf4460690656.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        QueryValueBackendRequest20270101OneOf4460904832.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        QueryValueBackendRequest20270101OneOf4460905952.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        QueryValueBackendRequest20270101OneOf4460907072.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        QueryValueBackendRequest20270101OneOf4460908192.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        QueryValueBackendRequest20270101OneOf4460909312.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        QueryValueBackendRequest20270101OneOf4460910432.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        QueryValueBackendRequest20270101OneOf4460911552.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        QueryValueBackendRequest20270101OneOf4460912672.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        QueryValueBackendRequest20270101OneOf4460913792.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        QueryValueBackendRequest20270101OneOf4460914912.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        QueryValueBackendRequest20270101OneOf4460916032.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        QueryValueBackendRequest20270101OneOf4460917152.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        QueryValueBackendRequest20270101OneOf4460918912.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be QueryValueBackendRequest20270101OneOf,"
            + " QueryValueBackendRequest20270101OneOf4460683296,"
            + " QueryValueBackendRequest20270101OneOf4460685056,"
            + " QueryValueBackendRequest20270101OneOf4460686496,"
            + " QueryValueBackendRequest20270101OneOf4460688416,"
            + " QueryValueBackendRequest20270101OneOf4460689536,"
            + " QueryValueBackendRequest20270101OneOf4460690656,"
            + " QueryValueBackendRequest20270101OneOf4460904832,"
            + " QueryValueBackendRequest20270101OneOf4460905952,"
            + " QueryValueBackendRequest20270101OneOf4460907072,"
            + " QueryValueBackendRequest20270101OneOf4460908192,"
            + " QueryValueBackendRequest20270101OneOf4460909312,"
            + " QueryValueBackendRequest20270101OneOf4460910432,"
            + " QueryValueBackendRequest20270101OneOf4460911552,"
            + " QueryValueBackendRequest20270101OneOf4460912672,"
            + " QueryValueBackendRequest20270101OneOf4460913792,"
            + " QueryValueBackendRequest20270101OneOf4460914912,"
            + " QueryValueBackendRequest20270101OneOf4460916032,"
            + " QueryValueBackendRequest20270101OneOf4460917152,"
            + " QueryValueBackendRequest20270101OneOf4460918912");
  }

  /**
   * Get the actual instance, which can be the following: QueryValueBackendRequest20270101OneOf,
   * QueryValueBackendRequest20270101OneOf4460683296,
   * QueryValueBackendRequest20270101OneOf4460685056,
   * QueryValueBackendRequest20270101OneOf4460686496,
   * QueryValueBackendRequest20270101OneOf4460688416,
   * QueryValueBackendRequest20270101OneOf4460689536,
   * QueryValueBackendRequest20270101OneOf4460690656,
   * QueryValueBackendRequest20270101OneOf4460904832,
   * QueryValueBackendRequest20270101OneOf4460905952,
   * QueryValueBackendRequest20270101OneOf4460907072,
   * QueryValueBackendRequest20270101OneOf4460908192,
   * QueryValueBackendRequest20270101OneOf4460909312,
   * QueryValueBackendRequest20270101OneOf4460910432,
   * QueryValueBackendRequest20270101OneOf4460911552,
   * QueryValueBackendRequest20270101OneOf4460912672,
   * QueryValueBackendRequest20270101OneOf4460913792,
   * QueryValueBackendRequest20270101OneOf4460914912,
   * QueryValueBackendRequest20270101OneOf4460916032,
   * QueryValueBackendRequest20270101OneOf4460917152,
   * QueryValueBackendRequest20270101OneOf4460918912
   *
   * @return The actual instance (QueryValueBackendRequest20270101OneOf,
   *     QueryValueBackendRequest20270101OneOf4460683296,
   *     QueryValueBackendRequest20270101OneOf4460685056,
   *     QueryValueBackendRequest20270101OneOf4460686496,
   *     QueryValueBackendRequest20270101OneOf4460688416,
   *     QueryValueBackendRequest20270101OneOf4460689536,
   *     QueryValueBackendRequest20270101OneOf4460690656,
   *     QueryValueBackendRequest20270101OneOf4460904832,
   *     QueryValueBackendRequest20270101OneOf4460905952,
   *     QueryValueBackendRequest20270101OneOf4460907072,
   *     QueryValueBackendRequest20270101OneOf4460908192,
   *     QueryValueBackendRequest20270101OneOf4460909312,
   *     QueryValueBackendRequest20270101OneOf4460910432,
   *     QueryValueBackendRequest20270101OneOf4460911552,
   *     QueryValueBackendRequest20270101OneOf4460912672,
   *     QueryValueBackendRequest20270101OneOf4460913792,
   *     QueryValueBackendRequest20270101OneOf4460914912,
   *     QueryValueBackendRequest20270101OneOf4460916032,
   *     QueryValueBackendRequest20270101OneOf4460917152,
   *     QueryValueBackendRequest20270101OneOf4460918912)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `QueryValueBackendRequest20270101OneOf`. If the actual instance is
   * not `QueryValueBackendRequest20270101OneOf`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `QueryValueBackendRequest20270101OneOf`
   * @throws ClassCastException if the instance is not `QueryValueBackendRequest20270101OneOf`
   */
  public QueryValueBackendRequest20270101OneOf getQueryValueBackendRequest20270101OneOf()
      throws ClassCastException {
    return (QueryValueBackendRequest20270101OneOf) super.getActualInstance();
  }

  /**
   * Get the actual instance of `QueryValueBackendRequest20270101OneOf4460683296`. If the actual
   * instance is not `QueryValueBackendRequest20270101OneOf4460683296`, the ClassCastException will
   * be thrown.
   *
   * @return The actual instance of `QueryValueBackendRequest20270101OneOf4460683296`
   * @throws ClassCastException if the instance is not
   *     `QueryValueBackendRequest20270101OneOf4460683296`
   */
  public QueryValueBackendRequest20270101OneOf4460683296
      getQueryValueBackendRequest20270101OneOf4460683296() throws ClassCastException {
    return (QueryValueBackendRequest20270101OneOf4460683296) super.getActualInstance();
  }

  /**
   * Get the actual instance of `QueryValueBackendRequest20270101OneOf4460685056`. If the actual
   * instance is not `QueryValueBackendRequest20270101OneOf4460685056`, the ClassCastException will
   * be thrown.
   *
   * @return The actual instance of `QueryValueBackendRequest20270101OneOf4460685056`
   * @throws ClassCastException if the instance is not
   *     `QueryValueBackendRequest20270101OneOf4460685056`
   */
  public QueryValueBackendRequest20270101OneOf4460685056
      getQueryValueBackendRequest20270101OneOf4460685056() throws ClassCastException {
    return (QueryValueBackendRequest20270101OneOf4460685056) super.getActualInstance();
  }

  /**
   * Get the actual instance of `QueryValueBackendRequest20270101OneOf4460686496`. If the actual
   * instance is not `QueryValueBackendRequest20270101OneOf4460686496`, the ClassCastException will
   * be thrown.
   *
   * @return The actual instance of `QueryValueBackendRequest20270101OneOf4460686496`
   * @throws ClassCastException if the instance is not
   *     `QueryValueBackendRequest20270101OneOf4460686496`
   */
  public QueryValueBackendRequest20270101OneOf4460686496
      getQueryValueBackendRequest20270101OneOf4460686496() throws ClassCastException {
    return (QueryValueBackendRequest20270101OneOf4460686496) super.getActualInstance();
  }

  /**
   * Get the actual instance of `QueryValueBackendRequest20270101OneOf4460688416`. If the actual
   * instance is not `QueryValueBackendRequest20270101OneOf4460688416`, the ClassCastException will
   * be thrown.
   *
   * @return The actual instance of `QueryValueBackendRequest20270101OneOf4460688416`
   * @throws ClassCastException if the instance is not
   *     `QueryValueBackendRequest20270101OneOf4460688416`
   */
  public QueryValueBackendRequest20270101OneOf4460688416
      getQueryValueBackendRequest20270101OneOf4460688416() throws ClassCastException {
    return (QueryValueBackendRequest20270101OneOf4460688416) super.getActualInstance();
  }

  /**
   * Get the actual instance of `QueryValueBackendRequest20270101OneOf4460689536`. If the actual
   * instance is not `QueryValueBackendRequest20270101OneOf4460689536`, the ClassCastException will
   * be thrown.
   *
   * @return The actual instance of `QueryValueBackendRequest20270101OneOf4460689536`
   * @throws ClassCastException if the instance is not
   *     `QueryValueBackendRequest20270101OneOf4460689536`
   */
  public QueryValueBackendRequest20270101OneOf4460689536
      getQueryValueBackendRequest20270101OneOf4460689536() throws ClassCastException {
    return (QueryValueBackendRequest20270101OneOf4460689536) super.getActualInstance();
  }

  /**
   * Get the actual instance of `QueryValueBackendRequest20270101OneOf4460690656`. If the actual
   * instance is not `QueryValueBackendRequest20270101OneOf4460690656`, the ClassCastException will
   * be thrown.
   *
   * @return The actual instance of `QueryValueBackendRequest20270101OneOf4460690656`
   * @throws ClassCastException if the instance is not
   *     `QueryValueBackendRequest20270101OneOf4460690656`
   */
  public QueryValueBackendRequest20270101OneOf4460690656
      getQueryValueBackendRequest20270101OneOf4460690656() throws ClassCastException {
    return (QueryValueBackendRequest20270101OneOf4460690656) super.getActualInstance();
  }

  /**
   * Get the actual instance of `QueryValueBackendRequest20270101OneOf4460904832`. If the actual
   * instance is not `QueryValueBackendRequest20270101OneOf4460904832`, the ClassCastException will
   * be thrown.
   *
   * @return The actual instance of `QueryValueBackendRequest20270101OneOf4460904832`
   * @throws ClassCastException if the instance is not
   *     `QueryValueBackendRequest20270101OneOf4460904832`
   */
  public QueryValueBackendRequest20270101OneOf4460904832
      getQueryValueBackendRequest20270101OneOf4460904832() throws ClassCastException {
    return (QueryValueBackendRequest20270101OneOf4460904832) super.getActualInstance();
  }

  /**
   * Get the actual instance of `QueryValueBackendRequest20270101OneOf4460905952`. If the actual
   * instance is not `QueryValueBackendRequest20270101OneOf4460905952`, the ClassCastException will
   * be thrown.
   *
   * @return The actual instance of `QueryValueBackendRequest20270101OneOf4460905952`
   * @throws ClassCastException if the instance is not
   *     `QueryValueBackendRequest20270101OneOf4460905952`
   */
  public QueryValueBackendRequest20270101OneOf4460905952
      getQueryValueBackendRequest20270101OneOf4460905952() throws ClassCastException {
    return (QueryValueBackendRequest20270101OneOf4460905952) super.getActualInstance();
  }

  /**
   * Get the actual instance of `QueryValueBackendRequest20270101OneOf4460907072`. If the actual
   * instance is not `QueryValueBackendRequest20270101OneOf4460907072`, the ClassCastException will
   * be thrown.
   *
   * @return The actual instance of `QueryValueBackendRequest20270101OneOf4460907072`
   * @throws ClassCastException if the instance is not
   *     `QueryValueBackendRequest20270101OneOf4460907072`
   */
  public QueryValueBackendRequest20270101OneOf4460907072
      getQueryValueBackendRequest20270101OneOf4460907072() throws ClassCastException {
    return (QueryValueBackendRequest20270101OneOf4460907072) super.getActualInstance();
  }

  /**
   * Get the actual instance of `QueryValueBackendRequest20270101OneOf4460908192`. If the actual
   * instance is not `QueryValueBackendRequest20270101OneOf4460908192`, the ClassCastException will
   * be thrown.
   *
   * @return The actual instance of `QueryValueBackendRequest20270101OneOf4460908192`
   * @throws ClassCastException if the instance is not
   *     `QueryValueBackendRequest20270101OneOf4460908192`
   */
  public QueryValueBackendRequest20270101OneOf4460908192
      getQueryValueBackendRequest20270101OneOf4460908192() throws ClassCastException {
    return (QueryValueBackendRequest20270101OneOf4460908192) super.getActualInstance();
  }

  /**
   * Get the actual instance of `QueryValueBackendRequest20270101OneOf4460909312`. If the actual
   * instance is not `QueryValueBackendRequest20270101OneOf4460909312`, the ClassCastException will
   * be thrown.
   *
   * @return The actual instance of `QueryValueBackendRequest20270101OneOf4460909312`
   * @throws ClassCastException if the instance is not
   *     `QueryValueBackendRequest20270101OneOf4460909312`
   */
  public QueryValueBackendRequest20270101OneOf4460909312
      getQueryValueBackendRequest20270101OneOf4460909312() throws ClassCastException {
    return (QueryValueBackendRequest20270101OneOf4460909312) super.getActualInstance();
  }

  /**
   * Get the actual instance of `QueryValueBackendRequest20270101OneOf4460910432`. If the actual
   * instance is not `QueryValueBackendRequest20270101OneOf4460910432`, the ClassCastException will
   * be thrown.
   *
   * @return The actual instance of `QueryValueBackendRequest20270101OneOf4460910432`
   * @throws ClassCastException if the instance is not
   *     `QueryValueBackendRequest20270101OneOf4460910432`
   */
  public QueryValueBackendRequest20270101OneOf4460910432
      getQueryValueBackendRequest20270101OneOf4460910432() throws ClassCastException {
    return (QueryValueBackendRequest20270101OneOf4460910432) super.getActualInstance();
  }

  /**
   * Get the actual instance of `QueryValueBackendRequest20270101OneOf4460911552`. If the actual
   * instance is not `QueryValueBackendRequest20270101OneOf4460911552`, the ClassCastException will
   * be thrown.
   *
   * @return The actual instance of `QueryValueBackendRequest20270101OneOf4460911552`
   * @throws ClassCastException if the instance is not
   *     `QueryValueBackendRequest20270101OneOf4460911552`
   */
  public QueryValueBackendRequest20270101OneOf4460911552
      getQueryValueBackendRequest20270101OneOf4460911552() throws ClassCastException {
    return (QueryValueBackendRequest20270101OneOf4460911552) super.getActualInstance();
  }

  /**
   * Get the actual instance of `QueryValueBackendRequest20270101OneOf4460912672`. If the actual
   * instance is not `QueryValueBackendRequest20270101OneOf4460912672`, the ClassCastException will
   * be thrown.
   *
   * @return The actual instance of `QueryValueBackendRequest20270101OneOf4460912672`
   * @throws ClassCastException if the instance is not
   *     `QueryValueBackendRequest20270101OneOf4460912672`
   */
  public QueryValueBackendRequest20270101OneOf4460912672
      getQueryValueBackendRequest20270101OneOf4460912672() throws ClassCastException {
    return (QueryValueBackendRequest20270101OneOf4460912672) super.getActualInstance();
  }

  /**
   * Get the actual instance of `QueryValueBackendRequest20270101OneOf4460913792`. If the actual
   * instance is not `QueryValueBackendRequest20270101OneOf4460913792`, the ClassCastException will
   * be thrown.
   *
   * @return The actual instance of `QueryValueBackendRequest20270101OneOf4460913792`
   * @throws ClassCastException if the instance is not
   *     `QueryValueBackendRequest20270101OneOf4460913792`
   */
  public QueryValueBackendRequest20270101OneOf4460913792
      getQueryValueBackendRequest20270101OneOf4460913792() throws ClassCastException {
    return (QueryValueBackendRequest20270101OneOf4460913792) super.getActualInstance();
  }

  /**
   * Get the actual instance of `QueryValueBackendRequest20270101OneOf4460914912`. If the actual
   * instance is not `QueryValueBackendRequest20270101OneOf4460914912`, the ClassCastException will
   * be thrown.
   *
   * @return The actual instance of `QueryValueBackendRequest20270101OneOf4460914912`
   * @throws ClassCastException if the instance is not
   *     `QueryValueBackendRequest20270101OneOf4460914912`
   */
  public QueryValueBackendRequest20270101OneOf4460914912
      getQueryValueBackendRequest20270101OneOf4460914912() throws ClassCastException {
    return (QueryValueBackendRequest20270101OneOf4460914912) super.getActualInstance();
  }

  /**
   * Get the actual instance of `QueryValueBackendRequest20270101OneOf4460916032`. If the actual
   * instance is not `QueryValueBackendRequest20270101OneOf4460916032`, the ClassCastException will
   * be thrown.
   *
   * @return The actual instance of `QueryValueBackendRequest20270101OneOf4460916032`
   * @throws ClassCastException if the instance is not
   *     `QueryValueBackendRequest20270101OneOf4460916032`
   */
  public QueryValueBackendRequest20270101OneOf4460916032
      getQueryValueBackendRequest20270101OneOf4460916032() throws ClassCastException {
    return (QueryValueBackendRequest20270101OneOf4460916032) super.getActualInstance();
  }

  /**
   * Get the actual instance of `QueryValueBackendRequest20270101OneOf4460917152`. If the actual
   * instance is not `QueryValueBackendRequest20270101OneOf4460917152`, the ClassCastException will
   * be thrown.
   *
   * @return The actual instance of `QueryValueBackendRequest20270101OneOf4460917152`
   * @throws ClassCastException if the instance is not
   *     `QueryValueBackendRequest20270101OneOf4460917152`
   */
  public QueryValueBackendRequest20270101OneOf4460917152
      getQueryValueBackendRequest20270101OneOf4460917152() throws ClassCastException {
    return (QueryValueBackendRequest20270101OneOf4460917152) super.getActualInstance();
  }

  /**
   * Get the actual instance of `QueryValueBackendRequest20270101OneOf4460918912`. If the actual
   * instance is not `QueryValueBackendRequest20270101OneOf4460918912`, the ClassCastException will
   * be thrown.
   *
   * @return The actual instance of `QueryValueBackendRequest20270101OneOf4460918912`
   * @throws ClassCastException if the instance is not
   *     `QueryValueBackendRequest20270101OneOf4460918912`
   */
  public QueryValueBackendRequest20270101OneOf4460918912
      getQueryValueBackendRequest20270101OneOf4460918912() throws ClassCastException {
    return (QueryValueBackendRequest20270101OneOf4460918912) super.getActualInstance();
  }
}
