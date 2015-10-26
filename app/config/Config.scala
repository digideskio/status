package config

import play.api.Play

object Config {

  def getString(k: String): Option[String] = Play.current.configuration.getString(k)

  /**
   * The admin username
   */
  val authUser = getString("auth.username").getOrElse("admin")

  /**
   * The admin password
   */
  val authPass = getString("auth.password").getOrElse("password")
}
