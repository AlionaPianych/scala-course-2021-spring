package karazin.scala.users.group.week2.and.three.quarters.homework

import java.util.UUID

// Do not forget to import custom implementation
import karazin.scala.users.group.week2.and.three.quarters.homework.adt._
import karazin.scala.users.group.week2.and.three.quarters.homework.model._

/*
  Dummy services
  
  The services need to be implemented in case of running the code
 */
object services:

  def getUserProfile(): ErrorOr[UserProfile] = ErrorOr(UserProfile(UUID(42,42)))
  def getPosts(userId: UUID): ErrorOr[List[Post]] = ErrorOr(List(null))
  def getComments(postId: UUID): ErrorOr[List[Comment]] = ErrorOr(List(Comment(postId, postId)))
  def getLikes(postId: UUID): ErrorOr[List[Like]] = ErrorOr(List(Like(postId,postId)))
  def getShares(postId: UUID): ErrorOr[List[Share]] = ErrorOr(List(null))

