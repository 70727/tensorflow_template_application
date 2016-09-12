// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/worker.proto

package org.tensorflow.distruntime;

public interface RunGraphRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.RunGraphRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * REQUIRED: graph_handle must be returned by a RegisterGraph call
   * to the same WorkerService.
   * </pre>
   *
   * <code>optional string graph_handle = 1;</code>
   */
  java.lang.String getGraphHandle();
  /**
   * <pre>
   * REQUIRED: graph_handle must be returned by a RegisterGraph call
   * to the same WorkerService.
   * </pre>
   *
   * <code>optional string graph_handle = 1;</code>
   */
  com.google.protobuf.ByteString
      getGraphHandleBytes();

  /**
   * <pre>
   * A unique ID to distinguish different runs of the same graph.
   * The master generates a global unique `step_id` to distinguish
   * different runs of the graph computation. Subgraphs communicate
   * (e.g., send/recv ops) with each other using `step_id` to
   * distinguish tensors generated by different runs.
   * </pre>
   *
   * <code>optional int64 step_id = 2;</code>
   */
  long getStepId();

  /**
   * <pre>
   * Options for this step.
   * </pre>
   *
   * <code>optional .tensorflow.ExecutorOpts exec_opts = 5;</code>
   */
  boolean hasExecOpts();
  /**
   * <pre>
   * Options for this step.
   * </pre>
   *
   * <code>optional .tensorflow.ExecutorOpts exec_opts = 5;</code>
   */
  org.tensorflow.distruntime.ExecutorOpts getExecOpts();
  /**
   * <pre>
   * Options for this step.
   * </pre>
   *
   * <code>optional .tensorflow.ExecutorOpts exec_opts = 5;</code>
   */
  org.tensorflow.distruntime.ExecutorOptsOrBuilder getExecOptsOrBuilder();

  /**
   * <pre>
   * Runs the graph.
   * Sends the tensors in "send" into the graph before the run and
   * fetches the keys into `RunGraphResponse.recv` after the run.
   * </pre>
   *
   * <code>repeated .tensorflow.NamedTensor send = 3;</code>
   */
  java.util.List<org.tensorflow.distruntime.NamedTensor> 
      getSendList();
  /**
   * <pre>
   * Runs the graph.
   * Sends the tensors in "send" into the graph before the run and
   * fetches the keys into `RunGraphResponse.recv` after the run.
   * </pre>
   *
   * <code>repeated .tensorflow.NamedTensor send = 3;</code>
   */
  org.tensorflow.distruntime.NamedTensor getSend(int index);
  /**
   * <pre>
   * Runs the graph.
   * Sends the tensors in "send" into the graph before the run and
   * fetches the keys into `RunGraphResponse.recv` after the run.
   * </pre>
   *
   * <code>repeated .tensorflow.NamedTensor send = 3;</code>
   */
  int getSendCount();
  /**
   * <pre>
   * Runs the graph.
   * Sends the tensors in "send" into the graph before the run and
   * fetches the keys into `RunGraphResponse.recv` after the run.
   * </pre>
   *
   * <code>repeated .tensorflow.NamedTensor send = 3;</code>
   */
  java.util.List<? extends org.tensorflow.distruntime.NamedTensorOrBuilder> 
      getSendOrBuilderList();
  /**
   * <pre>
   * Runs the graph.
   * Sends the tensors in "send" into the graph before the run and
   * fetches the keys into `RunGraphResponse.recv` after the run.
   * </pre>
   *
   * <code>repeated .tensorflow.NamedTensor send = 3;</code>
   */
  org.tensorflow.distruntime.NamedTensorOrBuilder getSendOrBuilder(
      int index);

  /**
   * <code>repeated string recv_key = 4;</code>
   */
  java.util.List<java.lang.String>
      getRecvKeyList();
  /**
   * <code>repeated string recv_key = 4;</code>
   */
  int getRecvKeyCount();
  /**
   * <code>repeated string recv_key = 4;</code>
   */
  java.lang.String getRecvKey(int index);
  /**
   * <code>repeated string recv_key = 4;</code>
   */
  com.google.protobuf.ByteString
      getRecvKeyBytes(int index);
}
