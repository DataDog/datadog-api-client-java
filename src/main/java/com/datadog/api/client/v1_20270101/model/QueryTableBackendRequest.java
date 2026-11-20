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
@JsonDeserialize(using = QueryTableBackendRequest.QueryTableBackendRequestDeserializer.class)
@JsonSerialize(using = QueryTableBackendRequest.QueryTableBackendRequestSerializer.class)
public class QueryTableBackendRequest extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(QueryTableBackendRequest.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class QueryTableBackendRequestSerializer
      extends StdSerializer<QueryTableBackendRequest> {
    public QueryTableBackendRequestSerializer(Class<QueryTableBackendRequest> t) {
      super(t);
    }

    public QueryTableBackendRequestSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        QueryTableBackendRequest value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class QueryTableBackendRequestDeserializer
      extends StdDeserializer<QueryTableBackendRequest> {
    public QueryTableBackendRequestDeserializer() {
      this(QueryTableBackendRequest.class);
    }

    public QueryTableBackendRequestDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public QueryTableBackendRequest deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize QueryTableBackendRequest20270101OneOf
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (QueryTableBackendRequest20270101OneOf.class.equals(Integer.class)
            || QueryTableBackendRequest20270101OneOf.class.equals(Long.class)
            || QueryTableBackendRequest20270101OneOf.class.equals(Float.class)
            || QueryTableBackendRequest20270101OneOf.class.equals(Double.class)
            || QueryTableBackendRequest20270101OneOf.class.equals(Boolean.class)
            || QueryTableBackendRequest20270101OneOf.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((QueryTableBackendRequest20270101OneOf.class.equals(Integer.class)
                        || QueryTableBackendRequest20270101OneOf.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((QueryTableBackendRequest20270101OneOf.class.equals(Float.class)
                        || QueryTableBackendRequest20270101OneOf.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (QueryTableBackendRequest20270101OneOf.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (QueryTableBackendRequest20270101OneOf.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec()).readValueAs(QueryTableBackendRequest20270101OneOf.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((QueryTableBackendRequest20270101OneOf) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'QueryTableBackendRequest20270101OneOf'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'QueryTableBackendRequest20270101OneOf'",
            e);
      }

      // deserialize QueryTableBackendRequest20270101OneOf4459913248
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (QueryTableBackendRequest20270101OneOf4459913248.class.equals(Integer.class)
            || QueryTableBackendRequest20270101OneOf4459913248.class.equals(Long.class)
            || QueryTableBackendRequest20270101OneOf4459913248.class.equals(Float.class)
            || QueryTableBackendRequest20270101OneOf4459913248.class.equals(Double.class)
            || QueryTableBackendRequest20270101OneOf4459913248.class.equals(Boolean.class)
            || QueryTableBackendRequest20270101OneOf4459913248.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((QueryTableBackendRequest20270101OneOf4459913248.class.equals(Integer.class)
                        || QueryTableBackendRequest20270101OneOf4459913248.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((QueryTableBackendRequest20270101OneOf4459913248.class.equals(Float.class)
                        || QueryTableBackendRequest20270101OneOf4459913248.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (QueryTableBackendRequest20270101OneOf4459913248.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (QueryTableBackendRequest20270101OneOf4459913248.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(QueryTableBackendRequest20270101OneOf4459913248.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((QueryTableBackendRequest20270101OneOf4459913248) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'QueryTableBackendRequest20270101OneOf4459913248'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'QueryTableBackendRequest20270101OneOf4459913248'",
            e);
      }

      // deserialize QueryTableBackendRequest20270101OneOf4459916288
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (QueryTableBackendRequest20270101OneOf4459916288.class.equals(Integer.class)
            || QueryTableBackendRequest20270101OneOf4459916288.class.equals(Long.class)
            || QueryTableBackendRequest20270101OneOf4459916288.class.equals(Float.class)
            || QueryTableBackendRequest20270101OneOf4459916288.class.equals(Double.class)
            || QueryTableBackendRequest20270101OneOf4459916288.class.equals(Boolean.class)
            || QueryTableBackendRequest20270101OneOf4459916288.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((QueryTableBackendRequest20270101OneOf4459916288.class.equals(Integer.class)
                        || QueryTableBackendRequest20270101OneOf4459916288.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((QueryTableBackendRequest20270101OneOf4459916288.class.equals(Float.class)
                        || QueryTableBackendRequest20270101OneOf4459916288.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (QueryTableBackendRequest20270101OneOf4459916288.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (QueryTableBackendRequest20270101OneOf4459916288.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(QueryTableBackendRequest20270101OneOf4459916288.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((QueryTableBackendRequest20270101OneOf4459916288) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'QueryTableBackendRequest20270101OneOf4459916288'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'QueryTableBackendRequest20270101OneOf4459916288'",
            e);
      }

      // deserialize QueryTableBackendRequest20270101OneOf4459919328
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (QueryTableBackendRequest20270101OneOf4459919328.class.equals(Integer.class)
            || QueryTableBackendRequest20270101OneOf4459919328.class.equals(Long.class)
            || QueryTableBackendRequest20270101OneOf4459919328.class.equals(Float.class)
            || QueryTableBackendRequest20270101OneOf4459919328.class.equals(Double.class)
            || QueryTableBackendRequest20270101OneOf4459919328.class.equals(Boolean.class)
            || QueryTableBackendRequest20270101OneOf4459919328.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((QueryTableBackendRequest20270101OneOf4459919328.class.equals(Integer.class)
                        || QueryTableBackendRequest20270101OneOf4459919328.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((QueryTableBackendRequest20270101OneOf4459919328.class.equals(Float.class)
                        || QueryTableBackendRequest20270101OneOf4459919328.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (QueryTableBackendRequest20270101OneOf4459919328.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (QueryTableBackendRequest20270101OneOf4459919328.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(QueryTableBackendRequest20270101OneOf4459919328.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((QueryTableBackendRequest20270101OneOf4459919328) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'QueryTableBackendRequest20270101OneOf4459919328'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'QueryTableBackendRequest20270101OneOf4459919328'",
            e);
      }

      // deserialize QueryTableBackendRequest20270101OneOf4460101856
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (QueryTableBackendRequest20270101OneOf4460101856.class.equals(Integer.class)
            || QueryTableBackendRequest20270101OneOf4460101856.class.equals(Long.class)
            || QueryTableBackendRequest20270101OneOf4460101856.class.equals(Float.class)
            || QueryTableBackendRequest20270101OneOf4460101856.class.equals(Double.class)
            || QueryTableBackendRequest20270101OneOf4460101856.class.equals(Boolean.class)
            || QueryTableBackendRequest20270101OneOf4460101856.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((QueryTableBackendRequest20270101OneOf4460101856.class.equals(Integer.class)
                        || QueryTableBackendRequest20270101OneOf4460101856.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((QueryTableBackendRequest20270101OneOf4460101856.class.equals(Float.class)
                        || QueryTableBackendRequest20270101OneOf4460101856.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (QueryTableBackendRequest20270101OneOf4460101856.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (QueryTableBackendRequest20270101OneOf4460101856.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(QueryTableBackendRequest20270101OneOf4460101856.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((QueryTableBackendRequest20270101OneOf4460101856) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'QueryTableBackendRequest20270101OneOf4460101856'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'QueryTableBackendRequest20270101OneOf4460101856'",
            e);
      }

      // deserialize QueryTableBackendRequest20270101OneOf4460104096
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (QueryTableBackendRequest20270101OneOf4460104096.class.equals(Integer.class)
            || QueryTableBackendRequest20270101OneOf4460104096.class.equals(Long.class)
            || QueryTableBackendRequest20270101OneOf4460104096.class.equals(Float.class)
            || QueryTableBackendRequest20270101OneOf4460104096.class.equals(Double.class)
            || QueryTableBackendRequest20270101OneOf4460104096.class.equals(Boolean.class)
            || QueryTableBackendRequest20270101OneOf4460104096.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((QueryTableBackendRequest20270101OneOf4460104096.class.equals(Integer.class)
                        || QueryTableBackendRequest20270101OneOf4460104096.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((QueryTableBackendRequest20270101OneOf4460104096.class.equals(Float.class)
                        || QueryTableBackendRequest20270101OneOf4460104096.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (QueryTableBackendRequest20270101OneOf4460104096.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (QueryTableBackendRequest20270101OneOf4460104096.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(QueryTableBackendRequest20270101OneOf4460104096.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((QueryTableBackendRequest20270101OneOf4460104096) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'QueryTableBackendRequest20270101OneOf4460104096'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'QueryTableBackendRequest20270101OneOf4460104096'",
            e);
      }

      // deserialize QueryTableBackendRequest20270101OneOf4460106336
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (QueryTableBackendRequest20270101OneOf4460106336.class.equals(Integer.class)
            || QueryTableBackendRequest20270101OneOf4460106336.class.equals(Long.class)
            || QueryTableBackendRequest20270101OneOf4460106336.class.equals(Float.class)
            || QueryTableBackendRequest20270101OneOf4460106336.class.equals(Double.class)
            || QueryTableBackendRequest20270101OneOf4460106336.class.equals(Boolean.class)
            || QueryTableBackendRequest20270101OneOf4460106336.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((QueryTableBackendRequest20270101OneOf4460106336.class.equals(Integer.class)
                        || QueryTableBackendRequest20270101OneOf4460106336.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((QueryTableBackendRequest20270101OneOf4460106336.class.equals(Float.class)
                        || QueryTableBackendRequest20270101OneOf4460106336.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (QueryTableBackendRequest20270101OneOf4460106336.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (QueryTableBackendRequest20270101OneOf4460106336.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(QueryTableBackendRequest20270101OneOf4460106336.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((QueryTableBackendRequest20270101OneOf4460106336) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'QueryTableBackendRequest20270101OneOf4460106336'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'QueryTableBackendRequest20270101OneOf4460106336'",
            e);
      }

      // deserialize QueryTableBackendRequest20270101OneOf4460108576
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (QueryTableBackendRequest20270101OneOf4460108576.class.equals(Integer.class)
            || QueryTableBackendRequest20270101OneOf4460108576.class.equals(Long.class)
            || QueryTableBackendRequest20270101OneOf4460108576.class.equals(Float.class)
            || QueryTableBackendRequest20270101OneOf4460108576.class.equals(Double.class)
            || QueryTableBackendRequest20270101OneOf4460108576.class.equals(Boolean.class)
            || QueryTableBackendRequest20270101OneOf4460108576.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((QueryTableBackendRequest20270101OneOf4460108576.class.equals(Integer.class)
                        || QueryTableBackendRequest20270101OneOf4460108576.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((QueryTableBackendRequest20270101OneOf4460108576.class.equals(Float.class)
                        || QueryTableBackendRequest20270101OneOf4460108576.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (QueryTableBackendRequest20270101OneOf4460108576.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (QueryTableBackendRequest20270101OneOf4460108576.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(QueryTableBackendRequest20270101OneOf4460108576.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((QueryTableBackendRequest20270101OneOf4460108576) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'QueryTableBackendRequest20270101OneOf4460108576'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'QueryTableBackendRequest20270101OneOf4460108576'",
            e);
      }

      // deserialize QueryTableBackendRequest20270101OneOf4460110816
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (QueryTableBackendRequest20270101OneOf4460110816.class.equals(Integer.class)
            || QueryTableBackendRequest20270101OneOf4460110816.class.equals(Long.class)
            || QueryTableBackendRequest20270101OneOf4460110816.class.equals(Float.class)
            || QueryTableBackendRequest20270101OneOf4460110816.class.equals(Double.class)
            || QueryTableBackendRequest20270101OneOf4460110816.class.equals(Boolean.class)
            || QueryTableBackendRequest20270101OneOf4460110816.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((QueryTableBackendRequest20270101OneOf4460110816.class.equals(Integer.class)
                        || QueryTableBackendRequest20270101OneOf4460110816.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((QueryTableBackendRequest20270101OneOf4460110816.class.equals(Float.class)
                        || QueryTableBackendRequest20270101OneOf4460110816.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (QueryTableBackendRequest20270101OneOf4460110816.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (QueryTableBackendRequest20270101OneOf4460110816.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(QueryTableBackendRequest20270101OneOf4460110816.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((QueryTableBackendRequest20270101OneOf4460110816) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'QueryTableBackendRequest20270101OneOf4460110816'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'QueryTableBackendRequest20270101OneOf4460110816'",
            e);
      }

      // deserialize QueryTableBackendRequest20270101OneOf4460113056
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (QueryTableBackendRequest20270101OneOf4460113056.class.equals(Integer.class)
            || QueryTableBackendRequest20270101OneOf4460113056.class.equals(Long.class)
            || QueryTableBackendRequest20270101OneOf4460113056.class.equals(Float.class)
            || QueryTableBackendRequest20270101OneOf4460113056.class.equals(Double.class)
            || QueryTableBackendRequest20270101OneOf4460113056.class.equals(Boolean.class)
            || QueryTableBackendRequest20270101OneOf4460113056.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((QueryTableBackendRequest20270101OneOf4460113056.class.equals(Integer.class)
                        || QueryTableBackendRequest20270101OneOf4460113056.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((QueryTableBackendRequest20270101OneOf4460113056.class.equals(Float.class)
                        || QueryTableBackendRequest20270101OneOf4460113056.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (QueryTableBackendRequest20270101OneOf4460113056.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (QueryTableBackendRequest20270101OneOf4460113056.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(QueryTableBackendRequest20270101OneOf4460113056.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((QueryTableBackendRequest20270101OneOf4460113056) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'QueryTableBackendRequest20270101OneOf4460113056'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'QueryTableBackendRequest20270101OneOf4460113056'",
            e);
      }

      // deserialize QueryTableBackendRequest20270101OneOf4460115296
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (QueryTableBackendRequest20270101OneOf4460115296.class.equals(Integer.class)
            || QueryTableBackendRequest20270101OneOf4460115296.class.equals(Long.class)
            || QueryTableBackendRequest20270101OneOf4460115296.class.equals(Float.class)
            || QueryTableBackendRequest20270101OneOf4460115296.class.equals(Double.class)
            || QueryTableBackendRequest20270101OneOf4460115296.class.equals(Boolean.class)
            || QueryTableBackendRequest20270101OneOf4460115296.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((QueryTableBackendRequest20270101OneOf4460115296.class.equals(Integer.class)
                        || QueryTableBackendRequest20270101OneOf4460115296.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((QueryTableBackendRequest20270101OneOf4460115296.class.equals(Float.class)
                        || QueryTableBackendRequest20270101OneOf4460115296.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (QueryTableBackendRequest20270101OneOf4460115296.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (QueryTableBackendRequest20270101OneOf4460115296.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(QueryTableBackendRequest20270101OneOf4460115296.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((QueryTableBackendRequest20270101OneOf4460115296) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'QueryTableBackendRequest20270101OneOf4460115296'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'QueryTableBackendRequest20270101OneOf4460115296'",
            e);
      }

      // deserialize QueryTableBackendRequest20270101OneOf4460117536
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (QueryTableBackendRequest20270101OneOf4460117536.class.equals(Integer.class)
            || QueryTableBackendRequest20270101OneOf4460117536.class.equals(Long.class)
            || QueryTableBackendRequest20270101OneOf4460117536.class.equals(Float.class)
            || QueryTableBackendRequest20270101OneOf4460117536.class.equals(Double.class)
            || QueryTableBackendRequest20270101OneOf4460117536.class.equals(Boolean.class)
            || QueryTableBackendRequest20270101OneOf4460117536.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((QueryTableBackendRequest20270101OneOf4460117536.class.equals(Integer.class)
                        || QueryTableBackendRequest20270101OneOf4460117536.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((QueryTableBackendRequest20270101OneOf4460117536.class.equals(Float.class)
                        || QueryTableBackendRequest20270101OneOf4460117536.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (QueryTableBackendRequest20270101OneOf4460117536.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (QueryTableBackendRequest20270101OneOf4460117536.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(QueryTableBackendRequest20270101OneOf4460117536.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((QueryTableBackendRequest20270101OneOf4460117536) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'QueryTableBackendRequest20270101OneOf4460117536'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'QueryTableBackendRequest20270101OneOf4460117536'",
            e);
      }

      // deserialize QueryTableBackendRequest20270101OneOf4460300064
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (QueryTableBackendRequest20270101OneOf4460300064.class.equals(Integer.class)
            || QueryTableBackendRequest20270101OneOf4460300064.class.equals(Long.class)
            || QueryTableBackendRequest20270101OneOf4460300064.class.equals(Float.class)
            || QueryTableBackendRequest20270101OneOf4460300064.class.equals(Double.class)
            || QueryTableBackendRequest20270101OneOf4460300064.class.equals(Boolean.class)
            || QueryTableBackendRequest20270101OneOf4460300064.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((QueryTableBackendRequest20270101OneOf4460300064.class.equals(Integer.class)
                        || QueryTableBackendRequest20270101OneOf4460300064.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((QueryTableBackendRequest20270101OneOf4460300064.class.equals(Float.class)
                        || QueryTableBackendRequest20270101OneOf4460300064.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (QueryTableBackendRequest20270101OneOf4460300064.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (QueryTableBackendRequest20270101OneOf4460300064.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(QueryTableBackendRequest20270101OneOf4460300064.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((QueryTableBackendRequest20270101OneOf4460300064) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'QueryTableBackendRequest20270101OneOf4460300064'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'QueryTableBackendRequest20270101OneOf4460300064'",
            e);
      }

      // deserialize QueryTableBackendRequest20270101OneOf4460302304
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (QueryTableBackendRequest20270101OneOf4460302304.class.equals(Integer.class)
            || QueryTableBackendRequest20270101OneOf4460302304.class.equals(Long.class)
            || QueryTableBackendRequest20270101OneOf4460302304.class.equals(Float.class)
            || QueryTableBackendRequest20270101OneOf4460302304.class.equals(Double.class)
            || QueryTableBackendRequest20270101OneOf4460302304.class.equals(Boolean.class)
            || QueryTableBackendRequest20270101OneOf4460302304.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((QueryTableBackendRequest20270101OneOf4460302304.class.equals(Integer.class)
                        || QueryTableBackendRequest20270101OneOf4460302304.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((QueryTableBackendRequest20270101OneOf4460302304.class.equals(Float.class)
                        || QueryTableBackendRequest20270101OneOf4460302304.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (QueryTableBackendRequest20270101OneOf4460302304.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (QueryTableBackendRequest20270101OneOf4460302304.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(QueryTableBackendRequest20270101OneOf4460302304.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((QueryTableBackendRequest20270101OneOf4460302304) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'QueryTableBackendRequest20270101OneOf4460302304'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'QueryTableBackendRequest20270101OneOf4460302304'",
            e);
      }

      // deserialize QueryTableBackendRequest20270101OneOf4460304544
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (QueryTableBackendRequest20270101OneOf4460304544.class.equals(Integer.class)
            || QueryTableBackendRequest20270101OneOf4460304544.class.equals(Long.class)
            || QueryTableBackendRequest20270101OneOf4460304544.class.equals(Float.class)
            || QueryTableBackendRequest20270101OneOf4460304544.class.equals(Double.class)
            || QueryTableBackendRequest20270101OneOf4460304544.class.equals(Boolean.class)
            || QueryTableBackendRequest20270101OneOf4460304544.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((QueryTableBackendRequest20270101OneOf4460304544.class.equals(Integer.class)
                        || QueryTableBackendRequest20270101OneOf4460304544.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((QueryTableBackendRequest20270101OneOf4460304544.class.equals(Float.class)
                        || QueryTableBackendRequest20270101OneOf4460304544.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (QueryTableBackendRequest20270101OneOf4460304544.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (QueryTableBackendRequest20270101OneOf4460304544.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(QueryTableBackendRequest20270101OneOf4460304544.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((QueryTableBackendRequest20270101OneOf4460304544) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'QueryTableBackendRequest20270101OneOf4460304544'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'QueryTableBackendRequest20270101OneOf4460304544'",
            e);
      }

      // deserialize QueryTableBackendRequest20270101OneOf4460306784
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (QueryTableBackendRequest20270101OneOf4460306784.class.equals(Integer.class)
            || QueryTableBackendRequest20270101OneOf4460306784.class.equals(Long.class)
            || QueryTableBackendRequest20270101OneOf4460306784.class.equals(Float.class)
            || QueryTableBackendRequest20270101OneOf4460306784.class.equals(Double.class)
            || QueryTableBackendRequest20270101OneOf4460306784.class.equals(Boolean.class)
            || QueryTableBackendRequest20270101OneOf4460306784.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((QueryTableBackendRequest20270101OneOf4460306784.class.equals(Integer.class)
                        || QueryTableBackendRequest20270101OneOf4460306784.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((QueryTableBackendRequest20270101OneOf4460306784.class.equals(Float.class)
                        || QueryTableBackendRequest20270101OneOf4460306784.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (QueryTableBackendRequest20270101OneOf4460306784.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (QueryTableBackendRequest20270101OneOf4460306784.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(QueryTableBackendRequest20270101OneOf4460306784.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((QueryTableBackendRequest20270101OneOf4460306784) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'QueryTableBackendRequest20270101OneOf4460306784'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'QueryTableBackendRequest20270101OneOf4460306784'",
            e);
      }

      // deserialize QueryTableBackendRequest20270101OneOf4460309024
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (QueryTableBackendRequest20270101OneOf4460309024.class.equals(Integer.class)
            || QueryTableBackendRequest20270101OneOf4460309024.class.equals(Long.class)
            || QueryTableBackendRequest20270101OneOf4460309024.class.equals(Float.class)
            || QueryTableBackendRequest20270101OneOf4460309024.class.equals(Double.class)
            || QueryTableBackendRequest20270101OneOf4460309024.class.equals(Boolean.class)
            || QueryTableBackendRequest20270101OneOf4460309024.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((QueryTableBackendRequest20270101OneOf4460309024.class.equals(Integer.class)
                        || QueryTableBackendRequest20270101OneOf4460309024.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((QueryTableBackendRequest20270101OneOf4460309024.class.equals(Float.class)
                        || QueryTableBackendRequest20270101OneOf4460309024.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (QueryTableBackendRequest20270101OneOf4460309024.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (QueryTableBackendRequest20270101OneOf4460309024.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(QueryTableBackendRequest20270101OneOf4460309024.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((QueryTableBackendRequest20270101OneOf4460309024) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'QueryTableBackendRequest20270101OneOf4460309024'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'QueryTableBackendRequest20270101OneOf4460309024'",
            e);
      }

      // deserialize QueryTableBackendRequest20270101OneOf4460311264
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (QueryTableBackendRequest20270101OneOf4460311264.class.equals(Integer.class)
            || QueryTableBackendRequest20270101OneOf4460311264.class.equals(Long.class)
            || QueryTableBackendRequest20270101OneOf4460311264.class.equals(Float.class)
            || QueryTableBackendRequest20270101OneOf4460311264.class.equals(Double.class)
            || QueryTableBackendRequest20270101OneOf4460311264.class.equals(Boolean.class)
            || QueryTableBackendRequest20270101OneOf4460311264.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((QueryTableBackendRequest20270101OneOf4460311264.class.equals(Integer.class)
                        || QueryTableBackendRequest20270101OneOf4460311264.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((QueryTableBackendRequest20270101OneOf4460311264.class.equals(Float.class)
                        || QueryTableBackendRequest20270101OneOf4460311264.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (QueryTableBackendRequest20270101OneOf4460311264.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (QueryTableBackendRequest20270101OneOf4460311264.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(QueryTableBackendRequest20270101OneOf4460311264.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((QueryTableBackendRequest20270101OneOf4460311264) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'QueryTableBackendRequest20270101OneOf4460311264'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'QueryTableBackendRequest20270101OneOf4460311264'",
            e);
      }

      // deserialize QueryTableBackendRequest20270101OneOf4460313504
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (QueryTableBackendRequest20270101OneOf4460313504.class.equals(Integer.class)
            || QueryTableBackendRequest20270101OneOf4460313504.class.equals(Long.class)
            || QueryTableBackendRequest20270101OneOf4460313504.class.equals(Float.class)
            || QueryTableBackendRequest20270101OneOf4460313504.class.equals(Double.class)
            || QueryTableBackendRequest20270101OneOf4460313504.class.equals(Boolean.class)
            || QueryTableBackendRequest20270101OneOf4460313504.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((QueryTableBackendRequest20270101OneOf4460313504.class.equals(Integer.class)
                        || QueryTableBackendRequest20270101OneOf4460313504.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((QueryTableBackendRequest20270101OneOf4460313504.class.equals(Float.class)
                        || QueryTableBackendRequest20270101OneOf4460313504.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (QueryTableBackendRequest20270101OneOf4460313504.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (QueryTableBackendRequest20270101OneOf4460313504.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(QueryTableBackendRequest20270101OneOf4460313504.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((QueryTableBackendRequest20270101OneOf4460313504) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'QueryTableBackendRequest20270101OneOf4460313504'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'QueryTableBackendRequest20270101OneOf4460313504'",
            e);
      }

      // deserialize QueryTableBackendRequest20270101OneOf4460513216
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (QueryTableBackendRequest20270101OneOf4460513216.class.equals(Integer.class)
            || QueryTableBackendRequest20270101OneOf4460513216.class.equals(Long.class)
            || QueryTableBackendRequest20270101OneOf4460513216.class.equals(Float.class)
            || QueryTableBackendRequest20270101OneOf4460513216.class.equals(Double.class)
            || QueryTableBackendRequest20270101OneOf4460513216.class.equals(Boolean.class)
            || QueryTableBackendRequest20270101OneOf4460513216.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((QueryTableBackendRequest20270101OneOf4460513216.class.equals(Integer.class)
                        || QueryTableBackendRequest20270101OneOf4460513216.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((QueryTableBackendRequest20270101OneOf4460513216.class.equals(Float.class)
                        || QueryTableBackendRequest20270101OneOf4460513216.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (QueryTableBackendRequest20270101OneOf4460513216.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (QueryTableBackendRequest20270101OneOf4460513216.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(QueryTableBackendRequest20270101OneOf4460513216.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((QueryTableBackendRequest20270101OneOf4460513216) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'QueryTableBackendRequest20270101OneOf4460513216'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'QueryTableBackendRequest20270101OneOf4460513216'",
            e);
      }

      // deserialize QueryTableBackendRequest20270101OneOf4460516096
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (QueryTableBackendRequest20270101OneOf4460516096.class.equals(Integer.class)
            || QueryTableBackendRequest20270101OneOf4460516096.class.equals(Long.class)
            || QueryTableBackendRequest20270101OneOf4460516096.class.equals(Float.class)
            || QueryTableBackendRequest20270101OneOf4460516096.class.equals(Double.class)
            || QueryTableBackendRequest20270101OneOf4460516096.class.equals(Boolean.class)
            || QueryTableBackendRequest20270101OneOf4460516096.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((QueryTableBackendRequest20270101OneOf4460516096.class.equals(Integer.class)
                        || QueryTableBackendRequest20270101OneOf4460516096.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((QueryTableBackendRequest20270101OneOf4460516096.class.equals(Float.class)
                        || QueryTableBackendRequest20270101OneOf4460516096.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (QueryTableBackendRequest20270101OneOf4460516096.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (QueryTableBackendRequest20270101OneOf4460516096.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(QueryTableBackendRequest20270101OneOf4460516096.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((QueryTableBackendRequest20270101OneOf4460516096) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'QueryTableBackendRequest20270101OneOf4460516096'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'QueryTableBackendRequest20270101OneOf4460516096'",
            e);
      }

      // deserialize QueryTableBackendRequest20270101OneOf4460519136
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (QueryTableBackendRequest20270101OneOf4460519136.class.equals(Integer.class)
            || QueryTableBackendRequest20270101OneOf4460519136.class.equals(Long.class)
            || QueryTableBackendRequest20270101OneOf4460519136.class.equals(Float.class)
            || QueryTableBackendRequest20270101OneOf4460519136.class.equals(Double.class)
            || QueryTableBackendRequest20270101OneOf4460519136.class.equals(Boolean.class)
            || QueryTableBackendRequest20270101OneOf4460519136.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((QueryTableBackendRequest20270101OneOf4460519136.class.equals(Integer.class)
                        || QueryTableBackendRequest20270101OneOf4460519136.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((QueryTableBackendRequest20270101OneOf4460519136.class.equals(Float.class)
                        || QueryTableBackendRequest20270101OneOf4460519136.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (QueryTableBackendRequest20270101OneOf4460519136.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (QueryTableBackendRequest20270101OneOf4460519136.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(QueryTableBackendRequest20270101OneOf4460519136.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((QueryTableBackendRequest20270101OneOf4460519136) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'QueryTableBackendRequest20270101OneOf4460519136'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'QueryTableBackendRequest20270101OneOf4460519136'",
            e);
      }

      // deserialize QueryTableBackendRequest20270101OneOf4460522016
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (QueryTableBackendRequest20270101OneOf4460522016.class.equals(Integer.class)
            || QueryTableBackendRequest20270101OneOf4460522016.class.equals(Long.class)
            || QueryTableBackendRequest20270101OneOf4460522016.class.equals(Float.class)
            || QueryTableBackendRequest20270101OneOf4460522016.class.equals(Double.class)
            || QueryTableBackendRequest20270101OneOf4460522016.class.equals(Boolean.class)
            || QueryTableBackendRequest20270101OneOf4460522016.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((QueryTableBackendRequest20270101OneOf4460522016.class.equals(Integer.class)
                        || QueryTableBackendRequest20270101OneOf4460522016.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((QueryTableBackendRequest20270101OneOf4460522016.class.equals(Float.class)
                        || QueryTableBackendRequest20270101OneOf4460522016.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (QueryTableBackendRequest20270101OneOf4460522016.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (QueryTableBackendRequest20270101OneOf4460522016.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(QueryTableBackendRequest20270101OneOf4460522016.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((QueryTableBackendRequest20270101OneOf4460522016) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'QueryTableBackendRequest20270101OneOf4460522016'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'QueryTableBackendRequest20270101OneOf4460522016'",
            e);
      }

      QueryTableBackendRequest ret = new QueryTableBackendRequest();
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
    public QueryTableBackendRequest getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "QueryTableBackendRequest cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public QueryTableBackendRequest() {
    super("oneOf", Boolean.FALSE);
  }

  public QueryTableBackendRequest(QueryTableBackendRequest20270101OneOf o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public QueryTableBackendRequest(QueryTableBackendRequest20270101OneOf4459913248 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public QueryTableBackendRequest(QueryTableBackendRequest20270101OneOf4459916288 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public QueryTableBackendRequest(QueryTableBackendRequest20270101OneOf4459919328 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public QueryTableBackendRequest(QueryTableBackendRequest20270101OneOf4460101856 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public QueryTableBackendRequest(QueryTableBackendRequest20270101OneOf4460104096 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public QueryTableBackendRequest(QueryTableBackendRequest20270101OneOf4460106336 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public QueryTableBackendRequest(QueryTableBackendRequest20270101OneOf4460108576 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public QueryTableBackendRequest(QueryTableBackendRequest20270101OneOf4460110816 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public QueryTableBackendRequest(QueryTableBackendRequest20270101OneOf4460113056 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public QueryTableBackendRequest(QueryTableBackendRequest20270101OneOf4460115296 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public QueryTableBackendRequest(QueryTableBackendRequest20270101OneOf4460117536 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public QueryTableBackendRequest(QueryTableBackendRequest20270101OneOf4460300064 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public QueryTableBackendRequest(QueryTableBackendRequest20270101OneOf4460302304 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public QueryTableBackendRequest(QueryTableBackendRequest20270101OneOf4460304544 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public QueryTableBackendRequest(QueryTableBackendRequest20270101OneOf4460306784 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public QueryTableBackendRequest(QueryTableBackendRequest20270101OneOf4460309024 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public QueryTableBackendRequest(QueryTableBackendRequest20270101OneOf4460311264 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public QueryTableBackendRequest(QueryTableBackendRequest20270101OneOf4460313504 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public QueryTableBackendRequest(QueryTableBackendRequest20270101OneOf4460513216 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public QueryTableBackendRequest(QueryTableBackendRequest20270101OneOf4460516096 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public QueryTableBackendRequest(QueryTableBackendRequest20270101OneOf4460519136 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public QueryTableBackendRequest(QueryTableBackendRequest20270101OneOf4460522016 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "QueryTableBackendRequest20270101OneOf",
        new GenericType<QueryTableBackendRequest20270101OneOf>() {});
    schemas.put(
        "QueryTableBackendRequest20270101OneOf4459913248",
        new GenericType<QueryTableBackendRequest20270101OneOf4459913248>() {});
    schemas.put(
        "QueryTableBackendRequest20270101OneOf4459916288",
        new GenericType<QueryTableBackendRequest20270101OneOf4459916288>() {});
    schemas.put(
        "QueryTableBackendRequest20270101OneOf4459919328",
        new GenericType<QueryTableBackendRequest20270101OneOf4459919328>() {});
    schemas.put(
        "QueryTableBackendRequest20270101OneOf4460101856",
        new GenericType<QueryTableBackendRequest20270101OneOf4460101856>() {});
    schemas.put(
        "QueryTableBackendRequest20270101OneOf4460104096",
        new GenericType<QueryTableBackendRequest20270101OneOf4460104096>() {});
    schemas.put(
        "QueryTableBackendRequest20270101OneOf4460106336",
        new GenericType<QueryTableBackendRequest20270101OneOf4460106336>() {});
    schemas.put(
        "QueryTableBackendRequest20270101OneOf4460108576",
        new GenericType<QueryTableBackendRequest20270101OneOf4460108576>() {});
    schemas.put(
        "QueryTableBackendRequest20270101OneOf4460110816",
        new GenericType<QueryTableBackendRequest20270101OneOf4460110816>() {});
    schemas.put(
        "QueryTableBackendRequest20270101OneOf4460113056",
        new GenericType<QueryTableBackendRequest20270101OneOf4460113056>() {});
    schemas.put(
        "QueryTableBackendRequest20270101OneOf4460115296",
        new GenericType<QueryTableBackendRequest20270101OneOf4460115296>() {});
    schemas.put(
        "QueryTableBackendRequest20270101OneOf4460117536",
        new GenericType<QueryTableBackendRequest20270101OneOf4460117536>() {});
    schemas.put(
        "QueryTableBackendRequest20270101OneOf4460300064",
        new GenericType<QueryTableBackendRequest20270101OneOf4460300064>() {});
    schemas.put(
        "QueryTableBackendRequest20270101OneOf4460302304",
        new GenericType<QueryTableBackendRequest20270101OneOf4460302304>() {});
    schemas.put(
        "QueryTableBackendRequest20270101OneOf4460304544",
        new GenericType<QueryTableBackendRequest20270101OneOf4460304544>() {});
    schemas.put(
        "QueryTableBackendRequest20270101OneOf4460306784",
        new GenericType<QueryTableBackendRequest20270101OneOf4460306784>() {});
    schemas.put(
        "QueryTableBackendRequest20270101OneOf4460309024",
        new GenericType<QueryTableBackendRequest20270101OneOf4460309024>() {});
    schemas.put(
        "QueryTableBackendRequest20270101OneOf4460311264",
        new GenericType<QueryTableBackendRequest20270101OneOf4460311264>() {});
    schemas.put(
        "QueryTableBackendRequest20270101OneOf4460313504",
        new GenericType<QueryTableBackendRequest20270101OneOf4460313504>() {});
    schemas.put(
        "QueryTableBackendRequest20270101OneOf4460513216",
        new GenericType<QueryTableBackendRequest20270101OneOf4460513216>() {});
    schemas.put(
        "QueryTableBackendRequest20270101OneOf4460516096",
        new GenericType<QueryTableBackendRequest20270101OneOf4460516096>() {});
    schemas.put(
        "QueryTableBackendRequest20270101OneOf4460519136",
        new GenericType<QueryTableBackendRequest20270101OneOf4460519136>() {});
    schemas.put(
        "QueryTableBackendRequest20270101OneOf4460522016",
        new GenericType<QueryTableBackendRequest20270101OneOf4460522016>() {});
    JSON.registerDescendants(QueryTableBackendRequest.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return QueryTableBackendRequest.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: QueryTableBackendRequest20270101OneOf,
   * QueryTableBackendRequest20270101OneOf4459913248,
   * QueryTableBackendRequest20270101OneOf4459916288,
   * QueryTableBackendRequest20270101OneOf4459919328,
   * QueryTableBackendRequest20270101OneOf4460101856,
   * QueryTableBackendRequest20270101OneOf4460104096,
   * QueryTableBackendRequest20270101OneOf4460106336,
   * QueryTableBackendRequest20270101OneOf4460108576,
   * QueryTableBackendRequest20270101OneOf4460110816,
   * QueryTableBackendRequest20270101OneOf4460113056,
   * QueryTableBackendRequest20270101OneOf4460115296,
   * QueryTableBackendRequest20270101OneOf4460117536,
   * QueryTableBackendRequest20270101OneOf4460300064,
   * QueryTableBackendRequest20270101OneOf4460302304,
   * QueryTableBackendRequest20270101OneOf4460304544,
   * QueryTableBackendRequest20270101OneOf4460306784,
   * QueryTableBackendRequest20270101OneOf4460309024,
   * QueryTableBackendRequest20270101OneOf4460311264,
   * QueryTableBackendRequest20270101OneOf4460313504,
   * QueryTableBackendRequest20270101OneOf4460513216,
   * QueryTableBackendRequest20270101OneOf4460516096,
   * QueryTableBackendRequest20270101OneOf4460519136,
   * QueryTableBackendRequest20270101OneOf4460522016
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        QueryTableBackendRequest20270101OneOf.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        QueryTableBackendRequest20270101OneOf4459913248.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        QueryTableBackendRequest20270101OneOf4459916288.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        QueryTableBackendRequest20270101OneOf4459919328.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        QueryTableBackendRequest20270101OneOf4460101856.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        QueryTableBackendRequest20270101OneOf4460104096.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        QueryTableBackendRequest20270101OneOf4460106336.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        QueryTableBackendRequest20270101OneOf4460108576.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        QueryTableBackendRequest20270101OneOf4460110816.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        QueryTableBackendRequest20270101OneOf4460113056.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        QueryTableBackendRequest20270101OneOf4460115296.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        QueryTableBackendRequest20270101OneOf4460117536.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        QueryTableBackendRequest20270101OneOf4460300064.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        QueryTableBackendRequest20270101OneOf4460302304.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        QueryTableBackendRequest20270101OneOf4460304544.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        QueryTableBackendRequest20270101OneOf4460306784.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        QueryTableBackendRequest20270101OneOf4460309024.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        QueryTableBackendRequest20270101OneOf4460311264.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        QueryTableBackendRequest20270101OneOf4460313504.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        QueryTableBackendRequest20270101OneOf4460513216.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        QueryTableBackendRequest20270101OneOf4460516096.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        QueryTableBackendRequest20270101OneOf4460519136.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        QueryTableBackendRequest20270101OneOf4460522016.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be QueryTableBackendRequest20270101OneOf,"
            + " QueryTableBackendRequest20270101OneOf4459913248,"
            + " QueryTableBackendRequest20270101OneOf4459916288,"
            + " QueryTableBackendRequest20270101OneOf4459919328,"
            + " QueryTableBackendRequest20270101OneOf4460101856,"
            + " QueryTableBackendRequest20270101OneOf4460104096,"
            + " QueryTableBackendRequest20270101OneOf4460106336,"
            + " QueryTableBackendRequest20270101OneOf4460108576,"
            + " QueryTableBackendRequest20270101OneOf4460110816,"
            + " QueryTableBackendRequest20270101OneOf4460113056,"
            + " QueryTableBackendRequest20270101OneOf4460115296,"
            + " QueryTableBackendRequest20270101OneOf4460117536,"
            + " QueryTableBackendRequest20270101OneOf4460300064,"
            + " QueryTableBackendRequest20270101OneOf4460302304,"
            + " QueryTableBackendRequest20270101OneOf4460304544,"
            + " QueryTableBackendRequest20270101OneOf4460306784,"
            + " QueryTableBackendRequest20270101OneOf4460309024,"
            + " QueryTableBackendRequest20270101OneOf4460311264,"
            + " QueryTableBackendRequest20270101OneOf4460313504,"
            + " QueryTableBackendRequest20270101OneOf4460513216,"
            + " QueryTableBackendRequest20270101OneOf4460516096,"
            + " QueryTableBackendRequest20270101OneOf4460519136,"
            + " QueryTableBackendRequest20270101OneOf4460522016");
  }

  /**
   * Get the actual instance, which can be the following: QueryTableBackendRequest20270101OneOf,
   * QueryTableBackendRequest20270101OneOf4459913248,
   * QueryTableBackendRequest20270101OneOf4459916288,
   * QueryTableBackendRequest20270101OneOf4459919328,
   * QueryTableBackendRequest20270101OneOf4460101856,
   * QueryTableBackendRequest20270101OneOf4460104096,
   * QueryTableBackendRequest20270101OneOf4460106336,
   * QueryTableBackendRequest20270101OneOf4460108576,
   * QueryTableBackendRequest20270101OneOf4460110816,
   * QueryTableBackendRequest20270101OneOf4460113056,
   * QueryTableBackendRequest20270101OneOf4460115296,
   * QueryTableBackendRequest20270101OneOf4460117536,
   * QueryTableBackendRequest20270101OneOf4460300064,
   * QueryTableBackendRequest20270101OneOf4460302304,
   * QueryTableBackendRequest20270101OneOf4460304544,
   * QueryTableBackendRequest20270101OneOf4460306784,
   * QueryTableBackendRequest20270101OneOf4460309024,
   * QueryTableBackendRequest20270101OneOf4460311264,
   * QueryTableBackendRequest20270101OneOf4460313504,
   * QueryTableBackendRequest20270101OneOf4460513216,
   * QueryTableBackendRequest20270101OneOf4460516096,
   * QueryTableBackendRequest20270101OneOf4460519136,
   * QueryTableBackendRequest20270101OneOf4460522016
   *
   * @return The actual instance (QueryTableBackendRequest20270101OneOf,
   *     QueryTableBackendRequest20270101OneOf4459913248,
   *     QueryTableBackendRequest20270101OneOf4459916288,
   *     QueryTableBackendRequest20270101OneOf4459919328,
   *     QueryTableBackendRequest20270101OneOf4460101856,
   *     QueryTableBackendRequest20270101OneOf4460104096,
   *     QueryTableBackendRequest20270101OneOf4460106336,
   *     QueryTableBackendRequest20270101OneOf4460108576,
   *     QueryTableBackendRequest20270101OneOf4460110816,
   *     QueryTableBackendRequest20270101OneOf4460113056,
   *     QueryTableBackendRequest20270101OneOf4460115296,
   *     QueryTableBackendRequest20270101OneOf4460117536,
   *     QueryTableBackendRequest20270101OneOf4460300064,
   *     QueryTableBackendRequest20270101OneOf4460302304,
   *     QueryTableBackendRequest20270101OneOf4460304544,
   *     QueryTableBackendRequest20270101OneOf4460306784,
   *     QueryTableBackendRequest20270101OneOf4460309024,
   *     QueryTableBackendRequest20270101OneOf4460311264,
   *     QueryTableBackendRequest20270101OneOf4460313504,
   *     QueryTableBackendRequest20270101OneOf4460513216,
   *     QueryTableBackendRequest20270101OneOf4460516096,
   *     QueryTableBackendRequest20270101OneOf4460519136,
   *     QueryTableBackendRequest20270101OneOf4460522016)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `QueryTableBackendRequest20270101OneOf`. If the actual instance is
   * not `QueryTableBackendRequest20270101OneOf`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `QueryTableBackendRequest20270101OneOf`
   * @throws ClassCastException if the instance is not `QueryTableBackendRequest20270101OneOf`
   */
  public QueryTableBackendRequest20270101OneOf getQueryTableBackendRequest20270101OneOf()
      throws ClassCastException {
    return (QueryTableBackendRequest20270101OneOf) super.getActualInstance();
  }

  /**
   * Get the actual instance of `QueryTableBackendRequest20270101OneOf4459913248`. If the actual
   * instance is not `QueryTableBackendRequest20270101OneOf4459913248`, the ClassCastException will
   * be thrown.
   *
   * @return The actual instance of `QueryTableBackendRequest20270101OneOf4459913248`
   * @throws ClassCastException if the instance is not
   *     `QueryTableBackendRequest20270101OneOf4459913248`
   */
  public QueryTableBackendRequest20270101OneOf4459913248
      getQueryTableBackendRequest20270101OneOf4459913248() throws ClassCastException {
    return (QueryTableBackendRequest20270101OneOf4459913248) super.getActualInstance();
  }

  /**
   * Get the actual instance of `QueryTableBackendRequest20270101OneOf4459916288`. If the actual
   * instance is not `QueryTableBackendRequest20270101OneOf4459916288`, the ClassCastException will
   * be thrown.
   *
   * @return The actual instance of `QueryTableBackendRequest20270101OneOf4459916288`
   * @throws ClassCastException if the instance is not
   *     `QueryTableBackendRequest20270101OneOf4459916288`
   */
  public QueryTableBackendRequest20270101OneOf4459916288
      getQueryTableBackendRequest20270101OneOf4459916288() throws ClassCastException {
    return (QueryTableBackendRequest20270101OneOf4459916288) super.getActualInstance();
  }

  /**
   * Get the actual instance of `QueryTableBackendRequest20270101OneOf4459919328`. If the actual
   * instance is not `QueryTableBackendRequest20270101OneOf4459919328`, the ClassCastException will
   * be thrown.
   *
   * @return The actual instance of `QueryTableBackendRequest20270101OneOf4459919328`
   * @throws ClassCastException if the instance is not
   *     `QueryTableBackendRequest20270101OneOf4459919328`
   */
  public QueryTableBackendRequest20270101OneOf4459919328
      getQueryTableBackendRequest20270101OneOf4459919328() throws ClassCastException {
    return (QueryTableBackendRequest20270101OneOf4459919328) super.getActualInstance();
  }

  /**
   * Get the actual instance of `QueryTableBackendRequest20270101OneOf4460101856`. If the actual
   * instance is not `QueryTableBackendRequest20270101OneOf4460101856`, the ClassCastException will
   * be thrown.
   *
   * @return The actual instance of `QueryTableBackendRequest20270101OneOf4460101856`
   * @throws ClassCastException if the instance is not
   *     `QueryTableBackendRequest20270101OneOf4460101856`
   */
  public QueryTableBackendRequest20270101OneOf4460101856
      getQueryTableBackendRequest20270101OneOf4460101856() throws ClassCastException {
    return (QueryTableBackendRequest20270101OneOf4460101856) super.getActualInstance();
  }

  /**
   * Get the actual instance of `QueryTableBackendRequest20270101OneOf4460104096`. If the actual
   * instance is not `QueryTableBackendRequest20270101OneOf4460104096`, the ClassCastException will
   * be thrown.
   *
   * @return The actual instance of `QueryTableBackendRequest20270101OneOf4460104096`
   * @throws ClassCastException if the instance is not
   *     `QueryTableBackendRequest20270101OneOf4460104096`
   */
  public QueryTableBackendRequest20270101OneOf4460104096
      getQueryTableBackendRequest20270101OneOf4460104096() throws ClassCastException {
    return (QueryTableBackendRequest20270101OneOf4460104096) super.getActualInstance();
  }

  /**
   * Get the actual instance of `QueryTableBackendRequest20270101OneOf4460106336`. If the actual
   * instance is not `QueryTableBackendRequest20270101OneOf4460106336`, the ClassCastException will
   * be thrown.
   *
   * @return The actual instance of `QueryTableBackendRequest20270101OneOf4460106336`
   * @throws ClassCastException if the instance is not
   *     `QueryTableBackendRequest20270101OneOf4460106336`
   */
  public QueryTableBackendRequest20270101OneOf4460106336
      getQueryTableBackendRequest20270101OneOf4460106336() throws ClassCastException {
    return (QueryTableBackendRequest20270101OneOf4460106336) super.getActualInstance();
  }

  /**
   * Get the actual instance of `QueryTableBackendRequest20270101OneOf4460108576`. If the actual
   * instance is not `QueryTableBackendRequest20270101OneOf4460108576`, the ClassCastException will
   * be thrown.
   *
   * @return The actual instance of `QueryTableBackendRequest20270101OneOf4460108576`
   * @throws ClassCastException if the instance is not
   *     `QueryTableBackendRequest20270101OneOf4460108576`
   */
  public QueryTableBackendRequest20270101OneOf4460108576
      getQueryTableBackendRequest20270101OneOf4460108576() throws ClassCastException {
    return (QueryTableBackendRequest20270101OneOf4460108576) super.getActualInstance();
  }

  /**
   * Get the actual instance of `QueryTableBackendRequest20270101OneOf4460110816`. If the actual
   * instance is not `QueryTableBackendRequest20270101OneOf4460110816`, the ClassCastException will
   * be thrown.
   *
   * @return The actual instance of `QueryTableBackendRequest20270101OneOf4460110816`
   * @throws ClassCastException if the instance is not
   *     `QueryTableBackendRequest20270101OneOf4460110816`
   */
  public QueryTableBackendRequest20270101OneOf4460110816
      getQueryTableBackendRequest20270101OneOf4460110816() throws ClassCastException {
    return (QueryTableBackendRequest20270101OneOf4460110816) super.getActualInstance();
  }

  /**
   * Get the actual instance of `QueryTableBackendRequest20270101OneOf4460113056`. If the actual
   * instance is not `QueryTableBackendRequest20270101OneOf4460113056`, the ClassCastException will
   * be thrown.
   *
   * @return The actual instance of `QueryTableBackendRequest20270101OneOf4460113056`
   * @throws ClassCastException if the instance is not
   *     `QueryTableBackendRequest20270101OneOf4460113056`
   */
  public QueryTableBackendRequest20270101OneOf4460113056
      getQueryTableBackendRequest20270101OneOf4460113056() throws ClassCastException {
    return (QueryTableBackendRequest20270101OneOf4460113056) super.getActualInstance();
  }

  /**
   * Get the actual instance of `QueryTableBackendRequest20270101OneOf4460115296`. If the actual
   * instance is not `QueryTableBackendRequest20270101OneOf4460115296`, the ClassCastException will
   * be thrown.
   *
   * @return The actual instance of `QueryTableBackendRequest20270101OneOf4460115296`
   * @throws ClassCastException if the instance is not
   *     `QueryTableBackendRequest20270101OneOf4460115296`
   */
  public QueryTableBackendRequest20270101OneOf4460115296
      getQueryTableBackendRequest20270101OneOf4460115296() throws ClassCastException {
    return (QueryTableBackendRequest20270101OneOf4460115296) super.getActualInstance();
  }

  /**
   * Get the actual instance of `QueryTableBackendRequest20270101OneOf4460117536`. If the actual
   * instance is not `QueryTableBackendRequest20270101OneOf4460117536`, the ClassCastException will
   * be thrown.
   *
   * @return The actual instance of `QueryTableBackendRequest20270101OneOf4460117536`
   * @throws ClassCastException if the instance is not
   *     `QueryTableBackendRequest20270101OneOf4460117536`
   */
  public QueryTableBackendRequest20270101OneOf4460117536
      getQueryTableBackendRequest20270101OneOf4460117536() throws ClassCastException {
    return (QueryTableBackendRequest20270101OneOf4460117536) super.getActualInstance();
  }

  /**
   * Get the actual instance of `QueryTableBackendRequest20270101OneOf4460300064`. If the actual
   * instance is not `QueryTableBackendRequest20270101OneOf4460300064`, the ClassCastException will
   * be thrown.
   *
   * @return The actual instance of `QueryTableBackendRequest20270101OneOf4460300064`
   * @throws ClassCastException if the instance is not
   *     `QueryTableBackendRequest20270101OneOf4460300064`
   */
  public QueryTableBackendRequest20270101OneOf4460300064
      getQueryTableBackendRequest20270101OneOf4460300064() throws ClassCastException {
    return (QueryTableBackendRequest20270101OneOf4460300064) super.getActualInstance();
  }

  /**
   * Get the actual instance of `QueryTableBackendRequest20270101OneOf4460302304`. If the actual
   * instance is not `QueryTableBackendRequest20270101OneOf4460302304`, the ClassCastException will
   * be thrown.
   *
   * @return The actual instance of `QueryTableBackendRequest20270101OneOf4460302304`
   * @throws ClassCastException if the instance is not
   *     `QueryTableBackendRequest20270101OneOf4460302304`
   */
  public QueryTableBackendRequest20270101OneOf4460302304
      getQueryTableBackendRequest20270101OneOf4460302304() throws ClassCastException {
    return (QueryTableBackendRequest20270101OneOf4460302304) super.getActualInstance();
  }

  /**
   * Get the actual instance of `QueryTableBackendRequest20270101OneOf4460304544`. If the actual
   * instance is not `QueryTableBackendRequest20270101OneOf4460304544`, the ClassCastException will
   * be thrown.
   *
   * @return The actual instance of `QueryTableBackendRequest20270101OneOf4460304544`
   * @throws ClassCastException if the instance is not
   *     `QueryTableBackendRequest20270101OneOf4460304544`
   */
  public QueryTableBackendRequest20270101OneOf4460304544
      getQueryTableBackendRequest20270101OneOf4460304544() throws ClassCastException {
    return (QueryTableBackendRequest20270101OneOf4460304544) super.getActualInstance();
  }

  /**
   * Get the actual instance of `QueryTableBackendRequest20270101OneOf4460306784`. If the actual
   * instance is not `QueryTableBackendRequest20270101OneOf4460306784`, the ClassCastException will
   * be thrown.
   *
   * @return The actual instance of `QueryTableBackendRequest20270101OneOf4460306784`
   * @throws ClassCastException if the instance is not
   *     `QueryTableBackendRequest20270101OneOf4460306784`
   */
  public QueryTableBackendRequest20270101OneOf4460306784
      getQueryTableBackendRequest20270101OneOf4460306784() throws ClassCastException {
    return (QueryTableBackendRequest20270101OneOf4460306784) super.getActualInstance();
  }

  /**
   * Get the actual instance of `QueryTableBackendRequest20270101OneOf4460309024`. If the actual
   * instance is not `QueryTableBackendRequest20270101OneOf4460309024`, the ClassCastException will
   * be thrown.
   *
   * @return The actual instance of `QueryTableBackendRequest20270101OneOf4460309024`
   * @throws ClassCastException if the instance is not
   *     `QueryTableBackendRequest20270101OneOf4460309024`
   */
  public QueryTableBackendRequest20270101OneOf4460309024
      getQueryTableBackendRequest20270101OneOf4460309024() throws ClassCastException {
    return (QueryTableBackendRequest20270101OneOf4460309024) super.getActualInstance();
  }

  /**
   * Get the actual instance of `QueryTableBackendRequest20270101OneOf4460311264`. If the actual
   * instance is not `QueryTableBackendRequest20270101OneOf4460311264`, the ClassCastException will
   * be thrown.
   *
   * @return The actual instance of `QueryTableBackendRequest20270101OneOf4460311264`
   * @throws ClassCastException if the instance is not
   *     `QueryTableBackendRequest20270101OneOf4460311264`
   */
  public QueryTableBackendRequest20270101OneOf4460311264
      getQueryTableBackendRequest20270101OneOf4460311264() throws ClassCastException {
    return (QueryTableBackendRequest20270101OneOf4460311264) super.getActualInstance();
  }

  /**
   * Get the actual instance of `QueryTableBackendRequest20270101OneOf4460313504`. If the actual
   * instance is not `QueryTableBackendRequest20270101OneOf4460313504`, the ClassCastException will
   * be thrown.
   *
   * @return The actual instance of `QueryTableBackendRequest20270101OneOf4460313504`
   * @throws ClassCastException if the instance is not
   *     `QueryTableBackendRequest20270101OneOf4460313504`
   */
  public QueryTableBackendRequest20270101OneOf4460313504
      getQueryTableBackendRequest20270101OneOf4460313504() throws ClassCastException {
    return (QueryTableBackendRequest20270101OneOf4460313504) super.getActualInstance();
  }

  /**
   * Get the actual instance of `QueryTableBackendRequest20270101OneOf4460513216`. If the actual
   * instance is not `QueryTableBackendRequest20270101OneOf4460513216`, the ClassCastException will
   * be thrown.
   *
   * @return The actual instance of `QueryTableBackendRequest20270101OneOf4460513216`
   * @throws ClassCastException if the instance is not
   *     `QueryTableBackendRequest20270101OneOf4460513216`
   */
  public QueryTableBackendRequest20270101OneOf4460513216
      getQueryTableBackendRequest20270101OneOf4460513216() throws ClassCastException {
    return (QueryTableBackendRequest20270101OneOf4460513216) super.getActualInstance();
  }

  /**
   * Get the actual instance of `QueryTableBackendRequest20270101OneOf4460516096`. If the actual
   * instance is not `QueryTableBackendRequest20270101OneOf4460516096`, the ClassCastException will
   * be thrown.
   *
   * @return The actual instance of `QueryTableBackendRequest20270101OneOf4460516096`
   * @throws ClassCastException if the instance is not
   *     `QueryTableBackendRequest20270101OneOf4460516096`
   */
  public QueryTableBackendRequest20270101OneOf4460516096
      getQueryTableBackendRequest20270101OneOf4460516096() throws ClassCastException {
    return (QueryTableBackendRequest20270101OneOf4460516096) super.getActualInstance();
  }

  /**
   * Get the actual instance of `QueryTableBackendRequest20270101OneOf4460519136`. If the actual
   * instance is not `QueryTableBackendRequest20270101OneOf4460519136`, the ClassCastException will
   * be thrown.
   *
   * @return The actual instance of `QueryTableBackendRequest20270101OneOf4460519136`
   * @throws ClassCastException if the instance is not
   *     `QueryTableBackendRequest20270101OneOf4460519136`
   */
  public QueryTableBackendRequest20270101OneOf4460519136
      getQueryTableBackendRequest20270101OneOf4460519136() throws ClassCastException {
    return (QueryTableBackendRequest20270101OneOf4460519136) super.getActualInstance();
  }

  /**
   * Get the actual instance of `QueryTableBackendRequest20270101OneOf4460522016`. If the actual
   * instance is not `QueryTableBackendRequest20270101OneOf4460522016`, the ClassCastException will
   * be thrown.
   *
   * @return The actual instance of `QueryTableBackendRequest20270101OneOf4460522016`
   * @throws ClassCastException if the instance is not
   *     `QueryTableBackendRequest20270101OneOf4460522016`
   */
  public QueryTableBackendRequest20270101OneOf4460522016
      getQueryTableBackendRequest20270101OneOf4460522016() throws ClassCastException {
    return (QueryTableBackendRequest20270101OneOf4460522016) super.getActualInstance();
  }
}
