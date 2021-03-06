package org.allenai.ike.ml.compoundop

import org.allenai.ike.ml.queryop.{ QueryOp, TokenQueryOp }

import scala.collection.immutable.IntMap

/** Special op with fixed edits counts that makes no changes to the query */
case class NullOp(numEdits: IntMap[Int]) extends CompoundQueryOp() {
  override def ops: Set[TokenQueryOp] = Set()
  override def canAdd(op: QueryOp): Boolean = false
  override def add(op: QueryOp, matches: IntMap[Int]): CompoundQueryOp =
    throw new RuntimeException()
}
