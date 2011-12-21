package mbtree

import org.scalatest.FunSuite

import Cluster._
import MultiSet._

class TestCluster extends FunSuite { 
  val a1 = L2Vector(1.0, 0.0)
  val a2 = L2Vector(10.0, 10.0)
  val a3 = L2Vector(10.0, 11.0)
  val a4 = L2Vector(0.0, 0.0)
  val a5 = L2Vector(2.0, 0.0)

  // test("test assigning points to centers") { 
  //   val all_data = MultiSet(a1, a2, a3, a4, a5)
  //   val (cluster_0, cluster_1) = 
  // 	TwoCentersAssignToCenters(a1, a2, all_data)

  //   assert(cluster_0.Size === 3)
  //   assert(cluster_0.Contains(a1))
  //   assert(cluster_0.Contains(a4))
  //   assert(cluster_0.Contains(a5))

  //   assert(cluster_1.Size === 2)
  //   assert(cluster_1.Contains(a2))
  //   assert(cluster_1.Contains(a3))
  // }

  // test("find the centroid") { 
  //   val ball = MinCoveringBall(MultiSet(a5, a1, a4))
  //   assert(ball.center === a1)
  // }

  // test("find the ball covering one point") { 
  //   assert(MinCoveringBall(MultiSet(a2)) === Ball(a2, 0))
  // }

  // test("find the ball covering a repeated point") { 
  //   assert(MinCoveringBall(MultiSet(a1, a1)) === Ball(a1, 0))
  // }

  // test("make sure can have a mix of repeated and unique points") { 
  //   val ball = MinCoveringBall(Array(a1, a2, a2, a3, a3, a3, a3, a3, a3))
  //   assert(ball.center === a2)
  // }

  // test("test 2 center") { 
  //   val (c1, c2) = TwoCentersSeeded(a1, a2, Array(a1, a2, a3, a4, a5))
  //   val m1 = c1.data
  //   val m2 = c2.data

  //   assert(m1.size === 3)
  //   assert(m1.contains(a1))
  //   assert(m1.contains(a4))
  //   assert(m1.contains(a5))

  //   assert(m2.size === 2)
  //   assert(m2.contains(a2))
  //   assert(m2.contains(a3))
  // }

  // def GetLeafs[T](tree: Tree[T]): List[T] = { 
  //   if (tree.children.isEmpty) List(tree.data)
  //   else { 
  //     val leaf_lists = tree.children.map(GetLeafs)
  //     leaf_lists.flatten
  //   }
  // }

  // test("test recursive 2 centers") { 
  //   val data = Array(a1, a2, a3, a4, a5)
  //   val tree = RecursiveTwoCenters(data)

  //   val leafs = GetLeafs(tree)
  //   assert(leafs.size === 5)
  //   assert(leafs.map(_.center).toSet == data.toSet)
  // }

  // test("test recursive 2 centers with duplicates") { 
  //   val data = Array(a1, a1, a1, a2, a3, a3, a4, a4, a4, a5)
  //   val tree = RecursiveTwoCenters(data)

  //   val leafs = GetLeafs(tree)
  //   assert(leafs.size === data.size)
  //   assert(leafs.map(_.center).toSet == data.toSet)
  // }
}
