// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/example/example_parser_configuration.proto

package org.tensorflow.example;

public interface VarLenFeatureProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.VarLenFeatureProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .tensorflow.DataType dtype = 1;</code>
   */
  int getDtypeValue();
  /**
   * <code>optional .tensorflow.DataType dtype = 1;</code>
   */
  org.tensorflow.framework.DataType getDtype();

  /**
   * <code>optional string values_output_tensor_name = 2;</code>
   */
  java.lang.String getValuesOutputTensorName();
  /**
   * <code>optional string values_output_tensor_name = 2;</code>
   */
  com.google.protobuf.ByteString
      getValuesOutputTensorNameBytes();

  /**
   * <code>optional string indices_output_tensor_name = 3;</code>
   */
  java.lang.String getIndicesOutputTensorName();
  /**
   * <code>optional string indices_output_tensor_name = 3;</code>
   */
  com.google.protobuf.ByteString
      getIndicesOutputTensorNameBytes();

  /**
   * <code>optional string shapes_output_tensor_name = 4;</code>
   */
  java.lang.String getShapesOutputTensorName();
  /**
   * <code>optional string shapes_output_tensor_name = 4;</code>
   */
  com.google.protobuf.ByteString
      getShapesOutputTensorNameBytes();
}
